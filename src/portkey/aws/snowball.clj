(ns portkey.aws.snowball (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "snowball", :region "us-gov-east-1"},
    :ssl-common-name "snowball.us-gov-east-1.amazonaws.com",
    :endpoint "https://snowball.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "snowball", :region "ap-northeast-1"},
    :ssl-common-name "snowball.ap-northeast-1.amazonaws.com",
    :endpoint "https://snowball.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "snowball", :region "eu-west-1"},
    :ssl-common-name "snowball.eu-west-1.amazonaws.com",
    :endpoint "https://snowball.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "snowball", :region "us-east-2"},
    :ssl-common-name "snowball.us-east-2.amazonaws.com",
    :endpoint "https://snowball.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "snowball", :region "ap-southeast-2"},
    :ssl-common-name "snowball.ap-southeast-2.amazonaws.com",
    :endpoint "https://snowball.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "snowball", :region "cn-north-1"},
    :ssl-common-name "snowball.cn-north-1.amazonaws.com.cn",
    :endpoint "https://snowball.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "snowball", :region "sa-east-1"},
    :ssl-common-name "snowball.sa-east-1.amazonaws.com",
    :endpoint "https://snowball.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "snowball", :region "ap-southeast-1"},
    :ssl-common-name "snowball.ap-southeast-1.amazonaws.com",
    :endpoint "https://snowball.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "snowball", :region "eu-west-3"},
    :ssl-common-name "snowball.eu-west-3.amazonaws.com",
    :endpoint "https://snowball.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "snowball", :region "ca-central-1"},
    :ssl-common-name "snowball.ca-central-1.amazonaws.com",
    :endpoint "https://snowball.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "snowball", :region "eu-central-1"},
    :ssl-common-name "snowball.eu-central-1.amazonaws.com",
    :endpoint "https://snowball.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "snowball", :region "eu-west-2"},
    :ssl-common-name "snowball.eu-west-2.amazonaws.com",
    :endpoint "https://snowball.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "snowball", :region "us-gov-west-1"},
    :ssl-common-name "snowball.us-gov-west-1.amazonaws.com",
    :endpoint "https://snowball.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "snowball", :region "us-west-2"},
    :ssl-common-name "snowball.us-west-2.amazonaws.com",
    :endpoint "https://snowball.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "snowball", :region "us-east-1"},
    :ssl-common-name "snowball.us-east-1.amazonaws.com",
    :endpoint "https://snowball.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "snowball", :region "us-west-1"},
    :ssl-common-name "snowball.us-west-1.amazonaws.com",
    :endpoint "https://snowball.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "snowball", :region "ap-south-1"},
    :ssl-common-name "snowball.ap-south-1.amazonaws.com",
    :endpoint "https://snowball.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-shipping-option)

(clojure.core/declare ser-address)

(clojure.core/declare ser-list-limit)

(clojure.core/declare ser-snowball-type)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-job-type)

(clojure.core/declare ser-s-3-resource)

(clojure.core/declare ser-ec-2-ami-resource)

(clojure.core/declare ser-cluster-id)

(clojure.core/declare ser-address-id)

(clojure.core/declare ser-snowball-capacity)

(clojure.core/declare ser-event-trigger-definition)

(clojure.core/declare ser-sns-topic-arn)

(clojure.core/declare ser-kms-key-arn)

(clojure.core/declare ser-job-state-list)

(clojure.core/declare ser-ami-id)

(clojure.core/declare ser-key-range)

(clojure.core/declare ser-string)

(clojure.core/declare ser-job-resource)

(clojure.core/declare ser-lambda-resource)

(clojure.core/declare ser-job-state)

(clojure.core/declare ser-s-3-resource-list)

(clojure.core/declare ser-notification)

(clojure.core/declare ser-ec-2-ami-resource-list)

(clojure.core/declare ser-lambda-resource-list)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-event-trigger-definition-list)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-shipping-option [input] #:http.request.field{:value (clojure.core/get {"SECOND_DAY" "SECOND_DAY", :second-day "SECOND_DAY", "NEXT_DAY" "NEXT_DAY", :next-day "NEXT_DAY", "EXPRESS" "EXPRESS", :express "EXPRESS", "STANDARD" "STANDARD", :standard "STANDARD"} input), :shape "ShippingOption"})

