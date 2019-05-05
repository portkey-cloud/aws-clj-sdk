(ns portkey.aws.kinesis.-2013-12-02 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "kinesis", :region "us-gov-east-1"},
    :ssl-common-name "kinesis.us-gov-east-1.amazonaws.com",
    :endpoint "https://kinesis.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "kinesis", :region "ap-northeast-1"},
    :ssl-common-name "kinesis.ap-northeast-1.amazonaws.com",
    :endpoint "https://kinesis.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kinesis", :region "eu-west-1"},
    :ssl-common-name "kinesis.eu-west-1.amazonaws.com",
    :endpoint "https://kinesis.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "kinesis", :region "us-east-2"},
    :ssl-common-name "kinesis.us-east-2.amazonaws.com",
    :endpoint "https://kinesis.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "kinesis", :region "ap-southeast-2"},
    :ssl-common-name "kinesis.ap-southeast-2.amazonaws.com",
    :endpoint "https://kinesis.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "kinesis", :region "cn-north-1"},
    :ssl-common-name "kinesis.cn-north-1.amazonaws.com.cn",
    :endpoint "https://kinesis.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "kinesis", :region "sa-east-1"},
    :ssl-common-name "kinesis.sa-east-1.amazonaws.com",
    :endpoint "https://kinesis.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "kinesis", :region "ap-southeast-1"},
    :ssl-common-name "kinesis.ap-southeast-1.amazonaws.com",
    :endpoint "https://kinesis.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "kinesis", :region "cn-northwest-1"},
    :ssl-common-name "kinesis.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://kinesis.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "kinesis", :region "ap-northeast-2"},
    :ssl-common-name "kinesis.ap-northeast-2.amazonaws.com",
    :endpoint "https://kinesis.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "kinesis", :region "eu-west-3"},
    :ssl-common-name "kinesis.eu-west-3.amazonaws.com",
    :endpoint "https://kinesis.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "kinesis", :region "ca-central-1"},
    :ssl-common-name "kinesis.ca-central-1.amazonaws.com",
    :endpoint "https://kinesis.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "kinesis", :region "eu-central-1"},
    :ssl-common-name "kinesis.eu-central-1.amazonaws.com",
    :endpoint "https://kinesis.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "kinesis", :region "eu-west-2"},
    :ssl-common-name "kinesis.eu-west-2.amazonaws.com",
    :endpoint "https://kinesis.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "kinesis", :region "us-gov-west-1"},
    :ssl-common-name "kinesis.us-gov-west-1.amazonaws.com",
    :endpoint "https://kinesis.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kinesis", :region "us-west-2"},
    :ssl-common-name "kinesis.us-west-2.amazonaws.com",
    :endpoint "https://kinesis.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kinesis", :region "us-east-1"},
    :ssl-common-name "kinesis.us-east-1.amazonaws.com",
    :endpoint "https://kinesis.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "kinesis", :region "us-west-1"},
    :ssl-common-name "kinesis.us-west-1.amazonaws.com",
    :endpoint "https://kinesis.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "kinesis", :region "ap-south-1"},
    :ssl-common-name "kinesis.ap-south-1.amazonaws.com",
    :endpoint "https://kinesis.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "kinesis", :region "eu-north-1"},
    :ssl-common-name "kinesis.eu-north-1.amazonaws.com",
    :endpoint "https://kinesis.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-stream-name)

(clojure.core/declare ser-list-shards-input-limit)

(clojure.core/declare ser-put-records-request-entry-list)

(clojure.core/declare ser-consumer-name)

(clojure.core/declare ser-put-records-request-entry)

(clojure.core/declare ser-shard-id)

(clojure.core/declare ser-consumer-arn)

(clojure.core/declare ser-partition-key)

(clojure.core/declare ser-shard-iterator-type)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-key-id)

(clojure.core/declare ser-shard-iterator)

(clojure.core/declare ser-describe-stream-input-limit)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-list-streams-input-limit)

(clojure.core/declare ser-encryption-type)

(clojure.core/declare ser-sequence-number)

(clojure.core/declare ser-scaling-type)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-retention-period-hours)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-starting-position)

(clojure.core/declare ser-list-stream-consumers-input-limit)

(clojure.core/declare ser-tag-map)

(clojure.core/declare ser-hash-key)

(clojure.core/declare ser-data)

(clojure.core/declare ser-positive-integer-object)

(clojure.core/declare ser-metrics-name)

(clojure.core/declare ser-list-tags-for-stream-input-limit)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-stream-arn)

(clojure.core/declare ser-metrics-name-list)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-get-records-input-limit)

