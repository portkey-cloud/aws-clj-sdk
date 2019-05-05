(ns portkey.aws.connect (:require [portkey.aws]))

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

(clojure.core/defn- req-get-contact-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"}) (clojure.core/into (ser-contact-id (input :initial-contact-id)) #:http.request.field{:name "InitialContactId", :shape "ContactId", :location "uri", :location-name "InitialContactId"})]}))

(clojure.core/defn- req-list-security-profiles-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-1000 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResult1000", :box true, :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-user-hierarchy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId", :location "uri", :location-name "UserId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]} (clojure.core/contains? input :hierarchy-group-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hierarchy-group-id (input :hierarchy-group-id)) #:http.request.field{:name "HierarchyGroupId", :shape "HierarchyGroupId"}))))

(clojure.core/defn- req-get-federation-token-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId", :location "uri", :location-name "InstanceId"})]}))

(clojure.core/declare deser-current-metric-results)

(clojure.core/declare deser-user-summary-list)

(clojure.core/declare deser-routing-profile-summary-list)

(clojure.core/declare deser-unit)

(clojure.core/declare deser-threshold-value)

(clojure.core/declare deser-routing-profile-summary)

(clojure.core/declare deser-current-metric)

(clojure.core/declare deser-current-metric-result)

(clojure.core/declare deser-email)

(clojure.core/declare deser-threshold)

(clojure.core/declare deser-historical-metric-name)

(clojure.core/declare deser-hierarchy-structure)

(clojure.core/declare deser-agent-first-name)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-hierarchy-group)

(clojure.core/declare deser-auto-accept)

(clojure.core/declare deser-security-profile-id)

(clojure.core/declare deser-user-id)

(clojure.core/declare deser-after-contact-work-time-limit)

(clojure.core/declare deser-current-metric-name)

(clojure.core/declare deser-agent-last-name)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-security-profile-ids)

(clojure.core/declare deser-current-metric-data-collections)

(clojure.core/declare deser-routing-profile-name)

(clojure.core/declare deser-user)

(clojure.core/declare desertimestamp)

(clojure.core/declare deser-contact-id)

(clojure.core/declare deser-user-summary)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-historical-metric)

(clojure.core/declare deser-historical-metric-results)

(clojure.core/declare deser-security-profile-name)

(clojure.core/declare deser-hierarchy-group-summary-list)

(clojure.core/declare deser-attributes)

(clojure.core/declare deser-current-metric-data)

(clojure.core/declare deser-hierarchy-group-summary)

(clojure.core/declare deser-user-identity-info)

(clojure.core/declare deser-historical-metric-result)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-credentials)

(clojure.core/declare deser-hierarchy-group-name)

(clojure.core/declare deser-value)

(clojure.core/declare deser-dimensions)

(clojure.core/declare deser-security-profile-summary-list)

(clojure.core/declare deser-hierarchy-path)

(clojure.core/declare deser-message)

(clojure.core/declare deser-hierarchy-level-id)

(clojure.core/declare deser-hierarchy-group-id)

(clojure.core/declare deser-comparison)

(clojure.core/declare deser-channel)

(clojure.core/declare deser-queue-reference)

(clojure.core/declare deser-historical-metric-data)

(clojure.core/declare deser-hierarchy-level-name)

(clojure.core/declare deser-agent-username)

(clojure.core/declare deser-routing-profile-id)

(clojure.core/declare deser-historical-metric-data-collections)

(clojure.core/declare deser-phone-type)

(clojure.core/declare deser-directory-user-id)

(clojure.core/declare deser-hierarchy-level)

(clojure.core/declare deser-security-profile-summary)

(clojure.core/declare deser-statistic)

(clojure.core/declare deser-queue-id)

(clojure.core/declare deser-user-phone-config)

(clojure.core/declare deser-security-token)

(clojure.core/declare deser-phone-number)

(clojure.core/defn- deser-current-metric-results [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-current-metric-result coll))) input))

(clojure.core/defn- deser-user-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-summary coll))) input))

(clojure.core/defn- deser-routing-profile-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-routing-profile-summary coll))) input))

(clojure.core/defn- deser-unit [input] (clojure.core/get {"SECONDS" :seconds, "COUNT" :count, "PERCENT" :percent} input))

(clojure.core/defn- deser-threshold-value [input] input)

(clojure.core/defn- deser-routing-profile-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-routing-profile-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-routing-profile-name (input "Name")))))

(clojure.core/defn- deser-current-metric [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-current-metric-name (input "Name"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-unit (input "Unit")))))

(clojure.core/defn- deser-current-metric-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Dimensions") (clojure.core/assoc :dimensions (deser-dimensions (input "Dimensions"))) (clojure.core/contains? input "Collections") (clojure.core/assoc :collections (deser-current-metric-data-collections (input "Collections")))))

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-threshold [input] (clojure.core/cond-> {} (clojure.core/contains? input "Comparison") (clojure.core/assoc :comparison (deser-comparison (input "Comparison"))) (clojure.core/contains? input "ThresholdValue") (clojure.core/assoc :threshold-value (deser-threshold-value (input "ThresholdValue")))))

(clojure.core/defn- deser-historical-metric-name [input] (clojure.core/get {"QUEUE_ANSWER_TIME" :queue-answer-time, "CONTACTS_HOLD_ABANDONS" :contacts-hold-abandons, "CONTACTS_QUEUED" :contacts-queued, "CONTACTS_ABANDONED" :contacts-abandoned, "CONTACTS_HANDLED" :contacts-handled, "API_CONTACTS_HANDLED" :api-contacts-handled, "CONTACTS_TRANSFERRED_IN" :contacts-transferred-in, "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" :contacts-transferred-out-from-queue, "CONTACTS_MISSED" :contacts-missed, "HOLD_TIME" :hold-time, "CALLBACK_CONTACTS_HANDLED" :callback-contacts-handled, "OCCUPANCY" :occupancy, "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" :contacts-transferred-in-from-queue, "ABANDON_TIME" :abandon-time, "CONTACTS_HANDLED_INCOMING" :contacts-handled-incoming, "QUEUED_TIME" :queued-time, "CONTACTS_TRANSFERRED_OUT" :contacts-transferred-out, "CONTACTS_AGENT_HUNG_UP_FIRST" :contacts-agent-hung-up-first, "HANDLE_TIME" :handle-time, "INTERACTION_AND_HOLD_TIME" :interaction-and-hold-time, "AFTER_CONTACT_WORK_TIME" :after-contact-work-time, "CONTACTS_CONSULTED" :contacts-consulted, "SERVICE_LEVEL" :service-level, "CONTACTS_HANDLED_OUTBOUND" :contacts-handled-outbound, "INTERACTION_TIME" :interaction-time} input))

(clojure.core/defn- deser-hierarchy-structure [input] (clojure.core/cond-> {} (clojure.core/contains? input "LevelOne") (clojure.core/assoc :level-one (deser-hierarchy-level (input "LevelOne"))) (clojure.core/contains? input "LevelTwo") (clojure.core/assoc :level-two (deser-hierarchy-level (input "LevelTwo"))) (clojure.core/contains? input "LevelThree") (clojure.core/assoc :level-three (deser-hierarchy-level (input "LevelThree"))) (clojure.core/contains? input "LevelFour") (clojure.core/assoc :level-four (deser-hierarchy-level (input "LevelFour"))) (clojure.core/contains? input "LevelFive") (clojure.core/assoc :level-five (deser-hierarchy-level (input "LevelFive")))))

