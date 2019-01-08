(ns portkey.aws.kinesisvideo.-2017-09-30 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "kinesisvideo", :region "ap-northeast-1"},
    :ssl-common-name "kinesisvideo.ap-northeast-1.amazonaws.com",
    :endpoint "https://kinesisvideo.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kinesisvideo", :region "eu-west-1"},
    :ssl-common-name "kinesisvideo.eu-west-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "kinesisvideo", :region "eu-central-1"},
    :ssl-common-name "kinesisvideo.eu-central-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kinesisvideo", :region "us-west-2"},
    :ssl-common-name "kinesisvideo.us-west-2.amazonaws.com",
    :endpoint "https://kinesisvideo.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kinesisvideo", :region "us-east-1"},
    :ssl-common-name "kinesisvideo.us-east-1.amazonaws.com",
    :endpoint "https://kinesisvideo.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-stream-name)

(clojure.core/declare ser-media-type)

(clojure.core/declare ser-data-retention-in-hours)

(clojure.core/declare ser-update-data-retention-operation)

(clojure.core/declare ser-resource-tags)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-api-name)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-list-streams-input-limit)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-device-name)

(clojure.core/declare ser-version)

(clojure.core/declare ser-data-retention-change-in-hours)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-stream-name-condition)

(clojure.core/defn- ser-stream-name [input] #:http.request.field{:value input, :shape "StreamName"})

(clojure.core/defn- ser-media-type [input] #:http.request.field{:value input, :shape "MediaType"})

(clojure.core/defn- ser-data-retention-in-hours [input] #:http.request.field{:value input, :shape "DataRetentionInHours"})

(clojure.core/defn- ser-update-data-retention-operation [input] #:http.request.field{:value (clojure.core/get {"INCREASE_DATA_RETENTION" "INCREASE_DATA_RETENTION", :increase-data-retention "INCREASE_DATA_RETENTION", "DECREASE_DATA_RETENTION" "DECREASE_DATA_RETENTION", :decrease-data-retention "DECREASE_DATA_RETENTION"} input), :shape "UpdateDataRetentionOperation"})

(clojure.core/defn- ser-resource-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "ResourceTags", :type "map", :max 50, :min 1})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {"BEGINS_WITH" "BEGINS_WITH", :begins-with "BEGINS_WITH"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-api-name [input] #:http.request.field{:value (clojure.core/get {:get-hls-streaming-session-url "GET_HLS_STREAMING_SESSION_URL", "GET_HLS_STREAMING_SESSION_URL" "GET_HLS_STREAMING_SESSION_URL", :list-fragments "LIST_FRAGMENTS", "GET_MEDIA_FOR_FRAGMENT_LIST" "GET_MEDIA_FOR_FRAGMENT_LIST", :put-media "PUT_MEDIA", :get-media-for-fragment-list "GET_MEDIA_FOR_FRAGMENT_LIST", :get-media "GET_MEDIA", "PUT_MEDIA" "PUT_MEDIA", "LIST_FRAGMENTS" "LIST_FRAGMENTS", "GET_MEDIA" "GET_MEDIA"} input), :shape "APIName"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-list-streams-input-limit [input] #:http.request.field{:value input, :shape "ListStreamsInputLimit"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-device-name [input] #:http.request.field{:value input, :shape "DeviceName"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-data-retention-change-in-hours [input] #:http.request.field{:value input, :shape "DataRetentionChangeInHours"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-stream-name-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamNameCondition", :type "structure"} (clojure.core/contains? input :comparison-operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparison-operator (input :comparison-operator)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"})) (clojure.core/contains? input :comparison-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :comparison-value)) #:http.request.field{:name "ComparisonValue", :shape "StreamName"}))))

(clojure.core/defn- req-untag-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-key-list (input :tag-key-list)) #:http.request.field{:name "TagKeyList", :shape "TagKeyList"})]} (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"})) (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}))))

(clojure.core/defn- req-tag-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-tags (input :tags)) #:http.request.field{:name "Tags", :shape "ResourceTags"})]} (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"})) (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}))))

(clojure.core/defn- req-update-data-retention-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-version (input :current-version)) #:http.request.field{:name "CurrentVersion", :shape "Version"}) (clojure.core/into (ser-update-data-retention-operation (input :operation)) #:http.request.field{:name "Operation", :shape "UpdateDataRetentionOperation"}) (clojure.core/into (ser-data-retention-change-in-hours (input :data-retention-change-in-hours)) #:http.request.field{:name "DataRetentionChangeInHours", :shape "DataRetentionChangeInHours"})]} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"}))))

(clojure.core/defn- req-create-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]} (clojure.core/contains? input :device-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-name (input :device-name)) #:http.request.field{:name "DeviceName", :shape "DeviceName"})) (clojure.core/contains? input :media-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-media-type (input :media-type)) #:http.request.field{:name "MediaType", :shape "MediaType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :data-retention-in-hours) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-retention-in-hours (input :data-retention-in-hours)) #:http.request.field{:name "DataRetentionInHours", :shape "DataRetentionInHours"}))))

(clojure.core/defn- req-update-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-version (input :current-version)) #:http.request.field{:name "CurrentVersion", :shape "Version"})]} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"})) (clojure.core/contains? input :device-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-name (input :device-name)) #:http.request.field{:name "DeviceName", :shape "DeviceName"})) (clojure.core/contains? input :media-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-media-type (input :media-type)) #:http.request.field{:name "MediaType", :shape "MediaType"}))))

(clojure.core/defn- req-list-tags-for-stream-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"})) (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}))))

(clojure.core/defn- req-list-streams-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-streams-input-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListStreamsInputLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :stream-name-condition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name-condition (input :stream-name-condition)) #:http.request.field{:name "StreamNameCondition", :shape "StreamNameCondition"}))))

(clojure.core/defn- req-delete-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"})]} (clojure.core/contains? input :current-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :current-version)) #:http.request.field{:name "CurrentVersion", :shape "Version"}))))

(clojure.core/defn- req-get-data-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-api-name (input :api-name)) #:http.request.field{:name "APIName", :shape "APIName"})]} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"}))))

(clojure.core/defn- req-describe-stream-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"}))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.tags-per-resource-exceeded-limit-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tags-per-resource-exceeded-limit-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.tags-per-resource-exceeded-limit-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.untag-stream-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30/tag-key-list] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.untag-stream-input/stream-arn :portkey.aws.kinesisvideo.-2017-09-30/stream-name]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.stream-info/creation-time (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.stream-info/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-name :portkey.aws.kinesisvideo.-2017-09-30/media-type :portkey.aws.kinesisvideo.-2017-09-30/data-retention-in-hours :portkey.aws.kinesisvideo.-2017-09-30/status :portkey.aws.kinesisvideo.-2017-09-30/kms-key-id :portkey.aws.kinesisvideo.-2017-09-30.stream-info/creation-time :portkey.aws.kinesisvideo.-2017-09-30/device-name :portkey.aws.kinesisvideo.-2017-09-30.stream-info/stream-arn :portkey.aws.kinesisvideo.-2017-09-30/version]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.version-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/version-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.version-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/media-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\w\-\.\+]+/[\w\-\.\+]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/data-retention-in-hours (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-operation #{"INCREASE_DATA_RETENTION" "DECREASE_DATA_RETENTION" :decrease-data-retention :increase-data-retention})

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/tags (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-tags))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/tags] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.tag-stream-input/stream-arn :portkey.aws.kinesisvideo.-2017-09-30/stream-name]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-output/tags (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-tags))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/next-token :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-output/tags]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/operation (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-operation))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/current-version :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/operation :portkey.aws.kinesisvideo.-2017-09-30/data-retention-change-in-hours] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-name :portkey.aws.kinesisvideo.-2017-09-30.update-data-retention-input/stream-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resource-tags (clojure.spec.alpha/map-of :portkey.aws.kinesisvideo.-2017-09-30/tag-key :portkey.aws.kinesisvideo.-2017-09-30/tag-value))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-info]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-info-list (clojure.spec.alpha/coll-of :portkey.aws.kinesisvideo.-2017-09-30/stream-info))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/comparison-operator #{"BEGINS_WITH" :begins-with})

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/api-name #{:get-hls-streaming-session-url "GET_HLS_STREAMING_SESSION_URL" :list-fragments "GET_MEDIA_FOR_FRAGMENT_LIST" :put-media :get-media-for-fragment-list :get-media "PUT_MEDIA" "LIST_FRAGMENTS" "GET_MEDIA"})

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/status #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/create-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-name] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/device-name :portkey.aws.kinesisvideo.-2017-09-30/media-type :portkey.aws.kinesisvideo.-2017-09-30/kms-key-id :portkey.aws.kinesisvideo.-2017-09-30/data-retention-in-hours]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.kinesisvideo.-2017-09-30/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-streams-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-info-list :portkey.aws.kinesisvideo.-2017-09-30/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.invalid-device-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/invalid-device-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.invalid-device-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.client-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/current-version] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-name :portkey.aws.kinesisvideo.-2017-09-30.update-stream-input/stream-arn :portkey.aws.kinesisvideo.-2017-09-30/device-name :portkey.aws.kinesisvideo.-2017-09-30/media-type]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.device-stream-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/device-stream-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.device-stream-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/next-token :portkey.aws.kinesisvideo.-2017-09-30.list-tags-for-stream-input/stream-arn :portkey.aws.kinesisvideo.-2017-09-30/stream-name]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/data-endpoint]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.list-streams-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.list-streams-input/max-results :portkey.aws.kinesisvideo.-2017-09-30/next-token :portkey.aws.kinesisvideo.-2017-09-30/stream-name-condition]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/data-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.create-stream-output/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/create-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.create-stream-output/stream-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.invalid-resource-format-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.invalid-resource-format-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/data-retention-change-in-hours (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/stream-arn] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.delete-stream-input/current-version]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.get-data-endpoint-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisvideo.-2017-09-30/api-name] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-name :portkey.aws.kinesisvideo.-2017-09-30.get-data-endpoint-input/stream-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.account-stream-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/account-stream-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30.account-stream-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/update-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.describe-stream-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/stream-name :portkey.aws.kinesisvideo.-2017-09-30.describe-stream-input/stream-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30.stream-name-condition/comparison-value (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.-2017-09-30/stream-name-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.-2017-09-30/comparison-operator :portkey.aws.kinesisvideo.-2017-09-30.stream-name-condition/comparison-value]))

