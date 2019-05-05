(ns portkey.aws.dax (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "dax", :region "ap-northeast-1"},
    :ssl-common-name "dax.ap-northeast-1.amazonaws.com",
    :endpoint "https://dax.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "dax", :region "eu-west-1"},
    :ssl-common-name "dax.eu-west-1.amazonaws.com",
    :endpoint "https://dax.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "dax", :region "us-east-2"},
    :ssl-common-name "dax.us-east-2.amazonaws.com",
    :endpoint "https://dax.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "dax", :region "ap-southeast-2"},
    :ssl-common-name "dax.ap-southeast-2.amazonaws.com",
    :endpoint "https://dax.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "dax", :region "sa-east-1"},
    :ssl-common-name "dax.sa-east-1.amazonaws.com",
    :endpoint "https://dax.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "dax", :region "ap-southeast-1"},
    :ssl-common-name "dax.ap-southeast-1.amazonaws.com",
    :endpoint "https://dax.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "dax", :region "eu-central-1"},
    :ssl-common-name "dax.eu-central-1.amazonaws.com",
    :endpoint "https://dax.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "dax", :region "us-west-2"},
    :ssl-common-name "dax.us-west-2.amazonaws.com",
    :endpoint "https://dax.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "dax", :region "us-east-1"},
    :ssl-common-name "dax.us-east-1.amazonaws.com",
    :endpoint "https://dax.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "dax", :region "us-west-1"},
    :ssl-common-name "dax.us-west-1.amazonaws.com",
    :endpoint "https://dax.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "dax", :region "ap-south-1"},
    :ssl-common-name "dax.ap-south-1.amazonaws.com",
    :endpoint "https://dax.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-subnet-identifier-list)

(clojure.core/declare ser-cluster-name-list)

(clojure.core/declare ser-sse-enabled)

(clojure.core/declare ser-node-identifier-list)

(clojure.core/declare ser-parameter-name-value-list)

(clojure.core/declare ser-key-list)

(clojure.core/declare ser-source-type)

(clojure.core/declare ser-availability-zone-list)

(clojure.core/declare ser-parameter-name-value)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-sse-specification)

(clojure.core/declare ser-subnet-group-name-list)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-t-stamp)

(clojure.core/declare ser-security-group-identifier-list)

(clojure.core/declare ser-parameter-group-name-list)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-integer-optional)

(clojure.core/defn- ser-subnet-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "SubnetIdentifierList", :type "list"})

(clojure.core/defn- ser-cluster-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ClusterNameList", :type "list"})

(clojure.core/defn- ser-sse-enabled [input] #:http.request.field{:value input, :shape "SSEEnabled"})

(clojure.core/defn- ser-node-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "NodeIdentifierList", :type "list"})

(clojure.core/defn- ser-parameter-name-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-name-value coll) #:http.request.field{:shape "ParameterNameValue"}))) input), :shape "ParameterNameValueList", :type "list"})

(clojure.core/defn- ser-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "KeyList", :type "list"})

(clojure.core/defn- ser-source-type [input] #:http.request.field{:value (clojure.core/get {"CLUSTER" "CLUSTER", :cluster "CLUSTER", "PARAMETER_GROUP" "PARAMETER_GROUP", :parameter-group "PARAMETER_GROUP", "SUBNET_GROUP" "SUBNET_GROUP", :subnet-group "SUBNET_GROUP"} input), :shape "SourceType"})

(clojure.core/defn- ser-availability-zone-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "AvailabilityZoneList", :type "list"})

(clojure.core/defn- ser-parameter-name-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParameterNameValue", :type "structure"} (clojure.core/contains? input :parameter-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :parameter-name)) #:http.request.field{:name "ParameterName", :shape "String"})) (clojure.core/contains? input :parameter-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :parameter-value)) #:http.request.field{:name "ParameterValue", :shape "String"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-sse-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sse-enabled (:enabled input)) #:http.request.field{:name "Enabled", :shape "SSEEnabled"})], :shape "SSESpecification", :type "structure"}))

(clojure.core/defn- ser-subnet-group-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "SubnetGroupNameList", :type "list"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-t-stamp [input] #:http.request.field{:value input, :shape "TStamp"})

(clojure.core/defn- ser-security-group-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "SecurityGroupIdentifierList", :type "list"})

(clojure.core/defn- ser-parameter-group-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ParameterGroupNameList", :type "list"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key)) #:http.request.field{:name "Key", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-integer-optional [input] #:http.request.field{:value input, :shape "IntegerOptional"})

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "ClusterName", :shape "String"})]}))

(clojure.core/defn- req-increase-replication-factor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "ClusterName", :shape "String"}) (clojure.core/into (ser-integer (input :new-replication-factor)) #:http.request.field{:name "NewReplicationFactor", :shape "Integer"})]} (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zone-list (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZoneList"}))))

(clojure.core/defn- req-describe-events-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-name)) #:http.request.field{:name "SourceName", :shape "String"})) (clojure.core/contains? input :source-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-type (input :source-type)) #:http.request.field{:name "SourceType", :shape "SourceType"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-t-stamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "TStamp"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-t-stamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "TStamp"})) (clojure.core/contains? input :duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :duration)) #:http.request.field{:name "Duration", :shape "IntegerOptional"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerOptional"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :parameter-group-name)) #:http.request.field{:name "ParameterGroupName", :shape "String"})]} (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source)) #:http.request.field{:name "Source", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerOptional"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cluster-name-list (input :cluster-names)) #:http.request.field{:name "ClusterNames", :shape "ClusterNameList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerOptional"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "String"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-decrease-replication-factor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "ClusterName", :shape "String"}) (clojure.core/into (ser-integer (input :new-replication-factor)) #:http.request.field{:name "NewReplicationFactor", :shape "Integer"})]} (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zone-list (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZoneList"})) (clojure.core/contains? input :node-ids-to-remove) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-node-identifier-list (input :node-ids-to-remove)) #:http.request.field{:name "NodeIdsToRemove", :shape "NodeIdentifierList"}))))

(clojure.core/defn- req-update-subnet-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :subnet-group-name)) #:http.request.field{:name "SubnetGroupName", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-identifier-list (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIdentifierList"}))))

(clojure.core/defn- req-create-subnet-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :subnet-group-name)) #:http.request.field{:name "SubnetGroupName", :shape "String"}) (clojure.core/into (ser-subnet-identifier-list (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIdentifierList"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"}))))

(clojure.core/defn- req-update-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "ClusterName", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :preferred-maintenance-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :preferred-maintenance-window)) #:http.request.field{:name "PreferredMaintenanceWindow", :shape "String"})) (clojure.core/contains? input :notification-topic-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :notification-topic-arn)) #:http.request.field{:name "NotificationTopicArn", :shape "String"})) (clojure.core/contains? input :notification-topic-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :notification-topic-status)) #:http.request.field{:name "NotificationTopicStatus", :shape "String"})) (clojure.core/contains? input :parameter-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :parameter-group-name)) #:http.request.field{:name "ParameterGroupName", :shape "String"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-identifier-list (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIdentifierList"}))))

(clojure.core/defn- req-delete-subnet-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :subnet-group-name)) #:http.request.field{:name "SubnetGroupName", :shape "String"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "ClusterName", :shape "String"}) (clojure.core/into (ser-string (input :node-type)) #:http.request.field{:name "NodeType", :shape "String"}) (clojure.core/into (ser-integer (input :replication-factor)) #:http.request.field{:name "ReplicationFactor", :shape "Integer"}) (clojure.core/into (ser-string (input :iam-role-arn)) #:http.request.field{:name "IamRoleArn", :shape "String"})]} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-identifier-list (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIdentifierList"})) (clojure.core/contains? input :preferred-maintenance-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :preferred-maintenance-window)) #:http.request.field{:name "PreferredMaintenanceWindow", :shape "String"})) (clojure.core/contains? input :subnet-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :subnet-group-name)) #:http.request.field{:name "SubnetGroupName", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :parameter-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :parameter-group-name)) #:http.request.field{:name "ParameterGroupName", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :sse-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-specification (input :sse-specification)) #:http.request.field{:name "SSESpecification", :shape "SSESpecification"})) (clojure.core/contains? input :notification-topic-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :notification-topic-arn)) #:http.request.field{:name "NotificationTopicArn", :shape "String"})) (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zone-list (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZoneList"}))))

