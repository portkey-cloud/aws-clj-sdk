(ns portkey.aws.glue.-2017-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "glue", :region "ap-northeast-1"},
    :ssl-common-name "glue.ap-northeast-1.amazonaws.com",
    :endpoint "https://glue.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "glue", :region "eu-west-1"},
    :ssl-common-name "glue.eu-west-1.amazonaws.com",
    :endpoint "https://glue.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "glue", :region "us-east-2"},
    :ssl-common-name "glue.us-east-2.amazonaws.com",
    :endpoint "https://glue.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "glue", :region "ap-southeast-2"},
    :ssl-common-name "glue.ap-southeast-2.amazonaws.com",
    :endpoint "https://glue.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "glue", :region "ap-southeast-1"},
    :ssl-common-name "glue.ap-southeast-1.amazonaws.com",
    :endpoint "https://glue.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "glue", :region "ap-northeast-2"},
    :ssl-common-name "glue.ap-northeast-2.amazonaws.com",
    :endpoint "https://glue.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "glue", :region "eu-west-3"},
    :ssl-common-name "glue.eu-west-3.amazonaws.com",
    :endpoint "https://glue.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "glue", :region "ca-central-1"},
    :ssl-common-name "glue.ca-central-1.amazonaws.com",
    :endpoint "https://glue.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "glue", :region "eu-central-1"},
    :ssl-common-name "glue.eu-central-1.amazonaws.com",
    :endpoint "https://glue.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "glue", :region "eu-west-2"},
    :ssl-common-name "glue.eu-west-2.amazonaws.com",
    :endpoint "https://glue.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "glue", :region "us-gov-west-1"},
    :ssl-common-name "glue.us-gov-west-1.amazonaws.com",
    :endpoint "https://glue.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "glue", :region "us-west-2"},
    :ssl-common-name "glue.us-west-2.amazonaws.com",
    :endpoint "https://glue.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "glue", :region "us-east-1"},
    :ssl-common-name "glue.us-east-1.amazonaws.com",
    :endpoint "https://glue.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "glue", :region "us-west-1"},
    :ssl-common-name "glue.us-west-1.amazonaws.com",
    :endpoint "https://glue.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "glue", :region "ap-south-1"},
    :ssl-common-name "glue.ap-south-1.amazonaws.com",
    :endpoint "https://glue.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-delete-behavior)

(clojure.core/declare ser-crawler-targets)

(clojure.core/declare ser-catalog-entries)

(clojure.core/declare ser-non-negative-integer)

(clojure.core/declare ser-principal-type)

(clojure.core/declare ser-parameters-map-value)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-code-gen-node-arg)

(clojure.core/declare ser-order)

(clojure.core/declare ser-jdbc-target-list)

(clojure.core/declare ser-s-3-target)

(clojure.core/declare ser-value-string-list)

(clojure.core/declare ser-create-json-classifier-request)

(clojure.core/declare ser-notify-delay-after)

(clojure.core/declare ser-user-defined-function-input)

(clojure.core/declare ser-boolean-value)

(clojure.core/declare ser-resource-uri-list)

(clojure.core/declare ser-role-string)

(clojure.core/declare ser-public-keys-list)

(clojure.core/declare ser-encryption-at-rest)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-code-gen-identifier)

(clojure.core/declare ser-s-3-target-list)

(clojure.core/declare ser-timeout)

(clojure.core/declare ser-encryption-configuration)

(clojure.core/declare ser-column-list)

(clojure.core/declare ser-boolean-nullable)

(clojure.core/declare ser-database-name)

(clojure.core/declare ser-location-string)

(clojure.core/declare ser-partition-input-list)

(clojure.core/declare ser-glue-resource-arn)

(clojure.core/declare ser-action-list)

(clojure.core/declare ser-format-string)

(clojure.core/declare ser-tags-map)

(clojure.core/declare ser-code-gen-node-args)

(clojure.core/declare ser-path)

(clojure.core/declare ser-dev-endpoint-custom-libraries)

(clojure.core/declare ser-cron-expression)

(clojure.core/declare ser-json-path)

(clojure.core/declare ser-code-gen-edge)

(clojure.core/declare ser-dag-nodes)

(clojure.core/declare ser-location-map)

(clojure.core/declare ser-view-text-string)

(clojure.core/declare ser-job-name)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-connection-name)

(clojure.core/declare ser-jdbc-target)

(clojure.core/declare ser-code-gen-arg-name)

(clojure.core/declare ser-uri-string)

(clojure.core/declare ser-catalog-entry)

(clojure.core/declare ser-predicate-string)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-mapping-entry)

(clojure.core/declare ser-job-command)

(clojure.core/declare ser-physical-connection-requirements)

(clojure.core/declare ser-kms-key-arn)

(clojure.core/declare ser-location)

(clojure.core/declare ser-s-3-encryption-mode)

(clojure.core/declare ser-column-value-string-list)

(clojure.core/declare ser-crawler-security-configuration)

(clojure.core/declare ser-storage-descriptor)

(clojure.core/declare ser-condition-list)

(clojure.core/declare ser-resource-uri)

(clojure.core/declare ser-version-string)

(clojure.core/declare ser-code-gen-node)

(clojure.core/declare ser-job-update)

(clojure.core/declare ser-script-location-string)

(clojure.core/declare ser-dynamo-db-target-list)

(clojure.core/declare ser-get-connections-filter)

(clojure.core/declare ser-value-string)

(clojure.core/declare ser-comment-string)

(clojure.core/declare ser-key-string)

(clojure.core/declare ser-filter-string)

(clojure.core/declare ser-python-script)

(clojure.core/declare ser-catalog-id-string)

(clojure.core/declare ser-s-3-encryption)

(clojure.core/declare ser-role)

(clojure.core/declare ser-create-grok-classifier-request)

(clojure.core/declare ser-logical)

(clojure.core/declare ser-catalog-encryption-mode)

(clojure.core/declare ser-description-string-removable)

(clojure.core/declare ser-update-grok-classifier-request)

(clojure.core/declare ser-dag-edges)

(clojure.core/declare ser-table-prefix)

(clojure.core/declare ser-row-tag)

(clojure.core/declare ser-exist-condition)

(clojure.core/declare ser-segment)

(clojure.core/declare ser-column-values-string)

(clojure.core/declare ser-schema-change-policy)

(clojure.core/declare ser-job-bookmarks-encryption-mode)

(clojure.core/declare ser-ser-de-info)

(clojure.core/declare ser-code-gen-arg-value)

(clojure.core/declare ser-id-string)

(clojure.core/declare ser-batch-delete-partition-value-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-table-input)

(clojure.core/declare ser-integer-value)

(clojure.core/declare ser-skewed-info)

(clojure.core/declare ser-data-catalog-encryption-settings)

(clojure.core/declare ser-connection-properties)

(clojure.core/declare ser-generic-string)

(clojure.core/declare ser-s-3-encryption-list)

(clojure.core/declare ser-name-string-list)

(clojure.core/declare ser-partition-input)

(clojure.core/declare ser-path-list)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-name-string)

(clojure.core/declare ser-hash-string)

(clojure.core/declare ser-job-bookmarks-encryption)

(clojure.core/declare ser-custom-patterns)

(clojure.core/declare ser-crawler-configuration)

(clojure.core/declare ser-schema-path-string)

(clojure.core/declare ser-database-input)

(clojure.core/declare ser-max-concurrent-runs)

(clojure.core/declare ser-classifier-name-list)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-classification)

(clojure.core/declare ser-column)

(clojure.core/declare ser-order-list)

(clojure.core/declare ser-parameters-map)

(clojure.core/declare ser-create-xml-classifier-request)

(clojure.core/declare ser-connection-type)

(clojure.core/declare ser-job-name-list)

(clojure.core/declare ser-table-type-string)

(clojure.core/declare ser-trigger-update)

(clojure.core/declare ser-trigger-name-list)

(clojure.core/declare ser-description-string)

(clojure.core/declare ser-partition-value-list)

(clojure.core/declare ser-uri)

(clojure.core/declare ser-connection-password-encryption)

(clojure.core/declare ser-table-name)

(clojure.core/declare ser-crawler-name-list)

(clojure.core/declare ser-batch-stop-job-run-job-run-id-list)

(clojure.core/declare ser-generic-map)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-column-type-string)

(clojure.core/declare ser-security-group-id-list)

(clojure.core/declare ser-bounded-partition-value-list)

(clojure.core/declare ser-trigger-type)

(clojure.core/declare ser-total-segments-integer)

(clojure.core/declare ser-field-type)

(clojure.core/declare ser-update-xml-classifier-request)

(clojure.core/declare ser-language)

(clojure.core/declare ser-connections-list)

(clojure.core/declare ser-max-retries)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-execution-property)

(clojure.core/declare ser-connection-input)

(clojure.core/declare ser-grok-pattern)

(clojure.core/declare ser-batch-get-partition-value-list)

(clojure.core/declare ser-cloud-watch-encryption)

(clojure.core/declare ser-update-behavior)

(clojure.core/declare ser-logical-operator)

(clojure.core/declare ser-dynamo-db-target)

(clojure.core/declare ser-nullable-double)

(clojure.core/declare ser-notification-property)

(clojure.core/declare ser-batch-delete-table-name-list)

(clojure.core/declare ser-delete-connection-name-list)

(clojure.core/declare ser-policy-json-string)

(clojure.core/declare ser-action)

(clojure.core/declare ser-token)

(clojure.core/declare ser-update-json-classifier-request)

(clojure.core/declare ser-match-criteria)

(clojure.core/declare ser-predicate)

(clojure.core/declare ser-mapping-list)

(clojure.core/declare ser-batch-delete-table-version-list)

(clojure.core/declare ser-tag-keys-list)

(clojure.core/declare ser-job-run-state)

(clojure.core/declare ser-cloud-watch-encryption-mode)

(clojure.core/declare ser-integer-flag)

(clojure.core/declare ser-dev-endpoint-names)

(clojure.core/declare ser-connection-property-key)

(clojure.core/declare ser-code-gen-node-type)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-delete-behavior [input] #:http.request.field{:value (clojure.core/get {"LOG" "LOG", :log "LOG", "DELETE_FROM_DATABASE" "DELETE_FROM_DATABASE", :delete-from-database "DELETE_FROM_DATABASE", "DEPRECATE_IN_DATABASE" "DEPRECATE_IN_DATABASE", :deprecate-in-database "DEPRECATE_IN_DATABASE"} input), :shape "DeleteBehavior"})

