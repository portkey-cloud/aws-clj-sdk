(ns portkey.aws.email (:require [portkey.aws]))

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

(clojure.core/declare ser-dimension-name ser-address ser-event-destination ser-tracking-options ser-dimension-value-source ser-configuration-set-attribute ser-receipt-rule-name ser-bounce-action ser-cidr ser-message-data ser-behavior-onmxfailure ser-dsn-action ser-message-dsn ser-cloud-watch-dimension-configuration ser-bulk-email-destination ser-template-content ser-receipt-filter ser-message-id ser-add-header-action ser-header-name ser-extension-field-name ser-cloud-watch-destination ser-configuration-set ser-policy-name ser-identity-list ser-receipt-action ser-body ser-workmail-action ser-amazon-resource-name ser-arrival-date ser-bulk-email-destination-list ser-default-dimension-value ser-stop-scope ser-destination ser-s3-bucket-name ser-template ser-raw-message-data ser-configuration-set-name ser-notification-type ser-bounce-type ser-bounced-recipient-info ser-extension-field-value ser-custom-redirect-domain ser-html-part ser-enabled ser-event-type ser-next-token ser-dsn-status ser-address-list ser-configuration-set-attribute-list ser-recipient-dsn-fields ser-header-value ser-snsaction-encoding ser-domain ser-snsaction ser-message-tag ser-reporting-mta ser-receipt-filter-name ser-message-tag-name ser-text-part ser-subject ser-event-destination-name ser-tls-policy ser-recipient ser-message ser-invocation-type ser-last-attempt-date ser-receipt-rule ser-message-tag-value ser-content ser-identity-type ser-bounce-message ser-explanation ser-extension-field-list ser-identity ser-max-items ser-s3-key-prefix ser-template-name ser-kinesis-firehose-destination ser-message-tag-list ser-bounced-recipient-info-list ser-notification-topic ser-cloud-watch-dimension-configurations ser-event-types ser-from-address ser-receipt-actions-list ser-charset ser-success-redirectionurl ser-policy ser-max-results ser-snsdestination ser-bounce-status-code ser-failure-redirectionurl ser-raw-message ser-extension-field ser-receipt-filter-policy ser-stop-action ser-template-data ser-lambda-action ser-receipt-ip-filter ser-recipients-list ser-remote-mta ser-diagnostic-code ser-receipt-rule-names-list ser-s3-action ser-policy-name-list ser-subject-part ser-bounce-smtp-reply-code ser-receipt-rule-set-name ser-mail-from-domain-name)

