(ns portkey.aws.streams-dynamodb (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/attribute-map (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb/attribute-name :portkey.aws.streams-dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-shard-iterator-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb/stream-arn :portkey.aws.streams-dynamodb/shard-id :portkey.aws.streams-dynamodb/shard-iterator-type] :opt-un [:portkey.aws.streams-dynamodb/sequence-number]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/number-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/number-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 28 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 65))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-iterator-type #{"LATEST" "TRIM_HORIZON" "AFTER_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER" :at-sequence-number :latest :trim-horizon :after-sequence-number})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/describe-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/stream-description]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-iterator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/null-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.expired-iterator-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/expired-iterator-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.expired-iterator-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/map-attribute-value (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb/attribute-name :portkey.aws.streams-dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.shard/parent-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/shard-id :portkey.aws.streams-dynamodb/sequence-number-range :portkey.aws.streams-dynamodb.shard/parent-shard-id]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-schema (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/key-schema-element :min-count 1 :max-count 2))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/binary-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/binary-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/shards (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-description-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/last-evaluated-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/creation-request-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.stream-description/stream-label :portkey.aws.streams-dynamodb.stream-description/shards :portkey.aws.streams-dynamodb.stream-description/last-evaluated-shard-id :portkey.aws.streams-dynamodb/key-schema :portkey.aws.streams-dynamodb/stream-view-type :portkey.aws.streams-dynamodb.stream-description/creation-request-date-time :portkey.aws.streams-dynamodb/stream-arn :portkey.aws.streams-dynamodb/stream-status :portkey.aws.streams-dynamodb/table-name]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/sequence-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 21 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-view-type #{:new-image :old-image "NEW_IMAGE" "NEW_AND_OLD_IMAGES" :keys-only :new-and-old-images "OLD_IMAGE" "KEYS_ONLY"})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.get-records-output/records (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/record-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.get-records-output/next-shard-iterator (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-iterator))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-records-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.get-records-output/records :portkey.aws.streams-dynamodb.get-records-output/next-shard-iterator]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/binary-attribute-value clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/null (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/null-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/l (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/list-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/bool (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/boolean-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/m (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/map-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/s (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/b (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/ns (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/number-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/n (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/bs (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/binary-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/ss (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.attribute-value/null :portkey.aws.streams-dynamodb.attribute-value/l :portkey.aws.streams-dynamodb.attribute-value/bool :portkey.aws.streams-dynamodb.attribute-value/m :portkey.aws.streams-dynamodb.attribute-value/s :portkey.aws.streams-dynamodb.attribute-value/b :portkey.aws.streams-dynamodb.attribute-value/ns :portkey.aws.streams-dynamodb.attribute-value/n :portkey.aws.streams-dynamodb.attribute-value/bs :portkey.aws.streams-dynamodb.attribute-value/ss]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 37 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-output/streams (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-output/last-evaluated-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/list-streams-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.list-streams-output/streams :portkey.aws.streams-dynamodb.list-streams-output/last-evaluated-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/approximate-creation-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/keys (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/new-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/old-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/size-bytes (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.stream-record/approximate-creation-date-time :portkey.aws.streams-dynamodb.stream-record/keys :portkey.aws.streams-dynamodb.stream-record/new-image :portkey.aws.streams-dynamodb.stream-record/old-image :portkey.aws.streams-dynamodb/sequence-number :portkey.aws.streams-dynamodb.stream-record/size-bytes :portkey.aws.streams-dynamodb/stream-view-type]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-status #{"DISABLED" :disabled "DISABLING" "ENABLING" :disabling :enabling "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/operation-type))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-version (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-source (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/aws-region (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/dynamodb (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-record))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/user-identity (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/identity))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.record/event-id :portkey.aws.streams-dynamodb.record/event-name :portkey.aws.streams-dynamodb.record/event-version :portkey.aws.streams-dynamodb.record/event-source :portkey.aws.streams-dynamodb.record/aws-region :portkey.aws.streams-dynamodb.record/dynamodb :portkey.aws.streams-dynamodb.record/user-identity]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/record-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/record))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/operation-type #{:remove :insert "MODIFY" "REMOVE" "INSERT" :modify})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.trimmed-data-access-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/trimmed-data-access-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.trimmed-data-access-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.identity/principal-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.identity/type (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.identity/principal-id :portkey.aws.streams-dynamodb.identity/type]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/stream))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-shard-iterator-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/shard-iterator]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/stream-arn :portkey.aws.streams-dynamodb/table-name :portkey.aws.streams-dynamodb.stream/stream-label]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/positive-integer-object (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.get-records-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-records-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb/shard-iterator] :opt-un [:portkey.aws.streams-dynamodb.get-records-input/limit]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-schema-element (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb.key-schema-element/attribute-name :portkey.aws.streams-dynamodb/key-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-description-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/shard))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.sequence-number-range/starting-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.sequence-number-range/ending-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/sequence-number-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.sequence-number-range/starting-sequence-number :portkey.aws.streams-dynamodb.sequence-number-range/ending-sequence-number]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-input/exclusive-start-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/list-streams-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/table-name :portkey.aws.streams-dynamodb.list-streams-input/limit :portkey.aws.streams-dynamodb.list-streams-input/exclusive-start-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/list-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/string-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/string-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-type #{:hash "RANGE" "HASH" :range})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.describe-stream-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.describe-stream-input/exclusive-start-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/describe-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb/stream-arn] :opt-un [:portkey.aws.streams-dynamodb.describe-stream-input/limit :portkey.aws.streams-dynamodb.describe-stream-input/exclusive-start-shard-id]))

(clojure.core/defn describe-stream ([describe-stream-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stream-input describe-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/describe-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/describe-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/describe-stream-output))

(clojure.core/defn get-records ([get-records-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-records-input get-records-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/get-records-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/get-records-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRecords", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "LimitExceededException" :portkey.aws.streams-dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error, "ExpiredIteratorException" :portkey.aws.streams-dynamodb/expired-iterator-exception, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb/trimmed-data-access-exception}})))))
(clojure.spec.alpha/fdef get-records :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb/get-records-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/get-records-output))

(clojure.core/defn get-shard-iterator ([get-shard-iterator-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-shard-iterator-input get-shard-iterator-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/get-shard-iterator-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/get-shard-iterator-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetShardIterator", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb/trimmed-data-access-exception}})))))
(clojure.spec.alpha/fdef get-shard-iterator :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb/get-shard-iterator-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/get-shard-iterator-output))

(clojure.core/defn list-streams ([] (list-streams {})) ([list-streams-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-streams-input list-streams-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/list-streams-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/list-streams-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreams", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error}})))))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.streams-dynamodb/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/list-streams-output))
