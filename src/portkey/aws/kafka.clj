(ns portkey.aws.kafka (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-string-min-1-max-128)

(clojure.core/declare ser-integer-min-1-max-15)

(clojure.core/declare ser-encryption-at-rest)

(clojure.core/declare ser-integer-min-1-max-16384)

(clojure.core/declare ser-string)

(clojure.core/declare ser-string-min-1-max-64)

(clojure.core/declare ser-storage-info)

(clojure.core/declare ser-broker-az-distribution)

(clojure.core/declare ser-string-min-5-max-32)

(clojure.core/declare ser-enhanced-monitoring)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-ebs-storage-info)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-encryption-info)

(clojure.core/declare ser-broker-node-group-info)

(clojure.core/defn- ser-string-min-1-max-128 [input] #:http.request.field{:value input, :shape "__stringMin1Max128"})

(clojure.core/defn- ser-integer-min-1-max-15 [input] #:http.request.field{:value input, :shape "__integerMin1Max15"})

(clojure.core/defn- ser-encryption-at-rest [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:data-volume-kms-key-id input)) #:http.request.field{:name "DataVolumeKMSKeyId", :shape "__string", :location-name "dataVolumeKMSKeyId"})], :shape "EncryptionAtRest", :type "structure"}))

(clojure.core/defn- ser-integer-min-1-max-16384 [input] #:http.request.field{:value input, :shape "__integerMin1Max16384"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-string-min-1-max-64 [input] #:http.request.field{:value input, :shape "__stringMin1Max64"})

(clojure.core/defn- ser-storage-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StorageInfo", :type "structure"} (clojure.core/contains? input :ebs-storage-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-storage-info (input :ebs-storage-info)) #:http.request.field{:name "EbsStorageInfo", :shape "EBSStorageInfo", :location-name "ebsStorageInfo"}))))

(clojure.core/defn- ser-broker-az-distribution [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT"} input), :shape "BrokerAZDistribution"})

(clojure.core/defn- ser-string-min-5-max-32 [input] #:http.request.field{:value input, :shape "__stringMin5Max32"})

(clojure.core/defn- ser-enhanced-monitoring [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "PER_BROKER" "PER_BROKER", :per-broker "PER_BROKER", "PER_TOPIC_PER_BROKER" "PER_TOPIC_PER_BROKER", :per-topic-per-broker "PER_TOPIC_PER_BROKER"} input), :shape "EnhancedMonitoring"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-ebs-storage-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EBSStorageInfo", :type "structure"} (clojure.core/contains? input :volume-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-16384 (input :volume-size)) #:http.request.field{:name "VolumeSize", :shape "__integerMin1Max16384", :location-name "volumeSize"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-encryption-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EncryptionInfo", :type "structure"} (clojure.core/contains? input :encryption-at-rest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-at-rest (input :encryption-at-rest)) #:http.request.field{:name "EncryptionAtRest", :shape "EncryptionAtRest", :location-name "encryptionAtRest"}))))

(clojure.core/defn- ser-broker-node-group-info [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-string (:client-subnets input)) #:http.request.field{:name "ClientSubnets", :shape "__listOf__string", :location-name "clientSubnets"}) (clojure.core/into (ser-string-min-5-max-32 (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "__stringMin5Max32", :location-name "instanceType"})], :shape "BrokerNodeGroupInfo", :type "structure"} (clojure.core/contains? input :broker-az-distribution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-broker-az-distribution (input :broker-az-distribution)) #:http.request.field{:name "BrokerAZDistribution", :shape "BrokerAZDistribution", :location-name "brokerAZDistribution"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "__listOf__string", :location-name "securityGroups"})) (clojure.core/contains? input :storage-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-info (input :storage-info)) #:http.request.field{:name "StorageInfo", :shape "StorageInfo", :location-name "storageInfo"}))))

(clojure.core/defn- req-list-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster-name-filter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster-name-filter)) #:http.request.field{:name "ClusterNameFilter", :shape "__string", :location "querystring", :location-name "clusterNameFilter"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :cluster-arn)) #:http.request.field{:name "ClusterArn", :shape "__string", :location "uri", :location-name "clusterArn"})]} (clojure.core/contains? input :current-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :current-version)) #:http.request.field{:name "CurrentVersion", :shape "__string", :location "querystring", :location-name "currentVersion"}))))

(clojure.core/defn- req-get-bootstrap-brokers-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :cluster-arn)) #:http.request.field{:name "ClusterArn", :shape "__string", :location "uri", :location-name "clusterArn"})]}))

(clojure.core/defn- req-describe-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :cluster-arn)) #:http.request.field{:name "ClusterArn", :shape "__string", :location "uri", :location-name "clusterArn"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-broker-node-group-info (input :broker-node-group-info)) #:http.request.field{:name "BrokerNodeGroupInfo", :shape "BrokerNodeGroupInfo", :location-name "brokerNodeGroupInfo"}) (clojure.core/into (ser-string-min-1-max-128 (input :kafka-version)) #:http.request.field{:name "KafkaVersion", :shape "__stringMin1Max128", :location-name "kafkaVersion"}) (clojure.core/into (ser-integer-min-1-max-15 (input :number-of-broker-nodes)) #:http.request.field{:name "NumberOfBrokerNodes", :shape "__integerMin1Max15", :location-name "numberOfBrokerNodes"}) (clojure.core/into (ser-string-min-1-max-64 (input :cluster-name)) #:http.request.field{:name "ClusterName", :shape "__stringMin1Max64", :location-name "clusterName"})]} (clojure.core/contains? input :encryption-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-info (input :encryption-info)) #:http.request.field{:name "EncryptionInfo", :shape "EncryptionInfo", :location-name "encryptionInfo"})) (clojure.core/contains? input :enhanced-monitoring) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enhanced-monitoring (input :enhanced-monitoring)) #:http.request.field{:name "EnhancedMonitoring", :shape "EnhancedMonitoring", :location-name "enhancedMonitoring"}))))

(clojure.core/defn- req-list-nodes-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :cluster-arn)) #:http.request.field{:name "ClusterArn", :shape "__string", :location "uri", :location-name "clusterArn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/declare deser-list-of-node-info)

(clojure.core/declare deser-node-info)

(clojure.core/declare deser-encryption-at-rest)

(clojure.core/declare deser-integer-min-1-max-16384)

(clojure.core/declare deser-string)

(clojure.core/declare deser-list-of-cluster-info)

(clojure.core/declare deser-broker-node-info)

(clojure.core/declare deser-storage-info)

(clojure.core/declare deser-cluster-state)

(clojure.core/declare deser-broker-az-distribution)

(clojure.core/declare deser-broker-software-info)

(clojure.core/declare deser-string-min-5-max-32)

(clojure.core/declare deser-enhanced-monitoring)

(clojure.core/declare deser-list-of-string)

(clojure.core/declare deser-zookeeper-node-info)

(clojure.core/declare deser-cluster-info)

(clojure.core/declare deser-ebs-storage-info)

(clojure.core/declare deser-timestamp-iso-8601)

(clojure.core/declare deser-double)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-encryption-info)

(clojure.core/declare deser-node-type)

(clojure.core/declare deser-broker-node-group-info)

(clojure.core/defn- deser-list-of-node-info [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-node-info coll))) input))