(clojure.core/defn- req-describe-subnet-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :subnet-group-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-group-name-list (input :subnet-group-names)) #:http.request.field{:name "SubnetGroupNames", :shape "SubnetGroupNameList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerOptional"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-delete-parameter-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :parameter-group-name)) #:http.request.field{:name "ParameterGroupName", :shape "String"})]}))

(clojure.core/defn- req-reboot-node-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "ClusterName", :shape "String"}) (clojure.core/into (ser-string (input :node-id)) #:http.request.field{:name "NodeId", :shape "String"})]}))

(clojure.core/defn- req-update-parameter-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :parameter-group-name)) #:http.request.field{:name "ParameterGroupName", :shape "String"}) (clojure.core/into (ser-parameter-name-value-list (input :parameter-name-values)) #:http.request.field{:name "ParameterNameValues", :shape "ParameterNameValueList"})]}))

(clojure.core/defn- req-describe-default-parameters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerOptional"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-create-parameter-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :parameter-group-name)) #:http.request.field{:name "ParameterGroupName", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"}))))

(clojure.core/defn- req-describe-parameter-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :parameter-group-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-group-name-list (input :parameter-group-names)) #:http.request.field{:name "ParameterGroupNames", :shape "ParameterGroupNameList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-optional (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerOptional"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "String"}) (clojure.core/into (ser-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "KeyList"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/declare deser-subnet-group-list)

(clojure.core/declare deser-change-type)

(clojure.core/declare deser-security-group-membership-list)

(clojure.core/declare deser-parameter-type)

(clojure.core/declare deser-node-identifier-list)

(clojure.core/declare deser-parameter-group-status)

(clojure.core/declare deser-subnet)

(clojure.core/declare deser-event-list)

(clojure.core/declare deser-source-type)

(clojure.core/declare deser-event)

(clojure.core/declare deser-cluster-list)

(clojure.core/declare deser-parameter-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-subnet-group)

(clojure.core/declare deser-sse-status)

(clojure.core/declare deser-cluster)

(clojure.core/declare deser-node-type-specific-value-list)

(clojure.core/declare deser-parameter-group)

(clojure.core/declare deser-node-type-specific-value)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-parameter)

(clojure.core/declare deser-t-stamp)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deser-security-group-membership)

(clojure.core/declare deser-is-modifiable)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-notification-configuration)

(clojure.core/declare deser-aws-query-error-message)

(clojure.core/declare deser-sse-description)

(clojure.core/declare deser-integer-optional)

(clojure.core/declare deser-node)

(clojure.core/declare deser-subnet-list)

(clojure.core/declare deser-node-list)

(clojure.core/declare deser-parameter-group-list)

(clojure.core/defn- deser-subnet-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-group coll))) input))

(clojure.core/defn- deser-change-type [input] (clojure.core/get {"IMMEDIATE" :immediate, "REQUIRES_REBOOT" :requires-reboot} input))

(clojure.core/defn- deser-security-group-membership-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-membership coll))) input))

(clojure.core/defn- deser-parameter-type [input] (clojure.core/get {"DEFAULT" :default, "NODE_TYPE_SPECIFIC" :node-type-specific} input))

(clojure.core/defn- deser-node-identifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-parameter-group-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "ParameterGroupName") (clojure.core/assoc :parameter-group-name (deser-string (input "ParameterGroupName"))) (clojure.core/contains? input "ParameterApplyStatus") (clojure.core/assoc :parameter-apply-status (deser-string (input "ParameterApplyStatus"))) (clojure.core/contains? input "NodeIdsToReboot") (clojure.core/assoc :node-ids-to-reboot (deser-node-identifier-list (input "NodeIdsToReboot")))))

(clojure.core/defn- deser-subnet [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetIdentifier") (clojure.core/assoc :subnet-identifier (deser-string (input "SubnetIdentifier"))) (clojure.core/contains? input "SubnetAvailabilityZone") (clojure.core/assoc :subnet-availability-zone (deser-string (input "SubnetAvailabilityZone")))))

(clojure.core/defn- deser-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event coll))) input))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"CLUSTER" :cluster, "PARAMETER_GROUP" :parameter-group, "SUBNET_GROUP" :subnet-group} input))

(clojure.core/defn- deser-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceName") (clojure.core/assoc :source-name (deser-string (input "SourceName"))) (clojure.core/contains? input "SourceType") (clojure.core/assoc :source-type (deser-source-type (input "SourceType"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message"))) (clojure.core/contains? input "Date") (clojure.core/assoc :date (deser-t-stamp (input "Date")))))

(clojure.core/defn- deser-cluster-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cluster coll))) input))

(clojure.core/defn- deser-parameter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-subnet-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetGroupName") (clojure.core/assoc :subnet-group-name (deser-string (input "SubnetGroupName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-string (input "VpcId"))) (clojure.core/contains? input "Subnets") (clojure.core/assoc :subnets (deser-subnet-list (input "Subnets")))))

(clojure.core/defn- deser-sse-status [input] (clojure.core/get {"ENABLING" :enabling, "ENABLED" :enabled, "DISABLING" :disabling, "DISABLED" :disabled} input))

(clojure.core/defn- deser-cluster [input] (clojure.core/cond-> {} (clojure.core/contains? input "TotalNodes") (clojure.core/assoc :total-nodes (deser-integer-optional (input "TotalNodes"))) (clojure.core/contains? input "Nodes") (clojure.core/assoc :nodes (deser-node-list (input "Nodes"))) (clojure.core/contains? input "PreferredMaintenanceWindow") (clojure.core/assoc :preferred-maintenance-window (deser-string (input "PreferredMaintenanceWindow"))) (clojure.core/contains? input "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-group-membership-list (input "SecurityGroups"))) (clojure.core/contains? input "ClusterArn") (clojure.core/assoc :cluster-arn (deser-string (input "ClusterArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "IamRoleArn") (clojure.core/assoc :iam-role-arn (deser-string (input "IamRoleArn"))) (clojure.core/contains? input "SubnetGroup") (clojure.core/assoc :subnet-group (deser-string (input "SubnetGroup"))) (clojure.core/contains? input "ClusterDiscoveryEndpoint") (clojure.core/assoc :cluster-discovery-endpoint (deser-endpoint (input "ClusterDiscoveryEndpoint"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "ParameterGroup") (clojure.core/assoc :parameter-group (deser-parameter-group-status (input "ParameterGroup"))) (clojure.core/contains? input "ActiveNodes") (clojure.core/assoc :active-nodes (deser-integer-optional (input "ActiveNodes"))) (clojure.core/contains? input "ClusterName") (clojure.core/assoc :cluster-name (deser-string (input "ClusterName"))) (clojure.core/contains? input "NodeIdsToRemove") (clojure.core/assoc :node-ids-to-remove (deser-node-identifier-list (input "NodeIdsToRemove"))) (clojure.core/contains? input "NotificationConfiguration") (clojure.core/assoc :notification-configuration (deser-notification-configuration (input "NotificationConfiguration"))) (clojure.core/contains? input "SSEDescription") (clojure.core/assoc :sse-description (deser-sse-description (input "SSEDescription"))) (clojure.core/contains? input "NodeType") (clojure.core/assoc :node-type (deser-string (input "NodeType")))))

(clojure.core/defn- deser-node-type-specific-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-node-type-specific-value coll))) input))

(clojure.core/defn- deser-parameter-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "ParameterGroupName") (clojure.core/assoc :parameter-group-name (deser-string (input "ParameterGroupName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description")))))

