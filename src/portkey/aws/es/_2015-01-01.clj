(ns portkey.aws.es.-2015-01-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "es", :region "us-gov-east-1"},
    :ssl-common-name "es.us-gov-east-1.amazonaws.com",
    :endpoint "https://es.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
   "cn-north-1"
   {:credential-scope {:service "es", :region "cn-north-1"},
    :ssl-common-name "es.cn-north-1.amazonaws.com.cn",
    :endpoint "https://es.cn-north-1.amazonaws.com.cn",
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
    :signature-version :v4},
   "fips"
   {:credential-scope {:service "es", :region "us-gov-west-1"},
    :ssl-common-name "es-fips.us-gov-west-1.amazonaws.com",
    :endpoint "https://es-fips.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "es", :region "eu-north-1"},
    :ssl-common-name "es.eu-north-1.amazonaws.com",
    :endpoint "https://es.eu-north-1.amazonaws.com",
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

(clojure.core/declare ser-zone-awareness-config)

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

(clojure.core/defn- ser-elasticsearch-cluster-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ElasticsearchClusterConfig", :type "structure"} (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-es-partition-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "ESPartitionInstanceType"})) (clojure.core/contains? input :instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :instance-count)) #:http.request.field{:name "InstanceCount", :shape "IntegerClass"})) (clojure.core/contains? input :dedicated-master-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :dedicated-master-enabled)) #:http.request.field{:name "DedicatedMasterEnabled", :shape "Boolean"})) (clojure.core/contains? input :zone-awareness-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :zone-awareness-enabled)) #:http.request.field{:name "ZoneAwarenessEnabled", :shape "Boolean"})) (clojure.core/contains? input :zone-awareness-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zone-awareness-config (input :zone-awareness-config)) #:http.request.field{:name "ZoneAwarenessConfig", :shape "ZoneAwarenessConfig"})) (clojure.core/contains? input :dedicated-master-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-es-partition-instance-type (input :dedicated-master-type)) #:http.request.field{:name "DedicatedMasterType", :shape "ESPartitionInstanceType"})) (clojure.core/contains? input :dedicated-master-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :dedicated-master-count)) #:http.request.field{:name "DedicatedMasterCount", :shape "IntegerClass"}))))

(clojure.core/defn- ser-es-partition-instance-type [input] #:http.request.field{:value (clojure.core/get {"i3.large.elasticsearch" "i3.large.elasticsearch", :m-32xlargeelasticsearch "m3.2xlarge.elasticsearch", :r-48xlargeelasticsearch "r4.8xlarge.elasticsearch", :m-3xlargeelasticsearch "m3.xlarge.elasticsearch", "m4.2xlarge.elasticsearch" "m4.2xlarge.elasticsearch", :m-42xlargeelasticsearch "m4.2xlarge.elasticsearch", :t-2mediumelasticsearch "t2.medium.elasticsearch", "d2.4xlarge.elasticsearch" "d2.4xlarge.elasticsearch", :r-416xlargeelasticsearch "r4.16xlarge.elasticsearch", "t2.micro.elasticsearch" "t2.micro.elasticsearch", "r3.2xlarge.elasticsearch" "r3.2xlarge.elasticsearch", "c4.large.elasticsearch" "c4.large.elasticsearch", "r4.2xlarge.elasticsearch" "r4.2xlarge.elasticsearch", :m-3mediumelasticsearch "m3.medium.elasticsearch", "m4.xlarge.elasticsearch" "m4.xlarge.elasticsearch", :m-4largeelasticsearch "m4.large.elasticsearch", :c-48xlargeelasticsearch "c4.8xlarge.elasticsearch", "m3.xlarge.elasticsearch" "m3.xlarge.elasticsearch", "i2.2xlarge.elasticsearch" "i2.2xlarge.elasticsearch", :t-2microelasticsearch "t2.micro.elasticsearch", :i-3largeelasticsearch "i3.large.elasticsearch", "r4.8xlarge.elasticsearch" "r4.8xlarge.elasticsearch", "r4.large.elasticsearch" "r4.large.elasticsearch", "r3.xlarge.elasticsearch" "r3.xlarge.elasticsearch", "r3.4xlarge.elasticsearch" "r3.4xlarge.elasticsearch", "r4.16xlarge.elasticsearch" "r4.16xlarge.elasticsearch", "i3.8xlarge.elasticsearch" "i3.8xlarge.elasticsearch", "m3.medium.elasticsearch" "m3.medium.elasticsearch", "i3.16xlarge.elasticsearch" "i3.16xlarge.elasticsearch", :m-4xlargeelasticsearch "m4.xlarge.elasticsearch", "i3.4xlarge.elasticsearch" "i3.4xlarge.elasticsearch", "t2.medium.elasticsearch" "t2.medium.elasticsearch", :d-2xlargeelasticsearch "d2.xlarge.elasticsearch", :i-34xlargeelasticsearch "i3.4xlarge.elasticsearch", :i-2xlargeelasticsearch "i2.xlarge.elasticsearch", "c4.xlarge.elasticsearch" "c4.xlarge.elasticsearch", :i-38xlargeelasticsearch "i3.8xlarge.elasticsearch", :i-316xlargeelasticsearch "i3.16xlarge.elasticsearch", "i3.xlarge.elasticsearch" "i3.xlarge.elasticsearch", "r4.4xlarge.elasticsearch" "r4.4xlarge.elasticsearch", "d2.2xlarge.elasticsearch" "d2.2xlarge.elasticsearch", :r-3largeelasticsearch "r3.large.elasticsearch", "m4.large.elasticsearch" "m4.large.elasticsearch", :d-24xlargeelasticsearch "d2.4xlarge.elasticsearch", :c-4largeelasticsearch "c4.large.elasticsearch", :d-28xlargeelasticsearch "d2.8xlarge.elasticsearch", :r-38xlargeelasticsearch "r3.8xlarge.elasticsearch", "t2.small.elasticsearch" "t2.small.elasticsearch", :m-3largeelasticsearch "m3.large.elasticsearch", "m4.4xlarge.elasticsearch" "m4.4xlarge.elasticsearch", :r-42xlargeelasticsearch "r4.2xlarge.elasticsearch", :c-4xlargeelasticsearch "c4.xlarge.elasticsearch", :m-44xlargeelasticsearch "m4.4xlarge.elasticsearch", :m-410xlargeelasticsearch "m4.10xlarge.elasticsearch", :t-2smallelasticsearch "t2.small.elasticsearch", "d2.8xlarge.elasticsearch" "d2.8xlarge.elasticsearch", :i-22xlargeelasticsearch "i2.2xlarge.elasticsearch", :c-44xlargeelasticsearch "c4.4xlarge.elasticsearch", "c4.2xlarge.elasticsearch" "c4.2xlarge.elasticsearch", :r-4xlargeelasticsearch "r4.xlarge.elasticsearch", "r3.large.elasticsearch" "r3.large.elasticsearch", :d-22xlargeelasticsearch "d2.2xlarge.elasticsearch", "m3.2xlarge.elasticsearch" "m3.2xlarge.elasticsearch", "m4.10xlarge.elasticsearch" "m4.10xlarge.elasticsearch", :r-34xlargeelasticsearch "r3.4xlarge.elasticsearch", "d2.xlarge.elasticsearch" "d2.xlarge.elasticsearch", :i-3xlargeelasticsearch "i3.xlarge.elasticsearch", :r-44xlargeelasticsearch "r4.4xlarge.elasticsearch", "m3.large.elasticsearch" "m3.large.elasticsearch", :r-32xlargeelasticsearch "r3.2xlarge.elasticsearch", :r-3xlargeelasticsearch "r3.xlarge.elasticsearch", "i2.xlarge.elasticsearch" "i2.xlarge.elasticsearch", :i-32xlargeelasticsearch "i3.2xlarge.elasticsearch", "r4.xlarge.elasticsearch" "r4.xlarge.elasticsearch", :c-42xlargeelasticsearch "c4.2xlarge.elasticsearch", "i3.2xlarge.elasticsearch" "i3.2xlarge.elasticsearch", "c4.4xlarge.elasticsearch" "c4.4xlarge.elasticsearch", "c4.8xlarge.elasticsearch" "c4.8xlarge.elasticsearch", :r-4largeelasticsearch "r4.large.elasticsearch", "r3.8xlarge.elasticsearch" "r3.8xlarge.elasticsearch"} input), :shape "ESPartitionInstanceType"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-policy-document [input] #:http.request.field{:value input, :shape "PolicyDocument"})

(clojure.core/defn- ser-zone-awareness-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ZoneAwarenessConfig", :type "structure"} (clojure.core/contains? input :availability-zone-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-class (input :availability-zone-count)) #:http.request.field{:name "AvailabilityZoneCount", :shape "IntegerClass"}))))

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

(clojure.core/defn- req-start-elasticsearch-service-software-update-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

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

(clojure.core/defn- req-cancel-elasticsearch-service-software-update-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "ARN", :shape "ARN", :location "querystring", :location-name "arn"})]}))