(clojure.core/defn- deser-node-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "addedToClusterTime") (clojure.core/assoc :added-to-cluster-time (deser-string (input "addedToClusterTime"))) (clojure.core/contains? input "brokerNodeInfo") (clojure.core/assoc :broker-node-info (deser-broker-node-info (input "brokerNodeInfo"))) (clojure.core/contains? input "instanceType") (clojure.core/assoc :instance-type (deser-string (input "instanceType"))) (clojure.core/contains? input "nodeARN") (clojure.core/assoc :node-arn (deser-string (input "nodeARN"))) (clojure.core/contains? input "nodeType") (clojure.core/assoc :node-type (deser-node-type (input "nodeType"))) (clojure.core/contains? input "zookeeperNodeInfo") (clojure.core/assoc :zookeeper-node-info (deser-zookeeper-node-info (input "zookeeperNodeInfo")))))

(clojure.core/defn- deser-encryption-at-rest [input] (clojure.core/cond-> {:data-volume-kms-key-id (deser-string (input "dataVolumeKMSKeyId"))}))

(clojure.core/defn- deser-integer-min-1-max-16384 [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-list-of-cluster-info [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cluster-info coll))) input))

(clojure.core/defn- deser-broker-node-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "attachedENIId") (clojure.core/assoc :attached-eni-id (deser-string (input "attachedENIId"))) (clojure.core/contains? input "brokerId") (clojure.core/assoc :broker-id (deser-double (input "brokerId"))) (clojure.core/contains? input "clientSubnet") (clojure.core/assoc :client-subnet (deser-string (input "clientSubnet"))) (clojure.core/contains? input "clientVpcIpAddress") (clojure.core/assoc :client-vpc-ip-address (deser-string (input "clientVpcIpAddress"))) (clojure.core/contains? input "currentBrokerSoftwareInfo") (clojure.core/assoc :current-broker-software-info (deser-broker-software-info (input "currentBrokerSoftwareInfo")))))

