(ns portkey.aws.es.-2015-01-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "es", :region "ap-northeast-1"},
    :ssl-common-name "es.ap-northeast-1.amazonaws.com",
    :endpoint "https://es.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "es", :region "eu-west-1"},
    :ssl-common-name "es.eu-west-1.amazonaws.com",
    :endpoint "https://es.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "es", :region "us-east-2"},
    :ssl-common-name "es.us-east-2.amazonaws.com",
    :endpoint "https://es.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "es", :region "ap-southeast-2"},
    :ssl-common-name "es.ap-southeast-2.amazonaws.com",
    :endpoint "https://es.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "es", :region "sa-east-1"},
    :ssl-common-name "es.sa-east-1.amazonaws.com",
    :endpoint "https://es.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "es", :region "ap-southeast-1"},
    :ssl-common-name "es.ap-southeast-1.amazonaws.com",
    :endpoint "https://es.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "es", :region "cn-northwest-1"},
    :ssl-common-name "es.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://es.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "es", :region "ap-northeast-2"},
    :ssl-common-name "es.ap-northeast-2.amazonaws.com",
    :endpoint "https://es.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "es", :region "eu-west-3"},
    :ssl-common-name "es.eu-west-3.amazonaws.com",
    :endpoint "https://es.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "es", :region "ca-central-1"},
    :ssl-common-name "es.ca-central-1.amazonaws.com",
    :endpoint "https://es.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "es", :region "eu-central-1"},
    :ssl-common-name "es.eu-central-1.amazonaws.com",
    :endpoint "https://es.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "es", :region "eu-west-2"},
    :ssl-common-name "es.eu-west-2.amazonaws.com",
    :endpoint "https://es.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "es", :region "us-gov-west-1"},
    :ssl-common-name "es.us-gov-west-1.amazonaws.com",
    :endpoint "https://es.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "es", :region "us-west-2"},
    :ssl-common-name "es.us-west-2.amazonaws.com",
    :endpoint "https://es.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "es", :region "us-east-1"},
    :ssl-common-name "es.us-east-1.amazonaws.com",
    :endpoint "https://es.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "es", :region "us-west-1"},
    :ssl-common-name "es.us-west-1.amazonaws.com",
    :endpoint "https://es.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "es", :region "ap-south-1"},
    :ssl-common-name "es.ap-south-1.amazonaws.com",
    :endpoint "https://es.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-snapshot-options)

(clojure.core/declare ser-log-publishing-option)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-ebs-options)

(clojure.core/declare ser-cloud-watch-logs-log-group-arn)

(clojure.core/declare ser-instance-count)

(clojure.core/declare ser-node-to-node-encryption-options)

(clojure.core/declare ser-reservation-token)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-identity-pool-id)

(clojure.core/declare ser-user-pool-id)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-cognito-options)

(clojure.core/declare ser-domain-name-list)

(clojure.core/declare ser-log-type)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-elasticsearch-cluster-config)

(clojure.core/declare ser-es-partition-instance-type)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-policy-document)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-string)

(clojure.core/declare ser-integer-class)

(clojure.core/declare ser-advanced-options)

(clojure.core/declare ser-log-publishing-options)

(clojure.core/declare ser-encryption-at-rest-options)

(clojure.core/declare ser-volume-type)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-elasticsearch-version-string)

(clojure.core/declare ser-vpc-options)

(clojure.core/declare ser-guid)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-snapshot-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SnapshotOptions", :type "structure"} (clojure.core/contains? input :automated-snapshot-start-hour) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :automated-snapshot-start-hour)) #:http.request.field{:name "AutomatedSnapshotStartHour", :shape "IntegerClass"}))))

