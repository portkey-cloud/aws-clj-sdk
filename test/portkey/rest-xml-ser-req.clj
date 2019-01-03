(ns portkey.rest-xml-ser-req
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as s]
            [clojure.test :refer :all]
            ;; Code smell, I should not load x & gen but for some reasons it can't find it during macro-expansion
            [net.cgrand.xforms :as x]            
            [portkey.aws :as aws]
            [portkey.aws.s3 :as s3]
            [portkey.awsgen :as gen :refer :all]
            [portkey.utils :refer [deftest-aws-ser deftest-aws-request]]))


;;;;;;;;;;;;;;;;
;; TEST BEGIN ;;
;;;;;;;;;;;;;;;;


;; REST-XML protocol :
;; we should look at how this types generates xml considering all options (flattened, xml-attribute, xml-order...) :
;; - list : flattened & locationName handled, min & max not handled as it is validated by specs, deprecated and sensitive not found for rest-xml protocol
;; - map : map only in headers for the rest-xml protocol. locationName, sensitive, max, min, flattened, locationName not found for rest-xml
;; - structure : xmlAttribute, xmlNamespace, locationName, streaming are handled

    
;;;;;;;;;;;;;;;;;;;;;;;
;; TESTING LIST TYPE ;;
;;;;;;;;;;;;;;;;;;;;;;;


(deftest-aws-ser rest-xml-s3-put-bucket-tagging-list-with-locationName-ser
  "TEST LIST 1 : list with location-name set.

  We have to make
  sure that location-name is assoced on it's http.request.field when
  present in order to be taken into account at runtime when generating
  body input."
  {:description-schema {"shapes" {"TagSet"
                                  {"type" "list", "member" {"shape" "Tag", "locationName" "Tag"}}
                                  "Tag"
                                  {"type" "structure", "required" ["Key" "Value"], "members" {"Key" {"shape" "ObjectKey"}, "Value" {"shape" "Value"}}}
                                  "ObjectKey"
                                  {"type" "string", "min" 1}
                                  "Value"
                                  {"type" "string"}
                                  "BucketName"
                                  {"type" "string"}}}
   :shape-to-test      "TagSet"
   :apply-on-protocols ["rest-xml"]
   :inputs             [[{:key   "cle1"
                          :value "value1"}
                         {:key   "cle2"
                          :value "value2"}]]
   :expected-result    #:http.request.field {:value [#:http.request.field{:value         [#:http.request.field{:value "cle1", :shape "ObjectKey", :name "Key"}
                                                                                          #:http.request.field{:value "value1", :shape "Value", :name "Value"}]
                                                                          :shape         "Tag"
                                                                          :type          "structure"
                                                                          :location-name "Tag"}
                                                     #:http.request.field{:value         [#:http.request.field{:value "cle2", :shape "ObjectKey", :name "Key"}
                                                                                          #:http.request.field{:value "value2", :shape "Value", :name "Value"}]
                                                                          :shape         "Tag"
                                                                          :type          "structure"
                                                                          :location-name "Tag"}]
                                             :shape "TagSet"
                                             :type  "list"}})


