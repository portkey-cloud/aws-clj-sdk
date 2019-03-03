(ns portkey.aws.streams-dynamodb.-2012-08-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "dynamodb", :region "ap-northeast-1"},
    :ssl-common-name "streams.dynamodb.ap-northeast-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "dynamodb", :region "eu-west-1"},
    :ssl-common-name "streams.dynamodb.eu-west-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "dynamodb", :region "us-east-2"},
    :ssl-common-name "streams.dynamodb.us-east-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "dynamodb", :region "ap-southeast-2"},
    :ssl-common-name "streams.dynamodb.ap-southeast-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "dynamodb", :region "cn-north-1"},
    :ssl-common-name "streams.dynamodb.cn-north-1.amazonaws.com.cn",
    :endpoint "https://streams.dynamodb.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "dynamodb", :region "sa-east-1"},
    :ssl-common-name "streams.dynamodb.sa-east-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "dynamodb", :region "ap-southeast-1"},
    :ssl-common-name "streams.dynamodb.ap-southeast-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "dynamodb", :region "cn-northwest-1"},
    :ssl-common-name
    "streams.dynamodb.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://streams.dynamodb.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "dynamodb", :region "ap-northeast-2"},
    :ssl-common-name "streams.dynamodb.ap-northeast-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "dynamodb", :region "eu-west-3"},
    :ssl-common-name "streams.dynamodb.eu-west-3.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1-fips"
   {:credential-scope
    {:service "streams.dynamodb", :region "us-gov-west-1"},
    :ssl-common-name "dynamodb.us-gov-west-1.amazonaws.com",
    :endpoint "https://dynamodb.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "dynamodb", :region "ca-central-1"},
    :ssl-common-name "streams.dynamodb.ca-central-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "dynamodb", :region "eu-central-1"},
    :ssl-common-name "streams.dynamodb.eu-central-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "dynamodb", :region "eu-west-2"},
    :ssl-common-name "streams.dynamodb.eu-west-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "dynamodb", :region "us-gov-west-1"},
    :ssl-common-name "streams.dynamodb.us-gov-west-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "local"
   {:credential-scope
    {:service "streams.dynamodb", :region "us-east-1"},
    :ssl-common-name "localhost:8000",
    :endpoint "http://localhost:8000",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "dynamodb", :region "us-west-2"},
    :ssl-common-name "streams.dynamodb.us-west-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "dynamodb", :region "us-east-1"},
    :ssl-common-name "streams.dynamodb.us-east-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "dynamodb", :region "us-west-1"},
    :ssl-common-name "streams.dynamodb.us-west-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "dynamodb", :region "ap-south-1"},
    :ssl-common-name "streams.dynamodb.ap-south-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-shard-id)

(clojure.core/declare ser-shard-iterator-type)

(clojure.core/declare ser-shard-iterator)

(clojure.core/declare ser-sequence-number)

(clojure.core/declare ser-stream-arn)

(clojure.core/declare ser-table-name)

(clojure.core/declare ser-positive-integer-object)

(clojure.core/defn- ser-shard-id [input] #:http.request.field{:value input, :shape "ShardId"})

(clojure.core/defn- ser-shard-iterator-type [input] #:http.request.field{:value (clojure.core/get {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER", :at-sequence-number "AT_SEQUENCE_NUMBER", "AFTER_SEQUENCE_NUMBER" "AFTER_SEQUENCE_NUMBER", :after-sequence-number "AFTER_SEQUENCE_NUMBER"} input), :shape "ShardIteratorType"})

(clojure.core/defn- ser-shard-iterator [input] #:http.request.field{:value input, :shape "ShardIterator"})

(clojure.core/defn- ser-sequence-number [input] #:http.request.field{:value input, :shape "SequenceNumber"})

(clojure.core/defn- ser-stream-arn [input] #:http.request.field{:value input, :shape "StreamArn"})

(clojure.core/defn- ser-table-name [input] #:http.request.field{:value input, :shape "TableName"})

(clojure.core/defn- ser-positive-integer-object [input] #:http.request.field{:value input, :shape "PositiveIntegerObject"})

(clojure.core/defn- req-get-shard-iterator-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamArn", :shape "StreamArn"}) (clojure.core/into (ser-shard-id (input :shard-id)) #:http.request.field{:name "ShardId", :shape "ShardId"}) (clojure.core/into (ser-shard-iterator-type (input :shard-iterator-type)) #:http.request.field{:name "ShardIteratorType", :shape "ShardIteratorType"})]} (clojure.core/contains? input :sequence-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sequence-number (input :sequence-number)) #:http.request.field{:name "SequenceNumber", :shape "SequenceNumber"}))))

(clojure.core/defn- req-get-records-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-shard-iterator (input :shard-iterator)) #:http.request.field{:name "ShardIterator", :shape "ShardIterator"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"}))))

(clojure.core/defn- req-list-streams-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :table-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :exclusive-start-stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-arn (input :exclusive-start-stream-arn)) #:http.request.field{:name "ExclusiveStartStreamArn", :shape "StreamArn"}))))

(clojure.core/defn- req-describe-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamArn", :shape "StreamArn"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :exclusive-start-shard-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shard-id (input :exclusive-start-shard-id)) #:http.request.field{:name "ExclusiveStartShardId", :shape "ShardId"}))))

(clojure.core/declare deser-attribute-map)

(clojure.core/declare deser-number-set-attribute-value)

(clojure.core/declare deser-number-attribute-value)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-positive-long-object)

(clojure.core/declare deser-shard-id)

(clojure.core/declare deser-boolean-attribute-value)

(clojure.core/declare deser-shard-iterator)

(clojure.core/declare deser-null-attribute-value)

(clojure.core/declare deser-map-attribute-value)

(clojure.core/declare deser-shard)

(clojure.core/declare deser-key-schema)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-date)

(clojure.core/declare deser-binary-set-attribute-value)

(clojure.core/declare deser-stream-description)

(clojure.core/declare deser-sequence-number)

(clojure.core/declare deser-stream-view-type)

(clojure.core/declare deser-binary-attribute-value)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-stream-arn)

(clojure.core/declare deser-stream-record)

(clojure.core/declare deser-stream-status)

(clojure.core/declare deser-string)

(clojure.core/declare deser-record)

(clojure.core/declare deser-record-list)

(clojure.core/declare deser-operation-type)

(clojure.core/declare deser-identity)

(clojure.core/declare deser-stream-list)

(clojure.core/declare deser-table-name)

(clojure.core/declare deser-stream)

(clojure.core/declare deser-key-schema-element)

(clojure.core/declare deser-shard-description-list)

(clojure.core/declare deser-sequence-number-range)

(clojure.core/declare deser-list-attribute-value)

(clojure.core/declare deser-string-attribute-value)

(clojure.core/declare deser-string-set-attribute-value)

(clojure.core/declare deser-key-schema-attribute-name)

(clojure.core/declare deser-key-type)

(clojure.core/defn- deser-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-number-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-number-attribute-value coll))) input))

(clojure.core/defn- deser-number-attribute-value [input] input)

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-positive-long-object [input] input)

(clojure.core/defn- deser-shard-id [input] input)

(clojure.core/defn- deser-boolean-attribute-value [input] input)

(clojure.core/defn- deser-shard-iterator [input] input)

(clojure.core/defn- deser-null-attribute-value [input] input)

(clojure.core/defn- deser-map-attribute-value [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-shard [input] (clojure.core/cond-> {} (clojure.core/contains? input "ShardId") (clojure.core/assoc :shard-id (deser-shard-id (input "ShardId"))) (clojure.core/contains? input "SequenceNumberRange") (clojure.core/assoc :sequence-number-range (deser-sequence-number-range (input "SequenceNumberRange"))) (clojure.core/contains? input "ParentShardId") (clojure.core/assoc :parent-shard-id (deser-shard-id (input "ParentShardId")))))

(clojure.core/defn- deser-key-schema [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-schema-element coll))) input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-binary-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-binary-attribute-value coll))) input))

