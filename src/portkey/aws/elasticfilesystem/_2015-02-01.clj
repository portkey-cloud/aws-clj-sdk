(ns portkey.aws.elasticfilesystem.-2015-02-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "ap-northeast-1"},
    :ssl-common-name "elasticfilesystem.ap-northeast-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "eu-west-1"},
    :ssl-common-name "elasticfilesystem.eu-west-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "elasticfilesystem", :region "us-east-2"},
    :ssl-common-name "elasticfilesystem.us-east-2.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticfilesystem", :region "ap-southeast-2"},
    :ssl-common-name "elasticfilesystem.ap-southeast-2.amazonaws.com",
    :endpoint "https://elasticfilesystem.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "ap-southeast-1"},
    :ssl-common-name "elasticfilesystem.ap-southeast-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticfilesystem", :region "ap-northeast-2"},
    :ssl-common-name "elasticfilesystem.ap-northeast-2.amazonaws.com",
    :endpoint "https://elasticfilesystem.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "eu-central-1"},
    :ssl-common-name "elasticfilesystem.eu-central-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "elasticfilesystem", :region "eu-west-2"},
    :ssl-common-name "elasticfilesystem.eu-west-2.amazonaws.com",
    :endpoint "https://elasticfilesystem.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "us-gov-west-1"},
    :ssl-common-name "elasticfilesystem.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elasticfilesystem", :region "us-west-2"},
    :ssl-common-name "elasticfilesystem.us-west-2.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "us-east-1"},
    :ssl-common-name "elasticfilesystem.us-east-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "us-west-1"},
    :ssl-common-name "elasticfilesystem.us-west-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-throughput-mode)

(clojure.core/declare ser-provisioned-throughput-in-mibps)

(clojure.core/declare ser-security-group)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-security-groups)

(clojure.core/declare ser-encrypted)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-transition-to-ia-rules)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-file-system-id)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-max-items)

(clojure.core/declare ser-ip-address)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-mount-target-id)

(clojure.core/declare ser-lifecycle-policies)

(clojure.core/declare ser-creation-token)

(clojure.core/declare ser-performance-mode)

(clojure.core/declare ser-lifecycle-policy)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-throughput-mode [input] #:http.request.field{:value (clojure.core/get {"bursting" "bursting", :bursting "bursting", "provisioned" "provisioned", :provisioned "provisioned"} input), :shape "ThroughputMode"})

(clojure.core/defn- ser-provisioned-throughput-in-mibps [input] #:http.request.field{:value input, :shape "ProvisionedThroughputInMibps"})

(clojure.core/defn- ser-security-group [input] #:http.request.field{:value input, :shape "SecurityGroup"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group coll) #:http.request.field{:shape "SecurityGroup"}))) input), :shape "SecurityGroups", :type "list", :max 5})

(clojure.core/defn- ser-encrypted [input] #:http.request.field{:value input, :shape "Encrypted"})

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-transition-to-ia-rules [input] #:http.request.field{:value (clojure.core/get {"AFTER_30_DAYS" "AFTER_30_DAYS", :after-30-days "AFTER_30_DAYS"} input), :shape "TransitionToIARules"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-file-system-id [input] #:http.request.field{:value input, :shape "FileSystemId"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-max-items [input] #:http.request.field{:value input, :shape "MaxItems"})

(clojure.core/defn- ser-ip-address [input] #:http.request.field{:value input, :shape "IpAddress"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-mount-target-id [input] #:http.request.field{:value input, :shape "MountTargetId"})

(clojure.core/defn- ser-lifecycle-policies [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lifecycle-policy coll) #:http.request.field{:shape "LifecyclePolicy"}))) input), :shape "LifecyclePolicies", :type "list"})

(clojure.core/defn- ser-creation-token [input] #:http.request.field{:value input, :shape "CreationToken"})

(clojure.core/defn- ser-performance-mode [input] #:http.request.field{:value (clojure.core/get {"generalPurpose" "generalPurpose", :general-purpose "generalPurpose", "maxIO" "maxIO", :max-io "maxIO"} input), :shape "PerformanceMode"})

(clojure.core/defn- ser-lifecycle-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecyclePolicy", :type "structure"} (clojure.core/contains? input :transition-to-ia) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transition-to-ia-rules (input :transition-to-ia)) #:http.request.field{:name "TransitionToIA", :shape "TransitionToIARules"}))))

(clojure.core/defn- req-create-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-creation-token (input :creation-token)) #:http.request.field{:name "CreationToken", :shape "CreationToken"})]} (clojure.core/contains? input :performance-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-performance-mode (input :performance-mode)) #:http.request.field{:name "PerformanceMode", :shape "PerformanceMode"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encrypted (input :encrypted)) #:http.request.field{:name "Encrypted", :shape "Encrypted"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :throughput-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-throughput-mode (input :throughput-mode)) #:http.request.field{:name "ThroughputMode", :shape "ThroughputMode"})) (clojure.core/contains? input :provisioned-throughput-in-mibps) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-throughput-in-mibps (input :provisioned-throughput-in-mibps)) #:http.request.field{:name "ProvisionedThroughputInMibps", :shape "ProvisionedThroughputInMibps"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-describe-file-systems-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "MaxItems"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :creation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-token (input :creation-token)) #:http.request.field{:name "CreationToken", :shape "CreationToken", :location "querystring", :location-name "CreationToken"})) (clojure.core/contains? input :file-system-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "querystring", :location-name "FileSystemId"}))))

(clojure.core/defn- req-delete-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})]}))

(clojure.core/defn- req-create-mount-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId"}) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})]} (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IpAddress", :shape "IpAddress"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"}))))

(clojure.core/defn- req-describe-mount-target-security-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "uri", :location-name "MountTargetId"})]}))

