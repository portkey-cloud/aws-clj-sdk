(ns portkey.aws.health.-2016-08-04 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "health", :region "us-east-1"},
    :ssl-common-name "health.us-east-1.amazonaws.com",
    :endpoint "https://health.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare serentity-value)

(clojure.core/declare ser-event-type-category-list)

(clojure.core/declare serregion-list)

(clojure.core/declare sertag-set)

(clojure.core/declare serevent-aggregate-field)

(clojure.core/declare serentity-arn-list)

(clojure.core/declare ser-event-type-filter)

(clojure.core/declare serentity-arn)

(clojure.core/declare serevent-type-list)

(clojure.core/declare seravailability-zones)

(clojure.core/declare serdate-time-range-list)

(clojure.core/declare serevent-status-code-list)

(clojure.core/declare serevent-status-code)

(clojure.core/declare serevent-type)

(clojure.core/declare sertimestamp)

(clojure.core/declare serentity-status-code-list)

(clojure.core/declare serevent-arn)

(clojure.core/declare sermax-results)

(clojure.core/declare sertag-value)

(clojure.core/declare sernext-token)

(clojure.core/declare serlocale)

(clojure.core/declare serregion)

(clojure.core/declare seravailability-zone)

(clojure.core/declare serevent-type-category)

(clojure.core/declare serevent-type-category-list)

(clojure.core/declare serentity-status-code)

(clojure.core/declare serservice-list)

(clojure.core/declare ser-date-time-range)

(clojure.core/declare sertag-filter)

(clojure.core/declare serevent-type-code)

(clojure.core/declare serentity-value-list)

(clojure.core/declare ser-entity-filter)

(clojure.core/declare serservice)

(clojure.core/declare serevent-arn-list)

(clojure.core/declare sertag-key)

(clojure.core/declare ser-event-filter)

(clojure.core/declare ser-event-type-code-list)

(clojure.core/declare ser-event-arns-list)

