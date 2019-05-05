(ns portkey.aws.resourcegroupstaggingapi.-2017-01-26 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "tagging", :region "us-gov-east-1"},
    :ssl-common-name "tagging.us-gov-east-1.amazonaws.com",
    :endpoint "https://tagging.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "tagging", :region "ap-northeast-1"},
    :ssl-common-name "tagging.ap-northeast-1.amazonaws.com",
    :endpoint "https://tagging.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "tagging", :region "eu-west-1"},
    :ssl-common-name "tagging.eu-west-1.amazonaws.com",
    :endpoint "https://tagging.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "tagging", :region "us-east-2"},
    :ssl-common-name "tagging.us-east-2.amazonaws.com",
    :endpoint "https://tagging.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "tagging", :region "ap-southeast-2"},
    :ssl-common-name "tagging.ap-southeast-2.amazonaws.com",
    :endpoint "https://tagging.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "tagging", :region "cn-north-1"},
    :ssl-common-name "tagging.cn-north-1.amazonaws.com.cn",
    :endpoint "https://tagging.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "tagging", :region "sa-east-1"},
    :ssl-common-name "tagging.sa-east-1.amazonaws.com",
    :endpoint "https://tagging.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "tagging", :region "ap-southeast-1"},
    :ssl-common-name "tagging.ap-southeast-1.amazonaws.com",
    :endpoint "https://tagging.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "tagging", :region "cn-northwest-1"},
    :ssl-common-name "tagging.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://tagging.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "tagging", :region "ap-northeast-2"},
    :ssl-common-name "tagging.ap-northeast-2.amazonaws.com",
    :endpoint "https://tagging.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "tagging", :region "eu-west-3"},
    :ssl-common-name "tagging.eu-west-3.amazonaws.com",
    :endpoint "https://tagging.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "tagging", :region "ca-central-1"},
    :ssl-common-name "tagging.ca-central-1.amazonaws.com",
    :endpoint "https://tagging.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "tagging", :region "eu-central-1"},
    :ssl-common-name "tagging.eu-central-1.amazonaws.com",
    :endpoint "https://tagging.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "tagging", :region "eu-west-2"},
    :ssl-common-name "tagging.eu-west-2.amazonaws.com",
    :endpoint "https://tagging.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "tagging", :region "us-gov-west-1"},
    :ssl-common-name "tagging.us-gov-west-1.amazonaws.com",
    :endpoint "https://tagging.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "tagging", :region "us-west-2"},
    :ssl-common-name "tagging.us-west-2.amazonaws.com",
    :endpoint "https://tagging.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "tagging", :region "us-east-1"},
    :ssl-common-name "tagging.us-east-1.amazonaws.com",
    :endpoint "https://tagging.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "tagging", :region "us-west-1"},
    :ssl-common-name "tagging.us-west-1.amazonaws.com",
    :endpoint "https://tagging.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "tagging", :region "ap-south-1"},
    :ssl-common-name "tagging.ap-south-1.amazonaws.com",
    :endpoint "https://tagging.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "tagging", :region "eu-north-1"},
    :ssl-common-name "tagging.eu-north-1.amazonaws.com",
    :endpoint "https://tagging.eu-north-1.amazonaws.com",
    :signature-version :v4}})

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

(clojure.core/declare deser-status-code)

(clojure.core/declare deser-failed-resources-map)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-tag-key-list)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-resource-tag-mapping)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-resource-tag-mapping-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-failure-info)

(clojure.core/declare deser-tag-values-output-list)

(clojure.core/declare deser-resource-arn)

(clojure.core/defn- deser-status-code [input] input)

(clojure.core/defn- deser-failed-resources-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-resource-arn k) (deser-failure-info v)])) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-tag-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-key coll))) input))

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"InternalServiceException" :internal-service-exception, "InvalidParameterException" :invalid-parameter-exception} input))

