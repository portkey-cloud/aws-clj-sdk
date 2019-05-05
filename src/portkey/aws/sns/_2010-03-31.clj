(ns portkey.aws.sns.-2010-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "sns", :region "us-gov-east-1"},
    :ssl-common-name "sns.us-gov-east-1.amazonaws.com",
    :endpoint "https://sns.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "sns", :region "ap-northeast-1"},
    :ssl-common-name "sns.ap-northeast-1.amazonaws.com",
    :endpoint "https://sns.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sns", :region "eu-west-1"},
    :ssl-common-name "sns.eu-west-1.amazonaws.com",
    :endpoint "https://sns.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sns", :region "us-east-2"},
    :ssl-common-name "sns.us-east-2.amazonaws.com",
    :endpoint "https://sns.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sns", :region "ap-southeast-2"},
    :ssl-common-name "sns.ap-southeast-2.amazonaws.com",
    :endpoint "https://sns.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "sns", :region "cn-north-1"},
    :ssl-common-name "sns.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sns.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "sns", :region "sa-east-1"},
    :ssl-common-name "sns.sa-east-1.amazonaws.com",
    :endpoint "https://sns.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "sns", :region "ap-southeast-1"},
    :ssl-common-name "sns.ap-southeast-1.amazonaws.com",
    :endpoint "https://sns.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "sns", :region "cn-northwest-1"},
    :ssl-common-name "sns.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://sns.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sns", :region "ap-northeast-2"},
    :ssl-common-name "sns.ap-northeast-2.amazonaws.com",
    :endpoint "https://sns.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "sns", :region "eu-west-3"},
    :ssl-common-name "sns.eu-west-3.amazonaws.com",
    :endpoint "https://sns.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "sns", :region "ca-central-1"},
    :ssl-common-name "sns.ca-central-1.amazonaws.com",
    :endpoint "https://sns.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sns", :region "eu-central-1"},
    :ssl-common-name "sns.eu-central-1.amazonaws.com",
    :endpoint "https://sns.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "sns", :region "eu-west-2"},
    :ssl-common-name "sns.eu-west-2.amazonaws.com",
    :endpoint "https://sns.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sns", :region "us-gov-west-1"},
    :ssl-common-name "sns.us-gov-west-1.amazonaws.com",
    :endpoint "https://sns.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sns", :region "us-west-2"},
    :ssl-common-name "sns.us-west-2.amazonaws.com",
    :endpoint "https://sns.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sns", :region "us-east-1"},
    :ssl-common-name "sns.us-east-1.amazonaws.com",
    :endpoint "https://sns.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "sns", :region "us-west-1"},
    :ssl-common-name "sns.us-west-1.amazonaws.com",
    :endpoint "https://sns.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sns", :region "ap-south-1"},
    :ssl-common-name "sns.ap-south-1.amazonaws.com",
    :endpoint "https://sns.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "sns", :region "eu-north-1"},
    :ssl-common-name "sns.eu-north-1.amazonaws.com",
    :endpoint "https://sns.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-topic-attributes-map)

(clojure.core/declare serboolean)

(clojure.core/declare sermessage)

(clojure.core/declare serprotocol)

(clojure.core/declare sersubscription-arn)

(clojure.core/declare serattribute-name)

(clojure.core/declare sertoken)

(clojure.core/declare serstring)

(clojure.core/declare ser-list-string)

(clojure.core/declare serlabel)

(clojure.core/declare ser-subscription-attributes-map)

(clojure.core/declare ser-delegates-list)

(clojure.core/declare sernext-token)

(clojure.core/declare sermessage-structure)

(clojure.core/declare ser-message-attribute-value)

(clojure.core/declare seraction)

(clojure.core/declare sersubject)

(clojure.core/declare ser-string)

(clojure.core/declare serdelegate)

(clojure.core/declare ser-actions-list)

(clojure.core/declare ser-binary)

(clojure.core/declare ser-map-string-to-string)

(clojure.core/declare serendpoint)

(clojure.core/declare sertopic-arn)

(clojure.core/declare ser-message-attribute-map)

(clojure.core/declare serattribute-value)

(clojure.core/declare sertopic-name)

(clojure.core/declare serauthenticate-on-unsubscribe)

(clojure.core/declare ser-phone-number)

(clojure.core/defn- ser-topic-attributes-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (serattribute-name k) #:http.request.field{:map-info "key", :shape "attributeName"}) (clojure.core/into (serattribute-value v) #:http.request.field{:map-info "value", :shape "attributeValue"})])) input), :shape "TopicAttributesMap", :type "map"})

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- sermessage [input] #:http.request.field{:value input, :shape "message"})

(clojure.core/defn- serprotocol [input] #:http.request.field{:value input, :shape "protocol"})

(clojure.core/defn- sersubscription-arn [input] #:http.request.field{:value input, :shape "subscriptionARN"})

(clojure.core/defn- serattribute-name [input] #:http.request.field{:value input, :shape "attributeName"})

(clojure.core/defn- sertoken [input] #:http.request.field{:value input, :shape "token"})

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-list-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ListString", :type "list"})

(clojure.core/defn- serlabel [input] #:http.request.field{:value input, :shape "label"})

(clojure.core/defn- ser-subscription-attributes-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (serattribute-name k) #:http.request.field{:map-info "key", :shape "attributeName"}) (clojure.core/into (serattribute-value v) #:http.request.field{:map-info "value", :shape "attributeValue"})])) input), :shape "SubscriptionAttributesMap", :type "map"})

(clojure.core/defn- ser-delegates-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serdelegate coll) #:http.request.field{:shape "delegate"}))) input), :shape "DelegatesList", :type "list"})

(clojure.core/defn- sernext-token [input] #:http.request.field{:value input, :shape "nextToken"})

(clojure.core/defn- sermessage-structure [input] #:http.request.field{:value input, :shape "messageStructure"})

(clojure.core/defn- ser-message-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:data-type input)) #:http.request.field{:name "DataType", :shape "String"})], :shape "MessageAttributeValue", :type "structure"} (clojure.core/contains? input :string-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :string-value)) #:http.request.field{:name "StringValue", :shape "String"})) (clojure.core/contains? input :binary-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary (input :binary-value)) #:http.request.field{:name "BinaryValue", :shape "Binary"}))))

(clojure.core/defn- seraction [input] #:http.request.field{:value input, :shape "action"})

(clojure.core/defn- sersubject [input] #:http.request.field{:value input, :shape "subject"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- serdelegate [input] #:http.request.field{:value input, :shape "delegate"})

(clojure.core/defn- ser-actions-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (seraction coll) #:http.request.field{:shape "action"}))) input), :shape "ActionsList", :type "list"})

(clojure.core/defn- ser-binary [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Binary"})

(clojure.core/defn- ser-map-string-to-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "MapStringToString", :type "map"})

(clojure.core/defn- serendpoint [input] #:http.request.field{:value input, :shape "endpoint"})

(clojure.core/defn- sertopic-arn [input] #:http.request.field{:value input, :shape "topicARN"})

(clojure.core/defn- ser-message-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String", :location-name "Name"}) (clojure.core/into (ser-message-attribute-value v) #:http.request.field{:map-info "value", :shape "MessageAttributeValue", :location-name "Value"})])) input), :shape "MessageAttributeMap", :type "map"})

(clojure.core/defn- serattribute-value [input] #:http.request.field{:value input, :shape "attributeValue"})

(clojure.core/defn- sertopic-name [input] #:http.request.field{:value input, :shape "topicName"})

(clojure.core/defn- serauthenticate-on-unsubscribe [input] #:http.request.field{:value input, :shape "authenticateOnUnsubscribe"})

(clojure.core/defn- ser-phone-number [input] #:http.request.field{:value input, :shape "PhoneNumber"})

(clojure.core/defn- req-delete-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]}))

(clojure.core/defn- req-get-subscription-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sersubscription-arn (input :subscription-arn)) #:http.request.field{:name "SubscriptionArn", :shape "subscriptionARN"})]}))

(clojure.core/defn- req-list-phone-numbers-opted-out-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :next-token)) #:http.request.field{:name "nextToken", :shape "string"}))))

(clojure.core/defn- req-set-platform-application-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"}) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-subscribe-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serprotocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "protocol"})]} (clojure.core/contains? input :endpoint) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serendpoint (input :endpoint)) #:http.request.field{:name "Endpoint", :shape "endpoint"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subscription-attributes-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "SubscriptionAttributesMap"})) (clojure.core/contains? input :return-subscription-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :return-subscription-arn)) #:http.request.field{:name "ReturnSubscriptionArn", :shape "boolean"}))))

(clojure.core/defn- req-get-sms-attributes-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-string (input :attributes)) #:http.request.field{:name "attributes", :shape "ListString"}))))

(clojure.core/defn- req-publish-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sermessage (input :message)) #:http.request.field{:name "Message", :shape "message"})]} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})) (clojure.core/contains? input :target-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target-arn)) #:http.request.field{:name "TargetArn", :shape "String"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "String"})) (clojure.core/contains? input :subject) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sersubject (input :subject)) #:http.request.field{:name "Subject", :shape "subject"})) (clojure.core/contains? input :message-structure) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermessage-structure (input :message-structure)) #:http.request.field{:name "MessageStructure", :shape "messageStructure"})) (clojure.core/contains? input :message-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-attribute-map (input :message-attributes)) #:http.request.field{:name "MessageAttributes", :shape "MessageAttributeMap"}))))

(clojure.core/defn- req-list-topics-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "nextToken"}))))

(clojure.core/defn- req-get-platform-application-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"})]}))

(clojure.core/defn- req-list-platform-applications-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-subscriptions-by-topic-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "nextToken"}))))

(clojure.core/defn- req-get-topic-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})]}))

(clojure.core/defn- req-create-platform-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"}) (clojure.core/into (ser-string (input :token)) #:http.request.field{:name "Token", :shape "String"})]} (clojure.core/contains? input :custom-user-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-user-data)) #:http.request.field{:name "CustomUserData", :shape "String"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"}))))