(clojure.core/defn delete-stream ([delete-stream-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-stream-input delete-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteStream", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStream", :http.request.spec/error-spec {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception}})))))
(clojure.spec.alpha/fdef delete-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/delete-stream-output))

(clojure.core/defn get-data-endpoint ([get-data-endpoint-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-data-endpoint-input get-data-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getDataEndpoint", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDataEndpoint", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception}})))))
(clojure.spec.alpha/fdef get-data-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/get-data-endpoint-output))

(clojure.core/defn list-streams ([] (list-streams {})) ([list-streams-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-streams-input list-streams-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/list-streams-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listStreams", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreams", :http.request.spec/error-spec {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo.-2017-09-30/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/list-streams-output))

(clojure.core/defn update-stream ([update-stream-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-stream-input update-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/update-stream-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateStream", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/update-stream-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStream", :http.request.spec/error-spec {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "VersionMismatchException" :portkey.aws.kinesisvideo.-2017-09-30/version-mismatch-exception}})))))
(clojure.spec.alpha/fdef update-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/update-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/update-stream-output))

(clojure.core/defn create-stream ([create-stream-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-stream-input create-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/create-stream-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createStream", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/create-stream-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStream", :http.request.spec/error-spec {"AccountStreamLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/account-stream-limit-exceeded-exception, "DeviceStreamLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/device-stream-limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception, "InvalidDeviceException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-device-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/create-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/create-stream-output))

(clojure.core/defn describe-stream ([] (describe-stream {})) ([describe-stream-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-stream-input describe-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeStream", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStream", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception}})))))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/describe-stream-output))

