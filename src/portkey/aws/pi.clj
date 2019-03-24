(ns portkey.aws.pi (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-service-type)

(clojure.core/declare ser-metric-query-filter-map)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-iso-timestamp)

(clojure.core/declare ser-dimension-group)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-metric-query)

(clojure.core/declare ser-metric-query-list)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-service-type [input] #:http.request.field{:value (clojure.core/get {"RDS" "RDS", :rds "RDS"} input), :shape "ServiceType"})

(clojure.core/defn- ser-metric-query-filter-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "MetricQueryFilterMap", :type "map"})

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-iso-timestamp [input] #:http.request.field{:value input, :shape "ISOTimestamp"})

(clojure.core/defn- ser-dimension-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:group input)) #:http.request.field{:name "Group", :shape "String"})], :shape "DimensionGroup", :type "structure"} (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "StringList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-metric-query [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:metric input)) #:http.request.field{:name "Metric", :shape "String"})], :shape "MetricQuery", :type "structure"} (clojure.core/contains? input :group-by) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension-group (input :group-by)) #:http.request.field{:name "GroupBy", :shape "DimensionGroup"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-query-filter-map (input :filter)) #:http.request.field{:name "Filter", :shape "MetricQueryFilterMap"}))))

(clojure.core/defn- ser-metric-query-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-query coll) #:http.request.field{:shape "MetricQuery"}))) input), :shape "MetricQueryList", :type "list", :max 15, :min 1})

(clojure.core/defn- req-get-resource-metrics-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-type (input :service-type)) #:http.request.field{:name "ServiceType", :shape "ServiceType"}) (clojure.core/into (ser-string (input :identifier)) #:http.request.field{:name "Identifier", :shape "String"}) (clojure.core/into (ser-metric-query-list (input :metric-queries)) #:http.request.field{:name "MetricQueries", :shape "MetricQueryList"}) (clojure.core/into (ser-iso-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "ISOTimestamp"}) (clojure.core/into (ser-iso-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "ISOTimestamp"})]} (clojure.core/contains? input :period-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :period-in-seconds)) #:http.request.field{:name "PeriodInSeconds", :shape "Integer"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-dimension-keys-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-type (input :service-type)) #:http.request.field{:name "ServiceType", :shape "ServiceType"}) (clojure.core/into (ser-string (input :identifier)) #:http.request.field{:name "Identifier", :shape "String"}) (clojure.core/into (ser-iso-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "ISOTimestamp"}) (clojure.core/into (ser-iso-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "ISOTimestamp"}) (clojure.core/into (ser-string (input :metric)) #:http.request.field{:name "Metric", :shape "String"}) (clojure.core/into (ser-dimension-group (input :group-by)) #:http.request.field{:name "GroupBy", :shape "DimensionGroup"})]} (clojure.core/contains? input :period-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :period-in-seconds)) #:http.request.field{:name "PeriodInSeconds", :shape "Integer"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-query-filter-map (input :filter)) #:http.request.field{:name "Filter", :shape "MetricQueryFilterMap"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :partition-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension-group (input :partition-by)) #:http.request.field{:name "PartitionBy", :shape "DimensionGroup"}))))

(clojure.core/declare deser-response-partition-key-list)

(clojure.core/declare deser-dimension-map)

(clojure.core/declare deser-double)

(clojure.core/declare deser-metric-values-list)

(clojure.core/declare deser-dimension-key-description-list)

(clojure.core/declare deser-dimension-key-description)

(clojure.core/declare deser-response-resource-metric-key)

(clojure.core/declare deser-iso-timestamp)

(clojure.core/declare deser-data-point)

(clojure.core/declare deser-string)

(clojure.core/declare deser-data-points-list)

(clojure.core/declare deser-metric-key-data-points)

(clojure.core/declare deser-response-partition-key)

(clojure.core/declare deser-metric-key-data-points-list)