(clojure.core/defn- req-create-topic-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-name (input :name)) #:http.request.field{:name "Name", :shape "topicName"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-attributes-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "TopicAttributesMap"}))))

(clojure.core/defn- req-create-platform-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :platform)) #:http.request.field{:name "Platform", :shape "String"}) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-remove-permission-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serlabel (input :label)) #:http.request.field{:name "Label", :shape "label"})]}))

(clojure.core/defn- req-set-endpoint-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"}) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-delete-platform-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"})]}))

(clojure.core/defn- req-delete-topic-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})]}))

(clojure.core/defn- req-get-endpoint-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]}))

(clojure.core/defn- req-opt-in-phone-number-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-phone-number (input :phone-number)) #:http.request.field{:name "phoneNumber", :shape "PhoneNumber"})]}))

(clojure.core/defn- req-unsubscribe-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sersubscription-arn (input :subscription-arn)) #:http.request.field{:name "SubscriptionArn", :shape "subscriptionARN"})]}))

(clojure.core/defn- req-set-subscription-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sersubscription-arn (input :subscription-arn)) #:http.request.field{:name "SubscriptionArn", :shape "subscriptionARN"}) (clojure.core/into (serattribute-name (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "attributeName"})]} (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serattribute-value (input :attribute-value)) #:http.request.field{:name "AttributeValue", :shape "attributeValue"}))))

(clojure.core/defn- req-add-permission-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serlabel (input :label)) #:http.request.field{:name "Label", :shape "label"}) (clojure.core/into (ser-delegates-list (input :aws-account-id)) #:http.request.field{:name "AWSAccountId", :shape "DelegatesList"}) (clojure.core/into (ser-actions-list (input :action-name)) #:http.request.field{:name "ActionName", :shape "ActionsList"})]}))

(clojure.core/defn- req-check-if-phone-number-is-opted-out-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-phone-number (input :phone-number)) #:http.request.field{:name "phoneNumber", :shape "PhoneNumber"})]}))

(clojure.core/defn- req-list-endpoints-by-platform-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-subscriptions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "nextToken"}))))

(clojure.core/defn- req-set-sms-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-set-topic-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serattribute-name (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "attributeName"})]} (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serattribute-value (input :attribute-value)) #:http.request.field{:name "AttributeValue", :shape "attributeValue"}))))

(clojure.core/defn- req-confirm-subscription-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (sertoken (input :token)) #:http.request.field{:name "Token", :shape "token"})]} (clojure.core/contains? input :authenticate-on-unsubscribe) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serauthenticate-on-unsubscribe (input :authenticate-on-unsubscribe)) #:http.request.field{:name "AuthenticateOnUnsubscribe", :shape "authenticateOnUnsubscribe"}))))

(clojure.core/declare deser-topic-attributes-map)

(clojure.core/declare deserboolean)

(clojure.core/declare deserprotocol)

(clojure.core/declare desersubscription-arn)

(clojure.core/declare deserattribute-name)

(clojure.core/declare deserstring)

(clojure.core/declare deser-subscriptions-list)

(clojure.core/declare deser-subscription-attributes-map)

(clojure.core/declare deser-topic)

(clojure.core/declare desernext-token)

(clojure.core/declare deser-list-of-platform-applications)

(clojure.core/declare deser-phone-number-list)

(clojure.core/declare deser-topics-list)

(clojure.core/declare deseraccount)

(clojure.core/declare deser-string)

(clojure.core/declare deser-platform-application)

(clojure.core/declare desermessage-id)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deser-subscription)

(clojure.core/declare deser-map-string-to-string)

(clojure.core/declare deserendpoint)

(clojure.core/declare desertopic-arn)

(clojure.core/declare deserattribute-value)

(clojure.core/declare deser-phone-number)

(clojure.core/declare deser-list-of-endpoints)

(clojure.core/defn- deser-topic-attributes-map [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deserattribute-name k) (deserattribute-value v)]))) input)))

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deserprotocol [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desersubscription-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserattribute-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserstring [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-subscriptions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscription coll))) input))

(clojure.core/defn- deser-subscription-attributes-map [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deserattribute-name k) (deserattribute-value v)]))) input)))

(clojure.core/defn- deser-topic [input] (clojure.core/let [letvar1753913 {"TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1753913 "TopicArn") (clojure.core/assoc :topic-arn (desertopic-arn (clojure.core/get-in letvar1753913 ["TopicArn" :content]))))))

(clojure.core/defn- desernext-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-list-of-platform-applications [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-application coll))) input))

(clojure.core/defn- deser-phone-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-phone-number coll))) input))

(clojure.core/defn- deser-topics-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-topic coll))) input))