(clojure.core/defn- req-delete-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-update-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})]} (clojure.core/contains? input :throughput-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-throughput-mode (input :throughput-mode)) #:http.request.field{:name "ThroughputMode", :shape "ThroughputMode"})) (clojure.core/contains? input :provisioned-throughput-in-mibps) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-throughput-in-mibps (input :provisioned-throughput-in-mibps)) #:http.request.field{:name "ProvisionedThroughputInMibps", :shape "ProvisionedThroughputInMibps"}))))

(clojure.core/defn- req-describe-lifecycle-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})]}))

(clojure.core/defn- req-create-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})]} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "MaxItems"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "Marker"}))))

(clojure.core/defn- req-put-lifecycle-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})], :body [(clojure.core/into (ser-lifecycle-policies (input :lifecycle-policies)) #:http.request.field{:name "LifecyclePolicies", :shape "LifecyclePolicies"})]}))

(clojure.core/defn- req-delete-mount-target-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "uri", :location-name "MountTargetId"})]}))

(clojure.core/defn- req-describe-mount-targets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "MaxItems"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :file-system-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "querystring", :location-name "FileSystemId"})) (clojure.core/contains? input :mount-target-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "querystring", :location-name "MountTargetId"}))))

(clojure.core/defn- req-modify-mount-target-security-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "uri", :location-name "MountTargetId"})]} (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"}))))

(clojure.core/declare deser-throughput-mode)

(clojure.core/declare deser-provisioned-throughput-in-mibps)

(clojure.core/declare deser-mount-target-count)

(clojure.core/declare deser-security-group)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-security-groups)

(clojure.core/declare deser-life-cycle-state)

(clojure.core/declare deser-encrypted)

(clojure.core/declare deser-file-system-description)

(clojure.core/declare deser-marker)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-network-interface-id)

(clojure.core/declare deser-file-system-nullable-size-value)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-transition-to-ia-rules)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-file-system-id)

(clojure.core/declare deser-aws-account-id)

(clojure.core/declare deser-file-system-size)

(clojure.core/declare deser-kms-key-id)

(clojure.core/declare deser-mount-target-description)

(clojure.core/declare deser-file-system-descriptions)

(clojure.core/declare deser-mount-target-descriptions)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-mount-target-id)

(clojure.core/declare deser-lifecycle-policies)

(clojure.core/declare deser-creation-token)

(clojure.core/declare deser-performance-mode)

(clojure.core/declare deser-lifecycle-policy)

(clojure.core/declare deser-file-system-size-value)

(clojure.core/defn- deser-throughput-mode [input] (clojure.core/get {"bursting" :bursting, "provisioned" :provisioned} input))

(clojure.core/defn- deser-provisioned-throughput-in-mibps [input] input)

(clojure.core/defn- deser-mount-target-count [input] input)

(clojure.core/defn- deser-security-group [input] input)

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group coll))) input))

(clojure.core/defn- deser-life-cycle-state [input] (clojure.core/get {"creating" :creating, "available" :available, "updating" :updating, "deleting" :deleting, "deleted" :deleted} input))

(clojure.core/defn- deser-encrypted [input] input)

