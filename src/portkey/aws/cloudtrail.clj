(ns portkey.aws.cloudtrail (:require [portkey.aws]))

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

(clojure.core/declare deser-event-selectors)

(clojure.core/declare deser-trail-list)

(clojure.core/declare deser-data-resource)

(clojure.core/declare deser-data-resources)

(clojure.core/declare deser-event)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-date)

(clojure.core/declare deser-byte-buffer)

(clojure.core/declare deser-read-write-type)

(clojure.core/declare deser-string)

(clojure.core/declare deser-resource-tag)

(clojure.core/declare deser-event-selector)

(clojure.core/declare deser-resource-list)

(clojure.core/declare deser-tags-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-data-resource-values)

(clojure.core/declare deser-trail)

(clojure.core/declare deser-events-list)

(clojure.core/declare deser-public-key-list)

(clojure.core/declare deser-resource-tag-list)

(clojure.core/declare deser-public-key)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-event-selectors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-selector coll))) input))

(clojure.core/defn- deser-trail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trail coll))) input))

(clojure.core/defn- deser-data-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "Values") (clojure.core/assoc :values (deser-data-resource-values (input "Values")))))

(clojure.core/defn- deser-data-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-resource coll))) input))

(clojure.core/defn- deser-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventId") (clojure.core/assoc :event-id (deser-string (input "EventId"))) (clojure.core/contains? input "EventName") (clojure.core/assoc :event-name (deser-string (input "EventName"))) (clojure.core/contains? input "EventTime") (clojure.core/assoc :event-time (deser-date (input "EventTime"))) (clojure.core/contains? input "EventSource") (clojure.core/assoc :event-source (deser-string (input "EventSource"))) (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-string (input "Username"))) (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-resource-list (input "Resources"))) (clojure.core/contains? input "CloudTrailEvent") (clojure.core/assoc :cloud-trail-event (deser-string (input "CloudTrailEvent")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-byte-buffer [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-read-write-type [input] (clojure.core/get {"ReadOnly" :read-only, "WriteOnly" :write-only, "All" :all} input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-resource-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-string (input "ResourceId"))) (clojure.core/contains? input "TagsList") (clojure.core/assoc :tags-list (deser-tags-list (input "TagsList")))))

(clojure.core/defn- deser-event-selector [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReadWriteType") (clojure.core/assoc :read-write-type (deser-read-write-type (input "ReadWriteType"))) (clojure.core/contains? input "IncludeManagementEvents") (clojure.core/assoc :include-management-events (deser-boolean (input "IncludeManagementEvents"))) (clojure.core/contains? input "DataResources") (clojure.core/assoc :data-resources (deser-data-resources (input "DataResources")))))

(clojure.core/defn- deser-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-tags-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-string (input "Key"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-string (input "ResourceType"))) (clojure.core/contains? input "ResourceName") (clojure.core/assoc :resource-name (deser-string (input "ResourceName")))))

(clojure.core/defn- deser-data-resource-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-trail [input] (clojure.core/cond-> {} (clojure.core/contains? input "HasCustomEventSelectors") (clojure.core/assoc :has-custom-event-selectors (deser-boolean (input "HasCustomEventSelectors"))) (clojure.core/contains? input "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (input "CloudWatchLogsLogGroupArn"))) (clojure.core/contains? input "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (input "IncludeGlobalServiceEvents"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (input "S3BucketName"))) (clojure.core/contains? input "TrailARN") (clojure.core/assoc :trail-arn (deser-string (input "TrailARN"))) (clojure.core/contains? input "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (input "SnsTopicARN"))) (clojure.core/contains? input "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (input "CloudWatchLogsRoleArn"))) (clojure.core/contains? input "HomeRegion") (clojure.core/assoc :home-region (deser-string (input "HomeRegion"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (input "LogFileValidationEnabled"))) (clojure.core/contains? input "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (input "S3KeyPrefix"))) (clojure.core/contains? input "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (input "SnsTopicName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (input "IsMultiRegionTrail")))))

(clojure.core/defn- deser-events-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key coll))) input))

(clojure.core/defn- deser-resource-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag coll))) input))

