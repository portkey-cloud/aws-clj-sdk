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

(clojure.core/declare ser-message ser-protocol ser-subscriptionarn ser-attribute-name ser-token ser-string ser-list-string ser-label ser-delegates-list ser-next-token ser-message-structure ser-message-attribute-value ser-action ser-subject ser-string ser-delegate ser-actions-list ser-binary ser-map-string-to-string ser-endpoint ser-topicarn ser-message-attribute-map ser-attribute-value ser-topic-name ser-authenticate-on-unsubscribe ser-phone-number)

(clojure.core/defn- ser-message [shape-input] shape-input)
(clojure.core/defn- ser-protocol [shape-input] shape-input)
(clojure.core/defn- ser-subscriptionarn [shape-input] shape-input)
(clojure.core/defn- ser-attribute-name [shape-input] shape-input)
(clojure.core/defn- ser-token [shape-input] shape-input)
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-list-string [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-label [shape-input] shape-input)
(clojure.core/defn- ser-delegates-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-next-token [shape-input] shape-input)
(clojure.core/defn- ser-message-structure [shape-input] shape-input)
(clojure.core/defn- ser-message-attribute-value [shape-input] (clojure.core/cond-> {} (:data-type shape-input) (clojure.core/assoc "MessageAttributeValue.DataType" (ser-string (:data-type shape-input))) (:string-value shape-input) (clojure.core/assoc "MessageAttributeValue.StringValue" (ser-string (:string-value shape-input))) (:binary-value shape-input) (clojure.core/assoc "MessageAttributeValue.BinaryValue" (ser-binary (:binary-value shape-input)))))
(clojure.core/defn- ser-action [shape-input] shape-input)
(clojure.core/defn- ser-subject [shape-input] shape-input)
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-delegate [shape-input] shape-input)
(clojure.core/defn- ser-actions-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-binary [shape-input] (portkey.aws/base64-encode shape-input))
(clojure.core/defn- ser-map-string-to-string [shape-input] (clojure.core/into {} (clojure.core/comp (clojure.core/map-indexed (clojure.core/fn [idx__36459__auto__ [k__36460__auto__ v__36461__auto__]] [[(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".key") k__36460__auto__] [(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".value") v__36461__auto__]])) clojure.core/cat) shape-input))
(clojure.core/defn- ser-endpoint [shape-input] shape-input)
(clojure.core/defn- ser-topicarn [shape-input] shape-input)
(clojure.core/defn- ser-message-attribute-map [shape-input] (clojure.core/into {} (clojure.core/comp (clojure.core/map-indexed (clojure.core/fn [idx__36459__auto__ [k__36460__auto__ v__36461__auto__]] [[(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".key") k__36460__auto__] [(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".value") v__36461__auto__]])) clojure.core/cat) shape-input))
(clojure.core/defn- ser-attribute-value [shape-input] shape-input)
(clojure.core/defn- ser-topic-name [shape-input] shape-input)
(clojure.core/defn- ser-authenticate-on-unsubscribe [shape-input] shape-input)
(clojure.core/defn- ser-phone-number [shape-input] shape-input)