(clojure.core/defn- deser-file-system-description [input] (clojure.core/cond-> {:tags (deser-tags (input "Tags")), :creation-token (deser-creation-token (input "CreationToken")), :file-system-id (deser-file-system-id (input "FileSystemId")), :performance-mode (deser-performance-mode (input "PerformanceMode")), :size-in-bytes (deser-file-system-size (input "SizeInBytes")), :number-of-mount-targets (deser-mount-target-count (input "NumberOfMountTargets")), :owner-id (deser-aws-account-id (input "OwnerId")), :creation-time (deser-timestamp (input "CreationTime")), :life-cycle-state (deser-life-cycle-state (input "LifeCycleState"))} (clojure.core/contains? input "ThroughputMode") (clojure.core/assoc :throughput-mode (deser-throughput-mode (input "ThroughputMode"))) (clojure.core/contains? input "ProvisionedThroughputInMibps") (clojure.core/assoc :provisioned-throughput-in-mibps (deser-provisioned-throughput-in-mibps (input "ProvisionedThroughputInMibps"))) (clojure.core/contains? input "Encrypted") (clojure.core/assoc :encrypted (deser-encrypted (input "Encrypted"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-tag-value (input "Name")))))

(clojure.core/defn- deser-marker [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-network-interface-id [input] input)

(clojure.core/defn- deser-file-system-nullable-size-value [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-transition-to-ia-rules [input] (clojure.core/get {"AFTER_30_DAYS" :after-30-days} input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-file-system-id [input] input)

(clojure.core/defn- deser-aws-account-id [input] input)

(clojure.core/defn- deser-file-system-size [input] (clojure.core/cond-> {:value (deser-file-system-size-value (input "Value"))} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "ValueInIA") (clojure.core/assoc :value-in-ia (deser-file-system-nullable-size-value (input "ValueInIA"))) (clojure.core/contains? input "ValueInStandard") (clojure.core/assoc :value-in-standard (deser-file-system-nullable-size-value (input "ValueInStandard")))))

(clojure.core/defn- deser-kms-key-id [input] input)

(clojure.core/defn- deser-mount-target-description [input] (clojure.core/cond-> {:mount-target-id (deser-mount-target-id (input "MountTargetId")), :file-system-id (deser-file-system-id (input "FileSystemId")), :subnet-id (deser-subnet-id (input "SubnetId")), :life-cycle-state (deser-life-cycle-state (input "LifeCycleState"))} (clojure.core/contains? input "OwnerId") (clojure.core/assoc :owner-id (deser-aws-account-id (input "OwnerId"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "IpAddress"))) (clojure.core/contains? input "NetworkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (input "NetworkInterfaceId")))))

(clojure.core/defn- deser-file-system-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-system-description coll))) input))

(clojure.core/defn- deser-mount-target-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mount-target-description coll))) input))

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-mount-target-id [input] input)

(clojure.core/defn- deser-lifecycle-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-policy coll))) input))

(clojure.core/defn- deser-creation-token [input] input)

(clojure.core/defn- deser-performance-mode [input] (clojure.core/get {"generalPurpose" :general-purpose, "maxIO" :max-io} input))

(clojure.core/defn- deser-lifecycle-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "TransitionToIA") (clojure.core/assoc :transition-to-ia (deser-transition-to-ia-rules (input "TransitionToIA")))))

(clojure.core/defn- deser-file-system-size-value [input] input)

(clojure.core/defn- response-unsupported-availability-zone ([input] (response-unsupported-availability-zone nil input)) ([resultWrapper1130493 input] (clojure.core/let [rawinput1130492 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130494 {"ErrorCode" (rawinput1130492 "ErrorCode"), "Message" (rawinput1130492 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130494 ["ErrorCode"]))} (letvar1130494 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130494 ["Message"])))))))

(clojure.core/defn- response-describe-tags-response ([input] (response-describe-tags-response nil input)) ([resultWrapper1130496 input] (clojure.core/let [rawinput1130495 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130497 {"Marker" (rawinput1130495 "Marker"), "Tags" (rawinput1130495 "Tags"), "NextMarker" (rawinput1130495 "NextMarker")}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar1130497 ["Tags"]))} (letvar1130497 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1130497 ["Marker"]))) (letvar1130497 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar1130497 ["NextMarker"])))))))

(clojure.core/defn- response-bad-request ([input] (response-bad-request nil input)) ([resultWrapper1130499 input] (clojure.core/let [rawinput1130498 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130500 {"ErrorCode" (rawinput1130498 "ErrorCode"), "Message" (rawinput1130498 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130500 ["ErrorCode"]))} (letvar1130500 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130500 ["Message"])))))))