(deftest-aws-request rest-xml-s3-put-bucket-tagging-list-with-locationName-req
  "TEST LIST 1 : list with location-name set.

   With shape TagSet which is a type list with a locationName.
   LocationName should be used as key in the xml ouput instead of
   usual shape name.
   
  {\"TagSet\" {\"type\" \"list\", \"member\" {\"shape\" \"Tag\",\"locationName\" \"Tag\"}}}"
  {:method                    :post
   :user-input                {:bucket "monbucket",
                               :tagging
                               {:tag-set
                                [{:key "cle1", :value "valeur1"}
                                 {:key "cle2", :value "valeur2"}]}}
   :request-fn                req-put-bucket-tagging-request
   :body-fun                  aws/params-to-body-rest-xml
   :lib-ns                    portkey.aws.s3
   :expected-result           "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Tagging xmlns:a=\"http://s3.amazonaws.com/doc/2006-03-01/\"><TagSet><Tag><Key>cle1</Key><Value>valeur1</Value></Tag><Tag><Key>cle2</Key><Value>valeur2</Value></Tag></TagSet></Tagging>"
   :expected-result-formatted "
<?xml version=\"1.0\" encoding=\"UTF-8\"?>
<Tagging xmlns:a=\"http://s3.amazonaws.com/doc/2006-03-01/\">
  <TagSet>
    <Tag>
      <Key>cle1</Key>
      <Value>valeur1</Value>
    </Tag>
    <Tag>
      <Key>cle2</Key>
      <Value>valeur2</Value>
    </Tag>
  </TagSet>
</Tagging>"})


(deftest-aws-ser  rest-xml-s3-put-bucket-notification-configuration-list-with-flatten-ser
  "TEST LIST 2 : list with flatten attribute.

   When list is flattened, we have to propagate flattened value.
   The value is then used at runtime for generating proper xml
   e.g : ignoring the parent tag for flattened lists."
  {:description-schema {"shapes" {"TopicConfigurationList"
                                  {"type" "list", "member" {"shape" "TopicConfiguration"}, "flattened" true}
                                  "TopicConfiguration"
                                  {"type"     "structure"
                                   "required" ["TopicArn" "Events"]
                                   "members"  {"Id"       {"shape" "NotificationId"},
                                               "TopicArn" {"shape" "TopicArn", "locationName" "Topic"},
                                               "Events"   {"shape" "EventList", "locationName" "Event"}}}
                                  "NotificationId"
                                  {"type" "string"}
                                  "TopicArn"
                                  {"type" "string"}
                                  "EventList"
                                  {"type" "list", "member" {"shape" "Event"}, "flattened" true}
                                  "Event"
                                  {"type" "string",
                                   "enum" ["s3:ReducedRedundancyLostObject"
                                           "s3:ObjectCreated:*"
                                           "s3:ObjectCreated:Put"
                                           "s3:ObjectCreated:Post"
                                           "s3:ObjectCreated:Copy"
                                           "s3:ObjectCreated:CompleteMultipartUpload"
                                           "s3:ObjectRemoved:*"
                                           "s3:ObjectRemoved:Delete"
                                           "s3:ObjectRemoved:DeleteMarkerCreated"]}}}
   :shape-to-test      "TopicConfigurationList"
   :apply-on-protocols ["rest-xml"]
   :inputs             [[{:topic-arn "arn1",
                          :id        "id1"
                          :events    ["s3:ObjectRemoved:Delete"]}
                         {:topic-arn "arn2",
                          :id        "id2"
                          :events    ["s3:ObjectCreated:CompleteMultipartUpload"
                                      "s3:ObjectRemoved:Delete"]}]]
   :expected-result    #:http.request.field {:value     [#:http.request.field{:value [#:http.request.field{:value "arn1", :shape "TopicArn", :name "TopicArn", :location-name "Topic"}
                                                                                      #:http.request.field{:value         [#:http.request.field{:value "s3:ObjectRemoved:Delete", :shape "Event"}],
                                                                                                           :shape         "EventList",
                                                                                                           :type          "list",
                                                                                                           :flattened     true,
                                                                                                           :name          "Events",
                                                                                                           :location-name "Event"}
                                                                                      #:http.request.field{:value "id1", :shape "NotificationId", :name "Id"}],
                                                                              :shape "TopicConfiguration",
                                                                              :type  "structure"}
                                                         #:http.request.field{:value [#:http.request.field{:value "arn2", :shape "TopicArn", :name "TopicArn", :location-name "Topic"}
                                                                                      #:http.request.field{:value [#:http.request.field{:value "s3:ObjectCreated:CompleteMultipartUpload", :shape "Event"}
                                                                                                                   #:http.request.field{:value "s3:ObjectRemoved:Delete", :shape "Event"}],
                                                                                                           :shape "EventList",
                                                                                                           :type "list",
                                                                                                           :flattened true,
                                                                                                           :name "Events",
                                                                                                           :location-name "Event"}
                                                                                      #:http.request.field{:value "id2", :shape "NotificationId", :name "Id"}],
                                                                              :shape "TopicConfiguration",
                                                                              :type  "structure"}]
                                             :shape     "TopicConfigurationList",
                                             :type      "list",
                                             :flattened true}})