(clojure.core/defn- deser-storage-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "ebsStorageInfo") (clojure.core/assoc :ebs-storage-info (deser-ebs-storage-info (input "ebsStorageInfo")))))

(clojure.core/defn- deser-cluster-state [input] (clojure.core/get {"ACTIVE" :active, "CREATING" :creating, "DELETING" :deleting, "FAILED" :failed} input))

(clojure.core/defn- deser-broker-az-distribution [input] (clojure.core/get {"DEFAULT" :default} input))

(clojure.core/defn- deser-broker-software-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "configurationArn") (clojure.core/assoc :configuration-arn (deser-string (input "configurationArn"))) (clojure.core/contains? input "configurationRevision") (clojure.core/assoc :configuration-revision (deser-string (input "configurationRevision"))) (clojure.core/contains? input "kafkaVersion") (clojure.core/assoc :kafka-version (deser-string (input "kafkaVersion")))))

(clojure.core/defn- deser-string-min-5-max-32 [input] input)

(clojure.core/defn- deser-enhanced-monitoring [input] (clojure.core/get {"DEFAULT" :default, "PER_BROKER" :per-broker, "PER_TOPIC_PER_BROKER" :per-topic-per-broker} input))

(clojure.core/defn- deser-list-of-string [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-zookeeper-node-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "attachedENIId") (clojure.core/assoc :attached-eni-id (deser-string (input "attachedENIId"))) (clojure.core/contains? input "clientVpcIpAddress") (clojure.core/assoc :client-vpc-ip-address (deser-string (input "clientVpcIpAddress"))) (clojure.core/contains? input "zookeeperId") (clojure.core/assoc :zookeeper-id (deser-double (input "zookeeperId"))) (clojure.core/contains? input "zookeeperVersion") (clojure.core/assoc :zookeeper-version (deser-string (input "zookeeperVersion")))))

(clojure.core/defn- deser-cluster-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "currentBrokerSoftwareInfo") (clojure.core/assoc :current-broker-software-info (deser-broker-software-info (input "currentBrokerSoftwareInfo"))) (clojure.core/contains? input "clusterArn") (clojure.core/assoc :cluster-arn (deser-string (input "clusterArn"))) (clojure.core/contains? input "enhancedMonitoring") (clojure.core/assoc :enhanced-monitoring (deser-enhanced-monitoring (input "enhancedMonitoring"))) (clojure.core/contains? input "zookeeperConnectString") (clojure.core/assoc :zookeeper-connect-string (deser-string (input "zookeeperConnectString"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp-iso-8601 (input "creationTime"))) (clojure.core/contains? input "numberOfBrokerNodes") (clojure.core/assoc :number-of-broker-nodes (deser-integer (input "numberOfBrokerNodes"))) (clojure.core/contains? input "currentVersion") (clojure.core/assoc :current-version (deser-string (input "currentVersion"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-cluster-state (input "state"))) (clojure.core/contains? input "clusterName") (clojure.core/assoc :cluster-name (deser-string (input "clusterName"))) (clojure.core/contains? input "encryptionInfo") (clojure.core/assoc :encryption-info (deser-encryption-info (input "encryptionInfo"))) (clojure.core/contains? input "brokerNodeGroupInfo") (clojure.core/assoc :broker-node-group-info (deser-broker-node-group-info (input "brokerNodeGroupInfo")))))

(clojure.core/defn- deser-ebs-storage-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "volumeSize") (clojure.core/assoc :volume-size (deser-integer-min-1-max-16384 (input "volumeSize")))))

(clojure.core/defn- deser-timestamp-iso-8601 [input] input)

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-encryption-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "encryptionAtRest") (clojure.core/assoc :encryption-at-rest (deser-encryption-at-rest (input "encryptionAtRest")))))

(clojure.core/defn- deser-node-type [input] (clojure.core/get {"BROKER" :broker} input))

