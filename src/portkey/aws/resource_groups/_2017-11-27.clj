(ns portkey.aws.resource-groups.-2017-11-27 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "resource-groups", :region "ap-northeast-1"},
    :ssl-common-name "resource-groups.ap-northeast-1.amazonaws.com",
    :endpoint "https://resource-groups.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "resource-groups", :region "eu-west-1"},
    :ssl-common-name "resource-groups.eu-west-1.amazonaws.com",
    :endpoint "https://resource-groups.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "resource-groups", :region "us-east-2"},
    :ssl-common-name "resource-groups.us-east-2.amazonaws.com",
    :endpoint "https://resource-groups.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "resource-groups", :region "ap-southeast-2"},
    :ssl-common-name "resource-groups.ap-southeast-2.amazonaws.com",
    :endpoint "https://resource-groups.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "resource-groups", :region "sa-east-1"},
    :ssl-common-name "resource-groups.sa-east-1.amazonaws.com",
    :endpoint "https://resource-groups.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "resource-groups", :region "ap-southeast-1"},
    :ssl-common-name "resource-groups.ap-southeast-1.amazonaws.com",
    :endpoint "https://resource-groups.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "resource-groups", :region "ap-northeast-2"},
    :ssl-common-name "resource-groups.ap-northeast-2.amazonaws.com",
    :endpoint "https://resource-groups.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "resource-groups", :region "ca-central-1"},
    :ssl-common-name "resource-groups.ca-central-1.amazonaws.com",
    :endpoint "https://resource-groups.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "resource-groups", :region "eu-central-1"},
    :ssl-common-name "resource-groups.eu-central-1.amazonaws.com",
    :endpoint "https://resource-groups.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "resource-groups", :region "eu-west-2"},
    :ssl-common-name "resource-groups.eu-west-2.amazonaws.com",
    :endpoint "https://resource-groups.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "resource-groups", :region "us-west-2"},
    :ssl-common-name "resource-groups.us-west-2.amazonaws.com",
    :endpoint "https://resource-groups.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "resource-groups", :region "us-east-1"},
    :ssl-common-name "resource-groups.us-east-1.amazonaws.com",
    :endpoint "https://resource-groups.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "resource-groups", :region "us-west-1"},
    :ssl-common-name "resource-groups.us-west-1.amazonaws.com",
    :endpoint "https://resource-groups.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "resource-groups", :region "ap-south-1"},
    :ssl-common-name "resource-groups.ap-south-1.amazonaws.com",
    :endpoint "https://resource-groups.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.internal-server-error-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.method-not-allowed-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.unauthorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/update-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/Group] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/list-groups-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/MaxResults :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-group-query-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.bad-request-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.resource-query/type (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/query-type))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-query (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.resource-query/Type :portkey.aws.resource-groups.-2017-11-27/Query] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-identifier-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups.-2017-11-27/resource-identifier) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/forbidden-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.forbidden-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups.-2017-11-27/group) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/update-group-query-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/GroupQuery] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.untag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.untag-output/keys (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/untag-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.untag-output/Arn :portkey.aws.resource-groups.-2017-11-27.untag-output/Keys] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.list-group-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/list-group-resources-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.list-group-resources-output/ResourceIdentifiers :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tags (clojure.spec.alpha/map-of :portkey.aws.resource-groups.-2017-11-27/tag-key :portkey.aws.resource-groups.-2017-11-27/tag-value))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-query (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName :portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\.-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.update-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/update-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [:portkey.aws.resource-groups.-2017-11-27.update-group-input/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.create-group-input/name (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.create-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/create-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.create-group-input/Name :portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [:portkey.aws.resource-groups.-2017-11-27.create-group-input/Description :portkey.aws.resource-groups.-2017-11-27/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.list-groups-output/groups (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/list-groups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.list-groups-output/Groups :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.too-many-requests-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.tag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.tag-output/Arn :portkey.aws.resource-groups.-2017-11-27/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.get-tags-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.get-tags-input/Arn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups.-2017-11-27/tag-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/search-resources-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [:portkey.aws.resource-groups.-2017-11-27/MaxResults :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.search-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/search-resources-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.search-resources-output/ResourceIdentifiers :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/Group] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/delete-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/update-group-query-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName :portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"AWS::[a-zA-Z0-9]+::\w+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-identifier (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/ResourceArn :portkey.aws.resource-groups.-2017-11-27/ResourceType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.tag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.tag-input/Arn :portkey.aws.resource-groups.-2017-11-27/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/create-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/Group :portkey.aws.resource-groups.-2017-11-27/ResourceQuery :portkey.aws.resource-groups.-2017-11-27/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/list-group-resources-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [:portkey.aws.resource-groups.-2017-11-27/MaxResults :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/query-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"TAG_FILTERS_1_0" "TAG_FILTERS_1_0", :tag-filters-1-0 "TAG_FILTERS_1_0"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:[a-z0-9]*:([a-z]{2}-[a-z]+-\d{1})?:([0-9]{12})?:.+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:resource-groups:[a-z]{2}-[a-z]+-\d{1}:[0-9]{12}:group/[a-zA-Z0-9_\.-]{1,128}" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 50))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.get-tags-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-tags-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.get-tags-output/Arn :portkey.aws.resource-groups.-2017-11-27/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.group/name (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.group/description (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupArn :portkey.aws.resource-groups.-2017-11-27.group/Name] :opt-un [:portkey.aws.resource-groups.-2017-11-27.group/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-group-query-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/GroupQuery] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/delete-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/Group] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.untag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.untag-input/keys (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/untag-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.untag-input/Arn :portkey.aws.resource-groups.-2017-11-27.untag-input/Keys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 512)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\sa-zA-Z0-9_\.-]+" s__13770__auto__))))

