(ns portkey.aws.glue (:require [portkey.aws]))

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

(clojure.core/declare ser-action-list)

(clojure.core/declare ser-format-string)

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

(clojure.core/declare ser-segment)

(clojure.core/declare ser-column-values-string)

(clojure.core/declare ser-schema-change-policy)

(clojure.core/declare ser-job-bookmarks-encryption-mode)

(clojure.core/declare ser-ser-de-info)

(clojure.core/declare ser-code-gen-arg-value)

(clojure.core/declare ser-id-string)

(clojure.core/declare ser-batch-delete-partition-value-list)

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

(clojure.core/declare ser-table-type-string)

(clojure.core/declare ser-trigger-update)

(clojure.core/declare ser-description-string)

(clojure.core/declare ser-partition-value-list)

(clojure.core/declare ser-uri)

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

(clojure.core/declare ser-notification-property)

(clojure.core/declare ser-batch-delete-table-name-list)

(clojure.core/declare ser-delete-connection-name-list)

(clojure.core/declare ser-action)

(clojure.core/declare ser-token)

(clojure.core/declare ser-update-json-classifier-request)

(clojure.core/declare ser-match-criteria)

(clojure.core/declare ser-predicate)

(clojure.core/declare ser-mapping-list)

(clojure.core/declare ser-batch-delete-table-version-list)

(clojure.core/declare ser-job-run-state)

(clojure.core/declare ser-cloud-watch-encryption-mode)

(clojure.core/declare ser-integer-flag)

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

(clojure.core/defn- ser-action-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action coll) #:http.request.field{:shape "Action"}))) input), :shape "ActionList", :type "list"})

(clojure.core/defn- ser-format-string [input] #:http.request.field{:value input, :shape "FormatString"})

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

(clojure.core/defn- ser-job-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobUpdate", :type "structure"} (clojure.core/contains? input :allocated-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :allocated-capacity)) #:http.request.field{:name "AllocatedCapacity", :shape "IntegerValue"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :log-uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri-string (input :log-uri)) #:http.request.field{:name "LogUri", :shape "UriString"})) (clojure.core/contains? input :default-arguments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :default-arguments)) #:http.request.field{:name "DefaultArguments", :shape "GenericMap"})) (clojure.core/contains? input :connections) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connections-list (input :connections)) #:http.request.field{:name "Connections", :shape "ConnectionsList"})) (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-string (input :role)) #:http.request.field{:name "Role", :shape "RoleString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-command (input :command)) #:http.request.field{:name "Command", :shape "JobCommand"})) (clojure.core/contains? input :max-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-retries (input :max-retries)) #:http.request.field{:name "MaxRetries", :shape "MaxRetries"})) (clojure.core/contains? input :execution-property) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-property (input :execution-property)) #:http.request.field{:name "ExecutionProperty", :shape "ExecutionProperty"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"}))))

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

(clojure.core/defn- ser-segment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-negative-integer (:segment-number input)) #:http.request.field{:name "SegmentNumber", :shape "NonNegativeInteger"}) (clojure.core/into (ser-total-segments-integer (:total-segments input)) #:http.request.field{:name "TotalSegments", :shape "TotalSegmentsInteger"})], :shape "Segment", :type "structure"}))

(clojure.core/defn- ser-column-values-string [input] #:http.request.field{:value input, :shape "ColumnValuesString"})

(clojure.core/defn- ser-schema-change-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SchemaChangePolicy", :type "structure"} (clojure.core/contains? input :update-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-behavior (input :update-behavior)) #:http.request.field{:name "UpdateBehavior", :shape "UpdateBehavior"})) (clojure.core/contains? input :delete-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-behavior (input :delete-behavior)) #:http.request.field{:name "DeleteBehavior", :shape "DeleteBehavior"}))))

(clojure.core/defn- ser-job-bookmarks-encryption-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "CSE-KMS" "CSE-KMS", :csekms "CSE-KMS"} input), :shape "JobBookmarksEncryptionMode"})

(clojure.core/defn- ser-ser-de-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SerDeInfo", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})) (clojure.core/contains? input :serialization-library) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :serialization-library)) #:http.request.field{:name "SerializationLibrary", :shape "NameString"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"}))))

(clojure.core/defn- ser-code-gen-arg-value [input] #:http.request.field{:value input, :shape "CodeGenArgValue"})

(clojure.core/defn- ser-id-string [input] #:http.request.field{:value input, :shape "IdString"})

(clojure.core/defn- ser-batch-delete-partition-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-partition-value-list coll) #:http.request.field{:shape "PartitionValueList"}))) input), :shape "BatchDeletePartitionValueList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-table-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "TableInput", :type "structure"} (clojure.core/contains? input :view-expanded-text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-view-text-string (input :view-expanded-text)) #:http.request.field{:name "ViewExpandedText", :shape "ViewTextString"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"})) (clojure.core/contains? input :storage-descriptor) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-descriptor (input :storage-descriptor)) #:http.request.field{:name "StorageDescriptor", :shape "StorageDescriptor"})) (clojure.core/contains? input :partition-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-column-list (input :partition-keys)) #:http.request.field{:name "PartitionKeys", :shape "ColumnList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :owner)) #:http.request.field{:name "Owner", :shape "NameString"})) (clojure.core/contains? input :table-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-type-string (input :table-type)) #:http.request.field{:name "TableType", :shape "TableTypeString"})) (clojure.core/contains? input :last-access-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-access-time)) #:http.request.field{:name "LastAccessTime", :shape "Timestamp"})) (clojure.core/contains? input :retention) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-negative-integer (input :retention)) #:http.request.field{:name "Retention", :shape "NonNegativeInteger"})) (clojure.core/contains? input :last-analyzed-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-analyzed-time)) #:http.request.field{:name "LastAnalyzedTime", :shape "Timestamp"})) (clojure.core/contains? input :view-original-text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-view-text-string (input :view-original-text)) #:http.request.field{:name "ViewOriginalText", :shape "ViewTextString"}))))

(clojure.core/defn- ser-integer-value [input] #:http.request.field{:value input, :shape "IntegerValue"})

(clojure.core/defn- ser-skewed-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SkewedInfo", :type "structure"} (clojure.core/contains? input :skewed-column-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string-list (input :skewed-column-names)) #:http.request.field{:name "SkewedColumnNames", :shape "NameStringList"})) (clojure.core/contains? input :skewed-column-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-column-value-string-list (input :skewed-column-values)) #:http.request.field{:name "SkewedColumnValues", :shape "ColumnValueStringList"})) (clojure.core/contains? input :skewed-column-value-location-maps) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-map (input :skewed-column-value-location-maps)) #:http.request.field{:name "SkewedColumnValueLocationMaps", :shape "LocationMap"}))))

(clojure.core/defn- ser-data-catalog-encryption-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataCatalogEncryptionSettings", :type "structure"} (clojure.core/contains? input :encryption-at-rest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-at-rest (input :encryption-at-rest)) #:http.request.field{:name "EncryptionAtRest", :shape "EncryptionAtRest"}))))

(clojure.core/defn- ser-connection-properties [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-connection-property-key k) #:http.request.field{:map-info "key", :shape "ConnectionPropertyKey"}) (clojure.core/into (ser-value-string v) #:http.request.field{:map-info "value", :shape "ValueString"})])) input), :shape "ConnectionProperties", :type "map", :max 100, :min 0})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-s-3-encryption-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-s-3-encryption coll) #:http.request.field{:shape "S3Encryption"}))) input), :shape "S3EncryptionList", :type "list"})

(clojure.core/defn- ser-name-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "NameStringList", :type "list"})

(clojure.core/defn- ser-partition-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PartitionInput", :type "structure"} (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value-string-list (input :values)) #:http.request.field{:name "Values", :shape "ValueStringList"})) (clojure.core/contains? input :last-access-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-access-time)) #:http.request.field{:name "LastAccessTime", :shape "Timestamp"})) (clojure.core/contains? input :storage-descriptor) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-descriptor (input :storage-descriptor)) #:http.request.field{:name "StorageDescriptor", :shape "StorageDescriptor"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "ParametersMap"})) (clojure.core/contains? input :last-analyzed-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-analyzed-time)) #:http.request.field{:name "LastAnalyzedTime", :shape "Timestamp"}))))

(clojure.core/defn- ser-path-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-path coll) #:http.request.field{:shape "Path"}))) input), :shape "PathList", :type "list"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-name-string [input] #:http.request.field{:value input, :shape "NameString"})

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

(clojure.core/defn- ser-table-type-string [input] #:http.request.field{:value input, :shape "TableTypeString"})

(clojure.core/defn- ser-trigger-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TriggerUpdate", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :schedule)) #:http.request.field{:name "Schedule", :shape "GenericString"})) (clojure.core/contains? input :actions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-list (input :actions)) #:http.request.field{:name "Actions", :shape "ActionList"})) (clojure.core/contains? input :predicate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predicate (input :predicate)) #:http.request.field{:name "Predicate", :shape "Predicate"}))))

(clojure.core/defn- ser-description-string [input] #:http.request.field{:value input, :shape "DescriptionString"})

(clojure.core/defn- ser-partition-value-list [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-value-string-list (:values input)) #:http.request.field{:name "Values", :shape "ValueStringList"})], :shape "PartitionValueList", :type "structure"}))

(clojure.core/defn- ser-uri [input] #:http.request.field{:value input, :shape "URI"})

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

(clojure.core/defn- ser-notification-property [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotificationProperty", :type "structure"} (clojure.core/contains? input :notify-delay-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notify-delay-after (input :notify-delay-after)) #:http.request.field{:name "NotifyDelayAfter", :shape "NotifyDelayAfter"}))))

(clojure.core/defn- ser-batch-delete-table-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "BatchDeleteTableNameList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-delete-connection-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "DeleteConnectionNameList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Action", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})) (clojure.core/contains? input :arguments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :arguments)) #:http.request.field{:name "Arguments", :shape "GenericMap"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"}))))

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-update-json-classifier-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name-string (:name input)) #:http.request.field{:name "Name", :shape "NameString"})], :shape "UpdateJsonClassifierRequest", :type "structure"} (clojure.core/contains? input :json-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-path (input :json-path)) #:http.request.field{:name "JsonPath", :shape "JsonPath"}))))

(clojure.core/defn- ser-match-criteria [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name-string coll) #:http.request.field{:shape "NameString"}))) input), :shape "MatchCriteria", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-predicate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Predicate", :type "structure"} (clojure.core/contains? input :logical) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logical (input :logical)) #:http.request.field{:name "Logical", :shape "Logical"})) (clojure.core/contains? input :conditions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-list (input :conditions)) #:http.request.field{:name "Conditions", :shape "ConditionList"}))))

(clojure.core/defn- ser-mapping-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mapping-entry coll) #:http.request.field{:shape "MappingEntry"}))) input), :shape "MappingList", :type "list"})

(clojure.core/defn- ser-batch-delete-table-version-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-version-string coll) #:http.request.field{:shape "VersionString"}))) input), :shape "BatchDeleteTableVersionList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-job-run-state [input] #:http.request.field{:value (clojure.core/get {:starting "STARTING", "TIMEOUT" "TIMEOUT", :running "RUNNING", :stopping "STOPPING", :stopped "STOPPED", "SUCCEEDED" "SUCCEEDED", "STOPPED" "STOPPED", "STARTING" "STARTING", "FAILED" "FAILED", :timeout "TIMEOUT", "STOPPING" "STOPPING", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"} input), :shape "JobRunState"})

(clojure.core/defn- ser-cloud-watch-encryption-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "SSE-KMS" "SSE-KMS", :ssekms "SSE-KMS"} input), :shape "CloudWatchEncryptionMode"})

(clojure.core/defn- ser-integer-flag [input] #:http.request.field{:value input, :shape "IntegerFlag"})

(clojure.core/defn- ser-connection-property-key [input] #:http.request.field{:value (clojure.core/get {:config-files "CONFIG_FILES", :jdbc-driver-jar-uri "JDBC_DRIVER_JAR_URI", "JDBC_CONNECTION_URL" "JDBC_CONNECTION_URL", "USERNAME" "USERNAME", :jdbc-engine-version "JDBC_ENGINE_VERSION", :jdbc-enforce-ssl "JDBC_ENFORCE_SSL", :password "PASSWORD", :jdbc-engine "JDBC_ENGINE", "INSTANCE_ID" "INSTANCE_ID", :username "USERNAME", "JDBC_DRIVER_JAR_URI" "JDBC_DRIVER_JAR_URI", "CONFIG_FILES" "CONFIG_FILES", :port "PORT", "JDBC_ENGINE_VERSION" "JDBC_ENGINE_VERSION", "PASSWORD" "PASSWORD", :instance-id "INSTANCE_ID", :host "HOST", :jdbc-connection-url "JDBC_CONNECTION_URL", "HOST" "HOST", "JDBC_ENGINE" "JDBC_ENGINE", :jdbc-driver-class-name "JDBC_DRIVER_CLASS_NAME", "JDBC_ENFORCE_SSL" "JDBC_ENFORCE_SSL", "PORT" "PORT", "JDBC_DRIVER_CLASS_NAME" "JDBC_DRIVER_CLASS_NAME"} input), :shape "ConnectionPropertyKey"})

(clojure.core/defn- ser-code-gen-node-type [input] #:http.request.field{:value input, :shape "CodeGenNodeType"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-get-crawlers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-get-table-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-string (input :version-id)) #:http.request.field{:name "VersionId", :shape "VersionString"}))))

(clojure.core/defn- req-get-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-stop-crawler-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :crawler-name)) #:http.request.field{:name "CrawlerName", :shape "NameString"})]}))

(clojure.core/defn- req-delete-database-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-dev-endpoints-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-batch-delete-table-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-batch-delete-table-version-list (input :version-ids)) #:http.request.field{:name "VersionIds", :shape "BatchDeleteTableVersionList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-tables-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-string (input :expression)) #:http.request.field{:name "Expression", :shape "FilterString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-job-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"}) (clojure.core/into (ser-id-string (input :run-id)) #:http.request.field{:name "RunId", :shape "IdString"})]} (clojure.core/contains? input :predecessors-included) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-value (input :predecessors-included)) #:http.request.field{:name "PredecessorsIncluded", :shape "BooleanValue"}))))

(clojure.core/defn- req-get-job-runs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-update-database-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-database-input (input :database-input)) #:http.request.field{:name "DatabaseInput", :shape "DatabaseInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-update-dev-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "GenericString"})]} (clojure.core/contains? input :public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :public-key)) #:http.request.field{:name "PublicKey", :shape "GenericString"})) (clojure.core/contains? input :add-public-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-keys-list (input :add-public-keys)) #:http.request.field{:name "AddPublicKeys", :shape "PublicKeysList"})) (clojure.core/contains? input :delete-public-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-keys-list (input :delete-public-keys)) #:http.request.field{:name "DeletePublicKeys", :shape "PublicKeysList"})) (clojure.core/contains? input :custom-libraries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dev-endpoint-custom-libraries (input :custom-libraries)) #:http.request.field{:name "CustomLibraries", :shape "DevEndpointCustomLibraries"})) (clojure.core/contains? input :update-etl-libraries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-value (input :update-etl-libraries)) #:http.request.field{:name "UpdateEtlLibraries", :shape "BooleanValue"}))))

(clojure.core/defn- req-get-crawler-metrics-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :crawler-name-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-name-list (input :crawler-name-list)) #:http.request.field{:name "CrawlerNameList", :shape "CrawlerNameList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-get-catalog-import-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-security-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-delete-user-defined-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-classifiers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

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

(clojure.core/defn- req-get-table-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-create-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"}) (clojure.core/into (ser-database-name (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "DatabaseName"}) (clojure.core/into (ser-crawler-targets (input :targets)) #:http.request.field{:name "Targets", :shape "CrawlerTargets"})]} (clojure.core/contains? input :classifiers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-classifier-name-list (input :classifiers)) #:http.request.field{:name "Classifiers", :shape "ClassifierNameList"})) (clojure.core/contains? input :crawler-security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-security-configuration (input :crawler-security-configuration)) #:http.request.field{:name "CrawlerSecurityConfiguration", :shape "CrawlerSecurityConfiguration"})) (clojure.core/contains? input :table-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-prefix (input :table-prefix)) #:http.request.field{:name "TablePrefix", :shape "TablePrefix"})) (clojure.core/contains? input :schema-change-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-change-policy (input :schema-change-policy)) #:http.request.field{:name "SchemaChangePolicy", :shape "SchemaChangePolicy"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cron-expression (input :schedule)) #:http.request.field{:name "Schedule", :shape "CronExpression"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crawler-configuration (input :configuration)) #:http.request.field{:name "Configuration", :shape "CrawlerConfiguration"}))))

(clojure.core/defn- req-create-dev-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "GenericString"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "StringList"})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "GenericString"})) (clojure.core/contains? input :extra-jars-s-3-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :extra-jars-s-3-path)) #:http.request.field{:name "ExtraJarsS3Path", :shape "GenericString"})) (clojure.core/contains? input :number-of-nodes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :number-of-nodes)) #:http.request.field{:name "NumberOfNodes", :shape "IntegerValue"})) (clojure.core/contains? input :public-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-keys-list (input :public-keys)) #:http.request.field{:name "PublicKeys", :shape "PublicKeysList"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"})) (clojure.core/contains? input :extra-python-libs-s-3-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :extra-python-libs-s-3-path)) #:http.request.field{:name "ExtraPythonLibsS3Path", :shape "GenericString"})) (clojure.core/contains? input :public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :public-key)) #:http.request.field{:name "PublicKey", :shape "GenericString"}))))

(clojure.core/defn- req-create-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-partition-input (input :partition-input)) #:http.request.field{:name "PartitionInput", :shape "PartitionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-delete-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-update-user-defined-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NameString"}) (clojure.core/into (ser-user-defined-function-input (input :function-input)) #:http.request.field{:name "FunctionInput", :shape "UserDefinedFunctionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-update-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-table-input (input :table-input)) #:http.request.field{:name "TableInput", :shape "TableInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :skip-archive) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-nullable (input :skip-archive)) #:http.request.field{:name "SkipArchive", :shape "BooleanNullable"}))))

(clojure.core/defn- req-get-user-defined-functions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :pattern)) #:http.request.field{:name "Pattern", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-update-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-connection-input (input :connection-input)) #:http.request.field{:name "ConnectionInput", :shape "ConnectionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-dataflow-graph-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :python-script) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-python-script (input :python-script)) #:http.request.field{:name "PythonScript", :shape "PythonScript"}))))

(clojure.core/defn- req-update-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-trigger-update (input :trigger-update)) #:http.request.field{:name "TriggerUpdate", :shape "TriggerUpdate"})]}))

(clojure.core/defn- req-create-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-role-string (input :role)) #:http.request.field{:name "Role", :shape "RoleString"}) (clojure.core/into (ser-job-command (input :command)) #:http.request.field{:name "Command", :shape "JobCommand"})]} (clojure.core/contains? input :allocated-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :allocated-capacity)) #:http.request.field{:name "AllocatedCapacity", :shape "IntegerValue"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :log-uri) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri-string (input :log-uri)) #:http.request.field{:name "LogUri", :shape "UriString"})) (clojure.core/contains? input :default-arguments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :default-arguments)) #:http.request.field{:name "DefaultArguments", :shape "GenericMap"})) (clojure.core/contains? input :connections) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connections-list (input :connections)) #:http.request.field{:name "Connections", :shape "ConnectionsList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"})) (clojure.core/contains? input :max-retries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-retries (input :max-retries)) #:http.request.field{:name "MaxRetries", :shape "MaxRetries"})) (clojure.core/contains? input :execution-property) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-property (input :execution-property)) #:http.request.field{:name "ExecutionProperty", :shape "ExecutionProperty"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"}))))

(clojure.core/defn- req-get-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-delete-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-get-databases-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-partitions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predicate-string (input :expression)) #:http.request.field{:name "Expression", :shape "PredicateString"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :segment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-segment (input :segment)) #:http.request.field{:name "Segment", :shape "Segment"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-delete-table-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-get-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})]}))

(clojure.core/defn- req-create-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-trigger-type (input :type)) #:http.request.field{:name "Type", :shape "TriggerType"}) (clojure.core/into (ser-action-list (input :actions)) #:http.request.field{:name "Actions", :shape "ActionList"})]} (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :schedule)) #:http.request.field{:name "Schedule", :shape "GenericString"})) (clojure.core/contains? input :predicate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predicate (input :predicate)) #:http.request.field{:name "Predicate", :shape "Predicate"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :start-on-creation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-value (input :start-on-creation)) #:http.request.field{:name "StartOnCreation", :shape "BooleanValue"}))))

(clojure.core/defn- req-get-data-catalog-encryption-settings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-triggers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"})) (clojure.core/contains? input :dependent-job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :dependent-job-name)) #:http.request.field{:name "DependentJobName", :shape "NameString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-create-user-defined-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-user-defined-function-input (input :function-input)) #:http.request.field{:name "FunctionInput", :shape "UserDefinedFunctionInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-batch-get-partition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NameString"}) (clojure.core/into (ser-name-string (input :table-name)) #:http.request.field{:name "TableName", :shape "NameString"}) (clojure.core/into (ser-batch-get-partition-value-list (input :partitions-to-get)) #:http.request.field{:name "PartitionsToGet", :shape "BatchGetPartitionValueList"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

(clojure.core/defn- req-get-security-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-start-job-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :job-name)) #:http.request.field{:name "JobName", :shape "NameString"})]} (clojure.core/contains? input :job-run-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-string (input :job-run-id)) #:http.request.field{:name "JobRunId", :shape "IdString"})) (clojure.core/contains? input :arguments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-map (input :arguments)) #:http.request.field{:name "Arguments", :shape "GenericMap"})) (clojure.core/contains? input :allocated-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-value (input :allocated-capacity)) #:http.request.field{:name "AllocatedCapacity", :shape "IntegerValue"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :notification-property) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-property (input :notification-property)) #:http.request.field{:name "NotificationProperty", :shape "NotificationProperty"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "NameString"}))))

(clojure.core/defn- req-get-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-create-database-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-database-input (input :database-input)) #:http.request.field{:name "DatabaseInput", :shape "DatabaseInput"})]} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"}))))

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

(clojure.core/defn- req-get-connections-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-catalog-id-string (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "CatalogIdString"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-connections-filter (input :filter)) #:http.request.field{:name "Filter", :shape "GetConnectionsFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-stop-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-start-trigger-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.core/defn- req-start-crawler-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"})]}))

(clojure.spec.alpha/def :portkey.aws.glue/message-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/update-table-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/delete-behavior #{"DELETE_FROM_DATABASE" :delete-from-database :deprecate-in-database :log "DEPRECATE_IN_DATABASE" "LOG"})

(clojure.spec.alpha/def :portkey.aws.glue.get-crawlers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.get-crawlers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-crawlers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-crawlers-request/max-results :portkey.aws.glue.get-crawlers-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.get-table-version-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-version-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-version-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-version-request/version-id (clojure.spec.alpha/and :portkey.aws.glue/version-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-table-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-table-version-request/database-name :portkey.aws.glue.get-table-version-request/table-name] :opt-un [:portkey.aws.glue.get-table-version-request/catalog-id :portkey.aws.glue.get-table-version-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.glue/get-table-versions-list (clojure.spec.alpha/coll-of :portkey.aws.glue/table-version))

(clojure.spec.alpha/def :portkey.aws.glue/get-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/job]))

(clojure.spec.alpha/def :portkey.aws.glue.crawler-targets/s-3-targets (clojure.spec.alpha/and :portkey.aws.glue/s-3-target-list))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-targets/jdbc-targets (clojure.spec.alpha/and :portkey.aws.glue/jdbc-target-list))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-targets/dynamo-db-targets (clojure.spec.alpha/and :portkey.aws.glue/dynamo-db-target-list))
(clojure.spec.alpha/def :portkey.aws.glue/crawler-targets (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.crawler-targets/s-3-targets :portkey.aws.glue.crawler-targets/jdbc-targets :portkey.aws.glue.crawler-targets/dynamo-db-targets]))