(clojure.core/defn- ser-address [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Address", :type "structure"} (clojure.core/contains? input :street-2) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :street-2)) #:http.request.field{:name "Street2", :shape "String"})) (clojure.core/contains? input :country) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :country)) #:http.request.field{:name "Country", :shape "String"})) (clojure.core/contains? input :landmark) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :landmark)) #:http.request.field{:name "Landmark", :shape "String"})) (clojure.core/contains? input :street-1) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :street-1)) #:http.request.field{:name "Street1", :shape "String"})) (clojure.core/contains? input :postal-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :postal-code)) #:http.request.field{:name "PostalCode", :shape "String"})) (clojure.core/contains? input :address-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :address-id)) #:http.request.field{:name "AddressId", :shape "AddressId"})) (clojure.core/contains? input :prefecture-or-district) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :prefecture-or-district)) #:http.request.field{:name "PrefectureOrDistrict", :shape "String"})) (clojure.core/contains? input :street-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :street-3)) #:http.request.field{:name "Street3", :shape "String"})) (clojure.core/contains? input :company) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :company)) #:http.request.field{:name "Company", :shape "String"})) (clojure.core/contains? input :state-or-province) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :state-or-province)) #:http.request.field{:name "StateOrProvince", :shape "String"})) (clojure.core/contains? input :city) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :city)) #:http.request.field{:name "City", :shape "String"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :is-restricted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-restricted)) #:http.request.field{:name "IsRestricted", :shape "Boolean"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "String"}))))

(clojure.core/defn- ser-list-limit [input] #:http.request.field{:value input, :shape "ListLimit"})

(clojure.core/defn- ser-snowball-type [input] #:http.request.field{:value (clojure.core/get {"STANDARD" "STANDARD", :standard "STANDARD", "EDGE" "EDGE", :edge "EDGE", "EDGE_C" "EDGE_C", :edge-c "EDGE_C", "EDGE_CG" "EDGE_CG", :edge-cg "EDGE_CG"} input), :shape "SnowballType"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleARN"})

(clojure.core/defn- ser-job-type [input] #:http.request.field{:value (clojure.core/get {"IMPORT" "IMPORT", :import "IMPORT", "EXPORT" "EXPORT", :export "EXPORT", "LOCAL_USE" "LOCAL_USE", :local-use "LOCAL_USE"} input), :shape "JobType"})

(clojure.core/defn- ser-s-3-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Resource", :type "structure"} (clojure.core/contains? input :bucket-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :bucket-arn)) #:http.request.field{:name "BucketArn", :shape "ResourceARN"})) (clojure.core/contains? input :key-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-range (input :key-range)) #:http.request.field{:name "KeyRange", :shape "KeyRange"}))))

(clojure.core/defn- ser-ec-2-ami-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ami-id (:ami-id input)) #:http.request.field{:name "AmiId", :shape "AmiId"})], :shape "Ec2AmiResource", :type "structure"} (clojure.core/contains? input :snowball-ami-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :snowball-ami-id)) #:http.request.field{:name "SnowballAmiId", :shape "String"}))))

(clojure.core/defn- ser-cluster-id [input] #:http.request.field{:value input, :shape "ClusterId"})

(clojure.core/defn- ser-address-id [input] #:http.request.field{:value input, :shape "AddressId"})

(clojure.core/defn- ser-snowball-capacity [input] #:http.request.field{:value (clojure.core/get {"NoPreference" "NoPreference", "T42" "T42", :t-100 "T100", "T80" "T80", :t-80 "T80", :t-42 "T42", "T50" "T50", :no-preference "NoPreference", :t-50 "T50", "T100" "T100"} input), :shape "SnowballCapacity"})

(clojure.core/defn- ser-event-trigger-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EventTriggerDefinition", :type "structure"} (clojure.core/contains? input :event-resource-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :event-resource-arn)) #:http.request.field{:name "EventResourceARN", :shape "ResourceARN"}))))

(clojure.core/defn- ser-sns-topic-arn [input] #:http.request.field{:value input, :shape "SnsTopicARN"})

(clojure.core/defn- ser-kms-key-arn [input] #:http.request.field{:value input, :shape "KmsKeyARN"})

(clojure.core/defn- ser-job-state-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-job-state coll) #:http.request.field{:shape "JobState"}))) input), :shape "JobStateList", :type "list"})

(clojure.core/defn- ser-ami-id [input] #:http.request.field{:value input, :shape "AmiId"})

(clojure.core/defn- ser-key-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyRange", :type "structure"} (clojure.core/contains? input :begin-marker) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :begin-marker)) #:http.request.field{:name "BeginMarker", :shape "String"})) (clojure.core/contains? input :end-marker) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :end-marker)) #:http.request.field{:name "EndMarker", :shape "String"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-job-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobResource", :type "structure"} (clojure.core/contains? input :s-3-resources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-resource-list (input :s-3-resources)) #:http.request.field{:name "S3Resources", :shape "S3ResourceList"})) (clojure.core/contains? input :lambda-resources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-resource-list (input :lambda-resources)) #:http.request.field{:name "LambdaResources", :shape "LambdaResourceList"})) (clojure.core/contains? input :ec-2-ami-resources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-ami-resource-list (input :ec-2-ami-resources)) #:http.request.field{:name "Ec2AmiResources", :shape "Ec2AmiResourceList"}))))

(clojure.core/defn- ser-lambda-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LambdaResource", :type "structure"} (clojure.core/contains? input :lambda-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :lambda-arn)) #:http.request.field{:name "LambdaArn", :shape "ResourceARN"})) (clojure.core/contains? input :event-triggers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-trigger-definition-list (input :event-triggers)) #:http.request.field{:name "EventTriggers", :shape "EventTriggerDefinitionList"}))))

(clojure.core/defn- ser-job-state [input] #:http.request.field{:value (clojure.core/get {:with-customer "WithCustomer", "New" "New", :listing "Listing", "Cancelled" "Cancelled", "WithCustomer" "WithCustomer", :in-progress "InProgress", "WithAWS" "WithAWS", :in-transit-to-aws "InTransitToAWS", :new "New", :with-aws "WithAWS", :pending "Pending", :in-transit-to-customer "InTransitToCustomer", :preparing-shipment "PreparingShipment", :preparing-appliance "PreparingAppliance", :with-aws-sorting-facility "WithAWSSortingFacility", "InTransitToCustomer" "InTransitToCustomer", :cancelled "Cancelled", "InProgress" "InProgress", "Listing" "Listing", "PreparingShipment" "PreparingShipment", "Complete" "Complete", "InTransitToAWS" "InTransitToAWS", :complete "Complete", "PreparingAppliance" "PreparingAppliance", "Pending" "Pending", "WithAWSSortingFacility" "WithAWSSortingFacility"} input), :shape "JobState"})

(clojure.core/defn- ser-s-3-resource-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-s-3-resource coll) #:http.request.field{:shape "S3Resource"}))) input), :shape "S3ResourceList", :type "list"})

(clojure.core/defn- ser-notification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Notification", :type "structure"} (clojure.core/contains? input :sns-topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-topic-arn (input :sns-topic-arn)) #:http.request.field{:name "SnsTopicARN", :shape "SnsTopicARN"})) (clojure.core/contains? input :job-states-to-notify) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-state-list (input :job-states-to-notify)) #:http.request.field{:name "JobStatesToNotify", :shape "JobStateList"})) (clojure.core/contains? input :notify-all) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :notify-all)) #:http.request.field{:name "NotifyAll", :shape "Boolean"}))))

(clojure.core/defn- ser-ec-2-ami-resource-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ec-2-ami-resource coll) #:http.request.field{:shape "Ec2AmiResource"}))) input), :shape "Ec2AmiResourceList", :type "list"})

(clojure.core/defn- ser-lambda-resource-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-resource coll) #:http.request.field{:shape "LambdaResource"}))) input), :shape "LambdaResourceList", :type "list"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-event-trigger-definition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-trigger-definition coll) #:http.request.field{:shape "EventTriggerDefinition"}))) input), :shape "EventTriggerDefinitionList", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-list-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-addresses-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-describe-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address-id (input :address-id)) #:http.request.field{:name "AddressId", :shape "AddressId"})]}))

(clojure.core/defn- req-get-snowball-usage-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-compatible-images-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-cancel-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-describe-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]}))

(clojure.core/defn- req-cancel-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]}))

(clojure.core/defn- req-update-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-resource (input :resources)) #:http.request.field{:name "Resources", :shape "JobResource"})) (clojure.core/contains? input :address-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :address-id)) #:http.request.field{:name "AddressId", :shape "AddressId"})) (clojure.core/contains? input :shipping-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shipping-option (input :shipping-option)) #:http.request.field{:name "ShippingOption", :shape "ShippingOption"})) (clojure.core/contains? input :notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"})) (clojure.core/contains? input :forwarding-address-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :forwarding-address-id)) #:http.request.field{:name "ForwardingAddressId", :shape "AddressId"}))))

(clojure.core/defn- req-create-job-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :shipping-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shipping-option (input :shipping-option)) #:http.request.field{:name "ShippingOption", :shape "ShippingOption"})) (clojure.core/contains? input :snowball-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snowball-type (input :snowball-type)) #:http.request.field{:name "SnowballType", :shape "SnowballType"})) (clojure.core/contains? input :snowball-capacity-preference) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snowball-capacity (input :snowball-capacity-preference)) #:http.request.field{:name "SnowballCapacityPreference", :shape "SnowballCapacity"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :job-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-type (input :job-type)) #:http.request.field{:name "JobType", :shape "JobType"})) (clojure.core/contains? input :cluster-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})) (clojure.core/contains? input :address-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :address-id)) #:http.request.field{:name "AddressId", :shape "AddressId"})) (clojure.core/contains? input :forwarding-address-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :forwarding-address-id)) #:http.request.field{:name "ForwardingAddressId", :shape "AddressId"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KmsKeyARN", :shape "KmsKeyARN"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-resource (input :resources)) #:http.request.field{:name "Resources", :shape "JobResource"})) (clojure.core/contains? input :notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}))))

(clojure.core/defn- req-create-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :address)) #:http.request.field{:name "Address", :shape "Address"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-type (input :job-type)) #:http.request.field{:name "JobType", :shape "JobType"}) (clojure.core/into (ser-job-resource (input :resources)) #:http.request.field{:name "Resources", :shape "JobResource"}) (clojure.core/into (ser-address-id (input :address-id)) #:http.request.field{:name "AddressId", :shape "AddressId"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"}) (clojure.core/into (ser-shipping-option (input :shipping-option)) #:http.request.field{:name "ShippingOption", :shape "ShippingOption"})]} (clojure.core/contains? input :snowball-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snowball-type (input :snowball-type)) #:http.request.field{:name "SnowballType", :shape "SnowballType"})) (clojure.core/contains? input :forwarding-address-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :forwarding-address-id)) #:http.request.field{:name "ForwardingAddressId", :shape "AddressId"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KmsKeyARN", :shape "KmsKeyARN"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}))))

(clojure.core/defn- req-get-job-manifest-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-get-job-unlock-code-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-update-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :shipping-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shipping-option (input :shipping-option)) #:http.request.field{:name "ShippingOption", :shape "ShippingOption"})) (clojure.core/contains? input :snowball-capacity-preference) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snowball-capacity (input :snowball-capacity-preference)) #:http.request.field{:name "SnowballCapacityPreference", :shape "SnowballCapacity"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :address-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :address-id)) #:http.request.field{:name "AddressId", :shape "AddressId"})) (clojure.core/contains? input :forwarding-address-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-id (input :forwarding-address-id)) #:http.request.field{:name "ForwardingAddressId", :shape "AddressId"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-resource (input :resources)) #:http.request.field{:name "Resources", :shape "JobResource"})) (clojure.core/contains? input :notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}))))

(clojure.core/defn- req-list-cluster-jobs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/declare deser-shipping-option)

(clojure.core/declare deser-address)

(clojure.core/declare deser-snowball-type)

(clojure.core/declare deser-data-transfer)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-job-type)

(clojure.core/declare deser-s-3-resource)

(clojure.core/declare deser-ec-2-ami-resource)

(clojure.core/declare deser-shipping-details)

(clojure.core/declare deser-compatible-image-list)

(clojure.core/declare deser-cluster-id)

(clojure.core/declare deser-address-id)

(clojure.core/declare deser-snowball-capacity)

(clojure.core/declare deser-shipment)

(clojure.core/declare deser-event-trigger-definition)

(clojure.core/declare deser-address-list)

(clojure.core/declare deser-job-list-entry-list)

(clojure.core/declare deser-cluster-state)

(clojure.core/declare deser-sns-topic-arn)

(clojure.core/declare deser-kms-key-arn)

(clojure.core/declare deser-job-state-list)

(clojure.core/declare deser-ami-id)

(clojure.core/declare deser-cluster-list-entry)

(clojure.core/declare deser-job-metadata)

(clojure.core/declare deser-key-range)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-job-resource)

(clojure.core/declare deser-cluster-list-entry-list)

(clojure.core/declare deser-compatible-image)

(clojure.core/declare deser-lambda-resource)

(clojure.core/declare deser-cluster-metadata)

(clojure.core/declare deser-job-state)

(clojure.core/declare deser-s-3-resource-list)

(clojure.core/declare deser-long)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-job-metadata-list)

(clojure.core/declare deser-notification)

(clojure.core/declare deser-ec-2-ami-resource-list)

(clojure.core/declare deser-lambda-resource-list)

(clojure.core/declare deser-job-logs)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-event-trigger-definition-list)

(clojure.core/declare deser-job-list-entry)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-shipping-option [input] (clojure.core/get {"SECOND_DAY" :second-day, "NEXT_DAY" :next-day, "EXPRESS" :express, "STANDARD" :standard} input))

(clojure.core/defn- deser-address [input] (clojure.core/cond-> {} (clojure.core/contains? input "Street2") (clojure.core/assoc :street-2 (deser-string (input "Street2"))) (clojure.core/contains? input "Country") (clojure.core/assoc :country (deser-string (input "Country"))) (clojure.core/contains? input "Landmark") (clojure.core/assoc :landmark (deser-string (input "Landmark"))) (clojure.core/contains? input "Street1") (clojure.core/assoc :street-1 (deser-string (input "Street1"))) (clojure.core/contains? input "PostalCode") (clojure.core/assoc :postal-code (deser-string (input "PostalCode"))) (clojure.core/contains? input "AddressId") (clojure.core/assoc :address-id (deser-address-id (input "AddressId"))) (clojure.core/contains? input "PrefectureOrDistrict") (clojure.core/assoc :prefecture-or-district (deser-string (input "PrefectureOrDistrict"))) (clojure.core/contains? input "Street3") (clojure.core/assoc :street-3 (deser-string (input "Street3"))) (clojure.core/contains? input "Company") (clojure.core/assoc :company (deser-string (input "Company"))) (clojure.core/contains? input "StateOrProvince") (clojure.core/assoc :state-or-province (deser-string (input "StateOrProvince"))) (clojure.core/contains? input "City") (clojure.core/assoc :city (deser-string (input "City"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "IsRestricted") (clojure.core/assoc :is-restricted (deser-boolean (input "IsRestricted"))) (clojure.core/contains? input "PhoneNumber") (clojure.core/assoc :phone-number (deser-string (input "PhoneNumber")))))

(clojure.core/defn- deser-snowball-type [input] (clojure.core/get {"STANDARD" :standard, "EDGE" :edge, "EDGE_C" :edge-c, "EDGE_CG" :edge-cg} input))

(clojure.core/defn- deser-data-transfer [input] (clojure.core/cond-> {} (clojure.core/contains? input "BytesTransferred") (clojure.core/assoc :bytes-transferred (deser-long (input "BytesTransferred"))) (clojure.core/contains? input "ObjectsTransferred") (clojure.core/assoc :objects-transferred (deser-long (input "ObjectsTransferred"))) (clojure.core/contains? input "TotalBytes") (clojure.core/assoc :total-bytes (deser-long (input "TotalBytes"))) (clojure.core/contains? input "TotalObjects") (clojure.core/assoc :total-objects (deser-long (input "TotalObjects")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-job-type [input] (clojure.core/get {"IMPORT" :import, "EXPORT" :export, "LOCAL_USE" :local-use} input))

(clojure.core/defn- deser-s-3-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "BucketArn") (clojure.core/assoc :bucket-arn (deser-resource-arn (input "BucketArn"))) (clojure.core/contains? input "KeyRange") (clojure.core/assoc :key-range (deser-key-range (input "KeyRange")))))

(clojure.core/defn- deser-ec-2-ami-resource [input] (clojure.core/cond-> {:ami-id (deser-ami-id (input "AmiId"))} (clojure.core/contains? input "SnowballAmiId") (clojure.core/assoc :snowball-ami-id (deser-string (input "SnowballAmiId")))))

(clojure.core/defn- deser-shipping-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "ShippingOption") (clojure.core/assoc :shipping-option (deser-shipping-option (input "ShippingOption"))) (clojure.core/contains? input "InboundShipment") (clojure.core/assoc :inbound-shipment (deser-shipment (input "InboundShipment"))) (clojure.core/contains? input "OutboundShipment") (clojure.core/assoc :outbound-shipment (deser-shipment (input "OutboundShipment")))))

(clojure.core/defn- deser-compatible-image-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compatible-image coll))) input))

(clojure.core/defn- deser-cluster-id [input] input)

(clojure.core/defn- deser-address-id [input] input)

(clojure.core/defn- deser-snowball-capacity [input] (clojure.core/get {"T50" :t-50, "T80" :t-80, "T100" :t-100, "T42" :t-42, "NoPreference" :no-preference} input))

(clojure.core/defn- deser-shipment [input] (clojure.core/cond-> {} (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "TrackingNumber") (clojure.core/assoc :tracking-number (deser-string (input "TrackingNumber")))))

(clojure.core/defn- deser-event-trigger-definition [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventResourceARN") (clojure.core/assoc :event-resource-arn (deser-resource-arn (input "EventResourceARN")))))

(clojure.core/defn- deser-address-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-address coll))) input))

