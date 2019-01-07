(ns portkey.query-ser-req
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as s]
            [clojure.test :refer :all]
            ;; Code smell, I should not load x & gen but for some reasons it can't find it during macro-expansionc
            [net.cgrand.xforms :as x]
            [portkey.aws :as aws]
            [portkey.aws.sqs :as sqs]
            [portkey.awsgen :as gen :refer :all]
            [portkey.utils :refer [deftest-aws-ser deftest-aws-request]]))



;; QUERY protocol :
;;
;; - list : flattened are common and handled
;; - map : flattened are common and handled
;; - structure : all are well handled



(deftest-aws-ser query-sqs-send-message-ser
  "TEST LIST & MAP 1 :

   When a map is present, the value must be a vector of [key value]
   with properties well copied."
  {:description-schema {"shapes" {"SendMessageRequest"
                                  {"type"     "structure",
                                   "required" ["QueueUrl" "MessageBody"],
                                   "members"  {"QueueUrl"          {"shape" "String"},
                                               "MessageBody"       {"shape" "String"},
                                               "MessageAttributes" {"shape" "MessageBodyAttributeMap", "locationName" "MessageAttribute"},
                                               "MessageGroupId"    {"shape" "String"}}}
                                  "String"
                                  {"type" "string"}
                                  "MessageBodyAttributeMap"
                                  {"type"  "map",
                                   "key"   {"shape" "String", "locationName" "Name"},
                                   "value" {"shape" "MessageAttributeValue", "locationName" "Value"}, "flattened" true}
                                  "MessageAttributeValue"
                                  {"type"     "structure",
                                   "required" ["DataType"],
                                   "members"  {"StringValue"      {"shape" "String"},
                                               "StringListValues" {"shape" "StringList", "flattened" true, "locationName" "StringListValue"},
                                               "DataType"         {"shape" "String"}}}
                                  "StringList"
                                  {"type" "list", "member" {"shape" "String", "locationName" "StringListValue"}}}}
   :shape-to-test      "SendMessageRequest"
   :apply-on-protocols ["query"]
   :inputs             [{:queue-url        "QueueUrl",
                         :message-body     "MessageBody",
                         :message-group-id "MessageGroupId",
                         :message-attributes
                         {"MessageAttributesKey"
                          {:data-type          "DataType",
                           :string-list-values ["string1" "string2"]}}}]
   :expected-result    #:http.request.field{:value [#:http.request.field{:value "QueueUrl", :shape "String", :name "QueueUrl"}
                                                    #:http.request.field{:value "MessageBody", :shape "String", :name "MessageBody"}
                                                    #:http.request.field{:value [[#:http.request.field{:value "MessageAttributesKey", :shape "String", :map-info "key", :location-name "Name"}
                                                                                  #:http.request.field{:value [#:http.request.field{:value "DataType", :shape "String", :name "DataType"}
                                                                                                               #:http.request.field{:value [#:http.request.field{:value "string1", :shape "String", :location-name "StringListValue"}
                                                                                                                                            #:http.request.field{:value "string2", :shape "String", :location-name "StringListValue"}],
                                                                                                                                    :shape "StringList",
                                                                                                                                    :type "list",
                                                                                                                                    :name "StringListValues",
                                                                                                                                    :flattened true,
                                                                                                                                    :location-name "StringListValue"}],
                                                                                                       :shape "MessageAttributeValue",
                                                                                                       :type "structure",
                                                                                                       :map-info "value",
                                                                                                       :location-name "Value"}]],
                                                                         :shape "MessageBodyAttributeMap",
                                                                         :type "map",
                                                                         :flattened true,
                                                                         :name "MessageAttributes",
                                                                         :location-name "MessageAttribute"}
                                                    #:http.request.field{:value "MessageGroupId", :shape "String", :name "MessageGroupId"}],
                                            :shape "SendMessageRequest",
                                            :type "structure"}})




(deftest-aws-request query-sqs-send-message-req
  "TEST LIST & MAP 1:

   When list or map are flattened, it does change the generated
   output.  See the function params-to-body-query for rules on
   handling them."
  {:method                    :post
   :user-input                {:queue-url        "http://google.com",
                               :message-body     "MessageBody",
                               :message-group-id "MessageGroupId",
                               :message-attributes
                               {"MessageAttributesKey"
                                {:data-type          "DataType",
                                 :string-list-values ["string1" "string2"]}
                                "MessageAttributesOtherKey"
                                {:data-type          "DataType2",
                                 :string-list-values ["one" "two"]}}}
   :request-fn                req-send-message-request
   :body-fun                  aws/params-to-body-query
   :lib-ns                    portkey.aws.sqs
   :expected-result           "Action=&Version=&QueueUrl=QueueUrl&MessageBody=MessageBody&MessageAttribute.1.Name=MessageAttributesKey&MessageAttribute.1.Value.DataType=DataType&MessageAttribute.1.Value.StringListValue.1=string1&MessageAttribute.1.Value.StringListValue.2=string2&MessageGroupId=MessageGroupId"
   :expected-result-formatted "{
                                \"QueueUrl\": \"http://google.com\",
                                \"MessageAttribute.1.Value.StringListValue.1\": \"one\",
                                \"MessageAttribute.1.Value.StringListValue.2\": \"two\",
                                \"MessageAttribute.2.Name\": \"MessageAttributeKey\",
                                \"MessageBody\": \"MessageBody\",
                                \"MessageAttribute.2.Value.StringListValue.2\": \"string2\",
                                \"Version\": \"2012-11-05\",
                                \"MessageAttribute.1.Name\": \"MessageAttributeOtherKey\",
                                \"Action\": \"SendMessage\",
                                \"MessageAttribute.1.Value.DataType\": \"DataType2\",
                                \"MessageAttribute.2.Value.StringListValue.1\": \"string1\",
                                \"MessageAttribute.2.Value.DataType\": \"DataType\",
                                \"MessageGroupId\": \"MessageGroupId\"
                              }"})