(clojure.core/defn- deser-broker-node-group-info [input] (clojure.core/cond-> {:client-subnets (deser-list-of-string (input "clientSubnets")), :instance-type (deser-string-min-5-max-32 (input "instanceType"))} (clojure.core/contains? input "brokerAZDistribution") (clojure.core/assoc :broker-az-distribution (deser-broker-az-distribution (input "brokerAZDistribution"))) (clojure.core/contains? input "securityGroups") (clojure.core/assoc :security-groups (deser-list-of-string (input "securityGroups"))) (clojure.core/contains? input "storageInfo") (clojure.core/assoc :storage-info (deser-storage-info (input "storageInfo")))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper261221 input] (clojure.core/let [rawinput261220 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261222 {"invalidParameter" (rawinput261220 "invalidParameter"), "message" (rawinput261220 "message")}] (clojure.core/cond-> {} (letvar261222 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261222 ["invalidParameter"]))) (letvar261222 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261222 ["message"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper261224 input] (clojure.core/let [rawinput261223 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261225 {"invalidParameter" (rawinput261223 "invalidParameter"), "message" (rawinput261223 "message")}] (clojure.core/cond-> {} (letvar261225 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261225 ["invalidParameter"]))) (letvar261225 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261225 ["message"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper261227 input] (clojure.core/let [rawinput261226 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261228 {"invalidParameter" (rawinput261226 "invalidParameter"), "message" (rawinput261226 "message")}] (clojure.core/cond-> {} (letvar261228 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261228 ["invalidParameter"]))) (letvar261228 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261228 ["message"])))))))

(clojure.core/defn- response-list-clusters-response ([input] (response-list-clusters-response nil input)) ([resultWrapper261230 input] (clojure.core/let [rawinput261229 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261231 {"clusterInfoList" (rawinput261229 "clusterInfoList"), "nextToken" (rawinput261229 "nextToken")}] (clojure.core/cond-> {} (letvar261231 "clusterInfoList") (clojure.core/assoc :cluster-info-list (deser-list-of-cluster-info (clojure.core/get-in letvar261231 ["clusterInfoList"]))) (letvar261231 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar261231 ["nextToken"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper261233 input] (clojure.core/let [rawinput261232 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261234 {"invalidParameter" (rawinput261232 "invalidParameter"), "message" (rawinput261232 "message")}] (clojure.core/cond-> {} (letvar261234 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261234 ["invalidParameter"]))) (letvar261234 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261234 ["message"])))))))

(clojure.core/defn- response-describe-cluster-response ([input] (response-describe-cluster-response nil input)) ([resultWrapper261236 input] (clojure.core/let [rawinput261235 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261237 {"clusterInfo" (rawinput261235 "clusterInfo")}] (clojure.core/cond-> {} (letvar261237 "clusterInfo") (clojure.core/assoc :cluster-info (deser-cluster-info (clojure.core/get-in letvar261237 ["clusterInfo"])))))))