(clojure.core/declare deser-maximum-instance-count)

(clojure.core/declare deser-snapshot-options)

(clojure.core/declare deser-upgrade-history)

(clojure.core/declare deser-log-publishing-option)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-compatible-elasticsearch-versions-list)

(clojure.core/declare deser-double)

(clojure.core/declare deser-storage-type-list)

(clojure.core/declare deser-reserved-elasticsearch-instance)

(clojure.core/declare deser-ebs-options)

(clojure.core/declare deser-update-timestamp)

(clojure.core/declare deser-elasticsearch-domain-config)

(clojure.core/declare deser-upgrade-name)

(clojure.core/declare deser-storage-type-limit-list)

(clojure.core/declare deser-cloud-watch-logs-log-group-arn)

(clojure.core/declare deser-advanced-options-status)

(clojure.core/declare deser-storage-sub-type-name)

(clojure.core/declare deser-reserved-elasticsearch-instance-list)

(clojure.core/declare deser-upgrade-history-list)

(clojure.core/declare deser-instance-role)

(clojure.core/declare deser-reserved-elasticsearch-instance-offering)

(clojure.core/declare deser-encryption-at-rest-options-status)

(clojure.core/declare deser-limit-value-list)

(clojure.core/declare deser-node-to-node-encryption-options)

(clojure.core/declare deser-reservation-token)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-additional-limit-list)

(clojure.core/declare deser-log-publishing-options-status)

(clojure.core/declare deser-elasticsearch-domain-status-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-domain-info-list)

(clojure.core/declare deser-identity-pool-id)

(clojure.core/declare deser-user-pool-id)

(clojure.core/declare deser-endpoints-map)

(clojure.core/declare deser-upgrade-status)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-cognito-options)

(clojure.core/declare deser-service-url)

(clojure.core/declare deser-vpc-derived-info)

(clojure.core/declare deser-elasticsearch-cluster-config-status)

(clojure.core/declare deser-storage-type-name)

(clojure.core/declare deser-recurring-charge)

(clojure.core/declare deser-elasticsearch-domain-status)

(clojure.core/declare deser-reserved-elasticsearch-instance-payment-option)

(clojure.core/declare deser-log-type)

(clojure.core/declare deser-elasticsearch-instance-type-list)

(clojure.core/declare deser-limits)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-ebs-options-status)

(clojure.core/declare deser-compatible-versions-map)

(clojure.core/declare deser-elasticsearch-cluster-config)

(clojure.core/declare deser-issue)

(clojure.core/declare deser-start-timestamp)

(clojure.core/declare deser-elasticsearch-version-list)

(clojure.core/declare deser-deployment-close-date-time-stamp)

(clojure.core/declare deser-es-partition-instance-type)

(clojure.core/declare deser-option-status)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-vpc-derived-info-status)

(clojure.core/declare deser-policy-document)

(clojure.core/declare deser-zone-awareness-config)

(clojure.core/declare deser-additional-limit)

(clojure.core/declare deser-snapshot-options-status)

(clojure.core/declare deser-instance-limits)

(clojure.core/declare deser-node-to-node-encryption-options-status)

(clojure.core/declare deser-kms-key-id)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-limits-by-role)

(clojure.core/declare deser-domain-id)

(clojure.core/declare deser-minimum-instance-count)

(clojure.core/declare deser-integer-class)

(clojure.core/declare deser-advanced-options)

(clojure.core/declare deser-recurring-charge-list)

(clojure.core/declare deser-storage-type)

(clojure.core/declare deser-log-publishing-options)

(clojure.core/declare deser-encryption-at-rest-options)

(clojure.core/declare deser-volume-type)

(clojure.core/declare deser-cognito-options-status)

(clojure.core/declare deser-service-software-options)

(clojure.core/declare deser-deployment-status)

(clojure.core/declare deser-upgrade-step)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-upgrade-step-item)

(clojure.core/declare deser-reserved-elasticsearch-instance-offering-list)

(clojure.core/declare deser-access-policies-status)

(clojure.core/declare deser-upgrade-steps-list)

(clojure.core/declare deser-elasticsearch-version-status)

(clojure.core/declare deser-domain-name)

(clojure.core/declare deser-issues)

(clojure.core/declare deser-domain-info)

(clojure.core/declare deser-elasticsearch-version-string)

(clojure.core/declare deser-instance-count-limits)

(clojure.core/declare deser-option-state)

(clojure.core/declare deser-u-int-value)

(clojure.core/declare deser-limit-name)

(clojure.core/declare deser-limit-value)

(clojure.core/declare deser-guid)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-storage-type-limit)

(clojure.core/defn- deser-maximum-instance-count [input] input)

(clojure.core/defn- deser-snapshot-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "AutomatedSnapshotStartHour") (clojure.core/assoc :automated-snapshot-start-hour (deser-integer-class (input "AutomatedSnapshotStartHour")))))

(clojure.core/defn- deser-upgrade-history [input] (clojure.core/cond-> {} (clojure.core/contains? input "UpgradeName") (clojure.core/assoc :upgrade-name (deser-upgrade-name (input "UpgradeName"))) (clojure.core/contains? input "StartTimestamp") (clojure.core/assoc :start-timestamp (deser-start-timestamp (input "StartTimestamp"))) (clojure.core/contains? input "UpgradeStatus") (clojure.core/assoc :upgrade-status (deser-upgrade-status (input "UpgradeStatus"))) (clojure.core/contains? input "StepsList") (clojure.core/assoc :steps-list (deser-upgrade-steps-list (input "StepsList")))))

(clojure.core/defn- deser-log-publishing-option [input] (clojure.core/cond-> {} (clojure.core/contains? input "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-cloud-watch-logs-log-group-arn (input "CloudWatchLogsLogGroupArn"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled")))))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-compatible-elasticsearch-versions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compatible-versions-map coll))) input))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-storage-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-storage-type coll))) input))

(clojure.core/defn- deser-reserved-elasticsearch-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "ElasticsearchInstanceType") (clojure.core/assoc :elasticsearch-instance-type (deser-es-partition-instance-type (input "ElasticsearchInstanceType"))) (clojure.core/contains? input "CurrencyCode") (clojure.core/assoc :currency-code (deser-string (input "CurrencyCode"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-update-timestamp (input "StartTime"))) (clojure.core/contains? input "FixedPrice") (clojure.core/assoc :fixed-price (deser-double (input "FixedPrice"))) (clojure.core/contains? input "PaymentOption") (clojure.core/assoc :payment-option (deser-reserved-elasticsearch-instance-payment-option (input "PaymentOption"))) (clojure.core/contains? input "ReservationName") (clojure.core/assoc :reservation-name (deser-reservation-token (input "ReservationName"))) (clojure.core/contains? input "Duration") (clojure.core/assoc :duration (deser-integer (input "Duration"))) (clojure.core/contains? input "ReservedElasticsearchInstanceId") (clojure.core/assoc :reserved-elasticsearch-instance-id (deser-guid (input "ReservedElasticsearchInstanceId"))) (clojure.core/contains? input "UsagePrice") (clojure.core/assoc :usage-price (deser-double (input "UsagePrice"))) (clojure.core/contains? input "ReservedElasticsearchInstanceOfferingId") (clojure.core/assoc :reserved-elasticsearch-instance-offering-id (deser-string (input "ReservedElasticsearchInstanceOfferingId"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-string (input "State"))) (clojure.core/contains? input "RecurringCharges") (clojure.core/assoc :recurring-charges (deser-recurring-charge-list (input "RecurringCharges"))) (clojure.core/contains? input "ElasticsearchInstanceCount") (clojure.core/assoc :elasticsearch-instance-count (deser-integer (input "ElasticsearchInstanceCount")))))

(clojure.core/defn- deser-ebs-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "EBSEnabled") (clojure.core/assoc :ebs-enabled (deser-boolean (input "EBSEnabled"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-volume-type (input "VolumeType"))) (clojure.core/contains? input "VolumeSize") (clojure.core/assoc :volume-size (deser-integer-class (input "VolumeSize"))) (clojure.core/contains? input "Iops") (clojure.core/assoc :iops (deser-integer-class (input "Iops")))))

