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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "resource-groups", :region "eu-north-1"},
    :ssl-common-name "resource-groups.eu-north-1.amazonaws.com",
    :endpoint "https://resource-groups.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-resource-filter-values)

(clojure.core/declare ser-resource-filter-list)

(clojure.core/declare ser-resource-query)

(clojure.core/declare ser-group-filter)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-resource-filter)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-group-name)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-query)

(clojure.core/declare ser-resource-filter-name)

(clojure.core/declare ser-group-filter-values)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-group-filter-value)

(clojure.core/declare ser-group-filter-name)

(clojure.core/declare ser-group-filter-list)

(clojure.core/declare ser-query-type)

(clojure.core/declare ser-resource-filter-value)

(clojure.core/declare ser-group-arn)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-group-description)

(clojure.core/defn- ser-resource-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-filter-value coll) #:http.request.field{:shape "ResourceFilterValue"}))) input), :shape "ResourceFilterValues", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-resource-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-filter coll) #:http.request.field{:shape "ResourceFilter"}))) input), :shape "ResourceFilterList", :type "list"})

(clojure.core/defn- ser-resource-query [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-query-type (:type input)) #:http.request.field{:name "Type", :shape "QueryType"}) (clojure.core/into (ser-query (:query input)) #:http.request.field{:name "Query", :shape "Query"})], :shape "ResourceQuery", :type "structure"}))

(clojure.core/defn- ser-group-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-group-filter-name (:name input)) #:http.request.field{:name "Name", :shape "GroupFilterName"}) (clojure.core/into (ser-group-filter-values (:values input)) #:http.request.field{:name "Values", :shape "GroupFilterValues"})], :shape "GroupFilter", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-resource-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-filter-name (:name input)) #:http.request.field{:name "Name", :shape "ResourceFilterName"}) (clojure.core/into (ser-resource-filter-values (:values input)) #:http.request.field{:name "Values", :shape "ResourceFilterValues"})], :shape "ResourceFilter", :type "structure"}))

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-group-name [input] #:http.request.field{:value input, :shape "GroupName"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-query [input] #:http.request.field{:value input, :shape "Query"})

(clojure.core/defn- ser-resource-filter-name [input] #:http.request.field{:value (clojure.core/get {"resource-type" "resource-type", :resourcetype "resource-type"} input), :shape "ResourceFilterName"})

(clojure.core/defn- ser-group-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-group-filter-value coll) #:http.request.field{:shape "GroupFilterValue"}))) input), :shape "GroupFilterValues", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-group-filter-value [input] #:http.request.field{:value input, :shape "GroupFilterValue"})

(clojure.core/defn- ser-group-filter-name [input] #:http.request.field{:value (clojure.core/get {"resource-type" "resource-type", :resourcetype "resource-type"} input), :shape "GroupFilterName"})

(clojure.core/defn- ser-group-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-group-filter coll) #:http.request.field{:shape "GroupFilter"}))) input), :shape "GroupFilterList", :type "list"})

(clojure.core/defn- ser-query-type [input] #:http.request.field{:value (clojure.core/get {"TAG_FILTERS_1_0" "TAG_FILTERS_1_0", :tag-filters-1-0 "TAG_FILTERS_1_0", "CLOUDFORMATION_STACK_1_0" "CLOUDFORMATION_STACK_1_0", :cloudformation-stack-1-0 "CLOUDFORMATION_STACK_1_0"} input), :shape "QueryType"})

(clojure.core/defn- ser-resource-filter-value [input] #:http.request.field{:value input, :shape "ResourceFilterValue"})

(clojure.core/defn- ser-group-arn [input] #:http.request.field{:value input, :shape "GroupArn"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-group-description [input] #:http.request.field{:value input, :shape "GroupDescription"})

(clojure.core/defn- req-list-groups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "GroupFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

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

(clojure.core/declare deser-resource-query)

(clojure.core/declare deser-resource-identifier-list)

(clojure.core/declare deser-group-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-group-query)

(clojure.core/declare deser-group-name)

(clojure.core/declare deser-group-identifier-list)

(clojure.core/declare deser-query-error-code)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-query)

(clojure.core/declare deser-group-identifier)

(clojure.core/declare deser-tag-key-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-query-error-message)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-resource-identifier)

(clojure.core/declare deser-query-type)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-group-arn)

(clojure.core/declare deser-query-error-list)

(clojure.core/declare deser-group)

(clojure.core/declare deser-group-description)

(clojure.core/declare deser-query-error)

(clojure.core/defn- deser-resource-query [input] (clojure.core/cond-> {:type (deser-query-type (input "Type")), :query (deser-query (input "Query"))}))

(clojure.core/defn- deser-resource-identifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-identifier coll))) input))

