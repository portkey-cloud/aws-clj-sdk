(ns portkey.aws.pinpoint-email (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "email", :region "eu-west-1"},
    :ssl-common-name "email.eu-west-1.amazonaws.com",
    :endpoint "https://email.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "email", :region "us-west-2"},
    :ssl-common-name "email.us-west-2.amazonaws.com",
    :endpoint "https://email.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "email", :region "us-east-1"},
    :ssl-common-name "email.us-east-1.amazonaws.com",
    :endpoint "https://email.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-dimension-name)

(clojure.core/declare ser-sns-destination)

(clojure.core/declare ser-tracking-options)

(clojure.core/declare ser-dimension-value-source)

(clojure.core/declare ser-delivery-options)

(clojure.core/declare ser-message-data)

(clojure.core/declare ser-cloud-watch-dimension-configuration)

(clojure.core/declare ser-pool-name)

(clojure.core/declare ser-email-content)

(clojure.core/declare ser-cloud-watch-destination)

(clojure.core/declare ser-email-address-list)

(clojure.core/declare ser-body)

(clojure.core/declare ser-amazon-resource-name)

(clojure.core/declare ser-default-dimension-value)

(clojure.core/declare ser-blacklist-item-names)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-event-destination-definition)

(clojure.core/declare ser-raw-message-data)

(clojure.core/declare ser-configuration-set-name)

(clojure.core/declare ser-custom-redirect-domain)

(clojure.core/declare ser-enabled)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-message-tag)

(clojure.core/declare ser-sending-pool-name)

(clojure.core/declare ser-last-fresh-start)

(clojure.core/declare ser-message-tag-name)

(clojure.core/declare ser-event-destination-name)

(clojure.core/declare ser-message)

(clojure.core/declare ser-message-tag-value)

(clojure.core/declare ser-behavior-on-mx-failure)

(clojure.core/declare ser-content)

(clojure.core/declare ser-reputation-options)

(clojure.core/declare ser-pinpoint-destination)

(clojure.core/declare ser-blacklist-item-name)

(clojure.core/declare ser-identity)

(clojure.core/declare ser-max-items)

(clojure.core/declare ser-kinesis-firehose-destination)

(clojure.core/declare ser-ip)

(clojure.core/declare ser-message-tag-list)

(clojure.core/declare ser-cloud-watch-dimension-configurations)

(clojure.core/declare ser-event-types)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-charset)

(clojure.core/declare ser-report-name)

(clojure.core/declare ser-percentage-100-wrapper)

(clojure.core/declare ser-raw-message)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-report-id)

(clojure.core/declare ser-sending-options)

(clojure.core/declare ser-mail-from-domain-name)

(clojure.core/defn- ser-dimension-name [input] #:http.request.field{:value input, :shape "DimensionName"})

(clojure.core/defn- ser-sns-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:topic-arn input)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})], :shape "SnsDestination", :type "structure"}))

(clojure.core/defn- ser-tracking-options [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-custom-redirect-domain (:custom-redirect-domain input)) #:http.request.field{:name "CustomRedirectDomain", :shape "CustomRedirectDomain"})], :shape "TrackingOptions", :type "structure"}))

(clojure.core/defn- ser-dimension-value-source [input] #:http.request.field{:value (clojure.core/get {"MESSAGE_TAG" "MESSAGE_TAG", :message-tag "MESSAGE_TAG", "EMAIL_HEADER" "EMAIL_HEADER", :email-header "EMAIL_HEADER", "LINK_TAG" "LINK_TAG", :link-tag "LINK_TAG"} input), :shape "DimensionValueSource"})

(clojure.core/defn- ser-delivery-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeliveryOptions", :type "structure"} (clojure.core/contains? input :sending-pool-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pool-name (input :sending-pool-name)) #:http.request.field{:name "SendingPoolName", :shape "PoolName"}))))

(clojure.core/defn- ser-message-data [input] #:http.request.field{:value input, :shape "MessageData"})

(clojure.core/defn- ser-cloud-watch-dimension-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dimension-name (:dimension-name input)) #:http.request.field{:name "DimensionName", :shape "DimensionName"}) (clojure.core/into (ser-dimension-value-source (:dimension-value-source input)) #:http.request.field{:name "DimensionValueSource", :shape "DimensionValueSource"}) (clojure.core/into (ser-default-dimension-value (:default-dimension-value input)) #:http.request.field{:name "DefaultDimensionValue", :shape "DefaultDimensionValue"})], :shape "CloudWatchDimensionConfiguration", :type "structure"}))

(clojure.core/defn- ser-pool-name [input] #:http.request.field{:value input, :shape "PoolName"})

(clojure.core/defn- ser-email-content [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EmailContent", :type "structure"} (clojure.core/contains? input :simple) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :simple)) #:http.request.field{:name "Simple", :shape "Message"})) (clojure.core/contains? input :raw) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-message (input :raw)) #:http.request.field{:name "Raw", :shape "RawMessage"}))))

(clojure.core/defn- ser-cloud-watch-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cloud-watch-dimension-configurations (:dimension-configurations input)) #:http.request.field{:name "DimensionConfigurations", :shape "CloudWatchDimensionConfigurations"})], :shape "CloudWatchDestination", :type "structure"}))

(clojure.core/defn- ser-email-address-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-email-address coll) #:http.request.field{:shape "EmailAddress"}))) input), :shape "EmailAddressList", :type "list"})

(clojure.core/defn- ser-body [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Body", :type "structure"} (clojure.core/contains? input :text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content (input :text)) #:http.request.field{:name "Text", :shape "Content"})) (clojure.core/contains? input :html) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content (input :html)) #:http.request.field{:name "Html", :shape "Content"}))))

(clojure.core/defn- ser-amazon-resource-name [input] #:http.request.field{:value input, :shape "AmazonResourceName"})

(clojure.core/defn- ser-default-dimension-value [input] #:http.request.field{:value input, :shape "DefaultDimensionValue"})

(clojure.core/defn- ser-blacklist-item-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-blacklist-item-name coll) #:http.request.field{:shape "BlacklistItemName"}))) input), :shape "BlacklistItemNames", :type "list"})

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Destination", :type "structure"} (clojure.core/contains? input :to-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address-list (input :to-addresses)) #:http.request.field{:name "ToAddresses", :shape "EmailAddressList"})) (clojure.core/contains? input :cc-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address-list (input :cc-addresses)) #:http.request.field{:name "CcAddresses", :shape "EmailAddressList"})) (clojure.core/contains? input :bcc-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address-list (input :bcc-addresses)) #:http.request.field{:name "BccAddresses", :shape "EmailAddressList"}))))

(clojure.core/defn- ser-event-destination-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EventDestinationDefinition", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :matching-event-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-types (input :matching-event-types)) #:http.request.field{:name "MatchingEventTypes", :shape "EventTypes"})) (clojure.core/contains? input :kinesis-firehose-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-destination (input :kinesis-firehose-destination)) #:http.request.field{:name "KinesisFirehoseDestination", :shape "KinesisFirehoseDestination"})) (clojure.core/contains? input :cloud-watch-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-destination (input :cloud-watch-destination)) #:http.request.field{:name "CloudWatchDestination", :shape "CloudWatchDestination"})) (clojure.core/contains? input :sns-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-destination (input :sns-destination)) #:http.request.field{:name "SnsDestination", :shape "SnsDestination"})) (clojure.core/contains? input :pinpoint-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pinpoint-destination (input :pinpoint-destination)) #:http.request.field{:name "PinpointDestination", :shape "PinpointDestination"}))))

(clojure.core/defn- ser-raw-message-data [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "RawMessageData"})

(clojure.core/defn- ser-configuration-set-name [input] #:http.request.field{:value input, :shape "ConfigurationSetName"})

(clojure.core/defn- ser-custom-redirect-domain [input] #:http.request.field{:value input, :shape "CustomRedirectDomain"})

(clojure.core/defn- ser-enabled [input] #:http.request.field{:value input, :shape "Enabled"})

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {:open "OPEN", "OPEN" "OPEN", "SEND" "SEND", :complaint "COMPLAINT", :delivery "DELIVERY", "COMPLAINT" "COMPLAINT", "CLICK" "CLICK", "RENDERING_FAILURE" "RENDERING_FAILURE", :bounce "BOUNCE", :click "CLICK", "REJECT" "REJECT", :send "SEND", "BOUNCE" "BOUNCE", :reject "REJECT", :rendering-failure "RENDERING_FAILURE", "DELIVERY" "DELIVERY"} input), :shape "EventType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-message-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-tag-name (:name input)) #:http.request.field{:name "Name", :shape "MessageTagName"}) (clojure.core/into (ser-message-tag-value (:value input)) #:http.request.field{:name "Value", :shape "MessageTagValue"})], :shape "MessageTag", :type "structure"}))

(clojure.core/defn- ser-sending-pool-name [input] #:http.request.field{:value input, :shape "SendingPoolName"})

(clojure.core/defn- ser-last-fresh-start [input] #:http.request.field{:value input, :shape "LastFreshStart"})

(clojure.core/defn- ser-message-tag-name [input] #:http.request.field{:value input, :shape "MessageTagName"})

(clojure.core/defn- ser-event-destination-name [input] #:http.request.field{:value input, :shape "EventDestinationName"})

(clojure.core/defn- ser-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-content (:subject input)) #:http.request.field{:name "Subject", :shape "Content"}) (clojure.core/into (ser-body (:body input)) #:http.request.field{:name "Body", :shape "Body"})], :shape "Message", :type "structure"}))

(clojure.core/defn- ser-message-tag-value [input] #:http.request.field{:value input, :shape "MessageTagValue"})

(clojure.core/defn- ser-behavior-on-mx-failure [input] #:http.request.field{:value (clojure.core/get {"USE_DEFAULT_VALUE" "USE_DEFAULT_VALUE", :use-default-value "USE_DEFAULT_VALUE", "REJECT_MESSAGE" "REJECT_MESSAGE", :reject-message "REJECT_MESSAGE"} input), :shape "BehaviorOnMxFailure"})

(clojure.core/defn- ser-content [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-data (:data input)) #:http.request.field{:name "Data", :shape "MessageData"})], :shape "Content", :type "structure"} (clojure.core/contains? input :charset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-charset (input :charset)) #:http.request.field{:name "Charset", :shape "Charset"}))))

(clojure.core/defn- ser-reputation-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ReputationOptions", :type "structure"} (clojure.core/contains? input :reputation-metrics-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :reputation-metrics-enabled)) #:http.request.field{:name "ReputationMetricsEnabled", :shape "Enabled"})) (clojure.core/contains? input :last-fresh-start) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-fresh-start (input :last-fresh-start)) #:http.request.field{:name "LastFreshStart", :shape "LastFreshStart"}))))

(clojure.core/defn- ser-pinpoint-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PinpointDestination", :type "structure"} (clojure.core/contains? input :application-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :application-arn)) #:http.request.field{:name "ApplicationArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-blacklist-item-name [input] #:http.request.field{:value input, :shape "BlacklistItemName"})

(clojure.core/defn- ser-identity [input] #:http.request.field{:value input, :shape "Identity"})

(clojure.core/defn- ser-max-items [input] #:http.request.field{:value input, :shape "MaxItems"})

(clojure.core/defn- ser-kinesis-firehose-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:iam-role-arn input)) #:http.request.field{:name "IamRoleArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-amazon-resource-name (:delivery-stream-arn input)) #:http.request.field{:name "DeliveryStreamArn", :shape "AmazonResourceName"})], :shape "KinesisFirehoseDestination", :type "structure"}))

(clojure.core/defn- ser-ip [input] #:http.request.field{:value input, :shape "Ip"})

(clojure.core/defn- ser-message-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message-tag coll) #:http.request.field{:shape "MessageTag"}))) input), :shape "MessageTagList", :type "list"})

(clojure.core/defn- ser-cloud-watch-dimension-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-dimension-configuration coll) #:http.request.field{:shape "CloudWatchDimensionConfiguration"}))) input), :shape "CloudWatchDimensionConfigurations", :type "list"})

(clojure.core/defn- ser-event-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-type coll) #:http.request.field{:shape "EventType"}))) input), :shape "EventTypes", :type "list"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-charset [input] #:http.request.field{:value input, :shape "Charset"})

(clojure.core/defn- ser-report-name [input] #:http.request.field{:value input, :shape "ReportName"})

(clojure.core/defn- ser-percentage-100-wrapper [input] #:http.request.field{:value input, :shape "Percentage100Wrapper"})

(clojure.core/defn- ser-raw-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-raw-message-data (:data input)) #:http.request.field{:name "Data", :shape "RawMessageData"})], :shape "RawMessage", :type "structure"}))

(clojure.core/defn- ser-email-address [input] #:http.request.field{:value input, :shape "EmailAddress"})

(clojure.core/defn- ser-report-id [input] #:http.request.field{:value input, :shape "ReportId"})

(clojure.core/defn- ser-sending-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SendingOptions", :type "structure"} (clojure.core/contains? input :sending-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :sending-enabled)) #:http.request.field{:name "SendingEnabled", :shape "Enabled"}))))

(clojure.core/defn- ser-mail-from-domain-name [input] #:http.request.field{:value input, :shape "MailFromDomainName"})

(clojure.core/defn- req-create-dedicated-ip-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pool-name (input :pool-name)) #:http.request.field{:name "PoolName", :shape "PoolName"})]}))

(clojure.core/defn- req-get-deliverability-dashboard-options-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-put-email-identity-dkim-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity (input :email-identity)) #:http.request.field{:name "EmailIdentity", :shape "Identity", :location "uri", :location-name "EmailIdentity"})]} (clojure.core/contains? input :signing-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :signing-enabled)) #:http.request.field{:name "SigningEnabled", :shape "Enabled"}))))

(clojure.core/defn- req-delete-dedicated-ip-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pool-name (input :pool-name)) #:http.request.field{:name "PoolName", :shape "PoolName", :location "uri", :location-name "PoolName"})]}))

(clojure.core/defn- req-create-email-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :email-identity)) #:http.request.field{:name "EmailIdentity", :shape "Identity"})]}))

(clojure.core/defn- req-get-email-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity (input :email-identity)) #:http.request.field{:name "EmailIdentity", :shape "Identity", :location "uri", :location-name "EmailIdentity"})]}))

(clojure.core/defn- req-get-dedicated-ips-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :pool-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pool-name (input :pool-name)) #:http.request.field{:name "PoolName", :shape "PoolName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :page-size)) #:http.request.field{:name "PageSize", :shape "MaxItems"}))))

(clojure.core/defn- req-delete-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"}) (clojure.core/into (ser-event-destination-name (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "EventDestinationName", :location "uri", :location-name "EventDestinationName"})]}))

(clojure.core/defn- req-list-email-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :page-size)) #:http.request.field{:name "PageSize", :shape "MaxItems"}))))

(clojure.core/defn- req-delete-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})]}))

(clojure.core/defn- req-list-configuration-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :page-size)) #:http.request.field{:name "PageSize", :shape "MaxItems"}))))

(clojure.core/defn- req-list-deliverability-test-reports-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :page-size)) #:http.request.field{:name "PageSize", :shape "MaxItems"}))))

(clojure.core/defn- req-get-dedicated-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-ip (input :ip)) #:http.request.field{:name "Ip", :shape "Ip", :location "uri", :location-name "IP"})]}))

(clojure.core/defn- req-get-blacklist-reports-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-blacklist-item-names (input :blacklist-item-names)) #:http.request.field{:name "BlacklistItemNames", :shape "BlacklistItemNames"})]}))

(clojure.core/defn- req-get-domain-statistics-report-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity (input :domain)) #:http.request.field{:name "Domain", :shape "Identity", :location "uri", :location-name "Domain"})], :body [(clojure.core/into (ser-timestamp (input :start-date)) #:http.request.field{:name "StartDate", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :end-date)) #:http.request.field{:name "EndDate", :shape "Timestamp"})]}))

(clojure.core/defn- req-put-account-dedicated-ip-warmup-attributes-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-warmup-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :auto-warmup-enabled)) #:http.request.field{:name "AutoWarmupEnabled", :shape "Enabled"}))))

(clojure.core/defn- req-put-email-identity-feedback-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity (input :email-identity)) #:http.request.field{:name "EmailIdentity", :shape "Identity", :location "uri", :location-name "EmailIdentity"})]} (clojure.core/contains? input :email-forwarding-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :email-forwarding-enabled)) #:http.request.field{:name "EmailForwardingEnabled", :shape "Enabled"}))))

(clojure.core/defn- req-put-configuration-set-delivery-options-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})]} (clojure.core/contains? input :sending-pool-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sending-pool-name (input :sending-pool-name)) #:http.request.field{:name "SendingPoolName", :shape "SendingPoolName"}))))

(clojure.core/defn- req-create-configuration-set-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})) (clojure.core/contains? input :tracking-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tracking-options (input :tracking-options)) #:http.request.field{:name "TrackingOptions", :shape "TrackingOptions"})) (clojure.core/contains? input :delivery-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-options (input :delivery-options)) #:http.request.field{:name "DeliveryOptions", :shape "DeliveryOptions"})) (clojure.core/contains? input :reputation-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reputation-options (input :reputation-options)) #:http.request.field{:name "ReputationOptions", :shape "ReputationOptions"})) (clojure.core/contains? input :sending-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sending-options (input :sending-options)) #:http.request.field{:name "SendingOptions", :shape "SendingOptions"}))))

(clojure.core/defn- req-get-configuration-set-event-destinations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})]}))

(clojure.core/defn- req-put-deliverability-dashboard-option-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-enabled (input :dashboard-enabled)) #:http.request.field{:name "DashboardEnabled", :shape "Enabled"})]}))

(clojure.core/defn- req-list-dedicated-ip-pools-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :page-size)) #:http.request.field{:name "PageSize", :shape "MaxItems"}))))

(clojure.core/defn- req-update-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"}) (clojure.core/into (ser-event-destination-name (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "EventDestinationName", :location "uri", :location-name "EventDestinationName"})], :body [(clojure.core/into (ser-event-destination-definition (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestinationDefinition"})]}))

(clojure.core/defn- req-create-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})], :body [(clojure.core/into (ser-event-destination-name (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "EventDestinationName"}) (clojure.core/into (ser-event-destination-definition (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestinationDefinition"})]}))

(clojure.core/defn- req-put-configuration-set-reputation-options-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})]} (clojure.core/contains? input :reputation-metrics-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :reputation-metrics-enabled)) #:http.request.field{:name "ReputationMetricsEnabled", :shape "Enabled"}))))

(clojure.core/defn- req-put-configuration-set-tracking-options-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})]} (clojure.core/contains? input :custom-redirect-domain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-redirect-domain (input :custom-redirect-domain)) #:http.request.field{:name "CustomRedirectDomain", :shape "CustomRedirectDomain"}))))

(clojure.core/defn- req-put-dedicated-ip-in-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-ip (input :ip)) #:http.request.field{:name "Ip", :shape "Ip", :location "uri", :location-name "IP"})], :body [(clojure.core/into (ser-pool-name (input :destination-pool-name)) #:http.request.field{:name "DestinationPoolName", :shape "PoolName"})]}))

(clojure.core/defn- req-put-configuration-set-sending-options-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})]} (clojure.core/contains? input :sending-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :sending-enabled)) #:http.request.field{:name "SendingEnabled", :shape "Enabled"}))))