(clojure.core/defn req<-get-endpoint-attributes-input [action-name76926 input76925] {:body {"EndpointArn" (ser-string (input76925 :endpoint-arn)), "Version" "2010-03-31", "Action" action-name76926}})
(clojure.core/defn req<-delete-topic-input [action-name76928 input76927] {:body {"TopicArn" (ser-topicarn (input76927 :topic-arn)), "Version" "2010-03-31", "Action" action-name76928}})
(clojure.core/defn req<-unsubscribe-input [action-name76930 input76929] {:body {"SubscriptionArn" (ser-subscriptionarn (input76929 :subscription-arn)), "Version" "2010-03-31", "Action" action-name76930}})
(clojure.core/defn req<-list-subscriptions-input [action-name76932 input76931] (clojure.core/cond-> {:body {"Version" "2010-03-31", "Action" action-name76932}} (clojure.core/contains? input76931 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input76931 :next-token)))))
(clojure.core/defn req<-setsmsattributes-input [action-name76934 input76933] {:body {"attributes" (ser-map-string-to-string (input76933 :attributes)), "Version" "2010-03-31", "Action" action-name76934}})
(clojure.core/defn req<-list-endpoints-by-platform-application-input [action-name76936 input76935] (clojure.core/let [input76937 {:body {"PlatformApplicationArn" (ser-string (input76935 :platform-application-arn)), "Version" "2010-03-31", "Action" action-name76936}}] (clojure.core/cond-> input76937 (clojure.core/contains? input76935 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-string (input76935 :next-token))))))
(clojure.core/defn req<-opt-in-phone-number-input [action-name76939 input76938] {:body {"phoneNumber" (ser-phone-number (input76938 :phone-number)), "Version" "2010-03-31", "Action" action-name76939}})
(clojure.core/defn req<-create-topic-input [action-name76941 input76940] {:body {"Name" (ser-topic-name (input76940 :name)), "Version" "2010-03-31", "Action" action-name76941}})
(clojure.core/defn req<-getsmsattributes-input [action-name76943 input76942] (clojure.core/cond-> {:body {"Version" "2010-03-31", "Action" action-name76943}} (clojure.core/contains? input76942 :attributes) (clojure.core/assoc-in [:body "attributes"] (ser-list-string (input76942 :attributes)))))
(clojure.core/defn req<-set-subscription-attributes-input [action-name76945 input76944] (clojure.core/let [input76946 {:body {"SubscriptionArn" (ser-subscriptionarn (input76944 :subscription-arn)), "AttributeName" (ser-attribute-name (input76944 :attribute-name)), "Version" "2010-03-31", "Action" action-name76945}}] (clojure.core/cond-> input76946 (clojure.core/contains? input76944 :attribute-value) (clojure.core/assoc-in [:body "AttributeValue"] (ser-attribute-value (input76944 :attribute-value))))))
(clojure.core/defn req<-list-platform-applications-input [action-name76948 input76947] (clojure.core/cond-> {:body {"Version" "2010-03-31", "Action" action-name76948}} (clojure.core/contains? input76947 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-string (input76947 :next-token)))))
(clojure.core/defn req<-check-if-phone-number-is-opted-out-input [action-name76950 input76949] {:body {"phoneNumber" (ser-phone-number (input76949 :phone-number)), "Version" "2010-03-31", "Action" action-name76950}})
(clojure.core/defn req<-list-topics-input [action-name76952 input76951] (clojure.core/cond-> {:body {"Version" "2010-03-31", "Action" action-name76952}} (clojure.core/contains? input76951 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input76951 :next-token)))))
(clojure.core/defn req<-get-platform-application-attributes-input [action-name76954 input76953] {:body {"PlatformApplicationArn" (ser-string (input76953 :platform-application-arn)), "Version" "2010-03-31", "Action" action-name76954}})
(clojure.core/defn req<-list-phone-numbers-opted-out-input [action-name76956 input76955] (clojure.core/cond-> {:body {"Version" "2010-03-31", "Action" action-name76956}} (clojure.core/contains? input76955 :next-token) (clojure.core/assoc-in [:body "nextToken"] (ser-string (input76955 :next-token)))))
(clojure.core/defn req<-delete-platform-application-input [action-name76958 input76957] {:body {"PlatformApplicationArn" (ser-string (input76957 :platform-application-arn)), "Version" "2010-03-31", "Action" action-name76958}})
(clojure.core/defn req<-add-permission-input [action-name76960 input76959] {:body {"TopicArn" (ser-topicarn (input76959 :topic-arn)), "Label" (ser-label (input76959 :label)), "AWSAccountId" (ser-delegates-list (input76959 :awsaccount-id)), "ActionName" (ser-actions-list (input76959 :action-name)), "Version" "2010-03-31", "Action" action-name76960}})
(clojure.core/defn req<-create-platform-endpoint-input [action-name76962 input76961] (clojure.core/let [input76963 {:body {"PlatformApplicationArn" (ser-string (input76961 :platform-application-arn)), "Token" (ser-string (input76961 :token)), "Version" "2010-03-31", "Action" action-name76962}}] (clojure.core/cond-> input76963 (clojure.core/contains? input76961 :custom-user-data) (clojure.core/assoc-in [:body "CustomUserData"] (ser-string (input76961 :custom-user-data))) (clojure.core/contains? input76961 :attributes) (clojure.core/assoc-in [:body "Attributes"] (ser-map-string-to-string (input76961 :attributes))))))
(clojure.core/defn req<-create-platform-application-input [action-name76965 input76964] {:body {"Name" (ser-string (input76964 :name)), "Platform" (ser-string (input76964 :platform)), "Attributes" (ser-map-string-to-string (input76964 :attributes)), "Version" "2010-03-31", "Action" action-name76965}})
(clojure.core/defn req<-subscribe-input [action-name76967 input76966] (clojure.core/let [input76968 {:body {"TopicArn" (ser-topicarn (input76966 :topic-arn)), "Protocol" (ser-protocol (input76966 :protocol)), "Version" "2010-03-31", "Action" action-name76967}}] (clojure.core/cond-> input76968 (clojure.core/contains? input76966 :endpoint) (clojure.core/assoc-in [:body "Endpoint"] (ser-endpoint (input76966 :endpoint))))))
(clojure.core/defn req<-list-subscriptions-by-topic-input [action-name76970 input76969] (clojure.core/let [input76971 {:body {"TopicArn" (ser-topicarn (input76969 :topic-arn)), "Version" "2010-03-31", "Action" action-name76970}}] (clojure.core/cond-> input76971 (clojure.core/contains? input76969 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input76969 :next-token))))))
(clojure.core/defn req<-get-subscription-attributes-input [action-name76973 input76972] {:body {"SubscriptionArn" (ser-subscriptionarn (input76972 :subscription-arn)), "Version" "2010-03-31", "Action" action-name76973}})
(clojure.core/defn req<-remove-permission-input [action-name76975 input76974] {:body {"TopicArn" (ser-topicarn (input76974 :topic-arn)), "Label" (ser-label (input76974 :label)), "Version" "2010-03-31", "Action" action-name76975}})
(clojure.core/defn req<-set-endpoint-attributes-input [action-name76977 input76976] {:body {"EndpointArn" (ser-string (input76976 :endpoint-arn)), "Attributes" (ser-map-string-to-string (input76976 :attributes)), "Version" "2010-03-31", "Action" action-name76977}})
(clojure.core/defn req<-publish-input [action-name76979 input76978] (clojure.core/let [input76980 {:body {"Message" (ser-message (input76978 :message)), "Version" "2010-03-31", "Action" action-name76979}}] (clojure.core/cond-> input76980 (clojure.core/contains? input76978 :topic-arn) (clojure.core/assoc-in [:body "TopicArn"] (ser-topicarn (input76978 :topic-arn))) (clojure.core/contains? input76978 :target-arn) (clojure.core/assoc-in [:body "TargetArn"] (ser-string (input76978 :target-arn))) (clojure.core/contains? input76978 :phone-number) (clojure.core/assoc-in [:body "PhoneNumber"] (ser-string (input76978 :phone-number))) (clojure.core/contains? input76978 :subject) (clojure.core/assoc-in [:body "Subject"] (ser-subject (input76978 :subject))) (clojure.core/contains? input76978 :message-structure) (clojure.core/assoc-in [:body "MessageStructure"] (ser-message-structure (input76978 :message-structure))) (clojure.core/contains? input76978 :message-attributes) (clojure.core/assoc-in [:body "MessageAttributes"] (ser-message-attribute-map (input76978 :message-attributes))))))
(clojure.core/defn req<-get-topic-attributes-input [action-name76982 input76981] {:body {"TopicArn" (ser-topicarn (input76981 :topic-arn)), "Version" "2010-03-31", "Action" action-name76982}})
(clojure.core/defn req<-confirm-subscription-input [action-name76984 input76983] (clojure.core/let [input76985 {:body {"TopicArn" (ser-topicarn (input76983 :topic-arn)), "Token" (ser-token (input76983 :token)), "Version" "2010-03-31", "Action" action-name76984}}] (clojure.core/cond-> input76985 (clojure.core/contains? input76983 :authenticate-on-unsubscribe) (clojure.core/assoc-in [:body "AuthenticateOnUnsubscribe"] (ser-authenticate-on-unsubscribe (input76983 :authenticate-on-unsubscribe))))))
(clojure.core/defn req<-delete-endpoint-input [action-name76987 input76986] {:body {"EndpointArn" (ser-string (input76986 :endpoint-arn)), "Version" "2010-03-31", "Action" action-name76987}})
(clojure.core/defn req<-set-topic-attributes-input [action-name76989 input76988] (clojure.core/let [input76990 {:body {"TopicArn" (ser-topicarn (input76988 :topic-arn)), "AttributeName" (ser-attribute-name (input76988 :attribute-name)), "Version" "2010-03-31", "Action" action-name76989}}] (clojure.core/cond-> input76990 (clojure.core/contains? input76988 :attribute-value) (clojure.core/assoc-in [:body "AttributeValue"] (ser-attribute-value (input76988 :attribute-value))))))
(clojure.core/defn req<-set-platform-application-attributes-input [action-name76992 input76991] {:body {"PlatformApplicationArn" (ser-string (input76991 :platform-application-arn)), "Attributes" (ser-map-string-to-string (input76991 :attributes)), "Version" "2010-03-31", "Action" action-name76992}})

