(ns portkey.aws.cloudtrail.-2013-11-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cloudtrail", :region "ap-northeast-1"},
    :ssl-common-name "cloudtrail.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudtrail", :region "eu-west-1"},
    :ssl-common-name "cloudtrail.eu-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudtrail", :region "us-east-2"},
    :ssl-common-name "cloudtrail.us-east-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cloudtrail", :region "ap-southeast-2"},
    :ssl-common-name "cloudtrail.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "cloudtrail", :region "cn-north-1"},
    :ssl-common-name "cloudtrail.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cloudtrail.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudtrail", :region "sa-east-1"},
    :ssl-common-name "cloudtrail.sa-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cloudtrail", :region "ap-southeast-1"},
    :ssl-common-name "cloudtrail.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "cloudtrail", :region "cn-northwest-1"},
    :ssl-common-name "cloudtrail.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://cloudtrail.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cloudtrail", :region "ap-northeast-2"},
    :ssl-common-name "cloudtrail.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudtrail", :region "eu-west-3"},
    :ssl-common-name "cloudtrail.eu-west-3.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudtrail", :region "ca-central-1"},
    :ssl-common-name "cloudtrail.ca-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudtrail", :region "eu-central-1"},
    :ssl-common-name "cloudtrail.eu-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudtrail", :region "eu-west-2"},
    :ssl-common-name "cloudtrail.eu-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "cloudtrail", :region "us-gov-west-1"},
    :ssl-common-name "cloudtrail.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudtrail", :region "us-west-2"},
    :ssl-common-name "cloudtrail.us-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudtrail", :region "us-east-1"},
    :ssl-common-name "cloudtrail.us-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudtrail", :region "us-west-1"},
    :ssl-common-name "cloudtrail.us-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudtrail", :region "ap-south-1"},
    :ssl-common-name "cloudtrail.ap-south-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-lookup-attribute-key)

(clojure.core/declare ser-trail-name-list)

(clojure.core/declare ser-lookup-attribute)

(clojure.core/declare ser-event-selectors)

(clojure.core/declare ser-data-resource)

(clojure.core/declare ser-data-resources)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-date)

(clojure.core/declare ser-lookup-attributes-list)

(clojure.core/declare ser-read-write-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-event-selector)

(clojure.core/declare ser-tags-list)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-data-resource-values)

(clojure.core/declare ser-resource-id-list)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-lookup-attribute-key [input] #:http.request.field{:value (clojure.core/get {"Username" "Username", :event-name "EventName", :event-id "EventId", :username "Username", :resource-name "ResourceName", :event-source "EventSource", "EventName" "EventName", "ResourceName" "ResourceName", "ResourceType" "ResourceType", :resource-type "ResourceType", "EventId" "EventId", "EventSource" "EventSource"} input), :shape "LookupAttributeKey"})

(clojure.core/defn- ser-trail-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "TrailNameList", :type "list"})

(clojure.core/defn- ser-lookup-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lookup-attribute-key (:attribute-key input)) #:http.request.field{:name "AttributeKey", :shape "LookupAttributeKey"}) (clojure.core/into (ser-string (:attribute-value input)) #:http.request.field{:name "AttributeValue", :shape "String"})], :shape "LookupAttribute", :type "structure"}))

(clojure.core/defn- ser-event-selectors [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-selector coll) #:http.request.field{:shape "EventSelector"}))) input), :shape "EventSelectors", :type "list"})

(clojure.core/defn- ser-data-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataResource", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :type)) #:http.request.field{:name "Type", :shape "String"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-resource-values (input :values)) #:http.request.field{:name "Values", :shape "DataResourceValues"}))))

(clojure.core/defn- ser-data-resources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-data-resource coll) #:http.request.field{:shape "DataResource"}))) input), :shape "DataResources", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-lookup-attributes-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lookup-attribute coll) #:http.request.field{:shape "LookupAttribute"}))) input), :shape "LookupAttributesList", :type "list"})

(clojure.core/defn- ser-read-write-type [input] #:http.request.field{:value (clojure.core/get {"ReadOnly" "ReadOnly", :read-only "ReadOnly", "WriteOnly" "WriteOnly", :write-only "WriteOnly", "All" "All", :all "All"} input), :shape "ReadWriteType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-event-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EventSelector", :type "structure"} (clojure.core/contains? input :read-write-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-read-write-type (input :read-write-type)) #:http.request.field{:name "ReadWriteType", :shape "ReadWriteType"})) (clojure.core/contains? input :include-management-events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-management-events)) #:http.request.field{:name "IncludeManagementEvents", :shape "Boolean"})) (clojure.core/contains? input :data-resources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-resources (input :data-resources)) #:http.request.field{:name "DataResources", :shape "DataResources"}))))

(clojure.core/defn- ser-tags-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagsList", :type "list"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:key input)) #:http.request.field{:name "Key", :shape "String"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-data-resource-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "DataResourceValues", :type "list"})

(clojure.core/defn- ser-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ResourceIdList", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String"})]} (clojure.core/contains? input :enable-log-file-validation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-log-file-validation)) #:http.request.field{:name "EnableLogFileValidation", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-log-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "String"})) (clojure.core/contains? input :include-global-service-events) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-global-service-events)) #:http.request.field{:name "IncludeGlobalServiceEvents", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-role-arn)) #:http.request.field{:name "CloudWatchLogsRoleArn", :shape "String"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "String"})) (clojure.core/contains? input :sns-topic-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-name)) #:http.request.field{:name "SnsTopicName", :shape "String"})) (clojure.core/contains? input :is-multi-region-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-multi-region-trail)) #:http.request.field{:name "IsMultiRegionTrail", :shape "Boolean"}))))

