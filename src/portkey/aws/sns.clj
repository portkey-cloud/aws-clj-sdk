(ns portkey.aws.sns (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
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
    :signature-version :v4}})

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

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- sermessage [input] #:http.request.field{:value input, :shape "message"})

(clojure.core/defn- serprotocol [input] #:http.request.field{:value input, :shape "protocol"})

(clojure.core/defn- sersubscription-arn [input] #:http.request.field{:value input, :shape "subscriptionARN"})

(clojure.core/defn- serattribute-name [input] #:http.request.field{:value input, :shape "attributeName"})

(clojure.core/defn- sertoken [input] #:http.request.field{:value input, :shape "token"})

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-list-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ListString", :type "list"})

(clojure.core/defn- serlabel [input] #:http.request.field{:value input, :shape "label"})

(clojure.core/defn- ser-subscription-attributes-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (serattribute-name k) #:http.request.field{:map-info "key", :type "string"}) (clojure.core/into (serattribute-value v) #:http.request.field{:map-info "value", :type "string"})])) input), :shape "SubscriptionAttributesMap", :type "map"})

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

(clojure.core/defn- ser-map-string-to-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :type "string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :type "string"})])) input), :shape "MapStringToString", :type "map"})

(clojure.core/defn- serendpoint [input] #:http.request.field{:value input, :shape "endpoint"})

(clojure.core/defn- sertopic-arn [input] #:http.request.field{:value input, :shape "topicARN"})

(clojure.core/defn- ser-message-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :type "string"}) (clojure.core/into (ser-message-attribute-value v) #:http.request.field{:map-info "value", :type "structure", :required ["DataType"], :members {"DataType" {"shape" "String"}, "StringValue" {"shape" "String"}, "BinaryValue" {"shape" "Binary"}}})])) input), :shape "MessageAttributeMap", :type "map"})

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

(clojure.core/defn- req-create-topic-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-name (input :name)) #:http.request.field{:name "Name", :shape "topicName"})]}))

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

(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-response/platform-applications (clojure.spec.alpha/and :portkey.aws.sns/list-of-platform-applications))
(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-platform-applications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-platform-applications-response/platform-applications :portkey.aws.sns.list-platform-applications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns/topic-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns/attribute-name :portkey.aws.sns/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sns/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.delete-endpoint-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/delete-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.delete-endpoint-input/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.get-sms-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-sms-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-sms-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.list-topics-response/topics (clojure.spec.alpha/and :portkey.aws.sns/topics-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-topics-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-topics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-topics-response/topics :portkey.aws.sns.list-topics-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.check-if-phone-number-is-opted-out-response/is-opted-out (clojure.spec.alpha/and :portkey.aws.sns/boolean))
(clojure.spec.alpha/def :portkey.aws.sns/check-if-phone-number-is-opted-out-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.check-if-phone-number-is-opted-out-response/is-opted-out]))

(clojure.spec.alpha/def :portkey.aws.sns/set-sms-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/subscription-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.get-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/get-subscription-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-subscription-attributes-input/subscription-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-phone-numbers-opted-out-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-phone-numbers-opted-out-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.set-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.set-platform-application-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-platform-application-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-platform-application-attributes-input/platform-application-arn :portkey.aws.sns.set-platform-application-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.platform-application-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/platform-application-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.platform-application-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/list-string (clojure.spec.alpha/coll-of :portkey.aws.sns/string))

(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/protocol (clojure.spec.alpha/and :portkey.aws.sns/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/endpoint (clojure.spec.alpha/and :portkey.aws.sns/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/subscription-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/return-subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/boolean))
(clojure.spec.alpha/def :portkey.aws.sns/subscribe-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.subscribe-input/topic-arn :portkey.aws.sns.subscribe-input/protocol] :opt-un [:portkey.aws.sns.subscribe-input/endpoint :portkey.aws.sns.subscribe-input/attributes :portkey.aws.sns.subscribe-input/return-subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns/subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.sns/subscription))

(clojure.spec.alpha/def :portkey.aws.sns.get-sms-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/list-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-sms-attributes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-sms-attributes-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns/label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.publish-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/target-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message (clojure.spec.alpha/and :portkey.aws.sns/message))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/subject (clojure.spec.alpha/and :portkey.aws.sns/subject))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message-structure (clojure.spec.alpha/and :portkey.aws.sns/message-structure))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message-attributes (clojure.spec.alpha/and :portkey.aws.sns/message-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sns/publish-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.publish-input/message] :opt-un [:portkey.aws.sns.publish-input/topic-arn :portkey.aws.sns.publish-input/target-arn :portkey.aws.sns.publish-input/phone-number :portkey.aws.sns.publish-input/subject :portkey.aws.sns.publish-input/message-structure :portkey.aws.sns.publish-input/message-attributes]))

(clojure.spec.alpha/def :portkey.aws.sns/subscription-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns/attribute-name :portkey.aws.sns/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.create-endpoint-response/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/create-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.create-endpoint-response/endpoint-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.list-topics-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-topics-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-topics-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns/delegates-list (clojure.spec.alpha/coll-of :portkey.aws.sns/delegate))

(clojure.spec.alpha/def :portkey.aws.sns.create-topic-response/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/create-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.create-topic-response/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.get-endpoint-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-endpoint-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-endpoint-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.publish-response/message-id (clojure.spec.alpha/and :portkey.aws.sns/message-id))
(clojure.spec.alpha/def :portkey.aws.sns/publish-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.publish-response/message-id]))

(clojure.spec.alpha/def :portkey.aws.sns.topic/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/topic (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.topic/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-response/phone-numbers (clojure.spec.alpha/and :portkey.aws.sns/phone-number-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-phone-numbers-opted-out-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-phone-numbers-opted-out-response/phone-numbers :portkey.aws.sns.list-phone-numbers-opted-out-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.filter-policy-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/filter-policy-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.filter-policy-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.get-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/get-platform-application-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-platform-application-attributes-input/platform-application-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-by-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-by-topic-response/subscriptions :portkey.aws.sns.list-subscriptions-by-topic-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-platform-applications-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-platform-applications-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-by-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.list-subscriptions-by-topic-input/topic-arn] :opt-un [:portkey.aws.sns.list-subscriptions-by-topic-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.subscribe-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/subscribe-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.subscribe-response/subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-response/subscriptions :portkey.aws.sns.list-subscriptions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/confirm-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.confirm-subscription-response/subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns/list-of-platform-applications (clojure.spec.alpha/coll-of :portkey.aws.sns/platform-application))

(clojure.spec.alpha/def :portkey.aws.sns/phone-number-list (clojure.spec.alpha/coll-of :portkey.aws.sns/phone-number))

(clojure.spec.alpha/def :portkey.aws.sns/message-structure (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/data-type (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.sns/binary))
(clojure.spec.alpha/def :portkey.aws.sns/message-attribute-value (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.message-attribute-value/data-type] :opt-un [:portkey.aws.sns.message-attribute-value/string-value :portkey.aws.sns.message-attribute-value/binary-value]))

(clojure.spec.alpha/def :portkey.aws.sns.get-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/get-topic-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-topic-attributes-input/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/custom-user-data (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.create-platform-endpoint-input/platform-application-arn :portkey.aws.sns.create-platform-endpoint-input/token] :opt-un [:portkey.aws.sns.create-platform-endpoint-input/custom-user-data :portkey.aws.sns.create-platform-endpoint-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns/action (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.authorization-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/authorization-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.authorization-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.get-subscription-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/subscription-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns/get-subscription-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-subscription-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-response/endpoints (clojure.spec.alpha/and :portkey.aws.sns/list-of-endpoints))
(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-endpoints-by-platform-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-endpoints-by-platform-application-response/endpoints :portkey.aws.sns.list-endpoints-by-platform-application-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns/topics-list (clojure.spec.alpha/coll-of :portkey.aws.sns/topic))

(clojure.spec.alpha/def :portkey.aws.sns.create-topic-input/name (clojure.spec.alpha/and :portkey.aws.sns/topic-name))
(clojure.spec.alpha/def :portkey.aws.sns/create-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.create-topic-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/name (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/platform (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.create-platform-application-input/name :portkey.aws.sns.create-platform-application-input/platform :portkey.aws.sns.create-platform-application-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/account (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.remove-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.remove-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns/label))
(clojure.spec.alpha/def :portkey.aws.sns/remove-permission-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.remove-permission-input/topic-arn :portkey.aws.sns.remove-permission-input/label] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.set-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.set-endpoint-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-endpoint-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-endpoint-attributes-input/endpoint-arn :portkey.aws.sns.set-endpoint-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.topic-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/topic-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.topic-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.delete-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/delete-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.delete-platform-application-input/platform-application-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.subscription-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/subscription-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.subscription-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.platform-application/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.platform-application/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/platform-application (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.platform-application/platform-application-arn :portkey.aws.sns.platform-application/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns/message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.delete-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/delete-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.delete-topic-input/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.get-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/get-endpoint-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-endpoint-attributes-input/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/delegate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/actions-list (clojure.spec.alpha/coll-of :portkey.aws.sns/action))

(clojure.spec.alpha/def :portkey.aws.sns.opt-in-phone-number-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns/opt-in-phone-number-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.opt-in-phone-number-input/phone-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.endpoint/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.endpoint/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.endpoint/endpoint-arn :portkey.aws.sns.endpoint/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.unsubscribe-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/unsubscribe-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.unsubscribe-input/subscription-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns/set-subscription-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-subscription-attributes-input/subscription-arn :portkey.aws.sns.set-subscription-attributes-input/attribute-name] :opt-un [:portkey.aws.sns.set-subscription-attributes-input/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.sns/binary clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.sns.subscription/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/owner (clojure.spec.alpha/and :portkey.aws.sns/account))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/protocol (clojure.spec.alpha/and :portkey.aws.sns/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/endpoint (clojure.spec.alpha/and :portkey.aws.sns/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.subscription/subscription-arn :portkey.aws.sns.subscription/owner :portkey.aws.sns.subscription/protocol :portkey.aws.sns.subscription/endpoint :portkey.aws.sns.subscription/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-response/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.create-platform-application-response/platform-application-arn]))

(clojure.spec.alpha/def :portkey.aws.sns/map-string-to-string (clojure.spec.alpha/map-of :portkey.aws.sns/string :portkey.aws.sns/string))

(clojure.spec.alpha/def :portkey.aws.sns/endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/message-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sns/string :portkey.aws.sns/message-attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns/label))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/aws-account-id (clojure.spec.alpha/and :portkey.aws.sns/delegates-list))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/action-name (clojure.spec.alpha/and :portkey.aws.sns/actions-list))
(clojure.spec.alpha/def :portkey.aws.sns/add-permission-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.add-permission-input/topic-arn :portkey.aws.sns.add-permission-input/label :portkey.aws.sns.add-permission-input/aws-account-id :portkey.aws.sns.add-permission-input/action-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.check-if-phone-number-is-opted-out-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns/check-if-phone-number-is-opted-out-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.check-if-phone-number-is-opted-out-input/phone-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-endpoints-by-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.list-endpoints-by-platform-application-input/platform-application-arn] :opt-un [:portkey.aws.sns.list-endpoints-by-platform-application-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/opt-in-phone-number-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.get-topic-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/topic-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns/get-topic-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-topic-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.get-platform-application-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-platform-application-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-platform-application-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.throttled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/topic-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.endpoint-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/endpoint-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.endpoint-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.set-sms-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-sms-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-sms-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/authenticate-on-unsubscribe (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns/set-topic-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-topic-attributes-input/topic-arn :portkey.aws.sns.set-topic-attributes-input/attribute-name] :opt-un [:portkey.aws.sns.set-topic-attributes-input/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.sns/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/token (clojure.spec.alpha/and :portkey.aws.sns/token))
(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/authenticate-on-unsubscribe (clojure.spec.alpha/and :portkey.aws.sns/authenticate-on-unsubscribe))
(clojure.spec.alpha/def :portkey.aws.sns/confirm-subscription-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.confirm-subscription-input/topic-arn :portkey.aws.sns.confirm-subscription-input/token] :opt-un [:portkey.aws.sns.confirm-subscription-input/authenticate-on-unsubscribe]))

(clojure.spec.alpha/def :portkey.aws.sns/list-of-endpoints (clojure.spec.alpha/coll-of :portkey.aws.sns/endpoint))

(clojure.core/defn get-endpoint-attributes ([get-endpoint-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-endpoint-attributes-input get-endpoint-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/get-endpoint-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-endpoint-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetEndpointAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef get-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-endpoint-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-endpoint-attributes-response))

(clojure.core/defn delete-topic ([delete-topic-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-topic-input delete-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/delete-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTopic", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-topic-input) :ret clojure.core/true?)

(clojure.core/defn unsubscribe ([unsubscribe-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-unsubscribe-input unsubscribe-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/unsubscribe-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Unsubscribe", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef unsubscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns/unsubscribe-input) :ret clojure.core/true?)

(clojure.core/defn list-subscriptions ([] (list-subscriptions {})) ([list-subscriptions-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-subscriptions-input list-subscriptions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/list-subscriptions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-subscriptions-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSubscriptions", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-subscriptions :args (clojure.spec.alpha/? :portkey.aws.sns/list-subscriptions-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-subscriptions-response))

(clojure.core/defn set-sms-attributes ([set-sms-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-sms-attributes-input set-sms-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/set-sms-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-sms-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetSMSAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef set-sms-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-sms-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/set-sms-attributes-response))

(clojure.core/defn list-endpoints-by-platform-application ([list-endpoints-by-platform-application-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-endpoints-by-platform-application-input list-endpoints-by-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/list-endpoints-by-platform-application-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-endpoints-by-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEndpointsByPlatformApplication", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef list-endpoints-by-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/list-endpoints-by-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-endpoints-by-platform-application-response))

(clojure.core/defn opt-in-phone-number ([opt-in-phone-number-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-opt-in-phone-number-input opt-in-phone-number-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/opt-in-phone-number-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/opt-in-phone-number-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "OptInPhoneNumber", :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef opt-in-phone-number :args (clojure.spec.alpha/tuple :portkey.aws.sns/opt-in-phone-number-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/opt-in-phone-number-response))

(clojure.core/defn create-topic ([create-topic-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-topic-input create-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/create-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/create-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTopic", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "TopicLimitExceededException" :portkey.aws.sns/topic-limit-exceeded-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef create-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-topic-response))

(clojure.core/defn get-sms-attributes ([] (get-sms-attributes {})) ([get-sms-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-sms-attributes-input get-sms-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/get-sms-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-sms-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSMSAttributes", :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-sms-attributes :args (clojure.spec.alpha/? :portkey.aws.sns/get-sms-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-sms-attributes-response))

(clojure.core/defn set-subscription-attributes ([set-subscription-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-subscription-attributes-input set-subscription-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-subscription-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetSubscriptionAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "FilterPolicyLimitExceededException" :portkey.aws.sns/filter-policy-limit-exceeded-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef set-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-subscription-attributes-input) :ret clojure.core/true?)

(clojure.core/defn list-platform-applications ([] (list-platform-applications {})) ([list-platform-applications-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-platform-applications-input list-platform-applications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/list-platform-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-platform-applications-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPlatformApplications", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-platform-applications :args (clojure.spec.alpha/? :portkey.aws.sns/list-platform-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-platform-applications-response))

(clojure.core/defn check-if-phone-number-is-opted-out ([check-if-phone-number-is-opted-out-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-check-if-phone-number-is-opted-out-input check-if-phone-number-is-opted-out-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/check-if-phone-number-is-opted-out-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/check-if-phone-number-is-opted-out-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CheckIfPhoneNumberIsOptedOut", :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef check-if-phone-number-is-opted-out :args (clojure.spec.alpha/tuple :portkey.aws.sns/check-if-phone-number-is-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/check-if-phone-number-is-opted-out-response))

(clojure.core/defn list-topics ([] (list-topics {})) ([list-topics-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-topics-input list-topics-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/list-topics-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-topics-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTopics", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-topics :args (clojure.spec.alpha/? :portkey.aws.sns/list-topics-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-topics-response))

(clojure.core/defn get-platform-application-attributes ([get-platform-application-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-platform-application-attributes-input get-platform-application-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/get-platform-application-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-platform-application-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPlatformApplicationAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef get-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-platform-application-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-platform-application-attributes-response))

(clojure.core/defn list-phone-numbers-opted-out ([] (list-phone-numbers-opted-out {})) ([list-phone-numbers-opted-out-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-phone-numbers-opted-out-input list-phone-numbers-opted-out-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/list-phone-numbers-opted-out-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-phone-numbers-opted-out-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPhoneNumbersOptedOut", :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-phone-numbers-opted-out :args (clojure.spec.alpha/? :portkey.aws.sns/list-phone-numbers-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-phone-numbers-opted-out-response))

(clojure.core/defn delete-platform-application ([delete-platform-application-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-platform-application-input delete-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/delete-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePlatformApplication", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef delete-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-platform-application-input) :ret clojure.core/true?)

(clojure.core/defn add-permission ([add-permission-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-add-permission-input add-permission-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/add-permission-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddPermission", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns/add-permission-input) :ret clojure.core/true?)

(clojure.core/defn create-platform-endpoint ([create-platform-endpoint-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-platform-endpoint-input create-platform-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/create-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/create-platform-endpoint-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePlatformEndpoint", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef create-platform-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-platform-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-endpoint-response))

(clojure.core/defn create-platform-application ([create-platform-application-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-platform-application-input create-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/create-platform-application-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/create-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePlatformApplication", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef create-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-platform-application-response))

(clojure.core/defn subscribe ([subscribe-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-subscribe-input subscribe-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/subscribe-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/subscribe-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Subscribe", :http.request.spec/error-spec {"SubscriptionLimitExceededException" :portkey.aws.sns/subscription-limit-exceeded-exception, "FilterPolicyLimitExceededException" :portkey.aws.sns/filter-policy-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef subscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns/subscribe-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/subscribe-response))

(clojure.core/defn list-subscriptions-by-topic ([list-subscriptions-by-topic-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-subscriptions-by-topic-input list-subscriptions-by-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/list-subscriptions-by-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-subscriptions-by-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSubscriptionsByTopic", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-subscriptions-by-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/list-subscriptions-by-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-subscriptions-by-topic-response))

(clojure.core/defn get-subscription-attributes ([get-subscription-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-subscription-attributes-input get-subscription-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/get-subscription-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-subscription-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSubscriptionAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef get-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-subscription-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-subscription-attributes-response))

(clojure.core/defn remove-permission ([remove-permission-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-remove-permission-input remove-permission-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/remove-permission-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemovePermission", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns/remove-permission-input) :ret clojure.core/true?)

(clojure.core/defn set-endpoint-attributes ([set-endpoint-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-endpoint-attributes-input set-endpoint-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-endpoint-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetEndpointAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef set-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-endpoint-attributes-input) :ret clojure.core/true?)

(clojure.core/defn publish ([publish-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-publish-input publish-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/publish-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/publish-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Publish", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.sns/invalid-parameter-value-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "EndpointDisabledException" :portkey.aws.sns/endpoint-disabled-exception, "PlatformApplicationDisabledException" :portkey.aws.sns/platform-application-disabled-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef publish :args (clojure.spec.alpha/tuple :portkey.aws.sns/publish-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/publish-response))

(clojure.core/defn get-topic-attributes ([get-topic-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-topic-attributes-input get-topic-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/get-topic-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-topic-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTopicAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef get-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-topic-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-topic-attributes-response))

(clojure.core/defn confirm-subscription ([confirm-subscription-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-confirm-subscription-input confirm-subscription-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec :portkey.aws.sns/confirm-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/confirm-subscription-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ConfirmSubscription", :http.request.spec/error-spec {"SubscriptionLimitExceededException" :portkey.aws.sns/subscription-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef confirm-subscription :args (clojure.spec.alpha/tuple :portkey.aws.sns/confirm-subscription-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/confirm-subscription-response))

(clojure.core/defn delete-endpoint ([delete-endpoint-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-endpoint-input delete-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/delete-endpoint-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEndpoint", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-endpoint-input) :ret clojure.core/true?)

(clojure.core/defn set-topic-attributes ([set-topic-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-topic-attributes-input set-topic-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-topic-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetTopicAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef set-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-topic-attributes-input) :ret clojure.core/true?)

(clojure.core/defn set-platform-application-attributes ([set-platform-application-attributes-inputinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-platform-application-attributes-input set-platform-application-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-platform-application-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetPlatformApplicationAttributes", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef set-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-platform-application-attributes-input) :ret clojure.core/true?)