(clojure.core/defn- ser-log-publishing-option [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LogPublishingOption", :type "structure"} (clojure.core/contains? input :cloud-watch-logs-log-group-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-log-group-arn (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "CloudWatchLogsLogGroupArn"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "Boolean"}))))

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-ebs-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EBSOptions", :type "structure"} (clojure.core/contains? input :ebs-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :ebs-enabled)) #:http.request.field{:name "EBSEnabled", :shape "Boolean"})) (clojure.core/contains? input :volume-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-type (input :volume-type)) #:http.request.field{:name "VolumeType", :shape "VolumeType"})) (clojure.core/contains? input :volume-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :volume-size)) #:http.request.field{:name "VolumeSize", :shape "IntegerClass"})) (clojure.core/contains? input :iops) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :iops)) #:http.request.field{:name "Iops", :shape "IntegerClass"}))))

(clojure.core/defn- ser-cloud-watch-logs-log-group-arn [input] #:http.request.field{:value input, :shape "CloudWatchLogsLogGroupArn"})

(clojure.core/defn- ser-instance-count [input] #:http.request.field{:value input, :shape "InstanceCount"})

(clojure.core/defn- ser-node-to-node-encryption-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NodeToNodeEncryptionOptions", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "Boolean"}))))

(clojure.core/defn- ser-reservation-token [input] #:http.request.field{:value input, :shape "ReservationToken"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "ARN"})

(clojure.core/defn- ser-identity-pool-id [input] #:http.request.field{:value input, :shape "IdentityPoolId"})

(clojure.core/defn- ser-user-pool-id [input] #:http.request.field{:value input, :shape "UserPoolId"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-cognito-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CognitoOptions", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "Boolean"})) (clojure.core/contains? input :user-pool-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-id (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolId"})) (clojure.core/contains? input :identity-pool-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}))))

(clojure.core/defn- ser-domain-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-name coll) #:http.request.field{:shape "DomainName"}))) input), :shape "DomainNameList", :type "list"})

(clojure.core/defn- ser-log-type [input] #:http.request.field{:value (clojure.core/get {"INDEX_SLOW_LOGS" "INDEX_SLOW_LOGS", :index-slow-logs "INDEX_SLOW_LOGS", "SEARCH_SLOW_LOGS" "SEARCH_SLOW_LOGS", :search-slow-logs "SEARCH_SLOW_LOGS", "ES_APPLICATION_LOGS" "ES_APPLICATION_LOGS", :es-application-logs "ES_APPLICATION_LOGS"} input), :shape "LogType"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-elasticsearch-cluster-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ElasticsearchClusterConfig", :type "structure"} (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-es-partition-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "ESPartitionInstanceType"})) (clojure.core/contains? input :instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :instance-count)) #:http.request.field{:name "InstanceCount", :shape "IntegerClass"})) (clojure.core/contains? input :dedicated-master-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :dedicated-master-enabled)) #:http.request.field{:name "DedicatedMasterEnabled", :shape "Boolean"})) (clojure.core/contains? input :zone-awareness-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :zone-awareness-enabled)) #:http.request.field{:name "ZoneAwarenessEnabled", :shape "Boolean"})) (clojure.core/contains? input :dedicated-master-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-es-partition-instance-type (input :dedicated-master-type)) #:http.request.field{:name "DedicatedMasterType", :shape "ESPartitionInstanceType"})) (clojure.core/contains? input :dedicated-master-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :dedicated-master-count)) #:http.request.field{:name "DedicatedMasterCount", :shape "IntegerClass"}))))

(clojure.core/defn- ser-es-partition-instance-type [input] #:http.request.field{:value (clojure.core/get {"i3.large.elasticsearch" "i3.large.elasticsearch", :m-32xlargeelasticsearch "m3.2xlarge.elasticsearch", :r-48xlargeelasticsearch "r4.8xlarge.elasticsearch", :m-3xlargeelasticsearch "m3.xlarge.elasticsearch", "m4.2xlarge.elasticsearch" "m4.2xlarge.elasticsearch", :m-42xlargeelasticsearch "m4.2xlarge.elasticsearch", :t-2mediumelasticsearch "t2.medium.elasticsearch", "d2.4xlarge.elasticsearch" "d2.4xlarge.elasticsearch", :r-416xlargeelasticsearch "r4.16xlarge.elasticsearch", "t2.micro.elasticsearch" "t2.micro.elasticsearch", "r3.2xlarge.elasticsearch" "r3.2xlarge.elasticsearch", "c4.large.elasticsearch" "c4.large.elasticsearch", "r4.2xlarge.elasticsearch" "r4.2xlarge.elasticsearch", :m-3mediumelasticsearch "m3.medium.elasticsearch", "m4.xlarge.elasticsearch" "m4.xlarge.elasticsearch", :m-4largeelasticsearch "m4.large.elasticsearch", :c-48xlargeelasticsearch "c4.8xlarge.elasticsearch", "m3.xlarge.elasticsearch" "m3.xlarge.elasticsearch", "i2.2xlarge.elasticsearch" "i2.2xlarge.elasticsearch", :t-2microelasticsearch "t2.micro.elasticsearch", :i-3largeelasticsearch "i3.large.elasticsearch", "r4.8xlarge.elasticsearch" "r4.8xlarge.elasticsearch", "r4.large.elasticsearch" "r4.large.elasticsearch", "r3.xlarge.elasticsearch" "r3.xlarge.elasticsearch", "r3.4xlarge.elasticsearch" "r3.4xlarge.elasticsearch", "r4.16xlarge.elasticsearch" "r4.16xlarge.elasticsearch", "i3.8xlarge.elasticsearch" "i3.8xlarge.elasticsearch", "m3.medium.elasticsearch" "m3.medium.elasticsearch", "i3.16xlarge.elasticsearch" "i3.16xlarge.elasticsearch", :m-4xlargeelasticsearch "m4.xlarge.elasticsearch", "i3.4xlarge.elasticsearch" "i3.4xlarge.elasticsearch", "t2.medium.elasticsearch" "t2.medium.elasticsearch", :d-2xlargeelasticsearch "d2.xlarge.elasticsearch", :i-34xlargeelasticsearch "i3.4xlarge.elasticsearch", :i-2xlargeelasticsearch "i2.xlarge.elasticsearch", "c4.xlarge.elasticsearch" "c4.xlarge.elasticsearch", :i-38xlargeelasticsearch "i3.8xlarge.elasticsearch", :i-316xlargeelasticsearch "i3.16xlarge.elasticsearch", "i3.xlarge.elasticsearch" "i3.xlarge.elasticsearch", "r4.4xlarge.elasticsearch" "r4.4xlarge.elasticsearch", "d2.2xlarge.elasticsearch" "d2.2xlarge.elasticsearch", :r-3largeelasticsearch "r3.large.elasticsearch", "m4.large.elasticsearch" "m4.large.elasticsearch", :d-24xlargeelasticsearch "d2.4xlarge.elasticsearch", :c-4largeelasticsearch "c4.large.elasticsearch", :d-28xlargeelasticsearch "d2.8xlarge.elasticsearch", :r-38xlargeelasticsearch "r3.8xlarge.elasticsearch", "t2.small.elasticsearch" "t2.small.elasticsearch", :m-3largeelasticsearch "m3.large.elasticsearch", "m4.4xlarge.elasticsearch" "m4.4xlarge.elasticsearch", :r-42xlargeelasticsearch "r4.2xlarge.elasticsearch", :c-4xlargeelasticsearch "c4.xlarge.elasticsearch", :m-44xlargeelasticsearch "m4.4xlarge.elasticsearch", :m-410xlargeelasticsearch "m4.10xlarge.elasticsearch", :t-2smallelasticsearch "t2.small.elasticsearch", "d2.8xlarge.elasticsearch" "d2.8xlarge.elasticsearch", :i-22xlargeelasticsearch "i2.2xlarge.elasticsearch", :c-44xlargeelasticsearch "c4.4xlarge.elasticsearch", "c4.2xlarge.elasticsearch" "c4.2xlarge.elasticsearch", :r-4xlargeelasticsearch "r4.xlarge.elasticsearch", "r3.large.elasticsearch" "r3.large.elasticsearch", :d-22xlargeelasticsearch "d2.2xlarge.elasticsearch", "m3.2xlarge.elasticsearch" "m3.2xlarge.elasticsearch", "m4.10xlarge.elasticsearch" "m4.10xlarge.elasticsearch", :r-34xlargeelasticsearch "r3.4xlarge.elasticsearch", "d2.xlarge.elasticsearch" "d2.xlarge.elasticsearch", :i-3xlargeelasticsearch "i3.xlarge.elasticsearch", :r-44xlargeelasticsearch "r4.4xlarge.elasticsearch", "m3.large.elasticsearch" "m3.large.elasticsearch", :r-32xlargeelasticsearch "r3.2xlarge.elasticsearch", :r-3xlargeelasticsearch "r3.xlarge.elasticsearch", "i2.xlarge.elasticsearch" "i2.xlarge.elasticsearch", :i-32xlargeelasticsearch "i3.2xlarge.elasticsearch", "r4.xlarge.elasticsearch" "r4.xlarge.elasticsearch", :c-42xlargeelasticsearch "c4.2xlarge.elasticsearch", "i3.2xlarge.elasticsearch" "i3.2xlarge.elasticsearch", "c4.4xlarge.elasticsearch" "c4.4xlarge.elasticsearch", "c4.8xlarge.elasticsearch" "c4.8xlarge.elasticsearch", :r-4largeelasticsearch "r4.large.elasticsearch", "r3.8xlarge.elasticsearch" "r3.8xlarge.elasticsearch"} input), :shape "ESPartitionInstanceType"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-policy-document [input] #:http.request.field{:value input, :shape "PolicyDocument"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-integer-class [input] #:http.request.field{:value input, :shape "IntegerClass"})

(clojure.core/defn- ser-advanced-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "AdvancedOptions", :type "map"})

(clojure.core/defn- ser-log-publishing-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-log-type k) #:http.request.field{:map-info "key", :shape "LogType"}) (clojure.core/into (ser-log-publishing-option v) #:http.request.field{:map-info "value", :shape "LogPublishingOption"})])) input), :shape "LogPublishingOptions", :type "map"})

(clojure.core/defn- ser-encryption-at-rest-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EncryptionAtRestOptions", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "Boolean"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-volume-type [input] #:http.request.field{:value (clojure.core/get {"standard" "standard", :standard "standard", "gp2" "gp2", :gp-2 "gp2", "io1" "io1", :io-1 "io1"} input), :shape "VolumeType"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-elasticsearch-version-string [input] #:http.request.field{:value input, :shape "ElasticsearchVersionString"})

(clojure.core/defn- ser-vpc-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VPCOptions", :type "structure"} (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "StringList"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "StringList"}))))

(clojure.core/defn- ser-guid [input] #:http.request.field{:value input, :shape "GUID"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-describe-reserved-elasticsearch-instance-offerings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :reserved-elasticsearch-instance-offering-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-guid (input :reserved-elasticsearch-instance-offering-id)) #:http.request.field{:name "ReservedElasticsearchInstanceOfferingId", :shape "GUID", :location "querystring", :location-name "offeringId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-elasticsearch-domain-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "uri", :location-name "DomainName"})]} (clojure.core/contains? input :snapshot-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-options (input :snapshot-options)) #:http.request.field{:name "SnapshotOptions", :shape "SnapshotOptions"})) (clojure.core/contains? input :ebs-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-options (input :ebs-options)) #:http.request.field{:name "EBSOptions", :shape "EBSOptions"})) (clojure.core/contains? input :access-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-document (input :access-policies)) #:http.request.field{:name "AccessPolicies", :shape "PolicyDocument"})) (clojure.core/contains? input :cognito-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-options (input :cognito-options)) #:http.request.field{:name "CognitoOptions", :shape "CognitoOptions"})) (clojure.core/contains? input :elasticsearch-cluster-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-cluster-config (input :elasticsearch-cluster-config)) #:http.request.field{:name "ElasticsearchClusterConfig", :shape "ElasticsearchClusterConfig"})) (clojure.core/contains? input :advanced-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-advanced-options (input :advanced-options)) #:http.request.field{:name "AdvancedOptions", :shape "AdvancedOptions"})) (clojure.core/contains? input :log-publishing-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-publishing-options (input :log-publishing-options)) #:http.request.field{:name "LogPublishingOptions", :shape "LogPublishingOptions"})) (clojure.core/contains? input :vpc-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-options (input :vpc-options)) #:http.request.field{:name "VPCOptions", :shape "VPCOptions"}))))

(clojure.core/defn- req-get-upgrade-history-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "uri", :location-name "DomainName"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-list-elasticsearch-instance-types-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-elasticsearch-version-string (input :elasticsearch-version)) #:http.request.field{:name "ElasticsearchVersion", :shape "ElasticsearchVersionString", :location "uri", :location-name "ElasticsearchVersion"})]} (clojure.core/contains? input :domain-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "querystring", :location-name "domainName"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-delete-elasticsearch-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "uri", :location-name "DomainName"})]}))

(clojure.core/defn- req-remove-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "ARN", :shape "ARN"}) (clojure.core/into (ser-string-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "StringList"})]}))

(clojure.core/defn- req-add-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "ARN", :shape "ARN"}) (clojure.core/into (ser-tag-list (input :tag-list)) #:http.request.field{:name "TagList", :shape "TagList"})]}))

(clojure.core/defn- req-list-elasticsearch-versions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-get-compatible-elasticsearch-versions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :domain-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "querystring", :location-name "domainName"}))))

(clojure.core/defn- req-describe-elasticsearch-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "uri", :location-name "DomainName"})]}))