(clojure.core/defn- response-lifecycle-configuration-description ([input] (response-lifecycle-configuration-description nil input)) ([resultWrapper1130502 input] (clojure.core/let [rawinput1130501 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130503 {"LifecyclePolicies" (rawinput1130501 "LifecyclePolicies")}] (clojure.core/cond-> {} (letvar1130503 "LifecyclePolicies") (clojure.core/assoc :lifecycle-policies (deser-lifecycle-policies (clojure.core/get-in letvar1130503 ["LifecyclePolicies"])))))))

(clojure.core/defn- response-ip-address-in-use ([input] (response-ip-address-in-use nil input)) ([resultWrapper1130505 input] (clojure.core/let [rawinput1130504 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130506 {"ErrorCode" (rawinput1130504 "ErrorCode"), "Message" (rawinput1130504 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130506 ["ErrorCode"]))} (letvar1130506 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130506 ["Message"])))))))

(clojure.core/defn- response-file-system-limit-exceeded ([input] (response-file-system-limit-exceeded nil input)) ([resultWrapper1130508 input] (clojure.core/let [rawinput1130507 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130509 {"ErrorCode" (rawinput1130507 "ErrorCode"), "Message" (rawinput1130507 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130509 ["ErrorCode"]))} (letvar1130509 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130509 ["Message"])))))))

(clojure.core/defn- response-file-system-description ([input] (response-file-system-description nil input)) ([resultWrapper1130511 input] (clojure.core/let [rawinput1130510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130512 {"ThroughputMode" (rawinput1130510 "ThroughputMode"), "ProvisionedThroughputInMibps" (rawinput1130510 "ProvisionedThroughputInMibps"), "LifeCycleState" (rawinput1130510 "LifeCycleState"), "OwnerId" (rawinput1130510 "OwnerId"), "Encrypted" (rawinput1130510 "Encrypted"), "SizeInBytes" (rawinput1130510 "SizeInBytes"), "Tags" (rawinput1130510 "Tags"), "NumberOfMountTargets" (rawinput1130510 "NumberOfMountTargets"), "FileSystemId" (rawinput1130510 "FileSystemId"), "KmsKeyId" (rawinput1130510 "KmsKeyId"), "CreationTime" (rawinput1130510 "CreationTime"), "Name" (rawinput1130510 "Name"), "CreationToken" (rawinput1130510 "CreationToken"), "PerformanceMode" (rawinput1130510 "PerformanceMode")}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar1130512 ["Tags"])), :creation-token (deser-creation-token (clojure.core/get-in letvar1130512 ["CreationToken"])), :file-system-id (deser-file-system-id (clojure.core/get-in letvar1130512 ["FileSystemId"])), :performance-mode (deser-performance-mode (clojure.core/get-in letvar1130512 ["PerformanceMode"])), :size-in-bytes (deser-file-system-size (clojure.core/get-in letvar1130512 ["SizeInBytes"])), :number-of-mount-targets (deser-mount-target-count (clojure.core/get-in letvar1130512 ["NumberOfMountTargets"])), :owner-id (deser-aws-account-id (clojure.core/get-in letvar1130512 ["OwnerId"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1130512 ["CreationTime"])), :life-cycle-state (deser-life-cycle-state (clojure.core/get-in letvar1130512 ["LifeCycleState"]))} (letvar1130512 "ThroughputMode") (clojure.core/assoc :throughput-mode (deser-throughput-mode (clojure.core/get-in letvar1130512 ["ThroughputMode"]))) (letvar1130512 "ProvisionedThroughputInMibps") (clojure.core/assoc :provisioned-throughput-in-mibps (deser-provisioned-throughput-in-mibps (clojure.core/get-in letvar1130512 ["ProvisionedThroughputInMibps"]))) (letvar1130512 "Encrypted") (clojure.core/assoc :encrypted (deser-encrypted (clojure.core/get-in letvar1130512 ["Encrypted"]))) (letvar1130512 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (clojure.core/get-in letvar1130512 ["KmsKeyId"]))) (letvar1130512 "Name") (clojure.core/assoc :name (deser-tag-value (clojure.core/get-in letvar1130512 ["Name"])))))))

(clojure.core/defn- response-mount-target-conflict ([input] (response-mount-target-conflict nil input)) ([resultWrapper1130514 input] (clojure.core/let [rawinput1130513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130515 {"ErrorCode" (rawinput1130513 "ErrorCode"), "Message" (rawinput1130513 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130515 ["ErrorCode"]))} (letvar1130515 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130515 ["Message"])))))))

