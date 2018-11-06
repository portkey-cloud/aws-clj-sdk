(ns portkey.aws.email.-2010-12-01 (:require [portkey.aws]))

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

(clojure.core/declare ser-address)

(clojure.core/declare ser-event-destination)

(clojure.core/declare ser-tracking-options)

(clojure.core/declare ser-dimension-value-source)

(clojure.core/declare ser-configuration-set-attribute)

(clojure.core/declare ser-receipt-rule-name)

(clojure.core/declare ser-bounce-action)

(clojure.core/declare ser-cidr)

(clojure.core/declare ser-message-data)

(clojure.core/declare ser-behavior-on-mx-failure)

(clojure.core/declare ser-dsn-action)

(clojure.core/declare ser-message-dsn)

(clojure.core/declare ser-cloud-watch-dimension-configuration)

(clojure.core/declare ser-bulk-email-destination)

(clojure.core/declare ser-template-content)

(clojure.core/declare ser-receipt-filter)

(clojure.core/declare ser-message-id)

(clojure.core/declare ser-add-header-action)

(clojure.core/declare ser-header-name)

(clojure.core/declare ser-extension-field-name)

(clojure.core/declare ser-cloud-watch-destination)

(clojure.core/declare ser-configuration-set)

(clojure.core/declare ser-policy-name)

(clojure.core/declare ser-identity-list)

(clojure.core/declare ser-receipt-action)

(clojure.core/declare ser-body)

(clojure.core/declare ser-workmail-action)

(clojure.core/declare ser-amazon-resource-name)

(clojure.core/declare ser-arrival-date)

(clojure.core/declare ser-bulk-email-destination-list)

(clojure.core/declare ser-default-dimension-value)

(clojure.core/declare ser-stop-scope)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-s-3-bucket-name)

(clojure.core/declare ser-template)

(clojure.core/declare ser-raw-message-data)

(clojure.core/declare ser-configuration-set-name)

(clojure.core/declare ser-notification-type)

(clojure.core/declare ser-bounce-type)

(clojure.core/declare ser-bounced-recipient-info)

(clojure.core/declare ser-extension-field-value)

(clojure.core/declare ser-custom-redirect-domain)

(clojure.core/declare ser-html-part)

(clojure.core/declare ser-enabled)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-dsn-status)

(clojure.core/declare ser-address-list)

(clojure.core/declare ser-configuration-set-attribute-list)

(clojure.core/declare ser-recipient-dsn-fields)

(clojure.core/declare ser-header-value)

(clojure.core/declare ser-sns-action-encoding)

(clojure.core/declare ser-domain)

(clojure.core/declare ser-sns-action)

(clojure.core/declare ser-message-tag)

(clojure.core/declare ser-reporting-mta)

(clojure.core/declare ser-receipt-filter-name)

(clojure.core/declare ser-message-tag-name)

(clojure.core/declare ser-text-part)

(clojure.core/declare ser-subject)

(clojure.core/declare ser-event-destination-name)

(clojure.core/declare ser-tls-policy)

(clojure.core/declare ser-recipient)

(clojure.core/declare ser-message)

(clojure.core/declare ser-invocation-type)

(clojure.core/declare ser-last-attempt-date)

(clojure.core/declare ser-receipt-rule)

(clojure.core/declare ser-message-tag-value)

(clojure.core/declare ser-content)

(clojure.core/declare ser-identity-type)

(clojure.core/declare ser-bounce-message)

(clojure.core/declare ser-explanation)

(clojure.core/declare ser-extension-field-list)

(clojure.core/declare ser-identity)

(clojure.core/declare ser-max-items)

(clojure.core/declare ser-s-3-key-prefix)

(clojure.core/declare ser-template-name)

(clojure.core/declare ser-kinesis-firehose-destination)

(clojure.core/declare ser-message-tag-list)

(clojure.core/declare ser-bounced-recipient-info-list)

(clojure.core/declare ser-notification-topic)

(clojure.core/declare ser-cloud-watch-dimension-configurations)

(clojure.core/declare ser-event-types)

(clojure.core/declare ser-from-address)

(clojure.core/declare ser-receipt-actions-list)

(clojure.core/declare ser-charset)

(clojure.core/declare ser-success-redirection-url)

(clojure.core/declare ser-policy)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-sns-destination)

(clojure.core/declare ser-bounce-status-code)

(clojure.core/declare ser-failure-redirection-url)

(clojure.core/declare ser-raw-message)

(clojure.core/declare ser-extension-field)

(clojure.core/declare ser-receipt-filter-policy)

(clojure.core/declare ser-stop-action)

(clojure.core/declare ser-template-data)

(clojure.core/declare ser-lambda-action)

(clojure.core/declare ser-receipt-ip-filter)

(clojure.core/declare ser-recipients-list)

(clojure.core/declare ser-remote-mta)

(clojure.core/declare ser-diagnostic-code)

(clojure.core/declare ser-receipt-rule-names-list)

(clojure.core/declare ser-s-3-action)

(clojure.core/declare ser-policy-name-list)

(clojure.core/declare ser-subject-part)

(clojure.core/declare ser-bounce-smtp-reply-code)

(clojure.core/declare ser-receipt-rule-set-name)

(clojure.core/declare ser-mail-from-domain-name)