(clojure.core/defn delete-group "Deletes a specified resource group. Deleting a resource group does not delete\nresources that are members of the group; it only deletes the group structure." ([delete-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "DELETE" "/groups/{GroupName}" delete-group-input :portkey.aws.resource-groups.-2017-11-27/delete-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/delete-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/delete-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/delete-group-output))

(clojure.core/defn get-tags "Returns a list of tags that are associated with a resource, specified by an ARN." ([get-tags-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/resources/{Arn}/tags" get-tags-input :portkey.aws.resource-groups.-2017-11-27/get-tags-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/get-tags-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/get-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/get-tags-output))

(clojure.core/defn list-groups "Returns a list of existing resource groups in your account." ([] (list-groups {})) ([list-groups-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups" list-groups-input :portkey.aws.resource-groups.-2017-11-27/list-groups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} nil :portkey.aws.resource-groups.-2017-11-27/list-groups-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.resource-groups.-2017-11-27/list-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/list-groups-output))

(clojure.core/defn untag "Deletes specified tags from a specified resource." ([untag-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PATCH" "/resources/{Arn}/tags" untag-input :portkey.aws.resource-groups.-2017-11-27/untag-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/untag-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef untag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/untag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/untag-output))

(clojure.core/defn update-group-query "Updates the resource query of a group." ([update-group-query-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PUT" "/groups/{GroupName}/query" update-group-query-input :portkey.aws.resource-groups.-2017-11-27/update-group-query-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/update-group-query-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/update-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/update-group-query-output))

(clojure.core/defn get-group "Returns information about a specified resource group." ([get-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups/{GroupName}" get-group-input :portkey.aws.resource-groups.-2017-11-27/get-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/get-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/get-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/get-group-output))

(clojure.core/defn update-group "Updates an existing group with a new or changed description. You cannot update\nthe name of a resource group." ([update-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PUT" "/groups/{GroupName}" update-group-input :portkey.aws.resource-groups.-2017-11-27/update-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/update-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/update-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/update-group-output))

(clojure.core/defn get-group-query "Returns the resource query associated with the specified resource group." ([get-group-query-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups/{GroupName}/query" get-group-query-input :portkey.aws.resource-groups.-2017-11-27/get-group-query-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/get-group-query-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/get-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/get-group-query-output))

(clojure.core/defn search-resources "Returns a list of AWS resource identifiers that matches a specified query. The\nquery uses the same format as a resource query in a CreateGroup or\nUpdateGroupQuery operation." ([search-resources-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "POST" "/resources/search" search-resources-input :portkey.aws.resource-groups.-2017-11-27/search-resources-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/search-resources-output {"UnauthorizedException" :portkey.aws.resource-groups.-2017-11-27/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef search-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/search-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/search-resources-output))

(clojure.core/defn tag "Adds specified tags to a resource with the specified ARN. Existing tags on a\nresource are not changed if they are not specified in the request parameters." ([tag-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PUT" "/resources/{Arn}/tags" tag-input :portkey.aws.resource-groups.-2017-11-27/tag-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/tag-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef tag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/tag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/tag-output))

(clojure.core/defn list-group-resources "Returns a list of ARNs of resources that are members of a specified resource\ngroup." ([list-group-resources-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups/{GroupName}/resource-identifiers" list-group-resources-input :portkey.aws.resource-groups.-2017-11-27/list-group-resources-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} nil :portkey.aws.resource-groups.-2017-11-27/list-group-resources-output {"UnauthorizedException" :portkey.aws.resource-groups.-2017-11-27/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-group-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/list-group-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/list-group-resources-output))

(clojure.core/defn create-group "Creates a group with a specified name, description, and resource query." ([create-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "POST" "/groups" create-group-input :portkey.aws.resource-groups.-2017-11-27/create-group-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/create-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/create-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/create-group-output))