(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-response/platform-applications (clojure.spec.alpha/and :portkey.aws.sns/list-of-platform-applications))
(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-platform-applications-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-platform-applications-response/PlatformApplications :portkey.aws.sns.list-platform-applications-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/topic-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns/attribute-name :portkey.aws.sns/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sns/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.delete-endpoint-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/delete-endpoint-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.delete-endpoint-input/EndpointArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.getsmsattributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/getsmsattributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.getsmsattributes-response/attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-topics-response/topics (clojure.spec.alpha/and :portkey.aws.sns/topics-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-topics-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-topics-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-topics-response/Topics :portkey.aws.sns.list-topics-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.check-if-phone-number-is-opted-out-response/is-opted-out (clojure.spec.alpha/and :portkey.aws.sns/boolean))
(clojure.spec.alpha/def :portkey.aws.sns/check-if-phone-number-is-opted-out-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.check-if-phone-number-is-opted-out-response/isOptedOut] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/setsmsattributes-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/subscriptionarn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.get-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscriptionarn))
(clojure.spec.alpha/def :portkey.aws.sns/get-subscription-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.get-subscription-attributes-input/SubscriptionArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-phone-numbers-opted-out-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-phone-numbers-opted-out-input/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.set-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.set-platform-application-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-platform-application-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.set-platform-application-attributes-input/PlatformApplicationArn :portkey.aws.sns.set-platform-application-attributes-input/Attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.platform-application-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/platform-application-disabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.platform-application-disabled-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/list-string (clojure.spec.alpha/coll-of :portkey.aws.sns/string))

(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/protocol (clojure.spec.alpha/and :portkey.aws.sns/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/endpoint (clojure.spec.alpha/and :portkey.aws.sns/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns/subscribe-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.subscribe-input/TopicArn :portkey.aws.sns.subscribe-input/Protocol] :opt-un [:portkey.aws.sns.subscribe-input/Endpoint] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.sns/subscription))

(clojure.spec.alpha/def :portkey.aws.sns.getsmsattributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/list-string))
(clojure.spec.alpha/def :portkey.aws.sns/getsmsattributes-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.getsmsattributes-input/attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.publish-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/target-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message (clojure.spec.alpha/and :portkey.aws.sns/message))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/subject (clojure.spec.alpha/and :portkey.aws.sns/subject))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message-structure (clojure.spec.alpha/and :portkey.aws.sns/message-structure))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message-attributes (clojure.spec.alpha/and :portkey.aws.sns/message-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sns/publish-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.publish-input/Message] :opt-un [:portkey.aws.sns.publish-input/TopicArn :portkey.aws.sns.publish-input/TargetArn :portkey.aws.sns.publish-input/PhoneNumber :portkey.aws.sns.publish-input/Subject :portkey.aws.sns.publish-input/MessageStructure :portkey.aws.sns.publish-input/MessageAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/subscription-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns/attribute-name :portkey.aws.sns/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.create-endpoint-response/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/create-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.create-endpoint-response/EndpointArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-topics-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-topics-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-topics-input/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/delegates-list (clojure.spec.alpha/coll-of :portkey.aws.sns/delegate))

