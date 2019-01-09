(ns portkey.aws.kinesis.-2013-12-02 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.put-records-request-entry/explicit-hash-key (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/hash-key))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/data :portkey.aws.kinesis.-2013-12-02/partition-key] :opt-un [:portkey.aws.kinesis.-2013-12-02.put-records-request-entry/explicit-hash-key]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.expired-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/expired-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.expired-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.consumer/consumer-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/consumer-name :portkey.aws.kinesis.-2013-12-02/consumer-arn :portkey.aws.kinesis.-2013-12-02/consumer-status :portkey.aws.kinesis.-2013-12-02.consumer/consumer-creation-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/consumer-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(arn):aws.*:kinesis:.*:\d{12}:.*stream\/[a-zA-Z0-9_.-]+\/consumer\/[a-zA-Z0-9_.-]+:[0-9]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/start-stream-encryption-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-name :portkey.aws.kinesis.-2013-12-02/encryption-type :portkey.aws.kinesis.-2013-12-02/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/partition-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/stream-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis.-2013-12-02/stream-arn] :opt-un [:portkey.aws.kinesis.-2013-12-02/next-token :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/max-results :portkey.aws.kinesis.-2013-12-02.list-stream-consumers-input/stream-creation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-iterator-type #{"LATEST" "TRIM_HORIZON" :at-timestamp "AFTER_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER" "AT_TIMESTAMP" :at-sequence-number :latest :trim-horizon :after-sequence-number})

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/put-records-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis.-2013-12-02/put-records-result-entry :min-count 1 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02.kms-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis.-2013-12-02.kms-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/shard-iterator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512))))

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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1048576))))

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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/sequence-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"0|([1-9]\d{0,128})" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/hash-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"0|([1-9]\d{0,38})" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.kinesis.-2013-12-02/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws.*:kinesis:.*:\d{12}:stream/.*" s__27967__auto__))))

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