(clojure.core/defn- ser-stream-name [input] #:http.request.field{:value input, :shape "StreamName"})

(clojure.core/defn- ser-list-shards-input-limit [input] #:http.request.field{:value input, :shape "ListShardsInputLimit"})

(clojure.core/defn- ser-put-records-request-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-put-records-request-entry coll) #:http.request.field{:shape "PutRecordsRequestEntry"}))) input), :shape "PutRecordsRequestEntryList", :type "list", :max 500, :min 1})

(clojure.core/defn- ser-consumer-name [input] #:http.request.field{:value input, :shape "ConsumerName"})

(clojure.core/defn- ser-put-records-request-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-data (:data input)) #:http.request.field{:name "Data", :shape "Data"}) (clojure.core/into (ser-partition-key (:partition-key input)) #:http.request.field{:name "PartitionKey", :shape "PartitionKey"})], :shape "PutRecordsRequestEntry", :type "structure"} (clojure.core/contains? input :explicit-hash-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hash-key (input :explicit-hash-key)) #:http.request.field{:name "ExplicitHashKey", :shape "HashKey"}))))

(clojure.core/defn- ser-shard-id [input] #:http.request.field{:value input, :shape "ShardId"})

(clojure.core/defn- ser-consumer-arn [input] #:http.request.field{:value input, :shape "ConsumerARN"})

(clojure.core/defn- ser-partition-key [input] #:http.request.field{:value input, :shape "PartitionKey"})

(clojure.core/defn- ser-shard-iterator-type [input] #:http.request.field{:value (clojure.core/get {"LATEST" "LATEST", "TRIM_HORIZON" "TRIM_HORIZON", :at-timestamp "AT_TIMESTAMP", "AFTER_SEQUENCE_NUMBER" "AFTER_SEQUENCE_NUMBER", "AT_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER", "AT_TIMESTAMP" "AT_TIMESTAMP", :at-sequence-number "AT_SEQUENCE_NUMBER", :latest "LATEST", :trim-horizon "TRIM_HORIZON", :after-sequence-number "AFTER_SEQUENCE_NUMBER"} input), :shape "ShardIteratorType"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-key-id [input] #:http.request.field{:value input, :shape "KeyId"})

(clojure.core/defn- ser-shard-iterator [input] #:http.request.field{:value input, :shape "ShardIterator"})

(clojure.core/defn- ser-describe-stream-input-limit [input] #:http.request.field{:value input, :shape "DescribeStreamInputLimit"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-list-streams-input-limit [input] #:http.request.field{:value input, :shape "ListStreamsInputLimit"})

(clojure.core/defn- ser-encryption-type [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "KMS" "KMS", :kms "KMS"} input), :shape "EncryptionType"})

(clojure.core/defn- ser-sequence-number [input] #:http.request.field{:value input, :shape "SequenceNumber"})

(clojure.core/defn- ser-scaling-type [input] #:http.request.field{:value (clojure.core/get {"UNIFORM_SCALING" "UNIFORM_SCALING", :uniform-scaling "UNIFORM_SCALING"} input), :shape "ScalingType"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-retention-period-hours [input] #:http.request.field{:value input, :shape "RetentionPeriodHours"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-starting-position [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-shard-iterator-type (:type input)) #:http.request.field{:name "Type", :shape "ShardIteratorType"})], :shape "StartingPosition", :type "structure"} (clojure.core/contains? input :sequence-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sequence-number (input :sequence-number)) #:http.request.field{:name "SequenceNumber", :shape "SequenceNumber"})) (clojure.core/contains? input :timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :timestamp)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}))))

(clojure.core/defn- ser-list-stream-consumers-input-limit [input] #:http.request.field{:value input, :shape "ListStreamConsumersInputLimit"})

(clojure.core/defn- ser-tag-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "TagMap", :type "map", :max 50, :min 1})

(clojure.core/defn- ser-hash-key [input] #:http.request.field{:value input, :shape "HashKey"})

(clojure.core/defn- ser-data [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Data"})

(clojure.core/defn- ser-positive-integer-object [input] #:http.request.field{:value input, :shape "PositiveIntegerObject"})

(clojure.core/defn- ser-metrics-name [input] #:http.request.field{:value (clojure.core/get {"IncomingBytes" "IncomingBytes", "IteratorAgeMilliseconds" "IteratorAgeMilliseconds", "OutgoingRecords" "OutgoingRecords", :write-provisioned-throughput-exceeded "WriteProvisionedThroughputExceeded", :read-provisioned-throughput-exceeded "ReadProvisionedThroughputExceeded", :all "ALL", "OutgoingBytes" "OutgoingBytes", :outgoing-records "OutgoingRecords", :incoming-bytes "IncomingBytes", :outgoing-bytes "OutgoingBytes", "IncomingRecords" "IncomingRecords", "ReadProvisionedThroughputExceeded" "ReadProvisionedThroughputExceeded", :incoming-records "IncomingRecords", "ALL" "ALL", :iterator-age-milliseconds "IteratorAgeMilliseconds", "WriteProvisionedThroughputExceeded" "WriteProvisionedThroughputExceeded"} input), :shape "MetricsName"})

(clojure.core/defn- ser-list-tags-for-stream-input-limit [input] #:http.request.field{:value input, :shape "ListTagsForStreamInputLimit"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-stream-arn [input] #:http.request.field{:value input, :shape "StreamARN"})

(clojure.core/defn- ser-metrics-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metrics-name coll) #:http.request.field{:shape "MetricsName"}))) input), :shape "MetricsNameList", :type "list", :max 7, :min 1})

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-get-records-input-limit [input] #:http.request.field{:value input, :shape "GetRecordsInputLimit"})

(clojure.core/defn- req-remove-tags-from-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-get-shard-iterator-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-shard-id (input :shard-id)) #:http.request.field{:name "ShardId", :shape "ShardId"}) (clojure.core/into (ser-shard-iterator-type (input :shard-iterator-type)) #:http.request.field{:name "ShardIteratorType", :shape "ShardIteratorType"})]} (clojure.core/contains? input :starting-sequence-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sequence-number (input :starting-sequence-number)) #:http.request.field{:name "StartingSequenceNumber", :shape "SequenceNumber"})) (clojure.core/contains? input :timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :timestamp)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}))))

(clojure.core/defn- req-stop-stream-encryption-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-encryption-type (input :encryption-type)) #:http.request.field{:name "EncryptionType", :shape "EncryptionType"}) (clojure.core/into (ser-key-id (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyId"})]}))

(clojure.core/defn- req-add-tags-to-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagMap"})]}))

(clojure.core/defn- req-describe-limits-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-merge-shards-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-shard-id (input :shard-to-merge)) #:http.request.field{:name "ShardToMerge", :shape "ShardId"}) (clojure.core/into (ser-shard-id (input :adjacent-shard-to-merge)) #:http.request.field{:name "AdjacentShardToMerge", :shape "ShardId"})]}))

(clojure.core/defn- req-start-stream-encryption-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-encryption-type (input :encryption-type)) #:http.request.field{:name "EncryptionType", :shape "EncryptionType"}) (clojure.core/into (ser-key-id (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyId"})]}))

(clojure.core/defn- req-list-stream-consumers-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "StreamARN"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-stream-consumers-input-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListStreamConsumersInputLimit"})) (clojure.core/contains? input :stream-creation-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :stream-creation-timestamp)) #:http.request.field{:name "StreamCreationTimestamp", :shape "Timestamp"}))))

(clojure.core/defn- req-split-shard-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-shard-id (input :shard-to-split)) #:http.request.field{:name "ShardToSplit", :shape "ShardId"}) (clojure.core/into (ser-hash-key (input :new-starting-hash-key)) #:http.request.field{:name "NewStartingHashKey", :shape "HashKey"})]}))

(clojure.core/defn- req-describe-stream-consumer-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "StreamARN"})) (clojure.core/contains? input :consumer-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consumer-name (input :consumer-name)) #:http.request.field{:name "ConsumerName", :shape "ConsumerName"})) (clojure.core/contains? input :consumer-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consumer-arn (input :consumer-arn)) #:http.request.field{:name "ConsumerARN", :shape "ConsumerARN"}))))

(clojure.core/defn- req-disable-enhanced-monitoring-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-metrics-name-list (input :shard-level-metrics)) #:http.request.field{:name "ShardLevelMetrics", :shape "MetricsNameList"})]}))

(clojure.core/defn- req-create-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-positive-integer-object (input :shard-count)) #:http.request.field{:name "ShardCount", :shape "PositiveIntegerObject"})]}))

(clojure.core/defn- req-subscribe-to-shard-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-consumer-arn (input :consumer-arn)) #:http.request.field{:name "ConsumerARN", :shape "ConsumerARN"}) (clojure.core/into (ser-shard-id (input :shard-id)) #:http.request.field{:name "ShardId", :shape "ShardId"}) (clojure.core/into (ser-starting-position (input :starting-position)) #:http.request.field{:name "StartingPosition", :shape "StartingPosition"})]}))

(clojure.core/defn- req-register-stream-consumer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "StreamARN"}) (clojure.core/into (ser-consumer-name (input :consumer-name)) #:http.request.field{:name "ConsumerName", :shape "ConsumerName"})]}))

(clojure.core/defn- req-increase-stream-retention-period-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-retention-period-hours (input :retention-period-hours)) #:http.request.field{:name "RetentionPeriodHours", :shape "RetentionPeriodHours"})]}))

(clojure.core/defn- req-put-records-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-put-records-request-entry-list (input :records)) #:http.request.field{:name "Records", :shape "PutRecordsRequestEntryList"}) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]}))

(clojure.core/defn- req-update-shard-count-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-positive-integer-object (input :target-shard-count)) #:http.request.field{:name "TargetShardCount", :shape "PositiveIntegerObject"}) (clojure.core/into (ser-scaling-type (input :scaling-type)) #:http.request.field{:name "ScalingType", :shape "ScalingType"})]}))

(clojure.core/defn- req-enable-enhanced-monitoring-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-metrics-name-list (input :shard-level-metrics)) #:http.request.field{:name "ShardLevelMetrics", :shape "MetricsNameList"})]}))

(clojure.core/defn- req-get-records-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-shard-iterator (input :shard-iterator)) #:http.request.field{:name "ShardIterator", :shape "ShardIterator"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-records-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "GetRecordsInputLimit"}))))

(clojure.core/defn- req-list-tags-for-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]} (clojure.core/contains? input :exclusive-start-tag-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :exclusive-start-tag-key)) #:http.request.field{:name "ExclusiveStartTagKey", :shape "TagKey"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tags-for-stream-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListTagsForStreamInputLimit"}))))

(clojure.core/defn- req-decrease-stream-retention-period-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-retention-period-hours (input :retention-period-hours)) #:http.request.field{:name "RetentionPeriodHours", :shape "RetentionPeriodHours"})]}))

(clojure.core/defn- req-deregister-stream-consumer-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "StreamARN"})) (clojure.core/contains? input :consumer-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consumer-name (input :consumer-name)) #:http.request.field{:name "ConsumerName", :shape "ConsumerName"})) (clojure.core/contains? input :consumer-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consumer-arn (input :consumer-arn)) #:http.request.field{:name "ConsumerARN", :shape "ConsumerARN"}))))

(clojure.core/defn- req-list-streams-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-streams-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListStreamsInputLimit"})) (clojure.core/contains? input :exclusive-start-stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :exclusive-start-stream-name)) #:http.request.field{:name "ExclusiveStartStreamName", :shape "StreamName"}))))

(clojure.core/defn- req-delete-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]} (clojure.core/contains? input :enforce-consumer-deletion) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enforce-consumer-deletion)) #:http.request.field{:name "EnforceConsumerDeletion", :shape "BooleanObject"}))))

(clojure.core/defn- req-list-shards-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :exclusive-start-shard-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shard-id (input :exclusive-start-shard-id)) #:http.request.field{:name "ExclusiveStartShardId", :shape "ShardId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-shards-input-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListShardsInputLimit"})) (clojure.core/contains? input :stream-creation-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :stream-creation-timestamp)) #:http.request.field{:name "StreamCreationTimestamp", :shape "Timestamp"}))))

(clojure.core/defn- req-describe-stream-summary-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]}))

(clojure.core/defn- req-describe-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-stream-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "DescribeStreamInputLimit"})) (clojure.core/contains? input :exclusive-start-shard-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shard-id (input :exclusive-start-shard-id)) #:http.request.field{:name "ExclusiveStartShardId", :shape "ShardId"}))))

(clojure.core/defn- req-put-record-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-data (input :data)) #:http.request.field{:name "Data", :shape "Data"}) (clojure.core/into (ser-partition-key (input :partition-key)) #:http.request.field{:name "PartitionKey", :shape "PartitionKey"})]} (clojure.core/contains? input :explicit-hash-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hash-key (input :explicit-hash-key)) #:http.request.field{:name "ExplicitHashKey", :shape "HashKey"})) (clojure.core/contains? input :sequence-number-for-ordering) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sequence-number (input :sequence-number-for-ordering)) #:http.request.field{:name "SequenceNumberForOrdering", :shape "SequenceNumber"}))))

(clojure.core/declare deser-stream-description-summary)

(clojure.core/declare deser-stream-name)

(clojure.core/declare deser-consumer-status)

(clojure.core/declare deser-consumer-name)

(clojure.core/declare deser-shard-id)

(clojure.core/declare deser-consumer)

(clojure.core/declare deser-consumer-arn)

(clojure.core/declare deser-partition-key)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-put-records-result-entry-list)

(clojure.core/declare deser-kms-not-found-exception)

(clojure.core/declare deser-key-id)

(clojure.core/declare deser-kms-invalid-state-exception)

(clojure.core/declare deser-resource-in-use-exception)

(clojure.core/declare deser-shard-iterator)

(clojure.core/declare deser-kms-disabled-exception)

(clojure.core/declare deser-shard)

(clojure.core/declare deser-shard-list)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-encryption-type)

(clojure.core/declare deser-stream-description)

(clojure.core/declare deser-sequence-number)

(clojure.core/declare deser-put-records-result-entry)

(clojure.core/declare deser-kms-access-denied-exception)

(clojure.core/declare deser-internal-failure-exception)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-subscribe-to-shard-event)

(clojure.core/declare deser-retention-period-hours)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-resource-not-found-exception)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-hash-key-range)

(clojure.core/declare deser-stream-name-list)

(clojure.core/declare deser-stream-status)

(clojure.core/declare deser-enhanced-monitoring-list)

(clojure.core/declare deser-record)

(clojure.core/declare deser-record-list)

(clojure.core/declare deser-hash-key)

(clojure.core/declare deser-data)

(clojure.core/declare deser-kms-throttling-exception)

(clojure.core/declare deser-shard-count-object)

(clojure.core/declare deser-positive-integer-object)

(clojure.core/declare deser-metrics-name)

(clojure.core/declare deser-kms-opt-in-required)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-sequence-number-range)

(clojure.core/declare deser-stream-arn)

(clojure.core/declare deser-consumer-count-object)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-subscribe-to-shard-event-stream)

(clojure.core/declare deser-metrics-name-list)

(clojure.core/declare deser-consumer-description)

(clojure.core/declare deser-boolean-object)

(clojure.core/declare deser-consumer-list)

(clojure.core/declare deser-enhanced-metrics)

(clojure.core/declare deser-millis-behind-latest)

(clojure.core/defn- deser-stream-description-summary [input] (clojure.core/cond-> {:stream-name (deser-stream-name (input "StreamName")), :stream-arn (deser-stream-arn (input "StreamARN")), :stream-status (deser-stream-status (input "StreamStatus")), :retention-period-hours (deser-positive-integer-object (input "RetentionPeriodHours")), :stream-creation-timestamp (deser-timestamp (input "StreamCreationTimestamp")), :enhanced-monitoring (deser-enhanced-monitoring-list (input "EnhancedMonitoring")), :open-shard-count (deser-shard-count-object (input "OpenShardCount"))} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id (input "KeyId"))) (clojure.core/contains? input "EncryptionType") (clojure.core/assoc :encryption-type (deser-encryption-type (input "EncryptionType"))) (clojure.core/contains? input "ConsumerCount") (clojure.core/assoc :consumer-count (deser-consumer-count-object (input "ConsumerCount")))))

(clojure.core/defn- deser-stream-name [input] input)

(clojure.core/defn- deser-consumer-status [input] (clojure.core/get {"CREATING" :creating, "DELETING" :deleting, "ACTIVE" :active} input))

(clojure.core/defn- deser-consumer-name [input] input)

(clojure.core/defn- deser-shard-id [input] input)

(clojure.core/defn- deser-consumer [input] (clojure.core/cond-> {:consumer-name (deser-consumer-name (input "ConsumerName")), :consumer-arn (deser-consumer-arn (input "ConsumerARN")), :consumer-status (deser-consumer-status (input "ConsumerStatus")), :consumer-creation-timestamp (deser-timestamp (input "ConsumerCreationTimestamp"))}))

(clojure.core/defn- deser-consumer-arn [input] input)

(clojure.core/defn- deser-partition-key [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-put-records-result-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-put-records-result-entry coll))) input))

(clojure.core/defn- deser-kms-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-key-id [input] input)

(clojure.core/defn- deser-kms-invalid-state-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-resource-in-use-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-shard-iterator [input] input)

(clojure.core/defn- deser-kms-disabled-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-shard [input] (clojure.core/cond-> {:shard-id (deser-shard-id (input "ShardId")), :hash-key-range (deser-hash-key-range (input "HashKeyRange")), :sequence-number-range (deser-sequence-number-range (input "SequenceNumberRange"))} (clojure.core/contains? input "ParentShardId") (clojure.core/assoc :parent-shard-id (deser-shard-id (input "ParentShardId"))) (clojure.core/contains? input "AdjacentParentShardId") (clojure.core/assoc :adjacent-parent-shard-id (deser-shard-id (input "AdjacentParentShardId")))))

