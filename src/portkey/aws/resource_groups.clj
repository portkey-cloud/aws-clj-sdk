(ns portkey.aws.resource-groups (:require [portkey.aws]))

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
   "eu-west-3"
   {:credential-scope
    {:service "resource-groups", :region "eu-west-3"},
    :ssl-common-name "resource-groups.eu-west-3.amazonaws.com",
    :endpoint "https://resource-groups.eu-west-3.amazonaws.com",
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

(clojure.core/declare ser-resource-filter-values)

(clojure.core/declare ser-resource-filter-list)

(clojure.core/declare ser-resource-query)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-resource-filter)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-group-name)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-query)

(clojure.core/declare ser-resource-filter-name)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-query-type)

(clojure.core/declare ser-resource-filter-value)

(clojure.core/declare ser-group-arn)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-group-description)

(clojure.core/defn- ser-resource-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-filter-value coll) #:http.request.field{:shape "ResourceFilterValue"}))) input), :shape "ResourceFilterValues", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-resource-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-filter coll) #:http.request.field{:shape "ResourceFilter"}))) input), :shape "ResourceFilterList", :type "list"})

(clojure.core/defn- ser-resource-query [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-query-type (:type input)) #:http.request.field{:name "Type", :shape "QueryType"}) (clojure.core/into (ser-query (:query input)) #:http.request.field{:name "Query", :shape "Query"})], :shape "ResourceQuery", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-resource-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-filter-name (:name input)) #:http.request.field{:name "Name", :shape "ResourceFilterName"}) (clojure.core/into (ser-resource-filter-values (:values input)) #:http.request.field{:name "Values", :shape "ResourceFilterValues"})], :shape "ResourceFilter", :type "structure"}))

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-group-name [input] #:http.request.field{:value input, :shape "GroupName"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-query [input] #:http.request.field{:value input, :shape "Query"})

(clojure.core/defn- ser-resource-filter-name [input] #:http.request.field{:value (clojure.core/get {"resource-type" "resource-type", :resourcetype "resource-type"} input), :shape "ResourceFilterName"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-query-type [input] #:http.request.field{:value (clojure.core/get {"TAG_FILTERS_1_0" "TAG_FILTERS_1_0", :tag-filters-1-0 "TAG_FILTERS_1_0"} input), :shape "QueryType"})

(clojure.core/defn- ser-resource-filter-value [input] #:http.request.field{:value input, :shape "ResourceFilterValue"})

(clojure.core/defn- ser-group-arn [input] #:http.request.field{:value input, :shape "GroupArn"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-group-description [input] #:http.request.field{:value input, :shape "GroupDescription"})

(clojure.core/defn- req-list-groups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-get-group-query-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName", :location "uri", :location-name "GroupName"})]}))

(clojure.core/defn- req-update-group-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName", :location "uri", :location-name "GroupName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-description (input :description)) #:http.request.field{:name "Description", :shape "GroupDescription"}))))

(clojure.core/defn- req-create-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-group-name (input :name)) #:http.request.field{:name "Name", :shape "GroupName"}) (clojure.core/into (ser-resource-query (input :resource-query)) #:http.request.field{:name "ResourceQuery", :shape "ResourceQuery"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-description (input :description)) #:http.request.field{:name "Description", :shape "GroupDescription"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-get-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-arn (input :arn)) #:http.request.field{:name "Arn", :shape "GroupArn", :location "uri", :location-name "Arn"})]}))

(clojure.core/defn- req-search-resources-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-query (input :resource-query)) #:http.request.field{:name "ResourceQuery", :shape "ResourceQuery"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-group-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName", :location "uri", :location-name "GroupName"})]}))

(clojure.core/defn- req-update-group-query-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName", :location "uri", :location-name "GroupName"})], :body [(clojure.core/into (ser-resource-query (input :resource-query)) #:http.request.field{:name "ResourceQuery", :shape "ResourceQuery"})]}))

(clojure.core/defn- req-tag-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-arn (input :arn)) #:http.request.field{:name "Arn", :shape "GroupArn", :location "uri", :location-name "Arn"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-list-group-resources-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName", :location "uri", :location-name "GroupName"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "ResourceFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-get-group-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName", :location "uri", :location-name "GroupName"})]}))

(clojure.core/defn- req-untag-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-group-arn (input :arn)) #:http.request.field{:name "Arn", :shape "GroupArn", :location "uri", :location-name "Arn"})], :body [(clojure.core/into (ser-tag-key-list (input :keys)) #:http.request.field{:name "Keys", :shape "TagKeyList"})]}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-values (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/resource-filter-value :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.resource-groups.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/method-not-allowed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.method-not-allowed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/list-groups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/max-results :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/resource-filter))

(clojure.spec.alpha/def :portkey.aws.resource-groups.resource-query/type (clojure.spec.alpha/and :portkey.aws.resource-groups/query-type))
(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-query (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.resource-query/type :portkey.aws.resource-groups/query] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/resource-identifier))

(clojure.spec.alpha/def :portkey.aws.resource-groups.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/group))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group-query]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-output/keys (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/untag-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.untag-output/arn :portkey.aws.resource-groups.untag-output/keys]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-group-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-group-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.list-group-resources-output/resource-identifiers :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.resource-filter/name (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-filter-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.resource-filter/values (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-filter-values))
(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.resource-filter/name :portkey.aws.resource-groups.resource-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tags (clojure.spec.alpha/map-of :portkey.aws.resource-groups/tag-key :portkey.aws.resource-groups/tag-value))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-query (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name :portkey.aws.resource-groups/resource-query] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\.-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.update-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un [:portkey.aws.resource-groups.update-group-input/description]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.create-group-input/name (clojure.spec.alpha/and :portkey.aws.resource-groups/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.create-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/create-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.create-group-input/name :portkey.aws.resource-groups/resource-query] :opt-un [:portkey.aws.resource-groups.create-group-input/description :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-groups-output/groups (clojure.spec.alpha/and :portkey.aws.resource-groups/group-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.list-groups-output/groups :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resource-groups/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-name #{:resourcetype "resource-type"})

(clojure.spec.alpha/def :portkey.aws.resource-groups.tag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.tag-output/arn :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.get-tags-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/get-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.get-tags-input/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/tag-key))

(clojure.spec.alpha/def :portkey.aws.resource-groups/search-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/resource-query] :opt-un [:portkey.aws.resource-groups/max-results :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.search-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/search-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.search-resources-output/resource-identifiers :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/delete-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name :portkey.aws.resource-groups/resource-query] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"AWS::[a-zA-Z0-9]+::\w+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/resource-arn :portkey.aws.resource-groups/resource-type]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.tag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.tag-input/arn :portkey.aws.resource-groups/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/create-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group :portkey.aws.resource-groups/resource-query :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-group-resources-input/filters (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-filter-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-group-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un [:portkey.aws.resource-groups.list-group-resources-input/filters :portkey.aws.resource-groups/max-results :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query-type #{"TAG_FILTERS_1_0" :tag-filters-1-0})

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws:[a-z0-9\-]*:([a-z]{2}-[a-z]+-\d{1})?:([0-9]{12})?:.+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"AWS::[a-zA-Z0-9]+::[a-zA-Z0-9]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws:resource-groups:[a-z]{2}-[a-z]+-\d{1}:[0-9]{12}:group/[a-zA-Z0-9_\.-]{1,128}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.resource-groups.get-tags-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/get-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.get-tags-output/arn :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.group/name (clojure.spec.alpha/and :portkey.aws.resource-groups/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.group/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/group (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-arn :portkey.aws.resource-groups.group/name] :opt-un [:portkey.aws.resource-groups.group/description]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group-query]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/delete-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-input/keys (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/untag-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.untag-input/arn :portkey.aws.resource-groups.untag-input/keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\sa-zA-Z0-9_\.-]*" s__27882__auto__))))