(clojure.core/defn- deser-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-group-query [input] (clojure.core/cond-> {:group-name (deser-group-name (input "GroupName")), :resource-query (deser-resource-query (input "ResourceQuery"))}))

(clojure.core/defn- deser-group-name [input] input)

(clojure.core/defn- deser-group-identifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group-identifier coll))) input))

(clojure.core/defn- deser-query-error-code [input] (clojure.core/get {"CLOUDFORMATION_STACK_INACTIVE" :cloudformation-stack-inactive, "CLOUDFORMATION_STACK_NOT_EXISTING" :cloudformation-stack-not-existing} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-query [input] input)

(clojure.core/defn- deser-group-identifier [input] (clojure.core/cond-> {} (clojure.core/contains? input "GroupName") (clojure.core/assoc :group-name (deser-group-name (input "GroupName"))) (clojure.core/contains? input "GroupArn") (clojure.core/assoc :group-arn (deser-group-arn (input "GroupArn")))))

(clojure.core/defn- deser-tag-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-key coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-query-error-message [input] input)

(clojure.core/defn- deser-resource-type [input] input)

(clojure.core/defn- deser-resource-identifier [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceArn") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceArn"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType")))))

(clojure.core/defn- deser-query-type [input] (clojure.core/get {"TAG_FILTERS_1_0" :tag-filters-1-0, "CLOUDFORMATION_STACK_1_0" :cloudformation-stack-1-0} input))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-group-arn [input] input)

(clojure.core/defn- deser-query-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-error coll))) input))