(clojure.core/defn- deseraccount [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-application [input] (clojure.core/let [letvar1754087 {"PlatformApplicationArn" (portkey.aws/search-for-tag input "PlatformApplicationArn" :flattened? nil :xmlAttribute? nil), "Attributes" (portkey.aws/search-for-tag input "Attributes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1754087 "PlatformApplicationArn") (clojure.core/assoc :platform-application-arn (deser-string (clojure.core/get-in letvar1754087 ["PlatformApplicationArn" :content]))) (letvar1754087 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar1754087 ["Attributes" :content]))))))

(clojure.core/defn- desermessage-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-endpoint [input] (clojure.core/let [letvar1754200 {"EndpointArn" (portkey.aws/search-for-tag input "EndpointArn" :flattened? nil :xmlAttribute? nil), "Attributes" (portkey.aws/search-for-tag input "Attributes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1754200 "EndpointArn") (clojure.core/assoc :endpoint-arn (deser-string (clojure.core/get-in letvar1754200 ["EndpointArn" :content]))) (letvar1754200 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar1754200 ["Attributes" :content]))))))

(clojure.core/defn- deser-subscription [input] (clojure.core/let [letvar1754308 {"SubscriptionArn" (portkey.aws/search-for-tag input "SubscriptionArn" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "Endpoint" (portkey.aws/search-for-tag input "Endpoint" :flattened? nil :xmlAttribute? nil), "TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1754308 "SubscriptionArn") (clojure.core/assoc :subscription-arn (desersubscription-arn (clojure.core/get-in letvar1754308 ["SubscriptionArn" :content]))) (letvar1754308 "Owner") (clojure.core/assoc :owner (deseraccount (clojure.core/get-in letvar1754308 ["Owner" :content]))) (letvar1754308 "Protocol") (clojure.core/assoc :protocol (deserprotocol (clojure.core/get-in letvar1754308 ["Protocol" :content]))) (letvar1754308 "Endpoint") (clojure.core/assoc :endpoint (deserendpoint (clojure.core/get-in letvar1754308 ["Endpoint" :content]))) (letvar1754308 "TopicArn") (clojure.core/assoc :topic-arn (desertopic-arn (clojure.core/get-in letvar1754308 ["TopicArn" :content]))))))

(clojure.core/defn- deser-map-string-to-string [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)]))) input)))

(clojure.core/defn- deserendpoint [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desertopic-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserattribute-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-phone-number [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-list-of-endpoints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint coll))) input))

(clojure.core/defn- response-list-platform-applications-response ([input] (response-list-platform-applications-response nil input)) ([resultWrapper1754370 input] (clojure.core/let [rawinput1754369 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754371 {"PlatformApplications" (portkey.aws/search-for-tag rawinput1754369 "PlatformApplications" :flattened? nil :result-wrapper resultWrapper1754370), "NextToken" (portkey.aws/search-for-tag rawinput1754369 "NextToken" :flattened? nil :result-wrapper resultWrapper1754370)}] (clojure.core/cond-> {} (letvar1754371 "PlatformApplications") (clojure.core/assoc :platform-applications (deser-list-of-platform-applications (clojure.core/get-in letvar1754371 ["PlatformApplications" :content]))) (letvar1754371 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1754371 ["NextToken" :content])))))))

(clojure.core/defn- response-get-sms-attributes-response ([input] (response-get-sms-attributes-response nil input)) ([resultWrapper1754373 input] (clojure.core/let [rawinput1754372 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754374 {"attributes" (portkey.aws/search-for-tag rawinput1754372 "attributes" :flattened? nil :result-wrapper resultWrapper1754373)}] (clojure.core/cond-> {} (letvar1754374 "attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar1754374 ["attributes" :content])))))))

(clojure.core/defn- response-list-topics-response ([input] (response-list-topics-response nil input)) ([resultWrapper1754376 input] (clojure.core/let [rawinput1754375 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754377 {"Topics" (portkey.aws/search-for-tag rawinput1754375 "Topics" :flattened? nil :result-wrapper resultWrapper1754376), "NextToken" (portkey.aws/search-for-tag rawinput1754375 "NextToken" :flattened? nil :result-wrapper resultWrapper1754376)}] (clojure.core/cond-> {} (letvar1754377 "Topics") (clojure.core/assoc :topics (deser-topics-list (clojure.core/get-in letvar1754377 ["Topics" :content]))) (letvar1754377 "NextToken") (clojure.core/assoc :next-token (desernext-token (clojure.core/get-in letvar1754377 ["NextToken" :content])))))))

(clojure.core/defn- response-check-if-phone-number-is-opted-out-response ([input] (response-check-if-phone-number-is-opted-out-response nil input)) ([resultWrapper1754379 input] (clojure.core/let [rawinput1754378 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754380 {"isOptedOut" (portkey.aws/search-for-tag rawinput1754378 "isOptedOut" :flattened? nil :result-wrapper resultWrapper1754379)}] (clojure.core/cond-> {} (letvar1754380 "isOptedOut") (clojure.core/assoc :is-opted-out (deserboolean (clojure.core/get-in letvar1754380 ["isOptedOut" :content])))))))

(clojure.core/defn- response-set-sms-attributes-response ([input] (response-set-sms-attributes-response nil input)) ([resultWrapper1754382 input] (clojure.core/let [rawinput1754381 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754383 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-platform-application-disabled-exception ([input] (response-platform-application-disabled-exception nil input)) ([resultWrapper1754385 input] (clojure.core/let [rawinput1754384 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754386 {"message" (portkey.aws/search-for-tag rawinput1754384 "message" :flattened? nil :result-wrapper resultWrapper1754385)}] (clojure.core/cond-> {} (letvar1754386 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754386 ["message" :content])))))))

(clojure.core/defn- response-kms-not-found-exception ([input] (response-kms-not-found-exception nil input)) ([resultWrapper1754388 input] (clojure.core/let [rawinput1754387 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754389 {"message" (portkey.aws/search-for-tag rawinput1754387 "message" :flattened? nil :result-wrapper resultWrapper1754388)}] (clojure.core/cond-> {} (letvar1754389 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754389 ["message" :content])))))))

(clojure.core/defn- response-kms-invalid-state-exception ([input] (response-kms-invalid-state-exception nil input)) ([resultWrapper1754391 input] (clojure.core/let [rawinput1754390 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754392 {"message" (portkey.aws/search-for-tag rawinput1754390 "message" :flattened? nil :result-wrapper resultWrapper1754391)}] (clojure.core/cond-> {} (letvar1754392 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754392 ["message" :content])))))))

(clojure.core/defn- response-create-endpoint-response ([input] (response-create-endpoint-response nil input)) ([resultWrapper1754394 input] (clojure.core/let [rawinput1754393 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754395 {"EndpointArn" (portkey.aws/search-for-tag rawinput1754393 "EndpointArn" :flattened? nil :result-wrapper resultWrapper1754394)}] (clojure.core/cond-> {} (letvar1754395 "EndpointArn") (clojure.core/assoc :endpoint-arn (deser-string (clojure.core/get-in letvar1754395 ["EndpointArn" :content])))))))

(clojure.core/defn- response-kms-disabled-exception ([input] (response-kms-disabled-exception nil input)) ([resultWrapper1754397 input] (clojure.core/let [rawinput1754396 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754398 {"message" (portkey.aws/search-for-tag rawinput1754396 "message" :flattened? nil :result-wrapper resultWrapper1754397)}] (clojure.core/cond-> {} (letvar1754398 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754398 ["message" :content])))))))

(clojure.core/defn- response-create-topic-response ([input] (response-create-topic-response nil input)) ([resultWrapper1754400 input] (clojure.core/let [rawinput1754399 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754401 {"TopicArn" (portkey.aws/search-for-tag rawinput1754399 "TopicArn" :flattened? nil :result-wrapper resultWrapper1754400)}] (clojure.core/cond-> {} (letvar1754401 "TopicArn") (clojure.core/assoc :topic-arn (desertopic-arn (clojure.core/get-in letvar1754401 ["TopicArn" :content])))))))

(clojure.core/defn- response-get-endpoint-attributes-response ([input] (response-get-endpoint-attributes-response nil input)) ([resultWrapper1754403 input] (clojure.core/let [rawinput1754402 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754404 {"Attributes" (portkey.aws/search-for-tag rawinput1754402 "Attributes" :flattened? nil :result-wrapper resultWrapper1754403)}] (clojure.core/cond-> {} (letvar1754404 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar1754404 ["Attributes" :content])))))))

(clojure.core/defn- response-publish-response ([input] (response-publish-response nil input)) ([resultWrapper1754406 input] (clojure.core/let [rawinput1754405 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754407 {"MessageId" (portkey.aws/search-for-tag rawinput1754405 "MessageId" :flattened? nil :result-wrapper resultWrapper1754406)}] (clojure.core/cond-> {} (letvar1754407 "MessageId") (clojure.core/assoc :message-id (desermessage-id (clojure.core/get-in letvar1754407 ["MessageId" :content])))))))

(clojure.core/defn- response-list-phone-numbers-opted-out-response ([input] (response-list-phone-numbers-opted-out-response nil input)) ([resultWrapper1754409 input] (clojure.core/let [rawinput1754408 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754410 {"phoneNumbers" (portkey.aws/search-for-tag rawinput1754408 "phoneNumbers" :flattened? nil :result-wrapper resultWrapper1754409), "nextToken" (portkey.aws/search-for-tag rawinput1754408 "nextToken" :flattened? nil :result-wrapper resultWrapper1754409)}] (clojure.core/cond-> {} (letvar1754410 "phoneNumbers") (clojure.core/assoc :phone-numbers (deser-phone-number-list (clojure.core/get-in letvar1754410 ["phoneNumbers" :content]))) (letvar1754410 "nextToken") (clojure.core/assoc :next-token (deserstring (clojure.core/get-in letvar1754410 ["nextToken" :content])))))))

(clojure.core/defn- response-filter-policy-limit-exceeded-exception ([input] (response-filter-policy-limit-exceeded-exception nil input)) ([resultWrapper1754412 input] (clojure.core/let [rawinput1754411 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754413 {"message" (portkey.aws/search-for-tag rawinput1754411 "message" :flattened? nil :result-wrapper resultWrapper1754412)}] (clojure.core/cond-> {} (letvar1754413 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754413 ["message" :content])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper1754415 input] (clojure.core/let [rawinput1754414 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754416 {"message" (portkey.aws/search-for-tag rawinput1754414 "message" :flattened? nil :result-wrapper resultWrapper1754415)}] (clojure.core/cond-> {} (letvar1754416 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754416 ["message" :content])))))))

(clojure.core/defn- response-kms-access-denied-exception ([input] (response-kms-access-denied-exception nil input)) ([resultWrapper1754418 input] (clojure.core/let [rawinput1754417 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754419 {"message" (portkey.aws/search-for-tag rawinput1754417 "message" :flattened? nil :result-wrapper resultWrapper1754418)}] (clojure.core/cond-> {} (letvar1754419 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754419 ["message" :content])))))))

(clojure.core/defn- response-list-subscriptions-by-topic-response ([input] (response-list-subscriptions-by-topic-response nil input)) ([resultWrapper1754421 input] (clojure.core/let [rawinput1754420 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754422 {"Subscriptions" (portkey.aws/search-for-tag rawinput1754420 "Subscriptions" :flattened? nil :result-wrapper resultWrapper1754421), "NextToken" (portkey.aws/search-for-tag rawinput1754420 "NextToken" :flattened? nil :result-wrapper resultWrapper1754421)}] (clojure.core/cond-> {} (letvar1754422 "Subscriptions") (clojure.core/assoc :subscriptions (deser-subscriptions-list (clojure.core/get-in letvar1754422 ["Subscriptions" :content]))) (letvar1754422 "NextToken") (clojure.core/assoc :next-token (desernext-token (clojure.core/get-in letvar1754422 ["NextToken" :content])))))))

(clojure.core/defn- response-subscribe-response ([input] (response-subscribe-response nil input)) ([resultWrapper1754424 input] (clojure.core/let [rawinput1754423 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754425 {"SubscriptionArn" (portkey.aws/search-for-tag rawinput1754423 "SubscriptionArn" :flattened? nil :result-wrapper resultWrapper1754424)}] (clojure.core/cond-> {} (letvar1754425 "SubscriptionArn") (clojure.core/assoc :subscription-arn (desersubscription-arn (clojure.core/get-in letvar1754425 ["SubscriptionArn" :content])))))))

(clojure.core/defn- response-list-subscriptions-response ([input] (response-list-subscriptions-response nil input)) ([resultWrapper1754427 input] (clojure.core/let [rawinput1754426 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754428 {"Subscriptions" (portkey.aws/search-for-tag rawinput1754426 "Subscriptions" :flattened? nil :result-wrapper resultWrapper1754427), "NextToken" (portkey.aws/search-for-tag rawinput1754426 "NextToken" :flattened? nil :result-wrapper resultWrapper1754427)}] (clojure.core/cond-> {} (letvar1754428 "Subscriptions") (clojure.core/assoc :subscriptions (deser-subscriptions-list (clojure.core/get-in letvar1754428 ["Subscriptions" :content]))) (letvar1754428 "NextToken") (clojure.core/assoc :next-token (desernext-token (clojure.core/get-in letvar1754428 ["NextToken" :content])))))))

(clojure.core/defn- response-confirm-subscription-response ([input] (response-confirm-subscription-response nil input)) ([resultWrapper1754430 input] (clojure.core/let [rawinput1754429 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754431 {"SubscriptionArn" (portkey.aws/search-for-tag rawinput1754429 "SubscriptionArn" :flattened? nil :result-wrapper resultWrapper1754430)}] (clojure.core/cond-> {} (letvar1754431 "SubscriptionArn") (clojure.core/assoc :subscription-arn (desersubscription-arn (clojure.core/get-in letvar1754431 ["SubscriptionArn" :content])))))))

(clojure.core/defn- response-invalid-security-exception ([input] (response-invalid-security-exception nil input)) ([resultWrapper1754433 input] (clojure.core/let [rawinput1754432 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754434 {"message" (portkey.aws/search-for-tag rawinput1754432 "message" :flattened? nil :result-wrapper resultWrapper1754433)}] (clojure.core/cond-> {} (letvar1754434 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754434 ["message" :content])))))))

