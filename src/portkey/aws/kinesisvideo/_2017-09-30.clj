(ns portkey.aws.kinesisvideo.-2017-09-30 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.tags-per-resource-exceeded-limit-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tags-per-resource-exceeded-limit-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.tags-per-resource-exceeded-limit-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 256)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.untag-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30/TagKeyList] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.untag-stream-input/StreamARN :portkey.aws.kinesisvideo.-2017-09-30/StreamName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.stream-info/creation-time (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.stream-info/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamName :portkey.aws.kinesisvideo.-2017-09-30/MediaType :portkey.aws.kinesisvideo.-2017-09-30/DataRetentionInHours :portkey.aws.kinesisvideo.-2017-09-30/Status :portkey.aws.kinesisvideo.-2017-09-30/KmsKeyId :portkey.aws.kinesisvideo.-2017-09-30.stream-info/CreationTime :portkey.aws.kinesisvideo.-2017-09-30/DeviceName :portkey.aws.kinesisvideo.-2017-09-30.stream-info/StreamARN :portkey.aws.kinesisvideo.-2017-09-30/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.version-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/version-mismatch-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.version-mismatch-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/media-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[\w\-\.\+]+/[\w\-\.\+]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/data-retention-in-hours (clojure.spec.alpha/and clojure.core/int? (fn* [p1__14021__14022__auto__] (clojure.core/<= 0 p1__14021__14022__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-operation (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"INCREASE_DATA_RETENTION" "INCREASE_DATA_RETENTION", :increase-data-retention "INCREASE_DATA_RETENTION", "DECREASE_DATA_RETENTION" "DECREASE_DATA_RETENTION", :decrease-data-retention "DECREASE_DATA_RETENTION"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/tags (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-tags))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/Tags] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/StreamARN :portkey.aws.kinesisvideo.-2017-09-30/StreamName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-output/tags (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-tags))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/NextToken :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-output/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/operation (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-operation))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/CurrentVersion :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/Operation :portkey.aws.kinesisvideo.-2017-09-30/DataRetentionChangeInHours] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamName :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resource-tags (clojure.spec.alpha/map-of :portkey.aws.kinesisvideo.-2017-09-30/tag-key :portkey.aws.kinesisvideo.-2017-09-30/tag-value))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.resource-in-use-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamInfo] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-info-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesisvideo.-2017-09-30/stream-info) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/comparison-operator (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"BEGINS_WITH" "BEGINS_WITH", :begins-with "BEGINS_WITH"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.not-authorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/apiname (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"PUT_MEDIA" "PUT_MEDIA", :put-media "PUT_MEDIA", "GET_MEDIA" "GET_MEDIA", :get-media "GET_MEDIA", "LIST_FRAGMENTS" "LIST_FRAGMENTS", :list-fragments "LIST_FRAGMENTS", "GET_MEDIA_FOR_FRAGMENT_LIST" "GET_MEDIA_FOR_FRAGMENT_LIST", :get-media-for-fragment-list "GET_MEDIA_FOR_FRAGMENT_LIST"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/status (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "UPDATING" "UPDATING", :updating "UPDATING", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 0 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/create-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamName] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/DeviceName :portkey.aws.kinesisvideo.-2017-09-30/MediaType :portkey.aws.kinesisvideo.-2017-09-30/KmsKeyId :portkey.aws.kinesisvideo.-2017-09-30/DataRetentionInHours] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__14021__14022__auto__] (clojure.core/<= 1 p1__14021__14022__auto__)) (fn* [p1__14023__14024__auto__] (clojure.core/<= p1__14023__14024__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesisvideo.-2017-09-30/tag-key :min-count 1 :max-count 50) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-streams-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamInfoList :portkey.aws.kinesisvideo.-2017-09-30/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 0 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.invalid-device-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/invalid-device-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.invalid-device-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.client-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.invalid-argument-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/CurrentVersion] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamName :portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/StreamARN :portkey.aws.kinesisvideo.-2017-09-30/DeviceName :portkey.aws.kinesisvideo.-2017-09-30/MediaType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.device-stream-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/device-stream-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.device-stream-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/NextToken :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-input/StreamARN :portkey.aws.kinesisvideo.-2017-09-30/StreamName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/DataEndpoint] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 64)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.list-streams-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.list-streams-input/MaxResults :portkey.aws.kinesisvideo.-2017-09-30/NextToken :portkey.aws.kinesisvideo.-2017-09-30/StreamNameCondition] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/data-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.create-stream-output/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/create-stream-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.create-stream-output/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.invalid-resource-format-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.invalid-resource-format-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/data-retention-change-in-hours (clojure.spec.alpha/and clojure.core/int? (fn* [p1__14021__14022__auto__] (clojure.core/<= 1 p1__14021__14022__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/StreamARN] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/CurrentVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.get-data-endpoint-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30/APIName] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamName :portkey.aws.kinesisvideo.-2017-09-30.get-data-endpoint-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.account-stream-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/account-stream-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.account-stream-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resourcearn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 1024)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.describe-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/StreamName :portkey.aws.kinesisvideo.-2017-09-30.describe-stream-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.stream-name-condition/comparison-value (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-name-condition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/ComparisonOperator :portkey.aws.kinesisvideo.-2017-09-30.stream-name-condition/ComparisonValue] :locations {}))