(clojure.core/defn- deser-update-timestamp [input] input)

(clojure.core/defn- deser-elasticsearch-domain-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "SnapshotOptions") (clojure.core/assoc :snapshot-options (deser-snapshot-options-status (input "SnapshotOptions"))) (clojure.core/contains? input "EBSOptions") (clojure.core/assoc :ebs-options (deser-ebs-options-status (input "EBSOptions"))) (clojure.core/contains? input "ElasticsearchVersion") (clojure.core/assoc :elasticsearch-version (deser-elasticsearch-version-status (input "ElasticsearchVersion"))) (clojure.core/contains? input "NodeToNodeEncryptionOptions") (clojure.core/assoc :node-to-node-encryption-options (deser-node-to-node-encryption-options-status (input "NodeToNodeEncryptionOptions"))) (clojure.core/contains? input "AccessPolicies") (clojure.core/assoc :access-policies (deser-access-policies-status (input "AccessPolicies"))) (clojure.core/contains? input "CognitoOptions") (clojure.core/assoc :cognito-options (deser-cognito-options-status (input "CognitoOptions"))) (clojure.core/contains? input "ElasticsearchClusterConfig") (clojure.core/assoc :elasticsearch-cluster-config (deser-elasticsearch-cluster-config-status (input "ElasticsearchClusterConfig"))) (clojure.core/contains? input "AdvancedOptions") (clojure.core/assoc :advanced-options (deser-advanced-options-status (input "AdvancedOptions"))) (clojure.core/contains? input "LogPublishingOptions") (clojure.core/assoc :log-publishing-options (deser-log-publishing-options-status (input "LogPublishingOptions"))) (clojure.core/contains? input "EncryptionAtRestOptions") (clojure.core/assoc :encryption-at-rest-options (deser-encryption-at-rest-options-status (input "EncryptionAtRestOptions"))) (clojure.core/contains? input "VPCOptions") (clojure.core/assoc :vpc-options (deser-vpc-derived-info-status (input "VPCOptions")))))

(clojure.core/defn- deser-upgrade-name [input] input)

(clojure.core/defn- deser-storage-type-limit-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-storage-type-limit coll))) input))

(clojure.core/defn- deser-cloud-watch-logs-log-group-arn [input] input)

(clojure.core/defn- deser-advanced-options-status [input] (clojure.core/cond-> {:options (deser-advanced-options (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-storage-sub-type-name [input] input)

(clojure.core/defn- deser-reserved-elasticsearch-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reserved-elasticsearch-instance coll))) input))

(clojure.core/defn- deser-upgrade-history-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-upgrade-history coll))) input))

(clojure.core/defn- deser-instance-role [input] input)

(clojure.core/defn- deser-reserved-elasticsearch-instance-offering [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReservedElasticsearchInstanceOfferingId") (clojure.core/assoc :reserved-elasticsearch-instance-offering-id (deser-guid (input "ReservedElasticsearchInstanceOfferingId"))) (clojure.core/contains? input "ElasticsearchInstanceType") (clojure.core/assoc :elasticsearch-instance-type (deser-es-partition-instance-type (input "ElasticsearchInstanceType"))) (clojure.core/contains? input "Duration") (clojure.core/assoc :duration (deser-integer (input "Duration"))) (clojure.core/contains? input "FixedPrice") (clojure.core/assoc :fixed-price (deser-double (input "FixedPrice"))) (clojure.core/contains? input "UsagePrice") (clojure.core/assoc :usage-price (deser-double (input "UsagePrice"))) (clojure.core/contains? input "CurrencyCode") (clojure.core/assoc :currency-code (deser-string (input "CurrencyCode"))) (clojure.core/contains? input "PaymentOption") (clojure.core/assoc :payment-option (deser-reserved-elasticsearch-instance-payment-option (input "PaymentOption"))) (clojure.core/contains? input "RecurringCharges") (clojure.core/assoc :recurring-charges (deser-recurring-charge-list (input "RecurringCharges")))))

(clojure.core/defn- deser-encryption-at-rest-options-status [input] (clojure.core/cond-> {:options (deser-encryption-at-rest-options (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-limit-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-limit-value coll))) input))

(clojure.core/defn- deser-node-to-node-encryption-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled")))))

(clojure.core/defn- deser-reservation-token [input] input)

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-additional-limit-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-additional-limit coll))) input))

(clojure.core/defn- deser-log-publishing-options-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "Options") (clojure.core/assoc :options (deser-log-publishing-options (input "Options"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-option-status (input "Status")))))

(clojure.core/defn- deser-elasticsearch-domain-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-elasticsearch-domain-status coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-domain-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-info coll))) input))

(clojure.core/defn- deser-identity-pool-id [input] input)

(clojure.core/defn- deser-user-pool-id [input] input)

(clojure.core/defn- deser-endpoints-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-service-url v)])) input))

(clojure.core/defn- deser-upgrade-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "SUCCEEDED" :succeeded, "SUCCEEDED_WITH_ISSUES" :succeeded-with-issues, "FAILED" :failed} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-cognito-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id (input "UserPoolId"))) (clojure.core/contains? input "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (input "IdentityPoolId"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleArn")))))

(clojure.core/defn- deser-service-url [input] input)

(clojure.core/defn- deser-vpc-derived-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "VPCId") (clojure.core/assoc :vpc-id (deser-string (input "VPCId"))) (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-string-list (input "SubnetIds"))) (clojure.core/contains? input "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-string-list (input "AvailabilityZones"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-string-list (input "SecurityGroupIds")))))

(clojure.core/defn- deser-elasticsearch-cluster-config-status [input] (clojure.core/cond-> {:options (deser-elasticsearch-cluster-config (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-storage-type-name [input] input)

(clojure.core/defn- deser-recurring-charge [input] (clojure.core/cond-> {} (clojure.core/contains? input "RecurringChargeAmount") (clojure.core/assoc :recurring-charge-amount (deser-double (input "RecurringChargeAmount"))) (clojure.core/contains? input "RecurringChargeFrequency") (clojure.core/assoc :recurring-charge-frequency (deser-string (input "RecurringChargeFrequency")))))

(clojure.core/defn- deser-elasticsearch-domain-status [input] (clojure.core/cond-> {:domain-id (deser-domain-id (input "DomainId")), :domain-name (deser-domain-name (input "DomainName")), :arn (deser-arn (input "ARN")), :elasticsearch-cluster-config (deser-elasticsearch-cluster-config (input "ElasticsearchClusterConfig"))} (clojure.core/contains? input "SnapshotOptions") (clojure.core/assoc :snapshot-options (deser-snapshot-options (input "SnapshotOptions"))) (clojure.core/contains? input "EBSOptions") (clojure.core/assoc :ebs-options (deser-ebs-options (input "EBSOptions"))) (clojure.core/contains? input "Created") (clojure.core/assoc :created (deser-boolean (input "Created"))) (clojure.core/contains? input "ElasticsearchVersion") (clojure.core/assoc :elasticsearch-version (deser-elasticsearch-version-string (input "ElasticsearchVersion"))) (clojure.core/contains? input "NodeToNodeEncryptionOptions") (clojure.core/assoc :node-to-node-encryption-options (deser-node-to-node-encryption-options (input "NodeToNodeEncryptionOptions"))) (clojure.core/contains? input "AccessPolicies") (clojure.core/assoc :access-policies (deser-policy-document (input "AccessPolicies"))) (clojure.core/contains? input "Endpoints") (clojure.core/assoc :endpoints (deser-endpoints-map (input "Endpoints"))) (clojure.core/contains? input "CognitoOptions") (clojure.core/assoc :cognito-options (deser-cognito-options (input "CognitoOptions"))) (clojure.core/contains? input "Deleted") (clojure.core/assoc :deleted (deser-boolean (input "Deleted"))) (clojure.core/contains? input "UpgradeProcessing") (clojure.core/assoc :upgrade-processing (deser-boolean (input "UpgradeProcessing"))) (clojure.core/contains? input "AdvancedOptions") (clojure.core/assoc :advanced-options (deser-advanced-options (input "AdvancedOptions"))) (clojure.core/contains? input "Processing") (clojure.core/assoc :processing (deser-boolean (input "Processing"))) (clojure.core/contains? input "LogPublishingOptions") (clojure.core/assoc :log-publishing-options (deser-log-publishing-options (input "LogPublishingOptions"))) (clojure.core/contains? input "EncryptionAtRestOptions") (clojure.core/assoc :encryption-at-rest-options (deser-encryption-at-rest-options (input "EncryptionAtRestOptions"))) (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-service-url (input "Endpoint"))) (clojure.core/contains? input "ServiceSoftwareOptions") (clojure.core/assoc :service-software-options (deser-service-software-options (input "ServiceSoftwareOptions"))) (clojure.core/contains? input "VPCOptions") (clojure.core/assoc :vpc-options (deser-vpc-derived-info (input "VPCOptions")))))

(clojure.core/defn- deser-reserved-elasticsearch-instance-payment-option [input] (clojure.core/get {"ALL_UPFRONT" :all-upfront, "PARTIAL_UPFRONT" :partial-upfront, "NO_UPFRONT" :no-upfront} input))

(clojure.core/defn- deser-log-type [input] (clojure.core/get {"INDEX_SLOW_LOGS" :index-slow-logs, "SEARCH_SLOW_LOGS" :search-slow-logs, "ES_APPLICATION_LOGS" :es-application-logs} input))

(clojure.core/defn- deser-elasticsearch-instance-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-es-partition-instance-type coll))) input))