(clojure.core/defn- deser-job-list-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-list-entry coll))) input))

(clojure.core/defn- deser-cluster-state [input] (clojure.core/get {"AwaitingQuorum" :awaiting-quorum, "Pending" :pending, "InUse" :in-use, "Complete" :complete, "Cancelled" :cancelled} input))

(clojure.core/defn- deser-sns-topic-arn [input] input)

(clojure.core/defn- deser-kms-key-arn [input] input)

(clojure.core/defn- deser-job-state-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-state coll))) input))

(clojure.core/defn- deser-ami-id [input] input)

(clojure.core/defn- deser-cluster-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-string (input "ClusterId"))) (clojure.core/contains? input "ClusterState") (clojure.core/assoc :cluster-state (deser-cluster-state (input "ClusterState"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-timestamp (input "CreationDate"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description")))))

(clojure.core/defn- deser-job-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "SnowballType") (clojure.core/assoc :snowball-type (deser-snowball-type (input "SnowballType"))) (clojure.core/contains? input "SnowballCapacityPreference") (clojure.core/assoc :snowball-capacity-preference (deser-snowball-capacity (input "SnowballCapacityPreference"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN"))) (clojure.core/contains? input "JobLogInfo") (clojure.core/assoc :job-log-info (deser-job-logs (input "JobLogInfo"))) (clojure.core/contains? input "JobType") (clojure.core/assoc :job-type (deser-job-type (input "JobType"))) (clojure.core/contains? input "ShippingDetails") (clojure.core/assoc :shipping-details (deser-shipping-details (input "ShippingDetails"))) (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-string (input "ClusterId"))) (clojure.core/contains? input "AddressId") (clojure.core/assoc :address-id (deser-address-id (input "AddressId"))) (clojure.core/contains? input "ForwardingAddressId") (clojure.core/assoc :forwarding-address-id (deser-address-id (input "ForwardingAddressId"))) (clojure.core/contains? input "KmsKeyARN") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (input "KmsKeyARN"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "DataTransferProgress") (clojure.core/assoc :data-transfer-progress (deser-data-transfer (input "DataTransferProgress"))) (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-job-resource (input "Resources"))) (clojure.core/contains? input "JobState") (clojure.core/assoc :job-state (deser-job-state (input "JobState"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-timestamp (input "CreationDate"))) (clojure.core/contains? input "Notification") (clojure.core/assoc :notification (deser-notification (input "Notification"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-string (input "JobId")))))

(clojure.core/defn- deser-key-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "BeginMarker") (clojure.core/assoc :begin-marker (deser-string (input "BeginMarker"))) (clojure.core/contains? input "EndMarker") (clojure.core/assoc :end-marker (deser-string (input "EndMarker")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-job-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "S3Resources") (clojure.core/assoc :s-3-resources (deser-s-3-resource-list (input "S3Resources"))) (clojure.core/contains? input "LambdaResources") (clojure.core/assoc :lambda-resources (deser-lambda-resource-list (input "LambdaResources"))) (clojure.core/contains? input "Ec2AmiResources") (clojure.core/assoc :ec-2-ami-resources (deser-ec-2-ami-resource-list (input "Ec2AmiResources")))))

(clojure.core/defn- deser-cluster-list-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cluster-list-entry coll))) input))

(clojure.core/defn- deser-compatible-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "AmiId") (clojure.core/assoc :ami-id (deser-string (input "AmiId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name")))))

(clojure.core/defn- deser-lambda-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "LambdaArn") (clojure.core/assoc :lambda-arn (deser-resource-arn (input "LambdaArn"))) (clojure.core/contains? input "EventTriggers") (clojure.core/assoc :event-triggers (deser-event-trigger-definition-list (input "EventTriggers")))))

(clojure.core/defn- deser-cluster-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "ShippingOption") (clojure.core/assoc :shipping-option (deser-shipping-option (input "ShippingOption"))) (clojure.core/contains? input "SnowballType") (clojure.core/assoc :snowball-type (deser-snowball-type (input "SnowballType"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN"))) (clojure.core/contains? input "JobType") (clojure.core/assoc :job-type (deser-job-type (input "JobType"))) (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-string (input "ClusterId"))) (clojure.core/contains? input "AddressId") (clojure.core/assoc :address-id (deser-address-id (input "AddressId"))) (clojure.core/contains? input "ForwardingAddressId") (clojure.core/assoc :forwarding-address-id (deser-address-id (input "ForwardingAddressId"))) (clojure.core/contains? input "ClusterState") (clojure.core/assoc :cluster-state (deser-cluster-state (input "ClusterState"))) (clojure.core/contains? input "KmsKeyARN") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (input "KmsKeyARN"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-job-resource (input "Resources"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-timestamp (input "CreationDate"))) (clojure.core/contains? input "Notification") (clojure.core/assoc :notification (deser-notification (input "Notification")))))

(clojure.core/defn- deser-job-state [input] (clojure.core/get {"New" :new, "Cancelled" :cancelled, "WithCustomer" :with-customer, "WithAWS" :with-aws, "InTransitToCustomer" :in-transit-to-customer, "InProgress" :in-progress, "Listing" :listing, "PreparingShipment" :preparing-shipment, "Complete" :complete, "InTransitToAWS" :in-transit-to-aws, "PreparingAppliance" :preparing-appliance, "Pending" :pending, "WithAWSSortingFacility" :with-aws-sorting-facility} input))

(clojure.core/defn- deser-s-3-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-s-3-resource coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-job-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-metadata coll))) input))