(clojure.core/defn- deser-agent-first-name [input] input)

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-hierarchy-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-hierarchy-group-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-hierarchy-group-name (input "Name"))) (clojure.core/contains? input "LevelId") (clojure.core/assoc :level-id (deser-hierarchy-level-id (input "LevelId"))) (clojure.core/contains? input "HierarchyPath") (clojure.core/assoc :hierarchy-path (deser-hierarchy-path (input "HierarchyPath")))))

(clojure.core/defn- deser-auto-accept [input] input)

(clojure.core/defn- deser-security-profile-id [input] input)

(clojure.core/defn- deser-user-id [input] input)

(clojure.core/defn- deser-after-contact-work-time-limit [input] input)

(clojure.core/defn- deser-current-metric-name [input] (clojure.core/get {"AGENTS_ERROR" :agents-error, "AGENTS_AFTER_CONTACT_WORK" :agents-after-contact-work, "AGENTS_NON_PRODUCTIVE" :agents-non-productive, "AGENTS_ONLINE" :agents-online, "AGENTS_ON_CALL" :agents-on-call, "CONTACTS_IN_QUEUE" :contacts-in-queue, "OLDEST_CONTACT_AGE" :oldest-contact-age, "CONTACTS_SCHEDULED" :contacts-scheduled, "AGENTS_AVAILABLE" :agents-available, "AGENTS_STAFFED" :agents-staffed} input))

(clojure.core/defn- deser-agent-last-name [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-security-profile-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-profile-id coll))) input))

(clojure.core/defn- deser-current-metric-data-collections [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-current-metric-data coll))) input))

(clojure.core/defn- deser-routing-profile-name [input] input)

(clojure.core/defn- deser-user [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-agent-username (input "Username"))) (clojure.core/contains? input "PhoneConfig") (clojure.core/assoc :phone-config (deser-user-phone-config (input "PhoneConfig"))) (clojure.core/contains? input "IdentityInfo") (clojure.core/assoc :identity-info (deser-user-identity-info (input "IdentityInfo"))) (clojure.core/contains? input "SecurityProfileIds") (clojure.core/assoc :security-profile-ids (deser-security-profile-ids (input "SecurityProfileIds"))) (clojure.core/contains? input "HierarchyGroupId") (clojure.core/assoc :hierarchy-group-id (deser-hierarchy-group-id (input "HierarchyGroupId"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "RoutingProfileId") (clojure.core/assoc :routing-profile-id (deser-routing-profile-id (input "RoutingProfileId"))) (clojure.core/contains? input "DirectoryUserId") (clojure.core/assoc :directory-user-id (deser-directory-user-id (input "DirectoryUserId"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-user-id (input "Id")))))

(clojure.core/defn- desertimestamp [input] input)

(clojure.core/defn- deser-contact-id [input] input)

(clojure.core/defn- deser-user-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-user-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-agent-username (input "Username")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-historical-metric [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-historical-metric-name (input "Name"))) (clojure.core/contains? input "Threshold") (clojure.core/assoc :threshold (deser-threshold (input "Threshold"))) (clojure.core/contains? input "Statistic") (clojure.core/assoc :statistic (deser-statistic (input "Statistic"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-unit (input "Unit")))))

(clojure.core/defn- deser-historical-metric-results [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-historical-metric-result coll))) input))

(clojure.core/defn- deser-security-profile-name [input] input)

(clojure.core/defn- deser-hierarchy-group-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hierarchy-group-summary coll))) input))

(clojure.core/defn- deser-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-current-metric-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "Metric") (clojure.core/assoc :metric (deser-current-metric (input "Metric"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-value (input "Value")))))

(clojure.core/defn- deser-hierarchy-group-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-hierarchy-group-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-hierarchy-group-name (input "Name")))))

(clojure.core/defn- deser-user-identity-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deser-agent-first-name (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deser-agent-last-name (input "LastName"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email (input "Email")))))

(clojure.core/defn- deser-historical-metric-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Dimensions") (clojure.core/assoc :dimensions (deser-dimensions (input "Dimensions"))) (clojure.core/contains? input "Collections") (clojure.core/assoc :collections (deser-historical-metric-data-collections (input "Collections")))))

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-credentials [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccessToken") (clojure.core/assoc :access-token (deser-security-token (input "AccessToken"))) (clojure.core/contains? input "AccessTokenExpiration") (clojure.core/assoc :access-token-expiration (desertimestamp (input "AccessTokenExpiration"))) (clojure.core/contains? input "RefreshToken") (clojure.core/assoc :refresh-token (deser-security-token (input "RefreshToken"))) (clojure.core/contains? input "RefreshTokenExpiration") (clojure.core/assoc :refresh-token-expiration (desertimestamp (input "RefreshTokenExpiration")))))

(clojure.core/defn- deser-hierarchy-group-name [input] input)

(clojure.core/defn- deser-value [input] input)

(clojure.core/defn- deser-dimensions [input] (clojure.core/cond-> {} (clojure.core/contains? input "Queue") (clojure.core/assoc :queue (deser-queue-reference (input "Queue"))) (clojure.core/contains? input "Channel") (clojure.core/assoc :channel (deser-channel (input "Channel")))))

(clojure.core/defn- deser-security-profile-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-profile-summary coll))) input))

(clojure.core/defn- deser-hierarchy-path [input] (clojure.core/cond-> {} (clojure.core/contains? input "LevelOne") (clojure.core/assoc :level-one (deser-hierarchy-group-summary (input "LevelOne"))) (clojure.core/contains? input "LevelTwo") (clojure.core/assoc :level-two (deser-hierarchy-group-summary (input "LevelTwo"))) (clojure.core/contains? input "LevelThree") (clojure.core/assoc :level-three (deser-hierarchy-group-summary (input "LevelThree"))) (clojure.core/contains? input "LevelFour") (clojure.core/assoc :level-four (deser-hierarchy-group-summary (input "LevelFour"))) (clojure.core/contains? input "LevelFive") (clojure.core/assoc :level-five (deser-hierarchy-group-summary (input "LevelFive")))))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-hierarchy-level-id [input] input)

(clojure.core/defn- deser-hierarchy-group-id [input] input)

(clojure.core/defn- deser-comparison [input] (clojure.core/get {"LT" :lt} input))

(clojure.core/defn- deser-channel [input] (clojure.core/get {"VOICE" :voice} input))

(clojure.core/defn- deser-queue-reference [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-queue-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn")))))

(clojure.core/defn- deser-historical-metric-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "Metric") (clojure.core/assoc :metric (deser-historical-metric (input "Metric"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-value (input "Value")))))

(clojure.core/defn- deser-hierarchy-level-name [input] input)

(clojure.core/defn- deser-agent-username [input] input)

(clojure.core/defn- deser-routing-profile-id [input] input)

(clojure.core/defn- deser-historical-metric-data-collections [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-historical-metric-data coll))) input))

(clojure.core/defn- deser-phone-type [input] (clojure.core/get {"SOFT_PHONE" :soft-phone, "DESK_PHONE" :desk-phone} input))

(clojure.core/defn- deser-directory-user-id [input] input)

(clojure.core/defn- deser-hierarchy-level [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-hierarchy-level-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-hierarchy-level-name (input "Name")))))

(clojure.core/defn- deser-security-profile-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-security-profile-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-security-profile-name (input "Name")))))

(clojure.core/defn- deser-statistic [input] (clojure.core/get {"SUM" :sum, "MAX" :max, "AVG" :avg} input))

(clojure.core/defn- deser-queue-id [input] input)

