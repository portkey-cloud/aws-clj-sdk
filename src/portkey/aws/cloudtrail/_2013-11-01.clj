(ns portkey.aws.cloudtrail.-2013-11-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "cloudtrail", :region "us-gov-east-1"},
    :ssl-common-name "cloudtrail.us-gov-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "cloudtrail", :region "eu-north-1"},
    :ssl-common-name "cloudtrail.eu-north-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-north-1.amazonaws.com",
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

(clojure.core/defn- ser-lookup-attribute-key [input] #:http.request.field{:value (clojure.core/get {"Username" "Username", :event-name "EventName", :event-id "EventId", :username "Username", :resource-name "ResourceName", :event-source "EventSource", "EventName" "EventName", "ReadOnly" "ReadOnly", "ResourceName" "ResourceName", "ResourceType" "ResourceType", :resource-type "ResourceType", :read-only "ReadOnly", "EventId" "EventId", "EventSource" "EventSource", :access-key-id "AccessKeyId", "AccessKeyId" "AccessKeyId"} input), :shape "LookupAttributeKey"})

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

(clojure.core/defn- req-create-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String"})]} (clojure.core/contains? input :enable-log-file-validation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-log-file-validation)) #:http.request.field{:name "EnableLogFileValidation", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-log-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "String"})) (clojure.core/contains? input :include-global-service-events) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-global-service-events)) #:http.request.field{:name "IncludeGlobalServiceEvents", :shape "Boolean"})) (clojure.core/contains? input :is-organization-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-organization-trail)) #:http.request.field{:name "IsOrganizationTrail", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-role-arn)) #:http.request.field{:name "CloudWatchLogsRoleArn", :shape "String"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "String"})) (clojure.core/contains? input :sns-topic-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-name)) #:http.request.field{:name "SnsTopicName", :shape "String"})) (clojure.core/contains? input :is-multi-region-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-multi-region-trail)) #:http.request.field{:name "IsMultiRegionTrail", :shape "Boolean"}))))

(clojure.core/defn- req-stop-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-remove-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "String"})]} (clojure.core/contains? input :tags-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-list (input :tags-list)) #:http.request.field{:name "TagsList", :shape "TagsList"}))))

(clojure.core/defn- req-add-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "String"})]} (clojure.core/contains? input :tags-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-list (input :tags-list)) #:http.request.field{:name "TagsList", :shape "TagsList"}))))

(clojure.core/defn- req-list-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :start-time)) #:http.request.field{:name "StartTime", :shape "Date"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :end-time)) #:http.request.field{:name "EndTime", :shape "Date"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-start-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-lookup-events-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :lookup-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lookup-attributes-list (input :lookup-attributes)) #:http.request.field{:name "LookupAttributes", :shape "LookupAttributesList"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :start-time)) #:http.request.field{:name "StartTime", :shape "Date"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :end-time)) #:http.request.field{:name "EndTime", :shape "Date"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :enable-log-file-validation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-log-file-validation)) #:http.request.field{:name "EnableLogFileValidation", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-log-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "String"})) (clojure.core/contains? input :include-global-service-events) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-global-service-events)) #:http.request.field{:name "IncludeGlobalServiceEvents", :shape "Boolean"})) (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String"})) (clojure.core/contains? input :is-organization-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-organization-trail)) #:http.request.field{:name "IsOrganizationTrail", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-role-arn)) #:http.request.field{:name "CloudWatchLogsRoleArn", :shape "String"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "String"})) (clojure.core/contains? input :sns-topic-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-name)) #:http.request.field{:name "SnsTopicName", :shape "String"})) (clojure.core/contains? input :is-multi-region-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-multi-region-trail)) #:http.request.field{:name "IsMultiRegionTrail", :shape "Boolean"}))))

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

(clojure.core/defn- deser-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-string (input "Username"))) (clojure.core/contains? input "EventName") (clojure.core/assoc :event-name (deser-string (input "EventName"))) (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-resource-list (input "Resources"))) (clojure.core/contains? input "ReadOnly") (clojure.core/assoc :read-only (deser-string (input "ReadOnly"))) (clojure.core/contains? input "EventTime") (clojure.core/assoc :event-time (deser-date (input "EventTime"))) (clojure.core/contains? input "EventId") (clojure.core/assoc :event-id (deser-string (input "EventId"))) (clojure.core/contains? input "CloudTrailEvent") (clojure.core/assoc :cloud-trail-event (deser-string (input "CloudTrailEvent"))) (clojure.core/contains? input "EventSource") (clojure.core/assoc :event-source (deser-string (input "EventSource"))) (clojure.core/contains? input "AccessKeyId") (clojure.core/assoc :access-key-id (deser-string (input "AccessKeyId")))))

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

