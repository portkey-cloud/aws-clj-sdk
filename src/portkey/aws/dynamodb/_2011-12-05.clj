(ns portkey.aws.dynamodb.-2011-12-05 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-response-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/batch-write-response))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.update-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.update-item-output/Attributes :portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.get-item-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/get-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05/Key] :opt-un [:portkey.aws.dynamodb.-2011-12-05.get-item-input/AttributesToGet :portkey.aws.dynamodb.-2011-12-05/ConsistentRead] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/exists (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/expected-attribute-value (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/Value :portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/Exists] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05/ProvisionedThroughput] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.delete-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.delete-item-output/Attributes :portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/number-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/number-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.get-item-output/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/get-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.get-item-output/Item :portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-get-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.batch-get-item-input/RequestItems] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-request (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/Key] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/describe-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-action (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ADD" "ADD", :add "ADD", "PUT" "PUT", :put "PUT", "DELETE" "DELETE", :delete "DELETE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/return-value (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:updated-new "UPDATED_NEW", :updated-old "UPDATED_OLD", "UPDATED_OLD" "UPDATED_OLD", "ALL_NEW" "ALL_NEW", :all-old "ALL_OLD", "NONE" "NONE", "UPDATED_NEW" "UPDATED_NEW", "ALL_OLD" "ALL_OLD", :all-new "ALL_NEW", :none "NONE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/key :min-count 1 :max-count 100) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/create-table-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05/KeySchema :portkey.aws.dynamodb.-2011-12-05/ProvisionedThroughput] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/table-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-updates (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/attribute-value-update))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.resource-in-use-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/comparison-operator (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:not-contains "NOT_CONTAINS", "NULL" "NULL", :ge "GE", :contains "CONTAINS", :eq "EQ", "NE" "NE", "CONTAINS" "CONTAINS", "LT" "LT", "GE" "GE", :between "BETWEEN", "LE" "LE", "NOT_CONTAINS" "NOT_CONTAINS", :null "NULL", :gt "GT", "BEGINS_WITH" "BEGINS_WITH", "NOT_NULL" "NOT_NULL", "EQ" "EQ", :not-null "NOT_NULL", :ne "NE", "GT" "GT", :le "LE", :lt "LT", "IN" "IN", "BETWEEN" "BETWEEN", :begins-with "BEGINS_WITH", :in "IN"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/filter-condition-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/string :portkey.aws.dynamodb.-2011-12-05/condition))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.describe-table-output/table (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/describe-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.describe-table-output/Table] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/creation-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/provisioned-throughput (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/table-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05/KeySchema :portkey.aws.dynamodb.-2011-12-05/TableStatus :portkey.aws.dynamodb.-2011-12-05.table-description/CreationDateTime :portkey.aws.dynamodb.-2011-12-05.table-description/ProvisionedThroughput :portkey.aws.dynamodb.-2011-12-05.table-description/TableSizeBytes :portkey.aws.dynamodb.-2011-12-05.table-description/ItemCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/item-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/attribute-map) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/last-increase-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/last-decrease-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/number-of-decreases-today (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/LastIncreaseDateTime :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/LastDecreaseDateTime :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/NumberOfDecreasesToday :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/ReadCapacityUnits :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/WriteCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-item-input-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/query-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.query-output/Items :portkey.aws.dynamodb.-2011-12-05.query-output/Count :portkey.aws.dynamodb.-2011-12-05.query-output/LastEvaluatedKey :portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema/hash-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-schema-element))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema/range-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-schema-element))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-schema (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.key-schema/HashKeyElement] :opt-un [:portkey.aws.dynamodb.-2011-12-05.key-schema/RangeKeyElement] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-input/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05.put-item-input/Item] :opt-un [:portkey.aws.dynamodb.-2011-12-05.put-item-input/Expected :portkey.aws.dynamodb.-2011-12-05.put-item-input/ReturnValues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/write-requests (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/write-request :min-count 1 :max-count 25) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/keys (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/keys-and-attributes (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/Keys] :opt-un [:portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/AttributesToGet :portkey.aws.dynamodb.-2011-12-05/ConsistentRead] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/binary-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/binary-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/consistent-read clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key/hash-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key/range-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.key/HashKeyElement] :opt-un [:portkey.aws.dynamodb.-2011-12-05.key/RangeKeyElement] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/binary-attribute-value (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/s (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/n (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/b (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/ss (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/string-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/ns (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/number-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/bs (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/binary-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-value (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.attribute-value/S :portkey.aws.dynamodb.-2011-12-05.attribute-value/N :portkey.aws.dynamodb.-2011-12-05.attribute-value/B :portkey.aws.dynamodb.-2011-12-05.attribute-value/SS :portkey.aws.dynamodb.-2011-12-05.attribute-value/NS :portkey.aws.dynamodb.-2011-12-05.attribute-value/BS] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/keys-and-attributes))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/expected-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/scan-filter (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/filter-condition-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/scan-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName] :opt-un [:portkey.aws.dynamodb.-2011-12-05.scan-input/AttributesToGet :portkey.aws.dynamodb.-2011-12-05.scan-input/Limit :portkey.aws.dynamodb.-2011-12-05.scan-input/Count :portkey.aws.dynamodb.-2011-12-05.scan-input/ScanFilter :portkey.aws.dynamodb.-2011-12-05.scan-input/ExclusiveStartKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/list-tables-input-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-item-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/write-requests))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :min-count 1) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CREATING" "CREATING", :creating "CREATING", "UPDATING" "UPDATING", :updating "UPDATING", "DELETING" "DELETING", :deleting "DELETING", "ACTIVE" "ACTIVE", :active "ACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.delete-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.delete-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05/Key] :opt-un [:portkey.aws.dynamodb.-2011-12-05.delete-item-input/Expected :portkey.aws.dynamodb.-2011-12-05.delete-item-input/ReturnValues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/scalar-attribute-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"S" "S", :s "S", "N" "N", :n "N", "B" "B", :b "B"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-output/table-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-output/last-evaluated-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/list-tables-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.list-tables-output/TableNames :portkey.aws.dynamodb.-2011-12-05.list-tables-output/LastEvaluatedTableName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/responses (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-response-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/unprocessed-keys (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/Responses :portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/UnprocessedKeys] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.put-item-output/Attributes :portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-response/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.batch-response/Items :portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/scan-index-forward (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/hash-key-value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/range-key-condition (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/condition))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/query-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05.query-input/HashKeyValue] :opt-un [:portkey.aws.dynamodb.-2011-12-05.query-input/ScanIndexForward :portkey.aws.dynamodb.-2011-12-05.query-input/Count :portkey.aws.dynamodb.-2011-12-05.query-input/AttributesToGet :portkey.aws.dynamodb.-2011-12-05.query-input/Limit :portkey.aws.dynamodb.-2011-12-05/ConsistentRead :portkey.aws.dynamodb.-2011-12-05.query-input/ExclusiveStartKey :portkey.aws.dynamodb.-2011-12-05.query-input/RangeKeyCondition] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-request/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-request (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.put-request/Item] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value-update/value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value-update/action (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-value-update (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.attribute-value-update/Value :portkey.aws.dynamodb.-2011-12-05.attribute-value-update/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 3 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/positive-integer-object (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-write-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.batch-write-item-input/RequestItems] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-response-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/batch-response))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema-element/attribute-type (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/scalar-attribute-type))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-schema-element (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.key-schema-element/AttributeName :portkey.aws.dynamodb.-2011-12-05.key-schema-element/AttributeType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-value-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/responses (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-response-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/unprocessed-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-item-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/Responses :portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/UnprocessedItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/condition (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/ComparisonOperator] :opt-un [:portkey.aws.dynamodb.-2011-12-05/AttributeValueList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-input/exclusive-start-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/list-tables-input-limit))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/list-tables-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.list-tables-input/ExclusiveStartTableName :portkey.aws.dynamodb.-2011-12-05.list-tables-input/Limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/scanned-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/scan-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.scan-output/Items :portkey.aws.dynamodb.-2011-12-05.scan-output/Count :portkey.aws.dynamodb.-2011-12-05.scan-output/ScannedCount :portkey.aws.dynamodb.-2011-12-05.scan-output/LastEvaluatedKey :portkey.aws.dynamodb.-2011-12-05/ConsumedCapacityUnits] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.conditional-check-failed-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.conditional-check-failed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/create-table-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/TableDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/internal-server-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.internal-server-error/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/ReadCapacityUnits :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/WriteCapacityUnits] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/string-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/string-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.update-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.update-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-item-input (portkey.aws/json-keys :req-un [:portkey.aws.dynamodb.-2011-12-05/TableName :portkey.aws.dynamodb.-2011-12-05/Key :portkey.aws.dynamodb.-2011-12-05/AttributeUpdates] :opt-un [:portkey.aws.dynamodb.-2011-12-05.update-item-input/Expected :portkey.aws.dynamodb.-2011-12-05.update-item-input/ReturnValues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/write-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/PutRequest :portkey.aws.dynamodb.-2011-12-05/DeleteRequest] :locations {}))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-exceeded-exception/message] :locations {}))

(clojure.core/defn update-table "Updates the provisioned throughput for the given table.\n Setting the throughput for a table helps you manage performance and is part of\nthe Provisioned Throughput feature of Amazon DynamoDB." ([update-table-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.UpdateTable" update-table-input :portkey.aws.dynamodb.-2011-12-05/update-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/update-table-output {"ResourceInUseException" :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef update-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/update-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/update-table-output))

(clojure.core/defn update-item "Edits an existing item's attributes.\n You can perform a conditional update (insert a new attribute name-value pair if\nit doesn't exist, or replace an existing name-value pair if it has certain\nexpected attribute values)." ([update-item-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.UpdateItem" update-item-input :portkey.aws.dynamodb.-2011-12-05/update-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/update-item-output {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef update-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/update-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/update-item-output))

(clojure.core/defn scan "Retrieves one or more items and its attributes by performing a full scan of a\ntable.\n Provide a ScanFilter to get more specific results." ([scan-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.Scan" scan-input :portkey.aws.dynamodb.-2011-12-05/scan-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/scan-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef scan :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/scan-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/scan-output))

(clojure.core/defn create-table "Adds a new table to your account.\n The table name must be unique among those associated with the AWS Account\nissuing the request, and the AWS Region that receives the request (e.g.\nus-east-1).\n The CreateTable operation triggers an asynchronous workflow to begin creating\nthe table. Amazon DynamoDB immediately returns the state of the table (CREATING)\nuntil the table is in the ACTIVE state. Once the table is in the ACTIVE state,\nyou can perform data plane operations." ([create-table-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.CreateTable" create-table-input :portkey.aws.dynamodb.-2011-12-05/create-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/create-table-output {"ResourceInUseException" :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef create-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/create-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/create-table-output))

(clojure.core/defn query "Gets the values of one or more items and its attributes by primary key\n(composite primary key, only).\n Narrow the scope of the query using comparison operators on the RangeKeyValue\nof the composite key. Use the ScanIndexForward parameter to get results in\nforward or reverse order by range key." ([query-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.Query" query-input :portkey.aws.dynamodb.-2011-12-05/query-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/query-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef query :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/query-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/query-output))

(clojure.core/defn list-tables "Retrieves a paginated list of table names created by the AWS Account of the\ncaller in the AWS Region (e.g. us-east-1)." ([] (list-tables {})) ([list-tables-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.ListTables" list-tables-input :portkey.aws.dynamodb.-2011-12-05/list-tables-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/list-tables-output {"InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef list-tables :args (clojure.spec.alpha/? :portkey.aws.dynamodb.-2011-12-05/list-tables-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/list-tables-output))

(clojure.core/defn batch-get-item "Retrieves the attributes for multiple items from multiple tables using their\nprimary keys.\n The maximum number of item attributes that can be retrieved for a single\noperation is 100. Also, the number of items retrieved is constrained by a 1 MB\nthe size limit. If the response size limit is exceeded or a partial result is\nreturned due to an internal processing failure, Amazon DynamoDB returns an\nUnprocessedKeys value so you can retry the operation starting with the next item\nto get.\n Amazon DynamoDB automatically adjusts the number of items returned per page to\nenforce this limit. For example, even if you ask to retrieve 100 items, but each\nindividual item is 50k in size, the system returns 20 items and an appropriate\nUnprocessedKeys value so you can get the next page of results. If necessary,\nyour application needs its own logic to assemble the pages of results into one\nset." ([batch-get-item-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.BatchGetItem" batch-get-item-input :portkey.aws.dynamodb.-2011-12-05/batch-get-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/batch-get-item-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef batch-get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/batch-get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-item-output))

(clojure.core/defn batch-write-item "Allows to execute a batch of Put and/or Delete Requests for many tables in a\nsingle call. A total of 25 requests are allowed.\n There are no transaction guarantees provided by this API. It does not allow\nconditional puts nor does it support return values." ([batch-write-item-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.BatchWriteItem" batch-write-item-input :portkey.aws.dynamodb.-2011-12-05/batch-write-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/batch-write-item-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef batch-write-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/batch-write-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-item-output))

(clojure.core/defn get-item "Retrieves a set of Attributes for an item that matches the primary key.\n The GetItem operation provides an eventually-consistent read by default. If\neventually-consistent reads are not acceptable for your application, use\nConsistentRead. Although this operation might take longer than a standard read,\nit always returns the last updated value." ([get-item-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.GetItem" get-item-input :portkey.aws.dynamodb.-2011-12-05/get-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/get-item-output {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/get-item-output))

(clojure.core/defn delete-item "Deletes a single item in a table by primary key.\n You can perform a conditional delete operation that deletes the item if it\nexists, or if it has an expected attribute value." ([delete-item-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.DeleteItem" delete-item-input :portkey.aws.dynamodb.-2011-12-05/delete-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/delete-item-output {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef delete-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/delete-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/delete-item-output))

(clojure.core/defn put-item "Creates a new item, or replaces an old item with a new item (including all the\nattributes).\n If an item already exists in the specified table with the same primary key, the\nnew item completely replaces the existing item. You can perform a conditional\nput (insert a new item if one with the specified primary key doesn't exist), or\nreplace an existing item if it has certain attribute values." ([put-item-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.PutItem" put-item-input :portkey.aws.dynamodb.-2011-12-05/put-item-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/put-item-output {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef put-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/put-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/put-item-output))

(clojure.core/defn describe-table "Retrieves information about the table, including the current status of the\ntable, the primary key schema and when the table was created.\n If the table does not exist, Amazon DynamoDB returns a\nResourceNotFoundException." ([describe-table-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.DescribeTable" describe-table-input :portkey.aws.dynamodb.-2011-12-05/describe-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/describe-table-output {"ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef describe-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/describe-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/describe-table-output))

(clojure.core/defn delete-table "Deletes a table and all of its items.\n If the table is in the ACTIVE state, you can delete it. If a table is in\nCREATING or UPDATING states then Amazon DynamoDB returns a\nResourceInUseException. If the specified table does not exist, Amazon DynamoDB\nreturns a ResourceNotFoundException." ([delete-table-input] (portkey.aws/-json-call portkey.aws.dynamodb.-2011-12-05/endpoints "POST" "DynamoDB_20111205.DeleteTable" delete-table-input :portkey.aws.dynamodb.-2011-12-05/delete-table-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.dynamodb.-2011-12-05/delete-table-output {"ResourceInUseException" :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error})))
(clojure.spec.alpha/fdef delete-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/delete-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/delete-table-output))