(clojure.core/defn- response-get-bootstrap-brokers-response ([input] (response-get-bootstrap-brokers-response nil input)) ([resultWrapper261239 input] (clojure.core/let [rawinput261238 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261240 {"bootstrapBrokerString" (rawinput261238 "bootstrapBrokerString")}] (clojure.core/cond-> {} (letvar261240 "bootstrapBrokerString") (clojure.core/assoc :bootstrap-broker-string (deser-string (clojure.core/get-in letvar261240 ["bootstrapBrokerString"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper261242 input] (clojure.core/let [rawinput261241 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261243 {"invalidParameter" (rawinput261241 "invalidParameter"), "message" (rawinput261241 "message")}] (clojure.core/cond-> {} (letvar261243 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261243 ["invalidParameter"]))) (letvar261243 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261243 ["message"])))))))

(clojure.core/defn- response-delete-cluster-response ([input] (response-delete-cluster-response nil input)) ([resultWrapper261245 input] (clojure.core/let [rawinput261244 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261246 {"clusterArn" (rawinput261244 "clusterArn"), "state" (rawinput261244 "state")}] (clojure.core/cond-> {} (letvar261246 "clusterArn") (clojure.core/assoc :cluster-arn (deser-string (clojure.core/get-in letvar261246 ["clusterArn"]))) (letvar261246 "state") (clojure.core/assoc :state (deser-cluster-state (clojure.core/get-in letvar261246 ["state"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper261248 input] (clojure.core/let [rawinput261247 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261249 {"invalidParameter" (rawinput261247 "invalidParameter"), "message" (rawinput261247 "message")}] (clojure.core/cond-> {} (letvar261249 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261249 ["invalidParameter"]))) (letvar261249 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261249 ["message"])))))))

(clojure.core/defn- response-create-cluster-response ([input] (response-create-cluster-response nil input)) ([resultWrapper261251 input] (clojure.core/let [rawinput261250 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261252 {"clusterArn" (rawinput261250 "clusterArn"), "clusterName" (rawinput261250 "clusterName"), "state" (rawinput261250 "state")}] (clojure.core/cond-> {} (letvar261252 "clusterArn") (clojure.core/assoc :cluster-arn (deser-string (clojure.core/get-in letvar261252 ["clusterArn"]))) (letvar261252 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar261252 ["clusterName"]))) (letvar261252 "state") (clojure.core/assoc :state (deser-cluster-state (clojure.core/get-in letvar261252 ["state"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper261254 input] (clojure.core/let [rawinput261253 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261255 {"invalidParameter" (rawinput261253 "invalidParameter"), "message" (rawinput261253 "message")}] (clojure.core/cond-> {} (letvar261255 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261255 ["invalidParameter"]))) (letvar261255 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261255 ["message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper261257 input] (clojure.core/let [rawinput261256 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261258 {"invalidParameter" (rawinput261256 "invalidParameter"), "message" (rawinput261256 "message")}] (clojure.core/cond-> {} (letvar261258 "invalidParameter") (clojure.core/assoc :invalid-parameter (deser-string (clojure.core/get-in letvar261258 ["invalidParameter"]))) (letvar261258 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar261258 ["message"])))))))

(clojure.core/defn- response-list-nodes-response ([input] (response-list-nodes-response nil input)) ([resultWrapper261260 input] (clojure.core/let [rawinput261259 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar261261 {"nextToken" (rawinput261259 "nextToken"), "nodeInfoList" (rawinput261259 "nodeInfoList")}] (clojure.core/cond-> {} (letvar261261 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar261261 ["nextToken"]))) (letvar261261 "nodeInfoList") (clojure.core/assoc :node-info-list (deser-list-of-node-info (clojure.core/get-in letvar261261 ["nodeInfoList"])))))))

(clojure.spec.alpha/def :portkey.aws.kafka/string-min-1-max-128 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kafka.list-clusters-request/cluster-name-filter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.list-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/list-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.list-clusters-request/cluster-name-filter :portkey.aws.kafka/max-results :portkey.aws.kafka.list-clusters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.kafka.internal-server-error-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.internal-server-error-exception/invalid-parameter :portkey.aws.kafka.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka/integer-min-1-max-15 (clojure.spec.alpha/int-in 1 15))

(clojure.spec.alpha/def :portkey.aws.kafka.unauthorized-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.unauthorized-exception/invalid-parameter :portkey.aws.kafka.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka/list-of-node-info (clojure.spec.alpha/coll-of :portkey.aws.kafka/node-info))

(clojure.spec.alpha/def :portkey.aws.kafka.node-info/added-to-cluster-time (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.node-info/instance-type (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.node-info/node-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/node-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.node-info/added-to-cluster-time :portkey.aws.kafka/broker-node-info :portkey.aws.kafka.node-info/instance-type :portkey.aws.kafka.node-info/node-arn :portkey.aws.kafka/node-type :portkey.aws.kafka/zookeeper-node-info]))

(clojure.spec.alpha/def :portkey.aws.kafka.bad-request-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.bad-request-exception/invalid-parameter :portkey.aws.kafka.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka.delete-cluster-request/cluster-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.delete-cluster-request/current-version (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kafka.delete-cluster-request/cluster-arn] :opt-un [:portkey.aws.kafka.delete-cluster-request/current-version]))

(clojure.spec.alpha/def :portkey.aws.kafka.encryption-at-rest/data-volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/encryption-at-rest (clojure.spec.alpha/keys :req-un [:portkey.aws.kafka.encryption-at-rest/data-volume-kms-key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kafka/integer-min-1-max-16384 (clojure.spec.alpha/int-in 1 16384))

(clojure.spec.alpha/def :portkey.aws.kafka.list-clusters-response/cluster-info-list (clojure.spec.alpha/and :portkey.aws.kafka/list-of-cluster-info))
(clojure.spec.alpha/def :portkey.aws.kafka.list-clusters-response/next-token (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/list-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.list-clusters-response/cluster-info-list :portkey.aws.kafka.list-clusters-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.kafka.forbidden-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.forbidden-exception/invalid-parameter :portkey.aws.kafka.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka.get-bootstrap-brokers-request/cluster-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/get-bootstrap-brokers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kafka.get-bootstrap-brokers-request/cluster-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kafka/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kafka/list-of-cluster-info (clojure.spec.alpha/coll-of :portkey.aws.kafka/cluster-info))

(clojure.spec.alpha/def :portkey.aws.kafka/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-info/attached-eni-id (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-info/broker-id (clojure.spec.alpha/and :portkey.aws.kafka/double))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-info/client-subnet (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-info/client-vpc-ip-address (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-info/current-broker-software-info (clojure.spec.alpha/and :portkey.aws.kafka/broker-software-info))
(clojure.spec.alpha/def :portkey.aws.kafka/broker-node-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.broker-node-info/attached-eni-id :portkey.aws.kafka.broker-node-info/broker-id :portkey.aws.kafka.broker-node-info/client-subnet :portkey.aws.kafka.broker-node-info/client-vpc-ip-address :portkey.aws.kafka.broker-node-info/current-broker-software-info]))

(clojure.spec.alpha/def :portkey.aws.kafka/string-min-1-max-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.kafka/describe-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka/cluster-info]))

(clojure.spec.alpha/def :portkey.aws.kafka.get-bootstrap-brokers-response/bootstrap-broker-string (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/get-bootstrap-brokers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.get-bootstrap-brokers-response/bootstrap-broker-string]))

(clojure.spec.alpha/def :portkey.aws.kafka.describe-cluster-request/cluster-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/describe-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kafka.describe-cluster-request/cluster-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kafka.service-unavailable-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.service-unavailable-exception/invalid-parameter :portkey.aws.kafka.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka.delete-cluster-response/cluster-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.delete-cluster-response/state (clojure.spec.alpha/and :portkey.aws.kafka/cluster-state))
(clojure.spec.alpha/def :portkey.aws.kafka/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.delete-cluster-response/cluster-arn :portkey.aws.kafka.delete-cluster-response/state]))

(clojure.spec.alpha/def :portkey.aws.kafka.too-many-requests-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.too-many-requests-exception/invalid-parameter :portkey.aws.kafka.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka.create-cluster-response/cluster-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.create-cluster-response/cluster-name (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.create-cluster-response/state (clojure.spec.alpha/and :portkey.aws.kafka/cluster-state))
(clojure.spec.alpha/def :portkey.aws.kafka/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.create-cluster-response/cluster-arn :portkey.aws.kafka.create-cluster-response/cluster-name :portkey.aws.kafka.create-cluster-response/state]))

(clojure.spec.alpha/def :portkey.aws.kafka.storage-info/ebs-storage-info (clojure.spec.alpha/and :portkey.aws.kafka/ebs-storage-info))
(clojure.spec.alpha/def :portkey.aws.kafka/storage-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.storage-info/ebs-storage-info]))

(clojure.spec.alpha/def :portkey.aws.kafka/cluster-state #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.kafka/broker-az-distribution #{:default "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.kafka.broker-software-info/configuration-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-software-info/configuration-revision (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-software-info/kafka-version (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/broker-software-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.broker-software-info/configuration-arn :portkey.aws.kafka.broker-software-info/configuration-revision :portkey.aws.kafka.broker-software-info/kafka-version]))

(clojure.spec.alpha/def :portkey.aws.kafka/string-min-5-max-32 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 5 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.kafka/enhanced-monitoring #{:default :per-topic-per-broker :per-broker "PER_TOPIC_PER_BROKER" "DEFAULT" "PER_BROKER"})

(clojure.spec.alpha/def :portkey.aws.kafka/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.kafka/string))

(clojure.spec.alpha/def :portkey.aws.kafka/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.kafka.conflict-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.conflict-exception/invalid-parameter :portkey.aws.kafka.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka.not-found-exception/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.not-found-exception/invalid-parameter :portkey.aws.kafka.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kafka.zookeeper-node-info/attached-eni-id (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.zookeeper-node-info/client-vpc-ip-address (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.zookeeper-node-info/zookeeper-id (clojure.spec.alpha/and :portkey.aws.kafka/double))
(clojure.spec.alpha/def :portkey.aws.kafka.zookeeper-node-info/zookeeper-version (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/zookeeper-node-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.zookeeper-node-info/attached-eni-id :portkey.aws.kafka.zookeeper-node-info/client-vpc-ip-address :portkey.aws.kafka.zookeeper-node-info/zookeeper-id :portkey.aws.kafka.zookeeper-node-info/zookeeper-version]))

(clojure.spec.alpha/def :portkey.aws.kafka.create-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.kafka/string-min-1-max-64))
(clojure.spec.alpha/def :portkey.aws.kafka.create-cluster-request/kafka-version (clojure.spec.alpha/and :portkey.aws.kafka/string-min-1-max-128))
(clojure.spec.alpha/def :portkey.aws.kafka.create-cluster-request/number-of-broker-nodes (clojure.spec.alpha/and :portkey.aws.kafka/integer-min-1-max-15))
(clojure.spec.alpha/def :portkey.aws.kafka/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kafka/broker-node-group-info :portkey.aws.kafka.create-cluster-request/kafka-version :portkey.aws.kafka.create-cluster-request/number-of-broker-nodes :portkey.aws.kafka.create-cluster-request/cluster-name] :opt-un [:portkey.aws.kafka/encryption-info :portkey.aws.kafka/enhanced-monitoring]))