(clojure.core/defn- response-describe-file-systems-response ([input] (response-describe-file-systems-response nil input)) ([resultWrapper1130517 input] (clojure.core/let [rawinput1130516 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130518 {"Marker" (rawinput1130516 "Marker"), "FileSystems" (rawinput1130516 "FileSystems"), "NextMarker" (rawinput1130516 "NextMarker")}] (clojure.core/cond-> {} (letvar1130518 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1130518 ["Marker"]))) (letvar1130518 "FileSystems") (clojure.core/assoc :file-systems (deser-file-system-descriptions (clojure.core/get-in letvar1130518 ["FileSystems"]))) (letvar1130518 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar1130518 ["NextMarker"])))))))

(clojure.core/defn- response-security-group-limit-exceeded ([input] (response-security-group-limit-exceeded nil input)) ([resultWrapper1130520 input] (clojure.core/let [rawinput1130519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130521 {"ErrorCode" (rawinput1130519 "ErrorCode"), "Message" (rawinput1130519 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130521 ["ErrorCode"]))} (letvar1130521 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130521 ["Message"])))))))

(clojure.core/defn- response-mount-target-not-found ([input] (response-mount-target-not-found nil input)) ([resultWrapper1130523 input] (clojure.core/let [rawinput1130522 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130524 {"ErrorCode" (rawinput1130522 "ErrorCode"), "Message" (rawinput1130522 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130524 ["ErrorCode"]))} (letvar1130524 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130524 ["Message"])))))))

(clojure.core/defn- response-incorrect-mount-target-state ([input] (response-incorrect-mount-target-state nil input)) ([resultWrapper1130526 input] (clojure.core/let [rawinput1130525 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130527 {"ErrorCode" (rawinput1130525 "ErrorCode"), "Message" (rawinput1130525 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130527 ["ErrorCode"]))} (letvar1130527 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130527 ["Message"])))))))

(clojure.core/defn- response-subnet-not-found ([input] (response-subnet-not-found nil input)) ([resultWrapper1130529 input] (clojure.core/let [rawinput1130528 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130530 {"ErrorCode" (rawinput1130528 "ErrorCode"), "Message" (rawinput1130528 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130530 ["ErrorCode"]))} (letvar1130530 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130530 ["Message"])))))))

(clojure.core/defn- response-describe-mount-targets-response ([input] (response-describe-mount-targets-response nil input)) ([resultWrapper1130532 input] (clojure.core/let [rawinput1130531 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130533 {"Marker" (rawinput1130531 "Marker"), "MountTargets" (rawinput1130531 "MountTargets"), "NextMarker" (rawinput1130531 "NextMarker")}] (clojure.core/cond-> {} (letvar1130533 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1130533 ["Marker"]))) (letvar1130533 "MountTargets") (clojure.core/assoc :mount-targets (deser-mount-target-descriptions (clojure.core/get-in letvar1130533 ["MountTargets"]))) (letvar1130533 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar1130533 ["NextMarker"])))))))

(clojure.core/defn- response-file-system-not-found ([input] (response-file-system-not-found nil input)) ([resultWrapper1130535 input] (clojure.core/let [rawinput1130534 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130536 {"ErrorCode" (rawinput1130534 "ErrorCode"), "Message" (rawinput1130534 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130536 ["ErrorCode"]))} (letvar1130536 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130536 ["Message"])))))))

(clojure.core/defn- response-dependency-timeout ([input] (response-dependency-timeout nil input)) ([resultWrapper1130538 input] (clojure.core/let [rawinput1130537 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130539 {"ErrorCode" (rawinput1130537 "ErrorCode"), "Message" (rawinput1130537 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130539 ["ErrorCode"]))} (letvar1130539 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130539 ["Message"])))))))

(clojure.core/defn- response-describe-mount-target-security-groups-response ([input] (response-describe-mount-target-security-groups-response nil input)) ([resultWrapper1130541 input] (clojure.core/let [rawinput1130540 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130542 {"SecurityGroups" (rawinput1130540 "SecurityGroups")}] (clojure.core/cond-> {:security-groups (deser-security-groups (clojure.core/get-in letvar1130542 ["SecurityGroups"]))}))))

(clojure.core/defn- response-file-system-in-use ([input] (response-file-system-in-use nil input)) ([resultWrapper1130544 input] (clojure.core/let [rawinput1130543 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130545 {"ErrorCode" (rawinput1130543 "ErrorCode"), "Message" (rawinput1130543 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130545 ["ErrorCode"]))} (letvar1130545 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130545 ["Message"])))))))

(clojure.core/defn- response-insufficient-throughput-capacity ([input] (response-insufficient-throughput-capacity nil input)) ([resultWrapper1130547 input] (clojure.core/let [rawinput1130546 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130548 {"ErrorCode" (rawinput1130546 "ErrorCode"), "Message" (rawinput1130546 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130548 ["ErrorCode"]))} (letvar1130548 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130548 ["Message"])))))))