(clojure.core/defn- deser-user-phone-config [input] (clojure.core/cond-> {:phone-type (deser-phone-type (input "PhoneType"))} (clojure.core/contains? input "AutoAccept") (clojure.core/assoc :auto-accept (deser-auto-accept (input "AutoAccept"))) (clojure.core/contains? input "AfterContactWorkTimeLimit") (clojure.core/assoc :after-contact-work-time-limit (deser-after-contact-work-time-limit (input "AfterContactWorkTimeLimit"))) (clojure.core/contains? input "DeskPhoneNumber") (clojure.core/assoc :desk-phone-number (deser-phone-number (input "DeskPhoneNumber")))))

(clojure.core/defn- deser-security-token [input] input)

(clojure.core/defn- deser-phone-number [input] input)

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper497402 input] (clojure.core/let [rawinput497401 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497403 {"UserId" (rawinput497401 "UserId"), "UserArn" (rawinput497401 "UserArn")}] (clojure.core/cond-> {} (letvar497403 "UserId") (clojure.core/assoc :user-id (deser-user-id (clojure.core/get-in letvar497403 ["UserId"]))) (letvar497403 "UserArn") (clojure.core/assoc :user-arn (deser-arn (clojure.core/get-in letvar497403 ["UserArn"])))))))

(clojure.core/defn- response-get-current-metric-data-response ([input] (response-get-current-metric-data-response nil input)) ([resultWrapper497405 input] (clojure.core/let [rawinput497404 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497406 {"NextToken" (rawinput497404 "NextToken"), "MetricResults" (rawinput497404 "MetricResults"), "DataSnapshotTime" (rawinput497404 "DataSnapshotTime")}] (clojure.core/cond-> {} (letvar497406 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar497406 ["NextToken"]))) (letvar497406 "MetricResults") (clojure.core/assoc :metric-results (deser-current-metric-results (clojure.core/get-in letvar497406 ["MetricResults"]))) (letvar497406 "DataSnapshotTime") (clojure.core/assoc :data-snapshot-time (desertimestamp (clojure.core/get-in letvar497406 ["DataSnapshotTime"])))))))

(clojure.core/defn- response-get-metric-data-response ([input] (response-get-metric-data-response nil input)) ([resultWrapper497408 input] (clojure.core/let [rawinput497407 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497409 {"NextToken" (rawinput497407 "NextToken"), "MetricResults" (rawinput497407 "MetricResults")}] (clojure.core/cond-> {} (letvar497409 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar497409 ["NextToken"]))) (letvar497409 "MetricResults") (clojure.core/assoc :metric-results (deser-historical-metric-results (clojure.core/get-in letvar497409 ["MetricResults"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper497411 input] (clojure.core/let [rawinput497410 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497412 {"Message" (rawinput497410 "Message")}] (clojure.core/cond-> {} (letvar497412 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497412 ["Message"])))))))

(clojure.core/defn- response-update-contact-attributes-response ([input] (response-update-contact-attributes-response nil input)) ([resultWrapper497414 input] (clojure.core/let [rawinput497413 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497415 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-user-hierarchy-structure-response ([input] (response-describe-user-hierarchy-structure-response nil input)) ([resultWrapper497417 input] (clojure.core/let [rawinput497416 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497418 {"HierarchyStructure" (rawinput497416 "HierarchyStructure")}] (clojure.core/cond-> {} (letvar497418 "HierarchyStructure") (clojure.core/assoc :hierarchy-structure (deser-hierarchy-structure (clojure.core/get-in letvar497418 ["HierarchyStructure"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper497420 input] (clojure.core/let [rawinput497419 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497421 {"Message" (rawinput497419 "Message")}] (clojure.core/cond-> {} (letvar497421 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497421 ["Message"])))))))

(clojure.core/defn- response-destination-not-allowed-exception ([input] (response-destination-not-allowed-exception nil input)) ([resultWrapper497423 input] (clojure.core/let [rawinput497422 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497424 {"Message" (rawinput497422 "Message")}] (clojure.core/cond-> {} (letvar497424 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497424 ["Message"])))))))

(clojure.core/defn- response-list-security-profiles-response ([input] (response-list-security-profiles-response nil input)) ([resultWrapper497426 input] (clojure.core/let [rawinput497425 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497427 {"SecurityProfileSummaryList" (rawinput497425 "SecurityProfileSummaryList"), "NextToken" (rawinput497425 "NextToken")}] (clojure.core/cond-> {} (letvar497427 "SecurityProfileSummaryList") (clojure.core/assoc :security-profile-summary-list (deser-security-profile-summary-list (clojure.core/get-in letvar497427 ["SecurityProfileSummaryList"]))) (letvar497427 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar497427 ["NextToken"])))))))

(clojure.core/defn- response-describe-user-response ([input] (response-describe-user-response nil input)) ([resultWrapper497429 input] (clojure.core/let [rawinput497428 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497430 {"User" (rawinput497428 "User")}] (clojure.core/cond-> {} (letvar497430 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar497430 ["User"])))))))

(clojure.core/defn- response-outbound-contact-not-permitted-exception ([input] (response-outbound-contact-not-permitted-exception nil input)) ([resultWrapper497432 input] (clojure.core/let [rawinput497431 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497433 {"Message" (rawinput497431 "Message")}] (clojure.core/cond-> {} (letvar497433 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497433 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper497435 input] (clojure.core/let [rawinput497434 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497436 {"Message" (rawinput497434 "Message")}] (clojure.core/cond-> {} (letvar497436 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497436 ["Message"])))))))

(clojure.core/defn- response-user-not-found-exception ([input] (response-user-not-found-exception nil input)) ([resultWrapper497438 input] (clojure.core/let [rawinput497437 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497439 {"Message" (rawinput497437 "Message")}] (clojure.core/cond-> {} (letvar497439 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497439 ["Message"])))))))

(clojure.core/defn- response-get-federation-token-response ([input] (response-get-federation-token-response nil input)) ([resultWrapper497441 input] (clojure.core/let [rawinput497440 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497442 {"Credentials" (rawinput497440 "Credentials")}] (clojure.core/cond-> {} (letvar497442 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar497442 ["Credentials"])))))))

(clojure.core/defn- response-contact-not-found-exception ([input] (response-contact-not-found-exception nil input)) ([resultWrapper497444 input] (clojure.core/let [rawinput497443 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497445 {"Message" (rawinput497443 "Message")}] (clojure.core/cond-> {} (letvar497445 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497445 ["Message"])))))))

(clojure.core/defn- response-get-contact-attributes-response ([input] (response-get-contact-attributes-response nil input)) ([resultWrapper497447 input] (clojure.core/let [rawinput497446 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497448 {"Attributes" (rawinput497446 "Attributes")}] (clojure.core/cond-> {} (letvar497448 "Attributes") (clojure.core/assoc :attributes (deser-attributes (clojure.core/get-in letvar497448 ["Attributes"])))))))

(clojure.core/defn- response-list-routing-profiles-response ([input] (response-list-routing-profiles-response nil input)) ([resultWrapper497450 input] (clojure.core/let [rawinput497449 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497451 {"RoutingProfileSummaryList" (rawinput497449 "RoutingProfileSummaryList"), "NextToken" (rawinput497449 "NextToken")}] (clojure.core/cond-> {} (letvar497451 "RoutingProfileSummaryList") (clojure.core/assoc :routing-profile-summary-list (deser-routing-profile-summary-list (clojure.core/get-in letvar497451 ["RoutingProfileSummaryList"]))) (letvar497451 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar497451 ["NextToken"])))))))

