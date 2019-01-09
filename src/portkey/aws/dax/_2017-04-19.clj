(ns portkey.aws.dax.-2017-04-19 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/insufficient-cluster-capacity-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-group-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/subnet-group))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/cluster-name-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/sse-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/change-type #{"IMMEDIATE" "REQUIRES_REBOOT" :immediate :requires-reboot})

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/cluster-quota-for-customer-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/security-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/security-group-membership))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-type #{"NODE_TYPE_SPECIFIC" :default :node-type-specific "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.delete-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.delete-cluster-request/cluster-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/invalid-arn-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter-group-status/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter-group-status/parameter-apply-status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter-group-status/node-ids-to-reboot (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/node-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-group-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.parameter-group-status/parameter-group-name :portkey.aws.dax.-2017-04-19.parameter-group-status/parameter-apply-status :portkey.aws.dax.-2017-04-19.parameter-group-status/node-ids-to-reboot]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.subnet/subnet-identifier (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.subnet/subnet-availability-zone (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.subnet/subnet-identifier :portkey.aws.dax.-2017-04-19.subnet/subnet-availability-zone]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-name-value-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/parameter-name-value))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/reboot-node-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.increase-replication-factor-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.increase-replication-factor-request/new-replication-factor (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.increase-replication-factor-request/availability-zones (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/increase-replication-factor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.increase-replication-factor-request/cluster-name :portkey.aws.dax.-2017-04-19.increase-replication-factor-request/new-replication-factor] :opt-un [:portkey.aws.dax.-2017-04-19.increase-replication-factor-request/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/key-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-group-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/cluster-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.list-tags-response/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.list-tags-response/tags :portkey.aws.dax.-2017-04-19.list-tags-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/invalid-vpc-network-state-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-request/source-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-request/start-time (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-request/end-time (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-request/duration (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-request/max-results (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-request/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-events-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-events-request/source-name :portkey.aws.dax.-2017-04-19/source-type :portkey.aws.dax.-2017-04-19.describe-events-request/start-time :portkey.aws.dax.-2017-04-19.describe-events-request/end-time :portkey.aws.dax.-2017-04-19.describe-events-request/duration :portkey.aws.dax.-2017-04-19.describe-events-request/max-results :portkey.aws.dax.-2017-04-19.describe-events-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-clusters-response/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-clusters-response/clusters (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/cluster-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-clusters-response/next-token :portkey.aws.dax.-2017-04-19.describe-clusters-response/clusters]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-group-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/tag-quota-per-resource-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/event-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/event))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/source-type #{:cluster "CLUSTER" :parameter-group "SUBNET_GROUP" :subnet-group "PARAMETER_GROUP"})

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.event/source-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.event/message (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.event/date (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.event/source-name :portkey.aws.dax.-2017-04-19/source-type :portkey.aws.dax.-2017-04-19.event/message :portkey.aws.dax.-2017-04-19.event/date]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameters-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameters-request/source (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameters-request/max-results (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameters-request/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.describe-parameters-request/parameter-group-name] :opt-un [:portkey.aws.dax.-2017-04-19.describe-parameters-request/source :portkey.aws.dax.-2017-04-19.describe-parameters-request/max-results :portkey.aws.dax.-2017-04-19.describe-parameters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/availability-zone-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.tag-resource-response/tags (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.tag-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameters-response/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameters-response/parameters (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/parameter-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-parameters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-parameters-response/next-token :portkey.aws.dax.-2017-04-19.describe-parameters-response/parameters]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/cluster-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/cluster))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-clusters-request/cluster-names (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/cluster-name-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-clusters-request/cluster-names :portkey.aws.dax.-2017-04-19.describe-clusters-request/max-results :portkey.aws.dax.-2017-04-19.describe-clusters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.tag-resource-request/resource-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.tag-resource-request/resource-name :portkey.aws.dax.-2017-04-19.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter-name-value/parameter-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter-name-value/parameter-value (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-name-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.parameter-name-value/parameter-name :portkey.aws.dax.-2017-04-19.parameter-name-value/parameter-value]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/parameter))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/invalid-subnet (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.delete-subnet-group-response/deletion-message (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/delete-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.delete-subnet-group-response/deletion-message]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-in-use (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/tag-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/tag))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/new-replication-factor (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/availability-zones (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/node-ids-to-remove (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/node-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/decrease-replication-factor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/cluster-name :portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/new-replication-factor] :opt-un [:portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/availability-zones :portkey.aws.dax.-2017-04-19.decrease-replication-factor-request/node-ids-to-remove]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-subnet-group-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-subnet-group-request/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-subnet-group-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/update-subnet-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.update-subnet-group-request/subnet-group-name] :opt-un [:portkey.aws.dax.-2017-04-19.update-subnet-group-request/description :portkey.aws.dax.-2017-04-19.update-subnet-group-request/subnet-ids]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.subnet-group/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.subnet-group/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.subnet-group/vpc-id (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.subnet-group/subnets (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/subnet-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.subnet-group/subnet-group-name :portkey.aws.dax.-2017-04-19.subnet-group/description :portkey.aws.dax.-2017-04-19.subnet-group/vpc-id :portkey.aws.dax.-2017-04-19.subnet-group/subnets]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/sse-status #{"DISABLED" :disabled "DISABLING" "ENABLING" :disabling :enabling "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-subnet-group-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-subnet-group-request/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-subnet-group-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/create-subnet-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.create-subnet-group-request/subnet-group-name :portkey.aws.dax.-2017-04-19.create-subnet-group-request/subnet-ids] :opt-un [:portkey.aws.dax.-2017-04-19.create-subnet-group-request/description]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-cluster-request/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-cluster-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-cluster-request/notification-topic-arn (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-cluster-request/notification-topic-status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-cluster-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-cluster-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/security-group-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/update-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.update-cluster-request/cluster-name] :opt-un [:portkey.aws.dax.-2017-04-19.update-cluster-request/description :portkey.aws.dax.-2017-04-19.update-cluster-request/preferred-maintenance-window :portkey.aws.dax.-2017-04-19.update-cluster-request/notification-topic-arn :portkey.aws.dax.-2017-04-19.update-cluster-request/notification-topic-status :portkey.aws.dax.-2017-04-19.update-cluster-request/parameter-group-name :portkey.aws.dax.-2017-04-19.update-cluster-request/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/total-nodes (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/nodes (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/node-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/security-groups (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/cluster-arn (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/iam-role-arn (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/subnet-group (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/cluster-discovery-endpoint (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/endpoint))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/parameter-group (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/parameter-group-status))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/active-nodes (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/cluster-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/node-ids-to-remove (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/node-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.cluster/node-type (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.cluster/total-nodes :portkey.aws.dax.-2017-04-19.cluster/nodes :portkey.aws.dax.-2017-04-19.cluster/preferred-maintenance-window :portkey.aws.dax.-2017-04-19.cluster/security-groups :portkey.aws.dax.-2017-04-19.cluster/cluster-arn :portkey.aws.dax.-2017-04-19.cluster/status :portkey.aws.dax.-2017-04-19.cluster/iam-role-arn :portkey.aws.dax.-2017-04-19.cluster/subnet-group :portkey.aws.dax.-2017-04-19.cluster/cluster-discovery-endpoint :portkey.aws.dax.-2017-04-19.cluster/description :portkey.aws.dax.-2017-04-19.cluster/parameter-group :portkey.aws.dax.-2017-04-19.cluster/active-nodes :portkey.aws.dax.-2017-04-19.cluster/cluster-name :portkey.aws.dax.-2017-04-19.cluster/node-ids-to-remove :portkey.aws.dax.-2017-04-19/notification-configuration :portkey.aws.dax.-2017-04-19/sse-description :portkey.aws.dax.-2017-04-19.cluster/node-type]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/increase-replication-factor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-subnet-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-subnet-groups-response/subnet-groups (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/subnet-group-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-subnet-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-subnet-groups-response/next-token :portkey.aws.dax.-2017-04-19.describe-subnet-groups-response/subnet-groups]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-group-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.sse-specification/enabled (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/sse-enabled))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/sse-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.sse-specification/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-group-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-group-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node-quota-for-customer-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node-type-specific-value-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/node-type-specific-value))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter-group/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter-group/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.parameter-group/parameter-group-name :portkey.aws.dax.-2017-04-19.parameter-group/description]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.delete-subnet-group-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/delete-subnet-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.delete-subnet-group-request/subnet-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.node-type-specific-value/node-type (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.node-type-specific-value/value (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node-type-specific-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.node-type-specific-value/node-type :portkey.aws.dax.-2017-04-19.node-type-specific-value/value]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/decrease-replication-factor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/create-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/subnet-group]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter/data-type (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter/parameter-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter/source (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter/allowed-values (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter/node-type-specific-values (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/node-type-specific-value-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/change-type :portkey.aws.dax.-2017-04-19.parameter/data-type :portkey.aws.dax.-2017-04-19.parameter/parameter-name :portkey.aws.dax.-2017-04-19/parameter-type :portkey.aws.dax.-2017-04-19.parameter/source :portkey.aws.dax.-2017-04-19.parameter/allowed-values :portkey.aws.dax.-2017-04-19.parameter/description :portkey.aws.dax.-2017-04-19/is-modifiable :portkey.aws.dax.-2017-04-19.parameter/node-type-specific-values :portkey.aws.dax.-2017-04-19.parameter/parameter-value]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/security-group-identifier-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/subnet-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/replication-factor (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/tags (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/iam-role-arn (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/notification-topic-arn (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/availability-zones (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-cluster-request/node-type (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.create-cluster-request/cluster-name :portkey.aws.dax.-2017-04-19.create-cluster-request/node-type :portkey.aws.dax.-2017-04-19.create-cluster-request/replication-factor :portkey.aws.dax.-2017-04-19.create-cluster-request/iam-role-arn] :opt-un [:portkey.aws.dax.-2017-04-19.create-cluster-request/security-group-ids :portkey.aws.dax.-2017-04-19.create-cluster-request/preferred-maintenance-window :portkey.aws.dax.-2017-04-19.create-cluster-request/subnet-group-name :portkey.aws.dax.-2017-04-19.create-cluster-request/tags :portkey.aws.dax.-2017-04-19.create-cluster-request/parameter-group-name :portkey.aws.dax.-2017-04-19.create-cluster-request/description :portkey.aws.dax.-2017-04-19/sse-specification :portkey.aws.dax.-2017-04-19.create-cluster-request/notification-topic-arn :portkey.aws.dax.-2017-04-19.create-cluster-request/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/update-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/cluster]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/t-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.invalid-parameter-combination-exception/message (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.invalid-parameter-combination-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-default-parameters-response/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-default-parameters-response/parameters (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/parameter-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-default-parameters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-default-parameters-response/next-token :portkey.aws.dax.-2017-04-19.describe-default-parameters-response/parameters]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-subnet-groups-request/subnet-group-names (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/subnet-group-name-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-subnet-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-subnet-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-subnet-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-subnet-groups-request/subnet-group-names :portkey.aws.dax.-2017-04-19.describe-subnet-groups-request/max-results :portkey.aws.dax.-2017-04-19.describe-subnet-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/security-group-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.delete-parameter-group-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/delete-parameter-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.delete-parameter-group-request/parameter-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/update-parameter-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/parameter-group]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.endpoint/address (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.endpoint/port (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.endpoint/address :portkey.aws.dax.-2017-04-19.endpoint/port]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.reboot-node-request/cluster-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.reboot-node-request/node-id (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/reboot-node-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.reboot-node-request/cluster-name :portkey.aws.dax.-2017-04-19.reboot-node-request/node-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node-quota-for-cluster-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/cluster-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-parameter-group-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.update-parameter-group-request/parameter-name-values (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/parameter-name-value-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/update-parameter-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.update-parameter-group-request/parameter-group-name :portkey.aws.dax.-2017-04-19.update-parameter-group-request/parameter-name-values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.security-group-membership/security-group-identifier (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.security-group-membership/status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/security-group-membership (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.security-group-membership/security-group-identifier :portkey.aws.dax.-2017-04-19.security-group-membership/status]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/is-modifiable #{:true "CONDITIONAL" :false "TRUE" "FALSE" :conditional})

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-group-in-use-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.tag/key (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.tag/value (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.tag/key :portkey.aws.dax.-2017-04-19.tag/value]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameter-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameter-groups-response/parameter-groups (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/parameter-group-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-parameter-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-parameter-groups-response/next-token :portkey.aws.dax.-2017-04-19.describe-parameter-groups-response/parameter-groups]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-default-parameters-request/max-results (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-default-parameters-request/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-default-parameters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-default-parameters-request/max-results :portkey.aws.dax.-2017-04-19.describe-default-parameters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-group-quota-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/tag-not-found-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/update-subnet-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/subnet-group]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.notification-configuration/topic-arn (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.notification-configuration/topic-status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/notification-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.notification-configuration/topic-arn :portkey.aws.dax.-2017-04-19.notification-configuration/topic-status]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-parameter-group-request/parameter-group-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.create-parameter-group-request/description (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/create-parameter-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.create-parameter-group-request/parameter-group-name] :opt-un [:portkey.aws.dax.-2017-04-19.create-parameter-group-request/description]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/aws-query-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.sse-description/status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/sse-status))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/sse-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.sse-description/status]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/integer-optional clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.node/node-id (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.node/node-create-time (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/t-stamp))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.node/availability-zone (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.node/node-status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.node/parameter-group-status (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.node/node-id :portkey.aws.dax.-2017-04-19/endpoint :portkey.aws.dax.-2017-04-19.node/node-create-time :portkey.aws.dax.-2017-04-19.node/availability-zone :portkey.aws.dax.-2017-04-19.node/node-status :portkey.aws.dax.-2017-04-19.node/parameter-group-status]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.untag-resource-response/tags (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/tag-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.untag-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameter-groups-request/parameter-group-names (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/parameter-group-name-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameter-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/integer-optional))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-parameter-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-parameter-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-parameter-groups-request/parameter-group-names :portkey.aws.dax.-2017-04-19.describe-parameter-groups-request/max-results :portkey.aws.dax.-2017-04-19.describe-parameter-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/subnet-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/subnet))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.delete-parameter-group-response/deletion-message (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/delete-parameter-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.delete-parameter-group-response/deletion-message]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-response/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.describe-events-response/events (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/event-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/describe-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19.describe-events-response/next-token :portkey.aws.dax.-2017-04-19.describe-events-response/events]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/node-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/node))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.untag-resource-request/resource-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/key-list))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.untag-resource-request/resource-name :portkey.aws.dax.-2017-04-19.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/invalid-parameter-group-state-fault (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/create-parameter-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dax.-2017-04-19/parameter-group]))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/parameter-group-list (clojure.spec.alpha/coll-of :portkey.aws.dax.-2017-04-19/parameter-group))