(clojure.spec.alpha/def :portkey.aws.sns.create-topic-response/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns/create-topic-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.create-topic-response/TopicArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.get-endpoint-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-endpoint-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.get-endpoint-attributes-response/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.publish-response/message-id (clojure.spec.alpha/and :portkey.aws.sns/message-id))
(clojure.spec.alpha/def :portkey.aws.sns/publish-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.publish-response/MessageId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.topic/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns/topic (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.topic/TopicArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-response/phone-numbers (clojure.spec.alpha/and :portkey.aws.sns/phone-number-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-phone-numbers-opted-out-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-phone-numbers-opted-out-response/phoneNumbers :portkey.aws.sns.list-phone-numbers-opted-out-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/internal-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.internal-error-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.get-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/get-platform-application-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.get-platform-application-attributes-input/PlatformApplicationArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-by-topic-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-by-topic-response/Subscriptions :portkey.aws.sns.list-subscriptions-by-topic-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-platform-applications-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-platform-applications-input/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-by-topic-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.list-subscriptions-by-topic-input/TopicArn] :opt-un [:portkey.aws.sns.list-subscriptions-by-topic-input/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.subscribe-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscriptionarn))
(clojure.spec.alpha/def :portkey.aws.sns/subscribe-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.subscribe-response/SubscriptionArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-response/Subscriptions :portkey.aws.sns.list-subscriptions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscriptionarn))
(clojure.spec.alpha/def :portkey.aws.sns/confirm-subscription-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.confirm-subscription-response/SubscriptionArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/list-of-platform-applications (clojure.spec.alpha/coll-of :portkey.aws.sns/platform-application))

(clojure.spec.alpha/def :portkey.aws.sns/phone-number-list (clojure.spec.alpha/coll-of :portkey.aws.sns/phone-number))

