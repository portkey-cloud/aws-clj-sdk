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

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb.-2012-08-10/attribute-name :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-input (portkey.aws/json-keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10/StreamArn :portkey.aws.streams-dynamodb.-2012-08-10/ShardId :portkey.aws.streams-dynamodb.-2012-08-10/ShardIteratorType] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/SequenceNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/number-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/number-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 28 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 65))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER", :at-sequence-number "AT_SEQUENCE_NUMBER", "AFTER_SEQUENCE_NUMBER" "AFTER_SEQUENCE_NUMBER", :after-sequence-number "AFTER_SEQUENCE_NUMBER"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/StreamDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/null-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.expired-iterator-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/expired-iterator-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.expired-iterator-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/map-attribute-value (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb.-2012-08-10/attribute-name :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.shard/parent-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/ShardId :portkey.aws.streams-dynamodb.-2012-08-10/SequenceNumberRange :portkey.aws.streams-dynamodb.-2012-08-10.shard/ParentShardId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-schema (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-element :min-count 1 :max-count 2) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/binary-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/binary-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/shards (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-description-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/last-evaluated-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/creation-request-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.stream-description/StreamLabel :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/Shards :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/LastEvaluatedShardId :portkey.aws.streams-dynamodb.-2012-08-10/KeySchema :portkey.aws.streams-dynamodb.-2012-08-10/StreamViewType :portkey.aws.streams-dynamodb.-2012-08-10.stream-description/CreationRequestDateTime :portkey.aws.streams-dynamodb.-2012-08-10/StreamArn :portkey.aws.streams-dynamodb.-2012-08-10/StreamStatus :portkey.aws.streams-dynamodb.-2012-08-10/TableName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 21 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-view-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NEW_IMAGE" "NEW_IMAGE", :new-image "NEW_IMAGE", "OLD_IMAGE" "OLD_IMAGE", :old-image "OLD_IMAGE", "NEW_AND_OLD_IMAGES" "NEW_AND_OLD_IMAGES", :new-and-old-images "NEW_AND_OLD_IMAGES", "KEYS_ONLY" "KEYS_ONLY", :keys-only "KEYS_ONLY"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/records (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/record-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/next-shard-iterator (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-iterator))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-records-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/Records :portkey.aws.streams-dynamodb.-2012-08-10.get-records-output/NextShardIterator] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/binary-attribute-value (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

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
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/NULL :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/L :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/BOOL :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/M :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/S :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/B :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/NS :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/N :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/BS :portkey.aws.streams-dynamodb.-2012-08-10.attribute-value/SS] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 37 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/streams (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/last-evaluated-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/Streams :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-output/LastEvaluatedStreamArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/approximate-creation-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/keys (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/new-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/old-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/size-bytes (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-record (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.stream-record/ApproximateCreationDateTime :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/Keys :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/NewImage :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/OldImage :portkey.aws.streams-dynamodb.-2012-08-10/SequenceNumber :portkey.aws.streams-dynamodb.-2012-08-10.stream-record/SizeBytes :portkey.aws.streams-dynamodb.-2012-08-10/StreamViewType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLING" "ENABLING", :enabling "ENABLING", "ENABLED" "ENABLED", :enabled "ENABLED", "DISABLING" "DISABLING", :disabling "DISABLING", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/eventid (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/event-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/operation-type))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/event-version (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/event-source (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/aws-region (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/dynamodb (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-record))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.record/user-identity (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/identity))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/record (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.record/eventID :portkey.aws.streams-dynamodb.-2012-08-10.record/eventName :portkey.aws.streams-dynamodb.-2012-08-10.record/eventVersion :portkey.aws.streams-dynamodb.-2012-08-10.record/eventSource :portkey.aws.streams-dynamodb.-2012-08-10.record/awsRegion :portkey.aws.streams-dynamodb.-2012-08-10.record/dynamodb :portkey.aws.streams-dynamodb.-2012-08-10.record/userIdentity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/record-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/record) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/operation-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"INSERT" "INSERT", :insert "INSERT", "MODIFY" "MODIFY", :modify "MODIFY", "REMOVE" "REMOVE", :remove "REMOVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.trimmed-data-access-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/trimmed-data-access-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.trimmed-data-access-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.identity/principal-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.identity/type (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/identity (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.identity/PrincipalId :portkey.aws.streams-dynamodb.-2012-08-10.identity/Type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/stream) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 3 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/ShardIterator] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.stream/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/stream (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/StreamArn :portkey.aws.streams-dynamodb.-2012-08-10/TableName :portkey.aws.streams-dynamodb.-2012-08-10.stream/StreamLabel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.get-records-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/get-records-input (portkey.aws/json-keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10/ShardIterator] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.get-records-input/Limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-element (portkey.aws/json-keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10.key-schema-element/AttributeName :portkey.aws.streams-dynamodb.-2012-08-10/KeyType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/shard-description-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/shard) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/starting-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/ending-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/sequence-number-range (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/StartingSequenceNumber :portkey.aws.streams-dynamodb.-2012-08-10.sequence-number-range/EndingSequenceNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/exclusive-start-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10/TableName :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/Limit :portkey.aws.streams-dynamodb.-2012-08-10.list-streams-input/ExclusiveStartStreamArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/list-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.internal-server-error/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/string-set-attribute-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb.-2012-08-10/string-attribute-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/key-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"HASH" "HASH", :hash "HASH", "RANGE" "RANGE", :range "RANGE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/exclusive-start-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.streams-dynamodb.-2012-08-10/StreamArn] :opt-un [:portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/Limit :portkey.aws.streams-dynamodb.-2012-08-10.describe-stream-input/ExclusiveStartShardId] :locations {}))

(clojure.core/defn describe-stream "Returns information about a stream, including the current status of the stream,\nits Amazon Resource Name (ARN), the composition of its shards, and its\ncorresponding DynamoDB table.\n You can call DescribeStream at a maximum rate of 10 times per second.\n Each shard in the stream has a SequenceNumberRange associated with it. If the\nSequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber,\nthen the shard is still open (able to receive more stream records). If both\nStartingSequenceNumber and EndingSequenceNumber are present, then that shard is\nclosed and can no longer receive more data." ([describe-stream-input] (portkey.aws/-json-call portkey.aws.streams-dynamodb.-2012-08-10/endpoints "POST" "DynamoDBStreams_20120810.DescribeStream" describe-stream-input :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-output {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error})))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/describe-stream-output))

(clojure.core/defn get-records "Retrieves the stream records from a given shard.\n Specify a shard iterator using the ShardIterator parameter. The shard iterator\nspecifies the position in the shard from which you want to start reading stream\nrecords sequentially. If there are no stream records available in the portion of\nthe shard that the iterator points to, GetRecords returns an empty list. Note\nthat it might take multiple calls to get to a portion of the shard that contains\nstream records.\n GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records,\nwhichever comes first." ([get-records-input] (portkey.aws/-json-call portkey.aws.streams-dynamodb.-2012-08-10/endpoints "POST" "DynamoDBStreams_20120810.GetRecords" get-records-input :portkey.aws.streams-dynamodb.-2012-08-10/get-records-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.streams-dynamodb.-2012-08-10/get-records-output {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.streams-dynamodb.-2012-08-10/limit-exceeded-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error, "ExpiredIteratorException" :portkey.aws.streams-dynamodb.-2012-08-10/expired-iterator-exception, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb.-2012-08-10/trimmed-data-access-exception})))
(clojure.spec.alpha/fdef get-records :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb.-2012-08-10/get-records-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/get-records-output))

(clojure.core/defn get-shard-iterator "Returns a shard iterator. A shard iterator provides information about how to\nretrieve the stream records from within a shard. Use the shard iterator in a\nsubsequent GetRecords request to read the stream records from the shard.\n A shard iterator expires 15 minutes after it is returned to the requester." ([get-shard-iterator-input] (portkey.aws/-json-call portkey.aws.streams-dynamodb.-2012-08-10/endpoints "POST" "DynamoDBStreams_20120810.GetShardIterator" get-shard-iterator-input :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-output {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb.-2012-08-10/trimmed-data-access-exception})))
(clojure.spec.alpha/fdef get-shard-iterator :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/get-shard-iterator-output))

(clojure.core/defn list-streams "Returns an array of stream ARNs associated with the current account and\nendpoint. If the TableName parameter is present, then ListStreams will return\nonly the streams ARNs for that table.\n You can call ListStreams at a maximum rate of 5 times per second." ([] (list-streams {})) ([list-streams-input] (portkey.aws/-json-call portkey.aws.streams-dynamodb.-2012-08-10/endpoints "POST" "DynamoDBStreams_20120810.ListStreams" list-streams-input :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-output {"ResourceNotFoundException" :portkey.aws.streams-dynamodb.-2012-08-10/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb.-2012-08-10/internal-server-error})))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb.-2012-08-10/list-streams-output))