(clojure.core/defn- deser-shard-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-shard coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-encryption-type [input] (clojure.core/get {"NONE" :none, "KMS" :kms} input))

(clojure.core/defn- deser-stream-description [input] (clojure.core/cond-> {:stream-name (deser-stream-name (input "StreamName")), :stream-arn (deser-stream-arn (input "StreamARN")), :stream-status (deser-stream-status (input "StreamStatus")), :shards (deser-shard-list (input "Shards")), :has-more-shards (deser-boolean-object (input "HasMoreShards")), :retention-period-hours (deser-retention-period-hours (input "RetentionPeriodHours")), :stream-creation-timestamp (deser-timestamp (input "StreamCreationTimestamp")), :enhanced-monitoring (deser-enhanced-monitoring-list (input "EnhancedMonitoring"))} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id (input "KeyId"))) (clojure.core/contains? input "EncryptionType") (clojure.core/assoc :encryption-type (deser-encryption-type (input "EncryptionType")))))

(clojure.core/defn- deser-sequence-number [input] input)

(clojure.core/defn- deser-put-records-result-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "SequenceNumber") (clojure.core/assoc :sequence-number (deser-sequence-number (input "SequenceNumber"))) (clojure.core/contains? input "ShardId") (clojure.core/assoc :shard-id (deser-shard-id (input "ShardId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-kms-access-denied-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-internal-failure-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-subscribe-to-shard-event [input] (clojure.core/cond-> {:records (deser-record-list (input "Records")), :continuation-sequence-number (deser-sequence-number (input "ContinuationSequenceNumber")), :millis-behind-latest (deser-millis-behind-latest (input "MillisBehindLatest"))}))

(clojure.core/defn- deser-retention-period-hours [input] input)

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-resource-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-hash-key-range [input] (clojure.core/cond-> {:starting-hash-key (deser-hash-key (input "StartingHashKey")), :ending-hash-key (deser-hash-key (input "EndingHashKey"))}))

(clojure.core/defn- deser-stream-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stream-name coll))) input))

(clojure.core/defn- deser-stream-status [input] (clojure.core/get {"CREATING" :creating, "DELETING" :deleting, "ACTIVE" :active, "UPDATING" :updating} input))

(clojure.core/defn- deser-enhanced-monitoring-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-enhanced-metrics coll))) input))

(clojure.core/defn- deser-record [input] (clojure.core/cond-> {:sequence-number (deser-sequence-number (input "SequenceNumber")), :data (deser-data (input "Data")), :partition-key (deser-partition-key (input "PartitionKey"))} (clojure.core/contains? input "ApproximateArrivalTimestamp") (clojure.core/assoc :approximate-arrival-timestamp (deser-timestamp (input "ApproximateArrivalTimestamp"))) (clojure.core/contains? input "EncryptionType") (clojure.core/assoc :encryption-type (deser-encryption-type (input "EncryptionType")))))

(clojure.core/defn- deser-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record coll))) input))

(clojure.core/defn- deser-hash-key [input] input)

(clojure.core/defn- deser-data [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-kms-throttling-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-shard-count-object [input] input)

(clojure.core/defn- deser-positive-integer-object [input] input)

(clojure.core/defn- deser-metrics-name [input] (clojure.core/get {"IncomingBytes" :incoming-bytes, "IncomingRecords" :incoming-records, "OutgoingBytes" :outgoing-bytes, "OutgoingRecords" :outgoing-records, "WriteProvisionedThroughputExceeded" :write-provisioned-throughput-exceeded, "ReadProvisionedThroughputExceeded" :read-provisioned-throughput-exceeded, "IteratorAgeMilliseconds" :iterator-age-milliseconds, "ALL" :all} input))

(clojure.core/defn- deser-kms-opt-in-required [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-sequence-number-range [input] (clojure.core/cond-> {:starting-sequence-number (deser-sequence-number (input "StartingSequenceNumber"))} (clojure.core/contains? input "EndingSequenceNumber") (clojure.core/assoc :ending-sequence-number (deser-sequence-number (input "EndingSequenceNumber")))))

(clojure.core/defn- deser-stream-arn [input] input)

(clojure.core/defn- deser-consumer-count-object [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-subscribe-to-shard-event-stream [input] (clojure.core/cond-> {:subscribe-to-shard-event (deser-subscribe-to-shard-event (input "SubscribeToShardEvent"))} (clojure.core/contains? input "KMSNotFoundException") (clojure.core/assoc :kms-not-found-exception (deser-kms-not-found-exception (input "KMSNotFoundException"))) (clojure.core/contains? input "KMSInvalidStateException") (clojure.core/assoc :kms-invalid-state-exception (deser-kms-invalid-state-exception (input "KMSInvalidStateException"))) (clojure.core/contains? input "ResourceInUseException") (clojure.core/assoc :resource-in-use-exception (deser-resource-in-use-exception (input "ResourceInUseException"))) (clojure.core/contains? input "KMSDisabledException") (clojure.core/assoc :kms-disabled-exception (deser-kms-disabled-exception (input "KMSDisabledException"))) (clojure.core/contains? input "KMSAccessDeniedException") (clojure.core/assoc :kms-access-denied-exception (deser-kms-access-denied-exception (input "KMSAccessDeniedException"))) (clojure.core/contains? input "InternalFailureException") (clojure.core/assoc :internal-failure-exception (deser-internal-failure-exception (input "InternalFailureException"))) (clojure.core/contains? input "ResourceNotFoundException") (clojure.core/assoc :resource-not-found-exception (deser-resource-not-found-exception (input "ResourceNotFoundException"))) (clojure.core/contains? input "KMSThrottlingException") (clojure.core/assoc :kms-throttling-exception (deser-kms-throttling-exception (input "KMSThrottlingException"))) (clojure.core/contains? input "KMSOptInRequired") (clojure.core/assoc :kms-opt-in-required (deser-kms-opt-in-required (input "KMSOptInRequired")))))

(clojure.core/defn- deser-metrics-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metrics-name coll))) input))

(clojure.core/defn- deser-consumer-description [input] (clojure.core/cond-> {:consumer-name (deser-consumer-name (input "ConsumerName")), :consumer-arn (deser-consumer-arn (input "ConsumerARN")), :consumer-status (deser-consumer-status (input "ConsumerStatus")), :consumer-creation-timestamp (deser-timestamp (input "ConsumerCreationTimestamp")), :stream-arn (deser-stream-arn (input "StreamARN"))}))

(clojure.core/defn- deser-boolean-object [input] input)

(clojure.core/defn- deser-consumer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-consumer coll))) input))

(clojure.core/defn- deser-enhanced-metrics [input] (clojure.core/cond-> {} (clojure.core/contains? input "ShardLevelMetrics") (clojure.core/assoc :shard-level-metrics (deser-metrics-name-list (input "ShardLevelMetrics")))))

(clojure.core/defn- deser-millis-behind-latest [input] input)

(clojure.core/defn- response-describe-stream-consumer-output ([input] (response-describe-stream-consumer-output nil input)) ([resultWrapper1827940 input] (clojure.core/let [rawinput1827939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827941 {"ConsumerDescription" (rawinput1827939 "ConsumerDescription")}] (clojure.core/cond-> {:consumer-description (deser-consumer-description (clojure.core/get-in letvar1827941 ["ConsumerDescription"]))}))))

(clojure.core/defn- response-update-shard-count-output ([input] (response-update-shard-count-output nil input)) ([resultWrapper1827943 input] (clojure.core/let [rawinput1827942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827944 {"StreamName" (rawinput1827942 "StreamName"), "CurrentShardCount" (rawinput1827942 "CurrentShardCount"), "TargetShardCount" (rawinput1827942 "TargetShardCount")}] (clojure.core/cond-> {} (letvar1827944 "StreamName") (clojure.core/assoc :stream-name (deser-stream-name (clojure.core/get-in letvar1827944 ["StreamName"]))) (letvar1827944 "CurrentShardCount") (clojure.core/assoc :current-shard-count (deser-positive-integer-object (clojure.core/get-in letvar1827944 ["CurrentShardCount"]))) (letvar1827944 "TargetShardCount") (clojure.core/assoc :target-shard-count (deser-positive-integer-object (clojure.core/get-in letvar1827944 ["TargetShardCount"])))))))

(clojure.core/defn- response-list-stream-consumers-output ([input] (response-list-stream-consumers-output nil input)) ([resultWrapper1827946 input] (clojure.core/let [rawinput1827945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827947 {"Consumers" (rawinput1827945 "Consumers"), "NextToken" (rawinput1827945 "NextToken")}] (clojure.core/cond-> {} (letvar1827947 "Consumers") (clojure.core/assoc :consumers (deser-consumer-list (clojure.core/get-in letvar1827947 ["Consumers"]))) (letvar1827947 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1827947 ["NextToken"])))))))

(clojure.core/defn- response-enhanced-monitoring-output ([input] (response-enhanced-monitoring-output nil input)) ([resultWrapper1827949 input] (clojure.core/let [rawinput1827948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827950 {"StreamName" (rawinput1827948 "StreamName"), "CurrentShardLevelMetrics" (rawinput1827948 "CurrentShardLevelMetrics"), "DesiredShardLevelMetrics" (rawinput1827948 "DesiredShardLevelMetrics")}] (clojure.core/cond-> {} (letvar1827950 "StreamName") (clojure.core/assoc :stream-name (deser-stream-name (clojure.core/get-in letvar1827950 ["StreamName"]))) (letvar1827950 "CurrentShardLevelMetrics") (clojure.core/assoc :current-shard-level-metrics (deser-metrics-name-list (clojure.core/get-in letvar1827950 ["CurrentShardLevelMetrics"]))) (letvar1827950 "DesiredShardLevelMetrics") (clojure.core/assoc :desired-shard-level-metrics (deser-metrics-name-list (clojure.core/get-in letvar1827950 ["DesiredShardLevelMetrics"])))))))

(clojure.core/defn- response-describe-stream-summary-output ([input] (response-describe-stream-summary-output nil input)) ([resultWrapper1827952 input] (clojure.core/let [rawinput1827951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827953 {"StreamDescriptionSummary" (rawinput1827951 "StreamDescriptionSummary")}] (clojure.core/cond-> {:stream-description-summary (deser-stream-description-summary (clojure.core/get-in letvar1827953 ["StreamDescriptionSummary"]))}))))

(clojure.core/defn- response-list-tags-for-stream-output ([input] (response-list-tags-for-stream-output nil input)) ([resultWrapper1827955 input] (clojure.core/let [rawinput1827954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827956 {"Tags" (rawinput1827954 "Tags"), "HasMoreTags" (rawinput1827954 "HasMoreTags")}] (clojure.core/cond-> {:tags (deser-tag-list (clojure.core/get-in letvar1827956 ["Tags"])), :has-more-tags (deser-boolean-object (clojure.core/get-in letvar1827956 ["HasMoreTags"]))}))))

(clojure.core/defn- response-expired-next-token-exception ([input] (response-expired-next-token-exception nil input)) ([resultWrapper1827958 input] (clojure.core/let [rawinput1827957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827959 {"message" (rawinput1827957 "message")}] (clojure.core/cond-> {} (letvar1827959 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827959 ["message"])))))))