(clojure.core/defn delete-group ([delete-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-group-input delete-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/delete-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/delete-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGroup", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/delete-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/delete-group-output))

(clojure.core/defn get-tags ([get-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-tags-input get-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/get-tags-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/{Arn}/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/get-tags-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTags", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-tags-output))

(clojure.core/defn list-groups ([] (list-groups {})) ([list-groups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-groups-input list-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/list-groups-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups-list", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/list-groups-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGroups", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.resource-groups/list-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/list-groups-output))

(clojure.core/defn untag ([untag-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-untag-input untag-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/untag-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/{Arn}/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/untag-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "Untag", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef untag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/untag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/untag-output))

(clojure.core/defn update-group-query ([update-group-query-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-group-query-input update-group-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/update-group-query-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}/query", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/update-group-query-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGroupQuery", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/update-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/update-group-query-output))

(clojure.core/defn get-group ([get-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-group-input get-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/get-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/get-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGroup", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-group-output))

(clojure.core/defn update-group ([update-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-group-input update-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/update-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/update-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGroup", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/update-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/update-group-output))

(clojure.core/defn get-group-query ([get-group-query-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-group-query-input get-group-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/get-group-query-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}/query", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/get-group-query-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGroupQuery", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-group-query-output))

(clojure.core/defn search-resources ([search-resources-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-search-resources-input search-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/search-resources-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/search", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/search-resources-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchResources", :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.resource-groups/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef search-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/search-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/search-resources-output))

(clojure.core/defn tag ([tag-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-tag-input tag-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/tag-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/{Arn}/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/tag-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "Tag", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef tag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/tag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-output))

(clojure.core/defn list-group-resources ([list-group-resources-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-group-resources-input list-group-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/list-group-resources-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}/resource-identifiers-list", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/list-group-resources-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGroupResources", :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.resource-groups/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-group-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/list-group-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/list-group-resources-output))

(clojure.core/defn create-group ([create-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-group-input create-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/create-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/create-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGroup", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/create-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/create-group-output))
