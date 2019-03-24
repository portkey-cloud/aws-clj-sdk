(ns portkey.aws.dynamodb.-2011-12-05 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "dynamodb", :region "us-gov-east-1"},
    :ssl-common-name "dynamodb.us-gov-east-1.amazonaws.com",
    :endpoint "https://dynamodb.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "dynamodb", :region "eu-north-1"},
    :ssl-common-name "dynamodb.eu-north-1.amazonaws.com",
    :endpoint "https://dynamodb.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-expected-attribute-value)

(clojure.core/declare ser-number-set-attribute-value)

(clojure.core/declare ser-number-attribute-value)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-delete-request)

(clojure.core/declare ser-attribute-action)

(clojure.core/declare ser-return-value)

(clojure.core/declare ser-positive-long-object)

(clojure.core/declare ser-key-list)

(clojure.core/declare ser-attribute-updates)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-filter-condition-map)

(clojure.core/declare ser-put-item-input-attribute-map)

(clojure.core/declare ser-key-schema)

(clojure.core/declare ser-write-requests)

(clojure.core/declare ser-keys-and-attributes)

(clojure.core/declare ser-binary-set-attribute-value)

(clojure.core/declare ser-consistent-read)

(clojure.core/declare ser-key)

(clojure.core/declare ser-binary-attribute-value)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-batch-get-request-map)

(clojure.core/declare ser-expected-attribute-map)

(clojure.core/declare ser-list-tables-input-limit)

(clojure.core/declare ser-batch-write-item-request-map)

(clojure.core/declare ser-attribute-name-list)

(clojure.core/declare ser-scalar-attribute-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-put-request)

(clojure.core/declare ser-attribute-value-update)

(clojure.core/declare ser-table-name)

(clojure.core/declare ser-positive-integer-object)

(clojure.core/declare ser-key-schema-element)

(clojure.core/declare ser-attribute-value-list)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-string-attribute-value)

(clojure.core/declare ser-provisioned-throughput)

(clojure.core/declare ser-string-set-attribute-value)

(clojure.core/declare ser-key-schema-attribute-name)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-write-request)