(clojure.core/defn- response-authorization-error-exception ([input] (response-authorization-error-exception nil input)) ([resultWrapper1754436 input] (clojure.core/let [rawinput1754435 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754437 {"message" (portkey.aws/search-for-tag rawinput1754435 "message" :flattened? nil :result-wrapper resultWrapper1754436)}] (clojure.core/cond-> {} (letvar1754437 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754437 ["message" :content])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1754439 input] (clojure.core/let [rawinput1754438 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754440 {"message" (portkey.aws/search-for-tag rawinput1754438 "message" :flattened? nil :result-wrapper resultWrapper1754439)}] (clojure.core/cond-> {} (letvar1754440 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754440 ["message" :content])))))))

(clojure.core/defn- response-get-subscription-attributes-response ([input] (response-get-subscription-attributes-response nil input)) ([resultWrapper1754442 input] (clojure.core/let [rawinput1754441 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754443 {"Attributes" (portkey.aws/search-for-tag rawinput1754441 "Attributes" :flattened? nil :result-wrapper resultWrapper1754442)}] (clojure.core/cond-> {} (letvar1754443 "Attributes") (clojure.core/assoc :attributes (deser-subscription-attributes-map (clojure.core/get-in letvar1754443 ["Attributes" :content])))))))

(clojure.core/defn- response-list-endpoints-by-platform-application-response ([input] (response-list-endpoints-by-platform-application-response nil input)) ([resultWrapper1754445 input] (clojure.core/let [rawinput1754444 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754446 {"Endpoints" (portkey.aws/search-for-tag rawinput1754444 "Endpoints" :flattened? nil :result-wrapper resultWrapper1754445), "NextToken" (portkey.aws/search-for-tag rawinput1754444 "NextToken" :flattened? nil :result-wrapper resultWrapper1754445)}] (clojure.core/cond-> {} (letvar1754446 "Endpoints") (clojure.core/assoc :endpoints (deser-list-of-endpoints (clojure.core/get-in letvar1754446 ["Endpoints" :content]))) (letvar1754446 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1754446 ["NextToken" :content])))))))

(clojure.core/defn- response-topic-limit-exceeded-exception ([input] (response-topic-limit-exceeded-exception nil input)) ([resultWrapper1754448 input] (clojure.core/let [rawinput1754447 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754449 {"message" (portkey.aws/search-for-tag rawinput1754447 "message" :flattened? nil :result-wrapper resultWrapper1754448)}] (clojure.core/cond-> {} (letvar1754449 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754449 ["message" :content])))))))

(clojure.core/defn- response-subscription-limit-exceeded-exception ([input] (response-subscription-limit-exceeded-exception nil input)) ([resultWrapper1754451 input] (clojure.core/let [rawinput1754450 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754452 {"message" (portkey.aws/search-for-tag rawinput1754450 "message" :flattened? nil :result-wrapper resultWrapper1754451)}] (clojure.core/cond-> {} (letvar1754452 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754452 ["message" :content])))))))

(clojure.core/defn- response-kms-throttling-exception ([input] (response-kms-throttling-exception nil input)) ([resultWrapper1754454 input] (clojure.core/let [rawinput1754453 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754455 {"message" (portkey.aws/search-for-tag rawinput1754453 "message" :flattened? nil :result-wrapper resultWrapper1754454)}] (clojure.core/cond-> {} (letvar1754455 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754455 ["message" :content])))))))

(clojure.core/defn- response-kms-opt-in-required ([input] (response-kms-opt-in-required nil input)) ([resultWrapper1754457 input] (clojure.core/let [rawinput1754456 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754458 {"message" (portkey.aws/search-for-tag rawinput1754456 "message" :flattened? nil :result-wrapper resultWrapper1754457)}] (clojure.core/cond-> {} (letvar1754458 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754458 ["message" :content])))))))