(clojure.core/defn list-stream-consumers ([list-stream-consumers-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-stream-consumers-input list-stream-consumers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamConsumers", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ExpiredNextTokenException" :portkey.aws.kinesis.-2013-12-02/expired-next-token-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef list-stream-consumers :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-stream-consumers-output))

(clojure.core/defn increase-stream-retention-period ([increase-stream-retention-period-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-increase-stream-retention-period-input increase-stream-retention-period-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/increase-stream-retention-period-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "IncreaseStreamRetentionPeriod", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef increase-stream-retention-period :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/increase-stream-retention-period-input) :ret clojure.core/true?)

(clojure.core/defn delete-stream ([delete-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-stream-input delete-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/delete-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/delete-stream-input) :ret clojure.core/true?)

(clojure.core/defn stop-stream-encryption ([stop-stream-encryption-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-stream-encryption-input stop-stream-encryption-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/stop-stream-encryption-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopStreamEncryption", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-stream-encryption :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/stop-stream-encryption-input) :ret clojure.core/true?)

(clojure.core/defn describe-limits ([] (describe-limits {})) ([describe-limits-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-limits-input describe-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-limits-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLimits", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-limits :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/describe-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-limits-output))

(clojure.core/defn remove-tags-from-stream ([remove-tags-from-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-remove-tags-from-stream-input remove-tags-from-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/remove-tags-from-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTagsFromStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/remove-tags-from-stream-input) :ret clojure.core/true?)

(clojure.core/defn register-stream-consumer ([register-stream-consumer-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-register-stream-consumer-input register-stream-consumer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterStreamConsumer", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-stream-consumer :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/register-stream-consumer-output))

(clojure.core/defn describe-stream-consumer ([] (describe-stream-consumer {})) ([describe-stream-consumer-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-stream-consumer-input describe-stream-consumer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStreamConsumer", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef describe-stream-consumer :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-stream-consumer-output))

(clojure.core/defn subscribe-to-shard ([subscribe-to-shard-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-subscribe-to-shard-input subscribe-to-shard-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SubscribeToShard", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef subscribe-to-shard :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/subscribe-to-shard-output))

(clojure.core/defn list-streams ([] (list-streams {})) ([list-streams-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-streams-input list-streams-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-streams-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-streams-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreams", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-streams-output))

(clojure.core/defn put-records ([put-records-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-records-input put-records-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/put-records-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/put-records-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRecords", :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-records :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/put-records-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/put-records-output))

(clojure.core/defn enable-enhanced-monitoring ([enable-enhanced-monitoring-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-enable-enhanced-monitoring-input enable-enhanced-monitoring-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/enable-enhanced-monitoring-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableEnhancedMonitoring", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef enable-enhanced-monitoring :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/enable-enhanced-monitoring-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output))

(clojure.core/defn describe-stream-summary ([describe-stream-summary-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-stream-summary-input describe-stream-summary-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStreamSummary", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-stream-summary :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-stream-summary-output))

(clojure.core/defn deregister-stream-consumer ([] (deregister-stream-consumer {})) ([deregister-stream-consumer-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-deregister-stream-consumer-input deregister-stream-consumer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/deregister-stream-consumer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterStreamConsumer", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef deregister-stream-consumer :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/deregister-stream-consumer-input) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-stream ([add-tags-to-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-tags-to-stream-input add-tags-to-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/add-tags-to-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTagsToStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/add-tags-to-stream-input) :ret clojure.core/true?)

(clojure.core/defn split-shard ([split-shard-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-split-shard-input split-shard-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/split-shard-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SplitShard", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef split-shard :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/split-shard-input) :ret clojure.core/true?)

(clojure.core/defn merge-shards ([merge-shards-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-merge-shards-input merge-shards-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/merge-shards-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "MergeShards", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef merge-shards :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/merge-shards-input) :ret clojure.core/true?)

(clojure.core/defn list-shards ([] (list-shards {})) ([list-shards-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-shards-input list-shards-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-shards-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-shards-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListShards", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ExpiredNextTokenException" :portkey.aws.kinesis.-2013-12-02/expired-next-token-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef list-shards :args (clojure.spec.alpha/? :portkey.aws.kinesis.-2013-12-02/list-shards-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-shards-output))

(clojure.core/defn get-shard-iterator ([get-shard-iterator-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-shard-iterator-input get-shard-iterator-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetShardIterator", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-shard-iterator :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/get-shard-iterator-output))

(clojure.core/defn disable-enhanced-monitoring ([disable-enhanced-monitoring-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-disable-enhanced-monitoring-input disable-enhanced-monitoring-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/disable-enhanced-monitoring-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableEnhancedMonitoring", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disable-enhanced-monitoring :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/disable-enhanced-monitoring-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/enhanced-monitoring-output))

(clojure.core/defn start-stream-encryption ([start-stream-encryption-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-stream-encryption-input start-stream-encryption-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/start-stream-encryption-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartStreamEncryption", :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required}})))))
(clojure.spec.alpha/fdef start-stream-encryption :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/start-stream-encryption-input) :ret clojure.core/true?)

(clojure.core/defn put-record ([put-record-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-record-input put-record-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/put-record-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/put-record-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRecord", :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-record :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/put-record-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/put-record-output))

(clojure.core/defn get-records ([get-records-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-records-input get-records-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/get-records-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/get-records-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRecords", :http.request.spec/error-spec {"KMSNotFoundException" :portkey.aws.kinesis.-2013-12-02/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.kinesis.-2013-12-02/kms-invalid-state-exception, "ExpiredIteratorException" :portkey.aws.kinesis.-2013-12-02/expired-iterator-exception, "KMSDisabledException" :portkey.aws.kinesis.-2013-12-02/kms-disabled-exception, "KMSAccessDeniedException" :portkey.aws.kinesis.-2013-12-02/kms-access-denied-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "KMSThrottlingException" :portkey.aws.kinesis.-2013-12-02/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.kinesis.-2013-12-02/kms-opt-in-required, "ProvisionedThroughputExceededException" :portkey.aws.kinesis.-2013-12-02/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-records :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/get-records-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/get-records-output))

(clojure.core/defn update-shard-count ([update-shard-count-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-shard-count-input update-shard-count-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/update-shard-count-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/update-shard-count-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateShardCount", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-shard-count :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/update-shard-count-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/update-shard-count-output))

(clojure.core/defn create-stream ([create-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-stream-input create-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/create-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStream", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef create-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/create-stream-input) :ret clojure.core/true?)

(clojure.core/defn describe-stream ([describe-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-stream-input describe-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/describe-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/describe-stream-output))

(clojure.core/defn list-tags-for-stream ([list-tags-for-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tags-for-stream-input list-tags-for-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis.-2013-12-02/list-tags-for-stream-output))

(clojure.core/defn decrease-stream-retention-period ([decrease-stream-retention-period-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-decrease-stream-retention-period-input decrease-stream-retention-period-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis.-2013-12-02/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-12-02", :http.request.configuration/service-id "Kinesis", :http.request.spec/input-spec :portkey.aws.kinesis.-2013-12-02/decrease-stream-retention-period-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DecreaseStreamRetentionPeriod", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesis.-2013-12-02/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesis.-2013-12-02/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesis.-2013-12-02/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis.-2013-12-02/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef decrease-stream-retention-period :args (clojure.spec.alpha/tuple :portkey.aws.kinesis.-2013-12-02/decrease-stream-retention-period-input) :ret clojure.core/true?)