(clojure.core/defn- ser-expected-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ExpectedAttributeValue", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "AttributeValue"})) (clojure.core/contains? input :exists) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :exists)) #:http.request.field{:name "Exists", :shape "BooleanObject"}))))

(clojure.core/defn- ser-number-set-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-number-attribute-value coll) #:http.request.field{:shape "NumberAttributeValue"}))) input), :shape "NumberSetAttributeValue", :type "list"})

(clojure.core/defn- ser-number-attribute-value [input] #:http.request.field{:value input, :shape "NumberAttributeValue"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-delete-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key (:key input)) #:http.request.field{:name "Key", :shape "Key"})], :shape "DeleteRequest", :type "structure"}))

(clojure.core/defn- ser-attribute-action [input] #:http.request.field{:value (clojure.core/get {"ADD" "ADD", :add "ADD", "PUT" "PUT", :put "PUT", "DELETE" "DELETE", :delete "DELETE"} input), :shape "AttributeAction"})

(clojure.core/defn- ser-return-value [input] #:http.request.field{:value (clojure.core/get {:updated-new "UPDATED_NEW", :updated-old "UPDATED_OLD", "UPDATED_OLD" "UPDATED_OLD", "ALL_NEW" "ALL_NEW", :all-old "ALL_OLD", "NONE" "NONE", "UPDATED_NEW" "UPDATED_NEW", "ALL_OLD" "ALL_OLD", :all-new "ALL_NEW", :none "NONE"} input), :shape "ReturnValue"})

(clojure.core/defn- ser-positive-long-object [input] #:http.request.field{:value input, :shape "PositiveLongObject"})

(clojure.core/defn- ser-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key coll) #:http.request.field{:shape "Key"}))) input), :shape "KeyList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-attribute-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value-update v) #:http.request.field{:map-info "value", :shape "AttributeValueUpdate"})])) input), :shape "AttributeUpdates", :type "map"})

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {:not-contains "NOT_CONTAINS", "NULL" "NULL", :ge "GE", :contains "CONTAINS", :eq "EQ", "NE" "NE", "CONTAINS" "CONTAINS", "LT" "LT", "GE" "GE", :between "BETWEEN", "LE" "LE", "NOT_CONTAINS" "NOT_CONTAINS", :null "NULL", :gt "GT", "BEGINS_WITH" "BEGINS_WITH", "NOT_NULL" "NOT_NULL", "EQ" "EQ", :not-null "NOT_NULL", :ne "NE", "GT" "GT", :le "LE", :lt "LT", "IN" "IN", "BETWEEN" "BETWEEN", :begins-with "BEGINS_WITH", :in "IN"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-filter-condition-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-condition v) #:http.request.field{:map-info "value", :shape "Condition"})])) input), :shape "FilterConditionMap", :type "map"})

(clojure.core/defn- ser-put-item-input-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "PutItemInputAttributeMap", :type "map"})

(clojure.core/defn- ser-key-schema [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key-schema-element (:hash-key-element input)) #:http.request.field{:name "HashKeyElement", :shape "KeySchemaElement"})], :shape "KeySchema", :type "structure"} (clojure.core/contains? input :range-key-element) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-schema-element (input :range-key-element)) #:http.request.field{:name "RangeKeyElement", :shape "KeySchemaElement"}))))

(clojure.core/defn- ser-write-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-write-request coll) #:http.request.field{:shape "WriteRequest"}))) input), :shape "WriteRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-keys-and-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key-list (:keys input)) #:http.request.field{:name "Keys", :shape "KeyList"})], :shape "KeysAndAttributes", :type "structure"} (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistent-read (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "ConsistentRead"}))))

(clojure.core/defn- ser-binary-set-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-binary-attribute-value coll) #:http.request.field{:shape "BinaryAttributeValue"}))) input), :shape "BinarySetAttributeValue", :type "list"})

(clojure.core/defn- ser-consistent-read [input] #:http.request.field{:value input, :shape "ConsistentRead"})

(clojure.core/defn- ser-key [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-value (:hash-key-element input)) #:http.request.field{:name "HashKeyElement", :shape "AttributeValue"})], :shape "Key", :type "structure"} (clojure.core/contains? input :range-key-element) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :range-key-element)) #:http.request.field{:name "RangeKeyElement", :shape "AttributeValue"}))))

(clojure.core/defn- ser-binary-attribute-value [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BinaryAttributeValue"})

(clojure.core/defn- ser-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AttributeValue", :type "structure"} (clojure.core/contains? input :s) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-attribute-value (input :s)) #:http.request.field{:name "S", :shape "StringAttributeValue"})) (clojure.core/contains? input :n) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-attribute-value (input :n)) #:http.request.field{:name "N", :shape "NumberAttributeValue"})) (clojure.core/contains? input :b) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary-attribute-value (input :b)) #:http.request.field{:name "B", :shape "BinaryAttributeValue"})) (clojure.core/contains? input :ss) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-set-attribute-value (input :ss)) #:http.request.field{:name "SS", :shape "StringSetAttributeValue"})) (clojure.core/contains? input :ns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-set-attribute-value (input :ns)) #:http.request.field{:name "NS", :shape "NumberSetAttributeValue"})) (clojure.core/contains? input :bs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary-set-attribute-value (input :bs)) #:http.request.field{:name "BS", :shape "BinarySetAttributeValue"}))))

(clojure.core/defn- ser-batch-get-request-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-table-name k) #:http.request.field{:map-info "key", :shape "TableName"}) (clojure.core/into (ser-keys-and-attributes v) #:http.request.field{:map-info "value", :shape "KeysAndAttributes"})])) input), :shape "BatchGetRequestMap", :type "map", :max 100, :min 1})

(clojure.core/defn- ser-expected-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-expected-attribute-value v) #:http.request.field{:map-info "value", :shape "ExpectedAttributeValue"})])) input), :shape "ExpectedAttributeMap", :type "map"})

(clojure.core/defn- ser-list-tables-input-limit [input] #:http.request.field{:value input, :shape "ListTablesInputLimit"})

(clojure.core/defn- ser-batch-write-item-request-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-table-name k) #:http.request.field{:map-info "key", :shape "TableName"}) (clojure.core/into (ser-write-requests v) #:http.request.field{:map-info "value", :shape "WriteRequests"})])) input), :shape "BatchWriteItemRequestMap", :type "map", :max 25, :min 1})

(clojure.core/defn- ser-attribute-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name coll) #:http.request.field{:shape "AttributeName"}))) input), :shape "AttributeNameList", :type "list", :min 1})

(clojure.core/defn- ser-scalar-attribute-type [input] #:http.request.field{:value (clojure.core/get {"S" "S", :s "S", "N" "N", :n "N", "B" "B", :b "B"} input), :shape "ScalarAttributeType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-put-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-put-item-input-attribute-map (:item input)) #:http.request.field{:name "Item", :shape "PutItemInputAttributeMap"})], :shape "PutRequest", :type "structure"}))

(clojure.core/defn- ser-attribute-value-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AttributeValueUpdate", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "AttributeValue"})) (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-action (input :action)) #:http.request.field{:name "Action", :shape "AttributeAction"}))))

(clojure.core/defn- ser-table-name [input] #:http.request.field{:value input, :shape "TableName"})

(clojure.core/defn- ser-positive-integer-object [input] #:http.request.field{:value input, :shape "PositiveIntegerObject"})

(clojure.core/defn- ser-key-schema-element [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key-schema-attribute-name (:attribute-name input)) #:http.request.field{:name "AttributeName", :shape "KeySchemaAttributeName"}) (clojure.core/into (ser-scalar-attribute-type (:attribute-type input)) #:http.request.field{:name "AttributeType", :shape "ScalarAttributeType"})], :shape "KeySchemaElement", :type "structure"}))

(clojure.core/defn- ser-attribute-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-value coll) #:http.request.field{:shape "AttributeValue"}))) input), :shape "AttributeValueList", :type "list"})

(clojure.core/defn- ser-condition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-comparison-operator (:comparison-operator input)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"})], :shape "Condition", :type "structure"} (clojure.core/contains? input :attribute-value-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value-list (input :attribute-value-list)) #:http.request.field{:name "AttributeValueList", :shape "AttributeValueList"}))))

(clojure.core/defn- ser-string-attribute-value [input] #:http.request.field{:value input, :shape "StringAttributeValue"})

(clojure.core/defn- ser-provisioned-throughput [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-positive-long-object (:read-capacity-units input)) #:http.request.field{:name "ReadCapacityUnits", :shape "PositiveLongObject"}) (clojure.core/into (ser-positive-long-object (:write-capacity-units input)) #:http.request.field{:name "WriteCapacityUnits", :shape "PositiveLongObject"})], :shape "ProvisionedThroughput", :type "structure"}))

(clojure.core/defn- ser-string-set-attribute-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-attribute-value coll) #:http.request.field{:shape "StringAttributeValue"}))) input), :shape "StringSetAttributeValue", :type "list"})

(clojure.core/defn- ser-key-schema-attribute-name [input] #:http.request.field{:value input, :shape "KeySchemaAttributeName"})

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-write-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WriteRequest", :type "structure"} (clojure.core/contains? input :put-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-put-request (input :put-request)) #:http.request.field{:name "PutRequest", :shape "PutRequest"})) (clojure.core/contains? input :delete-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-request (input :delete-request)) #:http.request.field{:name "DeleteRequest", :shape "DeleteRequest"}))))

(clojure.core/defn- req-delete-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]}))

(clojure.core/defn- req-get-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})]} (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistent-read (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "ConsistentRead"}))))

(clojure.core/defn- req-update-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-provisioned-throughput (input :provisioned-throughput)) #:http.request.field{:name "ProvisionedThroughput", :shape "ProvisionedThroughput"})]}))

(clojure.core/defn- req-batch-get-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-get-request-map (input :request-items)) #:http.request.field{:name "RequestItems", :shape "BatchGetRequestMap"})]}))

(clojure.core/defn- req-describe-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]}))

(clojure.core/defn- req-create-table-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key-schema (input :key-schema)) #:http.request.field{:name "KeySchema", :shape "KeySchema"}) (clojure.core/into (ser-provisioned-throughput (input :provisioned-throughput)) #:http.request.field{:name "ProvisionedThroughput", :shape "ProvisionedThroughput"})]}))

(clojure.core/defn- req-put-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-put-item-input-attribute-map (input :item)) #:http.request.field{:name "Item", :shape "PutItemInputAttributeMap"})]} (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-attribute-map (input :expected)) #:http.request.field{:name "Expected", :shape "ExpectedAttributeMap"})) (clojure.core/contains? input :return-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-value (input :return-values)) #:http.request.field{:name "ReturnValues", :shape "ReturnValue"}))))

(clojure.core/defn- req-scan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})]} (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :count)) #:http.request.field{:name "Count", :shape "BooleanObject"})) (clojure.core/contains? input :scan-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-condition-map (input :scan-filter)) #:http.request.field{:name "ScanFilter", :shape "FilterConditionMap"})) (clojure.core/contains? input :exclusive-start-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :exclusive-start-key)) #:http.request.field{:name "ExclusiveStartKey", :shape "Key"}))))

(clojure.core/defn- req-delete-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})]} (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-attribute-map (input :expected)) #:http.request.field{:name "Expected", :shape "ExpectedAttributeMap"})) (clojure.core/contains? input :return-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-value (input :return-values)) #:http.request.field{:name "ReturnValues", :shape "ReturnValue"}))))

(clojure.core/defn- req-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-attribute-value (input :hash-key-value)) #:http.request.field{:name "HashKeyValue", :shape "AttributeValue"})]} (clojure.core/contains? input :scan-index-forward) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :scan-index-forward)) #:http.request.field{:name "ScanIndexForward", :shape "BooleanObject"})) (clojure.core/contains? input :count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :count)) #:http.request.field{:name "Count", :shape "BooleanObject"})) (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "AttributeNameList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistent-read (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "ConsistentRead"})) (clojure.core/contains? input :exclusive-start-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :exclusive-start-key)) #:http.request.field{:name "ExclusiveStartKey", :shape "Key"})) (clojure.core/contains? input :range-key-condition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition (input :range-key-condition)) #:http.request.field{:name "RangeKeyCondition", :shape "Condition"}))))

(clojure.core/defn- req-batch-write-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-write-item-request-map (input :request-items)) #:http.request.field{:name "RequestItems", :shape "BatchWriteItemRequestMap"})]}))

(clojure.core/defn- req-list-tables-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :exclusive-start-table-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :exclusive-start-table-name)) #:http.request.field{:name "ExclusiveStartTableName", :shape "TableName"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tables-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListTablesInputLimit"}))))

