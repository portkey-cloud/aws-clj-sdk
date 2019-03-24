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

(clojure.core/defn- response-get-trail-status-response ([input] (response-get-trail-status-response nil input)) ([resultWrapper1539743 input] (clojure.core/let [rawinput1539742 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539744 {"TimeLoggingStopped" (rawinput1539742 "TimeLoggingStopped"), "LatestDeliveryError" (rawinput1539742 "LatestDeliveryError"), "LatestDeliveryTime" (rawinput1539742 "LatestDeliveryTime"), "LatestDigestDeliveryError" (rawinput1539742 "LatestDigestDeliveryError"), "LatestCloudWatchLogsDeliveryTime" (rawinput1539742 "LatestCloudWatchLogsDeliveryTime"), "LatestNotificationTime" (rawinput1539742 "LatestNotificationTime"), "StopLoggingTime" (rawinput1539742 "StopLoggingTime"), "TimeLoggingStarted" (rawinput1539742 "TimeLoggingStarted"), "StartLoggingTime" (rawinput1539742 "StartLoggingTime"), "LatestNotificationError" (rawinput1539742 "LatestNotificationError"), "LatestCloudWatchLogsDeliveryError" (rawinput1539742 "LatestCloudWatchLogsDeliveryError"), "LatestNotificationAttemptSucceeded" (rawinput1539742 "LatestNotificationAttemptSucceeded"), "LatestDeliveryAttemptSucceeded" (rawinput1539742 "LatestDeliveryAttemptSucceeded"), "LatestDeliveryAttemptTime" (rawinput1539742 "LatestDeliveryAttemptTime"), "IsLogging" (rawinput1539742 "IsLogging"), "LatestNotificationAttemptTime" (rawinput1539742 "LatestNotificationAttemptTime"), "LatestDigestDeliveryTime" (rawinput1539742 "LatestDigestDeliveryTime")}] (clojure.core/cond-> {} (letvar1539744 "TimeLoggingStopped") (clojure.core/assoc :time-logging-stopped (deser-string (clojure.core/get-in letvar1539744 ["TimeLoggingStopped"]))) (letvar1539744 "LatestDeliveryError") (clojure.core/assoc :latest-delivery-error (deser-string (clojure.core/get-in letvar1539744 ["LatestDeliveryError"]))) (letvar1539744 "LatestDeliveryTime") (clojure.core/assoc :latest-delivery-time (deser-date (clojure.core/get-in letvar1539744 ["LatestDeliveryTime"]))) (letvar1539744 "LatestDigestDeliveryError") (clojure.core/assoc :latest-digest-delivery-error (deser-string (clojure.core/get-in letvar1539744 ["LatestDigestDeliveryError"]))) (letvar1539744 "LatestCloudWatchLogsDeliveryTime") (clojure.core/assoc :latest-cloud-watch-logs-delivery-time (deser-date (clojure.core/get-in letvar1539744 ["LatestCloudWatchLogsDeliveryTime"]))) (letvar1539744 "LatestNotificationTime") (clojure.core/assoc :latest-notification-time (deser-date (clojure.core/get-in letvar1539744 ["LatestNotificationTime"]))) (letvar1539744 "StopLoggingTime") (clojure.core/assoc :stop-logging-time (deser-date (clojure.core/get-in letvar1539744 ["StopLoggingTime"]))) (letvar1539744 "TimeLoggingStarted") (clojure.core/assoc :time-logging-started (deser-string (clojure.core/get-in letvar1539744 ["TimeLoggingStarted"]))) (letvar1539744 "StartLoggingTime") (clojure.core/assoc :start-logging-time (deser-date (clojure.core/get-in letvar1539744 ["StartLoggingTime"]))) (letvar1539744 "LatestNotificationError") (clojure.core/assoc :latest-notification-error (deser-string (clojure.core/get-in letvar1539744 ["LatestNotificationError"]))) (letvar1539744 "LatestCloudWatchLogsDeliveryError") (clojure.core/assoc :latest-cloud-watch-logs-delivery-error (deser-string (clojure.core/get-in letvar1539744 ["LatestCloudWatchLogsDeliveryError"]))) (letvar1539744 "LatestNotificationAttemptSucceeded") (clojure.core/assoc :latest-notification-attempt-succeeded (deser-string (clojure.core/get-in letvar1539744 ["LatestNotificationAttemptSucceeded"]))) (letvar1539744 "LatestDeliveryAttemptSucceeded") (clojure.core/assoc :latest-delivery-attempt-succeeded (deser-string (clojure.core/get-in letvar1539744 ["LatestDeliveryAttemptSucceeded"]))) (letvar1539744 "LatestDeliveryAttemptTime") (clojure.core/assoc :latest-delivery-attempt-time (deser-string (clojure.core/get-in letvar1539744 ["LatestDeliveryAttemptTime"]))) (letvar1539744 "IsLogging") (clojure.core/assoc :is-logging (deser-boolean (clojure.core/get-in letvar1539744 ["IsLogging"]))) (letvar1539744 "LatestNotificationAttemptTime") (clojure.core/assoc :latest-notification-attempt-time (deser-string (clojure.core/get-in letvar1539744 ["LatestNotificationAttemptTime"]))) (letvar1539744 "LatestDigestDeliveryTime") (clojure.core/assoc :latest-digest-delivery-time (deser-date (clojure.core/get-in letvar1539744 ["LatestDigestDeliveryTime"])))))))