(clojure.core/defn- req-create-deliverability-test-report-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-email-address (input :from-email-address)) #:http.request.field{:name "FromEmailAddress", :shape "EmailAddress"}) (clojure.core/into (ser-email-content (input :content)) #:http.request.field{:name "Content", :shape "EmailContent"})]} (clojure.core/contains? input :report-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-report-name (input :report-name)) #:http.request.field{:name "ReportName", :shape "ReportName"}))))

(clojure.core/defn- req-get-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-email-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity (input :email-identity)) #:http.request.field{:name "EmailIdentity", :shape "Identity", :location "uri", :location-name "EmailIdentity"})]}))

(clojure.core/defn- req-get-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName", :location "uri", :location-name "ConfigurationSetName"})]}))

(clojure.core/defn- req-send-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "Destination", :shape "Destination"}) (clojure.core/into (ser-email-content (input :content)) #:http.request.field{:name "Content", :shape "EmailContent"})]} (clojure.core/contains? input :from-email-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :from-email-address)) #:http.request.field{:name "FromEmailAddress", :shape "EmailAddress"})) (clojure.core/contains? input :reply-to-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address-list (input :reply-to-addresses)) #:http.request.field{:name "ReplyToAddresses", :shape "EmailAddressList"})) (clojure.core/contains? input :feedback-forwarding-email-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :feedback-forwarding-email-address)) #:http.request.field{:name "FeedbackForwardingEmailAddress", :shape "EmailAddress"})) (clojure.core/contains? input :email-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :email-tags)) #:http.request.field{:name "EmailTags", :shape "MessageTagList"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}))))

(clojure.core/defn- req-put-email-identity-mail-from-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity (input :email-identity)) #:http.request.field{:name "EmailIdentity", :shape "Identity", :location "uri", :location-name "EmailIdentity"})]} (clojure.core/contains? input :mail-from-domain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mail-from-domain-name (input :mail-from-domain)) #:http.request.field{:name "MailFromDomain", :shape "MailFromDomainName"})) (clojure.core/contains? input :behavior-on-mx-failure) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-behavior-on-mx-failure (input :behavior-on-mx-failure)) #:http.request.field{:name "BehaviorOnMxFailure", :shape "BehaviorOnMxFailure"}))))

(clojure.core/defn- req-put-dedicated-ip-warmup-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-ip (input :ip)) #:http.request.field{:name "Ip", :shape "Ip", :location "uri", :location-name "IP"})], :body [(clojure.core/into (ser-percentage-100-wrapper (input :warmup-percentage)) #:http.request.field{:name "WarmupPercentage", :shape "Percentage100Wrapper"})]}))

(clojure.core/defn- req-get-deliverability-test-report-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-report-id (input :report-id)) #:http.request.field{:name "ReportId", :shape "ReportId", :location "uri", :location-name "ReportId"})]}))

(clojure.core/defn- req-put-account-sending-attributes-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :sending-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :sending-enabled)) #:http.request.field{:name "SendingEnabled", :shape "Enabled"}))))

(clojure.core/declare deser-dimension-name)

(clojure.core/declare deser-event-destination)

(clojure.core/declare deser-sns-destination)

(clojure.core/declare deser-sent-last-24-hours)

(clojure.core/declare deser-tracking-options)

(clojure.core/declare deser-dimension-value-source)

(clojure.core/declare deser-delivery-options)

(clojure.core/declare deser-daily-volumes)

(clojure.core/declare deser-identity-info-list)

(clojure.core/declare deser-cloud-watch-dimension-configuration)

(clojure.core/declare deser-pool-name)

(clojure.core/declare deser-max-send-rate)

(clojure.core/declare deser-volume)

(clojure.core/declare deser-cloud-watch-destination)

(clojure.core/declare deser-blacklist-report)

(clojure.core/declare deser-amazon-resource-name)

(clojure.core/declare deser-isp-placement)

(clojure.core/declare deser-deliverability-test-reports)

(clojure.core/declare deser-default-dimension-value)

(clojure.core/declare deser-identity-info)

(clojure.core/declare deser-dns-token)

(clojure.core/declare deser-blacklist-entry)

(clojure.core/declare deser-configuration-set-name)

(clojure.core/declare deser-daily-volume)

(clojure.core/declare deser-rbl-name)

(clojure.core/declare deser-dkim-status)

(clojure.core/declare deser-custom-redirect-domain)

(clojure.core/declare deser-volume-statistics)

(clojure.core/declare deser-enabled)

(clojure.core/declare deser-dkim-attributes)

(clojure.core/declare deser-overall-volume)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-isp-placements)

(clojure.core/declare deser-send-quota)

(clojure.core/declare deser-blacklisting-description)

(clojure.core/declare deser-dns-token-list)

(clojure.core/declare deser-dedicated-ip-list)

(clojure.core/declare deser-outbound-message-id)

(clojure.core/declare deser-domain-isp-placement)

(clojure.core/declare deser-last-fresh-start)

(clojure.core/declare deser-deliverability-test-report)

(clojure.core/declare deser-event-destination-name)

(clojure.core/declare deser-mail-from-domain-status)

(clojure.core/declare deser-deliverability-test-status)

(clojure.core/declare deser-behavior-on-mx-failure)

(clojure.core/declare deser-percentage)

(clojure.core/declare deser-identity-type)

(clojure.core/declare deser-reputation-options)

(clojure.core/declare deser-pinpoint-destination)

(clojure.core/declare deser-blacklist-item-name)

(clojure.core/declare deser-identity)

(clojure.core/declare deser-mail-from-attributes)

(clojure.core/declare deser-kinesis-firehose-destination)

(clojure.core/declare deser-ip)

(clojure.core/declare deser-deliverability-test-subject)

(clojure.core/declare deser-list-of-dedicated-ip-pools)

(clojure.core/declare deser-cloud-watch-dimension-configurations)

(clojure.core/declare deser-general-enforcement-status)

(clojure.core/declare deser-event-types)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-configuration-set-name-list)

(clojure.core/declare deser-blacklist-entries)

(clojure.core/declare deser-report-name)

(clojure.core/declare deser-warmup-status)

(clojure.core/declare deser-event-destinations)

(clojure.core/declare deser-percentage-100-wrapper)

(clojure.core/declare deser-domain-isp-placements)

(clojure.core/declare deser-message-content)

(clojure.core/declare deser-placement-statistics)

(clojure.core/declare deser-isp-name)

(clojure.core/declare deser-email-address)

(clojure.core/declare deser-report-id)

(clojure.core/declare deser-dedicated-ip)

(clojure.core/declare deser-max-24-hour-send)

(clojure.core/declare deser-sending-options)

(clojure.core/declare deser-mail-from-domain-name)

(clojure.core/defn- deser-dimension-name [input] input)

