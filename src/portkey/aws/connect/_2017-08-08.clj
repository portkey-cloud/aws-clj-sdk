(ns portkey.aws.connect.-2017-08-08 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-max-result-1000)

(clojure.core/declare ser-unit)

(clojure.core/declare ser-instance-id)

(clojure.core/declare ser-threshold-value)

(clojure.core/declare ser-current-metric)

(clojure.core/declare ser-historical-metrics)

(clojure.core/declare ser-email)

(clojure.core/declare ser-threshold)

(clojure.core/declare ser-contact-flow-id)

(clojure.core/declare ser-historical-metric-name)

(clojure.core/declare ser-password)

(clojure.core/declare ser-agent-first-name)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-auto-accept)

(clojure.core/declare ser-security-profile-id)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-after-contact-work-time-limit)

(clojure.core/declare ser-current-metric-name)

(clojure.core/declare ser-agent-last-name)

(clojure.core/declare ser-security-profile-ids)

(clojure.core/declare sertimestamp)

(clojure.core/declare ser-contact-id)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-historical-metric)

(clojure.core/declare ser-groupings)

(clojure.core/declare ser-grouping)

(clojure.core/declare ser-max-result-100)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-user-identity-info)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-queues)

(clojure.core/declare ser-hierarchy-group-id)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-current-metrics)

(clojure.core/declare ser-comparison)

(clojure.core/declare ser-channel)

(clojure.core/declare ser-agent-username)

(clojure.core/declare ser-routing-profile-id)

(clojure.core/declare ser-phone-type)

(clojure.core/declare ser-directory-user-id)

(clojure.core/declare ser-statistic)

(clojure.core/declare ser-client-token)

(clojure.core/declare ser-queue-id)

(clojure.core/declare ser-user-phone-config)

(clojure.core/declare ser-phone-number)

(clojure.core/declare ser-channels)