(clojure.core/defn- response-create-platform-application-response ([input] (response-create-platform-application-response nil input)) ([resultWrapper1754460 input] (clojure.core/let [rawinput1754459 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754461 {"PlatformApplicationArn" (portkey.aws/search-for-tag rawinput1754459 "PlatformApplicationArn" :flattened? nil :result-wrapper resultWrapper1754460)}] (clojure.core/cond-> {} (letvar1754461 "PlatformApplicationArn") (clojure.core/assoc :platform-application-arn (deser-string (clojure.core/get-in letvar1754461 ["PlatformApplicationArn" :content])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1754463 input] (clojure.core/let [rawinput1754462 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754464 {"message" (portkey.aws/search-for-tag rawinput1754462 "message" :flattened? nil :result-wrapper resultWrapper1754463)}] (clojure.core/cond-> {} (letvar1754464 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754464 ["message" :content])))))))

(clojure.core/defn- response-opt-in-phone-number-response ([input] (response-opt-in-phone-number-response nil input)) ([resultWrapper1754466 input] (clojure.core/let [rawinput1754465 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754467 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-topic-attributes-response ([input] (response-get-topic-attributes-response nil input)) ([resultWrapper1754469 input] (clojure.core/let [rawinput1754468 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754470 {"Attributes" (portkey.aws/search-for-tag rawinput1754468 "Attributes" :flattened? nil :result-wrapper resultWrapper1754469)}] (clojure.core/cond-> {} (letvar1754470 "Attributes") (clojure.core/assoc :attributes (deser-topic-attributes-map (clojure.core/get-in letvar1754470 ["Attributes" :content])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper1754472 input] (clojure.core/let [rawinput1754471 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754473 {"message" (portkey.aws/search-for-tag rawinput1754471 "message" :flattened? nil :result-wrapper resultWrapper1754472)}] (clojure.core/cond-> {} (letvar1754473 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754473 ["message" :content])))))))

(clojure.core/defn- response-get-platform-application-attributes-response ([input] (response-get-platform-application-attributes-response nil input)) ([resultWrapper1754475 input] (clojure.core/let [rawinput1754474 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754476 {"Attributes" (portkey.aws/search-for-tag rawinput1754474 "Attributes" :flattened? nil :result-wrapper resultWrapper1754475)}] (clojure.core/cond-> {} (letvar1754476 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar1754476 ["Attributes" :content])))))))

(clojure.core/defn- response-throttled-exception ([input] (response-throttled-exception nil input)) ([resultWrapper1754478 input] (clojure.core/let [rawinput1754477 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754479 {"message" (portkey.aws/search-for-tag rawinput1754477 "message" :flattened? nil :result-wrapper resultWrapper1754478)}] (clojure.core/cond-> {} (letvar1754479 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754479 ["message" :content])))))))

(clojure.core/defn- response-endpoint-disabled-exception ([input] (response-endpoint-disabled-exception nil input)) ([resultWrapper1754481 input] (clojure.core/let [rawinput1754480 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1754482 {"message" (portkey.aws/search-for-tag rawinput1754480 "message" :flattened? nil :result-wrapper resultWrapper1754481)}] (clojure.core/cond-> {} (letvar1754482 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1754482 ["message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-platform-applications-response/platform-applications (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-of-platform-applications))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-platform-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-platform-applications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-platform-applications-response/platform-applications :portkey.aws.sns.-2010-03-31.list-platform-applications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/topic-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns.-2010-03-31/attribute-name :portkey.aws.sns.-2010-03-31/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.delete-endpoint-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/delete-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.delete-endpoint-input/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-sms-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-sms-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.get-sms-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-topics-response/topics (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topics-list))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-topics-response/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/next-token))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-topics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-topics-response/topics :portkey.aws.sns.-2010-03-31.list-topics-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.check-if-phone-number-is-opted-out-response/is-opted-out (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/check-if-phone-number-is-opted-out-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.check-if-phone-number-is-opted-out-response/is-opted-out]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/set-sms-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subscription-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-subscription-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.get-subscription-attributes-input/subscription-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-phone-numbers-opted-out-input/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-phone-numbers-opted-out-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-phone-numbers-opted-out-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-platform-application-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/set-platform-application-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.set-platform-application-attributes-input/platform-application-arn :portkey.aws.sns.-2010-03-31.set-platform-application-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.platform-application-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/platform-application-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.platform-application-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-string (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/string))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscribe-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscribe-input/protocol (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscribe-input/endpoint (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscribe-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscribe-input/return-subscription-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subscribe-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.subscribe-input/topic-arn :portkey.aws.sns.-2010-03-31.subscribe-input/protocol] :opt-un [:portkey.aws.sns.-2010-03-31.subscribe-input/endpoint :portkey.aws.sns.-2010-03-31.subscribe-input/attributes :portkey.aws.sns.-2010-03-31.subscribe-input/return-subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/subscription))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-sms-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-sms-attributes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.get-sms-attributes-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.kms-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/kms-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.kms-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.kms-invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/kms-invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.kms-invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-input/target-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-input/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/message))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-input/subject (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subject))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-input/message-structure (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/message-structure))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-input/message-attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/message-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/publish-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.publish-input/message] :opt-un [:portkey.aws.sns.-2010-03-31.publish-input/topic-arn :portkey.aws.sns.-2010-03-31.publish-input/target-arn :portkey.aws.sns.-2010-03-31.publish-input/phone-number :portkey.aws.sns.-2010-03-31.publish-input/subject :portkey.aws.sns.-2010-03-31.publish-input/message-structure :portkey.aws.sns.-2010-03-31.publish-input/message-attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subscription-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns.-2010-03-31/attribute-name :portkey.aws.sns.-2010-03-31/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-endpoint-response/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/create-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.create-endpoint-response/endpoint-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-topics-input/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/next-token))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-topics-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-topics-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.kms-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/kms-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.kms-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/delegates-list (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/delegate))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-topic-response/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/create-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.create-topic-response/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-endpoint-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-endpoint-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.get-endpoint-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.publish-response/message-id (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/message-id))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/publish-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.publish-response/message-id]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.topic/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/topic (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.topic/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-phone-numbers-opted-out-response/phone-numbers (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/phone-number-list))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-phone-numbers-opted-out-response/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-phone-numbers-opted-out-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-phone-numbers-opted-out-response/phone-numbers :portkey.aws.sns.-2010-03-31.list-phone-numbers-opted-out-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.filter-policy-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/filter-policy-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.filter-policy-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-platform-application-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.get-platform-application-attributes-input/platform-application-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.kms-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/kms-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.kms-access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-response/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/next-token))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-subscriptions-by-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-response/subscriptions :portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-platform-applications-input/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-platform-applications-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-platform-applications-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-input/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/next-token))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-subscriptions-by-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-input/topic-arn] :opt-un [:portkey.aws.sns.-2010-03-31.list-subscriptions-by-topic-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscribe-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subscribe-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.subscribe-response/subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-subscriptions-response/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/next-token))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-subscriptions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-subscriptions-response/subscriptions :portkey.aws.sns.-2010-03-31.list-subscriptions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.confirm-subscription-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/confirm-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.confirm-subscription-response/subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-of-platform-applications (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/platform-application))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/phone-number-list (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/phone-number))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/message-structure (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.message-attribute-value/data-type (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.message-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.message-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/binary))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/message-attribute-value (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.message-attribute-value/data-type] :opt-un [:portkey.aws.sns.-2010-03-31.message-attribute-value/string-value :portkey.aws.sns.-2010-03-31.message-attribute-value/binary-value]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-topic-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.get-topic-attributes-input/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/custom-user-data (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/create-platform-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/platform-application-arn :portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/token] :opt-un [:portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/custom-user-data :portkey.aws.sns.-2010-03-31.create-platform-endpoint-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.invalid-security-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/invalid-security-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.invalid-security-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/action (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.authorization-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/authorization-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.authorization-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-subscription-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-subscription-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.get-subscription-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-response/endpoints (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-of-endpoints))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-response/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-endpoints-by-platform-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-response/endpoints :portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/topics-list (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/topic))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-topic-input/name (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-name))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-topic-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/create-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.create-topic-input/name] :opt-un [:portkey.aws.sns.-2010-03-31.create-topic-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-application-input/name (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-application-input/platform (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-application-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/create-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.create-platform-application-input/name :portkey.aws.sns.-2010-03-31.create-platform-application-input/platform :portkey.aws.sns.-2010-03-31.create-platform-application-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/account (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.remove-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.remove-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/label))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/remove-permission-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.remove-permission-input/topic-arn :portkey.aws.sns.-2010-03-31.remove-permission-input/label] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-endpoint-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/set-endpoint-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.set-endpoint-attributes-input/endpoint-arn :portkey.aws.sns.-2010-03-31.set-endpoint-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.topic-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/topic-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.topic-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.delete-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/delete-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.delete-platform-application-input/platform-application-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscription-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subscription-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.subscription-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.platform-application/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.platform-application/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/platform-application (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.platform-application/platform-application-arn :portkey.aws.sns.-2010-03-31.platform-application/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.delete-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/delete-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.delete-topic-input/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-endpoint-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.get-endpoint-attributes-input/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.kms-throttling-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/kms-throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.kms-throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/delegate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/actions-list (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/action))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.opt-in-phone-number-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/opt-in-phone-number-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.opt-in-phone-number-input/phone-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.endpoint/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.endpoint/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.endpoint/endpoint-arn :portkey.aws.sns.-2010-03-31.endpoint/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.unsubscribe-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/unsubscribe-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.unsubscribe-input/subscription-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-subscription-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-subscription-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/set-subscription-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.set-subscription-attributes-input/subscription-arn :portkey.aws.sns.-2010-03-31.set-subscription-attributes-input/attribute-name] :opt-un [:portkey.aws.sns.-2010-03-31.set-subscription-attributes-input/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/binary clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.kms-opt-in-required/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/kms-opt-in-required (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.kms-opt-in-required/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscription/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscription/owner (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/account))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscription/protocol (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscription/endpoint (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.subscription/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.subscription/subscription-arn :portkey.aws.sns.-2010-03-31.subscription/owner :portkey.aws.sns.-2010-03-31.subscription/protocol :portkey.aws.sns.-2010-03-31.subscription/endpoint :portkey.aws.sns.-2010-03-31.subscription/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.create-platform-application-response/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/create-platform-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.create-platform-application-response/platform-application-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/map-string-to-string (clojure.spec.alpha/map-of :portkey.aws.sns.-2010-03-31/string :portkey.aws.sns.-2010-03-31/string))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/message-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sns.-2010-03-31/string :portkey.aws.sns.-2010-03-31/message-attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.add-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.add-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/label))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.add-permission-input/aws-account-id (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/delegates-list))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.add-permission-input/action-name (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/actions-list))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/add-permission-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.add-permission-input/topic-arn :portkey.aws.sns.-2010-03-31.add-permission-input/label :portkey.aws.sns.-2010-03-31.add-permission-input/aws-account-id :portkey.aws.sns.-2010-03-31.add-permission-input/action-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.check-if-phone-number-is-opted-out-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/check-if-phone-number-is-opted-out-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.check-if-phone-number-is-opted-out-input/phone-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-input/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-endpoints-by-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-input/platform-application-arn] :opt-un [:portkey.aws.sns.-2010-03-31.list-endpoints-by-platform-application-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/opt-in-phone-number-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-topic-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-topic-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.get-topic-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.list-subscriptions-input/next-token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/next-token))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-subscriptions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.list-subscriptions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.get-platform-application-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/get-platform-application-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.get-platform-application-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.throttled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/topic-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.endpoint-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/endpoint-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.-2010-03-31.endpoint-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-sms-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/set-sms-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.set-sms-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/authenticate-on-unsubscribe (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-topic-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.set-topic-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/set-topic-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.set-topic-attributes-input/topic-arn :portkey.aws.sns.-2010-03-31.set-topic-attributes-input/attribute-name] :opt-un [:portkey.aws.sns.-2010-03-31.set-topic-attributes-input/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.confirm-subscription-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.confirm-subscription-input/token (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/token))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31.confirm-subscription-input/authenticate-on-unsubscribe (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/authenticate-on-unsubscribe))
(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/confirm-subscription-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.-2010-03-31.confirm-subscription-input/topic-arn :portkey.aws.sns.-2010-03-31.confirm-subscription-input/token] :opt-un [:portkey.aws.sns.-2010-03-31.confirm-subscription-input/authenticate-on-unsubscribe]))

(clojure.spec.alpha/def :portkey.aws.sns.-2010-03-31/list-of-endpoints (clojure.spec.alpha/coll-of :portkey.aws.sns.-2010-03-31/endpoint))

(clojure.core/defn get-endpoint-attributes "Retrieves the endpoint attributes for a device on one of the supported push\nnotification services, such as GCM and APNS. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([get-endpoint-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-endpoint-attributes-input get-endpoint-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/get-endpoint-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/get-endpoint-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetEndpointAttributesResult", :http.request.configuration/action "GetEndpointAttributes", :http.request.configuration/output-deser-fn response-get-endpoint-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef get-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/get-endpoint-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/get-endpoint-attributes-response))

(clojure.core/defn delete-topic "Deletes a topic and all its subscriptions. Deleting a topic might prevent some\nmessages previously sent to the topic from being delivered to subscribers. This\naction is idempotent, so deleting a topic that does not exist does not result in\nan error." ([delete-topic-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-topic-input delete-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/delete-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTopic", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/delete-topic-input) :ret clojure.core/true?)

(clojure.core/defn unsubscribe "Deletes a subscription. If the subscription requires authentication for\ndeletion, only the owner of the subscription or the topic's owner can\nunsubscribe, and an AWS signature is required. If the Unsubscribe call does not\nrequire authentication and the requester is not the subscription owner, a final\ncancellation message is delivered to the endpoint, so that the endpoint owner\ncan easily resubscribe to the topic if the Unsubscribe request was unintended.\n This action is throttled at 100 transactions per second (TPS)." ([unsubscribe-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-unsubscribe-input unsubscribe-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/unsubscribe-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Unsubscribe", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "InvalidSecurityException" :portkey.aws.sns.-2010-03-31/invalid-security-exception}})))))
(clojure.spec.alpha/fdef unsubscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/unsubscribe-input) :ret clojure.core/true?)

(clojure.core/defn list-subscriptions "Returns a list of the requester's subscriptions. Each call returns a limited\nlist of subscriptions, up to 100. If there are more subscriptions, a NextToken\nis also returned. Use the NextToken parameter in a new ListSubscriptions call to\nget further results.\n This action is throttled at 30 transactions per second (TPS)." ([] (list-subscriptions {})) ([list-subscriptions-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-subscriptions-input list-subscriptions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/list-subscriptions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/list-subscriptions-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListSubscriptionsResult", :http.request.configuration/action "ListSubscriptions", :http.request.configuration/output-deser-fn response-list-subscriptions-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-subscriptions :args (clojure.spec.alpha/? :portkey.aws.sns.-2010-03-31/list-subscriptions-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-subscriptions-response))

(clojure.core/defn set-sms-attributes "Use this request to set the default settings for sending SMS messages and\nreceiving daily SMS usage reports.\n You can override some of these settings for a single message when you use the\nPublish action with the MessageAttributes.entry.N parameter. For more\ninformation, see Sending an SMS Message\n(http://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html) in the\nAmazon SNS Developer Guide." ([set-sms-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-sms-attributes-input set-sms-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/set-sms-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/set-sms-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetSMSAttributesResult", :http.request.configuration/action "SetSMSAttributes", :http.request.configuration/output-deser-fn response-set-sms-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "ThrottledException" :portkey.aws.sns.-2010-03-31/throttled-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef set-sms-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/set-sms-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/set-sms-attributes-response))

(clojure.core/defn list-endpoints-by-platform-application "Lists the endpoints and endpoint attributes for devices in a supported push\nnotification service, such as GCM and APNS. The results for\nListEndpointsByPlatformApplication are paginated and return a limited list of\nendpoints, up to 100. If additional records are available after the first page\nresults, then a NextToken string will be returned. To receive the next page, you\ncall ListEndpointsByPlatformApplication again using the NextToken string\nreceived from the previous call. When there are no more records to return,\nNextToken will be null. For more information, see Using Amazon SNS Mobile Push\nNotifications (http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html).\n This action is throttled at 30 transactions per second (TPS)." ([list-endpoints-by-platform-application-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-endpoints-by-platform-application-input list-endpoints-by-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/list-endpoints-by-platform-application-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/list-endpoints-by-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListEndpointsByPlatformApplicationResult", :http.request.configuration/action "ListEndpointsByPlatformApplication", :http.request.configuration/output-deser-fn response-list-endpoints-by-platform-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef list-endpoints-by-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/list-endpoints-by-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-endpoints-by-platform-application-response))

(clojure.core/defn opt-in-phone-number "Use this request to opt in a phone number that is opted out, which enables you\nto resume sending SMS messages to the number.\n You can opt in a phone number only once every 30 days." ([opt-in-phone-number-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-opt-in-phone-number-input opt-in-phone-number-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/opt-in-phone-number-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/opt-in-phone-number-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "OptInPhoneNumberResult", :http.request.configuration/action "OptInPhoneNumber", :http.request.configuration/output-deser-fn response-opt-in-phone-number-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns.-2010-03-31/throttled-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef opt-in-phone-number :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/opt-in-phone-number-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/opt-in-phone-number-response))

(clojure.core/defn create-topic "Creates a topic to which notifications can be published. Users can create at\nmost 100,000 topics. For more information, see http://aws.amazon.com/sns\n(http://aws.amazon.com/sns/). This action is idempotent, so if the requester\nalready owns a topic with the specified name, that topic's ARN is returned\nwithout creating a new topic." ([create-topic-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-topic-input create-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/create-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/create-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateTopicResult", :http.request.configuration/action "CreateTopic", :http.request.configuration/output-deser-fn response-create-topic-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "TopicLimitExceededException" :portkey.aws.sns.-2010-03-31/topic-limit-exceeded-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns.-2010-03-31/invalid-security-exception}})))))
(clojure.spec.alpha/fdef create-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/create-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/create-topic-response))

(clojure.core/defn get-sms-attributes "Returns the settings for sending SMS messages from your account.\n These settings are set with the SetSMSAttributes action." ([] (get-sms-attributes {})) ([get-sms-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-sms-attributes-input get-sms-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/get-sms-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/get-sms-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSMSAttributesResult", :http.request.configuration/action "GetSMSAttributes", :http.request.configuration/output-deser-fn response-get-sms-attributes-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns.-2010-03-31/throttled-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-sms-attributes :args (clojure.spec.alpha/? :portkey.aws.sns.-2010-03-31/get-sms-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/get-sms-attributes-response))

(clojure.core/defn set-subscription-attributes "Allows a subscription owner to set an attribute of the subscription to a new\nvalue." ([set-subscription-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-subscription-attributes-input set-subscription-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/set-subscription-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetSubscriptionAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "FilterPolicyLimitExceededException" :portkey.aws.sns.-2010-03-31/filter-policy-limit-exceeded-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef set-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/set-subscription-attributes-input) :ret clojure.core/true?)

(clojure.core/defn list-platform-applications "Lists the platform application objects for the supported push notification\nservices, such as APNS and GCM. The results for ListPlatformApplications are\npaginated and return a limited list of applications, up to 100. If additional\nrecords are available after the first page results, then a NextToken string will\nbe returned. To receive the next page, you call ListPlatformApplications using\nthe NextToken string received from the previous call. When there are no more\nrecords to return, NextToken will be null. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html).\n This action is throttled at 15 transactions per second (TPS)." ([] (list-platform-applications {})) ([list-platform-applications-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-platform-applications-input list-platform-applications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/list-platform-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/list-platform-applications-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPlatformApplicationsResult", :http.request.configuration/action "ListPlatformApplications", :http.request.configuration/output-deser-fn response-list-platform-applications-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-platform-applications :args (clojure.spec.alpha/? :portkey.aws.sns.-2010-03-31/list-platform-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-platform-applications-response))

(clojure.core/defn check-if-phone-number-is-opted-out "Accepts a phone number and indicates whether the phone holder has opted out of\nreceiving SMS messages from your account. You cannot send SMS messages to a\nnumber that is opted out.\n To resume sending messages, you can opt in the number by using the\nOptInPhoneNumber action." ([check-if-phone-number-is-opted-out-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-check-if-phone-number-is-opted-out-input check-if-phone-number-is-opted-out-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/check-if-phone-number-is-opted-out-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/check-if-phone-number-is-opted-out-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CheckIfPhoneNumberIsOptedOutResult", :http.request.configuration/action "CheckIfPhoneNumberIsOptedOut", :http.request.configuration/output-deser-fn response-check-if-phone-number-is-opted-out-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns.-2010-03-31/throttled-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef check-if-phone-number-is-opted-out :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/check-if-phone-number-is-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/check-if-phone-number-is-opted-out-response))

(clojure.core/defn list-topics "Returns a list of the requester's topics. Each call returns a limited list of\ntopics, up to 100. If there are more topics, a NextToken is also returned. Use\nthe NextToken parameter in a new ListTopics call to get further results.\n This action is throttled at 30 transactions per second (TPS)." ([] (list-topics {})) ([list-topics-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-topics-input list-topics-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/list-topics-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/list-topics-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListTopicsResult", :http.request.configuration/action "ListTopics", :http.request.configuration/output-deser-fn response-list-topics-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-topics :args (clojure.spec.alpha/? :portkey.aws.sns.-2010-03-31/list-topics-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-topics-response))

(clojure.core/defn get-platform-application-attributes "Retrieves the attributes of the platform application object for the supported\npush notification services, such as APNS and GCM. For more information, see\nUsing Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([get-platform-application-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-platform-application-attributes-input get-platform-application-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/get-platform-application-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/get-platform-application-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetPlatformApplicationAttributesResult", :http.request.configuration/action "GetPlatformApplicationAttributes", :http.request.configuration/output-deser-fn response-get-platform-application-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef get-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/get-platform-application-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/get-platform-application-attributes-response))

(clojure.core/defn list-phone-numbers-opted-out "Returns a list of phone numbers that are opted out, meaning you cannot send SMS\nmessages to them.\n The results for ListPhoneNumbersOptedOut are paginated, and each page returns\nup to 100 phone numbers. If additional phone numbers are available after the\nfirst page of results, then a NextToken string will be returned. To receive the\nnext page, you call ListPhoneNumbersOptedOut again using the NextToken string\nreceived from the previous call. When there are no more records to return,\nNextToken will be null." ([] (list-phone-numbers-opted-out {})) ([list-phone-numbers-opted-out-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-phone-numbers-opted-out-input list-phone-numbers-opted-out-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/list-phone-numbers-opted-out-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/list-phone-numbers-opted-out-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPhoneNumbersOptedOutResult", :http.request.configuration/action "ListPhoneNumbersOptedOut", :http.request.configuration/output-deser-fn response-list-phone-numbers-opted-out-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns.-2010-03-31/throttled-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-phone-numbers-opted-out :args (clojure.spec.alpha/? :portkey.aws.sns.-2010-03-31/list-phone-numbers-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-phone-numbers-opted-out-response))

(clojure.core/defn delete-platform-application "Deletes a platform application object for one of the supported push notification\nservices, such as APNS and GCM. For more information, see Using Amazon SNS\nMobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([delete-platform-application-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-platform-application-input delete-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/delete-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePlatformApplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef delete-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/delete-platform-application-input) :ret clojure.core/true?)

(clojure.core/defn add-permission "Adds a statement to a topic's access control policy, granting access for the\nspecified AWS accounts to the specified actions." ([add-permission-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-permission-input add-permission-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/add-permission-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddPermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/add-permission-input) :ret clojure.core/true?)

(clojure.core/defn create-platform-endpoint "Creates an endpoint for a device and mobile app on one of the supported push\nnotification services, such as GCM and APNS. CreatePlatformEndpoint requires the\nPlatformApplicationArn that is returned from CreatePlatformApplication. The\nEndpointArn that is returned when using CreatePlatformEndpoint can then be used\nby the Publish action to send a message to a mobile app or by the Subscribe\naction for subscription to a topic. The CreatePlatformEndpoint action is\nidempotent, so if the requester already owns an endpoint with the same device\ntoken and attributes, that endpoint's ARN is returned without creating a new\nendpoint. For more information, see Using Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html).\n When using CreatePlatformEndpoint with Baidu, two attributes must be provided:\nChannelId and UserId. The token field must also contain the ChannelId. For more\ninformation, see Creating an Amazon SNS Endpoint for Baidu\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html)." ([create-platform-endpoint-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-platform-endpoint-input create-platform-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/create-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/create-platform-endpoint-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePlatformEndpointResult", :http.request.configuration/action "CreatePlatformEndpoint", :http.request.configuration/output-deser-fn response-create-endpoint-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef create-platform-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/create-platform-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/create-endpoint-response))

(clojure.core/defn create-platform-application "Creates a platform application object for one of the supported push notification\nservices, such as APNS and GCM, to which devices and mobile apps may register.\nYou must specify PlatformPrincipal and PlatformCredential attributes when using\nthe CreatePlatformApplication action. The PlatformPrincipal is received from the\nnotification service. For APNS/APNS_SANDBOX, PlatformPrincipal is \"SSL\ncertificate\". For GCM, PlatformPrincipal is not applicable. For ADM,\nPlatformPrincipal is \"client id\". The PlatformCredential is also received from\nthe notification service. For WNS, PlatformPrincipal is \"Package Security\nIdentifier\". For MPNS, PlatformPrincipal is \"TLS certificate\". For Baidu,\nPlatformPrincipal is \"API key\".\n For APNS/APNS_SANDBOX, PlatformCredential is \"private key\". For GCM,\nPlatformCredential is \"API key\". For ADM, PlatformCredential is \"client secret\".\nFor WNS, PlatformCredential is \"secret key\". For MPNS, PlatformCredential is\n\"private key\". For Baidu, PlatformCredential is \"secret key\". The\nPlatformApplicationArn that is returned when using CreatePlatformApplication is\nthen used as an attribute for the CreatePlatformEndpoint action. For more\ninformation, see Using Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html). For more\ninformation about obtaining the PlatformPrincipal and PlatformCredential for\neach of the supported push notification services, see Getting Started with Apple\nPush Notification Service\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-apns.html), Getting\nStarted with Amazon Device Messaging\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-adm.html), Getting Started\nwith Baidu Cloud Push\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-baidu.html), Getting\nStarted with Google Cloud Messaging for Android\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-gcm.html), Getting Started\nwith MPNS (http://docs.aws.amazon.com/sns/latest/dg/mobile-push-mpns.html), or\nGetting Started with WNS\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-wns.html)." ([create-platform-application-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-platform-application-input create-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/create-platform-application-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/create-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePlatformApplicationResult", :http.request.configuration/action "CreatePlatformApplication", :http.request.configuration/output-deser-fn response-create-platform-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef create-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/create-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/create-platform-application-response))

(clojure.core/defn subscribe "Prepares to subscribe an endpoint by sending the endpoint a confirmation\nmessage. To actually create a subscription, the endpoint owner must call the\nConfirmSubscription action with the token from the confirmation message.\nConfirmation tokens are valid for three days.\n This action is throttled at 100 transactions per second (TPS)." ([subscribe-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-subscribe-input subscribe-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/subscribe-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/subscribe-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SubscribeResult", :http.request.configuration/action "Subscribe", :http.request.configuration/output-deser-fn response-subscribe-response, :http.request.spec/error-spec {"SubscriptionLimitExceededException" :portkey.aws.sns.-2010-03-31/subscription-limit-exceeded-exception, "FilterPolicyLimitExceededException" :portkey.aws.sns.-2010-03-31/filter-policy-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns.-2010-03-31/invalid-security-exception}})))))
(clojure.spec.alpha/fdef subscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/subscribe-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/subscribe-response))

(clojure.core/defn list-subscriptions-by-topic "Returns a list of the subscriptions to a specific topic. Each call returns a\nlimited list of subscriptions, up to 100. If there are more subscriptions, a\nNextToken is also returned. Use the NextToken parameter in a new\nListSubscriptionsByTopic call to get further results.\n This action is throttled at 30 transactions per second (TPS)." ([list-subscriptions-by-topic-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-subscriptions-by-topic-input list-subscriptions-by-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/list-subscriptions-by-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/list-subscriptions-by-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListSubscriptionsByTopicResult", :http.request.configuration/action "ListSubscriptionsByTopic", :http.request.configuration/output-deser-fn response-list-subscriptions-by-topic-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-subscriptions-by-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/list-subscriptions-by-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/list-subscriptions-by-topic-response))

(clojure.core/defn get-subscription-attributes "Returns all of the properties of a subscription." ([get-subscription-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-subscription-attributes-input get-subscription-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/get-subscription-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/get-subscription-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSubscriptionAttributesResult", :http.request.configuration/action "GetSubscriptionAttributes", :http.request.configuration/output-deser-fn response-get-subscription-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef get-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/get-subscription-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/get-subscription-attributes-response))

(clojure.core/defn remove-permission "Removes a statement from a topic's access control policy." ([remove-permission-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-permission-input remove-permission-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/remove-permission-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemovePermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/remove-permission-input) :ret clojure.core/true?)

(clojure.core/defn set-endpoint-attributes "Sets the attributes for an endpoint for a device on one of the supported push\nnotification services, such as GCM and APNS. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([set-endpoint-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-endpoint-attributes-input set-endpoint-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/set-endpoint-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetEndpointAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef set-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/set-endpoint-attributes-input) :ret clojure.core/true?)

(clojure.core/defn publish "Sends a message to an Amazon SNS topic or sends a text message (SMS message)\ndirectly to a phone number.\n If you send a message to a topic, Amazon SNS delivers the message to each\nendpoint that is subscribed to the topic. The format of the message depends on\nthe notification protocol for each subscribed endpoint.\n When a messageId is returned, the message has been saved and Amazon SNS will\nattempt to deliver it shortly.\n To use the Publish action for sending a message to a mobile endpoint, such as\nan app on a Kindle device or mobile phone, you must specify the EndpointArn for\nthe TargetArn parameter. The EndpointArn is returned when making a call with the\nCreatePlatformEndpoint action.\n For more information about formatting messages, see Send Custom\nPlatform-Specific Payloads in Messages to Mobile Devices\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html)." ([publish-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-publish-input publish-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/publish-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/publish-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PublishResult", :http.request.configuration/action "Publish", :http.request.configuration/output-deser-fn response-publish-response, :http.request.spec/error-spec {"PlatformApplicationDisabledException" :portkey.aws.sns.-2010-03-31/platform-application-disabled-exception, "KMSNotFoundException" :portkey.aws.sns.-2010-03-31/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.sns.-2010-03-31/kms-invalid-state-exception, "KMSDisabledException" :portkey.aws.sns.-2010-03-31/kms-disabled-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "KMSAccessDeniedException" :portkey.aws.sns.-2010-03-31/kms-access-denied-exception, "InvalidSecurityException" :portkey.aws.sns.-2010-03-31/invalid-security-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "KMSThrottlingException" :portkey.aws.sns.-2010-03-31/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.sns.-2010-03-31/kms-opt-in-required, "InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.sns.-2010-03-31/invalid-parameter-value-exception, "EndpointDisabledException" :portkey.aws.sns.-2010-03-31/endpoint-disabled-exception}})))))
(clojure.spec.alpha/fdef publish :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/publish-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/publish-response))

(clojure.core/defn get-topic-attributes "Returns all of the properties of a topic. Topic properties returned might differ\nbased on the authorization of the user." ([get-topic-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-topic-attributes-input get-topic-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/get-topic-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/get-topic-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetTopicAttributesResult", :http.request.configuration/action "GetTopicAttributes", :http.request.configuration/output-deser-fn response-get-topic-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns.-2010-03-31/invalid-security-exception}})))))
(clojure.spec.alpha/fdef get-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/get-topic-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/get-topic-attributes-response))

(clojure.core/defn confirm-subscription "Verifies an endpoint owner's intent to receive messages by validating the token\nsent to the endpoint by an earlier Subscribe action. If the token is valid, the\naction creates a new subscription and returns its Amazon Resource Name (ARN).\nThis call requires an AWS signature only when the AuthenticateOnUnsubscribe flag\nis set to \"true\"." ([confirm-subscription-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-confirm-subscription-input confirm-subscription-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns.-2010-03-31/confirm-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/confirm-subscription-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ConfirmSubscriptionResult", :http.request.configuration/action "ConfirmSubscription", :http.request.configuration/output-deser-fn response-confirm-subscription-response, :http.request.spec/error-spec {"SubscriptionLimitExceededException" :portkey.aws.sns.-2010-03-31/subscription-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef confirm-subscription :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/confirm-subscription-input) :ret (clojure.spec.alpha/and :portkey.aws.sns.-2010-03-31/confirm-subscription-response))

(clojure.core/defn delete-endpoint "Deletes the endpoint for a device and mobile app from Amazon SNS. This action is\nidempotent. For more information, see Using Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html).\n When you delete an endpoint that is also subscribed to a topic, then you must\nalso unsubscribe the endpoint from the topic." ([delete-endpoint-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-endpoint-input delete-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/delete-endpoint-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEndpoint", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception}})))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/delete-endpoint-input) :ret clojure.core/true?)

(clojure.core/defn set-topic-attributes "Allows a topic owner to set an attribute of the topic to a new value." ([set-topic-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-topic-attributes-input set-topic-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/set-topic-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetTopicAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns.-2010-03-31/invalid-security-exception}})))))
(clojure.spec.alpha/fdef set-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/set-topic-attributes-input) :ret clojure.core/true?)

(clojure.core/defn set-platform-application-attributes "Sets the attributes of the platform application object for the supported push\nnotification services, such as APNS and GCM. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html). For information\non configuring attributes for message delivery status, see Using Amazon SNS\nApplication Attributes for Message Delivery Status\n(http://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html)." ([set-platform-application-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-platform-application-attributes-input set-platform-application-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sns.-2010-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns.-2010-03-31/set-platform-application-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetPlatformApplicationAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns.-2010-03-31/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns.-2010-03-31/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns.-2010-03-31/authorization-error-exception, "NotFoundException" :portkey.aws.sns.-2010-03-31/not-found-exception}})))))
(clojure.spec.alpha/fdef set-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns.-2010-03-31/set-platform-application-attributes-input) :ret clojure.core/true?)