(clojure.core/defn- deser-trail [input] (clojure.core/cond-> {} (clojure.core/contains? input "HasCustomEventSelectors") (clojure.core/assoc :has-custom-event-selectors (deser-boolean (input "HasCustomEventSelectors"))) (clojure.core/contains? input "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (input "CloudWatchLogsLogGroupArn"))) (clojure.core/contains? input "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (input "IncludeGlobalServiceEvents"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (input "S3BucketName"))) (clojure.core/contains? input "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (input "IsOrganizationTrail"))) (clojure.core/contains? input "TrailARN") (clojure.core/assoc :trail-arn (deser-string (input "TrailARN"))) (clojure.core/contains? input "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (input "SnsTopicARN"))) (clojure.core/contains? input "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (input "CloudWatchLogsRoleArn"))) (clojure.core/contains? input "HomeRegion") (clojure.core/assoc :home-region (deser-string (input "HomeRegion"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (input "LogFileValidationEnabled"))) (clojure.core/contains? input "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (input "S3KeyPrefix"))) (clojure.core/contains? input "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (input "SnsTopicName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (input "IsMultiRegionTrail")))))

(clojure.core/defn- deser-events-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key coll))) input))

(clojure.core/defn- deser-resource-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag coll))) input))

(clojure.core/defn- deser-public-key [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-byte-buffer (input "Value"))) (clojure.core/contains? input "ValidityStartTime") (clojure.core/assoc :validity-start-time (deser-date (input "ValidityStartTime"))) (clojure.core/contains? input "ValidityEndTime") (clojure.core/assoc :validity-end-time (deser-date (input "ValidityEndTime"))) (clojure.core/contains? input "Fingerprint") (clojure.core/assoc :fingerprint (deser-string (input "Fingerprint")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-get-trail-status-response ([input] (response-get-trail-status-response nil input)) ([resultWrapper375254 input] (clojure.core/let [rawinput375253 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375255 {"TimeLoggingStopped" (rawinput375253 "TimeLoggingStopped"), "LatestDeliveryError" (rawinput375253 "LatestDeliveryError"), "LatestDeliveryTime" (rawinput375253 "LatestDeliveryTime"), "LatestDigestDeliveryError" (rawinput375253 "LatestDigestDeliveryError"), "LatestCloudWatchLogsDeliveryTime" (rawinput375253 "LatestCloudWatchLogsDeliveryTime"), "LatestNotificationTime" (rawinput375253 "LatestNotificationTime"), "StopLoggingTime" (rawinput375253 "StopLoggingTime"), "TimeLoggingStarted" (rawinput375253 "TimeLoggingStarted"), "StartLoggingTime" (rawinput375253 "StartLoggingTime"), "LatestNotificationError" (rawinput375253 "LatestNotificationError"), "LatestCloudWatchLogsDeliveryError" (rawinput375253 "LatestCloudWatchLogsDeliveryError"), "LatestNotificationAttemptSucceeded" (rawinput375253 "LatestNotificationAttemptSucceeded"), "LatestDeliveryAttemptSucceeded" (rawinput375253 "LatestDeliveryAttemptSucceeded"), "LatestDeliveryAttemptTime" (rawinput375253 "LatestDeliveryAttemptTime"), "IsLogging" (rawinput375253 "IsLogging"), "LatestNotificationAttemptTime" (rawinput375253 "LatestNotificationAttemptTime"), "LatestDigestDeliveryTime" (rawinput375253 "LatestDigestDeliveryTime")}] (clojure.core/cond-> {} (letvar375255 "TimeLoggingStopped") (clojure.core/assoc :time-logging-stopped (deser-string (clojure.core/get-in letvar375255 ["TimeLoggingStopped"]))) (letvar375255 "LatestDeliveryError") (clojure.core/assoc :latest-delivery-error (deser-string (clojure.core/get-in letvar375255 ["LatestDeliveryError"]))) (letvar375255 "LatestDeliveryTime") (clojure.core/assoc :latest-delivery-time (deser-date (clojure.core/get-in letvar375255 ["LatestDeliveryTime"]))) (letvar375255 "LatestDigestDeliveryError") (clojure.core/assoc :latest-digest-delivery-error (deser-string (clojure.core/get-in letvar375255 ["LatestDigestDeliveryError"]))) (letvar375255 "LatestCloudWatchLogsDeliveryTime") (clojure.core/assoc :latest-cloud-watch-logs-delivery-time (deser-date (clojure.core/get-in letvar375255 ["LatestCloudWatchLogsDeliveryTime"]))) (letvar375255 "LatestNotificationTime") (clojure.core/assoc :latest-notification-time (deser-date (clojure.core/get-in letvar375255 ["LatestNotificationTime"]))) (letvar375255 "StopLoggingTime") (clojure.core/assoc :stop-logging-time (deser-date (clojure.core/get-in letvar375255 ["StopLoggingTime"]))) (letvar375255 "TimeLoggingStarted") (clojure.core/assoc :time-logging-started (deser-string (clojure.core/get-in letvar375255 ["TimeLoggingStarted"]))) (letvar375255 "StartLoggingTime") (clojure.core/assoc :start-logging-time (deser-date (clojure.core/get-in letvar375255 ["StartLoggingTime"]))) (letvar375255 "LatestNotificationError") (clojure.core/assoc :latest-notification-error (deser-string (clojure.core/get-in letvar375255 ["LatestNotificationError"]))) (letvar375255 "LatestCloudWatchLogsDeliveryError") (clojure.core/assoc :latest-cloud-watch-logs-delivery-error (deser-string (clojure.core/get-in letvar375255 ["LatestCloudWatchLogsDeliveryError"]))) (letvar375255 "LatestNotificationAttemptSucceeded") (clojure.core/assoc :latest-notification-attempt-succeeded (deser-string (clojure.core/get-in letvar375255 ["LatestNotificationAttemptSucceeded"]))) (letvar375255 "LatestDeliveryAttemptSucceeded") (clojure.core/assoc :latest-delivery-attempt-succeeded (deser-string (clojure.core/get-in letvar375255 ["LatestDeliveryAttemptSucceeded"]))) (letvar375255 "LatestDeliveryAttemptTime") (clojure.core/assoc :latest-delivery-attempt-time (deser-string (clojure.core/get-in letvar375255 ["LatestDeliveryAttemptTime"]))) (letvar375255 "IsLogging") (clojure.core/assoc :is-logging (deser-boolean (clojure.core/get-in letvar375255 ["IsLogging"]))) (letvar375255 "LatestNotificationAttemptTime") (clojure.core/assoc :latest-notification-attempt-time (deser-string (clojure.core/get-in letvar375255 ["LatestNotificationAttemptTime"]))) (letvar375255 "LatestDigestDeliveryTime") (clojure.core/assoc :latest-digest-delivery-time (deser-date (clojure.core/get-in letvar375255 ["LatestDigestDeliveryTime"])))))))

(clojure.core/defn- response-trail-not-found-exception ([input] (response-trail-not-found-exception nil input)) ([resultWrapper375257 input] (clojure.core/let [rawinput375256 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375258 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-trail-not-provided-exception ([input] (response-trail-not-provided-exception nil input)) ([resultWrapper375260 input] (clojure.core/let [rawinput375259 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375261 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-token-exception ([input] (response-invalid-token-exception nil input)) ([resultWrapper375263 input] (clojure.core/let [rawinput375262 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375264 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-logging-response ([input] (response-start-logging-response nil input)) ([resultWrapper375266 input] (clojure.core/let [rawinput375265 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375267 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper375269 input] (clojure.core/let [rawinput375268 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375270 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-prefix-exception ([input] (response-invalid-s-3-prefix-exception nil input)) ([resultWrapper375272 input] (clojure.core/let [rawinput375271 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375273 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-tags-response ([input] (response-remove-tags-response nil input)) ([resultWrapper375275 input] (clojure.core/let [rawinput375274 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375276 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tags-limit-exceeded-exception ([input] (response-tags-limit-exceeded-exception nil input)) ([resultWrapper375278 input] (clojure.core/let [rawinput375277 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375279 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-kms-key-id-exception ([input] (response-invalid-kms-key-id-exception nil input)) ([resultWrapper375281 input] (clojure.core/let [rawinput375280 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375282 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-event-selectors-response ([input] (response-get-event-selectors-response nil input)) ([resultWrapper375284 input] (clojure.core/let [rawinput375283 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375285 {"TrailARN" (rawinput375283 "TrailARN"), "EventSelectors" (rawinput375283 "EventSelectors")}] (clojure.core/cond-> {} (letvar375285 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar375285 ["TrailARN"]))) (letvar375285 "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (clojure.core/get-in letvar375285 ["EventSelectors"])))))))

(clojure.core/defn- response-update-trail-response ([input] (response-update-trail-response nil input)) ([resultWrapper375287 input] (clojure.core/let [rawinput375286 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375288 {"CloudWatchLogsLogGroupArn" (rawinput375286 "CloudWatchLogsLogGroupArn"), "IncludeGlobalServiceEvents" (rawinput375286 "IncludeGlobalServiceEvents"), "S3BucketName" (rawinput375286 "S3BucketName"), "IsOrganizationTrail" (rawinput375286 "IsOrganizationTrail"), "TrailARN" (rawinput375286 "TrailARN"), "SnsTopicARN" (rawinput375286 "SnsTopicARN"), "CloudWatchLogsRoleArn" (rawinput375286 "CloudWatchLogsRoleArn"), "KmsKeyId" (rawinput375286 "KmsKeyId"), "LogFileValidationEnabled" (rawinput375286 "LogFileValidationEnabled"), "S3KeyPrefix" (rawinput375286 "S3KeyPrefix"), "SnsTopicName" (rawinput375286 "SnsTopicName"), "Name" (rawinput375286 "Name"), "IsMultiRegionTrail" (rawinput375286 "IsMultiRegionTrail")}] (clojure.core/cond-> {} (letvar375288 "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (clojure.core/get-in letvar375288 ["CloudWatchLogsLogGroupArn"]))) (letvar375288 "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (clojure.core/get-in letvar375288 ["IncludeGlobalServiceEvents"]))) (letvar375288 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar375288 ["S3BucketName"]))) (letvar375288 "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (clojure.core/get-in letvar375288 ["IsOrganizationTrail"]))) (letvar375288 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar375288 ["TrailARN"]))) (letvar375288 "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar375288 ["SnsTopicARN"]))) (letvar375288 "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (clojure.core/get-in letvar375288 ["CloudWatchLogsRoleArn"]))) (letvar375288 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (clojure.core/get-in letvar375288 ["KmsKeyId"]))) (letvar375288 "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (clojure.core/get-in letvar375288 ["LogFileValidationEnabled"]))) (letvar375288 "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (clojure.core/get-in letvar375288 ["S3KeyPrefix"]))) (letvar375288 "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (clojure.core/get-in letvar375288 ["SnsTopicName"]))) (letvar375288 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar375288 ["Name"]))) (letvar375288 "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (clojure.core/get-in letvar375288 ["IsMultiRegionTrail"])))))))

(clojure.core/defn- response-put-event-selectors-response ([input] (response-put-event-selectors-response nil input)) ([resultWrapper375290 input] (clojure.core/let [rawinput375289 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375291 {"TrailARN" (rawinput375289 "TrailARN"), "EventSelectors" (rawinput375289 "EventSelectors")}] (clojure.core/cond-> {} (letvar375291 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar375291 ["TrailARN"]))) (letvar375291 "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (clojure.core/get-in letvar375291 ["EventSelectors"])))))))

(clojure.core/defn- response-insufficient-dependency-service-access-permission-exception ([input] (response-insufficient-dependency-service-access-permission-exception nil input)) ([resultWrapper375293 input] (clojure.core/let [rawinput375292 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375294 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-key-disabled-exception ([input] (response-kms-key-disabled-exception nil input)) ([resultWrapper375296 input] (clojure.core/let [rawinput375295 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375297 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper375299 input] (clojure.core/let [rawinput375298 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375300 {"ResourceTagList" (rawinput375298 "ResourceTagList"), "NextToken" (rawinput375298 "NextToken")}] (clojure.core/cond-> {} (letvar375300 "ResourceTagList") (clojure.core/assoc :resource-tag-list (deser-resource-tag-list (clojure.core/get-in letvar375300 ["ResourceTagList"]))) (letvar375300 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar375300 ["NextToken"])))))))

(clojure.core/defn- response-invalid-event-selectors-exception ([input] (response-invalid-event-selectors-exception nil input)) ([resultWrapper375302 input] (clojure.core/let [rawinput375301 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375303 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-home-region-exception ([input] (response-invalid-home-region-exception nil input)) ([resultWrapper375305 input] (clojure.core/let [rawinput375304 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375306 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-s-3-bucket-does-not-exist-exception ([input] (response-s-3-bucket-does-not-exist-exception nil input)) ([resultWrapper375308 input] (clojure.core/let [rawinput375307 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375309 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-max-results-exception ([input] (response-invalid-max-results-exception nil input)) ([resultWrapper375311 input] (clojure.core/let [rawinput375310 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375312 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-sns-topic-policy-exception ([input] (response-insufficient-sns-topic-policy-exception nil input)) ([resultWrapper375314 input] (clojure.core/let [rawinput375313 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375315 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-logging-response ([input] (response-stop-logging-response nil input)) ([resultWrapper375317 input] (clojure.core/let [rawinput375316 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375318 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-trail-arn-invalid-exception ([input] (response-cloud-trail-arn-invalid-exception nil input)) ([resultWrapper375320 input] (clojure.core/let [rawinput375319 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375321 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-number-of-trails-exceeded-exception ([input] (response-maximum-number-of-trails-exceeded-exception nil input)) ([resultWrapper375323 input] (clojure.core/let [rawinput375322 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375324 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-exception ([input] (response-kms-exception nil input)) ([resultWrapper375326 input] (clojure.core/let [rawinput375325 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375327 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-public-keys-response ([input] (response-list-public-keys-response nil input)) ([resultWrapper375329 input] (clojure.core/let [rawinput375328 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375330 {"PublicKeyList" (rawinput375328 "PublicKeyList"), "NextToken" (rawinput375328 "NextToken")}] (clojure.core/cond-> {} (letvar375330 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar375330 ["PublicKeyList"]))) (letvar375330 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar375330 ["NextToken"])))))))

(clojure.core/defn- response-create-trail-response ([input] (response-create-trail-response nil input)) ([resultWrapper375332 input] (clojure.core/let [rawinput375331 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375333 {"CloudWatchLogsLogGroupArn" (rawinput375331 "CloudWatchLogsLogGroupArn"), "IncludeGlobalServiceEvents" (rawinput375331 "IncludeGlobalServiceEvents"), "S3BucketName" (rawinput375331 "S3BucketName"), "IsOrganizationTrail" (rawinput375331 "IsOrganizationTrail"), "TrailARN" (rawinput375331 "TrailARN"), "SnsTopicARN" (rawinput375331 "SnsTopicARN"), "CloudWatchLogsRoleArn" (rawinput375331 "CloudWatchLogsRoleArn"), "KmsKeyId" (rawinput375331 "KmsKeyId"), "LogFileValidationEnabled" (rawinput375331 "LogFileValidationEnabled"), "S3KeyPrefix" (rawinput375331 "S3KeyPrefix"), "SnsTopicName" (rawinput375331 "SnsTopicName"), "Name" (rawinput375331 "Name"), "IsMultiRegionTrail" (rawinput375331 "IsMultiRegionTrail")}] (clojure.core/cond-> {} (letvar375333 "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (clojure.core/get-in letvar375333 ["CloudWatchLogsLogGroupArn"]))) (letvar375333 "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (clojure.core/get-in letvar375333 ["IncludeGlobalServiceEvents"]))) (letvar375333 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar375333 ["S3BucketName"]))) (letvar375333 "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (clojure.core/get-in letvar375333 ["IsOrganizationTrail"]))) (letvar375333 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar375333 ["TrailARN"]))) (letvar375333 "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar375333 ["SnsTopicARN"]))) (letvar375333 "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (clojure.core/get-in letvar375333 ["CloudWatchLogsRoleArn"]))) (letvar375333 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (clojure.core/get-in letvar375333 ["KmsKeyId"]))) (letvar375333 "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (clojure.core/get-in letvar375333 ["LogFileValidationEnabled"]))) (letvar375333 "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (clojure.core/get-in letvar375333 ["S3KeyPrefix"]))) (letvar375333 "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (clojure.core/get-in letvar375333 ["SnsTopicName"]))) (letvar375333 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar375333 ["Name"]))) (letvar375333 "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (clojure.core/get-in letvar375333 ["IsMultiRegionTrail"])))))))

(clojure.core/defn- response-invalid-tag-parameter-exception ([input] (response-invalid-tag-parameter-exception nil input)) ([resultWrapper375335 input] (clojure.core/let [rawinput375334 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375336 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-trail-access-not-enabled-exception ([input] (response-cloud-trail-access-not-enabled-exception nil input)) ([resultWrapper375338 input] (clojure.core/let [rawinput375337 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375339 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-lookup-events-response ([input] (response-lookup-events-response nil input)) ([resultWrapper375341 input] (clojure.core/let [rawinput375340 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375342 {"Events" (rawinput375340 "Events"), "NextToken" (rawinput375340 "NextToken")}] (clojure.core/cond-> {} (letvar375342 "Events") (clojure.core/assoc :events (deser-events-list (clojure.core/get-in letvar375342 ["Events"]))) (letvar375342 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar375342 ["NextToken"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper375344 input] (clojure.core/let [rawinput375343 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375345 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-sns-topic-name-exception ([input] (response-invalid-sns-topic-name-exception nil input)) ([resultWrapper375347 input] (clojure.core/let [rawinput375346 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375348 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-trail-already-exists-exception ([input] (response-trail-already-exists-exception nil input)) ([resultWrapper375350 input] (clojure.core/let [rawinput375349 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375351 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-trail-name-exception ([input] (response-invalid-trail-name-exception nil input)) ([resultWrapper375353 input] (clojure.core/let [rawinput375352 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375354 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper375356 input] (clojure.core/let [rawinput375355 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375357 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-cloud-watch-logs-log-group-arn-exception ([input] (response-invalid-cloud-watch-logs-log-group-arn-exception nil input)) ([resultWrapper375359 input] (clojure.core/let [rawinput375358 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375360 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-operation-exception ([input] (response-unsupported-operation-exception nil input)) ([resultWrapper375362 input] (clojure.core/let [rawinput375361 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375363 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-trail-response ([input] (response-delete-trail-response nil input)) ([resultWrapper375365 input] (clojure.core/let [rawinput375364 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375366 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-lookup-attributes-exception ([input] (response-invalid-lookup-attributes-exception nil input)) ([resultWrapper375368 input] (clojure.core/let [rawinput375367 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375369 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-s-3-bucket-policy-exception ([input] (response-insufficient-s-3-bucket-policy-exception nil input)) ([resultWrapper375371 input] (clojure.core/let [rawinput375370 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375372 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-combination-exception ([input] (response-invalid-parameter-combination-exception nil input)) ([resultWrapper375374 input] (clojure.core/let [rawinput375373 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375375 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-watch-logs-delivery-unavailable-exception ([input] (response-cloud-watch-logs-delivery-unavailable-exception nil input)) ([resultWrapper375377 input] (clojure.core/let [rawinput375376 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375378 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-trails-response ([input] (response-describe-trails-response nil input)) ([resultWrapper375380 input] (clojure.core/let [rawinput375379 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375381 {"trailList" (rawinput375379 "trailList")}] (clojure.core/cond-> {} (letvar375381 "trailList") (clojure.core/assoc :trail-list (deser-trail-list (clojure.core/get-in letvar375381 ["trailList"])))))))

(clojure.core/defn- response-not-organization-master-account-exception ([input] (response-not-organization-master-account-exception nil input)) ([resultWrapper375383 input] (clojure.core/let [rawinput375382 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375384 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-tags-response ([input] (response-add-tags-response nil input)) ([resultWrapper375386 input] (clojure.core/let [rawinput375385 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375387 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-key-not-found-exception ([input] (response-kms-key-not-found-exception nil input)) ([resultWrapper375389 input] (clojure.core/let [rawinput375388 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375390 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-organization-not-in-all-features-mode-exception ([input] (response-organization-not-in-all-features-mode-exception nil input)) ([resultWrapper375392 input] (clojure.core/let [rawinput375391 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375393 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-encryption-policy-exception ([input] (response-insufficient-encryption-policy-exception nil input)) ([resultWrapper375395 input] (clojure.core/let [rawinput375394 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375396 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-type-not-supported-exception ([input] (response-resource-type-not-supported-exception nil input)) ([resultWrapper375398 input] (clojure.core/let [rawinput375397 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375399 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-time-range-exception ([input] (response-invalid-time-range-exception nil input)) ([resultWrapper375401 input] (clojure.core/let [rawinput375400 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375402 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-cloud-watch-logs-role-arn-exception ([input] (response-invalid-cloud-watch-logs-role-arn-exception nil input)) ([resultWrapper375404 input] (clojure.core/let [rawinput375403 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375405 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-organizations-not-in-use-exception ([input] (response-organizations-not-in-use-exception nil input)) ([resultWrapper375407 input] (clojure.core/let [rawinput375406 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375408 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-bucket-name-exception ([input] (response-invalid-s-3-bucket-name-exception nil input)) ([resultWrapper375410 input] (clojure.core/let [rawinput375409 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar375411 {}] (clojure.core/cond-> {}))))

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

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/lookup-attribute-key #{"Username" :event-name :event-id :username :resource-name :event-source "EventName" "ReadOnly" "ResourceName" "ResourceType" :resource-type :read-only "EventId" "EventSource" :access-key-id "AccessKeyId"})

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/tags-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/update-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/is-organization-trail :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/name :portkey.aws.cloudtrail.-2013-11-01.update-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-key (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/lookup-attribute-key))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-value (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/lookup-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-key :portkey.aws.cloudtrail.-2013-11-01.lookup-attribute/attribute-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/event-selectors (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail.-2013-11-01/event-selector))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-tags-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01/resource-tag-list :portkey.aws.cloudtrail.-2013-11-01.list-tags-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/enable-log-file-validation (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/create-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.create-trail-request/name :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-bucket-name] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.create-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/is-organization-trail :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.create-trail-request/is-multi-region-trail]))

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

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/username (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/resources (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/read-only (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-time (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/cloud-trail-event (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/event-source (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.event/access-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.event/username :portkey.aws.cloudtrail.-2013-11-01.event/event-name :portkey.aws.cloudtrail.-2013-11-01.event/resources :portkey.aws.cloudtrail.-2013-11-01.event/read-only :portkey.aws.cloudtrail.-2013-11-01.event/event-time :portkey.aws.cloudtrail.-2013-11-01.event/event-id :portkey.aws.cloudtrail.-2013-11-01.event/cloud-trail-event :portkey.aws.cloudtrail.-2013-11-01.event/event-source :portkey.aws.cloudtrail.-2013-11-01.event/access-key-id]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/kms-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01/public-key-list :portkey.aws.cloudtrail.-2013-11-01.list-public-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/create-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/is-organization-trail :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/trail-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/name :portkey.aws.cloudtrail.-2013-11-01.create-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-access-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/update-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.update-trail-request/name] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.update-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/is-organization-trail :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.update-trail-request/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.describe-trails-response/trail-list (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/trail-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.describe-trails-response/trail-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.trail/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/boolean))
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
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/trail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.trail/has-custom-event-selectors :portkey.aws.cloudtrail.-2013-11-01.trail/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.-2013-11-01.trail/include-global-service-events :portkey.aws.cloudtrail.-2013-11-01.trail/s-3-bucket-name :portkey.aws.cloudtrail.-2013-11-01.trail/is-organization-trail :portkey.aws.cloudtrail.-2013-11-01.trail/trail-arn :portkey.aws.cloudtrail.-2013-11-01.trail/sns-topic-arn :portkey.aws.cloudtrail.-2013-11-01.trail/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.-2013-11-01.trail/home-region :portkey.aws.cloudtrail.-2013-11-01.trail/kms-key-id :portkey.aws.cloudtrail.-2013-11-01.trail/log-file-validation-enabled :portkey.aws.cloudtrail.-2013-11-01.trail/s-3-key-prefix :portkey.aws.cloudtrail.-2013-11-01.trail/sns-topic-name :portkey.aws.cloudtrail.-2013-11-01.trail/name :portkey.aws.cloudtrail.-2013-11-01.trail/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.put-event-selectors-request/trail-name :portkey.aws.cloudtrail.-2013-11-01/event-selectors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01.get-event-selectors-request/trail-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/organization-not-in-all-features-mode-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/organizations-not-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01.list-tags-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.-2013-11-01/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.-2013-11-01/resource-id-list] :opt-un [:portkey.aws.cloudtrail.-2013-11-01.list-tags-request/next-token]))

(clojure.core/defn remove-tags "Removes the specified tags from a trail." ([remove-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-tags-request remove-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/remove-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/remove-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn response-remove-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/remove-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/remove-tags-response))

(clojure.core/defn start-logging "Starts the recording of AWS API calls and log file delivery for a trail. For a\ntrail that is enabled in all regions, this operation must be called from the\nregion in which the trail was created. This operation cannot be called on the\nshadow trails (replicated trails in other regions) of a trail that is enabled in\nall regions." ([start-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-logging-request start-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/start-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/start-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartLogging", :http.request.configuration/output-deser-fn response-start-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef start-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/start-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/start-logging-response))

(clojure.core/defn delete-trail "Deletes a trail. This operation must be called from the region in which the\ntrail was created. DeleteTrail cannot be called on the shadow trails (replicated\ntrails in other regions) of a trail that is enabled in all regions." ([delete-trail-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-trail-request delete-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/delete-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/delete-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTrail", :http.request.configuration/output-deser-fn response-delete-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef delete-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/delete-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/delete-trail-response))

(clojure.core/defn update-trail "Updates the settings that specify delivery of log files. Changes to a trail do\nnot require stopping the CloudTrail service. Use this action to designate an\nexisting bucket for log delivery. If the existing bucket has previously been a\ntarget for CloudTrail log files, an IAM policy exists for the bucket.\nUpdateTrail must be called from the region in which the trail was created;\notherwise, an InvalidHomeRegionException is thrown." ([update-trail-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-trail-request update-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/update-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/update-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTrail", :http.request.configuration/output-deser-fn response-update-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "TrailNotProvidedException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail.-2013-11-01/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-sns-topic-policy-exception, "KmsException" :portkey.aws.cloudtrail.-2013-11-01/kms-exception, "CloudTrailAccessNotEnabledException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-access-not-enabled-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-sns-topic-name-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail.-2013-11-01/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail.-2013-11-01/cloud-watch-logs-delivery-unavailable-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception, "OrganizationNotInAllFeaturesModeException" :portkey.aws.cloudtrail.-2013-11-01/organization-not-in-all-features-mode-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-role-arn-exception, "OrganizationsNotInUseException" :portkey.aws.cloudtrail.-2013-11-01/organizations-not-in-use-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef update-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/update-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/update-trail-response))

(clojure.core/defn list-tags "Lists the tags for the trail in the current region." ([list-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/list-tags-response))

(clojure.core/defn describe-trails "Retrieves settings for the trail associated with the current region for your\naccount." ([] (describe-trails {})) ([describe-trails-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-trails-request describe-trails-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/describe-trails-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrails", :http.request.configuration/output-deser-fn response-describe-trails-response, :http.request.spec/error-spec {"UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef describe-trails :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/describe-trails-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response))

(clojure.core/defn create-trail "Creates a trail that specifies the settings for delivery of log data to an\nAmazon S3 bucket. A maximum of five trails can exist in a region, irrespective\nof the region in which they were created." ([create-trail-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-trail-request create-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/create-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/create-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrail", :http.request.configuration/output-deser-fn response-create-trail-response, :http.request.spec/error-spec {"TrailNotProvidedException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail.-2013-11-01/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-sns-topic-policy-exception, "MaximumNumberOfTrailsExceededException" :portkey.aws.cloudtrail.-2013-11-01/maximum-number-of-trails-exceeded-exception, "KmsException" :portkey.aws.cloudtrail.-2013-11-01/kms-exception, "CloudTrailAccessNotEnabledException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-access-not-enabled-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-sns-topic-name-exception, "TrailAlreadyExistsException" :portkey.aws.cloudtrail.-2013-11-01/trail-already-exists-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail.-2013-11-01/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail.-2013-11-01/cloud-watch-logs-delivery-unavailable-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception, "OrganizationNotInAllFeaturesModeException" :portkey.aws.cloudtrail.-2013-11-01/organization-not-in-all-features-mode-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-role-arn-exception, "OrganizationsNotInUseException" :portkey.aws.cloudtrail.-2013-11-01/organizations-not-in-use-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef create-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/create-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/create-trail-response))

(clojure.core/defn get-trail-status "Returns a JSON-formatted list of information about the specified trail. Fields\ninclude information on delivery errors, Amazon SNS and Amazon S3 errors, and\nstart and stop logging times for each trail. This operation returns trail status\nfrom a single region. To return trail status from all regions, you must call the\noperation on each region." ([get-trail-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-trail-status-request get-trail-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTrailStatus", :http.request.configuration/output-deser-fn response-get-trail-status-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception}})))))
(clojure.spec.alpha/fdef get-trail-status :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-response))

(clojure.core/defn put-event-selectors "Configures an event selector for your trail. Use event selectors to further\nspecify the management and data event settings for your trail. By default,\ntrails created without specific event selectors will be configured to log all\nread and write management events, and no data events.\n When an event occurs in your account, CloudTrail evaluates the event selectors\nin all trails. For each trail, if the event matches any event selector, the\ntrail processes and logs the event. If the event doesn't match any event\nselector, the trail doesn't log the event.\n Example\n * You create an event selector for a trail and specify that you want write-only\nevents.\n * The EC2 GetConsoleOutput and RunInstances API operations occur in your\naccount.\n * CloudTrail evaluates whether the events match your event selectors.\n * The RunInstances is a write-only event and it matches your event selector.\nThe trail logs the event.\n * The GetConsoleOutput is a read-only event but it doesn't match your event\nselector. The trail doesn't log the event.\n The PutEventSelectors operation must be called from the region in which the\ntrail was created; otherwise, an InvalidHomeRegionException is thrown.\n You can configure up to five event selectors for each trail. For more\ninformation, see Logging Data and Management Events for Trails\n(http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html)\nand Limits in AWS CloudTrail\n(https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)\nin the AWS CloudTrail User Guide." ([put-event-selectors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-event-selectors-request put-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEventSelectors", :http.request.configuration/output-deser-fn response-put-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "InvalidEventSelectorsException" :portkey.aws.cloudtrail.-2013-11-01/invalid-event-selectors-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef put-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response))

(clojure.core/defn get-event-selectors "Describes the settings for the event selectors that you configured for your\ntrail. The information returned for your event selectors includes the following:\n * If your event selector includes read-only events, write-only events, or all\nevents. This applies to both management events and data events.\n * If your event selector includes management events.\n * If your event selector includes data events, the Amazon S3 objects or AWS\nLambda functions that you are logging for data events.\n For more information, see Logging Data and Management Events for Trails\n(http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html)\nin the AWS CloudTrail User Guide." ([get-event-selectors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-event-selectors-request get-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEventSelectors", :http.request.configuration/output-deser-fn response-get-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response))

(clojure.core/defn lookup-events "Looks up management events\n(https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-management-events)\ncaptured by CloudTrail. Events for a region can be looked up in that region\nduring the last 90 days. Lookup supports the following attributes:\n * AWS access key\n * Event ID\n * Event name\n * Event source\n * Read only\n * Resource name\n * Resource type\n * User name\n All attributes are optional. The default number of results returned is 50, with\na maximum of 50 possible. The response includes a token that you can use to get\nthe next page of results.\n The rate of lookup requests is limited to one per second per account. If this\nlimit is exceeded, a throttling error occurs.\n Events that occurred during the selected time range will not be available for\nlookup if CloudTrail logging was not enabled when the events occurred." ([] (lookup-events {})) ([lookup-events-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-lookup-events-request lookup-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/lookup-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/lookup-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LookupEvents", :http.request.configuration/output-deser-fn response-lookup-events-response, :http.request.spec/error-spec {"InvalidLookupAttributesException" :portkey.aws.cloudtrail.-2013-11-01/invalid-lookup-attributes-exception, "InvalidTimeRangeException" :portkey.aws.cloudtrail.-2013-11-01/invalid-time-range-exception, "InvalidMaxResultsException" :portkey.aws.cloudtrail.-2013-11-01/invalid-max-results-exception, "InvalidNextTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef lookup-events :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/lookup-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/lookup-events-response))

(clojure.core/defn list-public-keys "Returns all public keys whose private keys were used to sign the digest files\nwithin the specified time range. The public key is needed to validate digest\nfiles that were signed with its corresponding private key.\n CloudTrail uses different private/public key pairs per region. Each digest file\nis signed with a private key unique to its region. Therefore, when you validate\na digest file from a particular region, you must look in the same region for its\ncorresponding public key." ([] (list-public-keys {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPublicKeys", :http.request.configuration/output-deser-fn response-list-public-keys-response, :http.request.spec/error-spec {"InvalidTimeRangeException" :portkey.aws.cloudtrail.-2013-11-01/invalid-time-range-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-public-keys :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response))

(clojure.core/defn add-tags "Adds one or more tags to a trail, up to a limit of 50. Tags must be unique per\ntrail. Overwrites an existing tag's value when a new value is specified for an\nexisting tag key. If you specify a key without a value, the tag will be created\nwith the specified key and a value of null. You can tag a trail that applies to\nall regions only from the region in which the trail was created (that is, from\nits home region)." ([add-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-tags-request add-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/add-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/add-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn response-add-tags-response, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "TagsLimitExceededException" :portkey.aws.cloudtrail.-2013-11-01/tags-limit-exceeded-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/add-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/add-tags-response))

(clojure.core/defn stop-logging "Suspends the recording of AWS API calls and log file delivery for the specified\ntrail. Under most circumstances, there is no need to use this action. You can\nupdate a trail without stopping it first. This action is the only way to stop\nrecording. For a trail enabled in all regions, this operation must be called\nfrom the region in which the trail was created, or an InvalidHomeRegionException\nwill occur. This operation cannot be called on the shadow trails (replicated\ntrails in other regions) of a trail enabled in all regions." ([stop-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-logging-request stop-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/stop-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/stop-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopLogging", :http.request.configuration/output-deser-fn response-stop-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef stop-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/stop-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/stop-logging-response))