(deftest-aws-request rest-xml-s3-put-bucket-notification-configuration-list-with-flatten-req
  "TEST LIST 2 : list with flatten attribute"
  {:method                    :post
   :user-input                {:bucket "monbucket",
                               :notification-configuration
                               {:topic-configurations
                                [{:topic-arn "arn1",
                                  :id        "id1"
                                  :events    ["s3:ObjectRemoved:Delete"]}
                                 {:topic-arn "arn2",
                                  :id        "id2"
                                  :events    ["s3:ObjectCreated:CompleteMultipartUpload"
                                              "s3:ObjectRemoved:Delete"]}]}}
   :request-fn                req-put-bucket-notification-configuration-request
   :body-fun                  aws/params-to-body-rest-xml
   :lib-ns                    portkey.aws.s3
   :expected-result           "<?xml version=\"1.0\" encoding=\"UTF-8\"?><NotificationConfiguration xmlns:a=\"http://s3.amazonaws.com/doc/2006-03-01/\"><TopicConfiguration><Topic>arn1</Topic><Event>s3:ObjectRemoved:Delete</Event><Id>id1</Id></TopicConfiguration><TopicConfiguration><Topic>arn2</Topic><Event>s3:ObjectCreated:CompleteMultipartUpload</Event><Event>s3:ObjectRemoved:Delete</Event><Id>id2</Id></TopicConfiguration></NotificationConfiguration>"
   :expected-result-formatted "
<?xml version=\"1.0\" encoding=\"UTF-8\"?>
<NotificationConfiguration xmlns:a=\"http://s3.amazonaws.com/doc/2006-03-01/\">
  <TopicConfiguration>
    <Topic>arn1</Topic>
    <Event>s3:ObjectRemoved:Delete</Event>
    <Id>id1</Id>
  </TopicConfiguration>
  <TopicConfiguration>
    <Topic>arn2</Topic>
    <Event>s3:ObjectCreated:CompleteMultipartUpload</Event>
    <Event>s3:ObjectRemoved:Delete</Event>
    <Id>id2</Id>
  </TopicConfiguration>
</NotificationConfiguration>"})


;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; END LIST TYPE TESTING ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;;;;;;;;;;;;;;;;;;;;
;; TESTING MAP TYPE ;;
;;;;;;;;;;;;;;;;;;;;;;





(deftest-aws-request  rest-xml-s3-put-object-request-map-request
  "TEST MAP 1 :

   Map are only applied on headers for the rest-xml protocol.  Here is
   an example when updating an object to s3.  The streaming attribute
   is set to true which take bytes as input body and bypass XML
   generation."
  {:method          :post
   :user-input      {:bucket        "monbucket"
                     :key           "macle"
                     :body          (bytes (byte-array (map (comp byte int) "body")))
                     :metadata      {"map-key1" "map-value1"
                                     "map-key2" "map-value2"}
                     :storage-class "ONEZONE_IA"}
   :request-fn      req-put-object-request
   :body-fun        aws/params-to-body-rest-xml
   :lib-ns          portkey.aws.s3
   :expected-result "Ym9keQ=="})


;;;;;;;;;;;;;;;;;;;;;;;;;;
;; END TESTING MAP TYPE ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; TESTING STRUCTURE TYPE ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(deftest-aws-ser   rest-xml-s3-put-object-request-structure-with-xmlAttribute-ser
  "TEST STRUCTURE 1 : xmlAttribute should be assoced into field."
  {:description-schema {"shapes" {"Grantee"
                                  {"type"         "structure",
                                   "required"     ["Type"],
                                   "members"      {"DisplayName"  {"shape" "DisplayName"},
                                                   "EmailAddress" {"shape" "EmailAddress"},
                                                   "ID"           {"shape" "ID"},
                                                   "Type"         {"shape" "Type", "locationName" "xsi:type", "xmlAttribute" true},
                                                   "URI"          {"shape" "URI"}},
                                   "xmlNamespace" {"prefix" "xsi", "uri" "http://www.w3.org/2001/XMLSchema-instance"}}
                                  "DisplayName"
                                  {"type" "string"}
                                  "EmailAddress"
                                  {"type" "string"}
                                  "ID"
                                  {"type" "string"}
                                  "URI"
                                  {"type" "string"}
                                  "Type"
                                  {"type" "string", "enum" ["CanonicalUser" "AmazonCustomerByEmail" "Group"]}}}
   :shape-to-test      "Grantee"
   :apply-on-protocols ["rest-xml"]
   :inputs             [{:type :canonical-user, :display-name "Baptiste Dupuch", :uri "myuri"}]
   :expected-result    #:http.request.field {:value         [#:http.request.field{:value         "CanonicalUser",
                                                                                  :shape         "Type",
                                                                                  :name          "Type",
                                                                                  :location-name "xsi:type",
                                                                                  :xml-attribute true}
                                                             #:http.request.field{:value "Baptiste Dupuch", :shape "DisplayName", :name "DisplayName"}
                                                             #:http.request.field{:value "myuri", :shape "URI", :name "URI"}],
                                             :shape         "Grantee",
                                             :type          "structure",
                                             :xml-namespace {"prefix" "xsi", "uri" "http://www.w3.org/2001/XMLSchema-instance"}}})