(clojure.core/defn- deser-event-destination [input] (clojure.core/cond-> {:name (deser-event-destination-name (input "Name")), :matching-event-types (deser-event-types (input "MatchingEventTypes"))} (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-enabled (input "Enabled"))) (clojure.core/contains? input "KinesisFirehoseDestination") (clojure.core/assoc :kinesis-firehose-destination (deser-kinesis-firehose-destination (input "KinesisFirehoseDestination"))) (clojure.core/contains? input "CloudWatchDestination") (clojure.core/assoc :cloud-watch-destination (deser-cloud-watch-destination (input "CloudWatchDestination"))) (clojure.core/contains? input "SnsDestination") (clojure.core/assoc :sns-destination (deser-sns-destination (input "SnsDestination"))) (clojure.core/contains? input "PinpointDestination") (clojure.core/assoc :pinpoint-destination (deser-pinpoint-destination (input "PinpointDestination")))))

(clojure.core/defn- deser-sns-destination [input] (clojure.core/cond-> {:topic-arn (deser-amazon-resource-name (input "TopicArn"))}))

(clojure.core/defn- deser-sent-last-24-hours [input] input)

(clojure.core/defn- deser-tracking-options [input] (clojure.core/cond-> {:custom-redirect-domain (deser-custom-redirect-domain (input "CustomRedirectDomain"))}))

(clojure.core/defn- deser-dimension-value-source [input] (clojure.core/get {"MESSAGE_TAG" :message-tag, "EMAIL_HEADER" :email-header, "LINK_TAG" :link-tag} input))

(clojure.core/defn- deser-delivery-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "SendingPoolName") (clojure.core/assoc :sending-pool-name (deser-pool-name (input "SendingPoolName")))))

(clojure.core/defn- deser-daily-volumes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-daily-volume coll))) input))

(clojure.core/defn- deser-identity-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-identity-info coll))) input))

(clojure.core/defn- deser-cloud-watch-dimension-configuration [input] (clojure.core/cond-> {:dimension-name (deser-dimension-name (input "DimensionName")), :dimension-value-source (deser-dimension-value-source (input "DimensionValueSource")), :default-dimension-value (deser-default-dimension-value (input "DefaultDimensionValue"))}))

(clojure.core/defn- deser-pool-name [input] input)

(clojure.core/defn- deser-max-send-rate [input] input)

(clojure.core/defn- deser-volume [input] input)

(clojure.core/defn- deser-cloud-watch-destination [input] (clojure.core/cond-> {:dimension-configurations (deser-cloud-watch-dimension-configurations (input "DimensionConfigurations"))}))

(clojure.core/defn- deser-blacklist-report [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-blacklist-item-name k) (deser-blacklist-entries v)])) input))

(clojure.core/defn- deser-amazon-resource-name [input] input)

(clojure.core/defn- deser-isp-placement [input] (clojure.core/cond-> {} (clojure.core/contains? input "IspName") (clojure.core/assoc :isp-name (deser-isp-name (input "IspName"))) (clojure.core/contains? input "PlacementStatistics") (clojure.core/assoc :placement-statistics (deser-placement-statistics (input "PlacementStatistics")))))

(clojure.core/defn- deser-deliverability-test-reports [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deliverability-test-report coll))) input))

(clojure.core/defn- deser-default-dimension-value [input] input)

(clojure.core/defn- deser-identity-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "IdentityType") (clojure.core/assoc :identity-type (deser-identity-type (input "IdentityType"))) (clojure.core/contains? input "IdentityName") (clojure.core/assoc :identity-name (deser-identity (input "IdentityName"))) (clojure.core/contains? input "SendingEnabled") (clojure.core/assoc :sending-enabled (deser-enabled (input "SendingEnabled")))))

(clojure.core/defn- deser-dns-token [input] input)

(clojure.core/defn- deser-blacklist-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "RblName") (clojure.core/assoc :rbl-name (deser-rbl-name (input "RblName"))) (clojure.core/contains? input "ListingTime") (clojure.core/assoc :listing-time (deser-timestamp (input "ListingTime"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-blacklisting-description (input "Description")))))

(clojure.core/defn- deser-configuration-set-name [input] input)

(clojure.core/defn- deser-daily-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "StartDate") (clojure.core/assoc :start-date (deser-timestamp (input "StartDate"))) (clojure.core/contains? input "VolumeStatistics") (clojure.core/assoc :volume-statistics (deser-volume-statistics (input "VolumeStatistics"))) (clojure.core/contains? input "DomainIspPlacements") (clojure.core/assoc :domain-isp-placements (deser-domain-isp-placements (input "DomainIspPlacements")))))

(clojure.core/defn- deser-rbl-name [input] input)

(clojure.core/defn- deser-dkim-status [input] (clojure.core/get {"PENDING" :pending, "SUCCESS" :success, "FAILED" :failed, "TEMPORARY_FAILURE" :temporary-failure, "NOT_STARTED" :not-started} input))

(clojure.core/defn- deser-custom-redirect-domain [input] input)

(clojure.core/defn- deser-volume-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "InboxRawCount") (clojure.core/assoc :inbox-raw-count (deser-volume (input "InboxRawCount"))) (clojure.core/contains? input "SpamRawCount") (clojure.core/assoc :spam-raw-count (deser-volume (input "SpamRawCount"))) (clojure.core/contains? input "ProjectedInbox") (clojure.core/assoc :projected-inbox (deser-volume (input "ProjectedInbox"))) (clojure.core/contains? input "ProjectedSpam") (clojure.core/assoc :projected-spam (deser-volume (input "ProjectedSpam")))))

(clojure.core/defn- deser-enabled [input] input)

(clojure.core/defn- deser-dkim-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "SigningEnabled") (clojure.core/assoc :signing-enabled (deser-enabled (input "SigningEnabled"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-dkim-status (input "Status"))) (clojure.core/contains? input "Tokens") (clojure.core/assoc :tokens (deser-dns-token-list (input "Tokens")))))

(clojure.core/defn- deser-overall-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeStatistics") (clojure.core/assoc :volume-statistics (deser-volume-statistics (input "VolumeStatistics"))) (clojure.core/contains? input "ReadRatePercent") (clojure.core/assoc :read-rate-percent (deser-percentage (input "ReadRatePercent"))) (clojure.core/contains? input "DomainIspPlacements") (clojure.core/assoc :domain-isp-placements (deser-domain-isp-placements (input "DomainIspPlacements")))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"SEND" :send, "REJECT" :reject, "BOUNCE" :bounce, "COMPLAINT" :complaint, "DELIVERY" :delivery, "OPEN" :open, "CLICK" :click, "RENDERING_FAILURE" :rendering-failure} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-isp-placements [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-isp-placement coll))) input))

(clojure.core/defn- deser-send-quota [input] (clojure.core/cond-> {} (clojure.core/contains? input "Max24HourSend") (clojure.core/assoc :max-24-hour-send (deser-max-24-hour-send (input "Max24HourSend"))) (clojure.core/contains? input "MaxSendRate") (clojure.core/assoc :max-send-rate (deser-max-send-rate (input "MaxSendRate"))) (clojure.core/contains? input "SentLast24Hours") (clojure.core/assoc :sent-last-24-hours (deser-sent-last-24-hours (input "SentLast24Hours")))))

(clojure.core/defn- deser-blacklisting-description [input] input)

(clojure.core/defn- deser-dns-token-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dns-token coll))) input))

(clojure.core/defn- deser-dedicated-ip-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dedicated-ip coll))) input))

(clojure.core/defn- deser-outbound-message-id [input] input)

(clojure.core/defn- deser-domain-isp-placement [input] (clojure.core/cond-> {} (clojure.core/contains? input "IspName") (clojure.core/assoc :isp-name (deser-isp-name (input "IspName"))) (clojure.core/contains? input "InboxRawCount") (clojure.core/assoc :inbox-raw-count (deser-volume (input "InboxRawCount"))) (clojure.core/contains? input "SpamRawCount") (clojure.core/assoc :spam-raw-count (deser-volume (input "SpamRawCount"))) (clojure.core/contains? input "InboxPercentage") (clojure.core/assoc :inbox-percentage (deser-percentage (input "InboxPercentage"))) (clojure.core/contains? input "SpamPercentage") (clojure.core/assoc :spam-percentage (deser-percentage (input "SpamPercentage")))))

(clojure.core/defn- deser-last-fresh-start [input] input)

(clojure.core/defn- deser-deliverability-test-report [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReportId") (clojure.core/assoc :report-id (deser-report-id (input "ReportId"))) (clojure.core/contains? input "ReportName") (clojure.core/assoc :report-name (deser-report-name (input "ReportName"))) (clojure.core/contains? input "Subject") (clojure.core/assoc :subject (deser-deliverability-test-subject (input "Subject"))) (clojure.core/contains? input "FromEmailAddress") (clojure.core/assoc :from-email-address (deser-email-address (input "FromEmailAddress"))) (clojure.core/contains? input "CreateDate") (clojure.core/assoc :create-date (deser-timestamp (input "CreateDate"))) (clojure.core/contains? input "DeliverabilityTestStatus") (clojure.core/assoc :deliverability-test-status (deser-deliverability-test-status (input "DeliverabilityTestStatus")))))

(clojure.core/defn- deser-event-destination-name [input] input)

(clojure.core/defn- deser-mail-from-domain-status [input] (clojure.core/get {"PENDING" :pending, "SUCCESS" :success, "FAILED" :failed, "TEMPORARY_FAILURE" :temporary-failure} input))

(clojure.core/defn- deser-deliverability-test-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "COMPLETED" :completed} input))

(clojure.core/defn- deser-behavior-on-mx-failure [input] (clojure.core/get {"USE_DEFAULT_VALUE" :use-default-value, "REJECT_MESSAGE" :reject-message} input))

(clojure.core/defn- deser-percentage [input] input)

(clojure.core/defn- deser-identity-type [input] (clojure.core/get {"EMAIL_ADDRESS" :email-address, "DOMAIN" :domain, "MANAGED_DOMAIN" :managed-domain} input))

(clojure.core/defn- deser-reputation-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReputationMetricsEnabled") (clojure.core/assoc :reputation-metrics-enabled (deser-enabled (input "ReputationMetricsEnabled"))) (clojure.core/contains? input "LastFreshStart") (clojure.core/assoc :last-fresh-start (deser-last-fresh-start (input "LastFreshStart")))))

(clojure.core/defn- deser-pinpoint-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "ApplicationArn") (clojure.core/assoc :application-arn (deser-amazon-resource-name (input "ApplicationArn")))))

(clojure.core/defn- deser-blacklist-item-name [input] input)

(clojure.core/defn- deser-identity [input] input)

(clojure.core/defn- deser-mail-from-attributes [input] (clojure.core/cond-> {:mail-from-domain (deser-mail-from-domain-name (input "MailFromDomain")), :mail-from-domain-status (deser-mail-from-domain-status (input "MailFromDomainStatus")), :behavior-on-mx-failure (deser-behavior-on-mx-failure (input "BehaviorOnMxFailure"))}))

(clojure.core/defn- deser-kinesis-firehose-destination [input] (clojure.core/cond-> {:iam-role-arn (deser-amazon-resource-name (input "IamRoleArn")), :delivery-stream-arn (deser-amazon-resource-name (input "DeliveryStreamArn"))}))

(clojure.core/defn- deser-ip [input] input)

(clojure.core/defn- deser-deliverability-test-subject [input] input)

(clojure.core/defn- deser-list-of-dedicated-ip-pools [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pool-name coll))) input))

(clojure.core/defn- deser-cloud-watch-dimension-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-watch-dimension-configuration coll))) input))

(clojure.core/defn- deser-general-enforcement-status [input] input)

(clojure.core/defn- deser-event-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-type coll))) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-configuration-set-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-set-name coll))) input))

(clojure.core/defn- deser-blacklist-entries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-blacklist-entry coll))) input))

(clojure.core/defn- deser-report-name [input] input)

(clojure.core/defn- deser-warmup-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "DONE" :done} input))

(clojure.core/defn- deser-event-destinations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-destination coll))) input))

(clojure.core/defn- deser-percentage-100-wrapper [input] input)

(clojure.core/defn- deser-domain-isp-placements [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-isp-placement coll))) input))

(clojure.core/defn- deser-message-content [input] input)

(clojure.core/defn- deser-placement-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "InboxPercentage") (clojure.core/assoc :inbox-percentage (deser-percentage (input "InboxPercentage"))) (clojure.core/contains? input "SpamPercentage") (clojure.core/assoc :spam-percentage (deser-percentage (input "SpamPercentage"))) (clojure.core/contains? input "MissingPercentage") (clojure.core/assoc :missing-percentage (deser-percentage (input "MissingPercentage"))) (clojure.core/contains? input "SpfPercentage") (clojure.core/assoc :spf-percentage (deser-percentage (input "SpfPercentage"))) (clojure.core/contains? input "DkimPercentage") (clojure.core/assoc :dkim-percentage (deser-percentage (input "DkimPercentage")))))

(clojure.core/defn- deser-isp-name [input] input)

(clojure.core/defn- deser-email-address [input] input)

(clojure.core/defn- deser-report-id [input] input)

(clojure.core/defn- deser-dedicated-ip [input] (clojure.core/cond-> {:ip (deser-ip (input "Ip")), :warmup-status (deser-warmup-status (input "WarmupStatus")), :warmup-percentage (deser-percentage-100-wrapper (input "WarmupPercentage"))} (clojure.core/contains? input "PoolName") (clojure.core/assoc :pool-name (deser-pool-name (input "PoolName")))))