(clojure.core/defn- deser-limits [input] (clojure.core/cond-> {} (clojure.core/contains? input "StorageTypes") (clojure.core/assoc :storage-types (deser-storage-type-list (input "StorageTypes"))) (clojure.core/contains? input "InstanceLimits") (clojure.core/assoc :instance-limits (deser-instance-limits (input "InstanceLimits"))) (clojure.core/contains? input "AdditionalLimits") (clojure.core/assoc :additional-limits (deser-additional-limit-list (input "AdditionalLimits")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-ebs-options-status [input] (clojure.core/cond-> {:options (deser-ebs-options (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-compatible-versions-map [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceVersion") (clojure.core/assoc :source-version (deser-elasticsearch-version-string (input "SourceVersion"))) (clojure.core/contains? input "TargetVersions") (clojure.core/assoc :target-versions (deser-elasticsearch-version-list (input "TargetVersions")))))

(clojure.core/defn- deser-elasticsearch-cluster-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-es-partition-instance-type (input "InstanceType"))) (clojure.core/contains? input "InstanceCount") (clojure.core/assoc :instance-count (deser-integer-class (input "InstanceCount"))) (clojure.core/contains? input "DedicatedMasterEnabled") (clojure.core/assoc :dedicated-master-enabled (deser-boolean (input "DedicatedMasterEnabled"))) (clojure.core/contains? input "ZoneAwarenessEnabled") (clojure.core/assoc :zone-awareness-enabled (deser-boolean (input "ZoneAwarenessEnabled"))) (clojure.core/contains? input "ZoneAwarenessConfig") (clojure.core/assoc :zone-awareness-config (deser-zone-awareness-config (input "ZoneAwarenessConfig"))) (clojure.core/contains? input "DedicatedMasterType") (clojure.core/assoc :dedicated-master-type (deser-es-partition-instance-type (input "DedicatedMasterType"))) (clojure.core/contains? input "DedicatedMasterCount") (clojure.core/assoc :dedicated-master-count (deser-integer-class (input "DedicatedMasterCount")))))

(clojure.core/defn- deser-issue [input] input)

(clojure.core/defn- deser-start-timestamp [input] input)

(clojure.core/defn- deser-elasticsearch-version-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-elasticsearch-version-string coll))) input))

(clojure.core/defn- deser-deployment-close-date-time-stamp [input] input)

(clojure.core/defn- deser-es-partition-instance-type [input] (clojure.core/get {"i3.large.elasticsearch" :i-3largeelasticsearch, "m4.2xlarge.elasticsearch" :m-42xlargeelasticsearch, "d2.4xlarge.elasticsearch" :d-24xlargeelasticsearch, "t2.micro.elasticsearch" :t-2microelasticsearch, "r3.2xlarge.elasticsearch" :r-32xlargeelasticsearch, "c4.large.elasticsearch" :c-4largeelasticsearch, "r4.2xlarge.elasticsearch" :r-42xlargeelasticsearch, "m4.xlarge.elasticsearch" :m-4xlargeelasticsearch, "m3.xlarge.elasticsearch" :m-3xlargeelasticsearch, "i2.2xlarge.elasticsearch" :i-22xlargeelasticsearch, "r4.8xlarge.elasticsearch" :r-48xlargeelasticsearch, "r4.large.elasticsearch" :r-4largeelasticsearch, "r3.xlarge.elasticsearch" :r-3xlargeelasticsearch, "r3.4xlarge.elasticsearch" :r-34xlargeelasticsearch, "r4.16xlarge.elasticsearch" :r-416xlargeelasticsearch, "i3.8xlarge.elasticsearch" :i-38xlargeelasticsearch, "m3.medium.elasticsearch" :m-3mediumelasticsearch, "i3.16xlarge.elasticsearch" :i-316xlargeelasticsearch, "i3.4xlarge.elasticsearch" :i-34xlargeelasticsearch, "t2.medium.elasticsearch" :t-2mediumelasticsearch, "c4.xlarge.elasticsearch" :c-4xlargeelasticsearch, "i3.xlarge.elasticsearch" :i-3xlargeelasticsearch, "r4.4xlarge.elasticsearch" :r-44xlargeelasticsearch, "d2.2xlarge.elasticsearch" :d-22xlargeelasticsearch, "m4.large.elasticsearch" :m-4largeelasticsearch, "t2.small.elasticsearch" :t-2smallelasticsearch, "m4.4xlarge.elasticsearch" :m-44xlargeelasticsearch, "d2.8xlarge.elasticsearch" :d-28xlargeelasticsearch, "c4.2xlarge.elasticsearch" :c-42xlargeelasticsearch, "r3.large.elasticsearch" :r-3largeelasticsearch, "m3.2xlarge.elasticsearch" :m-32xlargeelasticsearch, "m4.10xlarge.elasticsearch" :m-410xlargeelasticsearch, "d2.xlarge.elasticsearch" :d-2xlargeelasticsearch, "m3.large.elasticsearch" :m-3largeelasticsearch, "i2.xlarge.elasticsearch" :i-2xlargeelasticsearch, "r4.xlarge.elasticsearch" :r-4xlargeelasticsearch, "i3.2xlarge.elasticsearch" :i-32xlargeelasticsearch, "c4.4xlarge.elasticsearch" :c-44xlargeelasticsearch, "c4.8xlarge.elasticsearch" :c-48xlargeelasticsearch, "r3.8xlarge.elasticsearch" :r-38xlargeelasticsearch} input))

(clojure.core/defn- deser-option-status [input] (clojure.core/cond-> {:creation-date (deser-update-timestamp (input "CreationDate")), :update-date (deser-update-timestamp (input "UpdateDate")), :state (deser-option-state (input "State"))} (clojure.core/contains? input "UpdateVersion") (clojure.core/assoc :update-version (deser-u-int-value (input "UpdateVersion"))) (clojure.core/contains? input "PendingDeletion") (clojure.core/assoc :pending-deletion (deser-boolean (input "PendingDeletion")))))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-vpc-derived-info-status [input] (clojure.core/cond-> {:options (deser-vpc-derived-info (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-policy-document [input] input)

(clojure.core/defn- deser-zone-awareness-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "AvailabilityZoneCount") (clojure.core/assoc :availability-zone-count (deser-integer-class (input "AvailabilityZoneCount")))))

(clojure.core/defn- deser-additional-limit [input] (clojure.core/cond-> {} (clojure.core/contains? input "LimitName") (clojure.core/assoc :limit-name (deser-limit-name (input "LimitName"))) (clojure.core/contains? input "LimitValues") (clojure.core/assoc :limit-values (deser-limit-value-list (input "LimitValues")))))

(clojure.core/defn- deser-snapshot-options-status [input] (clojure.core/cond-> {:options (deser-snapshot-options (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-instance-limits [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceCountLimits") (clojure.core/assoc :instance-count-limits (deser-instance-count-limits (input "InstanceCountLimits")))))

(clojure.core/defn- deser-node-to-node-encryption-options-status [input] (clojure.core/cond-> {:options (deser-node-to-node-encryption-options (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-kms-key-id [input] input)

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-limits-by-role [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-instance-role k) (deser-limits v)])) input))

(clojure.core/defn- deser-domain-id [input] input)

(clojure.core/defn- deser-minimum-instance-count [input] input)

(clojure.core/defn- deser-integer-class [input] input)

(clojure.core/defn- deser-advanced-options [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-recurring-charge-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-recurring-charge coll))) input))

(clojure.core/defn- deser-storage-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "StorageTypeName") (clojure.core/assoc :storage-type-name (deser-storage-type-name (input "StorageTypeName"))) (clojure.core/contains? input "StorageSubTypeName") (clojure.core/assoc :storage-sub-type-name (deser-storage-sub-type-name (input "StorageSubTypeName"))) (clojure.core/contains? input "StorageTypeLimits") (clojure.core/assoc :storage-type-limits (deser-storage-type-limit-list (input "StorageTypeLimits")))))

(clojure.core/defn- deser-log-publishing-options [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-log-type k) (deser-log-publishing-option v)])) input))