(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.list-tags-request/resource-name (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19.list-tags-request/next-token (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.dax.-2017-04-19/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dax.-2017-04-19.list-tags-request/resource-name] :opt-un [:portkey.aws.dax.-2017-04-19.list-tags-request/next-token]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResource", :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "TagQuotaPerResourceExceeded" :portkey.aws.dax.-2017-04-19/tag-quota-per-resource-exceeded, "InvalidARNFault" :portkey.aws.dax.-2017-04-19/invalid-arn-fault, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/tag-resource-response))

(clojure.core/defn create-cluster ([create-cluster-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCluster", :http.request.spec/error-spec {"InsufficientClusterCapacityFault" :portkey.aws.dax.-2017-04-19/insufficient-cluster-capacity-fault, "ClusterQuotaForCustomerExceededFault" :portkey.aws.dax.-2017-04-19/cluster-quota-for-customer-exceeded-fault, "ClusterAlreadyExistsFault" :portkey.aws.dax.-2017-04-19/cluster-already-exists-fault, "InvalidVPCNetworkStateFault" :portkey.aws.dax.-2017-04-19/invalid-vpc-network-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/parameter-group-not-found-fault, "TagQuotaPerResourceExceeded" :portkey.aws.dax.-2017-04-19/tag-quota-per-resource-exceeded, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "SubnetGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/subnet-group-not-found-fault, "NodeQuotaForCustomerExceededFault" :portkey.aws.dax.-2017-04-19/node-quota-for-customer-exceeded-fault, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "NodeQuotaForClusterExceededFault" :portkey.aws.dax.-2017-04-19/node-quota-for-cluster-exceeded-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterGroupStateFault" :portkey.aws.dax.-2017-04-19/invalid-parameter-group-state-fault}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/create-cluster-response))

(clojure.core/defn describe-parameter-groups ([] (describe-parameter-groups {})) ([describe-parameter-groups-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-parameter-groups-request describe-parameter-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/describe-parameter-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/describe-parameter-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeParameterGroups", :http.request.spec/error-spec {"ParameterGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-parameter-groups :args (clojure.spec.alpha/? :portkey.aws.dax.-2017-04-19/describe-parameter-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/describe-parameter-groups-response))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-events-request describe-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/describe-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/describe-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEvents", :http.request.spec/error-spec {"ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.dax.-2017-04-19/describe-events-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/describe-events-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "InvalidARNFault" :portkey.aws.dax.-2017-04-19/invalid-arn-fault, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/list-tags-response))

(clojure.core/defn reboot-node ([reboot-node-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-reboot-node-request reboot-node-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/reboot-node-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/reboot-node-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RebootNode", :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "NodeNotFoundFault" :portkey.aws.dax.-2017-04-19/node-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef reboot-node :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/reboot-node-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/reboot-node-response))

(clojure.core/defn describe-default-parameters ([] (describe-default-parameters {})) ([describe-default-parameters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-default-parameters-request describe-default-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/describe-default-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/describe-default-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDefaultParameters", :http.request.spec/error-spec {"ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-default-parameters :args (clojure.spec.alpha/? :portkey.aws.dax.-2017-04-19/describe-default-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/describe-default-parameters-response))

(clojure.core/defn describe-clusters ([] (describe-clusters {})) ([describe-clusters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-clusters-request describe-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/describe-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/describe-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeClusters", :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-clusters :args (clojure.spec.alpha/? :portkey.aws.dax.-2017-04-19/describe-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/describe-clusters-response))

(clojure.core/defn delete-parameter-group ([delete-parameter-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-parameter-group-request delete-parameter-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/delete-parameter-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/delete-parameter-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteParameterGroup", :http.request.spec/error-spec {"InvalidParameterGroupStateFault" :portkey.aws.dax.-2017-04-19/invalid-parameter-group-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef delete-parameter-group :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/delete-parameter-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/delete-parameter-group-response))

(clojure.core/defn delete-subnet-group ([delete-subnet-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-subnet-group-request delete-subnet-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/delete-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/delete-subnet-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSubnetGroup", :http.request.spec/error-spec {"SubnetGroupInUseFault" :portkey.aws.dax.-2017-04-19/subnet-group-in-use-fault, "SubnetGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/subnet-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef delete-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/delete-subnet-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/delete-subnet-group-response))

(clojure.core/defn describe-parameters ([describe-parameters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-parameters-request describe-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/describe-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/describe-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeParameters", :http.request.spec/error-spec {"ParameterGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-parameters :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/describe-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/describe-parameters-response))

(clojure.core/defn update-parameter-group ([update-parameter-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-parameter-group-request update-parameter-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/update-parameter-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/update-parameter-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateParameterGroup", :http.request.spec/error-spec {"InvalidParameterGroupStateFault" :portkey.aws.dax.-2017-04-19/invalid-parameter-group-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef update-parameter-group :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/update-parameter-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/update-parameter-group-response))

(clojure.core/defn update-subnet-group ([update-subnet-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-subnet-group-request update-subnet-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/update-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/update-subnet-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSubnetGroup", :http.request.spec/error-spec {"SubnetGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/subnet-group-not-found-fault, "SubnetQuotaExceededFault" :portkey.aws.dax.-2017-04-19/subnet-quota-exceeded-fault, "SubnetInUse" :portkey.aws.dax.-2017-04-19/subnet-in-use, "InvalidSubnet" :portkey.aws.dax.-2017-04-19/invalid-subnet, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef update-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/update-subnet-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/update-subnet-group-response))

(clojure.core/defn delete-cluster ([delete-cluster-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/delete-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCluster", :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/delete-cluster-response))

(clojure.core/defn create-parameter-group ([create-parameter-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-parameter-group-request create-parameter-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/create-parameter-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/create-parameter-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateParameterGroup", :http.request.spec/error-spec {"ParameterGroupQuotaExceededFault" :portkey.aws.dax.-2017-04-19/parameter-group-quota-exceeded-fault, "ParameterGroupAlreadyExistsFault" :portkey.aws.dax.-2017-04-19/parameter-group-already-exists-fault, "InvalidParameterGroupStateFault" :portkey.aws.dax.-2017-04-19/invalid-parameter-group-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef create-parameter-group :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/create-parameter-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/create-parameter-group-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResource", :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "InvalidARNFault" :portkey.aws.dax.-2017-04-19/invalid-arn-fault, "TagNotFoundFault" :portkey.aws.dax.-2017-04-19/tag-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/untag-resource-response))

(clojure.core/defn update-cluster ([update-cluster-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-cluster-request update-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/update-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/update-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCluster", :http.request.spec/error-spec {"InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "InvalidParameterGroupStateFault" :portkey.aws.dax.-2017-04-19/invalid-parameter-group-state-fault, "ParameterGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/parameter-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef update-cluster :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/update-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/update-cluster-response))

(clojure.core/defn decrease-replication-factor ([decrease-replication-factor-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-decrease-replication-factor-request decrease-replication-factor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/decrease-replication-factor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/decrease-replication-factor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DecreaseReplicationFactor", :http.request.spec/error-spec {"ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "NodeNotFoundFault" :portkey.aws.dax.-2017-04-19/node-not-found-fault, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef decrease-replication-factor :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/decrease-replication-factor-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/decrease-replication-factor-response))

(clojure.core/defn describe-subnet-groups ([] (describe-subnet-groups {})) ([describe-subnet-groups-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-subnet-groups-request describe-subnet-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/describe-subnet-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/describe-subnet-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSubnetGroups", :http.request.spec/error-spec {"SubnetGroupNotFoundFault" :portkey.aws.dax.-2017-04-19/subnet-group-not-found-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef describe-subnet-groups :args (clojure.spec.alpha/? :portkey.aws.dax.-2017-04-19/describe-subnet-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/describe-subnet-groups-response))

(clojure.core/defn create-subnet-group ([create-subnet-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-subnet-group-request create-subnet-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/create-subnet-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/create-subnet-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSubnetGroup", :http.request.spec/error-spec {"SubnetGroupAlreadyExistsFault" :portkey.aws.dax.-2017-04-19/subnet-group-already-exists-fault, "SubnetGroupQuotaExceededFault" :portkey.aws.dax.-2017-04-19/subnet-group-quota-exceeded-fault, "SubnetQuotaExceededFault" :portkey.aws.dax.-2017-04-19/subnet-quota-exceeded-fault, "InvalidSubnet" :portkey.aws.dax.-2017-04-19/invalid-subnet, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault}})))))
(clojure.spec.alpha/fdef create-subnet-group :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/create-subnet-group-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/create-subnet-group-response))

(clojure.core/defn increase-replication-factor ([increase-replication-factor-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-increase-replication-factor-request increase-replication-factor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.dax.-2017-04-19/endpoints, :http.request.configuration/target-prefix "AmazonDAXV3", :http.request.spec/output-spec :portkey.aws.dax.-2017-04-19/increase-replication-factor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "DAX", :http.request.spec/input-spec :portkey.aws.dax.-2017-04-19/increase-replication-factor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "IncreaseReplicationFactor", :http.request.spec/error-spec {"InsufficientClusterCapacityFault" :portkey.aws.dax.-2017-04-19/insufficient-cluster-capacity-fault, "InvalidVPCNetworkStateFault" :portkey.aws.dax.-2017-04-19/invalid-vpc-network-state-fault, "ServiceLinkedRoleNotFoundFault" :portkey.aws.dax.-2017-04-19/service-linked-role-not-found-fault, "NodeQuotaForCustomerExceededFault" :portkey.aws.dax.-2017-04-19/node-quota-for-customer-exceeded-fault, "InvalidParameterCombinationException" :portkey.aws.dax.-2017-04-19/invalid-parameter-combination-exception, "InvalidClusterStateFault" :portkey.aws.dax.-2017-04-19/invalid-cluster-state-fault, "NodeQuotaForClusterExceededFault" :portkey.aws.dax.-2017-04-19/node-quota-for-cluster-exceeded-fault, "ClusterNotFoundFault" :portkey.aws.dax.-2017-04-19/cluster-not-found-fault, "InvalidParameterValueException" :portkey.aws.dax.-2017-04-19/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef increase-replication-factor :args (clojure.spec.alpha/tuple :portkey.aws.dax.-2017-04-19/increase-replication-factor-request) :ret (clojure.spec.alpha/and :portkey.aws.dax.-2017-04-19/increase-replication-factor-response))