(clojure.core/defn- response-describe-user-hierarchy-group-response ([input] (response-describe-user-hierarchy-group-response nil input)) ([resultWrapper497453 input] (clojure.core/let [rawinput497452 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497454 {"HierarchyGroup" (rawinput497452 "HierarchyGroup")}] (clojure.core/cond-> {} (letvar497454 "HierarchyGroup") (clojure.core/assoc :hierarchy-group (deser-hierarchy-group (clojure.core/get-in letvar497454 ["HierarchyGroup"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper497456 input] (clojure.core/let [rawinput497455 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497457 {"Message" (rawinput497455 "Message")}] (clojure.core/cond-> {} (letvar497457 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497457 ["Message"])))))))

(clojure.core/defn- response-stop-contact-response ([input] (response-stop-contact-response nil input)) ([resultWrapper497459 input] (clojure.core/let [rawinput497458 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497460 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-user-hierarchy-groups-response ([input] (response-list-user-hierarchy-groups-response nil input)) ([resultWrapper497462 input] (clojure.core/let [rawinput497461 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497463 {"UserHierarchyGroupSummaryList" (rawinput497461 "UserHierarchyGroupSummaryList"), "NextToken" (rawinput497461 "NextToken")}] (clojure.core/cond-> {} (letvar497463 "UserHierarchyGroupSummaryList") (clojure.core/assoc :user-hierarchy-group-summary-list (deser-hierarchy-group-summary-list (clojure.core/get-in letvar497463 ["UserHierarchyGroupSummaryList"]))) (letvar497463 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar497463 ["NextToken"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper497465 input] (clojure.core/let [rawinput497464 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497466 {"Message" (rawinput497464 "Message")}] (clojure.core/cond-> {} (letvar497466 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497466 ["Message"])))))))

(clojure.core/defn- response-start-outbound-voice-contact-response ([input] (response-start-outbound-voice-contact-response nil input)) ([resultWrapper497468 input] (clojure.core/let [rawinput497467 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497469 {"ContactId" (rawinput497467 "ContactId")}] (clojure.core/cond-> {} (letvar497469 "ContactId") (clojure.core/assoc :contact-id (deser-contact-id (clojure.core/get-in letvar497469 ["ContactId"])))))))

(clojure.core/defn- response-internal-service-exception ([input] (response-internal-service-exception nil input)) ([resultWrapper497471 input] (clojure.core/let [rawinput497470 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497472 {"Message" (rawinput497470 "Message")}] (clojure.core/cond-> {} (letvar497472 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497472 ["Message"])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper497474 input] (clojure.core/let [rawinput497473 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497475 {"UserSummaryList" (rawinput497473 "UserSummaryList"), "NextToken" (rawinput497473 "NextToken")}] (clojure.core/cond-> {} (letvar497475 "UserSummaryList") (clojure.core/assoc :user-summary-list (deser-user-summary-list (clojure.core/get-in letvar497475 ["UserSummaryList"]))) (letvar497475 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar497475 ["NextToken"])))))))

(clojure.core/defn- response-duplicate-resource-exception ([input] (response-duplicate-resource-exception nil input)) ([resultWrapper497477 input] (clojure.core/let [rawinput497476 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar497478 {"Message" (rawinput497476 "Message")}] (clojure.core/cond-> {} (letvar497478 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar497478 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.connect/current-metric-results (clojure.spec.alpha/coll-of :portkey.aws.connect/current-metric-result))

(clojure.spec.alpha/def :portkey.aws.connect.create-user-response/user-arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/user-id :portkey.aws.connect.create-user-response/user-arn]))

(clojure.spec.alpha/def :portkey.aws.connect/max-result-1000 (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.connect/user-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect/user-summary))

(clojure.spec.alpha/def :portkey.aws.connect/routing-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect/routing-profile-summary))

(clojure.spec.alpha/def :portkey.aws.connect.get-current-metric-data-response/metric-results (clojure.spec.alpha/and :portkey.aws.connect/current-metric-results))
(clojure.spec.alpha/def :portkey.aws.connect.get-current-metric-data-response/data-snapshot-time (clojure.spec.alpha/and :portkey.aws.connect/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect/get-current-metric-data-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/next-token :portkey.aws.connect.get-current-metric-data-response/metric-results :portkey.aws.connect.get-current-metric-data-response/data-snapshot-time]))

(clojure.spec.alpha/def :portkey.aws.connect/unit #{"PERCENT" "COUNT" "SECONDS" :seconds :count :percent})

(clojure.spec.alpha/def :portkey.aws.connect/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect/threshold-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.connect.routing-profile-summary/id (clojure.spec.alpha/and :portkey.aws.connect/routing-profile-id))
(clojure.spec.alpha/def :portkey.aws.connect.routing-profile-summary/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect.routing-profile-summary/name (clojure.spec.alpha/and :portkey.aws.connect/routing-profile-name))
(clojure.spec.alpha/def :portkey.aws.connect/routing-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.routing-profile-summary/id :portkey.aws.connect.routing-profile-summary/arn :portkey.aws.connect.routing-profile-summary/name]))

(clojure.spec.alpha/def :portkey.aws.connect.current-metric/name (clojure.spec.alpha/and :portkey.aws.connect/current-metric-name))
(clojure.spec.alpha/def :portkey.aws.connect/current-metric (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.current-metric/name :portkey.aws.connect/unit]))

(clojure.spec.alpha/def :portkey.aws.connect.current-metric-result/collections (clojure.spec.alpha/and :portkey.aws.connect/current-metric-data-collections))
(clojure.spec.alpha/def :portkey.aws.connect/current-metric-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/dimensions :portkey.aws.connect.current-metric-result/collections]))

(clojure.spec.alpha/def :portkey.aws.connect/historical-metrics (clojure.spec.alpha/coll-of :portkey.aws.connect/historical-metric))

(clojure.spec.alpha/def :portkey.aws.connect.list-users-request/max-results (clojure.spec.alpha/and :portkey.aws.connect/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id] :opt-un [:portkey.aws.connect/next-token :portkey.aws.connect.list-users-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/threshold (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/comparison :portkey.aws.connect/threshold-value]))

(clojure.spec.alpha/def :portkey.aws.connect.get-metric-data-response/metric-results (clojure.spec.alpha/and :portkey.aws.connect/historical-metric-results))
(clojure.spec.alpha/def :portkey.aws.connect/get-metric-data-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/next-token :portkey.aws.connect.get-metric-data-response/metric-results]))