(clojure.core/defn- serentity-value [input] #:http.request.field{:value input, :shape "entityValue"})

(clojure.core/defn- ser-event-type-category-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serevent-type-category coll) #:http.request.field{:shape "eventTypeCategory"}))) input), :shape "EventTypeCategoryList", :type "list", :max 10, :min 1})

(clojure.core/defn- serregion-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serregion coll) #:http.request.field{:shape "region"}))) input), :shape "regionList", :type "list", :max 10, :min 1})

(clojure.core/defn- sertag-set [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (sertag-key k) #:http.request.field{:map-info "key", :shape "tagKey"}) (clojure.core/into (sertag-value v) #:http.request.field{:map-info "value", :shape "tagValue"})])) input), :shape "tagSet", :type "map", :max 50})

(clojure.core/defn- serevent-aggregate-field [input] #:http.request.field{:value (clojure.core/get {"eventTypeCategory" "eventTypeCategory", :event-type-category "eventTypeCategory"} input), :shape "eventAggregateField"})

(clojure.core/defn- serentity-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serentity-arn coll) #:http.request.field{:shape "entityArn"}))) input), :shape "entityArnList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-event-type-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EventTypeFilter", :type "structure"} (clojure.core/contains? input :event-type-codes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-type-code-list (input :event-type-codes)) #:http.request.field{:name "eventTypeCodes", :shape "EventTypeCodeList"})) (clojure.core/contains? input :services) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serservice-list (input :services)) #:http.request.field{:name "services", :shape "serviceList"})) (clojure.core/contains? input :event-type-categories) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-type-category-list (input :event-type-categories)) #:http.request.field{:name "eventTypeCategories", :shape "EventTypeCategoryList"}))))

(clojure.core/defn- serentity-arn [input] #:http.request.field{:value input, :shape "entityArn"})

(clojure.core/defn- serevent-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serevent-type coll) #:http.request.field{:shape "eventType"}))) input), :shape "eventTypeList", :type "list", :max 10, :min 1})

(clojure.core/defn- seravailability-zones [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (seravailability-zone coll) #:http.request.field{:shape "availabilityZone"}))) input), :shape "availabilityZones", :type "list"})

(clojure.core/defn- serdate-time-range-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-date-time-range coll) #:http.request.field{:shape "DateTimeRange"}))) input), :shape "dateTimeRangeList", :type "list", :max 10, :min 1})

(clojure.core/defn- serevent-status-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serevent-status-code coll) #:http.request.field{:shape "eventStatusCode"}))) input), :shape "eventStatusCodeList", :type "list", :max 6, :min 1})

(clojure.core/defn- serevent-status-code [input] #:http.request.field{:value (clojure.core/get {"open" "open", :open "open", "closed" "closed", :closed "closed", "upcoming" "upcoming", :upcoming "upcoming"} input), :shape "eventStatusCode"})

(clojure.core/defn- serevent-type [input] #:http.request.field{:value input, :shape "eventType"})

(clojure.core/defn- sertimestamp [input] #:http.request.field{:value input, :shape "timestamp"})

(clojure.core/defn- serentity-status-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serentity-status-code coll) #:http.request.field{:shape "entityStatusCode"}))) input), :shape "entityStatusCodeList", :type "list", :max 3, :min 1})

(clojure.core/defn- serevent-arn [input] #:http.request.field{:value input, :shape "eventArn"})

(clojure.core/defn- sermax-results [input] #:http.request.field{:value input, :shape "maxResults"})

(clojure.core/defn- sertag-value [input] #:http.request.field{:value input, :shape "tagValue"})

(clojure.core/defn- sernext-token [input] #:http.request.field{:value input, :shape "nextToken"})

(clojure.core/defn- serlocale [input] #:http.request.field{:value input, :shape "locale"})

(clojure.core/defn- serregion [input] #:http.request.field{:value input, :shape "region"})

(clojure.core/defn- seravailability-zone [input] #:http.request.field{:value input, :shape "availabilityZone"})

(clojure.core/defn- serevent-type-category [input] #:http.request.field{:value (clojure.core/get {"issue" "issue", :issue "issue", "accountNotification" "accountNotification", :account-notification "accountNotification", "scheduledChange" "scheduledChange", :scheduled-change "scheduledChange"} input), :shape "eventTypeCategory"})

(clojure.core/defn- serevent-type-category-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serevent-type-category coll) #:http.request.field{:shape "eventTypeCategory"}))) input), :shape "eventTypeCategoryList", :type "list", :max 10, :min 1})

(clojure.core/defn- serentity-status-code [input] #:http.request.field{:value (clojure.core/get {"IMPAIRED" "IMPAIRED", :impaired "IMPAIRED", "UNIMPAIRED" "UNIMPAIRED", :unimpaired "UNIMPAIRED", "UNKNOWN" "UNKNOWN", :unknown "UNKNOWN"} input), :shape "entityStatusCode"})

(clojure.core/defn- serservice-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serservice coll) #:http.request.field{:shape "service"}))) input), :shape "serviceList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-date-time-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DateTimeRange", :type "structure"} (clojure.core/contains? input :from) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertimestamp (input :from)) #:http.request.field{:name "from", :shape "timestamp"})) (clojure.core/contains? input :to) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertimestamp (input :to)) #:http.request.field{:name "to", :shape "timestamp"}))))

(clojure.core/defn- sertag-filter [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (sertag-set coll) #:http.request.field{:shape "tagSet"}))) input), :shape "tagFilter", :type "list", :max 50})

(clojure.core/defn- serevent-type-code [input] #:http.request.field{:value input, :shape "eventTypeCode"})

(clojure.core/defn- serentity-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serentity-value coll) #:http.request.field{:shape "entityValue"}))) input), :shape "entityValueList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-entity-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serevent-arn-list (:event-arns input)) #:http.request.field{:name "eventArns", :shape "eventArnList"})], :shape "EntityFilter", :type "structure"} (clojure.core/contains? input :entity-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serentity-arn-list (input :entity-arns)) #:http.request.field{:name "entityArns", :shape "entityArnList"})) (clojure.core/contains? input :entity-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serentity-value-list (input :entity-values)) #:http.request.field{:name "entityValues", :shape "entityValueList"})) (clojure.core/contains? input :last-updated-times) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serdate-time-range-list (input :last-updated-times)) #:http.request.field{:name "lastUpdatedTimes", :shape "dateTimeRangeList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertag-filter (input :tags)) #:http.request.field{:name "tags", :shape "tagFilter"})) (clojure.core/contains? input :status-codes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serentity-status-code-list (input :status-codes)) #:http.request.field{:name "statusCodes", :shape "entityStatusCodeList"}))))

(clojure.core/defn- serservice [input] #:http.request.field{:value input, :shape "service"})

(clojure.core/defn- serevent-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serevent-arn coll) #:http.request.field{:shape "eventArn"}))) input), :shape "eventArnList", :type "list", :max 10, :min 1})

(clojure.core/defn- sertag-key [input] #:http.request.field{:value input, :shape "tagKey"})

(clojure.core/defn- ser-event-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EventFilter", :type "structure"} (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seravailability-zones (input :availability-zones)) #:http.request.field{:name "availabilityZones", :shape "availabilityZones"})) (clojure.core/contains? input :last-updated-times) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serdate-time-range-list (input :last-updated-times)) #:http.request.field{:name "lastUpdatedTimes", :shape "dateTimeRangeList"})) (clojure.core/contains? input :services) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serservice-list (input :services)) #:http.request.field{:name "services", :shape "serviceList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertag-filter (input :tags)) #:http.request.field{:name "tags", :shape "tagFilter"})) (clojure.core/contains? input :event-status-codes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serevent-status-code-list (input :event-status-codes)) #:http.request.field{:name "eventStatusCodes", :shape "eventStatusCodeList"})) (clojure.core/contains? input :entity-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serentity-value-list (input :entity-values)) #:http.request.field{:name "entityValues", :shape "entityValueList"})) (clojure.core/contains? input :event-type-codes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serevent-type-list (input :event-type-codes)) #:http.request.field{:name "eventTypeCodes", :shape "eventTypeList"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serregion-list (input :regions)) #:http.request.field{:name "regions", :shape "regionList"})) (clojure.core/contains? input :end-times) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serdate-time-range-list (input :end-times)) #:http.request.field{:name "endTimes", :shape "dateTimeRangeList"})) (clojure.core/contains? input :event-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serevent-arn-list (input :event-arns)) #:http.request.field{:name "eventArns", :shape "eventArnList"})) (clojure.core/contains? input :start-times) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serdate-time-range-list (input :start-times)) #:http.request.field{:name "startTimes", :shape "dateTimeRangeList"})) (clojure.core/contains? input :event-type-categories) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serevent-type-category-list (input :event-type-categories)) #:http.request.field{:name "eventTypeCategories", :shape "eventTypeCategoryList"})) (clojure.core/contains? input :entity-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serentity-arn-list (input :entity-arns)) #:http.request.field{:name "entityArns", :shape "entityArnList"}))))

(clojure.core/defn- ser-event-type-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serevent-type-code coll) #:http.request.field{:shape "eventTypeCode"}))) input), :shape "EventTypeCodeList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-event-arns-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serevent-arn coll) #:http.request.field{:shape "eventArn"}))) input), :shape "EventArnsList", :type "list", :max 50, :min 1})

(clojure.core/defn- req-describe-affected-entities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-filter (input :filter)) #:http.request.field{:name "filter", :shape "EntityFilter"})]} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlocale (input :locale)) #:http.request.field{:name "locale", :shape "locale"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "maxResults"}))))

(clojure.core/defn- req-describe-events-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-filter (input :filter)) #:http.request.field{:name "filter", :shape "EventFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "maxResults"})) (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlocale (input :locale)) #:http.request.field{:name "locale", :shape "locale"}))))

(clojure.core/defn- req-describe-event-details-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serevent-arn-list (input :event-arns)) #:http.request.field{:name "eventArns", :shape "eventArnList"})]} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlocale (input :locale)) #:http.request.field{:name "locale", :shape "locale"}))))

(clojure.core/defn- req-describe-event-types-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-type-filter (input :filter)) #:http.request.field{:name "filter", :shape "EventTypeFilter"})) (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlocale (input :locale)) #:http.request.field{:name "locale", :shape "locale"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "maxResults"}))))

(clojure.core/defn- req-describe-entity-aggregates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :event-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-arns-list (input :event-arns)) #:http.request.field{:name "eventArns", :shape "EventArnsList"}))))

(clojure.core/defn- req-describe-event-aggregates-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serevent-aggregate-field (input :aggregate-field)) #:http.request.field{:name "aggregateField", :shape "eventAggregateField"})]} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-filter (input :filter)) #:http.request.field{:name "filter", :shape "EventFilter"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "nextToken"}))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-category-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-type-category :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.unsupported-locale/message (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/string))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/unsupported-locale (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.unsupported-locale/message]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.invalid-pagination-token/message (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/string))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/invalid-pagination-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.invalid-pagination-token/message]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/metadata-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-details-error-item/error-name (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/string))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-details-error-item/error-message (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/string))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-details-error-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04/event-arn :portkey.aws.health.-2016-08-04.event-details-error-item/error-name :portkey.aws.health.-2016-08-04.event-details-error-item/error-message]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/region-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/region :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/tag-set (clojure.spec.alpha/map-of :portkey.aws.health.-2016-08-04/tag-key :portkey.aws.health.-2016-08-04/tag-value))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-aggregate-field #{:event-type-category "eventTypeCategory"})

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-arn-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/entity-arn :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/metadata-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-type-filter/event-type-codes (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-code-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-type-filter/services (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/service-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-type-filter/event-type-categories (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-category-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.event-type-filter/event-type-codes :portkey.aws.health.-2016-08-04.event-type-filter/services :portkey.aws.health.-2016-08-04.event-type-filter/event-type-categories]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9]{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-type))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-affected-entities-request/filter (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-filter))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-affected-entities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.health.-2016-08-04.describe-affected-entities-request/filter] :opt-un [:portkey.aws.health.-2016-08-04/locale :portkey.aws.health.-2016-08-04/next-token :portkey.aws.health.-2016-08-04/max-results]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-type :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-entity-aggregates-response/entity-aggregates (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-aggregate-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-entity-aggregates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-entity-aggregates-response/entity-aggregates]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/affected-entity))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/availability-zone))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-aggregates-response/event-aggregates (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-aggregate-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-aggregates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-event-aggregates-response/event-aggregates :portkey.aws.health.-2016-08-04/next-token]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-affected-entities-response/entities (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-affected-entities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-affected-entities-response/entities :portkey.aws.health.-2016-08-04/next-token]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/date-time-range-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/date-time-range :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-events-request/filter (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-filter))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-events-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-events-request/filter :portkey.aws.health.-2016-08-04/next-token :portkey.aws.health.-2016-08-04/max-results :portkey.aws.health.-2016-08-04/locale]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-status-code-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-status-code :min-count 1 :max-count 6))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-status-code #{:open :closed "upcoming" "closed" :upcoming "open"})

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 3 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event/arn (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-arn))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event/start-time (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event/last-updated-time (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event/status-code (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-status-code))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event/end-time (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.event/arn :portkey.aws.health.-2016-08-04.event/start-time :portkey.aws.health.-2016-08-04.event/last-updated-time :portkey.aws.health.-2016-08-04.event/status-code :portkey.aws.health.-2016-08-04/region :portkey.aws.health.-2016-08-04/availability-zone :portkey.aws.health.-2016-08-04/event-type-category :portkey.aws.health.-2016-08-04/event-type-code :portkey.aws.health.-2016-08-04.event/end-time :portkey.aws.health.-2016-08-04/service]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-type/code (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-code))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-type/category (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-category))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04/service :portkey.aws.health.-2016-08-04.event-type/code :portkey.aws.health.-2016-08-04.event-type/category]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-status-code-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/entity-status-code :min-count 1 :max-count 3))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1600)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:health:[^:]*:[^:]*:event(?:/[\w-]+){1}((?:/[\w-]+){2})?" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/aggregate-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-aggregate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04/event-arn :portkey.aws.health.-2016-08-04/count]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-details-request/event-arns (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-arn-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-details-request (clojure.spec.alpha/keys :req-un [:portkey.aws.health.-2016-08-04.describe-event-details-request/event-arns] :opt-un [:portkey.aws.health.-2016-08-04/locale]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/max-results (clojure.spec.alpha/int-in 10 100))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9=/+_.-]{4,512}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/locale (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 2 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-types-request/filter (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-filter))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-event-types-request/filter :portkey.aws.health.-2016-08-04/locale :portkey.aws.health.-2016-08-04/next-token :portkey.aws.health.-2016-08-04/max-results]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-aggregate-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-aggregate))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[^:/]{2,25}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/availability-zone (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-z]{2}\-[0-9a-z\-]{4,16}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-details/event (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-details/event-description (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-description))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.event-details/event :portkey.aws.health.-2016-08-04.event-details/event-description :portkey.aws.health.-2016-08-04/event-metadata]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-category #{"accountNotification" :issue "issue" "scheduledChange" :scheduled-change :account-notification})

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-entity-aggregates-request/event-arns (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-arns-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-entity-aggregates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-entity-aggregates-request/event-arns]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-category-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-type-category :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-status-code #{"UNKNOWN" :unknown "UNIMPAIRED" :impaired :unimpaired "IMPAIRED"})

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-aggregate-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/entity-aggregate))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/service-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/service :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-description/latest-description (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-description))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.event-description/latest-description]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-details-response/successful-set (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-event-details-successful-set))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-details-response/failed-set (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-event-details-failed-set))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-details-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-event-details-response/successful-set :portkey.aws.health.-2016-08-04.describe-event-details-response/failed-set]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-metadata (clojure.spec.alpha/map-of :portkey.aws.health.-2016-08-04/metadata-key :portkey.aws.health.-2016-08-04/metadata-value))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.date-time-range/from (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.date-time-range/to (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/date-time-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.date-time-range/from :portkey.aws.health.-2016-08-04.date-time-range/to]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/tag-filter (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/tag-set :max-count 50))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-details-failed-set (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-details-error-item))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 3 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-value-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/entity-value :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.entity-filter/event-arns (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-arn-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.entity-filter/entity-arns (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-arn-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.entity-filter/entity-values (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-value-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.entity-filter/last-updated-times (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/date-time-range-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.entity-filter/tags (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/tag-filter))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.entity-filter/status-codes (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-status-code-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/entity-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.health.-2016-08-04.entity-filter/event-arns] :opt-un [:portkey.aws.health.-2016-08-04.entity-filter/entity-arns :portkey.aws.health.-2016-08-04.entity-filter/entity-values :portkey.aws.health.-2016-08-04.entity-filter/last-updated-times :portkey.aws.health.-2016-08-04.entity-filter/tags :portkey.aws.health.-2016-08-04.entity-filter/status-codes]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/service (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 2 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-arn-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-aggregate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04/aggregate-value :portkey.aws.health.-2016-08-04/count]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-types-response/event-types (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-event-types-response/event-types :portkey.aws.health.-2016-08-04/next-token]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 127))))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-aggregates-request/filter (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-filter))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-event-aggregates-request/aggregate-field (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-aggregate-field))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-aggregates-request (clojure.spec.alpha/keys :req-un [:portkey.aws.health.-2016-08-04.describe-event-aggregates-request/aggregate-field] :opt-un [:portkey.aws.health.-2016-08-04.describe-event-aggregates-request/filter :portkey.aws.health.-2016-08-04/max-results :portkey.aws.health.-2016-08-04/next-token]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/last-updated-times (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/date-time-range-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/services (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/service-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/tags (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/tag-filter))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/event-status-codes (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-status-code-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/entity-values (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-value-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/event-type-codes (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/regions (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/region-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/end-times (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/date-time-range-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/event-arns (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-arn-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/start-times (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/date-time-range-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/event-type-categories (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-type-category-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.event-filter/entity-arns (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-arn-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04/availability-zones :portkey.aws.health.-2016-08-04.event-filter/last-updated-times :portkey.aws.health.-2016-08-04.event-filter/services :portkey.aws.health.-2016-08-04.event-filter/tags :portkey.aws.health.-2016-08-04.event-filter/event-status-codes :portkey.aws.health.-2016-08-04.event-filter/entity-values :portkey.aws.health.-2016-08-04.event-filter/event-type-codes :portkey.aws.health.-2016-08-04.event-filter/regions :portkey.aws.health.-2016-08-04.event-filter/end-times :portkey.aws.health.-2016-08-04.event-filter/event-arns :portkey.aws.health.-2016-08-04.event-filter/start-times :portkey.aws.health.-2016-08-04.event-filter/event-type-categories :portkey.aws.health.-2016-08-04.event-filter/entity-arns]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.affected-entity/aws-account-id (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/account-id))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.affected-entity/last-updated-time (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.affected-entity/status-code (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/entity-status-code))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.affected-entity/tags (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/tag-set))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/affected-entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04/entity-arn :portkey.aws.health.-2016-08-04/event-arn :portkey.aws.health.-2016-08-04/entity-value :portkey.aws.health.-2016-08-04.affected-entity/aws-account-id :portkey.aws.health.-2016-08-04.affected-entity/last-updated-time :portkey.aws.health.-2016-08-04.affected-entity/status-code :portkey.aws.health.-2016-08-04.affected-entity/tags]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04.describe-events-response/events (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/event-list))
(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.health.-2016-08-04.describe-events-response/events :portkey.aws.health.-2016-08-04/next-token]))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-type-code-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-type-code :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/event-arns-list (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-arn :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.health.-2016-08-04/describe-event-details-successful-set (clojure.spec.alpha/coll-of :portkey.aws.health.-2016-08-04/event-details))

(clojure.core/defn describe-affected-entities ([describe-affected-entities-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-affected-entities-request describe-affected-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.health.-2016-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.health.-2016-08-04/describe-affected-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-08-04", :http.request.configuration/service-id "Health", :http.request.spec/input-spec :portkey.aws.health.-2016-08-04/describe-affected-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAffectedEntities", :http.request.spec/error-spec {"InvalidPaginationToken" :portkey.aws.health.-2016-08-04/invalid-pagination-token, "UnsupportedLocale" :portkey.aws.health.-2016-08-04/unsupported-locale}})))))
(clojure.spec.alpha/fdef describe-affected-entities :args (clojure.spec.alpha/tuple :portkey.aws.health.-2016-08-04/describe-affected-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-affected-entities-response))

(clojure.core/defn describe-entity-aggregates ([] (describe-entity-aggregates {})) ([describe-entity-aggregates-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-entity-aggregates-request describe-entity-aggregates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.health.-2016-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.health.-2016-08-04/describe-entity-aggregates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-08-04", :http.request.configuration/service-id "Health", :http.request.spec/input-spec :portkey.aws.health.-2016-08-04/describe-entity-aggregates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEntityAggregates", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-entity-aggregates :args (clojure.spec.alpha/? :portkey.aws.health.-2016-08-04/describe-entity-aggregates-request) :ret (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-entity-aggregates-response))

(clojure.core/defn describe-event-aggregates ([describe-event-aggregates-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-event-aggregates-request describe-event-aggregates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.health.-2016-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.health.-2016-08-04/describe-event-aggregates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-08-04", :http.request.configuration/service-id "Health", :http.request.spec/input-spec :portkey.aws.health.-2016-08-04/describe-event-aggregates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventAggregates", :http.request.spec/error-spec {"InvalidPaginationToken" :portkey.aws.health.-2016-08-04/invalid-pagination-token}})))))
(clojure.spec.alpha/fdef describe-event-aggregates :args (clojure.spec.alpha/tuple :portkey.aws.health.-2016-08-04/describe-event-aggregates-request) :ret (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-event-aggregates-response))