(clojure.spec.alpha/def :portkey.aws.glue/catalog-entries (clojure.spec.alpha/coll-of :portkey.aws.glue/catalog-entry))

(clojure.spec.alpha/def :portkey.aws.glue.grok-classifier/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.grok-classifier/creation-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.grok-classifier/last-updated (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.grok-classifier/version (clojure.spec.alpha/and :portkey.aws.glue/version-id))
(clojure.spec.alpha/def :portkey.aws.glue/grok-classifier (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.grok-classifier/name :portkey.aws.glue/classification :portkey.aws.glue/grok-pattern] :opt-un [:portkey.aws.glue.grok-classifier/creation-time :portkey.aws.glue.grok-classifier/last-updated :portkey.aws.glue.grok-classifier/version :portkey.aws.glue/custom-patterns]))

(clojure.spec.alpha/def :portkey.aws.glue.get-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-crawler-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/message-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/non-negative-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.glue/get-table-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/table]))

(clojure.spec.alpha/def :portkey.aws.glue.stop-crawler-schedule-request/crawler-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/stop-crawler-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.stop-crawler-schedule-request/crawler-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/principal-type #{:role "USER" :group "ROLE" :user "GROUP"})

(clojure.spec.alpha/def :portkey.aws.glue/parameters-map-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512000))))

(clojure.spec.alpha/def :portkey.aws.glue/string-list (clojure.spec.alpha/coll-of :portkey.aws.glue/generic-string))

(clojure.spec.alpha/def :portkey.aws.glue/table-list (clojure.spec.alpha/coll-of :portkey.aws.glue/table))

(clojure.spec.alpha/def :portkey.aws.glue/predecessor-list (clojure.spec.alpha/coll-of :portkey.aws.glue/predecessor))

(clojure.spec.alpha/def :portkey.aws.glue.code-gen-node-arg/name (clojure.spec.alpha/and :portkey.aws.glue/code-gen-arg-name))
(clojure.spec.alpha/def :portkey.aws.glue.code-gen-node-arg/value (clojure.spec.alpha/and :portkey.aws.glue/code-gen-arg-value))
(clojure.spec.alpha/def :portkey.aws.glue.code-gen-node-arg/param (clojure.spec.alpha/and :portkey.aws.glue/boolean))
(clojure.spec.alpha/def :portkey.aws.glue/code-gen-node-arg (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.code-gen-node-arg/name :portkey.aws.glue.code-gen-node-arg/value] :opt-un [:portkey.aws.glue.code-gen-node-arg/param]))

(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-response/partitions (clojure.spec.alpha/and :portkey.aws.glue/partition-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-partitions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-partitions-response/partitions :portkey.aws.glue.get-partitions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.order/column (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.order/sort-order (clojure.spec.alpha/and :portkey.aws.glue/integer-flag))
(clojure.spec.alpha/def :portkey.aws.glue/order (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.order/column :portkey.aws.glue.order/sort-order] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/jdbc-target-list (clojure.spec.alpha/coll-of :portkey.aws.glue/jdbc-target))

(clojure.spec.alpha/def :portkey.aws.glue.s-3-target/exclusions (clojure.spec.alpha/and :portkey.aws.glue/path-list))
(clojure.spec.alpha/def :portkey.aws.glue/s-3-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/path :portkey.aws.glue.s-3-target/exclusions]))

(clojure.spec.alpha/def :portkey.aws.glue/value-string-list (clojure.spec.alpha/coll-of :portkey.aws.glue/value-string))

(clojure.spec.alpha/def :portkey.aws.glue.create-json-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-json-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-json-classifier-request/name :portkey.aws.glue/json-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.crawler-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/crawler-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.crawler-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/connection-list (clojure.spec.alpha/coll-of :portkey.aws.glue/connection))

(clojure.spec.alpha/def :portkey.aws.glue.delete-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-database-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-database-request/name] :opt-un [:portkey.aws.glue.delete-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/notify-delay-after (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.glue/delete-database-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function-input/function-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function-input/class-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function-input/owner-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function-input/owner-type (clojure.spec.alpha/and :portkey.aws.glue/principal-type))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function-input/resource-uris (clojure.spec.alpha/and :portkey.aws.glue/resource-uri-list))
(clojure.spec.alpha/def :portkey.aws.glue/user-defined-function-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.user-defined-function-input/function-name :portkey.aws.glue.user-defined-function-input/class-name :portkey.aws.glue.user-defined-function-input/owner-name :portkey.aws.glue.user-defined-function-input/owner-type :portkey.aws.glue.user-defined-function-input/resource-uris]))

(clojure.spec.alpha/def :portkey.aws.glue/boolean-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glue/classifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/grok-classifier :portkey.aws.glue/xml-classifier :portkey.aws.glue/json-classifier]))