(clojure.spec.alpha/def :portkey.aws.connect/contact-flow-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.connect/historical-metric-name #{:contacts-consulted :interaction-time "QUEUE_ANSWER_TIME" :service-level "CONTACTS_HOLD_ABANDONS" :contacts-abandoned "CONTACTS_QUEUED" :occupancy "CONTACTS_ABANDONED" :queued-time "CONTACTS_HANDLED" "API_CONTACTS_HANDLED" "CONTACTS_TRANSFERRED_IN" :callback-contacts-handled "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" :contacts-hold-abandons "CONTACTS_MISSED" "HOLD_TIME" :contacts-handled-outbound :contacts-transferred-out-from-queue :contacts-handled :contacts-missed :interaction-and-hold-time "CALLBACK_CONTACTS_HANDLED" "OCCUPANCY" "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" :contacts-transferred-out :api-contacts-handled "ABANDON_TIME" "CONTACTS_HANDLED_INCOMING" "QUEUED_TIME" "CONTACTS_TRANSFERRED_OUT" "CONTACTS_AGENT_HUNG_UP_FIRST" "HANDLE_TIME" "INTERACTION_AND_HOLD_TIME" :contacts-handled-incoming "AFTER_CONTACT_WORK_TIME" :handle-time :after-contact-work-time "CONTACTS_CONSULTED" :queue-answer-time :hold-time "SERVICE_LEVEL" :contacts-queued :contacts-transferred-in-from-queue :abandon-time "CONTACTS_HANDLED_OUTBOUND" :contacts-agent-hung-up-first "INTERACTION_TIME" :contacts-transferred-in})

(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-structure/level-one (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-structure/level-two (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-structure/level-three (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-structure/level-four (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-structure/level-five (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level))
(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-structure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.hierarchy-structure/level-one :portkey.aws.connect.hierarchy-structure/level-two :portkey.aws.connect.hierarchy-structure/level-three :portkey.aws.connect.hierarchy-structure/level-four :portkey.aws.connect.hierarchy-structure/level-five]))

(clojure.spec.alpha/def :portkey.aws.connect/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect/describe-user-hierarchy-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/hierarchy-group-id :portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.connect/agent-first-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32767))))

(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-group/id (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-id))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-group/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-group/name (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-name))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-group/level-id (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level-id))
(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.hierarchy-group/id :portkey.aws.connect.hierarchy-group/arn :portkey.aws.connect.hierarchy-group/name :portkey.aws.connect.hierarchy-group/level-id :portkey.aws.connect/hierarchy-path]))

(clojure.spec.alpha/def :portkey.aws.connect/auto-accept clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.connect/security-profile-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/update-contact-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/describe-user-hierarchy-structure-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/hierarchy-structure]))

(clojure.spec.alpha/def :portkey.aws.connect/user-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/after-contact-work-time-limit (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.connect/current-metric-name #{:agents-staffed "AGENTS_ERROR" "AGENTS_AFTER_CONTACT_WORK" :oldest-contact-age :agents-non-productive :agents-available :agents-error "AGENTS_NON_PRODUCTIVE" :agents-online "AGENTS_ONLINE" "AGENTS_ON_CALL" "CONTACTS_IN_QUEUE" "OLDEST_CONTACT_AGE" "CONTACTS_SCHEDULED" :agents-on-call :contacts-in-queue "AGENTS_AVAILABLE" :agents-after-contact-work "AGENTS_STAFFED" :contacts-scheduled})

(clojure.spec.alpha/def :portkey.aws.connect.update-user-phone-config-request/phone-config (clojure.spec.alpha/and :portkey.aws.connect/user-phone-config))
(clojure.spec.alpha/def :portkey.aws.connect/update-user-phone-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.update-user-phone-config-request/phone-config :portkey.aws.connect/user-id :portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/agent-last-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect/security-profile-ids (clojure.spec.alpha/coll-of :portkey.aws.connect/security-profile-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.connect/current-metric-data-collections (clojure.spec.alpha/coll-of :portkey.aws.connect/current-metric-data))

(clojure.spec.alpha/def :portkey.aws.connect/routing-profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.connect.user/username (clojure.spec.alpha/and :portkey.aws.connect/agent-username))
(clojure.spec.alpha/def :portkey.aws.connect.user/phone-config (clojure.spec.alpha/and :portkey.aws.connect/user-phone-config))
(clojure.spec.alpha/def :portkey.aws.connect.user/identity-info (clojure.spec.alpha/and :portkey.aws.connect/user-identity-info))
(clojure.spec.alpha/def :portkey.aws.connect.user/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect.user/id (clojure.spec.alpha/and :portkey.aws.connect/user-id))
(clojure.spec.alpha/def :portkey.aws.connect/user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.user/username :portkey.aws.connect.user/phone-config :portkey.aws.connect.user/identity-info :portkey.aws.connect/security-profile-ids :portkey.aws.connect/hierarchy-group-id :portkey.aws.connect.user/arn :portkey.aws.connect/routing-profile-id :portkey.aws.connect/directory-user-id :portkey.aws.connect.user/id]))

(clojure.spec.alpha/def :portkey.aws.connect/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.connect.update-user-identity-info-request/identity-info (clojure.spec.alpha/and :portkey.aws.connect/user-identity-info))
(clojure.spec.alpha/def :portkey.aws.connect/update-user-identity-info-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.update-user-identity-info-request/identity-info :portkey.aws.connect/user-id :portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/contact-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.connect.user-summary/id (clojure.spec.alpha/and :portkey.aws.connect/user-id))
(clojure.spec.alpha/def :portkey.aws.connect.user-summary/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect.user-summary/username (clojure.spec.alpha/and :portkey.aws.connect/agent-username))
(clojure.spec.alpha/def :portkey.aws.connect/user-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.user-summary/id :portkey.aws.connect.user-summary/arn :portkey.aws.connect.user-summary/username]))

(clojure.spec.alpha/def :portkey.aws.connect/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.historical-metric/name (clojure.spec.alpha/and :portkey.aws.connect/historical-metric-name))
(clojure.spec.alpha/def :portkey.aws.connect/historical-metric (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.historical-metric/name :portkey.aws.connect/threshold :portkey.aws.connect/statistic :portkey.aws.connect/unit]))

(clojure.spec.alpha/def :portkey.aws.connect/historical-metric-results (clojure.spec.alpha/coll-of :portkey.aws.connect/historical-metric-result))

(clojure.spec.alpha/def :portkey.aws.connect/groupings (clojure.spec.alpha/coll-of :portkey.aws.connect/grouping :max-count 2))

(clojure.spec.alpha/def :portkey.aws.connect/destination-not-allowed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect/security-profile-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/grouping #{:queue "QUEUE" :channel "CHANNEL"})

(clojure.spec.alpha/def :portkey.aws.connect/max-result-100 (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-group-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect/hierarchy-group-summary))

(clojure.spec.alpha/def :portkey.aws.connect.list-user-hierarchy-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.connect/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect/list-user-hierarchy-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id] :opt-un [:portkey.aws.connect/next-token :portkey.aws.connect.list-user-hierarchy-groups-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect/attributes (clojure.spec.alpha/map-of :portkey.aws.connect/attribute-name :portkey.aws.connect/attribute-value))

(clojure.spec.alpha/def :portkey.aws.connect/list-security-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/security-profile-summary-list :portkey.aws.connect/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect.current-metric-data/metric (clojure.spec.alpha/and :portkey.aws.connect/current-metric))
(clojure.spec.alpha/def :portkey.aws.connect/current-metric-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.current-metric-data/metric :portkey.aws.connect/value]))

(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-group-summary/id (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-id))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-group-summary/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-group-summary/name (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-name))
(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-group-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.hierarchy-group-summary/id :portkey.aws.connect.hierarchy-group-summary/arn :portkey.aws.connect.hierarchy-group-summary/name]))

(clojure.spec.alpha/def :portkey.aws.connect.user-identity-info/first-name (clojure.spec.alpha/and :portkey.aws.connect/agent-first-name))
(clojure.spec.alpha/def :portkey.aws.connect.user-identity-info/last-name (clojure.spec.alpha/and :portkey.aws.connect/agent-last-name))
(clojure.spec.alpha/def :portkey.aws.connect/user-identity-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.user-identity-info/first-name :portkey.aws.connect.user-identity-info/last-name :portkey.aws.connect/email]))

(clojure.spec.alpha/def :portkey.aws.connect/describe-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/user]))

