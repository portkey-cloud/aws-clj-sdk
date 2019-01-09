(ns portkey.aws.resourcegroupstaggingapi (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-tag-value-list)

(clojure.core/declare ser-amazon-resource-type)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags-per-page)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-resource-arn-list)

(clojure.core/declare ser-resource-type-filter-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-tag-map)

(clojure.core/declare ser-tag-key-list-for-untag)

(clojure.core/declare ser-resources-per-page)

(clojure.core/declare ser-tag-filter)

(clojure.core/declare ser-tag-filter-list)

(clojure.core/declare ser-resource-arn)

(clojure.core/defn- ser-tag-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-value coll) #:http.request.field{:shape "TagValue"}))) input), :shape "TagValueList", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-amazon-resource-type [input] #:http.request.field{:value input, :shape "AmazonResourceType"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags-per-page [input] #:http.request.field{:value input, :shape "TagsPerPage"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-resource-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceARN"}))) input), :shape "ResourceARNList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-resource-type-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-amazon-resource-type coll) #:http.request.field{:shape "AmazonResourceType"}))) input), :shape "ResourceTypeFilterList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-tag-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "TagMap", :type "map", :max 50, :min 1})

(clojure.core/defn- ser-tag-key-list-for-untag [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyListForUntag", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-resources-per-page [input] #:http.request.field{:value input, :shape "ResourcesPerPage"})

(clojure.core/defn- ser-tag-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value-list (input :values)) #:http.request.field{:name "Values", :shape "TagValueList"}))))

(clojure.core/defn- ser-tag-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagFilterList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- req-tag-resources-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn-list (input :resource-arn-list)) #:http.request.field{:name "ResourceARNList", :shape "ResourceARNList"}) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagMap"})]}))

(clojure.core/defn- req-untag-resources-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn-list (input :resource-arn-list)) #:http.request.field{:name "ResourceARNList", :shape "ResourceARNList"}) (clojure.core/into (ser-tag-key-list-for-untag (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyListForUntag"})]}))

(clojure.core/defn- req-get-tag-keys-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :pagination-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :pagination-token)) #:http.request.field{:name "PaginationToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-get-resources-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :pagination-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :pagination-token)) #:http.request.field{:name "PaginationToken", :shape "PaginationToken"})) (clojure.core/contains? input :tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter-list (input :tag-filters)) #:http.request.field{:name "TagFilters", :shape "TagFilterList"})) (clojure.core/contains? input :resources-per-page) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resources-per-page (input :resources-per-page)) #:http.request.field{:name "ResourcesPerPage", :shape "ResourcesPerPage"})) (clojure.core/contains? input :tags-per-page) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-per-page (input :tags-per-page)) #:http.request.field{:name "TagsPerPage", :shape "TagsPerPage"})) (clojure.core/contains? input :resource-type-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type-filter-list (input :resource-type-filters)) #:http.request.field{:name "ResourceTypeFilters", :shape "ResourceTypeFilterList"}))))

(clojure.core/defn- req-get-tag-values-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})]} (clojure.core/contains? input :pagination-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :pagination-token)) #:http.request.field{:name "PaginationToken", :shape "PaginationToken"}))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-value-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/tag-value :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/failed-resources-map]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/amazon-resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/status-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/failed-resources-map (clojure.spec.alpha/map-of :portkey.aws.resourcegroupstaggingapi/resource-arn :portkey.aws.resourcegroupstaggingapi/failure-info))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.get-tag-values-output/tag-values (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-values-output-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/get-tag-values-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/pagination-token :portkey.aws.resourcegroupstaggingapi.get-tag-values-output/tag-values]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.pagination-token-expired-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/pagination-token-expired-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.pagination-token-expired-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/untag-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/failed-resources-map]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.tag-resources-input/tags (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-map))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi/resource-arn-list :portkey.aws.resourcegroupstaggingapi.tag-resources-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tags-per-page clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/resource-arn-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/resource-arn :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/tag))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/tag-key))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.untag-resources-input/tag-keys (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-key-list-for-untag))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/untag-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi/resource-arn-list :portkey.aws.resourcegroupstaggingapi.untag-resources-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/error-code #{:internal-service-exception :invalid-parameter-exception "InvalidParameterException" "InternalServiceException"})

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/get-tag-keys-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.get-resources-input/tag-filters (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.get-resources-input/resource-type-filters (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/resource-type-filter-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/get-resources-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/pagination-token :portkey.aws.resourcegroupstaggingapi.get-resources-input/tag-filters :portkey.aws.resourcegroupstaggingapi/resources-per-page :portkey.aws.resourcegroupstaggingapi/tags-per-page :portkey.aws.resourcegroupstaggingapi.get-resources-input/resource-type-filters]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.resource-tag-mapping/tags (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/resource-tag-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/resource-arn :portkey.aws.resourcegroupstaggingapi.resource-tag-mapping/tags]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/resource-type-filter-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/amazon-resource-type))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/exception-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-map (clojure.spec.alpha/map-of :portkey.aws.resourcegroupstaggingapi/tag-key :portkey.aws.resourcegroupstaggingapi/tag-value))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-key-list-for-untag (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/resource-tag-mapping-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/resource-tag-mapping))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/resources-per-page clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.tag-filter/key (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-key))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.tag-filter/values (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-value-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.tag-filter/key :portkey.aws.resourcegroupstaggingapi.tag-filter/values]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.get-tag-keys-output/tag-keys (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/get-tag-keys-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/pagination-token :portkey.aws.resourcegroupstaggingapi.get-tag-keys-output/tag-keys]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.get-tag-values-input/key (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-key))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/get-tag-values-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi.get-tag-values-input/key] :opt-un [:portkey.aws.resourcegroupstaggingapi/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-filter-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/tag-filter :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.tag/key (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-key))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.tag/value (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-value))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi.tag/key :portkey.aws.resourcegroupstaggingapi.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/failure-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/status-code :portkey.aws.resourcegroupstaggingapi/error-code :portkey.aws.resourcegroupstaggingapi/error-message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/tag-values-output-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi/tag-value))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/get-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi/pagination-token :portkey.aws.resourcegroupstaggingapi/resource-tag-mapping-list]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi/throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.throttled-exception/message]))