(clojure.core/defn- response-mount-target-description ([input] (response-mount-target-description nil input)) ([resultWrapper1130550 input] (clojure.core/let [rawinput1130549 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130551 {"OwnerId" (rawinput1130549 "OwnerId"), "MountTargetId" (rawinput1130549 "MountTargetId"), "FileSystemId" (rawinput1130549 "FileSystemId"), "SubnetId" (rawinput1130549 "SubnetId"), "LifeCycleState" (rawinput1130549 "LifeCycleState"), "IpAddress" (rawinput1130549 "IpAddress"), "NetworkInterfaceId" (rawinput1130549 "NetworkInterfaceId")}] (clojure.core/cond-> {:mount-target-id (deser-mount-target-id (clojure.core/get-in letvar1130551 ["MountTargetId"])), :file-system-id (deser-file-system-id (clojure.core/get-in letvar1130551 ["FileSystemId"])), :subnet-id (deser-subnet-id (clojure.core/get-in letvar1130551 ["SubnetId"])), :life-cycle-state (deser-life-cycle-state (clojure.core/get-in letvar1130551 ["LifeCycleState"]))} (letvar1130551 "OwnerId") (clojure.core/assoc :owner-id (deser-aws-account-id (clojure.core/get-in letvar1130551 ["OwnerId"]))) (letvar1130551 "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar1130551 ["IpAddress"]))) (letvar1130551 "NetworkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (clojure.core/get-in letvar1130551 ["NetworkInterfaceId"])))))))

(clojure.core/defn- response-file-system-already-exists ([input] (response-file-system-already-exists nil input)) ([resultWrapper1130553 input] (clojure.core/let [rawinput1130552 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130554 {"ErrorCode" (rawinput1130552 "ErrorCode"), "Message" (rawinput1130552 "Message"), "FileSystemId" (rawinput1130552 "FileSystemId")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130554 ["ErrorCode"])), :file-system-id (deser-file-system-id (clojure.core/get-in letvar1130554 ["FileSystemId"]))} (letvar1130554 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130554 ["Message"])))))))

(clojure.core/defn- response-incorrect-file-system-life-cycle-state ([input] (response-incorrect-file-system-life-cycle-state nil input)) ([resultWrapper1130556 input] (clojure.core/let [rawinput1130555 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130557 {"ErrorCode" (rawinput1130555 "ErrorCode"), "Message" (rawinput1130555 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130557 ["ErrorCode"]))} (letvar1130557 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130557 ["Message"])))))))

(clojure.core/defn- response-too-many-requests ([input] (response-too-many-requests nil input)) ([resultWrapper1130559 input] (clojure.core/let [rawinput1130558 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130560 {"ErrorCode" (rawinput1130558 "ErrorCode"), "Message" (rawinput1130558 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130560 ["ErrorCode"]))} (letvar1130560 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130560 ["Message"])))))))

(clojure.core/defn- response-throughput-limit-exceeded ([input] (response-throughput-limit-exceeded nil input)) ([resultWrapper1130562 input] (clojure.core/let [rawinput1130561 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130563 {"ErrorCode" (rawinput1130561 "ErrorCode"), "Message" (rawinput1130561 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130563 ["ErrorCode"]))} (letvar1130563 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130563 ["Message"])))))))

(clojure.core/defn- response-security-group-not-found ([input] (response-security-group-not-found nil input)) ([resultWrapper1130565 input] (clojure.core/let [rawinput1130564 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130566 {"ErrorCode" (rawinput1130564 "ErrorCode"), "Message" (rawinput1130564 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130566 ["ErrorCode"]))} (letvar1130566 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130566 ["Message"])))))))

(clojure.core/defn- response-network-interface-limit-exceeded ([input] (response-network-interface-limit-exceeded nil input)) ([resultWrapper1130568 input] (clojure.core/let [rawinput1130567 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130569 {"ErrorCode" (rawinput1130567 "ErrorCode"), "Message" (rawinput1130567 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130569 ["ErrorCode"]))} (letvar1130569 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130569 ["Message"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1130571 input] (clojure.core/let [rawinput1130570 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130572 {"ErrorCode" (rawinput1130570 "ErrorCode"), "Message" (rawinput1130570 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130572 ["ErrorCode"]))} (letvar1130572 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130572 ["Message"])))))))