(clojure.core/defn- ser-crawler-targets [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CrawlerTargets", :type "structure"} (clojure.core/contains? input :s-3-targets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-target-list (input :s-3-targets)) #:http.request.field{:name "S3Targets", :shape "S3TargetList"})) (clojure.core/contains? input :jdbc-targets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-jdbc-target-list (input :jdbc-targets)) #:http.request.field{:name "JdbcTargets", :shape "JdbcTargetList"})) (clojure.core/contains? input :dynamo-db-targets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-db-target-list (input :dynamo-db-targets)) #:http.request.field{:name "DynamoDBTargets", :shape "DynamoDBTargetList"}))))

(clojure.core/defn- ser-catalog-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-catalog-entry coll) #:http.request.field{:shape "CatalogEntry"}))) input), :shape "CatalogEntries", :type "list"})

(clojure.core/defn- ser-non-negative-integer [input] #:http.request.field{:value input, :shape "NonNegativeInteger"})

(clojure.core/defn- ser-principal-type [input] #:http.request.field{:value (clojure.core/get {"USER" "USER", :user "USER", "ROLE" "ROLE", :role "ROLE", "GROUP" "GROUP", :group "GROUP"} input), :shape "PrincipalType"})

(clojure.core/defn- ser-parameters-map-value [input] #:http.request.field{:value input, :shape "ParametersMapValue"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-generic-string coll) #:http.request.field{:shape "GenericString"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-code-gen-node-arg [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-code-gen-arg-name (:name input)) #:http.request.field{:name "Name", :shape "CodeGenArgName"}) (clojure.core/into (ser-code-gen-arg-value (:value input)) #:http.request.field{:name "Value", :shape "CodeGenArgValue"})], :shape "CodeGenNodeArg", :type "structure"} (clojure.core/contains? input :param) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :param)) #:http.request.field{:name "Param", :shape "Boolean"}))))

(clojure.core/defn- ser-order [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:column input)) #:http.request.field{:name "Column", :shape "NameString"}) (clojure.core/into (ser-integer-flag (:sort-order input)) #:http.request.field{:name "SortOrder", :shape "IntegerFlag"})], :shape "Order", :type "structure"}))

(clojure.core/defn- ser-jdbc-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-jdbc-target coll) #:http.request.field{:shape "JdbcTarget"}))) input), :shape "JdbcTargetList", :type "list"})

(clojure.core/defn- ser-s-3-target [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Target", :type "structure"} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :path)) #:http.request.field{:name "Path", :shape "Path"})) (clojure.core/contains? input :exclusions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :exclusions)) #:http.request.field{:name "Exclusions", :shape "PathList"}))))

(clojure.core/defn- ser-value-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-value-string coll) #:http.request.field{:shape "ValueString"}))) input), :shape "ValueStringList", :type "list"})

(clojure.core/defn- ser-create-json-classifier-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-json-path (:json-path input)) #:http.request.field{:name "JsonPath", :shape "JsonPath"})], :shape "CreateJsonClassifierRequest", :type "structure"}))

(clojure.core/defn- ser-notify-delay-after [input] #:http.request.field{:value input, :shape "NotifyDelayAfter"})

(clojure.core/defn- ser-user-defined-function-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UserDefinedFunctionInput", :type "structure"} (clojure.core/contains? input :function-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NameString"})) (clojure.core/contains? input :class-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :class-name)) #:http.request.field{:name "ClassName", :shape "NameString"})) (clojure.core/contains? input :owner-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :owner-name)) #:http.request.field{:name "OwnerName", :shape "NameString"})) (clojure.core/contains? input :owner-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal-type (input :owner-type)) #:http.request.field{:name "OwnerType", :shape "PrincipalType"})) (clojure.core/contains? input :resource-uris) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-uri-list (input :resource-uris)) #:http.request.field{:name "ResourceUris", :shape "ResourceUriList"}))))

(clojure.core/defn- ser-boolean-value [input] #:http.request.field{:value input, :shape "BooleanValue"})

(clojure.core/defn- ser-resource-uri-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-uri coll) #:http.request.field{:shape "ResourceUri"}))) input), :shape "ResourceUriList", :type "list", :max 1000, :min 0})

(clojure.core/defn- ser-role-string [input] #:http.request.field{:value input, :shape "RoleString"})

(clojure.core/defn- ser-public-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-generic-string coll) #:http.request.field{:shape "GenericString"}))) input), :shape "PublicKeysList", :type "list", :max 5})

(clojure.core/defn- ser-encryption-at-rest [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-catalog-encryption-mode (:catalog-encryption-mode input)) #:http.request.field{:name "CatalogEncryptionMode", :shape "CatalogEncryptionMode"})], :shape "EncryptionAtRest", :type "structure"} (clojure.core/contains? input :sse-aws-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :sse-aws-kms-key-id)) #:http.request.field{:name "SseAwsKmsKeyId", :shape "NameString"}))))

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-code-gen-identifier [input] #:http.request.field{:value input, :shape "CodeGenIdentifier"})

(clojure.core/defn- ser-s-3-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-s-3-target coll) #:http.request.field{:shape "S3Target"}))) input), :shape "S3TargetList", :type "list"})

(clojure.core/defn- ser-timeout [input] #:http.request.field{:value input, :shape "Timeout"})

(clojure.core/defn- ser-encryption-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EncryptionConfiguration", :type "structure"} (clojure.core/contains? input :s-3-encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-encryption-list (input :s-3-encryption)) #:http.request.field{:name "S3Encryption", :shape "S3EncryptionList"})) (clojure.core/contains? input :cloud-watch-encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-encryption (input :cloud-watch-encryption)) #:http.request.field{:name "CloudWatchEncryption", :shape "CloudWatchEncryption"})) (clojure.core/contains? input :job-bookmarks-encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-bookmarks-encryption (input :job-bookmarks-encryption)) #:http.request.field{:name "JobBookmarksEncryption", :shape "JobBookmarksEncryption"}))))

(clojure.core/defn- ser-column-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-column coll) #:http.request.field{:shape "Column"}))) input), :shape "ColumnList", :type "list"})

(clojure.core/defn- ser-boolean-nullable [input] #:http.request.field{:value input, :shape "BooleanNullable"})

(clojure.core/defn- ser-database-name [input] #:http.request.field{:value input, :shape "DatabaseName"})

(clojure.core/defn- ser-location-string [input] #:http.request.field{:value input, :shape "LocationString"})

(clojure.core/defn- ser-partition-input-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-partition-input coll) #:http.request.field{:shape "PartitionInput"}))) input), :shape "PartitionInputList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-glue-resource-arn [input] #:http.request.field{:value input, :shape "GlueResourceArn"})

(clojure.core/defn- ser-action-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action coll) #:http.request.field{:shape "Action"}))) input), :shape "ActionList", :type "list"})

(clojure.core/defn- ser-format-string [input] #:http.request.field{:value input, :shape "FormatString"})

(clojure.core/defn- ser-tags-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "TagsMap", :type "map", :max 50, :min 0})

(clojure.core/defn- ser-code-gen-node-args [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-code-gen-node-arg coll) #:http.request.field{:shape "CodeGenNodeArg"}))) input), :shape "CodeGenNodeArgs", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-path [input] #:http.request.field{:value input, :shape "Path"})

(clojure.core/defn- ser-dev-endpoint-custom-libraries [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DevEndpointCustomLibraries", :type "structure"} (clojure.core/contains? input :extra-python-libs-s-3-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :extra-python-libs-s-3-path)) #:http.request.field{:name "ExtraPythonLibsS3Path", :shape "GenericString"})) (clojure.core/contains? input :extra-jars-s-3-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :extra-jars-s-3-path)) #:http.request.field{:name "ExtraJarsS3Path", :shape "GenericString"}))))

(clojure.core/defn- ser-cron-expression [input] #:http.request.field{:value input, :shape "CronExpression"})

(clojure.core/defn- ser-json-path [input] #:http.request.field{:value input, :shape "JsonPath"})

(clojure.core/defn- ser-code-gen-edge [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-code-gen-identifier (:source input)) #:http.request.field{:name "Source", :shape "CodeGenIdentifier"}) (clojure.core/into (ser-code-gen-identifier (:target input)) #:http.request.field{:name "Target", :shape "CodeGenIdentifier"})], :shape "CodeGenEdge", :type "structure"} (clojure.core/contains? input :target-parameter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-gen-arg-name (input :target-parameter)) #:http.request.field{:name "TargetParameter", :shape "CodeGenArgName"}))))

(clojure.core/defn- ser-dag-nodes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-code-gen-node coll) #:http.request.field{:shape "CodeGenNode"}))) input), :shape "DagNodes", :type "list"})

(clojure.core/defn- ser-location-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-column-values-string k) #:http.request.field{:map-info "key", :shape "ColumnValuesString"}) (clojure.core/into (ser-column-values-string v) #:http.request.field{:map-info "value", :shape "ColumnValuesString"})])) input), :shape "LocationMap", :type "map"})

(clojure.core/defn- ser-view-text-string [input] #:http.request.field{:value input, :shape "ViewTextString"})

(clojure.core/defn- ser-job-name [input] #:http.request.field{:value input, :shape "JobName"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-connection-name [input] #:http.request.field{:value input, :shape "ConnectionName"})

(clojure.core/defn- ser-jdbc-target [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JdbcTarget", :type "structure"} (clojure.core/contains? input :connection-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-name (input :connection-name)) #:http.request.field{:name "ConnectionName", :shape "ConnectionName"})) (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :path)) #:http.request.field{:name "Path", :shape "Path"})) (clojure.core/contains? input :exclusions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :exclusions)) #:http.request.field{:name "Exclusions", :shape "PathList"}))))

(clojure.core/defn- ser-code-gen-arg-name [input] #:http.request.field{:value input, :shape "CodeGenArgName"})

(clojure.core/defn- ser-uri-string [input] #:http.request.field{:value input, :shape "UriString"})

(clojure.core/defn- ser-catalog-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:database-name input)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (:table-name input)) #:http.request.field{:name "TableName", :shape "NameString"})], :shape "CatalogEntry", :type "structure"}))

(clojure.core/defn- ser-predicate-string [input] #:http.request.field{:value input, :shape "PredicateString"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-mapping-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MappingEntry", :type "structure"} (clojure.core/contains? input :source-table) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :source-table)) #:http.request.field{:name "SourceTable", :shape "TableName"})) (clojure.core/contains? input :source-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-path-string (input :source-path)) #:http.request.field{:name "SourcePath", :shape "SchemaPathString"})) (clojure.core/contains? input :source-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-type (input :source-type)) #:http.request.field{:name "SourceType", :shape "FieldType"})) (clojure.core/contains? input :target-table) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :target-table)) #:http.request.field{:name "TargetTable", :shape "TableName"})) (clojure.core/contains? input :target-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-path-string (input :target-path)) #:http.request.field{:name "TargetPath", :shape "SchemaPathString"})) (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-type (input :target-type)) #:http.request.field{:name "TargetType", :shape "FieldType"}))))

(clojure.core/defn- ser-job-command [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobCommand", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :name)) #:http.request.field{:name "Name", :shape "GenericString"})) (clojure.core/contains? input :script-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-script-location-string (input :script-location)) #:http.request.field{:name "ScriptLocation", :shape "ScriptLocationString"}))))

(clojure.core/defn- ser-physical-connection-requirements [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PhysicalConnectionRequirements", :type "structure"} (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "NameString"})) (clojure.core/contains? input :security-group-id-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-id-list (input :security-group-id-list)) #:http.request.field{:name "SecurityGroupIdList", :shape "SecurityGroupIdList"})) (clojure.core/contains? input :availability-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "NameString"}))))

(clojure.core/defn- ser-kms-key-arn [input] #:http.request.field{:value input, :shape "KmsKeyArn"})

(clojure.core/defn- ser-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Location", :type "structure"} (clojure.core/contains? input :jdbc) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-gen-node-args (input :jdbc)) #:http.request.field{:name "Jdbc", :shape "CodeGenNodeArgs"})) (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-gen-node-args (input :s-3)) #:http.request.field{:name "S3", :shape "CodeGenNodeArgs"})) (clojure.core/contains? input :dynamo-db) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-gen-node-args (input :dynamo-db)) #:http.request.field{:name "DynamoDB", :shape "CodeGenNodeArgs"}))))

(clojure.core/defn- ser-s-3-encryption-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "SSE-KMS" "SSE-KMS", :ssekms "SSE-KMS", "SSE-S3" "SSE-S3", :sses-3 "SSE-S3"} input), :shape "S3EncryptionMode"})

(clojure.core/defn- ser-column-value-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-column-values-string coll) #:http.request.field{:shape "ColumnValuesString"}))) input), :shape "ColumnValueStringList", :type "list"})

(clojure.core/defn- ser-crawler-security-configuration [input] #:http.request.field{:value input, :shape "CrawlerSecurityConfiguration"})

(clojure.core/defn- ser-storage-descriptor [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StorageDescriptor", :type "structure"} (clojure.core/contains? input :number-of-buckets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :number-of-buckets)) #:http.request.field{:name "NumberOfBuckets", :shape "Integer"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-string (input :location)) #:http.request.field{:name "Location", :shape "LocationString"})) (clojure.core/contains? input :compressed) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :compressed)) #:http.request.field{:name "Compressed", :shape "Boolean"})) (clojure.core/contains? input :serde-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ser-de-info (input :serde-info)) #:http.request.field{:name "SerdeInfo", :shape "SerDeInfo"})) (clojure.core/contains? input :output-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-format-string (input :output-format)) #:http.request.field{:name "OutputFormat", :shape "FormatString"})) (clojure.core/contains? input :skewed-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skewed-info (input :skewed-info)) #:http.request.field{:name "SkewedInfo", :shape "SkewedInfo"})) (clojure.core/contains? input :stored-as-sub-directories) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :stored-as-sub-directories)) #:http.request.field{:name "StoredAsSubDirectories", :shape "Boolean"})) (clojure.core/contains? input :bucket-columns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string-list (input :bucket-columns)) #:http.request.field{:name "BucketColumns", :shape "NameStringList"})) (clojure.core/contains? input :input-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-format-string (input :input-format)) #:http.request.field{:name "InputFormat", :shape "FormatString"})) (clojure.core/contains? input :columns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-column-list (input :columns)) #:http.request.field{:name "Columns", :shape "ColumnList"})) (clojure.core/contains? input :sort-columns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-list (input :sort-columns)) #:http.request.field{:name "SortColumns", :shape "OrderList"}))))

(clojure.core/defn- ser-condition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-condition coll) #:http.request.field{:shape "Condition"}))) input), :shape "ConditionList", :type "list"})

(clojure.core/defn- ser-resource-uri [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResourceUri", :type "structure"} (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ResourceType"})) (clojure.core/contains? input :uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri (input :uri)) #:http.request.field{:name "Uri", :shape "URI"}))))

(clojure.core/defn- ser-version-string [input] #:http.request.field{:value input, :shape "VersionString"})

(clojure.core/defn- ser-code-gen-node [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-code-gen-identifier (:id input)) #:http.request.field{:name "Id", :shape "CodeGenIdentifier"}) (clojure.core/into (ser-code-gen-node-type (:node-type input)) #:http.request.field{:name "NodeType", :shape "CodeGenNodeType"}) (clojure.core/into (ser-code-gen-node-args (:args input)) #:http.request.field{:name "Args", :shape "CodeGenNodeArgs"})], :shape "CodeGenNode", :type "structure"} (clojure.core/contains? input :line-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :line-number)) #:http.request.field{:name "LineNumber", :shape "Integer"}))))

(clojure.core/defn- ser-job-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobUpdate", :type "structure"} (clojure.core/contains? input :allocated-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :allocated-capacity)) #:http.request.field{:name "AllocatedCapacity", :shape "IntegerValue", :deprecated true, :deprecated-message "This property is deprecated, use MaxCapacity instead."})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :max-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-double (input :max-capacity)) #:http.request.field{:name "MaxCapacity", :shape "NullableDouble"})) (clojure.core/contains? input :log-uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri-string (input :log-uri)) #:http.request.field{:name "LogUri", :shape "UriString"})) (clojure.core/contains? input :default-arguments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :default-arguments)) #:http.request.field{:name "DefaultArguments", :shape "GenericMap"})) (clojure.core/contains? input :connections) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connections-list (input :connections)) #:http.request.field{:name "Connections", :shape "ConnectionsList"})) (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-string (input :role)) #:http.request.field{:name "Role", :shape "RoleString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-command (input :command)) #:http.request.field{:name "Command", :shape "JobCommand"})) (clojure.core/contains? input :max-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-retries (input :max-retries)) #:http.request.field{:name "MaxRetries", :shape "MaxRetries"})) (clojure.core/contains? input :execution-property) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-property (input :execution-property)) #:http.request.field{:name "ExecutionProperty", :shape "ExecutionProperty"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"}))))

(clojure.core/defn- ser-script-location-string [input] #:http.request.field{:value input, :shape "ScriptLocationString"})

(clojure.core/defn- ser-dynamo-db-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dynamo-db-target coll) #:http.request.field{:shape "DynamoDBTarget"}))) input), :shape "DynamoDBTargetList", :type "list"})

(clojure.core/defn- ser-get-connections-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GetConnectionsFilter", :type "structure"} (clojure.core/contains? input :match-criteria) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-match-criteria (input :match-criteria)) #:http.request.field{:name "MatchCriteria", :shape "MatchCriteria"})) (clojure.core/contains? input :connection-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-type (input :connection-type)) #:http.request.field{:name "ConnectionType", :shape "ConnectionType"}))))

(clojure.core/defn- ser-value-string [input] #:http.request.field{:value input, :shape "ValueString"})

(clojure.core/defn- ser-comment-string [input] #:http.request.field{:value input, :shape "CommentString"})

(clojure.core/defn- ser-key-string [input] #:http.request.field{:value input, :shape "KeyString"})

(clojure.core/defn- ser-filter-string [input] #:http.request.field{:value input, :shape "FilterString"})

(clojure.core/defn- ser-python-script [input] #:http.request.field{:value input, :shape "PythonScript"})

(clojure.core/defn- ser-catalog-id-string [input] #:http.request.field{:value input, :shape "CatalogIdString"})

(clojure.core/defn- ser-s-3-encryption [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Encryption", :type "structure"} (clojure.core/contains? input :s-3-encryption-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-encryption-mode (input :s-3-encryption-mode)) #:http.request.field{:name "S3EncryptionMode", :shape "S3EncryptionMode"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KmsKeyArn", :shape "KmsKeyArn"}))))

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-create-grok-classifier-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-classification (:classification input)) #:http.request.field{:name "Classification", :shape "Classification"}) (clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-grok-pattern (:grok-pattern input)) #:http.request.field{:name "GrokPattern", :shape "GrokPattern"})], :shape "CreateGrokClassifierRequest", :type "structure"} (clojure.core/contains? input :custom-patterns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-patterns (input :custom-patterns)) #:http.request.field{:name "CustomPatterns", :shape "CustomPatterns"}))))

(clojure.core/defn- ser-logical [input] #:http.request.field{:value (clojure.core/get {"AND" "AND", :and "AND", "ANY" "ANY", :any "ANY"} input), :shape "Logical"})

(clojure.core/defn- ser-catalog-encryption-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "SSE-KMS" "SSE-KMS", :ssekms "SSE-KMS"} input), :shape "CatalogEncryptionMode"})

(clojure.core/defn- ser-description-string-removable [input] #:http.request.field{:value input, :shape "DescriptionStringRemovable"})

(clojure.core/defn- ser-update-grok-classifier-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "UpdateGrokClassifierRequest", :type "structure"} (clojure.core/contains? input :classification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-classification (input :classification)) #:http.request.field{:name "Classification", :shape "Classification"})) (clojure.core/contains? input :grok-pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grok-pattern (input :grok-pattern)) #:http.request.field{:name "GrokPattern", :shape "GrokPattern"})) (clojure.core/contains? input :custom-patterns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-patterns (input :custom-patterns)) #:http.request.field{:name "CustomPatterns", :shape "CustomPatterns"}))))

(clojure.core/defn- ser-dag-edges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-code-gen-edge coll) #:http.request.field{:shape "CodeGenEdge"}))) input), :shape "DagEdges", :type "list"})

(clojure.core/defn- ser-table-prefix [input] #:http.request.field{:value input, :shape "TablePrefix"})

(clojure.core/defn- ser-row-tag [input] #:http.request.field{:value input, :shape "RowTag"})

(clojure.core/defn- ser-exist-condition [input] #:http.request.field{:value (clojure.core/get {"MUST_EXIST" "MUST_EXIST", :must-exist "MUST_EXIST", "NOT_EXIST" "NOT_EXIST", :not-exist "NOT_EXIST", "NONE" "NONE", :none "NONE"} input), :shape "ExistCondition"})

(clojure.core/defn- ser-segment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-negative-integer (:segment-number input)) #:http.request.field{:name "SegmentNumber", :shape "NonNegativeInteger"}) (clojure.core/into (ser-total-segments-integer (:total-segments input)) #:http.request.field{:name "TotalSegments", :shape "TotalSegmentsInteger"})], :shape "Segment", :type "structure"}))

(clojure.core/defn- ser-column-values-string [input] #:http.request.field{:value input, :shape "ColumnValuesString"})

(clojure.core/defn- ser-schema-change-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SchemaChangePolicy", :type "structure"} (clojure.core/contains? input :update-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-behavior (input :update-behavior)) #:http.request.field{:name "UpdateBehavior", :shape "UpdateBehavior"})) (clojure.core/contains? input :delete-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-behavior (input :delete-behavior)) #:http.request.field{:name "DeleteBehavior", :shape "DeleteBehavior"}))))

(clojure.core/defn- ser-job-bookmarks-encryption-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "CSE-KMS" "CSE-KMS", :csekms "CSE-KMS"} input), :shape "JobBookmarksEncryptionMode"})

(clojure.core/defn- ser-ser-de-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SerDeInfo", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})) (clojure.core/contains? input :serialization-library) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :serialization-library)) #:http.request.field{:name "SerializationLibrary", :shape "NameString"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"}))))

(clojure.core/defn- ser-code-gen-arg-value [input] #:http.request.field{:value input, :shape "CodeGenArgValue"})

(clojure.core/defn- ser-id-string [input] #:http.request.field{:value input, :shape "IdString"})

(clojure.core/defn- ser-batch-delete-partition-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-partition-value-list coll) #:http.request.field{:shape "PartitionValueList"}))) input), :shape "BatchDeletePartitionValueList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-table-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "TableInput", :type "structure"} (clojure.core/contains? input :view-expanded-text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-view-text-string (input :view-expanded-text)) #:http.request.field{:name "ViewExpandedText", :shape "ViewTextString"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"})) (clojure.core/contains? input :storage-descriptor) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-descriptor (input :storage-descriptor)) #:http.request.field{:name "StorageDescriptor", :shape "StorageDescriptor"})) (clojure.core/contains? input :partition-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-column-list (input :partition-keys)) #:http.request.field{:name "PartitionKeys", :shape "ColumnList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :owner)) #:http.request.field{:name "Owner", :shape "NameString"})) (clojure.core/contains? input :table-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-type-string (input :table-type)) #:http.request.field{:name "TableType", :shape "TableTypeString"})) (clojure.core/contains? input :last-access-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-access-time)) #:http.request.field{:name "LastAccessTime", :shape "Timestamp"})) (clojure.core/contains? input :retention) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-negative-integer (input :retention)) #:http.request.field{:name "Retention", :shape "NonNegativeInteger"})) (clojure.core/contains? input :last-analyzed-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-analyzed-time)) #:http.request.field{:name "LastAnalyzedTime", :shape "Timestamp"})) (clojure.core/contains? input :view-original-text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-view-text-string (input :view-original-text)) #:http.request.field{:name "ViewOriginalText", :shape "ViewTextString"}))))

(clojure.core/defn- ser-integer-value [input] #:http.request.field{:value input, :shape "IntegerValue"})

(clojure.core/defn- ser-skewed-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SkewedInfo", :type "structure"} (clojure.core/contains? input :skewed-column-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string-list (input :skewed-column-names)) #:http.request.field{:name "SkewedColumnNames", :shape "NameStringList"})) (clojure.core/contains? input :skewed-column-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-column-value-string-list (input :skewed-column-values)) #:http.request.field{:name "SkewedColumnValues", :shape "ColumnValueStringList"})) (clojure.core/contains? input :skewed-column-value-location-maps) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-map (input :skewed-column-value-location-maps)) #:http.request.field{:name "SkewedColumnValueLocationMaps", :shape "LocationMap"}))))

(clojure.core/defn- ser-data-catalog-encryption-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataCatalogEncryptionSettings", :type "structure"} (clojure.core/contains? input :encryption-at-rest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-at-rest (input :encryption-at-rest)) #:http.request.field{:name "EncryptionAtRest", :shape "EncryptionAtRest"})) (clojure.core/contains? input :connection-password-encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-password-encryption (input :connection-password-encryption)) #:http.request.field{:name "ConnectionPasswordEncryption", :shape "ConnectionPasswordEncryption"}))))

(clojure.core/defn- ser-connection-properties [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-connection-property-key k) #:http.request.field{:map-info "key", :shape "ConnectionPropertyKey"}) (clojure.core/into (ser-value-string v) #:http.request.field{:map-info "value", :shape "ValueString"})])) input), :shape "ConnectionProperties", :type "map", :max 100, :min 0})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-s-3-encryption-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-s-3-encryption coll) #:http.request.field{:shape "S3Encryption"}))) input), :shape "S3EncryptionList", :type "list"})

(clojure.core/defn- ser-name-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "NameStringList", :type "list"})

(clojure.core/defn- ser-partition-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PartitionInput", :type "structure"} (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value-string-list (input :values)) #:http.request.field{:name "Values", :shape "ValueStringList"})) (clojure.core/contains? input :last-access-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-access-time)) #:http.request.field{:name "LastAccessTime", :shape "Timestamp"})) (clojure.core/contains? input :storage-descriptor) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-descriptor (input :storage-descriptor)) #:http.request.field{:name "StorageDescriptor", :shape "StorageDescriptor"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"})) (clojure.core/contains? input :last-analyzed-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-analyzed-time)) #:http.request.field{:name "LastAnalyzedTime", :shape "Timestamp"}))))

(clojure.core/defn- ser-path-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-path coll) #:http.request.field{:shape "Path"}))) input), :shape "PathList", :type "list"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-name-string [input] #:http.request.field{:value input, :shape "NameString"})

(clojure.core/defn- ser-hash-string [input] #:http.request.field{:value input, :shape "HashString"})

(clojure.core/defn- ser-job-bookmarks-encryption [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobBookmarksEncryption", :type "structure"} (clojure.core/contains? input :job-bookmarks-encryption-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-bookmarks-encryption-mode (input :job-bookmarks-encryption-mode)) #:http.request.field{:name "JobBookmarksEncryptionMode", :shape "JobBookmarksEncryptionMode"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KmsKeyArn", :shape "KmsKeyArn"}))))

(clojure.core/defn- ser-custom-patterns [input] #:http.request.field{:value input, :shape "CustomPatterns"})

(clojure.core/defn- ser-crawler-configuration [input] #:http.request.field{:value input, :shape "CrawlerConfiguration"})

(clojure.core/defn- ser-schema-path-string [input] #:http.request.field{:value input, :shape "SchemaPathString"})

(clojure.core/defn- ser-database-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "DatabaseInput", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :location-uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri (input :location-uri)) #:http.request.field{:name "LocationUri", :shape "URI"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"}))))

(clojure.core/defn- ser-max-concurrent-runs [input] #:http.request.field{:value input, :shape "MaxConcurrentRuns"})

(clojure.core/defn- ser-classifier-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "ClassifierNameList", :type "list"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {"JAR" "JAR", :jar "JAR", "FILE" "FILE", :file "FILE", "ARCHIVE" "ARCHIVE", :archive "ARCHIVE"} input), :shape "ResourceType"})

(clojure.core/defn- ser-classification [input] #:http.request.field{:value input, :shape "Classification"})

(clojure.core/defn- ser-column [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "Column", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-column-type-string (input :type)) #:http.request.field{:name "Type", :shape "ColumnTypeString"})) (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment-string (input :comment)) #:http.request.field{:name "Comment", :shape "CommentString"}))))

(clojure.core/defn- ser-order-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-order coll) #:http.request.field{:shape "Order"}))) input), :shape "OrderList", :type "list"})

(clojure.core/defn- ser-parameters-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-key-string k) #:http.request.field{:map-info "key", :shape "KeyString"}) (clojure.core/into (ser-parameters-map-value v) #:http.request.field{:map-info "value", :shape "ParametersMapValue"})])) input), :shape "ParametersMap", :type "map"})

(clojure.core/defn- ser-create-xml-classifier-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-classification (:classification input)) #:http.request.field{:name "Classification", :shape "Classification"}) (clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "CreateXMLClassifierRequest", :type "structure"} (clojure.core/contains? input :row-tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-row-tag (input :row-tag)) #:http.request.field{:name "RowTag", :shape "RowTag"}))))

(clojure.core/defn- ser-connection-type [input] #:http.request.field{:value (clojure.core/get {"JDBC" "JDBC", :jdbc "JDBC", "SFTP" "SFTP", :sftp "SFTP"} input), :shape "ConnectionType"})

(clojure.core/defn- ser-job-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "JobNameList", :type "list"})

(clojure.core/defn- ser-table-type-string [input] #:http.request.field{:value input, :shape "TableTypeString"})

(clojure.core/defn- ser-trigger-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TriggerUpdate", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :schedule)) #:http.request.field{:name "Schedule", :shape "GenericString"})) (clojure.core/contains? input :actions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-list (input :actions)) #:http.request.field{:name "Actions", :shape "ActionList"})) (clojure.core/contains? input :predicate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predicate (input :predicate)) #:http.request.field{:name "Predicate", :shape "Predicate"}))))

(clojure.core/defn- ser-trigger-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "TriggerNameList", :type "list"})

(clojure.core/defn- ser-description-string [input] #:http.request.field{:value input, :shape "DescriptionString"})

(clojure.core/defn- ser-partition-value-list [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-value-string-list (:values input)) #:http.request.field{:name "Values", :shape "ValueStringList"})], :shape "PartitionValueList", :type "structure"}))

(clojure.core/defn- ser-uri [input] #:http.request.field{:value input, :shape "URI"})

(clojure.core/defn- ser-connection-password-encryption [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean (:return-connection-password-encrypted input)) #:http.request.field{:name "ReturnConnectionPasswordEncrypted", :shape "Boolean"})], :shape "ConnectionPasswordEncryption", :type "structure"} (clojure.core/contains? input :aws-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :aws-kms-key-id)) #:http.request.field{:name "AwsKmsKeyId", :shape "NameString"}))))

(clojure.core/defn- ser-table-name [input] #:http.request.field{:value input, :shape "TableName"})

(clojure.core/defn- ser-crawler-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "CrawlerNameList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-batch-stop-job-run-job-run-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-id-string coll) #:http.request.field{:shape "IdString"}))) input), :shape "BatchStopJobRunJobRunIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-generic-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-generic-string k) #:http.request.field{:map-info "key", :shape "GenericString"}) (clojure.core/into (ser-generic-string v) #:http.request.field{:map-info "value", :shape "GenericString"})])) input), :shape "GenericMap", :type "map"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-column-type-string [input] #:http.request.field{:value input, :shape "ColumnTypeString"})

(clojure.core/defn- ser-security-group-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "SecurityGroupIdList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-bounded-partition-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-value-string coll) #:http.request.field{:shape "ValueString"}))) input), :shape "BoundedPartitionValueList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-trigger-type [input] #:http.request.field{:value (clojure.core/get {"SCHEDULED" "SCHEDULED", :scheduled "SCHEDULED", "CONDITIONAL" "CONDITIONAL", :conditional "CONDITIONAL", "ON_DEMAND" "ON_DEMAND", :on-demand "ON_DEMAND"} input), :shape "TriggerType"})

(clojure.core/defn- ser-total-segments-integer [input] #:http.request.field{:value input, :shape "TotalSegmentsInteger"})

(clojure.core/defn- ser-field-type [input] #:http.request.field{:value input, :shape "FieldType"})

(clojure.core/defn- ser-update-xml-classifier-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "UpdateXMLClassifierRequest", :type "structure"} (clojure.core/contains? input :classification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-classification (input :classification)) #:http.request.field{:name "Classification", :shape "Classification"})) (clojure.core/contains? input :row-tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-row-tag (input :row-tag)) #:http.request.field{:name "RowTag", :shape "RowTag"}))))

(clojure.core/defn- ser-language [input] #:http.request.field{:value (clojure.core/get {"PYTHON" "PYTHON", :python "PYTHON", "SCALA" "SCALA", :scala "SCALA"} input), :shape "Language"})

(clojure.core/defn- ser-connections-list [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConnectionsList", :type "structure"} (clojure.core/contains? input :connections) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :connections)) #:http.request.field{:name "Connections", :shape "StringList"}))))

(clojure.core/defn- ser-max-retries [input] #:http.request.field{:value input, :shape "MaxRetries"})

(clojure.core/defn- ser-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Condition", :type "structure"} (clojure.core/contains? input :logical-operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logical-operator (input :logical-operator)) #:http.request.field{:name "LogicalOperator", :shape "LogicalOperator"})) (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-run-state (input :state)) #:http.request.field{:name "State", :shape "JobRunState"}))))

(clojure.core/defn- ser-execution-property [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ExecutionProperty", :type "structure"} (clojure.core/contains? input :max-concurrent-runs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-runs (input :max-concurrent-runs)) #:http.request.field{:name "MaxConcurrentRuns", :shape "MaxConcurrentRuns"}))))

(clojure.core/defn- ser-connection-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-connection-type (:connection-type input)) #:http.request.field{:name "ConnectionType", :shape "ConnectionType"}) (clojure.core/into (ser-connection-properties (:connection-properties input)) #:http.request.field{:name "ConnectionProperties", :shape "ConnectionProperties"})], :shape "ConnectionInput", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :match-criteria) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-match-criteria (input :match-criteria)) #:http.request.field{:name "MatchCriteria", :shape "MatchCriteria"})) (clojure.core/contains? input :physical-connection-requirements) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-physical-connection-requirements (input :physical-connection-requirements)) #:http.request.field{:name "PhysicalConnectionRequirements", :shape "PhysicalConnectionRequirements"}))))

(clojure.core/defn- ser-grok-pattern [input] #:http.request.field{:value input, :shape "GrokPattern"})

(clojure.core/defn- ser-batch-get-partition-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-partition-value-list coll) #:http.request.field{:shape "PartitionValueList"}))) input), :shape "BatchGetPartitionValueList", :type "list", :max 1000, :min 0})

(clojure.core/defn- ser-cloud-watch-encryption [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CloudWatchEncryption", :type "structure"} (clojure.core/contains? input :cloud-watch-encryption-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-encryption-mode (input :cloud-watch-encryption-mode)) #:http.request.field{:name "CloudWatchEncryptionMode", :shape "CloudWatchEncryptionMode"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KmsKeyArn", :shape "KmsKeyArn"}))))

(clojure.core/defn- ser-update-behavior [input] #:http.request.field{:value (clojure.core/get {"LOG" "LOG", :log "LOG", "UPDATE_IN_DATABASE" "UPDATE_IN_DATABASE", :update-in-database "UPDATE_IN_DATABASE"} input), :shape "UpdateBehavior"})

(clojure.core/defn- ser-logical-operator [input] #:http.request.field{:value (clojure.core/get {"EQUALS" "EQUALS", :equals "EQUALS"} input), :shape "LogicalOperator"})

(clojure.core/defn- ser-dynamo-db-target [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DynamoDBTarget", :type "structure"} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :path)) #:http.request.field{:name "Path", :shape "Path"}))))

(clojure.core/defn- ser-nullable-double [input] #:http.request.field{:value input, :shape "NullableDouble"})

(clojure.core/defn- ser-notification-property [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotificationProperty", :type "structure"} (clojure.core/contains? input :notify-delay-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notify-delay-after (input :notify-delay-after)) #:http.request.field{:name "NotifyDelayAfter", :shape "NotifyDelayAfter"}))))

(clojure.core/defn- ser-batch-delete-table-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "BatchDeleteTableNameList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-delete-connection-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "DeleteConnectionNameList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-policy-json-string [input] #:http.request.field{:value input, :shape "PolicyJsonString"})

(clojure.core/defn- ser-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Action", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})) (clojure.core/contains? input :arguments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :arguments)) #:http.request.field{:name "Arguments", :shape "GenericMap"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"}))))

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-update-json-classifier-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "UpdateJsonClassifierRequest", :type "structure"} (clojure.core/contains? input :json-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-path (input :json-path)) #:http.request.field{:name "JsonPath", :shape "JsonPath"}))))

(clojure.core/defn- ser-match-criteria [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "MatchCriteria", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-predicate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Predicate", :type "structure"} (clojure.core/contains? input :logical) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logical (input :logical)) #:http.request.field{:name "Logical", :shape "Logical"})) (clojure.core/contains? input :conditions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-list (input :conditions)) #:http.request.field{:name "Conditions", :shape "ConditionList"}))))

(clojure.core/defn- ser-mapping-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mapping-entry coll) #:http.request.field{:shape "MappingEntry"}))) input), :shape "MappingList", :type "list"})

(clojure.core/defn- ser-batch-delete-table-version-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-version-string coll) #:http.request.field{:shape "VersionString"}))) input), :shape "BatchDeleteTableVersionList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-tag-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeysList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-job-run-state [input] #:http.request.field{:value (clojure.core/get {:starting "STARTING", "TIMEOUT" "TIMEOUT", :running "RUNNING", :stopping "STOPPING", :stopped "STOPPED", "SUCCEEDED" "SUCCEEDED", "STOPPED" "STOPPED", "STARTING" "STARTING", "FAILED" "FAILED", :timeout "TIMEOUT", "STOPPING" "STOPPING", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"} input), :shape "JobRunState"})

(clojure.core/defn- ser-cloud-watch-encryption-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "SSE-KMS" "SSE-KMS", :ssekms "SSE-KMS"} input), :shape "CloudWatchEncryptionMode"})

(clojure.core/defn- ser-integer-flag [input] #:http.request.field{:value input, :shape "IntegerFlag"})

(clojure.core/defn- ser-dev-endpoint-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-generic-string coll) #:http.request.field{:shape "GenericString"}))) input), :shape "DevEndpointNames", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-connection-property-key [input] #:http.request.field{:value (clojure.core/get {:config-files "CONFIG_FILES", :jdbc-driver-jar-uri "JDBC_DRIVER_JAR_URI", "JDBC_CONNECTION_URL" "JDBC_CONNECTION_URL", "ENCRYPTED_PASSWORD" "ENCRYPTED_PASSWORD", "USERNAME" "USERNAME", :jdbc-engine-version "JDBC_ENGINE_VERSION", :jdbc-enforce-ssl "JDBC_ENFORCE_SSL", :password "PASSWORD", :jdbc-engine "JDBC_ENGINE", "INSTANCE_ID" "INSTANCE_ID", :username "USERNAME", "JDBC_DRIVER_JAR_URI" "JDBC_DRIVER_JAR_URI", "CONFIG_FILES" "CONFIG_FILES", :encrypted-password "ENCRYPTED_PASSWORD", :port "PORT", "JDBC_ENGINE_VERSION" "JDBC_ENGINE_VERSION", "PASSWORD" "PASSWORD", :instance-id "INSTANCE_ID", :host "HOST", :jdbc-connection-url "JDBC_CONNECTION_URL", "HOST" "HOST", "JDBC_ENGINE" "JDBC_ENGINE", :jdbc-driver-class-name "JDBC_DRIVER_CLASS_NAME", "JDBC_ENFORCE_SSL" "JDBC_ENFORCE_SSL", "PORT" "PORT", "JDBC_DRIVER_CLASS_NAME" "JDBC_DRIVER_CLASS_NAME"} input), :shape "ConnectionPropertyKey"})

(clojure.core/defn- ser-code-gen-node-type [input] #:http.request.field{:value input, :shape "CodeGenNodeType"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-get-crawlers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-get-table-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-string (input :version-id)) #:http.request.field{:name "VersionId", :shape "VersionString"}))))

(clojure.core/defn- req-get-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-put-resource-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-json-string (input :policy-in-json)) #:http.request.field{:name "PolicyInJson", :shape "PolicyJsonString"})]} (clojure.core/contains? input :policy-hash-condition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hash-string (input :policy-hash-condition)) #:http.request.field{:name "PolicyHashCondition", :shape "HashString"})) (clojure.core/contains? input :policy-exists-condition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exist-condition (input :policy-exists-condition)) #:http.request.field{:name "PolicyExistsCondition", :shape "ExistCondition"}))))

(clojure.core/defn- req-stop-crawler-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :crawler-name)) #:http.request.field{:name "CrawlerName", :shape "NameString"})]}))

(clojure.core/defn- req-batch-get-dev-endpoints-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dev-endpoint-names (input :dev-endpoint-names)) #:http.request.field{:name "DevEndpointNames", :shape "DevEndpointNames"})]}))

(clojure.core/defn- req-delete-database-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-dev-endpoints-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-list-triggers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :dependent-job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :dependent-job-name)) #:http.request.field{:name "DependentJobName", :shape "NameString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"}))))

(clojure.core/defn- req-list-dev-endpoints-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"}))))

(clojure.core/defn- req-batch-delete-table-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-batch-delete-table-version-list (input :version-ids)) #:http.request.field{:name "VersionIds", :shape "BatchDeleteTableVersionList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-tables-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-string (input :expression)) #:http.request.field{:name "Expression", :shape "FilterString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-job-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"}) (clojure.core/into (ser-id-string (input :run-id)) #:http.request.field{:name "RunId", :shape "IdString"})]} (clojure.core/contains? input :predecessors-included) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-value (input :predecessors-included)) #:http.request.field{:name "PredecessorsIncluded", :shape "BooleanValue"}))))

(clojure.core/defn- req-get-job-runs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-update-database-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-database-input (input :database-input)) #:http.request.field{:name "DatabaseInput", :shape "DatabaseInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-update-dev-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "GenericString"})]} (clojure.core/contains? input :public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :public-key)) #:http.request.field{:name "PublicKey", :shape "GenericString"})) (clojure.core/contains? input :add-public-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-keys-list (input :add-public-keys)) #:http.request.field{:name "AddPublicKeys", :shape "PublicKeysList"})) (clojure.core/contains? input :delete-public-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-keys-list (input :delete-public-keys)) #:http.request.field{:name "DeletePublicKeys", :shape "PublicKeysList"})) (clojure.core/contains? input :custom-libraries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dev-endpoint-custom-libraries (input :custom-libraries)) #:http.request.field{:name "CustomLibraries", :shape "DevEndpointCustomLibraries"})) (clojure.core/contains? input :update-etl-libraries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-value (input :update-etl-libraries)) #:http.request.field{:name "UpdateEtlLibraries", :shape "BooleanValue"}))))

(clojure.core/defn- req-list-crawlers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"}))))

(clojure.core/defn- req-delete-resource-policy-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :policy-hash-condition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hash-string (input :policy-hash-condition)) #:http.request.field{:name "PolicyHashCondition", :shape "HashString"}))))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"}))))

(clojure.core/defn- req-get-crawler-metrics-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :crawler-name-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-name-list (input :crawler-name-list)) #:http.request.field{:name "CrawlerNameList", :shape "CrawlerNameList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-get-catalog-import-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-security-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-delete-user-defined-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-batch-get-triggers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trigger-name-list (input :trigger-names)) #:http.request.field{:name "TriggerNames", :shape "TriggerNameList"})]}))

(clojure.core/defn- req-get-classifiers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-batch-get-crawlers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-crawler-name-list (input :crawler-names)) #:http.request.field{:name "CrawlerNames", :shape "CrawlerNameList"})]}))

(clojure.core/defn- req-delete-security-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-put-data-catalog-encryption-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-data-catalog-encryption-settings (input :data-catalog-encryption-settings)) #:http.request.field{:name "DataCatalogEncryptionSettings", :shape "DataCatalogEncryptionSettings"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-import-catalog-to-glue-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-create-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-input (input :connection-input)) #:http.request.field{:name "ConnectionInput", :shape "ConnectionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-delete-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :connection-name)) #:http.request.field{:name "ConnectionName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-delete-dev-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "GenericString"})]}))

(clojure.core/defn- req-batch-delete-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delete-connection-name-list (input :connection-name-list)) #:http.request.field{:name "ConnectionNameList", :shape "DeleteConnectionNameList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-plan-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-mapping-list (input :mapping)) #:http.request.field{:name "Mapping", :shape "MappingList"}) (clojure.core/into (ser-catalog-entry (input :source)) #:http.request.field{:name "Source", :shape "CatalogEntry"})]} (clojure.core/contains? input :sinks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-entries (input :sinks)) #:http.request.field{:name "Sinks", :shape "CatalogEntries"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "Location", :shape "Location"})) (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language (input :language)) #:http.request.field{:name "Language", :shape "Language"}))))

(clojure.core/defn- req-batch-stop-job-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"}) (clojure.core/into (ser-batch-stop-job-run-job-run-id-list (input :job-run-ids)) #:http.request.field{:name "JobRunIds", :shape "BatchStopJobRunJobRunIdList"})]}))

(clojure.core/defn- req-batch-create-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-partition-input-list (input :partition-input-list)) #:http.request.field{:name "PartitionInputList", :shape "PartitionInputList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-update-crawler-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :crawler-name)) #:http.request.field{:name "CrawlerName", :shape "NameString"})]} (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cron-expression (input :schedule)) #:http.request.field{:name "Schedule", :shape "CronExpression"}))))

(clojure.core/defn- req-update-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-bounded-partition-value-list (input :partition-value-list)) #:http.request.field{:name "PartitionValueList", :shape "BoundedPartitionValueList"}) (clojure.core/into (ser-partition-input (input :partition-input)) #:http.request.field{:name "PartitionInput", :shape "PartitionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-resource-policy-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-table-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-create-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"}) (clojure.core/into (ser-database-name (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "DatabaseName"}) (clojure.core/into (ser-crawler-targets (input :targets)) #:http.request.field{:name "Targets", :shape "CrawlerTargets"})]} (clojure.core/contains? input :classifiers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-classifier-name-list (input :classifiers)) #:http.request.field{:name "Classifiers", :shape "ClassifierNameList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"})) (clojure.core/contains? input :crawler-security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-security-configuration (input :crawler-security-configuration)) #:http.request.field{:name "CrawlerSecurityConfiguration", :shape "CrawlerSecurityConfiguration"})) (clojure.core/contains? input :table-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-prefix (input :table-prefix)) #:http.request.field{:name "TablePrefix", :shape "TablePrefix"})) (clojure.core/contains? input :schema-change-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-change-policy (input :schema-change-policy)) #:http.request.field{:name "SchemaChangePolicy", :shape "SchemaChangePolicy"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cron-expression (input :schedule)) #:http.request.field{:name "Schedule", :shape "CronExpression"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-configuration (input :configuration)) #:http.request.field{:name "Configuration", :shape "CrawlerConfiguration"}))))

(clojure.core/defn- req-create-dev-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "GenericString"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "StringList"})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "GenericString"})) (clojure.core/contains? input :extra-jars-s-3-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :extra-jars-s-3-path)) #:http.request.field{:name "ExtraJarsS3Path", :shape "GenericString"})) (clojure.core/contains? input :number-of-nodes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :number-of-nodes)) #:http.request.field{:name "NumberOfNodes", :shape "IntegerValue"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"})) (clojure.core/contains? input :public-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-keys-list (input :public-keys)) #:http.request.field{:name "PublicKeys", :shape "PublicKeysList"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"})) (clojure.core/contains? input :extra-python-libs-s-3-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :extra-python-libs-s-3-path)) #:http.request.field{:name "ExtraPythonLibsS3Path", :shape "GenericString"})) (clojure.core/contains? input :public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :public-key)) #:http.request.field{:name "PublicKey", :shape "GenericString"}))))

(clojure.core/defn- req-create-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-partition-input (input :partition-input)) #:http.request.field{:name "PartitionInput", :shape "PartitionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-glue-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "GlueResourceArn"}) (clojure.core/into (ser-tags-map (input :tags-to-add)) #:http.request.field{:name "TagsToAdd", :shape "TagsMap"})]}))

(clojure.core/defn- req-delete-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-update-user-defined-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NameString"}) (clojure.core/into (ser-user-defined-function-input (input :function-input)) #:http.request.field{:name "FunctionInput", :shape "UserDefinedFunctionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-update-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-table-input (input :table-input)) #:http.request.field{:name "TableInput", :shape "TableInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :skip-archive) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-nullable (input :skip-archive)) #:http.request.field{:name "SkipArchive", :shape "BooleanNullable"}))))

(clojure.core/defn- req-get-user-defined-functions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :pattern)) #:http.request.field{:name "Pattern", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-update-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-connection-input (input :connection-input)) #:http.request.field{:name "ConnectionInput", :shape "ConnectionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-dataflow-graph-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :python-script) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-python-script (input :python-script)) #:http.request.field{:name "PythonScript", :shape "PythonScript"}))))

(clojure.core/defn- req-update-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-trigger-update (input :trigger-update)) #:http.request.field{:name "TriggerUpdate", :shape "TriggerUpdate"})]}))

(clojure.core/defn- req-create-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-role-string (input :role)) #:http.request.field{:name "Role", :shape "RoleString"}) (clojure.core/into (ser-job-command (input :command)) #:http.request.field{:name "Command", :shape "JobCommand"})]} (clojure.core/contains? input :allocated-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :allocated-capacity)) #:http.request.field{:name "AllocatedCapacity", :shape "IntegerValue", :deprecated true, :deprecated-message "This property is deprecated, use MaxCapacity instead."})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :max-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-double (input :max-capacity)) #:http.request.field{:name "MaxCapacity", :shape "NullableDouble"})) (clojure.core/contains? input :log-uri) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri-string (input :log-uri)) #:http.request.field{:name "LogUri", :shape "UriString"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"})) (clojure.core/contains? input :default-arguments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :default-arguments)) #:http.request.field{:name "DefaultArguments", :shape "GenericMap"})) (clojure.core/contains? input :connections) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connections-list (input :connections)) #:http.request.field{:name "Connections", :shape "ConnectionsList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"})) (clojure.core/contains? input :max-retries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-retries (input :max-retries)) #:http.request.field{:name "MaxRetries", :shape "MaxRetries"})) (clojure.core/contains? input :execution-property) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-property (input :execution-property)) #:http.request.field{:name "ExecutionProperty", :shape "ExecutionProperty"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"}))))

(clojure.core/defn- req-batch-get-jobs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-name-list (input :job-names)) #:http.request.field{:name "JobNames", :shape "JobNameList"})]}))

(clojure.core/defn- req-get-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :hide-password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :hide-password)) #:http.request.field{:name "HidePassword", :shape "Boolean"}))))

(clojure.core/defn- req-delete-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-get-databases-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-partitions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predicate-string (input :expression)) #:http.request.field{:name "Expression", :shape "PredicateString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :segment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-segment (input :segment)) #:http.request.field{:name "Segment", :shape "Segment"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-delete-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-get-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})]}))

(clojure.core/defn- req-create-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-trigger-type (input :type)) #:http.request.field{:name "Type", :shape "TriggerType"}) (clojure.core/into (ser-action-list (input :actions)) #:http.request.field{:name "Actions", :shape "ActionList"})]} (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :schedule)) #:http.request.field{:name "Schedule", :shape "GenericString"})) (clojure.core/contains? input :predicate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predicate (input :predicate)) #:http.request.field{:name "Predicate", :shape "Predicate"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :start-on-creation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-value (input :start-on-creation)) #:http.request.field{:name "StartOnCreation", :shape "BooleanValue"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagsMap"}))))

(clojure.core/defn- req-get-data-catalog-encryption-settings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-triggers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :dependent-job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :dependent-job-name)) #:http.request.field{:name "DependentJobName", :shape "NameString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-create-user-defined-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-user-defined-function-input (input :function-input)) #:http.request.field{:name "FunctionInput", :shape "UserDefinedFunctionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-batch-get-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-batch-get-partition-value-list (input :partitions-to-get)) #:http.request.field{:name "PartitionsToGet", :shape "BatchGetPartitionValueList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-security-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-start-job-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})]} (clojure.core/contains? input :job-run-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-string (input :job-run-id)) #:http.request.field{:name "JobRunId", :shape "IdString"})) (clojure.core/contains? input :arguments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :arguments)) #:http.request.field{:name "Arguments", :shape "GenericMap"})) (clojure.core/contains? input :allocated-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :allocated-capacity)) #:http.request.field{:name "AllocatedCapacity", :shape "IntegerValue", :deprecated true, :deprecated-message "This property is deprecated, use MaxCapacity instead."})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :max-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-double (input :max-capacity)) #:http.request.field{:name "MaxCapacity", :shape "NullableDouble"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"}))))

(clojure.core/defn- req-get-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-create-database-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-database-input (input :database-input)) #:http.request.field{:name "DatabaseInput", :shape "DatabaseInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-glue-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "GlueResourceArn"})]}))

(clojure.core/defn- req-get-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-catalog-entry (input :source)) #:http.request.field{:name "Source", :shape "CatalogEntry"})]} (clojure.core/contains? input :sinks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-entries (input :sinks)) #:http.request.field{:name "Sinks", :shape "CatalogEntries"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "Location", :shape "Location"}))))

(clojure.core/defn- req-start-crawler-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :crawler-name)) #:http.request.field{:name "CrawlerName", :shape "NameString"})]}))

(clojure.core/defn- req-get-user-defined-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-update-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :classifiers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-classifier-name-list (input :classifiers)) #:http.request.field{:name "Classifiers", :shape "ClassifierNameList"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-database-name (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "DatabaseName"})) (clojure.core/contains? input :crawler-security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-security-configuration (input :crawler-security-configuration)) #:http.request.field{:name "CrawlerSecurityConfiguration", :shape "CrawlerSecurityConfiguration"})) (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"})) (clojure.core/contains? input :table-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-prefix (input :table-prefix)) #:http.request.field{:name "TablePrefix", :shape "TablePrefix"})) (clojure.core/contains? input :schema-change-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-change-policy (input :schema-change-policy)) #:http.request.field{:name "SchemaChangePolicy", :shape "SchemaChangePolicy"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string-removable (input :description)) #:http.request.field{:name "Description", :shape "DescriptionStringRemovable"})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-targets (input :targets)) #:http.request.field{:name "Targets", :shape "CrawlerTargets"})) (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cron-expression (input :schedule)) #:http.request.field{:name "Schedule", :shape "CronExpression"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-configuration (input :configuration)) #:http.request.field{:name "Configuration", :shape "CrawlerConfiguration"}))))

(clojure.core/defn- req-delete-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-value-string-list (input :partition-values)) #:http.request.field{:name "PartitionValues", :shape "ValueStringList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-delete-table-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-version-string (input :version-id)) #:http.request.field{:name "VersionId", :shape "VersionString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-delete-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-update-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"}) (clojure.core/into (ser-job-update (input :job-update)) #:http.request.field{:name "JobUpdate", :shape "JobUpdate"})]}))

(clojure.core/defn- req-create-security-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"})]}))

(clojure.core/defn- req-delete-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})]}))

(clojure.core/defn- req-batch-delete-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-batch-delete-table-name-list (input :tables-to-delete)) #:http.request.field{:name "TablesToDelete", :shape "BatchDeleteTableNameList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-stop-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-get-dev-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "GenericString"})]}))

(clojure.core/defn- req-batch-delete-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-batch-delete-partition-value-list (input :partitions-to-delete)) #:http.request.field{:name "PartitionsToDelete", :shape "BatchDeletePartitionValueList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-value-string-list (input :partition-values)) #:http.request.field{:name "PartitionValues", :shape "ValueStringList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-create-script-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :dag-nodes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dag-nodes (input :dag-nodes)) #:http.request.field{:name "DagNodes", :shape "DagNodes"})) (clojure.core/contains? input :dag-edges) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dag-edges (input :dag-edges)) #:http.request.field{:name "DagEdges", :shape "DagEdges"})) (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language (input :language)) #:http.request.field{:name "Language", :shape "Language"}))))

(clojure.core/defn- req-create-classifier-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :grok-classifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-grok-classifier-request (input :grok-classifier)) #:http.request.field{:name "GrokClassifier", :shape "CreateGrokClassifierRequest"})) (clojure.core/contains? input :xml-classifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-xml-classifier-request (input :xml-classifier)) #:http.request.field{:name "XMLClassifier", :shape "CreateXMLClassifierRequest"})) (clojure.core/contains? input :json-classifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-json-classifier-request (input :json-classifier)) #:http.request.field{:name "JsonClassifier", :shape "CreateJsonClassifierRequest"}))))

(clojure.core/defn- req-create-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-table-input (input :table-input)) #:http.request.field{:name "TableInput", :shape "TableInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-update-classifier-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :grok-classifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-grok-classifier-request (input :grok-classifier)) #:http.request.field{:name "GrokClassifier", :shape "UpdateGrokClassifierRequest"})) (clojure.core/contains? input :xml-classifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-xml-classifier-request (input :xml-classifier)) #:http.request.field{:name "XMLClassifier", :shape "UpdateXMLClassifierRequest"})) (clojure.core/contains? input :json-classifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-json-classifier-request (input :json-classifier)) #:http.request.field{:name "JsonClassifier", :shape "UpdateJsonClassifierRequest"}))))

(clojure.core/defn- req-get-database-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-reset-job-bookmark-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})]}))

(clojure.core/defn- req-get-connections-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-connections-filter (input :filter)) #:http.request.field{:name "Filter", :shape "GetConnectionsFilter"})) (clojure.core/contains? input :hide-password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :hide-password)) #:http.request.field{:name "HidePassword", :shape "Boolean"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-glue-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "GlueResourceArn"}) (clojure.core/into (ser-tag-keys-list (input :tags-to-remove)) #:http.request.field{:name "TagsToRemove", :shape "TagKeysList"})]}))

(clojure.core/defn- req-stop-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-start-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-start-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/declare deser-message-prefix)

(clojure.core/declare deser-delete-behavior)

(clojure.core/declare deser-get-table-versions-list)

(clojure.core/declare deser-crawler-targets)

(clojure.core/declare deser-grok-classifier)

(clojure.core/declare deser-message-string)

(clojure.core/declare deser-non-negative-integer)

(clojure.core/declare deser-principal-type)

(clojure.core/declare deser-parameters-map-value)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-table-list)

(clojure.core/declare deser-predecessor-list)

(clojure.core/declare deser-code-gen-node-arg)

(clojure.core/declare deser-order)

(clojure.core/declare deser-jdbc-target-list)

(clojure.core/declare deser-s-3-target)

(clojure.core/declare deser-value-string-list)

(clojure.core/declare deser-connection-list)

(clojure.core/declare deser-notify-delay-after)

(clojure.core/declare deser-classifier)

(clojure.core/declare deser-resource-uri-list)

(clojure.core/declare deser-crawler-metrics-list)

(clojure.core/declare deser-role-string)

(clojure.core/declare deser-public-keys-list)

(clojure.core/declare deser-job-list)

(clojure.core/declare deser-encryption-at-rest)

(clojure.core/declare deser-code-gen-identifier)

(clojure.core/declare deser-s-3-target-list)

(clojure.core/declare deser-timeout)

(clojure.core/declare deser-encryption-configuration)

(clojure.core/declare deser-column-list)

(clojure.core/declare deser-dev-endpoint-name-list)

(clojure.core/declare deser-non-negative-double)

(clojure.core/declare deser-job-run-list)

(clojure.core/declare deser-attempt-count)

(clojure.core/declare deser-execution-time)

(clojure.core/declare deser-database-name)

(clojure.core/declare deser-location-string)

(clojure.core/declare deser-action-list)

(clojure.core/declare deser-format-string)

(clojure.core/declare deser-tags-map)

(clojure.core/declare deser-version-id)

(clojure.core/declare deser-code-gen-node-args)

(clojure.core/declare deser-path)

(clojure.core/declare deser-cron-expression)

(clojure.core/declare deser-json-path)

(clojure.core/declare deser-code-gen-edge)

(clojure.core/declare deser-dag-nodes)

(clojure.core/declare deser-location-map)

(clojure.core/declare deser-view-text-string)

(clojure.core/declare deser-classifier-list)

(clojure.core/declare deser-job-name)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-connection-name)

(clojure.core/declare deser-trigger-list)

(clojure.core/declare deser-jdbc-target)

(clojure.core/declare deser-error-by-name)

(clojure.core/declare deser-code-gen-arg-name)

(clojure.core/declare deser-uri-string)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-mapping-entry)

(clojure.core/declare deser-job-command)

(clojure.core/declare deser-physical-connection-requirements)

(clojure.core/declare deser-kms-key-arn)

(clojure.core/declare deser-milliseconds-count)

(clojure.core/declare deser-predecessor)

(clojure.core/declare deser-xml-classifier)

(clojure.core/declare deser-crawler-state)

(clojure.core/declare deser-s-3-encryption-mode)

(clojure.core/declare deser-column-value-string-list)

(clojure.core/declare deser-crawler-security-configuration)

(clojure.core/declare deser-storage-descriptor)

(clojure.core/declare deser-condition-list)

(clojure.core/declare deser-security-configuration-list)

(clojure.core/declare deser-resource-uri)

(clojure.core/declare deser-json-value)

(clojure.core/declare deser-last-crawl-info)

(clojure.core/declare deser-version-string)

(clojure.core/declare deser-code-gen-node)

(clojure.core/declare deser-batch-stop-job-run-successful-submission-list)

(clojure.core/declare deser-crawler-list)

(clojure.core/declare deser-script-location-string)

(clojure.core/declare deser-dynamo-db-target-list)

(clojure.core/declare deser-value-string)

(clojure.core/declare deser-comment-string)

(clojure.core/declare deser-key-string)

(clojure.core/declare deser-python-script)

(clojure.core/declare deser-s-3-encryption)

(clojure.core/declare deser-role)

(clojure.core/declare deser-logical)

(clojure.core/declare deser-catalog-encryption-mode)

(clojure.core/declare deser-dag-edges)

(clojure.core/declare deser-error-detail)

(clojure.core/declare deser-table-prefix)

(clojure.core/declare deser-row-tag)

(clojure.core/declare deser-table-version)

(clojure.core/declare deser-json-classifier)

(clojure.core/declare deser-column-values-string)

(clojure.core/declare deser-schema-change-policy)

(clojure.core/declare deser-job-bookmarks-encryption-mode)

(clojure.core/declare deser-ser-de-info)

(clojure.core/declare deser-code-gen-arg-value)

(clojure.core/declare deser-scala-code)

(clojure.core/declare deser-id-string)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-integer-value)

(clojure.core/declare deser-skewed-info)

(clojure.core/declare deser-trigger-state)

(clojure.core/declare deser-data-catalog-encryption-settings)

(clojure.core/declare deser-log-group)

(clojure.core/declare deser-connection-properties)

(clojure.core/declare deser-generic-string)

(clojure.core/declare deser-crawler)

(clojure.core/declare deser-partition-errors)

(clojure.core/declare deser-s-3-encryption-list)

(clojure.core/declare deser-name-string-list)

(clojure.core/declare deser-table-version-error)

(clojure.core/declare deser-path-list)

(clojure.core/declare deser-log-stream)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-name-string)

(clojure.core/declare deser-hash-string)

(clojure.core/declare deser-job-bookmarks-encryption)

(clojure.core/declare deser-partition-list)

(clojure.core/declare deser-custom-patterns)

(clojure.core/declare deser-crawler-configuration)

(clojure.core/declare deser-schema-path-string)

(clojure.core/declare deser-max-concurrent-runs)

(clojure.core/declare deser-classifier-name-list)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-table-version-errors)

(clojure.core/declare deser-error-string)

(clojure.core/declare deser-classification)

(clojure.core/declare deser-user-defined-function)

(clojure.core/declare deser-security-configuration)

(clojure.core/declare deser-column)

(clojure.core/declare deser-order-list)

(clojure.core/declare deser-partition)

(clojure.core/declare deser-crawler-metrics)

(clojure.core/declare deser-last-crawl-status)

(clojure.core/declare deser-parameters-map)

(clojure.core/declare deser-connection-type)

(clojure.core/declare deser-job-name-list)

(clojure.core/declare deser-table-type-string)

(clojure.core/declare deser-trigger-name-list)

(clojure.core/declare deser-description-string)

(clojure.core/declare deser-timestamp-value)

(clojure.core/declare deser-partition-value-list)

(clojure.core/declare deser-batch-stop-job-run-error)

(clojure.core/declare deser-uri)

(clojure.core/declare deser-dev-endpoint)

(clojure.core/declare deser-connection-password-encryption)

(clojure.core/declare deser-table-name)

(clojure.core/declare deser-job-run)

(clojure.core/declare deser-connection)

(clojure.core/declare deser-crawler-name-list)

(clojure.core/declare deser-generic-map)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-column-type-string)

(clojure.core/declare deser-user-defined-function-list)

(clojure.core/declare deser-security-group-id-list)

(clojure.core/declare deser-trigger-type)

(clojure.core/declare deser-batch-stop-job-run-successful-submission)

(clojure.core/declare deser-table-errors)

(clojure.core/declare deser-field-type)

(clojure.core/declare deser-connections-list)

(clojure.core/declare deser-max-retries)

(clojure.core/declare deser-condition)

(clojure.core/declare deser-schedule-state)

(clojure.core/declare deser-partition-error)

(clojure.core/declare deser-execution-property)

(clojure.core/declare deser-schedule)

(clojure.core/declare deser-grok-pattern)

(clojure.core/declare deser-batch-get-partition-value-list)

(clojure.core/declare deser-job)

(clojure.core/declare deser-cloud-watch-encryption)

(clojure.core/declare deser-database-list)

(clojure.core/declare deser-update-behavior)

(clojure.core/declare deser-catalog-import-status)

(clojure.core/declare deser-table)

(clojure.core/declare deser-logical-operator)

(clojure.core/declare deser-dynamo-db-target)

(clojure.core/declare deser-nullable-double)

(clojure.core/declare deser-notification-property)

(clojure.core/declare deser-policy-json-string)

(clojure.core/declare deser-table-error)

(clojure.core/declare deser-action)

(clojure.core/declare deser-token)

(clojure.core/declare deser-match-criteria)

(clojure.core/declare deser-predicate)

(clojure.core/declare deser-mapping-list)

(clojure.core/declare deser-dev-endpoint-list)

(clojure.core/declare deser-database)

(clojure.core/declare deser-job-run-state)

(clojure.core/declare deser-cloud-watch-encryption-mode)

(clojure.core/declare deser-integer-flag)

(clojure.core/declare deser-trigger)

(clojure.core/declare deser-dev-endpoint-names)

(clojure.core/declare deser-connection-property-key)

(clojure.core/declare deser-batch-stop-job-run-error-list)

(clojure.core/declare deser-job-bookmark-entry)

(clojure.core/declare deser-code-gen-node-type)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-message-prefix [input] input)

(clojure.core/defn- deser-delete-behavior [input] (clojure.core/get {"LOG" :log, "DELETE_FROM_DATABASE" :delete-from-database, "DEPRECATE_IN_DATABASE" :deprecate-in-database} input))

(clojure.core/defn- deser-get-table-versions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-table-version coll))) input))

(clojure.core/defn- deser-crawler-targets [input] (clojure.core/cond-> {} (clojure.core/contains? input "S3Targets") (clojure.core/assoc :s-3-targets (deser-s-3-target-list (input "S3Targets"))) (clojure.core/contains? input "JdbcTargets") (clojure.core/assoc :jdbc-targets (deser-jdbc-target-list (input "JdbcTargets"))) (clojure.core/contains? input "DynamoDBTargets") (clojure.core/assoc :dynamo-db-targets (deser-dynamo-db-target-list (input "DynamoDBTargets")))))

(clojure.core/defn- deser-grok-classifier [input] (clojure.core/cond-> {:name (deser-name-string (input "Name")), :classification (deser-classification (input "Classification")), :grok-pattern (deser-grok-pattern (input "GrokPattern"))} (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "LastUpdated") (clojure.core/assoc :last-updated (deser-timestamp (input "LastUpdated"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-version-id (input "Version"))) (clojure.core/contains? input "CustomPatterns") (clojure.core/assoc :custom-patterns (deser-custom-patterns (input "CustomPatterns")))))

(clojure.core/defn- deser-message-string [input] input)

(clojure.core/defn- deser-non-negative-integer [input] input)

(clojure.core/defn- deser-principal-type [input] (clojure.core/get {"USER" :user, "ROLE" :role, "GROUP" :group} input))

(clojure.core/defn- deser-parameters-map-value [input] input)

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-string coll))) input))

(clojure.core/defn- deser-table-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-table coll))) input))

(clojure.core/defn- deser-predecessor-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-predecessor coll))) input))

(clojure.core/defn- deser-code-gen-node-arg [input] (clojure.core/cond-> {:name (deser-code-gen-arg-name (input "Name")), :value (deser-code-gen-arg-value (input "Value"))} (clojure.core/contains? input "Param") (clojure.core/assoc :param (deser-boolean (input "Param")))))

(clojure.core/defn- deser-order [input] (clojure.core/cond-> {:column (deser-name-string (input "Column")), :sort-order (deser-integer-flag (input "SortOrder"))}))

(clojure.core/defn- deser-jdbc-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-jdbc-target coll))) input))

(clojure.core/defn- deser-s-3-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-path (input "Path"))) (clojure.core/contains? input "Exclusions") (clojure.core/assoc :exclusions (deser-path-list (input "Exclusions")))))

(clojure.core/defn- deser-value-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-value-string coll))) input))

(clojure.core/defn- deser-connection-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-connection coll))) input))

