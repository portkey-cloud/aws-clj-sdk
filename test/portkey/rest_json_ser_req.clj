(ns portkey.rest-json-ser-req
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as s]
            [clojure.test :refer :all]
            ;; Code smell, I should not load x & gen but for some reasons it can't find it during macro-expansionc
            [net.cgrand.xforms :as x]
            [portkey.aws :as aws]
            [portkey.aws.batch :as batch]
            [portkey.aws.apigateway :as ag]
            [portkey.awsgen :as gen :refer :all]
            [portkey.utils :refer [deftest-aws-ser deftest-aws-request]]))


(deftest-aws-ser rest-json-batch-test-list-structure
  "Test list & structure for rest-json protocol."
  {:description-schema {"shapes" {"CreateComputeEnvironmentRequest"
                                  {"type"     "structure",
                                   "required" ["computeEnvironmentName" "type" "serviceRole"],
                                   "members"  {"computeEnvironmentName" {"shape" "String"},
                                               "type"                   {"shape" "CEType"},
                                               "state"                  {"shape" "CEState"},
                                               "computeResources"       {"shape" "ComputeResource"},
                                               "serviceRole"            {"shape" "String"}}}
                                  "String"
                                  {"type" "string"}
                                  "CEType"
                                  {"type" "string", "enum" ["MANAGED" "UNMANAGED"]}
                                  "CEState"
                                  {"type" "string", "enum" ["ENABLED" "DISABLED"]}
                                  "ComputeResource"
                                  {"type"     "structure",
                                   "required" ["type" "minvCpus" "maxvCpus" "instanceTypes" "subnets" "securityGroupIds" "instanceRole"],
                                   "members"  {"ec2KeyPair"       {"shape" "String"},
                                               "spotIamFleetRole" {"shape" "String"},
                                               "subnets"          {"shape" "StringList"},
                                               "bidPercentage"    {"shape" "Integer"},
                                               "maxvCpus"         {"shape" "Integer"},
                                               "imageId"          {"shape" "String"},
                                               "instanceTypes"    {"shape" "StringList"},
                                               "desiredvCpus"     {"shape" "Integer"},
                                               "type"             {"shape" "CRType"},
                                               "securityGroupIds" {"shape" "StringList"},
                                               "minvCpus"         {"shape" "Integer"},
                                               "instanceRole"     {"shape" "String"}}}
                                  "StringList"
                                  {"type" "list", "member" {"shape" "String"}}
                                  "Integer"
                                  {"type" "integer"}
                                  "CRType"
                                  {"type" "string", "enum" ["EC2" "SPOT"]}}}
   :shape-to-test      "CreateComputeEnvironmentRequest"
   :apply-on-protocols ["rest-json"]
   :inputs             [{:compute-environment-name "Name",
                         :type                     :managed,
                         :service-role             "Service Role",
                         :compute-resources        {:type               :spot,
                                                    :minv-cpus          1,
                                                    :maxv-cpus          1
                                                    :instance-types     ["aa" "bb"],
                                                    :subnets            ["sub1" "sub2"],
                                                    :security-group-ids ["sec1" "sec2"],
                                                    :instance-role      "inst-role"},
                         :state                    :disabled}]
   :expected-result     #:http.request.field{:value [#:http.request.field{:value "Name", :shape "String", :name "computeEnvironmentName"}
                                                     #:http.request.field{:value "MANAGED", :shape "CEType", :name "type"}
                                                     #:http.request.field{:value "Service Role", :shape "String", :name "serviceRole"}
                                                     #:http.request.field{:value "DISABLED", :shape "CEState", :name "state"}
                                                     #:http.request.field{:value [#:http.request.field{:value "SPOT", :shape "CRType", :name "type"}
                                                                                  #:http.request.field{:value 1, :shape "Integer", :name "minvCpus"}
                                                                                  #:http.request.field{:value 1, :shape "Integer", :name "maxvCpus"}
                                                                                  #:http.request.field{:value [#:http.request.field{:value "aa", :shape "String"}
                                                                                                               #:http.request.field{:value "bb", :shape "String"}],
                                                                                                       :shape "StringList",
                                                                                                       :type "list",
                                                                                                       :name "instanceTypes"}
                                                                                  #:http.request.field{:value [#:http.request.field{:value "sub1", :shape "String"}
                                                                                                               #:http.request.field{:value "sub2", :shape "String"}],
                                                                                                       :shape "StringList",
                                                                                                       :type "list",
                                                                                                       :name "subnets"}
                                                                                  #:http.request.field{:value [#:http.request.field{:value "sec1", :shape "String"}
                                                                                                               #:http.request.field{:value "sec2", :shape "String"}],
                                                                                                       :shape "StringList",
                                                                                                       :type "list",
                                                                                                       :name "securityGroupIds"}
                                                                                  #:http.request.field{:value "inst-role", :shape "String", :name "instanceRole"}],
                                                                          :shape "ComputeResource",
                                                                          :type "structure",
                                                                          :name "computeResources"}],
                                             :shape "CreateComputeEnvironmentRequest",
                                             :type "structure"}})