(clojure.spec.alpha/def :portkey.aws.connect.historical-metric-result/collections (clojure.spec.alpha/and :portkey.aws.connect/historical-metric-data-collections))
(clojure.spec.alpha/def :portkey.aws.connect/historical-metric-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/dimensions :portkey.aws.connect.historical-metric-result/collections]))

(clojure.spec.alpha/def :portkey.aws.connect/outbound-contact-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect/describe-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/user-id :portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32767))))

(clojure.spec.alpha/def :portkey.aws.connect.get-metric-data-request/start-time (clojure.spec.alpha/and :portkey.aws.connect/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.get-metric-data-request/end-time (clojure.spec.alpha/and :portkey.aws.connect/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.get-metric-data-request/max-results (clojure.spec.alpha/and :portkey.aws.connect/max-result-100))
(clojure.spec.alpha/def :portkey.aws.connect/get-metric-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id :portkey.aws.connect.get-metric-data-request/start-time :portkey.aws.connect.get-metric-data-request/end-time :portkey.aws.connect/filters :portkey.aws.connect/historical-metrics] :opt-un [:portkey.aws.connect/groupings :portkey.aws.connect/next-token :portkey.aws.connect.get-metric-data-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect/queues (clojure.spec.alpha/coll-of :portkey.aws.connect/queue-id :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.connect/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect.credentials/access-token (clojure.spec.alpha/and :portkey.aws.connect/security-token))
(clojure.spec.alpha/def :portkey.aws.connect.credentials/access-token-expiration (clojure.spec.alpha/and :portkey.aws.connect/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect.credentials/refresh-token (clojure.spec.alpha/and :portkey.aws.connect/security-token))
(clojure.spec.alpha/def :portkey.aws.connect.credentials/refresh-token-expiration (clojure.spec.alpha/and :portkey.aws.connect/timestamp))
(clojure.spec.alpha/def :portkey.aws.connect/credentials (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.credentials/access-token :portkey.aws.connect.credentials/access-token-expiration :portkey.aws.connect.credentials/refresh-token :portkey.aws.connect.credentials/refresh-token-expiration]))

(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.connect/user-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect.dimensions/queue (clojure.spec.alpha/and :portkey.aws.connect/queue-reference))
(clojure.spec.alpha/def :portkey.aws.connect/dimensions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.dimensions/queue :portkey.aws.connect/channel]))

(clojure.spec.alpha/def :portkey.aws.connect/security-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.connect/security-profile-summary))

(clojure.spec.alpha/def :portkey.aws.connect.get-current-metric-data-request/max-results (clojure.spec.alpha/and :portkey.aws.connect/max-result-100))
(clojure.spec.alpha/def :portkey.aws.connect/get-current-metric-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id :portkey.aws.connect/filters :portkey.aws.connect/current-metrics] :opt-un [:portkey.aws.connect/groupings :portkey.aws.connect/next-token :portkey.aws.connect.get-current-metric-data-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-path/level-one (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-path/level-two (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-path/level-three (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-path/level-four (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-path/level-five (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-summary))
(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.hierarchy-path/level-one :portkey.aws.connect.hierarchy-path/level-two :portkey.aws.connect.hierarchy-path/level-three :portkey.aws.connect.hierarchy-path/level-four :portkey.aws.connect.hierarchy-path/level-five]))

(clojure.spec.alpha/def :portkey.aws.connect.list-routing-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.connect/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect/list-routing-profiles-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id] :opt-un [:portkey.aws.connect/next-token :portkey.aws.connect.list-routing-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-level-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/update-user-security-profiles-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/security-profile-ids :portkey.aws.connect/user-id :portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/get-federation-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/credentials]))

(clojure.spec.alpha/def :portkey.aws.connect/contact-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect/describe-user-hierarchy-structure-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/get-contact-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/attributes]))

(clojure.spec.alpha/def :portkey.aws.connect/filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/queues :portkey.aws.connect/channels]))

(clojure.spec.alpha/def :portkey.aws.connect/update-user-routing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/routing-profile-id :portkey.aws.connect/user-id :portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.update-contact-attributes-request/initial-contact-id (clojure.spec.alpha/and :portkey.aws.connect/contact-id))
(clojure.spec.alpha/def :portkey.aws.connect/update-contact-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.update-contact-attributes-request/initial-contact-id :portkey.aws.connect/instance-id :portkey.aws.connect/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.create-user-request/username (clojure.spec.alpha/and :portkey.aws.connect/agent-username))
(clojure.spec.alpha/def :portkey.aws.connect.create-user-request/phone-config (clojure.spec.alpha/and :portkey.aws.connect/user-phone-config))
(clojure.spec.alpha/def :portkey.aws.connect.create-user-request/identity-info (clojure.spec.alpha/and :portkey.aws.connect/user-identity-info))
(clojure.spec.alpha/def :portkey.aws.connect/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.create-user-request/username :portkey.aws.connect.create-user-request/phone-config :portkey.aws.connect/security-profile-ids :portkey.aws.connect/routing-profile-id :portkey.aws.connect/instance-id] :opt-un [:portkey.aws.connect/password :portkey.aws.connect.create-user-request/identity-info :portkey.aws.connect/hierarchy-group-id :portkey.aws.connect/directory-user-id]))

(clojure.spec.alpha/def :portkey.aws.connect/list-routing-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/routing-profile-summary-list :portkey.aws.connect/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect/describe-user-hierarchy-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/hierarchy-group]))

(clojure.spec.alpha/def :portkey.aws.connect/current-metrics (clojure.spec.alpha/coll-of :portkey.aws.connect/current-metric))

(clojure.spec.alpha/def :portkey.aws.connect/comparison #{"LT" :lt})

(clojure.spec.alpha/def :portkey.aws.connect/channel #{"VOICE" :voice})

(clojure.spec.alpha/def :portkey.aws.connect/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id :portkey.aws.connect/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/stop-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/contact-id :portkey.aws.connect/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect.start-outbound-voice-contact-request/destination-phone-number (clojure.spec.alpha/and :portkey.aws.connect/phone-number))
(clojure.spec.alpha/def :portkey.aws.connect.start-outbound-voice-contact-request/source-phone-number (clojure.spec.alpha/and :portkey.aws.connect/phone-number))
(clojure.spec.alpha/def :portkey.aws.connect/start-outbound-voice-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect.start-outbound-voice-contact-request/destination-phone-number :portkey.aws.connect/contact-flow-id :portkey.aws.connect/instance-id] :opt-un [:portkey.aws.connect/client-token :portkey.aws.connect.start-outbound-voice-contact-request/source-phone-number :portkey.aws.connect/queue-id :portkey.aws.connect/attributes]))

(clojure.spec.alpha/def :portkey.aws.connect.queue-reference/id (clojure.spec.alpha/and :portkey.aws.connect/queue-id))
(clojure.spec.alpha/def :portkey.aws.connect.queue-reference/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect/queue-reference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.queue-reference/id :portkey.aws.connect.queue-reference/arn]))

(clojure.spec.alpha/def :portkey.aws.connect/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect.historical-metric-data/metric (clojure.spec.alpha/and :portkey.aws.connect/historical-metric))
(clojure.spec.alpha/def :portkey.aws.connect/historical-metric-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.historical-metric-data/metric :portkey.aws.connect/value]))