(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/current-broker-software-info (clojure.spec.alpha/and :portkey.aws.kafka/broker-software-info))
(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/cluster-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/zookeeper-connect-string (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/creation-time (clojure.spec.alpha/and :portkey.aws.kafka/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/number-of-broker-nodes (clojure.spec.alpha/and :portkey.aws.kafka/integer))
(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/current-version (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/state (clojure.spec.alpha/and :portkey.aws.kafka/cluster-state))
(clojure.spec.alpha/def :portkey.aws.kafka.cluster-info/cluster-name (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/cluster-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.cluster-info/current-broker-software-info :portkey.aws.kafka.cluster-info/cluster-arn :portkey.aws.kafka/enhanced-monitoring :portkey.aws.kafka.cluster-info/zookeeper-connect-string :portkey.aws.kafka.cluster-info/creation-time :portkey.aws.kafka.cluster-info/number-of-broker-nodes :portkey.aws.kafka.cluster-info/current-version :portkey.aws.kafka.cluster-info/state :portkey.aws.kafka.cluster-info/cluster-name :portkey.aws.kafka/encryption-info :portkey.aws.kafka/broker-node-group-info]))

(clojure.spec.alpha/def :portkey.aws.kafka.ebs-storage-info/volume-size (clojure.spec.alpha/and :portkey.aws.kafka/integer-min-1-max-16384))
(clojure.spec.alpha/def :portkey.aws.kafka/ebs-storage-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.ebs-storage-info/volume-size]))