(clojure.core/defn- deser-notify-delay-after [input] input)

(clojure.core/defn- deser-classifier [input] (clojure.core/cond-> {} (clojure.core/contains? input "GrokClassifier") (clojure.core/assoc :grok-classifier (deser-grok-classifier (input "GrokClassifier"))) (clojure.core/contains? input "XMLClassifier") (clojure.core/assoc :xml-classifier (deser-xml-classifier (input "XMLClassifier"))) (clojure.core/contains? input "JsonClassifier") (clojure.core/assoc :json-classifier (deser-json-classifier (input "JsonClassifier")))))

(clojure.core/defn- deser-resource-uri-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-uri coll))) input))

(clojure.core/defn- deser-crawler-metrics-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-crawler-metrics coll))) input))

(clojure.core/defn- deser-role-string [input] input)

(clojure.core/defn- deser-public-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-string coll))) input))

(clojure.core/defn- deser-job-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job coll))) input))

(clojure.core/defn- deser-encryption-at-rest [input] (clojure.core/cond-> {:catalog-encryption-mode (deser-catalog-encryption-mode (input "CatalogEncryptionMode"))} (clojure.core/contains? input "SseAwsKmsKeyId") (clojure.core/assoc :sse-aws-kms-key-id (deser-name-string (input "SseAwsKmsKeyId")))))

(clojure.core/defn- deser-code-gen-identifier [input] input)

(clojure.core/defn- deser-s-3-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-s-3-target coll))) input))

(clojure.core/defn- deser-timeout [input] input)

(clojure.core/defn- deser-encryption-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "S3Encryption") (clojure.core/assoc :s-3-encryption (deser-s-3-encryption-list (input "S3Encryption"))) (clojure.core/contains? input "CloudWatchEncryption") (clojure.core/assoc :cloud-watch-encryption (deser-cloud-watch-encryption (input "CloudWatchEncryption"))) (clojure.core/contains? input "JobBookmarksEncryption") (clojure.core/assoc :job-bookmarks-encryption (deser-job-bookmarks-encryption (input "JobBookmarksEncryption")))))

(clojure.core/defn- deser-column-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-column coll))) input))

(clojure.core/defn- deser-dev-endpoint-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-non-negative-double [input] input)

(clojure.core/defn- deser-job-run-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-run coll))) input))

(clojure.core/defn- deser-attempt-count [input] input)

(clojure.core/defn- deser-execution-time [input] input)

(clojure.core/defn- deser-database-name [input] input)

(clojure.core/defn- deser-location-string [input] input)

(clojure.core/defn- deser-action-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-action coll))) input))

(clojure.core/defn- deser-format-string [input] input)

(clojure.core/defn- deser-tags-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-version-id [input] input)

(clojure.core/defn- deser-code-gen-node-args [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-code-gen-node-arg coll))) input))

(clojure.core/defn- deser-path [input] input)

(clojure.core/defn- deser-cron-expression [input] input)

(clojure.core/defn- deser-json-path [input] input)

(clojure.core/defn- deser-code-gen-edge [input] (clojure.core/cond-> {:source (deser-code-gen-identifier (input "Source")), :target (deser-code-gen-identifier (input "Target"))} (clojure.core/contains? input "TargetParameter") (clojure.core/assoc :target-parameter (deser-code-gen-arg-name (input "TargetParameter")))))

(clojure.core/defn- deser-dag-nodes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-code-gen-node coll))) input))

(clojure.core/defn- deser-location-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-column-values-string k) (deser-column-values-string v)])) input))

(clojure.core/defn- deser-view-text-string [input] input)

(clojure.core/defn- deser-classifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-classifier coll))) input))

(clojure.core/defn- deser-job-name [input] input)

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-connection-name [input] input)

(clojure.core/defn- deser-trigger-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trigger coll))) input))

(clojure.core/defn- deser-jdbc-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "ConnectionName") (clojure.core/assoc :connection-name (deser-connection-name (input "ConnectionName"))) (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-path (input "Path"))) (clojure.core/contains? input "Exclusions") (clojure.core/assoc :exclusions (deser-path-list (input "Exclusions")))))

(clojure.core/defn- deser-error-by-name [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-name-string k) (deser-error-detail v)])) input))

(clojure.core/defn- deser-code-gen-arg-name [input] input)

(clojure.core/defn- deser-uri-string [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-mapping-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceTable") (clojure.core/assoc :source-table (deser-table-name (input "SourceTable"))) (clojure.core/contains? input "SourcePath") (clojure.core/assoc :source-path (deser-schema-path-string (input "SourcePath"))) (clojure.core/contains? input "SourceType") (clojure.core/assoc :source-type (deser-field-type (input "SourceType"))) (clojure.core/contains? input "TargetTable") (clojure.core/assoc :target-table (deser-table-name (input "TargetTable"))) (clojure.core/contains? input "TargetPath") (clojure.core/assoc :target-path (deser-schema-path-string (input "TargetPath"))) (clojure.core/contains? input "TargetType") (clojure.core/assoc :target-type (deser-field-type (input "TargetType")))))

(clojure.core/defn- deser-job-command [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-generic-string (input "Name"))) (clojure.core/contains? input "ScriptLocation") (clojure.core/assoc :script-location (deser-script-location-string (input "ScriptLocation")))))

(clojure.core/defn- deser-physical-connection-requirements [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-name-string (input "SubnetId"))) (clojure.core/contains? input "SecurityGroupIdList") (clojure.core/assoc :security-group-id-list (deser-security-group-id-list (input "SecurityGroupIdList"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-name-string (input "AvailabilityZone")))))

(clojure.core/defn- deser-kms-key-arn [input] input)

(clojure.core/defn- deser-milliseconds-count [input] input)

(clojure.core/defn- deser-predecessor [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-name-string (input "JobName"))) (clojure.core/contains? input "RunId") (clojure.core/assoc :run-id (deser-id-string (input "RunId")))))

(clojure.core/defn- deser-xml-classifier [input] (clojure.core/cond-> {:name (deser-name-string (input "Name")), :classification (deser-classification (input "Classification"))} (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "LastUpdated") (clojure.core/assoc :last-updated (deser-timestamp (input "LastUpdated"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-version-id (input "Version"))) (clojure.core/contains? input "RowTag") (clojure.core/assoc :row-tag (deser-row-tag (input "RowTag")))))

(clojure.core/defn- deser-crawler-state [input] (clojure.core/get {"READY" :ready, "RUNNING" :running, "STOPPING" :stopping} input))

(clojure.core/defn- deser-s-3-encryption-mode [input] (clojure.core/get {"DISABLED" :disabled, "SSE-KMS" :ssekms, "SSE-S3" :sses-3} input))

(clojure.core/defn- deser-column-value-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-column-values-string coll))) input))

(clojure.core/defn- deser-crawler-security-configuration [input] input)

(clojure.core/defn- deser-storage-descriptor [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumberOfBuckets") (clojure.core/assoc :number-of-buckets (deser-integer (input "NumberOfBuckets"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-parameters-map (input "Parameters"))) (clojure.core/contains? input "Location") (clojure.core/assoc :location (deser-location-string (input "Location"))) (clojure.core/contains? input "Compressed") (clojure.core/assoc :compressed (deser-boolean (input "Compressed"))) (clojure.core/contains? input "SerdeInfo") (clojure.core/assoc :serde-info (deser-ser-de-info (input "SerdeInfo"))) (clojure.core/contains? input "OutputFormat") (clojure.core/assoc :output-format (deser-format-string (input "OutputFormat"))) (clojure.core/contains? input "SkewedInfo") (clojure.core/assoc :skewed-info (deser-skewed-info (input "SkewedInfo"))) (clojure.core/contains? input "StoredAsSubDirectories") (clojure.core/assoc :stored-as-sub-directories (deser-boolean (input "StoredAsSubDirectories"))) (clojure.core/contains? input "BucketColumns") (clojure.core/assoc :bucket-columns (deser-name-string-list (input "BucketColumns"))) (clojure.core/contains? input "InputFormat") (clojure.core/assoc :input-format (deser-format-string (input "InputFormat"))) (clojure.core/contains? input "Columns") (clojure.core/assoc :columns (deser-column-list (input "Columns"))) (clojure.core/contains? input "SortColumns") (clojure.core/assoc :sort-columns (deser-order-list (input "SortColumns")))))

(clojure.core/defn- deser-condition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-condition coll))) input))

(clojure.core/defn- deser-security-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-configuration coll))) input))

(clojure.core/defn- deser-resource-uri [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType"))) (clojure.core/contains? input "Uri") (clojure.core/assoc :uri (deser-uri (input "Uri")))))

(clojure.core/defn- deser-json-value [input] input)

(clojure.core/defn- deser-last-crawl-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-last-crawl-status (input "Status"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-description-string (input "ErrorMessage"))) (clojure.core/contains? input "LogGroup") (clojure.core/assoc :log-group (deser-log-group (input "LogGroup"))) (clojure.core/contains? input "LogStream") (clojure.core/assoc :log-stream (deser-log-stream (input "LogStream"))) (clojure.core/contains? input "MessagePrefix") (clojure.core/assoc :message-prefix (deser-message-prefix (input "MessagePrefix"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime")))))

(clojure.core/defn- deser-version-string [input] input)

(clojure.core/defn- deser-code-gen-node [input] (clojure.core/cond-> {:id (deser-code-gen-identifier (input "Id")), :node-type (deser-code-gen-node-type (input "NodeType")), :args (deser-code-gen-node-args (input "Args"))} (clojure.core/contains? input "LineNumber") (clojure.core/assoc :line-number (deser-integer (input "LineNumber")))))

(clojure.core/defn- deser-batch-stop-job-run-successful-submission-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-stop-job-run-successful-submission coll))) input))

(clojure.core/defn- deser-crawler-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-crawler coll))) input))

(clojure.core/defn- deser-script-location-string [input] input)

(clojure.core/defn- deser-dynamo-db-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dynamo-db-target coll))) input))

(clojure.core/defn- deser-value-string [input] input)

(clojure.core/defn- deser-comment-string [input] input)

(clojure.core/defn- deser-key-string [input] input)

(clojure.core/defn- deser-python-script [input] input)

(clojure.core/defn- deser-s-3-encryption [input] (clojure.core/cond-> {} (clojure.core/contains? input "S3EncryptionMode") (clojure.core/assoc :s-3-encryption-mode (deser-s-3-encryption-mode (input "S3EncryptionMode"))) (clojure.core/contains? input "KmsKeyArn") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (input "KmsKeyArn")))))

(clojure.core/defn- deser-role [input] input)

(clojure.core/defn- deser-logical [input] (clojure.core/get {"AND" :and, "ANY" :any} input))

(clojure.core/defn- deser-catalog-encryption-mode [input] (clojure.core/get {"DISABLED" :disabled, "SSE-KMS" :ssekms} input))

(clojure.core/defn- deser-dag-edges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-code-gen-edge coll))) input))

(clojure.core/defn- deser-error-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-name-string (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-description-string (input "ErrorMessage")))))

(clojure.core/defn- deser-table-prefix [input] input)

(clojure.core/defn- deser-row-tag [input] input)

(clojure.core/defn- deser-table-version [input] (clojure.core/cond-> {} (clojure.core/contains? input "Table") (clojure.core/assoc :table (deser-table (input "Table"))) (clojure.core/contains? input "VersionId") (clojure.core/assoc :version-id (deser-version-string (input "VersionId")))))

(clojure.core/defn- deser-json-classifier [input] (clojure.core/cond-> {:name (deser-name-string (input "Name")), :json-path (deser-json-path (input "JsonPath"))} (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "LastUpdated") (clojure.core/assoc :last-updated (deser-timestamp (input "LastUpdated"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-version-id (input "Version")))))

(clojure.core/defn- deser-column-values-string [input] input)

(clojure.core/defn- deser-schema-change-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "UpdateBehavior") (clojure.core/assoc :update-behavior (deser-update-behavior (input "UpdateBehavior"))) (clojure.core/contains? input "DeleteBehavior") (clojure.core/assoc :delete-behavior (deser-delete-behavior (input "DeleteBehavior")))))

(clojure.core/defn- deser-job-bookmarks-encryption-mode [input] (clojure.core/get {"DISABLED" :disabled, "CSE-KMS" :csekms} input))

(clojure.core/defn- deser-ser-de-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name-string (input "Name"))) (clojure.core/contains? input "SerializationLibrary") (clojure.core/assoc :serialization-library (deser-name-string (input "SerializationLibrary"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-parameters-map (input "Parameters")))))

(clojure.core/defn- deser-code-gen-arg-value [input] input)

(clojure.core/defn- deser-scala-code [input] input)

(clojure.core/defn- deser-id-string [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-integer-value [input] input)

(clojure.core/defn- deser-skewed-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkewedColumnNames") (clojure.core/assoc :skewed-column-names (deser-name-string-list (input "SkewedColumnNames"))) (clojure.core/contains? input "SkewedColumnValues") (clojure.core/assoc :skewed-column-values (deser-column-value-string-list (input "SkewedColumnValues"))) (clojure.core/contains? input "SkewedColumnValueLocationMaps") (clojure.core/assoc :skewed-column-value-location-maps (deser-location-map (input "SkewedColumnValueLocationMaps")))))

(clojure.core/defn- deser-trigger-state [input] (clojure.core/get {"CREATING" :creating, "CREATED" :created, "ACTIVATING" :activating, "ACTIVATED" :activated, "DEACTIVATING" :deactivating, "DEACTIVATED" :deactivated, "DELETING" :deleting, "UPDATING" :updating} input))

(clojure.core/defn- deser-data-catalog-encryption-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "EncryptionAtRest") (clojure.core/assoc :encryption-at-rest (deser-encryption-at-rest (input "EncryptionAtRest"))) (clojure.core/contains? input "ConnectionPasswordEncryption") (clojure.core/assoc :connection-password-encryption (deser-connection-password-encryption (input "ConnectionPasswordEncryption")))))

(clojure.core/defn- deser-log-group [input] input)

(clojure.core/defn- deser-connection-properties [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-connection-property-key k) (deser-value-string v)])) input))

(clojure.core/defn- deser-generic-string [input] input)

(clojure.core/defn- deser-crawler [input] (clojure.core/cond-> {} (clojure.core/contains? input "LastCrawl") (clojure.core/assoc :last-crawl (deser-last-crawl-info (input "LastCrawl"))) (clojure.core/contains? input "Classifiers") (clojure.core/assoc :classifiers (deser-classifier-name-list (input "Classifiers"))) (clojure.core/contains? input "DatabaseName") (clojure.core/assoc :database-name (deser-database-name (input "DatabaseName"))) (clojure.core/contains? input "CrawlerSecurityConfiguration") (clojure.core/assoc :crawler-security-configuration (deser-crawler-security-configuration (input "CrawlerSecurityConfiguration"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role (input "Role"))) (clojure.core/contains? input "TablePrefix") (clojure.core/assoc :table-prefix (deser-table-prefix (input "TablePrefix"))) (clojure.core/contains? input "CrawlElapsedTime") (clojure.core/assoc :crawl-elapsed-time (deser-milliseconds-count (input "CrawlElapsedTime"))) (clojure.core/contains? input "SchemaChangePolicy") (clojure.core/assoc :schema-change-policy (deser-schema-change-policy (input "SchemaChangePolicy"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "Targets") (clojure.core/assoc :targets (deser-crawler-targets (input "Targets"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-crawler-state (input "State"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-version-id (input "Version"))) (clojure.core/contains? input "Schedule") (clojure.core/assoc :schedule (deser-schedule (input "Schedule"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name-string (input "Name"))) (clojure.core/contains? input "Configuration") (clojure.core/assoc :configuration (deser-crawler-configuration (input "Configuration"))) (clojure.core/contains? input "LastUpdated") (clojure.core/assoc :last-updated (deser-timestamp (input "LastUpdated")))))

(clojure.core/defn- deser-partition-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-partition-error coll))) input))

(clojure.core/defn- deser-s-3-encryption-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-s-3-encryption coll))) input))

(clojure.core/defn- deser-name-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-table-version-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-name-string (input "TableName"))) (clojure.core/contains? input "VersionId") (clojure.core/assoc :version-id (deser-version-string (input "VersionId"))) (clojure.core/contains? input "ErrorDetail") (clojure.core/assoc :error-detail (deser-error-detail (input "ErrorDetail")))))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-path coll))) input))

(clojure.core/defn- deser-log-stream [input] input)

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-name-string [input] input)

(clojure.core/defn- deser-hash-string [input] input)

(clojure.core/defn- deser-job-bookmarks-encryption [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobBookmarksEncryptionMode") (clojure.core/assoc :job-bookmarks-encryption-mode (deser-job-bookmarks-encryption-mode (input "JobBookmarksEncryptionMode"))) (clojure.core/contains? input "KmsKeyArn") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (input "KmsKeyArn")))))

(clojure.core/defn- deser-partition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-partition coll))) input))

(clojure.core/defn- deser-custom-patterns [input] input)

(clojure.core/defn- deser-crawler-configuration [input] input)

(clojure.core/defn- deser-schema-path-string [input] input)

(clojure.core/defn- deser-max-concurrent-runs [input] input)

(clojure.core/defn- deser-classifier-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-resource-type [input] (clojure.core/get {"JAR" :jar, "FILE" :file, "ARCHIVE" :archive} input))

(clojure.core/defn- deser-table-version-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-table-version-error coll))) input))

(clojure.core/defn- deser-error-string [input] input)

(clojure.core/defn- deser-classification [input] input)

(clojure.core/defn- deser-user-defined-function [input] (clojure.core/cond-> {} (clojure.core/contains? input "FunctionName") (clojure.core/assoc :function-name (deser-name-string (input "FunctionName"))) (clojure.core/contains? input "ClassName") (clojure.core/assoc :class-name (deser-name-string (input "ClassName"))) (clojure.core/contains? input "OwnerName") (clojure.core/assoc :owner-name (deser-name-string (input "OwnerName"))) (clojure.core/contains? input "OwnerType") (clojure.core/assoc :owner-type (deser-principal-type (input "OwnerType"))) (clojure.core/contains? input "CreateTime") (clojure.core/assoc :create-time (deser-timestamp (input "CreateTime"))) (clojure.core/contains? input "ResourceUris") (clojure.core/assoc :resource-uris (deser-resource-uri-list (input "ResourceUris")))))

(clojure.core/defn- deser-security-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name-string (input "Name"))) (clojure.core/contains? input "CreatedTimeStamp") (clojure.core/assoc :created-time-stamp (deser-timestamp-value (input "CreatedTimeStamp"))) (clojure.core/contains? input "EncryptionConfiguration") (clojure.core/assoc :encryption-configuration (deser-encryption-configuration (input "EncryptionConfiguration")))))

(clojure.core/defn- deser-column [input] (clojure.core/cond-> {:name (deser-name-string (input "Name"))} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-column-type-string (input "Type"))) (clojure.core/contains? input "Comment") (clojure.core/assoc :comment (deser-comment-string (input "Comment")))))

(clojure.core/defn- deser-order-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-order coll))) input))