(clojure.spec.alpha/def :portkey.aws.glue.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.get-dev-endpoints-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.get-dev-endpoints-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-dev-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-dev-endpoints-request/max-results :portkey.aws.glue.get-dev-endpoints-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.no-schedule-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/no-schedule-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.no-schedule-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/delete-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/resource-uri-list (clojure.spec.alpha/coll-of :portkey.aws.glue/resource-uri :min-count 0 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.glue.validation-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/crawler-metrics-list (clojure.spec.alpha/coll-of :portkey.aws.glue/crawler-metrics))

(clojure.spec.alpha/def :portkey.aws.glue/role-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-version-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-version-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-version-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-version-request/version-ids (clojure.spec.alpha/and :portkey.aws.glue/batch-delete-table-version-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-table-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.batch-delete-table-version-request/database-name :portkey.aws.glue.batch-delete-table-version-request/table-name :portkey.aws.glue.batch-delete-table-version-request/version-ids] :opt-un [:portkey.aws.glue.batch-delete-table-version-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.get-tables-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-tables-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-tables-request/expression (clojure.spec.alpha/and :portkey.aws.glue/filter-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-tables-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue.get-tables-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-tables-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-tables-request/database-name] :opt-un [:portkey.aws.glue.get-tables-request/catalog-id :portkey.aws.glue.get-tables-request/expression :portkey.aws.glue.get-tables-request/next-token :portkey.aws.glue.get-tables-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue/update-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.version-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/version-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.version-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/public-keys-list (clojure.spec.alpha/coll-of :portkey.aws.glue/generic-string :max-count 5))

(clojure.spec.alpha/def :portkey.aws.glue/job-list (clojure.spec.alpha/coll-of :portkey.aws.glue/job))

(clojure.spec.alpha/def :portkey.aws.glue.encryption-at-rest/sse-aws-kms-key-id (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/encryption-at-rest (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/catalog-encryption-mode] :opt-un [:portkey.aws.glue.encryption-at-rest/sse-aws-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.glue.get-job-run-request/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-job-run-request/run-id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-job-run-request/predecessors-included (clojure.spec.alpha/and :portkey.aws.glue/boolean-value))
(clojure.spec.alpha/def :portkey.aws.glue/get-job-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-job-run-request/job-name :portkey.aws.glue.get-job-run-request/run-id] :opt-un [:portkey.aws.glue.get-job-run-request/predecessors-included]))

(clojure.spec.alpha/def :portkey.aws.glue/page-size (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.glue/code-gen-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Za-z_][A-Za-z0-9_]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/delete-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/s-3-target-list (clojure.spec.alpha/coll-of :portkey.aws.glue/s-3-target))

(clojure.spec.alpha/def :portkey.aws.glue.get-job-runs-request/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-job-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-job-runs-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-job-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-job-runs-request/job-name] :opt-un [:portkey.aws.glue.get-job-runs-request/next-token :portkey.aws.glue.get-job-runs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.update-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-database-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-database-request/name :portkey.aws.glue/database-input] :opt-un [:portkey.aws.glue.update-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/timeout (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.glue.encryption-configuration/s-3-encryption (clojure.spec.alpha/and :portkey.aws.glue/s-3-encryption-list))
(clojure.spec.alpha/def :portkey.aws.glue/encryption-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.encryption-configuration/s-3-encryption :portkey.aws.glue/cloud-watch-encryption :portkey.aws.glue/job-bookmarks-encryption]))

(clojure.spec.alpha/def :portkey.aws.glue/column-list (clojure.spec.alpha/coll-of :portkey.aws.glue/column))

(clojure.spec.alpha/def :portkey.aws.glue/non-negative-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.glue.update-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-dev-endpoint-request/public-key (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-dev-endpoint-request/add-public-keys (clojure.spec.alpha/and :portkey.aws.glue/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.update-dev-endpoint-request/delete-public-keys (clojure.spec.alpha/and :portkey.aws.glue/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.update-dev-endpoint-request/custom-libraries (clojure.spec.alpha/and :portkey.aws.glue/dev-endpoint-custom-libraries))
(clojure.spec.alpha/def :portkey.aws.glue.update-dev-endpoint-request/update-etl-libraries (clojure.spec.alpha/and :portkey.aws.glue/boolean-value))
(clojure.spec.alpha/def :portkey.aws.glue/update-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-dev-endpoint-request/endpoint-name] :opt-un [:portkey.aws.glue.update-dev-endpoint-request/public-key :portkey.aws.glue.update-dev-endpoint-request/add-public-keys :portkey.aws.glue.update-dev-endpoint-request/delete-public-keys :portkey.aws.glue.update-dev-endpoint-request/custom-libraries :portkey.aws.glue.update-dev-endpoint-request/update-etl-libraries]))

(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-functions-response/user-defined-functions (clojure.spec.alpha/and :portkey.aws.glue/user-defined-function-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-functions-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-user-defined-functions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-user-defined-functions-response/user-defined-functions :portkey.aws.glue.get-user-defined-functions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue/job-run-list (clojure.spec.alpha/coll-of :portkey.aws.glue/job-run))

(clojure.spec.alpha/def :portkey.aws.glue/boolean-nullable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glue/attempt-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue/execution-time clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue/database-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/location-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2056)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/partition-input-list (clojure.spec.alpha/coll-of :portkey.aws.glue/partition-input :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue.batch-get-partition-response/partitions (clojure.spec.alpha/and :portkey.aws.glue/partition-list))
(clojure.spec.alpha/def :portkey.aws.glue.batch-get-partition-response/unprocessed-keys (clojure.spec.alpha/and :portkey.aws.glue/batch-get-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-get-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-get-partition-response/partitions :portkey.aws.glue.batch-get-partition-response/unprocessed-keys]))

(clojure.spec.alpha/def :portkey.aws.glue.update-job-response/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.update-job-response/job-name]))

(clojure.spec.alpha/def :portkey.aws.glue/reset-job-bookmark-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/job-bookmark-entry]))

(clojure.spec.alpha/def :portkey.aws.glue/action-list (clojure.spec.alpha/coll-of :portkey.aws.glue/action))

(clojure.spec.alpha/def :portkey.aws.glue/delete-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/format-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/create-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/version-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue/code-gen-node-args (clojure.spec.alpha/coll-of :portkey.aws.glue/code-gen-node-arg :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.glue/path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint-custom-libraries/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint-custom-libraries/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/dev-endpoint-custom-libraries (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.dev-endpoint-custom-libraries/extra-python-libs-s-3-path :portkey.aws.glue.dev-endpoint-custom-libraries/extra-jars-s-3-path]))

(clojure.spec.alpha/def :portkey.aws.glue.get-crawler-metrics-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.get-crawler-metrics-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-crawler-metrics-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/crawler-name-list :portkey.aws.glue.get-crawler-metrics-request/max-results :portkey.aws.glue.get-crawler-metrics-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.get-job-runs-response/job-runs (clojure.spec.alpha/and :portkey.aws.glue/job-run-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-job-runs-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-job-runs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-job-runs-response/job-runs :portkey.aws.glue.get-job-runs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.get-catalog-import-status-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-catalog-import-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-catalog-import-status-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.get-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-table-request/database-name :portkey.aws.glue.get-table-request/name] :opt-un [:portkey.aws.glue.get-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.get-mapping-response/mapping (clojure.spec.alpha/and :portkey.aws.glue/mapping-list))
(clojure.spec.alpha/def :portkey.aws.glue/get-mapping-response (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-mapping-response/mapping] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.get-security-configuration-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-security-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-security-configuration-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/cron-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.delete-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-user-defined-function-request/function-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-user-defined-function-request/database-name :portkey.aws.glue.delete-user-defined-function-request/function-name] :opt-un [:portkey.aws.glue.delete-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/json-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.code-gen-edge/source (clojure.spec.alpha/and :portkey.aws.glue/code-gen-identifier))
(clojure.spec.alpha/def :portkey.aws.glue.code-gen-edge/target (clojure.spec.alpha/and :portkey.aws.glue/code-gen-identifier))
(clojure.spec.alpha/def :portkey.aws.glue.code-gen-edge/target-parameter (clojure.spec.alpha/and :portkey.aws.glue/code-gen-arg-name))
(clojure.spec.alpha/def :portkey.aws.glue/code-gen-edge (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.code-gen-edge/source :portkey.aws.glue.code-gen-edge/target] :opt-un [:portkey.aws.glue.code-gen-edge/target-parameter]))

(clojure.spec.alpha/def :portkey.aws.glue/dag-nodes (clojure.spec.alpha/coll-of :portkey.aws.glue/code-gen-node))

(clojure.spec.alpha/def :portkey.aws.glue/location-map (clojure.spec.alpha/map-of :portkey.aws.glue/column-values-string :portkey.aws.glue/column-values-string))

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-partition-response/errors (clojure.spec.alpha/and :portkey.aws.glue/partition-errors))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-delete-partition-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue/view-text-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 409600))))

(clojure.spec.alpha/def :portkey.aws.glue/classifier-list (clojure.spec.alpha/coll-of :portkey.aws.glue/classifier))

(clojure.spec.alpha/def :portkey.aws.glue.get-classifiers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.get-classifiers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-classifiers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-classifiers-request/max-results :portkey.aws.glue.get-classifiers-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.create-job-response/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.create-job-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue/job-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.delete-security-configuration-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-security-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-security-configuration-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.batch-create-partition-response/errors (clojure.spec.alpha/and :portkey.aws.glue/partition-errors))
(clojure.spec.alpha/def :portkey.aws.glue/batch-create-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-create-partition-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.put-data-catalog-encryption-settings-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue/put-data-catalog-encryption-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/data-catalog-encryption-settings] :opt-un [:portkey.aws.glue.put-data-catalog-encryption-settings-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/connection-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.import-catalog-to-glue-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue/import-catalog-to-glue-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.import-catalog-to-glue-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/trigger-list (clojure.spec.alpha/coll-of :portkey.aws.glue/trigger))

(clojure.spec.alpha/def :portkey.aws.glue.jdbc-target/exclusions (clojure.spec.alpha/and :portkey.aws.glue/path-list))
(clojure.spec.alpha/def :portkey.aws.glue/jdbc-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/connection-name :portkey.aws.glue/path :portkey.aws.glue.jdbc-target/exclusions]))

(clojure.spec.alpha/def :portkey.aws.glue/error-by-name (clojure.spec.alpha/map-of :portkey.aws.glue/name-string :portkey.aws.glue/error-detail))

(clojure.spec.alpha/def :portkey.aws.glue/code-gen-arg-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.create-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/connection-input] :opt-un [:portkey.aws.glue.create-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/uri-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-connection-response/succeeded (clojure.spec.alpha/and :portkey.aws.glue/name-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-connection-response/errors (clojure.spec.alpha/and :portkey.aws.glue/error-by-name))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-delete-connection-response/succeeded :portkey.aws.glue.batch-delete-connection-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue.catalog-entry/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.catalog-entry/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/catalog-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.catalog-entry/database-name :portkey.aws.glue.catalog-entry/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.delete-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-connection-request/connection-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-connection-request/connection-name] :opt-un [:portkey.aws.glue.delete-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/predicate-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.delete-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-dev-endpoint-request/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/import-catalog-to-glue-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.get-dev-endpoints-response/dev-endpoints (clojure.spec.alpha/and :portkey.aws.glue/dev-endpoint-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-dev-endpoints-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-dev-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-dev-endpoints-response/dev-endpoints :portkey.aws.glue.get-dev-endpoints-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.mapping-entry/source-table (clojure.spec.alpha/and :portkey.aws.glue/table-name))
(clojure.spec.alpha/def :portkey.aws.glue.mapping-entry/source-path (clojure.spec.alpha/and :portkey.aws.glue/schema-path-string))
(clojure.spec.alpha/def :portkey.aws.glue.mapping-entry/source-type (clojure.spec.alpha/and :portkey.aws.glue/field-type))
(clojure.spec.alpha/def :portkey.aws.glue.mapping-entry/target-table (clojure.spec.alpha/and :portkey.aws.glue/table-name))
(clojure.spec.alpha/def :portkey.aws.glue.mapping-entry/target-path (clojure.spec.alpha/and :portkey.aws.glue/schema-path-string))
(clojure.spec.alpha/def :portkey.aws.glue.mapping-entry/target-type (clojure.spec.alpha/and :portkey.aws.glue/field-type))
(clojure.spec.alpha/def :portkey.aws.glue/mapping-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.mapping-entry/source-table :portkey.aws.glue.mapping-entry/source-path :portkey.aws.glue.mapping-entry/source-type :portkey.aws.glue.mapping-entry/target-table :portkey.aws.glue.mapping-entry/target-path :portkey.aws.glue.mapping-entry/target-type]))

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-connection-request/connection-name-list (clojure.spec.alpha/and :portkey.aws.glue/delete-connection-name-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.batch-delete-connection-request/connection-name-list] :opt-un [:portkey.aws.glue.batch-delete-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.job-command/name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-command/script-location (clojure.spec.alpha/and :portkey.aws.glue/script-location-string))
(clojure.spec.alpha/def :portkey.aws.glue/job-command (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.job-command/name :portkey.aws.glue.job-command/script-location]))

(clojure.spec.alpha/def :portkey.aws.glue.physical-connection-requirements/subnet-id (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.physical-connection-requirements/availability-zone (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/physical-connection-requirements (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.physical-connection-requirements/subnet-id :portkey.aws.glue/security-group-id-list :portkey.aws.glue.physical-connection-requirements/availability-zone]))

(clojure.spec.alpha/def :portkey.aws.glue/kms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:kms:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/milliseconds-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.predecessor/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.predecessor/run-id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue/predecessor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.predecessor/job-name :portkey.aws.glue.predecessor/run-id]))

(clojure.spec.alpha/def :portkey.aws.glue.get-plan-request/mapping (clojure.spec.alpha/and :portkey.aws.glue/mapping-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-plan-request/source (clojure.spec.alpha/and :portkey.aws.glue/catalog-entry))
(clojure.spec.alpha/def :portkey.aws.glue.get-plan-request/sinks (clojure.spec.alpha/and :portkey.aws.glue/catalog-entries))
(clojure.spec.alpha/def :portkey.aws.glue/get-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-plan-request/mapping :portkey.aws.glue.get-plan-request/source] :opt-un [:portkey.aws.glue.get-plan-request/sinks :portkey.aws.glue/location :portkey.aws.glue/language]))

(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-request/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-request/job-run-ids (clojure.spec.alpha/and :portkey.aws.glue/batch-stop-job-run-job-run-id-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-stop-job-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.batch-stop-job-run-request/job-name :portkey.aws.glue.batch-stop-job-run-request/job-run-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.location/jdbc (clojure.spec.alpha/and :portkey.aws.glue/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue.location/s-3 (clojure.spec.alpha/and :portkey.aws.glue/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue.location/dynamo-db (clojure.spec.alpha/and :portkey.aws.glue/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue/location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.location/jdbc :portkey.aws.glue.location/s-3 :portkey.aws.glue.location/dynamo-db]))

(clojure.spec.alpha/def :portkey.aws.glue.xml-classifier/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.xml-classifier/creation-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.xml-classifier/last-updated (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.xml-classifier/version (clojure.spec.alpha/and :portkey.aws.glue/version-id))
(clojure.spec.alpha/def :portkey.aws.glue/xml-classifier (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.xml-classifier/name :portkey.aws.glue/classification] :opt-un [:portkey.aws.glue.xml-classifier/creation-time :portkey.aws.glue.xml-classifier/last-updated :portkey.aws.glue.xml-classifier/version :portkey.aws.glue/row-tag]))

(clojure.spec.alpha/def :portkey.aws.glue.get-crawlers-response/crawlers (clojure.spec.alpha/and :portkey.aws.glue/crawler-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-crawlers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-crawlers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-crawlers-response/crawlers :portkey.aws.glue.get-crawlers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue/crawler-state #{:ready "READY" :running :stopping "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.glue/s-3-encryption-mode #{"DISABLED" :disabled :ssekms "SSE-KMS" "SSE-S3" :sses-3})

(clojure.spec.alpha/def :portkey.aws.glue.batch-create-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-create-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-create-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/batch-create-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.batch-create-partition-request/database-name :portkey.aws.glue.batch-create-partition-request/table-name :portkey.aws.glue/partition-input-list] :opt-un [:portkey.aws.glue.batch-create-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.stop-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/stop-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.stop-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue/column-value-string-list (clojure.spec.alpha/coll-of :portkey.aws.glue/column-values-string))

(clojure.spec.alpha/def :portkey.aws.glue/crawler-security-configuration (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/number-of-buckets (clojure.spec.alpha/and :portkey.aws.glue/integer))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/location (clojure.spec.alpha/and :portkey.aws.glue/location-string))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/compressed (clojure.spec.alpha/and :portkey.aws.glue/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/serde-info (clojure.spec.alpha/and :portkey.aws.glue/ser-de-info))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/output-format (clojure.spec.alpha/and :portkey.aws.glue/format-string))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/stored-as-sub-directories (clojure.spec.alpha/and :portkey.aws.glue/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/bucket-columns (clojure.spec.alpha/and :portkey.aws.glue/name-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/input-format (clojure.spec.alpha/and :portkey.aws.glue/format-string))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/columns (clojure.spec.alpha/and :portkey.aws.glue/column-list))
(clojure.spec.alpha/def :portkey.aws.glue.storage-descriptor/sort-columns (clojure.spec.alpha/and :portkey.aws.glue/order-list))
(clojure.spec.alpha/def :portkey.aws.glue/storage-descriptor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.storage-descriptor/number-of-buckets :portkey.aws.glue.storage-descriptor/parameters :portkey.aws.glue.storage-descriptor/location :portkey.aws.glue.storage-descriptor/compressed :portkey.aws.glue.storage-descriptor/serde-info :portkey.aws.glue.storage-descriptor/output-format :portkey.aws.glue/skewed-info :portkey.aws.glue.storage-descriptor/stored-as-sub-directories :portkey.aws.glue.storage-descriptor/bucket-columns :portkey.aws.glue.storage-descriptor/input-format :portkey.aws.glue.storage-descriptor/columns :portkey.aws.glue.storage-descriptor/sort-columns]))

(clojure.spec.alpha/def :portkey.aws.glue/condition-list (clojure.spec.alpha/coll-of :portkey.aws.glue/condition))

(clojure.spec.alpha/def :portkey.aws.glue/security-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.glue/security-configuration))