(clojure.core/defn- deser-notification [input] (clojure.core/cond-> {} (clojure.core/contains? input "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-sns-topic-arn (input "SnsTopicARN"))) (clojure.core/contains? input "JobStatesToNotify") (clojure.core/assoc :job-states-to-notify (deser-job-state-list (input "JobStatesToNotify"))) (clojure.core/contains? input "NotifyAll") (clojure.core/assoc :notify-all (deser-boolean (input "NotifyAll")))))

(clojure.core/defn- deser-ec-2-ami-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ec-2-ami-resource coll))) input))

(clojure.core/defn- deser-lambda-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-resource coll))) input))

(clojure.core/defn- deser-job-logs [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobCompletionReportURI") (clojure.core/assoc :job-completion-report-uri (deser-string (input "JobCompletionReportURI"))) (clojure.core/contains? input "JobSuccessLogURI") (clojure.core/assoc :job-success-log-uri (deser-string (input "JobSuccessLogURI"))) (clojure.core/contains? input "JobFailureLogURI") (clojure.core/assoc :job-failure-log-uri (deser-string (input "JobFailureLogURI")))))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-event-trigger-definition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-trigger-definition coll))) input))

(clojure.core/defn- deser-job-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-string (input "JobId"))) (clojure.core/contains? input "JobState") (clojure.core/assoc :job-state (deser-job-state (input "JobState"))) (clojure.core/contains? input "IsMaster") (clojure.core/assoc :is-master (deser-boolean (input "IsMaster"))) (clojure.core/contains? input "JobType") (clojure.core/assoc :job-type (deser-job-type (input "JobType"))) (clojure.core/contains? input "SnowballType") (clojure.core/assoc :snowball-type (deser-snowball-type (input "SnowballType"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-timestamp (input "CreationDate"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- response-unsupported-address-exception ([input] (response-unsupported-address-exception nil input)) ([resultWrapper2040225 input] (clojure.core/let [rawinput2040224 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040226 {"Message" (rawinput2040224 "Message")}] (clojure.core/cond-> {} (letvar2040226 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040226 ["Message"])))))))

(clojure.core/defn- response-invalid-resource-exception ([input] (response-invalid-resource-exception nil input)) ([resultWrapper2040228 input] (clojure.core/let [rawinput2040227 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040229 {"Message" (rawinput2040227 "Message"), "ResourceType" (rawinput2040227 "ResourceType")}] (clojure.core/cond-> {} (letvar2040229 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040229 ["Message"]))) (letvar2040229 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar2040229 ["ResourceType"])))))))

(clojure.core/defn- response-get-job-manifest-result ([input] (response-get-job-manifest-result nil input)) ([resultWrapper2040231 input] (clojure.core/let [rawinput2040230 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040232 {"ManifestURI" (rawinput2040230 "ManifestURI")}] (clojure.core/cond-> {} (letvar2040232 "ManifestURI") (clojure.core/assoc :manifest-uri (deser-string (clojure.core/get-in letvar2040232 ["ManifestURI"])))))))

(clojure.core/defn- response-invalid-address-exception ([input] (response-invalid-address-exception nil input)) ([resultWrapper2040234 input] (clojure.core/let [rawinput2040233 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040235 {"Message" (rawinput2040233 "Message")}] (clojure.core/cond-> {} (letvar2040235 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040235 ["Message"])))))))

(clojure.core/defn- response-invalid-input-combination-exception ([input] (response-invalid-input-combination-exception nil input)) ([resultWrapper2040237 input] (clojure.core/let [rawinput2040236 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040238 {"Message" (rawinput2040236 "Message")}] (clojure.core/cond-> {} (letvar2040238 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040238 ["Message"])))))))

(clojure.core/defn- response-update-job-result ([input] (response-update-job-result nil input)) ([resultWrapper2040240 input] (clojure.core/let [rawinput2040239 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040241 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cancel-job-result ([input] (response-cancel-job-result nil input)) ([resultWrapper2040243 input] (clojure.core/let [rawinput2040242 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040244 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-ec-2-request-failed-exception ([input] (response-ec-2-request-failed-exception nil input)) ([resultWrapper2040246 input] (clojure.core/let [rawinput2040245 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040247 {"Message" (rawinput2040245 "Message")}] (clojure.core/cond-> {} (letvar2040247 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040247 ["Message"])))))))

(clojure.core/defn- response-list-clusters-result ([input] (response-list-clusters-result nil input)) ([resultWrapper2040249 input] (clojure.core/let [rawinput2040248 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040250 {"ClusterListEntries" (rawinput2040248 "ClusterListEntries"), "NextToken" (rawinput2040248 "NextToken")}] (clojure.core/cond-> {} (letvar2040250 "ClusterListEntries") (clojure.core/assoc :cluster-list-entries (deser-cluster-list-entry-list (clojure.core/get-in letvar2040250 ["ClusterListEntries"]))) (letvar2040250 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar2040250 ["NextToken"])))))))

(clojure.core/defn- response-describe-cluster-result ([input] (response-describe-cluster-result nil input)) ([resultWrapper2040252 input] (clojure.core/let [rawinput2040251 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040253 {"ClusterMetadata" (rawinput2040251 "ClusterMetadata")}] (clojure.core/cond-> {} (letvar2040253 "ClusterMetadata") (clojure.core/assoc :cluster-metadata (deser-cluster-metadata (clojure.core/get-in letvar2040253 ["ClusterMetadata"])))))))

(clojure.core/defn- response-describe-job-result ([input] (response-describe-job-result nil input)) ([resultWrapper2040255 input] (clojure.core/let [rawinput2040254 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040256 {"JobMetadata" (rawinput2040254 "JobMetadata"), "SubJobMetadata" (rawinput2040254 "SubJobMetadata")}] (clojure.core/cond-> {} (letvar2040256 "JobMetadata") (clojure.core/assoc :job-metadata (deser-job-metadata (clojure.core/get-in letvar2040256 ["JobMetadata"]))) (letvar2040256 "SubJobMetadata") (clojure.core/assoc :sub-job-metadata (deser-job-metadata-list (clojure.core/get-in letvar2040256 ["SubJobMetadata"])))))))

(clojure.core/defn- response-cluster-limit-exceeded-exception ([input] (response-cluster-limit-exceeded-exception nil input)) ([resultWrapper2040258 input] (clojure.core/let [rawinput2040257 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040259 {"Message" (rawinput2040257 "Message")}] (clojure.core/cond-> {} (letvar2040259 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040259 ["Message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper2040261 input] (clojure.core/let [rawinput2040260 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040262 {"Message" (rawinput2040260 "Message")}] (clojure.core/cond-> {} (letvar2040262 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040262 ["Message"])))))))

(clojure.core/defn- response-create-job-result ([input] (response-create-job-result nil input)) ([resultWrapper2040264 input] (clojure.core/let [rawinput2040263 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040265 {"JobId" (rawinput2040263 "JobId")}] (clojure.core/cond-> {} (letvar2040265 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar2040265 ["JobId"])))))))

(clojure.core/defn- response-list-cluster-jobs-result ([input] (response-list-cluster-jobs-result nil input)) ([resultWrapper2040267 input] (clojure.core/let [rawinput2040266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040268 {"JobListEntries" (rawinput2040266 "JobListEntries"), "NextToken" (rawinput2040266 "NextToken")}] (clojure.core/cond-> {} (letvar2040268 "JobListEntries") (clojure.core/assoc :job-list-entries (deser-job-list-entry-list (clojure.core/get-in letvar2040268 ["JobListEntries"]))) (letvar2040268 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar2040268 ["NextToken"])))))))

(clojure.core/defn- response-describe-addresses-result ([input] (response-describe-addresses-result nil input)) ([resultWrapper2040270 input] (clojure.core/let [rawinput2040269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040271 {"Addresses" (rawinput2040269 "Addresses"), "NextToken" (rawinput2040269 "NextToken")}] (clojure.core/cond-> {} (letvar2040271 "Addresses") (clojure.core/assoc :addresses (deser-address-list (clojure.core/get-in letvar2040271 ["Addresses"]))) (letvar2040271 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar2040271 ["NextToken"])))))))

(clojure.core/defn- response-invalid-job-state-exception ([input] (response-invalid-job-state-exception nil input)) ([resultWrapper2040273 input] (clojure.core/let [rawinput2040272 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040274 {"Message" (rawinput2040272 "Message")}] (clojure.core/cond-> {} (letvar2040274 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040274 ["Message"])))))))

(clojure.core/defn- response-create-cluster-result ([input] (response-create-cluster-result nil input)) ([resultWrapper2040276 input] (clojure.core/let [rawinput2040275 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040277 {"ClusterId" (rawinput2040275 "ClusterId")}] (clojure.core/cond-> {} (letvar2040277 "ClusterId") (clojure.core/assoc :cluster-id (deser-cluster-id (clojure.core/get-in letvar2040277 ["ClusterId"])))))))