(clojure.core/defn- req-create-elasticsearch-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :snapshot-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-options (input :snapshot-options)) #:http.request.field{:name "SnapshotOptions", :shape "SnapshotOptions"})) (clojure.core/contains? input :ebs-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-options (input :ebs-options)) #:http.request.field{:name "EBSOptions", :shape "EBSOptions"})) (clojure.core/contains? input :elasticsearch-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-version-string (input :elasticsearch-version)) #:http.request.field{:name "ElasticsearchVersion", :shape "ElasticsearchVersionString"})) (clojure.core/contains? input :node-to-node-encryption-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-node-to-node-encryption-options (input :node-to-node-encryption-options)) #:http.request.field{:name "NodeToNodeEncryptionOptions", :shape "NodeToNodeEncryptionOptions"})) (clojure.core/contains? input :access-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-document (input :access-policies)) #:http.request.field{:name "AccessPolicies", :shape "PolicyDocument"})) (clojure.core/contains? input :cognito-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-options (input :cognito-options)) #:http.request.field{:name "CognitoOptions", :shape "CognitoOptions"})) (clojure.core/contains? input :elasticsearch-cluster-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-cluster-config (input :elasticsearch-cluster-config)) #:http.request.field{:name "ElasticsearchClusterConfig", :shape "ElasticsearchClusterConfig"})) (clojure.core/contains? input :advanced-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-advanced-options (input :advanced-options)) #:http.request.field{:name "AdvancedOptions", :shape "AdvancedOptions"})) (clojure.core/contains? input :log-publishing-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-publishing-options (input :log-publishing-options)) #:http.request.field{:name "LogPublishingOptions", :shape "LogPublishingOptions"})) (clojure.core/contains? input :encryption-at-rest-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-at-rest-options (input :encryption-at-rest-options)) #:http.request.field{:name "EncryptionAtRestOptions", :shape "EncryptionAtRestOptions"})) (clojure.core/contains? input :vpc-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-options (input :vpc-options)) #:http.request.field{:name "VPCOptions", :shape "VPCOptions"}))))