(clojure.core/defn- deser-stream-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "StreamLabel") (clojure.core/assoc :stream-label (deser-string (input "StreamLabel"))) (clojure.core/contains? input "Shards") (clojure.core/assoc :shards (deser-shard-description-list (input "Shards"))) (clojure.core/contains? input "LastEvaluatedShardId") (clojure.core/assoc :last-evaluated-shard-id (deser-shard-id (input "LastEvaluatedShardId"))) (clojure.core/contains? input "KeySchema") (clojure.core/assoc :key-schema (deser-key-schema (input "KeySchema"))) (clojure.core/contains? input "StreamViewType") (clojure.core/assoc :stream-view-type (deser-stream-view-type (input "StreamViewType"))) (clojure.core/contains? input "CreationRequestDateTime") (clojure.core/assoc :creation-request-date-time (deser-date (input "CreationRequestDateTime"))) (clojure.core/contains? input "StreamArn") (clojure.core/assoc :stream-arn (deser-stream-arn (input "StreamArn"))) (clojure.core/contains? input "StreamStatus") (clojure.core/assoc :stream-status (deser-stream-status (input "StreamStatus"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-table-name (input "TableName")))))

(clojure.core/defn- deser-sequence-number [input] input)

(clojure.core/defn- deser-stream-view-type [input] (clojure.core/get {"NEW_IMAGE" :new-image, "OLD_IMAGE" :old-image, "NEW_AND_OLD_IMAGES" :new-and-old-images, "KEYS_ONLY" :keys-only} input))