(clojure.core/defn- ser-dimension-name [shape-input] shape-input)
(clojure.core/defn- ser-address [shape-input] shape-input)
(clojure.core/defn- ser-event-destination [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "EventDestination.Name" (ser-event-destination-name (:name shape-input))) (:enabled shape-input) (clojure.core/assoc "EventDestination.Enabled" (ser-enabled (:enabled shape-input))) (:matching-event-types shape-input) (clojure.core/assoc "EventDestination.MatchingEventTypes" (ser-event-types (:matching-event-types shape-input))) (:kinesis-firehose-destination shape-input) (clojure.core/assoc "EventDestination.KinesisFirehoseDestination" (ser-kinesis-firehose-destination (:kinesis-firehose-destination shape-input))) (:cloud-watch-destination shape-input) (clojure.core/assoc "EventDestination.CloudWatchDestination" (ser-cloud-watch-destination (:cloud-watch-destination shape-input))) (:snsdestination shape-input) (clojure.core/assoc "EventDestination.SNSDestination" (ser-snsdestination (:snsdestination shape-input)))))
(clojure.core/defn- ser-tracking-options [shape-input] (clojure.core/cond-> {} (:custom-redirect-domain shape-input) (clojure.core/assoc "TrackingOptions.CustomRedirectDomain" (ser-custom-redirect-domain (:custom-redirect-domain shape-input)))))
(clojure.core/defn- ser-dimension-value-source [shape-input] ({"messageTag" "messageTag", :message-tag "messageTag", "emailHeader" "emailHeader", :email-header "emailHeader", "linkTag" "linkTag", :link-tag "linkTag"} shape-input))
(clojure.core/defn- ser-configuration-set-attribute [shape-input] ({"eventDestinations" "eventDestinations", :event-destinations "eventDestinations", "trackingOptions" "trackingOptions", :tracking-options "trackingOptions", "reputationOptions" "reputationOptions", :reputation-options "reputationOptions"} shape-input))
(clojure.core/defn- ser-receipt-rule-name [shape-input] shape-input)
(clojure.core/defn- ser-bounce-action [shape-input] (clojure.core/cond-> {} (:topic-arn shape-input) (clojure.core/assoc "BounceAction.TopicArn" (ser-amazon-resource-name (:topic-arn shape-input))) (:smtp-reply-code shape-input) (clojure.core/assoc "BounceAction.SmtpReplyCode" (ser-bounce-smtp-reply-code (:smtp-reply-code shape-input))) (:status-code shape-input) (clojure.core/assoc "BounceAction.StatusCode" (ser-bounce-status-code (:status-code shape-input))) (:message shape-input) (clojure.core/assoc "BounceAction.Message" (ser-bounce-message (:message shape-input))) (:sender shape-input) (clojure.core/assoc "BounceAction.Sender" (ser-address (:sender shape-input)))))
(clojure.core/defn- ser-cidr [shape-input] shape-input)
(clojure.core/defn- ser-message-data [shape-input] shape-input)
(clojure.core/defn- ser-behavior-onmxfailure [shape-input] ({"UseDefaultValue" "UseDefaultValue", :use-default-value "UseDefaultValue", "RejectMessage" "RejectMessage", :reject-message "RejectMessage"} shape-input))
(clojure.core/defn- ser-dsn-action [shape-input] ({"relayed" "relayed", :delayed "delayed", "delayed" "delayed", "failed" "failed", "delivered" "delivered", :delivered "delivered", :relayed "relayed", :expanded "expanded", "expanded" "expanded", :failed "failed"} shape-input))
(clojure.core/defn- ser-message-dsn [shape-input] (clojure.core/cond-> {} (:reporting-mta shape-input) (clojure.core/assoc "MessageDsn.ReportingMta" (ser-reporting-mta (:reporting-mta shape-input))) (:arrival-date shape-input) (clojure.core/assoc "MessageDsn.ArrivalDate" (ser-arrival-date (:arrival-date shape-input))) (:extension-fields shape-input) (clojure.core/assoc "MessageDsn.ExtensionFields" (ser-extension-field-list (:extension-fields shape-input)))))
(clojure.core/defn- ser-cloud-watch-dimension-configuration [shape-input] (clojure.core/cond-> {} (:dimension-name shape-input) (clojure.core/assoc "CloudWatchDimensionConfiguration.DimensionName" (ser-dimension-name (:dimension-name shape-input))) (:dimension-value-source shape-input) (clojure.core/assoc "CloudWatchDimensionConfiguration.DimensionValueSource" (ser-dimension-value-source (:dimension-value-source shape-input))) (:default-dimension-value shape-input) (clojure.core/assoc "CloudWatchDimensionConfiguration.DefaultDimensionValue" (ser-default-dimension-value (:default-dimension-value shape-input)))))
(clojure.core/defn- ser-bulk-email-destination [shape-input] (clojure.core/cond-> {} (:destination shape-input) (clojure.core/assoc "BulkEmailDestination.Destination" (ser-destination (:destination shape-input))) (:replacement-tags shape-input) (clojure.core/assoc "BulkEmailDestination.ReplacementTags" (ser-message-tag-list (:replacement-tags shape-input))) (:replacement-template-data shape-input) (clojure.core/assoc "BulkEmailDestination.ReplacementTemplateData" (ser-template-data (:replacement-template-data shape-input)))))
(clojure.core/defn- ser-template-content [shape-input] shape-input)
(clojure.core/defn- ser-receipt-filter [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "ReceiptFilter.Name" (ser-receipt-filter-name (:name shape-input))) (:ip-filter shape-input) (clojure.core/assoc "ReceiptFilter.IpFilter" (ser-receipt-ip-filter (:ip-filter shape-input)))))
(clojure.core/defn- ser-message-id [shape-input] shape-input)
(clojure.core/defn- ser-add-header-action [shape-input] (clojure.core/cond-> {} (:header-name shape-input) (clojure.core/assoc "AddHeaderAction.HeaderName" (ser-header-name (:header-name shape-input))) (:header-value shape-input) (clojure.core/assoc "AddHeaderAction.HeaderValue" (ser-header-value (:header-value shape-input)))))
(clojure.core/defn- ser-header-name [shape-input] shape-input)
(clojure.core/defn- ser-extension-field-name [shape-input] shape-input)
(clojure.core/defn- ser-cloud-watch-destination [shape-input] (clojure.core/cond-> {} (:dimension-configurations shape-input) (clojure.core/assoc "CloudWatchDestination.DimensionConfigurations" (ser-cloud-watch-dimension-configurations (:dimension-configurations shape-input)))))
(clojure.core/defn- ser-configuration-set [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "ConfigurationSet.Name" (ser-configuration-set-name (:name shape-input)))))
(clojure.core/defn- ser-policy-name [shape-input] shape-input)
(clojure.core/defn- ser-identity-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-receipt-action [shape-input] (clojure.core/cond-> {} (:s3-action shape-input) (clojure.core/assoc "ReceiptAction.S3Action" (ser-s3-action (:s3-action shape-input))) (:bounce-action shape-input) (clojure.core/assoc "ReceiptAction.BounceAction" (ser-bounce-action (:bounce-action shape-input))) (:workmail-action shape-input) (clojure.core/assoc "ReceiptAction.WorkmailAction" (ser-workmail-action (:workmail-action shape-input))) (:lambda-action shape-input) (clojure.core/assoc "ReceiptAction.LambdaAction" (ser-lambda-action (:lambda-action shape-input))) (:stop-action shape-input) (clojure.core/assoc "ReceiptAction.StopAction" (ser-stop-action (:stop-action shape-input))) (:add-header-action shape-input) (clojure.core/assoc "ReceiptAction.AddHeaderAction" (ser-add-header-action (:add-header-action shape-input))) (:snsaction shape-input) (clojure.core/assoc "ReceiptAction.SNSAction" (ser-snsaction (:snsaction shape-input)))))
(clojure.core/defn- ser-body [shape-input] (clojure.core/cond-> {} (:text shape-input) (clojure.core/assoc "Body.Text" (ser-content (:text shape-input))) (:html shape-input) (clojure.core/assoc "Body.Html" (ser-content (:html shape-input)))))
(clojure.core/defn- ser-workmail-action [shape-input] (clojure.core/cond-> {} (:topic-arn shape-input) (clojure.core/assoc "WorkmailAction.TopicArn" (ser-amazon-resource-name (:topic-arn shape-input))) (:organization-arn shape-input) (clojure.core/assoc "WorkmailAction.OrganizationArn" (ser-amazon-resource-name (:organization-arn shape-input)))))
(clojure.core/defn- ser-amazon-resource-name [shape-input] shape-input)
(clojure.core/defn- ser-arrival-date [shape-input] shape-input)
(clojure.core/defn- ser-bulk-email-destination-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-default-dimension-value [shape-input] shape-input)
(clojure.core/defn- ser-stop-scope [shape-input] ({"RuleSet" "RuleSet", :rule-set "RuleSet"} shape-input))
(clojure.core/defn- ser-destination [shape-input] (clojure.core/cond-> {} (:to-addresses shape-input) (clojure.core/assoc "Destination.ToAddresses" (ser-address-list (:to-addresses shape-input))) (:cc-addresses shape-input) (clojure.core/assoc "Destination.CcAddresses" (ser-address-list (:cc-addresses shape-input))) (:bcc-addresses shape-input) (clojure.core/assoc "Destination.BccAddresses" (ser-address-list (:bcc-addresses shape-input)))))
(clojure.core/defn- ser-s3-bucket-name [shape-input] shape-input)
(clojure.core/defn- ser-template [shape-input] (clojure.core/cond-> {} (:template-name shape-input) (clojure.core/assoc "Template.TemplateName" (ser-template-name (:template-name shape-input))) (:subject-part shape-input) (clojure.core/assoc "Template.SubjectPart" (ser-subject-part (:subject-part shape-input))) (:text-part shape-input) (clojure.core/assoc "Template.TextPart" (ser-text-part (:text-part shape-input))) (:html-part shape-input) (clojure.core/assoc "Template.HtmlPart" (ser-html-part (:html-part shape-input)))))
(clojure.core/defn- ser-raw-message-data [shape-input] (portkey.aws/base64-encode shape-input))
(clojure.core/defn- ser-configuration-set-name [shape-input] shape-input)
(clojure.core/defn- ser-notification-type [shape-input] ({"Bounce" "Bounce", :bounce "Bounce", "Complaint" "Complaint", :complaint "Complaint", "Delivery" "Delivery", :delivery "Delivery"} shape-input))
(clojure.core/defn- ser-bounce-type [shape-input] ({"Undefined" "Undefined", "ExceededQuota" "ExceededQuota", :exceeded-quota "ExceededQuota", "ContentRejected" "ContentRejected", "DoesNotExist" "DoesNotExist", "TemporaryFailure" "TemporaryFailure", "MessageTooLarge" "MessageTooLarge", :undefined "Undefined", :message-too-large "MessageTooLarge", :does-not-exist "DoesNotExist", :temporary-failure "TemporaryFailure", :content-rejected "ContentRejected"} shape-input))
(clojure.core/defn- ser-bounced-recipient-info [shape-input] (clojure.core/cond-> {} (:recipient shape-input) (clojure.core/assoc "BouncedRecipientInfo.Recipient" (ser-address (:recipient shape-input))) (:recipient-arn shape-input) (clojure.core/assoc "BouncedRecipientInfo.RecipientArn" (ser-amazon-resource-name (:recipient-arn shape-input))) (:bounce-type shape-input) (clojure.core/assoc "BouncedRecipientInfo.BounceType" (ser-bounce-type (:bounce-type shape-input))) (:recipient-dsn-fields shape-input) (clojure.core/assoc "BouncedRecipientInfo.RecipientDsnFields" (ser-recipient-dsn-fields (:recipient-dsn-fields shape-input)))))
(clojure.core/defn- ser-extension-field-value [shape-input] shape-input)
(clojure.core/defn- ser-custom-redirect-domain [shape-input] shape-input)
(clojure.core/defn- ser-html-part [shape-input] shape-input)
(clojure.core/defn- ser-enabled [shape-input] shape-input)
(clojure.core/defn- ser-event-type [shape-input] ({:open "open", "send" "send", "delivery" "delivery", :complaint "complaint", :delivery "delivery", "click" "click", "renderingFailure" "renderingFailure", :bounce "bounce", :click "click", "complaint" "complaint", "bounce" "bounce", :send "send", :reject "reject", "reject" "reject", "open" "open", :rendering-failure "renderingFailure"} shape-input))
(clojure.core/defn- ser-next-token [shape-input] shape-input)
(clojure.core/defn- ser-dsn-status [shape-input] shape-input)
(clojure.core/defn- ser-address-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-configuration-set-attribute-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-recipient-dsn-fields [shape-input] (clojure.core/cond-> {} (:final-recipient shape-input) (clojure.core/assoc "RecipientDsnFields.FinalRecipient" (ser-address (:final-recipient shape-input))) (:action shape-input) (clojure.core/assoc "RecipientDsnFields.Action" (ser-dsn-action (:action shape-input))) (:remote-mta shape-input) (clojure.core/assoc "RecipientDsnFields.RemoteMta" (ser-remote-mta (:remote-mta shape-input))) (:status shape-input) (clojure.core/assoc "RecipientDsnFields.Status" (ser-dsn-status (:status shape-input))) (:diagnostic-code shape-input) (clojure.core/assoc "RecipientDsnFields.DiagnosticCode" (ser-diagnostic-code (:diagnostic-code shape-input))) (:last-attempt-date shape-input) (clojure.core/assoc "RecipientDsnFields.LastAttemptDate" (ser-last-attempt-date (:last-attempt-date shape-input))) (:extension-fields shape-input) (clojure.core/assoc "RecipientDsnFields.ExtensionFields" (ser-extension-field-list (:extension-fields shape-input)))))
(clojure.core/defn- ser-header-value [shape-input] shape-input)
(clojure.core/defn- ser-snsaction-encoding [shape-input] ({"UTF-8" "UTF-8", :utf-8 "UTF-8", "Base64" "Base64", :base64 "Base64"} shape-input))
(clojure.core/defn- ser-domain [shape-input] shape-input)
(clojure.core/defn- ser-snsaction [shape-input] (clojure.core/cond-> {} (:topic-arn shape-input) (clojure.core/assoc "SNSAction.TopicArn" (ser-amazon-resource-name (:topic-arn shape-input))) (:encoding shape-input) (clojure.core/assoc "SNSAction.Encoding" (ser-snsaction-encoding (:encoding shape-input)))))
(clojure.core/defn- ser-message-tag [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "MessageTag.Name" (ser-message-tag-name (:name shape-input))) (:value shape-input) (clojure.core/assoc "MessageTag.Value" (ser-message-tag-value (:value shape-input)))))
(clojure.core/defn- ser-reporting-mta [shape-input] shape-input)
(clojure.core/defn- ser-receipt-filter-name [shape-input] shape-input)
(clojure.core/defn- ser-message-tag-name [shape-input] shape-input)
(clojure.core/defn- ser-text-part [shape-input] shape-input)
(clojure.core/defn- ser-subject [shape-input] shape-input)
(clojure.core/defn- ser-event-destination-name [shape-input] shape-input)
(clojure.core/defn- ser-tls-policy [shape-input] ({"Require" "Require", :require "Require", "Optional" "Optional", :optional "Optional"} shape-input))
(clojure.core/defn- ser-recipient [shape-input] shape-input)
(clojure.core/defn- ser-message [shape-input] (clojure.core/cond-> {} (:subject shape-input) (clojure.core/assoc "Message.Subject" (ser-content (:subject shape-input))) (:body shape-input) (clojure.core/assoc "Message.Body" (ser-body (:body shape-input)))))
(clojure.core/defn- ser-invocation-type [shape-input] ({"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse"} shape-input))
(clojure.core/defn- ser-last-attempt-date [shape-input] shape-input)
(clojure.core/defn- ser-receipt-rule [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "ReceiptRule.Name" (ser-receipt-rule-name (:name shape-input))) (:enabled shape-input) (clojure.core/assoc "ReceiptRule.Enabled" (ser-enabled (:enabled shape-input))) (:tls-policy shape-input) (clojure.core/assoc "ReceiptRule.TlsPolicy" (ser-tls-policy (:tls-policy shape-input))) (:recipients shape-input) (clojure.core/assoc "ReceiptRule.Recipients" (ser-recipients-list (:recipients shape-input))) (:actions shape-input) (clojure.core/assoc "ReceiptRule.Actions" (ser-receipt-actions-list (:actions shape-input))) (:scan-enabled shape-input) (clojure.core/assoc "ReceiptRule.ScanEnabled" (ser-enabled (:scan-enabled shape-input)))))
(clojure.core/defn- ser-message-tag-value [shape-input] shape-input)
(clojure.core/defn- ser-content [shape-input] (clojure.core/cond-> {} (:data shape-input) (clojure.core/assoc "Content.Data" (ser-message-data (:data shape-input))) (:charset shape-input) (clojure.core/assoc "Content.Charset" (ser-charset (:charset shape-input)))))
(clojure.core/defn- ser-identity-type [shape-input] ({"EmailAddress" "EmailAddress", :email-address "EmailAddress", "Domain" "Domain", :domain "Domain"} shape-input))
(clojure.core/defn- ser-bounce-message [shape-input] shape-input)
(clojure.core/defn- ser-explanation [shape-input] shape-input)
(clojure.core/defn- ser-extension-field-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-identity [shape-input] shape-input)
(clojure.core/defn- ser-max-items [shape-input] shape-input)
(clojure.core/defn- ser-s3-key-prefix [shape-input] shape-input)
(clojure.core/defn- ser-template-name [shape-input] shape-input)
(clojure.core/defn- ser-kinesis-firehose-destination [shape-input] (clojure.core/cond-> {} (:iamrolearn shape-input) (clojure.core/assoc "KinesisFirehoseDestination.IAMRoleARN" (ser-amazon-resource-name (:iamrolearn shape-input))) (:delivery-streamarn shape-input) (clojure.core/assoc "KinesisFirehoseDestination.DeliveryStreamARN" (ser-amazon-resource-name (:delivery-streamarn shape-input)))))
(clojure.core/defn- ser-message-tag-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-bounced-recipient-info-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-notification-topic [shape-input] shape-input)
(clojure.core/defn- ser-cloud-watch-dimension-configurations [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-event-types [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-from-address [shape-input] shape-input)
(clojure.core/defn- ser-receipt-actions-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-charset [shape-input] shape-input)
(clojure.core/defn- ser-success-redirectionurl [shape-input] shape-input)
(clojure.core/defn- ser-policy [shape-input] shape-input)
(clojure.core/defn- ser-max-results [shape-input] shape-input)
(clojure.core/defn- ser-snsdestination [shape-input] (clojure.core/cond-> {} (:topicarn shape-input) (clojure.core/assoc "SNSDestination.TopicARN" (ser-amazon-resource-name (:topicarn shape-input)))))
(clojure.core/defn- ser-bounce-status-code [shape-input] shape-input)
(clojure.core/defn- ser-failure-redirectionurl [shape-input] shape-input)
(clojure.core/defn- ser-raw-message [shape-input] (clojure.core/cond-> {} (:data shape-input) (clojure.core/assoc "RawMessage.Data" (ser-raw-message-data (:data shape-input)))))
(clojure.core/defn- ser-extension-field [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "ExtensionField.Name" (ser-extension-field-name (:name shape-input))) (:value shape-input) (clojure.core/assoc "ExtensionField.Value" (ser-extension-field-value (:value shape-input)))))
(clojure.core/defn- ser-receipt-filter-policy [shape-input] ({"Block" "Block", :block "Block", "Allow" "Allow", :allow "Allow"} shape-input))
(clojure.core/defn- ser-stop-action [shape-input] (clojure.core/cond-> {} (:scope shape-input) (clojure.core/assoc "StopAction.Scope" (ser-stop-scope (:scope shape-input))) (:topic-arn shape-input) (clojure.core/assoc "StopAction.TopicArn" (ser-amazon-resource-name (:topic-arn shape-input)))))
(clojure.core/defn- ser-template-data [shape-input] shape-input)
(clojure.core/defn- ser-lambda-action [shape-input] (clojure.core/cond-> {} (:topic-arn shape-input) (clojure.core/assoc "LambdaAction.TopicArn" (ser-amazon-resource-name (:topic-arn shape-input))) (:function-arn shape-input) (clojure.core/assoc "LambdaAction.FunctionArn" (ser-amazon-resource-name (:function-arn shape-input))) (:invocation-type shape-input) (clojure.core/assoc "LambdaAction.InvocationType" (ser-invocation-type (:invocation-type shape-input)))))
(clojure.core/defn- ser-receipt-ip-filter [shape-input] (clojure.core/cond-> {} (:policy shape-input) (clojure.core/assoc "ReceiptIpFilter.Policy" (ser-receipt-filter-policy (:policy shape-input))) (:cidr shape-input) (clojure.core/assoc "ReceiptIpFilter.Cidr" (ser-cidr (:cidr shape-input)))))
(clojure.core/defn- ser-recipients-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-remote-mta [shape-input] shape-input)
(clojure.core/defn- ser-diagnostic-code [shape-input] shape-input)
(clojure.core/defn- ser-receipt-rule-names-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-s3-action [shape-input] (clojure.core/cond-> {} (:topic-arn shape-input) (clojure.core/assoc "S3Action.TopicArn" (ser-amazon-resource-name (:topic-arn shape-input))) (:bucket-name shape-input) (clojure.core/assoc "S3Action.BucketName" (ser-s3-bucket-name (:bucket-name shape-input))) (:object-key-prefix shape-input) (clojure.core/assoc "S3Action.ObjectKeyPrefix" (ser-s3-key-prefix (:object-key-prefix shape-input))) (:kms-key-arn shape-input) (clojure.core/assoc "S3Action.KmsKeyArn" (ser-amazon-resource-name (:kms-key-arn shape-input)))))
(clojure.core/defn- ser-policy-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-subject-part [shape-input] shape-input)
(clojure.core/defn- ser-bounce-smtp-reply-code [shape-input] shape-input)
(clojure.core/defn- ser-receipt-rule-set-name [shape-input] shape-input)
(clojure.core/defn- ser-mail-from-domain-name [shape-input] shape-input)

(clojure.core/defn req<-update-account-sending-enabled-request [action-name52063 input52062] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name52063}} (clojure.core/contains? input52062 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-enabled (input52062 :enabled)))))
(clojure.core/defn req<-delete-verified-email-address-request [action-name52065 input52064] {:body {"EmailAddress" (ser-address (input52064 :email-address)), "Version" "2010-12-01", "Action" action-name52065}})
(clojure.core/defn req<-create-configuration-set-tracking-options-request [action-name52067 input52066] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52066 :configuration-set-name)), "TrackingOptions" (ser-tracking-options (input52066 :tracking-options)), "Version" "2010-12-01", "Action" action-name52067}})
(clojure.core/defn req<-set-active-receipt-rule-set-request [action-name52069 input52068] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name52069}} (clojure.core/contains? input52068 :rule-set-name) (clojure.core/assoc-in [:body "RuleSetName"] (ser-receipt-rule-set-name (input52068 :rule-set-name)))))
(clojure.core/defn req<-get-identity-mail-from-domain-attributes-request [action-name52071 input52070] {:body {"Identities" (ser-identity-list (input52070 :identities)), "Version" "2010-12-01", "Action" action-name52071}})
(clojure.core/defn req<-send-templated-email-request [action-name52073 input52072] (clojure.core/let [input52074 {:body {"Source" (ser-address (input52072 :source)), "Destination" (ser-destination (input52072 :destination)), "Template" (ser-template-name (input52072 :template)), "TemplateData" (ser-template-data (input52072 :template-data)), "Version" "2010-12-01", "Action" action-name52073}}] (clojure.core/cond-> input52074 (clojure.core/contains? input52072 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-message-tag-list (input52072 :tags))) (clojure.core/contains? input52072 :configuration-set-name) (clojure.core/assoc-in [:body "ConfigurationSetName"] (ser-configuration-set-name (input52072 :configuration-set-name))) (clojure.core/contains? input52072 :source-arn) (clojure.core/assoc-in [:body "SourceArn"] (ser-amazon-resource-name (input52072 :source-arn))) (clojure.core/contains? input52072 :return-path-arn) (clojure.core/assoc-in [:body "ReturnPathArn"] (ser-amazon-resource-name (input52072 :return-path-arn))) (clojure.core/contains? input52072 :return-path) (clojure.core/assoc-in [:body "ReturnPath"] (ser-address (input52072 :return-path))) (clojure.core/contains? input52072 :template-arn) (clojure.core/assoc-in [:body "TemplateArn"] (ser-amazon-resource-name (input52072 :template-arn))) (clojure.core/contains? input52072 :reply-to-addresses) (clojure.core/assoc-in [:body "ReplyToAddresses"] (ser-address-list (input52072 :reply-to-addresses))))))
(clojure.core/defn req<-delete-configuration-set-tracking-options-request [action-name52076 input52075] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52075 :configuration-set-name)), "Version" "2010-12-01", "Action" action-name52076}})
(clojure.core/defn req<-set-identity-feedback-forwarding-enabled-request [action-name52078 input52077] {:body {"Identity" (ser-identity (input52077 :identity)), "ForwardingEnabled" (ser-enabled (input52077 :forwarding-enabled)), "Version" "2010-12-01", "Action" action-name52078}})
(clojure.core/defn req<-verify-email-address-request [action-name52080 input52079] {:body {"EmailAddress" (ser-address (input52079 :email-address)), "Version" "2010-12-01", "Action" action-name52080}})
(clojure.core/defn req<-get-identity-verification-attributes-request [action-name52082 input52081] {:body {"Identities" (ser-identity-list (input52081 :identities)), "Version" "2010-12-01", "Action" action-name52082}})
(clojure.core/defn req<-list-custom-verification-email-templates-request [action-name52084 input52083] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name52084}} (clojure.core/contains? input52083 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input52083 :next-token))) (clojure.core/contains? input52083 :max-results) (clojure.core/assoc-in [:body "MaxResults"] (ser-max-results (input52083 :max-results)))))
(clojure.core/defn req<-delete-custom-verification-email-template-request [action-name52086 input52085] {:body {"TemplateName" (ser-template-name (input52085 :template-name)), "Version" "2010-12-01", "Action" action-name52086}})
(clojure.core/defn req<-describe-configuration-set-request [action-name52088 input52087] (clojure.core/let [input52089 {:body {"ConfigurationSetName" (ser-configuration-set-name (input52087 :configuration-set-name)), "Version" "2010-12-01", "Action" action-name52088}}] (clojure.core/cond-> input52089 (clojure.core/contains? input52087 :configuration-set-attribute-names) (clojure.core/assoc-in [:body "ConfigurationSetAttributeNames"] (ser-configuration-set-attribute-list (input52087 :configuration-set-attribute-names))))))
(clojure.core/defn req<-delete-template-request [action-name52091 input52090] {:body {"TemplateName" (ser-template-name (input52090 :template-name)), "Version" "2010-12-01", "Action" action-name52091}})
(clojure.core/defn req<-delete-configuration-set-request [action-name52093 input52092] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52092 :configuration-set-name)), "Version" "2010-12-01", "Action" action-name52093}})
(clojure.core/defn req<-test-render-template-request [action-name52095 input52094] {:body {"TemplateName" (ser-template-name (input52094 :template-name)), "TemplateData" (ser-template-data (input52094 :template-data)), "Version" "2010-12-01", "Action" action-name52095}})
(clojure.core/defn req<-verify-domain-dkim-request [action-name52097 input52096] {:body {"Domain" (ser-domain (input52096 :domain)), "Version" "2010-12-01", "Action" action-name52097}})
(clojure.core/defn req<-put-identity-policy-request [action-name52099 input52098] {:body {"Identity" (ser-identity (input52098 :identity)), "PolicyName" (ser-policy-name (input52098 :policy-name)), "Policy" (ser-policy (input52098 :policy)), "Version" "2010-12-01", "Action" action-name52099}})
(clojure.core/defn req<-delete-receipt-rule-set-request [action-name52101 input52100] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52100 :rule-set-name)), "Version" "2010-12-01", "Action" action-name52101}})
(clojure.core/defn req<-list-configuration-sets-request [action-name52103 input52102] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name52103}} (clojure.core/contains? input52102 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input52102 :next-token))) (clojure.core/contains? input52102 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items (input52102 :max-items)))))
(clojure.core/defn req<-delete-identity-policy-request [action-name52105 input52104] {:body {"Identity" (ser-identity (input52104 :identity)), "PolicyName" (ser-policy-name (input52104 :policy-name)), "Version" "2010-12-01", "Action" action-name52105}})
(clojure.core/defn req<-update-receipt-rule-request [action-name52107 input52106] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52106 :rule-set-name)), "Rule" (ser-receipt-rule (input52106 :rule)), "Version" "2010-12-01", "Action" action-name52107}})
(clojure.core/defn req<-list-templates-request [action-name52109 input52108] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name52109}} (clojure.core/contains? input52108 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input52108 :next-token))) (clojure.core/contains? input52108 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items (input52108 :max-items)))))
(clojure.core/defn req<-set-identity-dkim-enabled-request [action-name52111 input52110] {:body {"Identity" (ser-identity (input52110 :identity)), "DkimEnabled" (ser-enabled (input52110 :dkim-enabled)), "Version" "2010-12-01", "Action" action-name52111}})
(clojure.core/defn req<-get-identity-policies-request [action-name52113 input52112] {:body {"Identity" (ser-identity (input52112 :identity)), "PolicyNames" (ser-policy-name-list (input52112 :policy-names)), "Version" "2010-12-01", "Action" action-name52113}})
(clojure.core/defn req<-list-identity-policies-request [action-name52115 input52114] {:body {"Identity" (ser-identity (input52114 :identity)), "Version" "2010-12-01", "Action" action-name52115}})
(clojure.core/defn req<-describe-receipt-rule-set-request [action-name52117 input52116] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52116 :rule-set-name)), "Version" "2010-12-01", "Action" action-name52117}})
(clojure.core/defn req<-update-configuration-set-reputation-metrics-enabled-request [action-name52119 input52118] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52118 :configuration-set-name)), "Enabled" (ser-enabled (input52118 :enabled)), "Version" "2010-12-01", "Action" action-name52119}})
(clojure.core/defn req<-send-bulk-templated-email-request [action-name52121 input52120] (clojure.core/let [input52122 {:body {"Source" (ser-address (input52120 :source)), "Template" (ser-template-name (input52120 :template)), "Destinations" (ser-bulk-email-destination-list (input52120 :destinations)), "Version" "2010-12-01", "Action" action-name52121}}] (clojure.core/cond-> input52122 (clojure.core/contains? input52120 :default-template-data) (clojure.core/assoc-in [:body "DefaultTemplateData"] (ser-template-data (input52120 :default-template-data))) (clojure.core/contains? input52120 :configuration-set-name) (clojure.core/assoc-in [:body "ConfigurationSetName"] (ser-configuration-set-name (input52120 :configuration-set-name))) (clojure.core/contains? input52120 :source-arn) (clojure.core/assoc-in [:body "SourceArn"] (ser-amazon-resource-name (input52120 :source-arn))) (clojure.core/contains? input52120 :return-path-arn) (clojure.core/assoc-in [:body "ReturnPathArn"] (ser-amazon-resource-name (input52120 :return-path-arn))) (clojure.core/contains? input52120 :return-path) (clojure.core/assoc-in [:body "ReturnPath"] (ser-address (input52120 :return-path))) (clojure.core/contains? input52120 :template-arn) (clojure.core/assoc-in [:body "TemplateArn"] (ser-amazon-resource-name (input52120 :template-arn))) (clojure.core/contains? input52120 :default-tags) (clojure.core/assoc-in [:body "DefaultTags"] (ser-message-tag-list (input52120 :default-tags))) (clojure.core/contains? input52120 :reply-to-addresses) (clojure.core/assoc-in [:body "ReplyToAddresses"] (ser-address-list (input52120 :reply-to-addresses))))))
(clojure.core/defn req<-create-configuration-set-request [action-name52124 input52123] {:body {"ConfigurationSet" (ser-configuration-set (input52123 :configuration-set)), "Version" "2010-12-01", "Action" action-name52124}})
(clojure.core/defn req<-send-email-request [action-name52126 input52125] (clojure.core/let [input52127 {:body {"Source" (ser-address (input52125 :source)), "Destination" (ser-destination (input52125 :destination)), "Message" (ser-message (input52125 :message)), "Version" "2010-12-01", "Action" action-name52126}}] (clojure.core/cond-> input52127 (clojure.core/contains? input52125 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-message-tag-list (input52125 :tags))) (clojure.core/contains? input52125 :configuration-set-name) (clojure.core/assoc-in [:body "ConfigurationSetName"] (ser-configuration-set-name (input52125 :configuration-set-name))) (clojure.core/contains? input52125 :source-arn) (clojure.core/assoc-in [:body "SourceArn"] (ser-amazon-resource-name (input52125 :source-arn))) (clojure.core/contains? input52125 :return-path-arn) (clojure.core/assoc-in [:body "ReturnPathArn"] (ser-amazon-resource-name (input52125 :return-path-arn))) (clojure.core/contains? input52125 :return-path) (clojure.core/assoc-in [:body "ReturnPath"] (ser-address (input52125 :return-path))) (clojure.core/contains? input52125 :reply-to-addresses) (clojure.core/assoc-in [:body "ReplyToAddresses"] (ser-address-list (input52125 :reply-to-addresses))))))
(clojure.core/defn req<-update-template-request [action-name52129 input52128] {:body {"Template" (ser-template (input52128 :template)), "Version" "2010-12-01", "Action" action-name52129}})
(clojure.core/defn req<-describe-active-receipt-rule-set-request [action-name52131 input52130] nil)
(clojure.core/defn req<-set-identity-headers-in-notifications-enabled-request [action-name52133 input52132] {:body {"Identity" (ser-identity (input52132 :identity)), "NotificationType" (ser-notification-type (input52132 :notification-type)), "Enabled" (ser-enabled (input52132 :enabled)), "Version" "2010-12-01", "Action" action-name52133}})
(clojure.core/defn req<-delete-configuration-set-event-destination-request [action-name52135 input52134] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52134 :configuration-set-name)), "EventDestinationName" (ser-event-destination-name (input52134 :event-destination-name)), "Version" "2010-12-01", "Action" action-name52135}})
(clojure.core/defn req<-create-custom-verification-email-template-request [action-name52137 input52136] {:body {"TemplateName" (ser-template-name (input52136 :template-name)), "FromEmailAddress" (ser-from-address (input52136 :from-email-address)), "TemplateSubject" (ser-subject (input52136 :template-subject)), "TemplateContent" (ser-template-content (input52136 :template-content)), "SuccessRedirectionURL" (ser-success-redirectionurl (input52136 :success-redirectionurl)), "FailureRedirectionURL" (ser-failure-redirectionurl (input52136 :failure-redirectionurl)), "Version" "2010-12-01", "Action" action-name52137}})
(clojure.core/defn req<-send-bounce-request [action-name52139 input52138] (clojure.core/let [input52140 {:body {"OriginalMessageId" (ser-message-id (input52138 :original-message-id)), "BounceSender" (ser-address (input52138 :bounce-sender)), "BouncedRecipientInfoList" (ser-bounced-recipient-info-list (input52138 :bounced-recipient-info-list)), "Version" "2010-12-01", "Action" action-name52139}}] (clojure.core/cond-> input52140 (clojure.core/contains? input52138 :explanation) (clojure.core/assoc-in [:body "Explanation"] (ser-explanation (input52138 :explanation))) (clojure.core/contains? input52138 :message-dsn) (clojure.core/assoc-in [:body "MessageDsn"] (ser-message-dsn (input52138 :message-dsn))) (clojure.core/contains? input52138 :bounce-sender-arn) (clojure.core/assoc-in [:body "BounceSenderArn"] (ser-amazon-resource-name (input52138 :bounce-sender-arn))))))
(clojure.core/defn req<-create-receipt-filter-request [action-name52142 input52141] {:body {"Filter" (ser-receipt-filter (input52141 :filter)), "Version" "2010-12-01", "Action" action-name52142}})
(clojure.core/defn req<-list-identities-request [action-name52144 input52143] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name52144}} (clojure.core/contains? input52143 :identity-type) (clojure.core/assoc-in [:body "IdentityType"] (ser-identity-type (input52143 :identity-type))) (clojure.core/contains? input52143 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input52143 :next-token))) (clojure.core/contains? input52143 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items (input52143 :max-items)))))
(clojure.core/defn req<-set-identity-notification-topic-request [action-name52146 input52145] (clojure.core/let [input52147 {:body {"Identity" (ser-identity (input52145 :identity)), "NotificationType" (ser-notification-type (input52145 :notification-type)), "Version" "2010-12-01", "Action" action-name52146}}] (clojure.core/cond-> input52147 (clojure.core/contains? input52145 :sns-topic) (clojure.core/assoc-in [:body "SnsTopic"] (ser-notification-topic (input52145 :sns-topic))))))
(clojure.core/defn req<-set-identity-mail-from-domain-request [action-name52149 input52148] (clojure.core/let [input52150 {:body {"Identity" (ser-identity (input52148 :identity)), "Version" "2010-12-01", "Action" action-name52149}}] (clojure.core/cond-> input52150 (clojure.core/contains? input52148 :mail-from-domain) (clojure.core/assoc-in [:body "MailFromDomain"] (ser-mail-from-domain-name (input52148 :mail-from-domain))) (clojure.core/contains? input52148 :behavior-onmxfailure) (clojure.core/assoc-in [:body "BehaviorOnMXFailure"] (ser-behavior-onmxfailure (input52148 :behavior-onmxfailure))))))
(clojure.core/defn req<-get-identity-dkim-attributes-request [action-name52152 input52151] {:body {"Identities" (ser-identity-list (input52151 :identities)), "Version" "2010-12-01", "Action" action-name52152}})
(clojure.core/defn req<-update-configuration-set-sending-enabled-request [action-name52154 input52153] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52153 :configuration-set-name)), "Enabled" (ser-enabled (input52153 :enabled)), "Version" "2010-12-01", "Action" action-name52154}})
(clojure.core/defn req<-delete-receipt-filter-request [action-name52156 input52155] {:body {"FilterName" (ser-receipt-filter-name (input52155 :filter-name)), "Version" "2010-12-01", "Action" action-name52156}})
(clojure.core/defn req<-create-template-request [action-name52158 input52157] {:body {"Template" (ser-template (input52157 :template)), "Version" "2010-12-01", "Action" action-name52158}})
(clojure.core/defn req<-update-configuration-set-event-destination-request [action-name52160 input52159] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52159 :configuration-set-name)), "EventDestination" (ser-event-destination (input52159 :event-destination)), "Version" "2010-12-01", "Action" action-name52160}})
(clojure.core/defn req<-delete-identity-request [action-name52162 input52161] {:body {"Identity" (ser-identity (input52161 :identity)), "Version" "2010-12-01", "Action" action-name52162}})
(clojure.core/defn req<-verify-email-identity-request [action-name52164 input52163] {:body {"EmailAddress" (ser-address (input52163 :email-address)), "Version" "2010-12-01", "Action" action-name52164}})
(clojure.core/defn req<-reorder-receipt-rule-set-request [action-name52166 input52165] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52165 :rule-set-name)), "RuleNames" (ser-receipt-rule-names-list (input52165 :rule-names)), "Version" "2010-12-01", "Action" action-name52166}})
(clojure.core/defn req<-list-receipt-rule-sets-request [action-name52168 input52167] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name52168}} (clojure.core/contains? input52167 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input52167 :next-token)))))
(clojure.core/defn req<-describe-receipt-rule-request [action-name52170 input52169] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52169 :rule-set-name)), "RuleName" (ser-receipt-rule-name (input52169 :rule-name)), "Version" "2010-12-01", "Action" action-name52170}})
(clojure.core/defn req<-list-receipt-filters-request [action-name52172 input52171] nil)
(clojure.core/defn req<-clone-receipt-rule-set-request [action-name52174 input52173] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52173 :rule-set-name)), "OriginalRuleSetName" (ser-receipt-rule-set-name (input52173 :original-rule-set-name)), "Version" "2010-12-01", "Action" action-name52174}})
(clojure.core/defn req<-get-identity-notification-attributes-request [action-name52176 input52175] {:body {"Identities" (ser-identity-list (input52175 :identities)), "Version" "2010-12-01", "Action" action-name52176}})
(clojure.core/defn req<-send-custom-verification-email-request [action-name52178 input52177] (clojure.core/let [input52179 {:body {"EmailAddress" (ser-address (input52177 :email-address)), "TemplateName" (ser-template-name (input52177 :template-name)), "Version" "2010-12-01", "Action" action-name52178}}] (clojure.core/cond-> input52179 (clojure.core/contains? input52177 :configuration-set-name) (clojure.core/assoc-in [:body "ConfigurationSetName"] (ser-configuration-set-name (input52177 :configuration-set-name))))))
(clojure.core/defn req<-delete-receipt-rule-request [action-name52181 input52180] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52180 :rule-set-name)), "RuleName" (ser-receipt-rule-name (input52180 :rule-name)), "Version" "2010-12-01", "Action" action-name52181}})
(clojure.core/defn req<-create-configuration-set-event-destination-request [action-name52183 input52182] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52182 :configuration-set-name)), "EventDestination" (ser-event-destination (input52182 :event-destination)), "Version" "2010-12-01", "Action" action-name52183}})
(clojure.core/defn req<-verify-domain-identity-request [action-name52185 input52184] {:body {"Domain" (ser-domain (input52184 :domain)), "Version" "2010-12-01", "Action" action-name52185}})
(clojure.core/defn req<-get-custom-verification-email-template-request [action-name52187 input52186] {:body {"TemplateName" (ser-template-name (input52186 :template-name)), "Version" "2010-12-01", "Action" action-name52187}})
(clojure.core/defn req<-update-configuration-set-tracking-options-request [action-name52189 input52188] {:body {"ConfigurationSetName" (ser-configuration-set-name (input52188 :configuration-set-name)), "TrackingOptions" (ser-tracking-options (input52188 :tracking-options)), "Version" "2010-12-01", "Action" action-name52189}})
(clojure.core/defn req<-send-raw-email-request [action-name52191 input52190] (clojure.core/let [input52192 {:body {"RawMessage" (ser-raw-message (input52190 :raw-message)), "Version" "2010-12-01", "Action" action-name52191}}] (clojure.core/cond-> input52192 (clojure.core/contains? input52190 :source) (clojure.core/assoc-in [:body "Source"] (ser-address (input52190 :source))) (clojure.core/contains? input52190 :destinations) (clojure.core/assoc-in [:body "Destinations"] (ser-address-list (input52190 :destinations))) (clojure.core/contains? input52190 :from-arn) (clojure.core/assoc-in [:body "FromArn"] (ser-amazon-resource-name (input52190 :from-arn))) (clojure.core/contains? input52190 :source-arn) (clojure.core/assoc-in [:body "SourceArn"] (ser-amazon-resource-name (input52190 :source-arn))) (clojure.core/contains? input52190 :return-path-arn) (clojure.core/assoc-in [:body "ReturnPathArn"] (ser-amazon-resource-name (input52190 :return-path-arn))) (clojure.core/contains? input52190 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-message-tag-list (input52190 :tags))) (clojure.core/contains? input52190 :configuration-set-name) (clojure.core/assoc-in [:body "ConfigurationSetName"] (ser-configuration-set-name (input52190 :configuration-set-name))))))
(clojure.core/defn req<-update-custom-verification-email-template-request [action-name52194 input52193] (clojure.core/let [input52195 {:body {"TemplateName" (ser-template-name (input52193 :template-name)), "Version" "2010-12-01", "Action" action-name52194}}] (clojure.core/cond-> input52195 (clojure.core/contains? input52193 :from-email-address) (clojure.core/assoc-in [:body "FromEmailAddress"] (ser-from-address (input52193 :from-email-address))) (clojure.core/contains? input52193 :template-subject) (clojure.core/assoc-in [:body "TemplateSubject"] (ser-subject (input52193 :template-subject))) (clojure.core/contains? input52193 :template-content) (clojure.core/assoc-in [:body "TemplateContent"] (ser-template-content (input52193 :template-content))) (clojure.core/contains? input52193 :success-redirectionurl) (clojure.core/assoc-in [:body "SuccessRedirectionURL"] (ser-success-redirectionurl (input52193 :success-redirectionurl))) (clojure.core/contains? input52193 :failure-redirectionurl) (clojure.core/assoc-in [:body "FailureRedirectionURL"] (ser-failure-redirectionurl (input52193 :failure-redirectionurl))))))
(clojure.core/defn req<-set-receipt-rule-position-request [action-name52197 input52196] (clojure.core/let [input52198 {:body {"RuleSetName" (ser-receipt-rule-set-name (input52196 :rule-set-name)), "RuleName" (ser-receipt-rule-name (input52196 :rule-name)), "Version" "2010-12-01", "Action" action-name52197}}] (clojure.core/cond-> input52198 (clojure.core/contains? input52196 :after) (clojure.core/assoc-in [:body "After"] (ser-receipt-rule-name (input52196 :after))))))
(clojure.core/defn req<-create-receipt-rule-set-request [action-name52200 input52199] {:body {"RuleSetName" (ser-receipt-rule-set-name (input52199 :rule-set-name)), "Version" "2010-12-01", "Action" action-name52200}})
(clojure.core/defn req<-create-receipt-rule-request [action-name52202 input52201] (clojure.core/let [input52203 {:body {"RuleSetName" (ser-receipt-rule-set-name (input52201 :rule-set-name)), "Rule" (ser-receipt-rule (input52201 :rule)), "Version" "2010-12-01", "Action" action-name52202}}] (clojure.core/cond-> input52203 (clojure.core/contains? input52201 :after) (clojure.core/assoc-in [:body "After"] (ser-receipt-rule-name (input52201 :after))))))
(clojure.core/defn req<-get-template-request [action-name52205 input52204] {:body {"TemplateName" (ser-template-name (input52204 :template-name)), "Version" "2010-12-01", "Action" action-name52205}})