(clojure.core/defn- response-no-free-addresses-in-subnet ([input] (response-no-free-addresses-in-subnet nil input)) ([resultWrapper1130574 input] (clojure.core/let [rawinput1130573 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1130575 {"ErrorCode" (rawinput1130573 "ErrorCode"), "Message" (rawinput1130573 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar1130575 ["ErrorCode"]))} (letvar1130575 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1130575 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/tag-key))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/creation-token] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/performance-mode :portkey.aws.elasticfilesystem.-2015-02-01/encrypted :portkey.aws.elasticfilesystem.-2015-02-01/kms-key-id :portkey.aws.elasticfilesystem.-2015-02-01/throughput-mode :portkey.aws.elasticfilesystem.-2015-02-01/provisioned-throughput-in-mibps :portkey.aws.elasticfilesystem.-2015-02-01/tags]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.unsupported-availability-zone/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/unsupported-availability-zone (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.unsupported-availability-zone/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-tags-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/tags] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/marker :portkey.aws.elasticfilesystem.-2015-02-01.describe-tags-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/max-items :portkey.aws.elasticfilesystem.-2015-02-01/marker :portkey.aws.elasticfilesystem.-2015-02-01/creation-token :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/throughput-mode #{:provisioned "bursting" :bursting "provisioned"})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.bad-request/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/bad-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.bad-request/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/provisioned-throughput-in-mibps clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-group (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-policies]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id :portkey.aws.elasticfilesystem.-2015-02-01/subnet-id] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/ip-address :portkey.aws.elasticfilesystem.-2015-02-01/security-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.ip-address-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/ip-address-in-use (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.ip-address-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/security-group :max-count 5))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/life-cycle-state #{:deleted "deleting" :creating :deleting "creating" "deleted" :updating "updating" :available "available"})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/size-in-bytes (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/number-of-mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-count))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/creation-time (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/name (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/owner-id :portkey.aws.elasticfilesystem.-2015-02-01/creation-token :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/creation-time :portkey.aws.elasticfilesystem.-2015-02-01/life-cycle-state :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/number-of-mount-targets :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/size-in-bytes :portkey.aws.elasticfilesystem.-2015-02-01/performance-mode :portkey.aws.elasticfilesystem.-2015-02-01/tags] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/throughput-mode :portkey.aws.elasticfilesystem.-2015-02-01/provisioned-throughput-in-mibps :portkey.aws.elasticfilesystem.-2015-02-01/encrypted :portkey.aws.elasticfilesystem.-2015-02-01/kms-key-id :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/name]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id :portkey.aws.elasticfilesystem.-2015-02-01/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/tag))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.mount-target-conflict/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-conflict (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.mount-target-conflict/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/file-systems (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/marker :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/file-systems :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-nullable-size-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.security-group-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.security-group-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.mount-target-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.mount-target-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/update-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/throughput-mode :portkey.aws.elasticfilesystem.-2015-02-01/provisioned-throughput-in-mibps]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.incorrect-mount-target-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.incorrect-mount-target-state/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.subnet-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/subnet-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.subnet-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__)))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/marker :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/mount-targets :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.dependency-timeout/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/dependency-timeout (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.dependency-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id :portkey.aws.elasticfilesystem.-2015-02-01/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/security-groups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/transition-to-ia-rules #{"AFTER_30_DAYS" :after-30-days})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-in-use (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/aws-account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.insufficient-throughput-capacity/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/insufficient-throughput-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.insufficient-throughput-capacity/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-ia (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-nullable-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-standard (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-nullable-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/timestamp :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-ia :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-standard]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/max-items :portkey.aws.elasticfilesystem.-2015-02-01/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.mount-target-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id :portkey.aws.elasticfilesystem.-2015-02-01/subnet-id :portkey.aws.elasticfilesystem.-2015-02-01/life-cycle-state] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.mount-target-description/owner-id :portkey.aws.elasticfilesystem.-2015-02-01/ip-address :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-id]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-already-exists/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-already-exists (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/put-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/file-system-id :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.incorrect-file-system-life-cycle-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.incorrect-file-system-life-cycle-state/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/max-items (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.too-many-requests/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/too-many-requests (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.too-many-requests/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.throughput-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/throughput-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.throughput-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.security-group-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.security-group-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/max-items :portkey.aws.elasticfilesystem.-2015-02-01/marker :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.tag/key (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.tag/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01.tag/key :portkey.aws.elasticfilesystem.-2015-02-01.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.network-interface-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.network-interface-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-policy))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/creation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/performance-mode #{"generalPurpose" :max-io :general-purpose "maxIO"})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.lifecycle-policy/transition-to-ia (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/transition-to-ia-rules))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.lifecycle-policy/transition-to-ia]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.no-free-addresses-in-subnet/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/no-free-addresses-in-subnet (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.no-free-addresses-in-subnet/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/security-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size-value clojure.core/int?)

