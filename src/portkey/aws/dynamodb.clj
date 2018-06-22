(ns portkey.aws.dynamodb (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-table-from-backup-input/target-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/restore-table-from-backup-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.restore-table-from-backup-input/TargetTableName :portkey.aws.dynamodb/BackupArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.update-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/update-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.update-item-output/Attributes :portkey.aws.dynamodb/ConsumedCapacity :portkey.aws.dynamodb/ItemCollectionMetrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/stream-specification (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/StreamEnabled :portkey.aws.dynamodb/StreamViewType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-global-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/GlobalTableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CREATING" "CREATING", :creating "CREATING", "UPDATING" "UPDATING", :updating "UPDATING", "DELETING" "DELETING", :deleting "DELETING", "ACTIVE" "ACTIVE", :active "ACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.get-item-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.get-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/get-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/Key] :opt-un [:portkey.aws.dynamodb.get-item-input/AttributesToGet :portkey.aws.dynamodb/ConsistentRead :portkey.aws.dynamodb/ReturnConsumedCapacity :portkey.aws.dynamodb/ProjectionExpression :portkey.aws.dynamodb.get-item-input/ExpressionAttributeNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/sseenabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/tag-value-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-global-secondary-index-action (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.create-global-table-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.create-global-table-input/replication-group (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/create-global-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.create-global-table-input/GlobalTableName :portkey.aws.dynamodb.create-global-table-input/ReplicationGroup] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.expected-attribute-value/value (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.expected-attribute-value/exists (clojure.spec.alpha/and :portkey.aws.dynamodb/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/expected-attribute-value (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.expected-attribute-value/Value :portkey.aws.dynamodb.expected-attribute-value/Exists :portkey.aws.dynamodb/ComparisonOperator :portkey.aws.dynamodb/AttributeValueList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/non-key-attribute-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/non-key-attribute-name :min-count 1 :max-count 20) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/expression-attribute-value-variable (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/item-collection-size-estimate-range (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/item-collection-size-estimate-bound) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-settings-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/replica-settings-update :min-count 1 :max-count 50) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.point-in-time-recovery-specification/point-in-time-recovery-enabled (clojure.spec.alpha/and :portkey.aws.dynamodb/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/point-in-time-recovery-specification (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.point-in-time-recovery-specification/PointInTimeRecoveryEnabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/local-secondary-index-description-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/local-secondary-index-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.update-table-input/global-secondary-index-updates (clojure.spec.alpha/and :portkey.aws.dynamodb/global-secondary-index-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/update-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName] :opt-un [:portkey.aws.dynamodb/AttributeDefinitions :portkey.aws.dynamodb/ProvisionedThroughput :portkey.aws.dynamodb.update-table-input/GlobalSecondaryIndexUpdates :portkey.aws.dynamodb/StreamSpecification] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/time-range-upper-bound clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.index-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/index-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.index-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tags-of-resource-output/tags (clojure.spec.alpha/and :portkey.aws.dynamodb/tag-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tags-of-resource-output/next-token (clojure.spec.alpha/and :portkey.aws.dynamodb/next-token-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-tags-of-resource-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.list-tags-of-resource-output/Tags :portkey.aws.dynamodb.list-tags-of-resource-output/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CREATING" "CREATING", :creating "CREATING", "DELETED" "DELETED", :deleted "DELETED", "AVAILABLE" "AVAILABLE", :available "AVAILABLE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.item-collection-metrics/item-collection-key (clojure.spec.alpha/and :portkey.aws.dynamodb/item-collection-key-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.item-collection-metrics/size-estimate-rangegb (clojure.spec.alpha/and :portkey.aws.dynamodb/item-collection-size-estimate-range))
(clojure.spec.alpha/def :portkey.aws.dynamodb/item-collection-metrics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.item-collection-metrics/ItemCollectionKey :portkey.aws.dynamodb.item-collection-metrics/SizeEstimateRangeGB] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table-description/replication-group (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table-description/global-table-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/global-table-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table-description/creation-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table-description/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.global-table-description/ReplicationGroup :portkey.aws.dynamodb.global-table-description/GlobalTableArn :portkey.aws.dynamodb.global-table-description/CreationDateTime :portkey.aws.dynamodb/GlobalTableStatus :portkey.aws.dynamodb.global-table-description/GlobalTableName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backfilling clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/index-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CREATING" "CREATING", :creating "CREATING", "UPDATING" "UPDATING", :updating "UPDATING", "DELETING" "DELETING", :deleting "DELETING", "ACTIVE" "ACTIVE", :active "ACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-update/create (clojure.spec.alpha/and :portkey.aws.dynamodb/create-replica-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-update/delete (clojure.spec.alpha/and :portkey.aws.dynamodb/delete-replica-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-update (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.replica-update/Create :portkey.aws.dynamodb.replica-update/Delete] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.source-table-feature-details/stream-description (clojure.spec.alpha/and :portkey.aws.dynamodb/stream-specification))
(clojure.spec.alpha/def :portkey.aws.dynamodb/source-table-feature-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/LocalSecondaryIndexes :portkey.aws.dynamodb/GlobalSecondaryIndexes :portkey.aws.dynamodb.source-table-feature-details/StreamDescription :portkey.aws.dynamodb/TimeToLiveDescription :portkey.aws.dynamodb/SSEDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.global-table-already-exists-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.delete-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.delete-item-output/Attributes :portkey.aws.dynamodb/ConsumedCapacity :portkey.aws.dynamodb/ItemCollectionMetrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table/replication-group (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.global-table/GlobalTableName :portkey.aws.dynamodb.global-table/ReplicationGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/number-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/number-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.get-item-output/item (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/get-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.get-item-output/Item :portkey.aws.dynamodb/ConsumedCapacity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/consumed-capacity-units clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-get-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/batch-get-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.batch-get-item-input/RequestItems] :opt-un [:portkey.aws.dynamodb/ReturnConsumedCapacity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/RegionName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/create-global-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/GlobalTableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-limits-input (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-request (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/Key] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.source-table-details/table-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb/source-table-details (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/TableId :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/TableCreationDateTime :portkey.aws.dynamodb/ProvisionedThroughput] :opt-un [:portkey.aws.dynamodb/TableArn :portkey.aws.dynamodb.source-table-details/TableSizeBytes :portkey.aws.dynamodb/ItemCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-action (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ADD" "ADD", :add "ADD", "PUT" "PUT", :put "PUT", "DELETE" "DELETE", :delete "DELETE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-time-to-live-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TimeToLiveSpecification] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.projection/non-key-attributes (clojure.spec.alpha/and :portkey.aws.dynamodb/non-key-attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/projection (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/ProjectionType :portkey.aws.dynamodb.projection/NonKeyAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/global-table) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/return-value (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:updated-new "UPDATED_NEW", :updated-old "UPDATED_OLD", "UPDATED_OLD" "UPDATED_OLD", "ALL_NEW" "ALL_NEW", :all-old "ALL_OLD", "NONE" "NONE", "UPDATED_NEW" "UPDATED_NEW", "ALL_OLD" "ALL_OLD", :all-new "ALL_NEW", :none "NONE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.time-to-live-specification/enabled (clojure.spec.alpha/and :portkey.aws.dynamodb/time-to-live-enabled))
(clojure.spec.alpha/def :portkey.aws.dynamodb.time-to-live-specification/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb/time-to-live-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/time-to-live-specification (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.time-to-live-specification/Enabled :portkey.aws.dynamodb.time-to-live-specification/AttributeName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/index-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 3 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-definition/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-definition/attribute-type (clojure.spec.alpha/and :portkey.aws.dynamodb/scalar-attribute-type))
(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-definition (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.attribute-definition/AttributeName :portkey.aws.dynamodb.attribute-definition/AttributeType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/item-collection-key-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/key :min-count 1 :max-count 100) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/item-collection-metrics-multiple (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/item-collection-metrics) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-global-secondary-index-settings-description/provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-global-secondary-index-settings-description/provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-global-secondary-index-settings-description (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName] :opt-un [:portkey.aws.dynamodb/IndexStatus :portkey.aws.dynamodb.replica-global-secondary-index-settings-description/ProvisionedReadCapacityUnits :portkey.aws.dynamodb.replica-global-secondary-index-settings-description/ProvisionedWriteCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/RegionName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.continuous-backups-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/continuous-backups-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.continuous-backups-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.create-table-input/local-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb/local-secondary-index-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.create-table-input/global-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb/global-secondary-index-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/create-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/AttributeDefinitions :portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/ProvisionedThroughput] :opt-un [:portkey.aws.dynamodb.create-table-input/LocalSecondaryIndexes :portkey.aws.dynamodb.create-table-input/GlobalSecondaryIndexes :portkey.aws.dynamodb/StreamSpecification :portkey.aws.dynamodb/SSESpecification] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/secondary-indexes-capacity-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/index-name :portkey.aws.dynamodb/capacity))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/expression-attribute-value-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/expression-attribute-value-variable :portkey.aws.dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb/table-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-global-table-settings-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-global-table-settings-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.describe-global-table-settings-input/GlobalTableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/table-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/table-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/key-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/backup-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.tag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/resource-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.tag-resource-input/tags (clojure.spec.alpha/and :portkey.aws.dynamodb/tag-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/tag-resource-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.tag-resource-input/ResourceArn :portkey.aws.dynamodb.tag-resource-input/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-global-table-settings-output/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-global-table-settings-output/replica-settings (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-global-table-settings-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.describe-global-table-settings-output/GlobalTableName :portkey.aws.dynamodb.describe-global-table-settings-output/ReplicaSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/non-key-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.point-in-time-recovery-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/point-in-time-recovery-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.point-in-time-recovery-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-arn-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-updates (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/attribute-value-update))

(clojure.spec.alpha/def :portkey.aws.dynamodb.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.resource-in-use-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-definitions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/attribute-definition) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/create-backup-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/BackupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/comparison-operator (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:not-contains "NOT_CONTAINS", "NULL" "NULL", :ge "GE", :contains "CONTAINS", :eq "EQ", "NE" "NE", "CONTAINS" "CONTAINS", "LT" "LT", "GE" "GE", :between "BETWEEN", "LE" "LE", "NOT_CONTAINS" "NOT_CONTAINS", :null "NULL", :gt "GT", "BEGINS_WITH" "BEGINS_WITH", "NOT_NULL" "NOT_NULL", "EQ" "EQ", :not-null "NOT_NULL", :ne "NE", "GT" "GT", :le "LE", :lt "LT", "IN" "IN", "BETWEEN" "BETWEEN", :begins-with "BEGINS_WITH", :in "IN"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-global-secondary-index-action (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb/ProvisionedThroughput] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-time-to-live-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TimeToLiveDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/filter-condition-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/condition))

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-backups-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb/backups-input-limit))
(clojure.spec.alpha/def :portkey.aws.dynamodb.list-backups-input/exclusive-start-backup-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/backup-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-backups-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb.list-backups-input/Limit :portkey.aws.dynamodb/TimeRangeLowerBound :portkey.aws.dynamodb/TimeRangeUpperBound :portkey.aws.dynamodb.list-backups-input/ExclusiveStartBackupArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table-global-secondary-index-settings-update/provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-global-secondary-index-settings-update (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName] :opt-un [:portkey.aws.dynamodb.global-table-global-secondary-index-settings-update/ProvisionedWriteCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-backup-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/BackupArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/null-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/create-global-secondary-index-action (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/Projection :portkey.aws.dynamodb/ProvisionedThroughput] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.item-collection-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/item-collection-size-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.item-collection-size-limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.global-secondary-index-update/update (clojure.spec.alpha/and :portkey.aws.dynamodb/update-global-secondary-index-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-secondary-index-update/create (clojure.spec.alpha/and :portkey.aws.dynamodb/create-global-secondary-index-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-secondary-index-update/delete (clojure.spec.alpha/and :portkey.aws.dynamodb/delete-global-secondary-index-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-index-update (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.global-secondary-index-update/Update :portkey.aws.dynamodb.global-secondary-index-update/Create :portkey.aws.dynamodb.global-secondary-index-update/Delete] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-table-output/table (clojure.spec.alpha/and :portkey.aws.dynamodb/table-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.describe-table-output/Table] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/latest-stream-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/stream-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/creation-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/local-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb/local-secondary-index-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/table-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/global-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb/global-secondary-index-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/table-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/latest-stream-label (clojure.spec.alpha/and :portkey.aws.dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.table-description/provisioned-throughput (clojure.spec.alpha/and :portkey.aws.dynamodb/provisioned-throughput-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb/table-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/StreamSpecification :portkey.aws.dynamodb.table-description/LatestStreamArn :portkey.aws.dynamodb/TableId :portkey.aws.dynamodb/AttributeDefinitions :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb.table-description/CreationDateTime :portkey.aws.dynamodb.table-description/LocalSecondaryIndexes :portkey.aws.dynamodb/TableStatus :portkey.aws.dynamodb.table-description/TableSizeBytes :portkey.aws.dynamodb.table-description/ItemCount :portkey.aws.dynamodb/TableName :portkey.aws.dynamodb.table-description/GlobalSecondaryIndexes :portkey.aws.dynamodb.table-description/TableArn :portkey.aws.dynamodb/RestoreSummary :portkey.aws.dynamodb.table-description/LatestStreamLabel :portkey.aws.dynamodb.table-description/ProvisionedThroughput :portkey.aws.dynamodb/SSEDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.time-to-live-description/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb/time-to-live-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/time-to-live-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TimeToLiveStatus :portkey.aws.dynamodb.time-to-live-description/AttributeName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/restore-in-progress clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-global-tables-input/exclusive-start-global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.list-global-tables-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-global-tables-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.list-global-tables-input/ExclusiveStartGlobalTableName :portkey.aws.dynamodb.list-global-tables-input/Limit :portkey.aws.dynamodb/RegionName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/projection-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ALL" "ALL", :all "ALL", "KEYS_ONLY" "KEYS_ONLY", :keys-only "KEYS_ONLY", "INCLUDE" "INCLUDE", :include "INCLUDE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/create-replica-action (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/RegionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/map-attribute-value (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb/item-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/attribute-map) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-global-secondary-index-settings-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/global-table-global-secondary-index-settings-update :min-count 1 :max-count 20) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput-description/last-increase-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput-description/last-decrease-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput-description/number-of-decreases-today (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput-description/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput-description/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/provisioned-throughput-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.provisioned-throughput-description/LastIncreaseDateTime :portkey.aws.dynamodb.provisioned-throughput-description/LastDecreaseDateTime :portkey.aws.dynamodb.provisioned-throughput-description/NumberOfDecreasesToday :portkey.aws.dynamodb.provisioned-throughput-description/ReadCapacityUnits :portkey.aws.dynamodb.provisioned-throughput-description/WriteCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-global-secondary-index-settings-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/replica-global-secondary-index-settings-update :min-count 1 :max-count 20) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/restore-table-to-point-in-time-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/put-item-input-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.query-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-output/scanned-count (clojure.spec.alpha/and :portkey.aws.dynamodb/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb/query-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.query-output/Items :portkey.aws.dynamodb.query-output/Count :portkey.aws.dynamodb.query-output/ScannedCount :portkey.aws.dynamodb.query-output/LastEvaluatedKey :portkey.aws.dynamodb/ConsumedCapacity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/key-schema (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/key-schema-element :min-count 1 :max-count 2) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.put-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.put-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.put-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.put-item-input/item (clojure.spec.alpha/and :portkey.aws.dynamodb/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.put-item-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/put-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb.put-item-input/Item] :opt-un [:portkey.aws.dynamodb.put-item-input/Expected :portkey.aws.dynamodb/ReturnConsumedCapacity :portkey.aws.dynamodb/ConditionalOperator :portkey.aws.dynamodb/ConditionExpression :portkey.aws.dynamodb.put-item-input/ExpressionAttributeNames :portkey.aws.dynamodb.put-item-input/ReturnValues :portkey.aws.dynamodb.put-item-input/ExpressionAttributeValues :portkey.aws.dynamodb/ReturnItemCollectionMetrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-time-to-live-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/TimeToLiveSpecification] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/write-requests (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/write-request :min-count 1 :max-count 25) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-limits-output/account-max-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-limits-output/account-max-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-limits-output/table-max-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-limits-output/table-max-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-limits-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.describe-limits-output/AccountMaxReadCapacityUnits :portkey.aws.dynamodb.describe-limits-output/AccountMaxWriteCapacityUnits :portkey.aws.dynamodb.describe-limits-output/TableMaxReadCapacityUnits :portkey.aws.dynamodb.describe-limits-output/TableMaxWriteCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-global-tables-output/global-tables (clojure.spec.alpha/and :portkey.aws.dynamodb/global-table-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.list-global-tables-output/last-evaluated-global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-global-tables-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.list-global-tables-output/GlobalTables :portkey.aws.dynamodb.list-global-tables-output/LastEvaluatedGlobalTableName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.keys-and-attributes/keys (clojure.spec.alpha/and :portkey.aws.dynamodb/key-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.keys-and-attributes/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.keys-and-attributes/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/keys-and-attributes (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.keys-and-attributes/Keys] :opt-un [:portkey.aws.dynamodb.keys-and-attributes/AttributesToGet :portkey.aws.dynamodb/ConsistentRead :portkey.aws.dynamodb/ProjectionExpression :portkey.aws.dynamodb.keys-and-attributes/ExpressionAttributeNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.table-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/table-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.table-in-use-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/binary-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/binary-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/consistent-read clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/time-to-live-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.point-in-time-recovery-description/earliest-restorable-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.point-in-time-recovery-description/latest-restorable-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb/point-in-time-recovery-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/PointInTimeRecoveryStatus :portkey.aws.dynamodb.point-in-time-recovery-description/EarliestRestorableDateTime :portkey.aws.dynamodb.point-in-time-recovery-description/LatestRestorableDateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/key (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb/tag-key-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/region-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/stream-view-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NEW_IMAGE" "NEW_IMAGE", :new-image "NEW_IMAGE", "OLD_IMAGE" "OLD_IMAGE", :old-image "OLD_IMAGE", "NEW_AND_OLD_IMAGES" "NEW_AND_OLD_IMAGES", :new-and-old-images "NEW_AND_OLD_IMAGES", "KEYS_ONLY" "KEYS_ONLY", :keys-only "KEYS_ONLY"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-backups-output/last-evaluated-backup-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/backup-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-backups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/BackupSummaries :portkey.aws.dynamodb.list-backups-output/LastEvaluatedBackupArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.global-table-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.global-table-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-settings-update/replica-provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-settings-update/replica-global-secondary-index-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-global-secondary-index-settings-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-settings-update (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/RegionName] :opt-un [:portkey.aws.dynamodb.replica-settings-update/ReplicaProvisionedReadCapacityUnits :portkey.aws.dynamodb.replica-settings-update/ReplicaGlobalSecondaryIndexSettingsUpdate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/tag-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/tag) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.replica-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-creation-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-settings-description/replica-provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-settings-description/replica-provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-settings-description/replica-global-secondary-index-settings (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-global-secondary-index-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-settings-description (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/RegionName] :opt-un [:portkey.aws.dynamodb/ReplicaStatus :portkey.aws.dynamodb.replica-settings-description/ReplicaProvisionedReadCapacityUnits :portkey.aws.dynamodb.replica-settings-description/ReplicaProvisionedWriteCapacityUnits :portkey.aws.dynamodb.replica-settings-description/ReplicaGlobalSecondaryIndexSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-backup-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/BackupDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-global-secondary-index-settings-update/provisioned-read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-global-secondary-index-settings-update (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName] :opt-un [:portkey.aws.dynamodb.replica-global-secondary-index-settings-update/ProvisionedReadCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/continuous-backups-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/return-consumed-capacity (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"INDEXES" "INDEXES", :indexes "INDEXES", "TOTAL" "TOTAL", :total "TOTAL", "NONE" "NONE", :none "NONE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/scan-segment (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 0 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 999999))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/tag-key-string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/replica) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/binary-attribute-value (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/conditional-operator (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"AND" "AND", :and "AND", "OR" "OR", :or "OR"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/null (clojure.spec.alpha/and :portkey.aws.dynamodb/null-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/l (clojure.spec.alpha/and :portkey.aws.dynamodb/list-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/bool (clojure.spec.alpha/and :portkey.aws.dynamodb/boolean-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/m (clojure.spec.alpha/and :portkey.aws.dynamodb/map-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/s (clojure.spec.alpha/and :portkey.aws.dynamodb/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/b (clojure.spec.alpha/and :portkey.aws.dynamodb/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/ns (clojure.spec.alpha/and :portkey.aws.dynamodb/number-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/n (clojure.spec.alpha/and :portkey.aws.dynamodb/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/bs (clojure.spec.alpha/and :portkey.aws.dynamodb/binary-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value/ss (clojure.spec.alpha/and :portkey.aws.dynamodb/string-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-value (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.attribute-value/NULL :portkey.aws.dynamodb.attribute-value/L :portkey.aws.dynamodb.attribute-value/BOOL :portkey.aws.dynamodb.attribute-value/M :portkey.aws.dynamodb.attribute-value/S :portkey.aws.dynamodb.attribute-value/B :portkey.aws.dynamodb.attribute-value/NS :portkey.aws.dynamodb.attribute-value/N :portkey.aws.dynamodb.attribute-value/BS :portkey.aws.dynamodb.attribute-value/SS] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/continuous-backups-description (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/ContinuousBackupsStatus] :opt-un [:portkey.aws.dynamodb/PointInTimeRecoveryDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/ssestatus (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLING" "ENABLING", :enabling "ENABLING", "ENABLED" "ENABLED", :enabled "ENABLED", "DISABLING" "DISABLING", :disabling "DISABLING", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/item-collection-metrics-per-table (clojure.spec.alpha/map-of :portkey.aws.dynamodb/table-name :portkey.aws.dynamodb/item-collection-metrics-multiple))

(clojure.spec.alpha/def :portkey.aws.dynamodb/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 37 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-table-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING", "UPDATING" "UPDATING", :updating "UPDATING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-continuous-backups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/ContinuousBackupsDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/local-secondary-indexes (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/local-secondary-index-info) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/batch-get-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/table-name :portkey.aws.dynamodb/keys-and-attributes))

(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-settings-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-settings-input/global-table-provisioned-write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-settings-input/global-table-global-secondary-index-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb/global-table-global-secondary-index-settings-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-settings-input/replica-settings-update (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-settings-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/update-global-table-settings-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.update-global-table-settings-input/GlobalTableName] :opt-un [:portkey.aws.dynamodb.update-global-table-settings-input/GlobalTableProvisionedWriteCapacityUnits :portkey.aws.dynamodb.update-global-table-settings-input/GlobalTableGlobalSecondaryIndexSettingsUpdate :portkey.aws.dynamodb.update-global-table-settings-input/ReplicaSettingsUpdate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-global-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/GlobalTableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/expected-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/expected-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/scan-filter (clojure.spec.alpha/and :portkey.aws.dynamodb/filter-condition-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/filter-expression (clojure.spec.alpha/and :portkey.aws.dynamodb/condition-expression))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/segment (clojure.spec.alpha/and :portkey.aws.dynamodb/scan-segment))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/total-segments (clojure.spec.alpha/and :portkey.aws.dynamodb/scan-total-segments))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/scan-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName] :opt-un [:portkey.aws.dynamodb.scan-input/ScanFilter :portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb.scan-input/AttributesToGet :portkey.aws.dynamodb.scan-input/Limit :portkey.aws.dynamodb/ConsistentRead :portkey.aws.dynamodb/ReturnConsumedCapacity :portkey.aws.dynamodb/ConditionalOperator :portkey.aws.dynamodb.scan-input/FilterExpression :portkey.aws.dynamodb.scan-input/Segment :portkey.aws.dynamodb.scan-input/ExclusiveStartKey :portkey.aws.dynamodb.scan-input/TotalSegments :portkey.aws.dynamodb.scan-input/ExpressionAttributeNames :portkey.aws.dynamodb/ProjectionExpression :portkey.aws.dynamodb/Select :portkey.aws.dynamodb.scan-input/ExpressionAttributeValues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.consumed-capacity/capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/consumed-capacity-units))
(clojure.spec.alpha/def :portkey.aws.dynamodb.consumed-capacity/table (clojure.spec.alpha/and :portkey.aws.dynamodb/capacity))
(clojure.spec.alpha/def :portkey.aws.dynamodb.consumed-capacity/local-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb/secondary-indexes-capacity-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.consumed-capacity/global-secondary-indexes (clojure.spec.alpha/and :portkey.aws.dynamodb/secondary-indexes-capacity-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/consumed-capacity (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb.consumed-capacity/CapacityUnits :portkey.aws.dynamodb.consumed-capacity/Table :portkey.aws.dynamodb.consumed-capacity/LocalSecondaryIndexes :portkey.aws.dynamodb.consumed-capacity/GlobalSecondaryIndexes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/time-range-lower-bound clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.ssespecification/enabled (clojure.spec.alpha/and :portkey.aws.dynamodb/sseenabled))
(clojure.spec.alpha/def :portkey.aws.dynamodb/ssespecification (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.ssespecification/Enabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-index-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/Projection :portkey.aws.dynamodb/ProvisionedThroughput] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.describe-global-table-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-global-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.describe-global-table-input/GlobalTableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-details (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/BackupArn :portkey.aws.dynamodb/BackupName :portkey.aws.dynamodb/BackupStatus :portkey.aws.dynamodb/BackupCreationDateTime] :opt-un [:portkey.aws.dynamodb/BackupSizeBytes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/list-tables-input-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/create-backup-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/BackupDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/batch-write-item-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/table-name :portkey.aws.dynamodb/write-requests))

(clojure.spec.alpha/def :portkey.aws.dynamodb/local-secondary-index-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/local-secondary-index) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/attribute-name :min-count 1) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/table-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CREATING" "CREATING", :creating "CREATING", "UPDATING" "UPDATING", :updating "UPDATING", "DELETING" "DELETING", :deleting "DELETING", "ACTIVE" "ACTIVE", :active "ACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.untag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/resource-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.untag-resource-input/tag-keys (clojure.spec.alpha/and :portkey.aws.dynamodb/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/untag-resource-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.untag-resource-input/ResourceArn :portkey.aws.dynamodb.untag-resource-input/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.delete-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.delete-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.delete-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.delete-item-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/Key] :opt-un [:portkey.aws.dynamodb.delete-item-input/Expected :portkey.aws.dynamodb/ReturnConsumedCapacity :portkey.aws.dynamodb/ConditionalOperator :portkey.aws.dynamodb/ConditionExpression :portkey.aws.dynamodb.delete-item-input/ExpressionAttributeNames :portkey.aws.dynamodb.delete-item-input/ReturnValues :portkey.aws.dynamodb.delete-item-input/ExpressionAttributeValues :portkey.aws.dynamodb/ReturnItemCollectionMetrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-settings-output/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-settings-output/replica-settings (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/update-global-table-settings-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.update-global-table-settings-output/GlobalTableName :portkey.aws.dynamodb.update-global-table-settings-output/ReplicaSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/scalar-attribute-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"S" "S", :s "S", "N" "N", :n "N", "B" "B", :b "B"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backups-input-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-time-to-live-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 3 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/TableId :portkey.aws.dynamodb/TableArn :portkey.aws.dynamodb/BackupArn :portkey.aws.dynamodb/BackupName :portkey.aws.dynamodb/BackupCreationDateTime :portkey.aws.dynamodb/BackupStatus :portkey.aws.dynamodb/BackupSizeBytes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-description-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/replica-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-continuous-backups-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/PointInTimeRecoverySpecification] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tables-output/table-names (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tables-output/last-evaluated-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-tables-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.list-tables-output/TableNames :portkey.aws.dynamodb.list-tables-output/LastEvaluatedTableName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-get-item-output/responses (clojure.spec.alpha/and :portkey.aws.dynamodb/batch-get-response-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-get-item-output/unprocessed-keys (clojure.spec.alpha/and :portkey.aws.dynamodb/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-get-item-output/consumed-capacity (clojure.spec.alpha/and :portkey.aws.dynamodb/consumed-capacity-multiple))
(clojure.spec.alpha/def :portkey.aws.dynamodb/batch-get-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.batch-get-item-output/Responses :portkey.aws.dynamodb.batch-get-item-output/UnprocessedKeys :portkey.aws.dynamodb.batch-get-item-output/ConsumedCapacity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/table-creation-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/item-collection-size-estimate-bound clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.global-secondary-index-description/index-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-secondary-index-description/index-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-secondary-index-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.global-secondary-index-description/provisioned-throughput (clojure.spec.alpha/and :portkey.aws.dynamodb/provisioned-throughput-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-index-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/Backfilling :portkey.aws.dynamodb/IndexStatus :portkey.aws.dynamodb/Projection :portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb.global-secondary-index-description/IndexSizeBytes :portkey.aws.dynamodb.global-secondary-index-description/IndexArn :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb.global-secondary-index-description/ItemCount :portkey.aws.dynamodb.global-secondary-index-description/ProvisionedThroughput] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.put-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/put-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.put-item-output/Attributes :portkey.aws.dynamodb/ConsumedCapacity :portkey.aws.dynamodb/ItemCollectionMetrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/time-to-live-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLING" "ENABLING", :enabling "ENABLING", "DISABLING" "DISABLING", :disabling "DISABLING", "ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.capacity/capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/consumed-capacity-units))
(clojure.spec.alpha/def :portkey.aws.dynamodb/capacity (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.capacity/CapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/item-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/scan-total-segments (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 1000000))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.invalid-restore-time-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/invalid-restore-time-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.invalid-restore-time-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 37 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-table-to-point-in-time-input/source-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-table-to-point-in-time-input/target-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-table-to-point-in-time-input/use-latest-restorable-time (clojure.spec.alpha/and :portkey.aws.dynamodb/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-table-to-point-in-time-input/restore-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb/restore-table-to-point-in-time-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.restore-table-to-point-in-time-input/SourceTableName :portkey.aws.dynamodb.restore-table-to-point-in-time-input/TargetTableName] :opt-un [:portkey.aws.dynamodb.restore-table-to-point-in-time-input/UseLatestRestorableTime :portkey.aws.dynamodb.restore-table-to-point-in-time-input/RestoreDateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/local-secondary-index (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/Projection] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/replica-update) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/update-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/scan-index-forward (clojure.spec.alpha/and :portkey.aws.dynamodb/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/key-condition-expression (clojure.spec.alpha/and :portkey.aws.dynamodb/key-expression))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/filter-expression (clojure.spec.alpha/and :portkey.aws.dynamodb/condition-expression))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/query-filter (clojure.spec.alpha/and :portkey.aws.dynamodb/filter-condition-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.query-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/query-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName] :opt-un [:portkey.aws.dynamodb.query-input/ScanIndexForward :portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb.query-input/AttributesToGet :portkey.aws.dynamodb.query-input/Limit :portkey.aws.dynamodb/ConsistentRead :portkey.aws.dynamodb.query-input/KeyConditionExpression :portkey.aws.dynamodb/ReturnConsumedCapacity :portkey.aws.dynamodb/ConditionalOperator :portkey.aws.dynamodb.query-input/FilterExpression :portkey.aws.dynamodb.query-input/ExclusiveStartKey :portkey.aws.dynamodb.query-input/ExpressionAttributeNames :portkey.aws.dynamodb/KeyConditions :portkey.aws.dynamodb.query-input/QueryFilter :portkey.aws.dynamodb/ProjectionExpression :portkey.aws.dynamodb/Select :portkey.aws.dynamodb.query-input/ExpressionAttributeValues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/local-secondary-index-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/Projection] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.put-request/item (clojure.spec.alpha/and :portkey.aws.dynamodb/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/put-request (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.put-request/Item] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.backup-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.backup-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.table-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/table-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.table-already-exists-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value-update/value (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.attribute-value-update/action (clojure.spec.alpha/and :portkey.aws.dynamodb/attribute-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-value-update (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.attribute-value-update/Value :portkey.aws.dynamodb.attribute-value-update/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 3 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-indexes (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/global-secondary-index-info) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/condition-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/BackupDetails :portkey.aws.dynamodb/SourceTableDetails :portkey.aws.dynamodb/SourceTableFeatureDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-continuous-backups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/ContinuousBackupsDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.replica-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.replica-already-exists-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/point-in-time-recovery-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/positive-integer-object (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/table-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/stream-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-write-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/batch-write-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.batch-write-item-input/RequestItems] :opt-un [:portkey.aws.dynamodb/ReturnConsumedCapacity :portkey.aws.dynamodb/ReturnItemCollectionMetrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/batch-get-response-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/table-name :portkey.aws.dynamodb/item-list))

(clojure.spec.alpha/def :portkey.aws.dynamodb/restore-table-from-backup-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/consumed-capacity-multiple (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/consumed-capacity) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-backup-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/BackupArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb/key-schema-element (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.key-schema-element/AttributeName :portkey.aws.dynamodb/KeyType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/attribute-value-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-backup-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/BackupDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-summary/source-backup-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/backup-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-summary/source-table-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/table-arn))
(clojure.spec.alpha/def :portkey.aws.dynamodb.restore-summary/restore-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb/restore-summary (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.restore-summary/RestoreDateTime :portkey.aws.dynamodb/RestoreInProgress] :opt-un [:portkey.aws.dynamodb.restore-summary/SourceBackupArn :portkey.aws.dynamodb.restore-summary/SourceTableArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-write-item-output/unprocessed-items (clojure.spec.alpha/and :portkey.aws.dynamodb/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-write-item-output/item-collection-metrics (clojure.spec.alpha/and :portkey.aws.dynamodb/item-collection-metrics-per-table))
(clojure.spec.alpha/def :portkey.aws.dynamodb.batch-write-item-output/consumed-capacity (clojure.spec.alpha/and :portkey.aws.dynamodb/consumed-capacity-multiple))
(clojure.spec.alpha/def :portkey.aws.dynamodb/batch-write-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.batch-write-item-output/UnprocessedItems :portkey.aws.dynamodb.batch-write-item-output/ItemCollectionMetrics :portkey.aws.dynamodb.batch-write-item-output/ConsumedCapacity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-size-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-index-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/global-secondary-index-update) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.tag/key (clojure.spec.alpha/and :portkey.aws.dynamodb/tag-key-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.tag/value (clojure.spec.alpha/and :portkey.aws.dynamodb/tag-value-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb/tag (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.tag/Key :portkey.aws.dynamodb.tag/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/condition (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/ComparisonOperator] :opt-un [:portkey.aws.dynamodb/AttributeValueList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.backup-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/backup-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.backup-in-use-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tables-input/exclusive-start-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tables-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb/list-tables-input-limit))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-tables-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.list-tables-input/ExclusiveStartTableName :portkey.aws.dynamodb.list-tables-input/Limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/list-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-output/scanned-count (clojure.spec.alpha/and :portkey.aws.dynamodb/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.scan-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb/scan-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.scan-output/Items :portkey.aws.dynamodb.scan-output/Count :portkey.aws.dynamodb.scan-output/ScannedCount :portkey.aws.dynamodb.scan-output/LastEvaluatedKey :portkey.aws.dynamodb/ConsumedCapacity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.conditional-check-failed-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/conditional-check-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.conditional-check-failed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-global-secondary-index-settings-description-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/replica-global-secondary-index-settings-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/create-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/key-conditions (clojure.spec.alpha/map-of :portkey.aws.dynamodb/attribute-name :portkey.aws.dynamodb/condition))

(clojure.spec.alpha/def :portkey.aws.dynamodb/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/internal-server-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.internal-server-error/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.table-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/table-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.table-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.local-secondary-index-description/index-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.local-secondary-index-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.local-secondary-index-description/index-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.dynamodb/local-secondary-index-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/Projection :portkey.aws.dynamodb.local-secondary-index-description/IndexSizeBytes :portkey.aws.dynamodb.local-secondary-index-description/ItemCount :portkey.aws.dynamodb.local-secondary-index-description/IndexArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/delete-replica-action (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/RegionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/expression-attribute-name-variable (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/projection-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb/provisioned-throughput (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.provisioned-throughput/ReadCapacityUnits :portkey.aws.dynamodb.provisioned-throughput/WriteCapacityUnits] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.ssedescription/status (clojure.spec.alpha/and :portkey.aws.dynamodb/ssestatus))
(clojure.spec.alpha/def :portkey.aws.dynamodb/ssedescription (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.ssedescription/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/select (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ALL_ATTRIBUTES" "ALL_ATTRIBUTES", :all-attributes "ALL_ATTRIBUTES", "ALL_PROJECTED_ATTRIBUTES" "ALL_PROJECTED_ATTRIBUTES", :all-projected-attributes "ALL_PROJECTED_ATTRIBUTES", "SPECIFIC_ATTRIBUTES" "SPECIFIC_ATTRIBUTES", :specific-attributes "SPECIFIC_ATTRIBUTES", "COUNT" "COUNT", :count "COUNT"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/string-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/string-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tags-of-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.dynamodb/resource-arn-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb.list-tags-of-resource-input/next-token (clojure.spec.alpha/and :portkey.aws.dynamodb/next-token-string))
(clojure.spec.alpha/def :portkey.aws.dynamodb/list-tags-of-resource-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.list-tags-of-resource-input/ResourceArn] :opt-un [:portkey.aws.dynamodb.list-tags-of-resource-input/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/describe-continuous-backups-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/resource-arn-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1283))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/next-token-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-index (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/IndexName :portkey.aws.dynamodb/KeySchema :portkey.aws.dynamodb/Projection :portkey.aws.dynamodb/ProvisionedThroughput] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-index-description-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/global-secondary-index-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/global-secondary-index-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/global-secondary-index) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.update-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-item-input/expression-attribute-names (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-name-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-item-input/expression-attribute-values (clojure.spec.alpha/and :portkey.aws.dynamodb/expression-attribute-value-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb/update-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb/TableName :portkey.aws.dynamodb/Key] :opt-un [:portkey.aws.dynamodb.update-item-input/Expected :portkey.aws.dynamodb/AttributeUpdates :portkey.aws.dynamodb/ReturnConsumedCapacity :portkey.aws.dynamodb/ConditionalOperator :portkey.aws.dynamodb/UpdateExpression :portkey.aws.dynamodb/ConditionExpression :portkey.aws.dynamodb.update-item-input/ExpressionAttributeNames :portkey.aws.dynamodb.update-item-input/ReturnValues :portkey.aws.dynamodb.update-item-input/ExpressionAttributeValues :portkey.aws.dynamodb/ReturnItemCollectionMetrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/return-item-collection-metrics (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"SIZE" "SIZE", :size "SIZE", "NONE" "NONE", :none "NONE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/expression-attribute-name-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb/expression-attribute-name-variable :portkey.aws.dynamodb/attribute-name))

(clojure.spec.alpha/def :portkey.aws.dynamodb/key-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"HASH" "HASH", :hash "HASH", "RANGE" "RANGE", :range "RANGE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb/write-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb/PutRequest :portkey.aws.dynamodb/DeleteRequest] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-input/global-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.update-global-table-input/replica-updates (clojure.spec.alpha/and :portkey.aws.dynamodb/replica-update-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb/update-global-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.update-global-table-input/GlobalTableName :portkey.aws.dynamodb.update-global-table-input/ReplicaUpdates] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb/replica-settings-description-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb/replica-settings-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb/time-to-live-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.provisioned-throughput-exceeded-exception/message] :locations {}))

(clojure.core/defn tag-resource "Associate a set of tags with an Amazon DynamoDB resource. You can then activate\nthese user-defined tags so that they appear on the Billing and Cost Management\nconsole for cost allocation tracking. You can call TagResource up to 5 times per\nsecond, per account.\n For an overview on tagging DynamoDB resources, see Tagging for DynamoDB\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html)\nin the Amazon DynamoDB Developer Guide." ([tag-resource-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.TagResource" tag-resource-input :portkey.aws.dynamodb/tag-resource-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error, "ResourceInUseException" :portkey.aws.dynamodb/resource-in-use-exception})))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/tag-resource-input) :ret clojure.core/true?)

(clojure.core/defn create-global-table "Creates a global table from an existing table. A global table creates a\nreplication relationship between two or more DynamoDB tables with the same table\nname in the provided regions.\n Tables can only be added as the replicas of a global table group under the\nfollowing conditions:\n * The tables must have the same name.\n * The tables must contain no items.\n * The tables must have the same hash key and sort key (if present).\n * The tables must have DynamoDB Streams enabled (NEW_AND_OLD_IMAGES).\n * The tables must have same provisioned and maximum write capacity units.\n If global secondary indexes are specified, then the following conditions must\nalso be met:\n * The global secondary indexes must have the same name.\n * The global secondary indexes must have the same hash key and sort key (if\npresent).\n * The global secondary indexes must have the same provisioned and maximum write\ncapacity units." ([create-global-table-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.CreateGlobalTable" create-global-table-input :portkey.aws.dynamodb/create-global-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/create-global-table-output {"LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error, "GlobalTableAlreadyExistsException" :portkey.aws.dynamodb/global-table-already-exists-exception, "TableNotFoundException" :portkey.aws.dynamodb/table-not-found-exception})))
(clojure.spec.alpha/fdef create-global-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/create-global-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/create-global-table-output))

(clojure.core/defn update-table "Modifies the provisioned throughput settings, global secondary indexes, or\nDynamoDB Streams settings for a given table.\n You can only perform one of the following operations at once:\n * Modify the provisioned throughput settings of the table.\n * Enable or disable Streams on the table.\n * Remove a global secondary index from the table.\n * Create a new global secondary index on the table. Once the index begins\nbackfilling, you can use UpdateTable to perform other operations.\n UpdateTable is an asynchronous operation; while it is executing, the table\nstatus changes from ACTIVE to UPDATING. While it is UPDATING, you cannot issue\nanother UpdateTable request. When the table returns to the ACTIVE state, the\nUpdateTable operation is complete." ([update-table-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.UpdateTable" update-table-input :portkey.aws.dynamodb/update-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/update-table-output {"ResourceInUseException" :portkey.aws.dynamodb/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef update-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/update-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/update-table-output))

(clojure.core/defn update-global-table "Adds or removes replicas in the specified global table. The global table must\nalready exist to be able to use this operation. Any replica to be added must be\nempty, must have the same name as the global table, must have the same key\nschema, and must have DynamoDB Streams enabled and must have same provisioned\nand maximum write capacity units.\n Although you can use UpdateGlobalTable to add replicas and remove replicas in a\nsingle request, for simplicity we recommend that you issue separate requests for\nadding or removing replicas.\n If global secondary indexes are specified, then the following conditions must\nalso be met:\n * The global secondary indexes must have the same name.\n * The global secondary indexes must have the same hash key and sort key (if\npresent).\n * The global secondary indexes must have the same provisioned and maximum write\ncapacity units." ([update-global-table-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.UpdateGlobalTable" update-global-table-input :portkey.aws.dynamodb/update-global-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/update-global-table-output {"InternalServerError" :portkey.aws.dynamodb/internal-server-error, "GlobalTableNotFoundException" :portkey.aws.dynamodb/global-table-not-found-exception, "ReplicaAlreadyExistsException" :portkey.aws.dynamodb/replica-already-exists-exception, "ReplicaNotFoundException" :portkey.aws.dynamodb/replica-not-found-exception, "TableNotFoundException" :portkey.aws.dynamodb/table-not-found-exception})))
(clojure.spec.alpha/fdef update-global-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/update-global-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/update-global-table-output))

(clojure.core/defn update-item "Edits an existing item's attributes, or adds a new item to the table if it does\nnot already exist. You can put, delete, or add attribute values. You can also\nperform a conditional update on an existing item (insert a new attribute\nname-value pair if it doesn't exist, or replace an existing name-value pair if\nit has certain expected attribute values).\n You can also return the item's attribute values in the same UpdateItem\noperation using the ReturnValues parameter." ([update-item-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.UpdateItem" update-item-input :portkey.aws.dynamodb/update-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/update-item-output {"ConditionalCheckFailedException" :portkey.aws.dynamodb/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef update-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/update-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/update-item-output))

(clojure.core/defn scan "The Scan operation returns one or more items and item attributes by accessing\nevery item in a table or a secondary index. To have DynamoDB return fewer items,\nyou can provide a FilterExpression operation.\n If the total number of scanned items exceeds the maximum data set size limit of\n1 MB, the scan stops and results are returned to the user as a LastEvaluatedKey\nvalue to continue the scan in a subsequent operation. The results also include\nthe number of items exceeding the limit. A scan can result in no table data\nmeeting the filter criteria.\n A single Scan operation will read up to the maximum number of items set (if\nusing the Limit parameter) or a maximum of 1 MB of data and then apply any\nfiltering to the results using FilterExpression. If LastEvaluatedKey is present\nin the response, you will need to paginate the result set. For more information,\nsee Paginating the Results\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.Pagination)\nin the Amazon DynamoDB Developer Guide.\n Scan operations proceed sequentially; however, for faster performance on a\nlarge table or secondary index, applications can request a parallel Scan\noperation by providing the Segment and TotalSegments parameters. For more\ninformation, see Parallel Scan\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.ParallelScan)\nin the Amazon DynamoDB Developer Guide.\n Scan uses eventually consistent reads when accessing the data in a table;\ntherefore, the result set might not include the changes to data in the table\nimmediately before the operation began. If you need a consistent copy of the\ndata, as of the time that the Scan begins, you can set the ConsistentRead\nparameter to true." ([scan-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.Scan" scan-input :portkey.aws.dynamodb/scan-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/scan-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef scan :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/scan-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/scan-output))

(clojure.core/defn describe-limits "Returns the current provisioned-capacity limits for your AWS account in a\nregion, both for the region as a whole and for any one DynamoDB table that you\ncreate there.\n When you establish an AWS account, the account has initial limits on the\nmaximum read capacity units and write capacity units that you can provision\nacross all of your DynamoDB tables in a given region. Also, there are per-table\nlimits that apply when you create a table there. For more information, see\nLimits\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html)\npage in the Amazon DynamoDB Developer Guide.\n Although you can increase these limits by filing a case at AWS Support Center\n(https://console.aws.amazon.com/support/home#/), obtaining the increase is not\ninstantaneous. The DescribeLimits action lets you write code to compare the\ncapacity you are currently using to those limits imposed by your account so that\nyou have enough time to apply for an increase before you hit a limit.\n For example, you could use one of the AWS SDKs to do the following:\n * Call DescribeLimits for a particular region to obtain your current account\nlimits on provisioned capacity there.\n * Create a variable to hold the aggregate read capacity units provisioned for\nall your tables in that region, and one to hold the aggregate write capacity\nunits. Zero them both.\n * Call ListTables to obtain a list of all your DynamoDB tables.\n * For each table name listed by ListTables, do the following:\n * Call DescribeTable with the table name.\n * Use the data returned by DescribeTable to add the read capacity units and\nwrite capacity units provisioned for the table itself to your variables.\n * If the table has one or more global secondary indexes (GSIs), loop over these\nGSIs and add their provisioned capacity values to your variables as well.\n * Report the account limits for that region returned by DescribeLimits, along\nwith the total current provisioned capacity levels you have calculated.\n This will let you see whether you are getting close to your account-level\nlimits.\n The per-table limits apply only when you are creating a new table. They\nrestrict the sum of the provisioned capacity of the new table itself and all its\nglobal secondary indexes.\n For existing tables and their GSIs, DynamoDB will not let you increase\nprovisioned capacity extremely rapidly, but the only upper limit that applies is\nthat the aggregate provisioned capacity over all your tables and GSIs cannot\nexceed either of the per-account limits.\n DescribeLimits should only be called periodically. You can expect throttling\nerrors if you call it more than once in a minute.\n The DescribeLimits Request element has no content." ([] (describe-limits {})) ([describe-limits-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DescribeLimits" describe-limits-input :portkey.aws.dynamodb/describe-limits-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/describe-limits-output {"InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef describe-limits :args (clojure.spec.alpha/? :portkey.aws.dynamodb/describe-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/describe-limits-output))

(clojure.core/defn list-backups "List backups associated with an AWS account. To list backups for a given table,\nspecify TableName. ListBackups returns a paginated list of results with at most\n1MB worth of items in a page. You can also specify a limit for the maximum\nnumber of entries to be returned in a page.\n In the request, start time is inclusive but end time is exclusive. Note that\nthese limits are for the time at which the original backup was requested.\n You can call ListBackups a maximum of 5 times per second." ([] (list-backups {})) ([list-backups-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.ListBackups" list-backups-input :portkey.aws.dynamodb/list-backups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/list-backups-output {"InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef list-backups :args (clojure.spec.alpha/? :portkey.aws.dynamodb/list-backups-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/list-backups-output))

(clojure.core/defn create-table "The CreateTable operation adds a new table to your account. In an AWS account,\ntable names must be unique within each region. That is, you can have two tables\nwith same name if you create the tables in different regions.\n CreateTable is an asynchronous operation. Upon receiving a CreateTable request,\nDynamoDB immediately returns a response with a TableStatus of CREATING. After\nthe table is created, DynamoDB sets the TableStatus to ACTIVE. You can perform\nread and write operations only on an ACTIVE table.\n You can optionally define secondary indexes on the new table, as part of the\nCreateTable operation. If you want to create multiple tables with secondary\nindexes on them, you must create the tables sequentially. Only one table with\nsecondary indexes can be in the CREATING state at any given time.\n You can use the DescribeTable action to check the table status." ([create-table-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.CreateTable" create-table-input :portkey.aws.dynamodb/create-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/create-table-output {"ResourceInUseException" :portkey.aws.dynamodb/resource-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef create-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/create-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/create-table-output))

(clojure.core/defn describe-time-to-live "Gives a description of the Time to Live (TTL) status on the specified table." ([describe-time-to-live-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DescribeTimeToLive" describe-time-to-live-input :portkey.aws.dynamodb/describe-time-to-live-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/describe-time-to-live-output {"ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef describe-time-to-live :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/describe-time-to-live-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/describe-time-to-live-output))

(clojure.core/defn list-tags-of-resource "List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up\nto 10 times per second, per account.\n For an overview on tagging DynamoDB resources, see Tagging for DynamoDB\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html)\nin the Amazon DynamoDB Developer Guide." ([list-tags-of-resource-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.ListTagsOfResource" list-tags-of-resource-input :portkey.aws.dynamodb/list-tags-of-resource-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/list-tags-of-resource-output {"ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef list-tags-of-resource :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/list-tags-of-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/list-tags-of-resource-output))

(clojure.core/defn describe-global-table "Returns information about the specified global table." ([describe-global-table-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DescribeGlobalTable" describe-global-table-input :portkey.aws.dynamodb/describe-global-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/describe-global-table-output {"InternalServerError" :portkey.aws.dynamodb/internal-server-error, "GlobalTableNotFoundException" :portkey.aws.dynamodb/global-table-not-found-exception})))
(clojure.spec.alpha/fdef describe-global-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/describe-global-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/describe-global-table-output))

(clojure.core/defn describe-backup "Describes an existing backup of a table.\n You can call DescribeBackup at a maximum rate of 10 times per second." ([describe-backup-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DescribeBackup" describe-backup-input :portkey.aws.dynamodb/describe-backup-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/describe-backup-output {"BackupNotFoundException" :portkey.aws.dynamodb/backup-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef describe-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/describe-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/describe-backup-output))

(clojure.core/defn update-time-to-live "The UpdateTimeToLive method will enable or disable TTL for the specified table.\nA successful UpdateTimeToLive call returns the current TimeToLiveSpecification;\nit may take up to one hour for the change to fully process. Any additional\nUpdateTimeToLive calls for the same table during this one hour duration result\nin a ValidationException.\n TTL compares the current time in epoch time format to the time stored in the\nTTL attribute of an item. If the epoch time value stored in the attribute is\nless than the current time, the item is marked as expired and subsequently\ndeleted.\n The epoch time format is the number of seconds elapsed since 12:00:00 AM\nJanuary 1st, 1970 UTC.\n DynamoDB deletes expired items on a best-effort basis to ensure availability of\nthroughput for other data operations.\n DynamoDB typically deletes expired items within two days of expiration. The\nexact duration within which an item gets deleted after expiration is specific to\nthe nature of the workload. Items that have expired and not been deleted will\nstill show up in reads, queries, and scans.\n As items are deleted, they are removed from any Local Secondary Index and\nGlobal Secondary Index immediately in the same eventually consistent way as a\nstandard delete operation.\n For more information, see Time To Live\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html) in\nthe Amazon DynamoDB Developer Guide." ([update-time-to-live-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.UpdateTimeToLive" update-time-to-live-input :portkey.aws.dynamodb/update-time-to-live-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/update-time-to-live-output {"ResourceInUseException" :portkey.aws.dynamodb/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef update-time-to-live :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/update-time-to-live-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/update-time-to-live-output))

(clojure.core/defn query "The Query operation finds items based on primary key values. You can query any\ntable or secondary index that has a composite primary key (a partition key and a\nsort key).\n Use the KeyConditionExpression parameter to provide a specific value for the\npartition key. The Query operation will return all of the items from the table\nor index with that partition key value. You can optionally narrow the scope of\nthe Query operation by specifying a sort key value and a comparison operator in\nKeyConditionExpression. To further refine the Query results, you can optionally\nprovide a FilterExpression. A FilterExpression determines which items within the\nresults should be returned to you. All of the other results are discarded.\n A Query operation always returns a result set. If no matching items are found,\nthe result set will be empty. Queries that do not return results consume the\nminimum number of read capacity units for that type of read operation.\n DynamoDB calculates the number of read capacity units consumed based on item\nsize, not on the amount of data that is returned to an application. The number\nof capacity units consumed will be the same whether you request all of the\nattributes (the default behavior) or just some of them (using a projection\nexpression). The number will also be the same whether or not you use a\nFilterExpression.\n Query results are always sorted by the sort key value. If the data type of the\nsort key is Number, the results are returned in numeric order; otherwise, the\nresults are returned in order of UTF-8 bytes. By default, the sort order is\nascending. To reverse the order, set the ScanIndexForward parameter to false.\n A single Query operation will read up to the maximum number of items set (if\nusing the Limit parameter) or a maximum of 1 MB of data and then apply any\nfiltering to the results using FilterExpression. If LastEvaluatedKey is present\nin the response, you will need to paginate the result set. For more information,\nsee Paginating the Results\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Query.html#Query.Pagination)\nin the Amazon DynamoDB Developer Guide.\n FilterExpression is applied after a Query finishes, but before the results are\nreturned. A FilterExpression cannot contain partition key or sort key\nattributes. You need to specify those attributes in the KeyConditionExpression.\n A Query operation can return an empty result set and a LastEvaluatedKey if all\nthe items read for the page of results are filtered out.\n You can query a table, a local secondary index, or a global secondary index.\nFor a query on a table or on a local secondary index, you can set the\nConsistentRead parameter to true and obtain a strongly consistent result. Global\nsecondary indexes support eventually consistent reads only, so do not specify\nConsistentRead when querying a global secondary index." ([query-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.Query" query-input :portkey.aws.dynamodb/query-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/query-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef query :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/query-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/query-output))

(clojure.core/defn describe-global-table-settings "Describes region specific settings for a global table." ([describe-global-table-settings-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DescribeGlobalTableSettings" describe-global-table-settings-input :portkey.aws.dynamodb/describe-global-table-settings-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/describe-global-table-settings-output {"GlobalTableNotFoundException" :portkey.aws.dynamodb/global-table-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef describe-global-table-settings :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/describe-global-table-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/describe-global-table-settings-output))

(clojure.core/defn list-global-tables "Lists all global tables that have a replica in the specified region." ([] (list-global-tables {})) ([list-global-tables-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.ListGlobalTables" list-global-tables-input :portkey.aws.dynamodb/list-global-tables-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/list-global-tables-output {"InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef list-global-tables :args (clojure.spec.alpha/? :portkey.aws.dynamodb/list-global-tables-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/list-global-tables-output))

(clojure.core/defn list-tables "Returns an array of table names associated with the current account and\nendpoint. The output from ListTables is paginated, with each page returning a\nmaximum of 100 table names." ([] (list-tables {})) ([list-tables-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.ListTables" list-tables-input :portkey.aws.dynamodb/list-tables-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/list-tables-output {"InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef list-tables :args (clojure.spec.alpha/? :portkey.aws.dynamodb/list-tables-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/list-tables-output))

(clojure.core/defn batch-get-item "The BatchGetItem operation returns the attributes of one or more items from one\nor more tables. You identify requested items by primary key.\n A single operation can retrieve up to 16 MB of data, which can contain as many\nas 100 items. BatchGetItem will return a partial result if the response size\nlimit is exceeded, the table's provisioned throughput is exceeded, or an\ninternal processing failure occurs. If a partial result is returned, the\noperation returns a value for UnprocessedKeys. You can use this value to retry\nthe operation starting with the next item to get.\n If you request more than 100 items BatchGetItem will return a\nValidationException with the message \"Too many items requested for the\nBatchGetItem call\".\n For example, if you ask to retrieve 100 items, but each individual item is 300\nKB in size, the system returns 52 items (so as not to exceed the 16 MB limit).\nIt also returns an appropriate UnprocessedKeys value so you can get the next\npage of results. If desired, your application can include its own logic to\nassemble the pages of results into one data set.\n If none of the items can be processed due to insufficient provisioned\nthroughput on all of the tables in the request, then BatchGetItem will return a\nProvisionedThroughputExceededException. If at least one of the items is\nsuccessfully processed, then BatchGetItem completes successfully, while\nreturning the keys of the unread items in UnprocessedKeys.\n If DynamoDB returns any unprocessed items, you should retry the batch operation\non those items. However, we strongly recommend that you use an exponential\nbackoff algorithm. If you retry the batch operation immediately, the underlying\nread or write requests can still fail due to throttling on the individual\ntables. If you delay the batch operation using exponential backoff, the\nindividual requests in the batch are much more likely to succeed.\n For more information, see Batch Operations and Error Handling\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations)\nin the Amazon DynamoDB Developer Guide.\n By default, BatchGetItem performs eventually consistent reads on every table in\nthe request. If you want strongly consistent reads instead, you can set\nConsistentRead to true for any or all tables.\n In order to minimize response latency, BatchGetItem retrieves items in\nparallel.\n When designing your application, keep in mind that DynamoDB does not return\nitems in any particular order. To help parse the response by item, include the\nprimary key values for the items in your request in the ProjectionExpression\nparameter.\n If a requested item does not exist, it is not returned in the result. Requests\nfor nonexistent items consume the minimum read capacity units according to the\ntype of read. For more information, see Capacity Units Calculations\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations)\nin the Amazon DynamoDB Developer Guide." ([batch-get-item-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.BatchGetItem" batch-get-item-input :portkey.aws.dynamodb/batch-get-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/batch-get-item-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef batch-get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/batch-get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/batch-get-item-output))

(clojure.core/defn batch-write-item "The BatchWriteItem operation puts or deletes multiple items in one or more\ntables. A single call to BatchWriteItem can write up to 16 MB of data, which can\ncomprise as many as 25 put or delete requests. Individual items to be written\ncan be as large as 400 KB.\n BatchWriteItem cannot update items. To update items, use the UpdateItem action.\n The individual PutItem and DeleteItem operations specified in BatchWriteItem\nare atomic; however BatchWriteItem as a whole is not. If any requested\noperations fail because the table's provisioned throughput is exceeded or an\ninternal processing failure occurs, the failed operations are returned in the\nUnprocessedItems response parameter. You can investigate and optionally resend\nthe requests. Typically, you would call BatchWriteItem in a loop. Each iteration\nwould check for unprocessed items and submit a new BatchWriteItem request with\nthose unprocessed items until all items have been processed.\n Note that if none of the items can be processed due to insufficient provisioned\nthroughput on all of the tables in the request, then BatchWriteItem will return\na ProvisionedThroughputExceededException.\n If DynamoDB returns any unprocessed items, you should retry the batch operation\non those items. However, we strongly recommend that you use an exponential\nbackoff algorithm. If you retry the batch operation immediately, the underlying\nread or write requests can still fail due to throttling on the individual\ntables. If you delay the batch operation using exponential backoff, the\nindividual requests in the batch are much more likely to succeed.\n For more information, see Batch Operations and Error Handling\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations)\nin the Amazon DynamoDB Developer Guide.\n With BatchWriteItem, you can efficiently write or delete large amounts of data,\nsuch as from Amazon Elastic MapReduce (EMR), or copy data from another database\ninto DynamoDB. In order to improve performance with these large-scale\noperations, BatchWriteItem does not behave in the same way as individual PutItem\nand DeleteItem calls would. For example, you cannot specify conditions on\nindividual put and delete requests, and BatchWriteItem does not return deleted\nitems in the response.\n If you use a programming language that supports concurrency, you can use\nthreads to write items in parallel. Your application must include the necessary\nlogic to manage the threads. With languages that don't support threading, you\nmust update or delete the specified items one at a time. In both situations,\nBatchWriteItem performs the specified put and delete operations in parallel,\ngiving you the power of the thread pool approach without having to introduce\ncomplexity into your application.\n Parallel processing reduces latency, but each specified put and delete request\nconsumes the same number of write capacity units whether it is processed in\nparallel or not. Delete operations on nonexistent items consume one write\ncapacity unit.\n If one or more of the following is true, DynamoDB rejects the entire batch\nwrite operation:\n * One or more tables specified in the BatchWriteItem request does not exist.\n * Primary key attributes specified on an item in the request do not match those\nin the corresponding table's primary key schema.\n * You try to perform multiple operations on the same item in the same\nBatchWriteItem request. For example, you cannot put and delete the same item in\nthe same BatchWriteItem request.\n * Your request contains at least two items with identical hash and range keys\n(which essentially is two put operations).\n * There are more than 25 requests in the batch.\n * Any individual item in a batch exceeds 400 KB.\n * The total request size exceeds 16 MB." ([batch-write-item-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.BatchWriteItem" batch-write-item-input :portkey.aws.dynamodb/batch-write-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/batch-write-item-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef batch-write-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/batch-write-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/batch-write-item-output))

(clojure.core/defn create-backup "Creates a backup for an existing table.\n Each time you create an On-Demand Backup, the entire table data is backed up.\nThere is no limit to the number of on-demand backups that can be taken.\n When you create an On-Demand Backup, a time marker of the request is cataloged,\nand the backup is created asynchronously, by applying all changes until the time\nof the request to the last full table snapshot. Backup requests are processed\ninstantaneously and become available for restore within minutes.\n You can call CreateBackup at a maximum rate of 50 times per second.\n All backups in DynamoDB work without consuming any provisioned throughput on\nthe table.\n If you submit a backup request on 2018-12-14 at 14:25:00, the backup is\nguaranteed to contain all data committed to the table up to 14:24:00, and data\ncommitted after 14:26:00 will not be. The backup may or may not contain data\nmodifications made between 14:24:00 and 14:26:00. On-Demand Backup does not\nsupport causal consistency.\n Along with data, the following are also included on the backups:\n * Global secondary indexes (GSIs)\n * Local secondary indexes (LSIs)\n * Streams\n * Provisioned read and write capacity" ([create-backup-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.CreateBackup" create-backup-input :portkey.aws.dynamodb/create-backup-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/create-backup-output {"TableNotFoundException" :portkey.aws.dynamodb/table-not-found-exception, "TableInUseException" :portkey.aws.dynamodb/table-in-use-exception, "ContinuousBackupsUnavailableException" :portkey.aws.dynamodb/continuous-backups-unavailable-exception, "BackupInUseException" :portkey.aws.dynamodb/backup-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef create-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/create-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/create-backup-output))

(clojure.core/defn get-item "The GetItem operation returns a set of attributes for the item with the given\nprimary key. If there is no matching item, GetItem does not return any data and\nthere will be no Item element in the response.\n GetItem provides an eventually consistent read by default. If your application\nrequires a strongly consistent read, set ConsistentRead to true. Although a\nstrongly consistent read might take more time than an eventually consistent\nread, it always returns the last updated value." ([get-item-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.GetItem" get-item-input :portkey.aws.dynamodb/get-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/get-item-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/get-item-output))

(clojure.core/defn update-global-table-settings "Updates settings for a global table." ([update-global-table-settings-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.UpdateGlobalTableSettings" update-global-table-settings-input :portkey.aws.dynamodb/update-global-table-settings-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/update-global-table-settings-output {"GlobalTableNotFoundException" :portkey.aws.dynamodb/global-table-not-found-exception, "ReplicaNotFoundException" :portkey.aws.dynamodb/replica-not-found-exception, "IndexNotFoundException" :portkey.aws.dynamodb/index-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.dynamodb/resource-in-use-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef update-global-table-settings :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/update-global-table-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/update-global-table-settings-output))

(clojure.core/defn describe-continuous-backups "Checks the status of continuous backups and point in time recovery on the\nspecified table. Continuous backups are ENABLED on all tables at table creation.\nIf point in time recovery is enabled, PointInTimeRecoveryStatus will be set to\nENABLED.\n Once continuous backups and point in time recovery are enabled, you can restore\nto any point in time within EarliestRestorableDateTime and\nLatestRestorableDateTime.\n LatestRestorableDateTime is typically 5 minutes before the current time. You\ncan restore your table to any point in time during the last 35 days.\n You can call DescribeContinuousBackups at a maximum rate of 10 times per\nsecond." ([describe-continuous-backups-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DescribeContinuousBackups" describe-continuous-backups-input :portkey.aws.dynamodb/describe-continuous-backups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/describe-continuous-backups-output {"TableNotFoundException" :portkey.aws.dynamodb/table-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef describe-continuous-backups :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/describe-continuous-backups-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/describe-continuous-backups-output))

(clojure.core/defn restore-table-to-point-in-time "Restores the specified table to the specified point in time within\nEarliestRestorableDateTime and LatestRestorableDateTime. You can restore your\ntable to any point in time during the last 35 days. Any number of users can\nexecute up to 4 concurrent restores (any type of restore) in a given account.\n When you restore using point in time recovery, DynamoDB restores your table\ndata to the state based on the selected date and time (day:hour:minute:second)\nto a new table.\n Along with data, the following are also included on the new restored table\nusing point in time recovery:\n * Global secondary indexes (GSIs)\n * Local secondary indexes (LSIs)\n * Provisioned read and write capacity\n * Encryption settings\n All these settings come from the current settings of the source table at the\ntime of restore.\n You must manually set up the following on the restored table:\n * Auto scaling policies\n * IAM policies\n * Cloudwatch metrics and alarms\n * Tags\n * Stream settings\n * Time to Live (TTL) settings\n * Point in time recovery settings" ([restore-table-to-point-in-time-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.RestoreTableToPointInTime" restore-table-to-point-in-time-input :portkey.aws.dynamodb/restore-table-to-point-in-time-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/restore-table-to-point-in-time-output {"TableAlreadyExistsException" :portkey.aws.dynamodb/table-already-exists-exception, "TableNotFoundException" :portkey.aws.dynamodb/table-not-found-exception, "TableInUseException" :portkey.aws.dynamodb/table-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InvalidRestoreTimeException" :portkey.aws.dynamodb/invalid-restore-time-exception, "PointInTimeRecoveryUnavailableException" :portkey.aws.dynamodb/point-in-time-recovery-unavailable-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef restore-table-to-point-in-time :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/restore-table-to-point-in-time-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/restore-table-to-point-in-time-output))

(clojure.core/defn untag-resource "Removes the association of tags from an Amazon DynamoDB resource. You can call\nUntagResource up to 5 times per second, per account.\n For an overview on tagging DynamoDB resources, see Tagging for DynamoDB\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html)\nin the Amazon DynamoDB Developer Guide." ([untag-resource-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.UntagResource" untag-resource-input :portkey.aws.dynamodb/untag-resource-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error, "ResourceInUseException" :portkey.aws.dynamodb/resource-in-use-exception})))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/untag-resource-input) :ret clojure.core/true?)

(clojure.core/defn update-continuous-backups " UpdateContinuousBackups enables or disables point in time recovery for the\nspecified table. A successful UpdateContinuousBackups call returns the current\nContinuousBackupsDescription. Continuous backups are ENABLED on all tables at\ntable creation. If point in time recovery is enabled, PointInTimeRecoveryStatus\nwill be set to ENABLED.\n Once continuous backups and point in time recovery are enabled, you can restore\nto any point in time within EarliestRestorableDateTime and\nLatestRestorableDateTime.\n LatestRestorableDateTime is typically 5 minutes before the current time. You\ncan restore your table to any point in time during the last 35 days.." ([update-continuous-backups-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.UpdateContinuousBackups" update-continuous-backups-input :portkey.aws.dynamodb/update-continuous-backups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/update-continuous-backups-output {"TableNotFoundException" :portkey.aws.dynamodb/table-not-found-exception, "ContinuousBackupsUnavailableException" :portkey.aws.dynamodb/continuous-backups-unavailable-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef update-continuous-backups :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/update-continuous-backups-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/update-continuous-backups-output))

(clojure.core/defn delete-backup "Deletes an existing backup of a table.\n You can call DeleteBackup at a maximum rate of 10 times per second." ([delete-backup-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DeleteBackup" delete-backup-input :portkey.aws.dynamodb/delete-backup-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/delete-backup-output {"BackupNotFoundException" :portkey.aws.dynamodb/backup-not-found-exception, "BackupInUseException" :portkey.aws.dynamodb/backup-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef delete-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/delete-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/delete-backup-output))

(clojure.core/defn delete-item "Deletes a single item in a table by primary key. You can perform a conditional\ndelete operation that deletes the item if it exists, or if it has an expected\nattribute value.\n In addition to deleting an item, you can also return the item's attribute\nvalues in the same operation, using the ReturnValues parameter.\n Unless you specify conditions, the DeleteItem is an idempotent operation;\nrunning it multiple times on the same item or attribute does not result in an\nerror response.\n Conditional deletes are useful for deleting items only if specific conditions\nare met. If those conditions are met, DynamoDB performs the delete. Otherwise,\nthe item is not deleted." ([delete-item-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DeleteItem" delete-item-input :portkey.aws.dynamodb/delete-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/delete-item-output {"ConditionalCheckFailedException" :portkey.aws.dynamodb/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef delete-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/delete-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/delete-item-output))

(clojure.core/defn restore-table-from-backup "Creates a new table from an existing backup. Any number of users can execute up\nto 4 concurrent restores (any type of restore) in a given account.\n You can call RestoreTableFromBackup at a maximum rate of 10 times per second.\n You must manually set up the following on the restored table:\n * Auto scaling policies\n * IAM policies\n * Cloudwatch metrics and alarms\n * Tags\n * Stream settings\n * Time to Live (TTL) settings" ([restore-table-from-backup-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.RestoreTableFromBackup" restore-table-from-backup-input :portkey.aws.dynamodb/restore-table-from-backup-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/restore-table-from-backup-output {"TableAlreadyExistsException" :portkey.aws.dynamodb/table-already-exists-exception, "TableInUseException" :portkey.aws.dynamodb/table-in-use-exception, "BackupNotFoundException" :portkey.aws.dynamodb/backup-not-found-exception, "BackupInUseException" :portkey.aws.dynamodb/backup-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef restore-table-from-backup :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/restore-table-from-backup-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/restore-table-from-backup-output))

(clojure.core/defn put-item "Creates a new item, or replaces an old item with a new item. If an item that has\nthe same primary key as the new item already exists in the specified table, the\nnew item completely replaces the existing item. You can perform a conditional\nput operation (add a new item if one with the specified primary key doesn't\nexist), or replace an existing item if it has certain attribute values. You can\nreturn the item's attribute values in the same operation, using the ReturnValues\nparameter.\n This topic provides general information about the PutItem API.\n For information on how to call the PutItem API using the AWS SDK in specific\nlanguages, see the following:\n * PutItem in the AWS Command Line Interface\n(http://docs.aws.amazon.com/goto/aws-cli/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for .NET\n(http://docs.aws.amazon.com/goto/DotNetSDKV3/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for C++\n(http://docs.aws.amazon.com/goto/SdkForCpp/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for Go\n(http://docs.aws.amazon.com/goto/SdkForGoV1/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for Java\n(http://docs.aws.amazon.com/goto/SdkForJava/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for JavaScript\n(http://docs.aws.amazon.com/goto/AWSJavaScriptSDK/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for PHP V3\n(http://docs.aws.amazon.com/goto/SdkForPHPV3/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for Python\n(http://docs.aws.amazon.com/goto/boto3/dynamodb-2012-08-10/PutItem)\n * PutItem in the AWS SDK for Ruby V2\n(http://docs.aws.amazon.com/goto/SdkForRubyV2/dynamodb-2012-08-10/PutItem)\n When you add an item, the primary key attribute(s) are the only required\nattributes. Attribute values cannot be null. String and Binary type attributes\nmust have lengths greater than zero. Set type attributes cannot be empty.\nRequests with empty values will be rejected with a ValidationException\nexception.\n To prevent a new item from replacing an existing item, use a conditional\nexpression that contains the attribute_not_exists function with the name of the\nattribute being used as the partition key for the table. Since every record must\ncontain that attribute, the attribute_not_exists function will only succeed if\nno matching item exists.\n For more information about PutItem, see Working with Items\n(http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html)\nin the Amazon DynamoDB Developer Guide." ([put-item-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.PutItem" put-item-input :portkey.aws.dynamodb/put-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/put-item-output {"ConditionalCheckFailedException" :portkey.aws.dynamodb/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "ItemCollectionSizeLimitExceededException" :portkey.aws.dynamodb/item-collection-size-limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef put-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/put-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/put-item-output))

(clojure.core/defn describe-table "Returns information about the table, including the current status of the table,\nwhen it was created, the primary key schema, and any indexes on the table.\n If you issue a DescribeTable request immediately after a CreateTable request,\nDynamoDB might return a ResourceNotFoundException. This is because DescribeTable\nuses an eventually consistent query, and the metadata for your table might not\nbe available at that moment. Wait for a few seconds, and then try the\nDescribeTable request again." ([describe-table-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DescribeTable" describe-table-input :portkey.aws.dynamodb/describe-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/describe-table-output {"ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef describe-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/describe-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/describe-table-output))

(clojure.core/defn delete-table "The DeleteTable operation deletes a table and all of its items. After a\nDeleteTable request, the specified table is in the DELETING state until DynamoDB\ncompletes the deletion. If the table is in the ACTIVE state, you can delete it.\nIf a table is in CREATING or UPDATING states, then DynamoDB returns a\nResourceInUseException. If the specified table does not exist, DynamoDB returns\na ResourceNotFoundException. If table is already in the DELETING state, no error\nis returned.\n DynamoDB might continue to accept data read and write operations, such as\nGetItem and PutItem, on a table in the DELETING state until the table deletion\nis complete.\n When you delete a table, any indexes on that table are also deleted.\n If you have DynamoDB Streams enabled on the table, then the corresponding\nstream on that table goes into the DISABLED state, and the stream is\nautomatically deleted after 24 hours.\n Use the DescribeTable action to check the status of the table." ([delete-table-input] (portkey.aws/-json-call portkey.aws.dynamodb/endpoints "POST" "DynamoDB_20120810.DeleteTable" delete-table-input :portkey.aws.dynamodb/delete-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb/delete-table-output {"ResourceInUseException" :portkey.aws.dynamodb/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb/internal-server-error})))
(clojure.spec.alpha/fdef delete-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb/delete-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb/delete-table-output))