(clojure.core/defn- response-list-jobs-result ([input] (response-list-jobs-result nil input)) ([resultWrapper2040279 input] (clojure.core/let [rawinput2040278 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040280 {"JobListEntries" (rawinput2040278 "JobListEntries"), "NextToken" (rawinput2040278 "NextToken")}] (clojure.core/cond-> {} (letvar2040280 "JobListEntries") (clojure.core/assoc :job-list-entries (deser-job-list-entry-list (clojure.core/get-in letvar2040280 ["JobListEntries"]))) (letvar2040280 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar2040280 ["NextToken"])))))))

(clojure.core/defn- response-kms-request-failed-exception ([input] (response-kms-request-failed-exception nil input)) ([resultWrapper2040282 input] (clojure.core/let [rawinput2040281 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040283 {"Message" (rawinput2040281 "Message")}] (clojure.core/cond-> {} (letvar2040283 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2040283 ["Message"])))))))

(clojure.core/defn- response-update-cluster-result ([input] (response-update-cluster-result nil input)) ([resultWrapper2040285 input] (clojure.core/let [rawinput2040284 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040286 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-address-result ([input] (response-create-address-result nil input)) ([resultWrapper2040288 input] (clojure.core/let [rawinput2040287 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040289 {"AddressId" (rawinput2040287 "AddressId")}] (clojure.core/cond-> {} (letvar2040289 "AddressId") (clojure.core/assoc :address-id (deser-string (clojure.core/get-in letvar2040289 ["AddressId"])))))))

(clojure.core/defn- response-list-compatible-images-result ([input] (response-list-compatible-images-result nil input)) ([resultWrapper2040291 input] (clojure.core/let [rawinput2040290 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040292 {"CompatibleImages" (rawinput2040290 "CompatibleImages"), "NextToken" (rawinput2040290 "NextToken")}] (clojure.core/cond-> {} (letvar2040292 "CompatibleImages") (clojure.core/assoc :compatible-images (deser-compatible-image-list (clojure.core/get-in letvar2040292 ["CompatibleImages"]))) (letvar2040292 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar2040292 ["NextToken"])))))))

(clojure.core/defn- response-cancel-cluster-result ([input] (response-cancel-cluster-result nil input)) ([resultWrapper2040294 input] (clojure.core/let [rawinput2040293 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040295 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-job-unlock-code-result ([input] (response-get-job-unlock-code-result nil input)) ([resultWrapper2040297 input] (clojure.core/let [rawinput2040296 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040298 {"UnlockCode" (rawinput2040296 "UnlockCode")}] (clojure.core/cond-> {} (letvar2040298 "UnlockCode") (clojure.core/assoc :unlock-code (deser-string (clojure.core/get-in letvar2040298 ["UnlockCode"])))))))

(clojure.core/defn- response-describe-address-result ([input] (response-describe-address-result nil input)) ([resultWrapper2040300 input] (clojure.core/let [rawinput2040299 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040301 {"Address" (rawinput2040299 "Address")}] (clojure.core/cond-> {} (letvar2040301 "Address") (clojure.core/assoc :address (deser-address (clojure.core/get-in letvar2040301 ["Address"])))))))

(clojure.core/defn- response-get-snowball-usage-result ([input] (response-get-snowball-usage-result nil input)) ([resultWrapper2040303 input] (clojure.core/let [rawinput2040302 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2040304 {"SnowballLimit" (rawinput2040302 "SnowballLimit"), "SnowballsInUse" (rawinput2040302 "SnowballsInUse")}] (clojure.core/cond-> {} (letvar2040304 "SnowballLimit") (clojure.core/assoc :snowball-limit (deser-integer (clojure.core/get-in letvar2040304 ["SnowballLimit"]))) (letvar2040304 "SnowballsInUse") (clojure.core/assoc :snowballs-in-use (deser-integer (clojure.core/get-in letvar2040304 ["SnowballsInUse"])))))))

(clojure.spec.alpha/def :portkey.aws.snowball.list-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.snowball/list-limit))
(clojure.spec.alpha/def :portkey.aws.snowball.list-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.list-clusters-request/max-results :portkey.aws.snowball.list-clusters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball/shipping-option #{:express :next-day "EXPRESS" "STANDARD" :standard :second-day "SECOND_DAY" "NEXT_DAY"})

(clojure.spec.alpha/def :portkey.aws.snowball.address/street-2 (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/country (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/landmark (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/street-1 (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/postal-code (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/prefecture-or-district (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/street-3 (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/company (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/state-or-province (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/city (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/name (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.address/is-restricted (clojure.spec.alpha/and :portkey.aws.snowball/boolean))
(clojure.spec.alpha/def :portkey.aws.snowball.address/phone-number (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/address (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.address/street-2 :portkey.aws.snowball.address/country :portkey.aws.snowball.address/landmark :portkey.aws.snowball.address/street-1 :portkey.aws.snowball.address/postal-code :portkey.aws.snowball/address-id :portkey.aws.snowball.address/prefecture-or-district :portkey.aws.snowball.address/street-3 :portkey.aws.snowball.address/company :portkey.aws.snowball.address/state-or-province :portkey.aws.snowball.address/city :portkey.aws.snowball.address/name :portkey.aws.snowball.address/is-restricted :portkey.aws.snowball.address/phone-number]))

(clojure.spec.alpha/def :portkey.aws.snowball.unsupported-address-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/unsupported-address-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.unsupported-address-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball.describe-addresses-request/max-results (clojure.spec.alpha/and :portkey.aws.snowball/list-limit))
(clojure.spec.alpha/def :portkey.aws.snowball.describe-addresses-request/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/describe-addresses-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.describe-addresses-request/max-results :portkey.aws.snowball.describe-addresses-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball/list-limit (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.snowball.invalid-resource-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.invalid-resource-exception/resource-type (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/invalid-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.invalid-resource-exception/message :portkey.aws.snowball.invalid-resource-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.snowball/snowball-type #{:edge "EDGE_C" :edge-c "STANDARD" :edge-cg "EDGE" :standard "EDGE_CG"})

(clojure.spec.alpha/def :portkey.aws.snowball.get-job-manifest-result/manifest-uri (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/get-job-manifest-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.get-job-manifest-result/manifest-uri]))

(clojure.spec.alpha/def :portkey.aws.snowball.data-transfer/bytes-transferred (clojure.spec.alpha/and :portkey.aws.snowball/long))
(clojure.spec.alpha/def :portkey.aws.snowball.data-transfer/objects-transferred (clojure.spec.alpha/and :portkey.aws.snowball/long))
(clojure.spec.alpha/def :portkey.aws.snowball.data-transfer/total-bytes (clojure.spec.alpha/and :portkey.aws.snowball/long))
(clojure.spec.alpha/def :portkey.aws.snowball.data-transfer/total-objects (clojure.spec.alpha/and :portkey.aws.snowball/long))
(clojure.spec.alpha/def :portkey.aws.snowball/data-transfer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.data-transfer/bytes-transferred :portkey.aws.snowball.data-transfer/objects-transferred :portkey.aws.snowball.data-transfer/total-bytes :portkey.aws.snowball.data-transfer/total-objects]))

(clojure.spec.alpha/def :portkey.aws.snowball.invalid-address-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/invalid-address-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.invalid-address-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball.invalid-input-combination-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/invalid-input-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.invalid-input-combination-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws.*:iam::[0-9]{12}:role/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball/update-job-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/job-type #{"EXPORT" "LOCAL_USE" :export :local-use "IMPORT" :import})

(clojure.spec.alpha/def :portkey.aws.snowball.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.snowball/list-limit))
(clojure.spec.alpha/def :portkey.aws.snowball.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.list-jobs-request/max-results :portkey.aws.snowball.list-jobs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball.s-3-resource/bucket-arn (clojure.spec.alpha/and :portkey.aws.snowball/resource-arn))
(clojure.spec.alpha/def :portkey.aws.snowball/s-3-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.s-3-resource/bucket-arn :portkey.aws.snowball/key-range]))

(clojure.spec.alpha/def :portkey.aws.snowball/describe-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball.ec-2-ami-resource/snowball-ami-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/ec-2-ami-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/ami-id] :opt-un [:portkey.aws.snowball.ec-2-ami-resource/snowball-ami-id]))

(clojure.spec.alpha/def :portkey.aws.snowball/describe-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/address-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/get-snowball-usage-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/cancel-job-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball.ec-2-request-failed-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/ec-2-request-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.ec-2-request-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball.list-compatible-images-request/max-results (clojure.spec.alpha/and :portkey.aws.snowball/list-limit))
(clojure.spec.alpha/def :portkey.aws.snowball.list-compatible-images-request/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-compatible-images-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.list-compatible-images-request/max-results :portkey.aws.snowball.list-compatible-images-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball.shipping-details/inbound-shipment (clojure.spec.alpha/and :portkey.aws.snowball/shipment))
(clojure.spec.alpha/def :portkey.aws.snowball.shipping-details/outbound-shipment (clojure.spec.alpha/and :portkey.aws.snowball/shipment))
(clojure.spec.alpha/def :portkey.aws.snowball/shipping-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/shipping-option :portkey.aws.snowball.shipping-details/inbound-shipment :portkey.aws.snowball.shipping-details/outbound-shipment]))

(clojure.spec.alpha/def :portkey.aws.snowball/compatible-image-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/compatible-image))

(clojure.spec.alpha/def :portkey.aws.snowball.list-clusters-result/cluster-list-entries (clojure.spec.alpha/and :portkey.aws.snowball/cluster-list-entry-list))
(clojure.spec.alpha/def :portkey.aws.snowball.list-clusters-result/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-clusters-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.list-clusters-result/cluster-list-entries :portkey.aws.snowball.list-clusters-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball/cluster-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 39 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 39)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball/address-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 40 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 40)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball/cancel-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/describe-cluster-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/cluster-metadata]))

(clojure.spec.alpha/def :portkey.aws.snowball/describe-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/cluster-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball.describe-job-result/sub-job-metadata (clojure.spec.alpha/and :portkey.aws.snowball/job-metadata-list))
(clojure.spec.alpha/def :portkey.aws.snowball/describe-job-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/job-metadata :portkey.aws.snowball.describe-job-result/sub-job-metadata]))

(clojure.spec.alpha/def :portkey.aws.snowball/snowball-capacity #{"NoPreference" "T42" :t-100 "T80" :t-80 :t-42 "T50" :no-preference :t-50 "T100"})

(clojure.spec.alpha/def :portkey.aws.snowball.cluster-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/cluster-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.cluster-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball.shipment/status (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.shipment/tracking-number (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/shipment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.shipment/status :portkey.aws.snowball.shipment/tracking-number]))

(clojure.spec.alpha/def :portkey.aws.snowball.event-trigger-definition/event-resource-arn (clojure.spec.alpha/and :portkey.aws.snowball/resource-arn))
(clojure.spec.alpha/def :portkey.aws.snowball/event-trigger-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.event-trigger-definition/event-resource-arn]))

(clojure.spec.alpha/def :portkey.aws.snowball/address-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/address))