(clojure.core/defn- deser-public-key [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-byte-buffer (input "Value"))) (clojure.core/contains? input "ValidityStartTime") (clojure.core/assoc :validity-start-time (deser-date (input "ValidityStartTime"))) (clojure.core/contains? input "ValidityEndTime") (clojure.core/assoc :validity-end-time (deser-date (input "ValidityEndTime"))) (clojure.core/contains? input "Fingerprint") (clojure.core/assoc :fingerprint (deser-string (input "Fingerprint")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-get-trail-status-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TimeLoggingStopped") (clojure.core/assoc :time-logging-stopped (deser-string (input "TimeLoggingStopped"))) (clojure.core/contains? input "LatestDeliveryError") (clojure.core/assoc :latest-delivery-error (deser-string (input "LatestDeliveryError"))) (clojure.core/contains? input "LatestDeliveryTime") (clojure.core/assoc :latest-delivery-time (deser-date (input "LatestDeliveryTime"))) (clojure.core/contains? input "LatestDigestDeliveryError") (clojure.core/assoc :latest-digest-delivery-error (deser-string (input "LatestDigestDeliveryError"))) (clojure.core/contains? input "LatestCloudWatchLogsDeliveryTime") (clojure.core/assoc :latest-cloud-watch-logs-delivery-time (deser-date (input "LatestCloudWatchLogsDeliveryTime"))) (clojure.core/contains? input "LatestNotificationTime") (clojure.core/assoc :latest-notification-time (deser-date (input "LatestNotificationTime"))) (clojure.core/contains? input "StopLoggingTime") (clojure.core/assoc :stop-logging-time (deser-date (input "StopLoggingTime"))) (clojure.core/contains? input "TimeLoggingStarted") (clojure.core/assoc :time-logging-started (deser-string (input "TimeLoggingStarted"))) (clojure.core/contains? input "StartLoggingTime") (clojure.core/assoc :start-logging-time (deser-date (input "StartLoggingTime"))) (clojure.core/contains? input "LatestNotificationError") (clojure.core/assoc :latest-notification-error (deser-string (input "LatestNotificationError"))) (clojure.core/contains? input "LatestCloudWatchLogsDeliveryError") (clojure.core/assoc :latest-cloud-watch-logs-delivery-error (deser-string (input "LatestCloudWatchLogsDeliveryError"))) (clojure.core/contains? input "LatestNotificationAttemptSucceeded") (clojure.core/assoc :latest-notification-attempt-succeeded (deser-string (input "LatestNotificationAttemptSucceeded"))) (clojure.core/contains? input "LatestDeliveryAttemptSucceeded") (clojure.core/assoc :latest-delivery-attempt-succeeded (deser-string (input "LatestDeliveryAttemptSucceeded"))) (clojure.core/contains? input "LatestDeliveryAttemptTime") (clojure.core/assoc :latest-delivery-attempt-time (deser-string (input "LatestDeliveryAttemptTime"))) (clojure.core/contains? input "IsLogging") (clojure.core/assoc :is-logging (deser-boolean (input "IsLogging"))) (clojure.core/contains? input "LatestNotificationAttemptTime") (clojure.core/assoc :latest-notification-attempt-time (deser-string (input "LatestNotificationAttemptTime"))) (clojure.core/contains? input "LatestDigestDeliveryTime") (clojure.core/assoc :latest-digest-delivery-time (deser-date (input "LatestDigestDeliveryTime")))))

(clojure.core/defn- deser-trail-not-found-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-trail-not-provided-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-token-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-start-logging-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-operation-not-permitted-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-s-3-prefix-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-remove-tags-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-tags-limit-exceeded-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-kms-key-id-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-get-event-selectors-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TrailARN") (clojure.core/assoc :trail-arn (deser-string (input "TrailARN"))) (clojure.core/contains? input "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (input "EventSelectors")))))