(clojure.core/defn- response-trail-not-found-exception ([input] (response-trail-not-found-exception nil input)) ([resultWrapper1539746 input] (clojure.core/let [rawinput1539745 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539747 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-trail-not-provided-exception ([input] (response-trail-not-provided-exception nil input)) ([resultWrapper1539749 input] (clojure.core/let [rawinput1539748 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539750 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-token-exception ([input] (response-invalid-token-exception nil input)) ([resultWrapper1539752 input] (clojure.core/let [rawinput1539751 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539753 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-logging-response ([input] (response-start-logging-response nil input)) ([resultWrapper1539755 input] (clojure.core/let [rawinput1539754 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539756 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper1539758 input] (clojure.core/let [rawinput1539757 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539759 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-prefix-exception ([input] (response-invalid-s-3-prefix-exception nil input)) ([resultWrapper1539761 input] (clojure.core/let [rawinput1539760 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539762 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-tags-response ([input] (response-remove-tags-response nil input)) ([resultWrapper1539764 input] (clojure.core/let [rawinput1539763 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539765 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tags-limit-exceeded-exception ([input] (response-tags-limit-exceeded-exception nil input)) ([resultWrapper1539767 input] (clojure.core/let [rawinput1539766 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539768 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-kms-key-id-exception ([input] (response-invalid-kms-key-id-exception nil input)) ([resultWrapper1539770 input] (clojure.core/let [rawinput1539769 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539771 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-event-selectors-response ([input] (response-get-event-selectors-response nil input)) ([resultWrapper1539773 input] (clojure.core/let [rawinput1539772 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539774 {"TrailARN" (rawinput1539772 "TrailARN"), "EventSelectors" (rawinput1539772 "EventSelectors")}] (clojure.core/cond-> {} (letvar1539774 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar1539774 ["TrailARN"]))) (letvar1539774 "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (clojure.core/get-in letvar1539774 ["EventSelectors"])))))))

(clojure.core/defn- response-update-trail-response ([input] (response-update-trail-response nil input)) ([resultWrapper1539776 input] (clojure.core/let [rawinput1539775 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539777 {"CloudWatchLogsLogGroupArn" (rawinput1539775 "CloudWatchLogsLogGroupArn"), "IncludeGlobalServiceEvents" (rawinput1539775 "IncludeGlobalServiceEvents"), "S3BucketName" (rawinput1539775 "S3BucketName"), "IsOrganizationTrail" (rawinput1539775 "IsOrganizationTrail"), "TrailARN" (rawinput1539775 "TrailARN"), "SnsTopicARN" (rawinput1539775 "SnsTopicARN"), "CloudWatchLogsRoleArn" (rawinput1539775 "CloudWatchLogsRoleArn"), "KmsKeyId" (rawinput1539775 "KmsKeyId"), "LogFileValidationEnabled" (rawinput1539775 "LogFileValidationEnabled"), "S3KeyPrefix" (rawinput1539775 "S3KeyPrefix"), "SnsTopicName" (rawinput1539775 "SnsTopicName"), "Name" (rawinput1539775 "Name"), "IsMultiRegionTrail" (rawinput1539775 "IsMultiRegionTrail")}] (clojure.core/cond-> {} (letvar1539777 "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (clojure.core/get-in letvar1539777 ["CloudWatchLogsLogGroupArn"]))) (letvar1539777 "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (clojure.core/get-in letvar1539777 ["IncludeGlobalServiceEvents"]))) (letvar1539777 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar1539777 ["S3BucketName"]))) (letvar1539777 "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (clojure.core/get-in letvar1539777 ["IsOrganizationTrail"]))) (letvar1539777 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar1539777 ["TrailARN"]))) (letvar1539777 "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar1539777 ["SnsTopicARN"]))) (letvar1539777 "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (clojure.core/get-in letvar1539777 ["CloudWatchLogsRoleArn"]))) (letvar1539777 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (clojure.core/get-in letvar1539777 ["KmsKeyId"]))) (letvar1539777 "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (clojure.core/get-in letvar1539777 ["LogFileValidationEnabled"]))) (letvar1539777 "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (clojure.core/get-in letvar1539777 ["S3KeyPrefix"]))) (letvar1539777 "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (clojure.core/get-in letvar1539777 ["SnsTopicName"]))) (letvar1539777 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1539777 ["Name"]))) (letvar1539777 "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (clojure.core/get-in letvar1539777 ["IsMultiRegionTrail"])))))))

(clojure.core/defn- response-put-event-selectors-response ([input] (response-put-event-selectors-response nil input)) ([resultWrapper1539779 input] (clojure.core/let [rawinput1539778 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539780 {"TrailARN" (rawinput1539778 "TrailARN"), "EventSelectors" (rawinput1539778 "EventSelectors")}] (clojure.core/cond-> {} (letvar1539780 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar1539780 ["TrailARN"]))) (letvar1539780 "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (clojure.core/get-in letvar1539780 ["EventSelectors"])))))))

(clojure.core/defn- response-insufficient-dependency-service-access-permission-exception ([input] (response-insufficient-dependency-service-access-permission-exception nil input)) ([resultWrapper1539782 input] (clojure.core/let [rawinput1539781 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539783 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-key-disabled-exception ([input] (response-kms-key-disabled-exception nil input)) ([resultWrapper1539785 input] (clojure.core/let [rawinput1539784 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539786 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1539788 input] (clojure.core/let [rawinput1539787 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539789 {"ResourceTagList" (rawinput1539787 "ResourceTagList"), "NextToken" (rawinput1539787 "NextToken")}] (clojure.core/cond-> {} (letvar1539789 "ResourceTagList") (clojure.core/assoc :resource-tag-list (deser-resource-tag-list (clojure.core/get-in letvar1539789 ["ResourceTagList"]))) (letvar1539789 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1539789 ["NextToken"])))))))

(clojure.core/defn- response-invalid-event-selectors-exception ([input] (response-invalid-event-selectors-exception nil input)) ([resultWrapper1539791 input] (clojure.core/let [rawinput1539790 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539792 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-home-region-exception ([input] (response-invalid-home-region-exception nil input)) ([resultWrapper1539794 input] (clojure.core/let [rawinput1539793 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539795 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-s-3-bucket-does-not-exist-exception ([input] (response-s-3-bucket-does-not-exist-exception nil input)) ([resultWrapper1539797 input] (clojure.core/let [rawinput1539796 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539798 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-max-results-exception ([input] (response-invalid-max-results-exception nil input)) ([resultWrapper1539800 input] (clojure.core/let [rawinput1539799 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539801 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-sns-topic-policy-exception ([input] (response-insufficient-sns-topic-policy-exception nil input)) ([resultWrapper1539803 input] (clojure.core/let [rawinput1539802 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539804 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-logging-response ([input] (response-stop-logging-response nil input)) ([resultWrapper1539806 input] (clojure.core/let [rawinput1539805 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539807 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-trail-arn-invalid-exception ([input] (response-cloud-trail-arn-invalid-exception nil input)) ([resultWrapper1539809 input] (clojure.core/let [rawinput1539808 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539810 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-number-of-trails-exceeded-exception ([input] (response-maximum-number-of-trails-exceeded-exception nil input)) ([resultWrapper1539812 input] (clojure.core/let [rawinput1539811 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539813 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-exception ([input] (response-kms-exception nil input)) ([resultWrapper1539815 input] (clojure.core/let [rawinput1539814 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539816 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-public-keys-response ([input] (response-list-public-keys-response nil input)) ([resultWrapper1539818 input] (clojure.core/let [rawinput1539817 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539819 {"PublicKeyList" (rawinput1539817 "PublicKeyList"), "NextToken" (rawinput1539817 "NextToken")}] (clojure.core/cond-> {} (letvar1539819 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar1539819 ["PublicKeyList"]))) (letvar1539819 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1539819 ["NextToken"])))))))

(clojure.core/defn- response-create-trail-response ([input] (response-create-trail-response nil input)) ([resultWrapper1539821 input] (clojure.core/let [rawinput1539820 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539822 {"CloudWatchLogsLogGroupArn" (rawinput1539820 "CloudWatchLogsLogGroupArn"), "IncludeGlobalServiceEvents" (rawinput1539820 "IncludeGlobalServiceEvents"), "S3BucketName" (rawinput1539820 "S3BucketName"), "IsOrganizationTrail" (rawinput1539820 "IsOrganizationTrail"), "TrailARN" (rawinput1539820 "TrailARN"), "SnsTopicARN" (rawinput1539820 "SnsTopicARN"), "CloudWatchLogsRoleArn" (rawinput1539820 "CloudWatchLogsRoleArn"), "KmsKeyId" (rawinput1539820 "KmsKeyId"), "LogFileValidationEnabled" (rawinput1539820 "LogFileValidationEnabled"), "S3KeyPrefix" (rawinput1539820 "S3KeyPrefix"), "SnsTopicName" (rawinput1539820 "SnsTopicName"), "Name" (rawinput1539820 "Name"), "IsMultiRegionTrail" (rawinput1539820 "IsMultiRegionTrail")}] (clojure.core/cond-> {} (letvar1539822 "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (clojure.core/get-in letvar1539822 ["CloudWatchLogsLogGroupArn"]))) (letvar1539822 "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (clojure.core/get-in letvar1539822 ["IncludeGlobalServiceEvents"]))) (letvar1539822 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar1539822 ["S3BucketName"]))) (letvar1539822 "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (clojure.core/get-in letvar1539822 ["IsOrganizationTrail"]))) (letvar1539822 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar1539822 ["TrailARN"]))) (letvar1539822 "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar1539822 ["SnsTopicARN"]))) (letvar1539822 "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (clojure.core/get-in letvar1539822 ["CloudWatchLogsRoleArn"]))) (letvar1539822 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (clojure.core/get-in letvar1539822 ["KmsKeyId"]))) (letvar1539822 "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (clojure.core/get-in letvar1539822 ["LogFileValidationEnabled"]))) (letvar1539822 "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (clojure.core/get-in letvar1539822 ["S3KeyPrefix"]))) (letvar1539822 "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (clojure.core/get-in letvar1539822 ["SnsTopicName"]))) (letvar1539822 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1539822 ["Name"]))) (letvar1539822 "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (clojure.core/get-in letvar1539822 ["IsMultiRegionTrail"])))))))

(clojure.core/defn- response-invalid-tag-parameter-exception ([input] (response-invalid-tag-parameter-exception nil input)) ([resultWrapper1539824 input] (clojure.core/let [rawinput1539823 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539825 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-trail-access-not-enabled-exception ([input] (response-cloud-trail-access-not-enabled-exception nil input)) ([resultWrapper1539827 input] (clojure.core/let [rawinput1539826 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539828 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-lookup-events-response ([input] (response-lookup-events-response nil input)) ([resultWrapper1539830 input] (clojure.core/let [rawinput1539829 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539831 {"Events" (rawinput1539829 "Events"), "NextToken" (rawinput1539829 "NextToken")}] (clojure.core/cond-> {} (letvar1539831 "Events") (clojure.core/assoc :events (deser-events-list (clojure.core/get-in letvar1539831 ["Events"]))) (letvar1539831 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1539831 ["NextToken"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1539833 input] (clojure.core/let [rawinput1539832 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539834 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-sns-topic-name-exception ([input] (response-invalid-sns-topic-name-exception nil input)) ([resultWrapper1539836 input] (clojure.core/let [rawinput1539835 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539837 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-trail-already-exists-exception ([input] (response-trail-already-exists-exception nil input)) ([resultWrapper1539839 input] (clojure.core/let [rawinput1539838 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539840 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-trail-name-exception ([input] (response-invalid-trail-name-exception nil input)) ([resultWrapper1539842 input] (clojure.core/let [rawinput1539841 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539843 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1539845 input] (clojure.core/let [rawinput1539844 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539846 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-cloud-watch-logs-log-group-arn-exception ([input] (response-invalid-cloud-watch-logs-log-group-arn-exception nil input)) ([resultWrapper1539848 input] (clojure.core/let [rawinput1539847 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539849 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-operation-exception ([input] (response-unsupported-operation-exception nil input)) ([resultWrapper1539851 input] (clojure.core/let [rawinput1539850 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539852 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-trail-response ([input] (response-delete-trail-response nil input)) ([resultWrapper1539854 input] (clojure.core/let [rawinput1539853 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539855 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-lookup-attributes-exception ([input] (response-invalid-lookup-attributes-exception nil input)) ([resultWrapper1539857 input] (clojure.core/let [rawinput1539856 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539858 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-s-3-bucket-policy-exception ([input] (response-insufficient-s-3-bucket-policy-exception nil input)) ([resultWrapper1539860 input] (clojure.core/let [rawinput1539859 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539861 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-combination-exception ([input] (response-invalid-parameter-combination-exception nil input)) ([resultWrapper1539863 input] (clojure.core/let [rawinput1539862 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539864 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-watch-logs-delivery-unavailable-exception ([input] (response-cloud-watch-logs-delivery-unavailable-exception nil input)) ([resultWrapper1539866 input] (clojure.core/let [rawinput1539865 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539867 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-trails-response ([input] (response-describe-trails-response nil input)) ([resultWrapper1539869 input] (clojure.core/let [rawinput1539868 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539870 {"trailList" (rawinput1539868 "trailList")}] (clojure.core/cond-> {} (letvar1539870 "trailList") (clojure.core/assoc :trail-list (deser-trail-list (clojure.core/get-in letvar1539870 ["trailList"])))))))

(clojure.core/defn- response-not-organization-master-account-exception ([input] (response-not-organization-master-account-exception nil input)) ([resultWrapper1539872 input] (clojure.core/let [rawinput1539871 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539873 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-tags-response ([input] (response-add-tags-response nil input)) ([resultWrapper1539875 input] (clojure.core/let [rawinput1539874 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539876 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-key-not-found-exception ([input] (response-kms-key-not-found-exception nil input)) ([resultWrapper1539878 input] (clojure.core/let [rawinput1539877 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539879 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-organization-not-in-all-features-mode-exception ([input] (response-organization-not-in-all-features-mode-exception nil input)) ([resultWrapper1539881 input] (clojure.core/let [rawinput1539880 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539882 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-encryption-policy-exception ([input] (response-insufficient-encryption-policy-exception nil input)) ([resultWrapper1539884 input] (clojure.core/let [rawinput1539883 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539885 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-type-not-supported-exception ([input] (response-resource-type-not-supported-exception nil input)) ([resultWrapper1539887 input] (clojure.core/let [rawinput1539886 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539888 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-time-range-exception ([input] (response-invalid-time-range-exception nil input)) ([resultWrapper1539890 input] (clojure.core/let [rawinput1539889 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539891 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-cloud-watch-logs-role-arn-exception ([input] (response-invalid-cloud-watch-logs-role-arn-exception nil input)) ([resultWrapper1539893 input] (clojure.core/let [rawinput1539892 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539894 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-organizations-not-in-use-exception ([input] (response-organizations-not-in-use-exception nil input)) ([resultWrapper1539896 input] (clojure.core/let [rawinput1539895 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539897 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-bucket-name-exception ([input] (response-invalid-s-3-bucket-name-exception nil input)) ([resultWrapper1539899 input] (clojure.core/let [rawinput1539898 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1539900 {}] (clojure.core/cond-> {}))))

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

(clojure.core/defn remove-tags ([remove-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-remove-tags-request remove-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/remove-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/remove-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn response-remove-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/remove-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/remove-tags-response))

(clojure.core/defn start-logging ([start-logging-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-logging-request start-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/start-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/start-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartLogging", :http.request.configuration/output-deser-fn response-start-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef start-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/start-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/start-logging-response))

(clojure.core/defn delete-trail ([delete-trail-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-trail-request delete-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/delete-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/delete-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTrail", :http.request.configuration/output-deser-fn response-delete-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef delete-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/delete-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/delete-trail-response))

(clojure.core/defn update-trail ([update-trail-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-trail-request update-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/update-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/update-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTrail", :http.request.configuration/output-deser-fn response-update-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "TrailNotProvidedException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail.-2013-11-01/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-sns-topic-policy-exception, "KmsException" :portkey.aws.cloudtrail.-2013-11-01/kms-exception, "CloudTrailAccessNotEnabledException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-access-not-enabled-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-sns-topic-name-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail.-2013-11-01/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail.-2013-11-01/cloud-watch-logs-delivery-unavailable-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception, "OrganizationNotInAllFeaturesModeException" :portkey.aws.cloudtrail.-2013-11-01/organization-not-in-all-features-mode-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-role-arn-exception, "OrganizationsNotInUseException" :portkey.aws.cloudtrail.-2013-11-01/organizations-not-in-use-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef update-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/update-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/update-trail-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/list-tags-response))

(clojure.core/defn describe-trails ([] (describe-trails {})) ([describe-trails-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-trails-request describe-trails-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/describe-trails-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrails", :http.request.configuration/output-deser-fn response-describe-trails-response, :http.request.spec/error-spec {"UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef describe-trails :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/describe-trails-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/describe-trails-response))

(clojure.core/defn create-trail ([create-trail-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-trail-request create-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/create-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/create-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrail", :http.request.configuration/output-deser-fn response-create-trail-response, :http.request.spec/error-spec {"TrailNotProvidedException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail.-2013-11-01/invalid-kms-key-id-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-disabled-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail.-2013-11-01/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-sns-topic-policy-exception, "MaximumNumberOfTrailsExceededException" :portkey.aws.cloudtrail.-2013-11-01/maximum-number-of-trails-exceeded-exception, "KmsException" :portkey.aws.cloudtrail.-2013-11-01/kms-exception, "CloudTrailAccessNotEnabledException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-access-not-enabled-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-sns-topic-name-exception, "TrailAlreadyExistsException" :portkey.aws.cloudtrail.-2013-11-01/trail-already-exists-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail.-2013-11-01/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail.-2013-11-01/cloud-watch-logs-delivery-unavailable-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/kms-key-not-found-exception, "OrganizationNotInAllFeaturesModeException" :portkey.aws.cloudtrail.-2013-11-01/organization-not-in-all-features-mode-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail.-2013-11-01/invalid-cloud-watch-logs-role-arn-exception, "OrganizationsNotInUseException" :portkey.aws.cloudtrail.-2013-11-01/organizations-not-in-use-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef create-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/create-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/create-trail-response))

(clojure.core/defn get-trail-status ([get-trail-status-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-trail-status-request get-trail-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTrailStatus", :http.request.configuration/output-deser-fn response-get-trail-status-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception}})))))
(clojure.spec.alpha/fdef get-trail-status :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/get-trail-status-response))

(clojure.core/defn put-event-selectors ([put-event-selectors-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-event-selectors-request put-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEventSelectors", :http.request.configuration/output-deser-fn response-put-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "InvalidEventSelectorsException" :portkey.aws.cloudtrail.-2013-11-01/invalid-event-selectors-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef put-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/put-event-selectors-response))

(clojure.core/defn get-event-selectors ([get-event-selectors-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-event-selectors-request get-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEventSelectors", :http.request.configuration/output-deser-fn response-get-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/get-event-selectors-response))

(clojure.core/defn lookup-events ([] (lookup-events {})) ([lookup-events-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-lookup-events-request lookup-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/lookup-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/lookup-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LookupEvents", :http.request.configuration/output-deser-fn response-lookup-events-response, :http.request.spec/error-spec {"InvalidLookupAttributesException" :portkey.aws.cloudtrail.-2013-11-01/invalid-lookup-attributes-exception, "InvalidTimeRangeException" :portkey.aws.cloudtrail.-2013-11-01/invalid-time-range-exception, "InvalidMaxResultsException" :portkey.aws.cloudtrail.-2013-11-01/invalid-max-results-exception, "InvalidNextTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef lookup-events :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/lookup-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/lookup-events-response))

(clojure.core/defn list-public-keys ([] (list-public-keys {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPublicKeys", :http.request.configuration/output-deser-fn response-list-public-keys-response, :http.request.spec/error-spec {"InvalidTimeRangeException" :portkey.aws.cloudtrail.-2013-11-01/invalid-time-range-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail.-2013-11-01/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-public-keys :args (clojure.spec.alpha/? :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/list-public-keys-response))

(clojure.core/defn add-tags ([add-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-add-tags-request add-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/add-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/add-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn response-add-tags-response, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "TagsLimitExceededException" :portkey.aws.cloudtrail.-2013-11-01/tags-limit-exceeded-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail.-2013-11-01/cloud-trail-arn-invalid-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail.-2013-11-01/invalid-tag-parameter-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "ResourceNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/resource-not-found-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail.-2013-11-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/add-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/add-tags-response))

(clojure.core/defn stop-logging ([stop-logging-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-stop-logging-request stop-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail.-2013-11-01/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail.-2013-11-01/stop-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail.-2013-11-01/stop-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopLogging", :http.request.configuration/output-deser-fn response-stop-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail.-2013-11-01/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail.-2013-11-01/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail.-2013-11-01/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail.-2013-11-01/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail.-2013-11-01/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail.-2013-11-01/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail.-2013-11-01/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef stop-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail.-2013-11-01/stop-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail.-2013-11-01/stop-logging-response))