(clojure.spec.alpha/def :portkey.aws.snowball.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball/create-job-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/job-id]))

(clojure.spec.alpha/def :portkey.aws.snowball.list-cluster-jobs-result/job-list-entries (clojure.spec.alpha/and :portkey.aws.snowball/job-list-entry-list))
(clojure.spec.alpha/def :portkey.aws.snowball.list-cluster-jobs-result/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-cluster-jobs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.list-cluster-jobs-result/job-list-entries :portkey.aws.snowball.list-cluster-jobs-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball/job-list-entry-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/job-list-entry))

(clojure.spec.alpha/def :portkey.aws.snowball/cluster-state #{"InUse" "Cancelled" :pending :in-use :cancelled :awaiting-quorum "Complete" :complete "AwaitingQuorum" "Pending"})

(clojure.spec.alpha/def :portkey.aws.snowball/cancel-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/cluster-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws.*:sns:.*:[0-9]{12}:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball.describe-addresses-result/addresses (clojure.spec.alpha/and :portkey.aws.snowball/address-list))
(clojure.spec.alpha/def :portkey.aws.snowball.describe-addresses-result/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/describe-addresses-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.describe-addresses-result/addresses :portkey.aws.snowball.describe-addresses-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball.update-cluster-request/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.update-cluster-request/resources (clojure.spec.alpha/and :portkey.aws.snowball/job-resource))
(clojure.spec.alpha/def :portkey.aws.snowball.update-cluster-request/forwarding-address-id (clojure.spec.alpha/and :portkey.aws.snowball/address-id))
(clojure.spec.alpha/def :portkey.aws.snowball/update-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/cluster-id] :opt-un [:portkey.aws.snowball/role-arn :portkey.aws.snowball.update-cluster-request/description :portkey.aws.snowball.update-cluster-request/resources :portkey.aws.snowball/address-id :portkey.aws.snowball/shipping-option :portkey.aws.snowball/notification :portkey.aws.snowball.update-cluster-request/forwarding-address-id]))

(clojure.spec.alpha/def :portkey.aws.snowball.create-job-request/snowball-capacity-preference (clojure.spec.alpha/and :portkey.aws.snowball/snowball-capacity))
(clojure.spec.alpha/def :portkey.aws.snowball.create-job-request/forwarding-address-id (clojure.spec.alpha/and :portkey.aws.snowball/address-id))
(clojure.spec.alpha/def :portkey.aws.snowball.create-job-request/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.create-job-request/resources (clojure.spec.alpha/and :portkey.aws.snowball/job-resource))
(clojure.spec.alpha/def :portkey.aws.snowball/create-job-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/shipping-option :portkey.aws.snowball/snowball-type :portkey.aws.snowball.create-job-request/snowball-capacity-preference :portkey.aws.snowball/role-arn :portkey.aws.snowball/job-type :portkey.aws.snowball/cluster-id :portkey.aws.snowball/address-id :portkey.aws.snowball.create-job-request/forwarding-address-id :portkey.aws.snowball/kms-key-arn :portkey.aws.snowball.create-job-request/description :portkey.aws.snowball.create-job-request/resources :portkey.aws.snowball/notification]))

(clojure.spec.alpha/def :portkey.aws.snowball/kms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws.*:kms:.*:[0-9]{12}:key/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball/job-state-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/job-state))

(clojure.spec.alpha/def :portkey.aws.snowball/ami-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 12 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 21)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(ami-[0-9a-f]{8})|(ami-[0-9a-f]{17})" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball.cluster-list-entry/cluster-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.cluster-list-entry/creation-date (clojure.spec.alpha/and :portkey.aws.snowball/timestamp))
(clojure.spec.alpha/def :portkey.aws.snowball.cluster-list-entry/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/cluster-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.cluster-list-entry/cluster-id :portkey.aws.snowball/cluster-state :portkey.aws.snowball.cluster-list-entry/creation-date :portkey.aws.snowball.cluster-list-entry/description]))

(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/snowball-capacity-preference (clojure.spec.alpha/and :portkey.aws.snowball/snowball-capacity))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/job-log-info (clojure.spec.alpha/and :portkey.aws.snowball/job-logs))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/cluster-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/forwarding-address-id (clojure.spec.alpha/and :portkey.aws.snowball/address-id))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/data-transfer-progress (clojure.spec.alpha/and :portkey.aws.snowball/data-transfer))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/resources (clojure.spec.alpha/and :portkey.aws.snowball/job-resource))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.snowball/timestamp))
(clojure.spec.alpha/def :portkey.aws.snowball.job-metadata/job-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/job-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/snowball-type :portkey.aws.snowball.job-metadata/snowball-capacity-preference :portkey.aws.snowball/role-arn :portkey.aws.snowball.job-metadata/job-log-info :portkey.aws.snowball/job-type :portkey.aws.snowball/shipping-details :portkey.aws.snowball.job-metadata/cluster-id :portkey.aws.snowball/address-id :portkey.aws.snowball.job-metadata/forwarding-address-id :portkey.aws.snowball/kms-key-arn :portkey.aws.snowball.job-metadata/description :portkey.aws.snowball.job-metadata/data-transfer-progress :portkey.aws.snowball.job-metadata/resources :portkey.aws.snowball/job-state :portkey.aws.snowball.job-metadata/creation-date :portkey.aws.snowball/notification :portkey.aws.snowball.job-metadata/job-id]))

(clojure.spec.alpha/def :portkey.aws.snowball.key-range/begin-marker (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.key-range/end-marker (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/key-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.key-range/begin-marker :portkey.aws.snowball.key-range/end-marker]))

(clojure.spec.alpha/def :portkey.aws.snowball.invalid-job-state-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/invalid-job-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.invalid-job-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.snowball/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.snowball.job-resource/s-3-resources (clojure.spec.alpha/and :portkey.aws.snowball/s-3-resource-list))
(clojure.spec.alpha/def :portkey.aws.snowball.job-resource/lambda-resources (clojure.spec.alpha/and :portkey.aws.snowball/lambda-resource-list))
(clojure.spec.alpha/def :portkey.aws.snowball.job-resource/ec-2-ami-resources (clojure.spec.alpha/and :portkey.aws.snowball/ec-2-ami-resource-list))
(clojure.spec.alpha/def :portkey.aws.snowball/job-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.job-resource/s-3-resources :portkey.aws.snowball.job-resource/lambda-resources :portkey.aws.snowball.job-resource/ec-2-ami-resources]))

(clojure.spec.alpha/def :portkey.aws.snowball/create-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/cluster-list-entry-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/cluster-list-entry))

(clojure.spec.alpha/def :portkey.aws.snowball.create-cluster-request/forwarding-address-id (clojure.spec.alpha/and :portkey.aws.snowball/address-id))
(clojure.spec.alpha/def :portkey.aws.snowball.create-cluster-request/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.create-cluster-request/resources (clojure.spec.alpha/and :portkey.aws.snowball/job-resource))
(clojure.spec.alpha/def :portkey.aws.snowball/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/job-type :portkey.aws.snowball.create-cluster-request/resources :portkey.aws.snowball/address-id :portkey.aws.snowball/role-arn :portkey.aws.snowball/shipping-option] :opt-un [:portkey.aws.snowball/snowball-type :portkey.aws.snowball.create-cluster-request/forwarding-address-id :portkey.aws.snowball/kms-key-arn :portkey.aws.snowball.create-cluster-request/description :portkey.aws.snowball/notification]))