(clojure.core/defn list-tags-for-stream ([] (list-tags-for-stream {})) ([list-tags-for-stream-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-tags-for-stream-input list-tags-for-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listTagsForStream", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForStream", :http.request.spec/error-spec {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-stream :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/list-tags-for-stream-output))

(clojure.core/defn update-data-retention ([update-data-retention-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-data-retention-input update-data-retention-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateDataRetention", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDataRetention", :http.request.spec/error-spec {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisvideo.-2017-09-30/resource-in-use-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "VersionMismatchException" :portkey.aws.kinesisvideo.-2017-09-30/version-mismatch-exception}})))))
(clojure.spec.alpha/fdef update-data-retention :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/update-data-retention-output))

(clojure.core/defn tag-stream ([tag-stream-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-tag-stream-input tag-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tagStream", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagStream", :http.request.spec/error-spec {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception, "TagsPerResourceExceededLimitException" :portkey.aws.kinesisvideo.-2017-09-30/tags-per-resource-exceeded-limit-exception}})))))
(clojure.spec.alpha/fdef tag-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/tag-stream-output))

(clojure.core/defn untag-stream ([untag-stream-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-untag-stream-input untag-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisvideo.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/untagStream", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video", :http.request.spec/input-spec :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagStream", :http.request.spec/error-spec {"ClientLimitExceededException" :portkey.aws.kinesisvideo.-2017-09-30/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo.-2017-09-30/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo.-2017-09-30/invalid-resource-format-exception}})))))
(clojure.spec.alpha/fdef untag-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo.-2017-09-30/untag-stream-output))