(clojure.core/defn- req-purchase-reserved-elasticsearch-instance-offering-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-guid (input :reserved-elasticsearch-instance-offering-id)) #:http.request.field{:name "ReservedElasticsearchInstanceOfferingId", :shape "GUID"}) (clojure.core/into (ser-reservation-token (input :reservation-name)) #:http.request.field{:name "ReservationName", :shape "ReservationToken"})]} (clojure.core/contains? input :instance-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-count (input :instance-count)) #:http.request.field{:name "InstanceCount", :shape "InstanceCount"}))))

(clojure.core/defn- req-describe-reserved-elasticsearch-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :reserved-elasticsearch-instance-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-guid (input :reserved-elasticsearch-instance-id)) #:http.request.field{:name "ReservedElasticsearchInstanceId", :shape "GUID", :location "querystring", :location-name "reservationId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-describe-elasticsearch-domain-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "uri", :location-name "DomainName"})]}))

(clojure.core/defn- req-describe-elasticsearch-domains-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name-list (input :domain-names)) #:http.request.field{:name "DomainNames", :shape "DomainNameList"})]}))

(clojure.core/defn- req-get-upgrade-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "uri", :location-name "DomainName"})]}))

(clojure.core/defn- req-describe-elasticsearch-instance-type-limits-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-es-partition-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "ESPartitionInstanceType", :location "uri", :location-name "InstanceType"}) (clojure.core/into (ser-elasticsearch-version-string (input :elasticsearch-version)) #:http.request.field{:name "ElasticsearchVersion", :shape "ElasticsearchVersionString", :location "uri", :location-name "ElasticsearchVersion"})]} (clojure.core/contains? input :domain-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName", :location "querystring", :location-name "domainName"}))))

(clojure.core/defn- req-upgrade-elasticsearch-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-elasticsearch-version-string (input :target-version)) #:http.request.field{:name "TargetVersion", :shape "ElasticsearchVersionString"})]} (clojure.core/contains? input :perform-check-only) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :perform-check-only)) #:http.request.field{:name "PerformCheckOnly", :shape "Boolean"}))))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "ARN", :shape "ARN", :location "querystring", :location-name "arn"})]}))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/maximum-instance-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.snapshot-options/automated-snapshot-start-hour (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/snapshot-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.snapshot-options/automated-snapshot-start-hour]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-history/steps-list (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/upgrade-steps-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-history (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/upgrade-name :portkey.aws.es.-2015-01-01/start-timestamp :portkey.aws.es.-2015-01-01/upgrade-status :portkey.aws.es.-2015-01-01.upgrade-history/steps-list]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.delete-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.delete-elasticsearch-domain-response/domain-status]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.log-publishing-option/enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/log-publishing-option (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/cloud-watch-logs-log-group-arn :portkey.aws.es.-2015-01-01.log-publishing-option/enabled]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/string-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/string))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/compatible-elasticsearch-versions-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/compatible-versions-map))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/storage-type))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/elasticsearch-instance-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/es-partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/currency-code (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/start-time (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/fixed-price (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/double))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/payment-option (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-payment-option))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/reservation-name (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reservation-token))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/duration (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/reserved-elasticsearch-instance-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/guid))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/usage-price (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/double))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/reserved-elasticsearch-instance-offering-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/state (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/recurring-charges (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/elasticsearch-instance-count (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/elasticsearch-instance-type :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/currency-code :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/start-time :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/fixed-price :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/payment-option :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/reservation-name :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/duration :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/reserved-elasticsearch-instance-id :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/usage-price :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/reserved-elasticsearch-instance-offering-id :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/state :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/recurring-charges :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance/elasticsearch-instance-count]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebs-options/ebs-enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebs-options/volume-size (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebs-options/iops (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/ebs-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.ebs-options/ebs-enabled :portkey.aws.es.-2015-01-01/volume-type :portkey.aws.es.-2015-01-01.ebs-options/volume-size :portkey.aws.es.-2015-01-01.ebs-options/iops]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/update-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/snapshot-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/snapshot-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/ebs-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/ebs-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/node-to-node-encryption-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/node-to-node-encryption-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/cognito-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/cognito-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/elasticsearch-cluster-config (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/advanced-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/advanced-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/log-publishing-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/log-publishing-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/encryption-at-rest-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/encryption-at-rest-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/vpc-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/vpc-derived-info-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.elasticsearch-domain-config/snapshot-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/ebs-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/elasticsearch-version :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/node-to-node-encryption-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/access-policies :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/cognito-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/elasticsearch-cluster-config :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/advanced-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/log-publishing-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/encryption-at-rest-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/vpc-options]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-limit-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/storage-type-limit))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.advanced-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/advanced-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.advanced-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/advanced-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.advanced-options-status/options :portkey.aws.es.-2015-01-01.advanced-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-sub-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instance-offerings-request/reserved-elasticsearch-instance-offering-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/guid))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instance-offerings-request/reserved-elasticsearch-instance-offering-id :portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-response (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-response/domain-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-history-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/upgrade-history))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/instance-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-request/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un [:portkey.aws.es.-2015-01-01/snapshot-options :portkey.aws.es.-2015-01-01/ebs-options :portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-request/access-policies :portkey.aws.es.-2015-01-01/cognito-options :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config :portkey.aws.es.-2015-01-01/advanced-options :portkey.aws.es.-2015-01-01/log-publishing-options :portkey.aws.es.-2015-01-01/vpc-options]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/reserved-elasticsearch-instance-offering-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/guid))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/elasticsearch-instance-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/es-partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/duration (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/fixed-price (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/double))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/usage-price (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/double))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/currency-code (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/payment-option (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-payment-option))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/recurring-charges (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-offering (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/reserved-elasticsearch-instance-offering-id :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/elasticsearch-instance-type :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/duration :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/fixed-price :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/usage-price :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/currency-code :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/payment-option :portkey.aws.es.-2015-01-01.reserved-elasticsearch-instance-offering/recurring-charges]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.encryption-at-rest-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/encryption-at-rest-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.encryption-at-rest-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/encryption-at-rest-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.encryption-at-rest-options-status/options :portkey.aws.es.-2015-01-01.encryption-at-rest-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-value-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/limit-value))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.node-to-node-encryption-options/enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/node-to-node-encryption-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.node-to-node-encryption-options/enabled]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/reservation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 5 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/tag-list]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.get-compatible-elasticsearch-versions-response/compatible-elasticsearch-versions (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/compatible-elasticsearch-versions-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.get-compatible-elasticsearch-versions-response/compatible-elasticsearch-versions]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 20 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/additional-limit-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/additional-limit))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-versions-response/elasticsearch-versions (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-versions-response/elasticsearch-versions :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.log-publishing-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/log-publishing-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.log-publishing-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/log-publishing-options-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.log-publishing-options-status/options :portkey.aws.es.-2015-01-01.log-publishing-options-status/status]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-info-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/domain-info))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-upgrade-history-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un [:portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 55)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-request/elasticsearch-version] :opt-un [:portkey.aws.es.-2015-01-01/domain-name :portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/user-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 55)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w-]+_[0-9a-zA-Z]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/endpoints-map (clojure.spec.alpha/map-of :portkey.aws.es.-2015-01-01/string :portkey.aws.es.-2015-01-01/service-url))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/invalid-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-status #{"SUCCEEDED_WITH_ISSUES" "IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :succeeded-with-issues :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.get-upgrade-status-response/step-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/upgrade-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-upgrade-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/upgrade-step :portkey.aws.es.-2015-01-01.get-upgrade-status-response/step-status :portkey.aws.es.-2015-01-01/upgrade-name]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.cognito-options/enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/cognito-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.cognito-options/enabled :portkey.aws.es.-2015-01-01/user-pool-id :portkey.aws.es.-2015-01-01/identity-pool-id :portkey.aws.es.-2015-01-01/role-arn]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-response/domain-config (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-config))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-response (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-response/domain-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/service-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info/vpc-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info/subnet-ids (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info/availability-zones (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info/security-group-ids (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/vpc-derived-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.vpc-derived-info/vpc-id :portkey.aws.es.-2015-01-01.vpc-derived-info/subnet-ids :portkey.aws.es.-2015-01-01.vpc-derived-info/availability-zones :portkey.aws.es.-2015-01-01.vpc-derived-info/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/options :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.remove-tags-request/tag-keys (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/remove-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/arn :portkey.aws.es.-2015-01-01.remove-tags-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.recurring-charge/recurring-charge-amount (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/double))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.recurring-charge/recurring-charge-frequency (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/recurring-charge (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.recurring-charge/recurring-charge-amount :portkey.aws.es.-2015-01-01.recurring-charge/recurring-charge-frequency]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/created (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/endpoints (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/endpoints-map))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/deleted (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/upgrade-processing (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/processing (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/endpoint (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/service-url))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/vpc-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/vpc-derived-info))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-id :portkey.aws.es.-2015-01-01/domain-name :portkey.aws.es.-2015-01-01/arn :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config] :opt-un [:portkey.aws.es.-2015-01-01/snapshot-options :portkey.aws.es.-2015-01-01/ebs-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/created :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/elasticsearch-version :portkey.aws.es.-2015-01-01/node-to-node-encryption-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/access-policies :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/endpoints :portkey.aws.es.-2015-01-01/cognito-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/deleted :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/upgrade-processing :portkey.aws.es.-2015-01-01/advanced-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/processing :portkey.aws.es.-2015-01-01/log-publishing-options :portkey.aws.es.-2015-01-01/encryption-at-rest-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/endpoint :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/vpc-options]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/disabled-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-domain-names-response/domain-names (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/domain-info-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-domain-names-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-domain-names-response/domain-names]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/domain-name))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-payment-option #{:no-upfront :all-upfront "NO_UPFRONT" :partial-upfront "PARTIAL_UPFRONT" "ALL_UPFRONT"})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/log-type #{"SEARCH_SLOW_LOGS" :index-slow-logs :search-slow-logs "ES_APPLICATION_LOGS" :es-application-logs "INDEX_SLOW_LOGS"})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/add-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/arn :portkey.aws.es.-2015-01-01/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-instance-type-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/es-partition-instance-type))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.limits/storage-types (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/storage-type-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.limits/additional-limits (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/additional-limit-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.limits/storage-types :portkey.aws.es.-2015-01-01/instance-limits :portkey.aws.es.-2015-01-01.limits/additional-limits]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/tag))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-response/reserved-elasticsearch-instance-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/guid))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-response/reservation-name (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reservation-token))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-response/reserved-elasticsearch-instance-id :portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-response/reservation-name]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebs-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/ebs-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebs-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/ebs-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.ebs-options-status/options :portkey.aws.es.-2015-01-01.ebs-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instances-response/next-token (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instances-response/reserved-elasticsearch-instances (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instances-response/next-token :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instances-response/reserved-elasticsearch-instances]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.compatible-versions-map/source-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.compatible-versions-map/target-versions (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/compatible-versions-map (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.compatible-versions-map/source-version :portkey.aws.es.-2015-01-01.compatible-versions-map/target-versions]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/es-partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-count (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/zone-awareness-enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/es-partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-count (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-type :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-count :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-enabled :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/zone-awareness-enabled :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-type :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-count]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/issue (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-response/elasticsearch-instance-types (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-instance-type-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-response/elasticsearch-instance-types :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/start-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-version-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/elasticsearch-version-string))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/es-partition-instance-type #{"i3.large.elasticsearch" :m-32xlargeelasticsearch :r-48xlargeelasticsearch :m-3xlargeelasticsearch "m4.2xlarge.elasticsearch" :m-42xlargeelasticsearch :t-2mediumelasticsearch "d2.4xlarge.elasticsearch" :r-416xlargeelasticsearch "t2.micro.elasticsearch" "r3.2xlarge.elasticsearch" "c4.large.elasticsearch" "r4.2xlarge.elasticsearch" :m-3mediumelasticsearch "m4.xlarge.elasticsearch" :m-4largeelasticsearch :c-48xlargeelasticsearch "m3.xlarge.elasticsearch" "i2.2xlarge.elasticsearch" :t-2microelasticsearch :i-3largeelasticsearch "r4.8xlarge.elasticsearch" "r4.large.elasticsearch" "r3.xlarge.elasticsearch" "r3.4xlarge.elasticsearch" "r4.16xlarge.elasticsearch" "i3.8xlarge.elasticsearch" "m3.medium.elasticsearch" "i3.16xlarge.elasticsearch" :m-4xlargeelasticsearch "i3.4xlarge.elasticsearch" "t2.medium.elasticsearch" :d-2xlargeelasticsearch :i-34xlargeelasticsearch :i-2xlargeelasticsearch "c4.xlarge.elasticsearch" :i-38xlargeelasticsearch :i-316xlargeelasticsearch "i3.xlarge.elasticsearch" "r4.4xlarge.elasticsearch" "d2.2xlarge.elasticsearch" :r-3largeelasticsearch "m4.large.elasticsearch" :d-24xlargeelasticsearch :c-4largeelasticsearch :d-28xlargeelasticsearch :r-38xlargeelasticsearch "t2.small.elasticsearch" :m-3largeelasticsearch "m4.4xlarge.elasticsearch" :r-42xlargeelasticsearch :c-4xlargeelasticsearch :m-44xlargeelasticsearch :m-410xlargeelasticsearch :t-2smallelasticsearch "d2.8xlarge.elasticsearch" :i-22xlargeelasticsearch :c-44xlargeelasticsearch "c4.2xlarge.elasticsearch" :r-4xlargeelasticsearch "r3.large.elasticsearch" :d-22xlargeelasticsearch "m3.2xlarge.elasticsearch" "m4.10xlarge.elasticsearch" :r-34xlargeelasticsearch "d2.xlarge.elasticsearch" :i-3xlargeelasticsearch :r-44xlargeelasticsearch "m3.large.elasticsearch" :r-32xlargeelasticsearch :r-3xlargeelasticsearch "i2.xlarge.elasticsearch" :i-32xlargeelasticsearch "r4.xlarge.elasticsearch" :c-42xlargeelasticsearch "i3.2xlarge.elasticsearch" "c4.4xlarge.elasticsearch" "c4.8xlarge.elasticsearch" :r-4largeelasticsearch "r3.8xlarge.elasticsearch"})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/creation-date (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/update-date (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/update-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/u-int-value))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/state (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-state))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/pending-deletion (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/option-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.option-status/creation-date :portkey.aws.es.-2015-01-01.option-status/update-date :portkey.aws.es.-2015-01-01.option-status/state] :opt-un [:portkey.aws.es.-2015-01-01.option-status/update-version :portkey.aws.es.-2015-01-01.option-status/pending-deletion]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/vpc-derived-info))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/vpc-derived-info-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.vpc-derived-info-status/options :portkey.aws.es.-2015-01-01.vpc-derived-info-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instance-offerings-response/reserved-elasticsearch-instance-offerings (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-offering-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/next-token :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instance-offerings-response/reserved-elasticsearch-instance-offerings]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.additional-limit/limit-values (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/limit-value-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/additional-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/limit-name :portkey.aws.es.-2015-01-01.additional-limit/limit-values]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.snapshot-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/snapshot-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.snapshot-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/snapshot-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.snapshot-options-status/options :portkey.aws.es.-2015-01-01.snapshot-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/instance-limits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/instance-count-limits]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-response/target-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-response/perform-check-only (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/domain-name :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-response/target-version :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-response/perform-check-only]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.node-to-node-encryption-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/node-to-node-encryption-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.node-to-node-encryption-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/node-to-node-encryption-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.node-to-node-encryption-options-status/options :portkey.aws.es.-2015-01-01.node-to-node-encryption-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/domain-name]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-response/domain-status-list (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-response (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-response/domain-status-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limits-by-role (clojure.spec.alpha/map-of :portkey.aws.es.-2015-01-01/instance-role :portkey.aws.es.-2015-01-01/limits))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.base-exception/message (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/base-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.base-exception/message]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un [:portkey.aws.es.-2015-01-01/snapshot-options :portkey.aws.es.-2015-01-01/ebs-options :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/elasticsearch-version :portkey.aws.es.-2015-01-01/node-to-node-encryption-options :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/access-policies :portkey.aws.es.-2015-01-01/cognito-options :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config :portkey.aws.es.-2015-01-01/advanced-options :portkey.aws.es.-2015-01-01/log-publishing-options :portkey.aws.es.-2015-01-01/encryption-at-rest-options :portkey.aws.es.-2015-01-01/vpc-options]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-request/reserved-elasticsearch-instance-offering-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/guid))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-request/reservation-name (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reservation-token))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-request/reserved-elasticsearch-instance-offering-id :portkey.aws.es.-2015-01-01.purchase-reserved-elasticsearch-instance-offering-request/reservation-name] :opt-un [:portkey.aws.es.-2015-01-01/instance-count]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instances-request/reserved-elasticsearch-instance-id (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/guid))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instances-request/reserved-elasticsearch-instance-id :portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/minimum-instance-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/integer-class clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/advanced-options (clojure.spec.alpha/map-of :portkey.aws.es.-2015-01-01/string :portkey.aws.es.-2015-01-01/string))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/recurring-charge-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/recurring-charge))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.storage-type/storage-type-limits (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/storage-type-limit-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/storage-type-name :portkey.aws.es.-2015-01-01/storage-sub-type-name :portkey.aws.es.-2015-01-01.storage-type/storage-type-limits]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/log-publishing-options (clojure.spec.alpha/map-of :portkey.aws.es.-2015-01-01/log-type :portkey.aws.es.-2015-01-01/log-publishing-option))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/limits-by-role]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.encryption-at-rest-options/enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/encryption-at-rest-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.encryption-at-rest-options/enabled :portkey.aws.es.-2015-01-01/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/volume-type #{"standard" "io1" "gp2" :io-1 :standard :gp-2})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.cognito-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/cognito-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.cognito-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/cognito-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.cognito-options-status/options :portkey.aws.es.-2015-01-01.cognito-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-step #{"SNAPSHOT" "UPGRADE" :upgrade :snapshot :pre-upgrade-check "PRE_UPGRADE_CHECK"})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/max-results (clojure.spec.alpha/int-in Long/MIN_VALUE 100))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.tag/key (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.tag/value (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.tag/key :portkey.aws.es.-2015-01-01.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-step-item/upgrade-step-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/upgrade-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-step-item/progress-percent (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/double))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-step-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/upgrade-step :portkey.aws.es.-2015-01-01.upgrade-step-item/upgrade-step-status :portkey.aws.es.-2015-01-01/issues :portkey.aws.es.-2015-01-01.upgrade-step-item/progress-percent]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-offering-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-offering))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.access-policies-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.access-policies-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/access-policies-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.access-policies-status/options :portkey.aws.es.-2015-01-01.access-policies-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.create-elasticsearch-domain-response/domain-status]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-steps-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/upgrade-step-item))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-version-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-version-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-version-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.elasticsearch-version-status/options :portkey.aws.es.-2015-01-01.elasticsearch-version-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 28)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-z][a-z0-9\-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-request/domain-names (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-request/domain-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/issues (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/issue))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/domain-name]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-upgrade-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-version-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/instance-count-limits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/minimum-instance-count :portkey.aws.es.-2015-01-01/maximum-instance-count]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/option-state #{"Active" :processing :requires-index-documents "RequiresIndexDocuments" :active "Processing"})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.get-upgrade-history-response/upgrade-histories (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/upgrade-history-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.get-upgrade-history-response/next-token (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-upgrade-history-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.get-upgrade-history-response/upgrade-histories :portkey.aws.es.-2015-01-01.get-upgrade-history-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/u-int-value (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-options/subnet-ids (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-options/security-group-ids (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/vpc-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.vpc-options/subnet-ids :portkey.aws.es.-2015-01-01.vpc-options/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-config-response/domain-config (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-config))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-response (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-config-response/domain-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/instance-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/es-partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/instance-type :portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/elasticsearch-version] :opt-un [:portkey.aws.es.-2015-01-01/domain-name]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/guid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/target-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/perform-check-only (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/target-version] :opt-un [:portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/perform-check-only]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.storage-type-limit/limit-values (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/limit-value-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/limit-name :portkey.aws.es.-2015-01-01.storage-type-limit/limit-values]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/arn] :opt-un []))

(clojure.core/defn delete-elasticsearch-service-role ([] (delete-elasticsearch-service-role {})) ([_] (clojure.core/let [request-function-result__28521__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/role", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec nil, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteElasticsearchServiceRole", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef delete-elasticsearch-service-role :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn remove-tags ([remove-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-request remove-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/tags-removal", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/remove-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTags", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/remove-tags-request) :ret clojure.core/true?)

(clojure.core/defn list-domain-names ([] (list-domain-names {})) ([_] (clojure.core/let [request-function-result__28521__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-domain-names-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/domain", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec nil, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDomainNames", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef list-domain-names :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-domain-names-response))

(clojure.core/defn get-upgrade-status ([get-upgrade-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-upgrade-status-request get-upgrade-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/get-upgrade-status-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/upgradeDomain/{DomainName}/status", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/get-upgrade-status-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetUpgradeStatus", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef get-upgrade-status :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/get-upgrade-status-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/get-upgrade-status-response))

(clojure.core/defn update-elasticsearch-domain-config ([update-elasticsearch-domain-config-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-elasticsearch-domain-config-request update-elasticsearch-domain-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}/config", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateElasticsearchDomainConfig", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef update-elasticsearch-domain-config :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-response))

(clojure.core/defn describe-elasticsearch-domain-config ([describe-elasticsearch-domain-config-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-elasticsearch-domain-config-request describe-elasticsearch-domain-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}/config", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeElasticsearchDomainConfig", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-domain-config :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-response))

(clojure.core/defn purchase-reserved-elasticsearch-instance-offering ([purchase-reserved-elasticsearch-instance-offering-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-purchase-reserved-elasticsearch-instance-offering-request purchase-reserved-elasticsearch-instance-offering-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/purchaseReservedInstanceOffering", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PurchaseReservedElasticsearchInstanceOffering", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.es.-2015-01-01/resource-already-exists-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef purchase-reserved-elasticsearch-instance-offering :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/tags/", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/list-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-tags-response))

(clojure.core/defn describe-elasticsearch-domain ([describe-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-elasticsearch-domain-request describe-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeElasticsearchDomain", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-response))

(clojure.core/defn describe-reserved-elasticsearch-instances ([] (describe-reserved-elasticsearch-instances {})) ([describe-reserved-elasticsearch-instances-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-reserved-elasticsearch-instances-request describe-reserved-elasticsearch-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/reservedInstances", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReservedElasticsearchInstances", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception}})))))
(clojure.spec.alpha/fdef describe-reserved-elasticsearch-instances :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-response))

(clojure.core/defn describe-elasticsearch-instance-type-limits ([describe-elasticsearch-instance-type-limits-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-elasticsearch-instance-type-limits-request describe-elasticsearch-instance-type-limits-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/instanceTypeLimits/{ElasticsearchVersion}/{InstanceType}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeElasticsearchInstanceTypeLimits", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-instance-type-limits :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-response))

(clojure.core/defn list-elasticsearch-versions ([] (list-elasticsearch-versions {})) ([list-elasticsearch-versions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-elasticsearch-versions-request list-elasticsearch-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/versions", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListElasticsearchVersions", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef list-elasticsearch-versions :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response))

(clojure.core/defn upgrade-elasticsearch-domain ([upgrade-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-upgrade-elasticsearch-domain-request upgrade-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/upgradeDomain", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpgradeElasticsearchDomain", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.es.-2015-01-01/resource-already-exists-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef upgrade-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-response))

(clojure.core/defn get-upgrade-history ([get-upgrade-history-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-upgrade-history-request get-upgrade-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/get-upgrade-history-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/upgradeDomain/{DomainName}/history", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/get-upgrade-history-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetUpgradeHistory", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef get-upgrade-history :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/get-upgrade-history-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/get-upgrade-history-response))

(clojure.core/defn get-compatible-elasticsearch-versions ([] (get-compatible-elasticsearch-versions {})) ([get-compatible-elasticsearch-versions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-compatible-elasticsearch-versions-request get-compatible-elasticsearch-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/compatibleVersions", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCompatibleElasticsearchVersions", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef get-compatible-elasticsearch-versions :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-response))

(clojure.core/defn describe-elasticsearch-domains ([describe-elasticsearch-domains-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-elasticsearch-domains-request describe-elasticsearch-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain-info", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeElasticsearchDomains", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-domains :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-response))

(clojure.core/defn delete-elasticsearch-domain ([delete-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-elasticsearch-domain-request delete-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteElasticsearchDomain", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef delete-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-response))

(clojure.core/defn add-tags ([add-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-request add-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/tags", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/add-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/add-tags-request) :ret clojure.core/true?)

(clojure.core/defn list-elasticsearch-instance-types ([list-elasticsearch-instance-types-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-elasticsearch-instance-types-request list-elasticsearch-instance-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/instanceTypes/{ElasticsearchVersion}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListElasticsearchInstanceTypes", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef list-elasticsearch-instance-types :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response))

(clojure.core/defn describe-reserved-elasticsearch-instance-offerings ([] (describe-reserved-elasticsearch-instance-offerings {})) ([describe-reserved-elasticsearch-instance-offerings-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-reserved-elasticsearch-instance-offerings-request describe-reserved-elasticsearch-instance-offerings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/reservedInstanceOfferings", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReservedElasticsearchInstanceOfferings", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef describe-reserved-elasticsearch-instance-offerings :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-response))

(clojure.core/defn create-elasticsearch-domain ([create-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-elasticsearch-domain-request create-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateElasticsearchDomain", :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.es.-2015-01-01/resource-already-exists-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef create-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-response))