(clojure.core/defn- deser-encryption-at-rest-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId")))))

(clojure.core/defn- deser-volume-type [input] (clojure.core/get {"standard" :standard, "gp2" :gp-2, "io1" :io-1} input))

(clojure.core/defn- deser-cognito-options-status [input] (clojure.core/cond-> {:options (deser-cognito-options (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-service-software-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "CurrentVersion") (clojure.core/assoc :current-version (deser-string (input "CurrentVersion"))) (clojure.core/contains? input "NewVersion") (clojure.core/assoc :new-version (deser-string (input "NewVersion"))) (clojure.core/contains? input "UpdateAvailable") (clojure.core/assoc :update-available (deser-boolean (input "UpdateAvailable"))) (clojure.core/contains? input "Cancellable") (clojure.core/assoc :cancellable (deser-boolean (input "Cancellable"))) (clojure.core/contains? input "UpdateStatus") (clojure.core/assoc :update-status (deser-deployment-status (input "UpdateStatus"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "AutomatedUpdateDate") (clojure.core/assoc :automated-update-date (deser-deployment-close-date-time-stamp (input "AutomatedUpdateDate")))))

(clojure.core/defn- deser-deployment-status [input] (clojure.core/get {"PENDING_UPDATE" :pending-update, "IN_PROGRESS" :in-progress, "COMPLETED" :completed, "NOT_ELIGIBLE" :not-eligible, "ELIGIBLE" :eligible} input))

(clojure.core/defn- deser-upgrade-step [input] (clojure.core/get {"PRE_UPGRADE_CHECK" :pre-upgrade-check, "SNAPSHOT" :snapshot, "UPGRADE" :upgrade} input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-upgrade-step-item [input] (clojure.core/cond-> {} (clojure.core/contains? input "UpgradeStep") (clojure.core/assoc :upgrade-step (deser-upgrade-step (input "UpgradeStep"))) (clojure.core/contains? input "UpgradeStepStatus") (clojure.core/assoc :upgrade-step-status (deser-upgrade-status (input "UpgradeStepStatus"))) (clojure.core/contains? input "Issues") (clojure.core/assoc :issues (deser-issues (input "Issues"))) (clojure.core/contains? input "ProgressPercent") (clojure.core/assoc :progress-percent (deser-double (input "ProgressPercent")))))

(clojure.core/defn- deser-reserved-elasticsearch-instance-offering-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reserved-elasticsearch-instance-offering coll))) input))

(clojure.core/defn- deser-access-policies-status [input] (clojure.core/cond-> {:options (deser-policy-document (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-upgrade-steps-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-upgrade-step-item coll))) input))

(clojure.core/defn- deser-elasticsearch-version-status [input] (clojure.core/cond-> {:options (deser-elasticsearch-version-string (input "Options")), :status (deser-option-status (input "Status"))}))

(clojure.core/defn- deser-domain-name [input] input)

(clojure.core/defn- deser-issues [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-issue coll))) input))

(clojure.core/defn- deser-domain-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "DomainName") (clojure.core/assoc :domain-name (deser-domain-name (input "DomainName")))))

(clojure.core/defn- deser-elasticsearch-version-string [input] input)

(clojure.core/defn- deser-instance-count-limits [input] (clojure.core/cond-> {} (clojure.core/contains? input "MinimumInstanceCount") (clojure.core/assoc :minimum-instance-count (deser-minimum-instance-count (input "MinimumInstanceCount"))) (clojure.core/contains? input "MaximumInstanceCount") (clojure.core/assoc :maximum-instance-count (deser-maximum-instance-count (input "MaximumInstanceCount")))))

(clojure.core/defn- deser-option-state [input] (clojure.core/get {"RequiresIndexDocuments" :requires-index-documents, "Processing" :processing, "Active" :active} input))

(clojure.core/defn- deser-u-int-value [input] input)

(clojure.core/defn- deser-limit-name [input] input)

(clojure.core/defn- deser-limit-value [input] input)

(clojure.core/defn- deser-guid [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-storage-type-limit [input] (clojure.core/cond-> {} (clojure.core/contains? input "LimitName") (clojure.core/assoc :limit-name (deser-limit-name (input "LimitName"))) (clojure.core/contains? input "LimitValues") (clojure.core/assoc :limit-values (deser-limit-value-list (input "LimitValues")))))

(clojure.core/defn- response-delete-elasticsearch-domain-response ([input] (response-delete-elasticsearch-domain-response nil input)) ([resultWrapper1153488 input] (clojure.core/let [rawinput1153487 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153489 {"DomainStatus" (rawinput1153487 "DomainStatus")}] (clojure.core/cond-> {} (letvar1153489 "DomainStatus") (clojure.core/assoc :domain-status (deser-elasticsearch-domain-status (clojure.core/get-in letvar1153489 ["DomainStatus"])))))))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper1153491 input] (clojure.core/let [rawinput1153490 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153492 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-elasticsearch-domain-response ([input] (response-describe-elasticsearch-domain-response nil input)) ([resultWrapper1153494 input] (clojure.core/let [rawinput1153493 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153495 {"DomainStatus" (rawinput1153493 "DomainStatus")}] (clojure.core/cond-> {:domain-status (deser-elasticsearch-domain-status (clojure.core/get-in letvar1153495 ["DomainStatus"]))}))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1153497 input] (clojure.core/let [rawinput1153496 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153498 {"TagList" (rawinput1153496 "TagList")}] (clojure.core/cond-> {} (letvar1153498 "TagList") (clojure.core/assoc :tag-list (deser-tag-list (clojure.core/get-in letvar1153498 ["TagList"])))))))

(clojure.core/defn- response-get-compatible-elasticsearch-versions-response ([input] (response-get-compatible-elasticsearch-versions-response nil input)) ([resultWrapper1153500 input] (clojure.core/let [rawinput1153499 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153501 {"CompatibleElasticsearchVersions" (rawinput1153499 "CompatibleElasticsearchVersions")}] (clojure.core/cond-> {} (letvar1153501 "CompatibleElasticsearchVersions") (clojure.core/assoc :compatible-elasticsearch-versions (deser-compatible-elasticsearch-versions-list (clojure.core/get-in letvar1153501 ["CompatibleElasticsearchVersions"])))))))

(clojure.core/defn- response-list-elasticsearch-versions-response ([input] (response-list-elasticsearch-versions-response nil input)) ([resultWrapper1153503 input] (clojure.core/let [rawinput1153502 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153504 {"ElasticsearchVersions" (rawinput1153502 "ElasticsearchVersions"), "NextToken" (rawinput1153502 "NextToken")}] (clojure.core/cond-> {} (letvar1153504 "ElasticsearchVersions") (clojure.core/assoc :elasticsearch-versions (deser-elasticsearch-version-list (clojure.core/get-in letvar1153504 ["ElasticsearchVersions"]))) (letvar1153504 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1153504 ["NextToken"])))))))

(clojure.core/defn- response-cancel-elasticsearch-service-software-update-response ([input] (response-cancel-elasticsearch-service-software-update-response nil input)) ([resultWrapper1153506 input] (clojure.core/let [rawinput1153505 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153507 {"ServiceSoftwareOptions" (rawinput1153505 "ServiceSoftwareOptions")}] (clojure.core/cond-> {} (letvar1153507 "ServiceSoftwareOptions") (clojure.core/assoc :service-software-options (deser-service-software-options (clojure.core/get-in letvar1153507 ["ServiceSoftwareOptions"])))))))

