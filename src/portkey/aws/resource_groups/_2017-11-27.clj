(ns portkey.aws.resource-groups.-2017-11-27 (:require [portkey.aws]))

(def endpoints 'nil)

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

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-identifier-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups.-2017-11-27/resource-identifier) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/forbidden-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.forbidden-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups.-2017-11-27/group) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/update-group-query-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/GroupQuery] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.untag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.untag-output/keys (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/untag-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.untag-output/Arn :portkey.aws.resource-groups.-2017-11-27.untag-output/Keys] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.list-group-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/list-group-resources-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.list-group-resources-output/ResourceIdentifiers :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tags (clojure.spec.alpha/map-of :portkey.aws.resource-groups.-2017-11-27/tag-key :portkey.aws.resource-groups.-2017-11-27/tag-value))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-query (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName :portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\.-]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.update-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/update-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [:portkey.aws.resource-groups.-2017-11-27.update-group-input/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.create-group-input/name (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.create-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/create-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.create-group-input/Name :portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [:portkey.aws.resource-groups.-2017-11-27.create-group-input/Description :portkey.aws.resource-groups.-2017-11-27/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.list-groups-output/groups (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/list-groups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.list-groups-output/Groups :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.too-many-requests-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.tag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.tag-output/Arn :portkey.aws.resource-groups.-2017-11-27/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.get-tags-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.get-tags-input/Arn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups.-2017-11-27/tag-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/search-resources-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [:portkey.aws.resource-groups.-2017-11-27/MaxResults :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 0 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 256)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.search-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/search-resources-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.search-resources-output/ResourceIdentifiers :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/Group] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27.not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/delete-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/update-group-query-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName :portkey.aws.resource-groups.-2017-11-27/ResourceQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"AWS::[a-zA-Z0-9]+::\w+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-identifier (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/ResourceArn :portkey.aws.resource-groups.-2017-11-27/ResourceType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27.tag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/tag-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27.tag-input/Arn :portkey.aws.resource-groups.-2017-11-27/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/create-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.-2017-11-27/Group :portkey.aws.resource-groups.-2017-11-27/ResourceQuery :portkey.aws.resource-groups.-2017-11-27/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/list-group-resources-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [:portkey.aws.resource-groups.-2017-11-27/MaxResults :portkey.aws.resource-groups.-2017-11-27/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/get-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.-2017-11-27/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/query-type (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"TAG_FILTERS_1_0" "TAG_FILTERS_1_0", :tag-filters-1-0 "TAG_FILTERS_1_0"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"arn:aws:[a-z0-9]*:([a-z]{2}-[a-z]+-\d{1})?:([0-9]{12})?:.+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"arn:aws:resource-groups:[a-z]{2}-[a-z]+-\d{1}:[0-9]{12}:group/[a-zA-Z0-9_\.-]{1,128}" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__14021__14022__auto__] (clojure.core/<= 1 p1__14021__14022__auto__)) (fn* [p1__14023__14024__auto__] (clojure.core/<= p1__14023__14024__auto__ 50))))

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

(clojure.spec.alpha/def :portkey.aws.resource-groups.-2017-11-27/group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 512)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[\sa-zA-Z0-9_\.-]+" s__13963__auto__))))

(clojure.core/defn delete-group ([delete-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "DELETE" "/groups/{GroupName}" delete-group-input :portkey.aws.resource-groups.-2017-11-27/delete-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/delete-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/delete-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/delete-group-output))

(clojure.core/defn get-tags ([get-tags-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/resources/{Arn}/tags" get-tags-input :portkey.aws.resource-groups.-2017-11-27/get-tags-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/get-tags-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/get-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/get-tags-output))

(clojure.core/defn list-groups ([] (list-groups {})) ([list-groups-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups" list-groups-input :portkey.aws.resource-groups.-2017-11-27/list-groups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} nil :portkey.aws.resource-groups.-2017-11-27/list-groups-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.resource-groups.-2017-11-27/list-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/list-groups-output))

(clojure.core/defn untag ([untag-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PATCH" "/resources/{Arn}/tags" untag-input :portkey.aws.resource-groups.-2017-11-27/untag-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/untag-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef untag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/untag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/untag-output))

(clojure.core/defn update-group-query ([update-group-query-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PUT" "/groups/{GroupName}/query" update-group-query-input :portkey.aws.resource-groups.-2017-11-27/update-group-query-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/update-group-query-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/update-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/update-group-query-output))

(clojure.core/defn get-group ([get-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups/{GroupName}" get-group-input :portkey.aws.resource-groups.-2017-11-27/get-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/get-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/get-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/get-group-output))

(clojure.core/defn update-group ([update-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PUT" "/groups/{GroupName}" update-group-input :portkey.aws.resource-groups.-2017-11-27/update-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/update-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/update-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/update-group-output))

(clojure.core/defn get-group-query ([get-group-query-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups/{GroupName}/query" get-group-query-input :portkey.aws.resource-groups.-2017-11-27/get-group-query-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/get-group-query-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/get-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/get-group-query-output))

(clojure.core/defn search-resources ([search-resources-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "POST" "/resources/search" search-resources-input :portkey.aws.resource-groups.-2017-11-27/search-resources-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/search-resources-output {"UnauthorizedException" :portkey.aws.resource-groups.-2017-11-27/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef search-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/search-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/search-resources-output))

(clojure.core/defn tag ([tag-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "PUT" "/resources/{Arn}/tags" tag-input :portkey.aws.resource-groups.-2017-11-27/tag-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/tag-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef tag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/tag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/tag-output))

(clojure.core/defn list-group-resources ([list-group-resources-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "GET" "/groups/{GroupName}/resource-identifiers" list-group-resources-input :portkey.aws.resource-groups.-2017-11-27/list-group-resources-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} nil :portkey.aws.resource-groups.-2017-11-27/list-group-resources-output {"UnauthorizedException" :portkey.aws.resource-groups.-2017-11-27/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups.-2017-11-27/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-group-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/list-group-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/list-group-resources-output))

(clojure.core/defn create-group ([create-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups.-2017-11-27/endpoints "POST" "/groups" create-group-input :portkey.aws.resource-groups.-2017-11-27/create-group-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.resource-groups.-2017-11-27/create-group-output {"BadRequestException" :portkey.aws.resource-groups.-2017-11-27/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups.-2017-11-27/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups.-2017-11-27/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups.-2017-11-27/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups.-2017-11-27/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups.-2017-11-27/create-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups.-2017-11-27/create-group-output))