(clojure.core/defn describe-event-details ([describe-event-details-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-event-details-request describe-event-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.health.-2016-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.health.-2016-08-04/describe-event-details-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-08-04", :http.request.configuration/service-id "Health", :http.request.spec/input-spec :portkey.aws.health.-2016-08-04/describe-event-details-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventDetails", :http.request.spec/error-spec {"UnsupportedLocale" :portkey.aws.health.-2016-08-04/unsupported-locale}})))))
(clojure.spec.alpha/fdef describe-event-details :args (clojure.spec.alpha/tuple :portkey.aws.health.-2016-08-04/describe-event-details-request) :ret (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-event-details-response))

(clojure.core/defn describe-event-types ([] (describe-event-types {})) ([describe-event-types-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-event-types-request describe-event-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.health.-2016-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.health.-2016-08-04/describe-event-types-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-08-04", :http.request.configuration/service-id "Health", :http.request.spec/input-spec :portkey.aws.health.-2016-08-04/describe-event-types-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventTypes", :http.request.spec/error-spec {"InvalidPaginationToken" :portkey.aws.health.-2016-08-04/invalid-pagination-token, "UnsupportedLocale" :portkey.aws.health.-2016-08-04/unsupported-locale}})))))
(clojure.spec.alpha/fdef describe-event-types :args (clojure.spec.alpha/? :portkey.aws.health.-2016-08-04/describe-event-types-request) :ret (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-event-types-response))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-events-request describe-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.health.-2016-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.health.-2016-08-04/describe-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-08-04", :http.request.configuration/service-id "Health", :http.request.spec/input-spec :portkey.aws.health.-2016-08-04/describe-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEvents", :http.request.spec/error-spec {"InvalidPaginationToken" :portkey.aws.health.-2016-08-04/invalid-pagination-token, "UnsupportedLocale" :portkey.aws.health.-2016-08-04/unsupported-locale}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.health.-2016-08-04/describe-events-request) :ret (clojure.spec.alpha/and :portkey.aws.health.-2016-08-04/describe-events-response))