(clojure.spec.alpha/def :portkey.aws.kafka/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kafka/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.kafka/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.kafka.list-nodes-request/cluster-arn (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.list-nodes-request/next-token (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/list-nodes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kafka.list-nodes-request/cluster-arn] :opt-un [:portkey.aws.kafka/max-results :portkey.aws.kafka.list-nodes-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.kafka.error/invalid-parameter (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.error/message (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka/error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.error/invalid-parameter :portkey.aws.kafka.error/message]))

(clojure.spec.alpha/def :portkey.aws.kafka/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kafka/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kafka/encryption-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka/encryption-at-rest]))

(clojure.spec.alpha/def :portkey.aws.kafka.list-nodes-response/next-token (clojure.spec.alpha/and :portkey.aws.kafka/string))
(clojure.spec.alpha/def :portkey.aws.kafka.list-nodes-response/node-info-list (clojure.spec.alpha/and :portkey.aws.kafka/list-of-node-info))
(clojure.spec.alpha/def :portkey.aws.kafka/list-nodes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kafka.list-nodes-response/next-token :portkey.aws.kafka.list-nodes-response/node-info-list]))

(clojure.spec.alpha/def :portkey.aws.kafka/node-type #{"BROKER" :broker})

(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-group-info/client-subnets (clojure.spec.alpha/and :portkey.aws.kafka/list-of-string))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-group-info/instance-type (clojure.spec.alpha/and :portkey.aws.kafka/string-min-5-max-32))
(clojure.spec.alpha/def :portkey.aws.kafka.broker-node-group-info/security-groups (clojure.spec.alpha/and :portkey.aws.kafka/list-of-string))
(clojure.spec.alpha/def :portkey.aws.kafka/broker-node-group-info (clojure.spec.alpha/keys :req-un [:portkey.aws.kafka.broker-node-group-info/client-subnets :portkey.aws.kafka.broker-node-group-info/instance-type] :opt-un [:portkey.aws.kafka/broker-az-distribution :portkey.aws.kafka.broker-node-group-info/security-groups :portkey.aws.kafka/storage-info]))