(clojure.core/defn- deser-binary-attribute-value [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-attribute-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "NULL") (clojure.core/assoc :null (deser-null-attribute-value (input "NULL"))) (clojure.core/contains? input "L") (clojure.core/assoc :l (deser-list-attribute-value (input "L"))) (clojure.core/contains? input "BOOL") (clojure.core/assoc :bool (deser-boolean-attribute-value (input "BOOL"))) (clojure.core/contains? input "M") (clojure.core/assoc :m (deser-map-attribute-value (input "M"))) (clojure.core/contains? input "S") (clojure.core/assoc :s (deser-string-attribute-value (input "S"))) (clojure.core/contains? input "B") (clojure.core/assoc :b (deser-binary-attribute-value (input "B"))) (clojure.core/contains? input "NS") (clojure.core/assoc :ns (deser-number-set-attribute-value (input "NS"))) (clojure.core/contains? input "N") (clojure.core/assoc :n (deser-number-attribute-value (input "N"))) (clojure.core/contains? input "BS") (clojure.core/assoc :bs (deser-binary-set-attribute-value (input "BS"))) (clojure.core/contains? input "SS") (clojure.core/assoc :ss (deser-string-set-attribute-value (input "SS")))))

(clojure.core/defn- deser-stream-arn [input] input)

(clojure.core/defn- deser-stream-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "ApproximateCreationDateTime") (clojure.core/assoc :approximate-creation-date-time (deser-date (input "ApproximateCreationDateTime"))) (clojure.core/contains? input "Keys") (clojure.core/assoc :keys (deser-attribute-map (input "Keys"))) (clojure.core/contains? input "NewImage") (clojure.core/assoc :new-image (deser-attribute-map (input "NewImage"))) (clojure.core/contains? input "OldImage") (clojure.core/assoc :old-image (deser-attribute-map (input "OldImage"))) (clojure.core/contains? input "SequenceNumber") (clojure.core/assoc :sequence-number (deser-sequence-number (input "SequenceNumber"))) (clojure.core/contains? input "SizeBytes") (clojure.core/assoc :size-bytes (deser-positive-long-object (input "SizeBytes"))) (clojure.core/contains? input "StreamViewType") (clojure.core/assoc :stream-view-type (deser-stream-view-type (input "StreamViewType")))))

(clojure.core/defn- deser-stream-status [input] (clojure.core/get {"ENABLING" :enabling, "ENABLED" :enabled, "DISABLING" :disabling, "DISABLED" :disabled} input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "eventID") (clojure.core/assoc :event-id (deser-string (input "eventID"))) (clojure.core/contains? input "eventName") (clojure.core/assoc :event-name (deser-operation-type (input "eventName"))) (clojure.core/contains? input "eventVersion") (clojure.core/assoc :event-version (deser-string (input "eventVersion"))) (clojure.core/contains? input "eventSource") (clojure.core/assoc :event-source (deser-string (input "eventSource"))) (clojure.core/contains? input "awsRegion") (clojure.core/assoc :aws-region (deser-string (input "awsRegion"))) (clojure.core/contains? input "dynamodb") (clojure.core/assoc :dynamodb (deser-stream-record (input "dynamodb"))) (clojure.core/contains? input "userIdentity") (clojure.core/assoc :user-identity (deser-identity (input "userIdentity")))))