(clojure.core/defn- deser-resource-tag-mapping [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags")))))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-resource-tag-mapping-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag-mapping coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-failure-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "StatusCode") (clojure.core/assoc :status-code (deser-status-code (input "StatusCode"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-tag-values-output-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-value coll))) input))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- response-tag-resources-output ([input] (response-tag-resources-output nil input)) ([resultWrapper1564437 input] (clojure.core/let [rawinput1564436 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564438 {"FailedResourcesMap" (rawinput1564436 "FailedResourcesMap")}] (clojure.core/cond-> {} (letvar1564438 "FailedResourcesMap") (clojure.core/assoc :failed-resources-map (deser-failed-resources-map (clojure.core/get-in letvar1564438 ["FailedResourcesMap"])))))))

(clojure.core/defn- response-get-tag-values-output ([input] (response-get-tag-values-output nil input)) ([resultWrapper1564440 input] (clojure.core/let [rawinput1564439 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564441 {"PaginationToken" (rawinput1564439 "PaginationToken"), "TagValues" (rawinput1564439 "TagValues")}] (clojure.core/cond-> {} (letvar1564441 "PaginationToken") (clojure.core/assoc :pagination-token (deser-pagination-token (clojure.core/get-in letvar1564441 ["PaginationToken"]))) (letvar1564441 "TagValues") (clojure.core/assoc :tag-values (deser-tag-values-output-list (clojure.core/get-in letvar1564441 ["TagValues"])))))))

(clojure.core/defn- response-pagination-token-expired-exception ([input] (response-pagination-token-expired-exception nil input)) ([resultWrapper1564443 input] (clojure.core/let [rawinput1564442 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564444 {"Message" (rawinput1564442 "Message")}] (clojure.core/cond-> {} (letvar1564444 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1564444 ["Message"])))))))

(clojure.core/defn- response-untag-resources-output ([input] (response-untag-resources-output nil input)) ([resultWrapper1564446 input] (clojure.core/let [rawinput1564445 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564447 {"FailedResourcesMap" (rawinput1564445 "FailedResourcesMap")}] (clojure.core/cond-> {} (letvar1564447 "FailedResourcesMap") (clojure.core/assoc :failed-resources-map (deser-failed-resources-map (clojure.core/get-in letvar1564447 ["FailedResourcesMap"])))))))