(clojure.spec.alpha/def :portkey.aws.snowball/get-job-manifest-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball.compatible-image/ami-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.compatible-image/name (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/compatible-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.compatible-image/ami-id :portkey.aws.snowball.compatible-image/name]))

(clojure.spec.alpha/def :portkey.aws.snowball/create-cluster-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/cluster-id]))

(clojure.spec.alpha/def :portkey.aws.snowball.lambda-resource/lambda-arn (clojure.spec.alpha/and :portkey.aws.snowball/resource-arn))
(clojure.spec.alpha/def :portkey.aws.snowball.lambda-resource/event-triggers (clojure.spec.alpha/and :portkey.aws.snowball/event-trigger-definition-list))
(clojure.spec.alpha/def :portkey.aws.snowball/lambda-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.lambda-resource/lambda-arn :portkey.aws.snowball.lambda-resource/event-triggers]))

(clojure.spec.alpha/def :portkey.aws.snowball.cluster-metadata/cluster-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.cluster-metadata/forwarding-address-id (clojure.spec.alpha/and :portkey.aws.snowball/address-id))
(clojure.spec.alpha/def :portkey.aws.snowball.cluster-metadata/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.cluster-metadata/resources (clojure.spec.alpha/and :portkey.aws.snowball/job-resource))
(clojure.spec.alpha/def :portkey.aws.snowball.cluster-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.snowball/timestamp))
(clojure.spec.alpha/def :portkey.aws.snowball/cluster-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/shipping-option :portkey.aws.snowball/snowball-type :portkey.aws.snowball/role-arn :portkey.aws.snowball/job-type :portkey.aws.snowball.cluster-metadata/cluster-id :portkey.aws.snowball/address-id :portkey.aws.snowball.cluster-metadata/forwarding-address-id :portkey.aws.snowball/cluster-state :portkey.aws.snowball/kms-key-arn :portkey.aws.snowball.cluster-metadata/description :portkey.aws.snowball.cluster-metadata/resources :portkey.aws.snowball.cluster-metadata/creation-date :portkey.aws.snowball/notification]))

(clojure.spec.alpha/def :portkey.aws.snowball/get-job-unlock-code-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/job-state #{:with-customer "New" :listing "Cancelled" "WithCustomer" :in-progress "WithAWS" :in-transit-to-aws :new :with-aws :pending :in-transit-to-customer :preparing-shipment :preparing-appliance :with-aws-sorting-facility "InTransitToCustomer" :cancelled "InProgress" "Listing" "PreparingShipment" "Complete" "InTransitToAWS" :complete "PreparingAppliance" "Pending" "WithAWSSortingFacility"})

(clojure.spec.alpha/def :portkey.aws.snowball.list-jobs-result/job-list-entries (clojure.spec.alpha/and :portkey.aws.snowball/job-list-entry-list))
(clojure.spec.alpha/def :portkey.aws.snowball.list-jobs-result/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-jobs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.list-jobs-result/job-list-entries :portkey.aws.snowball.list-jobs-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball/s-3-resource-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/s-3-resource))

(clojure.spec.alpha/def :portkey.aws.snowball/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.snowball/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.snowball/job-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/job-metadata))

(clojure.spec.alpha/def :portkey.aws.snowball.kms-request-failed-exception/message (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/kms-request-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.kms-request-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.snowball/update-cluster-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball.update-job-request/snowball-capacity-preference (clojure.spec.alpha/and :portkey.aws.snowball/snowball-capacity))
(clojure.spec.alpha/def :portkey.aws.snowball.update-job-request/forwarding-address-id (clojure.spec.alpha/and :portkey.aws.snowball/address-id))
(clojure.spec.alpha/def :portkey.aws.snowball.update-job-request/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.update-job-request/resources (clojure.spec.alpha/and :portkey.aws.snowball/job-resource))
(clojure.spec.alpha/def :portkey.aws.snowball/update-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/job-id] :opt-un [:portkey.aws.snowball/shipping-option :portkey.aws.snowball.update-job-request/snowball-capacity-preference :portkey.aws.snowball/role-arn :portkey.aws.snowball/address-id :portkey.aws.snowball.update-job-request/forwarding-address-id :portkey.aws.snowball.update-job-request/description :portkey.aws.snowball.update-job-request/resources :portkey.aws.snowball/notification]))

(clojure.spec.alpha/def :portkey.aws.snowball.notification/job-states-to-notify (clojure.spec.alpha/and :portkey.aws.snowball/job-state-list))
(clojure.spec.alpha/def :portkey.aws.snowball.notification/notify-all (clojure.spec.alpha/and :portkey.aws.snowball/boolean))
(clojure.spec.alpha/def :portkey.aws.snowball/notification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/sns-topic-arn :portkey.aws.snowball.notification/job-states-to-notify :portkey.aws.snowball.notification/notify-all]))

(clojure.spec.alpha/def :portkey.aws.snowball/ec-2-ami-resource-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/ec-2-ami-resource))

(clojure.spec.alpha/def :portkey.aws.snowball.create-address-result/address-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/create-address-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.create-address-result/address-id]))

(clojure.spec.alpha/def :portkey.aws.snowball/lambda-resource-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/lambda-resource))

(clojure.spec.alpha/def :portkey.aws.snowball.list-compatible-images-result/compatible-images (clojure.spec.alpha/and :portkey.aws.snowball/compatible-image-list))
(clojure.spec.alpha/def :portkey.aws.snowball.list-compatible-images-result/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-compatible-images-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.list-compatible-images-result/compatible-images :portkey.aws.snowball.list-compatible-images-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball.job-logs/job-completion-report-uri (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.job-logs/job-success-log-uri (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.job-logs/job-failure-log-uri (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/job-logs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.job-logs/job-completion-report-uri :portkey.aws.snowball.job-logs/job-success-log-uri :portkey.aws.snowball.job-logs/job-failure-log-uri]))

(clojure.spec.alpha/def :portkey.aws.snowball.list-cluster-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.snowball/list-limit))
(clojure.spec.alpha/def :portkey.aws.snowball.list-cluster-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/list-cluster-jobs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/cluster-id] :opt-un [:portkey.aws.snowball.list-cluster-jobs-request/max-results :portkey.aws.snowball.list-cluster-jobs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.snowball/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.snowball/cancel-cluster-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball.get-job-unlock-code-result/unlock-code (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/get-job-unlock-code-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.get-job-unlock-code-result/unlock-code]))

(clojure.spec.alpha/def :portkey.aws.snowball/event-trigger-definition-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/event-trigger-definition))

(clojure.spec.alpha/def :portkey.aws.snowball.job-list-entry/job-id (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball.job-list-entry/is-master (clojure.spec.alpha/and :portkey.aws.snowball/boolean))
(clojure.spec.alpha/def :portkey.aws.snowball.job-list-entry/creation-date (clojure.spec.alpha/and :portkey.aws.snowball/timestamp))
(clojure.spec.alpha/def :portkey.aws.snowball.job-list-entry/description (clojure.spec.alpha/and :portkey.aws.snowball/string))
(clojure.spec.alpha/def :portkey.aws.snowball/job-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.job-list-entry/job-id :portkey.aws.snowball/job-state :portkey.aws.snowball.job-list-entry/is-master :portkey.aws.snowball/job-type :portkey.aws.snowball/snowball-type :portkey.aws.snowball.job-list-entry/creation-date :portkey.aws.snowball.job-list-entry/description]))

(clojure.spec.alpha/def :portkey.aws.snowball/describe-address-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/address]))

(clojure.spec.alpha/def :portkey.aws.snowball.get-snowball-usage-result/snowball-limit (clojure.spec.alpha/and :portkey.aws.snowball/integer))
(clojure.spec.alpha/def :portkey.aws.snowball.get-snowball-usage-result/snowballs-in-use (clojure.spec.alpha/and :portkey.aws.snowball/integer))
(clojure.spec.alpha/def :portkey.aws.snowball/get-snowball-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball.get-snowball-usage-result/snowball-limit :portkey.aws.snowball.get-snowball-usage-result/snowballs-in-use]))

(clojure.spec.alpha/def :portkey.aws.snowball/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.snowball/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 39 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 39)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__1410940__auto__))))

