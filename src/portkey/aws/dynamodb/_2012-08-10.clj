(ns portkey.aws.dynamodb.-2012-08-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "dynamodb", :region "ap-northeast-1"},
    :ssl-common-name "dynamodb.ap-northeast-1.amazonaws.com",
    :endpoint "https://dynamodb.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "dynamodb", :region "eu-west-1"},
    :ssl-common-name "dynamodb.eu-west-1.amazonaws.com",
    :endpoint "https://dynamodb.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "dynamodb", :region "us-east-2"},
    :ssl-common-name "dynamodb.us-east-2.amazonaws.com",
    :endpoint "https://dynamodb.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "dynamodb", :region "ap-southeast-2"},
    :ssl-common-name "dynamodb.ap-southeast-2.amazonaws.com",
    :endpoint "https://dynamodb.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "dynamodb", :region "cn-north-1"},
    :ssl-common-name "dynamodb.cn-north-1.amazonaws.com.cn",
    :endpoint "https://dynamodb.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "dynamodb", :region "sa-east-1"},
    :ssl-common-name "dynamodb.sa-east-1.amazonaws.com",
    :endpoint "https://dynamodb.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "dynamodb", :region "ap-southeast-1"},
    :ssl-common-name "dynamodb.ap-southeast-1.amazonaws.com",
    :endpoint "https://dynamodb.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "dynamodb", :region "cn-northwest-1"},
    :ssl-common-name "dynamodb.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://dynamodb.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "dynamodb", :region "ap-northeast-2"},
    :ssl-common-name "dynamodb.ap-northeast-2.amazonaws.com",
    :endpoint "https://dynamodb.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "dynamodb", :region "eu-west-3"},
    :ssl-common-name "dynamodb.eu-west-3.amazonaws.com",
    :endpoint "https://dynamodb.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1-fips"
   {:credential-scope {:service "dynamodb", :region "us-gov-west-1"},
    :ssl-common-name "dynamodb.us-gov-west-1.amazonaws.com",
    :endpoint "https://dynamodb.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "dynamodb", :region "ca-central-1"},
    :ssl-common-name "dynamodb.ca-central-1.amazonaws.com",
    :endpoint "https://dynamodb.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "dynamodb", :region "eu-central-1"},
    :ssl-common-name "dynamodb.eu-central-1.amazonaws.com",
    :endpoint "https://dynamodb.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "dynamodb", :region "eu-west-2"},
    :ssl-common-name "dynamodb.eu-west-2.amazonaws.com",
    :endpoint "https://dynamodb.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "dynamodb", :region "us-gov-west-1"},
    :ssl-common-name "dynamodb.us-gov-west-1.amazonaws.com",
    :endpoint "https://dynamodb.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "local"
   {:credential-scope {:service "dynamodb", :region "us-east-1"},
    :ssl-common-name "localhost:8000",
    :endpoint "http://localhost:8000",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "dynamodb", :region "us-west-2"},
    :ssl-common-name "dynamodb.us-west-2.amazonaws.com",
    :endpoint "https://dynamodb.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "dynamodb", :region "us-east-1"},
    :ssl-common-name "dynamodb.us-east-1.amazonaws.com",
    :endpoint "https://dynamodb.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "dynamodb", :region "us-west-1"},
    :ssl-common-name "dynamodb.us-west-1.amazonaws.com",
    :endpoint "https://dynamodb.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "dynamodb", :region "ap-south-1"},
    :ssl-common-name "dynamodb.ap-south-1.amazonaws.com",
    :endpoint "https://dynamodb.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-stream-specification)

(clojure.core/declare ser-double)

(clojure.core/declare ser-sse-enabled)

(clojure.core/declare ser-tag-value-string)

(clojure.core/declare ser-delete-global-secondary-index-action)

(clojure.core/declare ser-expected-attribute-value)

(clojure.core/declare ser-non-key-attribute-name-list)

(clojure.core/declare ser-expression-attribute-value-variable)

(clojure.core/declare ser-replica-settings-update-list)

(clojure.core/declare ser-point-in-time-recovery-specification)

(clojure.core/declare ser-time-range-upper-bound)

(clojure.core/declare ser-replica-update)

(clojure.core/declare ser-number-set-attribute-value)

(clojure.core/declare ser-number-attribute-value)

(clojure.core/declare ser-replica)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-delete-request)

(clojure.core/declare ser-attribute-action)

(clojure.core/declare ser-projection)

(clojure.core/declare ser-return-value)

(clojure.core/declare ser-time-to-live-specification)

(clojure.core/declare ser-auto-scaling-policy-name)

(clojure.core/declare ser-index-name)

(clojure.core/declare ser-attribute-definition)

(clojure.core/declare ser-positive-long-object)

(clojure.core/declare ser-key-list)

(clojure.core/declare ser-auto-scaling-target-tracking-scaling-policy-configuration-update)

(clojure.core/declare ser-expression-attribute-value-map)

(clojure.core/declare ser-key-expression)

(clojure.core/declare ser-non-key-attribute-name)

(clojure.core/declare ser-boolean-attribute-value)

(clojure.core/declare ser-attribute-updates)

(clojure.core/declare ser-attribute-definitions)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-update-global-secondary-index-action)

(clojure.core/declare ser-filter-condition-map)

(clojure.core/declare ser-global-table-global-secondary-index-settings-update)

(clojure.core/declare ser-null-attribute-value)

(clojure.core/declare ser-create-global-secondary-index-action)

(clojure.core/declare ser-global-secondary-index-update)

(clojure.core/declare ser-projection-type)

(clojure.core/declare ser-create-replica-action)

(clojure.core/declare ser-map-attribute-value)

(clojure.core/declare ser-global-table-global-secondary-index-settings-update-list)

(clojure.core/declare ser-replica-global-secondary-index-settings-update-list)

(clojure.core/declare ser-put-item-input-attribute-map)

(clojure.core/declare ser-key-schema)

(clojure.core/declare ser-write-requests)

(clojure.core/declare ser-keys-and-attributes)

(clojure.core/declare ser-date)

(clojure.core/declare ser-auto-scaling-settings-update)

(clojure.core/declare ser-kms-master-key-id)

(clojure.core/declare ser-binary-set-attribute-value)

(clojure.core/declare ser-consistent-read)

(clojure.core/declare ser-time-to-live-enabled)

(clojure.core/declare ser-backup-type-filter)

(clojure.core/declare ser-key)

(clojure.core/declare ser-tag-key-string)

(clojure.core/declare ser-region-name)

(clojure.core/declare ser-stream-view-type)

(clojure.core/declare ser-replica-settings-update)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-replica-global-secondary-index-settings-update)

(clojure.core/declare ser-return-consumed-capacity)

(clojure.core/declare ser-scan-segment)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-replica-list)

(clojure.core/declare ser-binary-attribute-value)

(clojure.core/declare ser-conditional-operator)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-batch-get-request-map)

(clojure.core/declare ser-expected-attribute-map)

(clojure.core/declare ser-time-range-lower-bound)

(clojure.core/declare ser-sse-specification)

(clojure.core/declare ser-list-tables-input-limit)

(clojure.core/declare ser-batch-write-item-request-map)

(clojure.core/declare ser-local-secondary-index-list)

(clojure.core/declare ser-auto-scaling-role-arn)

(clojure.core/declare ser-attribute-name-list)

(clojure.core/declare ser-scalar-attribute-type)

(clojure.core/declare ser-backups-input-limit)

(clojure.core/declare ser-backup-name)

(clojure.core/declare ser-scan-total-segments)

(clojure.core/declare ser-backup-arn)

(clojure.core/declare ser-local-secondary-index)

(clojure.core/declare ser-replica-update-list)

(clojure.core/declare ser-update-expression)

(clojure.core/declare ser-put-request)

(clojure.core/declare ser-attribute-value-update)

(clojure.core/declare ser-table-name)

(clojure.core/declare ser-condition-expression)

(clojure.core/declare ser-positive-integer-object)

(clojure.core/declare ser-stream-enabled)

(clojure.core/declare ser-key-schema-element)

(clojure.core/declare ser-attribute-value-list)

(clojure.core/declare ser-global-secondary-index-update-list)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-list-attribute-value)

(clojure.core/declare ser-key-conditions)

(clojure.core/declare ser-string-attribute-value)

(clojure.core/declare ser-auto-scaling-policy-update)

(clojure.core/declare ser-delete-replica-action)

(clojure.core/declare ser-expression-attribute-name-variable)

(clojure.core/declare ser-projection-expression)

(clojure.core/declare ser-provisioned-throughput)

(clojure.core/declare ser-select)

(clojure.core/declare ser-string-set-attribute-value)

(clojure.core/declare ser-resource-arn-string)

(clojure.core/declare ser-next-token-string)

(clojure.core/declare ser-key-schema-attribute-name)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-global-secondary-index)

(clojure.core/declare ser-global-secondary-index-list)

(clojure.core/declare ser-return-item-collection-metrics)

(clojure.core/declare ser-expression-attribute-name-map)

(clojure.core/declare ser-key-type)

(clojure.core/declare ser-write-request)

(clojure.core/declare ser-integer-object)

(clojure.core/declare ser-time-to-live-attribute-name)

(clojure.core/declare ser-sse-type)

(clojure.core/defn- ser-stream-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamSpecification", :type "structure"} (clojure.core/contains? input :stream-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-enabled (input :stream-enabled)) #:http.request.field{:name "StreamEnabled", :shape "StreamEnabled"})) (clojure.core/contains? input :stream-view-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-view-type (input :stream-view-type)) #:http.request.field{:name "StreamViewType", :shape "StreamViewType"}))))

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-sse-enabled [input] #:http.request.field{:value input, :shape "SSEEnabled"})

(clojure.core/defn- ser-tag-value-string [input] #:http.request.field{:value input, :shape "TagValueString"})

(clojure.core/defn- ser-delete-global-secondary-index-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "IndexName"})], :shape "DeleteGlobalSecondaryIndexAction", :type "structure"}))

(clojure.core/defn- ser-expected-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ExpectedAttributeValue", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "AttributeValue"})) (clojure.core/contains? input :exists) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :exists)) #:http.request.field{:name "Exists", :shape "BooleanObject"})) (clojure.core/contains? input :comparison-operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparison-operator (input :comparison-operator)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"})) (clojure.core/contains? input :attribute-value-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value-list (input :attribute-value-list)) #:http.request.field{:name "AttributeValueList", :shape "AttributeValueList"}))))

(clojure.core/defn- ser-non-key-attribute-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-key-attribute-name coll) #:http.request.field{:shape "NonKeyAttributeName"}))) input), :shape "NonKeyAttributeNameList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-expression-attribute-value-variable [input] #:http.request.field{:value input, :shape "ExpressionAttributeValueVariable"})

(clojure.core/defn- ser-replica-settings-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-replica-settings-update coll) #:http.request.field{:shape "ReplicaSettingsUpdate"}))) input), :shape "ReplicaSettingsUpdateList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-point-in-time-recovery-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean-object (:point-in-time-recovery-enabled input)) #:http.request.field{:name "PointInTimeRecoveryEnabled", :shape "BooleanObject"})], :shape "PointInTimeRecoverySpecification", :type "structure"}))