(clojure.core/defn create-cluster "Creates a new MSK cluster." ([create-cluster-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kafka/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kafka/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/clusters", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "Kafka", :http.request.spec/input-spec :portkey.aws.kafka/create-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCluster", :http.request.configuration/output-deser-fn response-create-cluster-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.kafka/bad-request-exception, "InternalServerErrorException" :portkey.aws.kafka/internal-server-error-exception, "UnauthorizedException" :portkey.aws.kafka/unauthorized-exception, "ForbiddenException" :portkey.aws.kafka/forbidden-exception, "ServiceUnavailableException" :portkey.aws.kafka/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.kafka/too-many-requests-exception, "ConflictException" :portkey.aws.kafka/conflict-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.kafka/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.kafka/create-cluster-response))

(clojure.core/defn delete-cluster "Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the\nrequest." ([delete-cluster-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kafka/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kafka/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/clusters/{clusterArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "Kafka", :http.request.spec/input-spec :portkey.aws.kafka/delete-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCluster", :http.request.configuration/output-deser-fn response-delete-cluster-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kafka/not-found-exception, "BadRequestException" :portkey.aws.kafka/bad-request-exception, "InternalServerErrorException" :portkey.aws.kafka/internal-server-error-exception, "ForbiddenException" :portkey.aws.kafka/forbidden-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.kafka/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.kafka/delete-cluster-response))

(clojure.core/defn describe-cluster "Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is\nspecified in the request." ([describe-cluster-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-cluster-request describe-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kafka/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kafka/describe-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/clusters/{clusterArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "Kafka", :http.request.spec/input-spec :portkey.aws.kafka/describe-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCluster", :http.request.configuration/output-deser-fn response-describe-cluster-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kafka/not-found-exception, "BadRequestException" :portkey.aws.kafka/bad-request-exception, "UnauthorizedException" :portkey.aws.kafka/unauthorized-exception, "InternalServerErrorException" :portkey.aws.kafka/internal-server-error-exception, "ForbiddenException" :portkey.aws.kafka/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-cluster :args (clojure.spec.alpha/tuple :portkey.aws.kafka/describe-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.kafka/describe-cluster-response))

(clojure.core/defn get-bootstrap-brokers "A list of brokers that a client application can use to bootstrap." ([get-bootstrap-brokers-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-bootstrap-brokers-request get-bootstrap-brokers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kafka/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kafka/get-bootstrap-brokers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/clusters/{clusterArn}/bootstrap-brokers", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "Kafka", :http.request.spec/input-spec :portkey.aws.kafka/get-bootstrap-brokers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBootstrapBrokers", :http.request.configuration/output-deser-fn response-get-bootstrap-brokers-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.kafka/bad-request-exception, "UnauthorizedException" :portkey.aws.kafka/unauthorized-exception, "InternalServerErrorException" :portkey.aws.kafka/internal-server-error-exception, "ConflictException" :portkey.aws.kafka/conflict-exception, "ForbiddenException" :portkey.aws.kafka/forbidden-exception}})))))
(clojure.spec.alpha/fdef get-bootstrap-brokers :args (clojure.spec.alpha/tuple :portkey.aws.kafka/get-bootstrap-brokers-request) :ret (clojure.spec.alpha/and :portkey.aws.kafka/get-bootstrap-brokers-response))

(clojure.core/defn list-clusters "Returns a list of clusters in an account." ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kafka/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kafka/list-clusters-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/clusters", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "Kafka", :http.request.spec/input-spec :portkey.aws.kafka/list-clusters-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListClusters", :http.request.configuration/output-deser-fn response-list-clusters-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.kafka/bad-request-exception, "InternalServerErrorException" :portkey.aws.kafka/internal-server-error-exception, "UnauthorizedException" :portkey.aws.kafka/unauthorized-exception, "ForbiddenException" :portkey.aws.kafka/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.kafka/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.kafka/list-clusters-response))

(clojure.core/defn list-nodes "Returns a list of the broker nodes in the cluster." ([list-nodes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-nodes-request list-nodes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kafka/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kafka/list-nodes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/clusters/{clusterArn}/nodes", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "Kafka", :http.request.spec/input-spec :portkey.aws.kafka/list-nodes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListNodes", :http.request.configuration/output-deser-fn response-list-nodes-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kafka/not-found-exception, "BadRequestException" :portkey.aws.kafka/bad-request-exception, "InternalServerErrorException" :portkey.aws.kafka/internal-server-error-exception, "ForbiddenException" :portkey.aws.kafka/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-nodes :args (clojure.spec.alpha/tuple :portkey.aws.kafka/list-nodes-request) :ret (clojure.spec.alpha/and :portkey.aws.kafka/list-nodes-response))