(clojure.spec.alpha/def :portkey.aws.email/counter clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.email/tracking-options-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.send-data-point/delivery-attempts (clojure.spec.alpha/and :portkey.aws.email/counter))
(clojure.spec.alpha/def :portkey.aws.email.send-data-point/bounces (clojure.spec.alpha/and :portkey.aws.email/counter))
(clojure.spec.alpha/def :portkey.aws.email.send-data-point/complaints (clojure.spec.alpha/and :portkey.aws.email/counter))
(clojure.spec.alpha/def :portkey.aws.email.send-data-point/rejects (clojure.spec.alpha/and :portkey.aws.email/counter))
(clojure.spec.alpha/def :portkey.aws.email/send-data-point (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/Timestamp :portkey.aws.email.send-data-point/DeliveryAttempts :portkey.aws.email.send-data-point/Bounces :portkey.aws.email.send-data-point/Complaints :portkey.aws.email.send-data-point/Rejects] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.event-destination/name (clojure.spec.alpha/and :portkey.aws.email/event-destination-name))
(clojure.spec.alpha/def :portkey.aws.email.event-destination/matching-event-types (clojure.spec.alpha/and :portkey.aws.email/event-types))
(clojure.spec.alpha/def :portkey.aws.email/event-destination (portkey.aws/json-keys :req-un [:portkey.aws.email.event-destination/Name :portkey.aws.email.event-destination/MatchingEventTypes] :opt-un [:portkey.aws.email/Enabled :portkey.aws.email/KinesisFirehoseDestination :portkey.aws.email/CloudWatchDestination :portkey.aws.email/SNSDestination] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.create-custom-verification-email-template-request/from-email-address (clojure.spec.alpha/and :portkey.aws.email/from-address))
(clojure.spec.alpha/def :portkey.aws.email.create-custom-verification-email-template-request/template-subject (clojure.spec.alpha/and :portkey.aws.email/subject))
(clojure.spec.alpha/def :portkey.aws.email/create-custom-verification-email-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName :portkey.aws.email.create-custom-verification-email-template-request/FromEmailAddress :portkey.aws.email.create-custom-verification-email-template-request/TemplateSubject :portkey.aws.email/TemplateContent :portkey.aws.email/SuccessRedirectionURL :portkey.aws.email/FailureRedirectionURL] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/sent-last24-hours clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email/create-template-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.update-custom-verification-email-template-request/from-email-address (clojure.spec.alpha/and :portkey.aws.email/from-address))
(clojure.spec.alpha/def :portkey.aws.email.update-custom-verification-email-template-request/template-subject (clojure.spec.alpha/and :portkey.aws.email/subject))
(clojure.spec.alpha/def :portkey.aws.email/update-custom-verification-email-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName] :opt-un [:portkey.aws.email.update-custom-verification-email-template-request/FromEmailAddress :portkey.aws.email.update-custom-verification-email-template-request/TemplateSubject :portkey.aws.email/TemplateContent :portkey.aws.email/SuccessRedirectionURL :portkey.aws.email/FailureRedirectionURL] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/tracking-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/CustomRedirectDomain] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/dimension-value-source {"messageTag" "messageTag", :message-tag "messageTag", "emailHeader" "emailHeader", :email-header "emailHeader", "linkTag" "linkTag", :link-tag "linkTag"})

(clojure.spec.alpha/def :portkey.aws.email/configuration-set-attribute {"eventDestinations" "eventDestinations", :event-destinations "eventDestinations", "trackingOptions" "trackingOptions", :tracking-options "trackingOptions", "reputationOptions" "reputationOptions", :reputation-options "reputationOptions"})