(clojure.spec.alpha/def :portkey.aws.glue.resource-uri/uri (clojure.spec.alpha/and :portkey.aws.glue/uri))
(clojure.spec.alpha/def :portkey.aws.glue/resource-uri (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/resource-type :portkey.aws.glue.resource-uri/uri]))

(clojure.spec.alpha/def :portkey.aws.glue/json-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/get-database-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/database]))

(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-schedule-request/crawler-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-schedule-request/schedule (clojure.spec.alpha/and :portkey.aws.glue/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue/update-crawler-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-crawler-schedule-request/crawler-name] :opt-un [:portkey.aws.glue.update-crawler-schedule-request/schedule]))

(clojure.spec.alpha/def :portkey.aws.glue.get-classifiers-response/classifiers (clojure.spec.alpha/and :portkey.aws.glue/classifier-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-classifiers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-classifiers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-classifiers-response/classifiers :portkey.aws.glue.get-classifiers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.update-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-partition-request/partition-value-list (clojure.spec.alpha/and :portkey.aws.glue/bounded-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue/update-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-partition-request/database-name :portkey.aws.glue.update-partition-request/table-name :portkey.aws.glue.update-partition-request/partition-value-list :portkey.aws.glue/partition-input] :opt-un [:portkey.aws.glue.update-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/get-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/connection]))

(clojure.spec.alpha/def :portkey.aws.glue/get-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/dev-endpoint]))

(clojure.spec.alpha/def :portkey.aws.glue.get-table-versions-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-versions-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-versions-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-table-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-table-versions-request/database-name :portkey.aws.glue.get-table-versions-request/table-name] :opt-un [:portkey.aws.glue.get-table-versions-request/catalog-id :portkey.aws.glue.get-table-versions-request/next-token :portkey.aws.glue.get-table-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.last-crawl-info/status (clojure.spec.alpha/and :portkey.aws.glue/last-crawl-status))
(clojure.spec.alpha/def :portkey.aws.glue.last-crawl-info/error-message (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.last-crawl-info/start-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue/last-crawl-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.last-crawl-info/status :portkey.aws.glue.last-crawl-info/error-message :portkey.aws.glue/log-group :portkey.aws.glue/log-stream :portkey.aws.glue/message-prefix :portkey.aws.glue.last-crawl-info/start-time]))

(clojure.spec.alpha/def :portkey.aws.glue.create-crawler-request/classifiers (clojure.spec.alpha/and :portkey.aws.glue/classifier-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.create-crawler-request/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-crawler-request/targets (clojure.spec.alpha/and :portkey.aws.glue/crawler-targets))
(clojure.spec.alpha/def :portkey.aws.glue.create-crawler-request/schedule (clojure.spec.alpha/and :portkey.aws.glue/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue.create-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-crawler-request/configuration (clojure.spec.alpha/and :portkey.aws.glue/crawler-configuration))
(clojure.spec.alpha/def :portkey.aws.glue/create-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-crawler-request/name :portkey.aws.glue/role :portkey.aws.glue/database-name :portkey.aws.glue.create-crawler-request/targets] :opt-un [:portkey.aws.glue.create-crawler-request/classifiers :portkey.aws.glue/crawler-security-configuration :portkey.aws.glue/table-prefix :portkey.aws.glue/schema-change-policy :portkey.aws.glue.create-crawler-request/description :portkey.aws.glue.create-crawler-request/schedule :portkey.aws.glue.create-crawler-request/configuration]))

(clojure.spec.alpha/def :portkey.aws.glue/version-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.code-gen-node/id (clojure.spec.alpha/and :portkey.aws.glue/code-gen-identifier))
(clojure.spec.alpha/def :portkey.aws.glue.code-gen-node/node-type (clojure.spec.alpha/and :portkey.aws.glue/code-gen-node-type))
(clojure.spec.alpha/def :portkey.aws.glue.code-gen-node/args (clojure.spec.alpha/and :portkey.aws.glue/code-gen-node-args))
(clojure.spec.alpha/def :portkey.aws.glue.code-gen-node/line-number (clojure.spec.alpha/and :portkey.aws.glue/integer))
(clojure.spec.alpha/def :portkey.aws.glue/code-gen-node (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.code-gen-node/id :portkey.aws.glue.code-gen-node/node-type :portkey.aws.glue.code-gen-node/args] :opt-un [:portkey.aws.glue.code-gen-node/line-number]))

(clojure.spec.alpha/def :portkey.aws.glue/batch-stop-job-run-successful-submission-list (clojure.spec.alpha/coll-of :portkey.aws.glue/batch-stop-job-run-successful-submission))

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-version-response/errors (clojure.spec.alpha/and :portkey.aws.glue/table-version-errors))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-table-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-delete-table-version-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue/crawler-list (clojure.spec.alpha/coll-of :portkey.aws.glue/crawler))

(clojure.spec.alpha/def :portkey.aws.glue.job-update/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-update/log-uri (clojure.spec.alpha/and :portkey.aws.glue/uri-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-update/default-arguments (clojure.spec.alpha/and :portkey.aws.glue/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.job-update/connections (clojure.spec.alpha/and :portkey.aws.glue/connections-list))
(clojure.spec.alpha/def :portkey.aws.glue.job-update/role (clojure.spec.alpha/and :portkey.aws.glue/role-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-update/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-update/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-update/command (clojure.spec.alpha/and :portkey.aws.glue/job-command))
(clojure.spec.alpha/def :portkey.aws.glue/job-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.job-update/allocated-capacity :portkey.aws.glue/timeout :portkey.aws.glue.job-update/log-uri :portkey.aws.glue.job-update/default-arguments :portkey.aws.glue.job-update/connections :portkey.aws.glue.job-update/role :portkey.aws.glue.job-update/description :portkey.aws.glue.job-update/security-configuration :portkey.aws.glue.job-update/command :portkey.aws.glue/max-retries :portkey.aws.glue/execution-property :portkey.aws.glue/notification-property]))

(clojure.spec.alpha/def :portkey.aws.glue.get-triggers-response/triggers (clojure.spec.alpha/and :portkey.aws.glue/trigger-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-triggers-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-triggers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-triggers-response/triggers :portkey.aws.glue.get-triggers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue/script-location-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/dynamo-db-target-list (clojure.spec.alpha/coll-of :portkey.aws.glue/dynamo-db-target))

(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.glue/string-list))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/subnet-id (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/number-of-nodes (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/public-keys (clojure.spec.alpha/and :portkey.aws.glue/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-request/public-key (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-dev-endpoint-request/endpoint-name :portkey.aws.glue/role-arn] :opt-un [:portkey.aws.glue.create-dev-endpoint-request/security-group-ids :portkey.aws.glue.create-dev-endpoint-request/subnet-id :portkey.aws.glue.create-dev-endpoint-request/extra-jars-s-3-path :portkey.aws.glue.create-dev-endpoint-request/number-of-nodes :portkey.aws.glue.create-dev-endpoint-request/public-keys :portkey.aws.glue.create-dev-endpoint-request/security-configuration :portkey.aws.glue.create-dev-endpoint-request/extra-python-libs-s-3-path :portkey.aws.glue.create-dev-endpoint-request/public-key]))

(clojure.spec.alpha/def :portkey.aws.glue/get-connections-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/match-criteria :portkey.aws.glue/connection-type]))

(clojure.spec.alpha/def :portkey.aws.glue/value-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.glue.create-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-partition-request/database-name :portkey.aws.glue.create-partition-request/table-name :portkey.aws.glue/partition-input] :opt-un [:portkey.aws.glue.create-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/comment-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/key-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/get-job-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/job-run]))

(clojure.spec.alpha/def :portkey.aws.glue/filter-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/create-script-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/python-script :portkey.aws.glue/scala-code]))

(clojure.spec.alpha/def :portkey.aws.glue.get-security-configurations-response/security-configurations (clojure.spec.alpha/and :portkey.aws.glue/security-configuration-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-security-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-security-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-security-configurations-response/security-configurations :portkey.aws.glue.get-security-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue/python-script (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/catalog-id-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/s-3-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/s-3-encryption-mode :portkey.aws.glue/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-response/errors (clojure.spec.alpha/and :portkey.aws.glue/table-errors))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-table-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-delete-table-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue/update-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.create-grok-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-grok-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/classification :portkey.aws.glue.create-grok-classifier-request/name :portkey.aws.glue/grok-pattern] :opt-un [:portkey.aws.glue/custom-patterns]))

(clojure.spec.alpha/def :portkey.aws.glue/logical #{"AND" "ANY" :and :any})

(clojure.spec.alpha/def :portkey.aws.glue/catalog-encryption-mode #{"DISABLED" :disabled :ssekms "SSE-KMS"})

(clojure.spec.alpha/def :portkey.aws.glue.delete-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/create-table-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/description-string-removable (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.update-grok-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-grok-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-grok-classifier-request/name] :opt-un [:portkey.aws.glue/classification :portkey.aws.glue/grok-pattern :portkey.aws.glue/custom-patterns]))

(clojure.spec.alpha/def :portkey.aws.glue/dag-edges (clojure.spec.alpha/coll-of :portkey.aws.glue/code-gen-edge))

(clojure.spec.alpha/def :portkey.aws.glue.error-detail/error-code (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.error-detail/error-message (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue/error-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.error-detail/error-code :portkey.aws.glue.error-detail/error-message]))

(clojure.spec.alpha/def :portkey.aws.glue.update-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-user-defined-function-request/function-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-user-defined-function-request/function-input (clojure.spec.alpha/and :portkey.aws.glue/user-defined-function-input))
(clojure.spec.alpha/def :portkey.aws.glue/update-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-user-defined-function-request/database-name :portkey.aws.glue.update-user-defined-function-request/function-name :portkey.aws.glue.update-user-defined-function-request/function-input] :opt-un [:portkey.aws.glue.update-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.update-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-table-request/skip-archive (clojure.spec.alpha/and :portkey.aws.glue/boolean-nullable))
(clojure.spec.alpha/def :portkey.aws.glue/update-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-table-request/database-name :portkey.aws.glue/table-input] :opt-un [:portkey.aws.glue.update-table-request/catalog-id :portkey.aws.glue.update-table-request/skip-archive]))

(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-functions-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-functions-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-functions-request/pattern (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-functions-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-functions-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-user-defined-functions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-user-defined-functions-request/database-name :portkey.aws.glue.get-user-defined-functions-request/pattern] :opt-un [:portkey.aws.glue.get-user-defined-functions-request/catalog-id :portkey.aws.glue.get-user-defined-functions-request/next-token :portkey.aws.glue.get-user-defined-functions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.update-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-connection-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-connection-request/name :portkey.aws.glue/connection-input] :opt-un [:portkey.aws.glue.update-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/create-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/table-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.glue/get-dataflow-graph-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/python-script]))

(clojure.spec.alpha/def :portkey.aws.glue.update-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-trigger-request/name :portkey.aws.glue/trigger-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/get-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/partition]))

(clojure.spec.alpha/def :portkey.aws.glue.get-tables-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-tables-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/table-list :portkey.aws.glue.get-tables-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue/row-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.table-version/version-id (clojure.spec.alpha/and :portkey.aws.glue/version-string))
(clojure.spec.alpha/def :portkey.aws.glue/table-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/table :portkey.aws.glue.table-version/version-id]))

(clojure.spec.alpha/def :portkey.aws.glue.json-classifier/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.json-classifier/creation-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.json-classifier/last-updated (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.json-classifier/version (clojure.spec.alpha/and :portkey.aws.glue/version-id))
(clojure.spec.alpha/def :portkey.aws.glue/json-classifier (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.json-classifier/name :portkey.aws.glue/json-path] :opt-un [:portkey.aws.glue.json-classifier/creation-time :portkey.aws.glue.json-classifier/last-updated :portkey.aws.glue.json-classifier/version]))

(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/log-uri (clojure.spec.alpha/and :portkey.aws.glue/uri-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/default-arguments (clojure.spec.alpha/and :portkey.aws.glue/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/connections (clojure.spec.alpha/and :portkey.aws.glue/connections-list))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/role (clojure.spec.alpha/and :portkey.aws.glue/role-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/command (clojure.spec.alpha/and :portkey.aws.glue/job-command))
(clojure.spec.alpha/def :portkey.aws.glue.create-job-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-job-request/name :portkey.aws.glue.create-job-request/role :portkey.aws.glue.create-job-request/command] :opt-un [:portkey.aws.glue.create-job-request/allocated-capacity :portkey.aws.glue/timeout :portkey.aws.glue.create-job-request/log-uri :portkey.aws.glue.create-job-request/default-arguments :portkey.aws.glue.create-job-request/connections :portkey.aws.glue.create-job-request/description :portkey.aws.glue.create-job-request/security-configuration :portkey.aws.glue/max-retries :portkey.aws.glue/execution-property :portkey.aws.glue/notification-property]))

(clojure.spec.alpha/def :portkey.aws.glue.segment/segment-number (clojure.spec.alpha/and :portkey.aws.glue/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.segment/total-segments (clojure.spec.alpha/and :portkey.aws.glue/total-segments-integer))
(clojure.spec.alpha/def :portkey.aws.glue/segment (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.segment/segment-number :portkey.aws.glue.segment/total-segments] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.scheduler-not-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/scheduler-not-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.scheduler-not-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/column-values-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/schema-change-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/update-behavior :portkey.aws.glue/delete-behavior]))

(clojure.spec.alpha/def :portkey.aws.glue/job-bookmarks-encryption-mode #{"DISABLED" :disabled "CSE-KMS" :csekms})

(clojure.spec.alpha/def :portkey.aws.glue.crawler-not-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/crawler-not-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.crawler-not-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.ser-de-info/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.ser-de-info/serialization-library (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.ser-de-info/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue/ser-de-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.ser-de-info/name :portkey.aws.glue.ser-de-info/serialization-library :portkey.aws.glue.ser-de-info/parameters]))

(clojure.spec.alpha/def :portkey.aws.glue/get-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/crawler]))