(clojure.core/defn- response-get-tag-keys-output ([input] (response-get-tag-keys-output nil input)) ([resultWrapper1564449 input] (clojure.core/let [rawinput1564448 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564450 {"PaginationToken" (rawinput1564448 "PaginationToken"), "TagKeys" (rawinput1564448 "TagKeys")}] (clojure.core/cond-> {} (letvar1564450 "PaginationToken") (clojure.core/assoc :pagination-token (deser-pagination-token (clojure.core/get-in letvar1564450 ["PaginationToken"]))) (letvar1564450 "TagKeys") (clojure.core/assoc :tag-keys (deser-tag-key-list (clojure.core/get-in letvar1564450 ["TagKeys"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1564452 input] (clojure.core/let [rawinput1564451 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564453 {"Message" (rawinput1564451 "Message")}] (clojure.core/cond-> {} (letvar1564453 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1564453 ["Message"])))))))

(clojure.core/defn- response-internal-service-exception ([input] (response-internal-service-exception nil input)) ([resultWrapper1564455 input] (clojure.core/let [rawinput1564454 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564456 {"Message" (rawinput1564454 "Message")}] (clojure.core/cond-> {} (letvar1564456 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1564456 ["Message"])))))))

(clojure.core/defn- response-get-resources-output ([input] (response-get-resources-output nil input)) ([resultWrapper1564458 input] (clojure.core/let [rawinput1564457 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564459 {"PaginationToken" (rawinput1564457 "PaginationToken"), "ResourceTagMappingList" (rawinput1564457 "ResourceTagMappingList")}] (clojure.core/cond-> {} (letvar1564459 "PaginationToken") (clojure.core/assoc :pagination-token (deser-pagination-token (clojure.core/get-in letvar1564459 ["PaginationToken"]))) (letvar1564459 "ResourceTagMappingList") (clojure.core/assoc :resource-tag-mapping-list (deser-resource-tag-mapping-list (clojure.core/get-in letvar1564459 ["ResourceTagMappingList"])))))))

(clojure.core/defn- response-throttled-exception ([input] (response-throttled-exception nil input)) ([resultWrapper1564461 input] (clojure.core/let [rawinput1564460 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1564462 {"Message" (rawinput1564460 "Message")}] (clojure.core/cond-> {} (letvar1564462 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1564462 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-value-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-value :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/failed-resources-map]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/amazon-resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/status-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/failed-resources-map (clojure.spec.alpha/map-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-arn :portkey.aws.resourcegroupstaggingapi.-2017-01-26/failure-info))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-tag-values-output/tag-values (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-values-output-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-values-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-tag-values-output/tag-values]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.pagination-token-expired-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token-expired-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26.pagination-token-expired-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/untag-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/failed-resources-map]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag-resources-input/tags (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-map))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-arn-list :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag-resources-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tags-per-page clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-arn-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-arn :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.untag-resources-input/tag-keys (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key-list-for-untag))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/untag-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-arn-list :portkey.aws.resourcegroupstaggingapi.-2017-01-26.untag-resources-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/error-code #{:internal-service-exception :invalid-parameter-exception "InvalidParameterException" "InternalServiceException"})

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-keys-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-resources-input/tag-filters (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-resources-input/resource-type-filters (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-type-filter-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-resources-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-resources-input/tag-filters :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resources-per-page :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tags-per-page :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-resources-input/resource-type-filters]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.resource-tag-mapping/tags (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-tag-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-arn :portkey.aws.resourcegroupstaggingapi.-2017-01-26.resource-tag-mapping/tags]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-type-filter-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/amazon-resource-type))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/exception-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-map (clojure.spec.alpha/map-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-value))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key-list-for-untag (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-tag-mapping-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-tag-mapping))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resources-per-page clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag-filter/key (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag-filter/values (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-value-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag-filter/key :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag-filter/values]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-tag-keys-output/tag-keys (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-keys-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-tag-keys-output/tag-keys]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-tag-values-input/key (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-values-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26.get-tag-values-input/key] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-filter-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-filter :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag/key (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-key))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag/value (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-value))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag/key :portkey.aws.resourcegroupstaggingapi.-2017-01-26.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/failure-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/status-code :portkey.aws.resourcegroupstaggingapi.-2017-01-26/error-code :portkey.aws.resourcegroupstaggingapi.-2017-01-26/error-message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-values-output-list (clojure.spec.alpha/coll-of :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-value))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token :portkey.aws.resourcegroupstaggingapi.-2017-01-26/resource-tag-mapping-list]))

(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/exception-message))
(clojure.spec.alpha/def :portkey.aws.resourcegroupstaggingapi.-2017-01-26/throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resourcegroupstaggingapi.-2017-01-26.throttled-exception/message]))

(clojure.core/defn get-resources "Returns all the tagged resources that are associated with the specified tags\n(keys and values) located in the specified region for the AWS account. The tags\nand the resource types that you specify in the request are known as filters. The\nresponse includes all tags that are associated with the requested resources. If\nno filter is provided, this action returns a paginated resource list with the\nassociated tags." ([] (get-resources {})) ([get-resources-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resources-input get-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi.-2017-01-26/endpoints, :http.request.configuration/target-prefix "ResourceGroupsTaggingAPI_20170126", :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-resources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResources", :http.request.configuration/output-deser-fn response-get-resources-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/internal-service-exception, "PaginationTokenExpiredException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token-expired-exception}})))))
(clojure.spec.alpha/fdef get-resources :args (clojure.spec.alpha/? :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-resources-output))