(clojure.core/defn- deser-partition [input] (clojure.core/cond-> {} (clojure.core/contains? input "Values") (clojure.core/assoc :values (deser-value-string-list (input "Values"))) (clojure.core/contains? input "DatabaseName") (clojure.core/assoc :database-name (deser-name-string (input "DatabaseName"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-name-string (input "TableName"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "LastAccessTime") (clojure.core/assoc :last-access-time (deser-timestamp (input "LastAccessTime"))) (clojure.core/contains? input "StorageDescriptor") (clojure.core/assoc :storage-descriptor (deser-storage-descriptor (input "StorageDescriptor"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-parameters-map (input "Parameters"))) (clojure.core/contains? input "LastAnalyzedTime") (clojure.core/assoc :last-analyzed-time (deser-timestamp (input "LastAnalyzedTime")))))

(clojure.core/defn- deser-crawler-metrics [input] (clojure.core/cond-> {} (clojure.core/contains? input "CrawlerName") (clojure.core/assoc :crawler-name (deser-name-string (input "CrawlerName"))) (clojure.core/contains? input "TimeLeftSeconds") (clojure.core/assoc :time-left-seconds (deser-non-negative-double (input "TimeLeftSeconds"))) (clojure.core/contains? input "StillEstimating") (clojure.core/assoc :still-estimating (deser-boolean (input "StillEstimating"))) (clojure.core/contains? input "LastRuntimeSeconds") (clojure.core/assoc :last-runtime-seconds (deser-non-negative-double (input "LastRuntimeSeconds"))) (clojure.core/contains? input "MedianRuntimeSeconds") (clojure.core/assoc :median-runtime-seconds (deser-non-negative-double (input "MedianRuntimeSeconds"))) (clojure.core/contains? input "TablesCreated") (clojure.core/assoc :tables-created (deser-non-negative-integer (input "TablesCreated"))) (clojure.core/contains? input "TablesUpdated") (clojure.core/assoc :tables-updated (deser-non-negative-integer (input "TablesUpdated"))) (clojure.core/contains? input "TablesDeleted") (clojure.core/assoc :tables-deleted (deser-non-negative-integer (input "TablesDeleted")))))

(clojure.core/defn- deser-last-crawl-status [input] (clojure.core/get {"SUCCEEDED" :succeeded, "CANCELLED" :cancelled, "FAILED" :failed} input))

(clojure.core/defn- deser-parameters-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-key-string k) (deser-parameters-map-value v)])) input))

(clojure.core/defn- deser-connection-type [input] (clojure.core/get {"JDBC" :jdbc, "SFTP" :sftp} input))

(clojure.core/defn- deser-job-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-table-type-string [input] input)

(clojure.core/defn- deser-trigger-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-description-string [input] input)

(clojure.core/defn- deser-timestamp-value [input] input)

(clojure.core/defn- deser-partition-value-list [input] (clojure.core/cond-> {:values (deser-value-string-list (input "Values"))}))

(clojure.core/defn- deser-batch-stop-job-run-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-name-string (input "JobName"))) (clojure.core/contains? input "JobRunId") (clojure.core/assoc :job-run-id (deser-id-string (input "JobRunId"))) (clojure.core/contains? input "ErrorDetail") (clojure.core/assoc :error-detail (deser-error-detail (input "ErrorDetail")))))

(clojure.core/defn- deser-uri [input] input)

(clojure.core/defn- deser-dev-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "ZeppelinRemoteSparkInterpreterPort") (clojure.core/assoc :zeppelin-remote-spark-interpreter-port (deser-integer-value (input "ZeppelinRemoteSparkInterpreterPort"))) (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-value (input "CreatedTimestamp"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-string-list (input "SecurityGroupIds"))) (clojure.core/contains? input "YarnEndpointAddress") (clojure.core/assoc :yarn-endpoint-address (deser-generic-string (input "YarnEndpointAddress"))) (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-generic-string (input "SubnetId"))) (clojure.core/contains? input "PrivateAddress") (clojure.core/assoc :private-address (deser-generic-string (input "PrivateAddress"))) (clojure.core/contains? input "ExtraJarsS3Path") (clojure.core/assoc :extra-jars-s-3-path (deser-generic-string (input "ExtraJarsS3Path"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleArn"))) (clojure.core/contains? input "NumberOfNodes") (clojure.core/assoc :number-of-nodes (deser-integer-value (input "NumberOfNodes"))) (clojure.core/contains? input "LastUpdateStatus") (clojure.core/assoc :last-update-status (deser-generic-string (input "LastUpdateStatus"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-generic-string (input "AvailabilityZone"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-generic-string (input "Status"))) (clojure.core/contains? input "EndpointName") (clojure.core/assoc :endpoint-name (deser-generic-string (input "EndpointName"))) (clojure.core/contains? input "PublicKeys") (clojure.core/assoc :public-keys (deser-public-keys-list (input "PublicKeys"))) (clojure.core/contains? input "LastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-timestamp-value (input "LastModifiedTimestamp"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-generic-string (input "VpcId"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-generic-string (input "FailureReason"))) (clojure.core/contains? input "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-name-string (input "SecurityConfiguration"))) (clojure.core/contains? input "PublicAddress") (clojure.core/assoc :public-address (deser-generic-string (input "PublicAddress"))) (clojure.core/contains? input "ExtraPythonLibsS3Path") (clojure.core/assoc :extra-python-libs-s-3-path (deser-generic-string (input "ExtraPythonLibsS3Path"))) (clojure.core/contains? input "PublicKey") (clojure.core/assoc :public-key (deser-generic-string (input "PublicKey")))))

(clojure.core/defn- deser-connection-password-encryption [input] (clojure.core/cond-> {:return-connection-password-encrypted (deser-boolean (input "ReturnConnectionPasswordEncrypted"))} (clojure.core/contains? input "AwsKmsKeyId") (clojure.core/assoc :aws-kms-key-id (deser-name-string (input "AwsKmsKeyId")))))

(clojure.core/defn- deser-table-name [input] input)

(clojure.core/defn- deser-job-run [input] (clojure.core/cond-> {} (clojure.core/contains? input "AllocatedCapacity") (clojure.core/assoc :allocated-capacity (deser-integer-value (input "AllocatedCapacity"))) (clojure.core/contains? input "Timeout") (clojure.core/assoc :timeout (deser-timeout (input "Timeout"))) (clojure.core/contains? input "MaxCapacity") (clojure.core/assoc :max-capacity (deser-nullable-double (input "MaxCapacity"))) (clojure.core/contains? input "ExecutionTime") (clojure.core/assoc :execution-time (deser-execution-time (input "ExecutionTime"))) (clojure.core/contains? input "Arguments") (clojure.core/assoc :arguments (deser-generic-map (input "Arguments"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-name-string (input "JobName"))) (clojure.core/contains? input "LastModifiedOn") (clojure.core/assoc :last-modified-on (deser-timestamp-value (input "LastModifiedOn"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-string (input "ErrorMessage"))) (clojure.core/contains? input "PredecessorRuns") (clojure.core/assoc :predecessor-runs (deser-predecessor-list (input "PredecessorRuns"))) (clojure.core/contains? input "TriggerName") (clojure.core/assoc :trigger-name (deser-name-string (input "TriggerName"))) (clojure.core/contains? input "Attempt") (clojure.core/assoc :attempt (deser-attempt-count (input "Attempt"))) (clojure.core/contains? input "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-name-string (input "SecurityConfiguration"))) (clojure.core/contains? input "LogGroupName") (clojure.core/assoc :log-group-name (deser-generic-string (input "LogGroupName"))) (clojure.core/contains? input "PreviousRunId") (clojure.core/assoc :previous-run-id (deser-id-string (input "PreviousRunId"))) (clojure.core/contains? input "StartedOn") (clojure.core/assoc :started-on (deser-timestamp-value (input "StartedOn"))) (clojure.core/contains? input "NotificationProperty") (clojure.core/assoc :notification-property (deser-notification-property (input "NotificationProperty"))) (clojure.core/contains? input "CompletedOn") (clojure.core/assoc :completed-on (deser-timestamp-value (input "CompletedOn"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id-string (input "Id"))) (clojure.core/contains? input "JobRunState") (clojure.core/assoc :job-run-state (deser-job-run-state (input "JobRunState")))))

(clojure.core/defn- deser-connection [input] (clojure.core/cond-> {} (clojure.core/contains? input "PhysicalConnectionRequirements") (clojure.core/assoc :physical-connection-requirements (deser-physical-connection-requirements (input "PhysicalConnectionRequirements"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "ConnectionProperties") (clojure.core/assoc :connection-properties (deser-connection-properties (input "ConnectionProperties"))) (clojure.core/contains? input "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-timestamp (input "LastUpdatedTime"))) (clojure.core/contains? input "ConnectionType") (clojure.core/assoc :connection-type (deser-connection-type (input "ConnectionType"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name-string (input "Name"))) (clojure.core/contains? input "MatchCriteria") (clojure.core/assoc :match-criteria (deser-match-criteria (input "MatchCriteria"))) (clojure.core/contains? input "LastUpdatedBy") (clojure.core/assoc :last-updated-by (deser-name-string (input "LastUpdatedBy")))))

(clojure.core/defn- deser-crawler-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-generic-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-generic-string k) (deser-generic-string v)])) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-column-type-string [input] input)

(clojure.core/defn- deser-user-defined-function-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-defined-function coll))) input))

(clojure.core/defn- deser-security-group-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-trigger-type [input] (clojure.core/get {"SCHEDULED" :scheduled, "CONDITIONAL" :conditional, "ON_DEMAND" :on-demand} input))

(clojure.core/defn- deser-batch-stop-job-run-successful-submission [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-name-string (input "JobName"))) (clojure.core/contains? input "JobRunId") (clojure.core/assoc :job-run-id (deser-id-string (input "JobRunId")))))

(clojure.core/defn- deser-table-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-table-error coll))) input))

(clojure.core/defn- deser-field-type [input] input)

(clojure.core/defn- deser-connections-list [input] (clojure.core/cond-> {} (clojure.core/contains? input "Connections") (clojure.core/assoc :connections (deser-string-list (input "Connections")))))

(clojure.core/defn- deser-max-retries [input] input)

(clojure.core/defn- deser-condition [input] (clojure.core/cond-> {} (clojure.core/contains? input "LogicalOperator") (clojure.core/assoc :logical-operator (deser-logical-operator (input "LogicalOperator"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-name-string (input "JobName"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-job-run-state (input "State")))))

(clojure.core/defn- deser-schedule-state [input] (clojure.core/get {"SCHEDULED" :scheduled, "NOT_SCHEDULED" :not-scheduled, "TRANSITIONING" :transitioning} input))

(clojure.core/defn- deser-partition-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "PartitionValues") (clojure.core/assoc :partition-values (deser-value-string-list (input "PartitionValues"))) (clojure.core/contains? input "ErrorDetail") (clojure.core/assoc :error-detail (deser-error-detail (input "ErrorDetail")))))

(clojure.core/defn- deser-execution-property [input] (clojure.core/cond-> {} (clojure.core/contains? input "MaxConcurrentRuns") (clojure.core/assoc :max-concurrent-runs (deser-max-concurrent-runs (input "MaxConcurrentRuns")))))

(clojure.core/defn- deser-schedule [input] (clojure.core/cond-> {} (clojure.core/contains? input "ScheduleExpression") (clojure.core/assoc :schedule-expression (deser-cron-expression (input "ScheduleExpression"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-schedule-state (input "State")))))

(clojure.core/defn- deser-grok-pattern [input] input)

(clojure.core/defn- deser-batch-get-partition-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-partition-value-list coll))) input))

(clojure.core/defn- deser-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "AllocatedCapacity") (clojure.core/assoc :allocated-capacity (deser-integer-value (input "AllocatedCapacity"))) (clojure.core/contains? input "Timeout") (clojure.core/assoc :timeout (deser-timeout (input "Timeout"))) (clojure.core/contains? input "MaxCapacity") (clojure.core/assoc :max-capacity (deser-nullable-double (input "MaxCapacity"))) (clojure.core/contains? input "LogUri") (clojure.core/assoc :log-uri (deser-uri-string (input "LogUri"))) (clojure.core/contains? input "DefaultArguments") (clojure.core/assoc :default-arguments (deser-generic-map (input "DefaultArguments"))) (clojure.core/contains? input "LastModifiedOn") (clojure.core/assoc :last-modified-on (deser-timestamp-value (input "LastModifiedOn"))) (clojure.core/contains? input "Connections") (clojure.core/assoc :connections (deser-connections-list (input "Connections"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role-string (input "Role"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-name-string (input "SecurityConfiguration"))) (clojure.core/contains? input "Command") (clojure.core/assoc :command (deser-job-command (input "Command"))) (clojure.core/contains? input "MaxRetries") (clojure.core/assoc :max-retries (deser-max-retries (input "MaxRetries"))) (clojure.core/contains? input "ExecutionProperty") (clojure.core/assoc :execution-property (deser-execution-property (input "ExecutionProperty"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name-string (input "Name"))) (clojure.core/contains? input "CreatedOn") (clojure.core/assoc :created-on (deser-timestamp-value (input "CreatedOn"))) (clojure.core/contains? input "NotificationProperty") (clojure.core/assoc :notification-property (deser-notification-property (input "NotificationProperty")))))

(clojure.core/defn- deser-cloud-watch-encryption [input] (clojure.core/cond-> {} (clojure.core/contains? input "CloudWatchEncryptionMode") (clojure.core/assoc :cloud-watch-encryption-mode (deser-cloud-watch-encryption-mode (input "CloudWatchEncryptionMode"))) (clojure.core/contains? input "KmsKeyArn") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (input "KmsKeyArn")))))

(clojure.core/defn- deser-database-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-database coll))) input))

(clojure.core/defn- deser-update-behavior [input] (clojure.core/get {"LOG" :log, "UPDATE_IN_DATABASE" :update-in-database} input))

(clojure.core/defn- deser-catalog-import-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "ImportCompleted") (clojure.core/assoc :import-completed (deser-boolean (input "ImportCompleted"))) (clojure.core/contains? input "ImportTime") (clojure.core/assoc :import-time (deser-timestamp (input "ImportTime"))) (clojure.core/contains? input "ImportedBy") (clojure.core/assoc :imported-by (deser-name-string (input "ImportedBy")))))

(clojure.core/defn- deser-table [input] (clojure.core/cond-> {:name (deser-name-string (input "Name"))} (clojure.core/contains? input "ViewExpandedText") (clojure.core/assoc :view-expanded-text (deser-view-text-string (input "ViewExpandedText"))) (clojure.core/contains? input "UpdateTime") (clojure.core/assoc :update-time (deser-timestamp (input "UpdateTime"))) (clojure.core/contains? input "DatabaseName") (clojure.core/assoc :database-name (deser-name-string (input "DatabaseName"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-parameters-map (input "Parameters"))) (clojure.core/contains? input "StorageDescriptor") (clojure.core/assoc :storage-descriptor (deser-storage-descriptor (input "StorageDescriptor"))) (clojure.core/contains? input "CreatedBy") (clojure.core/assoc :created-by (deser-name-string (input "CreatedBy"))) (clojure.core/contains? input "PartitionKeys") (clojure.core/assoc :partition-keys (deser-column-list (input "PartitionKeys"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "Owner") (clojure.core/assoc :owner (deser-name-string (input "Owner"))) (clojure.core/contains? input "TableType") (clojure.core/assoc :table-type (deser-table-type-string (input "TableType"))) (clojure.core/contains? input "CreateTime") (clojure.core/assoc :create-time (deser-timestamp (input "CreateTime"))) (clojure.core/contains? input "LastAccessTime") (clojure.core/assoc :last-access-time (deser-timestamp (input "LastAccessTime"))) (clojure.core/contains? input "Retention") (clojure.core/assoc :retention (deser-non-negative-integer (input "Retention"))) (clojure.core/contains? input "LastAnalyzedTime") (clojure.core/assoc :last-analyzed-time (deser-timestamp (input "LastAnalyzedTime"))) (clojure.core/contains? input "ViewOriginalText") (clojure.core/assoc :view-original-text (deser-view-text-string (input "ViewOriginalText")))))

(clojure.core/defn- deser-logical-operator [input] (clojure.core/get {"EQUALS" :equals} input))

(clojure.core/defn- deser-dynamo-db-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-path (input "Path")))))

(clojure.core/defn- deser-nullable-double [input] input)

(clojure.core/defn- deser-notification-property [input] (clojure.core/cond-> {} (clojure.core/contains? input "NotifyDelayAfter") (clojure.core/assoc :notify-delay-after (deser-notify-delay-after (input "NotifyDelayAfter")))))

(clojure.core/defn- deser-policy-json-string [input] input)

(clojure.core/defn- deser-table-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-name-string (input "TableName"))) (clojure.core/contains? input "ErrorDetail") (clojure.core/assoc :error-detail (deser-error-detail (input "ErrorDetail")))))

(clojure.core/defn- deser-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-name-string (input "JobName"))) (clojure.core/contains? input "Arguments") (clojure.core/assoc :arguments (deser-generic-map (input "Arguments"))) (clojure.core/contains? input "Timeout") (clojure.core/assoc :timeout (deser-timeout (input "Timeout"))) (clojure.core/contains? input "NotificationProperty") (clojure.core/assoc :notification-property (deser-notification-property (input "NotificationProperty"))) (clojure.core/contains? input "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-name-string (input "SecurityConfiguration")))))

(clojure.core/defn- deser-token [input] input)

(clojure.core/defn- deser-match-criteria [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name-string coll))) input))

(clojure.core/defn- deser-predicate [input] (clojure.core/cond-> {} (clojure.core/contains? input "Logical") (clojure.core/assoc :logical (deser-logical (input "Logical"))) (clojure.core/contains? input "Conditions") (clojure.core/assoc :conditions (deser-condition-list (input "Conditions")))))

(clojure.core/defn- deser-mapping-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mapping-entry coll))) input))

(clojure.core/defn- deser-dev-endpoint-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dev-endpoint coll))) input))

(clojure.core/defn- deser-database [input] (clojure.core/cond-> {:name (deser-name-string (input "Name"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "LocationUri") (clojure.core/assoc :location-uri (deser-uri (input "LocationUri"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-parameters-map (input "Parameters"))) (clojure.core/contains? input "CreateTime") (clojure.core/assoc :create-time (deser-timestamp (input "CreateTime")))))

(clojure.core/defn- deser-job-run-state [input] (clojure.core/get {"STARTING" :starting, "RUNNING" :running, "STOPPING" :stopping, "STOPPED" :stopped, "SUCCEEDED" :succeeded, "FAILED" :failed, "TIMEOUT" :timeout} input))

(clojure.core/defn- deser-cloud-watch-encryption-mode [input] (clojure.core/get {"DISABLED" :disabled, "SSE-KMS" :ssekms} input))

(clojure.core/defn- deser-integer-flag [input] input)

(clojure.core/defn- deser-trigger [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name-string (input "Name"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id-string (input "Id"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-trigger-type (input "Type"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-trigger-state (input "State"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "Schedule") (clojure.core/assoc :schedule (deser-generic-string (input "Schedule"))) (clojure.core/contains? input "Actions") (clojure.core/assoc :actions (deser-action-list (input "Actions"))) (clojure.core/contains? input "Predicate") (clojure.core/assoc :predicate (deser-predicate (input "Predicate")))))

(clojure.core/defn- deser-dev-endpoint-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-string coll))) input))

(clojure.core/defn- deser-connection-property-key [input] (clojure.core/get {"JDBC_CONNECTION_URL" :jdbc-connection-url, "ENCRYPTED_PASSWORD" :encrypted-password, "USERNAME" :username, "INSTANCE_ID" :instance-id, "JDBC_DRIVER_JAR_URI" :jdbc-driver-jar-uri, "CONFIG_FILES" :config-files, "JDBC_ENGINE_VERSION" :jdbc-engine-version, "PASSWORD" :password, "HOST" :host, "JDBC_ENGINE" :jdbc-engine, "JDBC_ENFORCE_SSL" :jdbc-enforce-ssl, "PORT" :port, "JDBC_DRIVER_CLASS_NAME" :jdbc-driver-class-name} input))

(clojure.core/defn- deser-batch-stop-job-run-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-stop-job-run-error coll))) input))

(clojure.core/defn- deser-job-bookmark-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-integer-value (input "Version"))) (clojure.core/contains? input "Run") (clojure.core/assoc :run (deser-integer-value (input "Run"))) (clojure.core/contains? input "Attempt") (clojure.core/assoc :attempt (deser-integer-value (input "Attempt"))) (clojure.core/contains? input "JobBookmark") (clojure.core/assoc :job-bookmark (deser-json-value (input "JobBookmark")))))

(clojure.core/defn- deser-code-gen-node-type [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-update-table-response ([input] (response-update-table-response nil input)) ([resultWrapper1803754 input] (clojure.core/let [rawinput1803753 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803755 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-job-response ([input] (response-get-job-response nil input)) ([resultWrapper1803757 input] (clojure.core/let [rawinput1803756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803758 {"Job" (rawinput1803756 "Job")}] (clojure.core/cond-> {} (letvar1803758 "Job") (clojure.core/assoc :job (deser-job (clojure.core/get-in letvar1803758 ["Job"])))))))

(clojure.core/defn- response-get-table-response ([input] (response-get-table-response nil input)) ([resultWrapper1803760 input] (clojure.core/let [rawinput1803759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803761 {"Table" (rawinput1803759 "Table")}] (clojure.core/cond-> {} (letvar1803761 "Table") (clojure.core/assoc :table (deser-table (clojure.core/get-in letvar1803761 ["Table"])))))))

(clojure.core/defn- response-get-partitions-response ([input] (response-get-partitions-response nil input)) ([resultWrapper1803763 input] (clojure.core/let [rawinput1803762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803764 {"Partitions" (rawinput1803762 "Partitions"), "NextToken" (rawinput1803762 "NextToken")}] (clojure.core/cond-> {} (letvar1803764 "Partitions") (clojure.core/assoc :partitions (deser-partition-list (clojure.core/get-in letvar1803764 ["Partitions"]))) (letvar1803764 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1803764 ["NextToken"])))))))

(clojure.core/defn- response-crawler-running-exception ([input] (response-crawler-running-exception nil input)) ([resultWrapper1803766 input] (clojure.core/let [rawinput1803765 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803767 {"Message" (rawinput1803765 "Message")}] (clojure.core/cond-> {} (letvar1803767 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803767 ["Message"])))))))

(clojure.core/defn- response-delete-database-response ([input] (response-delete-database-response nil input)) ([resultWrapper1803769 input] (clojure.core/let [rawinput1803768 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803770 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper1803772 input] (clojure.core/let [rawinput1803771 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803773 {"Message" (rawinput1803771 "Message")}] (clojure.core/cond-> {} (letvar1803773 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803773 ["Message"])))))))

(clojure.core/defn- response-no-schedule-exception ([input] (response-no-schedule-exception nil input)) ([resultWrapper1803775 input] (clojure.core/let [rawinput1803774 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803776 {"Message" (rawinput1803774 "Message")}] (clojure.core/cond-> {} (letvar1803776 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803776 ["Message"])))))))

(clojure.core/defn- response-list-triggers-response ([input] (response-list-triggers-response nil input)) ([resultWrapper1803778 input] (clojure.core/let [rawinput1803777 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803779 {"TriggerNames" (rawinput1803777 "TriggerNames"), "NextToken" (rawinput1803777 "NextToken")}] (clojure.core/cond-> {} (letvar1803779 "TriggerNames") (clojure.core/assoc :trigger-names (deser-trigger-name-list (clojure.core/get-in letvar1803779 ["TriggerNames"]))) (letvar1803779 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1803779 ["NextToken"])))))))

(clojure.core/defn- response-delete-crawler-response ([input] (response-delete-crawler-response nil input)) ([resultWrapper1803781 input] (clojure.core/let [rawinput1803780 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803782 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper1803784 input] (clojure.core/let [rawinput1803783 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803785 {"Message" (rawinput1803783 "Message")}] (clojure.core/cond-> {} (letvar1803785 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803785 ["Message"])))))))

(clojure.core/defn- response-update-classifier-response ([input] (response-update-classifier-response nil input)) ([resultWrapper1803787 input] (clojure.core/let [rawinput1803786 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803788 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-version-mismatch-exception ([input] (response-version-mismatch-exception nil input)) ([resultWrapper1803790 input] (clojure.core/let [rawinput1803789 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803791 {"Message" (rawinput1803789 "Message")}] (clojure.core/cond-> {} (letvar1803791 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803791 ["Message"])))))))

(clojure.core/defn- response-list-dev-endpoints-response ([input] (response-list-dev-endpoints-response nil input)) ([resultWrapper1803793 input] (clojure.core/let [rawinput1803792 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803794 {"DevEndpointNames" (rawinput1803792 "DevEndpointNames"), "NextToken" (rawinput1803792 "NextToken")}] (clojure.core/cond-> {} (letvar1803794 "DevEndpointNames") (clojure.core/assoc :dev-endpoint-names (deser-dev-endpoint-name-list (clojure.core/get-in letvar1803794 ["DevEndpointNames"]))) (letvar1803794 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1803794 ["NextToken"])))))))

(clojure.core/defn- response-delete-connection-response ([input] (response-delete-connection-response nil input)) ([resultWrapper1803796 input] (clojure.core/let [rawinput1803795 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803797 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-triggers-response ([input] (response-batch-get-triggers-response nil input)) ([resultWrapper1803799 input] (clojure.core/let [rawinput1803798 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803800 {"Triggers" (rawinput1803798 "Triggers"), "TriggersNotFound" (rawinput1803798 "TriggersNotFound")}] (clojure.core/cond-> {} (letvar1803800 "Triggers") (clojure.core/assoc :triggers (deser-trigger-list (clojure.core/get-in letvar1803800 ["Triggers"]))) (letvar1803800 "TriggersNotFound") (clojure.core/assoc :triggers-not-found (deser-trigger-name-list (clojure.core/get-in letvar1803800 ["TriggersNotFound"])))))))

(clojure.core/defn- response-get-user-defined-functions-response ([input] (response-get-user-defined-functions-response nil input)) ([resultWrapper1803802 input] (clojure.core/let [rawinput1803801 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803803 {"UserDefinedFunctions" (rawinput1803801 "UserDefinedFunctions"), "NextToken" (rawinput1803801 "NextToken")}] (clojure.core/cond-> {} (letvar1803803 "UserDefinedFunctions") (clojure.core/assoc :user-defined-functions (deser-user-defined-function-list (clojure.core/get-in letvar1803803 ["UserDefinedFunctions"]))) (letvar1803803 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1803803 ["NextToken"])))))))

(clojure.core/defn- response-batch-get-jobs-response ([input] (response-batch-get-jobs-response nil input)) ([resultWrapper1803805 input] (clojure.core/let [rawinput1803804 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803806 {"Jobs" (rawinput1803804 "Jobs"), "JobsNotFound" (rawinput1803804 "JobsNotFound")}] (clojure.core/cond-> {} (letvar1803806 "Jobs") (clojure.core/assoc :jobs (deser-job-list (clojure.core/get-in letvar1803806 ["Jobs"]))) (letvar1803806 "JobsNotFound") (clojure.core/assoc :jobs-not-found (deser-job-name-list (clojure.core/get-in letvar1803806 ["JobsNotFound"])))))))

(clojure.core/defn- response-batch-get-partition-response ([input] (response-batch-get-partition-response nil input)) ([resultWrapper1803808 input] (clojure.core/let [rawinput1803807 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803809 {"Partitions" (rawinput1803807 "Partitions"), "UnprocessedKeys" (rawinput1803807 "UnprocessedKeys")}] (clojure.core/cond-> {} (letvar1803809 "Partitions") (clojure.core/assoc :partitions (deser-partition-list (clojure.core/get-in letvar1803809 ["Partitions"]))) (letvar1803809 "UnprocessedKeys") (clojure.core/assoc :unprocessed-keys (deser-batch-get-partition-value-list (clojure.core/get-in letvar1803809 ["UnprocessedKeys"])))))))

(clojure.core/defn- response-update-job-response ([input] (response-update-job-response nil input)) ([resultWrapper1803811 input] (clojure.core/let [rawinput1803810 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803812 {"JobName" (rawinput1803810 "JobName")}] (clojure.core/cond-> {} (letvar1803812 "JobName") (clojure.core/assoc :job-name (deser-name-string (clojure.core/get-in letvar1803812 ["JobName"])))))))

(clojure.core/defn- response-reset-job-bookmark-response ([input] (response-reset-job-bookmark-response nil input)) ([resultWrapper1803814 input] (clojure.core/let [rawinput1803813 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803815 {"JobBookmarkEntry" (rawinput1803813 "JobBookmarkEntry")}] (clojure.core/cond-> {} (letvar1803815 "JobBookmarkEntry") (clojure.core/assoc :job-bookmark-entry (deser-job-bookmark-entry (clojure.core/get-in letvar1803815 ["JobBookmarkEntry"])))))))

(clojure.core/defn- response-delete-dev-endpoint-response ([input] (response-delete-dev-endpoint-response nil input)) ([resultWrapper1803817 input] (clojure.core/let [rawinput1803816 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803818 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-partition-response ([input] (response-create-partition-response nil input)) ([resultWrapper1803820 input] (clojure.core/let [rawinput1803819 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803821 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-job-runs-response ([input] (response-get-job-runs-response nil input)) ([resultWrapper1803823 input] (clojure.core/let [rawinput1803822 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803824 {"JobRuns" (rawinput1803822 "JobRuns"), "NextToken" (rawinput1803822 "NextToken")}] (clojure.core/cond-> {} (letvar1803824 "JobRuns") (clojure.core/assoc :job-runs (deser-job-run-list (clojure.core/get-in letvar1803824 ["JobRuns"]))) (letvar1803824 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1803824 ["NextToken"])))))))

(clojure.core/defn- response-get-mapping-response ([input] (response-get-mapping-response nil input)) ([resultWrapper1803826 input] (clojure.core/let [rawinput1803825 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803827 {"Mapping" (rawinput1803825 "Mapping")}] (clojure.core/cond-> {:mapping (deser-mapping-list (clojure.core/get-in letvar1803827 ["Mapping"]))}))))

(clojure.core/defn- response-batch-delete-partition-response ([input] (response-batch-delete-partition-response nil input)) ([resultWrapper1803829 input] (clojure.core/let [rawinput1803828 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803830 {"Errors" (rawinput1803828 "Errors")}] (clojure.core/cond-> {} (letvar1803830 "Errors") (clojure.core/assoc :errors (deser-partition-errors (clojure.core/get-in letvar1803830 ["Errors"])))))))

(clojure.core/defn- response-create-job-response ([input] (response-create-job-response nil input)) ([resultWrapper1803832 input] (clojure.core/let [rawinput1803831 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803833 {"Name" (rawinput1803831 "Name")}] (clojure.core/cond-> {} (letvar1803833 "Name") (clojure.core/assoc :name (deser-name-string (clojure.core/get-in letvar1803833 ["Name"])))))))

(clojure.core/defn- response-batch-create-partition-response ([input] (response-batch-create-partition-response nil input)) ([resultWrapper1803835 input] (clojure.core/let [rawinput1803834 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803836 {"Errors" (rawinput1803834 "Errors")}] (clojure.core/cond-> {} (letvar1803836 "Errors") (clojure.core/assoc :errors (deser-partition-errors (clojure.core/get-in letvar1803836 ["Errors"])))))))

(clojure.core/defn- response-batch-delete-connection-response ([input] (response-batch-delete-connection-response nil input)) ([resultWrapper1803838 input] (clojure.core/let [rawinput1803837 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803839 {"Succeeded" (rawinput1803837 "Succeeded"), "Errors" (rawinput1803837 "Errors")}] (clojure.core/cond-> {} (letvar1803839 "Succeeded") (clojure.core/assoc :succeeded (deser-name-string-list (clojure.core/get-in letvar1803839 ["Succeeded"]))) (letvar1803839 "Errors") (clojure.core/assoc :errors (deser-error-by-name (clojure.core/get-in letvar1803839 ["Errors"])))))))

(clojure.core/defn- response-import-catalog-to-glue-response ([input] (response-import-catalog-to-glue-response nil input)) ([resultWrapper1803841 input] (clojure.core/let [rawinput1803840 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803842 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-dev-endpoints-response ([input] (response-get-dev-endpoints-response nil input)) ([resultWrapper1803844 input] (clojure.core/let [rawinput1803843 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803845 {"DevEndpoints" (rawinput1803843 "DevEndpoints"), "NextToken" (rawinput1803843 "NextToken")}] (clojure.core/cond-> {} (letvar1803845 "DevEndpoints") (clojure.core/assoc :dev-endpoints (deser-dev-endpoint-list (clojure.core/get-in letvar1803845 ["DevEndpoints"]))) (letvar1803845 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1803845 ["NextToken"])))))))

(clojure.core/defn- response-condition-check-failure-exception ([input] (response-condition-check-failure-exception nil input)) ([resultWrapper1803847 input] (clojure.core/let [rawinput1803846 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803848 {"Message" (rawinput1803846 "Message")}] (clojure.core/cond-> {} (letvar1803848 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803848 ["Message"])))))))

(clojure.core/defn- response-get-crawlers-response ([input] (response-get-crawlers-response nil input)) ([resultWrapper1803850 input] (clojure.core/let [rawinput1803849 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803851 {"Crawlers" (rawinput1803849 "Crawlers"), "NextToken" (rawinput1803849 "NextToken")}] (clojure.core/cond-> {} (letvar1803851 "Crawlers") (clojure.core/assoc :crawlers (deser-crawler-list (clojure.core/get-in letvar1803851 ["Crawlers"]))) (letvar1803851 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1803851 ["NextToken"])))))))

(clojure.core/defn- response-stop-trigger-response ([input] (response-stop-trigger-response nil input)) ([resultWrapper1803853 input] (clojure.core/let [rawinput1803852 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803854 {"Name" (rawinput1803852 "Name")}] (clojure.core/cond-> {} (letvar1803854 "Name") (clojure.core/assoc :name (deser-name-string (clojure.core/get-in letvar1803854 ["Name"])))))))

(clojure.core/defn- response-batch-get-crawlers-response ([input] (response-batch-get-crawlers-response nil input)) ([resultWrapper1803856 input] (clojure.core/let [rawinput1803855 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803857 {"Crawlers" (rawinput1803855 "Crawlers"), "CrawlersNotFound" (rawinput1803855 "CrawlersNotFound")}] (clojure.core/cond-> {} (letvar1803857 "Crawlers") (clojure.core/assoc :crawlers (deser-crawler-list (clojure.core/get-in letvar1803857 ["Crawlers"]))) (letvar1803857 "CrawlersNotFound") (clojure.core/assoc :crawlers-not-found (deser-crawler-name-list (clojure.core/get-in letvar1803857 ["CrawlersNotFound"])))))))

(clojure.core/defn- response-get-database-response ([input] (response-get-database-response nil input)) ([resultWrapper1803859 input] (clojure.core/let [rawinput1803858 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803860 {"Database" (rawinput1803858 "Database")}] (clojure.core/cond-> {} (letvar1803860 "Database") (clojure.core/assoc :database (deser-database (clojure.core/get-in letvar1803860 ["Database"])))))))

(clojure.core/defn- response-get-classifiers-response ([input] (response-get-classifiers-response nil input)) ([resultWrapper1803862 input] (clojure.core/let [rawinput1803861 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803863 {"Classifiers" (rawinput1803861 "Classifiers"), "NextToken" (rawinput1803861 "NextToken")}] (clojure.core/cond-> {} (letvar1803863 "Classifiers") (clojure.core/assoc :classifiers (deser-classifier-list (clojure.core/get-in letvar1803863 ["Classifiers"]))) (letvar1803863 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1803863 ["NextToken"])))))))