(clojure.core/defn- ser-dimension-name [input] #:http.request.field{:value input, :shape "DimensionName"})

(clojure.core/defn- ser-address [input] #:http.request.field{:value input, :shape "Address"})

(clojure.core/defn- ser-event-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-event-destination-name (:name input)) #:http.request.field{:name "Name", :shape "EventDestinationName"}) (clojure.core/into (ser-event-types (:matching-event-types input)) #:http.request.field{:name "MatchingEventTypes", :shape "EventTypes"})], :shape "EventDestination", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :kinesis-firehose-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-destination (input :kinesis-firehose-destination)) #:http.request.field{:name "KinesisFirehoseDestination", :shape "KinesisFirehoseDestination"})) (clojure.core/contains? input :cloud-watch-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-destination (input :cloud-watch-destination)) #:http.request.field{:name "CloudWatchDestination", :shape "CloudWatchDestination"})) (clojure.core/contains? input :sns-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-destination (input :sns-destination)) #:http.request.field{:name "SNSDestination", :shape "SNSDestination"}))))

(clojure.core/defn- ser-tracking-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TrackingOptions", :type "structure"} (clojure.core/contains? input :custom-redirect-domain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-redirect-domain (input :custom-redirect-domain)) #:http.request.field{:name "CustomRedirectDomain", :shape "CustomRedirectDomain"}))))

(clojure.core/defn- ser-dimension-value-source [input] #:http.request.field{:value (clojure.core/get {"messageTag" "messageTag", :message-tag "messageTag", "emailHeader" "emailHeader", :email-header "emailHeader", "linkTag" "linkTag", :link-tag "linkTag"} input), :shape "DimensionValueSource"})

(clojure.core/defn- ser-configuration-set-attribute [input] #:http.request.field{:value (clojure.core/get {"eventDestinations" "eventDestinations", :event-destinations "eventDestinations", "trackingOptions" "trackingOptions", :tracking-options "trackingOptions", "reputationOptions" "reputationOptions", :reputation-options "reputationOptions"} input), :shape "ConfigurationSetAttribute"})

(clojure.core/defn- ser-receipt-rule-name [input] #:http.request.field{:value input, :shape "ReceiptRuleName"})

(clojure.core/defn- ser-bounce-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bounce-smtp-reply-code (:smtp-reply-code input)) #:http.request.field{:name "SmtpReplyCode", :shape "BounceSmtpReplyCode"}) (clojure.core/into (ser-bounce-message (:message input)) #:http.request.field{:name "Message", :shape "BounceMessage"}) (clojure.core/into (ser-address (:sender input)) #:http.request.field{:name "Sender", :shape "Address"})], :shape "BounceAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :status-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bounce-status-code (input :status-code)) #:http.request.field{:name "StatusCode", :shape "BounceStatusCode"}))))

(clojure.core/defn- ser-cidr [input] #:http.request.field{:value input, :shape "Cidr"})

(clojure.core/defn- ser-message-data [input] #:http.request.field{:value input, :shape "MessageData"})

(clojure.core/defn- ser-behavior-on-mx-failure [input] #:http.request.field{:value (clojure.core/get {"UseDefaultValue" "UseDefaultValue", :use-default-value "UseDefaultValue", "RejectMessage" "RejectMessage", :reject-message "RejectMessage"} input), :shape "BehaviorOnMXFailure"})

(clojure.core/defn- ser-dsn-action [input] #:http.request.field{:value (clojure.core/get {"relayed" "relayed", :delayed "delayed", "delayed" "delayed", "failed" "failed", "delivered" "delivered", :delivered "delivered", :relayed "relayed", :expanded "expanded", "expanded" "expanded", :failed "failed"} input), :shape "DsnAction"})

(clojure.core/defn- ser-message-dsn [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-reporting-mta (:reporting-mta input)) #:http.request.field{:name "ReportingMta", :shape "ReportingMta"})], :shape "MessageDsn", :type "structure"} (clojure.core/contains? input :arrival-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arrival-date (input :arrival-date)) #:http.request.field{:name "ArrivalDate", :shape "ArrivalDate"})) (clojure.core/contains? input :extension-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extension-field-list (input :extension-fields)) #:http.request.field{:name "ExtensionFields", :shape "ExtensionFieldList"}))))

(clojure.core/defn- ser-cloud-watch-dimension-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dimension-name (:dimension-name input)) #:http.request.field{:name "DimensionName", :shape "DimensionName"}) (clojure.core/into (ser-dimension-value-source (:dimension-value-source input)) #:http.request.field{:name "DimensionValueSource", :shape "DimensionValueSource"}) (clojure.core/into (ser-default-dimension-value (:default-dimension-value input)) #:http.request.field{:name "DefaultDimensionValue", :shape "DefaultDimensionValue"})], :shape "CloudWatchDimensionConfiguration", :type "structure"}))

(clojure.core/defn- ser-bulk-email-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-destination (:destination input)) #:http.request.field{:name "Destination", :shape "Destination"})], :shape "BulkEmailDestination", :type "structure"} (clojure.core/contains? input :replacement-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :replacement-tags)) #:http.request.field{:name "ReplacementTags", :shape "MessageTagList"})) (clojure.core/contains? input :replacement-template-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-data (input :replacement-template-data)) #:http.request.field{:name "ReplacementTemplateData", :shape "TemplateData"}))))

(clojure.core/defn- ser-template-content [input] #:http.request.field{:value input, :shape "TemplateContent"})

(clojure.core/defn- ser-receipt-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-receipt-filter-name (:name input)) #:http.request.field{:name "Name", :shape "ReceiptFilterName"}) (clojure.core/into (ser-receipt-ip-filter (:ip-filter input)) #:http.request.field{:name "IpFilter", :shape "ReceiptIpFilter"})], :shape "ReceiptFilter", :type "structure"}))

(clojure.core/defn- ser-message-id [input] #:http.request.field{:value input, :shape "MessageId"})

(clojure.core/defn- ser-add-header-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-header-name (:header-name input)) #:http.request.field{:name "HeaderName", :shape "HeaderName"}) (clojure.core/into (ser-header-value (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "HeaderValue"})], :shape "AddHeaderAction", :type "structure"}))

(clojure.core/defn- ser-header-name [input] #:http.request.field{:value input, :shape "HeaderName"})

(clojure.core/defn- ser-extension-field-name [input] #:http.request.field{:value input, :shape "ExtensionFieldName"})

(clojure.core/defn- ser-cloud-watch-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cloud-watch-dimension-configurations (:dimension-configurations input)) #:http.request.field{:name "DimensionConfigurations", :shape "CloudWatchDimensionConfigurations"})], :shape "CloudWatchDestination", :type "structure"}))

(clojure.core/defn- ser-configuration-set [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-set-name (:name input)) #:http.request.field{:name "Name", :shape "ConfigurationSetName"})], :shape "ConfigurationSet", :type "structure"}))

(clojure.core/defn- ser-policy-name [input] #:http.request.field{:value input, :shape "PolicyName"})

(clojure.core/defn- ser-identity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-identity coll) #:http.request.field{:shape "Identity"}))) input), :shape "IdentityList", :type "list"})

(clojure.core/defn- ser-receipt-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ReceiptAction", :type "structure"} (clojure.core/contains? input :s-3-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-action (input :s-3-action)) #:http.request.field{:name "S3Action", :shape "S3Action"})) (clojure.core/contains? input :bounce-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bounce-action (input :bounce-action)) #:http.request.field{:name "BounceAction", :shape "BounceAction"})) (clojure.core/contains? input :workmail-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workmail-action (input :workmail-action)) #:http.request.field{:name "WorkmailAction", :shape "WorkmailAction"})) (clojure.core/contains? input :lambda-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-action (input :lambda-action)) #:http.request.field{:name "LambdaAction", :shape "LambdaAction"})) (clojure.core/contains? input :stop-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stop-action (input :stop-action)) #:http.request.field{:name "StopAction", :shape "StopAction"})) (clojure.core/contains? input :add-header-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-header-action (input :add-header-action)) #:http.request.field{:name "AddHeaderAction", :shape "AddHeaderAction"})) (clojure.core/contains? input :sns-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-action (input :sns-action)) #:http.request.field{:name "SNSAction", :shape "SNSAction"}))))

(clojure.core/defn- ser-body [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Body", :type "structure"} (clojure.core/contains? input :text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content (input :text)) #:http.request.field{:name "Text", :shape "Content"})) (clojure.core/contains? input :html) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content (input :html)) #:http.request.field{:name "Html", :shape "Content"}))))

(clojure.core/defn- ser-workmail-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:organization-arn input)) #:http.request.field{:name "OrganizationArn", :shape "AmazonResourceName"})], :shape "WorkmailAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-amazon-resource-name [input] #:http.request.field{:value input, :shape "AmazonResourceName"})

(clojure.core/defn- ser-arrival-date [input] #:http.request.field{:value input, :shape "ArrivalDate"})

(clojure.core/defn- ser-bulk-email-destination-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-bulk-email-destination coll) #:http.request.field{:shape "BulkEmailDestination"}))) input), :shape "BulkEmailDestinationList", :type "list"})

(clojure.core/defn- ser-default-dimension-value [input] #:http.request.field{:value input, :shape "DefaultDimensionValue"})

(clojure.core/defn- ser-stop-scope [input] #:http.request.field{:value (clojure.core/get {"RuleSet" "RuleSet", :rule-set "RuleSet"} input), :shape "StopScope"})

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Destination", :type "structure"} (clojure.core/contains? input :to-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :to-addresses)) #:http.request.field{:name "ToAddresses", :shape "AddressList"})) (clojure.core/contains? input :cc-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :cc-addresses)) #:http.request.field{:name "CcAddresses", :shape "AddressList"})) (clojure.core/contains? input :bcc-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :bcc-addresses)) #:http.request.field{:name "BccAddresses", :shape "AddressList"}))))

(clojure.core/defn- ser-s-3-bucket-name [input] #:http.request.field{:value input, :shape "S3BucketName"})

(clojure.core/defn- ser-template [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-template-name (:template-name input)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})], :shape "Template", :type "structure"} (clojure.core/contains? input :subject-part) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subject-part (input :subject-part)) #:http.request.field{:name "SubjectPart", :shape "SubjectPart"})) (clojure.core/contains? input :text-part) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-part (input :text-part)) #:http.request.field{:name "TextPart", :shape "TextPart"})) (clojure.core/contains? input :html-part) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-html-part (input :html-part)) #:http.request.field{:name "HtmlPart", :shape "HtmlPart"}))))

(clojure.core/defn- ser-raw-message-data [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "RawMessageData"})

(clojure.core/defn- ser-configuration-set-name [input] #:http.request.field{:value input, :shape "ConfigurationSetName"})

(clojure.core/defn- ser-notification-type [input] #:http.request.field{:value (clojure.core/get {"Bounce" "Bounce", :bounce "Bounce", "Complaint" "Complaint", :complaint "Complaint", "Delivery" "Delivery", :delivery "Delivery"} input), :shape "NotificationType"})

(clojure.core/defn- ser-bounce-type [input] #:http.request.field{:value (clojure.core/get {"Undefined" "Undefined", "ExceededQuota" "ExceededQuota", :exceeded-quota "ExceededQuota", "ContentRejected" "ContentRejected", "DoesNotExist" "DoesNotExist", "TemporaryFailure" "TemporaryFailure", "MessageTooLarge" "MessageTooLarge", :undefined "Undefined", :message-too-large "MessageTooLarge", :does-not-exist "DoesNotExist", :temporary-failure "TemporaryFailure", :content-rejected "ContentRejected"} input), :shape "BounceType"})

(clojure.core/defn- ser-bounced-recipient-info [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-address (:recipient input)) #:http.request.field{:name "Recipient", :shape "Address"})], :shape "BouncedRecipientInfo", :type "structure"} (clojure.core/contains? input :recipient-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :recipient-arn)) #:http.request.field{:name "RecipientArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :bounce-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bounce-type (input :bounce-type)) #:http.request.field{:name "BounceType", :shape "BounceType"})) (clojure.core/contains? input :recipient-dsn-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recipient-dsn-fields (input :recipient-dsn-fields)) #:http.request.field{:name "RecipientDsnFields", :shape "RecipientDsnFields"}))))

(clojure.core/defn- ser-extension-field-value [input] #:http.request.field{:value input, :shape "ExtensionFieldValue"})

(clojure.core/defn- ser-custom-redirect-domain [input] #:http.request.field{:value input, :shape "CustomRedirectDomain"})

(clojure.core/defn- ser-html-part [input] #:http.request.field{:value input, :shape "HtmlPart"})

(clojure.core/defn- ser-enabled [input] #:http.request.field{:value input, :shape "Enabled"})

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {:open "open", "send" "send", "delivery" "delivery", :complaint "complaint", :delivery "delivery", "click" "click", "renderingFailure" "renderingFailure", :bounce "bounce", :click "click", "complaint" "complaint", "bounce" "bounce", :send "send", :reject "reject", "reject" "reject", "open" "open", :rendering-failure "renderingFailure"} input), :shape "EventType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-dsn-status [input] #:http.request.field{:value input, :shape "DsnStatus"})

(clojure.core/defn- ser-address-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-address coll) #:http.request.field{:shape "Address"}))) input), :shape "AddressList", :type "list"})

(clojure.core/defn- ser-configuration-set-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configuration-set-attribute coll) #:http.request.field{:shape "ConfigurationSetAttribute"}))) input), :shape "ConfigurationSetAttributeList", :type "list"})

(clojure.core/defn- ser-recipient-dsn-fields [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dsn-action (:action input)) #:http.request.field{:name "Action", :shape "DsnAction"}) (clojure.core/into (ser-dsn-status (:status input)) #:http.request.field{:name "Status", :shape "DsnStatus"})], :shape "RecipientDsnFields", :type "structure"} (clojure.core/contains? input :final-recipient) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :final-recipient)) #:http.request.field{:name "FinalRecipient", :shape "Address"})) (clojure.core/contains? input :remote-mta) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-mta (input :remote-mta)) #:http.request.field{:name "RemoteMta", :shape "RemoteMta"})) (clojure.core/contains? input :diagnostic-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-diagnostic-code (input :diagnostic-code)) #:http.request.field{:name "DiagnosticCode", :shape "DiagnosticCode"})) (clojure.core/contains? input :last-attempt-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-attempt-date (input :last-attempt-date)) #:http.request.field{:name "LastAttemptDate", :shape "LastAttemptDate"})) (clojure.core/contains? input :extension-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extension-field-list (input :extension-fields)) #:http.request.field{:name "ExtensionFields", :shape "ExtensionFieldList"}))))

(clojure.core/defn- ser-header-value [input] #:http.request.field{:value input, :shape "HeaderValue"})

(clojure.core/defn- ser-sns-action-encoding [input] #:http.request.field{:value (clojure.core/get {"UTF-8" "UTF-8", :utf-8 "UTF-8", "Base64" "Base64", :base-64 "Base64"} input), :shape "SNSActionEncoding"})

(clojure.core/defn- ser-domain [input] #:http.request.field{:value input, :shape "Domain"})

(clojure.core/defn- ser-sns-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:topic-arn input)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})], :shape "SNSAction", :type "structure"} (clojure.core/contains? input :encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-action-encoding (input :encoding)) #:http.request.field{:name "Encoding", :shape "SNSActionEncoding"}))))

(clojure.core/defn- ser-message-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-tag-name (:name input)) #:http.request.field{:name "Name", :shape "MessageTagName"}) (clojure.core/into (ser-message-tag-value (:value input)) #:http.request.field{:name "Value", :shape "MessageTagValue"})], :shape "MessageTag", :type "structure"}))

(clojure.core/defn- ser-reporting-mta [input] #:http.request.field{:value input, :shape "ReportingMta"})

(clojure.core/defn- ser-receipt-filter-name [input] #:http.request.field{:value input, :shape "ReceiptFilterName"})

(clojure.core/defn- ser-message-tag-name [input] #:http.request.field{:value input, :shape "MessageTagName"})

(clojure.core/defn- ser-text-part [input] #:http.request.field{:value input, :shape "TextPart"})

(clojure.core/defn- ser-subject [input] #:http.request.field{:value input, :shape "Subject"})

(clojure.core/defn- ser-event-destination-name [input] #:http.request.field{:value input, :shape "EventDestinationName"})

(clojure.core/defn- ser-tls-policy [input] #:http.request.field{:value (clojure.core/get {"Require" "Require", :require "Require", "Optional" "Optional", :optional "Optional"} input), :shape "TlsPolicy"})

(clojure.core/defn- ser-recipient [input] #:http.request.field{:value input, :shape "Recipient"})

(clojure.core/defn- ser-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-content (:subject input)) #:http.request.field{:name "Subject", :shape "Content"}) (clojure.core/into (ser-body (:body input)) #:http.request.field{:name "Body", :shape "Body"})], :shape "Message", :type "structure"}))

(clojure.core/defn- ser-invocation-type [input] #:http.request.field{:value (clojure.core/get {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse"} input), :shape "InvocationType"})

(clojure.core/defn- ser-last-attempt-date [input] #:http.request.field{:value input, :shape "LastAttemptDate"})

(clojure.core/defn- ser-receipt-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-receipt-rule-name (:name input)) #:http.request.field{:name "Name", :shape "ReceiptRuleName"})], :shape "ReceiptRule", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :tls-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tls-policy (input :tls-policy)) #:http.request.field{:name "TlsPolicy", :shape "TlsPolicy"})) (clojure.core/contains? input :recipients) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recipients-list (input :recipients)) #:http.request.field{:name "Recipients", :shape "RecipientsList"})) (clojure.core/contains? input :actions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-actions-list (input :actions)) #:http.request.field{:name "Actions", :shape "ReceiptActionsList"})) (clojure.core/contains? input :scan-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :scan-enabled)) #:http.request.field{:name "ScanEnabled", :shape "Enabled"}))))

(clojure.core/defn- ser-message-tag-value [input] #:http.request.field{:value input, :shape "MessageTagValue"})

(clojure.core/defn- ser-content [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-data (:data input)) #:http.request.field{:name "Data", :shape "MessageData"})], :shape "Content", :type "structure"} (clojure.core/contains? input :charset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-charset (input :charset)) #:http.request.field{:name "Charset", :shape "Charset"}))))

(clojure.core/defn- ser-identity-type [input] #:http.request.field{:value (clojure.core/get {"EmailAddress" "EmailAddress", :email-address "EmailAddress", "Domain" "Domain", :domain "Domain"} input), :shape "IdentityType"})

(clojure.core/defn- ser-bounce-message [input] #:http.request.field{:value input, :shape "BounceMessage"})

(clojure.core/defn- ser-explanation [input] #:http.request.field{:value input, :shape "Explanation"})

(clojure.core/defn- ser-extension-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-extension-field coll) #:http.request.field{:shape "ExtensionField"}))) input), :shape "ExtensionFieldList", :type "list"})

(clojure.core/defn- ser-identity [input] #:http.request.field{:value input, :shape "Identity"})

(clojure.core/defn- ser-max-items [input] #:http.request.field{:value input, :shape "MaxItems"})

(clojure.core/defn- ser-s-3-key-prefix [input] #:http.request.field{:value input, :shape "S3KeyPrefix"})

(clojure.core/defn- ser-template-name [input] #:http.request.field{:value input, :shape "TemplateName"})

(clojure.core/defn- ser-kinesis-firehose-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:iam-role-arn input)) #:http.request.field{:name "IAMRoleARN", :shape "AmazonResourceName"}) (clojure.core/into (ser-amazon-resource-name (:delivery-stream-arn input)) #:http.request.field{:name "DeliveryStreamARN", :shape "AmazonResourceName"})], :shape "KinesisFirehoseDestination", :type "structure"}))

(clojure.core/defn- ser-message-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message-tag coll) #:http.request.field{:shape "MessageTag"}))) input), :shape "MessageTagList", :type "list"})

(clojure.core/defn- ser-bounced-recipient-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-bounced-recipient-info coll) #:http.request.field{:shape "BouncedRecipientInfo"}))) input), :shape "BouncedRecipientInfoList", :type "list"})

(clojure.core/defn- ser-notification-topic [input] #:http.request.field{:value input, :shape "NotificationTopic"})

(clojure.core/defn- ser-cloud-watch-dimension-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-dimension-configuration coll) #:http.request.field{:shape "CloudWatchDimensionConfiguration"}))) input), :shape "CloudWatchDimensionConfigurations", :type "list"})

(clojure.core/defn- ser-event-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-type coll) #:http.request.field{:shape "EventType"}))) input), :shape "EventTypes", :type "list"})

(clojure.core/defn- ser-from-address [input] #:http.request.field{:value input, :shape "FromAddress"})

(clojure.core/defn- ser-receipt-actions-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-receipt-action coll) #:http.request.field{:shape "ReceiptAction"}))) input), :shape "ReceiptActionsList", :type "list"})

(clojure.core/defn- ser-charset [input] #:http.request.field{:value input, :shape "Charset"})

(clojure.core/defn- ser-success-redirection-url [input] #:http.request.field{:value input, :shape "SuccessRedirectionURL"})

(clojure.core/defn- ser-policy [input] #:http.request.field{:value input, :shape "Policy"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-sns-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:topic-arn input)) #:http.request.field{:name "TopicARN", :shape "AmazonResourceName"})], :shape "SNSDestination", :type "structure"}))

(clojure.core/defn- ser-bounce-status-code [input] #:http.request.field{:value input, :shape "BounceStatusCode"})

(clojure.core/defn- ser-failure-redirection-url [input] #:http.request.field{:value input, :shape "FailureRedirectionURL"})

(clojure.core/defn- ser-raw-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-raw-message-data (:data input)) #:http.request.field{:name "Data", :shape "RawMessageData"})], :shape "RawMessage", :type "structure"}))

(clojure.core/defn- ser-extension-field [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-extension-field-name (:name input)) #:http.request.field{:name "Name", :shape "ExtensionFieldName"}) (clojure.core/into (ser-extension-field-value (:value input)) #:http.request.field{:name "Value", :shape "ExtensionFieldValue"})], :shape "ExtensionField", :type "structure"}))

(clojure.core/defn- ser-receipt-filter-policy [input] #:http.request.field{:value (clojure.core/get {"Block" "Block", :block "Block", "Allow" "Allow", :allow "Allow"} input), :shape "ReceiptFilterPolicy"})

(clojure.core/defn- ser-stop-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-stop-scope (:scope input)) #:http.request.field{:name "Scope", :shape "StopScope"})], :shape "StopAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-template-data [input] #:http.request.field{:value input, :shape "TemplateData"})

(clojure.core/defn- ser-lambda-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:function-arn input)) #:http.request.field{:name "FunctionArn", :shape "AmazonResourceName"})], :shape "LambdaAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :invocation-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-invocation-type (input :invocation-type)) #:http.request.field{:name "InvocationType", :shape "InvocationType"}))))

(clojure.core/defn- ser-receipt-ip-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-receipt-filter-policy (:policy input)) #:http.request.field{:name "Policy", :shape "ReceiptFilterPolicy"}) (clojure.core/into (ser-cidr (:cidr input)) #:http.request.field{:name "Cidr", :shape "Cidr"})], :shape "ReceiptIpFilter", :type "structure"}))

(clojure.core/defn- ser-recipients-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-recipient coll) #:http.request.field{:shape "Recipient"}))) input), :shape "RecipientsList", :type "list"})

(clojure.core/defn- ser-remote-mta [input] #:http.request.field{:value input, :shape "RemoteMta"})

(clojure.core/defn- ser-diagnostic-code [input] #:http.request.field{:value input, :shape "DiagnosticCode"})

(clojure.core/defn- ser-receipt-rule-names-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-receipt-rule-name coll) #:http.request.field{:shape "ReceiptRuleName"}))) input), :shape "ReceiptRuleNamesList", :type "list"})

(clojure.core/defn- ser-s-3-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-bucket-name (:bucket-name input)) #:http.request.field{:name "BucketName", :shape "S3BucketName"})], :shape "S3Action", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :object-key-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :object-key-prefix)) #:http.request.field{:name "ObjectKeyPrefix", :shape "S3KeyPrefix"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :kms-key-arn)) #:http.request.field{:name "KmsKeyArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-policy-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-name coll) #:http.request.field{:shape "PolicyName"}))) input), :shape "PolicyNameList", :type "list"})

(clojure.core/defn- ser-subject-part [input] #:http.request.field{:value input, :shape "SubjectPart"})

(clojure.core/defn- ser-bounce-smtp-reply-code [input] #:http.request.field{:value input, :shape "BounceSmtpReplyCode"})

(clojure.core/defn- ser-receipt-rule-set-name [input] #:http.request.field{:value input, :shape "ReceiptRuleSetName"})

(clojure.core/defn- ser-mail-from-domain-name [input] #:http.request.field{:value input, :shape "MailFromDomainName"})

(clojure.core/defn- req-create-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"}) (clojure.core/into (ser-from-address (input :from-email-address)) #:http.request.field{:name "FromEmailAddress", :shape "FromAddress"}) (clojure.core/into (ser-subject (input :template-subject)) #:http.request.field{:name "TemplateSubject", :shape "Subject"}) (clojure.core/into (ser-template-content (input :template-content)) #:http.request.field{:name "TemplateContent", :shape "TemplateContent"}) (clojure.core/into (ser-success-redirection-url (input :success-redirection-url)) #:http.request.field{:name "SuccessRedirectionURL", :shape "SuccessRedirectionURL"}) (clojure.core/into (ser-failure-redirection-url (input :failure-redirection-url)) #:http.request.field{:name "FailureRedirectionURL", :shape "FailureRedirectionURL"})]}))

(clojure.core/defn- req-update-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]} (clojure.core/contains? input :from-email-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-from-address (input :from-email-address)) #:http.request.field{:name "FromEmailAddress", :shape "FromAddress"})) (clojure.core/contains? input :template-subject) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subject (input :template-subject)) #:http.request.field{:name "TemplateSubject", :shape "Subject"})) (clojure.core/contains? input :template-content) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-content (input :template-content)) #:http.request.field{:name "TemplateContent", :shape "TemplateContent"})) (clojure.core/contains? input :success-redirection-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-success-redirection-url (input :success-redirection-url)) #:http.request.field{:name "SuccessRedirectionURL", :shape "SuccessRedirectionURL"})) (clojure.core/contains? input :failure-redirection-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-redirection-url (input :failure-redirection-url)) #:http.request.field{:name "FailureRedirectionURL", :shape "FailureRedirectionURL"}))))

(clojure.core/defn- req-list-receipt-rule-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-send-bulk-templated-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"}) (clojure.core/into (ser-template-name (input :template)) #:http.request.field{:name "Template", :shape "TemplateName"}) (clojure.core/into (ser-bulk-email-destination-list (input :destinations)) #:http.request.field{:name "Destinations", :shape "BulkEmailDestinationList"})]} (clojure.core/contains? input :default-template-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-data (input :default-template-data)) #:http.request.field{:name "DefaultTemplateData", :shape "TemplateData"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :return-path)) #:http.request.field{:name "ReturnPath", :shape "Address"})) (clojure.core/contains? input :template-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :template-arn)) #:http.request.field{:name "TemplateArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :default-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :default-tags)) #:http.request.field{:name "DefaultTags", :shape "MessageTagList"})) (clojure.core/contains? input :reply-to-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :reply-to-addresses)) #:http.request.field{:name "ReplyToAddresses", :shape "AddressList"}))))

(clojure.core/defn- req-send-custom-verification-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"}) (clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]} (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}))))

(clojure.core/defn- req-create-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template (input :template)) #:http.request.field{:name "Template", :shape "Template"})]}))

(clojure.core/defn- req-set-identity-mail-from-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"})]} (clojure.core/contains? input :mail-from-domain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mail-from-domain-name (input :mail-from-domain)) #:http.request.field{:name "MailFromDomain", :shape "MailFromDomainName"})) (clojure.core/contains? input :behavior-on-mx-failure) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-behavior-on-mx-failure (input :behavior-on-mx-failure)) #:http.request.field{:name "BehaviorOnMXFailure", :shape "BehaviorOnMXFailure"}))))

(clojure.core/defn- req-put-identity-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"}) (clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})]}))

(clojure.core/defn- req-delete-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-describe-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "ReceiptRuleName"})]}))

(clojure.core/defn- req-get-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-create-receipt-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-filter (input :filter)) #:http.request.field{:name "Filter", :shape "ReceiptFilter"})]}))

(clojure.core/defn- req-list-identity-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"})]}))

(clojure.core/defn- req-get-identity-notification-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-verify-email-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"})]}))

(clojure.core/defn- req-set-identity-headers-in-notifications-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-notification-type (input :notification-type)) #:http.request.field{:name "NotificationType", :shape "NotificationType"}) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})]}))

(clojure.core/defn- req-create-configuration-set-tracking-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-tracking-options (input :tracking-options)) #:http.request.field{:name "TrackingOptions", :shape "TrackingOptions"})]}))

(clojure.core/defn- req-send-templated-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"}) (clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "Destination", :shape "Destination"}) (clojure.core/into (ser-template-name (input :template)) #:http.request.field{:name "Template", :shape "TemplateName"}) (clojure.core/into (ser-template-data (input :template-data)) #:http.request.field{:name "TemplateData", :shape "TemplateData"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "MessageTagList"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :return-path)) #:http.request.field{:name "ReturnPath", :shape "Address"})) (clojure.core/contains? input :template-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :template-arn)) #:http.request.field{:name "TemplateArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :reply-to-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :reply-to-addresses)) #:http.request.field{:name "ReplyToAddresses", :shape "AddressList"}))))

(clojure.core/defn- req-send-raw-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-raw-message (input :raw-message)) #:http.request.field{:name "RawMessage", :shape "RawMessage"})]} (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"})) (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :destinations)) #:http.request.field{:name "Destinations", :shape "AddressList"})) (clojure.core/contains? input :from-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :from-arn)) #:http.request.field{:name "FromArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "MessageTagList"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}))))

(clojure.core/defn- req-update-configuration-set-sending-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})]}))

(clojure.core/defn- req-set-identity-feedback-forwarding-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-enabled (input :forwarding-enabled)) #:http.request.field{:name "ForwardingEnabled", :shape "Enabled"})]}))

(clojure.core/defn- req-delete-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-event-destination-name (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "EventDestinationName"})]}))

(clojure.core/defn- req-list-receipt-filters-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-identity-verification-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-describe-active-receipt-rule-set-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})]} (clojure.core/contains? input :configuration-set-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-attribute-list (input :configuration-set-attribute-names)) #:http.request.field{:name "ConfigurationSetAttributeNames", :shape "ConfigurationSetAttributeList"}))))

(clojure.core/defn- req-update-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template (input :template)) #:http.request.field{:name "Template", :shape "Template"})]}))

(clojure.core/defn- req-describe-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-get-identity-dkim-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-delete-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})]}))

(clojure.core/defn- req-update-account-sending-enabled-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"}))))

(clojure.core/defn- req-list-custom-verification-email-templates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule (input :rule)) #:http.request.field{:name "Rule", :shape "ReceiptRule"})]} (clojure.core/contains? input :after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-rule-name (input :after)) #:http.request.field{:name "After", :shape "ReceiptRuleName"}))))

(clojure.core/defn- req-list-configuration-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems"}))))

(clojure.core/defn- req-set-receipt-rule-position-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "ReceiptRuleName"})]} (clojure.core/contains? input :after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-rule-name (input :after)) #:http.request.field{:name "After", :shape "ReceiptRuleName"}))))

(clojure.core/defn- req-delete-receipt-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-filter-name (input :filter-name)) #:http.request.field{:name "FilterName", :shape "ReceiptFilterName"})]}))

(clojure.core/defn- req-verify-email-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"})]}))

(clojure.core/defn- req-verify-domain-dkim-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain (input :domain)) #:http.request.field{:name "Domain", :shape "Domain"})]}))

(clojure.core/defn- req-verify-domain-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain (input :domain)) #:http.request.field{:name "Domain", :shape "Domain"})]}))

(clojure.core/defn- req-create-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set (input :configuration-set)) #:http.request.field{:name "ConfigurationSet", :shape "ConfigurationSet"})]}))

(clojure.core/defn- req-delete-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-set-identity-notification-topic-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-notification-type (input :notification-type)) #:http.request.field{:name "NotificationType", :shape "NotificationType"})]} (clojure.core/contains? input :sns-topic) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-topic (input :sns-topic)) #:http.request.field{:name "SnsTopic", :shape "NotificationTopic"}))))

(clojure.core/defn- req-delete-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-update-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-event-destination (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestination"})]}))

(clojure.core/defn- req-create-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-event-destination (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestination"})]}))

(clojure.core/defn- req-get-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-get-identity-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-policy-name-list (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "PolicyNameList"})]}))

(clojure.core/defn- req-reorder-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-names-list (input :rule-names)) #:http.request.field{:name "RuleNames", :shape "ReceiptRuleNamesList"})]}))

(clojure.core/defn- req-clone-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-set-name (input :original-rule-set-name)) #:http.request.field{:name "OriginalRuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-delete-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"})]}))

(clojure.core/defn- req-delete-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "ReceiptRuleName"})]}))

(clojure.core/defn- req-delete-configuration-set-tracking-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})]}))

(clojure.core/defn- req-update-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule (input :rule)) #:http.request.field{:name "Rule", :shape "ReceiptRule"})]}))

(clojure.core/defn- req-create-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-send-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"}) (clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "Destination", :shape "Destination"}) (clojure.core/into (ser-message (input :message)) #:http.request.field{:name "Message", :shape "Message"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "MessageTagList"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :return-path)) #:http.request.field{:name "ReturnPath", :shape "Address"})) (clojure.core/contains? input :reply-to-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :reply-to-addresses)) #:http.request.field{:name "ReplyToAddresses", :shape "AddressList"}))))

(clojure.core/defn- req-list-templates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems"}))))

(clojure.core/defn- req-update-configuration-set-tracking-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-tracking-options (input :tracking-options)) #:http.request.field{:name "TrackingOptions", :shape "TrackingOptions"})]}))

(clojure.core/defn- req-delete-identity-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"})]}))

(clojure.core/defn- req-delete-verified-email-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"})]}))

(clojure.core/defn- req-test-render-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"}) (clojure.core/into (ser-template-data (input :template-data)) #:http.request.field{:name "TemplateData", :shape "TemplateData"})]}))

(clojure.core/defn- req-set-active-receipt-rule-set-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :rule-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}))))

(clojure.core/defn- req-update-configuration-set-reputation-metrics-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})]}))

(clojure.core/defn- req-list-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :identity-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-type (input :identity-type)) #:http.request.field{:name "IdentityType", :shape "IdentityType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems"}))))

(clojure.core/defn- req-set-identity-dkim-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-enabled (input :dkim-enabled)) #:http.request.field{:name "DkimEnabled", :shape "Enabled"})]}))

(clojure.core/defn- req-get-identity-mail-from-domain-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-send-bounce-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-message-id (input :original-message-id)) #:http.request.field{:name "OriginalMessageId", :shape "MessageId"}) (clojure.core/into (ser-address (input :bounce-sender)) #:http.request.field{:name "BounceSender", :shape "Address"}) (clojure.core/into (ser-bounced-recipient-info-list (input :bounced-recipient-info-list)) #:http.request.field{:name "BouncedRecipientInfoList", :shape "BouncedRecipientInfoList"})]} (clojure.core/contains? input :explanation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-explanation (input :explanation)) #:http.request.field{:name "Explanation", :shape "Explanation"})) (clojure.core/contains? input :message-dsn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-dsn (input :message-dsn)) #:http.request.field{:name "MessageDsn", :shape "MessageDsn"})) (clojure.core/contains? input :bounce-sender-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :bounce-sender-arn)) #:http.request.field{:name "BounceSenderArn", :shape "AmazonResourceName"}))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/counter clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tracking-options-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/delivery-attempts (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/bounces (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/complaints (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/rejects (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-data-point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/timestamp :portkey.aws.email.-2010-12-01.send-data-point/delivery-attempts :portkey.aws.email.-2010-12-01.send-data-point/bounces :portkey.aws.email.-2010-12-01.send-data-point/complaints :portkey.aws.email.-2010-12-01.send-data-point/rejects]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.event-destination/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/event-destination-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.event-destination/matching-event-types (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/event-types))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.event-destination/name :portkey.aws.email.-2010-12-01.event-destination/matching-event-types] :opt-un [:portkey.aws.email.-2010-12-01/enabled :portkey.aws.email.-2010-12-01/kinesis-firehose-destination :portkey.aws.email.-2010-12-01/cloud-watch-destination :portkey.aws.email.-2010-12-01/sns-destination]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/from-email-address :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/template-subject :portkey.aws.email.-2010-12-01/template-content :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sent-last-24-hours clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-template-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un [:portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/from-email-address :portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/template-subject :portkey.aws.email.-2010-12-01/template-content :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tracking-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/custom-redirect-domain]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dimension-value-source #{"linkTag" :link-tag :email-header :message-tag "emailHeader" "messageTag"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-attribute #{"trackingOptions" :reputation-options "eventDestinations" :event-destinations :tracking-options "reputationOptions"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/custom-verification-email-templates :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/smtp-reply-code (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bounce-smtp-reply-code))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/status-code (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bounce-status-code))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/message (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bounce-message))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/sender (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.bounce-action/smtp-reply-code :portkey.aws.email.-2010-12-01.bounce-action/message :portkey.aws.email.-2010-12-01.bounce-action/sender] :opt-un [:portkey.aws.email.-2010-12-01.bounce-action/topic-arn :portkey.aws.email.-2010-12-01.bounce-action/status-code]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.already-exists-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.already-exists-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-template-data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/destinations (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bulk-email-destination-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bulk-templated-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/destinations] :opt-un [:portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-template-data :portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source-arn :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template-arn :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-tags :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/reply-to-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-templated-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/message-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cidr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/behavior-on-mx-failure #{:reject-message "UseDefaultValue" "RejectMessage" :use-default-value})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template-does-not-exist-exception/custom-verification-email-template-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.custom-verification-email-template-does-not-exist-exception/custom-verification-email-template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template-already-exists-exception/custom-verification-email-template-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-template-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.custom-verification-email-template-already-exists-exception/custom-verification-email-template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-tracking-options-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dsn-action #{"relayed" :delayed "delayed" "failed" "delivered" :delivered :relayed :expanded "expanded" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message-dsn/extension-fields (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-dsn (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/reporting-mta] :opt-un [:portkey.aws.email.-2010-12-01/arrival-date :portkey.aws.email.-2010-12-01.message-dsn/extension-fields]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/dimension-name :portkey.aws.email.-2010-12-01/dimension-value-source :portkey.aws.email.-2010-12-01/default-dimension-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-custom-verification-email-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-custom-verification-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-custom-verification-email-request/email-address :portkey.aws.email.-2010-12-01/template-name] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-template-data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/destination] :opt-un [:portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-tags :portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-template-data]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-receipt-rule-sets-response/rule-sets (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-sets-lists))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-receipt-rule-sets-response/rule-sets :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-filter/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-filter/ip-filter (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-ip-filter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.receipt-filter/name :portkey.aws.email.-2010-12-01.receipt-filter/ip-filter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-sns-destination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-mail-from-domain-request/mail-from-domain (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity] :opt-un [:portkey.aws.email.-2010-12-01.set-identity-mail-from-domain-request/mail-from-domain :portkey.aws.email.-2010-12-01/behavior-on-mx-failure]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-send-rate clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/put-identity-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/policy-name :portkey.aws.email.-2010-12-01/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-identity-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/policy-name-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identity-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.list-identity-policies-response/policy-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/add-header-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/header-name :portkey.aws.email.-2010-12-01/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy-map (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/policy-name :portkey.aws.email.-2010-12-01/policy))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.invalid-s-3-configuration-exception/bucket (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-s-3-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.invalid-s-3-configuration-exception/bucket]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/header-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.cloud-watch-destination/dimension-configurations (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configurations))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cloud-watch-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.cloud-watch-destination/dimension-configurations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-policies-response/policies (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/policy-map))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-policies-response/policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.configuration-set/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/configuration-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.configuration-set/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/identity))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-send-statistics-response/send-data-points (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-data-point-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-send-statistics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.get-send-statistics-response/send-data-points]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/s-3-action :portkey.aws.email.-2010-12-01/bounce-action :portkey.aws.email.-2010-12-01/workmail-action :portkey.aws.email.-2010-12-01/lambda-action :portkey.aws.email.-2010-12-01/stop-action :portkey.aws.email.-2010-12-01/add-header-action :portkey.aws.email.-2010-12-01/sns-action]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.body/text (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/content))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.body/html (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/content))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.body/text :portkey.aws.email.-2010-12-01.body/html]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.workmail-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.workmail-action/organization-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/workmail-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.workmail-action/organization-arn] :opt-un [:portkey.aws.email.-2010-12-01.workmail-action/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-identity-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/verification-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/amazon-resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-verification-status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verification-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-tokens (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verification-token-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-dkim-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-enabled :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-verification-status] :opt-un [:portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-tokens]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.invalid-sns-topic-exception/topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-sns-topic-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.invalid-sns-topic-exception/topic]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-templates-response/templates-metadata (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-metadata-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-templates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-templates-response/templates-metadata :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/arrival-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/bulk-email-destination))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/template-metadata))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-configuration-set-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-filter-request/filter (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.create-receipt-filter-request/filter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rendered-template (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/default-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/stop-scope #{"RuleSet" :rule-set})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-verification-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identity-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.destination/to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.destination/cc-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.destination/bcc-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.destination/to-addresses :portkey.aws.email.-2010-12-01.destination/cc-addresses :portkey.aws.email.-2010-12-01.destination/bcc-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-notification-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-notification-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/s-3-bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un [:portkey.aws.email.-2010-12-01/subject-part :portkey.aws.email.-2010-12-01/text-part :portkey.aws.email.-2010-12-01/html-part]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/put-identity-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.verify-email-identity-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-email-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.verify-email-identity-request/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.template-metadata/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.template-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.template-metadata/name :portkey.aws.email.-2010-12-01.template-metadata/created-timestamp]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.verify-domain-dkim-response/dkim-tokens (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verification-token-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-dkim-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.verify-domain-dkim-response/dkim-tokens] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/raw-message-data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/message-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/notification-type :portkey.aws.email.-2010-12-01/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/notification-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-notification-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-sets (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/configuration-set))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/notification-type #{"Delivery" :complaint :delivery "Complaint" :bounce "Bounce"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/tracking-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-type #{"Undefined" "ExceededQuota" :exceeded-quota "ContentRejected" "DoesNotExist" "TemporaryFailure" "MessageTooLarge" :undefined :message-too-large :does-not-exist :temporary-failure :content-rejected})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/template (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/template-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-templated-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-templated-email-request/source :portkey.aws.email.-2010-12-01/destination :portkey.aws.email.-2010-12-01.send-templated-email-request/template :portkey.aws.email.-2010-12-01/template-data] :opt-un [:portkey.aws.email.-2010-12-01.send-templated-email-request/tags :portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01.send-templated-email-request/source-arn :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path :portkey.aws.email.-2010-12-01.send-templated-email-request/template-arn :portkey.aws.email.-2010-12-01.send-templated-email-request/reply-to-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/destinations (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/from-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-raw-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/raw-message] :opt-un [:portkey.aws.email.-2010-12-01.send-raw-email-request/source :portkey.aws.email.-2010-12-01.send-raw-email-request/destinations :portkey.aws.email.-2010-12-01.send-raw-email-request/from-arn :portkey.aws.email.-2010-12-01.send-raw-email-request/source-arn :portkey.aws.email.-2010-12-01.send-raw-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-raw-email-request/tags :portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounced-recipient-info (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient] :opt-un [:portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient-arn :portkey.aws.email.-2010-12-01/bounce-type :portkey.aws.email.-2010-12-01/recipient-dsn-fields]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/metadata (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/rules (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rules-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/metadata :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/rules]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/test-render-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/rendered-template]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-sending-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-invalid-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-sets-lists (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-configuration-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-sets :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-redirect-domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/html-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dkim-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-dkim-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-feedback-forwarding-enabled-request/forwarding-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01.set-identity-feedback-forwarding-enabled-request/forwarding-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-type #{:open "send" "delivery" :complaint :delivery "click" "renderingFailure" :bounce :click "complaint" "bounce" :send :reject "reject" "open" :rendering-failure})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dsn-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-data-point-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/send-data-point))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/address-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/address))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/configuration-set-attribute))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-rendering-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-filters-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/final-recipient (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/action (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/dsn-action))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/dsn-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/extension-fields (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/recipient-dsn-fields (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.recipient-dsn-fields/action :portkey.aws.email.-2010-12-01.recipient-dsn-fields/status] :opt-un [:portkey.aws.email.-2010-12-01.recipient-dsn-fields/final-recipient :portkey.aws.email.-2010-12-01/remote-mta :portkey.aws.email.-2010-12-01/diagnostic-code :portkey.aws.email.-2010-12-01/last-attempt-date :portkey.aws.email.-2010-12-01.recipient-dsn-fields/extension-fields]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-verification-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-verification-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/header-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-rejected (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sns-action-encoding #{"Base64" :base-64 :utf-8 "UTF-8"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-templates (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/custom-verification-email-template))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.sns-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.sns-action/encoding (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/sns-action-encoding))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sns-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.sns-action/topic-arn] :opt-un [:portkey.aws.email.-2010-12-01.sns-action/encoding]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-verification-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/verification-status] :opt-un [:portkey.aws.email.-2010-12-01/verification-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-configuration-set-request/configuration-set-attribute-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/configuration-set-attribute-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name] :opt-un [:portkey.aws.email.-2010-12-01.describe-configuration-set-request/configuration-set-attribute-names]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message-tag/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message-tag/value (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-value))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.message-tag/name :portkey.aws.email.-2010-12-01.message-tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-send-quota-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/max-24-hour-send :portkey.aws.email.-2010-12-01/max-send-rate :portkey.aws.email.-2010-12-01/sent-last-24-hours]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-account-sending-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reporting-mta (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-firehose-destination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain-status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/custom-mail-from-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-mail-from-domain-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain :portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain-status :portkey.aws.email.-2010-12-01/behavior-on-mx-failure] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bulk-email-destination-status/status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bulk-email-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.bulk-email-destination-status/status :portkey.aws.email.-2010-12-01/error :portkey.aws.email.-2010-12-01/message-id]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-set-request/rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-dkim-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-dkim-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/verification-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/last-fresh-start clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-notification-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-account-sending-enabled-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-results]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/text-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-request/after (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule] :opt-un [:portkey.aws.email.-2010-12-01.create-receipt-rule-request/after]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-configuration-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-items]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bounce-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/message-id]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/after (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-receipt-rule-position-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-set-name :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-name] :opt-un [:portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/after]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-receipt-filter-request/filter-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.verify-email-address-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-email-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.verify-email-address-request/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tls-policy #{:require :optional "Require" "Optional"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/dkim-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/recipient (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message/subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/content))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.message/subject :portkey.aws.email.-2010-12-01/body] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/from-email-address :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/template-subject :portkey.aws.email.-2010-12-01/template-content :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-custom-verification-email-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/message-id]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.rule-does-not-exist-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.rule-does-not-exist-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invocation-type #{"RequestResponse" "Event" :event :request-response})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-dkim-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/mail-from-domain-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-mail-from-domain-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/notification-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/account-sending-paused-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/last-attempt-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/recipients (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/recipients-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/actions (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-actions-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/scan-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.receipt-rule/name] :opt-un [:portkey.aws.email.-2010-12-01/enabled :portkey.aws.email.-2010-12-01/tls-policy :portkey.aws.email.-2010-12-01.receipt-rule/recipients :portkey.aws.email.-2010-12-01.receipt-rule/actions :portkey.aws.email.-2010-12-01.receipt-rule/scan-enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01.custom-verification-email-template/from-email-address :portkey.aws.email.-2010-12-01.custom-verification-email-template/template-subject :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.content/data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/content (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.content/data] :opt-un [:portkey.aws.email.-2010-12-01/charset]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-type #{"Domain" :email-address :domain "EmailAddress"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.invalid-lambda-function-exception/function-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-lambda-function-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.invalid-lambda-function-exception/function-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-receipt-rule-set-request/rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-notification-topic-request/sns-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-notification-topic-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/notification-type] :opt-un [:portkey.aws.email.-2010-12-01.set-identity-notification-topic-request/sns-topic]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-response/status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bulk-email-destination-status-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bulk-templated-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-bulk-templated-email-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reputation-options/sending-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reputation-options/reputation-metrics-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reputation-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.reputation-options/sending-enabled :portkey.aws.email.-2010-12-01.reputation-options/reputation-metrics-enabled :portkey.aws.email.-2010-12-01/last-fresh-start]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-response/rule (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-response/rule]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-cloud-watch-destination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/explanation (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/extension-field))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-items clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/s-3-key-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-policies-request/policy-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/policy-name-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01.get-identity-policies-request/policy-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.kinesis-firehose-destination/iam-role-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.kinesis-firehose-destination/delivery-stream-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/kinesis-firehose-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.kinesis-firehose-destination/iam-role-arn :portkey.aws.email.-2010-12-01.kinesis-firehose-destination/delivery-stream-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-status #{"Failed" "NotStarted" :pending "TemporaryFailure" "Success" :success :temporary-failure :not-started "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-names-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-set-name :portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-identities-response/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identities-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.list-identities-response/identities] :opt-un [:portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-verified-email-addresses-response/verified-email-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-verified-email-addresses-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-verified-email-addresses-response/verified-email-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/original-rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/rule-set-name :portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/original-rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-template-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/message-tag))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounced-recipient-info-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/bounced-recipient-info))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/notification-topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/metadata (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/rules (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rules-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/metadata :portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/rules]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configurations (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configuration))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-types (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/event-type))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-status #{"ConfigurationSetDoesNotExist" "Failed" :invalid-parameter-value "AccountThrottled" "InvalidParameterValue" "ConfigurationSetSendingPaused" :configuration-set-sending-paused :invalid-sending-pool-name "InvalidSendingPoolName" :account-throttled "AccountSuspended" :message-rejected :transient-failure "MessageRejected" "AccountSendingPaused" "AccountDailyQuotaExceeded" "Success" :configuration-set-does-not-exist "MailFromDomainNotVerified" :success :mail-from-domain-not-verified :template-does-not-exist :account-daily-quota-exceeded :account-suspended "TransientFailure" :account-sending-paused "TemplateDoesNotExist" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-receipt-filters-response/filters (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-filters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-receipt-filters-response/filters]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/from-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-actions-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-action))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/production-access-not-granted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/bounce-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/complaint-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/delivery-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/forwarding-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-bounce-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-complaint-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-delivery-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-notification-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.identity-notification-attributes/bounce-topic :portkey.aws.email.-2010-12-01.identity-notification-attributes/complaint-topic :portkey.aws.email.-2010-12-01.identity-notification-attributes/delivery-topic :portkey.aws.email.-2010-12-01.identity-notification-attributes/forwarding-enabled] :opt-un [:portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-bounce-notifications-enabled :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-complaint-notifications-enabled :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-delivery-notifications-enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/charset (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/success-redirection-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__)))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-receipt-rule-position-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/name :portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/created-timestamp]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/error (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.sns-destination/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sns-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.sns-destination/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/missing-rendering-attribute-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rules-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-rule))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-status-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destinations (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/event-destination))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.from-email-address-not-verified-exception/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.from-email-address-not-verified-exception/from-email-address]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.create-receipt-rule-set-request/rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/failure-redirection-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set :portkey.aws.email.-2010-12-01/event-destinations :portkey.aws.email.-2010-12-01/tracking-options :portkey.aws.email.-2010-12-01/reputation-options]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-email-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-email-request/source :portkey.aws.email.-2010-12-01/destination :portkey.aws.email.-2010-12-01/message] :opt-un [:portkey.aws.email.-2010-12-01.send-email-request/tags :portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01.send-email-request/source-arn :portkey.aws.email.-2010-12-01.send-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-email-request/return-path :portkey.aws.email.-2010-12-01.send-email-request/reply-to-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.raw-message/data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/raw-message-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/raw-message (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.raw-message/data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tracking-options-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.extension-field/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.extension-field/value (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-value))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.extension-field/name :portkey.aws.email.-2010-12-01.extension-field/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter-policy #{:block "Allow" "Block" :allow})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-templates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-items]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/tracking-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/mail-from-domain-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.cannot-delete-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cannot-delete-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.cannot-delete-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.stop-action/scope (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/stop-scope))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.stop-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/stop-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.stop-action/scope] :opt-un [:portkey.aws.email.-2010-12-01.stop-action/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-filter))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 262144))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-template-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.lambda-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.lambda-action/function-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/lambda-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.lambda-action/function-arn] :opt-un [:portkey.aws.email.-2010-12-01.lambda-action/topic-arn :portkey.aws.email.-2010-12-01/invocation-type]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-ip-filter/policy (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-policy))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-ip-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.receipt-ip-filter/policy :portkey.aws.email.-2010-12-01/cidr] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-verified-email-address-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-verified-email-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-verified-email-address-request/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/test-render-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01/template-data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/recipients-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/recipient))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/remote-mta (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-active-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.set-active-receipt-rule-set-request/rule-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/diagnostic-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-reputation-metrics-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-names-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-rule-name))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination-status-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/bulk-email-destination-status))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-mail-from-status #{"Failed" :pending "TemporaryFailure" "Success" :success :temporary-failure "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/identity-type :portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-items]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.rule-set-does-not-exist-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.rule-set-does-not-exist-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-template-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/bucket-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/object-key-prefix (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/s-3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/kms-key-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/s-3-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.s-3-action/bucket-name] :opt-un [:portkey.aws.email.-2010-12-01.s-3-action/topic-arn :portkey.aws.email.-2010-12-01.s-3-action/object-key-prefix :portkey.aws.email.-2010-12-01.s-3-action/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-24-hour-send clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy-name-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/policy-name))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-dkim-enabled-request/dkim-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01.set-identity-dkim-enabled-request/dkim-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-mail-from-domain-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-mail-from-domain-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rule-or-rule-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-raw-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/message-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-token-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/verification-token))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/subject-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-smtp-reply-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bounce-request/original-message-id (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-id))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bounce-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-bounce-request/original-message-id :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender :portkey.aws.email.-2010-12-01/bounced-recipient-info-list] :opt-un [:portkey.aws.email.-2010-12-01/explanation :portkey.aws.email.-2010-12-01/message-dsn :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/mail-from-domain-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn update-account-sending-enabled ([] (update-account-sending-enabled {})) ([update-account-sending-enabled-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-account-sending-enabled-request update-account-sending-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-account-sending-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAccountSendingEnabled", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-account-sending-enabled :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/update-account-sending-enabled-request) :ret clojure.core/true?)

(clojure.core/defn delete-verified-email-address ([delete-verified-email-address-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-verified-email-address-request delete-verified-email-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-verified-email-address-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVerifiedEmailAddress", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-verified-email-address :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-verified-email-address-request) :ret clojure.core/true?)

(clojure.core/defn list-verified-email-addresses ([] (list-verified-email-addresses {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-verified-email-addresses-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListVerifiedEmailAddresses", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-verified-email-addresses :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-verified-email-addresses-response))

(clojure.core/defn create-configuration-set-tracking-options ([create-configuration-set-tracking-options-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-configuration-set-tracking-options-request create-configuration-set-tracking-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateConfigurationSetTrackingOptions", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TrackingOptionsAlreadyExistsException" :portkey.aws.email.-2010-12-01/tracking-options-already-exists-exception, "InvalidTrackingOptionsException" :portkey.aws.email.-2010-12-01/invalid-tracking-options-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-response))

(clojure.core/defn set-active-receipt-rule-set ([] (set-active-receipt-rule-set {})) ([set-active-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-active-receipt-rule-set-request set-active-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetActiveReceiptRuleSet", :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef set-active-receipt-rule-set :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-response))

(clojure.core/defn get-identity-mail-from-domain-attributes ([get-identity-mail-from-domain-attributes-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-identity-mail-from-domain-attributes-request get-identity-mail-from-domain-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIdentityMailFromDomainAttributes", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-mail-from-domain-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-response))

(clojure.core/defn send-templated-email ([send-templated-email-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-send-templated-email-request send-templated-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-templated-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-templated-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendTemplatedEmail", :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-templated-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-templated-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-templated-email-response))

(clojure.core/defn delete-configuration-set-tracking-options ([delete-configuration-set-tracking-options-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-configuration-set-tracking-options-request delete-configuration-set-tracking-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConfigurationSetTrackingOptions", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TrackingOptionsDoesNotExistException" :portkey.aws.email.-2010-12-01/tracking-options-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-response))

(clojure.core/defn set-identity-feedback-forwarding-enabled ([set-identity-feedback-forwarding-enabled-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-identity-feedback-forwarding-enabled-request set-identity-feedback-forwarding-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetIdentityFeedbackForwardingEnabled", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-feedback-forwarding-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-response))

(clojure.core/defn verify-email-address ([verify-email-address-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-verify-email-address-request verify-email-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-email-address-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "VerifyEmailAddress", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-email-address :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-email-address-request) :ret clojure.core/true?)

(clojure.core/defn get-identity-verification-attributes ([get-identity-verification-attributes-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-identity-verification-attributes-request get-identity-verification-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIdentityVerificationAttributes", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-verification-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-response))

(clojure.core/defn list-custom-verification-email-templates ([] (list-custom-verification-email-templates {})) ([list-custom-verification-email-templates-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-custom-verification-email-templates-request list-custom-verification-email-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCustomVerificationEmailTemplates", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-custom-verification-email-templates :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-response))

(clojure.core/defn delete-custom-verification-email-template ([delete-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-custom-verification-email-template-request delete-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCustomVerificationEmailTemplate", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn describe-configuration-set ([describe-configuration-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-configuration-set-request describe-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-configuration-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurationSet", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/describe-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-configuration-set-response))

(clojure.core/defn delete-template ([delete-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-template-request delete-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTemplate", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-template-response))

(clojure.core/defn delete-configuration-set ([delete-configuration-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-configuration-set-request delete-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConfigurationSet", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-configuration-set-response))

(clojure.core/defn test-render-template ([test-render-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-test-render-template-request test-render-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/test-render-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/test-render-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TestRenderTemplate", :http.request.spec/error-spec {"TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "InvalidRenderingParameterException" :portkey.aws.email.-2010-12-01/invalid-rendering-parameter-exception, "MissingRenderingAttributeException" :portkey.aws.email.-2010-12-01/missing-rendering-attribute-exception}})))))
(clojure.spec.alpha/fdef test-render-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/test-render-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/test-render-template-response))

(clojure.core/defn verify-domain-dkim ([verify-domain-dkim-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-verify-domain-dkim-request verify-domain-dkim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/verify-domain-dkim-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-domain-dkim-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "VerifyDomainDkim", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-domain-dkim :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-domain-dkim-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verify-domain-dkim-response))

(clojure.core/defn put-identity-policy ([put-identity-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-put-identity-policy-request put-identity-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/put-identity-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/put-identity-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutIdentityPolicy", :http.request.spec/error-spec {"InvalidPolicyException" :portkey.aws.email.-2010-12-01/invalid-policy-exception}})))))
(clojure.spec.alpha/fdef put-identity-policy :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/put-identity-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/put-identity-policy-response))

(clojure.core/defn delete-receipt-rule-set ([delete-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-receipt-rule-set-request delete-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReceiptRuleSet", :http.request.spec/error-spec {"CannotDeleteException" :portkey.aws.email.-2010-12-01/cannot-delete-exception}})))))
(clojure.spec.alpha/fdef delete-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-response))

(clojure.core/defn list-configuration-sets ([] (list-configuration-sets {})) ([list-configuration-sets-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-configuration-sets-request list-configuration-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-configuration-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-configuration-sets-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListConfigurationSets", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-configuration-sets :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-configuration-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-configuration-sets-response))

(clojure.core/defn delete-identity-policy ([delete-identity-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-identity-policy-request delete-identity-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-identity-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-identity-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteIdentityPolicy", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-identity-policy :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-identity-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-identity-policy-response))

(clojure.core/defn update-receipt-rule ([update-receipt-rule-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-receipt-rule-request update-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateReceiptRule", :http.request.spec/error-spec {"InvalidSnsTopicException" :portkey.aws.email.-2010-12-01/invalid-sns-topic-exception, "InvalidS3ConfigurationException" :portkey.aws.email.-2010-12-01/invalid-s-3-configuration-exception, "InvalidLambdaFunctionException" :portkey.aws.email.-2010-12-01/invalid-lambda-function-exception, "RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-receipt-rule-response))

(clojure.core/defn list-templates ([] (list-templates {})) ([list-templates-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-templates-request list-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-templates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTemplates", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-templates :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-templates-response))

(clojure.core/defn set-identity-dkim-enabled ([set-identity-dkim-enabled-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-identity-dkim-enabled-request set-identity-dkim-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetIdentityDkimEnabled", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-dkim-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-response))

(clojure.core/defn get-identity-policies ([get-identity-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-identity-policies-request get-identity-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIdentityPolicies", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-policies :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-policies-response))

(clojure.core/defn list-identity-policies ([list-identity-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-identity-policies-request list-identity-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-identity-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-identity-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListIdentityPolicies", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-identity-policies :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/list-identity-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-identity-policies-response))

(clojure.core/defn get-account-sending-enabled ([] (get-account-sending-enabled {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-account-sending-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountSendingEnabled", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-account-sending-enabled :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-account-sending-enabled-response))

(clojure.core/defn describe-receipt-rule-set ([describe-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-receipt-rule-set-request describe-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReceiptRuleSet", :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef describe-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-response))

(clojure.core/defn update-configuration-set-reputation-metrics-enabled ([update-configuration-set-reputation-metrics-enabled-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-configuration-set-reputation-metrics-enabled-request update-configuration-set-reputation-metrics-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-reputation-metrics-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConfigurationSetReputationMetricsEnabled", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-reputation-metrics-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-reputation-metrics-enabled-request) :ret clojure.core/true?)

(clojure.core/defn send-bulk-templated-email ([send-bulk-templated-email-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-send-bulk-templated-email-request send-bulk-templated-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-bulk-templated-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-bulk-templated-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendBulkTemplatedEmail", :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-bulk-templated-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-bulk-templated-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-bulk-templated-email-response))

(clojure.core/defn create-configuration-set ([create-configuration-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-configuration-set-request create-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-configuration-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateConfigurationSet", :http.request.spec/error-spec {"ConfigurationSetAlreadyExistsException" :portkey.aws.email.-2010-12-01/configuration-set-already-exists-exception, "InvalidConfigurationSetException" :portkey.aws.email.-2010-12-01/invalid-configuration-set-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-configuration-set-response))

(clojure.core/defn send-email ([send-email-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-send-email-request send-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendEmail", :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-email-response))

(clojure.core/defn update-template ([update-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-template-request update-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTemplate", :http.request.spec/error-spec {"TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "InvalidTemplateException" :portkey.aws.email.-2010-12-01/invalid-template-exception}})))))
(clojure.spec.alpha/fdef update-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-template-response))

(clojure.core/defn describe-active-receipt-rule-set ([] (describe-active-receipt-rule-set {})) ([describe-active-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-active-receipt-rule-set-request describe-active-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeActiveReceiptRuleSet", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-active-receipt-rule-set :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-response))

(clojure.core/defn set-identity-headers-in-notifications-enabled ([set-identity-headers-in-notifications-enabled-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-identity-headers-in-notifications-enabled-request set-identity-headers-in-notifications-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetIdentityHeadersInNotificationsEnabled", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-headers-in-notifications-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-response))

(clojure.core/defn delete-configuration-set-event-destination ([delete-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-configuration-set-event-destination-request delete-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConfigurationSetEventDestination", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "EventDestinationDoesNotExistException" :portkey.aws.email.-2010-12-01/event-destination-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-response))

(clojure.core/defn create-custom-verification-email-template ([create-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-custom-verification-email-template-request create-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCustomVerificationEmailTemplate", :http.request.spec/error-spec {"CustomVerificationEmailTemplateAlreadyExistsException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-already-exists-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception, "CustomVerificationEmailInvalidContentException" :portkey.aws.email.-2010-12-01/custom-verification-email-invalid-content-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn send-bounce ([send-bounce-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-send-bounce-request send-bounce-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-bounce-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-bounce-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendBounce", :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected}})))))
(clojure.spec.alpha/fdef send-bounce :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-bounce-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-bounce-response))

(clojure.core/defn create-receipt-filter ([create-receipt-filter-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-receipt-filter-request create-receipt-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-receipt-filter-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-receipt-filter-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReceiptFilter", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-receipt-filter :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-receipt-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-receipt-filter-response))

(clojure.core/defn list-identities ([] (list-identities {})) ([list-identities-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-identities-request list-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-identities-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListIdentities", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-identities :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-identities-response))

(clojure.core/defn set-identity-notification-topic ([set-identity-notification-topic-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-identity-notification-topic-request set-identity-notification-topic-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-notification-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-notification-topic-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetIdentityNotificationTopic", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-notification-topic :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-notification-topic-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-notification-topic-response))

(clojure.core/defn set-identity-mail-from-domain ([set-identity-mail-from-domain-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-identity-mail-from-domain-request set-identity-mail-from-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetIdentityMailFromDomain", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-mail-from-domain :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-response))

(clojure.core/defn get-identity-dkim-attributes ([get-identity-dkim-attributes-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-identity-dkim-attributes-request get-identity-dkim-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIdentityDkimAttributes", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-dkim-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-response))

(clojure.core/defn update-configuration-set-sending-enabled ([update-configuration-set-sending-enabled-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-configuration-set-sending-enabled-request update-configuration-set-sending-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-sending-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConfigurationSetSendingEnabled", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-sending-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-sending-enabled-request) :ret clojure.core/true?)

(clojure.core/defn get-send-statistics ([] (get-send-statistics {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-send-statistics-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSendStatistics", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-send-statistics :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-send-statistics-response))

(clojure.core/defn delete-receipt-filter ([delete-receipt-filter-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-receipt-filter-request delete-receipt-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-receipt-filter-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-receipt-filter-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReceiptFilter", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-receipt-filter :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-receipt-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-receipt-filter-response))

(clojure.core/defn create-template ([create-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-template-request create-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTemplate", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "InvalidTemplateException" :portkey.aws.email.-2010-12-01/invalid-template-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-template-response))

(clojure.core/defn update-configuration-set-event-destination ([update-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-configuration-set-event-destination-request update-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConfigurationSetEventDestination", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "EventDestinationDoesNotExistException" :portkey.aws.email.-2010-12-01/event-destination-does-not-exist-exception, "InvalidCloudWatchDestinationException" :portkey.aws.email.-2010-12-01/invalid-cloud-watch-destination-exception, "InvalidFirehoseDestinationException" :portkey.aws.email.-2010-12-01/invalid-firehose-destination-exception, "InvalidSNSDestinationException" :portkey.aws.email.-2010-12-01/invalid-sns-destination-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-response))

(clojure.core/defn delete-identity ([delete-identity-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-identity-request delete-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteIdentity", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-identity :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-identity-response))

(clojure.core/defn verify-email-identity ([verify-email-identity-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-verify-email-identity-request verify-email-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/verify-email-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-email-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "VerifyEmailIdentity", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-email-identity :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-email-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verify-email-identity-response))

(clojure.core/defn reorder-receipt-rule-set ([reorder-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-reorder-receipt-rule-set-request reorder-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ReorderReceiptRuleSet", :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef reorder-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-response))

(clojure.core/defn list-receipt-rule-sets ([] (list-receipt-rule-sets {})) ([list-receipt-rule-sets-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-receipt-rule-sets-request list-receipt-rule-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListReceiptRuleSets", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-receipt-rule-sets :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-response))

(clojure.core/defn describe-receipt-rule ([describe-receipt-rule-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-receipt-rule-request describe-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReceiptRule", :http.request.spec/error-spec {"RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception, "RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef describe-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/describe-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-receipt-rule-response))

(clojure.core/defn list-receipt-filters ([] (list-receipt-filters {})) ([list-receipt-filters-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-receipt-filters-request list-receipt-filters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-receipt-filters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-receipt-filters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListReceiptFilters", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-receipt-filters :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-receipt-filters-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-receipt-filters-response))

(clojure.core/defn clone-receipt-rule-set ([clone-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-clone-receipt-rule-set-request clone-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CloneReceiptRuleSet", :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef clone-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-response))

(clojure.core/defn get-identity-notification-attributes ([get-identity-notification-attributes-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-identity-notification-attributes-request get-identity-notification-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIdentityNotificationAttributes", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-notification-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-response))

(clojure.core/defn send-custom-verification-email ([send-custom-verification-email-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-send-custom-verification-email-request send-custom-verification-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-custom-verification-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-custom-verification-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendCustomVerificationEmail", :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception, "ProductionAccessNotGrantedException" :portkey.aws.email.-2010-12-01/production-access-not-granted-exception}})))))
(clojure.spec.alpha/fdef send-custom-verification-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-custom-verification-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-custom-verification-email-response))

(clojure.core/defn delete-receipt-rule ([delete-receipt-rule-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-receipt-rule-request delete-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReceiptRule", :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-receipt-rule-response))

(clojure.core/defn get-send-quota ([] (get-send-quota {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-send-quota-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSendQuota", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-send-quota :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-send-quota-response))

(clojure.core/defn create-configuration-set-event-destination ([create-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-configuration-set-event-destination-request create-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateConfigurationSetEventDestination", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "EventDestinationAlreadyExistsException" :portkey.aws.email.-2010-12-01/event-destination-already-exists-exception, "InvalidCloudWatchDestinationException" :portkey.aws.email.-2010-12-01/invalid-cloud-watch-destination-exception, "InvalidFirehoseDestinationException" :portkey.aws.email.-2010-12-01/invalid-firehose-destination-exception, "InvalidSNSDestinationException" :portkey.aws.email.-2010-12-01/invalid-sns-destination-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-response))

(clojure.core/defn verify-domain-identity ([verify-domain-identity-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-verify-domain-identity-request verify-domain-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/verify-domain-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-domain-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "VerifyDomainIdentity", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-domain-identity :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-domain-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verify-domain-identity-response))

(clojure.core/defn get-custom-verification-email-template ([get-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-custom-verification-email-template-request get-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCustomVerificationEmailTemplate", :http.request.spec/error-spec {"CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-response))

(clojure.core/defn update-configuration-set-tracking-options ([update-configuration-set-tracking-options-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-configuration-set-tracking-options-request update-configuration-set-tracking-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConfigurationSetTrackingOptions", :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TrackingOptionsDoesNotExistException" :portkey.aws.email.-2010-12-01/tracking-options-does-not-exist-exception, "InvalidTrackingOptionsException" :portkey.aws.email.-2010-12-01/invalid-tracking-options-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-response))

(clojure.core/defn send-raw-email ([send-raw-email-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-send-raw-email-request send-raw-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-raw-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-raw-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendRawEmail", :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-raw-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-raw-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-raw-email-response))

(clojure.core/defn update-custom-verification-email-template ([update-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-custom-verification-email-template-request update-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCustomVerificationEmailTemplate", :http.request.spec/error-spec {"CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception, "CustomVerificationEmailInvalidContentException" :portkey.aws.email.-2010-12-01/custom-verification-email-invalid-content-exception}})))))
(clojure.spec.alpha/fdef update-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn set-receipt-rule-position ([set-receipt-rule-position-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-receipt-rule-position-request set-receipt-rule-position-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-receipt-rule-position-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-receipt-rule-position-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetReceiptRulePosition", :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef set-receipt-rule-position :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-receipt-rule-position-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-receipt-rule-position-response))

(clojure.core/defn create-receipt-rule-set ([create-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-receipt-rule-set-request create-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReceiptRuleSet", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-receipt-rule-set-response))

(clojure.core/defn create-receipt-rule ([create-receipt-rule-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-receipt-rule-request create-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReceiptRule", :http.request.spec/error-spec {"InvalidSnsTopicException" :portkey.aws.email.-2010-12-01/invalid-sns-topic-exception, "InvalidS3ConfigurationException" :portkey.aws.email.-2010-12-01/invalid-s-3-configuration-exception, "InvalidLambdaFunctionException" :portkey.aws.email.-2010-12-01/invalid-lambda-function-exception, "AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception, "RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-receipt-rule-response))

(clojure.core/defn get-template ([get-template-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-template-request get-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTemplate", :http.request.spec/error-spec {"TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-template-response))