(clojure.core/defn- req-update-item-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"}) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"}) (clojure.core/into (ser-attribute-updates (input :attribute-updates)) #:http.request.field{:name "AttributeUpdates", :shape "AttributeUpdates"})]} (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-attribute-map (input :expected)) #:http.request.field{:name "Expected", :shape "ExpectedAttributeMap"})) (clojure.core/contains? input :return-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-value (input :return-values)) #:http.request.field{:name "ReturnValues", :shape "ReturnValue"}))))

(clojure.core/declare deser-batch-write-response-map)

(clojure.core/declare deser-attribute-map)

(clojure.core/declare deser-number-set-attribute-value)

(clojure.core/declare deser-number-attribute-value)

(clojure.core/declare deser-consumed-capacity-units)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-delete-request)

(clojure.core/declare deser-positive-long-object)

(clojure.core/declare deser-key-list)

(clojure.core/declare deser-table-name-list)

(clojure.core/declare deser-table-description)

(clojure.core/declare deser-item-list)

(clojure.core/declare deser-provisioned-throughput-description)

(clojure.core/declare deser-batch-write-response)

(clojure.core/declare deser-put-item-input-attribute-map)

(clojure.core/declare deser-key-schema)

(clojure.core/declare deser-write-requests)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-keys-and-attributes)

(clojure.core/declare deser-date)

(clojure.core/declare deser-binary-set-attribute-value)

(clojure.core/declare deser-consistent-read)

(clojure.core/declare deser-key)

(clojure.core/declare deser-binary-attribute-value)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-batch-get-request-map)

(clojure.core/declare deser-batch-write-item-request-map)

(clojure.core/declare deser-attribute-name-list)

(clojure.core/declare deser-table-status)

(clojure.core/declare deser-scalar-attribute-type)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-batch-response)

(clojure.core/declare deser-put-request)

(clojure.core/declare deser-table-name)

(clojure.core/declare deser-long)

(clojure.core/declare deser-batch-get-response-map)

(clojure.core/declare deser-key-schema-element)

(clojure.core/declare deser-string-attribute-value)

(clojure.core/declare deser-string-set-attribute-value)

(clojure.core/declare deser-key-schema-attribute-name)

(clojure.core/declare deser-write-request)

(clojure.core/defn- deser-batch-write-response-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-table-name k) (deser-batch-write-response v)])) input))

(clojure.core/defn- deser-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-number-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-number-attribute-value coll))) input))