(clojure.core/defn- response-list-crawlers-response ([input] (response-list-crawlers-response nil input)) ([resultWrapper1803865 input] (clojure.core/let [rawinput1803864 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803866 {"CrawlerNames" (rawinput1803864 "CrawlerNames"), "NextToken" (rawinput1803864 "NextToken")}] (clojure.core/cond-> {} (letvar1803866 "CrawlerNames") (clojure.core/assoc :crawler-names (deser-crawler-name-list (clojure.core/get-in letvar1803866 ["CrawlerNames"]))) (letvar1803866 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1803866 ["NextToken"])))))))

(clojure.core/defn- response-get-connection-response ([input] (response-get-connection-response nil input)) ([resultWrapper1803868 input] (clojure.core/let [rawinput1803867 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803869 {"Connection" (rawinput1803867 "Connection")}] (clojure.core/cond-> {} (letvar1803869 "Connection") (clojure.core/assoc :connection (deser-connection (clojure.core/get-in letvar1803869 ["Connection"])))))))

(clojure.core/defn- response-get-dev-endpoint-response ([input] (response-get-dev-endpoint-response nil input)) ([resultWrapper1803871 input] (clojure.core/let [rawinput1803870 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803872 {"DevEndpoint" (rawinput1803870 "DevEndpoint")}] (clojure.core/cond-> {} (letvar1803872 "DevEndpoint") (clojure.core/assoc :dev-endpoint (deser-dev-endpoint (clojure.core/get-in letvar1803872 ["DevEndpoint"])))))))