(clojure.spec.alpha/def :portkey.aws.connect.get-contact-attributes-request/initial-contact-id (clojure.spec.alpha/and :portkey.aws.connect/contact-id))
(clojure.spec.alpha/def :portkey.aws.connect/get-contact-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id :portkey.aws.connect.get-contact-attributes-request/initial-contact-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/stop-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-level-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/agent-username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\_\-\.]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.connect.list-user-hierarchy-groups-response/user-hierarchy-group-summary-list (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-group-summary-list))
(clojure.spec.alpha/def :portkey.aws.connect/list-user-hierarchy-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.list-user-hierarchy-groups-response/user-hierarchy-group-summary-list :portkey.aws.connect/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect/routing-profile-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/historical-metric-data-collections (clojure.spec.alpha/coll-of :portkey.aws.connect/historical-metric-data))

(clojure.spec.alpha/def :portkey.aws.connect/phone-type #{"SOFT_PHONE" :soft-phone "DESK_PHONE" :desk-phone})

(clojure.spec.alpha/def :portkey.aws.connect.list-security-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.connect/max-result-1000))
(clojure.spec.alpha/def :portkey.aws.connect/list-security-profiles-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id] :opt-un [:portkey.aws.connect/next-token :portkey.aws.connect.list-security-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.connect/directory-user-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-level/id (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level-id))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-level/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect.hierarchy-level/name (clojure.spec.alpha/and :portkey.aws.connect/hierarchy-level-name))
(clojure.spec.alpha/def :portkey.aws.connect/hierarchy-level (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.hierarchy-level/id :portkey.aws.connect.hierarchy-level/arn :portkey.aws.connect.hierarchy-level/name]))

(clojure.spec.alpha/def :portkey.aws.connect/start-outbound-voice-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/contact-id]))

(clojure.spec.alpha/def :portkey.aws.connect/update-user-hierarchy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/user-id :portkey.aws.connect/instance-id] :opt-un [:portkey.aws.connect/hierarchy-group-id]))

(clojure.spec.alpha/def :portkey.aws.connect/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect.security-profile-summary/id (clojure.spec.alpha/and :portkey.aws.connect/security-profile-id))
(clojure.spec.alpha/def :portkey.aws.connect.security-profile-summary/arn (clojure.spec.alpha/and :portkey.aws.connect/arn))
(clojure.spec.alpha/def :portkey.aws.connect.security-profile-summary/name (clojure.spec.alpha/and :portkey.aws.connect/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.connect/security-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect.security-profile-summary/id :portkey.aws.connect.security-profile-summary/arn :portkey.aws.connect.security-profile-summary/name]))

(clojure.spec.alpha/def :portkey.aws.connect/list-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/user-summary-list :portkey.aws.connect/next-token]))

(clojure.spec.alpha/def :portkey.aws.connect/statistic #{"SUM" "AVG" "MAX" :max :avg :sum})

(clojure.spec.alpha/def :portkey.aws.connect/duplicate-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.connect/message]))

(clojure.spec.alpha/def :portkey.aws.connect/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.connect/queue-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect.user-phone-config/desk-phone-number (clojure.spec.alpha/and :portkey.aws.connect/phone-number))
(clojure.spec.alpha/def :portkey.aws.connect/user-phone-config (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/phone-type] :opt-un [:portkey.aws.connect/auto-accept :portkey.aws.connect/after-contact-work-time-limit :portkey.aws.connect.user-phone-config/desk-phone-number]))

(clojure.spec.alpha/def :portkey.aws.connect/security-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.connect/channels (clojure.spec.alpha/coll-of :portkey.aws.connect/channel :max-count 1))

(clojure.spec.alpha/def :portkey.aws.connect/get-federation-token-request (clojure.spec.alpha/keys :req-un [:portkey.aws.connect/instance-id] :opt-un []))