(clojure.core/defn- deser-group [input] (clojure.core/cond-> {:group-arn (deser-group-arn (input "GroupArn")), :name (deser-group-name (input "Name"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-group-description (input "Description")))))

(clojure.core/defn- deser-group-description [input] input)

(clojure.core/defn- deser-query-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-query-error-code (input "ErrorCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-query-error-message (input "Message")))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1561008 input] (clojure.core/let [rawinput1561007 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561009 {"Message" (rawinput1561007 "Message")}] (clojure.core/cond-> {} (letvar1561009 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1561009 ["Message"])))))))

(clojure.core/defn- response-method-not-allowed-exception ([input] (response-method-not-allowed-exception nil input)) ([resultWrapper1561011 input] (clojure.core/let [rawinput1561010 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561012 {"Message" (rawinput1561010 "Message")}] (clojure.core/cond-> {} (letvar1561012 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1561012 ["Message"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper1561014 input] (clojure.core/let [rawinput1561013 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561015 {"Message" (rawinput1561013 "Message")}] (clojure.core/cond-> {} (letvar1561015 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1561015 ["Message"])))))))

(clojure.core/defn- response-update-group-output ([input] (response-update-group-output nil input)) ([resultWrapper1561017 input] (clojure.core/let [rawinput1561016 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561018 {"Group" (rawinput1561016 "Group")}] (clojure.core/cond-> {} (letvar1561018 "Group") (clojure.core/assoc :group (deser-group (clojure.core/get-in letvar1561018 ["Group"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1561020 input] (clojure.core/let [rawinput1561019 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561021 {"Message" (rawinput1561019 "Message")}] (clojure.core/cond-> {} (letvar1561021 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1561021 ["Message"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1561023 input] (clojure.core/let [rawinput1561022 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561024 {"Message" (rawinput1561022 "Message")}] (clojure.core/cond-> {} (letvar1561024 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1561024 ["Message"])))))))

(clojure.core/defn- response-update-group-query-output ([input] (response-update-group-query-output nil input)) ([resultWrapper1561026 input] (clojure.core/let [rawinput1561025 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561027 {"GroupQuery" (rawinput1561025 "GroupQuery")}] (clojure.core/cond-> {} (letvar1561027 "GroupQuery") (clojure.core/assoc :group-query (deser-group-query (clojure.core/get-in letvar1561027 ["GroupQuery"])))))))

(clojure.core/defn- response-untag-output ([input] (response-untag-output nil input)) ([resultWrapper1561029 input] (clojure.core/let [rawinput1561028 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561030 {"Arn" (rawinput1561028 "Arn"), "Keys" (rawinput1561028 "Keys")}] (clojure.core/cond-> {} (letvar1561030 "Arn") (clojure.core/assoc :arn (deser-group-arn (clojure.core/get-in letvar1561030 ["Arn"]))) (letvar1561030 "Keys") (clojure.core/assoc :keys (deser-tag-key-list (clojure.core/get-in letvar1561030 ["Keys"])))))))

(clojure.core/defn- response-list-group-resources-output ([input] (response-list-group-resources-output nil input)) ([resultWrapper1561032 input] (clojure.core/let [rawinput1561031 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561033 {"ResourceIdentifiers" (rawinput1561031 "ResourceIdentifiers"), "NextToken" (rawinput1561031 "NextToken"), "QueryErrors" (rawinput1561031 "QueryErrors")}] (clojure.core/cond-> {} (letvar1561033 "ResourceIdentifiers") (clojure.core/assoc :resource-identifiers (deser-resource-identifier-list (clojure.core/get-in letvar1561033 ["ResourceIdentifiers"]))) (letvar1561033 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1561033 ["NextToken"]))) (letvar1561033 "QueryErrors") (clojure.core/assoc :query-errors (deser-query-error-list (clojure.core/get-in letvar1561033 ["QueryErrors"])))))))

(clojure.core/defn- response-list-groups-output ([input] (response-list-groups-output nil input)) ([resultWrapper1561035 input] (clojure.core/let [rawinput1561034 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561036 {"GroupIdentifiers" (rawinput1561034 "GroupIdentifiers"), "Groups" (rawinput1561034 "Groups"), "NextToken" (rawinput1561034 "NextToken")}] (clojure.core/cond-> {} (letvar1561036 "GroupIdentifiers") (clojure.core/assoc :group-identifiers (deser-group-identifier-list (clojure.core/get-in letvar1561036 ["GroupIdentifiers"]))) (letvar1561036 "Groups") (clojure.core/assoc :groups (deser-group-list (clojure.core/get-in letvar1561036 ["Groups"]))) (letvar1561036 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1561036 ["NextToken"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1561038 input] (clojure.core/let [rawinput1561037 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561039 {"Message" (rawinput1561037 "Message")}] (clojure.core/cond-> {} (letvar1561039 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1561039 ["Message"])))))))

(clojure.core/defn- response-tag-output ([input] (response-tag-output nil input)) ([resultWrapper1561041 input] (clojure.core/let [rawinput1561040 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561042 {"Arn" (rawinput1561040 "Arn"), "Tags" (rawinput1561040 "Tags")}] (clojure.core/cond-> {} (letvar1561042 "Arn") (clojure.core/assoc :arn (deser-group-arn (clojure.core/get-in letvar1561042 ["Arn"]))) (letvar1561042 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1561042 ["Tags"])))))))

(clojure.core/defn- response-search-resources-output ([input] (response-search-resources-output nil input)) ([resultWrapper1561044 input] (clojure.core/let [rawinput1561043 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561045 {"ResourceIdentifiers" (rawinput1561043 "ResourceIdentifiers"), "NextToken" (rawinput1561043 "NextToken"), "QueryErrors" (rawinput1561043 "QueryErrors")}] (clojure.core/cond-> {} (letvar1561045 "ResourceIdentifiers") (clojure.core/assoc :resource-identifiers (deser-resource-identifier-list (clojure.core/get-in letvar1561045 ["ResourceIdentifiers"]))) (letvar1561045 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1561045 ["NextToken"]))) (letvar1561045 "QueryErrors") (clojure.core/assoc :query-errors (deser-query-error-list (clojure.core/get-in letvar1561045 ["QueryErrors"])))))))

(clojure.core/defn- response-get-group-output ([input] (response-get-group-output nil input)) ([resultWrapper1561047 input] (clojure.core/let [rawinput1561046 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561048 {"Group" (rawinput1561046 "Group")}] (clojure.core/cond-> {} (letvar1561048 "Group") (clojure.core/assoc :group (deser-group (clojure.core/get-in letvar1561048 ["Group"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1561050 input] (clojure.core/let [rawinput1561049 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561051 {"Message" (rawinput1561049 "Message")}] (clojure.core/cond-> {} (letvar1561051 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1561051 ["Message"])))))))

(clojure.core/defn- response-create-group-output ([input] (response-create-group-output nil input)) ([resultWrapper1561053 input] (clojure.core/let [rawinput1561052 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561054 {"Group" (rawinput1561052 "Group"), "ResourceQuery" (rawinput1561052 "ResourceQuery"), "Tags" (rawinput1561052 "Tags")}] (clojure.core/cond-> {} (letvar1561054 "Group") (clojure.core/assoc :group (deser-group (clojure.core/get-in letvar1561054 ["Group"]))) (letvar1561054 "ResourceQuery") (clojure.core/assoc :resource-query (deser-resource-query (clojure.core/get-in letvar1561054 ["ResourceQuery"]))) (letvar1561054 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1561054 ["Tags"])))))))

(clojure.core/defn- response-get-tags-output ([input] (response-get-tags-output nil input)) ([resultWrapper1561056 input] (clojure.core/let [rawinput1561055 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561057 {"Arn" (rawinput1561055 "Arn"), "Tags" (rawinput1561055 "Tags")}] (clojure.core/cond-> {} (letvar1561057 "Arn") (clojure.core/assoc :arn (deser-group-arn (clojure.core/get-in letvar1561057 ["Arn"]))) (letvar1561057 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1561057 ["Tags"])))))))

(clojure.core/defn- response-get-group-query-output ([input] (response-get-group-query-output nil input)) ([resultWrapper1561059 input] (clojure.core/let [rawinput1561058 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561060 {"GroupQuery" (rawinput1561058 "GroupQuery")}] (clojure.core/cond-> {} (letvar1561060 "GroupQuery") (clojure.core/assoc :group-query (deser-group-query (clojure.core/get-in letvar1561060 ["GroupQuery"])))))))

(clojure.core/defn- response-delete-group-output ([input] (response-delete-group-output nil input)) ([resultWrapper1561062 input] (clojure.core/let [rawinput1561061 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1561063 {"Group" (rawinput1561061 "Group")}] (clojure.core/cond-> {} (letvar1561063 "Group") (clojure.core/assoc :group (deser-group (clojure.core/get-in letvar1561063 ["Group"])))))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-values (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/resource-filter-value :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.resource-groups.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/method-not-allowed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.method-not-allowed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-groups-input/filters (clojure.spec.alpha/and :portkey.aws.resource-groups/group-filter-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-groups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.list-groups-input/filters :portkey.aws.resource-groups/max-results :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/resource-filter))

(clojure.spec.alpha/def :portkey.aws.resource-groups.resource-query/type (clojure.spec.alpha/and :portkey.aws.resource-groups/query-type))
(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-query (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.resource-query/type :portkey.aws.resource-groups/query] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups.group-filter/name (clojure.spec.alpha/and :portkey.aws.resource-groups/group-filter-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.group-filter/values (clojure.spec.alpha/and :portkey.aws.resource-groups/group-filter-values))
(clojure.spec.alpha/def :portkey.aws.resource-groups/group-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.group-filter/name :portkey.aws.resource-groups.group-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/resource-identifier))

(clojure.spec.alpha/def :portkey.aws.resource-groups.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/group))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group-query]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-output/keys (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/untag-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.untag-output/arn :portkey.aws.resource-groups.untag-output/keys]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-group-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.list-group-resources-output/query-errors (clojure.spec.alpha/and :portkey.aws.resource-groups/query-error-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-group-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.list-group-resources-output/resource-identifiers :portkey.aws.resource-groups/next-token :portkey.aws.resource-groups.list-group-resources-output/query-errors]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.resource-filter/name (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-filter-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.resource-filter/values (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-filter-values))
(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.resource-filter/name :portkey.aws.resource-groups.resource-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tags (clojure.spec.alpha/map-of :portkey.aws.resource-groups/tag-key :portkey.aws.resource-groups/tag-value))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-query (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name :portkey.aws.resource-groups/resource-query] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\.-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.update-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un [:portkey.aws.resource-groups.update-group-input/description]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/group-identifier))

(clojure.spec.alpha/def :portkey.aws.resource-groups.create-group-input/name (clojure.spec.alpha/and :portkey.aws.resource-groups/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.create-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/create-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.create-group-input/name :portkey.aws.resource-groups/resource-query] :opt-un [:portkey.aws.resource-groups.create-group-input/description :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query-error-code #{:cloudformation-stack-inactive :cloudformation-stack-not-existing "CLOUDFORMATION_STACK_NOT_EXISTING" "CLOUDFORMATION_STACK_INACTIVE"})

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-groups-output/group-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups/group-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.list-groups-output/groups (clojure.spec.alpha/and :portkey.aws.resource-groups/group-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.list-groups-output/group-identifiers :portkey.aws.resource-groups.list-groups-output/groups :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resource-groups/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-name #{:resourcetype "resource-type"})

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group-name :portkey.aws.resource-groups/group-arn]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.tag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.tag-output/arn :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-filter-values (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/group-filter-value :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.resource-groups.get-tags-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/get-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.get-tags-input/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/tag-key))

(clojure.spec.alpha/def :portkey.aws.resource-groups/search-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/resource-query] :opt-un [:portkey.aws.resource-groups/max-results :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.search-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups.search-resources-output/query-errors (clojure.spec.alpha/and :portkey.aws.resource-groups/query-error-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/search-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.search-resources-output/resource-identifiers :portkey.aws.resource-groups/next-token :portkey.aws.resource-groups.search-resources-output/query-errors]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resource-groups/delete-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name :portkey.aws.resource-groups/resource-query] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-filter-name #{:resourcetype "resource-type"})

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"AWS::[a-zA-Z0-9]+::\w+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/resource-arn :portkey.aws.resource-groups/resource-type]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-filter-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/group-filter))

(clojure.spec.alpha/def :portkey.aws.resource-groups.tag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.tag-input/arn :portkey.aws.resource-groups/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/create-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group :portkey.aws.resource-groups/resource-query :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-group-resources-input/filters (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-filter-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-group-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un [:portkey.aws.resource-groups.list-group-resources-input/filters :portkey.aws.resource-groups/max-results :portkey.aws.resource-groups/next-token]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query-type #{"TAG_FILTERS_1_0" "CLOUDFORMATION_STACK_1_0" :tag-filters-1-0 :cloudformation-stack-1-0})

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:[a-z0-9\-]*:([a-z]{2}-[a-z]+-\d{1})?:([0-9]{12})?:.+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"AWS::[a-zA-Z0-9]+::[a-zA-Z0-9]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:resource-groups:[a-z]{2}-[a-z]+-\d{1}:[0-9]{12}:group/[a-zA-Z0-9_\.-]{1,128}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.resource-groups.get-tags-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/get-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.get-tags-output/arn :portkey.aws.resource-groups/tags]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query-error-list (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/query-error))

(clojure.spec.alpha/def :portkey.aws.resource-groups.group/name (clojure.spec.alpha/and :portkey.aws.resource-groups/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.group/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/group (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups/group-arn :portkey.aws.resource-groups.group/name] :opt-un [:portkey.aws.resource-groups.group/description]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group-query]))

(clojure.spec.alpha/def :portkey.aws.resource-groups/delete-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups/group]))

(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-input/keys (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/untag-input (clojure.spec.alpha/keys :req-un [:portkey.aws.resource-groups.untag-input/arn :portkey.aws.resource-groups.untag-input/keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\sa-zA-Z0-9_\.-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.query-error/error-code (clojure.spec.alpha/and :portkey.aws.resource-groups/query-error-code))
(clojure.spec.alpha/def :portkey.aws.resource-groups.query-error/message (clojure.spec.alpha/and :portkey.aws.resource-groups/query-error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/query-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.resource-groups.query-error/error-code :portkey.aws.resource-groups.query-error/message]))

(clojure.core/defn delete-group "Deletes a specified resource group. Deleting a resource group does not delete\nresources that are members of the group; it only deletes the group structure." ([delete-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-group-input delete-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/delete-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/delete-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGroup", :http.request.configuration/output-deser-fn response-delete-group-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/delete-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/delete-group-output))

(clojure.core/defn get-tags "Returns a list of tags that are associated with a resource, specified by an ARN." ([get-tags-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-tags-input get-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/get-tags-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/{Arn}/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/get-tags-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTags", :http.request.configuration/output-deser-fn response-get-tags-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-tags-output))

(clojure.core/defn list-groups "Returns a list of existing resource groups in your account." ([] (list-groups {})) ([list-groups-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-groups-input list-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/list-groups-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups-list", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/list-groups-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGroups", :http.request.configuration/output-deser-fn response-list-groups-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.resource-groups/list-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/list-groups-output))

(clojure.core/defn untag "Deletes specified tags from a specified resource." ([untag-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-input untag-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/untag-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/{Arn}/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/untag-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Untag", :http.request.configuration/output-deser-fn response-untag-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef untag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/untag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/untag-output))

(clojure.core/defn update-group-query "Updates the resource query of a group." ([update-group-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-group-query-input update-group-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/update-group-query-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}/query", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/update-group-query-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGroupQuery", :http.request.configuration/output-deser-fn response-update-group-query-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/update-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/update-group-query-output))

(clojure.core/defn get-group "Returns information about a specified resource group." ([get-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-group-input get-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/get-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/get-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGroup", :http.request.configuration/output-deser-fn response-get-group-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-group-output))

(clojure.core/defn update-group "Updates an existing group with a new or changed description. You cannot update\nthe name of a resource group." ([update-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-group-input update-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/update-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/update-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGroup", :http.request.configuration/output-deser-fn response-update-group-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/update-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/update-group-output))

(clojure.core/defn get-group-query "Returns the resource query associated with the specified resource group." ([get-group-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-group-query-input get-group-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/get-group-query-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}/query", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/get-group-query-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGroupQuery", :http.request.configuration/output-deser-fn response-get-group-query-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-group-query-output))

(clojure.core/defn search-resources "Returns a list of AWS resource identifiers that matches a specified query. The\nquery uses the same format as a resource query in a CreateGroup or\nUpdateGroupQuery operation." ([search-resources-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-search-resources-input search-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/search-resources-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/search", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/search-resources-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchResources", :http.request.configuration/output-deser-fn response-search-resources-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.resource-groups/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef search-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/search-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/search-resources-output))

(clojure.core/defn tag "Adds tags to a resource group with the specified ARN. Existing tags on a\nresource group are not changed if they are not specified in the request\nparameters." ([tag-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-input tag-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/tag-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/resources/{Arn}/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/tag-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Tag", :http.request.configuration/output-deser-fn response-tag-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef tag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/tag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-output))

(clojure.core/defn list-group-resources "Returns a list of ARNs of resources that are members of a specified resource\ngroup." ([list-group-resources-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-group-resources-input list-group-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/list-group-resources-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups/{GroupName}/resource-identifiers-list", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/list-group-resources-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGroupResources", :http.request.configuration/output-deser-fn response-list-group-resources-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.resource-groups/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-group-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/list-group-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/list-group-resources-output))

(clojure.core/defn create-group "Creates a group with a specified name, description, and resource query." ([create-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-group-input create-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.resource-groups/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.resource-groups/create-group-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/groups", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Resource Groups", :http.request.spec/input-spec :portkey.aws.resource-groups/create-group-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateGroup", :http.request.configuration/output-deser-fn response-create-group-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/create-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/create-group-output))
