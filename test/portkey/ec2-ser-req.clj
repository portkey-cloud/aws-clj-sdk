(ns portkey.ec2-ser-req
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as s]
            [clojure.test :refer :all]
            ;; Code smell, I should not load x & gen but for some reasons it can't find it during macro-expansionc
            [net.cgrand.xforms :as x]
            [portkey.aws :as aws]
            [portkey.aws.ec2 :as ec2]
            [portkey.awsgen :as gen :refer :all]
            [portkey.utils :refer [deftest-aws-ser deftest-aws-request]]))


;;;;;;;;;;;;;;;;
;; TEST BEGIN ;;
;;;;;;;;;;;;;;;;


;; EC2 protocol :
;;
;; - list :
;; - map :
;; - structure :


;;;;;;;;;;;;;;;;;;;;;;;
;; TESTING LIST TYPE ;;
;;;;;;;;;;;;;;;;;;;;;;;


(deftest-aws-ser ec2-ec2-describe-availability-zones
  "TEST LIST 1 : list with location-name set.

  When a non flatten list is set, the final map has to be flatten by
  appending keys and setting final value."
  {:description-schema {"shapes" {"DescribeAvailabilityZonesRequest" {"type" "structure",
                                                                      "members"
                                                                      {"Filters" {"shape"        "FilterList",
                                                                                  "locationName" "Filter"},
                                                                       "ZoneNames"
                                                                       {"shape" "ZoneNameStringList", "locationName" "ZoneName"},
                                                                       "DryRun"  {"shape" "Boolean", "locationName" "dryRun"}}}
                                  "FilterList"
                                  {"type" "list", "member" {"shape" "Filter", "locationName" "Filter"}}
                                  "Filter"
                                  {"type" "structure", "members" {"Name" {"shape" "String"}, "Values" {"shape" "ValueStringList", "locationName" "Value"}}}
                                  "String"
                                  {"type" "string"}
                                  "ValueStringList"
                                  {"type" "list", "member" {"shape" "String", "locationName" "item"}}
                                  "ZoneNameStringList"
                                  {"type" "list", "member" {"shape" "String", "locationName" "ZoneName"}}
                                  "Boolean"
                                  {"type" "boolean"}}}
   :shape-to-test      "DescribeAvailabilityZonesRequest"
   :apply-on-protocols ["ec2"]
   :inputs             [{:dry-run    true,
                         :zone-names ["eu-west-1"],
                         :filters    [{:name   "Filter1Name",
                                       :values ["value1" "value2"]}]}]
   :expected-result    #:http.request.field {:value [#:http.request.field{:value         [#:http.request.field{:value         [#:http.request.field{:value "Filter1Name", :shape "String", :name "Name"}
                                                                                                                               #:http.request.field{:value         [#:http.request.field{:value "value1", :shape "String", :location-name "item"}
                                                                                                                                                                    #:http.request.field{:value "value2", :shape "String", :location-name "item"}],
                                                                                                                                                    :shape         "ValueStringList",
                                                                                                                                                    :type          "list",
                                                                                                                                                    :name          "Values",
                                                                                                                                                    :location-name "Value"}],
                                                                                                               :shape         "Filter",
                                                                                                               :type          "structure",
                                                                                                               :location-name "Filter"}],
                                                                          :shape         "FilterList",
                                                                          :type          "list",
                                                                          :name          "Filters",
                                                                          :location-name "Filter"}
                                                     #:http.request.field{:value         [#:http.request.field{:value "eu-west-1", :shape "String", :location-name "ZoneName"}],
                                                                          :shape         "ZoneNameStringList",
                                                                          :type          "list",
                                                                          :name          "ZoneNames",
                                                                          :location-name "ZoneName"}
                                                     #:http.request.field{:value true, :shape "Boolean", :name "DryRun", :location-name "dryRun"}],
                                             :shape "DescribeAvailabilityZonesRequest",
                                             :type  "structure"}})

(deftest-aws-request rest-xml-s3-put-bucket-tagging-list-with-locationName-req
  "TEST LIST 1 : list with location-name set.

   See how Filter.1.Value.1 is set.

   - Filter.1 represent the 1st value in :filters key
   - Filter.1.Value.1 is the first value in the second vector"
  {:method                    :post
   :user-input                {:dry-run    true,
                               :zone-names ["eu-west-1"],
                               :filters    [{:name   "Filter1Name",
                                             :values ["value1" "value2"]}]}
   :request-fn                req-describe-availability-zones-request
   :body-fun                  aws/params-to-body-ec2
   :lib-ns                    portkey.aws.ec2
   :expected-result           "Action=&Version=&Filter.1.Name=Filter1Name&Filter.1.Value.1=value1&Filter.1.Value.2=value2&ZoneName.1=eu-west-1&DryRun=true"
   ;; @NOTE : Action and Version are not set yet because they are set
   ;; at the http call function level
   :expected-result-formatted "{
                                 'DryRun': 'true',
                                 'Filter.1.Name': 'Filter1Name',
                                 'Filter.1.Value.2': 'value2',
                                 'Version': '2016-11-15',
                                 'Action': 'DescribeAvailabilityZones',
                                 'ZoneName.1': 'eu-west-1',
                                 'Filter.1.Value.1': 'value1'
                               }"})

(comment
  ;; list with locationName set

  ;;ZoneName

  (require '[portkey.helpers :as h])
  (h/def-api-2-json "ec2")

  ec2-protocol-ec2-api-2-json

  (get-in ec2-protocol-ec2-api-2-json ["shapes" "Boolean"])

  (spec/exercise ::ec2/describe-availability-zones-request)

  (clojure.core/=)


  `








  )