(clojure.core/defn update-user-security-profiles "Updates the security profiles assigned to the user." ([update-user-security-profiles-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-security-profiles-request update-user-security-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/security-profiles", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/update-user-security-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserSecurityProfiles", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-security-profiles :args (clojure.spec.alpha/tuple :portkey.aws.connect/update-user-security-profiles-request) :ret clojure.core/true?)

(clojure.core/defn stop-contact "Ends the contact initiated by the StartOutboundVoiceContact operation.\n If you are using an IAM account, it must have permission to the\nconnect:StopContact action." ([stop-contact-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-contact-request stop-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/stop-contact-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/contact/stop", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/stop-contact-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopContact", :http.request.configuration/output-deser-fn response-stop-contact-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "ContactNotFoundException" :portkey.aws.connect/contact-not-found-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef stop-contact :args (clojure.spec.alpha/tuple :portkey.aws.connect/stop-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/stop-contact-response))

(clojure.core/defn update-user-routing-profile "Assigns the specified routing profile to a user." ([update-user-routing-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-routing-profile-request update-user-routing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/routing-profile", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/update-user-routing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserRoutingProfile", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-routing-profile :args (clojure.spec.alpha/tuple :portkey.aws.connect/update-user-routing-profile-request) :ret clojure.core/true?)

(clojure.core/defn update-user-phone-config "Updates the phone configuration settings in the UserPhoneConfig object for the\nspecified user." ([update-user-phone-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-phone-config-request update-user-phone-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/phone-config", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/update-user-phone-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserPhoneConfig", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-phone-config :args (clojure.spec.alpha/tuple :portkey.aws.connect/update-user-phone-config-request) :ret clojure.core/true?)

(clojure.core/defn list-security-profiles "Returns an array of SecurityProfileSummary objects that contain information\nabout the security profiles in your instance, including the ARN, Id, and Name of\nthe security profile." ([list-security-profiles-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-security-profiles-request list-security-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/list-security-profiles-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/list-security-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSecurityProfiles", :http.request.configuration/output-deser-fn response-list-security-profiles-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-security-profiles :args (clojure.spec.alpha/tuple :portkey.aws.connect/list-security-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/list-security-profiles-response))

(clojure.core/defn update-contact-attributes "The UpdateContactAttributes operation lets you programmatically create new, or\nupdate existing, contact attributes associated with a contact. You can use the\noperation to add or update attributes for both ongoing and completed contacts.\nFor example, you can update the customer's name or the reason the customer\ncalled while the call is active, or add notes about steps that the agent took\nduring the call that are displayed to the next agent that takes the call. You\ncan also use the UpdateContactAttributes operation to update attributes for a\ncontact using data from your CRM application and save the data with the contact\nin Amazon Connect. You could also flag calls for additional analysis, such as\nlegal review or identifying abusive callers.\n Contact attributes are available in Amazon Connect for 24 months, and are then\ndeleted.\n Important:\n You cannot use the operation to update attributes for contacts that occurred\nprior to the release of the API, September 12, 2018. You can update attributes\nonly for contacts that started after the release of the API. If you attempt to\nupdate attributes for a contact that occurred prior to the release of the API, a\n400 error is returned. This applies also to queued callbacks that were initiated\nprior to the release of the API but are still active in your instance." ([update-contact-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-contact-attributes-request update-contact-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/update-contact-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/contact/attributes", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/update-contact-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateContactAttributes", :http.request.configuration/output-deser-fn response-update-contact-attributes-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-contact-attributes :args (clojure.spec.alpha/tuple :portkey.aws.connect/update-contact-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/update-contact-attributes-response))

(clojure.core/defn describe-user-hierarchy-structure "Returns a HiearchyGroupStructure object, which contains data about the levels in\nthe agent hierarchy." ([describe-user-hierarchy-structure-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-hierarchy-structure-request describe-user-hierarchy-structure-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/describe-user-hierarchy-structure-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user-hierarchy-structure/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/describe-user-hierarchy-structure-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserHierarchyStructure", :http.request.configuration/output-deser-fn response-describe-user-hierarchy-structure-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-user-hierarchy-structure :args (clojure.spec.alpha/tuple :portkey.aws.connect/describe-user-hierarchy-structure-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/describe-user-hierarchy-structure-response))

(clojure.core/defn list-routing-profiles "Returns an array of RoutingProfileSummary objects that includes information\nabout the routing profiles in your instance." ([list-routing-profiles-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-routing-profiles-request list-routing-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/list-routing-profiles-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/routing-profiles-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/list-routing-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRoutingProfiles", :http.request.configuration/output-deser-fn response-list-routing-profiles-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-routing-profiles :args (clojure.spec.alpha/tuple :portkey.aws.connect/list-routing-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/list-routing-profiles-response))

(clojure.core/defn start-outbound-voice-contact "The StartOutboundVoiceContact operation initiates a contact flow to place an\noutbound call to a customer.\n If you are using an IAM account, it must have permission to the\nconnect:StartOutboundVoiceContact action.\n There is a 60 second dialing timeout for this operation. If the call is not\nconnected after 60 seconds, the call fails." ([start-outbound-voice-contact-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-outbound-voice-contact-request start-outbound-voice-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/start-outbound-voice-contact-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/contact/outbound-voice", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/start-outbound-voice-contact-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartOutboundVoiceContact", :http.request.configuration/output-deser-fn response-start-outbound-voice-contact-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception, "LimitExceededException" :portkey.aws.connect/limit-exceeded-exception, "DestinationNotAllowedException" :portkey.aws.connect/destination-not-allowed-exception, "OutboundContactNotPermittedException" :portkey.aws.connect/outbound-contact-not-permitted-exception}})))))
(clojure.spec.alpha/fdef start-outbound-voice-contact :args (clojure.spec.alpha/tuple :portkey.aws.connect/start-outbound-voice-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/start-outbound-voice-contact-response))

(clojure.core/defn get-contact-attributes "Retrieves the contact attributes associated with a contact." ([get-contact-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-contact-attributes-request get-contact-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/get-contact-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/contact/attributes/{InstanceId}/{InitialContactId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/get-contact-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetContactAttributes", :http.request.configuration/output-deser-fn response-get-contact-attributes-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef get-contact-attributes :args (clojure.spec.alpha/tuple :portkey.aws.connect/get-contact-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/get-contact-attributes-response))

(clojure.core/defn delete-user "Deletes a user account from Amazon Connect." ([delete-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/delete-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.connect/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user "Creates a new user account in your Amazon Connect instance." ([create-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/create-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/create-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "LimitExceededException" :portkey.aws.connect/limit-exceeded-exception, "DuplicateResourceException" :portkey.aws.connect/duplicate-resource-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.connect/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/create-user-response))

(clojure.core/defn update-user-identity-info "Updates the identity information for the specified user in a UserIdentityInfo\nobject, including email, first name, and last name." ([update-user-identity-info-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-identity-info-request update-user-identity-info-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/identity-info", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/update-user-identity-info-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserIdentityInfo", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-identity-info :args (clojure.spec.alpha/tuple :portkey.aws.connect/update-user-identity-info-request) :ret clojure.core/true?)

(clojure.core/defn update-user-hierarchy "Assigns the specified hierarchy group to the user." ([update-user-hierarchy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-hierarchy-request update-user-hierarchy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}/hierarchy", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/update-user-hierarchy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserHierarchy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-user-hierarchy :args (clojure.spec.alpha/tuple :portkey.aws.connect/update-user-hierarchy-request) :ret clojure.core/true?)

(clojure.core/defn get-current-metric-data "The GetCurrentMetricData operation retrieves current metric data from your\nAmazon Connect instance.\n If you are using an IAM account, it must have permission to the\nconnect:GetCurrentMetricData action." ([get-current-metric-data-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-current-metric-data-request get-current-metric-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/get-current-metric-data-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/metrics/current/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/get-current-metric-data-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCurrentMetricData", :http.request.configuration/output-deser-fn response-get-current-metric-data-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-current-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.connect/get-current-metric-data-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/get-current-metric-data-response))

(clojure.core/defn list-users "Returns a UserSummaryList, which is an array of UserSummary objects." ([list-users-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/list-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/list-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.connect/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/list-users-response))

(clojure.core/defn list-user-hierarchy-groups "Returns a UserHierarchyGroupSummaryList, which is an array of\nHierarchyGroupSummary objects that contain information about the hierarchy\ngroups in your instance." ([list-user-hierarchy-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-user-hierarchy-groups-request list-user-hierarchy-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/list-user-hierarchy-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user-hierarchy-groups-summary/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/list-user-hierarchy-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUserHierarchyGroups", :http.request.configuration/output-deser-fn response-list-user-hierarchy-groups-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-user-hierarchy-groups :args (clojure.spec.alpha/tuple :portkey.aws.connect/list-user-hierarchy-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/list-user-hierarchy-groups-response))

(clojure.core/defn get-metric-data "The GetMetricData operation retrieves historical metrics data from your Amazon\nConnect instance.\n If you are using an IAM account, it must have permission to the\nconnect:GetMetricData action." ([get-metric-data-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-metric-data-request get-metric-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/get-metric-data-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/metrics/historical/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/get-metric-data-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMetricData", :http.request.configuration/output-deser-fn response-get-metric-data-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.connect/get-metric-data-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/get-metric-data-response))

(clojure.core/defn describe-user-hierarchy-group "Returns a HierarchyGroup object that includes information about a hierarchy\ngroup in your instance." ([describe-user-hierarchy-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-hierarchy-group-request describe-user-hierarchy-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/describe-user-hierarchy-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user-hierarchy-groups/{InstanceId}/{HierarchyGroupId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/describe-user-hierarchy-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserHierarchyGroup", :http.request.configuration/output-deser-fn response-describe-user-hierarchy-group-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-user-hierarchy-group :args (clojure.spec.alpha/tuple :portkey.aws.connect/describe-user-hierarchy-group-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/describe-user-hierarchy-group-response))

(clojure.core/defn get-federation-token "Retrieves a token for federation." ([get-federation-token-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-federation-token-request get-federation-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/get-federation-token-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/user/federate/{InstanceId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/get-federation-token-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFederationToken", :http.request.configuration/output-deser-fn response-get-federation-token-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "UserNotFoundException" :portkey.aws.connect/user-not-found-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception, "DuplicateResourceException" :portkey.aws.connect/duplicate-resource-exception}})))))
(clojure.spec.alpha/fdef get-federation-token :args (clojure.spec.alpha/tuple :portkey.aws.connect/get-federation-token-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/get-federation-token-response))

(clojure.core/defn describe-user "Returns a User object that contains information about the user account specified\nby the UserId." ([describe-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-request describe-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.connect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.connect/describe-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/users/{InstanceId}/{UserId}", :http.request.configuration/version "2017-08-08", :http.request.configuration/service-id "Connect", :http.request.spec/input-spec :portkey.aws.connect/describe-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUser", :http.request.configuration/output-deser-fn response-describe-user-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.connect/invalid-request-exception, "InvalidParameterException" :portkey.aws.connect/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.connect/resource-not-found-exception, "ThrottlingException" :portkey.aws.connect/throttling-exception, "InternalServiceException" :portkey.aws.connect/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-user :args (clojure.spec.alpha/tuple :portkey.aws.connect/describe-user-request) :ret (clojure.spec.alpha/and :portkey.aws.connect/describe-user-response))