(clojure.core/defn- deser-max-24-hour-send [input] input)

(clojure.core/defn- deser-sending-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "SendingEnabled") (clojure.core/assoc :sending-enabled (deser-enabled (input "SendingEnabled")))))

(clojure.core/defn- deser-mail-from-domain-name [input] input)

(clojure.core/defn- response-put-configuration-set-delivery-options-response ([input] (response-put-configuration-set-delivery-options-response nil input)) ([resultWrapper1460520 input] (clojure.core/let [rawinput1460519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460521 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-dedicated-ip-pools-response ([input] (response-list-dedicated-ip-pools-response nil input)) ([resultWrapper1460523 input] (clojure.core/let [rawinput1460522 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460524 {"DedicatedIpPools" (rawinput1460522 "DedicatedIpPools"), "NextToken" (rawinput1460522 "NextToken")}] (clojure.core/cond-> {} (letvar1460524 "DedicatedIpPools") (clojure.core/assoc :dedicated-ip-pools (deser-list-of-dedicated-ip-pools (clojure.core/get-in letvar1460524 ["DedicatedIpPools"]))) (letvar1460524 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1460524 ["NextToken"])))))))

(clojure.core/defn- response-list-deliverability-test-reports-response ([input] (response-list-deliverability-test-reports-response nil input)) ([resultWrapper1460526 input] (clojure.core/let [rawinput1460525 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460527 {"DeliverabilityTestReports" (rawinput1460525 "DeliverabilityTestReports"), "NextToken" (rawinput1460525 "NextToken")}] (clojure.core/cond-> {:deliverability-test-reports (deser-deliverability-test-reports (clojure.core/get-in letvar1460527 ["DeliverabilityTestReports"]))} (letvar1460527 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1460527 ["NextToken"])))))))