(clojure.core/defn- req-stop-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-remove-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "String"})]} (clojure.core/contains? input :tags-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-list (input :tags-list)) #:http.request.field{:name "TagsList", :shape "TagsList"}))))

(clojure.core/defn- req-add-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "String"})]} (clojure.core/contains? input :tags-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-list (input :tags-list)) #:http.request.field{:name "TagsList", :shape "TagsList"}))))

(clojure.core/defn- req-list-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :start-time)) #:http.request.field{:name "StartTime", :shape "Date"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :end-time)) #:http.request.field{:name "EndTime", :shape "Date"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-start-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-lookup-events-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :lookup-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lookup-attributes-list (input :lookup-attributes)) #:http.request.field{:name "LookupAttributes", :shape "LookupAttributesList"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :start-time)) #:http.request.field{:name "StartTime", :shape "Date"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :end-time)) #:http.request.field{:name "EndTime", :shape "Date"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :enable-log-file-validation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-log-file-validation)) #:http.request.field{:name "EnableLogFileValidation", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-log-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "String"})) (clojure.core/contains? input :include-global-service-events) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-global-service-events)) #:http.request.field{:name "IncludeGlobalServiceEvents", :shape "Boolean"})) (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String"})) (clojure.core/contains? input :cloud-watch-logs-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-role-arn)) #:http.request.field{:name "CloudWatchLogsRoleArn", :shape "String"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "String"})) (clojure.core/contains? input :sns-topic-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-name)) #:http.request.field{:name "SnsTopicName", :shape "String"})) (clojure.core/contains? input :is-multi-region-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-multi-region-trail)) #:http.request.field{:name "IsMultiRegionTrail", :shape "Boolean"}))))

(clojure.core/defn- req-put-event-selectors-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :trail-name)) #:http.request.field{:name "TrailName", :shape "String"}) (clojure.core/into (ser-event-selectors (input :event-selectors)) #:http.request.field{:name "EventSelectors", :shape "EventSelectors"})]}))

(clojure.core/defn- req-get-event-selectors-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :trail-name)) #:http.request.field{:name "TrailName", :shape "String"})]}))

(clojure.core/defn- req-delete-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-describe-trails-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :trail-name-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trail-name-list (input :trail-name-list)) #:http.request.field{:name "trailNameList", :shape "TrailNameList"})) (clojure.core/contains? input :include-shadow-trails) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-shadow-trails)) #:http.request.field{:name "includeShadowTrails", :shape "Boolean"}))))