(clojure.core/defn- response-start-elasticsearch-service-software-update-response ([input] (response-start-elasticsearch-service-software-update-response nil input)) ([resultWrapper1153509 input] (clojure.core/let [rawinput1153508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153510 {"ServiceSoftwareOptions" (rawinput1153508 "ServiceSoftwareOptions")}] (clojure.core/cond-> {} (letvar1153510 "ServiceSoftwareOptions") (clojure.core/assoc :service-software-options (deser-service-software-options (clojure.core/get-in letvar1153510 ["ServiceSoftwareOptions"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1153512 input] (clojure.core/let [rawinput1153511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153513 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1153515 input] (clojure.core/let [rawinput1153514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153516 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-type-exception ([input] (response-invalid-type-exception nil input)) ([resultWrapper1153518 input] (clojure.core/let [rawinput1153517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153519 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-upgrade-status-response ([input] (response-get-upgrade-status-response nil input)) ([resultWrapper1153521 input] (clojure.core/let [rawinput1153520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153522 {"UpgradeStep" (rawinput1153520 "UpgradeStep"), "StepStatus" (rawinput1153520 "StepStatus"), "UpgradeName" (rawinput1153520 "UpgradeName")}] (clojure.core/cond-> {} (letvar1153522 "UpgradeStep") (clojure.core/assoc :upgrade-step (deser-upgrade-step (clojure.core/get-in letvar1153522 ["UpgradeStep"]))) (letvar1153522 "StepStatus") (clojure.core/assoc :step-status (deser-upgrade-status (clojure.core/get-in letvar1153522 ["StepStatus"]))) (letvar1153522 "UpgradeName") (clojure.core/assoc :upgrade-name (deser-upgrade-name (clojure.core/get-in letvar1153522 ["UpgradeName"])))))))

(clojure.core/defn- response-update-elasticsearch-domain-config-response ([input] (response-update-elasticsearch-domain-config-response nil input)) ([resultWrapper1153524 input] (clojure.core/let [rawinput1153523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153525 {"DomainConfig" (rawinput1153523 "DomainConfig")}] (clojure.core/cond-> {:domain-config (deser-elasticsearch-domain-config (clojure.core/get-in letvar1153525 ["DomainConfig"]))}))))

(clojure.core/defn- response-disabled-operation-exception ([input] (response-disabled-operation-exception nil input)) ([resultWrapper1153527 input] (clojure.core/let [rawinput1153526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153528 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-domain-names-response ([input] (response-list-domain-names-response nil input)) ([resultWrapper1153530 input] (clojure.core/let [rawinput1153529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153531 {"DomainNames" (rawinput1153529 "DomainNames")}] (clojure.core/cond-> {} (letvar1153531 "DomainNames") (clojure.core/assoc :domain-names (deser-domain-info-list (clojure.core/get-in letvar1153531 ["DomainNames"])))))))

(clojure.core/defn- response-purchase-reserved-elasticsearch-instance-offering-response ([input] (response-purchase-reserved-elasticsearch-instance-offering-response nil input)) ([resultWrapper1153533 input] (clojure.core/let [rawinput1153532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153534 {"ReservedElasticsearchInstanceId" (rawinput1153532 "ReservedElasticsearchInstanceId"), "ReservationName" (rawinput1153532 "ReservationName")}] (clojure.core/cond-> {} (letvar1153534 "ReservedElasticsearchInstanceId") (clojure.core/assoc :reserved-elasticsearch-instance-id (deser-guid (clojure.core/get-in letvar1153534 ["ReservedElasticsearchInstanceId"]))) (letvar1153534 "ReservationName") (clojure.core/assoc :reservation-name (deser-reservation-token (clojure.core/get-in letvar1153534 ["ReservationName"])))))))

(clojure.core/defn- response-describe-reserved-elasticsearch-instances-response ([input] (response-describe-reserved-elasticsearch-instances-response nil input)) ([resultWrapper1153536 input] (clojure.core/let [rawinput1153535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153537 {"NextToken" (rawinput1153535 "NextToken"), "ReservedElasticsearchInstances" (rawinput1153535 "ReservedElasticsearchInstances")}] (clojure.core/cond-> {} (letvar1153537 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1153537 ["NextToken"]))) (letvar1153537 "ReservedElasticsearchInstances") (clojure.core/assoc :reserved-elasticsearch-instances (deser-reserved-elasticsearch-instance-list (clojure.core/get-in letvar1153537 ["ReservedElasticsearchInstances"])))))))

(clojure.core/defn- response-list-elasticsearch-instance-types-response ([input] (response-list-elasticsearch-instance-types-response nil input)) ([resultWrapper1153539 input] (clojure.core/let [rawinput1153538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153540 {"ElasticsearchInstanceTypes" (rawinput1153538 "ElasticsearchInstanceTypes"), "NextToken" (rawinput1153538 "NextToken")}] (clojure.core/cond-> {} (letvar1153540 "ElasticsearchInstanceTypes") (clojure.core/assoc :elasticsearch-instance-types (deser-elasticsearch-instance-type-list (clojure.core/get-in letvar1153540 ["ElasticsearchInstanceTypes"]))) (letvar1153540 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1153540 ["NextToken"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1153542 input] (clojure.core/let [rawinput1153541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153543 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-reserved-elasticsearch-instance-offerings-response ([input] (response-describe-reserved-elasticsearch-instance-offerings-response nil input)) ([resultWrapper1153545 input] (clojure.core/let [rawinput1153544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153546 {"NextToken" (rawinput1153544 "NextToken"), "ReservedElasticsearchInstanceOfferings" (rawinput1153544 "ReservedElasticsearchInstanceOfferings")}] (clojure.core/cond-> {} (letvar1153546 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1153546 ["NextToken"]))) (letvar1153546 "ReservedElasticsearchInstanceOfferings") (clojure.core/assoc :reserved-elasticsearch-instance-offerings (deser-reserved-elasticsearch-instance-offering-list (clojure.core/get-in letvar1153546 ["ReservedElasticsearchInstanceOfferings"])))))))

(clojure.core/defn- response-internal-exception ([input] (response-internal-exception nil input)) ([resultWrapper1153548 input] (clojure.core/let [rawinput1153547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153549 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-upgrade-elasticsearch-domain-response ([input] (response-upgrade-elasticsearch-domain-response nil input)) ([resultWrapper1153551 input] (clojure.core/let [rawinput1153550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153552 {"DomainName" (rawinput1153550 "DomainName"), "TargetVersion" (rawinput1153550 "TargetVersion"), "PerformCheckOnly" (rawinput1153550 "PerformCheckOnly")}] (clojure.core/cond-> {} (letvar1153552 "DomainName") (clojure.core/assoc :domain-name (deser-domain-name (clojure.core/get-in letvar1153552 ["DomainName"]))) (letvar1153552 "TargetVersion") (clojure.core/assoc :target-version (deser-elasticsearch-version-string (clojure.core/get-in letvar1153552 ["TargetVersion"]))) (letvar1153552 "PerformCheckOnly") (clojure.core/assoc :perform-check-only (deser-boolean (clojure.core/get-in letvar1153552 ["PerformCheckOnly"])))))))

(clojure.core/defn- response-describe-elasticsearch-domains-response ([input] (response-describe-elasticsearch-domains-response nil input)) ([resultWrapper1153554 input] (clojure.core/let [rawinput1153553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153555 {"DomainStatusList" (rawinput1153553 "DomainStatusList")}] (clojure.core/cond-> {:domain-status-list (deser-elasticsearch-domain-status-list (clojure.core/get-in letvar1153555 ["DomainStatusList"]))}))))

(clojure.core/defn- response-base-exception ([input] (response-base-exception nil input)) ([resultWrapper1153557 input] (clojure.core/let [rawinput1153556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153558 {"message" (rawinput1153556 "message")}] (clojure.core/cond-> {} (letvar1153558 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1153558 ["message"])))))))

(clojure.core/defn- response-describe-elasticsearch-instance-type-limits-response ([input] (response-describe-elasticsearch-instance-type-limits-response nil input)) ([resultWrapper1153560 input] (clojure.core/let [rawinput1153559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153561 {"LimitsByRole" (rawinput1153559 "LimitsByRole")}] (clojure.core/cond-> {} (letvar1153561 "LimitsByRole") (clojure.core/assoc :limits-by-role (deser-limits-by-role (clojure.core/get-in letvar1153561 ["LimitsByRole"])))))))

(clojure.core/defn- response-create-elasticsearch-domain-response ([input] (response-create-elasticsearch-domain-response nil input)) ([resultWrapper1153563 input] (clojure.core/let [rawinput1153562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153564 {"DomainStatus" (rawinput1153562 "DomainStatus")}] (clojure.core/cond-> {} (letvar1153564 "DomainStatus") (clojure.core/assoc :domain-status (deser-elasticsearch-domain-status (clojure.core/get-in letvar1153564 ["DomainStatus"])))))))

(clojure.core/defn- response-get-upgrade-history-response ([input] (response-get-upgrade-history-response nil input)) ([resultWrapper1153566 input] (clojure.core/let [rawinput1153565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153567 {"UpgradeHistories" (rawinput1153565 "UpgradeHistories"), "NextToken" (rawinput1153565 "NextToken")}] (clojure.core/cond-> {} (letvar1153567 "UpgradeHistories") (clojure.core/assoc :upgrade-histories (deser-upgrade-history-list (clojure.core/get-in letvar1153567 ["UpgradeHistories"]))) (letvar1153567 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1153567 ["NextToken"])))))))

(clojure.core/defn- response-describe-elasticsearch-domain-config-response ([input] (response-describe-elasticsearch-domain-config-response nil input)) ([resultWrapper1153569 input] (clojure.core/let [rawinput1153568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1153570 {"DomainConfig" (rawinput1153568 "DomainConfig")}] (clojure.core/cond-> {:domain-config (deser-elasticsearch-domain-config (clojure.core/get-in letvar1153570 ["DomainConfig"]))}))))

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

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/reservation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 5 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/tag-list]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.get-compatible-elasticsearch-versions-response/compatible-elasticsearch-versions (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/compatible-elasticsearch-versions-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.get-compatible-elasticsearch-versions-response/compatible-elasticsearch-versions]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 20 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/additional-limit-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/additional-limit))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-versions-response/elasticsearch-versions (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-versions-response/elasticsearch-versions :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/cancel-elasticsearch-service-software-update-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/service-software-options]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.log-publishing-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/log-publishing-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.log-publishing-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/log-publishing-options-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.log-publishing-options-status/options :portkey.aws.es.-2015-01-01.log-publishing-options-status/status]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/start-elasticsearch-service-software-update-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/start-elasticsearch-service-software-update-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/service-software-options]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-info-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/domain-info))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/get-upgrade-history-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un [:portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 55)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-request/elasticsearch-version] :opt-un [:portkey.aws.es.-2015-01-01/domain-name :portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/user-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 55)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[\w-]+_[0-9a-zA-Z]+" s__1012854__auto__))))

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
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-id :portkey.aws.es.-2015-01-01/domain-name :portkey.aws.es.-2015-01-01/arn :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config] :opt-un [:portkey.aws.es.-2015-01-01/snapshot-options :portkey.aws.es.-2015-01-01/ebs-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/created :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/elasticsearch-version :portkey.aws.es.-2015-01-01/node-to-node-encryption-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/access-policies :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/endpoints :portkey.aws.es.-2015-01-01/cognito-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/deleted :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/upgrade-processing :portkey.aws.es.-2015-01-01/advanced-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/processing :portkey.aws.es.-2015-01-01/log-publishing-options :portkey.aws.es.-2015-01-01/encryption-at-rest-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/endpoint :portkey.aws.es.-2015-01-01/service-software-options :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/vpc-options]))

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
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-type :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-count :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-enabled :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/zone-awareness-enabled :portkey.aws.es.-2015-01-01/zone-awareness-config :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-type :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-count]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/issue (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-response/elasticsearch-instance-types (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-instance-type-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-response/elasticsearch-instance-types :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/start-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-version-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/elasticsearch-version-string))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/deployment-close-date-time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/max-results :portkey.aws.es.-2015-01-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/es-partition-instance-type #{"i3.large.elasticsearch" :m-32xlargeelasticsearch :r-48xlargeelasticsearch :m-3xlargeelasticsearch "m4.2xlarge.elasticsearch" :m-42xlargeelasticsearch :t-2mediumelasticsearch "d2.4xlarge.elasticsearch" :r-416xlargeelasticsearch "t2.micro.elasticsearch" "r3.2xlarge.elasticsearch" "c4.large.elasticsearch" "r4.2xlarge.elasticsearch" :m-3mediumelasticsearch "m4.xlarge.elasticsearch" :m-4largeelasticsearch :c-48xlargeelasticsearch "m3.xlarge.elasticsearch" "i2.2xlarge.elasticsearch" :t-2microelasticsearch :i-3largeelasticsearch "r4.8xlarge.elasticsearch" "r4.large.elasticsearch" "r3.xlarge.elasticsearch" "r3.4xlarge.elasticsearch" "r4.16xlarge.elasticsearch" "i3.8xlarge.elasticsearch" "m3.medium.elasticsearch" "i3.16xlarge.elasticsearch" :m-4xlargeelasticsearch "i3.4xlarge.elasticsearch" "t2.medium.elasticsearch" :d-2xlargeelasticsearch :i-34xlargeelasticsearch :i-2xlargeelasticsearch "c4.xlarge.elasticsearch" :i-38xlargeelasticsearch :i-316xlargeelasticsearch "i3.xlarge.elasticsearch" "r4.4xlarge.elasticsearch" "d2.2xlarge.elasticsearch" :r-3largeelasticsearch "m4.large.elasticsearch" :d-24xlargeelasticsearch :c-4largeelasticsearch :d-28xlargeelasticsearch :r-38xlargeelasticsearch "t2.small.elasticsearch" :m-3largeelasticsearch "m4.4xlarge.elasticsearch" :r-42xlargeelasticsearch :c-4xlargeelasticsearch :m-44xlargeelasticsearch :m-410xlargeelasticsearch :t-2smallelasticsearch "d2.8xlarge.elasticsearch" :i-22xlargeelasticsearch :c-44xlargeelasticsearch "c4.2xlarge.elasticsearch" :r-4xlargeelasticsearch "r3.large.elasticsearch" :d-22xlargeelasticsearch "m3.2xlarge.elasticsearch" "m4.10xlarge.elasticsearch" :r-34xlargeelasticsearch "d2.xlarge.elasticsearch" :i-3xlargeelasticsearch :r-44xlargeelasticsearch "m3.large.elasticsearch" :r-32xlargeelasticsearch :r-3xlargeelasticsearch "i2.xlarge.elasticsearch" :i-32xlargeelasticsearch "r4.xlarge.elasticsearch" :c-42xlargeelasticsearch "i3.2xlarge.elasticsearch" "c4.4xlarge.elasticsearch" "c4.8xlarge.elasticsearch" :r-4largeelasticsearch "r3.8xlarge.elasticsearch"})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/creation-date (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/update-date (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/update-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/u-int-value))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/state (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-state))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/pending-deletion (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/option-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.option-status/creation-date :portkey.aws.es.-2015-01-01.option-status/update-date :portkey.aws.es.-2015-01-01.option-status/state] :opt-un [:portkey.aws.es.-2015-01-01.option-status/update-version :portkey.aws.es.-2015-01-01.option-status/pending-deletion]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/vpc-derived-info))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.vpc-derived-info-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/vpc-derived-info-status (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01.vpc-derived-info-status/options :portkey.aws.es.-2015-01-01.vpc-derived-info-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instance-offerings-response/reserved-elasticsearch-instance-offerings (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/reserved-elasticsearch-instance-offering-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/next-token :portkey.aws.es.-2015-01-01.describe-reserved-elasticsearch-instance-offerings-response/reserved-elasticsearch-instance-offerings]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.zone-awareness-config/availability-zone-count (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/zone-awareness-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.zone-awareness-config/availability-zone-count]))

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

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 500))))

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

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.service-software-options/current-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.service-software-options/new-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.service-software-options/update-available (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.service-software-options/cancellable (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.service-software-options/update-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/deployment-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.service-software-options/description (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.service-software-options/automated-update-date (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/deployment-close-date-time-stamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/service-software-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.service-software-options/current-version :portkey.aws.es.-2015-01-01.service-software-options/new-version :portkey.aws.es.-2015-01-01.service-software-options/update-available :portkey.aws.es.-2015-01-01.service-software-options/cancellable :portkey.aws.es.-2015-01-01.service-software-options/update-status :portkey.aws.es.-2015-01-01.service-software-options/description :portkey.aws.es.-2015-01-01.service-software-options/automated-update-date]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/deployment-status #{"COMPLETED" :pending-update :eligible "IN_PROGRESS" :in-progress :completed :not-eligible "PENDING_UPDATE" "NOT_ELIGIBLE" "ELIGIBLE"})

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

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 3 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 28)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-z][a-z0-9\-]+" s__1012854__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/guid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{12}" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/target-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/perform-check-only (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name :portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/target-version] :opt-un [:portkey.aws.es.-2015-01-01.upgrade-elasticsearch-domain-request/perform-check-only]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/cancel-elasticsearch-service-software-update-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.storage-type-limit/limit-values (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/limit-value-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/limit-name :portkey.aws.es.-2015-01-01.storage-type-limit/limit-values]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.es.-2015-01-01/arn] :opt-un []))