(clojure.core/defn- deser-update-trail-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (input "CloudWatchLogsLogGroupArn"))) (clojure.core/contains? input "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (input "IncludeGlobalServiceEvents"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (input "S3BucketName"))) (clojure.core/contains? input "TrailARN") (clojure.core/assoc :trail-arn (deser-string (input "TrailARN"))) (clojure.core/contains? input "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (input "SnsTopicARN"))) (clojure.core/contains? input "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (input "CloudWatchLogsRoleArn"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (input "LogFileValidationEnabled"))) (clojure.core/contains? input "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (input "S3KeyPrefix"))) (clojure.core/contains? input "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (input "SnsTopicName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (input "IsMultiRegionTrail")))))

(clojure.core/defn- deser-put-event-selectors-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TrailARN") (clojure.core/assoc :trail-arn (deser-string (input "TrailARN"))) (clojure.core/contains? input "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (input "EventSelectors")))))

(clojure.core/defn- deser-kms-key-disabled-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-tags-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceTagList") (clojure.core/assoc :resource-tag-list (deser-resource-tag-list (input "ResourceTagList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-invalid-event-selectors-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-home-region-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-s-3-bucket-does-not-exist-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-max-results-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-insufficient-sns-topic-policy-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-stop-logging-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-cloud-trail-arn-invalid-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-maximum-number-of-trails-exceeded-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-kms-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-public-keys-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (input "PublicKeyList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-create-trail-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (input "CloudWatchLogsLogGroupArn"))) (clojure.core/contains? input "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (input "IncludeGlobalServiceEvents"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (input "S3BucketName"))) (clojure.core/contains? input "TrailARN") (clojure.core/assoc :trail-arn (deser-string (input "TrailARN"))) (clojure.core/contains? input "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (input "SnsTopicARN"))) (clojure.core/contains? input "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (input "CloudWatchLogsRoleArn"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (input "LogFileValidationEnabled"))) (clojure.core/contains? input "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (input "S3KeyPrefix"))) (clojure.core/contains? input "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (input "SnsTopicName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (input "IsMultiRegionTrail")))))

(clojure.core/defn- deser-invalid-tag-parameter-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-lookup-events-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Events") (clojure.core/assoc :events (deser-events-list (input "Events"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-invalid-next-token-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-sns-topic-name-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-trail-already-exists-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-trail-name-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-resource-not-found-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-cloud-watch-logs-log-group-arn-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-unsupported-operation-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-trail-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-lookup-attributes-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-insufficient-s-3-bucket-policy-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-parameter-combination-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-cloud-watch-logs-delivery-unavailable-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-trails-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "trailList") (clojure.core/assoc :trail-list (deser-trail-list (input "trailList")))))

(clojure.core/defn- deser-add-tags-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-kms-key-not-found-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-insufficient-encryption-policy-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-resource-type-not-supported-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-time-range-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-cloud-watch-logs-role-arn-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-s-3-bucket-name-exception [input] (clojure.core/cond-> {}))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/time-logging-stopped (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/stop-logging-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/time-logging-started (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/start-logging-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-succeeded (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-succeeded (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/is-logging (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-trail-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.get-trail-status-response/time-logging-stopped :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-error :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-time :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-error :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-time :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-time :portkey.aws.cloudtrail.get-trail-status-response/stop-logging-time :portkey.aws.cloudtrail.get-trail-status-response/time-logging-started :portkey.aws.cloudtrail.get-trail-status-response/start-logging-time :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-error :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-error :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-succeeded :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-succeeded :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-time :portkey.aws.cloudtrail.get-trail-status-response/is-logging :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-time :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-time]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-not-provided-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/start-logging-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-s-3-prefix-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/remove-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-attribute-key #{"Username" :event-name :event-id :username :resource-name :event-source "EventName" "ResourceName" "ResourceType" :resource-type "EventId" "EventSource"})

(clojure.spec.alpha/def :portkey.aws.cloudtrail/tags-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-kms-key-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.get-event-selectors-response/trail-arn :portkey.aws.cloudtrail/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/update-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.update-trail-response/include-global-service-events :portkey.aws.cloudtrail.update-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.update-trail-response/trail-arn :portkey.aws.cloudtrail.update-trail-response/sns-topic-arn :portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.update-trail-response/kms-key-id :portkey.aws.cloudtrail.update-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.update-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.update-trail-response/sns-topic-name :portkey.aws.cloudtrail.update-trail-response/name :portkey.aws.cloudtrail.update-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-attribute/attribute-key (clojure.spec.alpha/and :portkey.aws.cloudtrail/lookup-attribute-key))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-attribute/attribute-value (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.lookup-attribute/attribute-key :portkey.aws.cloudtrail.lookup-attribute/attribute-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/event-selectors (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/event-selector))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.put-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/put-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.put-event-selectors-response/trail-arn :portkey.aws.cloudtrail/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/kms-key-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-tags-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail/resource-tag-list :portkey.aws.cloudtrail.list-tags-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/enable-log-file-validation (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/create-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.create-trail-request/name :portkey.aws.cloudtrail.create-trail-request/s-3-bucket-name] :opt-un [:portkey.aws.cloudtrail.create-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.create-trail-request/include-global-service-events :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.create-trail-request/kms-key-id :portkey.aws.cloudtrail.create-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.create-trail-request/sns-topic-name :portkey.aws.cloudtrail.create-trail-request/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/trail))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-event-selectors-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-home-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/s-3-bucket-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-max-results-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.data-resource/type (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.data-resource/values (clojure.spec.alpha/and :portkey.aws.cloudtrail/data-resource-values))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/data-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.data-resource/type :portkey.aws.cloudtrail.data-resource/values]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/insufficient-sns-topic-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/data-resources (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/data-resource))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.stop-logging-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/stop-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.stop-logging-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/stop-logging-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/maximum-number-of-trails-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-source (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/username (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/resources (clojure.spec.alpha/and :portkey.aws.cloudtrail/resource-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/cloud-trail-event (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.event/event-id :portkey.aws.cloudtrail.event/event-name :portkey.aws.cloudtrail.event/event-time :portkey.aws.cloudtrail.event/event-source :portkey.aws.cloudtrail.event/username :portkey.aws.cloudtrail.event/resources :portkey.aws.cloudtrail.event/cloud-trail-event]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/kms-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-public-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail/public-key-list :portkey.aws.cloudtrail.list-public-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/create-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.create-trail-response/include-global-service-events :portkey.aws.cloudtrail.create-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.create-trail-response/trail-arn :portkey.aws.cloudtrail.create-trail-response/sns-topic-arn :portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.create-trail-response/kms-key-id :portkey.aws.cloudtrail.create-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.create-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.create-trail-response/sns-topic-name :portkey.aws.cloudtrail.create-trail-response/name :portkey.aws.cloudtrail.create-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-tag-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-response/events (clojure.spec.alpha/and :portkey.aws.cloudtrail/events-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.lookup-events-response/events :portkey.aws.cloudtrail/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-attributes-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/lookup-attribute))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.remove-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/remove-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.remove-tags-request/resource-id] :opt-un [:portkey.aws.cloudtrail/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-sns-topic-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.add-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/add-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.add-tags-request/resource-id] :opt-un [:portkey.aws.cloudtrail/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-trail-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-cloud-watch-logs-log-group-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-request/start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-request/end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.list-public-keys-request/start-time :portkey.aws.cloudtrail.list-public-keys-request/end-time :portkey.aws.cloudtrail.list-public-keys-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/byte-buffer clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail/delete-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/read-write-type #{"WriteOnly" :all :write-only "ReadOnly" :read-only "All"})

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-lookup-attributes-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.start-logging-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/start-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.start-logging-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.resource-tag/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.resource-tag/resource-id :portkey.aws.cloudtrail/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-request/lookup-attributes (clojure.spec.alpha/and :portkey.aws.cloudtrail/lookup-attributes-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-request/start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-request/end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-events-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.lookup-events-request/lookup-attributes :portkey.aws.cloudtrail.lookup-events-request/start-time :portkey.aws.cloudtrail.lookup-events-request/end-time :portkey.aws.cloudtrail/max-results :portkey.aws.cloudtrail/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/insufficient-s-3-bucket-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.event-selector/include-management-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/event-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail/read-write-type :portkey.aws.cloudtrail.event-selector/include-management-events :portkey.aws.cloudtrail/data-resources]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/resource))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/cloud-watch-logs-delivery-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/enable-log-file-validation (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/update-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.update-trail-request/name] :opt-un [:portkey.aws.cloudtrail.update-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.update-trail-request/include-global-service-events :portkey.aws.cloudtrail.update-trail-request/s-3-bucket-name :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.update-trail-request/kms-key-id :portkey.aws.cloudtrail.update-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.update-trail-request/sns-topic-name :portkey.aws.cloudtrail.update-trail-request/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.describe-trails-response/trail-list (clojure.spec.alpha/and :portkey.aws.cloudtrail/trail-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/describe-trails-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.describe-trails-response/trail-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/tags-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/tag))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.tag/key (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.tag/value (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.tag/key] :opt-un [:portkey.aws.cloudtrail.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.resource/resource-type (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.resource/resource-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.resource/resource-type :portkey.aws.cloudtrail.resource/resource-name]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/data-resource-values (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/add-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/has-custom-event-selectors (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/home-region (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.trail/has-custom-event-selectors :portkey.aws.cloudtrail.trail/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.trail/include-global-service-events :portkey.aws.cloudtrail.trail/s-3-bucket-name :portkey.aws.cloudtrail.trail/trail-arn :portkey.aws.cloudtrail.trail/sns-topic-arn :portkey.aws.cloudtrail.trail/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.trail/home-region :portkey.aws.cloudtrail.trail/kms-key-id :portkey.aws.cloudtrail.trail/log-file-validation-enabled :portkey.aws.cloudtrail.trail/s-3-key-prefix :portkey.aws.cloudtrail.trail/sns-topic-name :portkey.aws.cloudtrail.trail/name :portkey.aws.cloudtrail.trail/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.put-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/put-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.put-event-selectors-request/trail-name :portkey.aws.cloudtrail/event-selectors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.get-event-selectors-request/trail-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/kms-key-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/insufficient-encryption-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-type-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.delete-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/delete-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.delete-trail-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.describe-trails-request/trail-name-list (clojure.spec.alpha/and :portkey.aws.cloudtrail/trail-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.describe-trails-request/include-shadow-trails (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/describe-trails-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.describe-trails-request/trail-name-list :portkey.aws.cloudtrail.describe-trails-request/include-shadow-trails]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/events-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/event))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-trail-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.get-trail-status-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-time-range-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/public-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/public-key))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/resource-tag))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/value (clojure.spec.alpha/and :portkey.aws.cloudtrail/byte-buffer))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/validity-start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/validity-end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/fingerprint (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/public-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.public-key/value :portkey.aws.cloudtrail.public-key/validity-start-time :portkey.aws.cloudtrail.public-key/validity-end-time :portkey.aws.cloudtrail.public-key/fingerprint]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-cloud-watch-logs-role-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-s-3-bucket-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-tags-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail/resource-id-list] :opt-un [:portkey.aws.cloudtrail.list-tags-request/next-token]))

(clojure.core/defn remove-tags ([remove-tags-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-remove-tags-request remove-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/remove-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/remove-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn deser-remove-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail/invalid-tag-parameter-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/remove-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/remove-tags-response))

(clojure.core/defn start-logging ([start-logging-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-logging-request start-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/start-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/start-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartLogging", :http.request.configuration/output-deser-fn deser-start-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception}})))))
(clojure.spec.alpha/fdef start-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/start-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/start-logging-response))

(clojure.core/defn delete-trail ([delete-trail-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-trail-request delete-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/delete-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/delete-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrail", :http.request.configuration/output-deser-fn deser-delete-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception}})))))
(clojure.spec.alpha/fdef delete-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/delete-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/delete-trail-response))

(clojure.core/defn update-trail ([update-trail-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-trail-request update-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/update-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/update-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrail", :http.request.configuration/output-deser-fn deser-update-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "TrailNotProvidedException" :portkey.aws.cloudtrail/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail/invalid-kms-key-id-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail/kms-key-disabled-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail/insufficient-sns-topic-policy-exception, "KmsException" :portkey.aws.cloudtrail/kms-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail/invalid-sns-topic-name-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail/cloud-watch-logs-delivery-unavailable-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail/kms-key-not-found-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-role-arn-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef update-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/update-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/update-trail-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn deser-list-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/list-tags-response))

(clojure.core/defn describe-trails ([] (describe-trails {})) ([describe-trails-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-trails-request describe-trails-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/describe-trails-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/describe-trails-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrails", :http.request.configuration/output-deser-fn deser-describe-trails-response, :http.request.spec/error-spec {"UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef describe-trails :args (clojure.spec.alpha/? :portkey.aws.cloudtrail/describe-trails-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/describe-trails-response))

(clojure.core/defn create-trail ([create-trail-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-trail-request create-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/create-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/create-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTrail", :http.request.configuration/output-deser-fn deser-create-trail-response, :http.request.spec/error-spec {"TrailNotProvidedException" :portkey.aws.cloudtrail/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail/invalid-kms-key-id-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail/kms-key-disabled-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail/insufficient-sns-topic-policy-exception, "MaximumNumberOfTrailsExceededException" :portkey.aws.cloudtrail/maximum-number-of-trails-exceeded-exception, "KmsException" :portkey.aws.cloudtrail/kms-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail/invalid-sns-topic-name-exception, "TrailAlreadyExistsException" :portkey.aws.cloudtrail/trail-already-exists-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail/cloud-watch-logs-delivery-unavailable-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail/kms-key-not-found-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-role-arn-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef create-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/create-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/create-trail-response))

(clojure.core/defn get-trail-status ([get-trail-status-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-trail-status-request get-trail-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/get-trail-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/get-trail-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrailStatus", :http.request.configuration/output-deser-fn deser-get-trail-status-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception}})))))
(clojure.spec.alpha/fdef get-trail-status :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/get-trail-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/get-trail-status-response))

(clojure.core/defn put-event-selectors ([put-event-selectors-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-event-selectors-request put-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/put-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/put-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutEventSelectors", :http.request.configuration/output-deser-fn deser-put-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception, "InvalidEventSelectorsException" :portkey.aws.cloudtrail/invalid-event-selectors-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef put-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/put-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/put-event-selectors-response))

(clojure.core/defn get-event-selectors ([get-event-selectors-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-event-selectors-request get-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/get-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/get-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetEventSelectors", :http.request.configuration/output-deser-fn deser-get-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/get-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/get-event-selectors-response))

(clojure.core/defn lookup-events ([] (lookup-events {})) ([lookup-events-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-lookup-events-request lookup-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/lookup-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/lookup-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "LookupEvents", :http.request.configuration/output-deser-fn deser-lookup-events-response, :http.request.spec/error-spec {"InvalidLookupAttributesException" :portkey.aws.cloudtrail/invalid-lookup-attributes-exception, "InvalidTimeRangeException" :portkey.aws.cloudtrail/invalid-time-range-exception, "InvalidMaxResultsException" :portkey.aws.cloudtrail/invalid-max-results-exception, "InvalidNextTokenException" :portkey.aws.cloudtrail/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef lookup-events :args (clojure.spec.alpha/? :portkey.aws.cloudtrail/lookup-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/lookup-events-response))

(clojure.core/defn list-public-keys ([] (list-public-keys {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/list-public-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/list-public-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPublicKeys", :http.request.configuration/output-deser-fn deser-list-public-keys-response, :http.request.spec/error-spec {"InvalidTimeRangeException" :portkey.aws.cloudtrail/invalid-time-range-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-public-keys :args (clojure.spec.alpha/? :portkey.aws.cloudtrail/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/list-public-keys-response))

(clojure.core/defn add-tags ([add-tags-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-tags-request add-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/add-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/add-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn deser-add-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail/resource-type-not-supported-exception, "TagsLimitExceededException" :portkey.aws.cloudtrail/tags-limit-exceeded-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail/invalid-tag-parameter-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/add-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/add-tags-response))

(clojure.core/defn stop-logging ([stop-logging-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-logging-request stop-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/stop-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudtrail/stop-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopLogging", :http.request.configuration/output-deser-fn deser-stop-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception}})))))
(clojure.spec.alpha/fdef stop-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/stop-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/stop-logging-response))