(deftest-aws-request rest-json-batch-test-list-structure-request
  "Test list & structure with rest-json protocol.

   Nothing complex here as the rest-json protocol is almost a mapping
  of the generated clojure map from the input."
  {:method                    :post
   :user-input                {:compute-environment-name "Name",
                               :type                     :managed,
                               :service-role             "Service Role",
                               :compute-resources        {:type               :spot,
                                                          :minv-cpus          1,
                                                          :maxv-cpus          1
                                                          :instance-types     ["aa" "bb"],
                                                          :subnets            ["sub1" "sub2"],
                                                          :security-group-ids ["sec1" "sec2"],
                                                          :instance-role      "inst-role"},
                               :state                    :disabled}
   :request-fn                req-create-compute-environment-request
   :body-fun                  aws/params-to-body-rest-json
   :lib-ns                    portkey.aws.batch
   :expected-result           "{\"computeEnvironmentName\":\"Name\",\"type\":\"MANAGED\",\"serviceRole\":\"Service Role\",\"state\":\"DISABLED\",\"computeResources\":{\"type\":\"SPOT\",\"minvCpus\":1,\"maxvCpus\":1,\"instanceTypes\":[\"aa\",\"bb\"],\"subnets\":[\"sub1\",\"sub2\"],\"securityGroupIds\":[\"sec1\",\"sec2\"],\"instanceRole\":\"inst-role\"}}"
   :expected-result-formatted "{
                                 \"computeEnvironmentName\": \"Name\",
                                 \"type\": \"MANAGED\",
                                 \"serviceRole\": \"ServiceRole\",
                                 \"state\": \"DISABLED\",
                                 \"computeResources\": {
                                   \"type\": \"SPOT\",
                                   \"minvCpus\": 1,
                                   \"maxvCpus\": 1,
                                   \"instanceTypes\": [
                                     \"aa\",
                                     \"bb\"
                                   ],
                                   \"subnets\": [
                                     \"sub1\",
                                     \"sub2\"
                                   ],
                                   \"securityGroupIds\": [
                                     \"sec1\",
                                     \"sec2\"
                                   ],
                                   \"instanceRole\": \"inst-role\"
                                 }
                               }"
   })