(clojure.core/defn delete-elasticsearch-service-role ([] (delete-elasticsearch-service-role {})) ([_] (clojure.core/let [request-function-result__1013884__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/role", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec nil, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteElasticsearchServiceRole", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef delete-elasticsearch-service-role :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn remove-tags ([remove-tags-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-remove-tags-request remove-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/tags-removal", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/remove-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/remove-tags-request) :ret clojure.core/true?)

(clojure.core/defn list-domain-names ([] (list-domain-names {})) ([_] (clojure.core/let [request-function-result__1013884__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-domain-names-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/domain", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec nil, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDomainNames", :http.request.configuration/output-deser-fn response-list-domain-names-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef list-domain-names :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-domain-names-response))

(clojure.core/defn get-upgrade-status ([get-upgrade-status-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-upgrade-status-request get-upgrade-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/get-upgrade-status-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/upgradeDomain/{DomainName}/status", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/get-upgrade-status-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUpgradeStatus", :http.request.configuration/output-deser-fn response-get-upgrade-status-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef get-upgrade-status :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/get-upgrade-status-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/get-upgrade-status-response))

(clojure.core/defn update-elasticsearch-domain-config ([update-elasticsearch-domain-config-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-elasticsearch-domain-config-request update-elasticsearch-domain-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}/config", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateElasticsearchDomainConfig", :http.request.configuration/output-deser-fn response-update-elasticsearch-domain-config-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef update-elasticsearch-domain-config :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-response))

(clojure.core/defn describe-elasticsearch-domain-config ([describe-elasticsearch-domain-config-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-elasticsearch-domain-config-request describe-elasticsearch-domain-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}/config", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeElasticsearchDomainConfig", :http.request.configuration/output-deser-fn response-describe-elasticsearch-domain-config-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-domain-config :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-response))

(clojure.core/defn purchase-reserved-elasticsearch-instance-offering ([purchase-reserved-elasticsearch-instance-offering-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-purchase-reserved-elasticsearch-instance-offering-request purchase-reserved-elasticsearch-instance-offering-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/purchaseReservedInstanceOffering", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PurchaseReservedElasticsearchInstanceOffering", :http.request.configuration/output-deser-fn response-purchase-reserved-elasticsearch-instance-offering-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.es.-2015-01-01/resource-already-exists-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef purchase-reserved-elasticsearch-instance-offering :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/purchase-reserved-elasticsearch-instance-offering-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/tags/", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/list-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-tags-response))

(clojure.core/defn describe-elasticsearch-domain ([describe-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-elasticsearch-domain-request describe-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeElasticsearchDomain", :http.request.configuration/output-deser-fn response-describe-elasticsearch-domain-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-response))

(clojure.core/defn describe-reserved-elasticsearch-instances ([] (describe-reserved-elasticsearch-instances {})) ([describe-reserved-elasticsearch-instances-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-reserved-elasticsearch-instances-request describe-reserved-elasticsearch-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/reservedInstances", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeReservedElasticsearchInstances", :http.request.configuration/output-deser-fn response-describe-reserved-elasticsearch-instances-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception}})))))
(clojure.spec.alpha/fdef describe-reserved-elasticsearch-instances :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instances-response))

(clojure.core/defn describe-elasticsearch-instance-type-limits ([describe-elasticsearch-instance-type-limits-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-elasticsearch-instance-type-limits-request describe-elasticsearch-instance-type-limits-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/instanceTypeLimits/{ElasticsearchVersion}/{InstanceType}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeElasticsearchInstanceTypeLimits", :http.request.configuration/output-deser-fn response-describe-elasticsearch-instance-type-limits-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-instance-type-limits :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-response))

(clojure.core/defn list-elasticsearch-versions ([] (list-elasticsearch-versions {})) ([list-elasticsearch-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-elasticsearch-versions-request list-elasticsearch-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/versions", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListElasticsearchVersions", :http.request.configuration/output-deser-fn response-list-elasticsearch-versions-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef list-elasticsearch-versions :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response))

(clojure.core/defn upgrade-elasticsearch-domain ([upgrade-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-upgrade-elasticsearch-domain-request upgrade-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/upgradeDomain", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpgradeElasticsearchDomain", :http.request.configuration/output-deser-fn response-upgrade-elasticsearch-domain-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.es.-2015-01-01/resource-already-exists-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef upgrade-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/upgrade-elasticsearch-domain-response))

(clojure.core/defn get-upgrade-history ([get-upgrade-history-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-upgrade-history-request get-upgrade-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/get-upgrade-history-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/upgradeDomain/{DomainName}/history", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/get-upgrade-history-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUpgradeHistory", :http.request.configuration/output-deser-fn response-get-upgrade-history-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef get-upgrade-history :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/get-upgrade-history-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/get-upgrade-history-response))

(clojure.core/defn get-compatible-elasticsearch-versions ([] (get-compatible-elasticsearch-versions {})) ([get-compatible-elasticsearch-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-compatible-elasticsearch-versions-request get-compatible-elasticsearch-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/compatibleVersions", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCompatibleElasticsearchVersions", :http.request.configuration/output-deser-fn response-get-compatible-elasticsearch-versions-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef get-compatible-elasticsearch-versions :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/get-compatible-elasticsearch-versions-response))

(clojure.core/defn start-elasticsearch-service-software-update ([start-elasticsearch-service-software-update-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-start-elasticsearch-service-software-update-request start-elasticsearch-service-software-update-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/start-elasticsearch-service-software-update-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/serviceSoftwareUpdate/start", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/start-elasticsearch-service-software-update-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartElasticsearchServiceSoftwareUpdate", :http.request.configuration/output-deser-fn response-start-elasticsearch-service-software-update-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef start-elasticsearch-service-software-update :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/start-elasticsearch-service-software-update-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/start-elasticsearch-service-software-update-response))

(clojure.core/defn describe-elasticsearch-domains ([describe-elasticsearch-domains-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-elasticsearch-domains-request describe-elasticsearch-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain-info", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeElasticsearchDomains", :http.request.configuration/output-deser-fn response-describe-elasticsearch-domains-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-elasticsearch-domains :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-response))

(clojure.core/defn delete-elasticsearch-domain ([delete-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-elasticsearch-domain-request delete-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain/{DomainName}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteElasticsearchDomain", :http.request.configuration/output-deser-fn response-delete-elasticsearch-domain-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef delete-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-response))

(clojure.core/defn add-tags ([add-tags-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-add-tags-request add-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/tags", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/add-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/add-tags-request) :ret clojure.core/true?)

(clojure.core/defn list-elasticsearch-instance-types ([list-elasticsearch-instance-types-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-elasticsearch-instance-types-request list-elasticsearch-instance-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/instanceTypes/{ElasticsearchVersion}", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListElasticsearchInstanceTypes", :http.request.configuration/output-deser-fn response-list-elasticsearch-instance-types-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef list-elasticsearch-instance-types :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response))

(clojure.core/defn describe-reserved-elasticsearch-instance-offerings ([] (describe-reserved-elasticsearch-instance-offerings {})) ([describe-reserved-elasticsearch-instance-offerings-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-reserved-elasticsearch-instance-offerings-request describe-reserved-elasticsearch-instance-offerings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/reservedInstanceOfferings", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeReservedElasticsearchInstanceOfferings", :http.request.configuration/output-deser-fn response-describe-reserved-elasticsearch-instance-offerings-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef describe-reserved-elasticsearch-instance-offerings :args (clojure.spec.alpha/? :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/describe-reserved-elasticsearch-instance-offerings-response))

(clojure.core/defn create-elasticsearch-domain ([create-elasticsearch-domain-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-elasticsearch-domain-request create-elasticsearch-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/domain", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateElasticsearchDomain", :http.request.configuration/output-deser-fn response-create-elasticsearch-domain-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.es.-2015-01-01/resource-already-exists-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef create-elasticsearch-domain :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-response))

(clojure.core/defn cancel-elasticsearch-service-software-update ([cancel-elasticsearch-service-software-update-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-cancel-elasticsearch-service-software-update-request cancel-elasticsearch-service-software-update-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.es.-2015-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.es.-2015-01-01/cancel-elasticsearch-service-software-update-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-01-01/es/serviceSoftwareUpdate/cancel", :http.request.configuration/version "2015-01-01", :http.request.configuration/service-id "Elasticsearch Service", :http.request.spec/input-spec :portkey.aws.es.-2015-01-01/cancel-elasticsearch-service-software-update-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelElasticsearchServiceSoftwareUpdate", :http.request.configuration/output-deser-fn response-cancel-elasticsearch-service-software-update-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}})))))
(clojure.spec.alpha/fdef cancel-elasticsearch-service-software-update :args (clojure.spec.alpha/tuple :portkey.aws.es.-2015-01-01/cancel-elasticsearch-service-software-update-request) :ret (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/cancel-elasticsearch-service-software-update-response))