(clojure.core/defn- response-kms-not-found-exception ([input] (response-kms-not-found-exception nil input)) ([resultWrapper1827961 input] (clojure.core/let [rawinput1827960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827962 {"message" (rawinput1827960 "message")}] (clojure.core/cond-> {} (letvar1827962 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827962 ["message"])))))))

(clojure.core/defn- response-kms-invalid-state-exception ([input] (response-kms-invalid-state-exception nil input)) ([resultWrapper1827964 input] (clojure.core/let [rawinput1827963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827965 {"message" (rawinput1827963 "message")}] (clojure.core/cond-> {} (letvar1827965 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827965 ["message"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1827967 input] (clojure.core/let [rawinput1827966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827968 {"message" (rawinput1827966 "message")}] (clojure.core/cond-> {} (letvar1827968 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827968 ["message"])))))))

(clojure.core/defn- response-describe-stream-output ([input] (response-describe-stream-output nil input)) ([resultWrapper1827970 input] (clojure.core/let [rawinput1827969 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827971 {"StreamDescription" (rawinput1827969 "StreamDescription")}] (clojure.core/cond-> {:stream-description (deser-stream-description (clojure.core/get-in letvar1827971 ["StreamDescription"]))}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1827973 input] (clojure.core/let [rawinput1827972 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827974 {"message" (rawinput1827972 "message")}] (clojure.core/cond-> {} (letvar1827974 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827974 ["message"])))))))

(clojure.core/defn- response-put-records-output ([input] (response-put-records-output nil input)) ([resultWrapper1827976 input] (clojure.core/let [rawinput1827975 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827977 {"FailedRecordCount" (rawinput1827975 "FailedRecordCount"), "Records" (rawinput1827975 "Records"), "EncryptionType" (rawinput1827975 "EncryptionType")}] (clojure.core/cond-> {:records (deser-put-records-result-entry-list (clojure.core/get-in letvar1827977 ["Records"]))} (letvar1827977 "FailedRecordCount") (clojure.core/assoc :failed-record-count (deser-positive-integer-object (clojure.core/get-in letvar1827977 ["FailedRecordCount"]))) (letvar1827977 "EncryptionType") (clojure.core/assoc :encryption-type (deser-encryption-type (clojure.core/get-in letvar1827977 ["EncryptionType"])))))))

(clojure.core/defn- response-subscribe-to-shard-output ([input] (response-subscribe-to-shard-output nil input)) ([resultWrapper1827979 input] (clojure.core/let [rawinput1827978 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827980 {"EventStream" (rawinput1827978 "EventStream")}] (clojure.core/cond-> {:event-stream (deser-subscribe-to-shard-event-stream (clojure.core/get-in letvar1827980 ["EventStream"]))}))))

(clojure.core/defn- response-expired-iterator-exception ([input] (response-expired-iterator-exception nil input)) ([resultWrapper1827982 input] (clojure.core/let [rawinput1827981 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827983 {"message" (rawinput1827981 "message")}] (clojure.core/cond-> {} (letvar1827983 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827983 ["message"])))))))

(clojure.core/defn- response-kms-disabled-exception ([input] (response-kms-disabled-exception nil input)) ([resultWrapper1827985 input] (clojure.core/let [rawinput1827984 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827986 {"message" (rawinput1827984 "message")}] (clojure.core/cond-> {} (letvar1827986 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827986 ["message"])))))))

(clojure.core/defn- response-describe-limits-output ([input] (response-describe-limits-output nil input)) ([resultWrapper1827988 input] (clojure.core/let [rawinput1827987 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827989 {"ShardLimit" (rawinput1827987 "ShardLimit"), "OpenShardCount" (rawinput1827987 "OpenShardCount")}] (clojure.core/cond-> {:shard-limit (deser-shard-count-object (clojure.core/get-in letvar1827989 ["ShardLimit"])), :open-shard-count (deser-shard-count-object (clojure.core/get-in letvar1827989 ["OpenShardCount"]))}))))

(clojure.core/defn- response-get-records-output ([input] (response-get-records-output nil input)) ([resultWrapper1827991 input] (clojure.core/let [rawinput1827990 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827992 {"Records" (rawinput1827990 "Records"), "NextShardIterator" (rawinput1827990 "NextShardIterator"), "MillisBehindLatest" (rawinput1827990 "MillisBehindLatest")}] (clojure.core/cond-> {:records (deser-record-list (clojure.core/get-in letvar1827992 ["Records"]))} (letvar1827992 "NextShardIterator") (clojure.core/assoc :next-shard-iterator (deser-shard-iterator (clojure.core/get-in letvar1827992 ["NextShardIterator"]))) (letvar1827992 "MillisBehindLatest") (clojure.core/assoc :millis-behind-latest (deser-millis-behind-latest (clojure.core/get-in letvar1827992 ["MillisBehindLatest"])))))))

(clojure.core/defn- response-kms-access-denied-exception ([input] (response-kms-access-denied-exception nil input)) ([resultWrapper1827994 input] (clojure.core/let [rawinput1827993 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827995 {"message" (rawinput1827993 "message")}] (clojure.core/cond-> {} (letvar1827995 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827995 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1827997 input] (clojure.core/let [rawinput1827996 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1827998 {"message" (rawinput1827996 "message")}] (clojure.core/cond-> {} (letvar1827998 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1827998 ["message"])))))))

(clojure.core/defn- response-list-streams-output ([input] (response-list-streams-output nil input)) ([resultWrapper1828000 input] (clojure.core/let [rawinput1827999 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828001 {"StreamNames" (rawinput1827999 "StreamNames"), "HasMoreStreams" (rawinput1827999 "HasMoreStreams")}] (clojure.core/cond-> {:stream-names (deser-stream-name-list (clojure.core/get-in letvar1828001 ["StreamNames"])), :has-more-streams (deser-boolean-object (clojure.core/get-in letvar1828001 ["HasMoreStreams"]))}))))

(clojure.core/defn- response-list-shards-output ([input] (response-list-shards-output nil input)) ([resultWrapper1828003 input] (clojure.core/let [rawinput1828002 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828004 {"Shards" (rawinput1828002 "Shards"), "NextToken" (rawinput1828002 "NextToken")}] (clojure.core/cond-> {} (letvar1828004 "Shards") (clojure.core/assoc :shards (deser-shard-list (clojure.core/get-in letvar1828004 ["Shards"]))) (letvar1828004 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1828004 ["NextToken"])))))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper1828006 input] (clojure.core/let [rawinput1828005 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828007 {"message" (rawinput1828005 "message")}] (clojure.core/cond-> {} (letvar1828007 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1828007 ["message"])))))))

(clojure.core/defn- response-kms-throttling-exception ([input] (response-kms-throttling-exception nil input)) ([resultWrapper1828009 input] (clojure.core/let [rawinput1828008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828010 {"message" (rawinput1828008 "message")}] (clojure.core/cond-> {} (letvar1828010 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1828010 ["message"])))))))

(clojure.core/defn- response-get-shard-iterator-output ([input] (response-get-shard-iterator-output nil input)) ([resultWrapper1828012 input] (clojure.core/let [rawinput1828011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828013 {"ShardIterator" (rawinput1828011 "ShardIterator")}] (clojure.core/cond-> {} (letvar1828013 "ShardIterator") (clojure.core/assoc :shard-iterator (deser-shard-iterator (clojure.core/get-in letvar1828013 ["ShardIterator"])))))))

(clojure.core/defn- response-register-stream-consumer-output ([input] (response-register-stream-consumer-output nil input)) ([resultWrapper1828015 input] (clojure.core/let [rawinput1828014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828016 {"Consumer" (rawinput1828014 "Consumer")}] (clojure.core/cond-> {:consumer (deser-consumer (clojure.core/get-in letvar1828016 ["Consumer"]))}))))

(clojure.core/defn- response-put-record-output ([input] (response-put-record-output nil input)) ([resultWrapper1828018 input] (clojure.core/let [rawinput1828017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828019 {"ShardId" (rawinput1828017 "ShardId"), "SequenceNumber" (rawinput1828017 "SequenceNumber"), "EncryptionType" (rawinput1828017 "EncryptionType")}] (clojure.core/cond-> {:shard-id (deser-shard-id (clojure.core/get-in letvar1828019 ["ShardId"])), :sequence-number (deser-sequence-number (clojure.core/get-in letvar1828019 ["SequenceNumber"]))} (letvar1828019 "EncryptionType") (clojure.core/assoc :encryption-type (deser-encryption-type (clojure.core/get-in letvar1828019 ["EncryptionType"])))))))

(clojure.core/defn- response-kms-opt-in-required ([input] (response-kms-opt-in-required nil input)) ([resultWrapper1828021 input] (clojure.core/let [rawinput1828020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828022 {"message" (rawinput1828020 "message")}] (clojure.core/cond-> {} (letvar1828022 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1828022 ["message"])))))))