(deftest-aws-request  rest-xml-s3-put-object-request-structure-with-xmlAttribute-request
  "TEST STRUCTURE 1 : xmlAttribute should generate a new xmlns in parent tag.

   When xmlAttribute is set, the xsi namespace must be set on partent, in this case, Grantee."
  {:method          :post
   :user-input      {:bucket        "monbucket",
                     :key           "key-not-in-payload",
                     :request-payer :requester,
                     :acl           "authenticated-read",
                     :access-control-policy
                     {:grants [{:grantee
                                {:type :canonical-user, :display-name "Baptiste Dupuch", :uri "myuri"}
                                :permission :read}],
                      :owner  {:display-name "Owner name", :id "owner-id"}}}
   :request-fn      req-put-object-acl-request
   :body-fun        aws/params-to-body-rest-xml
   :lib-ns          portkey.aws.s3
   :expected-result "<?xml version=\"1.0\" encoding=\"UTF-8\"?><AccessControlPolicy xmlns:a=\"http://s3.amazonaws.com/doc/2006-03-01/\"><AccessControlList><Grant><Grantee xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"CanonicalUser\"><DisplayName>Baptiste Dupuch</DisplayName><URI>myuri</URI></Grantee><Permission>READ</Permission></Grant></AccessControlList><Owner><DisplayName>Owner name</DisplayName><ID>owner-id</ID></Owner></AccessControlPolicy>"
   :expected-result-formatted
   "
<?xml version=\"1.0\" encoding=\"UTF-8\"?>
<AccessControlPolicy xmlns:a=\"http://s3.amazonaws.com/doc/2006-03-01/\">
  <AccessControlList>
    <Grant>
      <Grantee xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"CanonicalUser\">
        <DisplayName>Baptiste Dupuch</DisplayName>
        <URI>myuri</URI>
      </Grantee>
      <Permission>READ</Permission>
    </Grant>
  </AccessControlList>
  <Owner>
    <DisplayName>Owner name</DisplayName>
    <ID>owner-id</ID>
  </Owner>
</AccessControlPolicy>"})