(clojure.core/defn- deser-response-partition-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-response-partition-key coll))) input))

(clojure.core/defn- deser-dimension-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-metric-values-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-double coll))) input))

(clojure.core/defn- deser-dimension-key-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dimension-key-description coll))) input))

(clojure.core/defn- deser-dimension-key-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "Dimensions") (clojure.core/assoc :dimensions (deser-dimension-map (input "Dimensions"))) (clojure.core/contains? input "Total") (clojure.core/assoc :total (deser-double (input "Total"))) (clojure.core/contains? input "Partitions") (clojure.core/assoc :partitions (deser-metric-values-list (input "Partitions")))))

(clojure.core/defn- deser-response-resource-metric-key [input] (clojure.core/cond-> {:metric (deser-string (input "Metric"))} (clojure.core/contains? input "Dimensions") (clojure.core/assoc :dimensions (deser-dimension-map (input "Dimensions")))))

(clojure.core/defn- deser-iso-timestamp [input] input)

(clojure.core/defn- deser-data-point [input] (clojure.core/cond-> {:timestamp (deser-iso-timestamp (input "Timestamp")), :value (deser-double (input "Value"))}))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-data-points-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-point coll))) input))

(clojure.core/defn- deser-metric-key-data-points [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-response-resource-metric-key (input "Key"))) (clojure.core/contains? input "DataPoints") (clojure.core/assoc :data-points (deser-data-points-list (input "DataPoints")))))

(clojure.core/defn- deser-response-partition-key [input] (clojure.core/cond-> {:dimensions (deser-dimension-map (input "Dimensions"))}))

(clojure.core/defn- deser-metric-key-data-points-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-key-data-points coll))) input))

(clojure.core/defn- response-internal-service-error ([input] (response-internal-service-error nil input)) ([resultWrapper1946983 input] (clojure.core/let [rawinput1946982 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1946984 {"Message" (rawinput1946982 "Message")}] (clojure.core/cond-> {} (letvar1946984 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1946984 ["Message"])))))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper1946986 input] (clojure.core/let [rawinput1946985 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1946987 {"Message" (rawinput1946985 "Message")}] (clojure.core/cond-> {} (letvar1946987 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1946987 ["Message"])))))))

(clojure.core/defn- response-describe-dimension-keys-response ([input] (response-describe-dimension-keys-response nil input)) ([resultWrapper1946989 input] (clojure.core/let [rawinput1946988 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1946990 {"AlignedStartTime" (rawinput1946988 "AlignedStartTime"), "AlignedEndTime" (rawinput1946988 "AlignedEndTime"), "PartitionKeys" (rawinput1946988 "PartitionKeys"), "Keys" (rawinput1946988 "Keys"), "NextToken" (rawinput1946988 "NextToken")}] (clojure.core/cond-> {} (letvar1946990 "AlignedStartTime") (clojure.core/assoc :aligned-start-time (deser-iso-timestamp (clojure.core/get-in letvar1946990 ["AlignedStartTime"]))) (letvar1946990 "AlignedEndTime") (clojure.core/assoc :aligned-end-time (deser-iso-timestamp (clojure.core/get-in letvar1946990 ["AlignedEndTime"]))) (letvar1946990 "PartitionKeys") (clojure.core/assoc :partition-keys (deser-response-partition-key-list (clojure.core/get-in letvar1946990 ["PartitionKeys"]))) (letvar1946990 "Keys") (clojure.core/assoc :keys (deser-dimension-key-description-list (clojure.core/get-in letvar1946990 ["Keys"]))) (letvar1946990 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1946990 ["NextToken"])))))))