(clojure.spec.alpha/def :portkey.aws.glue.get-connection-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-connection-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-connection-request/name] :opt-un [:portkey.aws.glue.get-connection-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/code-gen-arg-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.scheduler-transitioning-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/scheduler-transitioning-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.scheduler-transitioning-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.delete-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-classifier-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/scala-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/update-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/id-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.get-databases-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-databases-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue.get-databases-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-databases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-databases-request/catalog-id :portkey.aws.glue.get-databases-request/next-token :portkey.aws.glue.get-databases-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-partition-value-list (clojure.spec.alpha/coll-of :portkey.aws.glue/partition-value-list :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.glue/create-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.table-input/view-expanded-text (clojure.spec.alpha/and :portkey.aws.glue/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/partition-keys (clojure.spec.alpha/and :portkey.aws.glue/column-list))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/owner (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/table-type (clojure.spec.alpha/and :portkey.aws.glue/table-type-string))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/last-access-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/retention (clojure.spec.alpha/and :portkey.aws.glue/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.table-input/view-original-text (clojure.spec.alpha/and :portkey.aws.glue/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue/table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.table-input/name] :opt-un [:portkey.aws.glue.table-input/view-expanded-text :portkey.aws.glue.table-input/parameters :portkey.aws.glue/storage-descriptor :portkey.aws.glue.table-input/partition-keys :portkey.aws.glue.table-input/description :portkey.aws.glue.table-input/owner :portkey.aws.glue.table-input/table-type :portkey.aws.glue.table-input/last-access-time :portkey.aws.glue.table-input/retention :portkey.aws.glue.table-input/last-analyzed-time :portkey.aws.glue.table-input/view-original-text]))

(clojure.spec.alpha/def :portkey.aws.glue/integer-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-request/expression (clojure.spec.alpha/and :portkey.aws.glue/predicate-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue.get-partitions-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-partitions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-partitions-request/database-name :portkey.aws.glue.get-partitions-request/table-name] :opt-un [:portkey.aws.glue.get-partitions-request/catalog-id :portkey.aws.glue.get-partitions-request/expression :portkey.aws.glue.get-partitions-request/next-token :portkey.aws.glue/segment :portkey.aws.glue.get-partitions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.skewed-info/skewed-column-names (clojure.spec.alpha/and :portkey.aws.glue/name-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.skewed-info/skewed-column-values (clojure.spec.alpha/and :portkey.aws.glue/column-value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.skewed-info/skewed-column-value-location-maps (clojure.spec.alpha/and :portkey.aws.glue/location-map))
(clojure.spec.alpha/def :portkey.aws.glue/skewed-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.skewed-info/skewed-column-names :portkey.aws.glue.skewed-info/skewed-column-values :portkey.aws.glue.skewed-info/skewed-column-value-location-maps]))

(clojure.spec.alpha/def :portkey.aws.glue.idempotent-parameter-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.idempotent-parameter-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/trigger-state #{:deactivated "DEACTIVATING" :creating "UPDATING" "ACTIVATING" :created :deleting :activated "DELETING" "CREATING" "DEACTIVATED" :updating :deactivating "ACTIVATED" :activating "CREATED"})

(clojure.spec.alpha/def :portkey.aws.glue/data-catalog-encryption-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/encryption-at-rest]))

(clojure.spec.alpha/def :portkey.aws.glue.delete-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-table-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-table-request/database-name :portkey.aws.glue.delete-table-request/name] :opt-un [:portkey.aws.glue.delete-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/log-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\.\-_/#A-Za-z0-9]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/connection-properties (clojure.spec.alpha/map-of :portkey.aws.glue/connection-property-key :portkey.aws.glue/value-string))

(clojure.spec.alpha/def :portkey.aws.glue/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.crawler/last-crawl (clojure.spec.alpha/and :portkey.aws.glue/last-crawl-info))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/classifiers (clojure.spec.alpha/and :portkey.aws.glue/classifier-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/crawl-elapsed-time (clojure.spec.alpha/and :portkey.aws.glue/milliseconds-count))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/targets (clojure.spec.alpha/and :portkey.aws.glue/crawler-targets))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/creation-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/state (clojure.spec.alpha/and :portkey.aws.glue/crawler-state))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/version (clojure.spec.alpha/and :portkey.aws.glue/version-id))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/configuration (clojure.spec.alpha/and :portkey.aws.glue/crawler-configuration))
(clojure.spec.alpha/def :portkey.aws.glue.crawler/last-updated (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue/crawler (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.crawler/last-crawl :portkey.aws.glue.crawler/classifiers :portkey.aws.glue/database-name :portkey.aws.glue/crawler-security-configuration :portkey.aws.glue/role :portkey.aws.glue/table-prefix :portkey.aws.glue.crawler/crawl-elapsed-time :portkey.aws.glue/schema-change-policy :portkey.aws.glue.crawler/description :portkey.aws.glue.crawler/targets :portkey.aws.glue.crawler/creation-time :portkey.aws.glue.crawler/state :portkey.aws.glue.crawler/version :portkey.aws.glue/schedule :portkey.aws.glue.crawler/name :portkey.aws.glue.crawler/configuration :portkey.aws.glue.crawler/last-updated]))

(clojure.spec.alpha/def :portkey.aws.glue/partition-errors (clojure.spec.alpha/coll-of :portkey.aws.glue/partition-error))

(clojure.spec.alpha/def :portkey.aws.glue/update-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/get-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/user-defined-function]))

(clojure.spec.alpha/def :portkey.aws.glue/s-3-encryption-list (clojure.spec.alpha/coll-of :portkey.aws.glue/s-3-encryption))

(clojure.spec.alpha/def :portkey.aws.glue/name-string-list (clojure.spec.alpha/coll-of :portkey.aws.glue/name-string))

(clojure.spec.alpha/def :portkey.aws.glue.table-version-error/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.table-version-error/version-id (clojure.spec.alpha/and :portkey.aws.glue/version-string))
(clojure.spec.alpha/def :portkey.aws.glue/table-version-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.table-version-error/table-name :portkey.aws.glue.table-version-error/version-id :portkey.aws.glue/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue/stop-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.get-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-jobs-request/next-token :portkey.aws.glue.get-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.partition-input/values (clojure.spec.alpha/and :portkey.aws.glue/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.partition-input/last-access-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.partition-input/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.partition-input/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue/partition-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.partition-input/values :portkey.aws.glue.partition-input/last-access-time :portkey.aws.glue/storage-descriptor :portkey.aws.glue.partition-input/parameters :portkey.aws.glue.partition-input/last-analyzed-time]))

(clojure.spec.alpha/def :portkey.aws.glue.get-crawler-metrics-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-crawler-metrics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/crawler-metrics-list :portkey.aws.glue.get-crawler-metrics-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.get-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-classifier-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.get-job-request/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-job-request/job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.resource-number-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/resource-number-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.resource-number-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.create-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-trigger-request/type (clojure.spec.alpha/and :portkey.aws.glue/trigger-type))
(clojure.spec.alpha/def :portkey.aws.glue.create-trigger-request/schedule (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-trigger-request/actions (clojure.spec.alpha/and :portkey.aws.glue/action-list))
(clojure.spec.alpha/def :portkey.aws.glue.create-trigger-request/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-trigger-request/start-on-creation (clojure.spec.alpha/and :portkey.aws.glue/boolean-value))
(clojure.spec.alpha/def :portkey.aws.glue/create-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-trigger-request/name :portkey.aws.glue.create-trigger-request/type :portkey.aws.glue.create-trigger-request/actions] :opt-un [:portkey.aws.glue.create-trigger-request/schedule :portkey.aws.glue/predicate :portkey.aws.glue.create-trigger-request/description :portkey.aws.glue.create-trigger-request/start-on-creation]))

(clojure.spec.alpha/def :portkey.aws.glue.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/path-list (clojure.spec.alpha/coll-of :portkey.aws.glue/path))

(clojure.spec.alpha/def :portkey.aws.glue/update-database-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/log-stream (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[^:*]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue/get-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/classifier]))

(clojure.spec.alpha/def :portkey.aws.glue/name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.create-security-configuration-response/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-security-configuration-response/created-timestamp (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue/create-security-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.create-security-configuration-response/name :portkey.aws.glue.create-security-configuration-response/created-timestamp]))

(clojure.spec.alpha/def :portkey.aws.glue/job-bookmarks-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/job-bookmarks-encryption-mode :portkey.aws.glue/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.glue/partition-list (clojure.spec.alpha/coll-of :portkey.aws.glue/partition))

(clojure.spec.alpha/def :portkey.aws.glue.get-data-catalog-encryption-settings-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-data-catalog-encryption-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-data-catalog-encryption-settings-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/update-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/custom-patterns (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 16000)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.get-triggers-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-triggers-request/dependent-job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-triggers-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-triggers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-triggers-request/next-token :portkey.aws.glue.get-triggers-request/dependent-job-name :portkey.aws.glue.get-triggers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue/crawler-configuration (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/schema-path-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.create-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-user-defined-function-request/function-input (clojure.spec.alpha/and :portkey.aws.glue/user-defined-function-input))
(clojure.spec.alpha/def :portkey.aws.glue/create-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-user-defined-function-request/database-name :portkey.aws.glue.create-user-defined-function-request/function-input] :opt-un [:portkey.aws.glue.create-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.database-input/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.database-input/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.database-input/location-uri (clojure.spec.alpha/and :portkey.aws.glue/uri))
(clojure.spec.alpha/def :portkey.aws.glue.database-input/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue/database-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.database-input/name] :opt-un [:portkey.aws.glue.database-input/description :portkey.aws.glue.database-input/location-uri :portkey.aws.glue.database-input/parameters]))

(clojure.spec.alpha/def :portkey.aws.glue.start-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/start-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.start-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.batch-get-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-get-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-get-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-get-partition-request/partitions-to-get (clojure.spec.alpha/and :portkey.aws.glue/batch-get-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-get-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.batch-get-partition-request/database-name :portkey.aws.glue.batch-get-partition-request/table-name :portkey.aws.glue.batch-get-partition-request/partitions-to-get] :opt-un [:portkey.aws.glue.batch-get-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/max-concurrent-runs clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue/classifier-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue/name-string))

(clojure.spec.alpha/def :portkey.aws.glue/get-table-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/table-version]))

(clojure.spec.alpha/def :portkey.aws.glue/resource-type #{"FILE" :jar :file "JAR" "ARCHIVE" :archive})

(clojure.spec.alpha/def :portkey.aws.glue/update-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/trigger]))

(clojure.spec.alpha/def :portkey.aws.glue/table-version-errors (clojure.spec.alpha/coll-of :portkey.aws.glue/table-version-error))

(clojure.spec.alpha/def :portkey.aws.glue/error-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue/classification (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function/function-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function/class-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function/owner-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function/owner-type (clojure.spec.alpha/and :portkey.aws.glue/principal-type))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function/create-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.user-defined-function/resource-uris (clojure.spec.alpha/and :portkey.aws.glue/resource-uri-list))
(clojure.spec.alpha/def :portkey.aws.glue/user-defined-function (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.user-defined-function/function-name :portkey.aws.glue.user-defined-function/class-name :portkey.aws.glue.user-defined-function/owner-name :portkey.aws.glue.user-defined-function/owner-type :portkey.aws.glue.user-defined-function/create-time :portkey.aws.glue.user-defined-function/resource-uris]))

(clojure.spec.alpha/def :portkey.aws.glue.security-configuration/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.security-configuration/created-time-stamp (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue/security-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.security-configuration/name :portkey.aws.glue.security-configuration/created-time-stamp :portkey.aws.glue/encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.column/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.column/type (clojure.spec.alpha/and :portkey.aws.glue/column-type-string))
(clojure.spec.alpha/def :portkey.aws.glue.column/comment (clojure.spec.alpha/and :portkey.aws.glue/comment-string))
(clojure.spec.alpha/def :portkey.aws.glue/column (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.column/name] :opt-un [:portkey.aws.glue.column/type :portkey.aws.glue.column/comment]))

(clojure.spec.alpha/def :portkey.aws.glue/order-list (clojure.spec.alpha/coll-of :portkey.aws.glue/order))

(clojure.spec.alpha/def :portkey.aws.glue.get-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.glue/job-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-jobs-response/jobs :portkey.aws.glue.get-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.partition/values (clojure.spec.alpha/and :portkey.aws.glue/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue.partition/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.partition/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.partition/creation-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.partition/last-access-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.partition/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.partition/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue/partition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.partition/values :portkey.aws.glue.partition/database-name :portkey.aws.glue.partition/table-name :portkey.aws.glue.partition/creation-time :portkey.aws.glue.partition/last-access-time :portkey.aws.glue/storage-descriptor :portkey.aws.glue.partition/parameters :portkey.aws.glue.partition/last-analyzed-time]))