(clojure.core/defn- response-delete-dedicated-ip-pool-response ([input] (response-delete-dedicated-ip-pool-response nil input)) ([resultWrapper1460529 input] (clojure.core/let [rawinput1460528 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460530 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper1460532 input] (clojure.core/let [rawinput1460531 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460533 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-configuration-set-reputation-options-response ([input] (response-put-configuration-set-reputation-options-response nil input)) ([resultWrapper1460535 input] (clojure.core/let [rawinput1460534 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460536 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1460538 input] (clojure.core/let [rawinput1460537 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460539 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-email-identity-response ([input] (response-get-email-identity-response nil input)) ([resultWrapper1460541 input] (clojure.core/let [rawinput1460540 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460542 {"IdentityType" (rawinput1460540 "IdentityType"), "FeedbackForwardingStatus" (rawinput1460540 "FeedbackForwardingStatus"), "VerifiedForSendingStatus" (rawinput1460540 "VerifiedForSendingStatus"), "DkimAttributes" (rawinput1460540 "DkimAttributes"), "MailFromAttributes" (rawinput1460540 "MailFromAttributes")}] (clojure.core/cond-> {} (letvar1460542 "IdentityType") (clojure.core/assoc :identity-type (deser-identity-type (clojure.core/get-in letvar1460542 ["IdentityType"]))) (letvar1460542 "FeedbackForwardingStatus") (clojure.core/assoc :feedback-forwarding-status (deser-enabled (clojure.core/get-in letvar1460542 ["FeedbackForwardingStatus"]))) (letvar1460542 "VerifiedForSendingStatus") (clojure.core/assoc :verified-for-sending-status (deser-enabled (clojure.core/get-in letvar1460542 ["VerifiedForSendingStatus"]))) (letvar1460542 "DkimAttributes") (clojure.core/assoc :dkim-attributes (deser-dkim-attributes (clojure.core/get-in letvar1460542 ["DkimAttributes"]))) (letvar1460542 "MailFromAttributes") (clojure.core/assoc :mail-from-attributes (deser-mail-from-attributes (clojure.core/get-in letvar1460542 ["MailFromAttributes"])))))))

(clojure.core/defn- response-get-domain-statistics-report-response ([input] (response-get-domain-statistics-report-response nil input)) ([resultWrapper1460544 input] (clojure.core/let [rawinput1460543 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460545 {"OverallVolume" (rawinput1460543 "OverallVolume"), "DailyVolumes" (rawinput1460543 "DailyVolumes")}] (clojure.core/cond-> {:overall-volume (deser-overall-volume (clojure.core/get-in letvar1460545 ["OverallVolume"])), :daily-volumes (deser-daily-volumes (clojure.core/get-in letvar1460545 ["DailyVolumes"]))}))))

(clojure.core/defn- response-mail-from-domain-not-verified-exception ([input] (response-mail-from-domain-not-verified-exception nil input)) ([resultWrapper1460547 input] (clojure.core/let [rawinput1460546 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460548 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-configuration-set-event-destinations-response ([input] (response-get-configuration-set-event-destinations-response nil input)) ([resultWrapper1460550 input] (clojure.core/let [rawinput1460549 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460551 {"EventDestinations" (rawinput1460549 "EventDestinations")}] (clojure.core/cond-> {} (letvar1460551 "EventDestinations") (clojure.core/assoc :event-destinations (deser-event-destinations (clojure.core/get-in letvar1460551 ["EventDestinations"])))))))

(clojure.core/defn- response-get-account-response ([input] (response-get-account-response nil input)) ([resultWrapper1460553 input] (clojure.core/let [rawinput1460552 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460554 {"SendQuota" (rawinput1460552 "SendQuota"), "SendingEnabled" (rawinput1460552 "SendingEnabled"), "DedicatedIpAutoWarmupEnabled" (rawinput1460552 "DedicatedIpAutoWarmupEnabled"), "EnforcementStatus" (rawinput1460552 "EnforcementStatus"), "ProductionAccessEnabled" (rawinput1460552 "ProductionAccessEnabled")}] (clojure.core/cond-> {} (letvar1460554 "SendQuota") (clojure.core/assoc :send-quota (deser-send-quota (clojure.core/get-in letvar1460554 ["SendQuota"]))) (letvar1460554 "SendingEnabled") (clojure.core/assoc :sending-enabled (deser-enabled (clojure.core/get-in letvar1460554 ["SendingEnabled"]))) (letvar1460554 "DedicatedIpAutoWarmupEnabled") (clojure.core/assoc :dedicated-ip-auto-warmup-enabled (deser-enabled (clojure.core/get-in letvar1460554 ["DedicatedIpAutoWarmupEnabled"]))) (letvar1460554 "EnforcementStatus") (clojure.core/assoc :enforcement-status (deser-general-enforcement-status (clojure.core/get-in letvar1460554 ["EnforcementStatus"]))) (letvar1460554 "ProductionAccessEnabled") (clojure.core/assoc :production-access-enabled (deser-enabled (clojure.core/get-in letvar1460554 ["ProductionAccessEnabled"])))))))

(clojure.core/defn- response-put-email-identity-dkim-attributes-response ([input] (response-put-email-identity-dkim-attributes-response nil input)) ([resultWrapper1460556 input] (clojure.core/let [rawinput1460555 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460557 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-configuration-set-tracking-options-response ([input] (response-put-configuration-set-tracking-options-response nil input)) ([resultWrapper1460559 input] (clojure.core/let [rawinput1460558 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460560 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-configuration-set-sending-options-response ([input] (response-put-configuration-set-sending-options-response nil input)) ([resultWrapper1460562 input] (clojure.core/let [rawinput1460561 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460563 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-account-dedicated-ip-warmup-attributes-response ([input] (response-put-account-dedicated-ip-warmup-attributes-response nil input)) ([resultWrapper1460565 input] (clojure.core/let [rawinput1460564 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460566 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1460568 input] (clojure.core/let [rawinput1460567 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460569 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-email-identities-response ([input] (response-list-email-identities-response nil input)) ([resultWrapper1460571 input] (clojure.core/let [rawinput1460570 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460572 {"EmailIdentities" (rawinput1460570 "EmailIdentities"), "NextToken" (rawinput1460570 "NextToken")}] (clojure.core/cond-> {} (letvar1460572 "EmailIdentities") (clojure.core/assoc :email-identities (deser-identity-info-list (clojure.core/get-in letvar1460572 ["EmailIdentities"]))) (letvar1460572 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1460572 ["NextToken"])))))))

(clojure.core/defn- response-send-email-response ([input] (response-send-email-response nil input)) ([resultWrapper1460574 input] (clojure.core/let [rawinput1460573 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460575 {"MessageId" (rawinput1460573 "MessageId")}] (clojure.core/cond-> {} (letvar1460575 "MessageId") (clojure.core/assoc :message-id (deser-outbound-message-id (clojure.core/get-in letvar1460575 ["MessageId"])))))))

(clojure.core/defn- response-list-configuration-sets-response ([input] (response-list-configuration-sets-response nil input)) ([resultWrapper1460577 input] (clojure.core/let [rawinput1460576 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460578 {"ConfigurationSets" (rawinput1460576 "ConfigurationSets"), "NextToken" (rawinput1460576 "NextToken")}] (clojure.core/cond-> {} (letvar1460578 "ConfigurationSets") (clojure.core/assoc :configuration-sets (deser-configuration-set-name-list (clojure.core/get-in letvar1460578 ["ConfigurationSets"]))) (letvar1460578 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1460578 ["NextToken"])))))))

(clojure.core/defn- response-create-dedicated-ip-pool-response ([input] (response-create-dedicated-ip-pool-response nil input)) ([resultWrapper1460580 input] (clojure.core/let [rawinput1460579 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460581 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-configuration-set-response ([input] (response-create-configuration-set-response nil input)) ([resultWrapper1460583 input] (clojure.core/let [rawinput1460582 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460584 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1460586 input] (clojure.core/let [rawinput1460585 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460587 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-message-rejected ([input] (response-message-rejected nil input)) ([resultWrapper1460589 input] (clojure.core/let [rawinput1460588 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460590 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-account-sending-attributes-response ([input] (response-put-account-sending-attributes-response nil input)) ([resultWrapper1460592 input] (clojure.core/let [rawinput1460591 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460593 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-email-identity-feedback-attributes-response ([input] (response-put-email-identity-feedback-attributes-response nil input)) ([resultWrapper1460595 input] (clojure.core/let [rawinput1460594 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460596 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-configuration-set-event-destination-response ([input] (response-update-configuration-set-event-destination-response nil input)) ([resultWrapper1460598 input] (clojure.core/let [rawinput1460597 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460599 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1460601 input] (clojure.core/let [rawinput1460600 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460602 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-dedicated-ip-in-pool-response ([input] (response-put-dedicated-ip-in-pool-response nil input)) ([resultWrapper1460604 input] (clojure.core/let [rawinput1460603 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460605 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-configuration-set-response ([input] (response-delete-configuration-set-response nil input)) ([resultWrapper1460607 input] (clojure.core/let [rawinput1460606 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460608 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-dedicated-ip-response ([input] (response-get-dedicated-ip-response nil input)) ([resultWrapper1460610 input] (clojure.core/let [rawinput1460609 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460611 {"DedicatedIp" (rawinput1460609 "DedicatedIp")}] (clojure.core/cond-> {} (letvar1460611 "DedicatedIp") (clojure.core/assoc :dedicated-ip (deser-dedicated-ip (clojure.core/get-in letvar1460611 ["DedicatedIp"])))))))

(clojure.core/defn- response-create-deliverability-test-report-response ([input] (response-create-deliverability-test-report-response nil input)) ([resultWrapper1460613 input] (clojure.core/let [rawinput1460612 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460614 {"ReportId" (rawinput1460612 "ReportId"), "DeliverabilityTestStatus" (rawinput1460612 "DeliverabilityTestStatus")}] (clojure.core/cond-> {:report-id (deser-report-id (clojure.core/get-in letvar1460614 ["ReportId"])), :deliverability-test-status (deser-deliverability-test-status (clojure.core/get-in letvar1460614 ["DeliverabilityTestStatus"]))}))))

(clojure.core/defn- response-account-suspended-exception ([input] (response-account-suspended-exception nil input)) ([resultWrapper1460616 input] (clojure.core/let [rawinput1460615 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460617 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-email-identity-response ([input] (response-delete-email-identity-response nil input)) ([resultWrapper1460619 input] (clojure.core/let [rawinput1460618 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460620 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-configuration-set-event-destination-response ([input] (response-delete-configuration-set-event-destination-response nil input)) ([resultWrapper1460622 input] (clojure.core/let [rawinput1460621 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460623 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-deliverability-dashboard-option-response ([input] (response-put-deliverability-dashboard-option-response nil input)) ([resultWrapper1460625 input] (clojure.core/let [rawinput1460624 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460626 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-configuration-set-response ([input] (response-get-configuration-set-response nil input)) ([resultWrapper1460628 input] (clojure.core/let [rawinput1460627 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460629 {"ConfigurationSetName" (rawinput1460627 "ConfigurationSetName"), "TrackingOptions" (rawinput1460627 "TrackingOptions"), "DeliveryOptions" (rawinput1460627 "DeliveryOptions"), "ReputationOptions" (rawinput1460627 "ReputationOptions"), "SendingOptions" (rawinput1460627 "SendingOptions")}] (clojure.core/cond-> {} (letvar1460629 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar1460629 ["ConfigurationSetName"]))) (letvar1460629 "TrackingOptions") (clojure.core/assoc :tracking-options (deser-tracking-options (clojure.core/get-in letvar1460629 ["TrackingOptions"]))) (letvar1460629 "DeliveryOptions") (clojure.core/assoc :delivery-options (deser-delivery-options (clojure.core/get-in letvar1460629 ["DeliveryOptions"]))) (letvar1460629 "ReputationOptions") (clojure.core/assoc :reputation-options (deser-reputation-options (clojure.core/get-in letvar1460629 ["ReputationOptions"]))) (letvar1460629 "SendingOptions") (clojure.core/assoc :sending-options (deser-sending-options (clojure.core/get-in letvar1460629 ["SendingOptions"])))))))

(clojure.core/defn- response-put-dedicated-ip-warmup-attributes-response ([input] (response-put-dedicated-ip-warmup-attributes-response nil input)) ([resultWrapper1460631 input] (clojure.core/let [rawinput1460630 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460632 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-dedicated-ips-response ([input] (response-get-dedicated-ips-response nil input)) ([resultWrapper1460634 input] (clojure.core/let [rawinput1460633 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460635 {"DedicatedIps" (rawinput1460633 "DedicatedIps"), "NextToken" (rawinput1460633 "NextToken")}] (clojure.core/cond-> {} (letvar1460635 "DedicatedIps") (clojure.core/assoc :dedicated-ips (deser-dedicated-ip-list (clojure.core/get-in letvar1460635 ["DedicatedIps"]))) (letvar1460635 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1460635 ["NextToken"])))))))

(clojure.core/defn- response-put-email-identity-mail-from-attributes-response ([input] (response-put-email-identity-mail-from-attributes-response nil input)) ([resultWrapper1460637 input] (clojure.core/let [rawinput1460636 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460638 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-sending-paused-exception ([input] (response-sending-paused-exception nil input)) ([resultWrapper1460640 input] (clojure.core/let [rawinput1460639 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460641 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-configuration-set-event-destination-response ([input] (response-create-configuration-set-event-destination-response nil input)) ([resultWrapper1460643 input] (clojure.core/let [rawinput1460642 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460644 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-deliverability-test-report-response ([input] (response-get-deliverability-test-report-response nil input)) ([resultWrapper1460646 input] (clojure.core/let [rawinput1460645 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460647 {"DeliverabilityTestReport" (rawinput1460645 "DeliverabilityTestReport"), "OverallPlacement" (rawinput1460645 "OverallPlacement"), "IspPlacements" (rawinput1460645 "IspPlacements"), "Message" (rawinput1460645 "Message")}] (clojure.core/cond-> {:deliverability-test-report (deser-deliverability-test-report (clojure.core/get-in letvar1460647 ["DeliverabilityTestReport"])), :overall-placement (deser-placement-statistics (clojure.core/get-in letvar1460647 ["OverallPlacement"])), :isp-placements (deser-isp-placements (clojure.core/get-in letvar1460647 ["IspPlacements"]))} (letvar1460647 "Message") (clojure.core/assoc :message (deser-message-content (clojure.core/get-in letvar1460647 ["Message"])))))))

(clojure.core/defn- response-create-email-identity-response ([input] (response-create-email-identity-response nil input)) ([resultWrapper1460649 input] (clojure.core/let [rawinput1460648 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460650 {"IdentityType" (rawinput1460648 "IdentityType"), "VerifiedForSendingStatus" (rawinput1460648 "VerifiedForSendingStatus"), "DkimAttributes" (rawinput1460648 "DkimAttributes")}] (clojure.core/cond-> {} (letvar1460650 "IdentityType") (clojure.core/assoc :identity-type (deser-identity-type (clojure.core/get-in letvar1460650 ["IdentityType"]))) (letvar1460650 "VerifiedForSendingStatus") (clojure.core/assoc :verified-for-sending-status (deser-enabled (clojure.core/get-in letvar1460650 ["VerifiedForSendingStatus"]))) (letvar1460650 "DkimAttributes") (clojure.core/assoc :dkim-attributes (deser-dkim-attributes (clojure.core/get-in letvar1460650 ["DkimAttributes"])))))))

(clojure.core/defn- response-get-deliverability-dashboard-options-response ([input] (response-get-deliverability-dashboard-options-response nil input)) ([resultWrapper1460652 input] (clojure.core/let [rawinput1460651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460653 {"DashboardEnabled" (rawinput1460651 "DashboardEnabled")}] (clojure.core/cond-> {:dashboard-enabled (deser-enabled (clojure.core/get-in letvar1460653 ["DashboardEnabled"]))}))))

(clojure.core/defn- response-get-blacklist-reports-response ([input] (response-get-blacklist-reports-response nil input)) ([resultWrapper1460655 input] (clojure.core/let [rawinput1460654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1460656 {"BlacklistReport" (rawinput1460654 "BlacklistReport")}] (clojure.core/cond-> {:blacklist-report (deser-blacklist-report (clojure.core/get-in letvar1460656 ["BlacklistReport"]))}))))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-delivery-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.list-dedicated-ip-pools-response/dedicated-ip-pools (clojure.spec.alpha/and :portkey.aws.pinpoint-email/list-of-dedicated-ip-pools))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-dedicated-ip-pools-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.list-dedicated-ip-pools-response/dedicated-ip-pools :portkey.aws.pinpoint-email/next-token]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.event-destination/name (clojure.spec.alpha/and :portkey.aws.pinpoint-email/event-destination-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.event-destination/matching-event-types (clojure.spec.alpha/and :portkey.aws.pinpoint-email/event-types))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/event-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.event-destination/name :portkey.aws.pinpoint-email.event-destination/matching-event-types] :opt-un [:portkey.aws.pinpoint-email/enabled :portkey.aws.pinpoint-email/kinesis-firehose-destination :portkey.aws.pinpoint-email/cloud-watch-destination :portkey.aws.pinpoint-email/sns-destination :portkey.aws.pinpoint-email/pinpoint-destination]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-dedicated-ip-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/pool-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.sns-destination/topic-arn (clojure.spec.alpha/and :portkey.aws.pinpoint-email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/sns-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.sns-destination/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/sent-last-24-hours clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/tracking-options (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/custom-redirect-domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dimension-value-source #{"LINK_TAG" :link-tag :email-header :message-tag "EMAIL_HEADER" "MESSAGE_TAG"})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-deliverability-test-reports-response (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/deliverability-test-reports] :opt-un [:portkey.aws.pinpoint-email/next-token]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-deliverability-dashboard-options-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.delivery-options/sending-pool-name (clojure.spec.alpha/and :portkey.aws.pinpoint-email/pool-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delivery-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.delivery-options/sending-pool-name]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-dedicated-ip-pool-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/daily-volumes (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/daily-volume))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-reputation-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/identity-info-list (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/identity-info))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/cloud-watch-dimension-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/dimension-name :portkey.aws.pinpoint-email/dimension-value-source :portkey.aws.pinpoint-email/default-dimension-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/pool-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-email-identity-dkim-attributes-request/email-identity (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-email-identity-dkim-attributes-request/signing-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-email-identity-dkim-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.put-email-identity-dkim-attributes-request/email-identity] :opt-un [:portkey.aws.pinpoint-email.put-email-identity-dkim-attributes-request/signing-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.email-content/simple (clojure.spec.alpha/and :portkey.aws.pinpoint-email/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.email-content/raw (clojure.spec.alpha/and :portkey.aws.pinpoint-email/raw-message))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/email-content (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.email-content/simple :portkey.aws.pinpoint-email.email-content/raw]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-email-identity-response/feedback-forwarding-status (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-email-identity-response/verified-for-sending-status (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-email-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/identity-type :portkey.aws.pinpoint-email.get-email-identity-response/feedback-forwarding-status :portkey.aws.pinpoint-email.get-email-identity-response/verified-for-sending-status :portkey.aws.pinpoint-email/dkim-attributes :portkey.aws.pinpoint-email/mail-from-attributes]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/max-send-rate clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-domain-statistics-report-response (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/overall-volume :portkey.aws.pinpoint-email/daily-volumes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/mail-from-domain-not-verified-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/volume clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-dedicated-ip-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/pool-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.cloud-watch-destination/dimension-configurations (clojure.spec.alpha/and :portkey.aws.pinpoint-email/cloud-watch-dimension-configurations))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/cloud-watch-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.cloud-watch-destination/dimension-configurations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-configuration-set-event-destinations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/event-destinations]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/email-address-list (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/email-address))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.body/text (clojure.spec.alpha/and :portkey.aws.pinpoint-email/content))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.body/html (clojure.spec.alpha/and :portkey.aws.pinpoint-email/content))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.body/text :portkey.aws.pinpoint-email.body/html]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/blacklist-report (clojure.spec.alpha/map-of :portkey.aws.pinpoint-email/blacklist-item-name :portkey.aws.pinpoint-email/blacklist-entries))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/amazon-resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.create-email-identity-request/email-identity (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-email-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.create-email-identity-request/email-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-account-response/sending-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-account-response/dedicated-ip-auto-warmup-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-account-response/enforcement-status (clojure.spec.alpha/and :portkey.aws.pinpoint-email/general-enforcement-status))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-account-response/production-access-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/send-quota :portkey.aws.pinpoint-email.get-account-response/sending-enabled :portkey.aws.pinpoint-email.get-account-response/dedicated-ip-auto-warmup-enabled :portkey.aws.pinpoint-email.get-account-response/enforcement-status :portkey.aws.pinpoint-email.get-account-response/production-access-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-email-identity-dkim-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/isp-placement (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/isp-name :portkey.aws.pinpoint-email/placement-statistics]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/deliverability-test-reports (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/deliverability-test-report))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-tracking-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-sending-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/default-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-account-dedicated-ip-warmup-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/blacklist-item-names (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/blacklist-item-name))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.destination/to-addresses (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.destination/cc-addresses (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.destination/bcc-addresses (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.destination/to-addresses :portkey.aws.pinpoint-email.destination/cc-addresses :portkey.aws.pinpoint-email.destination/bcc-addresses]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.identity-info/identity-name (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.identity-info/sending-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/identity-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/identity-type :portkey.aws.pinpoint-email.identity-info/identity-name :portkey.aws.pinpoint-email.identity-info/sending-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.event-destination-definition/matching-event-types (clojure.spec.alpha/and :portkey.aws.pinpoint-email/event-types))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/event-destination-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/enabled :portkey.aws.pinpoint-email.event-destination-definition/matching-event-types :portkey.aws.pinpoint-email/kinesis-firehose-destination :portkey.aws.pinpoint-email/cloud-watch-destination :portkey.aws.pinpoint-email/sns-destination :portkey.aws.pinpoint-email/pinpoint-destination]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dns-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.list-email-identities-response/email-identities (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity-info-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-email-identities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.list-email-identities-response/email-identities :portkey.aws.pinpoint-email/next-token]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.blacklist-entry/listing-time (clojure.spec.alpha/and :portkey.aws.pinpoint-email/timestamp))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.blacklist-entry/description (clojure.spec.alpha/and :portkey.aws.pinpoint-email/blacklisting-description))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/blacklist-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/rbl-name :portkey.aws.pinpoint-email.blacklist-entry/listing-time :portkey.aws.pinpoint-email.blacklist-entry/description]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/raw-message-data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.send-email-response/message-id (clojure.spec.alpha/and :portkey.aws.pinpoint-email/outbound-message-id))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/send-email-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.send-email-response/message-id]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/configuration-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.daily-volume/start-date (clojure.spec.alpha/and :portkey.aws.pinpoint-email/timestamp))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/daily-volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.daily-volume/start-date :portkey.aws.pinpoint-email/volume-statistics :portkey.aws.pinpoint-email/domain-isp-placements]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/rbl-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dkim-status #{"SUCCESS" :pending "PENDING" "TEMPORARY_FAILURE" "NOT_STARTED" :success "FAILED" :temporary-failure :not-started :failed})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-email-identity-request/email-identity (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-email-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.get-email-identity-request/email-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.list-configuration-sets-response/configuration-sets (clojure.spec.alpha/and :portkey.aws.pinpoint-email/configuration-set-name-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-configuration-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.list-configuration-sets-response/configuration-sets :portkey.aws.pinpoint-email/next-token]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/custom-redirect-domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.volume-statistics/inbox-raw-count (clojure.spec.alpha/and :portkey.aws.pinpoint-email/volume))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.volume-statistics/spam-raw-count (clojure.spec.alpha/and :portkey.aws.pinpoint-email/volume))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.volume-statistics/projected-inbox (clojure.spec.alpha/and :portkey.aws.pinpoint-email/volume))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.volume-statistics/projected-spam (clojure.spec.alpha/and :portkey.aws.pinpoint-email/volume))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/volume-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.volume-statistics/inbox-raw-count :portkey.aws.pinpoint-email.volume-statistics/spam-raw-count :portkey.aws.pinpoint-email.volume-statistics/projected-inbox :portkey.aws.pinpoint-email.volume-statistics/projected-spam]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-dedicated-ips-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint-email/max-items))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-dedicated-ips-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/pool-name :portkey.aws.pinpoint-email/next-token :portkey.aws.pinpoint-email.get-dedicated-ips-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.dkim-attributes/signing-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.dkim-attributes/status (clojure.spec.alpha/and :portkey.aws.pinpoint-email/dkim-status))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.dkim-attributes/tokens (clojure.spec.alpha/and :portkey.aws.pinpoint-email/dns-token-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dkim-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.dkim-attributes/signing-enabled :portkey.aws.pinpoint-email.dkim-attributes/status :portkey.aws.pinpoint-email.dkim-attributes/tokens]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.overall-volume/read-rate-percent (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/overall-volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/volume-statistics :portkey.aws.pinpoint-email.overall-volume/read-rate-percent :portkey.aws.pinpoint-email/domain-isp-placements]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-dedicated-ip-pool-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/event-type #{:open "OPEN" "SEND" :complaint :delivery "COMPLAINT" "CLICK" "RENDERING_FAILURE" :bounce :click "REJECT" :send "BOUNCE" :reject :rendering-failure "DELIVERY"})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/isp-placements (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/isp-placement))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/send-quota (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/max-24-hour-send :portkey.aws.pinpoint-email/max-send-rate :portkey.aws.pinpoint-email/sent-last-24-hours]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name :portkey.aws.pinpoint-email/event-destination-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message-rejected (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/blacklisting-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.message-tag/name (clojure.spec.alpha/and :portkey.aws.pinpoint-email/message-tag-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.message-tag/value (clojure.spec.alpha/and :portkey.aws.pinpoint-email/message-tag-value))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message-tag (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.message-tag/name :portkey.aws.pinpoint-email.message-tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.list-email-identities-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint-email/max-items))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-email-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/next-token :portkey.aws.pinpoint-email.list-email-identities-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dns-token-list (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/dns-token))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dedicated-ip-list (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/dedicated-ip))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/sending-pool-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/outbound-message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.domain-isp-placement/inbox-raw-count (clojure.spec.alpha/and :portkey.aws.pinpoint-email/volume))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.domain-isp-placement/spam-raw-count (clojure.spec.alpha/and :portkey.aws.pinpoint-email/volume))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.domain-isp-placement/inbox-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.domain-isp-placement/spam-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/domain-isp-placement (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/isp-name :portkey.aws.pinpoint-email.domain-isp-placement/inbox-raw-count :portkey.aws.pinpoint-email.domain-isp-placement/spam-raw-count :portkey.aws.pinpoint-email.domain-isp-placement/inbox-percentage :portkey.aws.pinpoint-email.domain-isp-placement/spam-percentage]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/last-fresh-start clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message-tag-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-account-sending-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-email-identity-feedback-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.list-configuration-sets-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint-email/max-items))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-configuration-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/next-token :portkey.aws.pinpoint-email.list-configuration-sets-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.list-deliverability-test-reports-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint-email/max-items))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-deliverability-test-reports-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/next-token :portkey.aws.pinpoint-email.list-deliverability-test-reports-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-dedicated-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/ip] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-blacklist-reports-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/blacklist-item-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.deliverability-test-report/subject (clojure.spec.alpha/and :portkey.aws.pinpoint-email/deliverability-test-subject))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.deliverability-test-report/from-email-address (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.deliverability-test-report/create-date (clojure.spec.alpha/and :portkey.aws.pinpoint-email/timestamp))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/deliverability-test-report (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/report-id :portkey.aws.pinpoint-email/report-name :portkey.aws.pinpoint-email.deliverability-test-report/subject :portkey.aws.pinpoint-email.deliverability-test-report/from-email-address :portkey.aws.pinpoint-email.deliverability-test-report/create-date :portkey.aws.pinpoint-email/deliverability-test-status]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-domain-statistics-report-request/domain (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-domain-statistics-report-request/start-date (clojure.spec.alpha/and :portkey.aws.pinpoint-email/timestamp))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-domain-statistics-report-request/end-date (clojure.spec.alpha/and :portkey.aws.pinpoint-email/timestamp))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-domain-statistics-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.get-domain-statistics-report-request/domain :portkey.aws.pinpoint-email.get-domain-statistics-report-request/start-date :portkey.aws.pinpoint-email.get-domain-statistics-report-request/end-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/event-destination-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.message/subject (clojure.spec.alpha/and :portkey.aws.pinpoint-email/content))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.message/subject :portkey.aws.pinpoint-email/body] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/update-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-account-dedicated-ip-warmup-attributes-request/auto-warmup-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-account-dedicated-ip-warmup-attributes-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.put-account-dedicated-ip-warmup-attributes-request/auto-warmup-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/mail-from-domain-status #{"SUCCESS" :pending "PENDING" "TEMPORARY_FAILURE" :success "FAILED" :temporary-failure :failed})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/deliverability-test-status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-email-identity-feedback-attributes-request/email-identity (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-email-identity-feedback-attributes-request/email-forwarding-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-email-identity-feedback-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.put-email-identity-feedback-attributes-request/email-identity] :opt-un [:portkey.aws.pinpoint-email.put-email-identity-feedback-attributes-request/email-forwarding-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message-tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/behavior-on-mx-failure #{:reject-message "REJECT_MESSAGE" "USE_DEFAULT_VALUE" :use-default-value})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/percentage clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-dedicated-ip-in-pool-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-delivery-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name] :opt-un [:portkey.aws.pinpoint-email/sending-pool-name]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.content/data (clojure.spec.alpha/and :portkey.aws.pinpoint-email/message-data))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/content (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.content/data] :opt-un [:portkey.aws.pinpoint-email/charset]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/identity-type #{"EMAIL_ADDRESS" "MANAGED_DOMAIN" :managed-domain :email-address :domain "DOMAIN"})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-configuration-set-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/configuration-set-name :portkey.aws.pinpoint-email/tracking-options :portkey.aws.pinpoint-email/delivery-options :portkey.aws.pinpoint-email/reputation-options :portkey.aws.pinpoint-email/sending-options]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.reputation-options/reputation-metrics-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/reputation-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.reputation-options/reputation-metrics-enabled :portkey.aws.pinpoint-email/last-fresh-start]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-configuration-set-event-destinations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.pinpoint-destination/application-arn (clojure.spec.alpha/and :portkey.aws.pinpoint-email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/pinpoint-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.pinpoint-destination/application-arn]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-deliverability-dashboard-option-request/dashboard-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-deliverability-dashboard-option-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.put-deliverability-dashboard-option-request/dashboard-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/blacklist-item-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-dedicated-ip-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/dedicated-ip]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.list-dedicated-ip-pools-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint-email/max-items))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-dedicated-ip-pools-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/next-token :portkey.aws.pinpoint-email.list-dedicated-ip-pools-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-deliverability-test-report-response (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/report-id :portkey.aws.pinpoint-email/deliverability-test-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.update-configuration-set-event-destination-request/event-destination (clojure.spec.alpha/and :portkey.aws.pinpoint-email/event-destination-definition))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/update-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name :portkey.aws.pinpoint-email/event-destination-name :portkey.aws.pinpoint-email.update-configuration-set-event-destination-request/event-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.create-configuration-set-event-destination-request/event-destination (clojure.spec.alpha/and :portkey.aws.pinpoint-email/event-destination-definition))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name :portkey.aws.pinpoint-email/event-destination-name :portkey.aws.pinpoint-email.create-configuration-set-event-destination-request/event-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/identity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/max-items clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/account-suspended-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.mail-from-attributes/mail-from-domain (clojure.spec.alpha/and :portkey.aws.pinpoint-email/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/mail-from-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.mail-from-attributes/mail-from-domain :portkey.aws.pinpoint-email/mail-from-domain-status :portkey.aws.pinpoint-email/behavior-on-mx-failure] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.kinesis-firehose-destination/iam-role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint-email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.kinesis-firehose-destination/delivery-stream-arn (clojure.spec.alpha/and :portkey.aws.pinpoint-email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/kinesis-firehose-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.kinesis-firehose-destination/iam-role-arn :portkey.aws.pinpoint-email.kinesis-firehose-destination/delivery-stream-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/ip (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-configuration-set-reputation-options-request/reputation-metrics-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-reputation-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name] :opt-un [:portkey.aws.pinpoint-email.put-configuration-set-reputation-options-request/reputation-metrics-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/deliverability-test-subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message-tag-list (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/message-tag))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-tracking-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name] :opt-un [:portkey.aws.pinpoint-email/custom-redirect-domain]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/list-of-dedicated-ip-pools (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/pool-name))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/cloud-watch-dimension-configurations (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/cloud-watch-dimension-configuration))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/general-enforcement-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-dedicated-ip-in-pool-request/destination-pool-name (clojure.spec.alpha/and :portkey.aws.pinpoint-email/pool-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-dedicated-ip-in-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/ip :portkey.aws.pinpoint-email.put-dedicated-ip-in-pool-request/destination-pool-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/event-types (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/event-type))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-email-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-configuration-set-sending-options-request/sending-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-configuration-set-sending-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name] :opt-un [:portkey.aws.pinpoint-email.put-configuration-set-sending-options-request/sending-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.create-deliverability-test-report-request/from-email-address (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.create-deliverability-test-report-request/content (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-content))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-deliverability-test-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.create-deliverability-test-report-request/from-email-address :portkey.aws.pinpoint-email.create-deliverability-test-report-request/content] :opt-un [:portkey.aws.pinpoint-email/report-name]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/charset (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/configuration-set-name-list (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/configuration-set-name))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/blacklist-entries (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/blacklist-entry))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-deliverability-dashboard-option-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/configuration-set-name :portkey.aws.pinpoint-email/tracking-options :portkey.aws.pinpoint-email/delivery-options :portkey.aws.pinpoint-email/reputation-options :portkey.aws.pinpoint-email/sending-options]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.delete-email-identity-request/email-identity (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/delete-email-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.delete-email-identity-request/email-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/report-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/warmup-status #{:done "IN_PROGRESS" :in-progress "DONE"})

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/event-destinations (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/event-destination))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-dedicated-ip-warmup-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/percentage-100-wrapper clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-dedicated-ips-response/dedicated-ips (clojure.spec.alpha/and :portkey.aws.pinpoint-email/dedicated-ip-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-dedicated-ips-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.get-dedicated-ips-response/dedicated-ips :portkey.aws.pinpoint-email/next-token]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.send-email-request/from-email-address (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.send-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.send-email-request/feedback-forwarding-email-address (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-address))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.send-email-request/content (clojure.spec.alpha/and :portkey.aws.pinpoint-email/email-content))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.send-email-request/email-tags (clojure.spec.alpha/and :portkey.aws.pinpoint-email/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/send-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/destination :portkey.aws.pinpoint-email.send-email-request/content] :opt-un [:portkey.aws.pinpoint-email.send-email-request/from-email-address :portkey.aws.pinpoint-email.send-email-request/reply-to-addresses :portkey.aws.pinpoint-email.send-email-request/feedback-forwarding-email-address :portkey.aws.pinpoint-email.send-email-request/email-tags :portkey.aws.pinpoint-email/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.raw-message/data (clojure.spec.alpha/and :portkey.aws.pinpoint-email/raw-message-data))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/raw-message (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.raw-message/data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-email-identity-mail-from-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-email-identity-mail-from-attributes-request/email-identity (clojure.spec.alpha/and :portkey.aws.pinpoint-email/identity))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-email-identity-mail-from-attributes-request/mail-from-domain (clojure.spec.alpha/and :portkey.aws.pinpoint-email/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-email-identity-mail-from-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.put-email-identity-mail-from-attributes-request/email-identity] :opt-un [:portkey.aws.pinpoint-email.put-email-identity-mail-from-attributes-request/mail-from-domain :portkey.aws.pinpoint-email/behavior-on-mx-failure]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/domain-isp-placements (clojure.spec.alpha/coll-of :portkey.aws.pinpoint-email/domain-isp-placement))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/message-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/sending-paused-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-dedicated-ip-warmup-attributes-request/warmup-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage-100-wrapper))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-dedicated-ip-warmup-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/ip :portkey.aws.pinpoint-email.put-dedicated-ip-warmup-attributes-request/warmup-percentage] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.placement-statistics/inbox-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.placement-statistics/spam-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.placement-statistics/missing-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.placement-statistics/spf-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.placement-statistics/dkim-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/placement-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.placement-statistics/inbox-percentage :portkey.aws.pinpoint-email.placement-statistics/spam-percentage :portkey.aws.pinpoint-email.placement-statistics/missing-percentage :portkey.aws.pinpoint-email.placement-statistics/spf-percentage :portkey.aws.pinpoint-email.placement-statistics/dkim-percentage]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-deliverability-test-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/report-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/isp-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.put-account-sending-attributes-request/sending-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/put-account-sending-attributes-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.put-account-sending-attributes-request/sending-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/email-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/report-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.dedicated-ip/warmup-percentage (clojure.spec.alpha/and :portkey.aws.pinpoint-email/percentage-100-wrapper))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/dedicated-ip (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/ip :portkey.aws.pinpoint-email/warmup-status :portkey.aws.pinpoint-email.dedicated-ip/warmup-percentage] :opt-un [:portkey.aws.pinpoint-email/pool-name]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/max-24-hour-send clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.sending-options/sending-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/sending-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email.sending-options/sending-enabled]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-deliverability-test-report-response/overall-placement (clojure.spec.alpha/and :portkey.aws.pinpoint-email/placement-statistics))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-deliverability-test-report-response/message (clojure.spec.alpha/and :portkey.aws.pinpoint-email/message-content))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-deliverability-test-report-response (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/deliverability-test-report :portkey.aws.pinpoint-email.get-deliverability-test-report-response/overall-placement :portkey.aws.pinpoint-email/isp-placements] :opt-un [:portkey.aws.pinpoint-email.get-deliverability-test-report-response/message]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.create-email-identity-response/verified-for-sending-status (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/create-email-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pinpoint-email/identity-type :portkey.aws.pinpoint-email.create-email-identity-response/verified-for-sending-status :portkey.aws.pinpoint-email/dkim-attributes]))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email.get-deliverability-dashboard-options-response/dashboard-enabled (clojure.spec.alpha/and :portkey.aws.pinpoint-email/enabled))
(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-deliverability-dashboard-options-response (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email.get-deliverability-dashboard-options-response/dashboard-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/mail-from-domain-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint-email/get-blacklist-reports-response (clojure.spec.alpha/keys :req-un [:portkey.aws.pinpoint-email/blacklist-report] :opt-un []))

(clojure.core/defn put-dedicated-ip-in-pool "Move a dedicated IP address to an existing dedicated IP pool.\n The dedicated IP address that you specify must already exist, and must be\nassociated with your Amazon Pinpoint account.\n The dedicated IP pool you specify must already exist. You can create a new pool\nby using the CreateDedicatedIpPool operation." ([put-dedicated-ip-in-pool-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-dedicated-ip-in-pool-request put-dedicated-ip-in-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-dedicated-ip-in-pool-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/dedicated-ips/{IP}/pool", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-dedicated-ip-in-pool-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutDedicatedIpInPool", :http.request.configuration/output-deser-fn response-put-dedicated-ip-in-pool-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-dedicated-ip-in-pool :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-dedicated-ip-in-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-dedicated-ip-in-pool-response))

(clojure.core/defn put-account-sending-attributes "Enable or disable the ability of your account to send email." ([] (put-account-sending-attributes {})) ([put-account-sending-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-account-sending-attributes-request put-account-sending-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-account-sending-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/account/sending", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-account-sending-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAccountSendingAttributes", :http.request.configuration/output-deser-fn response-put-account-sending-attributes-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-account-sending-attributes :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/put-account-sending-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-account-sending-attributes-response))

(clojure.core/defn put-email-identity-dkim-attributes "Used to enable or disable DKIM authentication for an email identity." ([put-email-identity-dkim-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-email-identity-dkim-attributes-request put-email-identity-dkim-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-email-identity-dkim-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/identities/{EmailIdentity}/dkim", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-email-identity-dkim-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEmailIdentityDkimAttributes", :http.request.configuration/output-deser-fn response-put-email-identity-dkim-attributes-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-email-identity-dkim-attributes :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-email-identity-dkim-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-email-identity-dkim-attributes-response))

(clojure.core/defn put-deliverability-dashboard-option "Enable or disable the Deliverability dashboard. When you enable the\nDeliverability dashboard, you gain access to reputation metrics for the domains\nthat you use to send email using Amazon Pinpoint. You also gain the ability to\nperform predictive inbox placement tests.\n When you use the Deliverability dashboard, you pay a monthly charge of\nUSD$1,250.00, in addition to any other fees that you accrue by using Amazon\nPinpoint. If you enable the Deliverability dashboard after the first day of a\ncalendar month, we prorate the monthly charge based on how many days have\nelapsed in the current calendar month." ([put-deliverability-dashboard-option-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-deliverability-dashboard-option-request put-deliverability-dashboard-option-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-deliverability-dashboard-option-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/deliverability-dashboard", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-deliverability-dashboard-option-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutDeliverabilityDashboardOption", :http.request.configuration/output-deser-fn response-put-deliverability-dashboard-option-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.pinpoint-email/already-exists-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-deliverability-dashboard-option :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-deliverability-dashboard-option-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-deliverability-dashboard-option-response))

(clojure.core/defn get-configuration-set-event-destinations "Retrieve a list of event destinations that are associated with a configuration\nset.\n In Amazon Pinpoint, events include message sends, deliveries, opens, clicks,\nbounces, and complaints. Event destinations are places that you can send\ninformation about these events to. For example, you can send event data to\nAmazon SNS to receive notifications when you receive bounces or complaints, or\nyou can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for\nlong-term storage." ([get-configuration-set-event-destinations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-configuration-set-event-destinations-request get-configuration-set-event-destinations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-configuration-set-event-destinations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/event-destinations", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-configuration-set-event-destinations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConfigurationSetEventDestinations", :http.request.configuration/output-deser-fn response-get-configuration-set-event-destinations-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-configuration-set-event-destinations :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/get-configuration-set-event-destinations-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-configuration-set-event-destinations-response))

(clojure.core/defn put-configuration-set-tracking-options "Specify a custom domain to use for open and click tracking elements in email\nthat you send using Amazon Pinpoint." ([put-configuration-set-tracking-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-configuration-set-tracking-options-request put-configuration-set-tracking-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-configuration-set-tracking-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/tracking-options", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-configuration-set-tracking-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutConfigurationSetTrackingOptions", :http.request.configuration/output-deser-fn response-put-configuration-set-tracking-options-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-configuration-set-tracking-options-response))

(clojure.core/defn delete-configuration-set "Delete an existing configuration set.\n In Amazon Pinpoint, configuration sets are groups of rules that you can apply\nto the emails you send. You apply a configuration set to an email by including a\nreference to the configuration set in the headers of the email. When you apply a\nconfiguration set to an email, all of the rules in that configuration set are\napplied to the email." ([delete-configuration-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-configuration-set-request delete-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/delete-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/delete-configuration-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConfigurationSet", :http.request.configuration/output-deser-fn response-delete-configuration-set-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/delete-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/delete-configuration-set-response))

(clojure.core/defn list-deliverability-test-reports "Show a list of the predictive inbox placement tests that you've performed,\nregardless of their statuses. For predictive inbox placement tests that are\ncomplete, you can use the GetDeliverabilityTestReport operation to view the\nresults." ([] (list-deliverability-test-reports {})) ([list-deliverability-test-reports-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-deliverability-test-reports-request list-deliverability-test-reports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/list-deliverability-test-reports-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/deliverability-dashboard/test-reports", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/list-deliverability-test-reports-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeliverabilityTestReports", :http.request.configuration/output-deser-fn response-list-deliverability-test-reports-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-deliverability-test-reports :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/list-deliverability-test-reports-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/list-deliverability-test-reports-response))

(clojure.core/defn put-configuration-set-delivery-options "Associate a configuration set with a dedicated IP pool. You can use dedicated IP\npools to create groups of dedicated IP addresses for sending specific types of\nemail." ([put-configuration-set-delivery-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-configuration-set-delivery-options-request put-configuration-set-delivery-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-configuration-set-delivery-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/delivery-options", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-configuration-set-delivery-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutConfigurationSetDeliveryOptions", :http.request.configuration/output-deser-fn response-put-configuration-set-delivery-options-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-configuration-set-delivery-options :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-configuration-set-delivery-options-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-configuration-set-delivery-options-response))

(clojure.core/defn list-configuration-sets "List all of the configuration sets associated with your Amazon Pinpoint account\nin the current region.\n In Amazon Pinpoint, configuration sets are groups of rules that you can apply\nto the emails you send. You apply a configuration set to an email by including a\nreference to the configuration set in the headers of the email. When you apply a\nconfiguration set to an email, all of the rules in that configuration set are\napplied to the email." ([] (list-configuration-sets {})) ([list-configuration-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-configuration-sets-request list-configuration-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/list-configuration-sets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/list-configuration-sets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConfigurationSets", :http.request.configuration/output-deser-fn response-list-configuration-sets-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-configuration-sets :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/list-configuration-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/list-configuration-sets-response))

(clojure.core/defn put-dedicated-ip-warmup-attributes "" ([put-dedicated-ip-warmup-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-dedicated-ip-warmup-attributes-request put-dedicated-ip-warmup-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-dedicated-ip-warmup-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/dedicated-ips/{IP}/warmup", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-dedicated-ip-warmup-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutDedicatedIpWarmupAttributes", :http.request.configuration/output-deser-fn response-put-dedicated-ip-warmup-attributes-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-dedicated-ip-warmup-attributes :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-dedicated-ip-warmup-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-dedicated-ip-warmup-attributes-response))

(clojure.core/defn list-dedicated-ip-pools "List all of the dedicated IP pools that exist in your Amazon Pinpoint account in\nthe current AWS Region." ([] (list-dedicated-ip-pools {})) ([list-dedicated-ip-pools-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-dedicated-ip-pools-request list-dedicated-ip-pools-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/list-dedicated-ip-pools-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/dedicated-ip-pools", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/list-dedicated-ip-pools-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDedicatedIpPools", :http.request.configuration/output-deser-fn response-list-dedicated-ip-pools-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-dedicated-ip-pools :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/list-dedicated-ip-pools-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/list-dedicated-ip-pools-response))

(clojure.core/defn put-configuration-set-sending-options "Enable or disable email sending for messages that use a particular configuration\nset in a specific AWS Region." ([put-configuration-set-sending-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-configuration-set-sending-options-request put-configuration-set-sending-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-configuration-set-sending-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/sending", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-configuration-set-sending-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutConfigurationSetSendingOptions", :http.request.configuration/output-deser-fn response-put-configuration-set-sending-options-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-configuration-set-sending-options :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-configuration-set-sending-options-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-configuration-set-sending-options-response))

(clojure.core/defn put-account-dedicated-ip-warmup-attributes "Enable or disable the automatic warm-up feature for dedicated IP addresses." ([] (put-account-dedicated-ip-warmup-attributes {})) ([put-account-dedicated-ip-warmup-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-account-dedicated-ip-warmup-attributes-request put-account-dedicated-ip-warmup-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-account-dedicated-ip-warmup-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/account/dedicated-ips/warmup", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-account-dedicated-ip-warmup-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAccountDedicatedIpWarmupAttributes", :http.request.configuration/output-deser-fn response-put-account-dedicated-ip-warmup-attributes-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-account-dedicated-ip-warmup-attributes :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/put-account-dedicated-ip-warmup-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-account-dedicated-ip-warmup-attributes-response))

(clojure.core/defn get-domain-statistics-report "Retrieve inbox placement and engagement rates for the domains that you use to\nsend email." ([get-domain-statistics-report-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-domain-statistics-report-request get-domain-statistics-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-domain-statistics-report-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/deliverability-dashboard/statistics-report/{Domain}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-domain-statistics-report-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDomainStatisticsReport", :http.request.configuration/output-deser-fn response-get-domain-statistics-report-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-domain-statistics-report :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/get-domain-statistics-report-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-domain-statistics-report-response))

(clojure.core/defn create-dedicated-ip-pool "Create a new pool of dedicated IP addresses. A pool can include one or more\ndedicated IP addresses that are associated with your Amazon Pinpoint account.\nYou can associate a pool with a configuration set. When you send an email that\nuses that configuration set, Amazon Pinpoint sends it using only the IP\naddresses in the associated pool." ([create-dedicated-ip-pool-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-dedicated-ip-pool-request create-dedicated-ip-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/create-dedicated-ip-pool-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/dedicated-ip-pools", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/create-dedicated-ip-pool-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDedicatedIpPool", :http.request.configuration/output-deser-fn response-create-dedicated-ip-pool-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.pinpoint-email/already-exists-exception, "LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef create-dedicated-ip-pool :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/create-dedicated-ip-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/create-dedicated-ip-pool-response))

(clojure.core/defn create-configuration-set "Create a configuration set. Configuration sets are groups of rules that you can\napply to the emails you send using Amazon Pinpoint. You apply a configuration\nset to an email by including a reference to the configuration set in the headers\nof the email. When you apply a configuration set to an email, all of the rules\nin that configuration set are applied to the email." ([] (create-configuration-set {})) ([create-configuration-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-configuration-set-request create-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/create-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/create-configuration-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConfigurationSet", :http.request.configuration/output-deser-fn response-create-configuration-set-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.pinpoint-email/already-exists-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/create-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/create-configuration-set-response))

(clojure.core/defn send-email "Sends an email message. You can use the Amazon Pinpoint Email API to send two\ntypes of messages:\n * Simple – A standard email message. When you create this type of message, you\nspecify the sender, the recipient, and the message body, and Amazon Pinpoint\nassembles the message for you.\n * Raw – A raw, MIME-formatted email message. When you send this type of email,\nyou have to specify all of the message headers, as well as the message body. You\ncan use this message type to send messages that contain attachments. The message\nthat you specify has to be a valid MIME message." ([send-email-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-email-request send-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/send-email-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/outbound-emails", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/send-email-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SendEmail", :http.request.configuration/output-deser-fn response-send-email-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "AccountSuspendedException" :portkey.aws.pinpoint-email/account-suspended-exception, "SendingPausedException" :portkey.aws.pinpoint-email/sending-paused-exception, "MessageRejected" :portkey.aws.pinpoint-email/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.pinpoint-email/mail-from-domain-not-verified-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef send-email :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/send-email-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/send-email-response))

(clojure.core/defn delete-configuration-set-event-destination "Delete an event destination.\n In Amazon Pinpoint, events include message sends, deliveries, opens, clicks,\nbounces, and complaints. Event destinations are places that you can send\ninformation about these events to. For example, you can send event data to\nAmazon SNS to receive notifications when you receive bounces or complaints, or\nyou can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for\nlong-term storage." ([delete-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-configuration-set-event-destination-request delete-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/delete-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/event-destinations/{EventDestinationName}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/delete-configuration-set-event-destination-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-delete-configuration-set-event-destination-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/delete-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/delete-configuration-set-event-destination-response))

(clojure.core/defn put-configuration-set-reputation-options "Enable or disable collection of reputation metrics for emails that you send\nusing a particular configuration set in a specific AWS Region." ([put-configuration-set-reputation-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-configuration-set-reputation-options-request put-configuration-set-reputation-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-configuration-set-reputation-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/reputation-options", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-configuration-set-reputation-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutConfigurationSetReputationOptions", :http.request.configuration/output-deser-fn response-put-configuration-set-reputation-options-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-configuration-set-reputation-options :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-configuration-set-reputation-options-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-configuration-set-reputation-options-response))

(clojure.core/defn get-email-identity "Provides information about a specific identity associated with your Amazon\nPinpoint account, including the identity's verification status, its DKIM\nauthentication status, and its custom Mail-From settings." ([get-email-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-email-identity-request get-email-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-email-identity-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/identities/{EmailIdentity}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-email-identity-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEmailIdentity", :http.request.configuration/output-deser-fn response-get-email-identity-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-email-identity :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/get-email-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-email-identity-response))

(clojure.core/defn get-blacklist-reports "Retrieve a list of the blacklists that your dedicated IP addresses appear on." ([get-blacklist-reports-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-blacklist-reports-request get-blacklist-reports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-blacklist-reports-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/deliverability-dashboard/blacklist-report", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-blacklist-reports-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBlacklistReports", :http.request.configuration/output-deser-fn response-get-blacklist-reports-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-blacklist-reports :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/get-blacklist-reports-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-blacklist-reports-response))

(clojure.core/defn get-configuration-set "Get information about an existing configuration set, including the dedicated IP\npool that it's associated with, whether or not it's enabled for sending email,\nand more.\n In Amazon Pinpoint, configuration sets are groups of rules that you can apply\nto the emails you send. You apply a configuration set to an email by including a\nreference to the configuration set in the headers of the email. When you apply a\nconfiguration set to an email, all of the rules in that configuration set are\napplied to the email." ([get-configuration-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-configuration-set-request get-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-configuration-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConfigurationSet", :http.request.configuration/output-deser-fn response-get-configuration-set-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/get-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-configuration-set-response))

(clojure.core/defn put-email-identity-feedback-attributes "Used to enable or disable feedback forwarding for an identity. This setting\ndetermines what happens when an identity is used to send an email that results\nin a bounce or complaint event.\n When you enable feedback forwarding, Amazon Pinpoint sends you email\nnotifications when bounce or complaint events occur. Amazon Pinpoint sends this\nnotification to the address that you specified in the Return-Path header of the\noriginal email.\n When you disable feedback forwarding, Amazon Pinpoint sends notifications\nthrough other mechanisms, such as by notifying an Amazon SNS topic. You're\nrequired to have a method of tracking bounces and complaints. If you haven't set\nup another mechanism for receiving bounce or complaint notifications, Amazon\nPinpoint sends an email notification when these events occur (even if this\nsetting is disabled)." ([put-email-identity-feedback-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-email-identity-feedback-attributes-request put-email-identity-feedback-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-email-identity-feedback-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/identities/{EmailIdentity}/feedback", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-email-identity-feedback-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEmailIdentityFeedbackAttributes", :http.request.configuration/output-deser-fn response-put-email-identity-feedback-attributes-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-email-identity-feedback-attributes :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-email-identity-feedback-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-email-identity-feedback-attributes-response))

(clojure.core/defn update-configuration-set-event-destination "Update the configuration of an event destination for a configuration set.\n In Amazon Pinpoint, events include message sends, deliveries, opens, clicks,\nbounces, and complaints. Event destinations are places that you can send\ninformation about these events to. For example, you can send event data to\nAmazon SNS to receive notifications when you receive bounces or complaints, or\nyou can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for\nlong-term storage." ([update-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-configuration-set-event-destination-request update-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/update-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/event-destinations/{EventDestinationName}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/update-configuration-set-event-destination-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-update-configuration-set-event-destination-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/update-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/update-configuration-set-event-destination-response))

(clojure.core/defn get-account "Obtain information about the email-sending status and capabilities of your\nAmazon Pinpoint account in the current AWS Region." ([] (get-account {})) ([get-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-account-request get-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/account", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccount", :http.request.configuration/output-deser-fn response-get-account-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-account :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/get-account-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-account-response))

(clojure.core/defn delete-email-identity "Deletes an email identity that you previously verified for use with Amazon\nPinpoint. An identity can be either an email address or a domain name." ([delete-email-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-email-identity-request delete-email-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/delete-email-identity-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/identities/{EmailIdentity}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/delete-email-identity-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEmailIdentity", :http.request.configuration/output-deser-fn response-delete-email-identity-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-email-identity :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/delete-email-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/delete-email-identity-response))

(clojure.core/defn delete-dedicated-ip-pool "Delete a dedicated IP pool." ([delete-dedicated-ip-pool-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-dedicated-ip-pool-request delete-dedicated-ip-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/delete-dedicated-ip-pool-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/dedicated-ip-pools/{PoolName}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/delete-dedicated-ip-pool-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDedicatedIpPool", :http.request.configuration/output-deser-fn response-delete-dedicated-ip-pool-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-dedicated-ip-pool :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/delete-dedicated-ip-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/delete-dedicated-ip-pool-response))

(clojure.core/defn put-email-identity-mail-from-attributes "Used to enable or disable the custom Mail-From domain configuration for an email\nidentity." ([put-email-identity-mail-from-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-email-identity-mail-from-attributes-request put-email-identity-mail-from-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/put-email-identity-mail-from-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/identities/{EmailIdentity}/mail-from", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/put-email-identity-mail-from-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEmailIdentityMailFromAttributes", :http.request.configuration/output-deser-fn response-put-email-identity-mail-from-attributes-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef put-email-identity-mail-from-attributes :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/put-email-identity-mail-from-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/put-email-identity-mail-from-attributes-response))

(clojure.core/defn get-deliverability-test-report "Retrieve the results of a predictive inbox placement test." ([get-deliverability-test-report-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-deliverability-test-report-request get-deliverability-test-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-deliverability-test-report-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/deliverability-dashboard/test-reports/{ReportId}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-deliverability-test-report-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeliverabilityTestReport", :http.request.configuration/output-deser-fn response-get-deliverability-test-report-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-deliverability-test-report :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/get-deliverability-test-report-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-deliverability-test-report-response))

(clojure.core/defn list-email-identities "Returns a list of all of the email identities that are associated with your\nAmazon Pinpoint account. An identity can be either an email address or a domain.\nThis operation returns identities that are verified as well as those that\naren't." ([] (list-email-identities {})) ([list-email-identities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-email-identities-request list-email-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/list-email-identities-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/identities", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/list-email-identities-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEmailIdentities", :http.request.configuration/output-deser-fn response-list-email-identities-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-email-identities :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/list-email-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/list-email-identities-response))

(clojure.core/defn create-configuration-set-event-destination "Create an event destination. In Amazon Pinpoint, events include message sends,\ndeliveries, opens, clicks, bounces, and complaints. Event destinations are\nplaces that you can send information about these events to. For example, you can\nsend event data to Amazon SNS to receive notifications when you receive bounces\nor complaints, or you can use Amazon Kinesis Data Firehose to stream data to\nAmazon S3 for long-term storage.\n A single configuration set can include more than one event destination." ([create-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-configuration-set-event-destination-request create-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/create-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/configuration-sets/{ConfigurationSetName}/event-destinations", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/create-configuration-set-event-destination-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-create-configuration-set-event-destination-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "AlreadyExistsException" :portkey.aws.pinpoint-email/already-exists-exception, "LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/create-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/create-configuration-set-event-destination-response))

(clojure.core/defn get-deliverability-dashboard-options "Show the status of the Deliverability dashboard. When the Deliverability\ndashboard is enabled, you gain access to reputation metrics for the domains that\nyou use to send email using Amazon Pinpoint. You also gain the ability to\nperform predictive inbox placement tests.\n When you use the Deliverability dashboard, you pay a monthly charge of\nUSD$1,250.00, in addition to any other fees that you accrue by using Amazon\nPinpoint. If you enable the Deliverability dashboard after the first day of a\ncalendar month, AWS prorates the monthly charge based on how many days have\nelapsed in the current calendar month." ([] (get-deliverability-dashboard-options {})) ([get-deliverability-dashboard-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-deliverability-dashboard-options-request get-deliverability-dashboard-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-deliverability-dashboard-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/deliverability-dashboard", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-deliverability-dashboard-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeliverabilityDashboardOptions", :http.request.configuration/output-deser-fn response-get-deliverability-dashboard-options-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-deliverability-dashboard-options :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/get-deliverability-dashboard-options-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-deliverability-dashboard-options-response))

(clojure.core/defn get-dedicated-ips "List the dedicated IP addresses that are associated with your Amazon Pinpoint\naccount." ([] (get-dedicated-ips {})) ([get-dedicated-ips-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-dedicated-ips-request get-dedicated-ips-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-dedicated-ips-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/dedicated-ips", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-dedicated-ips-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDedicatedIps", :http.request.configuration/output-deser-fn response-get-dedicated-ips-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-dedicated-ips :args (clojure.spec.alpha/? :portkey.aws.pinpoint-email/get-dedicated-ips-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-dedicated-ips-response))

(clojure.core/defn create-deliverability-test-report "Create a new predictive inbox placement test. Predictive inbox placement tests\ncan help you predict how your messages will be handled by various email\nproviders around the world. When you perform a predictive inbox placement test,\nyou provide a sample message that contains the content that you plan to send to\nyour customers. Amazon Pinpoint then sends that message to special email\naddresses spread across several major email providers. After about 24 hours, the\ntest is complete, and you can use the GetDeliverabilityTestReport operation to\nview the results of the test." ([create-deliverability-test-report-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-deliverability-test-report-request create-deliverability-test-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/create-deliverability-test-report-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/deliverability-dashboard/test", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/create-deliverability-test-report-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDeliverabilityTestReport", :http.request.configuration/output-deser-fn response-create-deliverability-test-report-response, :http.request.spec/error-spec {"AccountSuspendedException" :portkey.aws.pinpoint-email/account-suspended-exception, "SendingPausedException" :portkey.aws.pinpoint-email/sending-paused-exception, "MessageRejected" :portkey.aws.pinpoint-email/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.pinpoint-email/mail-from-domain-not-verified-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef create-deliverability-test-report :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/create-deliverability-test-report-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/create-deliverability-test-report-response))

(clojure.core/defn get-dedicated-ip "Get information about a dedicated IP address, including the name of the\ndedicated IP pool that it's associated with, as well information about the\nautomatic warm-up process for the address." ([get-dedicated-ip-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-dedicated-ip-request get-dedicated-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/get-dedicated-ip-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/dedicated-ips/{IP}", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/get-dedicated-ip-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDedicatedIp", :http.request.configuration/output-deser-fn response-get-dedicated-ip-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "NotFoundException" :portkey.aws.pinpoint-email/not-found-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-dedicated-ip :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/get-dedicated-ip-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/get-dedicated-ip-response))

(clojure.core/defn create-email-identity "Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an\nidentity is an email address or domain that you use when you send email. Before\nyou can use an identity to send email with Amazon Pinpoint, you first have to\nverify it. By verifying an address, you demonstrate that you're the owner of the\naddress, and that you've given Amazon Pinpoint permission to send email from the\naddress.\n When you verify an email address, Amazon Pinpoint sends an email to the\naddress. Your email address is verified as soon as you follow the link in the\nverification email.\n When you verify a domain, this operation provides a set of DKIM tokens, which\nyou can convert into CNAME tokens. You add these CNAME tokens to the DNS\nconfiguration for your domain. Your domain is verified when Amazon Pinpoint\ndetects these records in the DNS configuration for your domain. It usually takes\naround 72 hours to complete the domain verification process." ([create-email-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-email-identity-request create-email-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pinpoint-email/endpoints, :http.request.configuration/target-prefix "com.amazonaws.services.pinpoint.email", :http.request.spec/output-spec :portkey.aws.pinpoint-email/create-email-identity-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/email/identities", :http.request.configuration/version "2018-07-26", :http.request.configuration/service-id "Pinpoint Email", :http.request.spec/input-spec :portkey.aws.pinpoint-email/create-email-identity-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEmailIdentity", :http.request.configuration/output-deser-fn response-create-email-identity-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.pinpoint-email/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.pinpoint-email/too-many-requests-exception, "BadRequestException" :portkey.aws.pinpoint-email/bad-request-exception}})))))
(clojure.spec.alpha/fdef create-email-identity :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint-email/create-email-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint-email/create-email-identity-response))