(clojure.spec.alpha/def :portkey.aws.email/list-custom-verification-email-templates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/CustomVerificationEmailTemplates :portkey.aws.email/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-rule-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.bounce-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.bounce-action/smtp-reply-code (clojure.spec.alpha/and :portkey.aws.email/bounce-smtp-reply-code))
(clojure.spec.alpha/def :portkey.aws.email.bounce-action/status-code (clojure.spec.alpha/and :portkey.aws.email/bounce-status-code))
(clojure.spec.alpha/def :portkey.aws.email.bounce-action/message (clojure.spec.alpha/and :portkey.aws.email/bounce-message))
(clojure.spec.alpha/def :portkey.aws.email.bounce-action/sender (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email/bounce-action (portkey.aws/json-keys :req-un [:portkey.aws.email.bounce-action/SmtpReplyCode :portkey.aws.email.bounce-action/Message :portkey.aws.email.bounce-action/Sender] :opt-un [:portkey.aws.email.bounce-action/TopicArn :portkey.aws.email.bounce-action/StatusCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/template-does-not-exist-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/TemplateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.already-exists-exception/name (clojure.spec.alpha/and :portkey.aws.email/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.already-exists-exception/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/list-receipt-rule-sets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/default-template-data (clojure.spec.alpha/and :portkey.aws.email/template-data))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/source (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/template (clojure.spec.alpha/and :portkey.aws.email/template-name))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/template-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/destinations (clojure.spec.alpha/and :portkey.aws.email/bulk-email-destination-list))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/default-tags (clojure.spec.alpha/and :portkey.aws.email/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email/send-bulk-templated-email-request (portkey.aws/json-keys :req-un [:portkey.aws.email.send-bulk-templated-email-request/Source :portkey.aws.email.send-bulk-templated-email-request/Template :portkey.aws.email.send-bulk-templated-email-request/Destinations] :opt-un [:portkey.aws.email.send-bulk-templated-email-request/DefaultTemplateData :portkey.aws.email/ConfigurationSetName :portkey.aws.email.send-bulk-templated-email-request/SourceArn :portkey.aws.email.send-bulk-templated-email-request/ReturnPathArn :portkey.aws.email.send-bulk-templated-email-request/ReturnPath :portkey.aws.email.send-bulk-templated-email-request/TemplateArn :portkey.aws.email.send-bulk-templated-email-request/DefaultTags :portkey.aws.email.send-bulk-templated-email-request/ReplyToAddresses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/send-templated-email-response (portkey.aws/json-keys :req-un [:portkey.aws.email/MessageId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/cidr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/message-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/behavior-onmxfailure {"UseDefaultValue" "UseDefaultValue", :use-default-value "UseDefaultValue", "RejectMessage" "RejectMessage", :reject-message "RejectMessage"})

(clojure.spec.alpha/def :portkey.aws.email.custom-verification-email-template-does-not-exist-exception/custom-verification-email-template-name (clojure.spec.alpha/and :portkey.aws.email/template-name))
(clojure.spec.alpha/def :portkey.aws.email/custom-verification-email-template-does-not-exist-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.custom-verification-email-template-does-not-exist-exception/CustomVerificationEmailTemplateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.custom-verification-email-template-already-exists-exception/custom-verification-email-template-name (clojure.spec.alpha/and :portkey.aws.email/template-name))
(clojure.spec.alpha/def :portkey.aws.email/custom-verification-email-template-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.custom-verification-email-template-already-exists-exception/CustomVerificationEmailTemplateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/invalid-tracking-options-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/dsn-action {"relayed" "relayed", :delayed "delayed", "delayed" "delayed", "failed" "failed", "delivered" "delivered", :delivered "delivered", :relayed "relayed", :expanded "expanded", "expanded" "expanded", :failed "failed"})

(clojure.spec.alpha/def :portkey.aws.email.message-dsn/extension-fields (clojure.spec.alpha/and :portkey.aws.email/extension-field-list))
(clojure.spec.alpha/def :portkey.aws.email/message-dsn (portkey.aws/json-keys :req-un [:portkey.aws.email/ReportingMta] :opt-un [:portkey.aws.email/ArrivalDate :portkey.aws.email.message-dsn/ExtensionFields] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/cloud-watch-dimension-configuration (portkey.aws/json-keys :req-un [:portkey.aws.email/DimensionName :portkey.aws.email/DimensionValueSource :portkey.aws.email/DefaultDimensionValue] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.send-custom-verification-email-request/email-address (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email/send-custom-verification-email-request (portkey.aws/json-keys :req-un [:portkey.aws.email.send-custom-verification-email-request/EmailAddress :portkey.aws.email/TemplateName] :opt-un [:portkey.aws.email/ConfigurationSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.bulk-email-destination/replacement-tags (clojure.spec.alpha/and :portkey.aws.email/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.bulk-email-destination/replacement-template-data (clojure.spec.alpha/and :portkey.aws.email/template-data))
(clojure.spec.alpha/def :portkey.aws.email/bulk-email-destination (portkey.aws/json-keys :req-un [:portkey.aws.email/Destination] :opt-un [:portkey.aws.email.bulk-email-destination/ReplacementTags :portkey.aws.email.bulk-email-destination/ReplacementTemplateData] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/template-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/create-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Template] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.list-receipt-rule-sets-response/rule-sets (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-sets-lists))
(clojure.spec.alpha/def :portkey.aws.email/list-receipt-rule-sets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.list-receipt-rule-sets-response/RuleSets :portkey.aws.email/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.receipt-filter/name (clojure.spec.alpha/and :portkey.aws.email/receipt-filter-name))
(clojure.spec.alpha/def :portkey.aws.email.receipt-filter/ip-filter (clojure.spec.alpha/and :portkey.aws.email/receipt-ip-filter))
(clojure.spec.alpha/def :portkey.aws.email/receipt-filter (portkey.aws/json-keys :req-un [:portkey.aws.email.receipt-filter/Name :portkey.aws.email.receipt-filter/IpFilter] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/invalidsnsdestination-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestinationName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.set-identity-mail-from-domain-request/mail-from-domain (clojure.spec.alpha/and :portkey.aws.email/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.email/set-identity-mail-from-domain-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity] :opt-un [:portkey.aws.email.set-identity-mail-from-domain-request/MailFromDomain :portkey.aws.email/BehaviorOnMXFailure] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/max-send-rate clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email/message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/put-identity-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity :portkey.aws.email/PolicyName :portkey.aws.email/Policy] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.list-identity-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.email/policy-name-list))
(clojure.spec.alpha/def :portkey.aws.email/list-identity-policies-response (portkey.aws/json-keys :req-un [:portkey.aws.email.list-identity-policies-response/PolicyNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/mail-from-domain-not-verified-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/add-header-action (portkey.aws/json-keys :req-un [:portkey.aws.email/HeaderName :portkey.aws.email/HeaderValue] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/policy-map (clojure.spec.alpha/map-of :portkey.aws.email/policy-name :portkey.aws.email/policy))

(clojure.spec.alpha/def :portkey.aws.email.invalids3-configuration-exception/bucket (clojure.spec.alpha/and :portkey.aws.email/s3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.email/invalids3-configuration-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.invalids3-configuration-exception/Bucket] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.describe-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.describe-receipt-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email/describe-receipt-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.email.describe-receipt-rule-request/RuleSetName :portkey.aws.email.describe-receipt-rule-request/RuleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/header-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/extension-field-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.cloud-watch-destination/dimension-configurations (clojure.spec.alpha/and :portkey.aws.email/cloud-watch-dimension-configurations))
(clojure.spec.alpha/def :portkey.aws.email/cloud-watch-destination (portkey.aws/json-keys :req-un [:portkey.aws.email.cloud-watch-destination/DimensionConfigurations] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.get-identity-policies-response/policies (clojure.spec.alpha/and :portkey.aws.email/policy-map))
(clojure.spec.alpha/def :portkey.aws.email/get-identity-policies-response (portkey.aws/json-keys :req-un [:portkey.aws.email.get-identity-policies-response/Policies] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.configuration-set/name (clojure.spec.alpha/and :portkey.aws.email/configuration-set-name))
(clojure.spec.alpha/def :portkey.aws.email/configuration-set (portkey.aws/json-keys :req-un [:portkey.aws.email.configuration-set/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.email/identity-list (clojure.spec.alpha/coll-of :portkey.aws.email/identity))

(clojure.spec.alpha/def :portkey.aws.email.get-send-statistics-response/send-data-points (clojure.spec.alpha/and :portkey.aws.email/send-data-point-list))
(clojure.spec.alpha/def :portkey.aws.email/get-send-statistics-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.get-send-statistics-response/SendDataPoints] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/S3Action :portkey.aws.email/BounceAction :portkey.aws.email/WorkmailAction :portkey.aws.email/LambdaAction :portkey.aws.email/StopAction :portkey.aws.email/AddHeaderAction :portkey.aws.email/SNSAction] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.body/text (clojure.spec.alpha/and :portkey.aws.email/content))
(clojure.spec.alpha/def :portkey.aws.email.body/html (clojure.spec.alpha/and :portkey.aws.email/content))
(clojure.spec.alpha/def :portkey.aws.email/body (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.body/Text :portkey.aws.email.body/Html] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.workmail-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.workmail-action/organization-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/workmail-action (portkey.aws/json-keys :req-un [:portkey.aws.email.workmail-action/OrganizationArn] :opt-un [:portkey.aws.email.workmail-action/TopicArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/verify-domain-identity-response (portkey.aws/json-keys :req-un [:portkey.aws.email/VerificationToken] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/amazon-resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.identity-dkim-attributes/dkim-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email.identity-dkim-attributes/dkim-verification-status (clojure.spec.alpha/and :portkey.aws.email/verification-status))
(clojure.spec.alpha/def :portkey.aws.email.identity-dkim-attributes/dkim-tokens (clojure.spec.alpha/and :portkey.aws.email/verification-token-list))
(clojure.spec.alpha/def :portkey.aws.email/identity-dkim-attributes (portkey.aws/json-keys :req-un [:portkey.aws.email.identity-dkim-attributes/DkimEnabled :portkey.aws.email.identity-dkim-attributes/DkimVerificationStatus] :opt-un [:portkey.aws.email.identity-dkim-attributes/DkimTokens] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.invalid-sns-topic-exception/topic (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/invalid-sns-topic-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.invalid-sns-topic-exception/Topic] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.list-templates-response/templates-metadata (clojure.spec.alpha/and :portkey.aws.email/template-metadata-list))
(clojure.spec.alpha/def :portkey.aws.email/list-templates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.list-templates-response/TemplatesMetadata :portkey.aws.email/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/arrival-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email/event-destination-does-not-exist-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestinationName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/bulk-email-destination-list (clojure.spec.alpha/coll-of :portkey.aws.email/bulk-email-destination))

(clojure.spec.alpha/def :portkey.aws.email/template-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.email/template-metadata))

(clojure.spec.alpha/def :portkey.aws.email/invalid-configuration-set-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/get-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.create-receipt-filter-request/filter (clojure.spec.alpha/and :portkey.aws.email/receipt-filter))
(clojure.spec.alpha/def :portkey.aws.email/create-receipt-filter-request (portkey.aws/json-keys :req-un [:portkey.aws.email.create-receipt-filter-request/Filter] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-receipt-filter-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/rendered-template (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/set-identity-feedback-forwarding-enabled-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/default-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/stop-scope {"RuleSet" "RuleSet", :rule-set "RuleSet"})

(clojure.spec.alpha/def :portkey.aws.email/verification-attributes (clojure.spec.alpha/map-of :portkey.aws.email/identity :portkey.aws.email/identity-verification-attributes))

(clojure.spec.alpha/def :portkey.aws.email/list-identity-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-receipt-rule-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.destination/to-addresses (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email.destination/cc-addresses (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email.destination/bcc-addresses (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email/destination (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.destination/ToAddresses :portkey.aws.email.destination/CcAddresses :portkey.aws.email.destination/BccAddresses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.get-identity-notification-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email/identity-list))
(clojure.spec.alpha/def :portkey.aws.email/get-identity-notification-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.email.get-identity-notification-attributes-request/Identities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/s3-bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/template (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName] :opt-un [:portkey.aws.email/SubjectPart :portkey.aws.email/TextPart :portkey.aws.email/HtmlPart] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/put-identity-policy-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.verify-email-identity-request/email-address (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email/verify-email-identity-request (portkey.aws/json-keys :req-un [:portkey.aws.email.verify-email-identity-request/EmailAddress] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.template-metadata/name (clojure.spec.alpha/and :portkey.aws.email/template-name))
(clojure.spec.alpha/def :portkey.aws.email.template-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.email/timestamp))
(clojure.spec.alpha/def :portkey.aws.email/template-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.template-metadata/Name :portkey.aws.email.template-metadata/CreatedTimestamp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.verify-domain-dkim-response/dkim-tokens (clojure.spec.alpha/and :portkey.aws.email/verification-token-list))
(clojure.spec.alpha/def :portkey.aws.email/verify-domain-dkim-response (portkey.aws/json-keys :req-un [:portkey.aws.email.verify-domain-dkim-response/DkimTokens] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/raw-message-data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.email/send-email-response (portkey.aws/json-keys :req-un [:portkey.aws.email/MessageId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/set-identity-headers-in-notifications-enabled-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity :portkey.aws.email/NotificationType :portkey.aws.email/Enabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/configuration-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/notification-attributes (clojure.spec.alpha/map-of :portkey.aws.email/identity :portkey.aws.email/identity-notification-attributes))

(clojure.spec.alpha/def :portkey.aws.email/configuration-sets (clojure.spec.alpha/coll-of :portkey.aws.email/configuration-set))

(clojure.spec.alpha/def :portkey.aws.email/notification-type {"Bounce" "Bounce", :bounce "Bounce", "Complaint" "Complaint", :complaint "Complaint", "Delivery" "Delivery", :delivery "Delivery"})

(clojure.spec.alpha/def :portkey.aws.email/create-configuration-set-tracking-options-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/TrackingOptions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/bounce-type {"Undefined" "Undefined", "ExceededQuota" "ExceededQuota", :exceeded-quota "ExceededQuota", "ContentRejected" "ContentRejected", "DoesNotExist" "DoesNotExist", "TemporaryFailure" "TemporaryFailure", "MessageTooLarge" "MessageTooLarge", :undefined "Undefined", :message-too-large "MessageTooLarge", :does-not-exist "DoesNotExist", :temporary-failure "TemporaryFailure", :content-rejected "ContentRejected"})

(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/source (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/tags (clojure.spec.alpha/and :portkey.aws.email/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/template (clojure.spec.alpha/and :portkey.aws.email/template-name))
(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/template-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-templated-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email/send-templated-email-request (portkey.aws/json-keys :req-un [:portkey.aws.email.send-templated-email-request/Source :portkey.aws.email/Destination :portkey.aws.email.send-templated-email-request/Template :portkey.aws.email/TemplateData] :opt-un [:portkey.aws.email.send-templated-email-request/Tags :portkey.aws.email/ConfigurationSetName :portkey.aws.email.send-templated-email-request/SourceArn :portkey.aws.email.send-templated-email-request/ReturnPathArn :portkey.aws.email.send-templated-email-request/ReturnPath :portkey.aws.email.send-templated-email-request/TemplateArn :portkey.aws.email.send-templated-email-request/ReplyToAddresses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.send-raw-email-request/source (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-raw-email-request/destinations (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email.send-raw-email-request/from-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-raw-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-raw-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-raw-email-request/tags (clojure.spec.alpha/and :portkey.aws.email/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email/send-raw-email-request (portkey.aws/json-keys :req-un [:portkey.aws.email/RawMessage] :opt-un [:portkey.aws.email.send-raw-email-request/Source :portkey.aws.email.send-raw-email-request/Destinations :portkey.aws.email.send-raw-email-request/FromArn :portkey.aws.email.send-raw-email-request/SourceArn :portkey.aws.email.send-raw-email-request/ReturnPathArn :portkey.aws.email.send-raw-email-request/Tags :portkey.aws.email/ConfigurationSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.bounced-recipient-info/recipient (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.bounced-recipient-info/recipient-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/bounced-recipient-info (portkey.aws/json-keys :req-un [:portkey.aws.email.bounced-recipient-info/Recipient] :opt-un [:portkey.aws.email.bounced-recipient-info/RecipientArn :portkey.aws.email/BounceType :portkey.aws.email/RecipientDsnFields] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/verification-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.describe-receipt-rule-set-response/metadata (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-metadata))
(clojure.spec.alpha/def :portkey.aws.email.describe-receipt-rule-set-response/rules (clojure.spec.alpha/and :portkey.aws.email/receipt-rules-list))
(clojure.spec.alpha/def :portkey.aws.email/describe-receipt-rule-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.describe-receipt-rule-set-response/Metadata :portkey.aws.email.describe-receipt-rule-set-response/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/extension-field-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/test-render-template-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/RenderedTemplate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/update-configuration-set-sending-enabled-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/Enabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/custom-verification-email-invalid-content-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-rule-sets-lists (clojure.spec.alpha/coll-of :portkey.aws.email/receipt-rule-set-metadata))

(clojure.spec.alpha/def :portkey.aws.email/list-configuration-sets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSets :portkey.aws.email/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/custom-redirect-domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/html-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.email/dkim-attributes (clojure.spec.alpha/map-of :portkey.aws.email/identity :portkey.aws.email/identity-dkim-attributes))

(clojure.spec.alpha/def :portkey.aws.email.set-identity-feedback-forwarding-enabled-request/forwarding-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email/set-identity-feedback-forwarding-enabled-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity :portkey.aws.email.set-identity-feedback-forwarding-enabled-request/ForwardingEnabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/event-type {:open "open", "send" "send", "delivery" "delivery", :complaint "complaint", :delivery "delivery", "click" "click", "renderingFailure" "renderingFailure", :bounce "bounce", :click "click", "complaint" "complaint", "bounce" "bounce", :send "send", :reject "reject", "reject" "reject", "open" "open", :rendering-failure "renderingFailure"})

(clojure.spec.alpha/def :portkey.aws.email/create-configuration-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/dsn-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/configuration-set-sending-paused-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/send-data-point-list (clojure.spec.alpha/coll-of :portkey.aws.email/send-data-point))

(clojure.spec.alpha/def :portkey.aws.email/configuration-set-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/update-configuration-set-tracking-options-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/address-list (clojure.spec.alpha/coll-of :portkey.aws.email/address))

(clojure.spec.alpha/def :portkey.aws.email/configuration-set-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.email/configuration-set-attribute))

(clojure.spec.alpha/def :portkey.aws.email/invalid-rendering-parameter-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/TemplateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-configuration-set-event-destination-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestinationName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/list-receipt-filters-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.recipient-dsn-fields/final-recipient (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.recipient-dsn-fields/action (clojure.spec.alpha/and :portkey.aws.email/dsn-action))
(clojure.spec.alpha/def :portkey.aws.email.recipient-dsn-fields/status (clojure.spec.alpha/and :portkey.aws.email/dsn-status))
(clojure.spec.alpha/def :portkey.aws.email.recipient-dsn-fields/extension-fields (clojure.spec.alpha/and :portkey.aws.email/extension-field-list))
(clojure.spec.alpha/def :portkey.aws.email/recipient-dsn-fields (portkey.aws/json-keys :req-un [:portkey.aws.email.recipient-dsn-fields/Action :portkey.aws.email.recipient-dsn-fields/Status] :opt-un [:portkey.aws.email.recipient-dsn-fields/FinalRecipient :portkey.aws.email/RemoteMta :portkey.aws.email/DiagnosticCode :portkey.aws.email/LastAttemptDate :portkey.aws.email.recipient-dsn-fields/ExtensionFields] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.get-identity-verification-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email/identity-list))
(clojure.spec.alpha/def :portkey.aws.email/get-identity-verification-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.email.get-identity-verification-attributes-request/Identities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/header-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/message-rejected (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/snsaction-encoding {"UTF-8" "UTF-8", :utf-8 "UTF-8", "Base64" "Base64", :base64 "Base64"})

(clojure.spec.alpha/def :portkey.aws.email/event-destination-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestinationName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-identity-policy-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/describe-active-receipt-rule-set-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/custom-verification-email-templates (clojure.spec.alpha/coll-of :portkey.aws.email/custom-verification-email-template))

(clojure.spec.alpha/def :portkey.aws.email.snsaction/topic-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.snsaction/encoding (clojure.spec.alpha/and :portkey.aws.email/snsaction-encoding))
(clojure.spec.alpha/def :portkey.aws.email/snsaction (portkey.aws/json-keys :req-un [:portkey.aws.email.snsaction/TopicArn] :opt-un [:portkey.aws.email.snsaction/Encoding] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/identity-verification-attributes (portkey.aws/json-keys :req-un [:portkey.aws.email/VerificationStatus] :opt-un [:portkey.aws.email/VerificationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.describe-configuration-set-request/configuration-set-attribute-names (clojure.spec.alpha/and :portkey.aws.email/configuration-set-attribute-list))
(clojure.spec.alpha/def :portkey.aws.email/describe-configuration-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName] :opt-un [:portkey.aws.email.describe-configuration-set-request/ConfigurationSetAttributeNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.message-tag/name (clojure.spec.alpha/and :portkey.aws.email/message-tag-name))
(clojure.spec.alpha/def :portkey.aws.email.message-tag/value (clojure.spec.alpha/and :portkey.aws.email/message-tag-value))
(clojure.spec.alpha/def :portkey.aws.email/message-tag (portkey.aws/json-keys :req-un [:portkey.aws.email.message-tag/Name :portkey.aws.email.message-tag/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/get-send-quota-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/Max24HourSend :portkey.aws.email/MaxSendRate :portkey.aws.email/SentLast24Hours] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/get-account-sending-enabled-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/reporting-mta (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/invalid-firehose-destination-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestinationName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.identity-mail-from-domain-attributes/mail-from-domain (clojure.spec.alpha/and :portkey.aws.email/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.email.identity-mail-from-domain-attributes/mail-from-domain-status (clojure.spec.alpha/and :portkey.aws.email/custom-mail-from-status))
(clojure.spec.alpha/def :portkey.aws.email/identity-mail-from-domain-attributes (portkey.aws/json-keys :req-un [:portkey.aws.email.identity-mail-from-domain-attributes/MailFromDomain :portkey.aws.email.identity-mail-from-domain-attributes/MailFromDomainStatus :portkey.aws.email/BehaviorOnMXFailure] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-filter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/update-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Template] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.bulk-email-destination-status/status (clojure.spec.alpha/and :portkey.aws.email/bulk-email-status))
(clojure.spec.alpha/def :portkey.aws.email/bulk-email-destination-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.bulk-email-destination-status/Status :portkey.aws.email/Error :portkey.aws.email/MessageId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.describe-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/describe-receipt-rule-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email.describe-receipt-rule-set-request/RuleSetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.get-identity-dkim-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email/identity-list))
(clojure.spec.alpha/def :portkey.aws.email/get-identity-dkim-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.email.get-identity-dkim-attributes-request/Identities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/get-identity-verification-attributes-response (portkey.aws/json-keys :req-un [:portkey.aws.email/VerificationAttributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-identity-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-configuration-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/last-fresh-start clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email/delete-configuration-set-tracking-options-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/set-identity-notification-topic-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/update-account-sending-enabled-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/set-active-receipt-rule-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/message-tag-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/list-custom-verification-email-templates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/NextToken :portkey.aws.email/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/text-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.create-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.create-receipt-rule-request/after (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.create-receipt-rule-request/rule (clojure.spec.alpha/and :portkey.aws.email/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email/create-receipt-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.email.create-receipt-rule-request/RuleSetName :portkey.aws.email.create-receipt-rule-request/Rule] :opt-un [:portkey.aws.email.create-receipt-rule-request/After] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/list-configuration-sets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/NextToken :portkey.aws.email/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/send-bounce-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/MessageId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/clone-receipt-rule-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.set-receipt-rule-position-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.set-receipt-rule-position-request/rule-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.set-receipt-rule-position-request/after (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email/set-receipt-rule-position-request (portkey.aws/json-keys :req-un [:portkey.aws.email.set-receipt-rule-position-request/RuleSetName :portkey.aws.email.set-receipt-rule-position-request/RuleName] :opt-un [:portkey.aws.email.set-receipt-rule-position-request/After] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.delete-receipt-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.email/receipt-filter-name))
(clojure.spec.alpha/def :portkey.aws.email/delete-receipt-filter-request (portkey.aws/json-keys :req-un [:portkey.aws.email.delete-receipt-filter-request/FilterName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.verify-email-address-request/email-address (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email/verify-email-address-request (portkey.aws/json-keys :req-un [:portkey.aws.email.verify-email-address-request/EmailAddress] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/event-destination-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/tls-policy {"Require" "Require", :require "Require", "Optional" "Optional", :optional "Optional"})

(clojure.spec.alpha/def :portkey.aws.email/get-identity-dkim-attributes-response (portkey.aws/json-keys :req-un [:portkey.aws.email/DkimAttributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/recipient (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.message/subject (clojure.spec.alpha/and :portkey.aws.email/content))
(clojure.spec.alpha/def :portkey.aws.email/message (portkey.aws/json-keys :req-un [:portkey.aws.email.message/Subject :portkey.aws.email/Body] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.get-custom-verification-email-template-response/from-email-address (clojure.spec.alpha/and :portkey.aws.email/from-address))
(clojure.spec.alpha/def :portkey.aws.email.get-custom-verification-email-template-response/template-subject (clojure.spec.alpha/and :portkey.aws.email/subject))
(clojure.spec.alpha/def :portkey.aws.email/get-custom-verification-email-template-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/TemplateName :portkey.aws.email.get-custom-verification-email-template-response/FromEmailAddress :portkey.aws.email.get-custom-verification-email-template-response/TemplateSubject :portkey.aws.email/TemplateContent :portkey.aws.email/SuccessRedirectionURL :portkey.aws.email/FailureRedirectionURL] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/update-configuration-set-event-destination-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/send-custom-verification-email-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/MessageId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.rule-does-not-exist-exception/name (clojure.spec.alpha/and :portkey.aws.email/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/rule-does-not-exist-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.rule-does-not-exist-exception/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/invocation-type {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse"})

(clojure.spec.alpha/def :portkey.aws.email/verify-domain-dkim-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Domain] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/verify-domain-identity-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Domain] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/mail-from-domain-attributes (clojure.spec.alpha/map-of :portkey.aws.email/identity :portkey.aws.email/identity-mail-from-domain-attributes))

(clojure.spec.alpha/def :portkey.aws.email/get-identity-notification-attributes-response (portkey.aws/json-keys :req-un [:portkey.aws.email/NotificationAttributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/account-sending-paused-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/last-attempt-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.receipt-rule/name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.receipt-rule/recipients (clojure.spec.alpha/and :portkey.aws.email/recipients-list))
(clojure.spec.alpha/def :portkey.aws.email.receipt-rule/actions (clojure.spec.alpha/and :portkey.aws.email/receipt-actions-list))
(clojure.spec.alpha/def :portkey.aws.email.receipt-rule/scan-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email/receipt-rule (portkey.aws/json-keys :req-un [:portkey.aws.email.receipt-rule/Name] :opt-un [:portkey.aws.email/Enabled :portkey.aws.email/TlsPolicy :portkey.aws.email.receipt-rule/Recipients :portkey.aws.email.receipt-rule/Actions :portkey.aws.email.receipt-rule/ScanEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/create-receipt-rule-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/message-tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.custom-verification-email-template/from-email-address (clojure.spec.alpha/and :portkey.aws.email/from-address))
(clojure.spec.alpha/def :portkey.aws.email.custom-verification-email-template/template-subject (clojure.spec.alpha/and :portkey.aws.email/subject))
(clojure.spec.alpha/def :portkey.aws.email/custom-verification-email-template (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/TemplateName :portkey.aws.email.custom-verification-email-template/FromEmailAddress :portkey.aws.email.custom-verification-email-template/TemplateSubject :portkey.aws.email/SuccessRedirectionURL :portkey.aws.email/FailureRedirectionURL] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.content/data (clojure.spec.alpha/and :portkey.aws.email/message-data))
(clojure.spec.alpha/def :portkey.aws.email/content (portkey.aws/json-keys :req-un [:portkey.aws.email.content/Data] :opt-un [:portkey.aws.email/Charset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/identity-type {"EmailAddress" "EmailAddress", :email-address "EmailAddress", "Domain" "Domain", :domain "Domain"})

(clojure.spec.alpha/def :portkey.aws.email.invalid-lambda-function-exception/function-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/invalid-lambda-function-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.invalid-lambda-function-exception/FunctionArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/create-configuration-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSet] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.delete-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/delete-receipt-rule-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email.delete-receipt-rule-set-request/RuleSetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.set-identity-notification-topic-request/sns-topic (clojure.spec.alpha/and :portkey.aws.email/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email/set-identity-notification-topic-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity :portkey.aws.email/NotificationType] :opt-un [:portkey.aws.email.set-identity-notification-topic-request/SnsTopic] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-configuration-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.send-bulk-templated-email-response/status (clojure.spec.alpha/and :portkey.aws.email/bulk-email-destination-status-list))
(clojure.spec.alpha/def :portkey.aws.email/send-bulk-templated-email-response (portkey.aws/json-keys :req-un [:portkey.aws.email.send-bulk-templated-email-response/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.reputation-options/sending-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email.reputation-options/reputation-metrics-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email/reputation-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.reputation-options/SendingEnabled :portkey.aws.email.reputation-options/ReputationMetricsEnabled :portkey.aws.email/LastFreshStart] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.describe-receipt-rule-response/rule (clojure.spec.alpha/and :portkey.aws.email/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email/describe-receipt-rule-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.describe-receipt-rule-response/Rule] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/invalid-cloud-watch-destination-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestinationName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/bounce-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/delete-custom-verification-email-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/explanation (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/update-configuration-set-event-destination-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestination] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/create-configuration-set-event-destination-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/EventDestination] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/extension-field-list (clojure.spec.alpha/coll-of :portkey.aws.email/extension-field))

(clojure.spec.alpha/def :portkey.aws.email/identity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/get-custom-verification-email-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/max-items clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.email/s3-key-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/template-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.get-identity-policies-request/policy-names (clojure.spec.alpha/and :portkey.aws.email/policy-name-list))
(clojure.spec.alpha/def :portkey.aws.email/get-identity-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity :portkey.aws.email.get-identity-policies-request/PolicyNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.kinesis-firehose-destination/iamrolearn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.kinesis-firehose-destination/delivery-streamarn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/kinesis-firehose-destination (portkey.aws/json-keys :req-un [:portkey.aws.email.kinesis-firehose-destination/IAMRoleARN :portkey.aws.email.kinesis-firehose-destination/DeliveryStreamARN] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/verification-status {"Failed" "Failed", "NotStarted" "NotStarted", :pending "Pending", "TemporaryFailure" "TemporaryFailure", "Success" "Success", :success "Success", :temporary-failure "TemporaryFailure", :not-started "NotStarted", "Pending" "Pending", :failed "Failed"})

(clojure.spec.alpha/def :portkey.aws.email.reorder-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.reorder-receipt-rule-set-request/rule-names (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-names-list))
(clojure.spec.alpha/def :portkey.aws.email/reorder-receipt-rule-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email.reorder-receipt-rule-set-request/RuleSetName :portkey.aws.email.reorder-receipt-rule-set-request/RuleNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.list-identities-response/identities (clojure.spec.alpha/and :portkey.aws.email/identity-list))
(clojure.spec.alpha/def :portkey.aws.email/list-identities-response (portkey.aws/json-keys :req-un [:portkey.aws.email.list-identities-response/Identities] :opt-un [:portkey.aws.email/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.list-verified-email-addresses-response/verified-email-addresses (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email/list-verified-email-addresses-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.list-verified-email-addresses-response/VerifiedEmailAddresses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.clone-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.clone-receipt-rule-set-request/original-rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/clone-receipt-rule-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email.clone-receipt-rule-set-request/RuleSetName :portkey.aws.email.clone-receipt-rule-set-request/OriginalRuleSetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-template-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/message-tag-list (clojure.spec.alpha/coll-of :portkey.aws.email/message-tag))

(clojure.spec.alpha/def :portkey.aws.email/bounced-recipient-info-list (clojure.spec.alpha/coll-of :portkey.aws.email/bounced-recipient-info))

(clojure.spec.alpha/def :portkey.aws.email/invalid-policy-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/notification-topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.describe-active-receipt-rule-set-response/metadata (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-metadata))
(clojure.spec.alpha/def :portkey.aws.email.describe-active-receipt-rule-set-response/rules (clojure.spec.alpha/and :portkey.aws.email/receipt-rules-list))
(clojure.spec.alpha/def :portkey.aws.email/describe-active-receipt-rule-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.describe-active-receipt-rule-set-response/Metadata :portkey.aws.email.describe-active-receipt-rule-set-response/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/cloud-watch-dimension-configurations (clojure.spec.alpha/coll-of :portkey.aws.email/cloud-watch-dimension-configuration))

(clojure.spec.alpha/def :portkey.aws.email/event-types (clojure.spec.alpha/coll-of :portkey.aws.email/event-type))

(clojure.spec.alpha/def :portkey.aws.email/bulk-email-status {"ConfigurationSetDoesNotExist" "ConfigurationSetDoesNotExist", "Failed" "Failed", :invalid-parameter-value "InvalidParameterValue", "AccountThrottled" "AccountThrottled", "InvalidParameterValue" "InvalidParameterValue", "ConfigurationSetSendingPaused" "ConfigurationSetSendingPaused", :configuration-set-sending-paused "ConfigurationSetSendingPaused", :invalid-sending-pool-name "InvalidSendingPoolName", "InvalidSendingPoolName" "InvalidSendingPoolName", :account-throttled "AccountThrottled", "AccountSuspended" "AccountSuspended", :message-rejected "MessageRejected", :transient-failure "TransientFailure", "MessageRejected" "MessageRejected", "AccountSendingPaused" "AccountSendingPaused", "AccountDailyQuotaExceeded" "AccountDailyQuotaExceeded", "Success" "Success", :configuration-set-does-not-exist "ConfigurationSetDoesNotExist", "MailFromDomainNotVerified" "MailFromDomainNotVerified", :success "Success", :mail-from-domain-not-verified "MailFromDomainNotVerified", :template-does-not-exist "TemplateDoesNotExist", :account-daily-quota-exceeded "AccountDailyQuotaExceeded", :account-suspended "AccountSuspended", "TransientFailure" "TransientFailure", :account-sending-paused "AccountSendingPaused", "TemplateDoesNotExist" "TemplateDoesNotExist", :failed "Failed"})

(clojure.spec.alpha/def :portkey.aws.email.list-receipt-filters-response/filters (clojure.spec.alpha/and :portkey.aws.email/receipt-filter-list))
(clojure.spec.alpha/def :portkey.aws.email/list-receipt-filters-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.list-receipt-filters-response/Filters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/from-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/receipt-actions-list (clojure.spec.alpha/coll-of :portkey.aws.email/receipt-action))

(clojure.spec.alpha/def :portkey.aws.email/production-access-not-granted-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.identity-notification-attributes/bounce-topic (clojure.spec.alpha/and :portkey.aws.email/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.identity-notification-attributes/complaint-topic (clojure.spec.alpha/and :portkey.aws.email/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.identity-notification-attributes/delivery-topic (clojure.spec.alpha/and :portkey.aws.email/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.identity-notification-attributes/forwarding-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email.identity-notification-attributes/headers-in-bounce-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email.identity-notification-attributes/headers-in-complaint-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email.identity-notification-attributes/headers-in-delivery-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email/identity-notification-attributes (portkey.aws/json-keys :req-un [:portkey.aws.email.identity-notification-attributes/BounceTopic :portkey.aws.email.identity-notification-attributes/ComplaintTopic :portkey.aws.email.identity-notification-attributes/DeliveryTopic :portkey.aws.email.identity-notification-attributes/ForwardingEnabled] :opt-un [:portkey.aws.email.identity-notification-attributes/HeadersInBounceNotificationsEnabled :portkey.aws.email.identity-notification-attributes/HeadersInComplaintNotificationsEnabled :portkey.aws.email.identity-notification-attributes/HeadersInDeliveryNotificationsEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/charset (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/get-template-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/Template] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-receipt-rule-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/success-redirectionurl (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/delete-configuration-set-event-destination-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__)))))

(clojure.spec.alpha/def :portkey.aws.email/create-configuration-set-tracking-options-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.email/delete-identity-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/set-receipt-rule-position-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.receipt-rule-set-metadata/name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.receipt-rule-set-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.email/timestamp))
(clojure.spec.alpha/def :portkey.aws.email/receipt-rule-set-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.receipt-rule-set-metadata/Name :portkey.aws.email.receipt-rule-set-metadata/CreatedTimestamp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/error (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.snsdestination/topicarn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/snsdestination (portkey.aws/json-keys :req-un [:portkey.aws.email.snsdestination/TopicARN] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/missing-rendering-attribute-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/TemplateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-rules-list (clojure.spec.alpha/coll-of :portkey.aws.email/receipt-rule))

(clojure.spec.alpha/def :portkey.aws.email.delete-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.delete-receipt-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email/delete-receipt-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.email.delete-receipt-rule-request/RuleSetName :portkey.aws.email.delete-receipt-rule-request/RuleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/bounce-status-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/delete-configuration-set-tracking-options-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/event-destinations (clojure.spec.alpha/coll-of :portkey.aws.email/event-destination))

(clojure.spec.alpha/def :portkey.aws.email.update-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.update-receipt-rule-request/rule (clojure.spec.alpha/and :portkey.aws.email/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email/update-receipt-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.email.update-receipt-rule-request/RuleSetName :portkey.aws.email.update-receipt-rule-request/Rule] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.from-email-address-not-verified-exception/from-email-address (clojure.spec.alpha/and :portkey.aws.email/from-address))
(clojure.spec.alpha/def :portkey.aws.email/from-email-address-not-verified-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.from-email-address-not-verified-exception/FromEmailAddress] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.create-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/create-receipt-rule-set-request (portkey.aws/json-keys :req-un [:portkey.aws.email.create-receipt-rule-set-request/RuleSetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/failure-redirectionurl (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/describe-configuration-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSet :portkey.aws.email/EventDestinations :portkey.aws.email/TrackingOptions :portkey.aws.email/ReputationOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/configuration-set-does-not-exist-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/verify-email-identity-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.send-email-request/source (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-email-request/tags (clojure.spec.alpha/and :portkey.aws.email/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.send-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.send-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email/address-list))
(clojure.spec.alpha/def :portkey.aws.email/send-email-request (portkey.aws/json-keys :req-un [:portkey.aws.email.send-email-request/Source :portkey.aws.email/Destination :portkey.aws.email/Message] :opt-un [:portkey.aws.email.send-email-request/Tags :portkey.aws.email/ConfigurationSetName :portkey.aws.email.send-email-request/SourceArn :portkey.aws.email.send-email-request/ReturnPathArn :portkey.aws.email.send-email-request/ReturnPath :portkey.aws.email.send-email-request/ReplyToAddresses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.raw-message/data (clojure.spec.alpha/and :portkey.aws.email/raw-message-data))
(clojure.spec.alpha/def :portkey.aws.email/raw-message (portkey.aws/json-keys :req-un [:portkey.aws.email.raw-message/Data] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/tracking-options-does-not-exist-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/ConfigurationSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.extension-field/name (clojure.spec.alpha/and :portkey.aws.email/extension-field-name))
(clojure.spec.alpha/def :portkey.aws.email.extension-field/value (clojure.spec.alpha/and :portkey.aws.email/extension-field-value))
(clojure.spec.alpha/def :portkey.aws.email/extension-field (portkey.aws/json-keys :req-un [:portkey.aws.email.extension-field/Name :portkey.aws.email.extension-field/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-filter-policy {"Block" "Block", :block "Block", "Allow" "Allow", :allow "Allow"})

(clojure.spec.alpha/def :portkey.aws.email/list-templates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/NextToken :portkey.aws.email/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/update-configuration-set-tracking-options-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/TrackingOptions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/get-identity-mail-from-domain-attributes-response (portkey.aws/json-keys :req-un [:portkey.aws.email/MailFromDomainAttributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.cannot-delete-exception/name (clojure.spec.alpha/and :portkey.aws.email/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/cannot-delete-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.cannot-delete-exception/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/set-identity-headers-in-notifications-enabled-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.stop-action/scope (clojure.spec.alpha/and :portkey.aws.email/stop-scope))
(clojure.spec.alpha/def :portkey.aws.email.stop-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/stop-action (portkey.aws/json-keys :req-un [:portkey.aws.email.stop-action/Scope] :opt-un [:portkey.aws.email.stop-action/TopicArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/create-receipt-filter-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/reorder-receipt-rule-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-filter-list (clojure.spec.alpha/coll-of :portkey.aws.email/receipt-filter))

(clojure.spec.alpha/def :portkey.aws.email/template-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 262144))))

(clojure.spec.alpha/def :portkey.aws.email/update-template-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.lambda-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.lambda-action/function-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/lambda-action (portkey.aws/json-keys :req-un [:portkey.aws.email.lambda-action/FunctionArn] :opt-un [:portkey.aws.email.lambda-action/TopicArn :portkey.aws.email/InvocationType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/create-configuration-set-event-destination-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/set-identity-mail-from-domain-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.receipt-ip-filter/policy (clojure.spec.alpha/and :portkey.aws.email/receipt-filter-policy))
(clojure.spec.alpha/def :portkey.aws.email/receipt-ip-filter (portkey.aws/json-keys :req-un [:portkey.aws.email.receipt-ip-filter/Policy :portkey.aws.email/Cidr] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/delete-identity-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity :portkey.aws.email/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/update-receipt-rule-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.delete-verified-email-address-request/email-address (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email/delete-verified-email-address-request (portkey.aws/json-keys :req-un [:portkey.aws.email.delete-verified-email-address-request/EmailAddress] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/test-render-template-request (portkey.aws/json-keys :req-un [:portkey.aws.email/TemplateName :portkey.aws.email/TemplateData] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/recipients-list (clojure.spec.alpha/coll-of :portkey.aws.email/recipient))

(clojure.spec.alpha/def :portkey.aws.email/remote-mta (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.set-active-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/set-active-receipt-rule-set-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.set-active-receipt-rule-set-request/RuleSetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/diagnostic-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/update-configuration-set-reputation-metrics-enabled-request (portkey.aws/json-keys :req-un [:portkey.aws.email/ConfigurationSetName :portkey.aws.email/Enabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/receipt-rule-names-list (clojure.spec.alpha/coll-of :portkey.aws.email/receipt-rule-name))

(clojure.spec.alpha/def :portkey.aws.email/bulk-email-destination-status-list (clojure.spec.alpha/coll-of :portkey.aws.email/bulk-email-destination-status))

(clojure.spec.alpha/def :portkey.aws.email/custom-mail-from-status {"Pending" "Pending", :pending "Pending", "Success" "Success", :success "Success", "Failed" "Failed", :failed "Failed", "TemporaryFailure" "TemporaryFailure", :temporary-failure "TemporaryFailure"})

(clojure.spec.alpha/def :portkey.aws.email/set-identity-dkim-enabled-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/list-identities-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/IdentityType :portkey.aws.email/NextToken :portkey.aws.email/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.rule-set-does-not-exist-exception/name (clojure.spec.alpha/and :portkey.aws.email/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email/rule-set-does-not-exist-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email.rule-set-does-not-exist-exception/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/invalid-template-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.email/TemplateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.s3-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.s3-action/bucket-name (clojure.spec.alpha/and :portkey.aws.email/s3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.email.s3-action/object-key-prefix (clojure.spec.alpha/and :portkey.aws.email/s3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.email.s3-action/kms-key-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/s3-action (portkey.aws/json-keys :req-un [:portkey.aws.email.s3-action/BucketName] :opt-un [:portkey.aws.email.s3-action/TopicArn :portkey.aws.email.s3-action/ObjectKeyPrefix :portkey.aws.email.s3-action/KmsKeyArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/max24-hour-send clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email/policy-name-list (clojure.spec.alpha/coll-of :portkey.aws.email/policy-name))

(clojure.spec.alpha/def :portkey.aws.email/create-receipt-rule-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.set-identity-dkim-enabled-request/dkim-enabled (clojure.spec.alpha/and :portkey.aws.email/enabled))
(clojure.spec.alpha/def :portkey.aws.email/set-identity-dkim-enabled-request (portkey.aws/json-keys :req-un [:portkey.aws.email/Identity :portkey.aws.email.set-identity-dkim-enabled-request/DkimEnabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email.get-identity-mail-from-domain-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email/identity-list))
(clojure.spec.alpha/def :portkey.aws.email/get-identity-mail-from-domain-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.email.get-identity-mail-from-domain-attributes-request/Identities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/rule-or-rule-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/send-raw-email-response (portkey.aws/json-keys :req-un [:portkey.aws.email/MessageId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/verification-token-list (clojure.spec.alpha/coll-of :portkey.aws.email/verification-token))

(clojure.spec.alpha/def :portkey.aws.email/subject-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/bounce-smtp-reply-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email/receipt-rule-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.send-bounce-request/original-message-id (clojure.spec.alpha/and :portkey.aws.email/message-id))
(clojure.spec.alpha/def :portkey.aws.email.send-bounce-request/bounce-sender (clojure.spec.alpha/and :portkey.aws.email/address))
(clojure.spec.alpha/def :portkey.aws.email.send-bounce-request/bounce-sender-arn (clojure.spec.alpha/and :portkey.aws.email/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email/send-bounce-request (portkey.aws/json-keys :req-un [:portkey.aws.email.send-bounce-request/OriginalMessageId :portkey.aws.email.send-bounce-request/BounceSender :portkey.aws.email/BouncedRecipientInfoList] :opt-un [:portkey.aws.email/Explanation :portkey.aws.email/MessageDsn :portkey.aws.email.send-bounce-request/BounceSenderArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.email/mail-from-domain-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn update-account-sending-enabled "Enables or disables email sending across your entire Amazon SES account. You can\nuse this operation in conjunction with Amazon CloudWatch alarms to temporarily\npause email sending across your Amazon SES account when reputation metrics (such\nas your bounce on complaint rate) reach certain thresholds.\n You can execute this operation no more than once per second." ([] (update-account-sending-enabled {})) ([update-account-sending-enabled-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-account-sending-enabled-request "UpdateAccountSendingEnabled" update-account-sending-enabled-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-account-sending-enabled-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef update-account-sending-enabled :args (clojure.spec.alpha/? :portkey.aws.email/update-account-sending-enabled-request) :ret clojure.core/true?)

(clojure.core/defn delete-verified-email-address "Deprecated. Use the DeleteIdentity operation to delete email addresses and\ndomains." ([delete-verified-email-address-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-verified-email-address-request "DeleteVerifiedEmailAddress" delete-verified-email-address-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-verified-email-address-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef delete-verified-email-address :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-verified-email-address-request) :ret clojure.core/true?)

nil

(clojure.core/defn create-configuration-set-tracking-options "Creates an association between a configuration set and a custom domain for open\nand click event tracking.\n By default, images and links used for tracking open and click events are hosted\non domains operated by Amazon SES. You can configure a subdomain of your own to\nhandle these events. For information about using configuration sets, see\nConfiguring Custom Domains to Handle Open and Click Tracking\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html)\nin the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html)." ([create-configuration-set-tracking-options-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-configuration-set-tracking-options-request "CreateConfigurationSetTrackingOptions" create-configuration-set-tracking-options-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-configuration-set-tracking-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/create-configuration-set-tracking-options-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "TrackingOptionsAlreadyExistsException" :portkey.aws.email/tracking-options-already-exists-exception, "InvalidTrackingOptionsException" :portkey.aws.email/invalid-tracking-options-exception}))))
(clojure.spec.alpha/fdef create-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email/create-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email/create-configuration-set-tracking-options-response))

(clojure.core/defn set-active-receipt-rule-set "Sets the specified receipt rule set as the active receipt rule set.\n To disable your email-receiving through Amazon SES completely, you can call\nthis API with RuleSetName set to null.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([] (set-active-receipt-rule-set {})) ([set-active-receipt-rule-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-active-receipt-rule-set-request "SetActiveReceiptRuleSet" set-active-receipt-rule-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/set-active-receipt-rule-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/set-active-receipt-rule-set-response {"RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef set-active-receipt-rule-set :args (clojure.spec.alpha/? :portkey.aws.email/set-active-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/set-active-receipt-rule-set-response))

(clojure.core/defn get-identity-mail-from-domain-attributes "Returns the custom MAIL FROM attributes for a list of identities (email\naddresses : domains).\n This operation is throttled at one request per second and can only get custom\nMAIL FROM attributes for up to 100 identities at a time." ([get-identity-mail-from-domain-attributes-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-identity-mail-from-domain-attributes-request "GetIdentityMailFromDomainAttributes" get-identity-mail-from-domain-attributes-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/get-identity-mail-from-domain-attributes-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/get-identity-mail-from-domain-attributes-response {}))))
(clojure.spec.alpha/fdef get-identity-mail-from-domain-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email/get-identity-mail-from-domain-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email/get-identity-mail-from-domain-attributes-response))

(clojure.core/defn send-templated-email "Composes an email message using an email template and immediately queues it for\nsending.\n In order to send email using the SendTemplatedEmail operation, your call to the\nAPI must meet the following requirements:\n * The call must refer to an existing email template. You can create email\ntemplates using the CreateTemplate operation.\n * The message must be sent from a verified email address or domain.\n * If your account is still in the Amazon SES sandbox, you may only send to\nverified addresses or domains, or to email addresses associated with the Amazon\nSES Mailbox Simulator. For more information, see Verifying Email Addresses and\nDomains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n * The total size of the message, including attachments, must be less than 10\nMB.\n * Calls to the SendTemplatedEmail operation may only include one Destination\nparameter. A destination is a set of recipients who will receive the same\nversion of the email. The Destination parameter can include up to 50 recipients,\nacross the To:, CC: and BCC: fields.\n * The Destination parameter must include at least one recipient email address.\nThe recipient address can be a To: address, a CC: address, or a BCC: address. If\na recipient email address is invalid (that is, it is not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be\nrejected, even if the message contains other recipients that are valid." ([send-templated-email-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-templated-email-request "SendTemplatedEmail" send-templated-email-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/send-templated-email-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/send-templated-email-response {"MessageRejected" :portkey.aws.email/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "TemplateDoesNotExistException" :portkey.aws.email/template-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email/account-sending-paused-exception}))))
(clojure.spec.alpha/fdef send-templated-email :args (clojure.spec.alpha/tuple :portkey.aws.email/send-templated-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email/send-templated-email-response))

(clojure.core/defn delete-configuration-set-tracking-options "Deletes an association between a configuration set and a custom domain for open\nand click event tracking.\n By default, images and links used for tracking open and click events are hosted\non domains operated by Amazon SES. You can configure a subdomain of your own to\nhandle these events. For information about using configuration sets, see\nConfiguring Custom Domains to Handle Open and Click Tracking\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html)\nin the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html).\n Deleting this kind of association will result in emails sent using the\nspecified configuration set to capture open and click events using the standard,\nAmazon SES-operated domains." ([delete-configuration-set-tracking-options-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-configuration-set-tracking-options-request "DeleteConfigurationSetTrackingOptions" delete-configuration-set-tracking-options-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-configuration-set-tracking-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-configuration-set-tracking-options-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "TrackingOptionsDoesNotExistException" :portkey.aws.email/tracking-options-does-not-exist-exception}))))
(clojure.spec.alpha/fdef delete-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-configuration-set-tracking-options-response))

(clojure.core/defn set-identity-feedback-forwarding-enabled "Given an identity (an email address or a domain), enables or disables whether\nAmazon SES forwards bounce and complaint notifications as email. Feedback\nforwarding can only be disabled when Amazon Simple Notification Service (Amazon\nSNS) topics are specified for both bounces and complaints.\n Feedback forwarding does not apply to delivery notifications. Delivery\nnotifications are only available through Amazon SNS.\n You can execute this operation no more than once per second.\n For more information about using notifications with Amazon SES, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([set-identity-feedback-forwarding-enabled-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-identity-feedback-forwarding-enabled-request "SetIdentityFeedbackForwardingEnabled" set-identity-feedback-forwarding-enabled-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/set-identity-feedback-forwarding-enabled-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/set-identity-feedback-forwarding-enabled-response {}))))
(clojure.spec.alpha/fdef set-identity-feedback-forwarding-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email/set-identity-feedback-forwarding-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email/set-identity-feedback-forwarding-enabled-response))

(clojure.core/defn verify-email-address "Deprecated. Use the VerifyEmailIdentity operation to verify a new email address." ([verify-email-address-request] (clojure.core/let [req<-input__36755__auto__ (req<-verify-email-address-request "VerifyEmailAddress" verify-email-address-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/verify-email-address-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef verify-email-address :args (clojure.spec.alpha/tuple :portkey.aws.email/verify-email-address-request) :ret clojure.core/true?)

(clojure.core/defn get-identity-verification-attributes "Given a list of identities (email addresses and/or domains), returns the\nverification status and (for domain identities) the verification token for each\nidentity.\n The verification status of an email address is \"Pending\" until the email\naddress owner clicks the link within the verification email that Amazon SES sent\nto that address. If the email address owner clicks the link within 24 hours, the\nverification status of the email address changes to \"Success\". If the link is\nnot clicked within 24 hours, the verification status changes to \"Failed.\" In\nthat case, if you still want to verify the email address, you must restart the\nverification process from the beginning.\n For domain identities, the domain's verification status is \"Pending\" as Amazon\nSES searches for the required TXT record in the DNS settings of the domain. When\nAmazon SES detects the record, the domain's verification status changes to\n\"Success\". If Amazon SES is unable to detect the record within 72 hours, the\ndomain's verification status changes to \"Failed.\" In that case, if you still\nwant to verify the domain, you must restart the verification process from the\nbeginning.\n This operation is throttled at one request per second and can only get\nverification attributes for up to 100 identities at a time." ([get-identity-verification-attributes-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-identity-verification-attributes-request "GetIdentityVerificationAttributes" get-identity-verification-attributes-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/get-identity-verification-attributes-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/get-identity-verification-attributes-response {}))))
(clojure.spec.alpha/fdef get-identity-verification-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email/get-identity-verification-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email/get-identity-verification-attributes-response))

(clojure.core/defn list-custom-verification-email-templates "Lists the existing custom verification email templates for your account.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(https://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([] (list-custom-verification-email-templates {})) ([list-custom-verification-email-templates-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-custom-verification-email-templates-request "ListCustomVerificationEmailTemplates" list-custom-verification-email-templates-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/list-custom-verification-email-templates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/list-custom-verification-email-templates-response {}))))
(clojure.spec.alpha/fdef list-custom-verification-email-templates :args (clojure.spec.alpha/? :portkey.aws.email/list-custom-verification-email-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.email/list-custom-verification-email-templates-response))

(clojure.core/defn delete-custom-verification-email-template "Deletes an existing custom verification email template.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(https://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([delete-custom-verification-email-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-custom-verification-email-template-request "DeleteCustomVerificationEmailTemplate" delete-custom-verification-email-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-custom-verification-email-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef delete-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn describe-configuration-set "Returns the details of the specified configuration set. For information about\nusing configuration sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([describe-configuration-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-configuration-set-request "DescribeConfigurationSet" describe-configuration-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/describe-configuration-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/describe-configuration-set-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef describe-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email/describe-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/describe-configuration-set-response))

(clojure.core/defn delete-template "Deletes an email template.\n You can execute this operation no more than once per second." ([delete-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-template-request "DeleteTemplate" delete-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-template-response {}))))
(clojure.spec.alpha/fdef delete-template :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-template-response))

(clojure.core/defn delete-configuration-set "Deletes a configuration set. Configuration sets enable you to publish email\nsending events. For information about using configuration sets, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([delete-configuration-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-configuration-set-request "DeleteConfigurationSet" delete-configuration-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-configuration-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-configuration-set-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef delete-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-configuration-set-response))

(clojure.core/defn test-render-template "Creates a preview of the MIME content of an email when provided with a template\nand a set of replacement data.\n You can execute this operation no more than once per second." ([test-render-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-test-render-template-request "TestRenderTemplate" test-render-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/test-render-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/test-render-template-response {"TemplateDoesNotExistException" :portkey.aws.email/template-does-not-exist-exception, "InvalidRenderingParameterException" :portkey.aws.email/invalid-rendering-parameter-exception, "MissingRenderingAttributeException" :portkey.aws.email/missing-rendering-attribute-exception}))))
(clojure.spec.alpha/fdef test-render-template :args (clojure.spec.alpha/tuple :portkey.aws.email/test-render-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email/test-render-template-response))

(clojure.core/defn verify-domain-dkim "Returns a set of DKIM tokens for a domain. DKIM tokens are character strings\nthat represent your domain's identity. Using these tokens, you will need to\ncreate DNS CNAME records that point to DKIM public keys hosted by Amazon SES.\nAmazon Web Services will eventually detect that you have updated your DNS\nrecords; this detection process may take up to 72 hours. Upon successful\ndetection, Amazon SES will be able to DKIM-sign email originating from that\ndomain.\n You can execute this operation no more than once per second.\n To enable or disable Easy DKIM signing for a domain, use the\nSetIdentityDkimEnabled operation.\n For more information about creating DNS records using DKIM tokens, go to the\nAmazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html)." ([verify-domain-dkim-request] (clojure.core/let [req<-input__36755__auto__ (req<-verify-domain-dkim-request "VerifyDomainDkim" verify-domain-dkim-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/verify-domain-dkim-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/verify-domain-dkim-response {}))))
(clojure.spec.alpha/fdef verify-domain-dkim :args (clojure.spec.alpha/tuple :portkey.aws.email/verify-domain-dkim-request) :ret (clojure.spec.alpha/and :portkey.aws.email/verify-domain-dkim-response))

(clojure.core/defn put-identity-policy "Adds or updates a sending authorization policy for the specified identity (an\nemail address or a domain).\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([put-identity-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-put-identity-policy-request "PutIdentityPolicy" put-identity-policy-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/put-identity-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/put-identity-policy-response {"InvalidPolicyException" :portkey.aws.email/invalid-policy-exception}))))
(clojure.spec.alpha/fdef put-identity-policy :args (clojure.spec.alpha/tuple :portkey.aws.email/put-identity-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.email/put-identity-policy-response))

(clojure.core/defn delete-receipt-rule-set "Deletes the specified receipt rule set and all of the receipt rules it contains.\n The currently active rule set cannot be deleted.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([delete-receipt-rule-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-receipt-rule-set-request "DeleteReceiptRuleSet" delete-receipt-rule-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-receipt-rule-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-receipt-rule-set-response {"CannotDeleteException" :portkey.aws.email/cannot-delete-exception}))))
(clojure.spec.alpha/fdef delete-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-receipt-rule-set-response))

(clojure.core/defn list-configuration-sets "Provides a list of the configuration sets associated with your Amazon SES\naccount. For information about using configuration sets, see Monitoring Your\nAmazon SES Sending Activity\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second. This operation\nwill return up to 1,000 configuration sets each time it is run. If your Amazon\nSES account has more than 1,000 configuration sets, this operation will also\nreturn a NextToken element. You can then execute the ListConfigurationSets\noperation again, passing the NextToken parameter and the value of the NextToken\nelement to retrieve additional results." ([] (list-configuration-sets {})) ([list-configuration-sets-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-configuration-sets-request "ListConfigurationSets" list-configuration-sets-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/list-configuration-sets-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/list-configuration-sets-response {}))))
(clojure.spec.alpha/fdef list-configuration-sets :args (clojure.spec.alpha/? :portkey.aws.email/list-configuration-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.email/list-configuration-sets-response))

(clojure.core/defn delete-identity-policy "Deletes the specified sending authorization policy for the given identity (an\nemail address or a domain). This API returns successfully even if a policy with\nthe specified name does not exist.\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([delete-identity-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-identity-policy-request "DeleteIdentityPolicy" delete-identity-policy-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-identity-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-identity-policy-response {}))))
(clojure.spec.alpha/fdef delete-identity-policy :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-identity-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-identity-policy-response))

(clojure.core/defn update-receipt-rule "Updates a receipt rule.\n For information about managing receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html).\n You can execute this operation no more than once per second." ([update-receipt-rule-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-receipt-rule-request "UpdateReceiptRule" update-receipt-rule-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-receipt-rule-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/update-receipt-rule-response {"InvalidSnsTopicException" :portkey.aws.email/invalid-sns-topic-exception, "InvalidS3ConfigurationException" :portkey.aws.email/invalids3-configuration-exception, "InvalidLambdaFunctionException" :portkey.aws.email/invalid-lambda-function-exception, "RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email/rule-does-not-exist-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef update-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email/update-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email/update-receipt-rule-response))

(clojure.core/defn list-templates "Lists the email templates present in your Amazon SES account.\n You can execute this operation no more than once per second." ([] (list-templates {})) ([list-templates-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-templates-request "ListTemplates" list-templates-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/list-templates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/list-templates-response {}))))
(clojure.spec.alpha/fdef list-templates :args (clojure.spec.alpha/? :portkey.aws.email/list-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.email/list-templates-response))

(clojure.core/defn set-identity-dkim-enabled "Enables or disables Easy DKIM signing of email sent from an identity:\n * If Easy DKIM signing is enabled for a domain name identity (such as\nexample.com), then Amazon SES will DKIM-sign all email sent by addresses under\nthat domain name (for example, user@example.com).\n * If Easy DKIM signing is enabled for an email address, then Amazon SES will\nDKIM-sign all email sent by that email address.\n For email addresses (for example, user@example.com), you can only enable Easy\nDKIM signing if the corresponding domain (in this case, example.com) has been\nset up for Easy DKIM using the AWS Console or the VerifyDomainDkim operation.\n You can execute this operation no more than once per second.\n For more information about Easy DKIM signing, go to the Amazon SES Developer\nGuide (http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html)." ([set-identity-dkim-enabled-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-identity-dkim-enabled-request "SetIdentityDkimEnabled" set-identity-dkim-enabled-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/set-identity-dkim-enabled-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/set-identity-dkim-enabled-response {}))))
(clojure.spec.alpha/fdef set-identity-dkim-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email/set-identity-dkim-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email/set-identity-dkim-enabled-response))

(clojure.core/defn get-identity-policies "Returns the requested sending authorization policies for the given identity (an\nemail address or a domain). The policies are returned as a map of policy names\nto policy contents. You can retrieve a maximum of 20 policies at a time.\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([get-identity-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-identity-policies-request "GetIdentityPolicies" get-identity-policies-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/get-identity-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/get-identity-policies-response {}))))
(clojure.spec.alpha/fdef get-identity-policies :args (clojure.spec.alpha/tuple :portkey.aws.email/get-identity-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.email/get-identity-policies-response))

(clojure.core/defn list-identity-policies "Returns a list of sending authorization policies that are attached to the given\nidentity (an email address or a domain). This API returns only a list. If you\nwant the actual policy content, you can use GetIdentityPolicies.\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([list-identity-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-identity-policies-request "ListIdentityPolicies" list-identity-policies-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/list-identity-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/list-identity-policies-response {}))))
(clojure.spec.alpha/fdef list-identity-policies :args (clojure.spec.alpha/tuple :portkey.aws.email/list-identity-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.email/list-identity-policies-response))

nil

(clojure.core/defn describe-receipt-rule-set "Returns the details of the specified receipt rule set.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([describe-receipt-rule-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-receipt-rule-set-request "DescribeReceiptRuleSet" describe-receipt-rule-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/describe-receipt-rule-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/describe-receipt-rule-set-response {"RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef describe-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email/describe-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/describe-receipt-rule-set-response))

(clojure.core/defn update-configuration-set-reputation-metrics-enabled "Enables or disables the publishing of reputation metrics for emails sent using a\nspecific configuration set. Reputation metrics include bounce and complaint\nrates. These metrics are published to Amazon CloudWatch. By using Amazon\nCloudWatch, you can create alarms when bounce or complaint rates exceed a\ncertain threshold.\n You can execute this operation no more than once per second." ([update-configuration-set-reputation-metrics-enabled-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-configuration-set-reputation-metrics-enabled-request "UpdateConfigurationSetReputationMetricsEnabled" update-configuration-set-reputation-metrics-enabled-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-configuration-set-reputation-metrics-enabled-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef update-configuration-set-reputation-metrics-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email/update-configuration-set-reputation-metrics-enabled-request) :ret clojure.core/true?)

(clojure.core/defn send-bulk-templated-email "Composes an email message to multiple destinations. The message body is created\nusing an email template.\n In order to send email using the SendBulkTemplatedEmail operation, your call to\nthe API must meet the following requirements:\n * The call must refer to an existing email template. You can create email\ntemplates using the CreateTemplate operation.\n * The message must be sent from a verified email address or domain.\n * If your account is still in the Amazon SES sandbox, you may only send to\nverified addresses or domains, or to email addresses associated with the Amazon\nSES Mailbox Simulator. For more information, see Verifying Email Addresses and\nDomains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n * The total size of the message, including attachments, must be less than 10\nMB.\n * Each Destination parameter must include at least one recipient email address.\nThe recipient address can be a To: address, a CC: address, or a BCC: address. If\na recipient email address is invalid (that is, it is not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be\nrejected, even if the message contains other recipients that are valid." ([send-bulk-templated-email-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-bulk-templated-email-request "SendBulkTemplatedEmail" send-bulk-templated-email-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/send-bulk-templated-email-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/send-bulk-templated-email-response {"MessageRejected" :portkey.aws.email/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "TemplateDoesNotExistException" :portkey.aws.email/template-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email/account-sending-paused-exception}))))
(clojure.spec.alpha/fdef send-bulk-templated-email :args (clojure.spec.alpha/tuple :portkey.aws.email/send-bulk-templated-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email/send-bulk-templated-email-response))

(clojure.core/defn create-configuration-set "Creates a configuration set.\n Configuration sets enable you to publish email sending events. For information\nabout using configuration sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([create-configuration-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-configuration-set-request "CreateConfigurationSet" create-configuration-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-configuration-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/create-configuration-set-response {"ConfigurationSetAlreadyExistsException" :portkey.aws.email/configuration-set-already-exists-exception, "InvalidConfigurationSetException" :portkey.aws.email/invalid-configuration-set-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef create-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email/create-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/create-configuration-set-response))

(clojure.core/defn send-email "Composes an email message and immediately queues it for sending. In order to\nsend email using the SendEmail operation, your message must meet the following\nrequirements:\n * The message must be sent from a verified email address or domain. If you\nattempt to send email using a non-verified address or domain, the operation will\nresult in an \"Email address not verified\" error.\n * If your account is still in the Amazon SES sandbox, you may only send to\nverified addresses or domains, or to email addresses associated with the Amazon\nSES Mailbox Simulator. For more information, see Verifying Email Addresses and\nDomains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n * The total size of the message, including attachments, must be smaller than 10\nMB.\n * The message must include at least one recipient email address. The recipient\naddress can be a To: address, a CC: address, or a BCC: address. If a recipient\nemail address is invalid (that is, it is not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be\nrejected, even if the message contains other recipients that are valid.\n * The message may not include more than 50 recipients, across the To:, CC: and\nBCC: fields. If you need to send an email message to a larger audience, you can\ndivide your recipient list into groups of 50 or fewer, and then call the\nSendEmail operation several times to send the message to each group.\n For every message that you send, the total number of recipients (including each\nrecipient in the To:, CC: and BCC: fields) is counted against the maximum number\nof emails you can send in a 24-hour period (your sending quota). For more\ninformation about sending quotas in Amazon SES, see Managing Your Amazon SES\nSending Limits\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html)\nin the Amazon SES Developer Guide." ([send-email-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-email-request "SendEmail" send-email-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/send-email-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/send-email-response {"MessageRejected" :portkey.aws.email/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email/account-sending-paused-exception}))))
(clojure.spec.alpha/fdef send-email :args (clojure.spec.alpha/tuple :portkey.aws.email/send-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email/send-email-response))

(clojure.core/defn update-template "Updates an email template. Email templates enable you to send personalized email\nto one or more destinations in a single API operation. For more information, see\nthe Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html).\n You can execute this operation no more than once per second." ([update-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-template-request "UpdateTemplate" update-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/update-template-response {"TemplateDoesNotExistException" :portkey.aws.email/template-does-not-exist-exception, "InvalidTemplateException" :portkey.aws.email/invalid-template-exception}))))
(clojure.spec.alpha/fdef update-template :args (clojure.spec.alpha/tuple :portkey.aws.email/update-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email/update-template-response))

(clojure.core/defn describe-active-receipt-rule-set "Returns the metadata and receipt rules for the receipt rule set that is\ncurrently active.\n For information about setting up receipt rule sets, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html).\n You can execute this operation no more than once per second." ([] (describe-active-receipt-rule-set {})) ([describe-active-receipt-rule-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-active-receipt-rule-set-request "DescribeActiveReceiptRuleSet" describe-active-receipt-rule-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/describe-active-receipt-rule-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/describe-active-receipt-rule-set-response {}))))
(clojure.spec.alpha/fdef describe-active-receipt-rule-set :args (clojure.spec.alpha/? :portkey.aws.email/describe-active-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/describe-active-receipt-rule-set-response))

(clojure.core/defn set-identity-headers-in-notifications-enabled "Given an identity (an email address or a domain), sets whether Amazon SES\nincludes the original email headers in the Amazon Simple Notification Service\n(Amazon SNS) notifications of a specified type.\n You can execute this operation no more than once per second.\n For more information about using notifications with Amazon SES, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([set-identity-headers-in-notifications-enabled-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-identity-headers-in-notifications-enabled-request "SetIdentityHeadersInNotificationsEnabled" set-identity-headers-in-notifications-enabled-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/set-identity-headers-in-notifications-enabled-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/set-identity-headers-in-notifications-enabled-response {}))))
(clojure.spec.alpha/fdef set-identity-headers-in-notifications-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email/set-identity-headers-in-notifications-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email/set-identity-headers-in-notifications-enabled-response))

(clojure.core/defn delete-configuration-set-event-destination "Deletes a configuration set event destination. Configuration set event\ndestinations are associated with configuration sets, which enable you to publish\nemail sending events. For information about using configuration sets, see the\nAmazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([delete-configuration-set-event-destination-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-configuration-set-event-destination-request "DeleteConfigurationSetEventDestination" delete-configuration-set-event-destination-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-configuration-set-event-destination-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-configuration-set-event-destination-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "EventDestinationDoesNotExistException" :portkey.aws.email/event-destination-does-not-exist-exception}))))
(clojure.spec.alpha/fdef delete-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-configuration-set-event-destination-response))

(clojure.core/defn create-custom-verification-email-template "Creates a new custom verification email template.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(https://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([create-custom-verification-email-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-custom-verification-email-template-request "CreateCustomVerificationEmailTemplate" create-custom-verification-email-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-custom-verification-email-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"CustomVerificationEmailTemplateAlreadyExistsException" :portkey.aws.email/custom-verification-email-template-already-exists-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email/from-email-address-not-verified-exception, "CustomVerificationEmailInvalidContentException" :portkey.aws.email/custom-verification-email-invalid-content-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef create-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email/create-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn send-bounce "Generates and sends a bounce message to the sender of an email you received\nthrough Amazon SES. You can only use this API on an email up to 24 hours after\nyou receive it.\n You cannot use this API to send generic bounces for mail that was not received\nby Amazon SES.\n For information about receiving email through Amazon SES, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html).\n You can execute this operation no more than once per second." ([send-bounce-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-bounce-request "SendBounce" send-bounce-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/send-bounce-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/send-bounce-response {"MessageRejected" :portkey.aws.email/message-rejected}))))
(clojure.spec.alpha/fdef send-bounce :args (clojure.spec.alpha/tuple :portkey.aws.email/send-bounce-request) :ret (clojure.spec.alpha/and :portkey.aws.email/send-bounce-response))

(clojure.core/defn create-receipt-filter "Creates a new IP address filter.\n For information about setting up IP address filters, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html).\n You can execute this operation no more than once per second." ([create-receipt-filter-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-receipt-filter-request "CreateReceiptFilter" create-receipt-filter-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-receipt-filter-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/create-receipt-filter-response {"LimitExceededException" :portkey.aws.email/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.email/already-exists-exception}))))
(clojure.spec.alpha/fdef create-receipt-filter :args (clojure.spec.alpha/tuple :portkey.aws.email/create-receipt-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.email/create-receipt-filter-response))

(clojure.core/defn list-identities "Returns a list containing all of the identities (email addresses and domains)\nfor your AWS account, regardless of verification status.\n You can execute this operation no more than once per second." ([] (list-identities {})) ([list-identities-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-identities-request "ListIdentities" list-identities-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/list-identities-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/list-identities-response {}))))
(clojure.spec.alpha/fdef list-identities :args (clojure.spec.alpha/? :portkey.aws.email/list-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.email/list-identities-response))

(clojure.core/defn set-identity-notification-topic "Given an identity (an email address or a domain), sets the Amazon Simple\nNotification Service (Amazon SNS) topic to which Amazon SES will publish bounce,\ncomplaint, and/or delivery notifications for emails sent with that identity as\nthe Source.\n Unless feedback forwarding is enabled, you must specify Amazon SNS topics for\nbounce and complaint notifications. For more information, see\nSetIdentityFeedbackForwardingEnabled.\n You can execute this operation no more than once per second.\n For more information about feedback notification, see the Amazon SES Developer\nGuide (http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([set-identity-notification-topic-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-identity-notification-topic-request "SetIdentityNotificationTopic" set-identity-notification-topic-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/set-identity-notification-topic-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/set-identity-notification-topic-response {}))))
(clojure.spec.alpha/fdef set-identity-notification-topic :args (clojure.spec.alpha/tuple :portkey.aws.email/set-identity-notification-topic-request) :ret (clojure.spec.alpha/and :portkey.aws.email/set-identity-notification-topic-response))

(clojure.core/defn set-identity-mail-from-domain "Enables or disables the custom MAIL FROM domain setup for a verified identity\n(an email address or a domain).\n To send emails using the specified MAIL FROM domain, you must add an MX record\nto your MAIL FROM domain's DNS settings. If you want your emails to pass Sender\nPolicy Framework (SPF) checks, you must also add or update an SPF record. For\nmore information, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html).\n You can execute this operation no more than once per second." ([set-identity-mail-from-domain-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-identity-mail-from-domain-request "SetIdentityMailFromDomain" set-identity-mail-from-domain-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/set-identity-mail-from-domain-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/set-identity-mail-from-domain-response {}))))
(clojure.spec.alpha/fdef set-identity-mail-from-domain :args (clojure.spec.alpha/tuple :portkey.aws.email/set-identity-mail-from-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.email/set-identity-mail-from-domain-response))

(clojure.core/defn get-identity-dkim-attributes "Returns the current status of Easy DKIM signing for an entity. For domain name\nidentities, this operation also returns the DKIM tokens that are required for\nEasy DKIM signing, and whether Amazon SES has successfully verified that these\ntokens have been published.\n This operation takes a list of identities as input and returns the following\ninformation for each:\n * Whether Easy DKIM signing is enabled or disabled.\n * A set of DKIM tokens that represent the identity. If the identity is an email\naddress, the tokens represent the domain of that address.\n * Whether Amazon SES has successfully verified the DKIM tokens published in the\ndomain's DNS. This information is only returned for domain name identities, not\nfor email addresses.\n This operation is throttled at one request per second and can only get DKIM\nattributes for up to 100 identities at a time.\n For more information about creating DNS records using DKIM tokens, go to the\nAmazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html)." ([get-identity-dkim-attributes-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-identity-dkim-attributes-request "GetIdentityDkimAttributes" get-identity-dkim-attributes-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/get-identity-dkim-attributes-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/get-identity-dkim-attributes-response {}))))
(clojure.spec.alpha/fdef get-identity-dkim-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email/get-identity-dkim-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email/get-identity-dkim-attributes-response))

(clojure.core/defn update-configuration-set-sending-enabled "Enables or disables email sending for messages sent using a specific\nconfiguration set. You can use this operation in conjunction with Amazon\nCloudWatch alarms to temporarily pause email sending for a configuration set\nwhen the reputation metrics for that configuration set (such as your bounce on\ncomplaint rate) reach certain thresholds.\n You can execute this operation no more than once per second." ([update-configuration-set-sending-enabled-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-configuration-set-sending-enabled-request "UpdateConfigurationSetSendingEnabled" update-configuration-set-sending-enabled-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-configuration-set-sending-enabled-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef update-configuration-set-sending-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email/update-configuration-set-sending-enabled-request) :ret clojure.core/true?)

nil

(clojure.core/defn delete-receipt-filter "Deletes the specified IP address filter.\n For information about managing IP address filters, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html).\n You can execute this operation no more than once per second." ([delete-receipt-filter-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-receipt-filter-request "DeleteReceiptFilter" delete-receipt-filter-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-receipt-filter-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-receipt-filter-response {}))))
(clojure.spec.alpha/fdef delete-receipt-filter :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-receipt-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-receipt-filter-response))

(clojure.core/defn create-template "Creates an email template. Email templates enable you to send personalized email\nto one or more destinations in a single API operation. For more information, see\nthe Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html).\n You can execute this operation no more than once per second." ([create-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-template-request "CreateTemplate" create-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/create-template-response {"AlreadyExistsException" :portkey.aws.email/already-exists-exception, "InvalidTemplateException" :portkey.aws.email/invalid-template-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef create-template :args (clojure.spec.alpha/tuple :portkey.aws.email/create-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email/create-template-response))

(clojure.core/defn update-configuration-set-event-destination "Updates the event destination of a configuration set. Event destinations are\nassociated with configuration sets, which enable you to publish email sending\nevents to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple\nNotification Service (Amazon SNS). For information about using configuration\nsets, see Monitoring Your Amazon SES Sending Activity\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html)\nin the Amazon SES Developer Guide.\n When you create or update an event destination, you must provide one, and only\none, destination. The destination can be Amazon CloudWatch, Amazon Kinesis\nFirehose, or Amazon Simple Notification Service (Amazon SNS).\n You can execute this operation no more than once per second." ([update-configuration-set-event-destination-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-configuration-set-event-destination-request "UpdateConfigurationSetEventDestination" update-configuration-set-event-destination-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-configuration-set-event-destination-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/update-configuration-set-event-destination-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "EventDestinationDoesNotExistException" :portkey.aws.email/event-destination-does-not-exist-exception, "InvalidCloudWatchDestinationException" :portkey.aws.email/invalid-cloud-watch-destination-exception, "InvalidFirehoseDestinationException" :portkey.aws.email/invalid-firehose-destination-exception, "InvalidSNSDestinationException" :portkey.aws.email/invalidsnsdestination-exception}))))
(clojure.spec.alpha/fdef update-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email/update-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email/update-configuration-set-event-destination-response))

(clojure.core/defn delete-identity "Deletes the specified identity (an email address or a domain) from the list of\nverified identities.\n You can execute this operation no more than once per second." ([delete-identity-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-identity-request "DeleteIdentity" delete-identity-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-identity-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-identity-response {}))))
(clojure.spec.alpha/fdef delete-identity :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-identity-response))

(clojure.core/defn verify-email-identity "Adds an email address to the list of identities for your Amazon SES account and\nattempts to verify it. As a result of executing this operation, a verification\nemail is sent to the specified address.\n You can execute this operation no more than once per second." ([verify-email-identity-request] (clojure.core/let [req<-input__36755__auto__ (req<-verify-email-identity-request "VerifyEmailIdentity" verify-email-identity-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/verify-email-identity-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/verify-email-identity-response {}))))
(clojure.spec.alpha/fdef verify-email-identity :args (clojure.spec.alpha/tuple :portkey.aws.email/verify-email-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email/verify-email-identity-response))

(clojure.core/defn reorder-receipt-rule-set "Reorders the receipt rules within a receipt rule set.\n All of the rules in the rule set must be represented in this request. That is,\nthis API will return an error if the reorder request doesn't explicitly position\nall of the rules.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([reorder-receipt-rule-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-reorder-receipt-rule-set-request "ReorderReceiptRuleSet" reorder-receipt-rule-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/reorder-receipt-rule-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/reorder-receipt-rule-set-response {"RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email/rule-does-not-exist-exception}))))
(clojure.spec.alpha/fdef reorder-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email/reorder-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/reorder-receipt-rule-set-response))

(clojure.core/defn list-receipt-rule-sets "Lists the receipt rule sets that exist under your AWS account. If there are\nadditional receipt rule sets to be retrieved, you will receive a NextToken that\nyou can provide to the next call to ListReceiptRuleSets to retrieve the\nadditional entries.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([] (list-receipt-rule-sets {})) ([list-receipt-rule-sets-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-receipt-rule-sets-request "ListReceiptRuleSets" list-receipt-rule-sets-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/list-receipt-rule-sets-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/list-receipt-rule-sets-response {}))))
(clojure.spec.alpha/fdef list-receipt-rule-sets :args (clojure.spec.alpha/? :portkey.aws.email/list-receipt-rule-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.email/list-receipt-rule-sets-response))

(clojure.core/defn describe-receipt-rule "Returns the details of the specified receipt rule.\n For information about setting up receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html).\n You can execute this operation no more than once per second." ([describe-receipt-rule-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-receipt-rule-request "DescribeReceiptRule" describe-receipt-rule-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/describe-receipt-rule-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/describe-receipt-rule-response {"RuleDoesNotExistException" :portkey.aws.email/rule-does-not-exist-exception, "RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef describe-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email/describe-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email/describe-receipt-rule-response))

(clojure.core/defn list-receipt-filters "Lists the IP address filters associated with your AWS account.\n For information about managing IP address filters, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html).\n You can execute this operation no more than once per second." ([] (list-receipt-filters {})) ([list-receipt-filters-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-receipt-filters-request "ListReceiptFilters" list-receipt-filters-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/list-receipt-filters-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/list-receipt-filters-response {}))))
(clojure.spec.alpha/fdef list-receipt-filters :args (clojure.spec.alpha/? :portkey.aws.email/list-receipt-filters-request) :ret (clojure.spec.alpha/and :portkey.aws.email/list-receipt-filters-response))

(clojure.core/defn clone-receipt-rule-set "Creates a receipt rule set by cloning an existing one. All receipt rules and\nconfigurations are copied to the new receipt rule set and are completely\nindependent of the source rule set.\n For information about setting up rule sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html).\n You can execute this operation no more than once per second." ([clone-receipt-rule-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-clone-receipt-rule-set-request "CloneReceiptRuleSet" clone-receipt-rule-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/clone-receipt-rule-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/clone-receipt-rule-set-response {"RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception, "AlreadyExistsException" :portkey.aws.email/already-exists-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef clone-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email/clone-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/clone-receipt-rule-set-response))

(clojure.core/defn get-identity-notification-attributes "Given a list of verified identities (email addresses and/or domains), returns a\nstructure describing identity notification attributes.\n This operation is throttled at one request per second and can only get\nnotification attributes for up to 100 identities at a time.\n For more information about using notifications with Amazon SES, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([get-identity-notification-attributes-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-identity-notification-attributes-request "GetIdentityNotificationAttributes" get-identity-notification-attributes-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/get-identity-notification-attributes-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/get-identity-notification-attributes-response {}))))
(clojure.spec.alpha/fdef get-identity-notification-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email/get-identity-notification-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email/get-identity-notification-attributes-response))

(clojure.core/defn send-custom-verification-email "Adds an email address to the list of identities for your Amazon SES account and\nattempts to verify it. As a result of executing this operation, a customized\nverification email is sent to the specified address.\n To use this operation, you must first create a custom verification email\ntemplate. For more information about creating and using custom verification\nemail templates, see Using Custom Verification Email Templates\n(https://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([send-custom-verification-email-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-custom-verification-email-request "SendCustomVerificationEmail" send-custom-verification-email-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/send-custom-verification-email-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/send-custom-verification-email-response {"MessageRejected" :portkey.aws.email/message-rejected, "ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email/custom-verification-email-template-does-not-exist-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email/from-email-address-not-verified-exception, "ProductionAccessNotGrantedException" :portkey.aws.email/production-access-not-granted-exception}))))
(clojure.spec.alpha/fdef send-custom-verification-email :args (clojure.spec.alpha/tuple :portkey.aws.email/send-custom-verification-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email/send-custom-verification-email-response))

(clojure.core/defn delete-receipt-rule "Deletes the specified receipt rule.\n For information about managing receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html).\n You can execute this operation no more than once per second." ([delete-receipt-rule-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-receipt-rule-request "DeleteReceiptRule" delete-receipt-rule-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/delete-receipt-rule-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/delete-receipt-rule-response {"RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception}))))
(clojure.spec.alpha/fdef delete-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email/delete-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email/delete-receipt-rule-response))

nil

(clojure.core/defn create-configuration-set-event-destination "Creates a configuration set event destination.\n When you create or update an event destination, you must provide one, and only\none, destination. The destination can be Amazon CloudWatch, Amazon Kinesis\nFirehose, or Amazon Simple Notification Service (Amazon SNS).\n An event destination is the AWS service to which Amazon SES publishes the email\nsending events associated with a configuration set. For information about using\nconfiguration sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([create-configuration-set-event-destination-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-configuration-set-event-destination-request "CreateConfigurationSetEventDestination" create-configuration-set-event-destination-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-configuration-set-event-destination-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/create-configuration-set-event-destination-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "EventDestinationAlreadyExistsException" :portkey.aws.email/event-destination-already-exists-exception, "InvalidCloudWatchDestinationException" :portkey.aws.email/invalid-cloud-watch-destination-exception, "InvalidFirehoseDestinationException" :portkey.aws.email/invalid-firehose-destination-exception, "InvalidSNSDestinationException" :portkey.aws.email/invalidsnsdestination-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef create-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email/create-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email/create-configuration-set-event-destination-response))

(clojure.core/defn verify-domain-identity "Adds a domain to the list of identities for your Amazon SES account and attempts\nto verify it. For more information about verifying domains, see Verifying Email\nAddresses and Domains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([verify-domain-identity-request] (clojure.core/let [req<-input__36755__auto__ (req<-verify-domain-identity-request "VerifyDomainIdentity" verify-domain-identity-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/verify-domain-identity-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/verify-domain-identity-response {}))))
(clojure.spec.alpha/fdef verify-domain-identity :args (clojure.spec.alpha/tuple :portkey.aws.email/verify-domain-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email/verify-domain-identity-response))

(clojure.core/defn get-custom-verification-email-template "Returns the custom email verification template for the template name you\nspecify.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(https://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([get-custom-verification-email-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-custom-verification-email-template-request "GetCustomVerificationEmailTemplate" get-custom-verification-email-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/get-custom-verification-email-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/get-custom-verification-email-template-response {"CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email/custom-verification-email-template-does-not-exist-exception}))))
(clojure.spec.alpha/fdef get-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email/get-custom-verification-email-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email/get-custom-verification-email-template-response))

(clojure.core/defn update-configuration-set-tracking-options "Modifies an association between a configuration set and a custom domain for open\nand click event tracking.\n By default, images and links used for tracking open and click events are hosted\non domains operated by Amazon SES. You can configure a subdomain of your own to\nhandle these events. For information about using configuration sets, see\nConfiguring Custom Domains to Handle Open and Click Tracking\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html)\nin the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html)." ([update-configuration-set-tracking-options-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-configuration-set-tracking-options-request "UpdateConfigurationSetTrackingOptions" update-configuration-set-tracking-options-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-configuration-set-tracking-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/update-configuration-set-tracking-options-response {"ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "TrackingOptionsDoesNotExistException" :portkey.aws.email/tracking-options-does-not-exist-exception, "InvalidTrackingOptionsException" :portkey.aws.email/invalid-tracking-options-exception}))))
(clojure.spec.alpha/fdef update-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email/update-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email/update-configuration-set-tracking-options-response))

(clojure.core/defn send-raw-email "Composes an email message and immediately queues it for sending. When calling\nthis operation, you may specify the message headers as well as the content. The\nSendRawEmail operation is particularly useful for sending multipart MIME emails\n(such as those that contain both a plain-text and an HTML version).\n In order to send email using the SendRawEmail operation, your message must meet\nthe following requirements:\n * The message must be sent from a verified email address or domain. If you\nattempt to send email using a non-verified address or domain, the operation will\nresult in an \"Email address not verified\" error.\n * If your account is still in the Amazon SES sandbox, you may only send to\nverified addresses or domains, or to email addresses associated with the Amazon\nSES Mailbox Simulator. For more information, see Verifying Email Addresses and\nDomains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n * The total size of the message, including attachments, must be smaller than 10\nMB.\n * The message must include at least one recipient email address. The recipient\naddress can be a To: address, a CC: address, or a BCC: address. If a recipient\nemail address is invalid (that is, it is not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be\nrejected, even if the message contains other recipients that are valid.\n * The message may not include more than 50 recipients, across the To:, CC: and\nBCC: fields. If you need to send an email message to a larger audience, you can\ndivide your recipient list into groups of 50 or fewer, and then call the\nSendRawEmail operation several times to send the message to each group.\n For every message that you send, the total number of recipients (including each\nrecipient in the To:, CC: and BCC: fields) is counted against the maximum number\nof emails you can send in a 24-hour period (your sending quota). For more\ninformation about sending quotas in Amazon SES, see Managing Your Amazon SES\nSending Limits\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html)\nin the Amazon SES Developer Guide.\n Additionally, keep the following considerations in mind when using the\nSendRawEmail operation:\n * Although you can customize the message headers when using the SendRawEmail\noperation, Amazon SES will automatically apply its own Message-ID and Date\nheaders; if you passed these headers when creating the message, they will be\noverwritten by the values that Amazon SES provides.\n * If you are using sending authorization to send on behalf of another user,\nSendRawEmail enables you to specify the cross-account identity for the email's\nSource, From, and Return-Path parameters in one of two ways: you can pass\noptional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you\ncan include the following X-headers in the header of your raw email:\n * X-SES-SOURCE-ARN\n * X-SES-FROM-ARN\n * X-SES-RETURN-PATH-ARN\n Do not include these X-headers in the DKIM signature; Amazon SES will remove\nthem before sending the email.\n For most common sending authorization scenarios, we recommend that you specify\nthe SourceIdentityArn parameter and not the FromIdentityArn or\nReturnPathIdentityArn parameters. If you only specify the SourceIdentityArn\nparameter, Amazon SES will set the From and Return Path addresses to the\nidentity specified in SourceIdentityArn. For more information about sending\nauthorization, see the Using Sending Authorization with Amazon SES\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html)\nin the Amazon SES Developer Guide." ([send-raw-email-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-raw-email-request "SendRawEmail" send-raw-email-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/send-raw-email-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/send-raw-email-response {"MessageRejected" :portkey.aws.email/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email/configuration-set-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email/account-sending-paused-exception}))))
(clojure.spec.alpha/fdef send-raw-email :args (clojure.spec.alpha/tuple :portkey.aws.email/send-raw-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email/send-raw-email-response))

(clojure.core/defn update-custom-verification-email-template "Updates an existing custom verification email template.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(https://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([update-custom-verification-email-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-custom-verification-email-template-request "UpdateCustomVerificationEmailTemplate" update-custom-verification-email-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/update-custom-verification-email-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email/custom-verification-email-template-does-not-exist-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email/from-email-address-not-verified-exception, "CustomVerificationEmailInvalidContentException" :portkey.aws.email/custom-verification-email-invalid-content-exception}))))
(clojure.spec.alpha/fdef update-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email/update-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn set-receipt-rule-position "Sets the position of the specified receipt rule in the receipt rule set.\n For information about managing receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html).\n You can execute this operation no more than once per second." ([set-receipt-rule-position-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-receipt-rule-position-request "SetReceiptRulePosition" set-receipt-rule-position-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/set-receipt-rule-position-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/set-receipt-rule-position-response {"RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email/rule-does-not-exist-exception}))))
(clojure.spec.alpha/fdef set-receipt-rule-position :args (clojure.spec.alpha/tuple :portkey.aws.email/set-receipt-rule-position-request) :ret (clojure.spec.alpha/and :portkey.aws.email/set-receipt-rule-position-response))

(clojure.core/defn create-receipt-rule-set "Creates an empty receipt rule set.\n For information about setting up receipt rule sets, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html).\n You can execute this operation no more than once per second." ([create-receipt-rule-set-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-receipt-rule-set-request "CreateReceiptRuleSet" create-receipt-rule-set-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-receipt-rule-set-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/create-receipt-rule-set-response {"AlreadyExistsException" :portkey.aws.email/already-exists-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef create-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email/create-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email/create-receipt-rule-set-response))

(clojure.core/defn create-receipt-rule "Creates a receipt rule.\n For information about setting up receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html).\n You can execute this operation no more than once per second." ([create-receipt-rule-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-receipt-rule-request "CreateReceiptRule" create-receipt-rule-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/create-receipt-rule-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/create-receipt-rule-response {"InvalidSnsTopicException" :portkey.aws.email/invalid-sns-topic-exception, "InvalidS3ConfigurationException" :portkey.aws.email/invalids3-configuration-exception, "InvalidLambdaFunctionException" :portkey.aws.email/invalid-lambda-function-exception, "AlreadyExistsException" :portkey.aws.email/already-exists-exception, "RuleDoesNotExistException" :portkey.aws.email/rule-does-not-exist-exception, "RuleSetDoesNotExistException" :portkey.aws.email/rule-set-does-not-exist-exception, "LimitExceededException" :portkey.aws.email/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef create-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email/create-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email/create-receipt-rule-response))

(clojure.core/defn get-template "Displays the template object (which includes the Subject line, HTML part and\ntext part) for the template you specify.\n You can execute this operation no more than once per second." ([get-template-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-template-request "GetTemplate" get-template-request)] (portkey.aws/-query-call portkey.aws.email/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.email/get-template-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.email/get-template-response {"TemplateDoesNotExistException" :portkey.aws.email/template-does-not-exist-exception}))))
(clojure.spec.alpha/fdef get-template :args (clojure.spec.alpha/tuple :portkey.aws.email/get-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email/get-template-response))