(clojure.core/defn- deser-number-attribute-value [input] input)

(clojure.core/defn- deser-consumed-capacity-units [input] input)

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-delete-request [input] (clojure.core/cond-> {:key (deser-key (input "Key"))}))

(clojure.core/defn- deser-positive-long-object [input] input)

(clojure.core/defn- deser-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key coll))) input))

(clojure.core/defn- deser-table-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-table-name coll))) input))

(clojure.core/defn- deser-table-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-table-name (input "TableName"))) (clojure.core/contains? input "KeySchema") (clojure.core/assoc :key-schema (deser-key-schema (input "KeySchema"))) (clojure.core/contains? input "TableStatus") (clojure.core/assoc :table-status (deser-table-status (input "TableStatus"))) (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime"))) (clojure.core/contains? input "ProvisionedThroughput") (clojure.core/assoc :provisioned-throughput (deser-provisioned-throughput-description (input "ProvisionedThroughput"))) (clojure.core/contains? input "TableSizeBytes") (clojure.core/assoc :table-size-bytes (deser-long (input "TableSizeBytes"))) (clojure.core/contains? input "ItemCount") (clojure.core/assoc :item-count (deser-long (input "ItemCount")))))

(clojure.core/defn- deser-item-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-map coll))) input))

(clojure.core/defn- deser-provisioned-throughput-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "LastIncreaseDateTime") (clojure.core/assoc :last-increase-date-time (deser-date (input "LastIncreaseDateTime"))) (clojure.core/contains? input "LastDecreaseDateTime") (clojure.core/assoc :last-decrease-date-time (deser-date (input "LastDecreaseDateTime"))) (clojure.core/contains? input "NumberOfDecreasesToday") (clojure.core/assoc :number-of-decreases-today (deser-positive-long-object (input "NumberOfDecreasesToday"))) (clojure.core/contains? input "ReadCapacityUnits") (clojure.core/assoc :read-capacity-units (deser-positive-long-object (input "ReadCapacityUnits"))) (clojure.core/contains? input "WriteCapacityUnits") (clojure.core/assoc :write-capacity-units (deser-positive-long-object (input "WriteCapacityUnits")))))

(clojure.core/defn- deser-batch-write-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (input "ConsumedCapacityUnits")))))

(clojure.core/defn- deser-put-item-input-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-key-schema [input] (clojure.core/cond-> {:hash-key-element (deser-key-schema-element (input "HashKeyElement"))} (clojure.core/contains? input "RangeKeyElement") (clojure.core/assoc :range-key-element (deser-key-schema-element (input "RangeKeyElement")))))

(clojure.core/defn- deser-write-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-write-request coll))) input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-keys-and-attributes [input] (clojure.core/cond-> {:keys (deser-key-list (input "Keys"))} (clojure.core/contains? input "AttributesToGet") (clojure.core/assoc :attributes-to-get (deser-attribute-name-list (input "AttributesToGet"))) (clojure.core/contains? input "ConsistentRead") (clojure.core/assoc :consistent-read (deser-consistent-read (input "ConsistentRead")))))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-binary-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-binary-attribute-value coll))) input))

(clojure.core/defn- deser-consistent-read [input] input)

(clojure.core/defn- deser-key [input] (clojure.core/cond-> {:hash-key-element (deser-attribute-value (input "HashKeyElement"))} (clojure.core/contains? input "RangeKeyElement") (clojure.core/assoc :range-key-element (deser-attribute-value (input "RangeKeyElement")))))

(clojure.core/defn- deser-binary-attribute-value [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-attribute-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "S") (clojure.core/assoc :s (deser-string-attribute-value (input "S"))) (clojure.core/contains? input "N") (clojure.core/assoc :n (deser-number-attribute-value (input "N"))) (clojure.core/contains? input "B") (clojure.core/assoc :b (deser-binary-attribute-value (input "B"))) (clojure.core/contains? input "SS") (clojure.core/assoc :ss (deser-string-set-attribute-value (input "SS"))) (clojure.core/contains? input "NS") (clojure.core/assoc :ns (deser-number-set-attribute-value (input "NS"))) (clojure.core/contains? input "BS") (clojure.core/assoc :bs (deser-binary-set-attribute-value (input "BS")))))

(clojure.core/defn- deser-batch-get-request-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-table-name k) (deser-keys-and-attributes v)])) input))

(clojure.core/defn- deser-batch-write-item-request-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-table-name k) (deser-write-requests v)])) input))

(clojure.core/defn- deser-attribute-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-name coll))) input))

(clojure.core/defn- deser-table-status [input] (clojure.core/get {"CREATING" :creating, "UPDATING" :updating, "DELETING" :deleting, "ACTIVE" :active} input))

(clojure.core/defn- deser-scalar-attribute-type [input] (clojure.core/get {"S" :s, "N" :n, "B" :b} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-batch-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Items") (clojure.core/assoc :items (deser-item-list (input "Items"))) (clojure.core/contains? input "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (input "ConsumedCapacityUnits")))))

(clojure.core/defn- deser-put-request [input] (clojure.core/cond-> {:item (deser-put-item-input-attribute-map (input "Item"))}))

(clojure.core/defn- deser-table-name [input] input)

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-batch-get-response-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-table-name k) (deser-batch-response v)])) input))

(clojure.core/defn- deser-key-schema-element [input] (clojure.core/cond-> {:attribute-name (deser-key-schema-attribute-name (input "AttributeName")), :attribute-type (deser-scalar-attribute-type (input "AttributeType"))}))

(clojure.core/defn- deser-string-attribute-value [input] input)

(clojure.core/defn- deser-string-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-attribute-value coll))) input))

(clojure.core/defn- deser-key-schema-attribute-name [input] input)