(clojure.spec.alpha/def :portkey.aws.sns/message-structure (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/data-type (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.sns/binary))
(clojure.spec.alpha/def :portkey.aws.sns/message-attribute-value (portkey.aws/json-keys :req-un [:portkey.aws.sns.message-attribute-value/DataType] :opt-un [:portkey.aws.sns.message-attribute-value/StringValue :portkey.aws.sns.message-attribute-value/BinaryValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.get-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns/get-topic-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.get-topic-attributes-input/TopicArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/custom-user-data (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-endpoint-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.create-platform-endpoint-input/PlatformApplicationArn :portkey.aws.sns.create-platform-endpoint-input/Token] :opt-un [:portkey.aws.sns.create-platform-endpoint-input/CustomUserData :portkey.aws.sns.create-platform-endpoint-input/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/action (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.authorization-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/authorization-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.authorization-error-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.get-subscription-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/subscription-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns/get-subscription-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.get-subscription-attributes-response/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-response/endpoints (clojure.spec.alpha/and :portkey.aws.sns/list-of-endpoints))
(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-endpoints-by-platform-application-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-endpoints-by-platform-application-response/Endpoints :portkey.aws.sns.list-endpoints-by-platform-application-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/topics-list (clojure.spec.alpha/coll-of :portkey.aws.sns/topic))

(clojure.spec.alpha/def :portkey.aws.sns.create-topic-input/name (clojure.spec.alpha/and :portkey.aws.sns/topic-name))
(clojure.spec.alpha/def :portkey.aws.sns/create-topic-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.create-topic-input/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/name (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/platform (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-application-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.create-platform-application-input/Name :portkey.aws.sns.create-platform-application-input/Platform :portkey.aws.sns.create-platform-application-input/Attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/account (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.remove-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns.remove-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns/label))
(clojure.spec.alpha/def :portkey.aws.sns/remove-permission-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.remove-permission-input/TopicArn :portkey.aws.sns.remove-permission-input/Label] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.set-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.set-endpoint-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-endpoint-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.set-endpoint-attributes-input/EndpointArn :portkey.aws.sns.set-endpoint-attributes-input/Attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.topic-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/topic-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.topic-limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.delete-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/delete-platform-application-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.delete-platform-application-input/PlatformApplicationArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.subscription-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/subscription-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.subscription-limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.platform-application/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.platform-application/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/platform-application (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.platform-application/PlatformApplicationArn :portkey.aws.sns.platform-application/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.delete-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns/delete-topic-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.delete-topic-input/TopicArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.get-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/get-endpoint-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.get-endpoint-attributes-input/EndpointArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/delegate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/actions-list (clojure.spec.alpha/coll-of :portkey.aws.sns/action))

(clojure.spec.alpha/def :portkey.aws.sns.opt-in-phone-number-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns/opt-in-phone-number-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.opt-in-phone-number-input/phoneNumber] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.endpoint/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.endpoint/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/endpoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.endpoint/EndpointArn :portkey.aws.sns.endpoint/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.unsubscribe-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscriptionarn))
(clojure.spec.alpha/def :portkey.aws.sns/unsubscribe-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.unsubscribe-input/SubscriptionArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscriptionarn))
(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns/set-subscription-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.set-subscription-attributes-input/SubscriptionArn :portkey.aws.sns.set-subscription-attributes-input/AttributeName] :opt-un [:portkey.aws.sns.set-subscription-attributes-input/AttributeValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/binary clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.sns.subscription/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscriptionarn))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/owner (clojure.spec.alpha/and :portkey.aws.sns/account))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/protocol (clojure.spec.alpha/and :portkey.aws.sns/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/endpoint (clojure.spec.alpha/and :portkey.aws.sns/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns/subscription (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.subscription/SubscriptionArn :portkey.aws.sns.subscription/Owner :portkey.aws.sns.subscription/Protocol :portkey.aws.sns.subscription/Endpoint :portkey.aws.sns.subscription/TopicArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-response/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-application-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.create-platform-application-response/PlatformApplicationArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/map-string-to-string (clojure.spec.alpha/map-of :portkey.aws.sns/string :portkey.aws.sns/string))

(clojure.spec.alpha/def :portkey.aws.sns/endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/topicarn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/message-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sns/string :portkey.aws.sns/message-attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns/label))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/awsaccount-id (clojure.spec.alpha/and :portkey.aws.sns/delegates-list))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/action-name (clojure.spec.alpha/and :portkey.aws.sns/actions-list))
(clojure.spec.alpha/def :portkey.aws.sns/add-permission-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.add-permission-input/TopicArn :portkey.aws.sns.add-permission-input/Label :portkey.aws.sns.add-permission-input/AWSAccountId :portkey.aws.sns.add-permission-input/ActionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.check-if-phone-number-is-opted-out-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns/check-if-phone-number-is-opted-out-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.check-if-phone-number-is-opted-out-input/phoneNumber] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-endpoints-by-platform-application-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.list-endpoints-by-platform-application-input/PlatformApplicationArn] :opt-un [:portkey.aws.sns.list-endpoints-by-platform-application-input/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/invalid-parameter-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.invalid-parameter-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/opt-in-phone-number-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.get-topic-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/topic-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns/get-topic-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.get-topic-attributes-response/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.invalid-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-input/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.get-platform-application-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-platform-application-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.get-platform-application-attributes-response/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/throttled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.throttled-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/topic-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.endpoint-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/endpoint-disabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sns.endpoint-disabled-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns.setsmsattributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/setsmsattributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.setsmsattributes-input/attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/authenticate-on-unsubscribe (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns/set-topic-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.set-topic-attributes-input/TopicArn :portkey.aws.sns.set-topic-attributes-input/AttributeName] :opt-un [:portkey.aws.sns.set-topic-attributes-input/AttributeValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topicarn))
(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/token (clojure.spec.alpha/and :portkey.aws.sns/token))
(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/authenticate-on-unsubscribe (clojure.spec.alpha/and :portkey.aws.sns/authenticate-on-unsubscribe))
(clojure.spec.alpha/def :portkey.aws.sns/confirm-subscription-input (portkey.aws/json-keys :req-un [:portkey.aws.sns.confirm-subscription-input/TopicArn :portkey.aws.sns.confirm-subscription-input/Token] :opt-un [:portkey.aws.sns.confirm-subscription-input/AuthenticateOnUnsubscribe] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sns/list-of-endpoints (clojure.spec.alpha/coll-of :portkey.aws.sns/endpoint))

(clojure.core/defn get-endpoint-attributes "Retrieves the endpoint attributes for a device on one of the supported push\nnotification services, such as GCM and APNS. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([get-endpoint-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-endpoint-attributes-input "GetEndpointAttributes" get-endpoint-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/get-endpoint-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/get-endpoint-attributes-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef get-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-endpoint-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-endpoint-attributes-response))

(clojure.core/defn delete-topic "Deletes a topic and all its subscriptions. Deleting a topic might prevent some\nmessages previously sent to the topic from being delivered to subscribers. This\naction is idempotent, so deleting a topic that does not exist does not result in\nan error." ([delete-topic-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-topic-input "DeleteTopic" delete-topic-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/delete-topic-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef delete-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-topic-input) :ret clojure.core/true?)

(clojure.core/defn unsubscribe "Deletes a subscription. If the subscription requires authentication for\ndeletion, only the owner of the subscription or the topic's owner can\nunsubscribe, and an AWS signature is required. If the Unsubscribe call does not\nrequire authentication and the requester is not the subscription owner, a final\ncancellation message is delivered to the endpoint, so that the endpoint owner\ncan easily resubscribe to the topic if the Unsubscribe request was unintended." ([unsubscribe-input] (clojure.core/let [req<-input__36755__auto__ (req<-unsubscribe-input "Unsubscribe" unsubscribe-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/unsubscribe-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef unsubscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns/unsubscribe-input) :ret clojure.core/true?)

(clojure.core/defn list-subscriptions "Returns a list of the requester's subscriptions. Each call returns a limited\nlist of subscriptions, up to 100. If there are more subscriptions, a NextToken\nis also returned. Use the NextToken parameter in a new ListSubscriptions call to\nget further results." ([] (list-subscriptions {})) ([list-subscriptions-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-subscriptions-input "ListSubscriptions" list-subscriptions-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/list-subscriptions-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/list-subscriptions-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef list-subscriptions :args (clojure.spec.alpha/? :portkey.aws.sns/list-subscriptions-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-subscriptions-response))

(clojure.core/defn setsmsattributes "Use this request to set the default settings for sending SMS messages and\nreceiving daily SMS usage reports.\n You can override some of these settings for a single message when you use the\nPublish action with the MessageAttributes.entry.N parameter. For more\ninformation, see Sending an SMS Message\n(http://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html) in the\nAmazon SNS Developer Guide." ([setsmsattributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-setsmsattributes-input "SetSMSAttributes" setsmsattributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/setsmsattributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/setsmsattributes-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef setsmsattributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/setsmsattributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/setsmsattributes-response))

(clojure.core/defn list-endpoints-by-platform-application "Lists the endpoints and endpoint attributes for devices in a supported push\nnotification service, such as GCM and APNS. The results for\nListEndpointsByPlatformApplication are paginated and return a limited list of\nendpoints, up to 100. If additional records are available after the first page\nresults, then a NextToken string will be returned. To receive the next page, you\ncall ListEndpointsByPlatformApplication again using the NextToken string\nreceived from the previous call. When there are no more records to return,\nNextToken will be null. For more information, see Using Amazon SNS Mobile Push\nNotifications (http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([list-endpoints-by-platform-application-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-endpoints-by-platform-application-input "ListEndpointsByPlatformApplication" list-endpoints-by-platform-application-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/list-endpoints-by-platform-application-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/list-endpoints-by-platform-application-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef list-endpoints-by-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/list-endpoints-by-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-endpoints-by-platform-application-response))

(clojure.core/defn opt-in-phone-number "Use this request to opt in a phone number that is opted out, which enables you\nto resume sending SMS messages to the number.\n You can opt in a phone number only once every 30 days." ([opt-in-phone-number-input] (clojure.core/let [req<-input__36755__auto__ (req<-opt-in-phone-number-input "OptInPhoneNumber" opt-in-phone-number-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/opt-in-phone-number-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/opt-in-phone-number-response {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}))))
(clojure.spec.alpha/fdef opt-in-phone-number :args (clojure.spec.alpha/tuple :portkey.aws.sns/opt-in-phone-number-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/opt-in-phone-number-response))

(clojure.core/defn create-topic "Creates a topic to which notifications can be published. Users can create at\nmost 100,000 topics. For more information, see http://aws.amazon.com/sns\n(http://aws.amazon.com/sns/). This action is idempotent, so if the requester\nalready owns a topic with the specified name, that topic's ARN is returned\nwithout creating a new topic." ([create-topic-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-topic-input "CreateTopic" create-topic-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/create-topic-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/create-topic-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "TopicLimitExceededException" :portkey.aws.sns/topic-limit-exceeded-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef create-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-topic-response))

(clojure.core/defn getsmsattributes "Returns the settings for sending SMS messages from your account.\n These settings are set with the SetSMSAttributes action." ([] (getsmsattributes {})) ([getsmsattributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-getsmsattributes-input "GetSMSAttributes" getsmsattributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/getsmsattributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/getsmsattributes-response {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}))))
(clojure.spec.alpha/fdef getsmsattributes :args (clojure.spec.alpha/? :portkey.aws.sns/getsmsattributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/getsmsattributes-response))

(clojure.core/defn set-subscription-attributes "Allows a subscription owner to set an attribute of the topic to a new value." ([set-subscription-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-subscription-attributes-input "SetSubscriptionAttributes" set-subscription-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/set-subscription-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef set-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-subscription-attributes-input) :ret clojure.core/true?)

(clojure.core/defn list-platform-applications "Lists the platform application objects for the supported push notification\nservices, such as APNS and GCM. The results for ListPlatformApplications are\npaginated and return a limited list of applications, up to 100. If additional\nrecords are available after the first page results, then a NextToken string will\nbe returned. To receive the next page, you call ListPlatformApplications using\nthe NextToken string received from the previous call. When there are no more\nrecords to return, NextToken will be null. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([] (list-platform-applications {})) ([list-platform-applications-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-platform-applications-input "ListPlatformApplications" list-platform-applications-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/list-platform-applications-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/list-platform-applications-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef list-platform-applications :args (clojure.spec.alpha/? :portkey.aws.sns/list-platform-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-platform-applications-response))

(clojure.core/defn check-if-phone-number-is-opted-out "Accepts a phone number and indicates whether the phone holder has opted out of\nreceiving SMS messages from your account. You cannot send SMS messages to a\nnumber that is opted out.\n To resume sending messages, you can opt in the number by using the\nOptInPhoneNumber action." ([check-if-phone-number-is-opted-out-input] (clojure.core/let [req<-input__36755__auto__ (req<-check-if-phone-number-is-opted-out-input "CheckIfPhoneNumberIsOptedOut" check-if-phone-number-is-opted-out-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/check-if-phone-number-is-opted-out-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/check-if-phone-number-is-opted-out-response {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}))))
(clojure.spec.alpha/fdef check-if-phone-number-is-opted-out :args (clojure.spec.alpha/tuple :portkey.aws.sns/check-if-phone-number-is-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/check-if-phone-number-is-opted-out-response))

(clojure.core/defn list-topics "Returns a list of the requester's topics. Each call returns a limited list of\ntopics, up to 100. If there are more topics, a NextToken is also returned. Use\nthe NextToken parameter in a new ListTopics call to get further results." ([] (list-topics {})) ([list-topics-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-topics-input "ListTopics" list-topics-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/list-topics-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/list-topics-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef list-topics :args (clojure.spec.alpha/? :portkey.aws.sns/list-topics-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-topics-response))

(clojure.core/defn get-platform-application-attributes "Retrieves the attributes of the platform application object for the supported\npush notification services, such as APNS and GCM. For more information, see\nUsing Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([get-platform-application-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-platform-application-attributes-input "GetPlatformApplicationAttributes" get-platform-application-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/get-platform-application-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/get-platform-application-attributes-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef get-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-platform-application-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-platform-application-attributes-response))

(clojure.core/defn list-phone-numbers-opted-out "Returns a list of phone numbers that are opted out, meaning you cannot send SMS\nmessages to them.\n The results for ListPhoneNumbersOptedOut are paginated, and each page returns\nup to 100 phone numbers. If additional phone numbers are available after the\nfirst page of results, then a NextToken string will be returned. To receive the\nnext page, you call ListPhoneNumbersOptedOut again using the NextToken string\nreceived from the previous call. When there are no more records to return,\nNextToken will be null." ([] (list-phone-numbers-opted-out {})) ([list-phone-numbers-opted-out-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-phone-numbers-opted-out-input "ListPhoneNumbersOptedOut" list-phone-numbers-opted-out-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/list-phone-numbers-opted-out-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/list-phone-numbers-opted-out-response {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}))))
(clojure.spec.alpha/fdef list-phone-numbers-opted-out :args (clojure.spec.alpha/? :portkey.aws.sns/list-phone-numbers-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-phone-numbers-opted-out-response))

(clojure.core/defn delete-platform-application "Deletes a platform application object for one of the supported push notification\nservices, such as APNS and GCM. For more information, see Using Amazon SNS\nMobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([delete-platform-application-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-platform-application-input "DeletePlatformApplication" delete-platform-application-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/delete-platform-application-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef delete-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-platform-application-input) :ret clojure.core/true?)

(clojure.core/defn add-permission "Adds a statement to a topic's access control policy, granting access for the\nspecified AWS accounts to the specified actions." ([add-permission-input] (clojure.core/let [req<-input__36755__auto__ (req<-add-permission-input "AddPermission" add-permission-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/add-permission-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns/add-permission-input) :ret clojure.core/true?)

(clojure.core/defn create-platform-endpoint "Creates an endpoint for a device and mobile app on one of the supported push\nnotification services, such as GCM and APNS. CreatePlatformEndpoint requires the\nPlatformApplicationArn that is returned from CreatePlatformApplication. The\nEndpointArn that is returned when using CreatePlatformEndpoint can then be used\nby the Publish action to send a message to a mobile app or by the Subscribe\naction for subscription to a topic. The CreatePlatformEndpoint action is\nidempotent, so if the requester already owns an endpoint with the same device\ntoken and attributes, that endpoint's ARN is returned without creating a new\nendpoint. For more information, see Using Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html).\n When using CreatePlatformEndpoint with Baidu, two attributes must be provided:\nChannelId and UserId. The token field must also contain the ChannelId. For more\ninformation, see Creating an Amazon SNS Endpoint for Baidu\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html)." ([create-platform-endpoint-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-platform-endpoint-input "CreatePlatformEndpoint" create-platform-endpoint-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/create-platform-endpoint-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/create-endpoint-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef create-platform-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-platform-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-endpoint-response))

(clojure.core/defn create-platform-application "Creates a platform application object for one of the supported push notification\nservices, such as APNS and GCM, to which devices and mobile apps may register.\nYou must specify PlatformPrincipal and PlatformCredential attributes when using\nthe CreatePlatformApplication action. The PlatformPrincipal is received from the\nnotification service. For APNS/APNS_SANDBOX, PlatformPrincipal is \"SSL\ncertificate\". For GCM, PlatformPrincipal is not applicable. For ADM,\nPlatformPrincipal is \"client id\". The PlatformCredential is also received from\nthe notification service. For WNS, PlatformPrincipal is \"Package Security\nIdentifier\". For MPNS, PlatformPrincipal is \"TLS certificate\". For Baidu,\nPlatformPrincipal is \"API key\".\n For APNS/APNS_SANDBOX, PlatformCredential is \"private key\". For GCM,\nPlatformCredential is \"API key\". For ADM, PlatformCredential is \"client secret\".\nFor WNS, PlatformCredential is \"secret key\". For MPNS, PlatformCredential is\n\"private key\". For Baidu, PlatformCredential is \"secret key\". The\nPlatformApplicationArn that is returned when using CreatePlatformApplication is\nthen used as an attribute for the CreatePlatformEndpoint action. For more\ninformation, see Using Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html). For more\ninformation about obtaining the PlatformPrincipal and PlatformCredential for\neach of the supported push notification services, see Getting Started with Apple\nPush Notification Service\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-apns.html), Getting\nStarted with Amazon Device Messaging\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-adm.html), Getting Started\nwith Baidu Cloud Push\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-baidu.html), Getting\nStarted with Google Cloud Messaging for Android\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-gcm.html), Getting Started\nwith MPNS (http://docs.aws.amazon.com/sns/latest/dg/mobile-push-mpns.html), or\nGetting Started with WNS\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-wns.html)." ([create-platform-application-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-platform-application-input "CreatePlatformApplication" create-platform-application-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/create-platform-application-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/create-platform-application-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef create-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-platform-application-response))

(clojure.core/defn subscribe "Prepares to subscribe an endpoint by sending the endpoint a confirmation\nmessage. To actually create a subscription, the endpoint owner must call the\nConfirmSubscription action with the token from the confirmation message.\nConfirmation tokens are valid for three days." ([subscribe-input] (clojure.core/let [req<-input__36755__auto__ (req<-subscribe-input "Subscribe" subscribe-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/subscribe-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/subscribe-response {"SubscriptionLimitExceededException" :portkey.aws.sns/subscription-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef subscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns/subscribe-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/subscribe-response))

(clojure.core/defn list-subscriptions-by-topic "Returns a list of the subscriptions to a specific topic. Each call returns a\nlimited list of subscriptions, up to 100. If there are more subscriptions, a\nNextToken is also returned. Use the NextToken parameter in a new\nListSubscriptionsByTopic call to get further results." ([list-subscriptions-by-topic-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-subscriptions-by-topic-input "ListSubscriptionsByTopic" list-subscriptions-by-topic-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/list-subscriptions-by-topic-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/list-subscriptions-by-topic-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef list-subscriptions-by-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/list-subscriptions-by-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-subscriptions-by-topic-response))

(clojure.core/defn get-subscription-attributes "Returns all of the properties of a subscription." ([get-subscription-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-subscription-attributes-input "GetSubscriptionAttributes" get-subscription-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/get-subscription-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/get-subscription-attributes-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef get-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-subscription-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-subscription-attributes-response))

(clojure.core/defn remove-permission "Removes a statement from a topic's access control policy." ([remove-permission-input] (clojure.core/let [req<-input__36755__auto__ (req<-remove-permission-input "RemovePermission" remove-permission-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/remove-permission-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns/remove-permission-input) :ret clojure.core/true?)

(clojure.core/defn set-endpoint-attributes "Sets the attributes for an endpoint for a device on one of the supported push\nnotification services, such as GCM and APNS. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html)." ([set-endpoint-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-endpoint-attributes-input "SetEndpointAttributes" set-endpoint-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/set-endpoint-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef set-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-endpoint-attributes-input) :ret clojure.core/true?)

(clojure.core/defn publish "Sends a message to all of a topic's subscribed endpoints. When a messageId is\nreturned, the message has been saved and Amazon SNS will attempt to deliver it\nto the topic's subscribers shortly. The format of the outgoing message to each\nsubscribed endpoint depends on the notification protocol.\n To use the Publish action for sending a message to a mobile endpoint, such as\nan app on a Kindle device or mobile phone, you must specify the EndpointArn for\nthe TargetArn parameter. The EndpointArn is returned when making a call with the\nCreatePlatformEndpoint action.\n For more information about formatting messages, see Send Custom\nPlatform-Specific Payloads in Messages to Mobile Devices\n(http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html)." ([publish-input] (clojure.core/let [req<-input__36755__auto__ (req<-publish-input "Publish" publish-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/publish-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/publish-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.sns/invalid-parameter-value-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "EndpointDisabledException" :portkey.aws.sns/endpoint-disabled-exception, "PlatformApplicationDisabledException" :portkey.aws.sns/platform-application-disabled-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef publish :args (clojure.spec.alpha/tuple :portkey.aws.sns/publish-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/publish-response))

(clojure.core/defn get-topic-attributes "Returns all of the properties of a topic. Topic properties returned might differ\nbased on the authorization of the user." ([get-topic-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-topic-attributes-input "GetTopicAttributes" get-topic-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/get-topic-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/get-topic-attributes-response {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef get-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-topic-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-topic-attributes-response))

(clojure.core/defn confirm-subscription "Verifies an endpoint owner's intent to receive messages by validating the token\nsent to the endpoint by an earlier Subscribe action. If the token is valid, the\naction creates a new subscription and returns its Amazon Resource Name (ARN).\nThis call requires an AWS signature only when the AuthenticateOnUnsubscribe flag\nis set to \"true\"." ([confirm-subscription-input] (clojure.core/let [req<-input__36755__auto__ (req<-confirm-subscription-input "ConfirmSubscription" confirm-subscription-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/confirm-subscription-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sns/confirm-subscription-response {"SubscriptionLimitExceededException" :portkey.aws.sns/subscription-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef confirm-subscription :args (clojure.spec.alpha/tuple :portkey.aws.sns/confirm-subscription-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/confirm-subscription-response))

(clojure.core/defn delete-endpoint "Deletes the endpoint for a device and mobile app from Amazon SNS. This action is\nidempotent. For more information, see Using Amazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html).\n When you delete an endpoint that is also subscribed to a topic, then you must\nalso unsubscribe the endpoint from the topic." ([delete-endpoint-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-endpoint-input "DeleteEndpoint" delete-endpoint-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/delete-endpoint-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-endpoint-input) :ret clojure.core/true?)

(clojure.core/defn set-topic-attributes "Allows a topic owner to set an attribute of the topic to a new value." ([set-topic-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-topic-attributes-input "SetTopicAttributes" set-topic-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/set-topic-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}))))
(clojure.spec.alpha/fdef set-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-topic-attributes-input) :ret clojure.core/true?)

(clojure.core/defn set-platform-application-attributes "Sets the attributes of the platform application object for the supported push\nnotification services, such as APNS and GCM. For more information, see Using\nAmazon SNS Mobile Push Notifications\n(http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html). For information\non configuring attributes for message delivery status, see Using Amazon SNS\nApplication Attributes for Message Delivery Status\n(http://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html)." ([set-platform-application-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-platform-application-attributes-input "SetPlatformApplicationAttributes" set-platform-application-attributes-input)] (portkey.aws/-query-call portkey.aws.sns/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sns/set-platform-application-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}))))
(clojure.spec.alpha/fdef set-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-platform-application-attributes-input) :ret clojure.core/true?)