(clojure.spec.alpha/def :portkey.aws.glue.get-security-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue.get-security-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-security-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-security-configurations-request/max-results :portkey.aws.glue.get-security-configurations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/crawler-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/time-left-seconds (clojure.spec.alpha/and :portkey.aws.glue/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/still-estimating (clojure.spec.alpha/and :portkey.aws.glue/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/last-runtime-seconds (clojure.spec.alpha/and :portkey.aws.glue/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/median-runtime-seconds (clojure.spec.alpha/and :portkey.aws.glue/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/tables-created (clojure.spec.alpha/and :portkey.aws.glue/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/tables-updated (clojure.spec.alpha/and :portkey.aws.glue/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.crawler-metrics/tables-deleted (clojure.spec.alpha/and :portkey.aws.glue/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue/crawler-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.crawler-metrics/crawler-name :portkey.aws.glue.crawler-metrics/time-left-seconds :portkey.aws.glue.crawler-metrics/still-estimating :portkey.aws.glue.crawler-metrics/last-runtime-seconds :portkey.aws.glue.crawler-metrics/median-runtime-seconds :portkey.aws.glue.crawler-metrics/tables-created :portkey.aws.glue.crawler-metrics/tables-updated :portkey.aws.glue.crawler-metrics/tables-deleted]))

(clojure.spec.alpha/def :portkey.aws.glue/last-crawl-status #{:cancelled "SUCCEEDED" "FAILED" "CANCELLED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.glue/parameters-map (clojure.spec.alpha/map-of :portkey.aws.glue/key-string :portkey.aws.glue/parameters-map-value))

(clojure.spec.alpha/def :portkey.aws.glue.delete-job-response/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.delete-job-response/job-name]))

(clojure.spec.alpha/def :portkey.aws.glue.create-xml-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-xml-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/classification :portkey.aws.glue.create-xml-classifier-request/name] :opt-un [:portkey.aws.glue/row-tag]))

(clojure.spec.alpha/def :portkey.aws.glue/connection-type #{:sftp "JDBC" "SFTP" :jdbc})

(clojure.spec.alpha/def :portkey.aws.glue/table-type-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.glue.start-job-run-response/job-run-id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue/start-job-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.start-job-run-response/job-run-id]))

(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/zeppelin-remote-spark-interpreter-port (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/created-timestamp (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/security-group-ids (clojure.spec.alpha/and :portkey.aws.glue/string-list))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/yarn-endpoint-address (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/subnet-id (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/number-of-nodes (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/availability-zone (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/status (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/vpc-id (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/failure-reason (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-dev-endpoint-response/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-dev-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.create-dev-endpoint-response/zeppelin-remote-spark-interpreter-port :portkey.aws.glue.create-dev-endpoint-response/created-timestamp :portkey.aws.glue.create-dev-endpoint-response/security-group-ids :portkey.aws.glue.create-dev-endpoint-response/yarn-endpoint-address :portkey.aws.glue.create-dev-endpoint-response/subnet-id :portkey.aws.glue.create-dev-endpoint-response/extra-jars-s-3-path :portkey.aws.glue/role-arn :portkey.aws.glue.create-dev-endpoint-response/number-of-nodes :portkey.aws.glue.create-dev-endpoint-response/availability-zone :portkey.aws.glue.create-dev-endpoint-response/status :portkey.aws.glue.create-dev-endpoint-response/endpoint-name :portkey.aws.glue.create-dev-endpoint-response/vpc-id :portkey.aws.glue.create-dev-endpoint-response/failure-reason :portkey.aws.glue.create-dev-endpoint-response/security-configuration :portkey.aws.glue.create-dev-endpoint-response/extra-python-libs-s-3-path]))

(clojure.spec.alpha/def :portkey.aws.glue.trigger-update/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.trigger-update/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.trigger-update/schedule (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.trigger-update/actions (clojure.spec.alpha/and :portkey.aws.glue/action-list))
(clojure.spec.alpha/def :portkey.aws.glue/trigger-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.trigger-update/name :portkey.aws.glue.trigger-update/description :portkey.aws.glue.trigger-update/schedule :portkey.aws.glue.trigger-update/actions :portkey.aws.glue/predicate]))

(clojure.spec.alpha/def :portkey.aws.glue/update-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/description-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/timestamp-value clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.glue/delete-table-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.partition-value-list/values (clojure.spec.alpha/and :portkey.aws.glue/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue/partition-value-list (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.partition-value-list/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-error/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-error/job-run-id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue/batch-stop-job-run-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-stop-job-run-error/job-name :portkey.aws.glue.batch-stop-job-run-error/job-run-id :portkey.aws.glue/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue/uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue.start-job-run-request/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.start-job-run-request/job-run-id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.start-job-run-request/arguments (clojure.spec.alpha/and :portkey.aws.glue/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.start-job-run-request/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.start-job-run-request/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/start-job-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.start-job-run-request/job-name] :opt-un [:portkey.aws.glue.start-job-run-request/job-run-id :portkey.aws.glue.start-job-run-request/arguments :portkey.aws.glue.start-job-run-request/allocated-capacity :portkey.aws.glue/timeout :portkey.aws.glue/notification-property :portkey.aws.glue.start-job-run-request/security-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/zeppelin-remote-spark-interpreter-port (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/created-timestamp (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/security-group-ids (clojure.spec.alpha/and :portkey.aws.glue/string-list))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/yarn-endpoint-address (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/subnet-id (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/private-address (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/extra-jars-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/number-of-nodes (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/last-update-status (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/availability-zone (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/status (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/public-keys (clojure.spec.alpha/and :portkey.aws.glue/public-keys-list))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/vpc-id (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/failure-reason (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/public-address (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/extra-python-libs-s-3-path (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.dev-endpoint/public-key (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/dev-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.dev-endpoint/zeppelin-remote-spark-interpreter-port :portkey.aws.glue.dev-endpoint/created-timestamp :portkey.aws.glue.dev-endpoint/security-group-ids :portkey.aws.glue.dev-endpoint/yarn-endpoint-address :portkey.aws.glue.dev-endpoint/subnet-id :portkey.aws.glue.dev-endpoint/private-address :portkey.aws.glue.dev-endpoint/extra-jars-s-3-path :portkey.aws.glue/role-arn :portkey.aws.glue.dev-endpoint/number-of-nodes :portkey.aws.glue.dev-endpoint/last-update-status :portkey.aws.glue.dev-endpoint/availability-zone :portkey.aws.glue.dev-endpoint/status :portkey.aws.glue.dev-endpoint/endpoint-name :portkey.aws.glue.dev-endpoint/public-keys :portkey.aws.glue.dev-endpoint/last-modified-timestamp :portkey.aws.glue.dev-endpoint/vpc-id :portkey.aws.glue.dev-endpoint/failure-reason :portkey.aws.glue.dev-endpoint/security-configuration :portkey.aws.glue.dev-endpoint/public-address :portkey.aws.glue.dev-endpoint/extra-python-libs-s-3-path :portkey.aws.glue.dev-endpoint/public-key]))

(clojure.spec.alpha/def :portkey.aws.glue/delete-security-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/table-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.get-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.create-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/database-input] :opt-un [:portkey.aws.glue.create-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.job-run/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/arguments (clojure.spec.alpha/and :portkey.aws.glue/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/last-modified-on (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/error-message (clojure.spec.alpha/and :portkey.aws.glue/error-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/predecessor-runs (clojure.spec.alpha/and :portkey.aws.glue/predecessor-list))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/trigger-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/attempt (clojure.spec.alpha/and :portkey.aws.glue/attempt-count))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/log-group-name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/previous-run-id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/started-on (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/completed-on (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-run/id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue/job-run (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.job-run/allocated-capacity :portkey.aws.glue/timeout :portkey.aws.glue/execution-time :portkey.aws.glue.job-run/arguments :portkey.aws.glue.job-run/job-name :portkey.aws.glue.job-run/last-modified-on :portkey.aws.glue.job-run/error-message :portkey.aws.glue.job-run/predecessor-runs :portkey.aws.glue.job-run/trigger-name :portkey.aws.glue.job-run/attempt :portkey.aws.glue.job-run/security-configuration :portkey.aws.glue.job-run/log-group-name :portkey.aws.glue.job-run/previous-run-id :portkey.aws.glue.job-run/started-on :portkey.aws.glue/notification-property :portkey.aws.glue.job-run/completed-on :portkey.aws.glue.job-run/id :portkey.aws.glue/job-run-state]))

(clojure.spec.alpha/def :portkey.aws.glue.connection/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.connection/last-updated-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.connection/creation-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.connection/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.connection/last-updated-by (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/connection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/physical-connection-requirements :portkey.aws.glue.connection/description :portkey.aws.glue/connection-properties :portkey.aws.glue.connection/last-updated-time :portkey.aws.glue/connection-type :portkey.aws.glue.connection/creation-time :portkey.aws.glue.connection/name :portkey.aws.glue/match-criteria :portkey.aws.glue.connection/last-updated-by]))

(clojure.spec.alpha/def :portkey.aws.glue/crawler-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue/name-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue.create-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.create-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.get-mapping-request/source (clojure.spec.alpha/and :portkey.aws.glue/catalog-entry))
(clojure.spec.alpha/def :portkey.aws.glue.get-mapping-request/sinks (clojure.spec.alpha/and :portkey.aws.glue/catalog-entries))
(clojure.spec.alpha/def :portkey.aws.glue/get-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-mapping-request/source] :opt-un [:portkey.aws.glue.get-mapping-request/sinks :portkey.aws.glue/location]))

(clojure.spec.alpha/def :portkey.aws.glue/get-data-catalog-encryption-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/data-catalog-encryption-settings]))

(clojure.spec.alpha/def :portkey.aws.glue.start-crawler-schedule-request/crawler-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/start-crawler-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.start-crawler-schedule-request/crawler-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/create-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.operation-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/operation-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.operation-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/batch-stop-job-run-job-run-id-list (clojure.spec.alpha/coll-of :portkey.aws.glue/id-string :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-function-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-function-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-user-defined-function-request/function-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-user-defined-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-user-defined-function-request/database-name :portkey.aws.glue.get-user-defined-function-request/function-name] :opt-un [:portkey.aws.glue.get-user-defined-function-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/generic-map (clojure.spec.alpha/map-of :portkey.aws.glue/generic-string :portkey.aws.glue/generic-string))

(clojure.spec.alpha/def :portkey.aws.glue.get-databases-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-databases-response (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/database-list] :opt-un [:portkey.aws.glue.get-databases-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-request/classifiers (clojure.spec.alpha/and :portkey.aws.glue/classifier-name-list))
(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-request/description (clojure.spec.alpha/and :portkey.aws.glue/description-string-removable))
(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-request/targets (clojure.spec.alpha/and :portkey.aws.glue/crawler-targets))
(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-request/schedule (clojure.spec.alpha/and :portkey.aws.glue/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.update-crawler-request/configuration (clojure.spec.alpha/and :portkey.aws.glue/crawler-configuration))
(clojure.spec.alpha/def :portkey.aws.glue/update-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-crawler-request/name] :opt-un [:portkey.aws.glue.update-crawler-request/classifiers :portkey.aws.glue/database-name :portkey.aws.glue/crawler-security-configuration :portkey.aws.glue/role :portkey.aws.glue/table-prefix :portkey.aws.glue/schema-change-policy :portkey.aws.glue.update-crawler-request/description :portkey.aws.glue.update-crawler-request/targets :portkey.aws.glue.update-crawler-request/schedule :portkey.aws.glue.update-crawler-request/configuration]))

(clojure.spec.alpha/def :portkey.aws.glue/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.glue.delete-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-partition-request/partition-values (clojure.spec.alpha/and :portkey.aws.glue/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue/delete-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-partition-request/database-name :portkey.aws.glue.delete-partition-request/table-name :portkey.aws.glue.delete-partition-request/partition-values] :opt-un [:portkey.aws.glue.delete-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/delete-table-version-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/column-type-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 131072)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/user-defined-function-list (clojure.spec.alpha/coll-of :portkey.aws.glue/user-defined-function))

(clojure.spec.alpha/def :portkey.aws.glue/security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.glue/name-string :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.glue/bounded-partition-value-list (clojure.spec.alpha/coll-of :portkey.aws.glue/value-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue/trigger-type #{"CONDITIONAL" "ON_DEMAND" "SCHEDULED" :scheduled :on-demand :conditional})

(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-successful-submission/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-successful-submission/job-run-id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue/batch-stop-job-run-successful-submission (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-stop-job-run-successful-submission/job-name :portkey.aws.glue.batch-stop-job-run-successful-submission/job-run-id]))

(clojure.spec.alpha/def :portkey.aws.glue.delete-table-version-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-table-version-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-table-version-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.delete-table-version-request/version-id (clojure.spec.alpha/and :portkey.aws.glue/version-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-table-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-table-version-request/database-name :portkey.aws.glue.delete-table-version-request/table-name :portkey.aws.glue.delete-table-version-request/version-id] :opt-un [:portkey.aws.glue.delete-table-version-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/total-segments-integer (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.glue/table-errors (clojure.spec.alpha/coll-of :portkey.aws.glue/table-error))

(clojure.spec.alpha/def :portkey.aws.glue/field-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.update-xml-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-xml-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-xml-classifier-request/name] :opt-un [:portkey.aws.glue/classification :portkey.aws.glue/row-tag]))

(clojure.spec.alpha/def :portkey.aws.glue/language #{:scala "PYTHON" :python "SCALA"})

(clojure.spec.alpha/def :portkey.aws.glue.connections-list/connections (clojure.spec.alpha/and :portkey.aws.glue/string-list))
(clojure.spec.alpha/def :portkey.aws.glue/connections-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.connections-list/connections]))

(clojure.spec.alpha/def :portkey.aws.glue/max-retries clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glue/delete-user-defined-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/update-crawler-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.condition/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.condition/state (clojure.spec.alpha/and :portkey.aws.glue/job-run-state))
(clojure.spec.alpha/def :portkey.aws.glue/condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/logical-operator :portkey.aws.glue.condition/job-name :portkey.aws.glue.condition/state]))

(clojure.spec.alpha/def :portkey.aws.glue/schedule-state #{"SCHEDULED" "TRANSITIONING" :not-scheduled "NOT_SCHEDULED" :transitioning :scheduled})

(clojure.spec.alpha/def :portkey.aws.glue.partition-error/partition-values (clojure.spec.alpha/and :portkey.aws.glue/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue/partition-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.partition-error/partition-values :portkey.aws.glue/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue/execution-property (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/max-concurrent-runs]))

(clojure.spec.alpha/def :portkey.aws.glue/get-plan-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/python-script :portkey.aws.glue/scala-code]))

(clojure.spec.alpha/def :portkey.aws.glue.delete-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-crawler-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.update-job-request/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-job-request/job-name :portkey.aws.glue/job-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.connection-input/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.connection-input/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue/connection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.connection-input/name :portkey.aws.glue/connection-type :portkey.aws.glue/connection-properties] :opt-un [:portkey.aws.glue.connection-input/description :portkey.aws.glue/match-criteria :portkey.aws.glue/physical-connection-requirements]))

(clojure.spec.alpha/def :portkey.aws.glue/get-security-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/security-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.create-security-configuration-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-security-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-security-configuration-request/name :portkey.aws.glue/encryption-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.delete-job-request/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.delete-job-request/job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.schedule/schedule-expression (clojure.spec.alpha/and :portkey.aws.glue/cron-expression))
(clojure.spec.alpha/def :portkey.aws.glue.schedule/state (clojure.spec.alpha/and :portkey.aws.glue/schedule-state))
(clojure.spec.alpha/def :portkey.aws.glue/schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.schedule/schedule-expression :portkey.aws.glue.schedule/state]))

(clojure.spec.alpha/def :portkey.aws.glue/delete-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/grok-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.glue/batch-get-partition-value-list (clojure.spec.alpha/coll-of :portkey.aws.glue/partition-value-list :min-count 0 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.glue/create-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-table-request/tables-to-delete (clojure.spec.alpha/and :portkey.aws.glue/batch-delete-table-name-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.batch-delete-table-request/database-name :portkey.aws.glue.batch-delete-table-request/tables-to-delete] :opt-un [:portkey.aws.glue.batch-delete-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.job/allocated-capacity (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.job/log-uri (clojure.spec.alpha/and :portkey.aws.glue/uri-string))
(clojure.spec.alpha/def :portkey.aws.glue.job/default-arguments (clojure.spec.alpha/and :portkey.aws.glue/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.job/last-modified-on (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue.job/connections (clojure.spec.alpha/and :portkey.aws.glue/connections-list))
(clojure.spec.alpha/def :portkey.aws.glue.job/role (clojure.spec.alpha/and :portkey.aws.glue/role-string))
(clojure.spec.alpha/def :portkey.aws.glue.job/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.job/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.job/command (clojure.spec.alpha/and :portkey.aws.glue/job-command))
(clojure.spec.alpha/def :portkey.aws.glue.job/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.job/created-on (clojure.spec.alpha/and :portkey.aws.glue/timestamp-value))
(clojure.spec.alpha/def :portkey.aws.glue/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.job/allocated-capacity :portkey.aws.glue/timeout :portkey.aws.glue.job/log-uri :portkey.aws.glue.job/default-arguments :portkey.aws.glue.job/last-modified-on :portkey.aws.glue.job/connections :portkey.aws.glue.job/role :portkey.aws.glue.job/description :portkey.aws.glue.job/security-configuration :portkey.aws.glue.job/command :portkey.aws.glue/max-retries :portkey.aws.glue/execution-property :portkey.aws.glue.job/name :portkey.aws.glue.job/created-on :portkey.aws.glue/notification-property]))

(clojure.spec.alpha/def :portkey.aws.glue.delete-trigger-response/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/delete-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.delete-trigger-response/name]))

(clojure.spec.alpha/def :portkey.aws.glue.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/cloud-watch-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/cloud-watch-encryption-mode :portkey.aws.glue/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.glue/get-trigger-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/trigger]))

(clojure.spec.alpha/def :portkey.aws.glue/get-dataflow-graph-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/dag-nodes :portkey.aws.glue/dag-edges]))

(clojure.spec.alpha/def :portkey.aws.glue/create-database-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/database-list (clojure.spec.alpha/coll-of :portkey.aws.glue/database))

(clojure.spec.alpha/def :portkey.aws.glue.stop-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/stop-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.stop-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.get-dev-endpoint-request/endpoint-name (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-dev-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-dev-endpoint-request/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/update-behavior #{:update-in-database "UPDATE_IN_DATABASE" :log "LOG"})

(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.batch-delete-partition-request/partitions-to-delete (clojure.spec.alpha/and :portkey.aws.glue/batch-delete-partition-value-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.batch-delete-partition-request/database-name :portkey.aws.glue.batch-delete-partition-request/table-name :portkey.aws.glue.batch-delete-partition-request/partitions-to-delete] :opt-un [:portkey.aws.glue.batch-delete-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.catalog-import-status/import-completed (clojure.spec.alpha/and :portkey.aws.glue/boolean))
(clojure.spec.alpha/def :portkey.aws.glue.catalog-import-status/import-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.catalog-import-status/imported-by (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/catalog-import-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.catalog-import-status/import-completed :portkey.aws.glue.catalog-import-status/import-time :portkey.aws.glue.catalog-import-status/imported-by]))

(clojure.spec.alpha/def :portkey.aws.glue.table/view-expanded-text (clojure.spec.alpha/and :portkey.aws.glue/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue.table/update-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.table/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.table/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.table/created-by (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.table/partition-keys (clojure.spec.alpha/and :portkey.aws.glue/column-list))
(clojure.spec.alpha/def :portkey.aws.glue.table/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.table/owner (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.table/table-type (clojure.spec.alpha/and :portkey.aws.glue/table-type-string))
(clojure.spec.alpha/def :portkey.aws.glue.table/create-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.table/last-access-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.table/retention (clojure.spec.alpha/and :portkey.aws.glue/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.glue.table/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.table/last-analyzed-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue.table/view-original-text (clojure.spec.alpha/and :portkey.aws.glue/view-text-string))
(clojure.spec.alpha/def :portkey.aws.glue/table (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.table/name] :opt-un [:portkey.aws.glue.table/view-expanded-text :portkey.aws.glue.table/update-time :portkey.aws.glue.table/database-name :portkey.aws.glue.table/parameters :portkey.aws.glue/storage-descriptor :portkey.aws.glue.table/created-by :portkey.aws.glue.table/partition-keys :portkey.aws.glue.table/description :portkey.aws.glue.table/owner :portkey.aws.glue.table/table-type :portkey.aws.glue.table/create-time :portkey.aws.glue.table/last-access-time :portkey.aws.glue.table/retention :portkey.aws.glue.table/last-analyzed-time :portkey.aws.glue.table/view-original-text]))

(clojure.spec.alpha/def :portkey.aws.glue.concurrent-runs-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/concurrent-runs-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.concurrent-runs-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.get-partition-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-partition-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-partition-request/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-partition-request/partition-values (clojure.spec.alpha/and :portkey.aws.glue/value-string-list))
(clojure.spec.alpha/def :portkey.aws.glue/get-partition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-partition-request/database-name :portkey.aws.glue.get-partition-request/table-name :portkey.aws.glue.get-partition-request/partition-values] :opt-un [:portkey.aws.glue.get-partition-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/logical-operator #{:equals "EQUALS"})

(clojure.spec.alpha/def :portkey.aws.glue/create-script-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/dag-nodes :portkey.aws.glue/dag-edges :portkey.aws.glue/language]))

(clojure.spec.alpha/def :portkey.aws.glue/dynamo-db-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/path]))

(clojure.spec.alpha/def :portkey.aws.glue.crawler-stopping-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/crawler-stopping-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.crawler-stopping-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/put-data-catalog-encryption-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/notification-property (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/notify-delay-after]))

(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-table-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue/name-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue/delete-connection-name-list (clojure.spec.alpha/coll-of :portkey.aws.glue/name-string :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.glue.create-classifier-request/grok-classifier (clojure.spec.alpha/and :portkey.aws.glue/create-grok-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.create-classifier-request/xml-classifier (clojure.spec.alpha/and :portkey.aws.glue/create-xml-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.create-classifier-request/json-classifier (clojure.spec.alpha/and :portkey.aws.glue/create-json-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue/create-classifier-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.create-classifier-request/grok-classifier :portkey.aws.glue.create-classifier-request/xml-classifier :portkey.aws.glue.create-classifier-request/json-classifier]))

(clojure.spec.alpha/def :portkey.aws.glue.table-error/table-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/table-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.table-error/table-name :portkey.aws.glue/error-detail]))

(clojure.spec.alpha/def :portkey.aws.glue.action/job-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.action/arguments (clojure.spec.alpha/and :portkey.aws.glue/generic-map))
(clojure.spec.alpha/def :portkey.aws.glue.action/security-configuration (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.action/job-name :portkey.aws.glue.action/arguments :portkey.aws.glue/timeout :portkey.aws.glue/notification-property :portkey.aws.glue.action/security-configuration]))

(clojure.spec.alpha/def :portkey.aws.glue.get-catalog-import-status-response/import-status (clojure.spec.alpha/and :portkey.aws.glue/catalog-import-status))
(clojure.spec.alpha/def :portkey.aws.glue/get-catalog-import-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-catalog-import-status-response/import-status]))

(clojure.spec.alpha/def :portkey.aws.glue.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.entity-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/entity-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.entity-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.update-json-classifier-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/update-json-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.update-json-classifier-request/name] :opt-un [:portkey.aws.glue/json-path]))

(clojure.spec.alpha/def :portkey.aws.glue/match-criteria (clojure.spec.alpha/coll-of :portkey.aws.glue/name-string :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.glue.create-table-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.create-table-request/database-name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/create-table-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.create-table-request/database-name :portkey.aws.glue/table-input] :opt-un [:portkey.aws.glue.create-table-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue.predicate/conditions (clojure.spec.alpha/and :portkey.aws.glue/condition-list))
(clojure.spec.alpha/def :portkey.aws.glue/predicate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/logical :portkey.aws.glue.predicate/conditions]))

(clojure.spec.alpha/def :portkey.aws.glue.update-classifier-request/grok-classifier (clojure.spec.alpha/and :portkey.aws.glue/update-grok-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.update-classifier-request/xml-classifier (clojure.spec.alpha/and :portkey.aws.glue/update-xml-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue.update-classifier-request/json-classifier (clojure.spec.alpha/and :portkey.aws.glue/update-json-classifier-request))
(clojure.spec.alpha/def :portkey.aws.glue/update-classifier-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.update-classifier-request/grok-classifier :portkey.aws.glue.update-classifier-request/xml-classifier :portkey.aws.glue.update-classifier-request/json-classifier]))

(clojure.spec.alpha/def :portkey.aws.glue.get-database-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-database-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/get-database-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.get-database-request/name] :opt-un [:portkey.aws.glue.get-database-request/catalog-id]))