(clojure.core/defn- req-get-trail-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id-list (input :resource-id-list)) #:http.request.field{:name "ResourceIdList", :shape "ResourceIdList"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/time-logging-stopped (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-digest-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-cloud-watch-logs-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/stop-logging-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/time-logging-started (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/start-logging-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-error (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-cloud-watch-logs-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-attempt-succeeded (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-attempt-succeeded (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-attempt-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/is-logging (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-attempt-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-digest-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/time-logging-stopped :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-error :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-time :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-digest-delivery-error :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-cloud-watch-logs-delivery-time :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-time :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/stop-logging-time :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/time-logging-started :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/start-logging-time :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-error :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-cloud-watch-logs-delivery-error :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-attempt-succeeded :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-attempt-succeeded :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-delivery-attempt-time :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/is-logging :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-notification-attempt-time :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-response/latest-digest-delivery-time]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail-not-provided-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/start-logging-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-prefix-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/remove-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/lookup-attribute-key #{"Username" :event-name :event-id :username :resource-name :event-source "EventName" "ResourceName" "ResourceType" :resource-type "EventId" "EventSource"})

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/tags-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/update-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/name :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-key (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/lookup-attribute-key))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-value (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/lookup-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-key :portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/event-selectors (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/event-selector))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-tags-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01/resource-tag-list :portkey.aws.cloudtrail.-2013-11-01.list-tags-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/enable-log-file-validation (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/create-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.create-trail-request/name :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-bucket-name] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.create-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/trail))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-event-selectors-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/s-3-bucket-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-max-results-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.data-resource/type (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.data-resource/values (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/data-resource-values))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/data-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.data-resource/type :portkey.aws.cloudtrail.-2013-11-01.data-resource/values]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/insufficient-sns-topic-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/data-resources (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/data-resource))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.stop-logging-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/stop-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.stop-logging-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/stop-logging-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/maximum-number-of-trails-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-source (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/username (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/resources (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/cloud-trail-event (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.event/event-id :portkey.aws.cloudtrail.-2013-11-01.event/event-name :portkey.aws.cloudtrail.-2013-11-01.event/event-time :portkey.aws.cloudtrail.-2013-11-01.event/event-source :portkey.aws.cloudtrail.-2013-11-01.event/username :portkey.aws.cloudtrail.-2013-11-01.event/resources :portkey.aws.cloudtrail.-2013-11-01.event/cloud-trail-event]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/kms-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01/public-key-list :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/create-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/name :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-events-response/events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/events-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/lookup-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.lookup-events-response/events :portkey.aws.cloudtrail.-2013-11-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/lookup-attributes-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/lookup-attribute))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.remove-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/remove-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.remove-tags-request/resource-id] :opt-un [:portkey.aws.cloudtrail.-2013-11-01/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-sns-topic-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.add-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/add-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.add-tags-request/resource-id] :opt-un [:portkey.aws.cloudtrail.-2013-11-01/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-log-group-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-request/start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-request/end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.list-public-keys-request/start-time :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-request/end-time :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/byte-buffer clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/delete-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/read-write-type #{"WriteOnly" :all :write-only "ReadOnly" :read-only "All"})

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-lookup-attributes-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.start-logging-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/start-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.start-logging-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.resource-tag/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/resource-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.resource-tag/resource-id :portkey.aws.cloudtrail.-2013-11-01/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-events-request/lookup-attributes (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/lookup-attributes-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-events-request/start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-events-request/end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/lookup-events-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.lookup-events-request/lookup-attributes :portkey.aws.cloudtrail.-2013-11-01.lookup-events-request/start-time :portkey.aws.cloudtrail.-2013-11-01.lookup-events-request/end-time :portkey.aws.cloudtrail.-2013-11-01/max-results :portkey.aws.cloudtrail.-2013-11-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/insufficient-s-3-bucket-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event-selector/include-management-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/event-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01/read-write-type :portkey.aws.cloudtrail.-2013-11-01.event-selector/include-management-events :portkey.aws.cloudtrail.-2013-11-01/data-resources]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/resource-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/resource))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/cloud-watch-logs-delivery-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/enable-log-file-validation (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/update-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.update-trail-request/name] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.update-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.describe-trails-response/trail-list (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/trail-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.describe-trails-response/trail-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/tags-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/tag))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.tag/key (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.tag/value (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.tag/key] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.resource/resource-type (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.resource/resource-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.resource/resource-type :portkey.aws.cloudtrail.-2013-11-01.resource/resource-name]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/data-resource-values (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/add-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/has-custom-event-selectors (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/home-region (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.trail/has-custom-event-selectors :portkey.aws.cloudtrail.-2013-11-01.trail/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.trail/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.trail/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.trail/trail-arn :portkey.aws.cloudtrail.-2013-11-01.trail/sns-topic-arn :portkey.aws.cloudtrail.-2013-11-01.trail/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.trail/home-region :portkey.aws.cloudtrail.-2013-11-01.trail/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.trail/log-file-validation-enabled :portkey.aws.cloudtrail.-2013-11-01.trail/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.trail/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.trail/name :portkey.aws.cloudtrail.-2013-11-01.trail/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-request/trail-name :portkey.aws.cloudtrail.-2013-11-01/event-selectors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-request/trail-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/insufficient-encryption-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.delete-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/delete-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.delete-trail-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.describe-trails-request/trail-name-list (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/trail-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.describe-trails-request/include-shadow-trails (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/describe-trails-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.describe-trails-request/trail-name-list :portkey.aws.cloudtrail.-2013-11-01.describe-trails-request/include-shadow-trails]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/events-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/event))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-trail-status-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.get-trail-status-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-time-range-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/public-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/public-key))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/resource-tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/resource-tag))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.public-key/value (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/byte-buffer))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.public-key/validity-start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.public-key/validity-end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.public-key/fingerprint (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/public-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.public-key/value :portkey.aws.cloudtrail.-2013-11-01.public-key/validity-start-time :portkey.aws.cloudtrail.-2013-11-01.public-key/validity-end-time :portkey.aws.cloudtrail.-2013-11-01.public-key/fingerprint]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-role-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-tags-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01/resource-id-list] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.list-tags-request/next-token]))