(clojure.core/defn- ser-max-result-1000 [input] #:http.request.field{:value input, :shape "MaxResult1000"})

(clojure.core/defn- ser-unit [input] #:http.request.field{:value (clojure.core/get {"SECONDS" "SECONDS", :seconds "SECONDS", "COUNT" "COUNT", :count "COUNT", "PERCENT" "PERCENT", :percent "PERCENT"} input), :shape "Unit"})

(clojure.core/defn- ser-instance-id [input] #:http.request.field{:value input, :shape "InstanceId"})

(clojure.core/defn- ser-threshold-value [input] #:http.request.field{:value input, :shape "ThresholdValue"})

(clojure.core/defn- ser-current-metric [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CurrentMetric", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-current-metric-name (input :name)) #:http.request.field{:name "Name", :shape "CurrentMetricName"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-unit (input :unit)) #:http.request.field{:name "Unit", :shape "Unit"}))))

(clojure.core/defn- ser-historical-metrics [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-historical-metric coll) #:http.request.field{:shape "HistoricalMetric"}))) input), :shape "HistoricalMetrics", :type "list"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-threshold [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Threshold", :type "structure"} (clojure.core/contains? input :comparison) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparison (input :comparison)) #:http.request.field{:name "Comparison", :shape "Comparison"})) (clojure.core/contains? input :threshold-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threshold-value (input :threshold-value)) #:http.request.field{:name "ThresholdValue", :shape "ThresholdValue", :box true}))))

(clojure.core/defn- ser-contact-flow-id [input] #:http.request.field{:value input, :shape "ContactFlowId"})

(clojure.core/defn- ser-historical-metric-name [input] #:http.request.field{:value (clojure.core/get {:contacts-consulted "CONTACTS_CONSULTED", :interaction-time "INTERACTION_TIME", "QUEUE_ANSWER_TIME" "QUEUE_ANSWER_TIME", :service-level "SERVICE_LEVEL", "CONTACTS_HOLD_ABANDONS" "CONTACTS_HOLD_ABANDONS", :contacts-abandoned "CONTACTS_ABANDONED", "CONTACTS_QUEUED" "CONTACTS_QUEUED", :occupancy "OCCUPANCY", "CONTACTS_ABANDONED" "CONTACTS_ABANDONED", :queued-time "QUEUED_TIME", "CONTACTS_HANDLED" "CONTACTS_HANDLED", "API_CONTACTS_HANDLED" "API_CONTACTS_HANDLED", "CONTACTS_TRANSFERRED_IN" "CONTACTS_TRANSFERRED_IN", :callback-contacts-handled "CALLBACK_CONTACTS_HANDLED", "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE", :contacts-hold-abandons "CONTACTS_HOLD_ABANDONS", "CONTACTS_MISSED" "CONTACTS_MISSED", "HOLD_TIME" "HOLD_TIME", :contacts-handled-outbound "CONTACTS_HANDLED_OUTBOUND", :contacts-transferred-out-from-queue "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE", :contacts-handled "CONTACTS_HANDLED", :contacts-missed "CONTACTS_MISSED", :interaction-and-hold-time "INTERACTION_AND_HOLD_TIME", "CALLBACK_CONTACTS_HANDLED" "CALLBACK_CONTACTS_HANDLED", "OCCUPANCY" "OCCUPANCY", "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" "CONTACTS_TRANSFERRED_IN_FROM_QUEUE", :contacts-transferred-out "CONTACTS_TRANSFERRED_OUT", :api-contacts-handled "API_CONTACTS_HANDLED", "ABANDON_TIME" "ABANDON_TIME", "CONTACTS_HANDLED_INCOMING" "CONTACTS_HANDLED_INCOMING", "QUEUED_TIME" "QUEUED_TIME", "CONTACTS_TRANSFERRED_OUT" "CONTACTS_TRANSFERRED_OUT", "CONTACTS_AGENT_HUNG_UP_FIRST" "CONTACTS_AGENT_HUNG_UP_FIRST", "HANDLE_TIME" "HANDLE_TIME", "INTERACTION_AND_HOLD_TIME" "INTERACTION_AND_HOLD_TIME", :contacts-handled-incoming "CONTACTS_HANDLED_INCOMING", "AFTER_CONTACT_WORK_TIME" "AFTER_CONTACT_WORK_TIME", :handle-time "HANDLE_TIME", :after-contact-work-time "AFTER_CONTACT_WORK_TIME", "CONTACTS_CONSULTED" "CONTACTS_CONSULTED", :queue-answer-time "QUEUE_ANSWER_TIME", :hold-time "HOLD_TIME", "SERVICE_LEVEL" "SERVICE_LEVEL", :contacts-queued "CONTACTS_QUEUED", :contacts-transferred-in-from-queue "CONTACTS_TRANSFERRED_IN_FROM_QUEUE", :abandon-time "ABANDON_TIME", "CONTACTS_HANDLED_OUTBOUND" "CONTACTS_HANDLED_OUTBOUND", :contacts-agent-hung-up-first "CONTACTS_AGENT_HUNG_UP_FIRST", "INTERACTION_TIME" "INTERACTION_TIME", :contacts-transferred-in "CONTACTS_TRANSFERRED_IN"} input), :shape "HistoricalMetricName"})

(clojure.core/defn- ser-password [input] #:http.request.field{:value input, :shape "Password"})

(clojure.core/defn- ser-agent-first-name [input] #:http.request.field{:value input, :shape "AgentFirstName"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-auto-accept [input] #:http.request.field{:value input, :shape "AutoAccept"})

(clojure.core/defn- ser-security-profile-id [input] #:http.request.field{:value input, :shape "SecurityProfileId"})

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-after-contact-work-time-limit [input] #:http.request.field{:value input, :shape "AfterContactWorkTimeLimit"})

(clojure.core/defn- ser-current-metric-name [input] #:http.request.field{:value (clojure.core/get {:agents-staffed "AGENTS_STAFFED", "AGENTS_ERROR" "AGENTS_ERROR", "AGENTS_AFTER_CONTACT_WORK" "AGENTS_AFTER_CONTACT_WORK", :oldest-contact-age "OLDEST_CONTACT_AGE", :agents-non-productive "AGENTS_NON_PRODUCTIVE", :agents-available "AGENTS_AVAILABLE", :agents-error "AGENTS_ERROR", "AGENTS_NON_PRODUCTIVE" "AGENTS_NON_PRODUCTIVE", :agents-online "AGENTS_ONLINE", "AGENTS_ONLINE" "AGENTS_ONLINE", "AGENTS_ON_CALL" "AGENTS_ON_CALL", "CONTACTS_IN_QUEUE" "CONTACTS_IN_QUEUE", "OLDEST_CONTACT_AGE" "OLDEST_CONTACT_AGE", "CONTACTS_SCHEDULED" "CONTACTS_SCHEDULED", :agents-on-call "AGENTS_ON_CALL", :contacts-in-queue "CONTACTS_IN_QUEUE", "AGENTS_AVAILABLE" "AGENTS_AVAILABLE", :agents-after-contact-work "AGENTS_AFTER_CONTACT_WORK", "AGENTS_STAFFED" "AGENTS_STAFFED", :contacts-scheduled "CONTACTS_SCHEDULED"} input), :shape "CurrentMetricName"})

(clojure.core/defn- ser-agent-last-name [input] #:http.request.field{:value input, :shape "AgentLastName"})

(clojure.core/defn- ser-security-profile-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-profile-id coll) #:http.request.field{:shape "SecurityProfileId"}))) input), :shape "SecurityProfileIds", :type "list", :max 10, :min 1})

(clojure.core/defn- sertimestamp [input] #:http.request.field{:value input, :shape "timestamp"})

(clojure.core/defn- ser-contact-id [input] #:http.request.field{:value input, :shape "ContactId"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-historical-metric [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HistoricalMetric", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-historical-metric-name (input :name)) #:http.request.field{:name "Name", :shape "HistoricalMetricName"})) (clojure.core/contains? input :threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threshold (input :threshold)) #:http.request.field{:name "Threshold", :shape "Threshold", :box true})) (clojure.core/contains? input :statistic) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statistic (input :statistic)) #:http.request.field{:name "Statistic", :shape "Statistic"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-unit (input :unit)) #:http.request.field{:name "Unit", :shape "Unit"}))))

(clojure.core/defn- ser-groupings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-grouping coll) #:http.request.field{:shape "Grouping"}))) input), :shape "Groupings", :type "list", :max 2})

(clojure.core/defn- ser-grouping [input] #:http.request.field{:value (clojure.core/get {"QUEUE" "QUEUE", :queue "QUEUE", "CHANNEL" "CHANNEL", :channel "CHANNEL"} input), :shape "Grouping"})

(clojure.core/defn- ser-max-result-100 [input] #:http.request.field{:value input, :shape "MaxResult100"})

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "Attributes", :type "map"})

(clojure.core/defn- ser-user-identity-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UserIdentityInfo", :type "structure"} (clojure.core/contains? input :first-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-agent-first-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "AgentFirstName"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-agent-last-name (input :last-name)) #:http.request.field{:name "LastName", :shape "AgentLastName"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "Email", :shape "Email"}))))

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-queues [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-queue-id coll) #:http.request.field{:shape "QueueId"}))) input), :shape "Queues", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-hierarchy-group-id [input] #:http.request.field{:value input, :shape "HierarchyGroupId"})

(clojure.core/defn- ser-filters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filters", :type "structure"} (clojure.core/contains? input :queues) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queues (input :queues)) #:http.request.field{:name "Queues", :shape "Queues"})) (clojure.core/contains? input :channels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-channels (input :channels)) #:http.request.field{:name "Channels", :shape "Channels"}))))

(clojure.core/defn- ser-current-metrics [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-current-metric coll) #:http.request.field{:shape "CurrentMetric"}))) input), :shape "CurrentMetrics", :type "list"})

(clojure.core/defn- ser-comparison [input] #:http.request.field{:value (clojure.core/get {"LT" "LT", :lt "LT"} input), :shape "Comparison"})

(clojure.core/defn- ser-channel [input] #:http.request.field{:value (clojure.core/get {"VOICE" "VOICE", :voice "VOICE"} input), :shape "Channel"})

(clojure.core/defn- ser-agent-username [input] #:http.request.field{:value input, :shape "AgentUsername"})

(clojure.core/defn- ser-routing-profile-id [input] #:http.request.field{:value input, :shape "RoutingProfileId"})

(clojure.core/defn- ser-phone-type [input] #:http.request.field{:value (clojure.core/get {"SOFT_PHONE" "SOFT_PHONE", :soft-phone "SOFT_PHONE", "DESK_PHONE" "DESK_PHONE", :desk-phone "DESK_PHONE"} input), :shape "PhoneType"})

(clojure.core/defn- ser-directory-user-id [input] #:http.request.field{:value input, :shape "DirectoryUserId"})

(clojure.core/defn- ser-statistic [input] #:http.request.field{:value (clojure.core/get {"SUM" "SUM", :sum "SUM", "MAX" "MAX", :max "MAX", "AVG" "AVG", :avg "AVG"} input), :shape "Statistic"})

(clojure.core/defn- ser-client-token [input] #:http.request.field{:value input, :shape "ClientToken"})

(clojure.core/defn- ser-queue-id [input] #:http.request.field{:value input, :shape "QueueId"})

(clojure.core/defn- ser-user-phone-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-phone-type (:phone-type input)) #:http.request.field{:name "PhoneType", :shape "PhoneType"})], :shape "UserPhoneConfig", :type "structure"} (clojure.core/contains? input :auto-accept) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-accept (input :auto-accept)) #:http.request.field{:name "AutoAccept", :shape "AutoAccept"})) (clojure.core/contains? input :after-contact-work-time-limit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-after-contact-work-time-limit (input :after-contact-work-time-limit)) #:http.request.field{:name "AfterContactWorkTimeLimit", :shape "AfterContactWorkTimeLimit"})) (clojure.core/contains? input :desk-phone-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-phone-number (input :desk-phone-number)) #:http.request.field{:name "DeskPhoneNumber", :shape "PhoneNumber"}))))

(clojure.core/defn- ser-phone-number [input] #:http.request.field{:value input, :shape "PhoneNumber"})

(clojure.core/defn- ser-channels [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-channel coll) #:http.request.field{:shape "Channel"}))) input), :shape "Channels", :type "list", :max 1})

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-1000 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResult1000", :box true, :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-describe-user-hierarchy-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-hierarchy-group-id (input :hierarchy-group-id)) #:http.request.field{:name "HierarchyGroupId", :shape "HierarchyGroupId", :location "uri", :location-name "HierarchyGroupId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/defn- req-update-user-phone-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-phone-config (input :phone-config)) #:http.request.field{:name "PhoneConfig", :shape "UserPhoneConfig"})], :uri [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/defn- req-update-user-identity-info-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-identity-info (input :identity-info)) #:http.request.field{:name "IdentityInfo", :shape "UserIdentityInfo"})], :uri [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/defn- req-list-user-hierarchy-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-1000 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResult1000", :box true, :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-describe-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/defn- req-get-metric-data-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})], :body [(clojure.core/into (sertimestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "timestamp"}) (clojure.core/into (sertimestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "timestamp"}) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"}) (clojure.core/into (ser-historical-metrics (input :historical-metrics)) #:http.request.field{:name "HistoricalMetrics", :shape "HistoricalMetrics"})]} (clojure.core/contains? input :groupings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-groupings (input :groupings)) #:http.request.field{:name "Groupings", :shape "Groupings"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-100 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResult100", :box true}))))

(clojure.core/defn- req-get-current-metric-data-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})], :body [(clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"}) (clojure.core/into (ser-current-metrics (input :current-metrics)) #:http.request.field{:name "CurrentMetrics", :shape "CurrentMetrics"})]} (clojure.core/contains? input :groupings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-groupings (input :groupings)) #:http.request.field{:name "Groupings", :shape "Groupings"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-100 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResult100", :box true}))))

(clojure.core/defn- req-list-routing-profiles-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-1000 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResult1000", :box true, :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-user-security-profiles-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-security-profile-ids (input :security-profile-ids)) #:http.request.field{:name "SecurityProfileIds", :shape "SecurityProfileIds"})], :uri [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/defn- req-describe-user-hierarchy-structure-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/defn- req-update-user-routing-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-routing-profile-id (input :routing-profile-id)) #:http.request.field{:name "RoutingProfileId", :shape "RoutingProfileId"})], :uri [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/defn- req-update-contact-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-contact-id (input :initial-contact-id)) #:http.request.field{:name "InitialContactId", :shape "ContactId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"}) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "Attributes"})]}))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-agent-username (input :username)) #:http.request.field{:name "Username", :shape "AgentUsername"}) (clojure.core/into (ser-user-phone-config (input :phone-config)) #:http.request.field{:name "PhoneConfig", :shape "UserPhoneConfig"}) (clojure.core/into (ser-security-profile-ids (input :security-profile-ids)) #:http.request.field{:name "SecurityProfileIds", :shape "SecurityProfileIds"}) (clojure.core/into (ser-routing-profile-id (input :routing-profile-id)) #:http.request.field{:name "RoutingProfileId", :shape "RoutingProfileId"})], :uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"})) (clojure.core/contains? input :identity-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-identity-info (input :identity-info)) #:http.request.field{:name "IdentityInfo", :shape "UserIdentityInfo"})) (clojure.core/contains? input :hierarchy-group-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hierarchy-group-id (input :hierarchy-group-id)) #:http.request.field{:name "HierarchyGroupId", :shape "HierarchyGroupId"})) (clojure.core/contains? input :directory-user-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-user-id (input :directory-user-id)) #:http.request.field{:name "DirectoryUserId", :shape "DirectoryUserId"}))))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"}) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"})]}))

(clojure.core/defn- req-stop-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-contact-id (input :contact-id)) #:http.request.field{:name "ContactId", :shape "ContactId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})]}))

(clojure.core/defn- req-start-outbound-voice-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-phone-number (input :destination-phone-number)) #:http.request.field{:name "DestinationPhoneNumber", :shape "PhoneNumber"}) (clojure.core/into (ser-contact-flow-id (input :contact-flow-id)) #:http.request.field{:name "ContactFlowId", :shape "ContactFlowId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken", :idempotency-token true})) (clojure.core/contains? input :source-phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-phone-number (input :source-phone-number)) #:http.request.field{:name "SourcePhoneNumber", :shape "PhoneNumber"})) (clojure.core/contains? input :queue-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-id (input :queue-id)) #:http.request.field{:name "QueueId", :shape "QueueId"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "Attributes"}))))

(clojure.core/defn- req-list-security-profiles-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-1000 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResult1000", :box true, :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-user-hierarchy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :hierarchy-group-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hierarchy-group-id (input :hierarchy-group-id)) #:http.request.field{:name "HierarchyGroupId", :shape "HierarchyGroupId"}))))

(clojure.core/defn- req-get-federation-token-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/current-metric-results (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/current-metric-result))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.create-user-response/user-arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/user-id :portkey.aws.connect.-2017-08-08.create-user-response/user-arn]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/max-result-1000 (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/user-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/user-summary))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/routing-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/routing-profile-summary))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.get-current-metric-data-response/metric-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/current-metric-results))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.get-current-metric-data-response/data-snapshot-time (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/get-current-metric-data-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.get-current-metric-data-response/metric-results :portkey.aws.connect.-2017-08-08.get-current-metric-data-response/data-snapshot-time]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/unit #{"PERCENT" "COUNT" "SECONDS" :seconds :count :percent})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/threshold-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.routing-profile-summary/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/routing-profile-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.routing-profile-summary/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.routing-profile-summary/name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/routing-profile-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/routing-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.routing-profile-summary/id :portkey.aws.connect.-2017-08-08.routing-profile-summary/arn :portkey.aws.connect.-2017-08-08.routing-profile-summary/name]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.current-metric/name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/current-metric-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/current-metric (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.current-metric/name :portkey.aws.connect.-2017-08-08/unit]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.current-metric-result/collections (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/current-metric-data-collections))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/current-metric-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/dimensions :portkey.aws.connect.-2017-08-08.current-metric-result/collections]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/historical-metrics (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/historical-metric))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.list-users-request/max-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id] :opt-un [:portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.list-users-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/threshold (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/comparison :portkey.aws.connect.-2017-08-08/threshold-value]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.get-metric-data-response/metric-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/historical-metric-results))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/get-metric-data-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.get-metric-data-response/metric-results]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/contact-flow-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/historical-metric-name #{:contacts-consulted :interaction-time "QUEUE_ANSWER_TIME" :service-level "CONTACTS_HOLD_ABANDONS" :contacts-abandoned "CONTACTS_QUEUED" :occupancy "CONTACTS_ABANDONED" :queued-time "CONTACTS_HANDLED" "API_CONTACTS_HANDLED" "CONTACTS_TRANSFERRED_IN" :callback-contacts-handled "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" :contacts-hold-abandons "CONTACTS_MISSED" "HOLD_TIME" :contacts-handled-outbound :contacts-transferred-out-from-queue :contacts-handled :contacts-missed :interaction-and-hold-time "CALLBACK_CONTACTS_HANDLED" "OCCUPANCY" "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" :contacts-transferred-out :api-contacts-handled "ABANDON_TIME" "CONTACTS_HANDLED_INCOMING" "QUEUED_TIME" "CONTACTS_TRANSFERRED_OUT" "CONTACTS_AGENT_HUNG_UP_FIRST" "HANDLE_TIME" "INTERACTION_AND_HOLD_TIME" :contacts-handled-incoming "AFTER_CONTACT_WORK_TIME" :handle-time :after-contact-work-time "CONTACTS_CONSULTED" :queue-answer-time :hold-time "SERVICE_LEVEL" :contacts-queued :contacts-transferred-in-from-queue :abandon-time "CONTACTS_HANDLED_OUTBOUND" :contacts-agent-hung-up-first "INTERACTION_TIME" :contacts-transferred-in})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-one (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-two (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-three (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-four (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-five (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-structure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.hierarchy-structure/level-one :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-two :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-three :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-four :portkey.aws.connect.-2017-08-08.hierarchy-structure/level-five]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/hierarchy-group-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/agent-first-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 32767))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-group/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-group/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-group/name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-group/level-id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.hierarchy-group/id :portkey.aws.connect.-2017-08-08.hierarchy-group/arn :portkey.aws.connect.-2017-08-08.hierarchy-group/name :portkey.aws.connect.-2017-08-08.hierarchy-group/level-id :portkey.aws.connect.-2017-08-08/hierarchy-path]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/auto-accept clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/security-profile-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/update-contact-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-structure-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/hierarchy-structure]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/user-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/after-contact-work-time-limit (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/current-metric-name #{:agents-staffed "AGENTS_ERROR" "AGENTS_AFTER_CONTACT_WORK" :oldest-contact-age :agents-non-productive :agents-available :agents-error "AGENTS_NON_PRODUCTIVE" :agents-online "AGENTS_ONLINE" "AGENTS_ON_CALL" "CONTACTS_IN_QUEUE" "OLDEST_CONTACT_AGE" "CONTACTS_SCHEDULED" :agents-on-call :contacts-in-queue "AGENTS_AVAILABLE" :agents-after-contact-work "AGENTS_STAFFED" :contacts-scheduled})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.update-user-phone-config-request/phone-config (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-phone-config))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/update-user-phone-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08.update-user-phone-config-request/phone-config :portkey.aws.connect.-2017-08-08/user-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/agent-last-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/security-profile-ids (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/security-profile-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/current-metric-data-collections (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/current-metric-data))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/routing-profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user/username (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/agent-username))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user/phone-config (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-phone-config))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user/identity-info (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-identity-info))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.user/username :portkey.aws.connect.-2017-08-08.user/phone-config :portkey.aws.connect.-2017-08-08.user/identity-info :portkey.aws.connect.-2017-08-08/security-profile-ids :portkey.aws.connect.-2017-08-08/hierarchy-group-id :portkey.aws.connect.-2017-08-08.user/arn :portkey.aws.connect.-2017-08-08/routing-profile-id :portkey.aws.connect.-2017-08-08/directory-user-id :portkey.aws.connect.-2017-08-08.user/id]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.update-user-identity-info-request/identity-info (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-identity-info))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/update-user-identity-info-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08.update-user-identity-info-request/identity-info :portkey.aws.connect.-2017-08-08/user-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/contact-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user-summary/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user-summary/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user-summary/username (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/agent-username))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/user-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.user-summary/id :portkey.aws.connect.-2017-08-08.user-summary/arn :portkey.aws.connect.-2017-08-08.user-summary/username]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.historical-metric/name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/historical-metric-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/historical-metric (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.historical-metric/name :portkey.aws.connect.-2017-08-08/threshold :portkey.aws.connect.-2017-08-08/statistic :portkey.aws.connect.-2017-08-08/unit]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/historical-metric-results (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/historical-metric-result))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/groupings (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/grouping :max-count 2))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/destination-not-allowed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/security-profile-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/grouping #{:queue "QUEUE" :channel "CHANNEL"})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/max-result-100 (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-group-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/hierarchy-group-summary))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.list-user-hierarchy-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-user-hierarchy-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id] :opt-un [:portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.list-user-hierarchy-groups-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/attributes (clojure.spec.alpha/map-of :portkey.aws.connect.-2017-08-08/attribute-name :portkey.aws.connect.-2017-08-08/attribute-value))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-security-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/security-profile-summary-list :portkey.aws.connect.-2017-08-08/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.current-metric-data/metric (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/current-metric))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/current-metric-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.current-metric-data/metric :portkey.aws.connect.-2017-08-08/value]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-group-summary/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-group-summary/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-group-summary/name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-group-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.hierarchy-group-summary/id :portkey.aws.connect.-2017-08-08.hierarchy-group-summary/arn :portkey.aws.connect.-2017-08-08.hierarchy-group-summary/name]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user-identity-info/first-name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/agent-first-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user-identity-info/last-name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/agent-last-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/user-identity-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.user-identity-info/first-name :portkey.aws.connect.-2017-08-08.user-identity-info/last-name :portkey.aws.connect.-2017-08-08/email]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/describe-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/user]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.historical-metric-result/collections (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/historical-metric-data-collections))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/historical-metric-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/dimensions :portkey.aws.connect.-2017-08-08.historical-metric-result/collections]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/outbound-contact-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/describe-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/user-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 32767))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.get-metric-data-request/start-time (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.get-metric-data-request/end-time (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.get-metric-data-request/max-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/max-result-100))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/get-metric-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id :portkey.aws.connect.-2017-08-08.get-metric-data-request/start-time :portkey.aws.connect.-2017-08-08.get-metric-data-request/end-time :portkey.aws.connect.-2017-08-08/filters :portkey.aws.connect.-2017-08-08/historical-metrics] :opt-un [:portkey.aws.connect.-2017-08-08/groupings :portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.get-metric-data-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/queues (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/queue-id :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.credentials/access-token (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/security-token))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.credentials/access-token-expiration (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.credentials/refresh-token (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/security-token))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.credentials/refresh-token-expiration (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/credentials (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.credentials/access-token :portkey.aws.connect.-2017-08-08.credentials/access-token-expiration :portkey.aws.connect.-2017-08-08.credentials/refresh-token :portkey.aws.connect.-2017-08-08.credentials/refresh-token-expiration]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/user-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.dimensions/queue (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/queue-reference))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/dimensions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.dimensions/queue :portkey.aws.connect.-2017-08-08/channel]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/security-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/security-profile-summary))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.get-current-metric-data-request/max-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/max-result-100))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/get-current-metric-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id :portkey.aws.connect.-2017-08-08/filters :portkey.aws.connect.-2017-08-08/current-metrics] :opt-un [:portkey.aws.connect.-2017-08-08/groupings :portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.get-current-metric-data-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-path/level-one (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-path/level-two (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-path/level-three (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-path/level-four (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-path/level-five (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.hierarchy-path/level-one :portkey.aws.connect.-2017-08-08.hierarchy-path/level-two :portkey.aws.connect.-2017-08-08.hierarchy-path/level-three :portkey.aws.connect.-2017-08-08.hierarchy-path/level-four :portkey.aws.connect.-2017-08-08.hierarchy-path/level-five]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.list-routing-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-routing-profiles-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id] :opt-un [:portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.list-routing-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-level-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/update-user-security-profiles-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/security-profile-ids :portkey.aws.connect.-2017-08-08/user-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/get-federation-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/credentials]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/contact-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-structure-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/queues :portkey.aws.connect.-2017-08-08/channels]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/update-user-routing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/routing-profile-id :portkey.aws.connect.-2017-08-08/user-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.update-contact-attributes-request/initial-contact-id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/contact-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/update-contact-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08.update-contact-attributes-request/initial-contact-id :portkey.aws.connect.-2017-08-08/instance-id :portkey.aws.connect.-2017-08-08/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.create-user-request/username (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/agent-username))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.create-user-request/phone-config (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-phone-config))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.create-user-request/identity-info (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/user-identity-info))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08.create-user-request/username :portkey.aws.connect.-2017-08-08.create-user-request/phone-config :portkey.aws.connect.-2017-08-08/security-profile-ids :portkey.aws.connect.-2017-08-08/routing-profile-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un [:portkey.aws.connect.-2017-08-08/password :portkey.aws.connect.-2017-08-08.create-user-request/identity-info :portkey.aws.connect.-2017-08-08/hierarchy-group-id :portkey.aws.connect.-2017-08-08/directory-user-id]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-routing-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/routing-profile-summary-list :portkey.aws.connect.-2017-08-08/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/hierarchy-group]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/current-metrics (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/current-metric))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/comparison #{"LT" :lt})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/channel #{"VOICE" :voice})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id :portkey.aws.connect.-2017-08-08/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/stop-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/contact-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.start-outbound-voice-contact-request/destination-phone-number (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/phone-number))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.start-outbound-voice-contact-request/source-phone-number (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/phone-number))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/start-outbound-voice-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08.start-outbound-voice-contact-request/destination-phone-number :portkey.aws.connect.-2017-08-08/contact-flow-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un [:portkey.aws.connect.-2017-08-08/client-token :portkey.aws.connect.-2017-08-08.start-outbound-voice-contact-request/source-phone-number :portkey.aws.connect.-2017-08-08/queue-id :portkey.aws.connect.-2017-08-08/attributes]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.queue-reference/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/queue-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.queue-reference/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/queue-reference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.queue-reference/id :portkey.aws.connect.-2017-08-08.queue-reference/arn]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.historical-metric-data/metric (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/historical-metric))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/historical-metric-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.historical-metric-data/metric :portkey.aws.connect.-2017-08-08/value]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/stop-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-level-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/agent-username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 20)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\_\-\.]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.list-user-hierarchy-groups-response/user-hierarchy-group-summary-list (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-group-summary-list))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-user-hierarchy-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.list-user-hierarchy-groups-response/user-hierarchy-group-summary-list :portkey.aws.connect.-2017-08-08/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/routing-profile-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/historical-metric-data-collections (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/historical-metric-data))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/phone-type #{"SOFT_PHONE" :soft-phone "DESK_PHONE" :desk-phone})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.list-security-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-security-profiles-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id] :opt-un [:portkey.aws.connect.-2017-08-08/next-token :portkey.aws.connect.-2017-08-08.list-security-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/directory-user-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-level/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-level/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.hierarchy-level/name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/hierarchy-level-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/hierarchy-level (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.hierarchy-level/id :portkey.aws.connect.-2017-08-08.hierarchy-level/arn :portkey.aws.connect.-2017-08-08.hierarchy-level/name]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/start-outbound-voice-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/contact-id]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/update-user-hierarchy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/user-id :portkey.aws.connect.-2017-08-08/instance-id] :opt-un [:portkey.aws.connect.-2017-08-08/hierarchy-group-id]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.security-profile-summary/id (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/security-profile-id))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.security-profile-summary/arn (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/arn))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.security-profile-summary/name (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/security-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08.security-profile-summary/id :portkey.aws.connect.-2017-08-08.security-profile-summary/arn :portkey.aws.connect.-2017-08-08.security-profile-summary/name]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/list-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/user-summary-list :portkey.aws.connect.-2017-08-08/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/statistic #{"SUM" "AVG" "MAX" :max :avg :sum})

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/duplicate-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.-2017-08-08/message]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/queue-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08.user-phone-config/desk-phone-number (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/phone-number))
(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/user-phone-config (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/phone-type] :opt-un [:portkey.aws.connect.-2017-08-08/auto-accept :portkey.aws.connect.-2017-08-08/after-contact-work-time-limit :portkey.aws.connect.-2017-08-08.user-phone-config/desk-phone-number]))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/security-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/channels (clojure.spec.alpha/coll-of :portkey.aws.connect.-2017-08-08/channel :max-count 1))

(clojure.spec.alpha/def :portkey.aws.connect.-2017-08-08/get-federation-token-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.-2017-08-08/instance-id] :opt-un []))

(clojure.core/defn update-user-security-profiles ([update-user-security-profiles-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-user-security-profiles-request update-user-security-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/security-profiles", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/update-user-security-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserSecurityProfiles", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-security-profiles :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/update-user-security-profiles-request) :ret clojure.core/true?)

(clojure.core/defn stop-contact ([stop-contact-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-stop-contact-request stop-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/stop-contact-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/contact/stop", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/stop-contact-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopContact", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "ContactNotFoundException" :portkey.aws.connect.-2017-08-08/contact-not-found-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef stop-contact :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/stop-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/stop-contact-response))

(clojure.core/defn update-user-routing-profile ([update-user-routing-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-user-routing-profile-request update-user-routing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/routing-profile", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/update-user-routing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserRoutingProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-routing-profile :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/update-user-routing-profile-request) :ret clojure.core/true?)

(clojure.core/defn update-user-phone-config ([update-user-phone-config-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-user-phone-config-request update-user-phone-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/phone-config", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/update-user-phone-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserPhoneConfig", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-phone-config :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/update-user-phone-config-request) :ret clojure.core/true?)

(clojure.core/defn list-security-profiles ([list-security-profiles-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-security-profiles-request list-security-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/list-security-profiles-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/list-security-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSecurityProfiles", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-security-profiles :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/list-security-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/list-security-profiles-response))

(clojure.core/defn update-contact-attributes ([update-contact-attributes-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-contact-attributes-request update-contact-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/update-contact-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/contact/attributes", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/update-contact-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateContactAttributes", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-contact-attributes :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/update-contact-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/update-contact-attributes-response))

(clojure.core/defn describe-user-hierarchy-structure ([describe-user-hierarchy-structure-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-user-hierarchy-structure-request describe-user-hierarchy-structure-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-structure-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user-hierarchy-structure/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-structure-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeUserHierarchyStructure", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-user-hierarchy-structure :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-structure-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-structure-response))

(clojure.core/defn list-routing-profiles ([list-routing-profiles-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-routing-profiles-request list-routing-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/list-routing-profiles-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/routing-profiles-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/list-routing-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRoutingProfiles", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-routing-profiles :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/list-routing-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/list-routing-profiles-response))

(clojure.core/defn start-outbound-voice-contact ([start-outbound-voice-contact-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-outbound-voice-contact-request start-outbound-voice-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/start-outbound-voice-contact-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/contact/outbound-voice", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/start-outbound-voice-contact-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "StartOutboundVoiceContact", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception, "LimitExceededException" :portkey.aws.connect.-2017-08-08/limit-exceeded-exception, "DestinationNotAllowedException" :portkey.aws.connect.-2017-08-08/destination-not-allowed-exception, "OutboundContactNotPermittedException" :portkey.aws.connect.-2017-08-08/outbound-contact-not-permitted-exception}})))))
(clojure.spec.alpha/fdef start-outbound-voice-contact :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/start-outbound-voice-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/start-outbound-voice-contact-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/delete-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUser", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/create-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/create-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUser", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "LimitExceededException" :portkey.aws.connect.-2017-08-08/limit-exceeded-exception, "DuplicateResourceException" :portkey.aws.connect.-2017-08-08/duplicate-resource-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/create-user-response))

(clojure.core/defn update-user-identity-info ([update-user-identity-info-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-user-identity-info-request update-user-identity-info-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/identity-info", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/update-user-identity-info-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserIdentityInfo", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-identity-info :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/update-user-identity-info-request) :ret clojure.core/true?)

(clojure.core/defn update-user-hierarchy ([update-user-hierarchy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-user-hierarchy-request update-user-hierarchy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/hierarchy", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/update-user-hierarchy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserHierarchy", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-hierarchy :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/update-user-hierarchy-request) :ret clojure.core/true?)

(clojure.core/defn get-current-metric-data ([get-current-metric-data-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-current-metric-data-request get-current-metric-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/get-current-metric-data-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/metrics/current/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/get-current-metric-data-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCurrentMetricData", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-current-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/get-current-metric-data-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/get-current-metric-data-response))

(clojure.core/defn list-users ([list-users-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/list-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/list-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUsers", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/list-users-response))

(clojure.core/defn list-user-hierarchy-groups ([list-user-hierarchy-groups-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-user-hierarchy-groups-request list-user-hierarchy-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/list-user-hierarchy-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user-hierarchy-groups-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/list-user-hierarchy-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUserHierarchyGroups", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-user-hierarchy-groups :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/list-user-hierarchy-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/list-user-hierarchy-groups-response))

(clojure.core/defn get-metric-data ([get-metric-data-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-metric-data-request get-metric-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/get-metric-data-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/metrics/historical/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/get-metric-data-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMetricData", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/get-metric-data-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/get-metric-data-response))

(clojure.core/defn describe-user-hierarchy-group ([describe-user-hierarchy-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-user-hierarchy-group-request describe-user-hierarchy-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user-hierarchy-groups/{InstanceId}/{HierarchyGroupId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeUserHierarchyGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-user-hierarchy-group :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-group-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/describe-user-hierarchy-group-response))

(clojure.core/defn get-federation-token ([get-federation-token-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-federation-token-request get-federation-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/get-federation-token-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user/federate/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/get-federation-token-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFederationToken", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "UserNotFoundException" :portkey.aws.connect.-2017-08-08/user-not-found-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception, "DuplicateResourceException" :portkey.aws.connect.-2017-08-08/duplicate-resource-exception}})))))
(clojure.spec.alpha/fdef get-federation-token :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/get-federation-token-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/get-federation-token-response))

(clojure.core/defn describe-user ([describe-user-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-user-request describe-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.connect.-2017-08-08/endpoints, :http.request.spec/output-spec :portkey.aws.connect.-2017-08-08/describe-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect.-2017-08-08/describe-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeUser", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect.-2017-08-08/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect.-2017-08-08/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect.-2017-08-08/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect.-2017-08-08/throttling-exception, "InternalServiceException" :portkey.aws.connect.-2017-08-08/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-user :args (clojure.spec.alpha/tuple :portkey.aws.connect.-2017-08-08/describe-user-request) :ret (clojure.spec.alpha/and :portkey.aws.connect.-2017-08-08/describe-user-response))