(clojure.core/defn get-resources ([] (get-resources {})) ([get-resources-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-resources-input get-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi/endpoints, :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi/get-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi/get-resources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetResources", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi/internal-service-exception, "PaginationTokenExpiredException" :portkey.aws.resourcegroupstaggingapi/pagination-token-expired-exception}})))))
(clojure.spec.alpha/fdef get-resources :args (clojure.spec.alpha/? :portkey.aws.resourcegroupstaggingapi/get-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/get-resources-output))

(clojure.core/defn get-tag-keys ([] (get-tag-keys {})) ([get-tag-keys-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-tag-keys-input get-tag-keys-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi/endpoints, :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi/get-tag-keys-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi/get-tag-keys-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTagKeys", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi/internal-service-exception, "PaginationTokenExpiredException" :portkey.aws.resourcegroupstaggingapi/pagination-token-expired-exception}})))))
(clojure.spec.alpha/fdef get-tag-keys :args (clojure.spec.alpha/? :portkey.aws.resourcegroupstaggingapi/get-tag-keys-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/get-tag-keys-output))

(clojure.core/defn get-tag-values ([get-tag-values-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-tag-values-input get-tag-values-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi/endpoints, :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi/get-tag-values-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi/get-tag-values-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTagValues", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi/internal-service-exception, "PaginationTokenExpiredException" :portkey.aws.resourcegroupstaggingapi/pagination-token-expired-exception}})))))
(clojure.spec.alpha/fdef get-tag-values :args (clojure.spec.alpha/tuple :portkey.aws.resourcegroupstaggingapi/get-tag-values-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/get-tag-values-output))

(clojure.core/defn tag-resources ([tag-resources-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-tag-resources-input tag-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi/endpoints, :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi/tag-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi/tag-resources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResources", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi/internal-service-exception}})))))
(clojure.spec.alpha/fdef tag-resources :args (clojure.spec.alpha/tuple :portkey.aws.resourcegroupstaggingapi/tag-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/tag-resources-output))

(clojure.core/defn untag-resources ([untag-resources-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-untag-resources-input untag-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi/endpoints, :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi/untag-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi/untag-resources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResources", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi/internal-service-exception}})))))
(clojure.spec.alpha/fdef untag-resources :args (clojure.spec.alpha/tuple :portkey.aws.resourcegroupstaggingapi/untag-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi/untag-resources-output))