(clojure.core/defn- response-provisioned-throughput-exceeded-exception ([input] (response-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper1828024 input] (clojure.core/let [rawinput1828023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1828025 {"message" (rawinput1828023 "message")}] (clojure.core/cond-> {} (letvar1828025 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1828025 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description-summary/open-shard-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-count-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description-summary/stream-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description-summary/enhanced-monitoring (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description-summary/retention-period-hours (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description-summary/consumer-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/consumer-count-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-description-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/stream-arn :portkey.aws.kinesis.-2013-12-02/stream-status :portkey.aws.kinesis.-2013-12-02.stream-description-summary/retention-period-hours :portkey.aws.kinesis.-2013-12-02.stream-description-summary/stream-creation-timestamp :portkey.aws.kinesis.-2013-12-02.stream-description-summary/enhanced-monitoring :portkey.aws.kinesis.-2013-12-02.stream-description-summary/open-shard-count] :opt-un [:portkey.aws.kinesis.-2013-12-02/key-id :portkey.aws.kinesis.-2013-12-02/encryption-type :portkey.aws.kinesis.-2013-12-02.stream-description-summary/consumer-count]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.remove-tags-from-stream-input/tag-keys (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/remove-tags-from-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.remove-tags-from-stream-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/consumer-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.update-shard-count-output/current-shard-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.update-shard-count-output/target-shard-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/update-shard-count-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.update-shard-count-output/current-shard-count :portkey.aws.kinesis.-2013-12-02.update-shard-count-output/target-shard-count]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-output/consumers (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/consumer-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.list-stream-consumers-output/consumers :portkey.aws.kinesis.-2013-12-02/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.get-shard-iterator-input/starting-sequence-number (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/sequence-number))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/shard-id :portkey.aws.kinesis.-2013-12-02/shard-iterator-type] :opt-un [:portkey.aws.kinesis.-2013-12-02.get-shard-iterator-input/starting-sequence-number :portkey.aws.kinesis.-2013-12-02/timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-shards-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.enhanced-monitoring-output/current-shard-level-metrics (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/metrics-name-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.enhanced-monitoring-output/desired-shard-level-metrics (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/metrics-name-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.enhanced-monitoring-output/current-shard-level-metrics :portkey.aws.kinesis.-2013-12-02.enhanced-monitoring-output/desired-shard-level-metrics]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stop-stream-encryption-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/encryption-type :portkey.aws.kinesis.-2013-12-02/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.add-tags-to-stream-input/tags (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/tag-map))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/add-tags-to-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.add-tags-to-stream-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/put-records-request-entry :min-count 1 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-description-summary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-output/tags (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/tag-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-output/has-more-tags (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-output/tags :portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-output/has-more-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.merge-shards-input/shard-to-merge (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-id))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.merge-shards-input/adjacent-shard-to-merge (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-id))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/merge-shards-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.merge-shards-input/shard-to-merge :portkey.aws.kinesis.-2013-12-02.merge-shards-input/adjacent-shard-to-merge] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.put-records-request-entry/explicit-hash-key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/hash-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/data :portkey.aws.kinesis.-2013-12-02/partition-key] :opt-un [:portkey.aws.kinesis.-2013-12-02.put-records-request-entry/explicit-hash-key]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.expired-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/expired-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.expired-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.consumer/consumer-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/consumer-name :portkey.aws.kinesis.-2013-12-02/consumer-arn :portkey.aws.kinesis.-2013-12-02/consumer-status :portkey.aws.kinesis.-2013-12-02.consumer/consumer-creation-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^(arn):aws.*:kinesis:.*:\d{12}:.*stream\/[a-zA-Z0-9_.-]+\/consumer\/[a-zA-Z0-9_.-]+:[0-9]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/start-stream-encryption-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/encryption-type :portkey.aws.kinesis.-2013-12-02/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/partition-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/stream-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-arn] :opt-un [:portkey.aws.kinesis.-2013-12-02/next-token :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/max-results :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/stream-creation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-iterator-type #{"LATEST" "TRIM_HORIZON" :at-timestamp "AFTER_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER" "AT_TIMESTAMP" :at-sequence-number :latest :trim-horizon :after-sequence-number})

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/put-records-result-entry :min-count 1 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.kms-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.kms-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.kms-invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.kms-invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-stream-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.put-records-output/failed-record-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.put-records-output/records (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/put-records-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.put-records-output/records] :opt-un [:portkey.aws.kinesis.-2013-12-02.put-records-output/failed-record-count :portkey.aws.kinesis.-2013-12-02/encryption-type]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.subscribe-to-shard-output/event-stream (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-event-stream))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.subscribe-to-shard-output/event-stream] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-iterator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.split-shard-input/shard-to-split (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-id))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.split-shard-input/new-starting-hash-key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/hash-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/split-shard-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.split-shard-input/shard-to-split :portkey.aws.kinesis.-2013-12-02.split-shard-input/new-starting-hash-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-stream-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.expired-iterator-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/expired-iterator-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.expired-iterator-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02/stream-arn :portkey.aws.kinesis.-2013-12-02/consumer-name :portkey.aws.kinesis.-2013-12-02/consumer-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.kms-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.kms-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.shard/parent-shard-id (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-id))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.shard/adjacent-parent-shard-id (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-id))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/shard-id :portkey.aws.kinesis.-2013-12-02/hash-key-range :portkey.aws.kinesis.-2013-12-02/sequence-number-range] :opt-un [:portkey.aws.kinesis.-2013-12-02.shard/parent-shard-id :portkey.aws.kinesis.-2013-12-02.shard/adjacent-parent-shard-id]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/shard))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.disable-enhanced-monitoring-input/shard-level-metrics (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/metrics-name-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/disable-enhanced-monitoring-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.disable-enhanced-monitoring-input/shard-level-metrics] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1048576))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.describe-limits-output/shard-limit (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-count-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.describe-limits-output/open-shard-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-count-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-limits-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.describe-limits-output/shard-limit :portkey.aws.kinesis.-2013-12-02.describe-limits-output/open-shard-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.create-stream-input/shard-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/create-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.create-stream-input/shard-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-streams-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/encryption-type #{"KMS" "NONE" :kms :none})

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description/shards (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description/stream-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description/enhanced-monitoring (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.stream-description/has-more-shards (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/stream-arn :portkey.aws.kinesis.-2013-12-02/stream-status :portkey.aws.kinesis.-2013-12-02.stream-description/shards :portkey.aws.kinesis.-2013-12-02.stream-description/has-more-shards :portkey.aws.kinesis.-2013-12-02/retention-period-hours :portkey.aws.kinesis.-2013-12-02.stream-description/stream-creation-timestamp :portkey.aws.kinesis.-2013-12-02.stream-description/enhanced-monitoring] :opt-un [:portkey.aws.kinesis.-2013-12-02/key-id :portkey.aws.kinesis.-2013-12-02/encryption-type]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/sequence-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"0|([1-9]\d{0,128})" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-result-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02/sequence-number :portkey.aws.kinesis.-2013-12-02/shard-id :portkey.aws.kinesis.-2013-12-02/error-code :portkey.aws.kinesis.-2013-12-02/error-message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.get-records-output/records (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/record-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.get-records-output/next-shard-iterator (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-iterator))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/get-records-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.get-records-output/records] :opt-un [:portkey.aws.kinesis.-2013-12-02.get-records-output/next-shard-iterator :portkey.aws.kinesis.-2013-12-02/millis-behind-latest]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.kms-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.kms-access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/tag :min-count 0))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/scaling-type #{"UNIFORM_SCALING" :uniform-scaling})

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/consumer-arn :portkey.aws.kinesis.-2013-12-02/shard-id :portkey.aws.kinesis.-2013-12-02/starting-position] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.subscribe-to-shard-event/records (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/record-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.subscribe-to-shard-event/continuation-sequence-number (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/sequence-number))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-event (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.subscribe-to-shard-event/records :portkey.aws.kinesis.-2013-12-02.subscribe-to-shard-event/continuation-sequence-number :portkey.aws.kinesis.-2013-12-02/millis-behind-latest] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-arn :portkey.aws.kinesis.-2013-12-02/consumer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/retention-period-hours (clojure.spec.alpha/int-in 1 168))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-streams-output/stream-names (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/stream-name-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-streams-output/has-more-streams (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-streams-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.list-streams-output/stream-names :portkey.aws.kinesis.-2013-12-02.list-streams-output/has-more-streams] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.hash-key-range/starting-hash-key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/hash-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.hash-key-range/ending-hash-key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/hash-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/hash-key-range (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.hash-key-range/starting-hash-key :portkey.aws.kinesis.-2013-12-02.hash-key-range/ending-hash-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.starting-position/type (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-iterator-type))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/starting-position (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.starting-position/type] :opt-un [:portkey.aws.kinesis.-2013-12-02/sequence-number :portkey.aws.kinesis.-2013-12-02/timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-name-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/stream-name))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/increase-stream-retention-period-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/retention-period-hours] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-shards-output/shards (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-shards-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.list-shards-output/shards :portkey.aws.kinesis.-2013-12-02/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-status #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag-map (clojure.spec.alpha/map-of :portkey.aws.kinesis.-2013-12-02/tag-key :portkey.aws.kinesis.-2013-12-02/tag-value))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.put-records-input/records (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/put-records-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.put-records-input/records :portkey.aws.kinesis.-2013-12-02/stream-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.update-shard-count-input/target-shard-count (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/update-shard-count-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.update-shard-count-input/target-shard-count :portkey.aws.kinesis.-2013-12-02/scaling-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/enhanced-metrics))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.record/approximate-arrival-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/record (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/sequence-number :portkey.aws.kinesis.-2013-12-02/data :portkey.aws.kinesis.-2013-12-02/partition-key] :opt-un [:portkey.aws.kinesis.-2013-12-02.record/approximate-arrival-timestamp :portkey.aws.kinesis.-2013-12-02/encryption-type]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/record-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/record))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/hash-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"0|([1-9]\d{0,38})" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.enable-enhanced-monitoring-input/shard-level-metrics (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/metrics-name-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/enable-enhanced-monitoring-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02.enable-enhanced-monitoring-input/shard-level-metrics] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.kms-throttling-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.kms-throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02/shard-iterator]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-count-object (clojure.spec.alpha/int-in 0 1000000))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/positive-integer-object (clojure.spec.alpha/int-in 1 100000))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.get-records-input/limit (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/get-records-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/get-records-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/shard-iterator] :opt-un [:portkey.aws.kinesis.-2013-12-02.get-records-input/limit]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/metrics-name #{"IncomingBytes" "IteratorAgeMilliseconds" "OutgoingRecords" :write-provisioned-throughput-exceeded :read-provisioned-throughput-exceeded :all "OutgoingBytes" :outgoing-records :incoming-bytes :outgoing-bytes "IncomingRecords" "ReadProvisionedThroughputExceeded" :incoming-records "ALL" :iterator-age-milliseconds "WriteProvisionedThroughputExceeded"})

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/consumer] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-input/exclusive-start-tag-key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/tag-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-input/limit (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name] :opt-un [:portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-input/exclusive-start-tag-key :portkey.aws.kinesis.-2013-12-02.list-tags-for-stream-input/limit]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-input-limit (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-record-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/shard-id :portkey.aws.kinesis.-2013-12-02/sequence-number] :opt-un [:portkey.aws.kinesis.-2013-12-02/encryption-type]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.kms-opt-in-required/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.kms-opt-in-required/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.sequence-number-range/starting-sequence-number (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/sequence-number))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.sequence-number-range/ending-sequence-number (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/sequence-number))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/sequence-number-range (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.sequence-number-range/starting-sequence-number] :opt-un [:portkey.aws.kinesis.-2013-12-02.sequence-number-range/ending-sequence-number]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws.*:kinesis:.*:\d{12}:stream/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/decrease-stream-retention-period-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/retention-period-hours] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-count-object (clojure.spec.alpha/int-in 0 1000000))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/deregister-stream-consumer-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02/stream-arn :portkey.aws.kinesis.-2013-12-02/consumer-name :portkey.aws.kinesis.-2013-12-02/consumer-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.tag/key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/tag-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.tag/value (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/tag-value))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02.tag/key] :opt-un [:portkey.aws.kinesis.-2013-12-02.tag/value]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-streams-input/limit (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-streams-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-streams-input/exclusive-start-stream-name (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-streams-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.list-streams-input/limit :portkey.aws.kinesis.-2013-12-02.list-streams-input/exclusive-start-stream-name]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-event-stream (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-event] :opt-un [:portkey.aws.kinesis.-2013-12-02/kms-not-found-exception :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception :portkey.aws.kinesis.-2013-12-02/internal-failure-exception :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.delete-stream-input/enforce-consumer-deletion (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/delete-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name] :opt-un [:portkey.aws.kinesis.-2013-12-02.delete-stream-input/enforce-consumer-deletion]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/metrics-name-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/metrics-name :min-count 1 :max-count 7))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-shards-input/exclusive-start-shard-id (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-id))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-shards-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-shards-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-shards-input/stream-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-shards-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/next-token :portkey.aws.kinesis.-2013-12-02.list-shards-input/exclusive-start-shard-id :portkey.aws.kinesis.-2013-12-02.list-shards-input/max-results :portkey.aws.kinesis.-2013-12-02.list-shards-input/stream-creation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.consumer-description/consumer-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/consumer-name :portkey.aws.kinesis.-2013-12-02/consumer-arn :portkey.aws.kinesis.-2013-12-02/consumer-status :portkey.aws.kinesis.-2013-12-02.consumer-description/consumer-creation-timestamp :portkey.aws.kinesis.-2013-12-02/stream-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/consumer))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.enhanced-metrics/shard-level-metrics (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/metrics-name-list))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/enhanced-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.enhanced-metrics/shard-level-metrics]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.describe-stream-input/limit (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-stream-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.describe-stream-input/exclusive-start-shard-id (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/shard-id))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/describe-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name] :opt-un [:portkey.aws.kinesis.-2013-12-02.describe-stream-input/limit :portkey.aws.kinesis.-2013-12-02.describe-stream-input/exclusive-start-shard-id]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.put-record-input/explicit-hash-key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/hash-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.put-record-input/sequence-number-for-ordering (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/sequence-number))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-record-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/data :portkey.aws.kinesis.-2013-12-02/partition-key] :opt-un [:portkey.aws.kinesis.-2013-12-02.put-record-input/explicit-hash-key :portkey.aws.kinesis.-2013-12-02.put-record-input/sequence-number-for-ordering]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/millis-behind-latest clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.provisioned-throughput-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/get-records-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.core/defn list-stream-consumers "Lists the consumers registered to receive data from a stream using enhanced\nfan-out, and provides information about each consumer.\n This operation has a limit of 10 transactions per second per account." ([list-stream-consumers-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-stream-consumers-input list-stream-consumers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamConsumers", :http.request.configuration/output-deser-fn response-list-stream-consumers-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ExpiredNextTokenException" :portkey.aws.kinesis.-2013-12-02/expired-next-token-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef list-stream-consumers :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-output))