(clojure.core/defn- ser-time-range-upper-bound [input] #:http.request.field{:value input, :shape "TimeRangeUpperBound"})

(clojure.core/defn- ser-replica-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ReplicaUpdate", :type "structure"} (clojure.core/contains? input :create) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-replica-action (input :create)) #:http.request.field{:name "Create", :shape "CreateReplicaAction"})) (clojure.core/contains? input :delete) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-replica-action (input :delete)) #:http.request.field{:name "Delete", :shape "DeleteReplicaAction"}))))

(clojure.core/defn- ser-number-set-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-number-attribute-value coll) #:http.request.field{:shape "NumberAttributeValue"}))) input), :shape "NumberSetAttributeValue", :type "list"})

(clojure.core/defn- ser-number-attribute-value [input] #:http.request.field{:value input, :shape "NumberAttributeValue"})

(clojure.core/defn- ser-replica [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Replica", :type "structure"} (clojure.core/contains? input :region-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-region-name (input :region-name)) #:http.request.field{:name "RegionName", :shape "RegionName"}))))

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-delete-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key (:key input)) #:http.request.field{:name "Key", :shape "Key"})], :shape "DeleteRequest", :type "structure"}))

(clojure.core/defn- ser-attribute-action [input] #:http.request.field{:value (clojure.core/get {"ADD" "ADD", :add "ADD", "PUT" "PUT", :put "PUT", "DELETE" "DELETE", :delete "DELETE"} input), :shape "AttributeAction"})

(clojure.core/defn- ser-projection [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Projection", :type "structure"} (clojure.core/contains? input :projection-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-projection-type (input :projection-type)) #:http.request.field{:name "ProjectionType", :shape "ProjectionType"})) (clojure.core/contains? input :non-key-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-key-attribute-name-list (input :non-key-attributes)) #:http.request.field{:name "NonKeyAttributes", :shape "NonKeyAttributeNameList"}))))

(clojure.core/defn- ser-return-value [input] #:http.request.field{:value (clojure.core/get {:updated-new "UPDATED_NEW", :updated-old "UPDATED_OLD", "UPDATED_OLD" "UPDATED_OLD", "ALL_NEW" "ALL_NEW", :all-old "ALL_OLD", "NONE" "NONE", "UPDATED_NEW" "UPDATED_NEW", "ALL_OLD" "ALL_OLD", :all-new "ALL_NEW", :none "NONE"} input), :shape "ReturnValue"})

(clojure.core/defn- ser-time-to-live-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-time-to-live-enabled (:enabled input)) #:http.request.field{:name "Enabled", :shape "TimeToLiveEnabled"}) (clojure.core/into (ser-time-to-live-attribute-name (:attribute-name input)) #:http.request.field{:name "AttributeName", :shape "TimeToLiveAttributeName"})], :shape "TimeToLiveSpecification", :type "structure"}))

(clojure.core/defn- ser-auto-scaling-policy-name [input] #:http.request.field{:value input, :shape "AutoScalingPolicyName"})

(clojure.core/defn- ser-index-name [input] #:http.request.field{:value input, :shape "IndexName"})

(clojure.core/defn- ser-attribute-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key-schema-attribute-name (:attribute-name input)) #:http.request.field{:name "AttributeName", :shape "KeySchemaAttributeName"}) (clojure.core/into (ser-scalar-attribute-type (:attribute-type input)) #:http.request.field{:name "AttributeType", :shape "ScalarAttributeType"})], :shape "AttributeDefinition", :type "structure"}))

(clojure.core/defn- ser-positive-long-object [input] #:http.request.field{:value input, :shape "PositiveLongObject"})

(clojure.core/defn- ser-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key coll) #:http.request.field{:shape "Key"}))) input), :shape "KeyList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-auto-scaling-target-tracking-scaling-policy-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-double (:target-value input)) #:http.request.field{:name "TargetValue", :shape "Double"})], :shape "AutoScalingTargetTrackingScalingPolicyConfigurationUpdate", :type "structure"} (clojure.core/contains? input :disable-scale-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :disable-scale-in)) #:http.request.field{:name "DisableScaleIn", :shape "BooleanObject"})) (clojure.core/contains? input :scale-in-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-object (input :scale-in-cooldown)) #:http.request.field{:name "ScaleInCooldown", :shape "IntegerObject"})) (clojure.core/contains? input :scale-out-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-object (input :scale-out-cooldown)) #:http.request.field{:name "ScaleOutCooldown", :shape "IntegerObject"}))))

(clojure.core/defn- ser-expression-attribute-value-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-expression-attribute-value-variable k) #:http.request.field{:map-info "key", :shape "ExpressionAttributeValueVariable"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "ExpressionAttributeValueMap", :type "map"})

(clojure.core/defn- ser-key-expression [input] #:http.request.field{:value input, :shape "KeyExpression"})

(clojure.core/defn- ser-non-key-attribute-name [input] #:http.request.field{:value input, :shape "NonKeyAttributeName"})

(clojure.core/defn- ser-boolean-attribute-value [input] #:http.request.field{:value input, :shape "BooleanAttributeValue"})

(clojure.core/defn- ser-attribute-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value-update v) #:http.request.field{:map-info "value", :shape "AttributeValueUpdate"})])) input), :shape "AttributeUpdates", :type "map"})

(clojure.core/defn- ser-attribute-definitions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-definition coll) #:http.request.field{:shape "AttributeDefinition"}))) input), :shape "AttributeDefinitions", :type "list"})

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {:not-contains "NOT_CONTAINS", "NULL" "NULL", :ge "GE", :contains "CONTAINS", :eq "EQ", "NE" "NE", "CONTAINS" "CONTAINS", "LT" "LT", "GE" "GE", :between "BETWEEN", "LE" "LE", "NOT_CONTAINS" "NOT_CONTAINS", :null "NULL", :gt "GT", "BEGINS_WITH" "BEGINS_WITH", "NOT_NULL" "NOT_NULL", "EQ" "EQ", :not-null "NOT_NULL", :ne "NE", "GT" "GT", :le "LE", :lt "LT", "IN" "IN", "BETWEEN" "BETWEEN", :begins-with "BEGINS_WITH", :in "IN"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-update-global-secondary-index-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "IndexName"}) (clojure.core/into (ser-provisioned-throughput (:provisioned-throughput input)) #:http.request.field{:name "ProvisionedThroughput", :shape "ProvisionedThroughput"})], :shape "UpdateGlobalSecondaryIndexAction", :type "structure"}))

(clojure.core/defn- ser-filter-condition-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-condition v) #:http.request.field{:map-info "value", :shape "Condition"})])) input), :shape "FilterConditionMap", :type "map"})

(clojure.core/defn- ser-global-table-global-secondary-index-settings-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "IndexName"})], :shape "GlobalTableGlobalSecondaryIndexSettingsUpdate", :type "structure"} (clojure.core/contains? input :provisioned-write-capacity-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-long-object (input :provisioned-write-capacity-units)) #:http.request.field{:name "ProvisionedWriteCapacityUnits", :shape "PositiveLongObject"})) (clojure.core/contains? input :provisioned-write-capacity-auto-scaling-settings-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-settings-update (input :provisioned-write-capacity-auto-scaling-settings-update)) #:http.request.field{:name "ProvisionedWriteCapacityAutoScalingSettingsUpdate", :shape "AutoScalingSettingsUpdate"}))))

(clojure.core/defn- ser-null-attribute-value [input] #:http.request.field{:value input, :shape "NullAttributeValue"})

(clojure.core/defn- ser-create-global-secondary-index-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "IndexName"}) (clojure.core/into (ser-key-schema (:key-schema input)) #:http.request.field{:name "KeySchema", :shape "KeySchema"}) (clojure.core/into (ser-projection (:projection input)) #:http.request.field{:name "Projection", :shape "Projection"}) (clojure.core/into (ser-provisioned-throughput (:provisioned-throughput input)) #:http.request.field{:name "ProvisionedThroughput", :shape "ProvisionedThroughput"})], :shape "CreateGlobalSecondaryIndexAction", :type "structure"}))

(clojure.core/defn- ser-global-secondary-index-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GlobalSecondaryIndexUpdate", :type "structure"} (clojure.core/contains? input :update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-global-secondary-index-action (input :update)) #:http.request.field{:name "Update", :shape "UpdateGlobalSecondaryIndexAction"})) (clojure.core/contains? input :create) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-global-secondary-index-action (input :create)) #:http.request.field{:name "Create", :shape "CreateGlobalSecondaryIndexAction"})) (clojure.core/contains? input :delete) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-global-secondary-index-action (input :delete)) #:http.request.field{:name "Delete", :shape "DeleteGlobalSecondaryIndexAction"}))))

(clojure.core/defn- ser-projection-type [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL", "KEYS_ONLY" "KEYS_ONLY", :keys-only "KEYS_ONLY", "INCLUDE" "INCLUDE", :include "INCLUDE"} input), :shape "ProjectionType"})

(clojure.core/defn- ser-create-replica-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-region-name (:region-name input)) #:http.request.field{:name "RegionName", :shape "RegionName"})], :shape "CreateReplicaAction", :type "structure"}))

(clojure.core/defn- ser-map-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "MapAttributeValue", :type "map"})

(clojure.core/defn- ser-global-table-global-secondary-index-settings-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-global-table-global-secondary-index-settings-update coll) #:http.request.field{:shape "GlobalTableGlobalSecondaryIndexSettingsUpdate"}))) input), :shape "GlobalTableGlobalSecondaryIndexSettingsUpdateList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-replica-global-secondary-index-settings-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-replica-global-secondary-index-settings-update coll) #:http.request.field{:shape "ReplicaGlobalSecondaryIndexSettingsUpdate"}))) input), :shape "ReplicaGlobalSecondaryIndexSettingsUpdateList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-put-item-input-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "PutItemInputAttributeMap", :type "map"})

(clojure.core/defn- ser-key-schema [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key-schema-element coll) #:http.request.field{:shape "KeySchemaElement"}))) input), :shape "KeySchema", :type "list", :max 2, :min 1})

(clojure.core/defn- ser-write-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-write-request coll) #:http.request.field{:shape "WriteRequest"}))) input), :shape "WriteRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-keys-and-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key-list (:keys input)) #:http.request.field{:name "Keys", :shape "KeyList"})], :shape "KeysAndAttributes", :type "structure"} (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistent-read (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "ConsistentRead"})) (clojure.core/contains? input :projection-expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-projection-expression (input :projection-expression)) #:http.request.field{:name "ProjectionExpression", :shape "ProjectionExpression"})) (clojure.core/contains? input :expression-attribute-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-name-map (input :expression-attribute-names)) #:http.request.field{:name "ExpressionAttributeNames", :shape "ExpressionAttributeNameMap"}))))

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-auto-scaling-settings-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AutoScalingSettingsUpdate", :type "structure"} (clojure.core/contains? input :minimum-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-long-object (input :minimum-units)) #:http.request.field{:name "MinimumUnits", :shape "PositiveLongObject"})) (clojure.core/contains? input :maximum-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-long-object (input :maximum-units)) #:http.request.field{:name "MaximumUnits", :shape "PositiveLongObject"})) (clojure.core/contains? input :auto-scaling-disabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :auto-scaling-disabled)) #:http.request.field{:name "AutoScalingDisabled", :shape "BooleanObject"})) (clojure.core/contains? input :auto-scaling-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-role-arn (input :auto-scaling-role-arn)) #:http.request.field{:name "AutoScalingRoleArn", :shape "AutoScalingRoleArn"})) (clojure.core/contains? input :scaling-policy-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-policy-update (input :scaling-policy-update)) #:http.request.field{:name "ScalingPolicyUpdate", :shape "AutoScalingPolicyUpdate"}))))

(clojure.core/defn- ser-kms-master-key-id [input] #:http.request.field{:value input, :shape "KMSMasterKeyId"})

(clojure.core/defn- ser-binary-set-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-binary-attribute-value coll) #:http.request.field{:shape "BinaryAttributeValue"}))) input), :shape "BinarySetAttributeValue", :type "list"})

(clojure.core/defn- ser-consistent-read [input] #:http.request.field{:value input, :shape "ConsistentRead"})

(clojure.core/defn- ser-time-to-live-enabled [input] #:http.request.field{:value input, :shape "TimeToLiveEnabled"})

(clojure.core/defn- ser-backup-type-filter [input] #:http.request.field{:value (clojure.core/get {"USER" "USER", :user "USER", "SYSTEM" "SYSTEM", :system "SYSTEM", "ALL" "ALL", :all "ALL"} input), :shape "BackupTypeFilter"})

(clojure.core/defn- ser-key [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "Key", :type "map"})

(clojure.core/defn- ser-tag-key-string [input] #:http.request.field{:value input, :shape "TagKeyString"})

(clojure.core/defn- ser-region-name [input] #:http.request.field{:value input, :shape "RegionName"})

(clojure.core/defn- ser-stream-view-type [input] #:http.request.field{:value (clojure.core/get {"NEW_IMAGE" "NEW_IMAGE", :new-image "NEW_IMAGE", "OLD_IMAGE" "OLD_IMAGE", :old-image "OLD_IMAGE", "NEW_AND_OLD_IMAGES" "NEW_AND_OLD_IMAGES", :new-and-old-images "NEW_AND_OLD_IMAGES", "KEYS_ONLY" "KEYS_ONLY", :keys-only "KEYS_ONLY"} input), :shape "StreamViewType"})

(clojure.core/defn- ser-replica-settings-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-region-name (:region-name input)) #:http.request.field{:name "RegionName", :shape "RegionName"})], :shape "ReplicaSettingsUpdate", :type "structure"} (clojure.core/contains? input :replica-provisioned-read-capacity-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-long-object (input :replica-provisioned-read-capacity-units)) #:http.request.field{:name "ReplicaProvisionedReadCapacityUnits", :shape "PositiveLongObject"})) (clojure.core/contains? input :replica-provisioned-read-capacity-auto-scaling-settings-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-settings-update (input :replica-provisioned-read-capacity-auto-scaling-settings-update)) #:http.request.field{:name "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", :shape "AutoScalingSettingsUpdate"})) (clojure.core/contains? input :replica-global-secondary-index-settings-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replica-global-secondary-index-settings-update-list (input :replica-global-secondary-index-settings-update)) #:http.request.field{:name "ReplicaGlobalSecondaryIndexSettingsUpdate", :shape "ReplicaGlobalSecondaryIndexSettingsUpdateList"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-replica-global-secondary-index-settings-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "IndexName"})], :shape "ReplicaGlobalSecondaryIndexSettingsUpdate", :type "structure"} (clojure.core/contains? input :provisioned-read-capacity-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-long-object (input :provisioned-read-capacity-units)) #:http.request.field{:name "ProvisionedReadCapacityUnits", :shape "PositiveLongObject"})) (clojure.core/contains? input :provisioned-read-capacity-auto-scaling-settings-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-settings-update (input :provisioned-read-capacity-auto-scaling-settings-update)) #:http.request.field{:name "ProvisionedReadCapacityAutoScalingSettingsUpdate", :shape "AutoScalingSettingsUpdate"}))))

(clojure.core/defn- ser-return-consumed-capacity [input] #:http.request.field{:value (clojure.core/get {"INDEXES" "INDEXES", :indexes "INDEXES", "TOTAL" "TOTAL", :total "TOTAL", "NONE" "NONE", :none "NONE"} input), :shape "ReturnConsumedCapacity"})

(clojure.core/defn- ser-scan-segment [input] #:http.request.field{:value input, :shape "ScanSegment"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key-string coll) #:http.request.field{:shape "TagKeyString"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-replica-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-replica coll) #:http.request.field{:shape "Replica"}))) input), :shape "ReplicaList", :type "list"})

(clojure.core/defn- ser-binary-attribute-value [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BinaryAttributeValue"})

(clojure.core/defn- ser-conditional-operator [input] #:http.request.field{:value (clojure.core/get {"AND" "AND", :and "AND", "OR" "OR", :or "OR"} input), :shape "ConditionalOperator"})

(clojure.core/defn- ser-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AttributeValue", :type "structure"} (clojure.core/contains? input :null) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-null-attribute-value (input :null)) #:http.request.field{:name "NULL", :shape "NullAttributeValue"})) (clojure.core/contains? input :l) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-attribute-value (input :l)) #:http.request.field{:name "L", :shape "ListAttributeValue"})) (clojure.core/contains? input :bool) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-attribute-value (input :bool)) #:http.request.field{:name "BOOL", :shape "BooleanAttributeValue"})) (clojure.core/contains? input :m) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-attribute-value (input :m)) #:http.request.field{:name "M", :shape "MapAttributeValue"})) (clojure.core/contains? input :s) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-attribute-value (input :s)) #:http.request.field{:name "S", :shape "StringAttributeValue"})) (clojure.core/contains? input :b) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary-attribute-value (input :b)) #:http.request.field{:name "B", :shape "BinaryAttributeValue"})) (clojure.core/contains? input :ns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-set-attribute-value (input :ns)) #:http.request.field{:name "NS", :shape "NumberSetAttributeValue"})) (clojure.core/contains? input :n) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-attribute-value (input :n)) #:http.request.field{:name "N", :shape "NumberAttributeValue"})) (clojure.core/contains? input :bs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary-set-attribute-value (input :bs)) #:http.request.field{:name "BS", :shape "BinarySetAttributeValue"})) (clojure.core/contains? input :ss) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-set-attribute-value (input :ss)) #:http.request.field{:name "SS", :shape "StringSetAttributeValue"}))))

(clojure.core/defn- ser-batch-get-request-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-table-name k) #:http.request.field{:map-info "key", :shape "TableName"}) (clojure.core/into (ser-keys-and-attributes v) #:http.request.field{:map-info "value", :shape "KeysAndAttributes"})])) input), :shape "BatchGetRequestMap", :type "map", :max 100, :min 1})

(clojure.core/defn- ser-expected-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-expected-attribute-value v) #:http.request.field{:map-info "value", :shape "ExpectedAttributeValue"})])) input), :shape "ExpectedAttributeMap", :type "map"})

(clojure.core/defn- ser-time-range-lower-bound [input] #:http.request.field{:value input, :shape "TimeRangeLowerBound"})

(clojure.core/defn- ser-sse-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SSESpecification", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "SSEEnabled"})) (clojure.core/contains? input :sse-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-type (input :sse-type)) #:http.request.field{:name "SSEType", :shape "SSEType"})) (clojure.core/contains? input :kms-master-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-master-key-id (input :kms-master-key-id)) #:http.request.field{:name "KMSMasterKeyId", :shape "KMSMasterKeyId"}))))

(clojure.core/defn- ser-list-tables-input-limit [input] #:http.request.field{:value input, :shape "ListTablesInputLimit"})

(clojure.core/defn- ser-batch-write-item-request-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-table-name k) #:http.request.field{:map-info "key", :shape "TableName"}) (clojure.core/into (ser-write-requests v) #:http.request.field{:map-info "value", :shape "WriteRequests"})])) input), :shape "BatchWriteItemRequestMap", :type "map", :max 25, :min 1})

(clojure.core/defn- ser-local-secondary-index-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-local-secondary-index coll) #:http.request.field{:shape "LocalSecondaryIndex"}))) input), :shape "LocalSecondaryIndexList", :type "list"})

(clojure.core/defn- ser-auto-scaling-role-arn [input] #:http.request.field{:value input, :shape "AutoScalingRoleArn"})

(clojure.core/defn- ser-attribute-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name coll) #:http.request.field{:shape "AttributeName"}))) input), :shape "AttributeNameList", :type "list", :min 1})

(clojure.core/defn- ser-scalar-attribute-type [input] #:http.request.field{:value (clojure.core/get {"S" "S", :s "S", "N" "N", :n "N", "B" "B", :b "B"} input), :shape "ScalarAttributeType"})

(clojure.core/defn- ser-backups-input-limit [input] #:http.request.field{:value input, :shape "BackupsInputLimit"})

(clojure.core/defn- ser-backup-name [input] #:http.request.field{:value input, :shape "BackupName"})

(clojure.core/defn- ser-scan-total-segments [input] #:http.request.field{:value input, :shape "ScanTotalSegments"})

(clojure.core/defn- ser-backup-arn [input] #:http.request.field{:value input, :shape "BackupArn"})

(clojure.core/defn- ser-local-secondary-index [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "IndexName"}) (clojure.core/into (ser-key-schema (:key-schema input)) #:http.request.field{:name "KeySchema", :shape "KeySchema"}) (clojure.core/into (ser-projection (:projection input)) #:http.request.field{:name "Projection", :shape "Projection"})], :shape "LocalSecondaryIndex", :type "structure"}))

(clojure.core/defn- ser-replica-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-replica-update coll) #:http.request.field{:shape "ReplicaUpdate"}))) input), :shape "ReplicaUpdateList", :type "list"})

(clojure.core/defn- ser-update-expression [input] #:http.request.field{:value input, :shape "UpdateExpression"})

(clojure.core/defn- ser-put-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-put-item-input-attribute-map (:item input)) #:http.request.field{:name "Item", :shape "PutItemInputAttributeMap"})], :shape "PutRequest", :type "structure"}))

(clojure.core/defn- ser-attribute-value-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AttributeValueUpdate", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "AttributeValue"})) (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-action (input :action)) #:http.request.field{:name "Action", :shape "AttributeAction"}))))

(clojure.core/defn- ser-table-name [input] #:http.request.field{:value input, :shape "TableName"})

(clojure.core/defn- ser-condition-expression [input] #:http.request.field{:value input, :shape "ConditionExpression"})

(clojure.core/defn- ser-positive-integer-object [input] #:http.request.field{:value input, :shape "PositiveIntegerObject"})

(clojure.core/defn- ser-stream-enabled [input] #:http.request.field{:value input, :shape "StreamEnabled"})

(clojure.core/defn- ser-key-schema-element [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key-schema-attribute-name (:attribute-name input)) #:http.request.field{:name "AttributeName", :shape "KeySchemaAttributeName"}) (clojure.core/into (ser-key-type (:key-type input)) #:http.request.field{:name "KeyType", :shape "KeyType"})], :shape "KeySchemaElement", :type "structure"}))

(clojure.core/defn- ser-attribute-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-value coll) #:http.request.field{:shape "AttributeValue"}))) input), :shape "AttributeValueList", :type "list"})

(clojure.core/defn- ser-global-secondary-index-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-global-secondary-index-update coll) #:http.request.field{:shape "GlobalSecondaryIndexUpdate"}))) input), :shape "GlobalSecondaryIndexUpdateList", :type "list"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key-string (:key input)) #:http.request.field{:name "Key", :shape "TagKeyString"}) (clojure.core/into (ser-tag-value-string (:value input)) #:http.request.field{:name "Value", :shape "TagValueString"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-condition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-comparison-operator (:comparison-operator input)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"})], :shape "Condition", :type "structure"} (clojure.core/contains? input :attribute-value-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value-list (input :attribute-value-list)) #:http.request.field{:name "AttributeValueList", :shape "AttributeValueList"}))))

(clojure.core/defn- ser-list-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-value coll) #:http.request.field{:shape "AttributeValue"}))) input), :shape "ListAttributeValue", :type "list"})

(clojure.core/defn- ser-key-conditions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-condition v) #:http.request.field{:map-info "value", :shape "Condition"})])) input), :shape "KeyConditions", :type "map"})

(clojure.core/defn- ser-string-attribute-value [input] #:http.request.field{:value input, :shape "StringAttributeValue"})

(clojure.core/defn- ser-auto-scaling-policy-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-auto-scaling-target-tracking-scaling-policy-configuration-update (:target-tracking-scaling-policy-configuration input)) #:http.request.field{:name "TargetTrackingScalingPolicyConfiguration", :shape "AutoScalingTargetTrackingScalingPolicyConfigurationUpdate"})], :shape "AutoScalingPolicyUpdate", :type "structure"} (clojure.core/contains? input :policy-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "AutoScalingPolicyName"}))))

(clojure.core/defn- ser-delete-replica-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-region-name (:region-name input)) #:http.request.field{:name "RegionName", :shape "RegionName"})], :shape "DeleteReplicaAction", :type "structure"}))

(clojure.core/defn- ser-expression-attribute-name-variable [input] #:http.request.field{:value input, :shape "ExpressionAttributeNameVariable"})

(clojure.core/defn- ser-projection-expression [input] #:http.request.field{:value input, :shape "ProjectionExpression"})

(clojure.core/defn- ser-provisioned-throughput [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-positive-long-object (:read-capacity-units input)) #:http.request.field{:name "ReadCapacityUnits", :shape "PositiveLongObject"}) (clojure.core/into (ser-positive-long-object (:write-capacity-units input)) #:http.request.field{:name "WriteCapacityUnits", :shape "PositiveLongObject"})], :shape "ProvisionedThroughput", :type "structure"}))

(clojure.core/defn- ser-select [input] #:http.request.field{:value (clojure.core/get {"ALL_ATTRIBUTES" "ALL_ATTRIBUTES", :all-attributes "ALL_ATTRIBUTES", "ALL_PROJECTED_ATTRIBUTES" "ALL_PROJECTED_ATTRIBUTES", :all-projected-attributes "ALL_PROJECTED_ATTRIBUTES", "SPECIFIC_ATTRIBUTES" "SPECIFIC_ATTRIBUTES", :specific-attributes "SPECIFIC_ATTRIBUTES", "COUNT" "COUNT", :count "COUNT"} input), :shape "Select"})

(clojure.core/defn- ser-string-set-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-attribute-value coll) #:http.request.field{:shape "StringAttributeValue"}))) input), :shape "StringSetAttributeValue", :type "list"})

(clojure.core/defn- ser-resource-arn-string [input] #:http.request.field{:value input, :shape "ResourceArnString"})

(clojure.core/defn- ser-next-token-string [input] #:http.request.field{:value input, :shape "NextTokenString"})

(clojure.core/defn- ser-key-schema-attribute-name [input] #:http.request.field{:value input, :shape "KeySchemaAttributeName"})

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-global-secondary-index [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "IndexName"}) (clojure.core/into (ser-key-schema (:key-schema input)) #:http.request.field{:name "KeySchema", :shape "KeySchema"}) (clojure.core/into (ser-projection (:projection input)) #:http.request.field{:name "Projection", :shape "Projection"}) (clojure.core/into (ser-provisioned-throughput (:provisioned-throughput input)) #:http.request.field{:name "ProvisionedThroughput", :shape "ProvisionedThroughput"})], :shape "GlobalSecondaryIndex", :type "structure"}))

(clojure.core/defn- ser-global-secondary-index-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-global-secondary-index coll) #:http.request.field{:shape "GlobalSecondaryIndex"}))) input), :shape "GlobalSecondaryIndexList", :type "list"})

(clojure.core/defn- ser-return-item-collection-metrics [input] #:http.request.field{:value (clojure.core/get {"SIZE" "SIZE", :size "SIZE", "NONE" "NONE", :none "NONE"} input), :shape "ReturnItemCollectionMetrics"})

(clojure.core/defn- ser-expression-attribute-name-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-expression-attribute-name-variable k) #:http.request.field{:map-info "key", :shape "ExpressionAttributeNameVariable"}) (clojure.core/into (ser-attribute-name v) #:http.request.field{:map-info "value", :shape "AttributeName"})])) input), :shape "ExpressionAttributeNameMap", :type "map"})

(clojure.core/defn- ser-key-type [input] #:http.request.field{:value (clojure.core/get {"HASH" "HASH", :hash "HASH", "RANGE" "RANGE", :range "RANGE"} input), :shape "KeyType"})

(clojure.core/defn- ser-write-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WriteRequest", :type "structure"} (clojure.core/contains? input :put-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-put-request (input :put-request)) #:http.request.field{:name "PutRequest", :shape "PutRequest"})) (clojure.core/contains? input :delete-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-request (input :delete-request)) #:http.request.field{:name "DeleteRequest", :shape "DeleteRequest"}))))

(clojure.core/defn- ser-integer-object [input] #:http.request.field{:value input, :shape "IntegerObject"})

(clojure.core/defn- ser-time-to-live-attribute-name [input] #:http.request.field{:value input, :shape "TimeToLiveAttributeName"})

(clojure.core/defn- ser-sse-type [input] #:http.request.field{:value (clojure.core/get {"AES256" "AES256", :aes-256 "AES256", "KMS" "KMS", :kms "KMS"} input), :shape "SSEType"})

(clojure.core/defn- req-restore-table-from-backup-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :target-table-name)) #:http.request.field{:name "TargetTableName", :shape "TableName"}) (clojure.core/into (ser-backup-arn (input :backup-arn)) #:http.request.field{:name "BackupArn", :shape "BackupArn"})]}))

(clojure.core/defn- req-delete-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]}))

(clojure.core/defn- req-get-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})]} (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistent-read (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "ConsistentRead"})) (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"})) (clojure.core/contains? input :projection-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-projection-expression (input :projection-expression)) #:http.request.field{:name "ProjectionExpression", :shape "ProjectionExpression"})) (clojure.core/contains? input :expression-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-name-map (input :expression-attribute-names)) #:http.request.field{:name "ExpressionAttributeNames", :shape "ExpressionAttributeNameMap"}))))

(clojure.core/defn- req-create-global-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :global-table-name)) #:http.request.field{:name "GlobalTableName", :shape "TableName"}) (clojure.core/into (ser-replica-list (input :replication-group)) #:http.request.field{:name "ReplicationGroup", :shape "ReplicaList"})]}))

(clojure.core/defn- req-update-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]} (clojure.core/contains? input :attribute-definitions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-definitions (input :attribute-definitions)) #:http.request.field{:name "AttributeDefinitions", :shape "AttributeDefinitions"})) (clojure.core/contains? input :provisioned-throughput) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-throughput (input :provisioned-throughput)) #:http.request.field{:name "ProvisionedThroughput", :shape "ProvisionedThroughput"})) (clojure.core/contains? input :global-secondary-index-updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-global-secondary-index-update-list (input :global-secondary-index-updates)) #:http.request.field{:name "GlobalSecondaryIndexUpdates", :shape "GlobalSecondaryIndexUpdateList"})) (clojure.core/contains? input :stream-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-specification (input :stream-specification)) #:http.request.field{:name "StreamSpecification", :shape "StreamSpecification"})) (clojure.core/contains? input :sse-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-specification (input :sse-specification)) #:http.request.field{:name "SSESpecification", :shape "SSESpecification"}))))

(clojure.core/defn- req-batch-get-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-get-request-map (input :request-items)) #:http.request.field{:name "RequestItems", :shape "BatchGetRequestMap"})]} (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"}))))

(clojure.core/defn- req-describe-limits-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]}))

(clojure.core/defn- req-create-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attribute-definitions (input :attribute-definitions)) #:http.request.field{:name "AttributeDefinitions", :shape "AttributeDefinitions"}) (clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key-schema (input :key-schema)) #:http.request.field{:name "KeySchema", :shape "KeySchema"}) (clojure.core/into (ser-provisioned-throughput (input :provisioned-throughput)) #:http.request.field{:name "ProvisionedThroughput", :shape "ProvisionedThroughput"})]} (clojure.core/contains? input :local-secondary-indexes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-local-secondary-index-list (input :local-secondary-indexes)) #:http.request.field{:name "LocalSecondaryIndexes", :shape "LocalSecondaryIndexList"})) (clojure.core/contains? input :global-secondary-indexes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-global-secondary-index-list (input :global-secondary-indexes)) #:http.request.field{:name "GlobalSecondaryIndexes", :shape "GlobalSecondaryIndexList"})) (clojure.core/contains? input :stream-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-specification (input :stream-specification)) #:http.request.field{:name "StreamSpecification", :shape "StreamSpecification"})) (clojure.core/contains? input :sse-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-specification (input :sse-specification)) #:http.request.field{:name "SSESpecification", :shape "SSESpecification"}))))

(clojure.core/defn- req-describe-global-table-settings-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :global-table-name)) #:http.request.field{:name "GlobalTableName", :shape "TableName"})]}))

(clojure.core/defn- req-tag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArnString"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-create-backup-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-backup-name (input :backup-name)) #:http.request.field{:name "BackupName", :shape "BackupName"})]}))

(clojure.core/defn- req-list-backups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :table-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backups-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "BackupsInputLimit"})) (clojure.core/contains? input :time-range-lower-bound) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-range-lower-bound (input :time-range-lower-bound)) #:http.request.field{:name "TimeRangeLowerBound", :shape "TimeRangeLowerBound"})) (clojure.core/contains? input :time-range-upper-bound) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-range-upper-bound (input :time-range-upper-bound)) #:http.request.field{:name "TimeRangeUpperBound", :shape "TimeRangeUpperBound"})) (clojure.core/contains? input :exclusive-start-backup-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-arn (input :exclusive-start-backup-arn)) #:http.request.field{:name "ExclusiveStartBackupArn", :shape "BackupArn"})) (clojure.core/contains? input :backup-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-type-filter (input :backup-type)) #:http.request.field{:name "BackupType", :shape "BackupTypeFilter"}))))

(clojure.core/defn- req-describe-backup-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-arn (input :backup-arn)) #:http.request.field{:name "BackupArn", :shape "BackupArn"})]}))

(clojure.core/defn- req-list-global-tables-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :exclusive-start-global-table-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :exclusive-start-global-table-name)) #:http.request.field{:name "ExclusiveStartGlobalTableName", :shape "TableName"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :region-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-region-name (input :region-name)) #:http.request.field{:name "RegionName", :shape "RegionName"}))))

(clojure.core/defn- req-put-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-put-item-input-attribute-map (input :item)) #:http.request.field{:name "Item", :shape "PutItemInputAttributeMap"})]} (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-attribute-map (input :expected)) #:http.request.field{:name "Expected", :shape "ExpectedAttributeMap"})) (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"})) (clojure.core/contains? input :conditional-operator) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-conditional-operator (input :conditional-operator)) #:http.request.field{:name "ConditionalOperator", :shape "ConditionalOperator"})) (clojure.core/contains? input :condition-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-expression (input :condition-expression)) #:http.request.field{:name "ConditionExpression", :shape "ConditionExpression"})) (clojure.core/contains? input :expression-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-name-map (input :expression-attribute-names)) #:http.request.field{:name "ExpressionAttributeNames", :shape "ExpressionAttributeNameMap"})) (clojure.core/contains? input :return-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-value (input :return-values)) #:http.request.field{:name "ReturnValues", :shape "ReturnValue"})) (clojure.core/contains? input :expression-attribute-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-value-map (input :expression-attribute-values)) #:http.request.field{:name "ExpressionAttributeValues", :shape "ExpressionAttributeValueMap"})) (clojure.core/contains? input :return-item-collection-metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-item-collection-metrics (input :return-item-collection-metrics)) #:http.request.field{:name "ReturnItemCollectionMetrics", :shape "ReturnItemCollectionMetrics"}))))

(clojure.core/defn- req-update-time-to-live-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-time-to-live-specification (input :time-to-live-specification)) #:http.request.field{:name "TimeToLiveSpecification", :shape "TimeToLiveSpecification"})]}))

(clojure.core/defn- req-update-global-table-settings-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :global-table-name)) #:http.request.field{:name "GlobalTableName", :shape "TableName"})]} (clojure.core/contains? input :global-table-provisioned-write-capacity-units) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-long-object (input :global-table-provisioned-write-capacity-units)) #:http.request.field{:name "GlobalTableProvisionedWriteCapacityUnits", :shape "PositiveLongObject"})) (clojure.core/contains? input :global-table-provisioned-write-capacity-auto-scaling-settings-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-settings-update (input :global-table-provisioned-write-capacity-auto-scaling-settings-update)) #:http.request.field{:name "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", :shape "AutoScalingSettingsUpdate"})) (clojure.core/contains? input :global-table-global-secondary-index-settings-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-global-table-global-secondary-index-settings-update-list (input :global-table-global-secondary-index-settings-update)) #:http.request.field{:name "GlobalTableGlobalSecondaryIndexSettingsUpdate", :shape "GlobalTableGlobalSecondaryIndexSettingsUpdateList"})) (clojure.core/contains? input :replica-settings-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replica-settings-update-list (input :replica-settings-update)) #:http.request.field{:name "ReplicaSettingsUpdate", :shape "ReplicaSettingsUpdateList"}))))

(clojure.core/defn- req-scan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]} (clojure.core/contains? input :scan-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-condition-map (input :scan-filter)) #:http.request.field{:name "ScanFilter", :shape "FilterConditionMap"})) (clojure.core/contains? input :index-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-index-name (input :index-name)) #:http.request.field{:name "IndexName", :shape "IndexName"})) (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistent-read (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "ConsistentRead"})) (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"})) (clojure.core/contains? input :conditional-operator) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-conditional-operator (input :conditional-operator)) #:http.request.field{:name "ConditionalOperator", :shape "ConditionalOperator"})) (clojure.core/contains? input :filter-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-expression (input :filter-expression)) #:http.request.field{:name "FilterExpression", :shape "ConditionExpression"})) (clojure.core/contains? input :segment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scan-segment (input :segment)) #:http.request.field{:name "Segment", :shape "ScanSegment"})) (clojure.core/contains? input :exclusive-start-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :exclusive-start-key)) #:http.request.field{:name "ExclusiveStartKey", :shape "Key"})) (clojure.core/contains? input :total-segments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scan-total-segments (input :total-segments)) #:http.request.field{:name "TotalSegments", :shape "ScanTotalSegments"})) (clojure.core/contains? input :expression-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-name-map (input :expression-attribute-names)) #:http.request.field{:name "ExpressionAttributeNames", :shape "ExpressionAttributeNameMap"})) (clojure.core/contains? input :projection-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-projection-expression (input :projection-expression)) #:http.request.field{:name "ProjectionExpression", :shape "ProjectionExpression"})) (clojure.core/contains? input :select) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-select (input :select)) #:http.request.field{:name "Select", :shape "Select"})) (clojure.core/contains? input :expression-attribute-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-value-map (input :expression-attribute-values)) #:http.request.field{:name "ExpressionAttributeValues", :shape "ExpressionAttributeValueMap"}))))

(clojure.core/defn- req-describe-global-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :global-table-name)) #:http.request.field{:name "GlobalTableName", :shape "TableName"})]}))

(clojure.core/defn- req-untag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArnString"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-delete-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})]} (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-attribute-map (input :expected)) #:http.request.field{:name "Expected", :shape "ExpectedAttributeMap"})) (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"})) (clojure.core/contains? input :conditional-operator) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-conditional-operator (input :conditional-operator)) #:http.request.field{:name "ConditionalOperator", :shape "ConditionalOperator"})) (clojure.core/contains? input :condition-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-expression (input :condition-expression)) #:http.request.field{:name "ConditionExpression", :shape "ConditionExpression"})) (clojure.core/contains? input :expression-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-name-map (input :expression-attribute-names)) #:http.request.field{:name "ExpressionAttributeNames", :shape "ExpressionAttributeNameMap"})) (clojure.core/contains? input :return-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-value (input :return-values)) #:http.request.field{:name "ReturnValues", :shape "ReturnValue"})) (clojure.core/contains? input :expression-attribute-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-value-map (input :expression-attribute-values)) #:http.request.field{:name "ExpressionAttributeValues", :shape "ExpressionAttributeValueMap"})) (clojure.core/contains? input :return-item-collection-metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-item-collection-metrics (input :return-item-collection-metrics)) #:http.request.field{:name "ReturnItemCollectionMetrics", :shape "ReturnItemCollectionMetrics"}))))

(clojure.core/defn- req-describe-time-to-live-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]}))

(clojure.core/defn- req-update-continuous-backups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-point-in-time-recovery-specification (input :point-in-time-recovery-specification)) #:http.request.field{:name "PointInTimeRecoverySpecification", :shape "PointInTimeRecoverySpecification"})]}))

(clojure.core/defn- req-restore-table-to-point-in-time-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :source-table-name)) #:http.request.field{:name "SourceTableName", :shape "TableName"}) (clojure.core/into (ser-table-name (input :target-table-name)) #:http.request.field{:name "TargetTableName", :shape "TableName"})]} (clojure.core/contains? input :use-latest-restorable-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :use-latest-restorable-time)) #:http.request.field{:name "UseLatestRestorableTime", :shape "BooleanObject"})) (clojure.core/contains? input :restore-date-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :restore-date-time)) #:http.request.field{:name "RestoreDateTime", :shape "Date"}))))

(clojure.core/defn- req-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]} (clojure.core/contains? input :scan-index-forward) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :scan-index-forward)) #:http.request.field{:name "ScanIndexForward", :shape "BooleanObject"})) (clojure.core/contains? input :index-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-index-name (input :index-name)) #:http.request.field{:name "IndexName", :shape "IndexName"})) (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistent-read (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "ConsistentRead"})) (clojure.core/contains? input :key-condition-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-expression (input :key-condition-expression)) #:http.request.field{:name "KeyConditionExpression", :shape "KeyExpression"})) (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"})) (clojure.core/contains? input :conditional-operator) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-conditional-operator (input :conditional-operator)) #:http.request.field{:name "ConditionalOperator", :shape "ConditionalOperator"})) (clojure.core/contains? input :filter-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-expression (input :filter-expression)) #:http.request.field{:name "FilterExpression", :shape "ConditionExpression"})) (clojure.core/contains? input :exclusive-start-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :exclusive-start-key)) #:http.request.field{:name "ExclusiveStartKey", :shape "Key"})) (clojure.core/contains? input :expression-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-name-map (input :expression-attribute-names)) #:http.request.field{:name "ExpressionAttributeNames", :shape "ExpressionAttributeNameMap"})) (clojure.core/contains? input :key-conditions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-conditions (input :key-conditions)) #:http.request.field{:name "KeyConditions", :shape "KeyConditions"})) (clojure.core/contains? input :query-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-condition-map (input :query-filter)) #:http.request.field{:name "QueryFilter", :shape "FilterConditionMap"})) (clojure.core/contains? input :projection-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-projection-expression (input :projection-expression)) #:http.request.field{:name "ProjectionExpression", :shape "ProjectionExpression"})) (clojure.core/contains? input :select) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-select (input :select)) #:http.request.field{:name "Select", :shape "Select"})) (clojure.core/contains? input :expression-attribute-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-value-map (input :expression-attribute-values)) #:http.request.field{:name "ExpressionAttributeValues", :shape "ExpressionAttributeValueMap"}))))

(clojure.core/defn- req-batch-write-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-write-item-request-map (input :request-items)) #:http.request.field{:name "RequestItems", :shape "BatchWriteItemRequestMap"})]} (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"})) (clojure.core/contains? input :return-item-collection-metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-item-collection-metrics (input :return-item-collection-metrics)) #:http.request.field{:name "ReturnItemCollectionMetrics", :shape "ReturnItemCollectionMetrics"}))))

(clojure.core/defn- req-delete-backup-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-arn (input :backup-arn)) #:http.request.field{:name "BackupArn", :shape "BackupArn"})]}))

(clojure.core/defn- req-list-tables-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :exclusive-start-table-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :exclusive-start-table-name)) #:http.request.field{:name "ExclusiveStartTableName", :shape "TableName"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tables-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListTablesInputLimit"}))))

(clojure.core/defn- req-describe-endpoints-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-tags-of-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArnString"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextTokenString"}))))

(clojure.core/defn- req-describe-continuous-backups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]}))

(clojure.core/defn- req-update-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})]} (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-attribute-map (input :expected)) #:http.request.field{:name "Expected", :shape "ExpectedAttributeMap"})) (clojure.core/contains? input :attribute-updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-updates (input :attribute-updates)) #:http.request.field{:name "AttributeUpdates", :shape "AttributeUpdates"})) (clojure.core/contains? input :return-consumed-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-consumed-capacity (input :return-consumed-capacity)) #:http.request.field{:name "ReturnConsumedCapacity", :shape "ReturnConsumedCapacity"})) (clojure.core/contains? input :conditional-operator) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-conditional-operator (input :conditional-operator)) #:http.request.field{:name "ConditionalOperator", :shape "ConditionalOperator"})) (clojure.core/contains? input :update-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-expression (input :update-expression)) #:http.request.field{:name "UpdateExpression", :shape "UpdateExpression"})) (clojure.core/contains? input :condition-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-expression (input :condition-expression)) #:http.request.field{:name "ConditionExpression", :shape "ConditionExpression"})) (clojure.core/contains? input :expression-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-name-map (input :expression-attribute-names)) #:http.request.field{:name "ExpressionAttributeNames", :shape "ExpressionAttributeNameMap"})) (clojure.core/contains? input :return-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-value (input :return-values)) #:http.request.field{:name "ReturnValues", :shape "ReturnValue"})) (clojure.core/contains? input :expression-attribute-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-attribute-value-map (input :expression-attribute-values)) #:http.request.field{:name "ExpressionAttributeValues", :shape "ExpressionAttributeValueMap"})) (clojure.core/contains? input :return-item-collection-metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-item-collection-metrics (input :return-item-collection-metrics)) #:http.request.field{:name "ReturnItemCollectionMetrics", :shape "ReturnItemCollectionMetrics"}))))

(clojure.core/defn- req-update-global-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :global-table-name)) #:http.request.field{:name "GlobalTableName", :shape "TableName"}) (clojure.core/into (ser-replica-update-list (input :replica-updates)) #:http.request.field{:name "ReplicaUpdates", :shape "ReplicaUpdateList"})]}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-table-from-backup-input/target-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/restore-table-from-backup-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.restore-table-from-backup-input/target-table-name :portkey.aws.dynamodb.-2012-08-10/backup-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.update-item-output/attributes :portkey.aws.dynamodb.-2012-08-10/consumed-capacity :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/stream-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/stream-enabled :portkey.aws.dynamodb.-2012-08-10/stream-view-type]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-global-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/global-table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-status #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.get-item-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.get-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/get-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/key] :opt-un [:portkey.aws.dynamodb.-2012-08-10.get-item-input/attributes-to-get :portkey.aws.dynamodb.-2012-08-10/consistent-read :portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity :portkey.aws.dynamodb.-2012-08-10/projection-expression :portkey.aws.dynamodb.-2012-08-10.get-item-input/expression-attribute-names]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/sse-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/tag-value-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-global-secondary-index-action (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.create-global-table-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.create-global-table-input/replication-group (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-global-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.create-global-table-input/global-table-name :portkey.aws.dynamodb.-2012-08-10.create-global-table-input/replication-group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.expected-attribute-value/value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.expected-attribute-value/exists (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/expected-attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.expected-attribute-value/value :portkey.aws.dynamodb.-2012-08-10.expected-attribute-value/exists :portkey.aws.dynamodb.-2012-08-10/comparison-operator :portkey.aws.dynamodb.-2012-08-10/attribute-value-list]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/non-key-attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/non-key-attribute-name :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-variable (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-collection-size-estimate-range (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/item-collection-size-estimate-bound))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-settings-update-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/replica-settings-update :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-specification/point-in-time-recovery-enabled (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-specification/point-in-time-recovery-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-description-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-description))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-table-input/global-secondary-index-updates (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10/attribute-definitions :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput :portkey.aws.dynamodb.-2012-08-10.update-table-input/global-secondary-index-updates :portkey.aws.dynamodb.-2012-08-10/stream-specification :portkey.aws.dynamodb.-2012-08-10/sse-specification]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/time-range-upper-bound clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.index-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/index-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.index-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-output/tags (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/tag-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-output/next-token (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/next-token-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-tags-of-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-output/tags :portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-status #{:deleted :creating "AVAILABLE" "CREATING" :available "DELETED"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.item-collection-metrics/item-collection-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/item-collection-key-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.item-collection-metrics/size-estimate-range-gb (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/item-collection-size-estimate-range))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.item-collection-metrics/item-collection-key :portkey.aws.dynamodb.-2012-08-10.item-collection-metrics/size-estimate-range-gb]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-description/replication-group (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-description/global-table-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/global-table-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-description/creation-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-description/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.global-table-description/replication-group :portkey.aws.dynamodb.-2012-08-10.global-table-description/global-table-arn :portkey.aws.dynamodb.-2012-08-10.global-table-description/creation-date-time :portkey.aws.dynamodb.-2012-08-10/global-table-status :portkey.aws.dynamodb.-2012-08-10.global-table-description/global-table-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backfilling clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/index-status #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-update/create (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/create-replica-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-update/delete (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/delete-replica-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.replica-update/create :portkey.aws.dynamodb.-2012-08-10.replica-update/delete]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.source-table-feature-details/stream-description (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/stream-specification))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/source-table-feature-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/local-secondary-indexes :portkey.aws.dynamodb.-2012-08-10/global-secondary-indexes :portkey.aws.dynamodb.-2012-08-10.source-table-feature-details/stream-description :portkey.aws.dynamodb.-2012-08-10/time-to-live-description :portkey.aws.dynamodb.-2012-08-10/sse-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.global-table-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.delete-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.delete-item-output/attributes :portkey.aws.dynamodb.-2012-08-10/consumed-capacity :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-description-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-description))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table/replication-group (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.global-table/global-table-name :portkey.aws.dynamodb.-2012-08-10.global-table/replication-group]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/number-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/number-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.get-item-output/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/get-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.get-item-output/item :portkey.aws.dynamodb.-2012-08-10/consumed-capacity]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/consumed-capacity-units clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-get-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/batch-get-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.batch-get-item-input/request-items] :opt-un [:portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/region-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-global-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/global-table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.source-table-details/table-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/source-table-details (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/table-id :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/table-creation-date-time :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-arn :portkey.aws.dynamodb.-2012-08-10.source-table-details/table-size-bytes :portkey.aws.dynamodb.-2012-08-10/item-count]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-action #{"DELETE" "ADD" :delete :put :add "PUT"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-time-to-live-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/time-to-live-specification]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.projection/non-key-attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/non-key-attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/projection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/projection-type :portkey.aws.dynamodb.-2012-08-10.projection/non-key-attributes]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/global-table))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/return-value #{:updated-new :updated-old "UPDATED_OLD" "ALL_NEW" :all-old "NONE" "UPDATED_NEW" "ALL_OLD" :all-new :none})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.time-to-live-specification/enabled (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/time-to-live-enabled))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.time-to-live-specification/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/time-to-live-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/time-to-live-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.time-to-live-specification/enabled :portkey.aws.dynamodb.-2012-08-10.time-to-live-specification/attribute-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\p{Print}+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/index-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-definition/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-definition/attribute-type (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/scalar-attribute-type))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.attribute-definition/attribute-name :portkey.aws.dynamodb.-2012-08-10.attribute-definition/attribute-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-collection-key-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/key :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics-multiple (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-read-capacity-auto-scaling-settings (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-write-capacity-auto-scaling-settings (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-description (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10/index-status :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-read-capacity-units :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-read-capacity-auto-scaling-settings :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-write-capacity-units :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-description/provisioned-write-capacity-auto-scaling-settings]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/region-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.continuous-backups-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/continuous-backups-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.continuous-backups-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.create-table-input/local-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.create-table-input/global-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/attribute-definitions :portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput] :opt-un [:portkey.aws.dynamodb.-2012-08-10.create-table-input/local-secondary-indexes :portkey.aws.dynamodb.-2012-08-10.create-table-input/global-secondary-indexes :portkey.aws.dynamodb.-2012-08-10/stream-specification :portkey.aws.dynamodb.-2012-08-10/sse-specification]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/disable-scale-in (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/scale-in-cooldown (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/scale-out-cooldown (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/target-value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/double))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-target-tracking-scaling-policy-configuration-update (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/target-value] :opt-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/disable-scale-in :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/scale-in-cooldown :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-update/scale-out-cooldown]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/secondary-indexes-capacity-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/capacity))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-variable :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-global-table-settings-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-global-table-settings-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.describe-global-table-settings-input/global-table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-name-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/table-name))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/endpoints (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/endpoint))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-summaries (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/backup-summary))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.tag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/resource-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.tag-resource-input/tags (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/tag-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/tag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.tag-resource-input/resource-arn :portkey.aws.dynamodb.-2012-08-10.tag-resource-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-global-table-settings-output/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-global-table-settings-output/replica-settings (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-global-table-settings-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.describe-global-table-settings-output/global-table-name :portkey.aws.dynamodb.-2012-08-10.describe-global-table-settings-output/replica-settings]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/non-key-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-arn-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-updates (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/attribute-value-update))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-definitions (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/attribute-definition))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-backup-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/backup-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/comparison-operator #{:not-contains "NULL" :ge :contains :eq "NE" "CONTAINS" "LT" "GE" :between "LE" "NOT_CONTAINS" :null :gt "BEGINS_WITH" "NOT_NULL" "EQ" :not-null :ne "GT" :le :lt "IN" "BETWEEN" :begins-with :in})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-global-secondary-index-action (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-time-to-live-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/time-to-live-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/filter-condition-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/condition))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-backups-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/backups-input-limit))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-backups-input/exclusive-start-backup-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/backup-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-backups-input/backup-type (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/backup-type-filter))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-backups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10.list-backups-input/limit :portkey.aws.dynamodb.-2012-08-10/time-range-lower-bound :portkey.aws.dynamodb.-2012-08-10/time-range-upper-bound :portkey.aws.dynamodb.-2012-08-10.list-backups-input/exclusive-start-backup-arn :portkey.aws.dynamodb.-2012-08-10.list-backups-input/backup-type]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-global-secondary-index-settings-update/provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-global-secondary-index-settings-update/provisioned-write-capacity-auto-scaling-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-update))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-global-secondary-index-settings-update (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10.global-table-global-secondary-index-settings-update/provisioned-write-capacity-units :portkey.aws.dynamodb.-2012-08-10.global-table-global-secondary-index-settings-update/provisioned-write-capacity-auto-scaling-settings-update]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-backup-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/backup-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/null-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-global-secondary-index-action (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/projection :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.item-collection-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-collection-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.item-collection-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-update/update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/update-global-secondary-index-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-update/create (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/create-global-secondary-index-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-update/delete (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/delete-global-secondary-index-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.global-secondary-index-update/update :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-update/create :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-update/delete]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-table-output/table (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.describe-table-output/table]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/latest-stream-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/stream-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/creation-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/local-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/table-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/global-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/table-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/latest-stream-label (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-description/provisioned-throughput (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/stream-specification :portkey.aws.dynamodb.-2012-08-10.table-description/latest-stream-arn :portkey.aws.dynamodb.-2012-08-10/table-id :portkey.aws.dynamodb.-2012-08-10/attribute-definitions :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10.table-description/creation-date-time :portkey.aws.dynamodb.-2012-08-10.table-description/local-secondary-indexes :portkey.aws.dynamodb.-2012-08-10/table-status :portkey.aws.dynamodb.-2012-08-10.table-description/table-size-bytes :portkey.aws.dynamodb.-2012-08-10.table-description/item-count :portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10.table-description/global-secondary-indexes :portkey.aws.dynamodb.-2012-08-10.table-description/table-arn :portkey.aws.dynamodb.-2012-08-10/restore-summary :portkey.aws.dynamodb.-2012-08-10.table-description/latest-stream-label :portkey.aws.dynamodb.-2012-08-10.table-description/provisioned-throughput :portkey.aws.dynamodb.-2012-08-10/sse-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.time-to-live-description/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/time-to-live-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/time-to-live-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/time-to-live-status :portkey.aws.dynamodb.-2012-08-10.time-to-live-description/attribute-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/restore-in-progress clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-global-tables-input/exclusive-start-global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-global-tables-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-global-tables-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.list-global-tables-input/exclusive-start-global-table-name :portkey.aws.dynamodb.-2012-08-10.list-global-tables-input/limit :portkey.aws.dynamodb.-2012-08-10/region-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/projection-type #{:include "INCLUDE" :all :keys-only "ALL" "KEYS_ONLY"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-replica-action (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/region-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/map-attribute-value (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/attribute-map))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-global-secondary-index-settings-update-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/global-table-global-secondary-index-settings-update :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/last-increase-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/last-decrease-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/number-of-decreases-today (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/last-increase-date-time :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/last-decrease-date-time :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/number-of-decreases-today :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/read-capacity-units :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-description/write-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-update-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-update :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/restore-table-to-point-in-time-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/put-item-input-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-output/scanned-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.query-output/items :portkey.aws.dynamodb.-2012-08-10.query-output/count :portkey.aws.dynamodb.-2012-08-10.query-output/scanned-count :portkey.aws.dynamodb.-2012-08-10.query-output/last-evaluated-key :portkey.aws.dynamodb.-2012-08-10/consumed-capacity]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key-schema (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/key-schema-element :min-count 1 :max-count 2))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.put-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.put-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.put-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.put-item-input/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.put-item-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/put-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10.put-item-input/item] :opt-un [:portkey.aws.dynamodb.-2012-08-10.put-item-input/expected :portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity :portkey.aws.dynamodb.-2012-08-10/conditional-operator :portkey.aws.dynamodb.-2012-08-10/condition-expression :portkey.aws.dynamodb.-2012-08-10.put-item-input/expression-attribute-names :portkey.aws.dynamodb.-2012-08-10.put-item-input/return-values :portkey.aws.dynamodb.-2012-08-10.put-item-input/expression-attribute-values :portkey.aws.dynamodb.-2012-08-10/return-item-collection-metrics]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-time-to-live-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/time-to-live-specification] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/write-requests (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/write-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-limits-output/account-max-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-limits-output/account-max-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-limits-output/table-max-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-limits-output/table-max-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-limits-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.describe-limits-output/account-max-read-capacity-units :portkey.aws.dynamodb.-2012-08-10.describe-limits-output/account-max-write-capacity-units :portkey.aws.dynamodb.-2012-08-10.describe-limits-output/table-max-read-capacity-units :portkey.aws.dynamodb.-2012-08-10.describe-limits-output/table-max-write-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-global-tables-output/global-tables (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/global-table-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-global-tables-output/last-evaluated-global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-global-tables-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.list-global-tables-output/global-tables :portkey.aws.dynamodb.-2012-08-10.list-global-tables-output/last-evaluated-global-table-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.keys-and-attributes/keys (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.keys-and-attributes/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.keys-and-attributes/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/keys-and-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.keys-and-attributes/keys] :opt-un [:portkey.aws.dynamodb.-2012-08-10.keys-and-attributes/attributes-to-get :portkey.aws.dynamodb.-2012-08-10/consistent-read :portkey.aws.dynamodb.-2012-08-10/projection-expression :portkey.aws.dynamodb.-2012-08-10.keys-and-attributes/expression-attribute-names]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/minimum-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/maximum-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/auto-scaling-disabled (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/scaling-policy-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-update))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/minimum-units :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/maximum-units :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/auto-scaling-disabled :portkey.aws.dynamodb.-2012-08-10/auto-scaling-role-arn :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-update/scaling-policy-update]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.table-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/kms-master-key-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/binary-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/binary-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/consistent-read clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/time-to-live-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-type-filter #{"SYSTEM" "USER" :system :all "ALL" :user})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-description/earliest-restorable-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-description/latest-restorable-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-status :portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-description/earliest-restorable-date-time :portkey.aws.dynamodb.-2012-08-10.point-in-time-recovery-description/latest-restorable-date-time]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/tag-key-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/region-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/stream-view-type #{:new-image :old-image "NEW_IMAGE" "NEW_AND_OLD_IMAGES" :keys-only :new-and-old-images "OLD_IMAGE" "KEYS_ONLY"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-backups-output/last-evaluated-backup-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/backup-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-backups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backup-summaries :portkey.aws.dynamodb.-2012-08-10.list-backups-output/last-evaluated-backup-arn]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-table-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.global-table-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-update/replica-provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-update/replica-provisioned-read-capacity-auto-scaling-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-update))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-update/replica-global-secondary-index-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-settings-update (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/region-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10.replica-settings-update/replica-provisioned-read-capacity-units :portkey.aws.dynamodb.-2012-08-10.replica-settings-update/replica-provisioned-read-capacity-auto-scaling-settings-update :portkey.aws.dynamodb.-2012-08-10.replica-settings-update/replica-global-secondary-index-settings-update]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/tag-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/tag))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.replica-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-creation-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-read-capacity-auto-scaling-settings (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-write-capacity-auto-scaling-settings (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-global-secondary-index-settings (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-settings-description (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/region-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10/replica-status :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-read-capacity-units :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-read-capacity-auto-scaling-settings :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-write-capacity-units :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-provisioned-write-capacity-auto-scaling-settings :portkey.aws.dynamodb.-2012-08-10.replica-settings-description/replica-global-secondary-index-settings]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-backup-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backup-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-update/provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-update/provisioned-read-capacity-auto-scaling-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-update))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-update (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-update/provisioned-read-capacity-units :portkey.aws.dynamodb.-2012-08-10.replica-global-secondary-index-settings-update/provisioned-read-capacity-auto-scaling-settings-update]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/continuous-backups-status #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity #{"NONE" :total "TOTAL" :indexes :none "INDEXES"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/scan-segment (clojure.spec.alpha/int-in 0 999999))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/tag-key-string))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/replica))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/binary-attribute-value clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/conditional-operator #{:or "AND" :and "OR"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/null (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/null-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/l (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/list-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/bool (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/m (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/map-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/s (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/b (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/ns (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/number-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/n (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/bs (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/binary-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value/ss (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.attribute-value/null :portkey.aws.dynamodb.-2012-08-10.attribute-value/l :portkey.aws.dynamodb.-2012-08-10.attribute-value/bool :portkey.aws.dynamodb.-2012-08-10.attribute-value/m :portkey.aws.dynamodb.-2012-08-10.attribute-value/s :portkey.aws.dynamodb.-2012-08-10.attribute-value/b :portkey.aws.dynamodb.-2012-08-10.attribute-value/ns :portkey.aws.dynamodb.-2012-08-10.attribute-value/n :portkey.aws.dynamodb.-2012-08-10.attribute-value/bs :portkey.aws.dynamodb.-2012-08-10.attribute-value/ss]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/continuous-backups-description (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/continuous-backups-status] :opt-un [:portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/sse-status #{"DISABLED" :disabled "DISABLING" "ENABLING" "UPDATING" :disabling :enabling :updating "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics-per-table (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics-multiple))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 37 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/minimum-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/maximum-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/auto-scaling-disabled (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/auto-scaling-role-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/scaling-policies (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/minimum-units :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/maximum-units :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/auto-scaling-disabled :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/auto-scaling-role-arn :portkey.aws.dynamodb.-2012-08-10.auto-scaling-settings-description/scaling-policies]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-table-status #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-continuous-backups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/continuous-backups-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-description/policy-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-description/target-tracking-scaling-policy-configuration (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-target-tracking-scaling-policy-configuration-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-description/policy-name :portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-description/target-tracking-scaling-policy-configuration]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/local-secondary-indexes (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-info))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/batch-get-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/keys-and-attributes))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-provisioned-write-capacity-auto-scaling-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-settings-update))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-global-secondary-index-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/global-table-global-secondary-index-settings-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/replica-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-settings-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-global-table-settings-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-provisioned-write-capacity-units :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-provisioned-write-capacity-auto-scaling-settings-update :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/global-table-global-secondary-index-settings-update :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-input/replica-settings-update]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-global-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/global-table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/expected-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/expected-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/scan-filter (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/filter-condition-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/filter-expression (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/condition-expression))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/segment (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/scan-segment))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/total-segments (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/scan-total-segments))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/scan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10.scan-input/scan-filter :portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10.scan-input/attributes-to-get :portkey.aws.dynamodb.-2012-08-10.scan-input/limit :portkey.aws.dynamodb.-2012-08-10/consistent-read :portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity :portkey.aws.dynamodb.-2012-08-10/conditional-operator :portkey.aws.dynamodb.-2012-08-10.scan-input/filter-expression :portkey.aws.dynamodb.-2012-08-10.scan-input/segment :portkey.aws.dynamodb.-2012-08-10.scan-input/exclusive-start-key :portkey.aws.dynamodb.-2012-08-10.scan-input/total-segments :portkey.aws.dynamodb.-2012-08-10.scan-input/expression-attribute-names :portkey.aws.dynamodb.-2012-08-10/projection-expression :portkey.aws.dynamodb.-2012-08-10/select :portkey.aws.dynamodb.-2012-08-10.scan-input/expression-attribute-values]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-endpoints-response (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/endpoints] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/consumed-capacity-units))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/table (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/capacity))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/local-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/secondary-indexes-capacity-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/global-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/secondary-indexes-capacity-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/consumed-capacity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/capacity-units :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/table :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/local-secondary-indexes :portkey.aws.dynamodb.-2012-08-10.consumed-capacity/global-secondary-indexes]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/time-range-lower-bound clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.sse-specification/enabled (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/sse-enabled))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/sse-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.sse-specification/enabled :portkey.aws.dynamodb.-2012-08-10/sse-type :portkey.aws.dynamodb.-2012-08-10/kms-master-key-id]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/projection :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.describe-global-table-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-global-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.describe-global-table-input/global-table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.backup-details/backup-expiry-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-details (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/backup-arn :portkey.aws.dynamodb.-2012-08-10/backup-name :portkey.aws.dynamodb.-2012-08-10/backup-status :portkey.aws.dynamodb.-2012-08-10/backup-type :portkey.aws.dynamodb.-2012-08-10/backup-creation-date-time] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backup-size-bytes :portkey.aws.dynamodb.-2012-08-10.backup-details/backup-expiry-date-time]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-tables-input-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-backup-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backup-details]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/batch-write-item-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/write-requests))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/local-secondary-index))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :min-count 1))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-status #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.untag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/resource-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.untag-resource-input/tag-keys (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/untag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.untag-resource-input/resource-arn :portkey.aws.dynamodb.-2012-08-10.untag-resource-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.delete-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.delete-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.delete-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.delete-item-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/key] :opt-un [:portkey.aws.dynamodb.-2012-08-10.delete-item-input/expected :portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity :portkey.aws.dynamodb.-2012-08-10/conditional-operator :portkey.aws.dynamodb.-2012-08-10/condition-expression :portkey.aws.dynamodb.-2012-08-10.delete-item-input/expression-attribute-names :portkey.aws.dynamodb.-2012-08-10.delete-item-input/return-values :portkey.aws.dynamodb.-2012-08-10.delete-item-input/expression-attribute-values :portkey.aws.dynamodb.-2012-08-10/return-item-collection-metrics]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-output/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-output/replica-settings (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-global-table-settings-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-output/global-table-name :portkey.aws.dynamodb.-2012-08-10.update-global-table-settings-output/replica-settings]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/scalar-attribute-type #{:n "S" :s "B" :b "N"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backups-input-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-time-to-live-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.backup-summary/backup-expiry-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backup-status :portkey.aws.dynamodb.-2012-08-10/table-id :portkey.aws.dynamodb.-2012-08-10/backup-creation-date-time :portkey.aws.dynamodb.-2012-08-10/backup-name :portkey.aws.dynamodb.-2012-08-10.backup-summary/backup-expiry-date-time :portkey.aws.dynamodb.-2012-08-10/backup-arn :portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/table-arn :portkey.aws.dynamodb.-2012-08-10/backup-type :portkey.aws.dynamodb.-2012-08-10/backup-size-bytes]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-description-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/replica-description))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-continuous-backups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-specification] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tables-output/table-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tables-output/last-evaluated-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-tables-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.list-tables-output/table-names :portkey.aws.dynamodb.-2012-08-10.list-tables-output/last-evaluated-table-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-get-item-output/responses (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/batch-get-response-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-get-item-output/unprocessed-keys (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-get-item-output/consumed-capacity (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/consumed-capacity-multiple))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/batch-get-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.batch-get-item-output/responses :portkey.aws.dynamodb.-2012-08-10.batch-get-item-output/unprocessed-keys :portkey.aws.dynamodb.-2012-08-10.batch-get-item-output/consumed-capacity]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-creation-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-collection-size-estimate-bound clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/index-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/index-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/provisioned-throughput (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backfilling :portkey.aws.dynamodb.-2012-08-10/index-status :portkey.aws.dynamodb.-2012-08-10/projection :portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/index-size-bytes :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/index-arn :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/item-count :portkey.aws.dynamodb.-2012-08-10.global-secondary-index-description/provisioned-throughput]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.put-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/put-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.put-item-output/attributes :portkey.aws.dynamodb.-2012-08-10/consumed-capacity :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/time-to-live-status #{"DISABLED" :disabled "DISABLING" "ENABLING" :disabling :enabling "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.capacity/capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/consumed-capacity-units))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/capacity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.capacity/capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/item-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/scan-total-segments (clojure.spec.alpha/int-in 1 1000000))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.invalid-restore-time-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/invalid-restore-time-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.invalid-restore-time-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 37 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/source-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/target-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/use-latest-restorable-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/restore-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/restore-table-to-point-in-time-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/source-table-name :portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/target-table-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/use-latest-restorable-time :portkey.aws.dynamodb.-2012-08-10.restore-table-to-point-in-time-input/restore-date-time]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/local-secondary-index (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/projection] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-update-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/replica-update))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/scan-index-forward (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/key-condition-expression (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key-expression))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/filter-expression (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/condition-expression))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/query-filter (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/filter-condition-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.query-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name] :opt-un [:portkey.aws.dynamodb.-2012-08-10.query-input/scan-index-forward :portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10.query-input/attributes-to-get :portkey.aws.dynamodb.-2012-08-10.query-input/limit :portkey.aws.dynamodb.-2012-08-10/consistent-read :portkey.aws.dynamodb.-2012-08-10.query-input/key-condition-expression :portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity :portkey.aws.dynamodb.-2012-08-10/conditional-operator :portkey.aws.dynamodb.-2012-08-10.query-input/filter-expression :portkey.aws.dynamodb.-2012-08-10.query-input/exclusive-start-key :portkey.aws.dynamodb.-2012-08-10.query-input/expression-attribute-names :portkey.aws.dynamodb.-2012-08-10/key-conditions :portkey.aws.dynamodb.-2012-08-10.query-input/query-filter :portkey.aws.dynamodb.-2012-08-10/projection-expression :portkey.aws.dynamodb.-2012-08-10/select :portkey.aws.dynamodb.-2012-08-10.query-input/expression-attribute-values]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/projection]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.put-request/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/put-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.put-request/item] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/disable-scale-in (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/scale-in-cooldown (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/scale-out-cooldown (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/target-value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/double))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-target-tracking-scaling-policy-configuration-description (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/target-value] :opt-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/disable-scale-in :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/scale-in-cooldown :portkey.aws.dynamodb.-2012-08-10.auto-scaling-target-tracking-scaling-policy-configuration-description/scale-out-cooldown]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.backup-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.backup-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.table-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value-update/value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.attribute-value-update/action (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/attribute-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-value-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.attribute-value-update/value :portkey.aws.dynamodb.-2012-08-10.attribute-value-update/action]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-indexes (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-info))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/condition-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backup-details :portkey.aws.dynamodb.-2012-08-10/source-table-details :portkey.aws.dynamodb.-2012-08-10/source-table-feature-details]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-continuous-backups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/continuous-backups-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.replica-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.replica-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-status #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.endpoint/address (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.endpoint/cache-period-in-minutes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/endpoint (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.endpoint/address :portkey.aws.dynamodb.-2012-08-10.endpoint/cache-period-in-minutes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/positive-integer-object (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/stream-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-write-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/batch-write-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.batch-write-item-input/request-items] :opt-un [:portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity :portkey.aws.dynamodb.-2012-08-10/return-item-collection-metrics]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/batch-get-response-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/item-list))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/restore-table-from-backup-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/consumed-capacity-multiple (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/consumed-capacity))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-backup-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/backup-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-type #{"SYSTEM" "USER" :system :user})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key-schema-element (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.key-schema-element/attribute-name :portkey.aws.dynamodb.-2012-08-10/key-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/attribute-value-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-backup-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/backup-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-summary/source-backup-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/backup-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-summary/source-table-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.restore-summary/restore-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/restore-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.restore-summary/restore-date-time :portkey.aws.dynamodb.-2012-08-10/restore-in-progress] :opt-un [:portkey.aws.dynamodb.-2012-08-10.restore-summary/source-backup-arn :portkey.aws.dynamodb.-2012-08-10.restore-summary/source-table-arn]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-write-item-output/unprocessed-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-write-item-output/item-collection-metrics (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/item-collection-metrics-per-table))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.batch-write-item-output/consumed-capacity (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/consumed-capacity-multiple))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/batch-write-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.batch-write-item-output/unprocessed-items :portkey.aws.dynamodb.-2012-08-10.batch-write-item-output/item-collection-metrics :portkey.aws.dynamodb.-2012-08-10.batch-write-item-output/consumed-capacity]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-size-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-update-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-update))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.tag/key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/tag-key-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.tag/value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/tag-value-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.tag/key :portkey.aws.dynamodb.-2012-08-10.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/condition (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/comparison-operator] :opt-un [:portkey.aws.dynamodb.-2012-08-10/attribute-value-list]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.backup-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/backup-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.backup-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tables-input/exclusive-start-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tables-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/list-tables-input-limit))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-tables-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.list-tables-input/exclusive-start-table-name :portkey.aws.dynamodb.-2012-08-10.list-tables-input/limit]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-output/scanned-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.scan-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/scan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.scan-output/items :portkey.aws.dynamodb.-2012-08-10.scan-output/count :portkey.aws.dynamodb.-2012-08-10.scan-output/scanned-count :portkey.aws.dynamodb.-2012-08-10.scan-output/last-evaluated-key :portkey.aws.dynamodb.-2012-08-10/consumed-capacity]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.conditional-check-failed-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/conditional-check-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.conditional-check-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-description-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/replica-global-secondary-index-settings-description))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/create-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key-conditions (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/attribute-name :portkey.aws.dynamodb.-2012-08-10/condition))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.table-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/table-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.table-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-update/policy-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-update/target-tracking-scaling-policy-configuration (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/auto-scaling-target-tracking-scaling-policy-configuration-update))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/auto-scaling-policy-update (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-update/target-tracking-scaling-policy-configuration] :opt-un [:portkey.aws.dynamodb.-2012-08-10.auto-scaling-policy-update/policy-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.local-secondary-index-description/index-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.local-secondary-index-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.local-secondary-index-description/index-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/local-secondary-index-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/projection :portkey.aws.dynamodb.-2012-08-10.local-secondary-index-description/index-size-bytes :portkey.aws.dynamodb.-2012-08-10.local-secondary-index-description/item-count :portkey.aws.dynamodb.-2012-08-10.local-secondary-index-description/index-arn]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/delete-replica-action (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/region-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-variable (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/projection-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.provisioned-throughput/read-capacity-units :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput/write-capacity-units] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.sse-description/status (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/sse-status))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/sse-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.sse-description/status :portkey.aws.dynamodb.-2012-08-10/sse-type :portkey.aws.dynamodb.-2012-08-10/kms-master-key-arn]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/select #{"COUNT" "ALL_PROJECTED_ATTRIBUTES" :specific-attributes :all-projected-attributes "ALL_ATTRIBUTES" :count "SPECIFIC_ATTRIBUTES" :all-attributes})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/string-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/string-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/kms-master-key-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/resource-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-input/next-token (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/next-token-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/list-tags-of-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-input/resource-arn] :opt-un [:portkey.aws.dynamodb.-2012-08-10.list-tags-of-resource-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/describe-continuous-backups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/resource-arn-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1283))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/next-token-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-index (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/index-name :portkey.aws.dynamodb.-2012-08-10/key-schema :portkey.aws.dynamodb.-2012-08-10/projection :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-description-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-description))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/global-secondary-index-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/global-secondary-index))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-item-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10/table-name :portkey.aws.dynamodb.-2012-08-10/key] :opt-un [:portkey.aws.dynamodb.-2012-08-10.update-item-input/expected :portkey.aws.dynamodb.-2012-08-10/attribute-updates :portkey.aws.dynamodb.-2012-08-10/return-consumed-capacity :portkey.aws.dynamodb.-2012-08-10/conditional-operator :portkey.aws.dynamodb.-2012-08-10/update-expression :portkey.aws.dynamodb.-2012-08-10/condition-expression :portkey.aws.dynamodb.-2012-08-10.update-item-input/expression-attribute-names :portkey.aws.dynamodb.-2012-08-10.update-item-input/return-values :portkey.aws.dynamodb.-2012-08-10.update-item-input/expression-attribute-values :portkey.aws.dynamodb.-2012-08-10/return-item-collection-metrics]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/return-item-collection-metrics #{"SIZE" :size "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2012-08-10/expression-attribute-name-variable :portkey.aws.dynamodb.-2012-08-10/attribute-name))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/key-type #{:hash "RANGE" "HASH" :range})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/write-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10/put-request :portkey.aws.dynamodb.-2012-08-10/delete-request]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/integer-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.update-global-table-input/replica-updates (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/replica-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/update-global-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2012-08-10.update-global-table-input/global-table-name :portkey.aws.dynamodb.-2012-08-10.update-global-table-input/replica-updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/replica-settings-description-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2012-08-10/replica-settings-description))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/time-to-live-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2012-08-10.provisioned-throughput-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2012-08-10/sse-type #{"KMS" :aes-256 :kms "AES256"})

(clojure.core/defn tag-resource ([tag-resource-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-tag-resource-input tag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/tag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResource", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error, "ResourceInUseException" :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/tag-resource-input) :ret clojure.core/true?)

(clojure.core/defn create-global-table ([create-global-table-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-global-table-input create-global-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/create-global-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/create-global-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGlobalTable", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error, "GlobalTableAlreadyExistsException" :portkey.aws.dynamodb.-2012-08-10/global-table-already-exists-exception, "TableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/table-not-found-exception}})))))
(clojure.spec.alpha/fdef create-global-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/create-global-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/create-global-table-output))

(clojure.core/defn update-table ([update-table-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-table-input update-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/update-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/update-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTable", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef update-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/update-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/update-table-output))

(clojure.core/defn describe-endpoints ([] (describe-endpoints {})) ([describe-endpoints-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-endpoints-request describe-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-endpoints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpoints", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoints :args (clojure.spec.alpha/? :portkey.aws.dynamodb.-2012-08-10/describe-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-endpoints-response))

(clojure.core/defn update-global-table ([update-global-table-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-global-table-input update-global-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/update-global-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/update-global-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGlobalTable", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error, "GlobalTableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/global-table-not-found-exception, "ReplicaAlreadyExistsException" :portkey.aws.dynamodb.-2012-08-10/replica-already-exists-exception, "ReplicaNotFoundException" :portkey.aws.dynamodb.-2012-08-10/replica-not-found-exception, "TableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/table-not-found-exception}})))))
(clojure.spec.alpha/fdef update-global-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/update-global-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/update-global-table-output))

(clojure.core/defn update-item ([update-item-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-item-input update-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/update-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/update-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateItem", :http.request.spec/error-spec {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2012-08-10/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb.-2012-08-10/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef update-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/update-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/update-item-output))

(clojure.core/defn scan ([scan-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-scan-input scan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/scan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/scan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Scan", :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef scan :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/scan-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/scan-output))

(clojure.core/defn describe-limits ([] (describe-limits {})) ([describe-limits-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-limits-input describe-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-limits-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLimits", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-limits :args (clojure.spec.alpha/? :portkey.aws.dynamodb.-2012-08-10/describe-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-limits-output))

(clojure.core/defn list-backups ([] (list-backups {})) ([list-backups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-backups-input list-backups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/list-backups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/list-backups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBackups", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef list-backups :args (clojure.spec.alpha/? :portkey.aws.dynamodb.-2012-08-10/list-backups-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/list-backups-output))

(clojure.core/defn create-table ([create-table-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-table-input create-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/create-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/create-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTable", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef create-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/create-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/create-table-output))

(clojure.core/defn describe-time-to-live ([describe-time-to-live-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-time-to-live-input describe-time-to-live-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-time-to-live-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-time-to-live-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTimeToLive", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-time-to-live :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/describe-time-to-live-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-time-to-live-output))

(clojure.core/defn list-tags-of-resource ([list-tags-of-resource-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-of-resource-input list-tags-of-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/list-tags-of-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/list-tags-of-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsOfResource", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tags-of-resource :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/list-tags-of-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/list-tags-of-resource-output))

(clojure.core/defn describe-global-table ([describe-global-table-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-global-table-input describe-global-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-global-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-global-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeGlobalTable", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error, "GlobalTableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/global-table-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-global-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/describe-global-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-global-table-output))

(clojure.core/defn describe-backup ([describe-backup-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-backup-input describe-backup-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-backup-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-backup-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBackup", :http.request.spec/error-spec {"BackupNotFoundException" :portkey.aws.dynamodb.-2012-08-10/backup-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/describe-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-backup-output))

(clojure.core/defn update-time-to-live ([update-time-to-live-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-time-to-live-input update-time-to-live-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/update-time-to-live-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/update-time-to-live-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTimeToLive", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef update-time-to-live :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/update-time-to-live-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/update-time-to-live-output))

(clojure.core/defn query ([query-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-query-input query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Query", :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef query :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/query-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/query-output))

(clojure.core/defn describe-global-table-settings ([describe-global-table-settings-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-global-table-settings-input describe-global-table-settings-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-global-table-settings-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-global-table-settings-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeGlobalTableSettings", :http.request.spec/error-spec {"GlobalTableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/global-table-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-global-table-settings :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/describe-global-table-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-global-table-settings-output))

(clojure.core/defn list-global-tables ([] (list-global-tables {})) ([list-global-tables-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-global-tables-input list-global-tables-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/list-global-tables-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/list-global-tables-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGlobalTables", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef list-global-tables :args (clojure.spec.alpha/? :portkey.aws.dynamodb.-2012-08-10/list-global-tables-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/list-global-tables-output))

(clojure.core/defn list-tables ([] (list-tables {})) ([list-tables-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tables-input list-tables-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/list-tables-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/list-tables-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTables", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tables :args (clojure.spec.alpha/? :portkey.aws.dynamodb.-2012-08-10/list-tables-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/list-tables-output))

(clojure.core/defn batch-get-item ([batch-get-item-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-item-input batch-get-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/batch-get-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/batch-get-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetItem", :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef batch-get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/batch-get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/batch-get-item-output))

(clojure.core/defn batch-write-item ([batch-write-item-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-write-item-input batch-write-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/batch-write-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/batch-write-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchWriteItem", :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb.-2012-08-10/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef batch-write-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/batch-write-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/batch-write-item-output))

(clojure.core/defn create-backup ([create-backup-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-backup-input create-backup-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/create-backup-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/create-backup-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateBackup", :http.request.spec/error-spec {"TableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/table-not-found-exception, "TableInUseException" :portkey.aws.dynamodb.-2012-08-10/table-in-use-exception, "ContinuousBackupsUnavailableException" :portkey.aws.dynamodb.-2012-08-10/continuous-backups-unavailable-exception, "BackupInUseException" :portkey.aws.dynamodb.-2012-08-10/backup-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef create-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/create-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/create-backup-output))

(clojure.core/defn get-item ([get-item-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-item-input get-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/get-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/get-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetItem", :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/get-item-output))

(clojure.core/defn update-global-table-settings ([update-global-table-settings-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-global-table-settings-input update-global-table-settings-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/update-global-table-settings-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/update-global-table-settings-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGlobalTableSettings", :http.request.spec/error-spec {"GlobalTableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/global-table-not-found-exception, "ReplicaNotFoundException" :portkey.aws.dynamodb.-2012-08-10/replica-not-found-exception, "IndexNotFoundException" :portkey.aws.dynamodb.-2012-08-10/index-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef update-global-table-settings :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/update-global-table-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/update-global-table-settings-output))

(clojure.core/defn describe-continuous-backups ([describe-continuous-backups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-continuous-backups-input describe-continuous-backups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-continuous-backups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-continuous-backups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeContinuousBackups", :http.request.spec/error-spec {"TableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/table-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-continuous-backups :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/describe-continuous-backups-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-continuous-backups-output))

(clojure.core/defn restore-table-to-point-in-time ([restore-table-to-point-in-time-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-restore-table-to-point-in-time-input restore-table-to-point-in-time-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/restore-table-to-point-in-time-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/restore-table-to-point-in-time-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RestoreTableToPointInTime", :http.request.spec/error-spec {"TableAlreadyExistsException" :portkey.aws.dynamodb.-2012-08-10/table-already-exists-exception, "TableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/table-not-found-exception, "TableInUseException" :portkey.aws.dynamodb.-2012-08-10/table-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InvalidRestoreTimeException" :portkey.aws.dynamodb.-2012-08-10/invalid-restore-time-exception, "PointInTimeRecoveryUnavailableException" :portkey.aws.dynamodb.-2012-08-10/point-in-time-recovery-unavailable-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef restore-table-to-point-in-time :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/restore-table-to-point-in-time-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/restore-table-to-point-in-time-output))

(clojure.core/defn untag-resource ([untag-resource-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-untag-resource-input untag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/untag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResource", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error, "ResourceInUseException" :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/untag-resource-input) :ret clojure.core/true?)

(clojure.core/defn update-continuous-backups ([update-continuous-backups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-continuous-backups-input update-continuous-backups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/update-continuous-backups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/update-continuous-backups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateContinuousBackups", :http.request.spec/error-spec {"TableNotFoundException" :portkey.aws.dynamodb.-2012-08-10/table-not-found-exception, "ContinuousBackupsUnavailableException" :portkey.aws.dynamodb.-2012-08-10/continuous-backups-unavailable-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef update-continuous-backups :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/update-continuous-backups-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/update-continuous-backups-output))

(clojure.core/defn delete-backup ([delete-backup-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-backup-input delete-backup-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/delete-backup-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/delete-backup-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBackup", :http.request.spec/error-spec {"BackupNotFoundException" :portkey.aws.dynamodb.-2012-08-10/backup-not-found-exception, "BackupInUseException" :portkey.aws.dynamodb.-2012-08-10/backup-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/delete-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/delete-backup-output))

(clojure.core/defn delete-item ([delete-item-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-item-input delete-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/delete-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/delete-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteItem", :http.request.spec/error-spec {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2012-08-10/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb.-2012-08-10/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/delete-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/delete-item-output))

(clojure.core/defn restore-table-from-backup ([restore-table-from-backup-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-restore-table-from-backup-input restore-table-from-backup-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/restore-table-from-backup-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/restore-table-from-backup-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RestoreTableFromBackup", :http.request.spec/error-spec {"TableAlreadyExistsException" :portkey.aws.dynamodb.-2012-08-10/table-already-exists-exception, "TableInUseException" :portkey.aws.dynamodb.-2012-08-10/table-in-use-exception, "BackupNotFoundException" :portkey.aws.dynamodb.-2012-08-10/backup-not-found-exception, "BackupInUseException" :portkey.aws.dynamodb.-2012-08-10/backup-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef restore-table-from-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/restore-table-from-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/restore-table-from-backup-output))

(clojure.core/defn put-item ([put-item-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-item-input put-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/put-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/put-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutItem", :http.request.spec/error-spec {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2012-08-10/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2012-08-10/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb.-2012-08-10/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef put-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/put-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/put-item-output))

(clojure.core/defn describe-table ([describe-table-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-table-input describe-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/describe-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/describe-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTable", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/describe-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/describe-table-output))

(clojure.core/defn delete-table ([delete-table-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-table-input delete-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDB_20120810", :http.request.spec/output-spec :portkey.aws.dynamodb.-2012-08-10/delete-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2012-08-10/delete-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTable", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.dynamodb.-2012-08-10/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2012-08-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2012-08-10/delete-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2012-08-10/delete-table-output))