(clojure.core/defn- deser-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record coll))) input))

(clojure.core/defn- deser-operation-type [input] (clojure.core/get {"INSERT" :insert, "MODIFY" :modify, "REMOVE" :remove} input))

(clojure.core/defn- deser-identity [input] (clojure.core/cond-> {} (clojure.core/contains? input "PrincipalId") (clojure.core/assoc :principal-id (deser-string (input "PrincipalId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type")))))

(clojure.core/defn- deser-stream-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stream coll))) input))

(clojure.core/defn- deser-table-name [input] input)

(clojure.core/defn- deser-stream [input] (clojure.core/cond-> {} (clojure.core/contains? input "StreamArn") (clojure.core/assoc :stream-arn (deser-stream-arn (input "StreamArn"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-table-name (input "TableName"))) (clojure.core/contains? input "StreamLabel") (clojure.core/assoc :stream-label (deser-string (input "StreamLabel")))))

(clojure.core/defn- deser-key-schema-element [input] (clojure.core/cond-> {:attribute-name (deser-key-schema-attribute-name (input "AttributeName")), :key-type (deser-key-type (input "KeyType"))}))

(clojure.core/defn- deser-shard-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-shard coll))) input))

(clojure.core/defn- deser-sequence-number-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "StartingSequenceNumber") (clojure.core/assoc :starting-sequence-number (deser-sequence-number (input "StartingSequenceNumber"))) (clojure.core/contains? input "EndingSequenceNumber") (clojure.core/assoc :ending-sequence-number (deser-sequence-number (input "EndingSequenceNumber")))))

(clojure.core/defn- deser-list-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-value coll))) input))

(clojure.core/defn- deser-string-attribute-value [input] input)

(clojure.core/defn- deser-string-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-attribute-value coll))) input))

(clojure.core/defn- deser-key-schema-attribute-name [input] input)

(clojure.core/defn- deser-key-type [input] (clojure.core/get {"HASH" :hash, "RANGE" :range} input))