(clojure.core/defn get-tag-keys "Returns all tag keys in the specified region for the AWS account." ([] (get-tag-keys {})) ([get-tag-keys-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-tag-keys-input get-tag-keys-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi.-2017-01-26/endpoints, :http.request.configuration/target-prefix "ResourceGroupsTaggingAPI_20170126", :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-keys-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-keys-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTagKeys", :http.request.configuration/output-deser-fn response-get-tag-keys-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/internal-service-exception, "PaginationTokenExpiredException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token-expired-exception}})))))
(clojure.spec.alpha/fdef get-tag-keys :args (clojure.spec.alpha/? :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-keys-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-keys-output))

(clojure.core/defn get-tag-values "Returns all tag values for the specified key in the specified region for the AWS\naccount." ([get-tag-values-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-tag-values-input get-tag-values-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi.-2017-01-26/endpoints, :http.request.configuration/target-prefix "ResourceGroupsTaggingAPI_20170126", :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-values-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-values-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTagValues", :http.request.configuration/output-deser-fn response-get-tag-values-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/internal-service-exception, "PaginationTokenExpiredException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/pagination-token-expired-exception}})))))
(clojure.spec.alpha/fdef get-tag-values :args (clojure.spec.alpha/tuple :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-values-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/get-tag-values-output))

(clojure.core/defn tag-resources "Applies one or more tags to the specified resources. Note the following:\n * Not all resources can have tags. For a list of resources that support\ntagging, see Supported Resources\n(http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/supported-resources.html)\nin the AWS Resource Groups and Tag Editor User Guide.\n * Each resource can have up to 50 tags. For other limits, see Tag Restrictions\n(http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-restrictions)\nin the Amazon EC2 User Guide for Linux Instances.\n * You can only tag resources that are located in the specified region for the\nAWS account.\n * To add tags to a resource, you need the necessary permissions for the service\nthat the resource belongs to as well as permissions for adding tags. For more\ninformation, see Obtaining Permissions for Tagging\n(http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html)\nin the AWS Resource Groups and Tag Editor User Guide." ([tag-resources-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resources-input tag-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi.-2017-01-26/endpoints, :http.request.configuration/target-prefix "ResourceGroupsTaggingAPI_20170126", :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-resources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResources", :http.request.configuration/output-deser-fn response-tag-resources-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/internal-service-exception}})))))
(clojure.spec.alpha/fdef tag-resources :args (clojure.spec.alpha/tuple :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/tag-resources-output))

(clojure.core/defn untag-resources "Removes the specified tags from the specified resources. When you specify a tag\nkey, the action removes both that key and its associated value. The operation\nsucceeds even if you attempt to remove tags from a resource that were already\nremoved. Note the following:\n * To remove tags from a resource, you need the necessary permissions for the\nservice that the resource belongs to as well as permissions for removing tags.\nFor more information, see Obtaining Permissions for Tagging\n(http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html)\nin the AWS Resource Groups and Tag Editor User Guide.\n * You can only tag resources that are located in the specified region for the\nAWS account." ([untag-resources-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resources-input untag-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resourcegroupstaggingapi.-2017-01-26/endpoints, :http.request.configuration/target-prefix "ResourceGroupsTaggingAPI_20170126", :http.request.spec/output-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/untag-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-26", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.resourcegroupstaggingapi.-2017-01-26/untag-resources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResources", :http.request.configuration/output-deser-fn response-untag-resources-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/invalid-parameter-exception, "ThrottledException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/throttled-exception, "InternalServiceException" :portkey.aws.resourcegroupstaggingapi.-2017-01-26/internal-service-exception}})))))
(clojure.spec.alpha/fdef untag-resources :args (clojure.spec.alpha/tuple :portkey.aws.resourcegroupstaggingapi.-2017-01-26/untag-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resourcegroupstaggingapi.-2017-01-26/untag-resources-output))