(clojure.core/defn describe-mount-target-security-groups ([describe-mount-target-security-groups-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-mount-target-security-groups-request describe-mount-target-security-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}/security-groups", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMountTargetSecurityGroups", :http.request.configuration/output-deser-fn response-describe-mount-target-security-groups-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state}})))))
(clojure.spec.alpha/fdef describe-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response))

(clojure.core/defn describe-file-systems ([] (describe-file-systems {})) ([describe-file-systems-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-file-systems-request describe-file-systems-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFileSystems", :http.request.configuration/output-deser-fn response-describe-file-systems-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-file-systems :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response))

(clojure.core/defn modify-mount-target-security-groups ([modify-mount-target-security-groups-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-modify-mount-target-security-groups-request modify-mount-target-security-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}/security-groups", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyMountTargetSecurityGroups", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found}})))))
(clojure.spec.alpha/fdef modify-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request) :ret clojure.core/true?)

(clojure.core/defn delete-tags ([delete-tags-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/delete-tags/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-tags ([create-tags-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/create-tags/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-mount-target ([create-mount-target-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-mount-target-request create-mount-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMountTarget", :http.request.configuration/output-deser-fn response-mount-target-description, :http.request.spec/error-spec {"UnsupportedAvailabilityZone" :portkey.aws.elasticfilesystem.-2015-02-01/unsupported-availability-zone, "BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "IpAddressInUse" :portkey.aws.elasticfilesystem.-2015-02-01/ip-address-in-use, "MountTargetConflict" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-conflict, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded, "SubnetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/subnet-not-found, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found, "NetworkInterfaceLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-limit-exceeded, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "NoFreeAddressesInSubnet" :portkey.aws.elasticfilesystem.-2015-02-01/no-free-addresses-in-subnet}})))))
(clojure.spec.alpha/fdef create-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description))

(clojure.core/defn put-lifecycle-configuration ([put-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-lifecycle-configuration-request put-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}/lifecycle-configuration", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/put-lifecycle-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLifecycleConfiguration", :http.request.configuration/output-deser-fn response-lifecycle-configuration-description, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state}})))))
(clojure.spec.alpha/fdef put-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/put-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description))

(clojure.core/defn create-file-system ([create-file-system-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-file-system-request create-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFileSystem", :http.request.configuration/output-deser-fn response-file-system-description, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemAlreadyExists" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-already-exists, "FileSystemLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-limit-exceeded, "InsufficientThroughputCapacity" :portkey.aws.elasticfilesystem.-2015-02-01/insufficient-throughput-capacity, "ThroughputLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/throughput-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description))

(clojure.core/defn describe-tags ([describe-tags-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/tags/{FileSystemId}/", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response))

(clojure.core/defn describe-mount-targets ([] (describe-mount-targets {})) ([describe-mount-targets-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-mount-targets-request describe-mount-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMountTargets", :http.request.configuration/output-deser-fn response-describe-mount-targets-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found}})))))
(clojure.spec.alpha/fdef describe-mount-targets :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response))

(clojure.core/defn update-file-system ([update-file-system-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-file-system-request update-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/update-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFileSystem", :http.request.configuration/output-deser-fn response-file-system-description, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state, "InsufficientThroughputCapacity" :portkey.aws.elasticfilesystem.-2015-02-01/insufficient-throughput-capacity, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "ThroughputLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/throughput-limit-exceeded, "TooManyRequests" :portkey.aws.elasticfilesystem.-2015-02-01/too-many-requests}})))))
(clojure.spec.alpha/fdef update-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/update-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description))

(clojure.core/defn delete-mount-target ([delete-mount-target-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-mount-target-request delete-mount-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMountTarget", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "DependencyTimeout" :portkey.aws.elasticfilesystem.-2015-02-01/dependency-timeout, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found}})))))
(clojure.spec.alpha/fdef delete-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request) :ret clojure.core/true?)

(clojure.core/defn delete-file-system ([delete-file-system-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-file-system-request delete-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFileSystem", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "FileSystemInUse" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-in-use}})))))
(clojure.spec.alpha/fdef delete-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request) :ret clojure.core/true?)

(clojure.core/defn describe-lifecycle-configuration ([describe-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-lifecycle-configuration-request describe-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}/lifecycle-configuration", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-lifecycle-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLifecycleConfiguration", :http.request.configuration/output-deser-fn response-lifecycle-configuration-description, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description))