(clojure.core/defn- deser-write-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "PutRequest") (clojure.core/assoc :put-request (deser-put-request (input "PutRequest"))) (clojure.core/contains? input "DeleteRequest") (clojure.core/assoc :delete-request (deser-delete-request (input "DeleteRequest")))))

(clojure.core/defn- response-update-item-output ([input] (response-update-item-output nil input)) ([resultWrapper1711009 input] (clojure.core/let [rawinput1711008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711010 {"Attributes" (rawinput1711008 "Attributes"), "ConsumedCapacityUnits" (rawinput1711008 "ConsumedCapacityUnits")}] (clojure.core/cond-> {} (letvar1711010 "Attributes") (clojure.core/assoc :attributes (deser-attribute-map (clojure.core/get-in letvar1711010 ["Attributes"]))) (letvar1711010 "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (clojure.core/get-in letvar1711010 ["ConsumedCapacityUnits"])))))))

(clojure.core/defn- response-delete-item-output ([input] (response-delete-item-output nil input)) ([resultWrapper1711012 input] (clojure.core/let [rawinput1711011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711013 {"Attributes" (rawinput1711011 "Attributes"), "ConsumedCapacityUnits" (rawinput1711011 "ConsumedCapacityUnits")}] (clojure.core/cond-> {} (letvar1711013 "Attributes") (clojure.core/assoc :attributes (deser-attribute-map (clojure.core/get-in letvar1711013 ["Attributes"]))) (letvar1711013 "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (clojure.core/get-in letvar1711013 ["ConsumedCapacityUnits"])))))))

(clojure.core/defn- response-get-item-output ([input] (response-get-item-output nil input)) ([resultWrapper1711015 input] (clojure.core/let [rawinput1711014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711016 {"Item" (rawinput1711014 "Item"), "ConsumedCapacityUnits" (rawinput1711014 "ConsumedCapacityUnits")}] (clojure.core/cond-> {} (letvar1711016 "Item") (clojure.core/assoc :item (deser-attribute-map (clojure.core/get-in letvar1711016 ["Item"]))) (letvar1711016 "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (clojure.core/get-in letvar1711016 ["ConsumedCapacityUnits"])))))))

(clojure.core/defn- response-update-table-output ([input] (response-update-table-output nil input)) ([resultWrapper1711018 input] (clojure.core/let [rawinput1711017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711019 {"TableDescription" (rawinput1711017 "TableDescription")}] (clojure.core/cond-> {} (letvar1711019 "TableDescription") (clojure.core/assoc :table-description (deser-table-description (clojure.core/get-in letvar1711019 ["TableDescription"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1711021 input] (clojure.core/let [rawinput1711020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711022 {"message" (rawinput1711020 "message")}] (clojure.core/cond-> {} (letvar1711022 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1711022 ["message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1711024 input] (clojure.core/let [rawinput1711023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711025 {"message" (rawinput1711023 "message")}] (clojure.core/cond-> {} (letvar1711025 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1711025 ["message"])))))))

(clojure.core/defn- response-describe-table-output ([input] (response-describe-table-output nil input)) ([resultWrapper1711027 input] (clojure.core/let [rawinput1711026 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711028 {"Table" (rawinput1711026 "Table")}] (clojure.core/cond-> {} (letvar1711028 "Table") (clojure.core/assoc :table (deser-table-description (clojure.core/get-in letvar1711028 ["Table"])))))))

(clojure.core/defn- response-query-output ([input] (response-query-output nil input)) ([resultWrapper1711030 input] (clojure.core/let [rawinput1711029 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711031 {"Items" (rawinput1711029 "Items"), "Count" (rawinput1711029 "Count"), "LastEvaluatedKey" (rawinput1711029 "LastEvaluatedKey"), "ConsumedCapacityUnits" (rawinput1711029 "ConsumedCapacityUnits")}] (clojure.core/cond-> {} (letvar1711031 "Items") (clojure.core/assoc :items (deser-item-list (clojure.core/get-in letvar1711031 ["Items"]))) (letvar1711031 "Count") (clojure.core/assoc :count (deser-integer (clojure.core/get-in letvar1711031 ["Count"]))) (letvar1711031 "LastEvaluatedKey") (clojure.core/assoc :last-evaluated-key (deser-key (clojure.core/get-in letvar1711031 ["LastEvaluatedKey"]))) (letvar1711031 "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (clojure.core/get-in letvar1711031 ["ConsumedCapacityUnits"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1711033 input] (clojure.core/let [rawinput1711032 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711034 {"message" (rawinput1711032 "message")}] (clojure.core/cond-> {} (letvar1711034 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1711034 ["message"])))))))

(clojure.core/defn- response-list-tables-output ([input] (response-list-tables-output nil input)) ([resultWrapper1711036 input] (clojure.core/let [rawinput1711035 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711037 {"TableNames" (rawinput1711035 "TableNames"), "LastEvaluatedTableName" (rawinput1711035 "LastEvaluatedTableName")}] (clojure.core/cond-> {} (letvar1711037 "TableNames") (clojure.core/assoc :table-names (deser-table-name-list (clojure.core/get-in letvar1711037 ["TableNames"]))) (letvar1711037 "LastEvaluatedTableName") (clojure.core/assoc :last-evaluated-table-name (deser-table-name (clojure.core/get-in letvar1711037 ["LastEvaluatedTableName"])))))))

(clojure.core/defn- response-batch-get-item-output ([input] (response-batch-get-item-output nil input)) ([resultWrapper1711039 input] (clojure.core/let [rawinput1711038 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711040 {"Responses" (rawinput1711038 "Responses"), "UnprocessedKeys" (rawinput1711038 "UnprocessedKeys")}] (clojure.core/cond-> {} (letvar1711040 "Responses") (clojure.core/assoc :responses (deser-batch-get-response-map (clojure.core/get-in letvar1711040 ["Responses"]))) (letvar1711040 "UnprocessedKeys") (clojure.core/assoc :unprocessed-keys (deser-batch-get-request-map (clojure.core/get-in letvar1711040 ["UnprocessedKeys"])))))))

(clojure.core/defn- response-put-item-output ([input] (response-put-item-output nil input)) ([resultWrapper1711042 input] (clojure.core/let [rawinput1711041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711043 {"Attributes" (rawinput1711041 "Attributes"), "ConsumedCapacityUnits" (rawinput1711041 "ConsumedCapacityUnits")}] (clojure.core/cond-> {} (letvar1711043 "Attributes") (clojure.core/assoc :attributes (deser-attribute-map (clojure.core/get-in letvar1711043 ["Attributes"]))) (letvar1711043 "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (clojure.core/get-in letvar1711043 ["ConsumedCapacityUnits"])))))))

(clojure.core/defn- response-delete-table-output ([input] (response-delete-table-output nil input)) ([resultWrapper1711045 input] (clojure.core/let [rawinput1711044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711046 {"TableDescription" (rawinput1711044 "TableDescription")}] (clojure.core/cond-> {} (letvar1711046 "TableDescription") (clojure.core/assoc :table-description (deser-table-description (clojure.core/get-in letvar1711046 ["TableDescription"])))))))

(clojure.core/defn- response-batch-write-item-output ([input] (response-batch-write-item-output nil input)) ([resultWrapper1711048 input] (clojure.core/let [rawinput1711047 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711049 {"Responses" (rawinput1711047 "Responses"), "UnprocessedItems" (rawinput1711047 "UnprocessedItems")}] (clojure.core/cond-> {} (letvar1711049 "Responses") (clojure.core/assoc :responses (deser-batch-write-response-map (clojure.core/get-in letvar1711049 ["Responses"]))) (letvar1711049 "UnprocessedItems") (clojure.core/assoc :unprocessed-items (deser-batch-write-item-request-map (clojure.core/get-in letvar1711049 ["UnprocessedItems"])))))))

(clojure.core/defn- response-scan-output ([input] (response-scan-output nil input)) ([resultWrapper1711051 input] (clojure.core/let [rawinput1711050 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711052 {"Items" (rawinput1711050 "Items"), "Count" (rawinput1711050 "Count"), "ScannedCount" (rawinput1711050 "ScannedCount"), "LastEvaluatedKey" (rawinput1711050 "LastEvaluatedKey"), "ConsumedCapacityUnits" (rawinput1711050 "ConsumedCapacityUnits")}] (clojure.core/cond-> {} (letvar1711052 "Items") (clojure.core/assoc :items (deser-item-list (clojure.core/get-in letvar1711052 ["Items"]))) (letvar1711052 "Count") (clojure.core/assoc :count (deser-integer (clojure.core/get-in letvar1711052 ["Count"]))) (letvar1711052 "ScannedCount") (clojure.core/assoc :scanned-count (deser-integer (clojure.core/get-in letvar1711052 ["ScannedCount"]))) (letvar1711052 "LastEvaluatedKey") (clojure.core/assoc :last-evaluated-key (deser-key (clojure.core/get-in letvar1711052 ["LastEvaluatedKey"]))) (letvar1711052 "ConsumedCapacityUnits") (clojure.core/assoc :consumed-capacity-units (deser-consumed-capacity-units (clojure.core/get-in letvar1711052 ["ConsumedCapacityUnits"])))))))

(clojure.core/defn- response-conditional-check-failed-exception ([input] (response-conditional-check-failed-exception nil input)) ([resultWrapper1711054 input] (clojure.core/let [rawinput1711053 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711055 {"message" (rawinput1711053 "message")}] (clojure.core/cond-> {} (letvar1711055 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1711055 ["message"])))))))

(clojure.core/defn- response-create-table-output ([input] (response-create-table-output nil input)) ([resultWrapper1711057 input] (clojure.core/let [rawinput1711056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711058 {"TableDescription" (rawinput1711056 "TableDescription")}] (clojure.core/cond-> {} (letvar1711058 "TableDescription") (clojure.core/assoc :table-description (deser-table-description (clojure.core/get-in letvar1711058 ["TableDescription"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1711060 input] (clojure.core/let [rawinput1711059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711061 {"message" (rawinput1711059 "message")}] (clojure.core/cond-> {} (letvar1711061 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1711061 ["message"])))))))

(clojure.core/defn- response-provisioned-throughput-exceeded-exception ([input] (response-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper1711063 input] (clojure.core/let [rawinput1711062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1711064 {"message" (rawinput1711062 "message")}] (clojure.core/cond-> {} (letvar1711064 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1711064 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-response-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/batch-write-response))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.update-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.update-item-output/attributes :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.get-item-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/get-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/key] :opt-un [:portkey.aws.dynamodb.-2011-12-05.get-item-input/attributes-to-get :portkey.aws.dynamodb.-2011-12-05/consistent-read]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/exists (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/expected-attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/value :portkey.aws.dynamodb.-2011-12-05.expected-attribute-value/exists]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.delete-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.delete-item-output/attributes :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/number-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/number-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.get-item-output/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/get-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.get-item-output/item :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-get-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.batch-get-item-input/request-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/describe-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-action #{"DELETE" "ADD" :delete :put :add "PUT"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/return-value #{:updated-new :updated-old "UPDATED_OLD" "ALL_NEW" :all-old "NONE" "UPDATED_NEW" "ALL_OLD" :all-new :none})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/key :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/create-table-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/key-schema :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-name-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/table-name))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-updates (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/attribute-value-update))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/comparison-operator #{:not-contains "NULL" :ge :contains :eq "NE" "CONTAINS" "LT" "GE" :between "LE" "NOT_CONTAINS" :null :gt "BEGINS_WITH" "NOT_NULL" "EQ" :not-null :ne "GT" :le :lt "IN" "BETWEEN" :begins-with :in})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/filter-condition-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/string :portkey.aws.dynamodb.-2011-12-05/condition))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.describe-table-output/table (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/describe-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.describe-table-output/table]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/creation-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/provisioned-throughput (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-description))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/table-size-bytes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.table-description/item-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/long))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/key-schema :portkey.aws.dynamodb.-2011-12-05/table-status :portkey.aws.dynamodb.-2011-12-05.table-description/creation-date-time :portkey.aws.dynamodb.-2011-12-05.table-description/provisioned-throughput :portkey.aws.dynamodb.-2011-12-05.table-description/table-size-bytes :portkey.aws.dynamodb.-2011-12-05.table-description/item-count]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/item-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/attribute-map))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/last-increase-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/last-decrease-date-time (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/date))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/number-of-decreases-today (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/last-increase-date-time :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/last-decrease-date-time :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/number-of-decreases-today :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/read-capacity-units :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-description/write-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-item-input-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.query-output/items :portkey.aws.dynamodb.-2011-12-05.query-output/count :portkey.aws.dynamodb.-2011-12-05.query-output/last-evaluated-key :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema/hash-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-schema-element))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema/range-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-schema-element))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-schema (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.key-schema/hash-key-element] :opt-un [:portkey.aws.dynamodb.-2011-12-05.key-schema/range-key-element]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-input/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05.put-item-input/item] :opt-un [:portkey.aws.dynamodb.-2011-12-05.put-item-input/expected :portkey.aws.dynamodb.-2011-12-05.put-item-input/return-values]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/write-requests (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/write-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/keys (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/keys-and-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/keys] :opt-un [:portkey.aws.dynamodb.-2011-12-05.keys-and-attributes/attributes-to-get :portkey.aws.dynamodb.-2011-12-05/consistent-read]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/binary-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/binary-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/consistent-read clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key/hash-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key/range-key-element (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.key/hash-key-element] :opt-un [:portkey.aws.dynamodb.-2011-12-05.key/range-key-element]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/binary-attribute-value clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/s (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/n (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/b (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/ss (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/string-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/ns (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/number-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value/bs (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/binary-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.attribute-value/s :portkey.aws.dynamodb.-2011-12-05.attribute-value/n :portkey.aws.dynamodb.-2011-12-05.attribute-value/b :portkey.aws.dynamodb.-2011-12-05.attribute-value/ss :portkey.aws.dynamodb.-2011-12-05.attribute-value/ns :portkey.aws.dynamodb.-2011-12-05.attribute-value/bs]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/keys-and-attributes))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :portkey.aws.dynamodb.-2011-12-05/expected-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/scan-filter (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/filter-condition-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/scan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name] :opt-un [:portkey.aws.dynamodb.-2011-12-05.scan-input/attributes-to-get :portkey.aws.dynamodb.-2011-12-05.scan-input/limit :portkey.aws.dynamodb.-2011-12-05.scan-input/count :portkey.aws.dynamodb.-2011-12-05.scan-input/scan-filter :portkey.aws.dynamodb.-2011-12-05.scan-input/exclusive-start-key]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/list-tables-input-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-item-request-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/write-requests))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/attribute-name :min-count 1))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-status #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.delete-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.delete-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/key] :opt-un [:portkey.aws.dynamodb.-2011-12-05.delete-item-input/expected :portkey.aws.dynamodb.-2011-12-05.delete-item-input/return-values]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/scalar-attribute-type #{:n "S" :s "B" :b "N"})

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-output/table-names (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-output/last-evaluated-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/list-tables-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.list-tables-output/table-names :portkey.aws.dynamodb.-2011-12-05.list-tables-output/last-evaluated-table-name]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/responses (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-response-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/unprocessed-keys (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/responses :portkey.aws.dynamodb.-2011-12-05.batch-get-item-output/unprocessed-keys]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-item-output/attributes (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.put-item-output/attributes :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-response/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.batch-response/items :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/scan-index-forward (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/boolean-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/attributes-to-get (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/hash-key-value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/exclusive-start-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.query-input/range-key-condition (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/condition))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05.query-input/hash-key-value] :opt-un [:portkey.aws.dynamodb.-2011-12-05.query-input/scan-index-forward :portkey.aws.dynamodb.-2011-12-05.query-input/count :portkey.aws.dynamodb.-2011-12-05.query-input/attributes-to-get :portkey.aws.dynamodb.-2011-12-05.query-input/limit :portkey.aws.dynamodb.-2011-12-05/consistent-read :portkey.aws.dynamodb.-2011-12-05.query-input/exclusive-start-key :portkey.aws.dynamodb.-2011-12-05.query-input/range-key-condition]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.put-request/item (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/put-item-input-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/put-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.put-request/item] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/delete-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value-update/value (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.attribute-value-update/action (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/attribute-action))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-value-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.attribute-value-update/value :portkey.aws.dynamodb.-2011-12-05.attribute-value-update/action]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/positive-integer-object (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-write-item-input/request-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.batch-write-item-input/request-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-get-response-map (clojure.spec.alpha/map-of :portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/batch-response))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.key-schema-element/attribute-type (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/scalar-attribute-type))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-schema-element (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.key-schema-element/attribute-name :portkey.aws.dynamodb.-2011-12-05.key-schema-element/attribute-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/attribute-value-list (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/responses (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-response-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/unprocessed-items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-item-request-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/batch-write-item-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/responses :portkey.aws.dynamodb.-2011-12-05.batch-write-item-output/unprocessed-items]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/condition (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/comparison-operator] :opt-un [:portkey.aws.dynamodb.-2011-12-05/attribute-value-list]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-input/exclusive-start-table-name (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/table-name))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.list-tables-input/limit (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/list-tables-input-limit))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/list-tables-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.list-tables-input/exclusive-start-table-name :portkey.aws.dynamodb.-2011-12-05.list-tables-input/limit]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/items (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/item-list))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/scanned-count (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/integer))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.scan-output/last-evaluated-key (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/key))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/scan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.scan-output/items :portkey.aws.dynamodb.-2011-12-05.scan-output/count :portkey.aws.dynamodb.-2011-12-05.scan-output/scanned-count :portkey.aws.dynamodb.-2011-12-05.scan-output/last-evaluated-key :portkey.aws.dynamodb.-2011-12-05/consumed-capacity-units]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.conditional-check-failed-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.conditional-check-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/create-table-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/table-description]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/read-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/write-capacity-units (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/read-capacity-units :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput/write-capacity-units] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/string-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.dynamodb.-2011-12-05/string-attribute-value))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.update-item-input/expected (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/expected-attribute-map))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.update-item-input/return-values (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/return-value))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/update-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.dynamodb.-2011-12-05/table-name :portkey.aws.dynamodb.-2011-12-05/key :portkey.aws.dynamodb.-2011-12-05/attribute-updates] :opt-un [:portkey.aws.dynamodb.-2011-12-05.update-item-input/expected :portkey.aws.dynamodb.-2011-12-05.update-item-input/return-values]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/write-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05/put-request :portkey.aws.dynamodb.-2011-12-05/delete-request]))

(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/error-message))
(clojure.spec.alpha/def :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dynamodb.-2011-12-05.provisioned-throughput-exceeded-exception/message]))

(clojure.core/defn update-table ([update-table-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-table-input update-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/update-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/update-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTable", :http.request.configuration/output-deser-fn response-update-table-output, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef update-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/update-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/update-table-output))

(clojure.core/defn update-item ([update-item-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-item-input update-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/update-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/update-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateItem", :http.request.configuration/output-deser-fn response-update-item-output, :http.request.spec/error-spec {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef update-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/update-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/update-item-output))

(clojure.core/defn scan ([scan-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-scan-input scan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/scan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/scan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Scan", :http.request.configuration/output-deser-fn response-scan-output, :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef scan :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/scan-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/scan-output))

(clojure.core/defn create-table ([create-table-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-table-input create-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/create-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/create-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTable", :http.request.configuration/output-deser-fn response-create-table-output, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef create-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/create-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/create-table-output))

(clojure.core/defn query ([query-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-query-input query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Query", :http.request.configuration/output-deser-fn response-query-output, :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef query :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/query-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/query-output))

(clojure.core/defn list-tables ([] (list-tables {})) ([list-tables-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tables-input list-tables-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/list-tables-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/list-tables-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTables", :http.request.configuration/output-deser-fn response-list-tables-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tables :args (clojure.spec.alpha/? :portkey.aws.dynamodb.-2011-12-05/list-tables-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/list-tables-output))

(clojure.core/defn batch-get-item ([batch-get-item-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-batch-get-item-input batch-get-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/batch-get-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/batch-get-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetItem", :http.request.configuration/output-deser-fn response-batch-get-item-output, :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef batch-get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/batch-get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-get-item-output))

(clojure.core/defn batch-write-item ([batch-write-item-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-batch-write-item-input batch-write-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/batch-write-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/batch-write-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchWriteItem", :http.request.configuration/output-deser-fn response-batch-write-item-output, :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef batch-write-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/batch-write-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/batch-write-item-output))

(clojure.core/defn get-item ([get-item-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-item-input get-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/get-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/get-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetItem", :http.request.configuration/output-deser-fn response-get-item-output, :http.request.spec/error-spec {"ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef get-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/get-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/get-item-output))

(clojure.core/defn delete-item ([delete-item-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-item-input delete-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/delete-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/delete-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteItem", :http.request.configuration/output-deser-fn response-delete-item-output, :http.request.spec/error-spec {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/delete-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/delete-item-output))

(clojure.core/defn put-item ([put-item-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-item-input put-item-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/put-item-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/put-item-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutItem", :http.request.configuration/output-deser-fn response-put-item-output, :http.request.spec/error-spec {"ConditionalCheckFailedException" :portkey.aws.dynamodb.-2011-12-05/conditional-check-failed-exception, "ProvisionedThroughputExceededException" :portkey.aws.dynamodb.-2011-12-05/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef put-item :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/put-item-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/put-item-output))

(clojure.core/defn describe-table ([describe-table-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-table-input describe-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/describe-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/describe-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTable", :http.request.configuration/output-deser-fn response-describe-table-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/describe-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/describe-table-output))

(clojure.core/defn delete-table ([delete-table-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-table-input delete-table-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.dynamodb.-2011-12-05/endpoints, :http.request.configuration/target-prefix "DynamoDB_20111205", :http.request.spec/output-spec :portkey.aws.dynamodb.-2011-12-05/delete-table-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-12-05", :http.request.configuration/service-id "DynamoDB", :http.request.spec/input-spec :portkey.aws.dynamodb.-2011-12-05/delete-table-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTable", :http.request.configuration/output-deser-fn response-delete-table-output, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.dynamodb.-2011-12-05/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.dynamodb.-2011-12-05/resource-not-found-exception, "LimitExceededException" :portkey.aws.dynamodb.-2011-12-05/limit-exceeded-exception, "InternalServerError" :portkey.aws.dynamodb.-2011-12-05/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-table :args (clojure.spec.alpha/tuple :portkey.aws.dynamodb.-2011-12-05/delete-table-input) :ret (clojure.spec.alpha/and :portkey.aws.dynamodb.-2011-12-05/delete-table-output))