(clojure.core/defn- response-batch-delete-table-version-response ([input] (response-batch-delete-table-version-response nil input)) ([resultWrapper1803874 input] (clojure.core/let [rawinput1803873 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803875 {"Errors" (rawinput1803873 "Errors")}] (clojure.core/cond-> {} (letvar1803875 "Errors") (clojure.core/assoc :errors (deser-table-version-errors (clojure.core/get-in letvar1803875 ["Errors"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1803877 input] (clojure.core/let [rawinput1803876 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803878 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-triggers-response ([input] (response-get-triggers-response nil input)) ([resultWrapper1803880 input] (clojure.core/let [rawinput1803879 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803881 {"Triggers" (rawinput1803879 "Triggers"), "NextToken" (rawinput1803879 "NextToken")}] (clojure.core/cond-> {} (letvar1803881 "Triggers") (clojure.core/assoc :triggers (deser-trigger-list (clojure.core/get-in letvar1803881 ["Triggers"]))) (letvar1803881 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1803881 ["NextToken"])))))))

(clojure.core/defn- response-get-job-run-response ([input] (response-get-job-run-response nil input)) ([resultWrapper1803883 input] (clojure.core/let [rawinput1803882 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803884 {"JobRun" (rawinput1803882 "JobRun")}] (clojure.core/cond-> {} (letvar1803884 "JobRun") (clojure.core/assoc :job-run (deser-job-run (clojure.core/get-in letvar1803884 ["JobRun"])))))))

(clojure.core/defn- response-create-script-response ([input] (response-create-script-response nil input)) ([resultWrapper1803886 input] (clojure.core/let [rawinput1803885 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803887 {"PythonScript" (rawinput1803885 "PythonScript"), "ScalaCode" (rawinput1803885 "ScalaCode")}] (clojure.core/cond-> {} (letvar1803887 "PythonScript") (clojure.core/assoc :python-script (deser-python-script (clojure.core/get-in letvar1803887 ["PythonScript"]))) (letvar1803887 "ScalaCode") (clojure.core/assoc :scala-code (deser-scala-code (clojure.core/get-in letvar1803887 ["ScalaCode"])))))))

(clojure.core/defn- response-get-security-configurations-response ([input] (response-get-security-configurations-response nil input)) ([resultWrapper1803889 input] (clojure.core/let [rawinput1803888 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803890 {"SecurityConfigurations" (rawinput1803888 "SecurityConfigurations"), "NextToken" (rawinput1803888 "NextToken")}] (clojure.core/cond-> {} (letvar1803890 "SecurityConfigurations") (clojure.core/assoc :security-configurations (deser-security-configuration-list (clojure.core/get-in letvar1803890 ["SecurityConfigurations"]))) (letvar1803890 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1803890 ["NextToken"])))))))

(clojure.core/defn- response-batch-delete-table-response ([input] (response-batch-delete-table-response nil input)) ([resultWrapper1803892 input] (clojure.core/let [rawinput1803891 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803893 {"Errors" (rawinput1803891 "Errors")}] (clojure.core/cond-> {} (letvar1803893 "Errors") (clojure.core/assoc :errors (deser-table-errors (clojure.core/get-in letvar1803893 ["Errors"])))))))

(clojure.core/defn- response-update-connection-response ([input] (response-update-connection-response nil input)) ([resultWrapper1803895 input] (clojure.core/let [rawinput1803894 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803896 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-table-response ([input] (response-create-table-response nil input)) ([resultWrapper1803898 input] (clojure.core/let [rawinput1803897 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803899 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-classifier-response ([input] (response-create-classifier-response nil input)) ([resultWrapper1803901 input] (clojure.core/let [rawinput1803900 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803902 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-partition-response ([input] (response-get-partition-response nil input)) ([resultWrapper1803904 input] (clojure.core/let [rawinput1803903 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803905 {"Partition" (rawinput1803903 "Partition")}] (clojure.core/cond-> {} (letvar1803905 "Partition") (clojure.core/assoc :partition (deser-partition (clojure.core/get-in letvar1803905 ["Partition"])))))))

(clojure.core/defn- response-get-tables-response ([input] (response-get-tables-response nil input)) ([resultWrapper1803907 input] (clojure.core/let [rawinput1803906 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803908 {"TableList" (rawinput1803906 "TableList"), "NextToken" (rawinput1803906 "NextToken")}] (clojure.core/cond-> {} (letvar1803908 "TableList") (clojure.core/assoc :table-list (deser-table-list (clojure.core/get-in letvar1803908 ["TableList"]))) (letvar1803908 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1803908 ["NextToken"])))))))

(clojure.core/defn- response-scheduler-not-running-exception ([input] (response-scheduler-not-running-exception nil input)) ([resultWrapper1803910 input] (clojure.core/let [rawinput1803909 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803911 {"Message" (rawinput1803909 "Message")}] (clojure.core/cond-> {} (letvar1803911 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803911 ["Message"])))))))

(clojure.core/defn- response-crawler-not-running-exception ([input] (response-crawler-not-running-exception nil input)) ([resultWrapper1803913 input] (clojure.core/let [rawinput1803912 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803914 {"Message" (rawinput1803912 "Message")}] (clojure.core/cond-> {} (letvar1803914 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803914 ["Message"])))))))

(clojure.core/defn- response-get-crawler-response ([input] (response-get-crawler-response nil input)) ([resultWrapper1803916 input] (clojure.core/let [rawinput1803915 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803917 {"Crawler" (rawinput1803915 "Crawler")}] (clojure.core/cond-> {} (letvar1803917 "Crawler") (clojure.core/assoc :crawler (deser-crawler (clojure.core/get-in letvar1803917 ["Crawler"])))))))

(clojure.core/defn- response-scheduler-transitioning-exception ([input] (response-scheduler-transitioning-exception nil input)) ([resultWrapper1803919 input] (clojure.core/let [rawinput1803918 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803920 {"Message" (rawinput1803918 "Message")}] (clojure.core/cond-> {} (letvar1803920 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803920 ["Message"])))))))

(clojure.core/defn- response-update-user-defined-function-response ([input] (response-update-user-defined-function-response nil input)) ([resultWrapper1803922 input] (clojure.core/let [rawinput1803921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803923 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-user-defined-function-response ([input] (response-create-user-defined-function-response nil input)) ([resultWrapper1803925 input] (clojure.core/let [rawinput1803924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803926 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper1803928 input] (clojure.core/let [rawinput1803927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803929 {"Message" (rawinput1803927 "Message")}] (clojure.core/cond-> {} (letvar1803929 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803929 ["Message"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1803931 input] (clojure.core/let [rawinput1803930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803932 {"Message" (rawinput1803930 "Message")}] (clojure.core/cond-> {} (letvar1803932 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803932 ["Message"])))))))

(clojure.core/defn- response-update-partition-response ([input] (response-update-partition-response nil input)) ([resultWrapper1803934 input] (clojure.core/let [rawinput1803933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803935 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-tags-response ([input] (response-get-tags-response nil input)) ([resultWrapper1803937 input] (clojure.core/let [rawinput1803936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803938 {"Tags" (rawinput1803936 "Tags")}] (clojure.core/cond-> {} (letvar1803938 "Tags") (clojure.core/assoc :tags (deser-tags-map (clojure.core/get-in letvar1803938 ["Tags"])))))))

(clojure.core/defn- response-get-user-defined-function-response ([input] (response-get-user-defined-function-response nil input)) ([resultWrapper1803940 input] (clojure.core/let [rawinput1803939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803941 {"UserDefinedFunction" (rawinput1803939 "UserDefinedFunction")}] (clojure.core/cond-> {} (letvar1803941 "UserDefinedFunction") (clojure.core/assoc :user-defined-function (deser-user-defined-function (clojure.core/get-in letvar1803941 ["UserDefinedFunction"])))))))

(clojure.core/defn- response-stop-crawler-response ([input] (response-stop-crawler-response nil input)) ([resultWrapper1803943 input] (clojure.core/let [rawinput1803942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803944 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-crawler-metrics-response ([input] (response-get-crawler-metrics-response nil input)) ([resultWrapper1803946 input] (clojure.core/let [rawinput1803945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803947 {"CrawlerMetricsList" (rawinput1803945 "CrawlerMetricsList"), "NextToken" (rawinput1803945 "NextToken")}] (clojure.core/cond-> {} (letvar1803947 "CrawlerMetricsList") (clojure.core/assoc :crawler-metrics-list (deser-crawler-metrics-list (clojure.core/get-in letvar1803947 ["CrawlerMetricsList"]))) (letvar1803947 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1803947 ["NextToken"])))))))

(clojure.core/defn- response-resource-number-limit-exceeded-exception ([input] (response-resource-number-limit-exceeded-exception nil input)) ([resultWrapper1803949 input] (clojure.core/let [rawinput1803948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803950 {"Message" (rawinput1803948 "Message")}] (clojure.core/cond-> {} (letvar1803950 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803950 ["Message"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1803952 input] (clojure.core/let [rawinput1803951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803953 {"Message" (rawinput1803951 "Message")}] (clojure.core/cond-> {} (letvar1803953 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1803953 ["Message"])))))))

(clojure.core/defn- response-update-database-response ([input] (response-update-database-response nil input)) ([resultWrapper1803955 input] (clojure.core/let [rawinput1803954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803956 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-classifier-response ([input] (response-get-classifier-response nil input)) ([resultWrapper1803958 input] (clojure.core/let [rawinput1803957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803959 {"Classifier" (rawinput1803957 "Classifier")}] (clojure.core/cond-> {} (letvar1803959 "Classifier") (clojure.core/assoc :classifier (deser-classifier (clojure.core/get-in letvar1803959 ["Classifier"])))))))

(clojure.core/defn- response-create-security-configuration-response ([input] (response-create-security-configuration-response nil input)) ([resultWrapper1803961 input] (clojure.core/let [rawinput1803960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803962 {"Name" (rawinput1803960 "Name"), "CreatedTimestamp" (rawinput1803960 "CreatedTimestamp")}] (clojure.core/cond-> {} (letvar1803962 "Name") (clojure.core/assoc :name (deser-name-string (clojure.core/get-in letvar1803962 ["Name"]))) (letvar1803962 "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-value (clojure.core/get-in letvar1803962 ["CreatedTimestamp"])))))))

(clojure.core/defn- response-update-dev-endpoint-response ([input] (response-update-dev-endpoint-response nil input)) ([resultWrapper1803964 input] (clojure.core/let [rawinput1803963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803965 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-trigger-response ([input] (response-start-trigger-response nil input)) ([resultWrapper1803967 input] (clojure.core/let [rawinput1803966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803968 {"Name" (rawinput1803966 "Name")}] (clojure.core/cond-> {} (letvar1803968 "Name") (clojure.core/assoc :name (deser-name-string (clojure.core/get-in letvar1803968 ["Name"])))))))

(clojure.core/defn- response-get-table-version-response ([input] (response-get-table-version-response nil input)) ([resultWrapper1803970 input] (clojure.core/let [rawinput1803969 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803971 {"TableVersion" (rawinput1803969 "TableVersion")}] (clojure.core/cond-> {} (letvar1803971 "TableVersion") (clojure.core/assoc :table-version (deser-table-version (clojure.core/get-in letvar1803971 ["TableVersion"])))))))

(clojure.core/defn- response-update-trigger-response ([input] (response-update-trigger-response nil input)) ([resultWrapper1803973 input] (clojure.core/let [rawinput1803972 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803974 {"Trigger" (rawinput1803972 "Trigger")}] (clojure.core/cond-> {} (letvar1803974 "Trigger") (clojure.core/assoc :trigger (deser-trigger (clojure.core/get-in letvar1803974 ["Trigger"])))))))

(clojure.core/defn- response-get-jobs-response ([input] (response-get-jobs-response nil input)) ([resultWrapper1803976 input] (clojure.core/let [rawinput1803975 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803977 {"Jobs" (rawinput1803975 "Jobs"), "NextToken" (rawinput1803975 "NextToken")}] (clojure.core/cond-> {} (letvar1803977 "Jobs") (clojure.core/assoc :jobs (deser-job-list (clojure.core/get-in letvar1803977 ["Jobs"]))) (letvar1803977 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1803977 ["NextToken"])))))))

(clojure.core/defn- response-delete-job-response ([input] (response-delete-job-response nil input)) ([resultWrapper1803979 input] (clojure.core/let [rawinput1803978 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803980 {"JobName" (rawinput1803978 "JobName")}] (clojure.core/cond-> {} (letvar1803980 "JobName") (clojure.core/assoc :job-name (deser-name-string (clojure.core/get-in letvar1803980 ["JobName"])))))))

(clojure.core/defn- response-start-job-run-response ([input] (response-start-job-run-response nil input)) ([resultWrapper1803982 input] (clojure.core/let [rawinput1803981 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803983 {"JobRunId" (rawinput1803981 "JobRunId")}] (clojure.core/cond-> {} (letvar1803983 "JobRunId") (clojure.core/assoc :job-run-id (deser-id-string (clojure.core/get-in letvar1803983 ["JobRunId"])))))))

(clojure.core/defn- response-delete-resource-policy-response ([input] (response-delete-resource-policy-response nil input)) ([resultWrapper1803985 input] (clojure.core/let [rawinput1803984 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803986 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-dev-endpoint-response ([input] (response-create-dev-endpoint-response nil input)) ([resultWrapper1803988 input] (clojure.core/let [rawinput1803987 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803989 {"ZeppelinRemoteSparkInterpreterPort" (rawinput1803987 "ZeppelinRemoteSparkInterpreterPort"), "CreatedTimestamp" (rawinput1803987 "CreatedTimestamp"), "SecurityGroupIds" (rawinput1803987 "SecurityGroupIds"), "YarnEndpointAddress" (rawinput1803987 "YarnEndpointAddress"), "SubnetId" (rawinput1803987 "SubnetId"), "ExtraJarsS3Path" (rawinput1803987 "ExtraJarsS3Path"), "RoleArn" (rawinput1803987 "RoleArn"), "NumberOfNodes" (rawinput1803987 "NumberOfNodes"), "AvailabilityZone" (rawinput1803987 "AvailabilityZone"), "Status" (rawinput1803987 "Status"), "EndpointName" (rawinput1803987 "EndpointName"), "VpcId" (rawinput1803987 "VpcId"), "FailureReason" (rawinput1803987 "FailureReason"), "SecurityConfiguration" (rawinput1803987 "SecurityConfiguration"), "ExtraPythonLibsS3Path" (rawinput1803987 "ExtraPythonLibsS3Path")}] (clojure.core/cond-> {} (letvar1803989 "ZeppelinRemoteSparkInterpreterPort") (clojure.core/assoc :zeppelin-remote-spark-interpreter-port (deser-integer-value (clojure.core/get-in letvar1803989 ["ZeppelinRemoteSparkInterpreterPort"]))) (letvar1803989 "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-value (clojure.core/get-in letvar1803989 ["CreatedTimestamp"]))) (letvar1803989 "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-string-list (clojure.core/get-in letvar1803989 ["SecurityGroupIds"]))) (letvar1803989 "YarnEndpointAddress") (clojure.core/assoc :yarn-endpoint-address (deser-generic-string (clojure.core/get-in letvar1803989 ["YarnEndpointAddress"]))) (letvar1803989 "SubnetId") (clojure.core/assoc :subnet-id (deser-generic-string (clojure.core/get-in letvar1803989 ["SubnetId"]))) (letvar1803989 "ExtraJarsS3Path") (clojure.core/assoc :extra-jars-s-3-path (deser-generic-string (clojure.core/get-in letvar1803989 ["ExtraJarsS3Path"]))) (letvar1803989 "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1803989 ["RoleArn"]))) (letvar1803989 "NumberOfNodes") (clojure.core/assoc :number-of-nodes (deser-integer-value (clojure.core/get-in letvar1803989 ["NumberOfNodes"]))) (letvar1803989 "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-generic-string (clojure.core/get-in letvar1803989 ["AvailabilityZone"]))) (letvar1803989 "Status") (clojure.core/assoc :status (deser-generic-string (clojure.core/get-in letvar1803989 ["Status"]))) (letvar1803989 "EndpointName") (clojure.core/assoc :endpoint-name (deser-generic-string (clojure.core/get-in letvar1803989 ["EndpointName"]))) (letvar1803989 "VpcId") (clojure.core/assoc :vpc-id (deser-generic-string (clojure.core/get-in letvar1803989 ["VpcId"]))) (letvar1803989 "FailureReason") (clojure.core/assoc :failure-reason (deser-generic-string (clojure.core/get-in letvar1803989 ["FailureReason"]))) (letvar1803989 "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-name-string (clojure.core/get-in letvar1803989 ["SecurityConfiguration"]))) (letvar1803989 "ExtraPythonLibsS3Path") (clojure.core/assoc :extra-python-libs-s-3-path (deser-generic-string (clojure.core/get-in letvar1803989 ["ExtraPythonLibsS3Path"])))))))

(clojure.core/defn- response-put-resource-policy-response ([input] (response-put-resource-policy-response nil input)) ([resultWrapper1803991 input] (clojure.core/let [rawinput1803990 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803992 {"PolicyHash" (rawinput1803990 "PolicyHash")}] (clojure.core/cond-> {} (letvar1803992 "PolicyHash") (clojure.core/assoc :policy-hash (deser-hash-string (clojure.core/get-in letvar1803992 ["PolicyHash"])))))))

(clojure.core/defn- response-update-crawler-response ([input] (response-update-crawler-response nil input)) ([resultWrapper1803994 input] (clojure.core/let [rawinput1803993 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803995 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-table-response ([input] (response-delete-table-response nil input)) ([resultWrapper1803997 input] (clojure.core/let [rawinput1803996 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1803998 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-security-configuration-response ([input] (response-delete-security-configuration-response nil input)) ([resultWrapper1804000 input] (clojure.core/let [rawinput1803999 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804001 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-trigger-response ([input] (response-create-trigger-response nil input)) ([resultWrapper1804003 input] (clojure.core/let [rawinput1804002 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804004 {"Name" (rawinput1804002 "Name")}] (clojure.core/cond-> {} (letvar1804004 "Name") (clojure.core/assoc :name (deser-name-string (clojure.core/get-in letvar1804004 ["Name"])))))))

(clojure.core/defn- response-get-data-catalog-encryption-settings-response ([input] (response-get-data-catalog-encryption-settings-response nil input)) ([resultWrapper1804006 input] (clojure.core/let [rawinput1804005 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804007 {"DataCatalogEncryptionSettings" (rawinput1804005 "DataCatalogEncryptionSettings")}] (clojure.core/cond-> {} (letvar1804007 "DataCatalogEncryptionSettings") (clojure.core/assoc :data-catalog-encryption-settings (deser-data-catalog-encryption-settings (clojure.core/get-in letvar1804007 ["DataCatalogEncryptionSettings"])))))))

(clojure.core/defn- response-create-crawler-response ([input] (response-create-crawler-response nil input)) ([resultWrapper1804009 input] (clojure.core/let [rawinput1804008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804010 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-timeout-exception ([input] (response-operation-timeout-exception nil input)) ([resultWrapper1804012 input] (clojure.core/let [rawinput1804011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804013 {"Message" (rawinput1804011 "Message")}] (clojure.core/cond-> {} (letvar1804013 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804013 ["Message"])))))))

(clojure.core/defn- response-get-databases-response ([input] (response-get-databases-response nil input)) ([resultWrapper1804015 input] (clojure.core/let [rawinput1804014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804016 {"DatabaseList" (rawinput1804014 "DatabaseList"), "NextToken" (rawinput1804014 "NextToken")}] (clojure.core/cond-> {:database-list (deser-database-list (clojure.core/get-in letvar1804016 ["DatabaseList"]))} (letvar1804016 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1804016 ["NextToken"])))))))

(clojure.core/defn- response-delete-table-version-response ([input] (response-delete-table-version-response nil input)) ([resultWrapper1804018 input] (clojure.core/let [rawinput1804017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804019 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-defined-function-response ([input] (response-delete-user-defined-function-response nil input)) ([resultWrapper1804021 input] (clojure.core/let [rawinput1804020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804022 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-crawler-schedule-response ([input] (response-update-crawler-schedule-response nil input)) ([resultWrapper1804024 input] (clojure.core/let [rawinput1804023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804025 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-plan-response ([input] (response-get-plan-response nil input)) ([resultWrapper1804027 input] (clojure.core/let [rawinput1804026 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804028 {"PythonScript" (rawinput1804026 "PythonScript"), "ScalaCode" (rawinput1804026 "ScalaCode")}] (clojure.core/cond-> {} (letvar1804028 "PythonScript") (clojure.core/assoc :python-script (deser-python-script (clojure.core/get-in letvar1804028 ["PythonScript"]))) (letvar1804028 "ScalaCode") (clojure.core/assoc :scala-code (deser-scala-code (clojure.core/get-in letvar1804028 ["ScalaCode"])))))))

(clojure.core/defn- response-get-resource-policy-response ([input] (response-get-resource-policy-response nil input)) ([resultWrapper1804030 input] (clojure.core/let [rawinput1804029 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804031 {"PolicyInJson" (rawinput1804029 "PolicyInJson"), "PolicyHash" (rawinput1804029 "PolicyHash"), "CreateTime" (rawinput1804029 "CreateTime"), "UpdateTime" (rawinput1804029 "UpdateTime")}] (clojure.core/cond-> {} (letvar1804031 "PolicyInJson") (clojure.core/assoc :policy-in-json (deser-policy-json-string (clojure.core/get-in letvar1804031 ["PolicyInJson"]))) (letvar1804031 "PolicyHash") (clojure.core/assoc :policy-hash (deser-hash-string (clojure.core/get-in letvar1804031 ["PolicyHash"]))) (letvar1804031 "CreateTime") (clojure.core/assoc :create-time (deser-timestamp (clojure.core/get-in letvar1804031 ["CreateTime"]))) (letvar1804031 "UpdateTime") (clojure.core/assoc :update-time (deser-timestamp (clojure.core/get-in letvar1804031 ["UpdateTime"])))))))

(clojure.core/defn- response-get-security-configuration-response ([input] (response-get-security-configuration-response nil input)) ([resultWrapper1804033 input] (clojure.core/let [rawinput1804032 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804034 {"SecurityConfiguration" (rawinput1804032 "SecurityConfiguration")}] (clojure.core/cond-> {} (letvar1804034 "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-security-configuration (clojure.core/get-in letvar1804034 ["SecurityConfiguration"])))))))

(clojure.core/defn- response-delete-classifier-response ([input] (response-delete-classifier-response nil input)) ([resultWrapper1804036 input] (clojure.core/let [rawinput1804035 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804037 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-connection-response ([input] (response-create-connection-response nil input)) ([resultWrapper1804039 input] (clojure.core/let [rawinput1804038 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804040 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-trigger-response ([input] (response-delete-trigger-response nil input)) ([resultWrapper1804042 input] (clojure.core/let [rawinput1804041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804043 {"Name" (rawinput1804041 "Name")}] (clojure.core/cond-> {} (letvar1804043 "Name") (clojure.core/assoc :name (deser-name-string (clojure.core/get-in letvar1804043 ["Name"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1804045 input] (clojure.core/let [rawinput1804044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804046 {"Message" (rawinput1804044 "Message")}] (clojure.core/cond-> {} (letvar1804046 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804046 ["Message"])))))))

(clojure.core/defn- response-get-trigger-response ([input] (response-get-trigger-response nil input)) ([resultWrapper1804048 input] (clojure.core/let [rawinput1804047 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804049 {"Trigger" (rawinput1804047 "Trigger")}] (clojure.core/cond-> {} (letvar1804049 "Trigger") (clojure.core/assoc :trigger (deser-trigger (clojure.core/get-in letvar1804049 ["Trigger"])))))))

(clojure.core/defn- response-get-dataflow-graph-response ([input] (response-get-dataflow-graph-response nil input)) ([resultWrapper1804051 input] (clojure.core/let [rawinput1804050 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804052 {"DagNodes" (rawinput1804050 "DagNodes"), "DagEdges" (rawinput1804050 "DagEdges")}] (clojure.core/cond-> {} (letvar1804052 "DagNodes") (clojure.core/assoc :dag-nodes (deser-dag-nodes (clojure.core/get-in letvar1804052 ["DagNodes"]))) (letvar1804052 "DagEdges") (clojure.core/assoc :dag-edges (deser-dag-edges (clojure.core/get-in letvar1804052 ["DagEdges"])))))))

(clojure.core/defn- response-create-database-response ([input] (response-create-database-response nil input)) ([resultWrapper1804054 input] (clojure.core/let [rawinput1804053 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804055 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-concurrent-runs-exceeded-exception ([input] (response-concurrent-runs-exceeded-exception nil input)) ([resultWrapper1804057 input] (clojure.core/let [rawinput1804056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804058 {"Message" (rawinput1804056 "Message")}] (clojure.core/cond-> {} (letvar1804058 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804058 ["Message"])))))))

(clojure.core/defn- response-crawler-stopping-exception ([input] (response-crawler-stopping-exception nil input)) ([resultWrapper1804060 input] (clojure.core/let [rawinput1804059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804061 {"Message" (rawinput1804059 "Message")}] (clojure.core/cond-> {} (letvar1804061 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804061 ["Message"])))))))

(clojure.core/defn- response-put-data-catalog-encryption-settings-response ([input] (response-put-data-catalog-encryption-settings-response nil input)) ([resultWrapper1804063 input] (clojure.core/let [rawinput1804062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804064 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-jobs-response ([input] (response-list-jobs-response nil input)) ([resultWrapper1804066 input] (clojure.core/let [rawinput1804065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804067 {"JobNames" (rawinput1804065 "JobNames"), "NextToken" (rawinput1804065 "NextToken")}] (clojure.core/cond-> {} (letvar1804067 "JobNames") (clojure.core/assoc :job-names (deser-job-name-list (clojure.core/get-in letvar1804067 ["JobNames"]))) (letvar1804067 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1804067 ["NextToken"])))))))

(clojure.core/defn- response-batch-get-dev-endpoints-response ([input] (response-batch-get-dev-endpoints-response nil input)) ([resultWrapper1804069 input] (clojure.core/let [rawinput1804068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804070 {"DevEndpoints" (rawinput1804068 "DevEndpoints"), "DevEndpointsNotFound" (rawinput1804068 "DevEndpointsNotFound")}] (clojure.core/cond-> {} (letvar1804070 "DevEndpoints") (clojure.core/assoc :dev-endpoints (deser-dev-endpoint-list (clojure.core/get-in letvar1804070 ["DevEndpoints"]))) (letvar1804070 "DevEndpointsNotFound") (clojure.core/assoc :dev-endpoints-not-found (deser-dev-endpoint-names (clojure.core/get-in letvar1804070 ["DevEndpointsNotFound"])))))))

(clojure.core/defn- response-get-catalog-import-status-response ([input] (response-get-catalog-import-status-response nil input)) ([resultWrapper1804072 input] (clojure.core/let [rawinput1804071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804073 {"ImportStatus" (rawinput1804071 "ImportStatus")}] (clojure.core/cond-> {} (letvar1804073 "ImportStatus") (clojure.core/assoc :import-status (deser-catalog-import-status (clojure.core/get-in letvar1804073 ["ImportStatus"])))))))

(clojure.core/defn- response-internal-service-exception ([input] (response-internal-service-exception nil input)) ([resultWrapper1804075 input] (clojure.core/let [rawinput1804074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804076 {"Message" (rawinput1804074 "Message")}] (clojure.core/cond-> {} (letvar1804076 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804076 ["Message"])))))))

(clojure.core/defn- response-entity-not-found-exception ([input] (response-entity-not-found-exception nil input)) ([resultWrapper1804078 input] (clojure.core/let [rawinput1804077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804079 {"Message" (rawinput1804077 "Message")}] (clojure.core/cond-> {} (letvar1804079 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804079 ["Message"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1804081 input] (clojure.core/let [rawinput1804080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804082 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-table-versions-response ([input] (response-get-table-versions-response nil input)) ([resultWrapper1804084 input] (clojure.core/let [rawinput1804083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804085 {"TableVersions" (rawinput1804083 "TableVersions"), "NextToken" (rawinput1804083 "NextToken")}] (clojure.core/cond-> {} (letvar1804085 "TableVersions") (clojure.core/assoc :table-versions (deser-get-table-versions-list (clojure.core/get-in letvar1804085 ["TableVersions"]))) (letvar1804085 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1804085 ["NextToken"])))))))

(clojure.core/defn- response-scheduler-running-exception ([input] (response-scheduler-running-exception nil input)) ([resultWrapper1804087 input] (clojure.core/let [rawinput1804086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804088 {"Message" (rawinput1804086 "Message")}] (clojure.core/cond-> {} (letvar1804088 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804088 ["Message"])))))))

(clojure.core/defn- response-glue-encryption-exception ([input] (response-glue-encryption-exception nil input)) ([resultWrapper1804090 input] (clojure.core/let [rawinput1804089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804091 {"Message" (rawinput1804089 "Message")}] (clojure.core/cond-> {} (letvar1804091 "Message") (clojure.core/assoc :message (deser-message-string (clojure.core/get-in letvar1804091 ["Message"])))))))

(clojure.core/defn- response-get-connections-response ([input] (response-get-connections-response nil input)) ([resultWrapper1804093 input] (clojure.core/let [rawinput1804092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804094 {"ConnectionList" (rawinput1804092 "ConnectionList"), "NextToken" (rawinput1804092 "NextToken")}] (clojure.core/cond-> {} (letvar1804094 "ConnectionList") (clojure.core/assoc :connection-list (deser-connection-list (clojure.core/get-in letvar1804094 ["ConnectionList"]))) (letvar1804094 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1804094 ["NextToken"])))))))

(clojure.core/defn- response-start-crawler-schedule-response ([input] (response-start-crawler-schedule-response nil input)) ([resultWrapper1804096 input] (clojure.core/let [rawinput1804095 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804097 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-crawler-schedule-response ([input] (response-stop-crawler-schedule-response nil input)) ([resultWrapper1804099 input] (clojure.core/let [rawinput1804098 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804100 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-partition-response ([input] (response-delete-partition-response nil input)) ([resultWrapper1804102 input] (clojure.core/let [rawinput1804101 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804103 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-crawler-response ([input] (response-start-crawler-response nil input)) ([resultWrapper1804105 input] (clojure.core/let [rawinput1804104 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804106 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-stop-job-run-response ([input] (response-batch-stop-job-run-response nil input)) ([resultWrapper1804108 input] (clojure.core/let [rawinput1804107 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1804109 {"SuccessfulSubmissions" (rawinput1804107 "SuccessfulSubmissions"), "Errors" (rawinput1804107 "Errors")}] (clojure.core/cond-> {} (letvar1804109 "SuccessfulSubmissions") (clojure.core/assoc :successful-submissions (deser-batch-stop-job-run-successful-submission-list (clojure.core/get-in letvar1804109 ["SuccessfulSubmissions"]))) (letvar1804109 "Errors") (clojure.core/assoc :errors (deser-batch-stop-job-run-error-list (clojure.core/get-in letvar1804109 ["Errors"])))))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/message-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-table-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-behavior #{"DELETE_FROM_DATABASE" :delete-from-database :deprecate-in-database :log "DEPRECATE_IN_DATABASE" "LOG"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawlers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawlers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-crawlers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-crawlers-request/max-results :portkey.aws.glue.-2017-03-31.get-crawlers-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-version-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-version-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-version-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-version-request/version-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-table-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-table-version-request/database-name :portkey.aws.glue.-2017-03-31.get-table-version-request/table-name] :opt-un [:portkey.aws.glue.-2017-03-31.get-table-version-request/catalog-id :portkey.aws.glue.-2017-03-31.get-table-version-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-table-versions-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/table-version))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/job]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-targets/s-3-targets (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/s-3-target-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-targets/jdbc-targets (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/jdbc-target-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-targets/dynamo-db-targets (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/dynamo-db-target-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-targets (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.crawler-targets/s-3-targets :portkey.aws.glue.-2017-03-31.crawler-targets/jdbc-targets :portkey.aws.glue.-2017-03-31.crawler-targets/dynamo-db-targets]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/catalog-entries (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/catalog-entry))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.grok-classifier/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.grok-classifier/creation-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.grok-classifier/last-updated (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.grok-classifier/version (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-id))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/grok-classifier (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.grok-classifier/name :portkey.aws.glue.-2017-03-31/classification :portkey.aws.glue.-2017-03-31/grok-pattern] :opt-un [:portkey.aws.glue.-2017-03-31.grok-classifier/creation-time :portkey.aws.glue.-2017-03-31.grok-classifier/last-updated :portkey.aws.glue.-2017-03-31.grok-classifier/version :portkey.aws.glue.-2017-03-31/custom-patterns]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-crawler-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/message-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.put-resource-policy-request/policy-in-json (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/policy-json-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.put-resource-policy-request/policy-hash-condition (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/hash-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.put-resource-policy-request/policy-exists-condition (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/exist-condition))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/put-resource-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.put-resource-policy-request/policy-in-json] :opt-un [:portkey.aws.glue.-2017-03-31.put-resource-policy-request/policy-hash-condition :portkey.aws.glue.-2017-03-31.put-resource-policy-request/policy-exists-condition]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/non-negative-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-table-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/table]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.stop-crawler-schedule-request/crawler-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/stop-crawler-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.stop-crawler-schedule-request/crawler-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/principal-type #{:role "USER" :group "ROLE" :user "GROUP"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/parameters-map-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512000))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/string-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/generic-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/table))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/predecessor-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/predecessor))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-node-arg/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-arg-name))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-node-arg/value (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-arg-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-node-arg/param (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-node-arg (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.code-gen-node-arg/name :portkey.aws.glue.-2017-03-31.code-gen-node-arg/value] :opt-un [:portkey.aws.glue.-2017-03-31.code-gen-node-arg/param]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-response/partitions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/partition-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-partitions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-partitions-response/partitions :portkey.aws.glue.-2017-03-31.get-partitions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.order/column (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.order/sort-order (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-flag))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/order (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.order/column :portkey.aws.glue.-2017-03-31.order/sort-order] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/jdbc-target-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/jdbc-target))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.s-3-target/exclusions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/path-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/s-3-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/path :portkey.aws.glue.-2017-03-31.s-3-target/exclusions]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-dev-endpoints-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/dev-endpoint-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/value-string-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/value-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-json-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-json-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-json-classifier-request/name :portkey.aws.glue.-2017-03-31/json-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.crawler-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/connection))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-database-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-database-request/name] :opt-un [:portkey.aws.glue.-2017-03-31.delete-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/notify-delay-after (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-database-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function-input/function-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function-input/class-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function-input/owner-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function-input/owner-type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/principal-type))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function-input/resource-uris (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/resource-uri-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/user-defined-function-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.user-defined-function-input/function-name :portkey.aws.glue.-2017-03-31.user-defined-function-input/class-name :portkey.aws.glue.-2017-03-31.user-defined-function-input/owner-name :portkey.aws.glue.-2017-03-31.user-defined-function-input/owner-type :portkey.aws.glue.-2017-03-31.user-defined-function-input/resource-uris]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/boolean-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/classifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/grok-classifier :portkey.aws.glue.-2017-03-31/xml-classifier :portkey.aws.glue.-2017-03-31/json-classifier]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-dev-endpoints-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-dev-endpoints-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-dev-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-dev-endpoints-request/max-results :portkey.aws.glue.-2017-03-31.get-dev-endpoints-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.no-schedule-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/no-schedule-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.no-schedule-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-triggers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-triggers-request/dependent-job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-triggers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-triggers-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-triggers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-triggers-request/next-token :portkey.aws.glue.-2017-03-31.list-triggers-request/dependent-job-name :portkey.aws.glue.-2017-03-31.list-triggers-request/max-results :portkey.aws.glue.-2017-03-31.list-triggers-request/tags]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-triggers-response/trigger-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-triggers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-triggers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-triggers-response/trigger-names :portkey.aws.glue.-2017-03-31.list-triggers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/resource-uri-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/resource-uri :min-count 0 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-dev-endpoints-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-dev-endpoints-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-dev-endpoints-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-dev-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-dev-endpoints-request/next-token :portkey.aws.glue.-2017-03-31.list-dev-endpoints-request/max-results :portkey.aws.glue.-2017-03-31.list-dev-endpoints-request/tags]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.validation-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-metrics-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/crawler-metrics))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/role-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/version-ids (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-delete-table-version-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-table-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/database-name :portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/table-name :portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/version-ids] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-table-version-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tables-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tables-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tables-request/expression (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/filter-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tables-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tables-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-tables-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-tables-request/database-name] :opt-un [:portkey.aws.glue.-2017-03-31.get-tables-request/catalog-id :portkey.aws.glue.-2017-03-31.get-tables-request/expression :portkey.aws.glue.-2017-03-31.get-tables-request/next-token :portkey.aws.glue.-2017-03-31.get-tables-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.version-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/version-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.version-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/public-keys-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/generic-string :max-count 5))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/job))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-dev-endpoints-response/dev-endpoint-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/dev-endpoint-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-dev-endpoints-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-dev-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-dev-endpoints-response/dev-endpoint-names :portkey.aws.glue.-2017-03-31.list-dev-endpoints-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.encryption-at-rest/sse-aws-kms-key-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/encryption-at-rest (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/catalog-encryption-mode] :opt-un [:portkey.aws.glue.-2017-03-31.encryption-at-rest/sse-aws-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-run-request/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-run-request/run-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-run-request/predecessors-included (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-job-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-job-run-request/job-name :portkey.aws.glue.-2017-03-31.get-job-run-request/run-id] :opt-un [:portkey.aws.glue.-2017-03-31.get-job-run-request/predecessors-included]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/page-size (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[A-Za-z_][A-Za-z0-9_]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/s-3-target-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/s-3-target))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-runs-request/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-runs-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-job-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-job-runs-request/job-name] :opt-un [:portkey.aws.glue.-2017-03-31.get-job-runs-request/next-token :portkey.aws.glue.-2017-03-31.get-job-runs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-database-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-database-request/name :portkey.aws.glue.-2017-03-31/database-input] :opt-un [:portkey.aws.glue.-2017-03-31.update-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/timeout (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.encryption-configuration/s-3-encryption (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/s-3-encryption-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/encryption-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.encryption-configuration/s-3-encryption :portkey.aws.glue.-2017-03-31/cloud-watch-encryption :portkey.aws.glue.-2017-03-31/job-bookmarks-encryption]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/column-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/column))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dev-endpoint-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/non-negative-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/public-key (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/add-public-keys (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/delete-public-keys (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/custom-libraries (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/dev-endpoint-custom-libraries))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/update-etl-libraries (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/endpoint-name] :opt-un [:portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/public-key :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/add-public-keys :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/delete-public-keys :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/custom-libraries :portkey.aws.glue.-2017-03-31.update-dev-endpoint-request/update-etl-libraries]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-triggers-response/triggers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-triggers-response/triggers-not-found (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-triggers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-get-triggers-response/triggers :portkey.aws.glue.-2017-03-31.batch-get-triggers-response/triggers-not-found]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-functions-response/user-defined-functions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/user-defined-function-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-functions-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-user-defined-functions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-user-defined-functions-response/user-defined-functions :portkey.aws.glue.-2017-03-31.get-user-defined-functions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-run-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/job-run))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/boolean-nullable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/attempt-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-crawlers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-crawlers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-crawlers-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-crawlers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-crawlers-request/max-results :portkey.aws.glue.-2017-03-31.list-crawlers-request/next-token :portkey.aws.glue.-2017-03-31.list-crawlers-request/tags]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/execution-time clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/database-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-jobs-response/jobs-not-found (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-get-jobs-response/jobs :portkey.aws.glue.-2017-03-31.batch-get-jobs-response/jobs-not-found]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/location-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2056)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/partition-input-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/partition-input :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/glue-resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 10240)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:glue:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-partition-response/partitions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/partition-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-partition-response/unprocessed-keys (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-get-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-get-partition-response/partitions :portkey.aws.glue.-2017-03-31.batch-get-partition-response/unprocessed-keys]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-job-response/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.update-job-response/job-name]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/reset-job-bookmark-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/job-bookmark-entry]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/action-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/action))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/format-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/tags-map (clojure.spec.alpha/map-of :portkey.aws.glue.-2017-03-31/tag-key :portkey.aws.glue.-2017-03-31/tag-value))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-resource-policy-request/policy-hash-condition (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/hash-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-resource-policy-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.delete-resource-policy-request/policy-hash-condition]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/version-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-node-args (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/code-gen-node-arg :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-jobs-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-jobs-request/next-token :portkey.aws.glue.-2017-03-31.list-jobs-request/max-results :portkey.aws.glue.-2017-03-31.list-jobs-request/tags]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint-custom-libraries/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint-custom-libraries/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dev-endpoint-custom-libraries (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.dev-endpoint-custom-libraries/extra-python-libs-s-3-path :portkey.aws.glue.-2017-03-31.dev-endpoint-custom-libraries/extra-jars-s-3-path]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawler-metrics-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawler-metrics-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-crawler-metrics-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/crawler-name-list :portkey.aws.glue.-2017-03-31.get-crawler-metrics-request/max-results :portkey.aws.glue.-2017-03-31.get-crawler-metrics-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-runs-response/job-runs (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-run-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-runs-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-job-runs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-job-runs-response/job-runs :portkey.aws.glue.-2017-03-31.get-job-runs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-catalog-import-status-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-catalog-import-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-catalog-import-status-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-table-request/database-name :portkey.aws.glue.-2017-03-31.get-table-request/name] :opt-un [:portkey.aws.glue.-2017-03-31.get-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-mapping-response/mapping (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/mapping-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-mapping-response (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-mapping-response/mapping] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-security-configuration-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-security-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-security-configuration-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/cron-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-user-defined-function-request/function-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-user-defined-function-request/database-name :portkey.aws.glue.-2017-03-31.delete-user-defined-function-request/function-name] :opt-un [:portkey.aws.glue.-2017-03-31.delete-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-triggers-request/trigger-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-triggers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-get-triggers-request/trigger-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/json-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-edge/source (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-identifier))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-edge/target (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-identifier))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-edge/target-parameter (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-arg-name))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-edge (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.code-gen-edge/source :portkey.aws.glue.-2017-03-31.code-gen-edge/target] :opt-un [:portkey.aws.glue.-2017-03-31.code-gen-edge/target-parameter]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dag-nodes (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/code-gen-node))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/location-map (clojure.spec.alpha/map-of :portkey.aws.glue.-2017-03-31/column-values-string :portkey.aws.glue.-2017-03-31/column-values-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-partition-response/errors (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/partition-errors))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-partition-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/view-text-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 409600))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/classifier-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/classifier))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-classifiers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-classifiers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-classifiers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-classifiers-request/max-results :portkey.aws.glue.-2017-03-31.get-classifiers-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-response/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.create-job-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-crawlers-request/crawler-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-crawlers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-get-crawlers-request/crawler-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-security-configuration-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-security-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-security-configuration-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-create-partition-response/errors (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/partition-errors))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-create-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-create-partition-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.put-data-catalog-encryption-settings-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/put-data-catalog-encryption-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/data-catalog-encryption-settings] :opt-un [:portkey.aws.glue.-2017-03-31.put-data-catalog-encryption-settings-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.import-catalog-to-glue-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/import-catalog-to-glue-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.import-catalog-to-glue-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/trigger-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/trigger))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.jdbc-target/exclusions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/path-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/jdbc-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/connection-name :portkey.aws.glue.-2017-03-31/path :portkey.aws.glue.-2017-03-31.jdbc-target/exclusions]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/error-by-name (clojure.spec.alpha/map-of :portkey.aws.glue.-2017-03-31/name-string :portkey.aws.glue.-2017-03-31/error-detail))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-arg-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/connection-input] :opt-un [:portkey.aws.glue.-2017-03-31.create-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/uri-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-connection-response/succeeded (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-connection-response/errors (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/error-by-name))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-connection-response/succeeded :portkey.aws.glue.-2017-03-31.batch-delete-connection-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.catalog-entry/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.catalog-entry/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/catalog-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.catalog-entry/database-name :portkey.aws.glue.-2017-03-31.catalog-entry/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-connection-request/connection-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-connection-request/connection-name] :opt-un [:portkey.aws.glue.-2017-03-31.delete-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/predicate-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-dev-endpoint-request/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/import-catalog-to-glue-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-dev-endpoints-response/dev-endpoints (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/dev-endpoint-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-dev-endpoints-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-dev-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-dev-endpoints-response/dev-endpoints :portkey.aws.glue.-2017-03-31.get-dev-endpoints-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.mapping-entry/source-table (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/table-name))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.mapping-entry/source-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/schema-path-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.mapping-entry/source-type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/field-type))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.mapping-entry/target-table (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/table-name))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.mapping-entry/target-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/schema-path-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.mapping-entry/target-type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/field-type))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/mapping-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.mapping-entry/source-table :portkey.aws.glue.-2017-03-31.mapping-entry/source-path :portkey.aws.glue.-2017-03-31.mapping-entry/source-type :portkey.aws.glue.-2017-03-31.mapping-entry/target-table :portkey.aws.glue.-2017-03-31.mapping-entry/target-path :portkey.aws.glue.-2017-03-31.mapping-entry/target-type]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-connection-request/connection-name-list (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-connection-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-delete-connection-request/connection-name-list] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-command/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-command/script-location (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/script-location-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-command (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.job-command/name :portkey.aws.glue.-2017-03-31.job-command/script-location]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.physical-connection-requirements/subnet-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.physical-connection-requirements/availability-zone (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/physical-connection-requirements (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.physical-connection-requirements/subnet-id :portkey.aws.glue.-2017-03-31/security-group-id-list :portkey.aws.glue.-2017-03-31.physical-connection-requirements/availability-zone]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/kms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:kms:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/milliseconds-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.predecessor/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.predecessor/run-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/predecessor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.predecessor/job-name :portkey.aws.glue.-2017-03-31.predecessor/run-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-plan-request/mapping (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/mapping-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-plan-request/source (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-entry))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-plan-request/sinks (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-entries))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-plan-request/mapping :portkey.aws.glue.-2017-03-31.get-plan-request/source] :opt-un [:portkey.aws.glue.-2017-03-31.get-plan-request/sinks :portkey.aws.glue.-2017-03-31/location :portkey.aws.glue.-2017-03-31/language]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-request/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-request/job-run-ids (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-stop-job-run-job-run-id-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-stop-job-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-stop-job-run-request/job-name :portkey.aws.glue.-2017-03-31.batch-stop-job-run-request/job-run-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.location/jdbc (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.location/s-3 (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.location/dynamo-db (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.location/jdbc :portkey.aws.glue.-2017-03-31.location/s-3 :portkey.aws.glue.-2017-03-31.location/dynamo-db]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.xml-classifier/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.xml-classifier/creation-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.xml-classifier/last-updated (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.xml-classifier/version (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-id))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/xml-classifier (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.xml-classifier/name :portkey.aws.glue.-2017-03-31/classification] :opt-un [:portkey.aws.glue.-2017-03-31.xml-classifier/creation-time :portkey.aws.glue.-2017-03-31.xml-classifier/last-updated :portkey.aws.glue.-2017-03-31.xml-classifier/version :portkey.aws.glue.-2017-03-31/row-tag]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.condition-check-failure-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/condition-check-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.condition-check-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawlers-response/crawlers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawlers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-crawlers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-crawlers-response/crawlers :portkey.aws.glue.-2017-03-31.get-crawlers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-state #{:ready "READY" :running :stopping "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/s-3-encryption-mode #{"DISABLED" :disabled :ssekms "SSE-KMS" "SSE-S3" :sses-3})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-create-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-create-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-create-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-create-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-create-partition-request/database-name :portkey.aws.glue.-2017-03-31.batch-create-partition-request/table-name :portkey.aws.glue.-2017-03-31/partition-input-list] :opt-un [:portkey.aws.glue.-2017-03-31.batch-create-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.stop-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/stop-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.stop-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/column-value-string-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/column-values-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-security-configuration (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-crawlers-response/crawlers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-crawlers-response/crawlers-not-found (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-crawlers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-get-crawlers-response/crawlers :portkey.aws.glue.-2017-03-31.batch-get-crawlers-response/crawlers-not-found]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/number-of-buckets (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/location (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/location-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/compressed (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/serde-info (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/ser-de-info))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/output-format (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/format-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/stored-as-sub-directories (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/bucket-columns (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/input-format (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/format-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/columns (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/column-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.storage-descriptor/sort-columns (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/order-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/storage-descriptor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.storage-descriptor/number-of-buckets :portkey.aws.glue.-2017-03-31.storage-descriptor/parameters :portkey.aws.glue.-2017-03-31.storage-descriptor/location :portkey.aws.glue.-2017-03-31.storage-descriptor/compressed :portkey.aws.glue.-2017-03-31.storage-descriptor/serde-info :portkey.aws.glue.-2017-03-31.storage-descriptor/output-format :portkey.aws.glue.-2017-03-31/skewed-info :portkey.aws.glue.-2017-03-31.storage-descriptor/stored-as-sub-directories :portkey.aws.glue.-2017-03-31.storage-descriptor/bucket-columns :portkey.aws.glue.-2017-03-31.storage-descriptor/input-format :portkey.aws.glue.-2017-03-31.storage-descriptor/columns :portkey.aws.glue.-2017-03-31.storage-descriptor/sort-columns]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/condition-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/condition))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/security-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/security-configuration))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.resource-uri/uri (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/uri))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/resource-uri (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/resource-type :portkey.aws.glue.-2017-03-31.resource-uri/uri]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/json-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-database-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/database]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-schedule-request/crawler-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-schedule-request/schedule (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-crawler-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-crawler-schedule-request/crawler-name] :opt-un [:portkey.aws.glue.-2017-03-31.update-crawler-schedule-request/schedule]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-classifiers-response/classifiers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/classifier-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-classifiers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-classifiers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-classifiers-response/classifiers :portkey.aws.glue.-2017-03-31.get-classifiers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-crawlers-response/crawler-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-crawlers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-crawlers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-crawlers-response/crawler-names :portkey.aws.glue.-2017-03-31.list-crawlers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-partition-request/partition-value-list (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/bounded-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-partition-request/database-name :portkey.aws.glue.-2017-03-31.update-partition-request/table-name :portkey.aws.glue.-2017-03-31.update-partition-request/partition-value-list :portkey.aws.glue.-2017-03-31/partition-input] :opt-un [:portkey.aws.glue.-2017-03-31.update-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-resource-policy-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/connection]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/dev-endpoint]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-versions-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-versions-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-versions-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-table-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-table-versions-request/database-name :portkey.aws.glue.-2017-03-31.get-table-versions-request/table-name] :opt-un [:portkey.aws.glue.-2017-03-31.get-table-versions-request/catalog-id :portkey.aws.glue.-2017-03-31.get-table-versions-request/next-token :portkey.aws.glue.-2017-03-31.get-table-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.last-crawl-info/status (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/last-crawl-status))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.last-crawl-info/error-message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.last-crawl-info/start-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/last-crawl-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.last-crawl-info/status :portkey.aws.glue.-2017-03-31.last-crawl-info/error-message :portkey.aws.glue.-2017-03-31/log-group :portkey.aws.glue.-2017-03-31/log-stream :portkey.aws.glue.-2017-03-31/message-prefix :portkey.aws.glue.-2017-03-31.last-crawl-info/start-time]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-crawler-request/classifiers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/classifier-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-crawler-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-crawler-request/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-crawler-request/targets (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-targets))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-crawler-request/schedule (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-crawler-request/configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-configuration))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-crawler-request/name :portkey.aws.glue.-2017-03-31/role :portkey.aws.glue.-2017-03-31/database-name :portkey.aws.glue.-2017-03-31.create-crawler-request/targets] :opt-un [:portkey.aws.glue.-2017-03-31.create-crawler-request/classifiers :portkey.aws.glue.-2017-03-31.create-crawler-request/tags :portkey.aws.glue.-2017-03-31/crawler-security-configuration :portkey.aws.glue.-2017-03-31/table-prefix :portkey.aws.glue.-2017-03-31/schema-change-policy :portkey.aws.glue.-2017-03-31.create-crawler-request/description :portkey.aws.glue.-2017-03-31.create-crawler-request/schedule :portkey.aws.glue.-2017-03-31.create-crawler-request/configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/version-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-node/id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-identifier))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-node/node-type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-node-type))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-node/args (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.code-gen-node/line-number (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-node (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.code-gen-node/id :portkey.aws.glue.-2017-03-31.code-gen-node/node-type :portkey.aws.glue.-2017-03-31.code-gen-node/args] :opt-un [:portkey.aws.glue.-2017-03-31.code-gen-node/line-number]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-stop-job-run-successful-submission-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/batch-stop-job-run-successful-submission))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-version-response/errors (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/table-version-errors))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-table-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-table-version-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/crawler))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/max-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/nullable-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/log-uri (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/uri-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/default-arguments (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/connections (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/connections-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/role (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/role-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-update/command (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-command))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.job-update/allocated-capacity :portkey.aws.glue.-2017-03-31/timeout :portkey.aws.glue.-2017-03-31.job-update/max-capacity :portkey.aws.glue.-2017-03-31.job-update/log-uri :portkey.aws.glue.-2017-03-31.job-update/default-arguments :portkey.aws.glue.-2017-03-31.job-update/connections :portkey.aws.glue.-2017-03-31.job-update/role :portkey.aws.glue.-2017-03-31.job-update/description :portkey.aws.glue.-2017-03-31.job-update/security-configuration :portkey.aws.glue.-2017-03-31.job-update/command :portkey.aws.glue.-2017-03-31/max-retries :portkey.aws.glue.-2017-03-31/execution-property :portkey.aws.glue.-2017-03-31/notification-property]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-triggers-response/triggers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-triggers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-triggers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-triggers-response/triggers :portkey.aws.glue.-2017-03-31.get-triggers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/script-location-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dynamo-db-target-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/dynamo-db-target))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/subnet-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/number-of-nodes (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/public-keys (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/public-key (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/endpoint-name :portkey.aws.glue.-2017-03-31/role-arn] :opt-un [:portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/security-group-ids :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/subnet-id :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/extra-jars-s-3-path :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/number-of-nodes :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/tags :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/public-keys :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/security-configuration :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/extra-python-libs-s-3-path :portkey.aws.glue.-2017-03-31.create-dev-endpoint-request/public-key]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-connections-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/match-criteria :portkey.aws.glue.-2017-03-31/connection-type]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/value-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-partition-request/database-name :portkey.aws.glue.-2017-03-31.create-partition-request/table-name :portkey.aws.glue.-2017-03-31/partition-input] :opt-un [:portkey.aws.glue.-2017-03-31.create-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/comment-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/key-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-job-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/job-run]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/filter-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-script-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/python-script :portkey.aws.glue.-2017-03-31/scala-code]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-security-configurations-response/security-configurations (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/security-configuration-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-security-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-security-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-security-configurations-response/security-configurations :portkey.aws.glue.-2017-03-31.get-security-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/python-script (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/catalog-id-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/s-3-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/s-3-encryption-mode :portkey.aws.glue.-2017-03-31/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-response/errors (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/table-errors))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-table-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-table-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/glue-resource-arn))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.tag-resource-request/tags-to-add (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.tag-resource-request/resource-arn :portkey.aws.glue.-2017-03-31.tag-resource-request/tags-to-add] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-grok-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-grok-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/classification :portkey.aws.glue.-2017-03-31.create-grok-classifier-request/name :portkey.aws.glue.-2017-03-31/grok-pattern] :opt-un [:portkey.aws.glue.-2017-03-31/custom-patterns]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/logical #{"AND" "ANY" :and :any})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/catalog-encryption-mode #{"DISABLED" :disabled :ssekms "SSE-KMS"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-table-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/description-string-removable (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-grok-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-grok-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-grok-classifier-request/name] :opt-un [:portkey.aws.glue.-2017-03-31/classification :portkey.aws.glue.-2017-03-31/grok-pattern :portkey.aws.glue.-2017-03-31/custom-patterns]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dag-edges (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/code-gen-edge))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.error-detail/error-code (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.error-detail/error-message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/error-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.error-detail/error-code :portkey.aws.glue.-2017-03-31.error-detail/error-message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-user-defined-function-request/function-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-user-defined-function-request/function-input (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/user-defined-function-input))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-user-defined-function-request/database-name :portkey.aws.glue.-2017-03-31.update-user-defined-function-request/function-name :portkey.aws.glue.-2017-03-31.update-user-defined-function-request/function-input] :opt-un [:portkey.aws.glue.-2017-03-31.update-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-table-request/skip-archive (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean-nullable))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-table-request/database-name :portkey.aws.glue.-2017-03-31/table-input] :opt-un [:portkey.aws.glue.-2017-03-31.update-table-request/catalog-id :portkey.aws.glue.-2017-03-31.update-table-request/skip-archive]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/pattern (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-user-defined-functions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/database-name :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/pattern] :opt-un [:portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/catalog-id :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/next-token :portkey.aws.glue.-2017-03-31.get-user-defined-functions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-connection-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-connection-request/name :portkey.aws.glue.-2017-03-31/connection-input] :opt-un [:portkey.aws.glue.-2017-03-31.update-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-dataflow-graph-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/python-script]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-trigger-request/name :portkey.aws.glue.-2017-03-31/trigger-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/partition]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tables-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-tables-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/table-list :portkey.aws.glue.-2017-03-31.get-tables-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/row-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-version/version-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/table :portkey.aws.glue.-2017-03-31.table-version/version-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.json-classifier/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.json-classifier/creation-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.json-classifier/last-updated (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.json-classifier/version (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-id))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/json-classifier (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.json-classifier/name :portkey.aws.glue.-2017-03-31/json-path] :opt-un [:portkey.aws.glue.-2017-03-31.json-classifier/creation-time :portkey.aws.glue.-2017-03-31.json-classifier/last-updated :portkey.aws.glue.-2017-03-31.json-classifier/version]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/exist-condition #{"MUST_EXIST" :must-exist "NONE" "NOT_EXIST" :not-exist :none})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/max-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/nullable-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/log-uri (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/uri-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/default-arguments (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/connections (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/connections-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/role (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/role-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/command (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-command))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-job-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-job-request/name :portkey.aws.glue.-2017-03-31.create-job-request/role :portkey.aws.glue.-2017-03-31.create-job-request/command] :opt-un [:portkey.aws.glue.-2017-03-31.create-job-request/allocated-capacity :portkey.aws.glue.-2017-03-31/timeout :portkey.aws.glue.-2017-03-31.create-job-request/max-capacity :portkey.aws.glue.-2017-03-31.create-job-request/log-uri :portkey.aws.glue.-2017-03-31.create-job-request/tags :portkey.aws.glue.-2017-03-31.create-job-request/default-arguments :portkey.aws.glue.-2017-03-31.create-job-request/connections :portkey.aws.glue.-2017-03-31.create-job-request/description :portkey.aws.glue.-2017-03-31.create-job-request/security-configuration :portkey.aws.glue.-2017-03-31/max-retries :portkey.aws.glue.-2017-03-31/execution-property :portkey.aws.glue.-2017-03-31/notification-property]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.segment/segment-number (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.segment/total-segments (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/total-segments-integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/segment (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.segment/segment-number :portkey.aws.glue.-2017-03-31.segment/total-segments] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.scheduler-not-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/scheduler-not-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.scheduler-not-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/column-values-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/schema-change-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/update-behavior :portkey.aws.glue.-2017-03-31/delete-behavior]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-jobs-request/job-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-jobs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-get-jobs-request/job-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-bookmarks-encryption-mode #{"DISABLED" :disabled "CSE-KMS" :csekms})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-not-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-not-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.crawler-not-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.ser-de-info/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.ser-de-info/serialization-library (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.ser-de-info/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/ser-de-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.ser-de-info/name :portkey.aws.glue.-2017-03-31.ser-de-info/serialization-library :portkey.aws.glue.-2017-03-31.ser-de-info/parameters]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/crawler]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connection-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connection-request/hide-password (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-connection-request/name] :opt-un [:portkey.aws.glue.-2017-03-31.get-connection-request/catalog-id :portkey.aws.glue.-2017-03-31.get-connection-request/hide-password]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-arg-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.scheduler-transitioning-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/scheduler-transitioning-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.scheduler-transitioning-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-classifier-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/scala-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/id-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-databases-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-databases-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-databases-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-databases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-databases-request/catalog-id :portkey.aws.glue.-2017-03-31.get-databases-request/next-token :portkey.aws.glue.-2017-03-31.get-databases-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-partition-value-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/partition-value-list :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/view-expanded-text (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/partition-keys (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/column-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/owner (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/table-type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/table-type-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/last-access-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/retention (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-input/view-original-text (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.table-input/name] :opt-un [:portkey.aws.glue.-2017-03-31.table-input/view-expanded-text :portkey.aws.glue.-2017-03-31.table-input/parameters :portkey.aws.glue.-2017-03-31/storage-descriptor :portkey.aws.glue.-2017-03-31.table-input/partition-keys :portkey.aws.glue.-2017-03-31.table-input/description :portkey.aws.glue.-2017-03-31.table-input/owner :portkey.aws.glue.-2017-03-31.table-input/table-type :portkey.aws.glue.-2017-03-31.table-input/last-access-time :portkey.aws.glue.-2017-03-31.table-input/retention :portkey.aws.glue.-2017-03-31.table-input/last-analyzed-time :portkey.aws.glue.-2017-03-31.table-input/view-original-text]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/integer-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-request/expression (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/predicate-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partitions-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-partitions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-partitions-request/database-name :portkey.aws.glue.-2017-03-31.get-partitions-request/table-name] :opt-un [:portkey.aws.glue.-2017-03-31.get-partitions-request/catalog-id :portkey.aws.glue.-2017-03-31.get-partitions-request/expression :portkey.aws.glue.-2017-03-31.get-partitions-request/next-token :portkey.aws.glue.-2017-03-31/segment :portkey.aws.glue.-2017-03-31.get-partitions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.skewed-info/skewed-column-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.skewed-info/skewed-column-values (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/column-value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.skewed-info/skewed-column-value-location-maps (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/location-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/skewed-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.skewed-info/skewed-column-names :portkey.aws.glue.-2017-03-31.skewed-info/skewed-column-values :portkey.aws.glue.-2017-03-31.skewed-info/skewed-column-value-location-maps]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.idempotent-parameter-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.idempotent-parameter-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/trigger-state #{:deactivated "DEACTIVATING" :creating "UPDATING" "ACTIVATING" :created :deleting :activated "DELETING" "CREATING" "DEACTIVATED" :updating :deactivating "ACTIVATED" :activating "CREATED"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/data-catalog-encryption-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/encryption-at-rest :portkey.aws.glue.-2017-03-31/connection-password-encryption]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-table-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-table-request/database-name :portkey.aws.glue.-2017-03-31.delete-table-request/name] :opt-un [:portkey.aws.glue.-2017-03-31.delete-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/log-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\.\-_/#A-Za-z0-9]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection-properties (clojure.spec.alpha/map-of :portkey.aws.glue.-2017-03-31/connection-property-key :portkey.aws.glue.-2017-03-31/value-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/last-crawl (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/last-crawl-info))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/classifiers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/classifier-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/crawl-elapsed-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/milliseconds-count))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/targets (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-targets))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/creation-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/state (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-state))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/version (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-id))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-configuration))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler/last-updated (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.crawler/last-crawl :portkey.aws.glue.-2017-03-31.crawler/classifiers :portkey.aws.glue.-2017-03-31/database-name :portkey.aws.glue.-2017-03-31/crawler-security-configuration :portkey.aws.glue.-2017-03-31/role :portkey.aws.glue.-2017-03-31/table-prefix :portkey.aws.glue.-2017-03-31.crawler/crawl-elapsed-time :portkey.aws.glue.-2017-03-31/schema-change-policy :portkey.aws.glue.-2017-03-31.crawler/description :portkey.aws.glue.-2017-03-31.crawler/targets :portkey.aws.glue.-2017-03-31.crawler/creation-time :portkey.aws.glue.-2017-03-31.crawler/state :portkey.aws.glue.-2017-03-31.crawler/version :portkey.aws.glue.-2017-03-31/schedule :portkey.aws.glue.-2017-03-31.crawler/name :portkey.aws.glue.-2017-03-31.crawler/configuration :portkey.aws.glue.-2017-03-31.crawler/last-updated]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/partition-errors (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/partition-error))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tags-response/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-tags-response/tags]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/user-defined-function]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/s-3-encryption-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/s-3-encryption))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/name-string-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-version-error/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-version-error/version-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-version-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.table-version-error/table-name :portkey.aws.glue.-2017-03-31.table-version-error/version-id :portkey.aws.glue.-2017-03-31/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/stop-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-jobs-request/next-token :portkey.aws.glue.-2017-03-31.get-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition-input/values (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition-input/last-access-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition-input/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition-input/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/partition-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.partition-input/values :portkey.aws.glue.-2017-03-31.partition-input/last-access-time :portkey.aws.glue.-2017-03-31/storage-descriptor :portkey.aws.glue.-2017-03-31.partition-input/parameters :portkey.aws.glue.-2017-03-31.partition-input/last-analyzed-time]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-crawler-metrics-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-crawler-metrics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/crawler-metrics-list :portkey.aws.glue.-2017-03-31.get-crawler-metrics-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-classifier-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-job-request/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-job-request/job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.resource-number-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.resource-number-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-request/type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-type))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-request/schedule (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-request/actions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/action-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-request/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-request/start-on-creation (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-request/tags (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tags-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-trigger-request/name :portkey.aws.glue.-2017-03-31.create-trigger-request/type :portkey.aws.glue.-2017-03-31.create-trigger-request/actions] :opt-un [:portkey.aws.glue.-2017-03-31.create-trigger-request/schedule :portkey.aws.glue.-2017-03-31/predicate :portkey.aws.glue.-2017-03-31.create-trigger-request/description :portkey.aws.glue.-2017-03-31.create-trigger-request/start-on-creation :portkey.aws.glue.-2017-03-31.create-trigger-request/tags]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/path-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/path))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-database-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/log-stream (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[^:*]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/classifier]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/hash-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-security-configuration-response/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-security-configuration-response/created-timestamp (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-security-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.create-security-configuration-response/name :portkey.aws.glue.-2017-03-31.create-security-configuration-response/created-timestamp]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-bookmarks-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/job-bookmarks-encryption-mode :portkey.aws.glue.-2017-03-31/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/partition-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/partition))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-data-catalog-encryption-settings-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-data-catalog-encryption-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-data-catalog-encryption-settings-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/custom-patterns (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 16000)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-triggers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-triggers-request/dependent-job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-triggers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-triggers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-triggers-request/next-token :portkey.aws.glue.-2017-03-31.get-triggers-request/dependent-job-name :portkey.aws.glue.-2017-03-31.get-triggers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-configuration (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/schema-path-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-user-defined-function-request/function-input (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/user-defined-function-input))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-user-defined-function-request/database-name :portkey.aws.glue.-2017-03-31.create-user-defined-function-request/function-input] :opt-un [:portkey.aws.glue.-2017-03-31.create-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database-input/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database-input/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database-input/location-uri (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/uri))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database-input/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/database-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.database-input/name] :opt-un [:portkey.aws.glue.-2017-03-31.database-input/description :portkey.aws.glue.-2017-03-31.database-input/location-uri :portkey.aws.glue.-2017-03-31.database-input/parameters]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.start-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-partition-request/partitions-to-get (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-get-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-get-partition-request/database-name :portkey.aws.glue.-2017-03-31.batch-get-partition-request/table-name :portkey.aws.glue.-2017-03-31.batch-get-partition-request/partitions-to-get] :opt-un [:portkey.aws.glue.-2017-03-31.batch-get-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/max-concurrent-runs clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/classifier-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-table-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/table-version]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/resource-type #{"FILE" :jar :file "JAR" "ARCHIVE" :archive})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/trigger]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-version-errors (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/table-version-error))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/error-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/classification (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function/function-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function/class-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function/owner-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function/owner-type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/principal-type))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function/create-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.user-defined-function/resource-uris (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/resource-uri-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/user-defined-function (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.user-defined-function/function-name :portkey.aws.glue.-2017-03-31.user-defined-function/class-name :portkey.aws.glue.-2017-03-31.user-defined-function/owner-name :portkey.aws.glue.-2017-03-31.user-defined-function/owner-type :portkey.aws.glue.-2017-03-31.user-defined-function/create-time :portkey.aws.glue.-2017-03-31.user-defined-function/resource-uris]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.security-configuration/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.security-configuration/created-time-stamp (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/security-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.security-configuration/name :portkey.aws.glue.-2017-03-31.security-configuration/created-time-stamp :portkey.aws.glue.-2017-03-31/encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.column/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.column/type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/column-type-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.column/comment (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/comment-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/column (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.column/name] :opt-un [:portkey.aws.glue.-2017-03-31.column/type :portkey.aws.glue.-2017-03-31.column/comment]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/order-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/order))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-jobs-response/jobs :portkey.aws.glue.-2017-03-31.get-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition/values (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition/creation-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition/last-access-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/partition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.partition/values :portkey.aws.glue.-2017-03-31.partition/database-name :portkey.aws.glue.-2017-03-31.partition/table-name :portkey.aws.glue.-2017-03-31.partition/creation-time :portkey.aws.glue.-2017-03-31.partition/last-access-time :portkey.aws.glue.-2017-03-31/storage-descriptor :portkey.aws.glue.-2017-03-31.partition/parameters :portkey.aws.glue.-2017-03-31.partition/last-analyzed-time]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-security-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-security-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-security-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-security-configurations-request/max-results :portkey.aws.glue.-2017-03-31.get-security-configurations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/crawler-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/time-left-seconds (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/still-estimating (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/last-runtime-seconds (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/median-runtime-seconds (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/tables-created (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/tables-updated (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-metrics/tables-deleted (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.crawler-metrics/crawler-name :portkey.aws.glue.-2017-03-31.crawler-metrics/time-left-seconds :portkey.aws.glue.-2017-03-31.crawler-metrics/still-estimating :portkey.aws.glue.-2017-03-31.crawler-metrics/last-runtime-seconds :portkey.aws.glue.-2017-03-31.crawler-metrics/median-runtime-seconds :portkey.aws.glue.-2017-03-31.crawler-metrics/tables-created :portkey.aws.glue.-2017-03-31.crawler-metrics/tables-updated :portkey.aws.glue.-2017-03-31.crawler-metrics/tables-deleted]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/last-crawl-status #{:cancelled "SUCCEEDED" "FAILED" "CANCELLED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/parameters-map (clojure.spec.alpha/map-of :portkey.aws.glue.-2017-03-31/key-string :portkey.aws.glue.-2017-03-31/parameters-map-value))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-job-response/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.delete-job-response/job-name]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-xml-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-xml-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/classification :portkey.aws.glue.-2017-03-31.create-xml-classifier-request/name] :opt-un [:portkey.aws.glue.-2017-03-31/row-tag]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection-type #{:sftp "JDBC" "SFTP" :jdbc})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-type-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-job-run-response/job-run-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-job-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.start-job-run-response/job-run-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/zeppelin-remote-spark-interpreter-port (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/created-timestamp (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/security-group-ids (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/yarn-endpoint-address (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/subnet-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/number-of-nodes (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/availability-zone (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/status (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/vpc-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/failure-reason (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/zeppelin-remote-spark-interpreter-port :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/created-timestamp :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/security-group-ids :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/yarn-endpoint-address :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/subnet-id :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/extra-jars-s-3-path :portkey.aws.glue.-2017-03-31/role-arn :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/number-of-nodes :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/availability-zone :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/status :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/endpoint-name :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/vpc-id :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/failure-reason :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/security-configuration :portkey.aws.glue.-2017-03-31.create-dev-endpoint-response/extra-python-libs-s-3-path]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger-update/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger-update/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger-update/schedule (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger-update/actions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/action-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/trigger-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.trigger-update/name :portkey.aws.glue.-2017-03-31.trigger-update/description :portkey.aws.glue.-2017-03-31.trigger-update/schedule :portkey.aws.glue.-2017-03-31.trigger-update/actions :portkey.aws.glue.-2017-03-31/predicate]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.put-resource-policy-response/policy-hash (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/hash-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/put-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.put-resource-policy-response/policy-hash]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/trigger-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/description-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/timestamp-value clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-table-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition-value-list/values (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/partition-value-list (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.partition-value-list/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-error/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-error/job-run-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-stop-job-run-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-stop-job-run-error/job-name :portkey.aws.glue.-2017-03-31.batch-stop-job-run-error/job-run-id :portkey.aws.glue.-2017-03-31/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-job-run-request/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-job-run-request/job-run-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-job-run-request/arguments (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-job-run-request/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-job-run-request/max-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/nullable-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-job-run-request/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-job-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.start-job-run-request/job-name] :opt-un [:portkey.aws.glue.-2017-03-31.start-job-run-request/job-run-id :portkey.aws.glue.-2017-03-31.start-job-run-request/arguments :portkey.aws.glue.-2017-03-31.start-job-run-request/allocated-capacity :portkey.aws.glue.-2017-03-31/timeout :portkey.aws.glue.-2017-03-31.start-job-run-request/max-capacity :portkey.aws.glue.-2017-03-31/notification-property :portkey.aws.glue.-2017-03-31.start-job-run-request/security-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/zeppelin-remote-spark-interpreter-port (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/created-timestamp (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/security-group-ids (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/yarn-endpoint-address (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/subnet-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/private-address (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/number-of-nodes (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/last-update-status (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/availability-zone (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/status (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/public-keys (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/vpc-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/failure-reason (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/public-address (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.dev-endpoint/public-key (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dev-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.dev-endpoint/zeppelin-remote-spark-interpreter-port :portkey.aws.glue.-2017-03-31.dev-endpoint/created-timestamp :portkey.aws.glue.-2017-03-31.dev-endpoint/security-group-ids :portkey.aws.glue.-2017-03-31.dev-endpoint/yarn-endpoint-address :portkey.aws.glue.-2017-03-31.dev-endpoint/subnet-id :portkey.aws.glue.-2017-03-31.dev-endpoint/private-address :portkey.aws.glue.-2017-03-31.dev-endpoint/extra-jars-s-3-path :portkey.aws.glue.-2017-03-31/role-arn :portkey.aws.glue.-2017-03-31.dev-endpoint/number-of-nodes :portkey.aws.glue.-2017-03-31.dev-endpoint/last-update-status :portkey.aws.glue.-2017-03-31.dev-endpoint/availability-zone :portkey.aws.glue.-2017-03-31.dev-endpoint/status :portkey.aws.glue.-2017-03-31.dev-endpoint/endpoint-name :portkey.aws.glue.-2017-03-31.dev-endpoint/public-keys :portkey.aws.glue.-2017-03-31.dev-endpoint/last-modified-timestamp :portkey.aws.glue.-2017-03-31.dev-endpoint/vpc-id :portkey.aws.glue.-2017-03-31.dev-endpoint/failure-reason :portkey.aws.glue.-2017-03-31.dev-endpoint/security-configuration :portkey.aws.glue.-2017-03-31.dev-endpoint/public-address :portkey.aws.glue.-2017-03-31.dev-endpoint/extra-python-libs-s-3-path :portkey.aws.glue.-2017-03-31.dev-endpoint/public-key]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-security-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection-password-encryption/return-connection-password-encrypted (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection-password-encryption/aws-kms-key-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection-password-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.connection-password-encryption/return-connection-password-encrypted] :opt-un [:portkey.aws.glue.-2017-03-31.connection-password-encryption/aws-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/database-input] :opt-un [:portkey.aws.glue.-2017-03-31.create-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/max-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/nullable-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/arguments (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/last-modified-on (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/error-message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/error-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/predecessor-runs (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/predecessor-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/trigger-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/attempt (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/attempt-count))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/log-group-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/previous-run-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/started-on (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/completed-on (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-run/id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-run (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.job-run/allocated-capacity :portkey.aws.glue.-2017-03-31/timeout :portkey.aws.glue.-2017-03-31.job-run/max-capacity :portkey.aws.glue.-2017-03-31/execution-time :portkey.aws.glue.-2017-03-31.job-run/arguments :portkey.aws.glue.-2017-03-31.job-run/job-name :portkey.aws.glue.-2017-03-31.job-run/last-modified-on :portkey.aws.glue.-2017-03-31.job-run/error-message :portkey.aws.glue.-2017-03-31.job-run/predecessor-runs :portkey.aws.glue.-2017-03-31.job-run/trigger-name :portkey.aws.glue.-2017-03-31.job-run/attempt :portkey.aws.glue.-2017-03-31.job-run/security-configuration :portkey.aws.glue.-2017-03-31.job-run/log-group-name :portkey.aws.glue.-2017-03-31.job-run/previous-run-id :portkey.aws.glue.-2017-03-31.job-run/started-on :portkey.aws.glue.-2017-03-31/notification-property :portkey.aws.glue.-2017-03-31.job-run/completed-on :portkey.aws.glue.-2017-03-31.job-run/id :portkey.aws.glue.-2017-03-31/job-run-state]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection/last-updated-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection/creation-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection/last-updated-by (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/physical-connection-requirements :portkey.aws.glue.-2017-03-31.connection/description :portkey.aws.glue.-2017-03-31/connection-properties :portkey.aws.glue.-2017-03-31.connection/last-updated-time :portkey.aws.glue.-2017-03-31/connection-type :portkey.aws.glue.-2017-03-31.connection/creation-time :portkey.aws.glue.-2017-03-31.connection/name :portkey.aws.glue.-2017-03-31/match-criteria :portkey.aws.glue.-2017-03-31.connection/last-updated-by]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-tags-request/resource-arn (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/glue-resource-arn))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-tags-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.create-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-mapping-request/source (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-entry))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-mapping-request/sinks (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-entries))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-mapping-request/source] :opt-un [:portkey.aws.glue.-2017-03-31.get-mapping-request/sinks :portkey.aws.glue.-2017-03-31/location]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-data-catalog-encryption-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/data-catalog-encryption-settings]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-crawler-schedule-request/crawler-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-crawler-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.start-crawler-schedule-request/crawler-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.operation-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/operation-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.operation-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-stop-job-run-job-run-id-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/id-string :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-user-defined-function-request/function-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-user-defined-function-request/database-name :portkey.aws.glue.-2017-03-31.get-user-defined-function-request/function-name] :opt-un [:portkey.aws.glue.-2017-03-31.get-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/generic-map (clojure.spec.alpha/map-of :portkey.aws.glue.-2017-03-31/generic-string :portkey.aws.glue.-2017-03-31/generic-string))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-databases-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-databases-response (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/database-list] :opt-un [:portkey.aws.glue.-2017-03-31.get-databases-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-request/classifiers (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/classifier-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-request/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string-removable))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-request/targets (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-targets))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-request/schedule (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-crawler-request/configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/crawler-configuration))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-crawler-request/name] :opt-un [:portkey.aws.glue.-2017-03-31.update-crawler-request/classifiers :portkey.aws.glue.-2017-03-31/database-name :portkey.aws.glue.-2017-03-31/crawler-security-configuration :portkey.aws.glue.-2017-03-31/role :portkey.aws.glue.-2017-03-31/table-prefix :portkey.aws.glue.-2017-03-31/schema-change-policy :portkey.aws.glue.-2017-03-31.update-crawler-request/description :portkey.aws.glue.-2017-03-31.update-crawler-request/targets :portkey.aws.glue.-2017-03-31.update-crawler-request/schedule :portkey.aws.glue.-2017-03-31.update-crawler-request/configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-partition-request/partition-values (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-partition-request/database-name :portkey.aws.glue.-2017-03-31.delete-partition-request/table-name :portkey.aws.glue.-2017-03-31.delete-partition-request/partition-values] :opt-un [:portkey.aws.glue.-2017-03-31.delete-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-table-version-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/column-type-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 131072)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/user-defined-function-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/user-defined-function))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/bounded-partition-value-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/value-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/trigger-type #{"CONDITIONAL" "ON_DEMAND" "SCHEDULED" :scheduled :on-demand :conditional})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-successful-submission/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-successful-submission/job-run-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-stop-job-run-successful-submission (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-stop-job-run-successful-submission/job-name :portkey.aws.glue.-2017-03-31.batch-stop-job-run-successful-submission/job-run-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-table-version-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-table-version-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-table-version-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-table-version-request/version-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/version-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-table-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-table-version-request/database-name :portkey.aws.glue.-2017-03-31.delete-table-version-request/table-name :portkey.aws.glue.-2017-03-31.delete-table-version-request/version-id] :opt-un [:portkey.aws.glue.-2017-03-31.delete-table-version-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/total-segments-integer (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-errors (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/table-error))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/field-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-xml-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-xml-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-xml-classifier-request/name] :opt-un [:portkey.aws.glue.-2017-03-31/classification :portkey.aws.glue.-2017-03-31/row-tag]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/language #{:scala "PYTHON" :python "SCALA"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connections-list/connections (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connections-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.connections-list/connections]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/max-retries clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-crawler-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.condition/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.condition/state (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-run-state))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/logical-operator :portkey.aws.glue.-2017-03-31.condition/job-name :portkey.aws.glue.-2017-03-31.condition/state]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/schedule-state #{"SCHEDULED" "TRANSITIONING" :not-scheduled "NOT_SCHEDULED" :transitioning :scheduled})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.partition-error/partition-values (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/partition-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.partition-error/partition-values :portkey.aws.glue.-2017-03-31/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/execution-property (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/max-concurrent-runs]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-plan-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/python-script :portkey.aws.glue.-2017-03-31/scala-code]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-crawler-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-job-request/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-job-request/job-name :portkey.aws.glue.-2017-03-31/job-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection-input/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.connection-input/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.connection-input/name :portkey.aws.glue.-2017-03-31/connection-type :portkey.aws.glue.-2017-03-31/connection-properties] :opt-un [:portkey.aws.glue.-2017-03-31.connection-input/description :portkey.aws.glue.-2017-03-31/match-criteria :portkey.aws.glue.-2017-03-31/physical-connection-requirements]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-resource-policy-response/policy-in-json (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/policy-json-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-resource-policy-response/policy-hash (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/hash-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-resource-policy-response/create-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-resource-policy-response/update-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-resource-policy-response/policy-in-json :portkey.aws.glue.-2017-03-31.get-resource-policy-response/policy-hash :portkey.aws.glue.-2017-03-31.get-resource-policy-response/create-time :portkey.aws.glue.-2017-03-31.get-resource-policy-response/update-time]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-security-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/security-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-security-configuration-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-security-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-security-configuration-request/name :portkey.aws.glue.-2017-03-31/encryption-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-job-request/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.delete-job-request/job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.schedule/schedule-expression (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.schedule/state (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/schedule-state))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.schedule/schedule-expression :portkey.aws.glue.-2017-03-31.schedule/state]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/grok-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\t]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-partition-value-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/partition-value-list :min-count 0 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-table-request/tables-to-delete (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-delete-table-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-delete-table-request/database-name :portkey.aws.glue.-2017-03-31.batch-delete-table-request/tables-to-delete] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/max-capacity (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/nullable-double))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/log-uri (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/uri-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/default-arguments (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/last-modified-on (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/connections (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/connections-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/role (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/role-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/command (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-command))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job/created-on (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.job/allocated-capacity :portkey.aws.glue.-2017-03-31/timeout :portkey.aws.glue.-2017-03-31.job/max-capacity :portkey.aws.glue.-2017-03-31.job/log-uri :portkey.aws.glue.-2017-03-31.job/default-arguments :portkey.aws.glue.-2017-03-31.job/last-modified-on :portkey.aws.glue.-2017-03-31.job/connections :portkey.aws.glue.-2017-03-31.job/role :portkey.aws.glue.-2017-03-31.job/description :portkey.aws.glue.-2017-03-31.job/security-configuration :portkey.aws.glue.-2017-03-31.job/command :portkey.aws.glue.-2017-03-31/max-retries :portkey.aws.glue.-2017-03-31/execution-property :portkey.aws.glue.-2017-03-31.job/name :portkey.aws.glue.-2017-03-31.job/created-on :portkey.aws.glue.-2017-03-31/notification-property]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.delete-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.delete-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/cloud-watch-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/cloud-watch-encryption-mode :portkey.aws.glue.-2017-03-31/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/trigger]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-dataflow-graph-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/dag-nodes :portkey.aws.glue.-2017-03-31/dag-edges]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-database-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/database-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/database))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.stop-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/stop-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.stop-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-dev-endpoint-request/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-behavior #{:update-in-database "UPDATE_IN_DATABASE" :log "LOG"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-delete-partition-request/partitions-to-delete (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-delete-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.batch-delete-partition-request/database-name :portkey.aws.glue.-2017-03-31.batch-delete-partition-request/table-name :portkey.aws.glue.-2017-03-31.batch-delete-partition-request/partitions-to-delete] :opt-un [:portkey.aws.glue.-2017-03-31.batch-delete-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.catalog-import-status/import-completed (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.catalog-import-status/import-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.catalog-import-status/imported-by (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/catalog-import-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.catalog-import-status/import-completed :portkey.aws.glue.-2017-03-31.catalog-import-status/import-time :portkey.aws.glue.-2017-03-31.catalog-import-status/imported-by]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/view-expanded-text (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/update-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/created-by (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/partition-keys (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/column-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/owner (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/table-type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/table-type-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/create-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/last-access-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/retention (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table/view-original-text (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.table/name] :opt-un [:portkey.aws.glue.-2017-03-31.table/view-expanded-text :portkey.aws.glue.-2017-03-31.table/update-time :portkey.aws.glue.-2017-03-31.table/database-name :portkey.aws.glue.-2017-03-31.table/parameters :portkey.aws.glue.-2017-03-31/storage-descriptor :portkey.aws.glue.-2017-03-31.table/created-by :portkey.aws.glue.-2017-03-31.table/partition-keys :portkey.aws.glue.-2017-03-31.table/description :portkey.aws.glue.-2017-03-31.table/owner :portkey.aws.glue.-2017-03-31.table/table-type :portkey.aws.glue.-2017-03-31.table/create-time :portkey.aws.glue.-2017-03-31.table/last-access-time :portkey.aws.glue.-2017-03-31.table/retention :portkey.aws.glue.-2017-03-31.table/last-analyzed-time :portkey.aws.glue.-2017-03-31.table/view-original-text]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.concurrent-runs-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/concurrent-runs-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.concurrent-runs-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-partition-request/partition-values (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-partition-request/database-name :portkey.aws.glue.-2017-03-31.get-partition-request/table-name :portkey.aws.glue.-2017-03-31.get-partition-request/partition-values] :opt-un [:portkey.aws.glue.-2017-03-31.get-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/logical-operator #{:equals "EQUALS"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-script-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/dag-nodes :portkey.aws.glue.-2017-03-31/dag-edges :portkey.aws.glue.-2017-03-31/language]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dynamo-db-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/path]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.crawler-stopping-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/crawler-stopping-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.crawler-stopping-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/put-data-catalog-encryption-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/notification-property (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/notify-delay-after]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-jobs-response/job-names (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/job-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/list-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.list-jobs-response/job-names :portkey.aws.glue.-2017-03-31.list-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-dev-endpoints-response/dev-endpoints (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/dev-endpoint-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-get-dev-endpoints-response/dev-endpoints-not-found (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/dev-endpoint-names))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-get-dev-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-get-dev-endpoints-response/dev-endpoints :portkey.aws.glue.-2017-03-31.batch-get-dev-endpoints-response/dev-endpoints-not-found]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-table-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-connection-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-classifier-request/grok-classifier (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-grok-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-classifier-request/xml-classifier (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-xml-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-classifier-request/json-classifier (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-json-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-classifier-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.create-classifier-request/grok-classifier :portkey.aws.glue.-2017-03-31.create-classifier-request/xml-classifier :portkey.aws.glue.-2017-03-31.create-classifier-request/json-classifier]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/policy-json-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 2 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.table-error/table-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/table-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.table-error/table-name :portkey.aws.glue.-2017-03-31/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.action/job-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.action/arguments (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.action/security-configuration (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.action/job-name :portkey.aws.glue.-2017-03-31.action/arguments :portkey.aws.glue.-2017-03-31/timeout :portkey.aws.glue.-2017-03-31/notification-property :portkey.aws.glue.-2017-03-31.action/security-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-catalog-import-status-response/import-status (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-import-status))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-catalog-import-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-catalog-import-status-response/import-status]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.entity-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/entity-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.entity-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-json-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-json-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.update-json-classifier-request/name] :opt-un [:portkey.aws.glue.-2017-03-31/json-path]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/match-criteria (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/name-string :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.create-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/create-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.create-table-request/database-name :portkey.aws.glue.-2017-03-31/table-input] :opt-un [:portkey.aws.glue.-2017-03-31.create-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.predicate/conditions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/condition-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/predicate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/logical :portkey.aws.glue.-2017-03-31.predicate/conditions]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-classifier-request/grok-classifier (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-grok-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-classifier-request/xml-classifier (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-xml-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.update-classifier-request/json-classifier (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-json-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/update-classifier-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.update-classifier-request/grok-classifier :portkey.aws.glue.-2017-03-31.update-classifier-request/xml-classifier :portkey.aws.glue.-2017-03-31.update-classifier-request/json-classifier]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-database-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.get-database-request/name] :opt-un [:portkey.aws.glue.-2017-03-31.get-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/mapping-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/mapping-entry))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-delete-table-version-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/version-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dev-endpoint-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/dev-endpoint))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/reset-job-bookmark-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31/job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/tag-keys-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/tag-key :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-versions-response/table-versions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-table-versions-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-table-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-table-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-table-versions-response/table-versions :portkey.aws.glue.-2017-03-31.get-table-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connections-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connections-request/filter (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-connections-filter))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connections-request/hide-password (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connections-request/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connections-request/max-results (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-connections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.get-connections-request/catalog-id :portkey.aws.glue.-2017-03-31.get-connections-request/filter :portkey.aws.glue.-2017-03-31.get-connections-request/hide-password :portkey.aws.glue.-2017-03-31.get-connections-request/next-token :portkey.aws.glue.-2017-03-31.get-connections-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.scheduler-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/scheduler-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.scheduler-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database/location-uri (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/uri))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database/parameters (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.database/create-time (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/database (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.database/name] :opt-un [:portkey.aws.glue.-2017-03-31.database/description :portkey.aws.glue.-2017-03-31.database/location-uri :portkey.aws.glue.-2017-03-31.database/parameters :portkey.aws.glue.-2017-03-31.database/create-time]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-run-state #{:starting "TIMEOUT" :running :stopping :stopped "SUCCEEDED" "STOPPED" "STARTING" "FAILED" :timeout "STOPPING" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/glue-resource-arn))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.untag-resource-request/tags-to-remove (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tag-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.untag-resource-request/resource-arn :portkey.aws.glue.-2017-03-31.untag-resource-request/tags-to-remove] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/cloud-watch-encryption-mode #{"DISABLED" :disabled :ssekms "SSE-KMS"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/integer-flag (clojure.spec.alpha/int-in 0 1))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger/id (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger/type (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-type))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger/state (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/trigger-state))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger/description (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger/schedule (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.trigger/actions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/action-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/trigger (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.trigger/name :portkey.aws.glue.-2017-03-31.trigger/id :portkey.aws.glue.-2017-03-31.trigger/type :portkey.aws.glue.-2017-03-31.trigger/state :portkey.aws.glue.-2017-03-31.trigger/description :portkey.aws.glue.-2017-03-31.trigger/schedule :portkey.aws.glue.-2017-03-31.trigger/actions :portkey.aws.glue.-2017-03-31/predicate]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/dev-endpoint-names (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/generic-string :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.stop-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/stop-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.stop-crawler-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.glue-encryption-exception/message (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/message-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/glue-encryption-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.glue-encryption-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/connection-property-key #{:config-files :jdbc-driver-jar-uri "JDBC_CONNECTION_URL" "ENCRYPTED_PASSWORD" "USERNAME" :jdbc-engine-version :jdbc-enforce-ssl :password :jdbc-engine "INSTANCE_ID" :username "JDBC_DRIVER_JAR_URI" "CONFIG_FILES" :encrypted-password :port "JDBC_ENGINE_VERSION" "PASSWORD" :instance-id :host :jdbc-connection-url "HOST" "JDBC_ENGINE" :jdbc-driver-class-name "JDBC_ENFORCE_SSL" "PORT" "JDBC_DRIVER_CLASS_NAME"})

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.get-connections-response/next-token (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/token))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/get-connections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/connection-list :portkey.aws.glue.-2017-03-31.get-connections-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-crawler-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-stop-job-run-error-list (clojure.spec.alpha/coll-of :portkey.aws.glue.-2017-03-31/batch-stop-job-run-error))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-bookmark-entry/version (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-bookmark-entry/run (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-bookmark-entry/attempt (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.job-bookmark-entry/job-bookmark (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/json-value))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/job-bookmark-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31/job-name :portkey.aws.glue.-2017-03-31.job-bookmark-entry/version :portkey.aws.glue.-2017-03-31.job-bookmark-entry/run :portkey.aws.glue.-2017-03-31.job-bookmark-entry/attempt :portkey.aws.glue.-2017-03-31.job-bookmark-entry/job-bookmark]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/stop-crawler-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/delete-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-response/successful-submissions (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-stop-job-run-successful-submission-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.batch-stop-job-run-response/errors (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-stop-job-run-error-list))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/batch-stop-job-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.-2017-03-31.batch-stop-job-run-response/successful-submissions :portkey.aws.glue.-2017-03-31.batch-stop-job-run-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/code-gen-node-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.start-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31.start-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.-2017-03-31/start-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.-2017-03-31.start-crawler-request/name] :opt-un []))

(clojure.core/defn tag-resource "Adds tags to a resource. A tag is a label you can assign to an AWS resource. In\nAWS Glue, you can tag only certain resources. For information about what\nresources you can tag, see AWS Tags in AWS Glue\n(http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html)." ([tag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/tag-resource-response))

(clojure.core/defn get-user-defined-function "Retrieves a specified function definition from the Data Catalog." ([get-user-defined-function-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-user-defined-function-request get-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUserDefinedFunction", :http.request.configuration/output-deser-fn response-get-user-defined-function-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-user-defined-function-response))

(clojure.core/defn start-job-run "Starts a job run using a job definition." ([start-job-run-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-job-run-request start-job-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/start-job-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/start-job-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartJobRun", :http.request.configuration/output-deser-fn response-start-job-run-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "ConcurrentRunsExceededException" :portkey.aws.glue.-2017-03-31/concurrent-runs-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-job-run :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/start-job-run-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/start-job-run-response))

(clojure.core/defn delete-security-configuration "Deletes a specified security configuration." ([delete-security-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-security-configuration-request delete-security-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-security-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-security-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSecurityConfiguration", :http.request.configuration/output-deser-fn response-delete-security-configuration-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-security-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-security-configuration-response))

(clojure.core/defn get-connections "Retrieves a list of connection definitions from the Data Catalog." ([] (get-connections {})) ([get-connections-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-connections-request get-connections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-connections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-connections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConnections", :http.request.configuration/output-deser-fn response-get-connections-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-connections :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-connections-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-connections-response))

(clojure.core/defn create-trigger "Creates a new trigger." ([create-trigger-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-trigger-request create-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrigger", :http.request.configuration/output-deser-fn response-create-trigger-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "IdempotentParameterMismatchException" :portkey.aws.glue.-2017-03-31/idempotent-parameter-mismatch-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.glue.-2017-03-31/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-trigger-response))

(clojure.core/defn get-triggers "Gets all the triggers associated with a job." ([] (get-triggers {})) ([get-triggers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-triggers-request get-triggers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-triggers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-triggers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTriggers", :http.request.configuration/output-deser-fn response-get-triggers-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-triggers :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-triggers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-triggers-response))

(clojure.core/defn stop-trigger "Stops a specified trigger." ([stop-trigger-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-trigger-request stop-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/stop-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/stop-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopTrigger", :http.request.configuration/output-deser-fn response-stop-trigger-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue.-2017-03-31/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef stop-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/stop-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/stop-trigger-response))

(clojure.core/defn update-table "Updates a metadata table in the Data Catalog." ([update-table-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-table-request update-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTable", :http.request.configuration/output-deser-fn response-update-table-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue.-2017-03-31/concurrent-modification-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-table :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-table-response))

(clojure.core/defn get-jobs "Retrieves all current job definitions." ([] (get-jobs {})) ([get-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-jobs-request get-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJobs", :http.request.configuration/output-deser-fn response-get-jobs-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-jobs :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-jobs-response))

(clojure.core/defn update-partition "Updates a partition." ([update-partition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-partition-request update-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePartition", :http.request.configuration/output-deser-fn response-update-partition-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-partition-response))

(clojure.core/defn start-trigger "Starts an existing trigger. See Triggering Jobs\n(http://docs.aws.amazon.com/glue/latest/dg/trigger-job.html) for information\nabout how different types of trigger are started." ([start-trigger-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-trigger-request start-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/start-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/start-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartTrigger", :http.request.configuration/output-deser-fn response-start-trigger-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "ConcurrentRunsExceededException" :portkey.aws.glue.-2017-03-31/concurrent-runs-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/start-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/start-trigger-response))

(clojure.core/defn create-partition "Creates a new partition." ([create-partition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-partition-request create-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePartition", :http.request.configuration/output-deser-fn response-create-partition-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-partition-response))

(clojure.core/defn get-tables "Retrieves the definitions of some or all of the tables in a given Database." ([get-tables-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-tables-request get-tables-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-tables-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-tables-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTables", :http.request.configuration/output-deser-fn response-get-tables-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-tables :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-tables-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-tables-response))

(clojure.core/defn get-tags "Retrieves a list of tags associated with a resource." ([get-tags-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-tags-request get-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTags", :http.request.configuration/output-deser-fn response-get-tags-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-tags-response))

(clojure.core/defn delete-resource-policy "Deletes a specified policy." ([] (delete-resource-policy {})) ([delete-resource-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-resource-policy-request delete-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResourcePolicy", :http.request.configuration/output-deser-fn response-delete-resource-policy-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "ConditionCheckFailureException" :portkey.aws.glue.-2017-03-31/condition-check-failure-exception}})))))
(clojure.spec.alpha/fdef delete-resource-policy :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/delete-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-resource-policy-response))

(clojure.core/defn update-user-defined-function "Updates an existing function definition in the Data Catalog." ([update-user-defined-function-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-user-defined-function-request update-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserDefinedFunction", :http.request.configuration/output-deser-fn response-update-user-defined-function-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-user-defined-function-response))

(clojure.core/defn update-connection "Updates a connection definition in the Data Catalog." ([update-connection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-connection-request update-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConnection", :http.request.configuration/output-deser-fn response-update-connection-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-connection-response))

(clojure.core/defn batch-get-jobs "Returns a list of resource metadata for a given list of job names. After calling\nthe ListJobs operation, you can call this operation to access the data to which\nyou have been granted permissions. This operation supports all IAM permissions,\nincluding permission conditions that uses tags." ([batch-get-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-jobs-request batch-get-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-get-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-get-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetJobs", :http.request.configuration/output-deser-fn response-batch-get-jobs-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-jobs :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-get-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-get-jobs-response))

(clojure.core/defn get-plan "Gets code to perform a specified mapping." ([get-plan-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-plan-request get-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPlan", :http.request.configuration/output-deser-fn response-get-plan-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-plan :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-plan-response))

(clojure.core/defn batch-get-partition "Retrieves partitions in a batch request." ([batch-get-partition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-partition-request batch-get-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-get-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-get-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetPartition", :http.request.configuration/output-deser-fn response-batch-get-partition-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef batch-get-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-get-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-get-partition-response))

(clojure.core/defn batch-delete-connection "Deletes a list of connection definitions from the Data Catalog." ([batch-delete-connection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-delete-connection-request batch-delete-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-delete-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-delete-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteConnection", :http.request.configuration/output-deser-fn response-batch-delete-connection-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-delete-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-delete-connection-response))

(clojure.core/defn delete-dev-endpoint "Deletes a specified DevEndpoint." ([delete-dev-endpoint-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-dev-endpoint-request delete-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDevEndpoint", :http.request.configuration/output-deser-fn response-delete-dev-endpoint-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef delete-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-dev-endpoint-response))

(clojure.core/defn create-dev-endpoint "Creates a new DevEndpoint." ([create-dev-endpoint-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-dev-endpoint-request create-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDevEndpoint", :http.request.configuration/output-deser-fn response-create-dev-endpoint-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.glue.-2017-03-31/access-denied-exception, "AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "IdempotentParameterMismatchException" :portkey.aws.glue.-2017-03-31/idempotent-parameter-mismatch-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "ValidationException" :portkey.aws.glue.-2017-03-31/validation-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-dev-endpoint-response))

(clojure.core/defn get-dev-endpoint "Retrieves information about a specified DevEndpoint.\n When you create a development endpoint in a virtual private cloud (VPC), AWS\nGlue returns only a private IP address, and the public IP address field is not\npopulated. When you create a non-VPC development endpoint, AWS Glue returns only\na public IP address." ([get-dev-endpoint-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-dev-endpoint-request get-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDevEndpoint", :http.request.configuration/output-deser-fn response-get-dev-endpoint-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-dev-endpoint-response))

(clojure.core/defn get-crawlers "Retrieves metadata for all crawlers defined in the customer account." ([] (get-crawlers {})) ([get-crawlers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-crawlers-request get-crawlers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-crawlers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-crawlers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCrawlers", :http.request.configuration/output-deser-fn response-get-crawlers-response, :http.request.spec/error-spec {"OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-crawlers :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-crawlers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-crawlers-response))

(clojure.core/defn create-table "Creates a new table definition in the Data Catalog." ([create-table-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-table-request create-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTable", :http.request.configuration/output-deser-fn response-create-table-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-table :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-table-response))

(clojure.core/defn create-script "Transforms a directed acyclic graph (DAG) into code." ([] (create-script {})) ([create-script-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-script-request create-script-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-script-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-script-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateScript", :http.request.configuration/output-deser-fn response-create-script-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef create-script :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/create-script-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-script-response))

(clojure.core/defn get-crawler "Retrieves metadata for a specified crawler." ([get-crawler-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-crawler-request get-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCrawler", :http.request.configuration/output-deser-fn response-get-crawler-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-crawler-response))

(clojure.core/defn update-dev-endpoint "Updates a specified DevEndpoint." ([update-dev-endpoint-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-dev-endpoint-request update-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDevEndpoint", :http.request.configuration/output-deser-fn response-update-dev-endpoint-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "ValidationException" :portkey.aws.glue.-2017-03-31/validation-exception}})))))
(clojure.spec.alpha/fdef update-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-dev-endpoint-response))

(clojure.core/defn batch-delete-partition "Deletes one or more partitions in a batch operation." ([batch-delete-partition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-delete-partition-request batch-delete-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-delete-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-delete-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeletePartition", :http.request.configuration/output-deser-fn response-batch-delete-partition-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-delete-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-delete-partition-response))

(clojure.core/defn create-security-configuration "Creates a new security configuration." ([create-security-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-security-configuration-request create-security-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-security-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-security-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSecurityConfiguration", :http.request.configuration/output-deser-fn response-create-security-configuration-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-security-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-security-configuration-response))

(clojure.core/defn get-trigger "Retrieves the definition of a trigger." ([get-trigger-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-trigger-request get-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTrigger", :http.request.configuration/output-deser-fn response-get-trigger-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-trigger-response))

(clojure.core/defn stop-crawler "If the specified crawler is running, stops the crawl." ([stop-crawler-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-crawler-request stop-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/stop-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/stop-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopCrawler", :http.request.configuration/output-deser-fn response-stop-crawler-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "CrawlerNotRunningException" :portkey.aws.glue.-2017-03-31/crawler-not-running-exception, "CrawlerStoppingException" :portkey.aws.glue.-2017-03-31/crawler-stopping-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef stop-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/stop-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/stop-crawler-response))

(clojure.core/defn get-resource-policy "Retrieves a specified resource policy." ([] (get-resource-policy {})) ([get-resource-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-resource-policy-request get-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourcePolicy", :http.request.configuration/output-deser-fn response-get-resource-policy-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-resource-policy :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-resource-policy-response))

(clojure.core/defn import-catalog-to-glue "Imports an existing Athena Data Catalog to AWS Glue" ([] (import-catalog-to-glue {})) ([import-catalog-to-glue-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-import-catalog-to-glue-request import-catalog-to-glue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/import-catalog-to-glue-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/import-catalog-to-glue-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportCatalogToGlue", :http.request.configuration/output-deser-fn response-import-catalog-to-glue-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef import-catalog-to-glue :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/import-catalog-to-glue-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/import-catalog-to-glue-response))

(clojure.core/defn create-connection "Creates a connection definition in the Data Catalog." ([create-connection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-connection-request create-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConnection", :http.request.configuration/output-deser-fn response-create-connection-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-connection-response))

(clojure.core/defn update-crawler-schedule "Updates the schedule of a crawler using a cron expression." ([update-crawler-schedule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-crawler-schedule-request update-crawler-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-crawler-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-crawler-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCrawlerSchedule", :http.request.configuration/output-deser-fn response-update-crawler-schedule-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "VersionMismatchException" :portkey.aws.glue.-2017-03-31/version-mismatch-exception, "SchedulerTransitioningException" :portkey.aws.glue.-2017-03-31/scheduler-transitioning-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef update-crawler-schedule :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-crawler-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-crawler-schedule-response))

(clojure.core/defn get-job-runs "Retrieves metadata for all runs of a given job definition." ([get-job-runs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-job-runs-request get-job-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-job-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-job-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJobRuns", :http.request.configuration/output-deser-fn response-get-job-runs-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-job-runs :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-job-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-job-runs-response))

(clojure.core/defn list-dev-endpoints "Retrieves the names of all DevEndpoint resources in this AWS account, or the\nresources with the specified tag. This operation allows you to see which\nresources are available in your account, and their names.\n This operation takes the optional Tags field which you can use as a filter on\nthe response so that tagged resources can be retrieved as a group. If you choose\nto use tags filtering, only resources with the tag will be retrieved." ([] (list-dev-endpoints {})) ([list-dev-endpoints-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-dev-endpoints-request list-dev-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/list-dev-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/list-dev-endpoints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevEndpoints", :http.request.configuration/output-deser-fn response-list-dev-endpoints-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef list-dev-endpoints :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/list-dev-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/list-dev-endpoints-response))

(clojure.core/defn get-partition "Retrieves information about a specified partition." ([get-partition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-partition-request get-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPartition", :http.request.configuration/output-deser-fn response-get-partition-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-partition-response))

(clojure.core/defn get-database "Retrieves the definition of a specified database." ([get-database-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-database-request get-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDatabase", :http.request.configuration/output-deser-fn response-get-database-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-database :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-database-response))

(clojure.core/defn get-table-versions "Retrieves a list of strings that identify available versions of a specified\ntable." ([get-table-versions-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-table-versions-request get-table-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-table-versions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-table-versions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTableVersions", :http.request.configuration/output-deser-fn response-get-table-versions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-table-versions :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-table-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-table-versions-response))

(clojure.core/defn reset-job-bookmark "Resets a bookmark entry." ([reset-job-bookmark-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-reset-job-bookmark-request reset-job-bookmark-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/reset-job-bookmark-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/reset-job-bookmark-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResetJobBookmark", :http.request.configuration/output-deser-fn response-reset-job-bookmark-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef reset-job-bookmark :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/reset-job-bookmark-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/reset-job-bookmark-response))

(clojure.core/defn get-dev-endpoints "Retrieves all the DevEndpoints in this AWS account.\n When you create a development endpoint in a virtual private cloud (VPC), AWS\nGlue returns only a private IP address and the public IP address field is not\npopulated. When you create a non-VPC development endpoint, AWS Glue returns only\na public IP address." ([] (get-dev-endpoints {})) ([get-dev-endpoints-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-dev-endpoints-request get-dev-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-dev-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-dev-endpoints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDevEndpoints", :http.request.configuration/output-deser-fn response-get-dev-endpoints-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-dev-endpoints :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-dev-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-dev-endpoints-response))

(clojure.core/defn delete-table-version "Deletes a specified version of a table." ([delete-table-version-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-table-version-request delete-table-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-table-version-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-table-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTableVersion", :http.request.configuration/output-deser-fn response-delete-table-version-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-table-version :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-table-version-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-table-version-response))

(clojure.core/defn get-mapping "Creates mappings." ([get-mapping-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-mapping-request get-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-mapping-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-mapping-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMapping", :http.request.configuration/output-deser-fn response-get-mapping-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef get-mapping :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-mapping-response))

(clojure.core/defn put-resource-policy "Sets the Data Catalog resource policy for access control." ([put-resource-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-resource-policy-request put-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/put-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/put-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResourcePolicy", :http.request.configuration/output-deser-fn response-put-resource-policy-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "ConditionCheckFailureException" :portkey.aws.glue.-2017-03-31/condition-check-failure-exception}})))))
(clojure.spec.alpha/fdef put-resource-policy :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/put-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/put-resource-policy-response))

(clojure.core/defn create-database "Creates a new database in a Data Catalog." ([create-database-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-database-request create-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDatabase", :http.request.configuration/output-deser-fn response-create-database-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-database :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-database-response))

(clojure.core/defn get-data-catalog-encryption-settings "Retrieves the security configuration for a specified catalog." ([] (get-data-catalog-encryption-settings {})) ([get-data-catalog-encryption-settings-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-data-catalog-encryption-settings-request get-data-catalog-encryption-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-data-catalog-encryption-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-data-catalog-encryption-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDataCatalogEncryptionSettings", :http.request.configuration/output-deser-fn response-get-data-catalog-encryption-settings-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-data-catalog-encryption-settings :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-data-catalog-encryption-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-data-catalog-encryption-settings-response))

(clojure.core/defn batch-get-crawlers "Returns a list of resource metadata for a given list of crawler names. After\ncalling the ListCrawlers operation, you can call this operation to access the\ndata to which you have been granted permissions to based on tags." ([batch-get-crawlers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-crawlers-request batch-get-crawlers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-get-crawlers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-get-crawlers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetCrawlers", :http.request.configuration/output-deser-fn response-batch-get-crawlers-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-get-crawlers :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-get-crawlers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-get-crawlers-response))

(clojure.core/defn delete-crawler "Removes a specified crawler from the Data Catalog, unless the crawler state is\nRUNNING." ([delete-crawler-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-crawler-request delete-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCrawler", :http.request.configuration/output-deser-fn response-delete-crawler-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "CrawlerRunningException" :portkey.aws.glue.-2017-03-31/crawler-running-exception, "SchedulerTransitioningException" :portkey.aws.glue.-2017-03-31/scheduler-transitioning-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-crawler-response))

(clojure.core/defn get-catalog-import-status "Retrieves the status of a migration operation." ([] (get-catalog-import-status {})) ([get-catalog-import-status-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-catalog-import-status-request get-catalog-import-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-catalog-import-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-catalog-import-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCatalogImportStatus", :http.request.configuration/output-deser-fn response-get-catalog-import-status-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-catalog-import-status :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-catalog-import-status-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-catalog-import-status-response))

(clojure.core/defn get-dataflow-graph "Transforms a Python script into a directed acyclic graph (DAG)." ([] (get-dataflow-graph {})) ([get-dataflow-graph-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-dataflow-graph-request get-dataflow-graph-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-dataflow-graph-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-dataflow-graph-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDataflowGraph", :http.request.configuration/output-deser-fn response-get-dataflow-graph-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-dataflow-graph :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-dataflow-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-dataflow-graph-response))

(clojure.core/defn get-table "Retrieves the Table definition in a Data Catalog for a specified table." ([get-table-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-table-request get-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTable", :http.request.configuration/output-deser-fn response-get-table-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-table :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-table-response))

(clojure.core/defn create-crawler "Creates a new crawler with specified targets, role, configuration, and optional\nschedule. At least one crawl target must be specified, in the s3Targets field,\nthe jdbcTargets field, or the DynamoDBTargets field." ([create-crawler-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-crawler-request create-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCrawler", :http.request.configuration/output-deser-fn response-create-crawler-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-crawler-response))

(clojure.core/defn start-crawler-schedule "Changes the schedule state of the specified crawler to SCHEDULED, unless the\ncrawler is already running or the schedule state is already SCHEDULED." ([start-crawler-schedule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-crawler-schedule-request start-crawler-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/start-crawler-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/start-crawler-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartCrawlerSchedule", :http.request.configuration/output-deser-fn response-start-crawler-schedule-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "SchedulerRunningException" :portkey.aws.glue.-2017-03-31/scheduler-running-exception, "SchedulerTransitioningException" :portkey.aws.glue.-2017-03-31/scheduler-transitioning-exception, "NoScheduleException" :portkey.aws.glue.-2017-03-31/no-schedule-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef start-crawler-schedule :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/start-crawler-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/start-crawler-schedule-response))

(clojure.core/defn batch-delete-table "Deletes multiple tables at once.\n After completing this operation, you will no longer have access to the table\nversions and partitions that belong to the deleted table. AWS Glue deletes these\n\"orphaned\" resources asynchronously in a timely manner, at the discretion of the\nservice.\n To ensure immediate deletion of all related resources, before calling\nBatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and\nDeletePartition or BatchDeletePartition, to delete any resources that belong to\nthe table." ([batch-delete-table-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-delete-table-request batch-delete-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-delete-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-delete-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteTable", :http.request.configuration/output-deser-fn response-batch-delete-table-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-table :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-delete-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-delete-table-response))

(clojure.core/defn batch-create-partition "Creates one or more partitions in a batch operation." ([batch-create-partition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-create-partition-request batch-create-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-create-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-create-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchCreatePartition", :http.request.configuration/output-deser-fn response-batch-create-partition-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef batch-create-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-create-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-create-partition-response))

(clojure.core/defn update-crawler "Updates a crawler. If a crawler is running, you must stop it using StopCrawler\nbefore updating it." ([update-crawler-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-crawler-request update-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCrawler", :http.request.configuration/output-deser-fn response-update-crawler-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "VersionMismatchException" :portkey.aws.glue.-2017-03-31/version-mismatch-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "CrawlerRunningException" :portkey.aws.glue.-2017-03-31/crawler-running-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef update-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-crawler-response))

(clojure.core/defn delete-trigger "Deletes a specified trigger. If the trigger is not found, no exception is\nthrown." ([delete-trigger-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-trigger-request delete-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTrigger", :http.request.configuration/output-deser-fn response-delete-trigger-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue.-2017-03-31/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-trigger-response))

(clojure.core/defn list-triggers "Retrieves the names of all trigger resources in this AWS account, or the\nresources with the specified tag. This operation allows you to see which\nresources are available in your account, and their names.\n This operation takes the optional Tags field which you can use as a filter on\nthe response so that tagged resources can be retrieved as a group. If you choose\nto use tags filtering, only resources with the tag will be retrieved." ([] (list-triggers {})) ([list-triggers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-triggers-request list-triggers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/list-triggers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/list-triggers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTriggers", :http.request.configuration/output-deser-fn response-list-triggers-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef list-triggers :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/list-triggers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/list-triggers-response))

(clojure.core/defn get-user-defined-functions "Retrieves a multiple function definitions from the Data Catalog." ([get-user-defined-functions-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-user-defined-functions-request get-user-defined-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-user-defined-functions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-user-defined-functions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUserDefinedFunctions", :http.request.configuration/output-deser-fn response-get-user-defined-functions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-user-defined-functions :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-user-defined-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-user-defined-functions-response))

(clojure.core/defn get-partitions "Retrieves information about the partitions in a table." ([get-partitions-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-partitions-request get-partitions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-partitions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-partitions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPartitions", :http.request.configuration/output-deser-fn response-get-partitions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-partitions :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-partitions-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-partitions-response))

(clojure.core/defn start-crawler "Starts a crawl using the specified crawler, regardless of what is scheduled. If\nthe crawler is already running, returns a CrawlerRunningException\n(https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-exceptions.html#aws-glue-api-exceptions-CrawlerRunningException)." ([start-crawler-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-crawler-request start-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/start-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/start-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartCrawler", :http.request.configuration/output-deser-fn response-start-crawler-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "CrawlerRunningException" :portkey.aws.glue.-2017-03-31/crawler-running-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef start-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/start-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/start-crawler-response))

(clojure.core/defn get-classifiers "Lists all classifier objects in the Data Catalog." ([] (get-classifiers {})) ([get-classifiers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-classifiers-request get-classifiers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-classifiers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-classifiers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetClassifiers", :http.request.configuration/output-deser-fn response-get-classifiers-response, :http.request.spec/error-spec {"OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-classifiers :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-classifiers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-classifiers-response))

(clojure.core/defn delete-partition "Deletes a specified partition." ([delete-partition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-partition-request delete-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePartition", :http.request.configuration/output-deser-fn response-delete-partition-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-partition-response))

(clojure.core/defn get-security-configuration "Retrieves a specified security configuration." ([get-security-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-security-configuration-request get-security-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-security-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-security-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSecurityConfiguration", :http.request.configuration/output-deser-fn response-get-security-configuration-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-security-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-security-configuration-response))

(clojure.core/defn batch-delete-table-version "Deletes a specified batch of versions of a table." ([batch-delete-table-version-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-delete-table-version-request batch-delete-table-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-delete-table-version-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-delete-table-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteTableVersion", :http.request.configuration/output-deser-fn response-batch-delete-table-version-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-table-version :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-delete-table-version-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-delete-table-version-response))

(clojure.core/defn delete-connection "Deletes a connection from the Data Catalog." ([delete-connection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-connection-request delete-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConnection", :http.request.configuration/output-deser-fn response-delete-connection-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-connection-response))

(clojure.core/defn get-table-version "Retrieves a specified version of a table." ([get-table-version-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-table-version-request get-table-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-table-version-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-table-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTableVersion", :http.request.configuration/output-deser-fn response-get-table-version-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-table-version :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-table-version-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-table-version-response))

(clojure.core/defn create-job "Creates a new job definition." ([create-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-job-request create-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateJob", :http.request.configuration/output-deser-fn response-create-job-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "IdempotentParameterMismatchException" :portkey.aws.glue.-2017-03-31/idempotent-parameter-mismatch-exception, "AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.glue.-2017-03-31/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-job-response))

(clojure.core/defn untag-resource "Removes tags from a resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/untag-resource-response))

(clojure.core/defn delete-job "Deletes a specified job definition. If the job definition is not found, no\nexception is thrown." ([delete-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-job-request delete-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteJob", :http.request.configuration/output-deser-fn response-delete-job-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-job :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-job-response))

(clojure.core/defn batch-get-triggers "Returns a list of resource metadata for a given list of trigger names. After\ncalling the ListTriggers operation, you can call this operation to access the\ndata to which you have been granted permissions. This operation supports all IAM\npermissions, including permission conditions that uses tags." ([batch-get-triggers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-triggers-request batch-get-triggers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-get-triggers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-get-triggers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetTriggers", :http.request.configuration/output-deser-fn response-batch-get-triggers-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-triggers :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-get-triggers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-get-triggers-response))

(clojure.core/defn delete-classifier "Removes a classifier from the Data Catalog." ([delete-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-classifier-request delete-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteClassifier", :http.request.configuration/output-deser-fn response-delete-classifier-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-classifier :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-classifier-response))

(clojure.core/defn get-job "Retrieves an existing job definition." ([get-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-job-request get-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJob", :http.request.configuration/output-deser-fn response-get-job-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-job :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-job-response))

(clojure.core/defn batch-get-dev-endpoints "Returns a list of resource metadata for a given list of DevEndpoint names. After\ncalling the ListDevEndpoints operation, you can call this operation to access\nthe data to which you have been granted permissions. This operation supports all\nIAM permissions, including permission conditions that uses tags." ([batch-get-dev-endpoints-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-dev-endpoints-request batch-get-dev-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-get-dev-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-get-dev-endpoints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetDevEndpoints", :http.request.configuration/output-deser-fn response-batch-get-dev-endpoints-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.glue.-2017-03-31/access-denied-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-dev-endpoints :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-get-dev-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-get-dev-endpoints-response))

(clojure.core/defn update-trigger "Updates a trigger definition." ([update-trigger-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-trigger-request update-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTrigger", :http.request.configuration/output-deser-fn response-update-trigger-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue.-2017-03-31/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-trigger-response))

(clojure.core/defn delete-database "Removes a specified Database from a Data Catalog.\n After completing this operation, you will no longer have access to the tables\n(and all table versions and partitions that might belong to the tables) and the\nuser-defined functions in the deleted database. AWS Glue deletes these\n\"orphaned\" resources asynchronously in a timely manner, at the discretion of the\nservice.\n To ensure immediate deletion of all related resources, before calling\nDeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion,\nDeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and\nDeleteTable or BatchDeleteTable, to delete any resources that belong to the\ndatabase." ([delete-database-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-database-request delete-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDatabase", :http.request.configuration/output-deser-fn response-delete-database-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-database :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-database-response))

(clojure.core/defn get-crawler-metrics "Retrieves metrics about specified crawlers." ([] (get-crawler-metrics {})) ([get-crawler-metrics-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-crawler-metrics-request get-crawler-metrics-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-crawler-metrics-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-crawler-metrics-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCrawlerMetrics", :http.request.configuration/output-deser-fn response-get-crawler-metrics-response, :http.request.spec/error-spec {"OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-crawler-metrics :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-crawler-metrics-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-crawler-metrics-response))

(clojure.core/defn update-job "Updates an existing job definition." ([update-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-job-request update-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateJob", :http.request.configuration/output-deser-fn response-update-job-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue.-2017-03-31/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-job-response))

(clojure.core/defn get-job-run "Retrieves the metadata for a given job run." ([get-job-run-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-job-run-request get-job-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-job-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-job-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJobRun", :http.request.configuration/output-deser-fn response-get-job-run-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-job-run :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-job-run-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-job-run-response))

(clojure.core/defn create-user-defined-function "Creates a new function definition in the Data Catalog." ([create-user-defined-function-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-user-defined-function-request create-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUserDefinedFunction", :http.request.configuration/output-deser-fn response-create-user-defined-function-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue.-2017-03-31/resource-number-limit-exceeded-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/create-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-user-defined-function-response))

(clojure.core/defn delete-user-defined-function "Deletes an existing function definition from the Data Catalog." ([delete-user-defined-function-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-user-defined-function-request delete-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserDefinedFunction", :http.request.configuration/output-deser-fn response-delete-user-defined-function-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-user-defined-function-response))

(clojure.core/defn get-security-configurations "Retrieves a list of all security configurations." ([] (get-security-configurations {})) ([get-security-configurations-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-security-configurations-request get-security-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-security-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-security-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSecurityConfigurations", :http.request.configuration/output-deser-fn response-get-security-configurations-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-security-configurations :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-security-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-security-configurations-response))

(clojure.core/defn create-classifier "Creates a classifier in the user's account. This may be a GrokClassifier, an\nXMLClassifier, or abbrev JsonClassifier, depending on which field of the request\nis present." ([] (create-classifier {})) ([create-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-classifier-request create-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/create-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/create-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateClassifier", :http.request.configuration/output-deser-fn response-create-classifier-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue.-2017-03-31/already-exists-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef create-classifier :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/create-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/create-classifier-response))

(clojure.core/defn update-database "Updates an existing database definition in a Data Catalog." ([update-database-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-database-request update-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDatabase", :http.request.configuration/output-deser-fn response-update-database-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-database :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/update-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-database-response))

(clojure.core/defn get-connection "Retrieves a connection definition from the Data Catalog." ([get-connection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-connection-request get-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConnection", :http.request.configuration/output-deser-fn response-get-connection-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-connection-response))

(clojure.core/defn put-data-catalog-encryption-settings "Sets the security configuration for a specified catalog. After the configuration\nhas been set, the specified encryption is applied to every catalog write\nthereafter." ([put-data-catalog-encryption-settings-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-data-catalog-encryption-settings-request put-data-catalog-encryption-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/put-data-catalog-encryption-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/put-data-catalog-encryption-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutDataCatalogEncryptionSettings", :http.request.configuration/output-deser-fn response-put-data-catalog-encryption-settings-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef put-data-catalog-encryption-settings :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/put-data-catalog-encryption-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/put-data-catalog-encryption-settings-response))

(clojure.core/defn stop-crawler-schedule "Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not\nstop the crawler if it is already running." ([stop-crawler-schedule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-crawler-schedule-request stop-crawler-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/stop-crawler-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/stop-crawler-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopCrawlerSchedule", :http.request.configuration/output-deser-fn response-stop-crawler-schedule-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "SchedulerNotRunningException" :portkey.aws.glue.-2017-03-31/scheduler-not-running-exception, "SchedulerTransitioningException" :portkey.aws.glue.-2017-03-31/scheduler-transitioning-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef stop-crawler-schedule :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/stop-crawler-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/stop-crawler-schedule-response))

(clojure.core/defn update-classifier "Modifies an existing classifier (a GrokClassifier, XMLClassifier, or\nJsonClassifier, depending on which field is present)." ([] (update-classifier {})) ([update-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-classifier-request update-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/update-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/update-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateClassifier", :http.request.configuration/output-deser-fn response-update-classifier-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "VersionMismatchException" :portkey.aws.glue.-2017-03-31/version-mismatch-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef update-classifier :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/update-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/update-classifier-response))

(clojure.core/defn get-databases "Retrieves all Databases defined in a given Data Catalog." ([] (get-databases {})) ([get-databases-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-databases-request get-databases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-databases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-databases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDatabases", :http.request.configuration/output-deser-fn response-get-databases-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue.-2017-03-31/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-databases :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/get-databases-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-databases-response))

(clojure.core/defn batch-stop-job-run "Stops one or more job runs for a specified job definition." ([batch-stop-job-run-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-stop-job-run-request batch-stop-job-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/batch-stop-job-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/batch-stop-job-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchStopJobRun", :http.request.configuration/output-deser-fn response-batch-stop-job-run-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-stop-job-run :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/batch-stop-job-run-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/batch-stop-job-run-response))

(clojure.core/defn list-jobs "Retrieves the names of all job resources in this AWS account, or the resources\nwith the specified tag. This operation allows you to see which resources are\navailable in your account, and their names.\n This operation takes the optional Tags field which you can use as a filter on\nthe response so that tagged resources can be retrieved as a group. If you choose\nto use tags filtering, only resources with the tag will be retrieved." ([] (list-jobs {})) ([list-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/list-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/list-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/list-jobs-response))

(clojure.core/defn delete-table "Removes a table definition from the Data Catalog.\n After completing this operation, you will no longer have access to the table\nversions and partitions that belong to the deleted table. AWS Glue deletes these\n\"orphaned\" resources asynchronously in a timely manner, at the discretion of the\nservice.\n To ensure immediate deletion of all related resources, before calling\nDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and\nDeletePartition or BatchDeletePartition, to delete any resources that belong to\nthe table." ([delete-table-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-table-request delete-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/delete-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/delete-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTable", :http.request.configuration/output-deser-fn response-delete-table-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue.-2017-03-31/invalid-input-exception, "InternalServiceException" :portkey.aws.glue.-2017-03-31/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-table :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/delete-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/delete-table-response))

(clojure.core/defn get-classifier "Retrieve a classifier by name." ([get-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-classifier-request get-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/get-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/get-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetClassifier", :http.request.configuration/output-deser-fn response-get-classifier-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue.-2017-03-31/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-classifier :args (clojure.spec.alpha/tuple :portkey.aws.glue.-2017-03-31/get-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/get-classifier-response))

(clojure.core/defn list-crawlers "Retrieves the names of all crawler resources in this AWS account, or the\nresources with the specified tag. This operation allows you to see which\nresources are available in your account, and their names.\n This operation takes the optional Tags field which you can use as a filter on\nthe response so that tagged resources can be retrieved as a group. If you choose\nto use tags filtering, only resources with the tag will be retrieved." ([] (list-crawlers {})) ([list-crawlers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-crawlers-request list-crawlers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.glue.-2017-03-31/endpoints, :http.request.configuration/target-prefix "AWSGlue", :http.request.spec/output-spec :portkey.aws.glue.-2017-03-31/list-crawlers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue.-2017-03-31/list-crawlers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCrawlers", :http.request.configuration/output-deser-fn response-list-crawlers-response, :http.request.spec/error-spec {"OperationTimeoutException" :portkey.aws.glue.-2017-03-31/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef list-crawlers :args (clojure.spec.alpha/? :portkey.aws.glue.-2017-03-31/list-crawlers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue.-2017-03-31/list-crawlers-response))