(clojure.core/defn- deser-describe-stream-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "StreamDescription") (clojure.core/assoc :stream-description (deser-stream-description (input "StreamDescription")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-expired-iterator-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-get-records-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Records") (clojure.core/assoc :records (deser-record-list (input "Records"))) (clojure.core/contains? input "NextShardIterator") (clojure.core/assoc :next-shard-iterator (deser-shard-iterator (input "NextShardIterator")))))

(clojure.core/defn- deser-resource-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-list-streams-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Streams") (clojure.core/assoc :streams (deser-stream-list (input "Streams"))) (clojure.core/contains? input "LastEvaluatedStreamArn") (clojure.core/assoc :last-evaluated-stream-arn (deser-stream-arn (input "LastEvaluatedStreamArn")))))

(clojure.core/defn- deser-trimmed-data-access-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-get-shard-iterator-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "ShardIterator") (clojure.core/assoc :shard-iterator (deser-shard-iterator (input "ShardIterator")))))

(clojure.core/defn- deser-internal-server-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb.-2012-08-10/attribute-name :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10/stream-arn :portkey.aws.streams-dynamodb.-2012-08-10/shard-id :portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator-type] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/sequence-number]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/number-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/number-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 28 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 65))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator-type #{"LATEST" "TRIM_HORIZON" "AFTER_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER" :at-sequence-number :latest :trim-horizon :after-sequence-number})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/stream-description]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/null-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.expired-iterator-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/expired-iterator-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.expired-iterator-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/map-attribute-value (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb.-2012-08-10/attribute-name :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.shard/parent-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/shard-id :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number-range :portkey.aws.streams-dynamodb.-2012-08-10.shard/parent-shard-id]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-schema (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-element :min-count 1 :max-count 2))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/binary-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/binary-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/shards (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-description-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/last-evaluated-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/creation-request-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.stream-description/stream-label :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/shards :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/last-evaluated-shard-id :portkey.aws.streams-dynamodb.-2012-08-10/key-schema :portkey.aws.streams-dynamodb.-2012-08-10/stream-view-type :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/creation-request-date-time :portkey.aws.streams-dynamodb.-2012-08-10/stream-arn :portkey.aws.streams-dynamodb.-2012-08-10/stream-status :portkey.aws.streams-dynamodb.-2012-08-10/table-name]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 21 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-view-type #{:new-image :old-image "NEW_IMAGE" "NEW_AND_OLD_IMAGES" :keys-only :new-and-old-images "OLD_IMAGE" "KEYS_ONLY"})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/records (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/record-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/next-shard-iterator (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-records-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/records :portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/next-shard-iterator]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/binary-attribute-value clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/null (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/null-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/l (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/list-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/bool (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/boolean-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/m (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/map-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/s (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/b (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/ns (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/number-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/n (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/bs (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/binary-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/ss (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/null :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/l :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/bool :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/m :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/s :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/b :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/ns :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/n :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/bs :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/ss]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 37 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/streams (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/last-evaluated-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/streams :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/last-evaluated-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/approximate-creation-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/keys (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/new-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/old-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/size-bytes (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.stream-record/approximate-creation-date-time :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/keys :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/new-image :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/old-image :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/size-bytes :portkey.aws.streams-dynamodb.-2012-08-10/stream-view-type]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-status #{"DISABLED" :disabled "DISABLING" "ENABLING" :disabling :enabling "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/event-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/event-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/operation-type))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/event-version (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/event-source (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/aws-region (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/dynamodb (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-record))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/user-identity (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/identity))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.record/event-id :portkey.aws.streams-dynamodb.-2012-08-10.record/event-name :portkey.aws.streams-dynamodb.-2012-08-10.record/event-version :portkey.aws.streams-dynamodb.-2012-08-10.record/event-source :portkey.aws.streams-dynamodb.-2012-08-10.record/aws-region :portkey.aws.streams-dynamodb.-2012-08-10.record/dynamodb :portkey.aws.streams-dynamodb.-2012-08-10.record/user-identity]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/record-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/record))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/operation-type #{:remove :insert "MODIFY" "REMOVE" "INSERT" :modify})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.trimmed-data-access-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/trimmed-data-access-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.trimmed-data-access-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.identity/principal-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.identity/type (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.identity/principal-id :portkey.aws.streams-dynamodb.-2012-08-10.identity/type]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/stream))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 3 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/stream-arn :portkey.aws.streams-dynamodb.-2012-08-10/table-name :portkey.aws.streams-dynamodb.-2012-08-10.stream/stream-label]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.get-records-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-records-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.get-records-input/limit]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-element (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10.key-schema-element/attribute-name :portkey.aws.streams-dynamodb.-2012-08-10/key-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-description-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/shard))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/starting-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/ending-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/starting-sequence-number :portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/ending-sequence-number]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/exclusive-start-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/table-name :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/limit :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/exclusive-start-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/list-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/string-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/string-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-type #{:hash "RANGE" "HASH" :range})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/exclusive-start-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10/stream-arn] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/limit :portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/exclusive-start-shard-id]))

(clojure.core/defn describe-stream ([describe-stream-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-stream-input describe-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStream", :http.request.configuration/output-deser-fn deser-describe-stream-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-output))

(clojure.core/defn get-records ([get-records-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-records-input get-records-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb.-2012-08-10/get-records-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb.-2012-08-10/get-records-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRecords", :http.request.configuration/output-deser-fn deser-get-records-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.streams-dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error, "ExpiredIteratorException" :portkey.aws.streams-dynamodb.-2012-08-10/expired-iterator-exception, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb.-2012-08-10/trimmed-data-access-exception}})))))
(clojure.spec.alpha/fdef get-records :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb.-2012-08-10/get-records-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/get-records-output))

(clojure.core/defn get-shard-iterator ([get-shard-iterator-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-shard-iterator-input get-shard-iterator-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetShardIterator", :http.request.configuration/output-deser-fn deser-get-shard-iterator-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb.-2012-08-10/trimmed-data-access-exception}})))))
(clojure.spec.alpha/fdef get-shard-iterator :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-output))

(clojure.core/defn list-streams ([] (list-streams {})) ([list-streams-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-streams-input list-streams-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb.-2012-08-10/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreams", :http.request.configuration/output-deser-fn deser-list-streams-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error}})))))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-output))