(clojure.core/defn increase-stream-retention-period "Increases the Kinesis data stream's retention period, which is the length of\ntime data records are accessible after they are added to the stream. The maximum\nvalue of a stream's retention period is 168 hours (7 days).\n If you choose a longer stream retention period, this operation increases the\ntime period during which records that have not yet expired are accessible.\nHowever, it does not make previous, expired data (older than the stream's\nprevious retention period) accessible after the operation has been called. For\nexample, if a stream's retention period is set to 24 hours and is increased to\n168 hours, any data that is older than 24 hours remains inaccessible to consumer\napplications." ([increase-stream-retention-period-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-increase-stream-retention-period-input increase-stream-retention-period-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/increase-stream-retention-period-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "IncreaseStreamRetentionPeriod", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef increase-stream-retention-period :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/increase-stream-retention-period-input) :ret clojure.core/true?)

(clojure.core/defn delete-stream "Deletes a Kinesis data stream and all its shards and data. You must shut down\nany applications that are operating on the stream before you delete the stream.\nIf an application attempts to operate on a deleted stream, it receives the\nexception ResourceNotFoundException.\n If the stream is in the ACTIVE state, you can delete it. After a DeleteStream\nrequest, the specified stream is in the DELETING state until Kinesis Data\nStreams completes the deletion.\n Note: Kinesis Data Streams might continue to accept data read and write\noperations, such as PutRecord, PutRecords, and GetRecords, on a stream in the\nDELETING state until the stream deletion is complete.\n When you delete a stream, any shards in that stream are also deleted, and any\ntags are dissociated from the stream.\n You can use the DescribeStream operation to check the state of the stream,\nwhich is returned in StreamStatus.\n DeleteStream has a limit of five transactions per second per account." ([delete-stream-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-stream-input delete-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/delete-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStream", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/delete-stream-input) :ret clojure.core/true?)

(clojure.core/defn stop-stream-encryption "Disables server-side encryption for a specified stream.\n Stopping encryption is an asynchronous operation. Upon receiving the request,\nKinesis Data Streams returns immediately and sets the status of the stream to\nUPDATING. After the update is complete, Kinesis Data Streams sets the status of\nthe stream back to ACTIVE. Stopping encryption normally takes a few seconds to\ncomplete, but it can take minutes. You can continue to read and write data to\nyour stream while its status is UPDATING. Once the status of the stream is\nACTIVE, records written to the stream are no longer encrypted by Kinesis Data\nStreams.\n API Limits: You can successfully disable server-side encryption 25 times in a\nrolling 24-hour period.\n Note: It can take up to 5 seconds after the stream is in an ACTIVE status\nbefore all records written to the stream are no longer subject to encryption.\nAfter you disabled encryption, you can verify that encryption is not applied by\ninspecting the API response from PutRecord or PutRecords." ([stop-stream-encryption-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-stream-encryption-input stop-stream-encryption-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/stop-stream-encryption-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopStreamEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-stream-encryption :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/stop-stream-encryption-input) :ret clojure.core/true?)

(clojure.core/defn describe-limits "Describes the shard limits and usage for the account.\n If you update your account limits, the old limits might be returned for a few\nminutes.\n This operation has a limit of one transaction per second per account." ([] (describe-limits {})) ([describe-limits-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-limits-input describe-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-limits-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLimits", :http.request.configuration/output-deser-fn response-describe-limits-output, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-limits :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/describe-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-limits-output))

(clojure.core/defn remove-tags-from-stream "Removes tags from the specified Kinesis data stream. Removed tags are deleted\nand cannot be recovered after this operation successfully completes.\n If you specify a tag that does not exist, it is ignored.\n RemoveTagsFromStream has a limit of five transactions per second per account." ([remove-tags-from-stream-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-remove-tags-from-stream-input remove-tags-from-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/remove-tags-from-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTagsFromStream", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/remove-tags-from-stream-input) :ret clojure.core/true?)

(clojure.core/defn register-stream-consumer "Registers a consumer with a Kinesis data stream. When you use this operation,\nthe consumer you register can read data from the stream at a rate of up to 2 MiB\nper second. This rate is unaffected by the total number of consumers that read\nfrom the same stream.\n You can register up to 5 consumers per stream. A given consumer can only be\nregistered with one stream.\n This operation has a limit of five transactions per second per account." ([register-stream-consumer-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-register-stream-consumer-input register-stream-consumer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterStreamConsumer", :http.request.configuration/output-deser-fn response-register-stream-consumer-output, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-stream-consumer :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-output))

(clojure.core/defn describe-stream-consumer "To get the description of a registered consumer, provide the ARN of the\nconsumer. Alternatively, you can provide the ARN of the data stream and the name\nyou gave the consumer when you registered it. You may also provide all three\nparameters, as long as they don't conflict with each other. If you don't know\nthe name or ARN of the consumer that you want to describe, you can use the\nListStreamConsumers operation to get a list of the descriptions of all the\nconsumers that are currently registered with a given data stream.\n This operation has a limit of 20 transactions per second per account." ([] (describe-stream-consumer {})) ([describe-stream-consumer-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-stream-consumer-input describe-stream-consumer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStreamConsumer", :http.request.configuration/output-deser-fn response-describe-stream-consumer-output, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef describe-stream-consumer :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-output))

(clojure.core/defn subscribe-to-shard "Call this operation from your consumer after you call RegisterStreamConsumer to\nregister the consumer with Kinesis Data Streams. If the call succeeds, your\nconsumer starts receiving events of type SubscribeToShardEvent for up to 5\nminutes, after which time you need to call SubscribeToShard again to renew the\nsubscription if you want to continue to receive records.\n You can make one call to SubscribeToShard per second per ConsumerARN. If your\ncall succeeds, and then you call the operation again less than 5 seconds later,\nthe second call generates a ResourceInUseException. If you call the operation a\nsecond time more than 5 seconds after the first call succeeds, the second call\nsucceeds and the first connection gets shut down." ([subscribe-to-shard-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-subscribe-to-shard-input subscribe-to-shard-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SubscribeToShard", :http.request.configuration/output-deser-fn response-subscribe-to-shard-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef subscribe-to-shard :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-output))

(clojure.core/defn list-streams "Lists your Kinesis data streams.\n The number of streams may be too large to return from a single call to\nListStreams. You can limit the number of returned streams using the Limit\nparameter. If you do not specify a value for the Limit parameter, Kinesis Data\nStreams uses the default limit, which is currently 10.\n You can detect if there are more streams available to list by using the\nHasMoreStreams flag from the returned output. If there are more streams\navailable, you can request more streams by using the name of the last stream\nreturned by the ListStreams request in the ExclusiveStartStreamName parameter in\na subsequent request to ListStreams. The group of stream names returned by the\nsubsequent request is then added to the list. You can continue this process\nuntil all the stream names have been collected in the list.\n ListStreams has a limit of five transactions per second per account." ([] (list-streams {})) ([list-streams-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-streams-input list-streams-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-streams-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-streams-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreams", :http.request.configuration/output-deser-fn response-list-streams-output, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-streams-output))

(clojure.core/defn put-records "Writes multiple data records into a Kinesis data stream in a single call (also\nreferred to as a PutRecords request). Use this operation to send data into the\nstream for data ingestion and processing.\n Each PutRecords request can support up to 500 records. Each record in the\nrequest can be as large as 1 MB, up to a limit of 5 MB for the entire request,\nincluding partition keys. Each shard can support writes up to 1,000 records per\nsecond, up to a maximum data write total of 1 MB per second.\n You must specify the name of the stream that captures, stores, and transports\nthe data; and an array of request Records, with each record in the array\nrequiring a partition key and data blob. The record size limit applies to the\ntotal size of the partition key and data blob.\n The data blob can be any type of data; for example, a segment from a log file,\ngeographic/location data, website clickstream data, and so on.\n The partition key is used by Kinesis Data Streams as input to a hash function\nthat maps the partition key and associated data to a specific shard. An MD5 hash\nfunction is used to map partition keys to 128-bit integer values and to map\nassociated data records to shards. As a result of this hashing mechanism, all\ndata records with the same partition key map to the same shard within the\nstream. For more information, see Adding Data to a Stream\n(http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream)\nin the Amazon Kinesis Data Streams Developer Guide.\n Each record in the Records array may include an optional parameter,\nExplicitHashKey, which overrides the partition key to shard mapping. This\nparameter allows a data producer to determine explicitly the shard where the\nrecord is stored. For more information, see Adding Multiple Records with\nPutRecords\n(http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-putrecords)\nin the Amazon Kinesis Data Streams Developer Guide.\n The PutRecords response includes an array of response Records. Each record in\nthe response array directly correlates with a record in the request array using\nnatural ordering, from the top to the bottom of the request and response. The\nresponse Records array always includes the same number of records as the request\narray.\n The response Records array includes both successfully and unsuccessfully\nprocessed records. Kinesis Data Streams attempts to process all records in each\nPutRecords request. A single record failure does not stop the processing of\nsubsequent records.\n A successfully processed record includes ShardId and SequenceNumber values. The\nShardId parameter identifies the shard in the stream where the record is stored.\nThe SequenceNumber parameter is an identifier assigned to the put record, unique\nto all records in the stream.\n An unsuccessfully processed record includes ErrorCode and ErrorMessage values.\nErrorCode reflects the type of error and can be one of the following values:\nProvisionedThroughputExceededException or InternalFailure. ErrorMessage provides\nmore detailed information about the ProvisionedThroughputExceededException\nexception including the account ID, stream name, and shard ID of the record that\nwas throttled. For more information about partially successful responses, see\nAdding Multiple Records with PutRecords\n(http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-add-data-to-stream.html#kinesis-using-sdk-java-putrecords)\nin the Amazon Kinesis Data Streams Developer Guide.\n By default, data records are accessible for 24 hours from the time that they\nare added to a stream. You can use IncreaseStreamRetentionPeriod or\nDecreaseStreamRetentionPeriod to modify this retention period." ([put-records-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-records-input put-records-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/put-records-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/put-records-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRecords", :http.request.configuration/output-deser-fn response-put-records-output, :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-records :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/put-records-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/put-records-output))

(clojure.core/defn enable-enhanced-monitoring "Enables enhanced Kinesis data stream monitoring for shard-level metrics." ([enable-enhanced-monitoring-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-enable-enhanced-monitoring-input enable-enhanced-monitoring-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/enable-enhanced-monitoring-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableEnhancedMonitoring", :http.request.configuration/output-deser-fn response-enhanced-monitoring-output, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef enable-enhanced-monitoring :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/enable-enhanced-monitoring-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output))

(clojure.core/defn describe-stream-summary "Provides a summarized description of the specified Kinesis data stream without\nthe shard list.\n The information returned includes the stream name, Amazon Resource Name (ARN),\nstatus, record retention period, approximate creation time, monitoring,\nencryption details, and open shard count." ([describe-stream-summary-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-stream-summary-input describe-stream-summary-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStreamSummary", :http.request.configuration/output-deser-fn response-describe-stream-summary-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-stream-summary :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-output))

(clojure.core/defn deregister-stream-consumer "To deregister a consumer, provide its ARN. Alternatively, you can provide the\nARN of the data stream and the name you gave the consumer when you registered\nit. You may also provide all three parameters, as long as they don't conflict\nwith each other. If you don't know the name or ARN of the consumer that you want\nto deregister, you can use the ListStreamConsumers operation to get a list of\nthe descriptions of all the consumers that are currently registered with a given\ndata stream. The description of a consumer contains its name and ARN.\n This operation has a limit of five transactions per second per account." ([] (deregister-stream-consumer {})) ([deregister-stream-consumer-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-deregister-stream-consumer-input deregister-stream-consumer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/deregister-stream-consumer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterStreamConsumer", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef deregister-stream-consumer :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/deregister-stream-consumer-input) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-stream "Adds or updates tags for the specified Kinesis data stream. Each time you invoke\nthis operation, you can specify up to 10 tags. If you want to add more than 10\ntags to your stream, you can invoke this operation multiple times. In total,\neach stream can have up to 50 tags.\n If tags have already been assigned to the stream, AddTagsToStream overwrites\nany existing tags that correspond to the specified tag keys.\n AddTagsToStream has a limit of five transactions per second per account." ([add-tags-to-stream-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-tags-to-stream-input add-tags-to-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/add-tags-to-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTagsToStream", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/add-tags-to-stream-input) :ret clojure.core/true?)

(clojure.core/defn split-shard "Splits a shard into two new shards in the Kinesis data stream, to increase the\nstream's capacity to ingest and transport data. SplitShard is called when there\nis a need to increase the overall capacity of a stream because of an expected\nincrease in the volume of data records being ingested.\n You can also use SplitShard when a shard appears to be approaching its maximum\nutilization; for example, the producers sending data into the specific shard are\nsuddenly sending more than previously anticipated. You can also call SplitShard\nto increase stream capacity, so that more Kinesis Data Streams applications can\nsimultaneously read data from the stream for real-time processing.\n You must specify the shard to be split and the new hash key, which is the\nposition in the shard where the shard gets split in two. In many cases, the new\nhash key might be the average of the beginning and ending hash key, but it can\nbe any hash key value in the range being mapped into the shard. For more\ninformation, see Split a Shard\n(http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-split.html)\nin the Amazon Kinesis Data Streams Developer Guide.\n You can use DescribeStream to determine the shard ID and hash key values for\nthe ShardToSplit and NewStartingHashKey parameters that are specified in the\nSplitShard request.\n SplitShard is an asynchronous operation. Upon receiving a SplitShard request,\nKinesis Data Streams immediately returns a response and sets the stream status\nto UPDATING. After the operation is completed, Kinesis Data Streams sets the\nstream status to ACTIVE. Read and write operations continue to work while the\nstream is in the UPDATING state.\n You can use DescribeStream to check the status of the stream, which is returned\nin StreamStatus. If the stream is in the ACTIVE state, you can call SplitShard.\nIf a stream is in CREATING or UPDATING or DELETING states, DescribeStream\nreturns a ResourceInUseException.\n If the specified stream does not exist, DescribeStream returns a\nResourceNotFoundException. If you try to create more shards than are authorized\nfor your account, you receive a LimitExceededException.\n For the default shard limit for an AWS account, see Kinesis Data Streams Limits\n(http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html) in\nthe Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact\nAWS Support\n(http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html).\n If you try to operate on too many streams simultaneously using CreateStream,\nDeleteStream, MergeShards, and/or SplitShard, you receive a\nLimitExceededException.\n SplitShard has a limit of five transactions per second per account." ([split-shard-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-split-shard-input split-shard-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/split-shard-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SplitShard", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef split-shard :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/split-shard-input) :ret clojure.core/true?)

(clojure.core/defn merge-shards "Merges two adjacent shards in a Kinesis data stream and combines them into a\nsingle shard to reduce the stream's capacity to ingest and transport data. Two\nshards are considered adjacent if the union of the hash key ranges for the two\nshards form a contiguous set with no gaps. For example, if you have two shards,\none with a hash key range of 276...381 and the other with a hash key range of\n382...454, then you could merge these two shards into a single shard that would\nhave a hash key range of 276...454. After the merge, the single child shard\nreceives data for all hash key values covered by the two parent shards.\n MergeShards is called when there is a need to reduce the overall capacity of a\nstream because of excess capacity that is not being used. You must specify the\nshard to be merged and the adjacent shard for a stream. For more information\nabout merging shards, see Merge Two Shards\n(http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-merge.html)\nin the Amazon Kinesis Data Streams Developer Guide.\n If the stream is in the ACTIVE state, you can call MergeShards. If a stream is\nin the CREATING, UPDATING, or DELETING state, MergeShards returns a\nResourceInUseException. If the specified stream does not exist, MergeShards\nreturns a ResourceNotFoundException.\n You can use DescribeStream to check the state of the stream, which is returned\nin StreamStatus.\n MergeShards is an asynchronous operation. Upon receiving a MergeShards request,\nAmazon Kinesis Data Streams immediately returns a response and sets the\nStreamStatus to UPDATING. After the operation is completed, Kinesis Data Streams\nsets the StreamStatus to ACTIVE. Read and write operations continue to work\nwhile the stream is in the UPDATING state.\n You use DescribeStream to determine the shard IDs that are specified in the\nMergeShards request.\n If you try to operate on too many streams in parallel using CreateStream,\nDeleteStream, MergeShards, or SplitShard, you receive a LimitExceededException.\n MergeShards has a limit of five transactions per second per account." ([merge-shards-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-merge-shards-input merge-shards-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/merge-shards-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MergeShards", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef merge-shards :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/merge-shards-input) :ret clojure.core/true?)

(clojure.core/defn list-shards "Lists the shards in a stream and provides information about each shard. This\noperation has a limit of 100 transactions per second per data stream.\n This API is a new operation that is used by the Amazon Kinesis Client Library\n(KCL). If you have a fine-grained IAM policy that only allows specific\noperations, you must update your policy to allow calls to this API. For more\ninformation, see Controlling Access to Amazon Kinesis Data Streams Resources\nUsing IAM\n(https://docs.aws.amazon.com/streams/latest/dev/controlling-access.html)." ([] (list-shards {})) ([list-shards-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-shards-input list-shards-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-shards-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-shards-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListShards", :http.request.configuration/output-deser-fn response-list-shards-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ExpiredNextTokenException" :portkey.aws.kinesis.-2013-12-02/expired-next-token-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef list-shards :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/list-shards-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-shards-output))

(clojure.core/defn get-shard-iterator "Gets an Amazon Kinesis shard iterator. A shard iterator expires 5 minutes after\nit is returned to the requester.\n A shard iterator specifies the shard position from which to start reading data\nrecords sequentially. The position is specified using the sequence number of a\ndata record in a shard. A sequence number is the identifier associated with\nevery record ingested in the stream, and is assigned when a record is put into\nthe stream. Each stream has one or more shards.\n You must specify the shard iterator type. For example, you can set the\nShardIteratorType parameter to read exactly from the position denoted by a\nspecific sequence number by using the AT_SEQUENCE_NUMBER shard iterator type.\nAlternatively, the parameter can read right after the sequence number by using\nthe AFTER_SEQUENCE_NUMBER shard iterator type, using sequence numbers returned\nby earlier calls to PutRecord, PutRecords, GetRecords, or DescribeStream. In the\nrequest, you can specify the shard iterator type AT_TIMESTAMP to read records\nfrom an arbitrary point in time, TRIM_HORIZON to cause ShardIterator to point to\nthe last untrimmed record in the shard in the system (the oldest data record in\nthe shard), or LATEST so that you always read the most recent data in the shard.\n When you read repeatedly from a stream, use a GetShardIterator request to get\nthe first shard iterator for use in your first GetRecords request and for\nsubsequent reads use the shard iterator returned by the GetRecords request in\nNextShardIterator. A new shard iterator is returned by every GetRecords request\nin NextShardIterator, which you use in the ShardIterator parameter of the next\nGetRecords request.\n If a GetShardIterator request is made too often, you receive a\nProvisionedThroughputExceededException. For more information about throughput\nlimits, see GetRecords, and Streams Limits\n(http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html) in\nthe Amazon Kinesis Data Streams Developer Guide.\n If the shard is closed, GetShardIterator returns a valid iterator for the last\nsequence number of the shard. A shard can be closed as a result of using\nSplitShard or MergeShards.\n GetShardIterator has a limit of five transactions per second per account per\nopen shard." ([get-shard-iterator-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-shard-iterator-input get-shard-iterator-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetShardIterator", :http.request.configuration/output-deser-fn response-get-shard-iterator-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-shard-iterator :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-output))

(clojure.core/defn disable-enhanced-monitoring "Disables enhanced monitoring." ([disable-enhanced-monitoring-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disable-enhanced-monitoring-input disable-enhanced-monitoring-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/disable-enhanced-monitoring-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableEnhancedMonitoring", :http.request.configuration/output-deser-fn response-enhanced-monitoring-output, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disable-enhanced-monitoring :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/disable-enhanced-monitoring-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output))

(clojure.core/defn start-stream-encryption "Enables or updates server-side encryption using an AWS KMS key for a specified\nstream.\n Starting encryption is an asynchronous operation. Upon receiving the request,\nKinesis Data Streams returns immediately and sets the status of the stream to\nUPDATING. After the update is complete, Kinesis Data Streams sets the status of\nthe stream back to ACTIVE. Updating or applying encryption normally takes a few\nseconds to complete, but it can take minutes. You can continue to read and write\ndata to your stream while its status is UPDATING. Once the status of the stream\nis ACTIVE, encryption begins for records written to the stream.\n API Limits: You can successfully apply a new AWS KMS key for server-side\nencryption 25 times in a rolling 24-hour period.\n Note: It can take up to 5 seconds after the stream is in an ACTIVE status\nbefore all records written to the stream are encrypted. After you enable\nencryption, you can verify that encryption is applied by inspecting the API\nresponse from PutRecord or PutRecords." ([start-stream-encryption-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-stream-encryption-input start-stream-encryption-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/start-stream-encryption-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartStreamEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required}})))))
(clojure.spec.alpha/fdef start-stream-encryption :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/start-stream-encryption-input) :ret clojure.core/true?)

(clojure.core/defn put-record "Writes a single data record into an Amazon Kinesis data stream. Call PutRecord\nto send data into the stream for real-time ingestion and subsequent processing,\none record at a time. Each shard can support writes up to 1,000 records per\nsecond, up to a maximum data write total of 1 MB per second.\n You must specify the name of the stream that captures, stores, and transports\nthe data; a partition key; and the data blob itself.\n The data blob can be any type of data; for example, a segment from a log file,\ngeographic/location data, website clickstream data, and so on.\n The partition key is used by Kinesis Data Streams to distribute data across\nshards. Kinesis Data Streams segregates the data records that belong to a stream\ninto multiple shards, using the partition key associated with each data record\nto determine the shard to which a given data record belongs.\n Partition keys are Unicode strings, with a maximum length limit of 256\ncharacters for each key. An MD5 hash function is used to map partition keys to\n128-bit integer values and to map associated data records to shards using the\nhash key ranges of the shards. You can override hashing the partition key to\ndetermine the shard by explicitly specifying a hash value using the\nExplicitHashKey parameter. For more information, see Adding Data to a Stream\n(http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream)\nin the Amazon Kinesis Data Streams Developer Guide.\n PutRecord returns the shard ID of where the data record was placed and the\nsequence number that was assigned to the data record.\n Sequence numbers increase over time and are specific to a shard within a\nstream, not across all shards within a stream. To guarantee strictly increasing\nordering, write serially to a shard and use the SequenceNumberForOrdering\nparameter. For more information, see Adding Data to a Stream\n(http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream)\nin the Amazon Kinesis Data Streams Developer Guide.\n If a PutRecord request cannot be processed because of insufficient provisioned\nthroughput on the shard involved in the request, PutRecord throws\nProvisionedThroughputExceededException.\n By default, data records are accessible for 24 hours from the time that they\nare added to a stream. You can use IncreaseStreamRetentionPeriod or\nDecreaseStreamRetentionPeriod to modify this retention period." ([put-record-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-record-input put-record-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/put-record-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/put-record-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRecord", :http.request.configuration/output-deser-fn response-put-record-output, :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-record :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/put-record-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/put-record-output))

(clojure.core/defn get-records "Gets data records from a Kinesis data stream's shard.\n Specify a shard iterator using the ShardIterator parameter. The shard iterator\nspecifies the position in the shard from which you want to start reading data\nrecords sequentially. If there are no records available in the portion of the\nshard that the iterator points to, GetRecords returns an empty list. It might\ntake multiple calls to get to a portion of the shard that contains records.\n You can scale by provisioning multiple shards per stream while considering\nservice limits (for more information, see Amazon Kinesis Data Streams Limits\n(http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html) in\nthe Amazon Kinesis Data Streams Developer Guide). Your application should have\none thread per shard, each reading continuously from its stream. To read from a\nstream continually, call GetRecords in a loop. Use GetShardIterator to get the\nshard iterator to specify in the first GetRecords call. GetRecords returns a new\nshard iterator in NextShardIterator. Specify the shard iterator returned in\nNextShardIterator in subsequent calls to GetRecords. If the shard has been\nclosed, the shard iterator can't return more data and GetRecords returns null in\nNextShardIterator. You can terminate the loop when the shard is closed, or when\nthe shard iterator reaches the record with the sequence number or other\nattribute that marks it as the last record to process.\n Each data record can be up to 1 MiB in size, and each shard can read up to 2\nMiB per second. You can ensure that your calls don't exceed the maximum\nsupported size or throughput by using the Limit parameter to specify the maximum\nnumber of records that GetRecords can return. Consider your average record size\nwhen determining this limit. The maximum number of records that can be returned\nper call is 10,000.\n The size of the data returned by GetRecords varies depending on the utilization\nof the shard. The maximum size of data that GetRecords can return is 10 MiB. If\na call returns this amount of data, subsequent calls made within the next 5\nseconds throw ProvisionedThroughputExceededException. If there is insufficient\nprovisioned throughput on the stream, subsequent calls made within the next 1\nsecond throw ProvisionedThroughputExceededException. GetRecords doesn't return\nany data when it throws an exception. For this reason, we recommend that you\nwait 1 second between calls to GetRecords. However, it's possible that the\napplication will get exceptions for longer than 1 second.\n To detect whether the application is falling behind in processing, you can use\nthe MillisBehindLatest response attribute. You can also monitor the stream using\nCloudWatch metrics and other mechanisms (see Monitoring\n(http://docs.aws.amazon.com/kinesis/latest/dev/monitoring.html) in the Amazon\nKinesis Data Streams Developer Guide).\n Each Amazon Kinesis record includes a value, ApproximateArrivalTimestamp, that\nis set when a stream successfully receives and stores a record. This is commonly\nreferred to as a server-side time stamp, whereas a client-side time stamp is set\nwhen a data producer creates or sends the record to a stream (a data producer is\nany data source putting data records into a stream, for example with\nPutRecords). The time stamp has millisecond precision. There are no guarantees\nabout the time stamp accuracy, or that the time stamp is always increasing. For\nexample, records in a shard or across a stream might have time stamps that are\nout of order.\n This operation has a limit of five transactions per second per account." ([get-records-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-records-input get-records-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/get-records-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/get-records-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRecords", :http.request.configuration/output-deser-fn response-get-records-output, :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "ExpiredIteratorException" :portkey.aws.kinesis.-2013-12-02/expired-iterator-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-records :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/get-records-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/get-records-output))

(clojure.core/defn update-shard-count "Updates the shard count of the specified stream to the specified number of\nshards.\n Updating the shard count is an asynchronous operation. Upon receiving the\nrequest, Kinesis Data Streams returns immediately and sets the status of the\nstream to UPDATING. After the update is complete, Kinesis Data Streams sets the\nstatus of the stream back to ACTIVE. Depending on the size of the stream, the\nscaling action could take a few minutes to complete. You can continue to read\nand write data to your stream while its status is UPDATING.\n To update the shard count, Kinesis Data Streams performs splits or merges on\nindividual shards. This can cause short-lived shards to be created, in addition\nto the final shards. We recommend that you double or halve the shard count, as\nthis results in the fewest number of splits or merges.\n This operation has the following default limits. By default, you cannot do the\nfollowing:\n * Scale more than twice per rolling 24-hour period per stream\n * Scale up to more than double your current shard count for a stream\n * Scale down below half your current shard count for a stream\n * Scale up to more than 500 shards in a stream\n * Scale a stream with more than 500 shards down unless the result is less than\n500 shards\n * Scale up to more than the shard limit for your account\n For the default limits for an AWS account, see Streams Limits\n(http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html) in\nthe Amazon Kinesis Data Streams Developer Guide. To request an increase in the\ncall rate limit, the shard limit for this API, or your overall shard limit, use\nthe limits form\n(https://console.aws.amazon.com/support/v1#/case/create?issueType=service-limit-increase&limitType=service-code-kinesis)." ([update-shard-count-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-shard-count-input update-shard-count-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/update-shard-count-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/update-shard-count-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateShardCount", :http.request.configuration/output-deser-fn response-update-shard-count-output, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-shard-count :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/update-shard-count-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/update-shard-count-output))

(clojure.core/defn create-stream "Creates a Kinesis data stream. A stream captures and transports data records\nthat are continuously emitted from different data sources or producers.\nScale-out within a stream is explicitly supported by means of shards, which are\nuniquely identified groups of data records in a stream.\n You specify and control the number of shards that a stream is composed of. Each\nshard can support reads up to five transactions per second, up to a maximum data\nread total of 2 MB per second. Each shard can support writes up to 1,000 records\nper second, up to a maximum data write total of 1 MB per second. If the amount\nof data input increases or decreases, you can add or remove shards.\n The stream name identifies the stream. The name is scoped to the AWS account\nused by the application. It is also scoped by AWS Region. That is, two streams\nin two different accounts can have the same name, and two streams in the same\naccount, but in two different Regions, can have the same name.\n CreateStream is an asynchronous operation. Upon receiving a CreateStream\nrequest, Kinesis Data Streams immediately returns and sets the stream status to\nCREATING. After the stream is created, Kinesis Data Streams sets the stream\nstatus to ACTIVE. You should perform read and write operations only on an ACTIVE\nstream.\n You receive a LimitExceededException when making a CreateStream request when\nyou try to do one of the following:\n * Have more than five streams in the CREATING state at any point in time.\n * Create more shards than are authorized for your account.\n For the default shard limit for an AWS account, see Amazon Kinesis Data Streams\nLimits\n(http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html) in\nthe Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact\nAWS Support\n(http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html).\n You can use DescribeStream to check the stream status, which is returned in\nStreamStatus.\n CreateStream has a limit of five transactions per second per account." ([create-stream-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-stream-input create-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/create-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStream", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef create-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/create-stream-input) :ret clojure.core/true?)

(clojure.core/defn describe-stream "Describes the specified Kinesis data stream.\n The information returned includes the stream name, Amazon Resource Name (ARN),\ncreation time, enhanced metric configuration, and shard map. The shard map is an\narray of shard objects. For each shard object, there is the hash key and\nsequence number ranges that the shard spans, and the IDs of any earlier shards\nthat played in a role in creating the shard. Every record ingested in the stream\nis identified by a sequence number, which is assigned when the record is put\ninto the stream.\n You can limit the number of shards returned by each call. For more information,\nsee Retrieving Shards from a Stream\n(http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-retrieve-shards.html)\nin the Amazon Kinesis Data Streams Developer Guide.\n There are no guarantees about the chronological order shards returned. To\nprocess shards in chronological order, use the ID of the parent shard to track\nthe lineage to the oldest shard.\n This operation has a limit of 10 transactions per second per account." ([describe-stream-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-stream-input describe-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStream", :http.request.configuration/output-deser-fn response-describe-stream-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-stream-output))

(clojure.core/defn list-tags-for-stream "Lists the tags for the specified Kinesis data stream. This operation has a limit\nof five transactions per second per account." ([list-tags-for-stream-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-for-stream-input list-tags-for-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForStream", :http.request.configuration/output-deser-fn response-list-tags-for-stream-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-output))

(clojure.core/defn decrease-stream-retention-period "Decreases the Kinesis data stream's retention period, which is the length of\ntime data records are accessible after they are added to the stream. The minimum\nvalue of a stream's retention period is 24 hours.\n This operation may result in lost data. For example, if the stream's retention\nperiod is 48 hours and is decreased to 24 hours, any data already in the stream\nthat is older than 24 hours is inaccessible." ([decrease-stream-retention-period-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-decrease-stream-retention-period-input decrease-stream-retention-period-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.configuration/target-prefix "Kinesis_20131202", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/decrease-stream-retention-period-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DecreaseStreamRetentionPeriod", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef decrease-stream-retention-period :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/decrease-stream-retention-period-input) :ret clojure.core/true?)