(deftest-aws-ser rest-json-apigateway-map-gemeration-ser
  {:description-schema {"shapes" {"PutIntegrationRequest"
                                  {"type"     "structure",
                                   "required" ["restApiId" "resourceId" "httpMethod" "type"],
                                   "members"
                                   {"connectionId"      {"shape" "String"},
                                    "resourceId"        {"shape" "String"},
                                    "connectionType"    {"shape" "ConnectionType"},
                                    "httpMethod"        {"shape" "String"},
                                    "requestParameters" {"shape" "MapOfStringToString"},
                                    "restApiId"         {"shape" "String"},
                                    "type"              {"shape" "IntegrationType"},
                                    "contentHandling"   {"shape" "ContentHandlingStrategy"}}}
                                  "String"
                                  {"type" "string"}
                                  "ConnectionType"
                                  {"type" "string", "enum" ["INTERNET" "VPC_LINK"]}
                                  "MapOfStringToString"
                                  {"type" "map", "key" {"shape" "String"}, "value" {"shape" "String"}}
                                  "IntegrationType"
                                  {"type" "string", "enum" ["HTTP" "AWS" "MOCK" "HTTP_PROXY" "AWS_PROXY"]}
                                  "ContentHandlingStrategy"
                                  {"type" "string", "enum" ["CONVERT_TO_BINARY" "CONVERT_TO_TEXT"]}}}
   :shape-to-test      "PutIntegrationRequest"
   :apply-on-protocols ["rest-json"]
   :inputs             [{:rest-api-id        "apiid",
                         :resource-id        "resourceid",
                         :http-method        "GET",
                         :type               :aws,
                         :connection-type    "VPC_LINK",
                         :connection-id      "cid",
                         :content-handling   :convert-to-text,
                         :request-parameters {"reqkey" "reqval" "reqkey2" "reqval2"}}]
   :expected-result    #:http.request.field{:value [#:http.request.field{:value "apiid", :shape "String", :name "restApiId"}
                                                    #:http.request.field{:value "resourceid", :shape "String", :name "resourceId"}
                                                    #:http.request.field{:value "GET", :shape "String", :name "httpMethod"}
                                                    #:http.request.field{:value "AWS", :shape "IntegrationType", :name "type"}
                                                    #:http.request.field{:value "cid", :shape "String", :name "connectionId"}
                                                    #:http.request.field{:value "VPC_LINK", :shape "ConnectionType", :name "connectionType"}
                                                    #:http.request.field{:value [[#:http.request.field{:value "reqkey", :shape "String", :map-info "key"}
                                                                                  #:http.request.field{:value "reqval", :shape "String", :map-info "value"}]
                                                                                 [#:http.request.field{:value "reqkey2", :shape "String", :map-info "key"}
                                                                                  #:http.request.field{:value "reqval2", :shape "String", :map-info "value"}]],
                                                                         :shape "MapOfStringToString",
                                                                         :type "map",
                                                                         :name "requestParameters"}
                                                    #:http.request.field{:value "CONVERT_TO_TEXT", :shape "ContentHandlingStrategy", :name "contentHandling"}],
                                            :shape "PutIntegrationRequest",
                                            :type "structure"}})


(deftest-aws-ser rest-json-runtime-lex-jsonvalue-ser
  {:description-schema {"shapes" {"PostContentRequest"
                                  {"type"     "structure",
                                   "required" ["botName" "botAlias" "userId" "contentType" "inputStream"],
                                   "members"  {"userId"            {"shape" "UserId", "location" "uri", "locationName" "userId"},
                                               "sessionAttributes" {"shape" "AttributesString", "jsonvalue" true},
                                               "requestAttributes" {"shape" "AttributesString", "jsonvalue" true},}}
                                  "UserId"
                                  {"type" "string", "max" 100, "min" 2, "pattern" "[0-9a-zA-Z._:-]+"}
                                  "AttributesString"
                                  {"type" "string", "sensitive" true}}}
   :shape-to-test      ""
   :apply-on-protocols ["rest-json"]
   :inputs             []
   :expected-result    {}})


(comment


  (require '[portkey.aws.runtime-lex :as lex])
  (require '[clojure.spec.alpha :as spec])
  (require '[portkey.helpers :as h])

  (lex/post-content {:bot-name "U",
                     :bot-alias                  "",
                     :user-id                    "bbF",
                     :content-type               "g",
                     :input-stream               (bytes (byte-array (map (comp byte int) "body"))),
                     :session-attributes         "",
                     :request-attributes         "z",
                     :accept                     "2"})

  (sc.api/last-ep-id)

  (sc.api)

  )