(clojure.core/defn list-cluster-jobs "Returns an array of JobListEntry objects of the specified length. Each\nJobListEntry object is for a job in the specified cluster and contains a job's\nstate, a job's ID, and other information." ([list-cluster-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-cluster-jobs-request list-cluster-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/list-cluster-jobs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-cluster-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListClusterJobs", :http.request.configuration/output-deser-fn response-list-cluster-jobs-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-cluster-jobs :args (clojure.spec.alpha/tuple :portkey.aws.snowball/list-cluster-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-cluster-jobs-result))

(clojure.core/defn create-cluster "Creates an empty cluster. Each cluster supports five nodes. You use the\nCreateJob action separately to create the jobs for each of these nodes. The\ncluster does not ship until these five node jobs have been created." ([create-cluster-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/create-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCluster", :http.request.configuration/output-deser-fn response-create-cluster-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/create-cluster-result))

(clojure.core/defn list-compatible-images "This action returns a list of the different Amazon EC2 Amazon Machine Images\n(AMIs) that are owned by your AWS account that would be supported for use on\nEDGE, EDGE_C, and EDGE_CG devices. For more information on compatible AMIs, see\nUsing Amazon EC2 Compute Instances\n(http://docs.aws.amazon.com/snowball/latest/developer-guide/using-ec2.html) in\nthe AWS Snowball Developer Guide." ([] (list-compatible-images {})) ([list-compatible-images-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-compatible-images-request list-compatible-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/list-compatible-images-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-compatible-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCompatibleImages", :http.request.configuration/output-deser-fn response-list-compatible-images-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef list-compatible-images :args (clojure.spec.alpha/? :portkey.aws.snowball/list-compatible-images-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-compatible-images-result))

(clojure.core/defn get-snowball-usage "Returns information about the Snowball service limit for your account, and also\nthe number of Snowballs your account has in use.\n The default service limit for the number of Snowballs that you can have at one\ntime is 1. If you want to increase your service limit, contact AWS Support." ([] (get-snowball-usage {})) ([get-snowball-usage-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-snowball-usage-request get-snowball-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/get-snowball-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/get-snowball-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSnowballUsage", :http.request.configuration/output-deser-fn response-get-snowball-usage-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-snowball-usage :args (clojure.spec.alpha/? :portkey.aws.snowball/get-snowball-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/get-snowball-usage-result))

(clojure.core/defn create-address "Creates an address for a Snowball to be shipped to. In most regions, addresses\nare validated at the time of creation. The address you provide must be located\nwithin the serviceable area of your region. If the address is invalid or\nunsupported, then an exception is thrown." ([create-address-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-address-request create-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/create-address-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/create-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAddress", :http.request.configuration/output-deser-fn response-create-address-result, :http.request.spec/error-spec {"InvalidAddressException" :portkey.aws.snowball/invalid-address-exception, "UnsupportedAddressException" :portkey.aws.snowball/unsupported-address-exception}})))))
(clojure.spec.alpha/fdef create-address :args (clojure.spec.alpha/tuple :portkey.aws.snowball/create-address-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/create-address-result))

(clojure.core/defn describe-job "Returns information about a specific job including shipping information, job\nstatus, and other important metadata." ([describe-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-job-request describe-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/describe-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeJob", :http.request.configuration/output-deser-fn response-describe-job-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.snowball/describe-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-job-result))

(clojure.core/defn cancel-cluster "Cancels a cluster job. You can only cancel a cluster job while it's in the\nAwaitingQuorum status. You'll have at least an hour after creating a cluster job\nto cancel it." ([cancel-cluster-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-cancel-cluster-request cancel-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/cancel-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/cancel-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelCluster", :http.request.configuration/output-deser-fn response-cancel-cluster-result, :http.request.spec/error-spec {"KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef cancel-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/cancel-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/cancel-cluster-result))

(clojure.core/defn list-clusters "Returns an array of ClusterListEntry objects of the specified length. Each\nClusterListEntry object contains a cluster's state, a cluster's ID, and other\nimportant status information." ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/list-clusters-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListClusters", :http.request.configuration/output-deser-fn response-list-clusters-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.snowball/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-clusters-result))

(clojure.core/defn describe-cluster "Returns information about a specific cluster including shipping information,\ncluster status, and other important metadata." ([describe-cluster-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-cluster-request describe-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/describe-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCluster", :http.request.configuration/output-deser-fn response-describe-cluster-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef describe-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/describe-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-cluster-result))

(clojure.core/defn describe-addresses "Returns a specified number of ADDRESS objects. Calling this API in one of the US\nregions will return addresses from the list of all addresses associated with\nthis account in all US regions." ([] (describe-addresses {})) ([describe-addresses-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-addresses-request describe-addresses-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/describe-addresses-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-addresses-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAddresses", :http.request.configuration/output-deser-fn response-describe-addresses-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-addresses :args (clojure.spec.alpha/? :portkey.aws.snowball/describe-addresses-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-addresses-result))

(clojure.core/defn get-job-manifest "Returns a link to an Amazon S3 presigned URL for the manifest file associated\nwith the specified JobId value. You can access the manifest file for up to 60\nminutes after this request has been made. To access the manifest file after 60\nminutes have passed, you'll have to make another call to the GetJobManifest\naction.\n The manifest is an encrypted file that you can download after your job enters\nthe WithCustomer status. The manifest is decrypted by using the UnlockCode code\nvalue, when you pass both values to the Snowball through the Snowball client\nwhen the client is started for the first time.\n As a best practice, we recommend that you don't save a copy of an UnlockCode\nvalue in the same location as the manifest file for that job. Saving these\nseparately helps prevent unauthorized parties from gaining access to the\nSnowball associated with that job.\n The credentials of a given job, including its manifest file and unlock code,\nexpire 90 days after the job is created." ([get-job-manifest-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-job-manifest-request get-job-manifest-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/get-job-manifest-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/get-job-manifest-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJobManifest", :http.request.configuration/output-deser-fn response-get-job-manifest-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception}})))))
(clojure.spec.alpha/fdef get-job-manifest :args (clojure.spec.alpha/tuple :portkey.aws.snowball/get-job-manifest-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/get-job-manifest-result))

(clojure.core/defn create-job "Creates a job to import or export data between Amazon S3 and your on-premises\ndata center. Your AWS account must have the right trust policies and permissions\nin place to create a job for Snowball. If you're creating a job for a node in a\ncluster, you only need to provide the clusterId value; the other job attributes\nare inherited from the cluster." ([] (create-job {})) ([create-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-job-request create-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/create-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/create-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateJob", :http.request.configuration/output-deser-fn response-create-job-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "ClusterLimitExceededException" :portkey.aws.snowball/cluster-limit-exceeded-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/? :portkey.aws.snowball/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/create-job-result))

(clojure.core/defn update-cluster "While a cluster's ClusterState value is in the AwaitingQuorum state, you can\nupdate some of the information associated with a cluster. Once the cluster\nchanges to a different job state, usually 60 minutes after the cluster being\ncreated, this action is no longer available." ([update-cluster-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-cluster-request update-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/update-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/update-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCluster", :http.request.configuration/output-deser-fn response-update-cluster-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef update-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/update-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/update-cluster-result))

(clojure.core/defn update-job "While a job's JobState value is New, you can update some of the information\nassociated with a job. Once the job changes to a different job state, usually\nwithin 60 minutes of the job being created, this action is no longer available." ([update-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-job-request update-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/update-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/update-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateJob", :http.request.configuration/output-deser-fn response-update-job-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "ClusterLimitExceededException" :portkey.aws.snowball/cluster-limit-exceeded-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.snowball/update-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/update-job-result))

(clojure.core/defn get-job-unlock-code "Returns the UnlockCode code value for the specified job. A particular UnlockCode\nvalue can be accessed for up to 90 days after the associated job has been\ncreated.\n The UnlockCode value is a 29-character code with 25 alphanumeric characters and\n4 hyphens. This code is used to decrypt the manifest file when it is passed\nalong with the manifest to the Snowball through the Snowball client when the\nclient is started for the first time.\n As a best practice, we recommend that you don't save a copy of the UnlockCode\nin the same location as the manifest file for that job. Saving these separately\nhelps prevent unauthorized parties from gaining access to the Snowball\nassociated with that job." ([get-job-unlock-code-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-job-unlock-code-request get-job-unlock-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/get-job-unlock-code-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/get-job-unlock-code-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJobUnlockCode", :http.request.configuration/output-deser-fn response-get-job-unlock-code-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception}})))))
(clojure.spec.alpha/fdef get-job-unlock-code :args (clojure.spec.alpha/tuple :portkey.aws.snowball/get-job-unlock-code-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/get-job-unlock-code-result))

(clojure.core/defn describe-address "Takes an AddressId and returns specific details about that address in the form\nof an Address object." ([describe-address-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-address-request describe-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/describe-address-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAddress", :http.request.configuration/output-deser-fn response-describe-address-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef describe-address :args (clojure.spec.alpha/tuple :portkey.aws.snowball/describe-address-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-address-result))

(clojure.core/defn list-jobs "Returns an array of JobListEntry objects of the specified length. Each\nJobListEntry object contains a job's state, a job's ID, and a value that\nindicates whether the job is a job part, in the case of export jobs. Calling\nthis API action in one of the US regions will return jobs from the list of all\njobs associated with this account in all US regions." ([] (list-jobs {})) ([list-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/list-jobs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.snowball/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-jobs-result))

(clojure.core/defn cancel-job "Cancels the specified job. You can only cancel a job before its JobState value\nchanges to PreparingAppliance. Requesting the ListJobs or DescribeJob action\nreturns a job's JobState as part of the response element data returned." ([cancel-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-cancel-job-request cancel-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.configuration/target-prefix "AWSIESnowballJobManagementService", :http.request.spec/output-spec :portkey.aws.snowball/cancel-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/cancel-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelJob", :http.request.configuration/output-deser-fn response-cancel-job-result, :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.snowball/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/cancel-job-result))
