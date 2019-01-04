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
;; - list : only non flatten lists found, queryName is handled for old apis
;; - map : no map found for ec2 type
;; - structure : all are well handled


;;;;;;;;;;;;;;;;;;;;;;;
;; TESTING LIST TYPE ;;
;;;;;;;;;;;;;;;;;;;;;;;


(deftest-aws-ser ec2-ec2-describe-availability-zones-ser
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

(deftest-aws-request ec2-ec2-describe-availability-zones-request
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

      ;; def query_name(ref, default = nil)
      ;;   ref.location_name || default
      ;; end


     ;; def format(ref, value, prefix)
     ;;    case ref.shape
     ;;    when StructureShape then structure(ref, value, prefix + '.')
     ;;    when ListShape      then list(ref, value, prefix)
     ;;    when MapShape       then map(ref, value, prefix)
     ;;    when BlobShape      then set(prefix, blob(value))
     ;;    when TimestampShape then set(prefix, timestamp(ref, value))
     ;;    else set(prefix, value.to_s)
     ;;    end
  ;;  end


  ;; def map(ref, values, prefix)
  ;;       key_ref = ref.shape.key
  ;;       value_ref = ref.shape.value
  ;;       prefix += '.entry' unless flat?(ref)
  ;;       key_name = "%s.%d.#{query_name(key_ref, 'key')}"
  ;;       value_name  = "%s.%d.#{query_name(value_ref, 'value')}"
  ;;       values.each.with_index do |(key, value), n|
  ;;         format(key_ref, key, key_name % [prefix, n + 1])
  ;;         format(value_ref, value, value_name % [prefix, n + 1])
  ;;       end
  ;;     end

  ;; def structure(ref, values, prefix)
  ;;       shape = ref.shape
  ;;       values.each_pair do |name, value|
  ;;         next if value.nil?
  ;;         member_ref = shape.member(name)
  ;;         format(member_ref, value, prefix + query_name(member_ref))
  ;;       end
  ;;     end

  ;;     def list(ref, values, prefix)
  ;;       member_ref = ref.shape.member
  ;;       if values.empty?
  ;;         set(prefix, '')
  ;;         return
  ;;       end
  ;;       if flat?(ref)
  ;;         if name = query_name(member_ref)
  ;;           parts = prefix.split('.')
  ;;           parts.pop
  ;;           parts.push(name)
  ;;           prefix = parts.join('.')
  ;;         end
  ;;       else
  ;;         prefix += '.' + (member_ref.location_name || 'member')
  ;;       end
  ;;       values.each.with_index do |value, n|
  ;;         format(member_ref, value, "#{prefix}.#{n+1}")
  ;;       end
  ;;     end




  )