(clojure.core/defn remove-tags ([remove-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-remove-tags-request remove-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/remove-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/remove-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTags", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/remove-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/remove-tags-response))

(clojure.core/defn start-logging ([start-logging-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-logging-request start-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/start-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/start-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartLogging", :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception}})))))
(clojure.spec.alpha/fdef start-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/start-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/start-logging-response))

(clojure.core/defn delete-trail ([delete-trail-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-trail-request delete-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/delete-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/delete-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrail", :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception}})))))
(clojure.spec.alpha/fdef delete-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/delete-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/delete-trail-response))

(clojure.core/defn update-trail ([update-trail-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-trail-request update-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/update-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/update-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrail", :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "TrailNotProvidedException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail.-2013-11-01/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-sns-topic-policy-exception, "KmsException" :portkey.aws.cloudtrail.-2013-11-01/kms-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-sns-topic-name-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail.-2013-11-01/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail.-2013-11-01/cloud-watch-logs-delivery-unavailable-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-role-arn-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef update-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/update-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/update-trail-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/list-tags-response))

(clojure.core/defn describe-trails ([] (describe-trails {})) ([describe-trails-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-trails-request describe-trails-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/describe-trails-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrails", :http.request.spec/error-spec {"UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef describe-trails :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/describe-trails-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response))

(clojure.core/defn create-trail ([create-trail-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-trail-request create-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/create-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/create-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTrail", :http.request.spec/error-spec {"TrailNotProvidedException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail.-2013-11-01/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-sns-topic-policy-exception, "MaximumNumberOfTrailsExceededException" :portkey.aws.cloudtrail.-2013-11-01/maximum-number-of-trails-exceeded-exception, "KmsException" :portkey.aws.cloudtrail.-2013-11-01/kms-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-sns-topic-name-exception, "TrailAlreadyExistsException" :portkey.aws.cloudtrail.-2013-11-01/trail-already-exists-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail.-2013-11-01/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail.-2013-11-01/cloud-watch-logs-delivery-unavailable-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-role-arn-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef create-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/create-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/create-trail-response))

(clojure.core/defn get-trail-status ([get-trail-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-trail-status-request get-trail-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrailStatus", :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception}})))))
(clojure.spec.alpha/fdef get-trail-status :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-response))

(clojure.core/defn put-event-selectors ([put-event-selectors-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-event-selectors-request put-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutEventSelectors", :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "InvalidEventSelectorsException" :portkey.aws.cloudtrail.-2013-11-01/invalid-event-selectors-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef put-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response))

(clojure.core/defn get-event-selectors ([get-event-selectors-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-event-selectors-request get-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetEventSelectors", :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response))

(clojure.core/defn lookup-events ([] (lookup-events {})) ([lookup-events-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-lookup-events-request lookup-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/lookup-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/lookup-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "LookupEvents", :http.request.spec/error-spec {"InvalidLookupAttributesException" :portkey.aws.cloudtrail.-2013-11-01/invalid-lookup-attributes-exception, "InvalidTimeRangeException" :portkey.aws.cloudtrail.-2013-11-01/invalid-time-range-exception, "InvalidMaxResultsException" :portkey.aws.cloudtrail.-2013-11-01/invalid-max-results-exception, "InvalidNextTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef lookup-events :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/lookup-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/lookup-events-response))

(clojure.core/defn list-public-keys ([] (list-public-keys {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPublicKeys", :http.request.spec/error-spec {"InvalidTimeRangeException" :portkey.aws.cloudtrail.-2013-11-01/invalid-time-range-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-public-keys :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response))

(clojure.core/defn add-tags ([add-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-tags-request add-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/add-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/add-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception, "TagsLimitExceededException" :portkey.aws.cloudtrail.-2013-11-01/tags-limit-exceeded-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/add-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/add-tags-response))

(clojure.core/defn stop-logging ([stop-logging-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-logging-request stop-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/stop-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/stop-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopLogging", :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception}})))))
(clojure.spec.alpha/fdef stop-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/stop-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/stop-logging-response))