(clojure.spec.alpha/def :portkey.aws.glue/mapping-list (clojure.spec.alpha/coll-of :portkey.aws.glue/mapping-entry))

(clojure.spec.alpha/def :portkey.aws.glue/batch-delete-table-version-list (clojure.spec.alpha/coll-of :portkey.aws.glue/version-string :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.glue/dev-endpoint-list (clojure.spec.alpha/coll-of :portkey.aws.glue/dev-endpoint))

(clojure.spec.alpha/def :portkey.aws.glue/reset-job-bookmark-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue/job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.get-table-versions-response/table-versions (clojure.spec.alpha/and :portkey.aws.glue/get-table-versions-list))
(clojure.spec.alpha/def :portkey.aws.glue.get-table-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-table-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-table-versions-response/table-versions :portkey.aws.glue.get-table-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue.get-connections-request/catalog-id (clojure.spec.alpha/and :portkey.aws.glue/catalog-id-string))
(clojure.spec.alpha/def :portkey.aws.glue.get-connections-request/filter (clojure.spec.alpha/and :portkey.aws.glue/get-connections-filter))
(clojure.spec.alpha/def :portkey.aws.glue.get-connections-request/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue.get-connections-request/max-results (clojure.spec.alpha/and :portkey.aws.glue/page-size))
(clojure.spec.alpha/def :portkey.aws.glue/get-connections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.get-connections-request/catalog-id :portkey.aws.glue.get-connections-request/filter :portkey.aws.glue.get-connections-request/next-token :portkey.aws.glue.get-connections-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.glue.scheduler-running-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/scheduler-running-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.scheduler-running-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue.database/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.database/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.database/location-uri (clojure.spec.alpha/and :portkey.aws.glue/uri))
(clojure.spec.alpha/def :portkey.aws.glue.database/parameters (clojure.spec.alpha/and :portkey.aws.glue/parameters-map))
(clojure.spec.alpha/def :portkey.aws.glue.database/create-time (clojure.spec.alpha/and :portkey.aws.glue/timestamp))
(clojure.spec.alpha/def :portkey.aws.glue/database (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.database/name] :opt-un [:portkey.aws.glue.database/description :portkey.aws.glue.database/location-uri :portkey.aws.glue.database/parameters :portkey.aws.glue.database/create-time]))

(clojure.spec.alpha/def :portkey.aws.glue/job-run-state #{:starting "TIMEOUT" :running :stopping :stopped "SUCCEEDED" "STOPPED" "STARTING" "FAILED" :timeout "STOPPING" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.glue/cloud-watch-encryption-mode #{"DISABLED" :disabled :ssekms "SSE-KMS"})

(clojure.spec.alpha/def :portkey.aws.glue/integer-flag (clojure.spec.alpha/int-in 0 1))

(clojure.spec.alpha/def :portkey.aws.glue.trigger/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue.trigger/id (clojure.spec.alpha/and :portkey.aws.glue/id-string))
(clojure.spec.alpha/def :portkey.aws.glue.trigger/type (clojure.spec.alpha/and :portkey.aws.glue/trigger-type))
(clojure.spec.alpha/def :portkey.aws.glue.trigger/state (clojure.spec.alpha/and :portkey.aws.glue/trigger-state))
(clojure.spec.alpha/def :portkey.aws.glue.trigger/description (clojure.spec.alpha/and :portkey.aws.glue/description-string))
(clojure.spec.alpha/def :portkey.aws.glue.trigger/schedule (clojure.spec.alpha/and :portkey.aws.glue/generic-string))
(clojure.spec.alpha/def :portkey.aws.glue.trigger/actions (clojure.spec.alpha/and :portkey.aws.glue/action-list))
(clojure.spec.alpha/def :portkey.aws.glue/trigger (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.trigger/name :portkey.aws.glue.trigger/id :portkey.aws.glue.trigger/type :portkey.aws.glue.trigger/state :portkey.aws.glue.trigger/description :portkey.aws.glue.trigger/schedule :portkey.aws.glue.trigger/actions :portkey.aws.glue/predicate]))

(clojure.spec.alpha/def :portkey.aws.glue.stop-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/stop-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.stop-crawler-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.glue-encryption-exception/message (clojure.spec.alpha/and :portkey.aws.glue/message-string))
(clojure.spec.alpha/def :portkey.aws.glue/glue-encryption-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.glue-encryption-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glue/connection-property-key #{:config-files :jdbc-driver-jar-uri "JDBC_CONNECTION_URL" "USERNAME" :jdbc-engine-version :jdbc-enforce-ssl :password :jdbc-engine "INSTANCE_ID" :username "JDBC_DRIVER_JAR_URI" "CONFIG_FILES" :port "JDBC_ENGINE_VERSION" "PASSWORD" :instance-id :host :jdbc-connection-url "HOST" "JDBC_ENGINE" :jdbc-driver-class-name "JDBC_ENFORCE_SSL" "PORT" "JDBC_DRIVER_CLASS_NAME"})

(clojure.spec.alpha/def :portkey.aws.glue.get-connections-response/next-token (clojure.spec.alpha/and :portkey.aws.glue/token))
(clojure.spec.alpha/def :portkey.aws.glue/get-connections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/connection-list :portkey.aws.glue.get-connections-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.glue/start-crawler-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/batch-stop-job-run-error-list (clojure.spec.alpha/coll-of :portkey.aws.glue/batch-stop-job-run-error))

(clojure.spec.alpha/def :portkey.aws.glue.job-bookmark-entry/version (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-bookmark-entry/run (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-bookmark-entry/attempt (clojure.spec.alpha/and :portkey.aws.glue/integer-value))
(clojure.spec.alpha/def :portkey.aws.glue.job-bookmark-entry/job-bookmark (clojure.spec.alpha/and :portkey.aws.glue/json-value))
(clojure.spec.alpha/def :portkey.aws.glue/job-bookmark-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue/job-name :portkey.aws.glue.job-bookmark-entry/version :portkey.aws.glue.job-bookmark-entry/run :portkey.aws.glue.job-bookmark-entry/attempt :portkey.aws.glue.job-bookmark-entry/job-bookmark]))

(clojure.spec.alpha/def :portkey.aws.glue/stop-crawler-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/delete-partition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/start-crawler-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-response/successful-submissions (clojure.spec.alpha/and :portkey.aws.glue/batch-stop-job-run-successful-submission-list))
(clojure.spec.alpha/def :portkey.aws.glue.batch-stop-job-run-response/errors (clojure.spec.alpha/and :portkey.aws.glue/batch-stop-job-run-error-list))
(clojure.spec.alpha/def :portkey.aws.glue/batch-stop-job-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glue.batch-stop-job-run-response/successful-submissions :portkey.aws.glue.batch-stop-job-run-response/errors]))

(clojure.spec.alpha/def :portkey.aws.glue/code-gen-node-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glue.start-trigger-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/start-trigger-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.start-trigger-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glue/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glue.start-crawler-request/name (clojure.spec.alpha/and :portkey.aws.glue/name-string))
(clojure.spec.alpha/def :portkey.aws.glue/start-crawler-request (clojure.spec.alpha/keys :req-un [:portkey.aws.glue.start-crawler-request/name] :opt-un []))