(clojure.core/defn delete-stream ([delete-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/deleteStream" delete-stream-input :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception})))
(clojure.spec.alpha/fdef delete-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-output))

(clojure.core/defn get-data-endpoint ([get-data-endpoint-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/getDataEndpoint" get-data-endpoint-input :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-output {"InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception})))
(clojure.spec.alpha/fdef get-data-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-output))

(clojure.core/defn list-streams ([] (list-streams {})) ([list-streams-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/listStreams" list-streams-input :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/list-streams-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception})))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/list-streams-output))

(clojure.core/defn update-stream ([update-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/updateStream" update-stream-input :portkey.aws.kinesisvideo.-2017-09-30/update-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/update-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "VersionMismatchException" :portkey.aws.kinesisvideo.-2017-09-30/version-mismatch-exception})))
(clojure.spec.alpha/fdef update-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/update-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/update-stream-output))

(clojure.core/defn create-stream ([create-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/createStream" create-stream-input :portkey.aws.kinesisvideo.-2017-09-30/create-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/create-stream-output {"AccountStreamLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/account-stream-limit-exceeded-exception, "DeviceStreamLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/device-stream-limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception, "InvalidDeviceException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-device-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/create-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/create-stream-output))

(clojure.core/defn describe-stream ([] (describe-stream {})) ([describe-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/describeStream" describe-stream-input :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-output {"InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception})))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-output))

(clojure.core/defn list-tags-for-stream ([] (list-tags-for-stream {})) ([list-tags-for-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/listTagsForStream" list-tags-for-stream-input :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception})))
(clojure.spec.alpha/fdef list-tags-for-stream :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-output))

(clojure.core/defn update-data-retention ([update-data-retention-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/updateDataRetention" update-data-retention-input :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "VersionMismatchException" :portkey.aws.kinesisvideo.-2017-09-30/version-mismatch-exception})))
(clojure.spec.alpha/fdef update-data-retention :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-output))

(clojure.core/defn tag-stream ([tag-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/tagStream" tag-stream-input :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception, "TagsPerResourceExceededLimitException" :portkey.aws.kinesisvideo.-2017-09-30/tags-per-resource-exceeded-limit-exception})))
(clojure.spec.alpha/fdef tag-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-output))

(clojure.core/defn untag-stream ([untag-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo.-2017-09-30/endpoints "POST" "/untagStream" untag-stream-input :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception})))
(clojure.spec.alpha/fdef untag-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-output))