(clojure.core/defn- deser-node-type-specific-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "NodeType") (clojure.core/assoc :node-type (deser-string (input "NodeType"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-parameter [input] (clojure.core/cond-> {} (clojure.core/contains? input "ChangeType") (clojure.core/assoc :change-type (deser-change-type (input "ChangeType"))) (clojure.core/contains? input "DataType") (clojure.core/assoc :data-type (deser-string (input "DataType"))) (clojure.core/contains? input "ParameterName") (clojure.core/assoc :parameter-name (deser-string (input "ParameterName"))) (clojure.core/contains? input "ParameterType") (clojure.core/assoc :parameter-type (deser-parameter-type (input "ParameterType"))) (clojure.core/contains? input "Source") (clojure.core/assoc :source (deser-string (input "Source"))) (clojure.core/contains? input "AllowedValues") (clojure.core/assoc :allowed-values (deser-string (input "AllowedValues"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "IsModifiable") (clojure.core/assoc :is-modifiable (deser-is-modifiable (input "IsModifiable"))) (clojure.core/contains? input "NodeTypeSpecificValues") (clojure.core/assoc :node-type-specific-values (deser-node-type-specific-value-list (input "NodeTypeSpecificValues"))) (clojure.core/contains? input "ParameterValue") (clojure.core/assoc :parameter-value (deser-string (input "ParameterValue")))))

(clojure.core/defn- deser-t-stamp [input] input)

(clojure.core/defn- deser-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "Address") (clojure.core/assoc :address (deser-string (input "Address"))) (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-integer (input "Port")))))

(clojure.core/defn- deser-security-group-membership [input] (clojure.core/cond-> {} (clojure.core/contains? input "SecurityGroupIdentifier") (clojure.core/assoc :security-group-identifier (deser-string (input "SecurityGroupIdentifier"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status")))))

(clojure.core/defn- deser-is-modifiable [input] (clojure.core/get {"TRUE" :true, "FALSE" :false, "CONDITIONAL" :conditional} input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-notification-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "TopicArn") (clojure.core/assoc :topic-arn (deser-string (input "TopicArn"))) (clojure.core/contains? input "TopicStatus") (clojure.core/assoc :topic-status (deser-string (input "TopicStatus")))))

(clojure.core/defn- deser-aws-query-error-message [input] input)

(clojure.core/defn- deser-sse-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-sse-status (input "Status")))))

(clojure.core/defn- deser-integer-optional [input] input)

(clojure.core/defn- deser-node [input] (clojure.core/cond-> {} (clojure.core/contains? input "NodeId") (clojure.core/assoc :node-id (deser-string (input "NodeId"))) (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-endpoint (input "Endpoint"))) (clojure.core/contains? input "NodeCreateTime") (clojure.core/assoc :node-create-time (deser-t-stamp (input "NodeCreateTime"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-string (input "AvailabilityZone"))) (clojure.core/contains? input "NodeStatus") (clojure.core/assoc :node-status (deser-string (input "NodeStatus"))) (clojure.core/contains? input "ParameterGroupStatus") (clojure.core/assoc :parameter-group-status (deser-string (input "ParameterGroupStatus")))))

(clojure.core/defn- deser-subnet-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet coll))) input))

(clojure.core/defn- deser-node-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-node coll))) input))

(clojure.core/defn- deser-parameter-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter-group coll))) input))