(clojure.core/defn get-user-defined-function ([get-user-defined-function-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-user-defined-function-request get-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetUserDefinedFunction", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-user-defined-function-response))

(clojure.core/defn start-job-run ([start-job-run-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-job-run-request start-job-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/start-job-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/start-job-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartJobRun", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "ConcurrentRunsExceededException" :portkey.aws.glue/concurrent-runs-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-job-run :args (clojure.spec.alpha/tuple :portkey.aws.glue/start-job-run-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/start-job-run-response))

(clojure.core/defn delete-security-configuration ([delete-security-configuration-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-security-configuration-request delete-security-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-security-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-security-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSecurityConfiguration", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-security-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-security-configuration-response))

(clojure.core/defn get-connections ([] (get-connections {})) ([get-connections-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-connections-request get-connections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-connections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-connections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetConnections", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-connections :args (clojure.spec.alpha/? :portkey.aws.glue/get-connections-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-connections-response))

(clojure.core/defn create-trigger ([create-trigger-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-trigger-request create-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTrigger", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "IdempotentParameterMismatchException" :portkey.aws.glue/idempotent-parameter-mismatch-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.glue/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-trigger-response))

(clojure.core/defn get-triggers ([] (get-triggers {})) ([get-triggers-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-triggers-request get-triggers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-triggers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-triggers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTriggers", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-triggers :args (clojure.spec.alpha/? :portkey.aws.glue/get-triggers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-triggers-response))

(clojure.core/defn stop-trigger ([stop-trigger-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-trigger-request stop-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/stop-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/stop-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopTrigger", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef stop-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue/stop-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/stop-trigger-response))

(clojure.core/defn update-table ([update-table-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-table-request update-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTable", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue/concurrent-modification-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-table :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-table-response))

(clojure.core/defn get-jobs ([] (get-jobs {})) ([get-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-jobs-request get-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobs", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-jobs :args (clojure.spec.alpha/? :portkey.aws.glue/get-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-jobs-response))

(clojure.core/defn update-partition ([update-partition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-partition-request update-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePartition", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-partition-response))

(clojure.core/defn start-trigger ([start-trigger-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-trigger-request start-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/start-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/start-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartTrigger", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "ConcurrentRunsExceededException" :portkey.aws.glue/concurrent-runs-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue/start-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/start-trigger-response))

(clojure.core/defn create-partition ([create-partition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-partition-request create-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePartition", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-partition-response))

(clojure.core/defn get-tables ([get-tables-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-tables-request get-tables-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-tables-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-tables-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTables", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-tables :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-tables-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-tables-response))

(clojure.core/defn update-user-defined-function ([update-user-defined-function-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-user-defined-function-request update-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserDefinedFunction", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-user-defined-function-response))

(clojure.core/defn update-connection ([update-connection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-connection-request update-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConnection", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-connection-response))

(clojure.core/defn get-plan ([get-plan-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-plan-request get-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPlan", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-plan :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-plan-response))

(clojure.core/defn batch-get-partition ([batch-get-partition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-get-partition-request batch-get-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/batch-get-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/batch-get-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetPartition", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef batch-get-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue/batch-get-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/batch-get-partition-response))

(clojure.core/defn batch-delete-connection ([batch-delete-connection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-delete-connection-request batch-delete-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/batch-delete-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/batch-delete-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeleteConnection", :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue/batch-delete-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/batch-delete-connection-response))

(clojure.core/defn delete-dev-endpoint ([delete-dev-endpoint-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-dev-endpoint-request delete-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDevEndpoint", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception}})))))
(clojure.spec.alpha/fdef delete-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-dev-endpoint-response))

(clojure.core/defn create-dev-endpoint ([create-dev-endpoint-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-dev-endpoint-request create-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDevEndpoint", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.glue/access-denied-exception, "AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "IdempotentParameterMismatchException" :portkey.aws.glue/idempotent-parameter-mismatch-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "ValidationException" :portkey.aws.glue/validation-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-dev-endpoint-response))

(clojure.core/defn get-dev-endpoint ([get-dev-endpoint-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-dev-endpoint-request get-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDevEndpoint", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-dev-endpoint-response))

(clojure.core/defn get-crawlers ([] (get-crawlers {})) ([get-crawlers-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-crawlers-request get-crawlers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-crawlers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-crawlers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCrawlers", :http.request.spec/error-spec {"OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-crawlers :args (clojure.spec.alpha/? :portkey.aws.glue/get-crawlers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-crawlers-response))

(clojure.core/defn create-table ([create-table-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-table-request create-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTable", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-table :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-table-response))

(clojure.core/defn create-script ([] (create-script {})) ([create-script-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-script-request create-script-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-script-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-script-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateScript", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef create-script :args (clojure.spec.alpha/? :portkey.aws.glue/create-script-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-script-response))

(clojure.core/defn get-crawler ([get-crawler-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-crawler-request get-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCrawler", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-crawler-response))

(clojure.core/defn update-dev-endpoint ([update-dev-endpoint-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-dev-endpoint-request update-dev-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-dev-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-dev-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDevEndpoint", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "ValidationException" :portkey.aws.glue/validation-exception}})))))
(clojure.spec.alpha/fdef update-dev-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-dev-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-dev-endpoint-response))

(clojure.core/defn batch-delete-partition ([batch-delete-partition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-delete-partition-request batch-delete-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/batch-delete-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/batch-delete-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeletePartition", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue/batch-delete-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/batch-delete-partition-response))

(clojure.core/defn create-security-configuration ([create-security-configuration-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-security-configuration-request create-security-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-security-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-security-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSecurityConfiguration", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-security-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-security-configuration-response))

(clojure.core/defn get-trigger ([get-trigger-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-trigger-request get-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrigger", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-trigger-response))

(clojure.core/defn stop-crawler ([stop-crawler-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-crawler-request stop-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/stop-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/stop-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopCrawler", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "CrawlerNotRunningException" :portkey.aws.glue/crawler-not-running-exception, "CrawlerStoppingException" :portkey.aws.glue/crawler-stopping-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef stop-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue/stop-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/stop-crawler-response))

(clojure.core/defn import-catalog-to-glue ([] (import-catalog-to-glue {})) ([import-catalog-to-glue-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-import-catalog-to-glue-request import-catalog-to-glue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/import-catalog-to-glue-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/import-catalog-to-glue-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportCatalogToGlue", :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef import-catalog-to-glue :args (clojure.spec.alpha/? :portkey.aws.glue/import-catalog-to-glue-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/import-catalog-to-glue-response))

(clojure.core/defn create-connection ([create-connection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-connection-request create-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateConnection", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-connection-response))

(clojure.core/defn update-crawler-schedule ([update-crawler-schedule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-crawler-schedule-request update-crawler-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-crawler-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-crawler-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCrawlerSchedule", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "VersionMismatchException" :portkey.aws.glue/version-mismatch-exception, "SchedulerTransitioningException" :portkey.aws.glue/scheduler-transitioning-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef update-crawler-schedule :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-crawler-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-crawler-schedule-response))

(clojure.core/defn get-job-runs ([get-job-runs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-job-runs-request get-job-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-job-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-job-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobRuns", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-job-runs :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-job-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-job-runs-response))

(clojure.core/defn get-partition ([get-partition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-partition-request get-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPartition", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-partition-response))

(clojure.core/defn get-database ([get-database-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-database-request get-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDatabase", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-database :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-database-response))

(clojure.core/defn get-table-versions ([get-table-versions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-table-versions-request get-table-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-table-versions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-table-versions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTableVersions", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-table-versions :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-table-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-table-versions-response))

(clojure.core/defn reset-job-bookmark ([reset-job-bookmark-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-reset-job-bookmark-request reset-job-bookmark-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/reset-job-bookmark-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/reset-job-bookmark-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResetJobBookmark", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef reset-job-bookmark :args (clojure.spec.alpha/tuple :portkey.aws.glue/reset-job-bookmark-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/reset-job-bookmark-response))

(clojure.core/defn get-dev-endpoints ([] (get-dev-endpoints {})) ([get-dev-endpoints-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-dev-endpoints-request get-dev-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-dev-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-dev-endpoints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDevEndpoints", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-dev-endpoints :args (clojure.spec.alpha/? :portkey.aws.glue/get-dev-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-dev-endpoints-response))

(clojure.core/defn delete-table-version ([delete-table-version-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-table-version-request delete-table-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-table-version-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-table-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTableVersion", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-table-version :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-table-version-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-table-version-response))

(clojure.core/defn get-mapping ([get-mapping-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-mapping-request get-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-mapping-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-mapping-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMapping", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef get-mapping :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-mapping-response))

(clojure.core/defn create-database ([create-database-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-database-request create-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDatabase", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-database :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-database-response))

(clojure.core/defn get-data-catalog-encryption-settings ([] (get-data-catalog-encryption-settings {})) ([get-data-catalog-encryption-settings-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-data-catalog-encryption-settings-request get-data-catalog-encryption-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-data-catalog-encryption-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-data-catalog-encryption-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDataCatalogEncryptionSettings", :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue/internal-service-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-data-catalog-encryption-settings :args (clojure.spec.alpha/? :portkey.aws.glue/get-data-catalog-encryption-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-data-catalog-encryption-settings-response))

(clojure.core/defn delete-crawler ([delete-crawler-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-crawler-request delete-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCrawler", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "CrawlerRunningException" :portkey.aws.glue/crawler-running-exception, "SchedulerTransitioningException" :portkey.aws.glue/scheduler-transitioning-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-crawler-response))

(clojure.core/defn get-catalog-import-status ([] (get-catalog-import-status {})) ([get-catalog-import-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-catalog-import-status-request get-catalog-import-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-catalog-import-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-catalog-import-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCatalogImportStatus", :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-catalog-import-status :args (clojure.spec.alpha/? :portkey.aws.glue/get-catalog-import-status-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-catalog-import-status-response))

(clojure.core/defn get-dataflow-graph ([] (get-dataflow-graph {})) ([get-dataflow-graph-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-dataflow-graph-request get-dataflow-graph-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-dataflow-graph-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-dataflow-graph-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDataflowGraph", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-dataflow-graph :args (clojure.spec.alpha/? :portkey.aws.glue/get-dataflow-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-dataflow-graph-response))

(clojure.core/defn get-table ([get-table-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-table-request get-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTable", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-table :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-table-response))

(clojure.core/defn create-crawler ([create-crawler-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-crawler-request create-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCrawler", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-crawler-response))

(clojure.core/defn start-crawler-schedule ([start-crawler-schedule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-crawler-schedule-request start-crawler-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/start-crawler-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/start-crawler-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartCrawlerSchedule", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "SchedulerRunningException" :portkey.aws.glue/scheduler-running-exception, "SchedulerTransitioningException" :portkey.aws.glue/scheduler-transitioning-exception, "NoScheduleException" :portkey.aws.glue/no-schedule-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef start-crawler-schedule :args (clojure.spec.alpha/tuple :portkey.aws.glue/start-crawler-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/start-crawler-schedule-response))

(clojure.core/defn batch-delete-table ([batch-delete-table-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-delete-table-request batch-delete-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/batch-delete-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/batch-delete-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeleteTable", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-table :args (clojure.spec.alpha/tuple :portkey.aws.glue/batch-delete-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/batch-delete-table-response))

(clojure.core/defn batch-create-partition ([batch-create-partition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-create-partition-request batch-create-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/batch-create-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/batch-create-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchCreatePartition", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef batch-create-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue/batch-create-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/batch-create-partition-response))

(clojure.core/defn update-crawler ([update-crawler-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-crawler-request update-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCrawler", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "VersionMismatchException" :portkey.aws.glue/version-mismatch-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "CrawlerRunningException" :portkey.aws.glue/crawler-running-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef update-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-crawler-response))

(clojure.core/defn delete-trigger ([delete-trigger-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-trigger-request delete-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrigger", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-trigger-response))

(clojure.core/defn get-user-defined-functions ([get-user-defined-functions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-user-defined-functions-request get-user-defined-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-user-defined-functions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-user-defined-functions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetUserDefinedFunctions", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-user-defined-functions :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-user-defined-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-user-defined-functions-response))

(clojure.core/defn get-partitions ([get-partitions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-partitions-request get-partitions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-partitions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-partitions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPartitions", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-partitions :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-partitions-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-partitions-response))

(clojure.core/defn start-crawler ([start-crawler-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-crawler-request start-crawler-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/start-crawler-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/start-crawler-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartCrawler", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "CrawlerRunningException" :portkey.aws.glue/crawler-running-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef start-crawler :args (clojure.spec.alpha/tuple :portkey.aws.glue/start-crawler-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/start-crawler-response))

(clojure.core/defn get-classifiers ([] (get-classifiers {})) ([get-classifiers-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-classifiers-request get-classifiers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-classifiers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-classifiers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetClassifiers", :http.request.spec/error-spec {"OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-classifiers :args (clojure.spec.alpha/? :portkey.aws.glue/get-classifiers-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-classifiers-response))

(clojure.core/defn delete-partition ([delete-partition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-partition-request delete-partition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-partition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-partition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePartition", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-partition :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-partition-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-partition-response))

(clojure.core/defn get-security-configuration ([get-security-configuration-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-security-configuration-request get-security-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-security-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-security-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSecurityConfiguration", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-security-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-security-configuration-response))

(clojure.core/defn batch-delete-table-version ([batch-delete-table-version-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-delete-table-version-request batch-delete-table-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/batch-delete-table-version-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/batch-delete-table-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeleteTableVersion", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-delete-table-version :args (clojure.spec.alpha/tuple :portkey.aws.glue/batch-delete-table-version-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/batch-delete-table-version-response))

(clojure.core/defn delete-connection ([delete-connection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-connection-request delete-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConnection", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-connection-response))

(clojure.core/defn get-table-version ([get-table-version-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-table-version-request get-table-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-table-version-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-table-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTableVersion", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-table-version :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-table-version-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-table-version-response))

(clojure.core/defn create-job ([create-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-job-request create-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateJob", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "IdempotentParameterMismatchException" :portkey.aws.glue/idempotent-parameter-mismatch-exception, "AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.glue/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-job-response))

(clojure.core/defn delete-job ([delete-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-job-request delete-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteJob", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-job :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-job-response))

(clojure.core/defn delete-classifier ([delete-classifier-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-classifier-request delete-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteClassifier", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-classifier :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-classifier-response))

(clojure.core/defn get-job ([get-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-job-request get-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJob", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-job :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-job-response))

(clojure.core/defn update-trigger ([update-trigger-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-trigger-request update-trigger-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-trigger-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-trigger-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrigger", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-trigger :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-trigger-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-trigger-response))

(clojure.core/defn delete-database ([delete-database-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-database-request delete-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDatabase", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-database :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-database-response))

(clojure.core/defn get-crawler-metrics ([] (get-crawler-metrics {})) ([get-crawler-metrics-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-crawler-metrics-request get-crawler-metrics-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-crawler-metrics-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-crawler-metrics-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCrawlerMetrics", :http.request.spec/error-spec {"OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-crawler-metrics :args (clojure.spec.alpha/? :portkey.aws.glue/get-crawler-metrics-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-crawler-metrics-response))

(clojure.core/defn update-job ([update-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-job-request update-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateJob", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ConcurrentModificationException" :portkey.aws.glue/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-job-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-job-response))

(clojure.core/defn get-job-run ([get-job-run-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-job-run-request get-job-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-job-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-job-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobRun", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-job-run :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-job-run-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-job-run-response))

(clojure.core/defn create-user-defined-function ([create-user-defined-function-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-user-defined-function-request create-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUserDefinedFunction", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "ResourceNumberLimitExceededException" :portkey.aws.glue/resource-number-limit-exceeded-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef create-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue/create-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-user-defined-function-response))

(clojure.core/defn delete-user-defined-function ([delete-user-defined-function-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-user-defined-function-request delete-user-defined-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-user-defined-function-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-user-defined-function-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUserDefinedFunction", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-user-defined-function :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-user-defined-function-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-user-defined-function-response))

(clojure.core/defn get-security-configurations ([] (get-security-configurations {})) ([get-security-configurations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-security-configurations-request get-security-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-security-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-security-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSecurityConfigurations", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-security-configurations :args (clojure.spec.alpha/? :portkey.aws.glue/get-security-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-security-configurations-response))

(clojure.core/defn create-classifier ([] (create-classifier {})) ([create-classifier-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-classifier-request create-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/create-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/create-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateClassifier", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.glue/already-exists-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef create-classifier :args (clojure.spec.alpha/? :portkey.aws.glue/create-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/create-classifier-response))

(clojure.core/defn update-database ([update-database-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-database-request update-database-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-database-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-database-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDatabase", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef update-database :args (clojure.spec.alpha/tuple :portkey.aws.glue/update-database-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-database-response))

(clojure.core/defn get-connection ([get-connection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-connection-request get-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetConnection", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-connection :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-connection-response))

(clojure.core/defn put-data-catalog-encryption-settings ([put-data-catalog-encryption-settings-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-data-catalog-encryption-settings-request put-data-catalog-encryption-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/put-data-catalog-encryption-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/put-data-catalog-encryption-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutDataCatalogEncryptionSettings", :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.glue/internal-service-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef put-data-catalog-encryption-settings :args (clojure.spec.alpha/tuple :portkey.aws.glue/put-data-catalog-encryption-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/put-data-catalog-encryption-settings-response))

(clojure.core/defn stop-crawler-schedule ([stop-crawler-schedule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-crawler-schedule-request stop-crawler-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/stop-crawler-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/stop-crawler-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopCrawlerSchedule", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "SchedulerNotRunningException" :portkey.aws.glue/scheduler-not-running-exception, "SchedulerTransitioningException" :portkey.aws.glue/scheduler-transitioning-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef stop-crawler-schedule :args (clojure.spec.alpha/tuple :portkey.aws.glue/stop-crawler-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/stop-crawler-schedule-response))

(clojure.core/defn update-classifier ([] (update-classifier {})) ([update-classifier-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-classifier-request update-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/update-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/update-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateClassifier", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "VersionMismatchException" :portkey.aws.glue/version-mismatch-exception, "EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef update-classifier :args (clojure.spec.alpha/? :portkey.aws.glue/update-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/update-classifier-response))

(clojure.core/defn get-databases ([] (get-databases {})) ([get-databases-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-databases-request get-databases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-databases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-databases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDatabases", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception, "GlueEncryptionException" :portkey.aws.glue/glue-encryption-exception}})))))
(clojure.spec.alpha/fdef get-databases :args (clojure.spec.alpha/? :portkey.aws.glue/get-databases-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-databases-response))

(clojure.core/defn batch-stop-job-run ([batch-stop-job-run-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-stop-job-run-request batch-stop-job-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/batch-stop-job-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/batch-stop-job-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchStopJobRun", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef batch-stop-job-run :args (clojure.spec.alpha/tuple :portkey.aws.glue/batch-stop-job-run-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/batch-stop-job-run-response))

(clojure.core/defn delete-table ([delete-table-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-table-request delete-table-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/delete-table-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/delete-table-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTable", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "InvalidInputException" :portkey.aws.glue/invalid-input-exception, "InternalServiceException" :portkey.aws.glue/internal-service-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef delete-table :args (clojure.spec.alpha/tuple :portkey.aws.glue/delete-table-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/delete-table-response))

(clojure.core/defn get-classifier ([get-classifier-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-classifier-request get-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.glue/endpoints, :http.request.spec/output-spec :portkey.aws.glue/get-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-31", :http.request.configuration/service-id "Glue", :http.request.spec/input-spec :portkey.aws.glue/get-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetClassifier", :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.glue/entity-not-found-exception, "OperationTimeoutException" :portkey.aws.glue/operation-timeout-exception}})))))
(clojure.spec.alpha/fdef get-classifier :args (clojure.spec.alpha/tuple :portkey.aws.glue/get-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.glue/get-classifier-response))