(clojure.core/defn- response-get-resource-metrics-response ([input] (response-get-resource-metrics-response nil input)) ([resultWrapper1946992 input] (clojure.core/let [rawinput1946991 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1946993 {"AlignedStartTime" (rawinput1946991 "AlignedStartTime"), "AlignedEndTime" (rawinput1946991 "AlignedEndTime"), "Identifier" (rawinput1946991 "Identifier"), "MetricList" (rawinput1946991 "MetricList"), "NextToken" (rawinput1946991 "NextToken")}] (clojure.core/cond-> {} (letvar1946993 "AlignedStartTime") (clojure.core/assoc :aligned-start-time (deser-iso-timestamp (clojure.core/get-in letvar1946993 ["AlignedStartTime"]))) (letvar1946993 "AlignedEndTime") (clojure.core/assoc :aligned-end-time (deser-iso-timestamp (clojure.core/get-in letvar1946993 ["AlignedEndTime"]))) (letvar1946993 "Identifier") (clojure.core/assoc :identifier (deser-string (clojure.core/get-in letvar1946993 ["Identifier"]))) (letvar1946993 "MetricList") (clojure.core/assoc :metric-list (deser-metric-key-data-points-list (clojure.core/get-in letvar1946993 ["MetricList"]))) (letvar1946993 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1946993 ["NextToken"])))))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper1946995 input] (clojure.core/let [rawinput1946994 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1946996 {"Message" (rawinput1946994 "Message")}] (clojure.core/cond-> {} (letvar1946996 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1946996 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.pi/response-partition-key-list (clojure.spec.alpha/coll-of :portkey.aws.pi/response-partition-key))

(clojure.spec.alpha/def :portkey.aws.pi/dimension-map (clojure.spec.alpha/map-of :portkey.aws.pi/string :portkey.aws.pi/string))

(clojure.spec.alpha/def :portkey.aws.pi/string-list (clojure.spec.alpha/coll-of :portkey.aws.pi/string :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.pi/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.pi/service-type #{"RDS" :rds})

(clojure.spec.alpha/def :portkey.aws.pi/metric-query-filter-map (clojure.spec.alpha/map-of :portkey.aws.pi/string :portkey.aws.pi/string))

(clojure.spec.alpha/def :portkey.aws.pi/metric-values-list (clojure.spec.alpha/coll-of :portkey.aws.pi/double))

(clojure.spec.alpha/def :portkey.aws.pi/dimension-key-description-list (clojure.spec.alpha/coll-of :portkey.aws.pi/dimension-key-description))

(clojure.spec.alpha/def :portkey.aws.pi.dimension-key-description/dimensions (clojure.spec.alpha/and :portkey.aws.pi/dimension-map))
(clojure.spec.alpha/def :portkey.aws.pi.dimension-key-description/total (clojure.spec.alpha/and :portkey.aws.pi/double))
(clojure.spec.alpha/def :portkey.aws.pi.dimension-key-description/partitions (clojure.spec.alpha/and :portkey.aws.pi/metric-values-list))
(clojure.spec.alpha/def :portkey.aws.pi/dimension-key-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pi.dimension-key-description/dimensions :portkey.aws.pi.dimension-key-description/total :portkey.aws.pi.dimension-key-description/partitions]))

(clojure.spec.alpha/def :portkey.aws.pi.internal-service-error/message (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi/internal-service-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pi.internal-service-error/message]))

(clojure.spec.alpha/def :portkey.aws.pi.response-resource-metric-key/metric (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.response-resource-metric-key/dimensions (clojure.spec.alpha/and :portkey.aws.pi/dimension-map))
(clojure.spec.alpha/def :portkey.aws.pi/response-resource-metric-key (clojure.spec.alpha/keys :req-un [:portkey.aws.pi.response-resource-metric-key/metric] :opt-un [:portkey.aws.pi.response-resource-metric-key/dimensions]))

(clojure.spec.alpha/def :portkey.aws.pi.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pi.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pi/limit (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-response/aligned-start-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-response/aligned-end-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-response/partition-keys (clojure.spec.alpha/and :portkey.aws.pi/response-partition-key-list))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-response/keys (clojure.spec.alpha/and :portkey.aws.pi/dimension-key-description-list))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi/describe-dimension-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pi.describe-dimension-keys-response/aligned-start-time :portkey.aws.pi.describe-dimension-keys-response/aligned-end-time :portkey.aws.pi.describe-dimension-keys-response/partition-keys :portkey.aws.pi.describe-dimension-keys-response/keys :portkey.aws.pi.describe-dimension-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pi/iso-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.pi.dimension-group/group (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.dimension-group/dimensions (clojure.spec.alpha/and :portkey.aws.pi/string-list))
(clojure.spec.alpha/def :portkey.aws.pi/dimension-group (clojure.spec.alpha/keys :req-un [:portkey.aws.pi.dimension-group/group] :opt-un [:portkey.aws.pi.dimension-group/dimensions :portkey.aws.pi/limit]))

(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-response/aligned-start-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-response/aligned-end-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-response/identifier (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-response/metric-list (clojure.spec.alpha/and :portkey.aws.pi/metric-key-data-points-list))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-response/next-token (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi/get-resource-metrics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pi.get-resource-metrics-response/aligned-start-time :portkey.aws.pi.get-resource-metrics-response/aligned-end-time :portkey.aws.pi.get-resource-metrics-response/identifier :portkey.aws.pi.get-resource-metrics-response/metric-list :portkey.aws.pi.get-resource-metrics-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pi.data-point/timestamp (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.data-point/value (clojure.spec.alpha/and :portkey.aws.pi/double))
(clojure.spec.alpha/def :portkey.aws.pi/data-point (clojure.spec.alpha/keys :req-un [:portkey.aws.pi.data-point/timestamp :portkey.aws.pi.data-point/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pi/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.pi/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pi/data-points-list (clojure.spec.alpha/coll-of :portkey.aws.pi/data-point))

(clojure.spec.alpha/def :portkey.aws.pi.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pi.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pi.metric-key-data-points/key (clojure.spec.alpha/and :portkey.aws.pi/response-resource-metric-key))
(clojure.spec.alpha/def :portkey.aws.pi.metric-key-data-points/data-points (clojure.spec.alpha/and :portkey.aws.pi/data-points-list))
(clojure.spec.alpha/def :portkey.aws.pi/metric-key-data-points (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pi.metric-key-data-points/key :portkey.aws.pi.metric-key-data-points/data-points]))

(clojure.spec.alpha/def :portkey.aws.pi/max-results (clojure.spec.alpha/int-in 0 20))

(clojure.spec.alpha/def :portkey.aws.pi.metric-query/metric (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.metric-query/group-by (clojure.spec.alpha/and :portkey.aws.pi/dimension-group))
(clojure.spec.alpha/def :portkey.aws.pi.metric-query/filter (clojure.spec.alpha/and :portkey.aws.pi/metric-query-filter-map))
(clojure.spec.alpha/def :portkey.aws.pi/metric-query (clojure.spec.alpha/keys :req-un [:portkey.aws.pi.metric-query/metric] :opt-un [:portkey.aws.pi.metric-query/group-by :portkey.aws.pi.metric-query/filter]))

(clojure.spec.alpha/def :portkey.aws.pi.response-partition-key/dimensions (clojure.spec.alpha/and :portkey.aws.pi/dimension-map))
(clojure.spec.alpha/def :portkey.aws.pi/response-partition-key (clojure.spec.alpha/keys :req-un [:portkey.aws.pi.response-partition-key/dimensions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-request/identifier (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-request/metric-queries (clojure.spec.alpha/and :portkey.aws.pi/metric-query-list))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-request/start-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-request/end-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-request/period-in-seconds (clojure.spec.alpha/and :portkey.aws.pi/integer))
(clojure.spec.alpha/def :portkey.aws.pi.get-resource-metrics-request/next-token (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi/get-resource-metrics-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pi/service-type :portkey.aws.pi.get-resource-metrics-request/identifier :portkey.aws.pi.get-resource-metrics-request/metric-queries :portkey.aws.pi.get-resource-metrics-request/start-time :portkey.aws.pi.get-resource-metrics-request/end-time] :opt-un [:portkey.aws.pi.get-resource-metrics-request/period-in-seconds :portkey.aws.pi/max-results :portkey.aws.pi.get-resource-metrics-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.pi/metric-key-data-points-list (clojure.spec.alpha/coll-of :portkey.aws.pi/metric-key-data-points))

(clojure.spec.alpha/def :portkey.aws.pi/metric-query-list (clojure.spec.alpha/coll-of :portkey.aws.pi/metric-query :min-count 1 :max-count 15))

(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/period-in-seconds (clojure.spec.alpha/and :portkey.aws.pi/integer))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/filter (clojure.spec.alpha/and :portkey.aws.pi/metric-query-filter-map))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/end-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/start-time (clojure.spec.alpha/and :portkey.aws.pi/iso-timestamp))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/group-by (clojure.spec.alpha/and :portkey.aws.pi/dimension-group))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/metric (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/identifier (clojure.spec.alpha/and :portkey.aws.pi/string))
(clojure.spec.alpha/def :portkey.aws.pi.describe-dimension-keys-request/partition-by (clojure.spec.alpha/and :portkey.aws.pi/dimension-group))
(clojure.spec.alpha/def :portkey.aws.pi/describe-dimension-keys-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pi/service-type :portkey.aws.pi.describe-dimension-keys-request/identifier :portkey.aws.pi.describe-dimension-keys-request/start-time :portkey.aws.pi.describe-dimension-keys-request/end-time :portkey.aws.pi.describe-dimension-keys-request/metric :portkey.aws.pi.describe-dimension-keys-request/group-by] :opt-un [:portkey.aws.pi.describe-dimension-keys-request/period-in-seconds :portkey.aws.pi.describe-dimension-keys-request/filter :portkey.aws.pi.describe-dimension-keys-request/next-token :portkey.aws.pi/max-results :portkey.aws.pi.describe-dimension-keys-request/partition-by]))

(clojure.core/defn describe-dimension-keys ([describe-dimension-keys-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-dimension-keys-request describe-dimension-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.pi/endpoints, :http.request.configuration/target-prefix "PerformanceInsightsv20180227", :http.request.spec/output-spec :portkey.aws.pi/describe-dimension-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-02-27", :http.request.configuration/service-id "PI", :http.request.spec/input-spec :portkey.aws.pi/describe-dimension-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDimensionKeys", :http.request.configuration/output-deser-fn response-describe-dimension-keys-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.pi/invalid-argument-exception, "InternalServiceError" :portkey.aws.pi/internal-service-error, "NotAuthorizedException" :portkey.aws.pi/not-authorized-exception}})))))
(clojure.spec.alpha/fdef describe-dimension-keys :args (clojure.spec.alpha/tuple :portkey.aws.pi/describe-dimension-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.pi/describe-dimension-keys-response))

(clojure.core/defn get-resource-metrics ([get-resource-metrics-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-resource-metrics-request get-resource-metrics-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.pi/endpoints, :http.request.configuration/target-prefix "PerformanceInsightsv20180227", :http.request.spec/output-spec :portkey.aws.pi/get-resource-metrics-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-02-27", :http.request.configuration/service-id "PI", :http.request.spec/input-spec :portkey.aws.pi/get-resource-metrics-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourceMetrics", :http.request.configuration/output-deser-fn response-get-resource-metrics-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.pi/invalid-argument-exception, "InternalServiceError" :portkey.aws.pi/internal-service-error, "NotAuthorizedException" :portkey.aws.pi/not-authorized-exception}})))))
(clojure.spec.alpha/fdef get-resource-metrics :args (clojure.spec.alpha/tuple :portkey.aws.pi/get-resource-metrics-request) :ret (clojure.spec.alpha/and :portkey.aws.pi/get-resource-metrics-response))