(clojure.core/defn- response-insufficient-cluster-capacity-fault ([input] (response-insufficient-cluster-capacity-fault nil input)) ([resultWrapper514550 input] (clojure.core/let [rawinput514549 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514551 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-node-not-found-fault ([input] (response-node-not-found-fault nil input)) ([resultWrapper514553 input] (clojure.core/let [rawinput514552 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514554 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cluster-quota-for-customer-exceeded-fault ([input] (response-cluster-quota-for-customer-exceeded-fault nil input)) ([resultWrapper514556 input] (clojure.core/let [rawinput514555 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514557 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-arn-fault ([input] (response-invalid-arn-fault nil input)) ([resultWrapper514559 input] (clojure.core/let [rawinput514558 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514560 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reboot-node-response ([input] (response-reboot-node-response nil input)) ([resultWrapper514562 input] (clojure.core/let [rawinput514561 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514563 {"Cluster" (rawinput514561 "Cluster")}] (clojure.core/cond-> {} (letvar514563 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar514563 ["Cluster"])))))))

(clojure.core/defn- response-parameter-group-quota-exceeded-fault ([input] (response-parameter-group-quota-exceeded-fault nil input)) ([resultWrapper514565 input] (clojure.core/let [rawinput514564 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514566 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cluster-already-exists-fault ([input] (response-cluster-already-exists-fault nil input)) ([resultWrapper514568 input] (clojure.core/let [rawinput514567 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514569 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper514571 input] (clojure.core/let [rawinput514570 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514572 {"Tags" (rawinput514570 "Tags"), "NextToken" (rawinput514570 "NextToken")}] (clojure.core/cond-> {} (letvar514572 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar514572 ["Tags"]))) (letvar514572 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar514572 ["NextToken"])))))))

(clojure.core/defn- response-invalid-vpc-network-state-fault ([input] (response-invalid-vpc-network-state-fault nil input)) ([resultWrapper514574 input] (clojure.core/let [rawinput514573 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514575 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-clusters-response ([input] (response-describe-clusters-response nil input)) ([resultWrapper514577 input] (clojure.core/let [rawinput514576 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514578 {"NextToken" (rawinput514576 "NextToken"), "Clusters" (rawinput514576 "Clusters")}] (clojure.core/cond-> {} (letvar514578 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar514578 ["NextToken"]))) (letvar514578 "Clusters") (clojure.core/assoc :clusters (deser-cluster-list (clojure.core/get-in letvar514578 ["Clusters"])))))))

(clojure.core/defn- response-parameter-group-not-found-fault ([input] (response-parameter-group-not-found-fault nil input)) ([resultWrapper514580 input] (clojure.core/let [rawinput514579 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514581 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-quota-per-resource-exceeded ([input] (response-tag-quota-per-resource-exceeded nil input)) ([resultWrapper514583 input] (clojure.core/let [rawinput514582 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514584 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-cluster-response ([input] (response-delete-cluster-response nil input)) ([resultWrapper514586 input] (clojure.core/let [rawinput514585 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514587 {"Cluster" (rawinput514585 "Cluster")}] (clojure.core/cond-> {} (letvar514587 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar514587 ["Cluster"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper514589 input] (clojure.core/let [rawinput514588 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514590 {"Tags" (rawinput514588 "Tags")}] (clojure.core/cond-> {} (letvar514590 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar514590 ["Tags"])))))))

(clojure.core/defn- response-describe-parameters-response ([input] (response-describe-parameters-response nil input)) ([resultWrapper514592 input] (clojure.core/let [rawinput514591 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514593 {"NextToken" (rawinput514591 "NextToken"), "Parameters" (rawinput514591 "Parameters")}] (clojure.core/cond-> {} (letvar514593 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar514593 ["NextToken"]))) (letvar514593 "Parameters") (clojure.core/assoc :parameters (deser-parameter-list (clojure.core/get-in letvar514593 ["Parameters"])))))))

(clojure.core/defn- response-service-linked-role-not-found-fault ([input] (response-service-linked-role-not-found-fault nil input)) ([resultWrapper514595 input] (clojure.core/let [rawinput514594 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514596 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-cluster-response ([input] (response-create-cluster-response nil input)) ([resultWrapper514598 input] (clojure.core/let [rawinput514597 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514599 {"Cluster" (rawinput514597 "Cluster")}] (clojure.core/cond-> {} (letvar514599 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar514599 ["Cluster"])))))))

(clojure.core/defn- response-subnet-quota-exceeded-fault ([input] (response-subnet-quota-exceeded-fault nil input)) ([resultWrapper514601 input] (clojure.core/let [rawinput514600 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514602 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-subnet ([input] (response-invalid-subnet nil input)) ([resultWrapper514604 input] (clojure.core/let [rawinput514603 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514605 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-subnet-group-response ([input] (response-delete-subnet-group-response nil input)) ([resultWrapper514607 input] (clojure.core/let [rawinput514606 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514608 {"DeletionMessage" (rawinput514606 "DeletionMessage")}] (clojure.core/cond-> {} (letvar514608 "DeletionMessage") (clojure.core/assoc :deletion-message (deser-string (clojure.core/get-in letvar514608 ["DeletionMessage"])))))))

(clojure.core/defn- response-subnet-in-use ([input] (response-subnet-in-use nil input)) ([resultWrapper514610 input] (clojure.core/let [rawinput514609 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514611 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-increase-replication-factor-response ([input] (response-increase-replication-factor-response nil input)) ([resultWrapper514613 input] (clojure.core/let [rawinput514612 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514614 {"Cluster" (rawinput514612 "Cluster")}] (clojure.core/cond-> {} (letvar514614 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar514614 ["Cluster"])))))))

(clojure.core/defn- response-describe-subnet-groups-response ([input] (response-describe-subnet-groups-response nil input)) ([resultWrapper514616 input] (clojure.core/let [rawinput514615 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514617 {"NextToken" (rawinput514615 "NextToken"), "SubnetGroups" (rawinput514615 "SubnetGroups")}] (clojure.core/cond-> {} (letvar514617 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar514617 ["NextToken"]))) (letvar514617 "SubnetGroups") (clojure.core/assoc :subnet-groups (deser-subnet-group-list (clojure.core/get-in letvar514617 ["SubnetGroups"])))))))

(clojure.core/defn- response-subnet-group-already-exists-fault ([input] (response-subnet-group-already-exists-fault nil input)) ([resultWrapper514619 input] (clojure.core/let [rawinput514618 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514620 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-subnet-group-not-found-fault ([input] (response-subnet-group-not-found-fault nil input)) ([resultWrapper514622 input] (clojure.core/let [rawinput514621 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514623 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-parameter-group-already-exists-fault ([input] (response-parameter-group-already-exists-fault nil input)) ([resultWrapper514625 input] (clojure.core/let [rawinput514624 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514626 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-node-quota-for-customer-exceeded-fault ([input] (response-node-quota-for-customer-exceeded-fault nil input)) ([resultWrapper514628 input] (clojure.core/let [rawinput514627 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514629 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-decrease-replication-factor-response ([input] (response-decrease-replication-factor-response nil input)) ([resultWrapper514631 input] (clojure.core/let [rawinput514630 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514632 {"Cluster" (rawinput514630 "Cluster")}] (clojure.core/cond-> {} (letvar514632 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar514632 ["Cluster"])))))))

(clojure.core/defn- response-create-subnet-group-response ([input] (response-create-subnet-group-response nil input)) ([resultWrapper514634 input] (clojure.core/let [rawinput514633 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514635 {"SubnetGroup" (rawinput514633 "SubnetGroup")}] (clojure.core/cond-> {} (letvar514635 "SubnetGroup") (clojure.core/assoc :subnet-group (deser-subnet-group (clojure.core/get-in letvar514635 ["SubnetGroup"])))))))

(clojure.core/defn- response-update-cluster-response ([input] (response-update-cluster-response nil input)) ([resultWrapper514637 input] (clojure.core/let [rawinput514636 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514638 {"Cluster" (rawinput514636 "Cluster")}] (clojure.core/cond-> {} (letvar514638 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar514638 ["Cluster"])))))))

(clojure.core/defn- response-invalid-parameter-combination-exception ([input] (response-invalid-parameter-combination-exception nil input)) ([resultWrapper514640 input] (clojure.core/let [rawinput514639 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514641 {"message" (rawinput514639 "message")}] (clojure.core/cond-> {} (letvar514641 "message") (clojure.core/assoc :message (deser-aws-query-error-message (clojure.core/get-in letvar514641 ["message"])))))))

(clojure.core/defn- response-describe-default-parameters-response ([input] (response-describe-default-parameters-response nil input)) ([resultWrapper514643 input] (clojure.core/let [rawinput514642 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514644 {"NextToken" (rawinput514642 "NextToken"), "Parameters" (rawinput514642 "Parameters")}] (clojure.core/cond-> {} (letvar514644 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar514644 ["NextToken"]))) (letvar514644 "Parameters") (clojure.core/assoc :parameters (deser-parameter-list (clojure.core/get-in letvar514644 ["Parameters"])))))))

(clojure.core/defn- response-update-parameter-group-response ([input] (response-update-parameter-group-response nil input)) ([resultWrapper514646 input] (clojure.core/let [rawinput514645 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514647 {"ParameterGroup" (rawinput514645 "ParameterGroup")}] (clojure.core/cond-> {} (letvar514647 "ParameterGroup") (clojure.core/assoc :parameter-group (deser-parameter-group (clojure.core/get-in letvar514647 ["ParameterGroup"])))))))

(clojure.core/defn- response-invalid-cluster-state-fault ([input] (response-invalid-cluster-state-fault nil input)) ([resultWrapper514649 input] (clojure.core/let [rawinput514648 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514650 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-node-quota-for-cluster-exceeded-fault ([input] (response-node-quota-for-cluster-exceeded-fault nil input)) ([resultWrapper514652 input] (clojure.core/let [rawinput514651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514653 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cluster-not-found-fault ([input] (response-cluster-not-found-fault nil input)) ([resultWrapper514655 input] (clojure.core/let [rawinput514654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514656 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-subnet-group-in-use-fault ([input] (response-subnet-group-in-use-fault nil input)) ([resultWrapper514658 input] (clojure.core/let [rawinput514657 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514659 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-parameter-groups-response ([input] (response-describe-parameter-groups-response nil input)) ([resultWrapper514661 input] (clojure.core/let [rawinput514660 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514662 {"NextToken" (rawinput514660 "NextToken"), "ParameterGroups" (rawinput514660 "ParameterGroups")}] (clojure.core/cond-> {} (letvar514662 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar514662 ["NextToken"]))) (letvar514662 "ParameterGroups") (clojure.core/assoc :parameter-groups (deser-parameter-group-list (clojure.core/get-in letvar514662 ["ParameterGroups"])))))))

(clojure.core/defn- response-subnet-group-quota-exceeded-fault ([input] (response-subnet-group-quota-exceeded-fault nil input)) ([resultWrapper514664 input] (clojure.core/let [rawinput514663 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514665 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-not-found-fault ([input] (response-tag-not-found-fault nil input)) ([resultWrapper514667 input] (clojure.core/let [rawinput514666 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514668 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-subnet-group-response ([input] (response-update-subnet-group-response nil input)) ([resultWrapper514670 input] (clojure.core/let [rawinput514669 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514671 {"SubnetGroup" (rawinput514669 "SubnetGroup")}] (clojure.core/cond-> {} (letvar514671 "SubnetGroup") (clojure.core/assoc :subnet-group (deser-subnet-group (clojure.core/get-in letvar514671 ["SubnetGroup"])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper514673 input] (clojure.core/let [rawinput514672 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514674 {"message" (rawinput514672 "message")}] (clojure.core/cond-> {} (letvar514674 "message") (clojure.core/assoc :message (deser-aws-query-error-message (clojure.core/get-in letvar514674 ["message"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper514676 input] (clojure.core/let [rawinput514675 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514677 {"Tags" (rawinput514675 "Tags")}] (clojure.core/cond-> {} (letvar514677 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar514677 ["Tags"])))))))

(clojure.core/defn- response-delete-parameter-group-response ([input] (response-delete-parameter-group-response nil input)) ([resultWrapper514679 input] (clojure.core/let [rawinput514678 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514680 {"DeletionMessage" (rawinput514678 "DeletionMessage")}] (clojure.core/cond-> {} (letvar514680 "DeletionMessage") (clojure.core/assoc :deletion-message (deser-string (clojure.core/get-in letvar514680 ["DeletionMessage"])))))))

(clojure.core/defn- response-describe-events-response ([input] (response-describe-events-response nil input)) ([resultWrapper514682 input] (clojure.core/let [rawinput514681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514683 {"NextToken" (rawinput514681 "NextToken"), "Events" (rawinput514681 "Events")}] (clojure.core/cond-> {} (letvar514683 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar514683 ["NextToken"]))) (letvar514683 "Events") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar514683 ["Events"])))))))

(clojure.core/defn- response-invalid-parameter-group-state-fault ([input] (response-invalid-parameter-group-state-fault nil input)) ([resultWrapper514685 input] (clojure.core/let [rawinput514684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514686 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-parameter-group-response ([input] (response-create-parameter-group-response nil input)) ([resultWrapper514688 input] (clojure.core/let [rawinput514687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar514689 {"ParameterGroup" (rawinput514687 "ParameterGroup")}] (clojure.core/cond-> {} (letvar514689 "ParameterGroup") (clojure.core/assoc :parameter-group (deser-parameter-group (clojure.core/get-in letvar514689 ["ParameterGroup"])))))))

(clojure.spec.alpha/def :portkey.aws.dax/insufficient-cluster-capacity-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-group-list (clojure.spec.alpha/coll-of :portkey.aws.dax/subnet-group))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax/cluster-name-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax/sse-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dax/node-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/change-type #{"IMMEDIATE" "REQUIRES_REBOOT" :immediate :requires-reboot})

(clojure.spec.alpha/def :portkey.aws.dax/cluster-quota-for-customer-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/security-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.dax/security-group-membership))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-type #{"NODE_TYPE_SPECIFIC" :default :node-type-specific "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.dax.delete-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.delete-cluster-request/cluster-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/invalid-arn-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/node-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax.parameter-group-status/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter-group-status/parameter-apply-status (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter-group-status/node-ids-to-reboot (clojure.spec.alpha/and :portkey.aws.dax/node-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax/parameter-group-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.parameter-group-status/parameter-group-name :portkey.aws.dax.parameter-group-status/parameter-apply-status :portkey.aws.dax.parameter-group-status/node-ids-to-reboot]))

(clojure.spec.alpha/def :portkey.aws.dax.subnet/subnet-identifier (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.subnet/subnet-availability-zone (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/subnet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.subnet/subnet-identifier :portkey.aws.dax.subnet/subnet-availability-zone]))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-name-value-list (clojure.spec.alpha/coll-of :portkey.aws.dax/parameter-name-value))

(clojure.spec.alpha/def :portkey.aws.dax/reboot-node-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.increase-replication-factor-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.increase-replication-factor-request/new-replication-factor (clojure.spec.alpha/and :portkey.aws.dax/integer))
(clojure.spec.alpha/def :portkey.aws.dax.increase-replication-factor-request/availability-zones (clojure.spec.alpha/and :portkey.aws.dax/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.dax/increase-replication-factor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.increase-replication-factor-request/cluster-name :portkey.aws.dax.increase-replication-factor-request/new-replication-factor] :opt-un [:portkey.aws.dax.increase-replication-factor-request/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.dax/key-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-group-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/cluster-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.dax/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax.list-tags-response/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.list-tags-response/tags :portkey.aws.dax.list-tags-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax/invalid-vpc-network-state-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.describe-events-request/source-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-events-request/start-time (clojure.spec.alpha/and :portkey.aws.dax/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax.describe-events-request/end-time (clojure.spec.alpha/and :portkey.aws.dax/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax.describe-events-request/duration (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.describe-events-request/max-results (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.describe-events-request/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/describe-events-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-events-request/source-name :portkey.aws.dax/source-type :portkey.aws.dax.describe-events-request/start-time :portkey.aws.dax.describe-events-request/end-time :portkey.aws.dax.describe-events-request/duration :portkey.aws.dax.describe-events-request/max-results :portkey.aws.dax.describe-events-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-clusters-response/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-clusters-response/clusters (clojure.spec.alpha/and :portkey.aws.dax/cluster-list))
(clojure.spec.alpha/def :portkey.aws.dax/describe-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-clusters-response/next-token :portkey.aws.dax.describe-clusters-response/clusters]))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-group-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/tag-quota-per-resource-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/event-list (clojure.spec.alpha/coll-of :portkey.aws.dax/event))

(clojure.spec.alpha/def :portkey.aws.dax/source-type #{:cluster "CLUSTER" :parameter-group "SUBNET_GROUP" :subnet-group "PARAMETER_GROUP"})

(clojure.spec.alpha/def :portkey.aws.dax/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.event/source-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.event/message (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.event/date (clojure.spec.alpha/and :portkey.aws.dax/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.event/source-name :portkey.aws.dax/source-type :portkey.aws.dax.event/message :portkey.aws.dax.event/date]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-parameters-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-parameters-request/source (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-parameters-request/max-results (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.describe-parameters-request/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/describe-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.describe-parameters-request/parameter-group-name] :opt-un [:portkey.aws.dax.describe-parameters-request/source :portkey.aws.dax.describe-parameters-request/max-results :portkey.aws.dax.describe-parameters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax/availability-zone-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax.tag-resource-response/tags (clojure.spec.alpha/and :portkey.aws.dax/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.tag-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-parameters-response/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-parameters-response/parameters (clojure.spec.alpha/and :portkey.aws.dax/parameter-list))
(clojure.spec.alpha/def :portkey.aws.dax/describe-parameters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-parameters-response/next-token :portkey.aws.dax.describe-parameters-response/parameters]))

(clojure.spec.alpha/def :portkey.aws.dax/cluster-list (clojure.spec.alpha/coll-of :portkey.aws.dax/cluster))

(clojure.spec.alpha/def :portkey.aws.dax/service-linked-role-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.describe-clusters-request/cluster-names (clojure.spec.alpha/and :portkey.aws.dax/cluster-name-list))
(clojure.spec.alpha/def :portkey.aws.dax.describe-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.describe-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/describe-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-clusters-request/cluster-names :portkey.aws.dax.describe-clusters-request/max-results :portkey.aws.dax.describe-clusters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.tag-resource-request/resource-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.dax/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.tag-resource-request/resource-name :portkey.aws.dax.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.parameter-name-value/parameter-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter-name-value/parameter-value (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/parameter-name-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.parameter-name-value/parameter-name :portkey.aws.dax.parameter-name-value/parameter-value]))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-list (clojure.spec.alpha/coll-of :portkey.aws.dax/parameter))

(clojure.spec.alpha/def :portkey.aws.dax/invalid-subnet (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.delete-subnet-group-response/deletion-message (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/delete-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.delete-subnet-group-response/deletion-message]))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-in-use (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/tag-list (clojure.spec.alpha/coll-of :portkey.aws.dax/tag))

(clojure.spec.alpha/def :portkey.aws.dax.decrease-replication-factor-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.decrease-replication-factor-request/new-replication-factor (clojure.spec.alpha/and :portkey.aws.dax/integer))
(clojure.spec.alpha/def :portkey.aws.dax.decrease-replication-factor-request/availability-zones (clojure.spec.alpha/and :portkey.aws.dax/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.dax.decrease-replication-factor-request/node-ids-to-remove (clojure.spec.alpha/and :portkey.aws.dax/node-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax/decrease-replication-factor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.decrease-replication-factor-request/cluster-name :portkey.aws.dax.decrease-replication-factor-request/new-replication-factor] :opt-un [:portkey.aws.dax.decrease-replication-factor-request/availability-zones :portkey.aws.dax.decrease-replication-factor-request/node-ids-to-remove]))

(clojure.spec.alpha/def :portkey.aws.dax.update-subnet-group-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-subnet-group-request/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-subnet-group-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.dax/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax/update-subnet-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.update-subnet-group-request/subnet-group-name] :opt-un [:portkey.aws.dax.update-subnet-group-request/description :portkey.aws.dax.update-subnet-group-request/subnet-ids]))

(clojure.spec.alpha/def :portkey.aws.dax.subnet-group/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.subnet-group/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.subnet-group/vpc-id (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.subnet-group/subnets (clojure.spec.alpha/and :portkey.aws.dax/subnet-list))
(clojure.spec.alpha/def :portkey.aws.dax/subnet-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.subnet-group/subnet-group-name :portkey.aws.dax.subnet-group/description :portkey.aws.dax.subnet-group/vpc-id :portkey.aws.dax.subnet-group/subnets]))

(clojure.spec.alpha/def :portkey.aws.dax/sse-status #{"DISABLED" :disabled "DISABLING" "ENABLING" :disabling :enabling "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dax.create-subnet-group-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-subnet-group-request/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-subnet-group-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.dax/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax/create-subnet-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.create-subnet-group-request/subnet-group-name :portkey.aws.dax.create-subnet-group-request/subnet-ids] :opt-un [:portkey.aws.dax.create-subnet-group-request/description]))

(clojure.spec.alpha/def :portkey.aws.dax.update-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-cluster-request/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-cluster-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-cluster-request/notification-topic-arn (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-cluster-request/notification-topic-status (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-cluster-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-cluster-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.dax/security-group-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax/update-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.update-cluster-request/cluster-name] :opt-un [:portkey.aws.dax.update-cluster-request/description :portkey.aws.dax.update-cluster-request/preferred-maintenance-window :portkey.aws.dax.update-cluster-request/notification-topic-arn :portkey.aws.dax.update-cluster-request/notification-topic-status :portkey.aws.dax.update-cluster-request/parameter-group-name :portkey.aws.dax.update-cluster-request/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.dax.cluster/total-nodes (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/nodes (clojure.spec.alpha/and :portkey.aws.dax/node-list))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/security-groups (clojure.spec.alpha/and :portkey.aws.dax/security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/cluster-arn (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/status (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/iam-role-arn (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/subnet-group (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/cluster-discovery-endpoint (clojure.spec.alpha/and :portkey.aws.dax/endpoint))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/parameter-group (clojure.spec.alpha/and :portkey.aws.dax/parameter-group-status))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/active-nodes (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/cluster-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/node-ids-to-remove (clojure.spec.alpha/and :portkey.aws.dax/node-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.cluster/node-type (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.cluster/total-nodes :portkey.aws.dax.cluster/nodes :portkey.aws.dax.cluster/preferred-maintenance-window :portkey.aws.dax.cluster/security-groups :portkey.aws.dax.cluster/cluster-arn :portkey.aws.dax.cluster/status :portkey.aws.dax.cluster/iam-role-arn :portkey.aws.dax.cluster/subnet-group :portkey.aws.dax.cluster/cluster-discovery-endpoint :portkey.aws.dax.cluster/description :portkey.aws.dax.cluster/parameter-group :portkey.aws.dax.cluster/active-nodes :portkey.aws.dax.cluster/cluster-name :portkey.aws.dax.cluster/node-ids-to-remove :portkey.aws.dax/notification-configuration :portkey.aws.dax/sse-description :portkey.aws.dax.cluster/node-type]))

(clojure.spec.alpha/def :portkey.aws.dax/increase-replication-factor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-subnet-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-subnet-groups-response/subnet-groups (clojure.spec.alpha/and :portkey.aws.dax/subnet-group-list))
(clojure.spec.alpha/def :portkey.aws.dax/describe-subnet-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-subnet-groups-response/next-token :portkey.aws.dax.describe-subnet-groups-response/subnet-groups]))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-group-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.sse-specification/enabled (clojure.spec.alpha/and :portkey.aws.dax/sse-enabled))
(clojure.spec.alpha/def :portkey.aws.dax/sse-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.sse-specification/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-group-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-group-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/node-quota-for-customer-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax/node-type-specific-value-list (clojure.spec.alpha/coll-of :portkey.aws.dax/node-type-specific-value))

(clojure.spec.alpha/def :portkey.aws.dax.parameter-group/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter-group/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/parameter-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.parameter-group/parameter-group-name :portkey.aws.dax.parameter-group/description]))

(clojure.spec.alpha/def :portkey.aws.dax.delete-subnet-group-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/delete-subnet-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.delete-subnet-group-request/subnet-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.node-type-specific-value/node-type (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.node-type-specific-value/value (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/node-type-specific-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.node-type-specific-value/node-type :portkey.aws.dax.node-type-specific-value/value]))

(clojure.spec.alpha/def :portkey.aws.dax/decrease-replication-factor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dax/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dax/create-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/subnet-group]))

(clojure.spec.alpha/def :portkey.aws.dax.parameter/data-type (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter/parameter-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter/source (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter/allowed-values (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.parameter/node-type-specific-values (clojure.spec.alpha/and :portkey.aws.dax/node-type-specific-value-list))
(clojure.spec.alpha/def :portkey.aws.dax.parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/change-type :portkey.aws.dax.parameter/data-type :portkey.aws.dax.parameter/parameter-name :portkey.aws.dax/parameter-type :portkey.aws.dax.parameter/source :portkey.aws.dax.parameter/allowed-values :portkey.aws.dax.parameter/description :portkey.aws.dax/is-modifiable :portkey.aws.dax.parameter/node-type-specific-values :portkey.aws.dax.parameter/parameter-value]))

(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.dax/security-group-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/replication-factor (clojure.spec.alpha/and :portkey.aws.dax/integer))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/tags (clojure.spec.alpha/and :portkey.aws.dax/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/iam-role-arn (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/notification-topic-arn (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/availability-zones (clojure.spec.alpha/and :portkey.aws.dax/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.dax.create-cluster-request/node-type (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.create-cluster-request/cluster-name :portkey.aws.dax.create-cluster-request/node-type :portkey.aws.dax.create-cluster-request/replication-factor :portkey.aws.dax.create-cluster-request/iam-role-arn] :opt-un [:portkey.aws.dax.create-cluster-request/security-group-ids :portkey.aws.dax.create-cluster-request/preferred-maintenance-window :portkey.aws.dax.create-cluster-request/subnet-group-name :portkey.aws.dax.create-cluster-request/tags :portkey.aws.dax.create-cluster-request/parameter-group-name :portkey.aws.dax.create-cluster-request/description :portkey.aws.dax/sse-specification :portkey.aws.dax.create-cluster-request/notification-topic-arn :portkey.aws.dax.create-cluster-request/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.dax/update-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax/t-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dax.invalid-parameter-combination-exception/message (clojure.spec.alpha/and :portkey.aws.dax/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.dax/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.invalid-parameter-combination-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-default-parameters-response/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-default-parameters-response/parameters (clojure.spec.alpha/and :portkey.aws.dax/parameter-list))
(clojure.spec.alpha/def :portkey.aws.dax/describe-default-parameters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-default-parameters-response/next-token :portkey.aws.dax.describe-default-parameters-response/parameters]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-subnet-groups-request/subnet-group-names (clojure.spec.alpha/and :portkey.aws.dax/subnet-group-name-list))
(clojure.spec.alpha/def :portkey.aws.dax.describe-subnet-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.describe-subnet-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/describe-subnet-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-subnet-groups-request/subnet-group-names :portkey.aws.dax.describe-subnet-groups-request/max-results :portkey.aws.dax.describe-subnet-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax/security-group-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax.delete-parameter-group-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/delete-parameter-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.delete-parameter-group-request/parameter-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/update-parameter-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/parameter-group]))

(clojure.spec.alpha/def :portkey.aws.dax.endpoint/address (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.endpoint/port (clojure.spec.alpha/and :portkey.aws.dax/integer))
(clojure.spec.alpha/def :portkey.aws.dax/endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.endpoint/address :portkey.aws.dax.endpoint/port]))

(clojure.spec.alpha/def :portkey.aws.dax.reboot-node-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.reboot-node-request/node-id (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/reboot-node-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.reboot-node-request/cluster-name :portkey.aws.dax.reboot-node-request/node-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.dax/string))

(clojure.spec.alpha/def :portkey.aws.dax/invalid-cluster-state-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/node-quota-for-cluster-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/cluster-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.update-parameter-group-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.update-parameter-group-request/parameter-name-values (clojure.spec.alpha/and :portkey.aws.dax/parameter-name-value-list))
(clojure.spec.alpha/def :portkey.aws.dax/update-parameter-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.update-parameter-group-request/parameter-group-name :portkey.aws.dax.update-parameter-group-request/parameter-name-values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.security-group-membership/security-group-identifier (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.security-group-membership/status (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/security-group-membership (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.security-group-membership/security-group-identifier :portkey.aws.dax.security-group-membership/status]))

(clojure.spec.alpha/def :portkey.aws.dax/is-modifiable #{:true "CONDITIONAL" :false "TRUE" "FALSE" :conditional})

(clojure.spec.alpha/def :portkey.aws.dax/subnet-group-in-use-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.tag/key (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.tag/value (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.tag/key :portkey.aws.dax.tag/value]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-parameter-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-parameter-groups-response/parameter-groups (clojure.spec.alpha/and :portkey.aws.dax/parameter-group-list))
(clojure.spec.alpha/def :portkey.aws.dax/describe-parameter-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-parameter-groups-response/next-token :portkey.aws.dax.describe-parameter-groups-response/parameter-groups]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-default-parameters-request/max-results (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.describe-default-parameters-request/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/describe-default-parameters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-default-parameters-request/max-results :portkey.aws.dax.describe-default-parameters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-group-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/tag-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/update-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/subnet-group]))

(clojure.spec.alpha/def :portkey.aws.dax.notification-configuration/topic-arn (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.notification-configuration/topic-status (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/notification-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.notification-configuration/topic-arn :portkey.aws.dax.notification-configuration/topic-status]))

(clojure.spec.alpha/def :portkey.aws.dax.create-parameter-group-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.create-parameter-group-request/description (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/create-parameter-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.create-parameter-group-request/parameter-group-name] :opt-un [:portkey.aws.dax.create-parameter-group-request/description]))

(clojure.spec.alpha/def :portkey.aws.dax/aws-query-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dax.sse-description/status (clojure.spec.alpha/and :portkey.aws.dax/sse-status))
(clojure.spec.alpha/def :portkey.aws.dax/sse-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.sse-description/status]))

(clojure.spec.alpha/def :portkey.aws.dax/integer-optional clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dax.node/node-id (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.node/node-create-time (clojure.spec.alpha/and :portkey.aws.dax/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax.node/availability-zone (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.node/node-status (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.node/parameter-group-status (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/node (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.node/node-id :portkey.aws.dax/endpoint :portkey.aws.dax.node/node-create-time :portkey.aws.dax.node/availability-zone :portkey.aws.dax.node/node-status :portkey.aws.dax.node/parameter-group-status]))

(clojure.spec.alpha/def :portkey.aws.dax.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.dax/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.dax/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dax.untag-resource-response/tags (clojure.spec.alpha/and :portkey.aws.dax/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.untag-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-parameter-groups-request/parameter-group-names (clojure.spec.alpha/and :portkey.aws.dax/parameter-group-name-list))
(clojure.spec.alpha/def :portkey.aws.dax.describe-parameter-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.dax/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.describe-parameter-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/describe-parameter-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-parameter-groups-request/parameter-group-names :portkey.aws.dax.describe-parameter-groups-request/max-results :portkey.aws.dax.describe-parameter-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax/subnet-list (clojure.spec.alpha/coll-of :portkey.aws.dax/subnet))

(clojure.spec.alpha/def :portkey.aws.dax.delete-parameter-group-response/deletion-message (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/delete-parameter-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.delete-parameter-group-response/deletion-message]))

(clojure.spec.alpha/def :portkey.aws.dax.describe-events-response/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.describe-events-response/events (clojure.spec.alpha/and :portkey.aws.dax/event-list))
(clojure.spec.alpha/def :portkey.aws.dax/describe-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.describe-events-response/next-token :portkey.aws.dax.describe-events-response/events]))

(clojure.spec.alpha/def :portkey.aws.dax/node-list (clojure.spec.alpha/coll-of :portkey.aws.dax/node))

(clojure.spec.alpha/def :portkey.aws.dax.untag-resource-request/resource-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.dax/key-list))
(clojure.spec.alpha/def :portkey.aws.dax/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.untag-resource-request/resource-name :portkey.aws.dax.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/invalid-parameter-group-state-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax/create-parameter-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax/parameter-group]))

(clojure.spec.alpha/def :portkey.aws.dax/parameter-group-list (clojure.spec.alpha/coll-of :portkey.aws.dax/parameter-group))

(clojure.spec.alpha/def :portkey.aws.dax.list-tags-request/resource-name (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax.list-tags-request/next-token (clojure.spec.alpha/and :portkey.aws.dax/string))
(clojure.spec.alpha/def :portkey.aws.dax/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.list-tags-request/resource-name] :opt-un [:portkey.aws.dax.list-tags-request/next-token]))

(clojure.core/defn tag-resource "Associates a set of tags with a DAX resource. You can call TagResource up to 5\ntimes per second, per account." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "TagQuotaPerResourceExceeded" :portkey.aws.dax/tag-quota-per-resource-exceeded, "InvalidARNFault" :portkey.aws.dax/invalid-arn-fault, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dax/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/tag-resource-response))

(clojure.core/defn create-cluster "Creates a DAX cluster. All nodes in the cluster run the same DAX caching\nsoftware." ([create-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCluster", :http.request.configuration/output-deser-fn response-create-cluster-response, :http.request.spec/error-spec {"InsufficientClusterCapacityFault" :portkey.aws.dax/insufficient-cluster-capacity-fault, "ClusterQuotaForCustomerExceededFault" :portkey.aws.dax/cluster-quota-for-customer-exceeded-fault, "ClusterAlreadyExistsFault" :portkey.aws.dax/cluster-already-exists-fault, "InvalidVPCNetworkStateFault" :portkey.aws.dax/invalid-vpc-network-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax/parameter-group-not-found-fault, "TagQuotaPerResourceExceeded" :portkey.aws.dax/tag-quota-per-resource-exceeded, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "SubnetGroupNotFoundFault" :portkey.aws.dax/subnet-group-not-found-fault, "NodeQuotaForCustomerExceededFault" :portkey.aws.dax/node-quota-for-customer-exceeded-fault, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "NodeQuotaForClusterExceededFault" :portkey.aws.dax/node-quota-for-cluster-exceeded-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterGroupStateFault" :portkey.aws.dax/invalid-parameter-group-state-fault}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.dax/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/create-cluster-response))

(clojure.core/defn describe-parameter-groups "Returns a list of parameter group descriptions. If a parameter group name is\nspecified, the list will contain only the descriptions for that group." ([] (describe-parameter-groups {})) ([describe-parameter-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-parameter-groups-request describe-parameter-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/describe-parameter-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/describe-parameter-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeParameterGroups", :http.request.configuration/output-deser-fn response-describe-parameter-groups-response, :http.request.spec/error-spec {"ParameterGroupNotFoundFault" :portkey.aws.dax/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-parameter-groups :args (clojure.spec.alpha/? :portkey.aws.dax/describe-parameter-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/describe-parameter-groups-response))

(clojure.core/defn describe-events "Returns events related to DAX clusters and parameter groups. You can obtain\nevents specific to a particular DAX cluster or parameter group by providing the\nname as a parameter.\n By default, only the events occurring within the last hour are returned;\nhowever, you can retrieve up to 14 days' worth of events if necessary." ([] (describe-events {})) ([describe-events-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-events-request describe-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/describe-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/describe-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEvents", :http.request.configuration/output-deser-fn response-describe-events-response, :http.request.spec/error-spec {"ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.dax/describe-events-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/describe-events-response))

(clojure.core/defn list-tags "List all of the tags for a DAX cluster. You can call ListTags up to 10 times per\nsecond, per account." ([list-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "InvalidARNFault" :portkey.aws.dax/invalid-arn-fault, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.dax/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/list-tags-response))

(clojure.core/defn reboot-node "Reboots a single node of a DAX cluster. The reboot action takes place as soon as\npossible. During the reboot, the node status is set to REBOOTING." ([reboot-node-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-reboot-node-request reboot-node-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/reboot-node-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/reboot-node-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RebootNode", :http.request.configuration/output-deser-fn response-reboot-node-response, :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "NodeNotFoundFault" :portkey.aws.dax/node-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef reboot-node :args (clojure.spec.alpha/tuple :portkey.aws.dax/reboot-node-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/reboot-node-response))

(clojure.core/defn describe-default-parameters "Returns the default system parameter information for the DAX caching software." ([] (describe-default-parameters {})) ([describe-default-parameters-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-default-parameters-request describe-default-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/describe-default-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/describe-default-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDefaultParameters", :http.request.configuration/output-deser-fn response-describe-default-parameters-response, :http.request.spec/error-spec {"ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-default-parameters :args (clojure.spec.alpha/? :portkey.aws.dax/describe-default-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/describe-default-parameters-response))

(clojure.core/defn describe-clusters "Returns information about all provisioned DAX clusters if no cluster identifier\nis specified, or about a specific DAX cluster if a cluster identifier is\nsupplied.\n If the cluster is in the CREATING state, only cluster level information will be\ndisplayed until all of the nodes are successfully provisioned.\n If the cluster is in the DELETING state, only cluster level information will be\ndisplayed.\n If nodes are currently being added to the DAX cluster, node endpoint\ninformation and creation time for the additional nodes will not be displayed\nuntil they are completely provisioned. When the DAX cluster state is available,\nthe cluster is ready for use.\n If nodes are currently being removed from the DAX cluster, no endpoint\ninformation for the removed nodes is displayed." ([] (describe-clusters {})) ([describe-clusters-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-clusters-request describe-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/describe-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/describe-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeClusters", :http.request.configuration/output-deser-fn response-describe-clusters-response, :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-clusters :args (clojure.spec.alpha/? :portkey.aws.dax/describe-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/describe-clusters-response))

(clojure.core/defn delete-parameter-group "Deletes the specified parameter group. You cannot delete a parameter group if it\nis associated with any DAX clusters." ([delete-parameter-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-parameter-group-request delete-parameter-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/delete-parameter-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/delete-parameter-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteParameterGroup", :http.request.configuration/output-deser-fn response-delete-parameter-group-response, :http.request.spec/error-spec {"InvalidParameterGroupStateFault" :portkey.aws.dax/invalid-parameter-group-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef delete-parameter-group :args (clojure.spec.alpha/tuple :portkey.aws.dax/delete-parameter-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/delete-parameter-group-response))

(clojure.core/defn delete-subnet-group "Deletes a subnet group.\n You cannot delete a subnet group if it is associated with any DAX clusters." ([delete-subnet-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-subnet-group-request delete-subnet-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/delete-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/delete-subnet-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSubnetGroup", :http.request.configuration/output-deser-fn response-delete-subnet-group-response, :http.request.spec/error-spec {"SubnetGroupInUseFault" :portkey.aws.dax/subnet-group-in-use-fault, "SubnetGroupNotFoundFault" :portkey.aws.dax/subnet-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef delete-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dax/delete-subnet-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/delete-subnet-group-response))

(clojure.core/defn describe-parameters "Returns the detailed parameter list for a particular parameter group." ([describe-parameters-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-parameters-request describe-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/describe-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/describe-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeParameters", :http.request.configuration/output-deser-fn response-describe-parameters-response, :http.request.spec/error-spec {"ParameterGroupNotFoundFault" :portkey.aws.dax/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-parameters :args (clojure.spec.alpha/tuple :portkey.aws.dax/describe-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/describe-parameters-response))

(clojure.core/defn update-parameter-group "Modifies the parameters of a parameter group. You can modify up to 20 parameters\nin a single request by submitting a list parameter name and value pairs." ([update-parameter-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-parameter-group-request update-parameter-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/update-parameter-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/update-parameter-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateParameterGroup", :http.request.configuration/output-deser-fn response-update-parameter-group-response, :http.request.spec/error-spec {"InvalidParameterGroupStateFault" :portkey.aws.dax/invalid-parameter-group-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef update-parameter-group :args (clojure.spec.alpha/tuple :portkey.aws.dax/update-parameter-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/update-parameter-group-response))

(clojure.core/defn update-subnet-group "Modifies an existing subnet group." ([update-subnet-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-subnet-group-request update-subnet-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/update-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/update-subnet-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSubnetGroup", :http.request.configuration/output-deser-fn response-update-subnet-group-response, :http.request.spec/error-spec {"SubnetGroupNotFoundFault" :portkey.aws.dax/subnet-group-not-found-fault, "SubnetQuotaExceededFault" :portkey.aws.dax/subnet-quota-exceeded-fault, "SubnetInUse" :portkey.aws.dax/subnet-in-use, "InvalidSubnet" :portkey.aws.dax/invalid-subnet, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef update-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dax/update-subnet-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/update-subnet-group-response))

(clojure.core/defn delete-cluster "Deletes a previously provisioned DAX cluster. DeleteCluster deletes all\nassociated nodes, node endpoints and the DAX cluster itself. When you receive a\nsuccessful response from this action, DAX immediately begins deleting the\ncluster; you cannot cancel or revert this action." ([delete-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/delete-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCluster", :http.request.configuration/output-deser-fn response-delete-cluster-response, :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.dax/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/delete-cluster-response))

(clojure.core/defn create-parameter-group "Creates a new parameter group. A parameter group is a collection of parameters\nthat you apply to all of the nodes in a DAX cluster." ([create-parameter-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-parameter-group-request create-parameter-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/create-parameter-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/create-parameter-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateParameterGroup", :http.request.configuration/output-deser-fn response-create-parameter-group-response, :http.request.spec/error-spec {"ParameterGroupQuotaExceededFault" :portkey.aws.dax/parameter-group-quota-exceeded-fault, "ParameterGroupAlreadyExistsFault" :portkey.aws.dax/parameter-group-already-exists-fault, "InvalidParameterGroupStateFault" :portkey.aws.dax/invalid-parameter-group-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef create-parameter-group :args (clojure.spec.alpha/tuple :portkey.aws.dax/create-parameter-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/create-parameter-group-response))

(clojure.core/defn untag-resource "Removes the association of tags from a DAX resource. You can call UntagResource\nup to 5 times per second, per account." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "InvalidARNFault" :portkey.aws.dax/invalid-arn-fault, "TagNotFoundFault" :portkey.aws.dax/tag-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dax/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/untag-resource-response))

(clojure.core/defn update-cluster "Modifies the settings for a DAX cluster. You can use this action to change one\nor more cluster configuration parameters by specifying the parameters and the\nnew values." ([update-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-cluster-request update-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/update-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/update-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCluster", :http.request.configuration/output-deser-fn response-update-cluster-response, :http.request.spec/error-spec {"InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "InvalidParameterGroupStateFault" :portkey.aws.dax/invalid-parameter-group-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef update-cluster :args (clojure.spec.alpha/tuple :portkey.aws.dax/update-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/update-cluster-response))

(clojure.core/defn decrease-replication-factor "Removes one or more nodes from a DAX cluster.\n You cannot use DecreaseReplicationFactor to remove the last node in a DAX\ncluster. If you need to do this, use DeleteCluster instead." ([decrease-replication-factor-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-decrease-replication-factor-request decrease-replication-factor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/decrease-replication-factor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/decrease-replication-factor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DecreaseReplicationFactor", :http.request.configuration/output-deser-fn response-decrease-replication-factor-response, :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "NodeNotFoundFault" :portkey.aws.dax/node-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef decrease-replication-factor :args (clojure.spec.alpha/tuple :portkey.aws.dax/decrease-replication-factor-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/decrease-replication-factor-response))

(clojure.core/defn describe-subnet-groups "Returns a list of subnet group descriptions. If a subnet group name is\nspecified, the list will contain only the description of that group." ([] (describe-subnet-groups {})) ([describe-subnet-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-subnet-groups-request describe-subnet-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/describe-subnet-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/describe-subnet-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSubnetGroups", :http.request.configuration/output-deser-fn response-describe-subnet-groups-response, :http.request.spec/error-spec {"SubnetGroupNotFoundFault" :portkey.aws.dax/subnet-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-subnet-groups :args (clojure.spec.alpha/? :portkey.aws.dax/describe-subnet-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/describe-subnet-groups-response))

(clojure.core/defn create-subnet-group "Creates a new subnet group." ([create-subnet-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-subnet-group-request create-subnet-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/create-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/create-subnet-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSubnetGroup", :http.request.configuration/output-deser-fn response-create-subnet-group-response, :http.request.spec/error-spec {"SubnetGroupAlreadyExistsFault" :portkey.aws.dax/subnet-group-already-exists-fault, "SubnetGroupQuotaExceededFault" :portkey.aws.dax/subnet-group-quota-exceeded-fault, "SubnetQuotaExceededFault" :portkey.aws.dax/subnet-quota-exceeded-fault, "InvalidSubnet" :portkey.aws.dax/invalid-subnet, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef create-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dax/create-subnet-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/create-subnet-group-response))

(clojure.core/defn increase-replication-factor "Adds one or more nodes to a DAX cluster." ([increase-replication-factor-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-increase-replication-factor-request increase-replication-factor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dax/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax/increase-replication-factor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax/increase-replication-factor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "IncreaseReplicationFactor", :http.request.configuration/output-deser-fn response-increase-replication-factor-response, :http.request.spec/error-spec {"InsufficientClusterCapacityFault" :portkey.aws.dax/insufficient-cluster-capacity-fault, "InvalidVPCNetworkStateFault" :portkey.aws.dax/invalid-vpc-network-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax/service-linked-role-not-found-fault, "NodeQuotaForCustomerExceededFault" :portkey.aws.dax/node-quota-for-customer-exceeded-fault, "InvalidParameterCombinationException" :portkey.aws.dax/invalid-parameter-combination-exception, "InvalidClusterStateFault" :portkey.aws.dax/invalid-cluster-state-fault, "NodeQuotaForClusterExceededFault" :portkey.aws.dax/node-quota-for-cluster-exceeded-fault, "ClusterNotFoundFault" :portkey.aws.dax/cluster-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef increase-replication-factor :args (clojure.spec.alpha/tuple :portkey.aws.dax/increase-replication-factor-request) :ret (clojure.spec.alpha/and :portkey.aws.dax/increase-replication-factor-response))
