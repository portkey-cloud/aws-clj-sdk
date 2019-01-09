(ns portkey.aws.snowball (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
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

(clojure.core/defn- ser-snowball-type [input] #:http.request.field{:value (clojure.core/get {"STANDARD" "STANDARD", :standard "STANDARD", "EDGE" "EDGE", :edge "EDGE"} input), :shape "SnowballType"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleARN"})

(clojure.core/defn- ser-job-type [input] #:http.request.field{:value (clojure.core/get {"IMPORT" "IMPORT", :import "IMPORT", "EXPORT" "EXPORT", :export "EXPORT", "LOCAL_USE" "LOCAL_USE", :local-use "LOCAL_USE"} input), :shape "JobType"})

(clojure.core/defn- ser-s-3-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Resource", :type "structure"} (clojure.core/contains? input :bucket-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :bucket-arn)) #:http.request.field{:name "BucketArn", :shape "ResourceARN"})) (clojure.core/contains? input :key-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-range (input :key-range)) #:http.request.field{:name "KeyRange", :shape "KeyRange"}))))

(clojure.core/defn- ser-ec-2-ami-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ami-id (:ami-id input)) #:http.request.field{:name "AmiId", :shape "AmiId"})], :shape "Ec2AmiResource", :type "structure"} (clojure.core/contains? input :snowball-ami-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :snowball-ami-id)) #:http.request.field{:name "SnowballAmiId", :shape "String"}))))

(clojure.core/defn- ser-cluster-id [input] #:http.request.field{:value input, :shape "ClusterId"})

(clojure.core/defn- ser-address-id [input] #:http.request.field{:value input, :shape "AddressId"})

(clojure.core/defn- ser-snowball-capacity [input] #:http.request.field{:value (clojure.core/get {"T50" "T50", :t-50 "T50", "T80" "T80", :t-80 "T80", "T100" "T100", :t-100 "T100", "NoPreference" "NoPreference", :no-preference "NoPreference"} input), :shape "SnowballCapacity"})

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

(clojure.spec.alpha/def :portkey.aws.snowball/snowball-type #{:edge "STANDARD" "EDGE" :standard})

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

(clojure.spec.alpha/def :portkey.aws.snowball/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws.*:iam::[0-9]{12}:role/.*" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.snowball/cluster-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 39 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 39)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball/address-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 40 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 40)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"ADID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball/cancel-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball/describe-cluster-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/cluster-metadata]))

(clojure.spec.alpha/def :portkey.aws.snowball/describe-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.snowball/cluster-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.snowball.describe-job-result/sub-job-metadata (clojure.spec.alpha/and :portkey.aws.snowball/job-metadata-list))
(clojure.spec.alpha/def :portkey.aws.snowball/describe-job-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.snowball/job-metadata :portkey.aws.snowball.describe-job-result/sub-job-metadata]))

(clojure.spec.alpha/def :portkey.aws.snowball/snowball-capacity #{"NoPreference" :t-100 "T80" :t-80 "T50" :no-preference :t-50 "T100"})

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

(clojure.spec.alpha/def :portkey.aws.snowball/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws.*:sns:.*:[0-9]{12}:.*" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.snowball/kms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws.*:kms:.*:[0-9]{12}:key/.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.snowball/job-state-list (clojure.spec.alpha/coll-of :portkey.aws.snowball/job-state))

(clojure.spec.alpha/def :portkey.aws.snowball/ami-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 12 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 21)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"(ami-[0-9a-f]{8})|(ami-[0-9a-f]{17})" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.snowball/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

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

(clojure.spec.alpha/def :portkey.aws.snowball/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

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

(clojure.spec.alpha/def :portkey.aws.snowball/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 39 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 39)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27967__auto__))))

(clojure.core/defn list-cluster-jobs ([list-cluster-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-cluster-jobs-request list-cluster-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/list-cluster-jobs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-cluster-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListClusterJobs", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-cluster-jobs :args (clojure.spec.alpha/tuple :portkey.aws.snowball/list-cluster-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-cluster-jobs-result))

(clojure.core/defn create-cluster ([create-cluster-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/create-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCluster", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/create-cluster-result))

(clojure.core/defn list-compatible-images ([] (list-compatible-images {})) ([list-compatible-images-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-compatible-images-request list-compatible-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/list-compatible-images-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-compatible-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCompatibleImages", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef list-compatible-images :args (clojure.spec.alpha/? :portkey.aws.snowball/list-compatible-images-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-compatible-images-result))

(clojure.core/defn get-snowball-usage ([] (get-snowball-usage {})) ([get-snowball-usage-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-snowball-usage-request get-snowball-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/get-snowball-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/get-snowball-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSnowballUsage", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-snowball-usage :args (clojure.spec.alpha/? :portkey.aws.snowball/get-snowball-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/get-snowball-usage-result))

(clojure.core/defn create-address ([create-address-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-address-request create-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/create-address-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/create-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAddress", :http.request.spec/error-spec {"InvalidAddressException" :portkey.aws.snowball/invalid-address-exception, "UnsupportedAddressException" :portkey.aws.snowball/unsupported-address-exception}})))))
(clojure.spec.alpha/fdef create-address :args (clojure.spec.alpha/tuple :portkey.aws.snowball/create-address-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/create-address-result))

(clojure.core/defn describe-job ([describe-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-job-request describe-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/describe-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJob", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.snowball/describe-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-job-result))

(clojure.core/defn cancel-cluster ([cancel-cluster-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-cancel-cluster-request cancel-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/cancel-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/cancel-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelCluster", :http.request.spec/error-spec {"KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef cancel-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/cancel-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/cancel-cluster-result))

(clojure.core/defn list-clusters ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/list-clusters-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListClusters", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.snowball/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-clusters-result))

(clojure.core/defn describe-cluster ([describe-cluster-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-cluster-request describe-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/describe-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCluster", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef describe-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/describe-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-cluster-result))

(clojure.core/defn describe-addresses ([] (describe-addresses {})) ([describe-addresses-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-addresses-request describe-addresses-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/describe-addresses-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-addresses-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAddresses", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-addresses :args (clojure.spec.alpha/? :portkey.aws.snowball/describe-addresses-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-addresses-result))

(clojure.core/defn get-job-manifest ([get-job-manifest-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-job-manifest-request get-job-manifest-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/get-job-manifest-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/get-job-manifest-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobManifest", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception}})))))
(clojure.spec.alpha/fdef get-job-manifest :args (clojure.spec.alpha/tuple :portkey.aws.snowball/get-job-manifest-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/get-job-manifest-result))

(clojure.core/defn create-job ([] (create-job {})) ([create-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-job-request create-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/create-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/create-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateJob", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "ClusterLimitExceededException" :portkey.aws.snowball/cluster-limit-exceeded-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/? :portkey.aws.snowball/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/create-job-result))

(clojure.core/defn update-cluster ([update-cluster-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-cluster-request update-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/update-cluster-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/update-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCluster", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef update-cluster :args (clojure.spec.alpha/tuple :portkey.aws.snowball/update-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/update-cluster-result))

(clojure.core/defn update-job ([update-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-job-request update-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/update-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/update-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateJob", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception, "InvalidInputCombinationException" :portkey.aws.snowball/invalid-input-combination-exception, "ClusterLimitExceededException" :portkey.aws.snowball/cluster-limit-exceeded-exception, "Ec2RequestFailedException" :portkey.aws.snowball/ec-2-request-failed-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.snowball/update-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/update-job-result))

(clojure.core/defn get-job-unlock-code ([get-job-unlock-code-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-job-unlock-code-request get-job-unlock-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/get-job-unlock-code-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/get-job-unlock-code-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobUnlockCode", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception}})))))
(clojure.spec.alpha/fdef get-job-unlock-code :args (clojure.spec.alpha/tuple :portkey.aws.snowball/get-job-unlock-code-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/get-job-unlock-code-result))

(clojure.core/defn describe-address ([describe-address-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-address-request describe-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/describe-address-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/describe-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAddress", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception}})))))
(clojure.spec.alpha/fdef describe-address :args (clojure.spec.alpha/tuple :portkey.aws.snowball/describe-address-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/describe-address-result))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/list-jobs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/list-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobs", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.snowball/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.snowball/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/list-jobs-result))

(clojure.core/defn cancel-job ([cancel-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-cancel-job-request cancel-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.snowball/endpoints, :http.request.spec/output-spec :portkey.aws.snowball/cancel-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-30", :http.request.configuration/service-id "Snowball", :http.request.spec/input-spec :portkey.aws.snowball/cancel-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelJob", :http.request.spec/error-spec {"InvalidResourceException" :portkey.aws.snowball/invalid-resource-exception, "InvalidJobStateException" :portkey.aws.snowball/invalid-job-state-exception, "KMSRequestFailedException" :portkey.aws.snowball/kms-request-failed-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.snowball/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.snowball/cancel-job-result))
