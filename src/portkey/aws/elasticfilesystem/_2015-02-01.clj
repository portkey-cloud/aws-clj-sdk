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

(clojure.core/defn- response-unsupported-availability-zone ([input] (response-unsupported-availability-zone nil input)) ([resultWrapper864610 input] (clojure.core/let [rawinput864609 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864611 {"ErrorCode" (rawinput864609 "ErrorCode"), "Message" (rawinput864609 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864611 ["ErrorCode"]))} (letvar864611 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864611 ["Message"])))))))

(clojure.core/defn- response-describe-tags-response ([input] (response-describe-tags-response nil input)) ([resultWrapper864613 input] (clojure.core/let [rawinput864612 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864614 {"Marker" (rawinput864612 "Marker"), "Tags" (rawinput864612 "Tags"), "NextMarker" (rawinput864612 "NextMarker")}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar864614 ["Tags"]))} (letvar864614 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar864614 ["Marker"]))) (letvar864614 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar864614 ["NextMarker"])))))))

(clojure.core/defn- response-bad-request ([input] (response-bad-request nil input)) ([resultWrapper864616 input] (clojure.core/let [rawinput864615 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864617 {"ErrorCode" (rawinput864615 "ErrorCode"), "Message" (rawinput864615 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864617 ["ErrorCode"]))} (letvar864617 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864617 ["Message"])))))))

(clojure.core/defn- response-lifecycle-configuration-description ([input] (response-lifecycle-configuration-description nil input)) ([resultWrapper864619 input] (clojure.core/let [rawinput864618 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864620 {"LifecyclePolicies" (rawinput864618 "LifecyclePolicies")}] (clojure.core/cond-> {} (letvar864620 "LifecyclePolicies") (clojure.core/assoc :lifecycle-policies (deser-lifecycle-policies (clojure.core/get-in letvar864620 ["LifecyclePolicies"])))))))

(clojure.core/defn- response-ip-address-in-use ([input] (response-ip-address-in-use nil input)) ([resultWrapper864622 input] (clojure.core/let [rawinput864621 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864623 {"ErrorCode" (rawinput864621 "ErrorCode"), "Message" (rawinput864621 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864623 ["ErrorCode"]))} (letvar864623 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864623 ["Message"])))))))

(clojure.core/defn- response-file-system-limit-exceeded ([input] (response-file-system-limit-exceeded nil input)) ([resultWrapper864625 input] (clojure.core/let [rawinput864624 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864626 {"ErrorCode" (rawinput864624 "ErrorCode"), "Message" (rawinput864624 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864626 ["ErrorCode"]))} (letvar864626 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864626 ["Message"])))))))

(clojure.core/defn- response-file-system-description ([input] (response-file-system-description nil input)) ([resultWrapper864628 input] (clojure.core/let [rawinput864627 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864629 {"ThroughputMode" (rawinput864627 "ThroughputMode"), "ProvisionedThroughputInMibps" (rawinput864627 "ProvisionedThroughputInMibps"), "LifeCycleState" (rawinput864627 "LifeCycleState"), "OwnerId" (rawinput864627 "OwnerId"), "Encrypted" (rawinput864627 "Encrypted"), "SizeInBytes" (rawinput864627 "SizeInBytes"), "Tags" (rawinput864627 "Tags"), "NumberOfMountTargets" (rawinput864627 "NumberOfMountTargets"), "FileSystemId" (rawinput864627 "FileSystemId"), "KmsKeyId" (rawinput864627 "KmsKeyId"), "CreationTime" (rawinput864627 "CreationTime"), "Name" (rawinput864627 "Name"), "CreationToken" (rawinput864627 "CreationToken"), "PerformanceMode" (rawinput864627 "PerformanceMode")}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar864629 ["Tags"])), :creation-token (deser-creation-token (clojure.core/get-in letvar864629 ["CreationToken"])), :file-system-id (deser-file-system-id (clojure.core/get-in letvar864629 ["FileSystemId"])), :performance-mode (deser-performance-mode (clojure.core/get-in letvar864629 ["PerformanceMode"])), :size-in-bytes (deser-file-system-size (clojure.core/get-in letvar864629 ["SizeInBytes"])), :number-of-mount-targets (deser-mount-target-count (clojure.core/get-in letvar864629 ["NumberOfMountTargets"])), :owner-id (deser-aws-account-id (clojure.core/get-in letvar864629 ["OwnerId"])), :creation-time (deser-timestamp (clojure.core/get-in letvar864629 ["CreationTime"])), :life-cycle-state (deser-life-cycle-state (clojure.core/get-in letvar864629 ["LifeCycleState"]))} (letvar864629 "ThroughputMode") (clojure.core/assoc :throughput-mode (deser-throughput-mode (clojure.core/get-in letvar864629 ["ThroughputMode"]))) (letvar864629 "ProvisionedThroughputInMibps") (clojure.core/assoc :provisioned-throughput-in-mibps (deser-provisioned-throughput-in-mibps (clojure.core/get-in letvar864629 ["ProvisionedThroughputInMibps"]))) (letvar864629 "Encrypted") (clojure.core/assoc :encrypted (deser-encrypted (clojure.core/get-in letvar864629 ["Encrypted"]))) (letvar864629 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (clojure.core/get-in letvar864629 ["KmsKeyId"]))) (letvar864629 "Name") (clojure.core/assoc :name (deser-tag-value (clojure.core/get-in letvar864629 ["Name"])))))))

(clojure.core/defn- response-mount-target-conflict ([input] (response-mount-target-conflict nil input)) ([resultWrapper864631 input] (clojure.core/let [rawinput864630 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864632 {"ErrorCode" (rawinput864630 "ErrorCode"), "Message" (rawinput864630 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864632 ["ErrorCode"]))} (letvar864632 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864632 ["Message"])))))))

(clojure.core/defn- response-describe-file-systems-response ([input] (response-describe-file-systems-response nil input)) ([resultWrapper864634 input] (clojure.core/let [rawinput864633 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864635 {"Marker" (rawinput864633 "Marker"), "FileSystems" (rawinput864633 "FileSystems"), "NextMarker" (rawinput864633 "NextMarker")}] (clojure.core/cond-> {} (letvar864635 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar864635 ["Marker"]))) (letvar864635 "FileSystems") (clojure.core/assoc :file-systems (deser-file-system-descriptions (clojure.core/get-in letvar864635 ["FileSystems"]))) (letvar864635 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar864635 ["NextMarker"])))))))

(clojure.core/defn- response-security-group-limit-exceeded ([input] (response-security-group-limit-exceeded nil input)) ([resultWrapper864637 input] (clojure.core/let [rawinput864636 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864638 {"ErrorCode" (rawinput864636 "ErrorCode"), "Message" (rawinput864636 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864638 ["ErrorCode"]))} (letvar864638 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864638 ["Message"])))))))

(clojure.core/defn- response-mount-target-not-found ([input] (response-mount-target-not-found nil input)) ([resultWrapper864640 input] (clojure.core/let [rawinput864639 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864641 {"ErrorCode" (rawinput864639 "ErrorCode"), "Message" (rawinput864639 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864641 ["ErrorCode"]))} (letvar864641 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864641 ["Message"])))))))

(clojure.core/defn- response-incorrect-mount-target-state ([input] (response-incorrect-mount-target-state nil input)) ([resultWrapper864643 input] (clojure.core/let [rawinput864642 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864644 {"ErrorCode" (rawinput864642 "ErrorCode"), "Message" (rawinput864642 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864644 ["ErrorCode"]))} (letvar864644 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864644 ["Message"])))))))

(clojure.core/defn- response-subnet-not-found ([input] (response-subnet-not-found nil input)) ([resultWrapper864646 input] (clojure.core/let [rawinput864645 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864647 {"ErrorCode" (rawinput864645 "ErrorCode"), "Message" (rawinput864645 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864647 ["ErrorCode"]))} (letvar864647 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864647 ["Message"])))))))

(clojure.core/defn- response-describe-mount-targets-response ([input] (response-describe-mount-targets-response nil input)) ([resultWrapper864649 input] (clojure.core/let [rawinput864648 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864650 {"Marker" (rawinput864648 "Marker"), "MountTargets" (rawinput864648 "MountTargets"), "NextMarker" (rawinput864648 "NextMarker")}] (clojure.core/cond-> {} (letvar864650 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar864650 ["Marker"]))) (letvar864650 "MountTargets") (clojure.core/assoc :mount-targets (deser-mount-target-descriptions (clojure.core/get-in letvar864650 ["MountTargets"]))) (letvar864650 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar864650 ["NextMarker"])))))))

(clojure.core/defn- response-file-system-not-found ([input] (response-file-system-not-found nil input)) ([resultWrapper864652 input] (clojure.core/let [rawinput864651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864653 {"ErrorCode" (rawinput864651 "ErrorCode"), "Message" (rawinput864651 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864653 ["ErrorCode"]))} (letvar864653 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864653 ["Message"])))))))

(clojure.core/defn- response-dependency-timeout ([input] (response-dependency-timeout nil input)) ([resultWrapper864655 input] (clojure.core/let [rawinput864654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864656 {"ErrorCode" (rawinput864654 "ErrorCode"), "Message" (rawinput864654 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864656 ["ErrorCode"]))} (letvar864656 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864656 ["Message"])))))))

(clojure.core/defn- response-describe-mount-target-security-groups-response ([input] (response-describe-mount-target-security-groups-response nil input)) ([resultWrapper864658 input] (clojure.core/let [rawinput864657 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864659 {"SecurityGroups" (rawinput864657 "SecurityGroups")}] (clojure.core/cond-> {:security-groups (deser-security-groups (clojure.core/get-in letvar864659 ["SecurityGroups"]))}))))

(clojure.core/defn- response-file-system-in-use ([input] (response-file-system-in-use nil input)) ([resultWrapper864661 input] (clojure.core/let [rawinput864660 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864662 {"ErrorCode" (rawinput864660 "ErrorCode"), "Message" (rawinput864660 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864662 ["ErrorCode"]))} (letvar864662 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864662 ["Message"])))))))

(clojure.core/defn- response-insufficient-throughput-capacity ([input] (response-insufficient-throughput-capacity nil input)) ([resultWrapper864664 input] (clojure.core/let [rawinput864663 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864665 {"ErrorCode" (rawinput864663 "ErrorCode"), "Message" (rawinput864663 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864665 ["ErrorCode"]))} (letvar864665 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864665 ["Message"])))))))

(clojure.core/defn- response-mount-target-description ([input] (response-mount-target-description nil input)) ([resultWrapper864667 input] (clojure.core/let [rawinput864666 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864668 {"OwnerId" (rawinput864666 "OwnerId"), "MountTargetId" (rawinput864666 "MountTargetId"), "FileSystemId" (rawinput864666 "FileSystemId"), "SubnetId" (rawinput864666 "SubnetId"), "LifeCycleState" (rawinput864666 "LifeCycleState"), "IpAddress" (rawinput864666 "IpAddress"), "NetworkInterfaceId" (rawinput864666 "NetworkInterfaceId")}] (clojure.core/cond-> {:mount-target-id (deser-mount-target-id (clojure.core/get-in letvar864668 ["MountTargetId"])), :file-system-id (deser-file-system-id (clojure.core/get-in letvar864668 ["FileSystemId"])), :subnet-id (deser-subnet-id (clojure.core/get-in letvar864668 ["SubnetId"])), :life-cycle-state (deser-life-cycle-state (clojure.core/get-in letvar864668 ["LifeCycleState"]))} (letvar864668 "OwnerId") (clojure.core/assoc :owner-id (deser-aws-account-id (clojure.core/get-in letvar864668 ["OwnerId"]))) (letvar864668 "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar864668 ["IpAddress"]))) (letvar864668 "NetworkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (clojure.core/get-in letvar864668 ["NetworkInterfaceId"])))))))

(clojure.core/defn- response-file-system-already-exists ([input] (response-file-system-already-exists nil input)) ([resultWrapper864670 input] (clojure.core/let [rawinput864669 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864671 {"ErrorCode" (rawinput864669 "ErrorCode"), "Message" (rawinput864669 "Message"), "FileSystemId" (rawinput864669 "FileSystemId")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864671 ["ErrorCode"])), :file-system-id (deser-file-system-id (clojure.core/get-in letvar864671 ["FileSystemId"]))} (letvar864671 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864671 ["Message"])))))))

(clojure.core/defn- response-incorrect-file-system-life-cycle-state ([input] (response-incorrect-file-system-life-cycle-state nil input)) ([resultWrapper864673 input] (clojure.core/let [rawinput864672 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864674 {"ErrorCode" (rawinput864672 "ErrorCode"), "Message" (rawinput864672 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864674 ["ErrorCode"]))} (letvar864674 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864674 ["Message"])))))))

(clojure.core/defn- response-too-many-requests ([input] (response-too-many-requests nil input)) ([resultWrapper864676 input] (clojure.core/let [rawinput864675 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864677 {"ErrorCode" (rawinput864675 "ErrorCode"), "Message" (rawinput864675 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864677 ["ErrorCode"]))} (letvar864677 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864677 ["Message"])))))))

(clojure.core/defn- response-throughput-limit-exceeded ([input] (response-throughput-limit-exceeded nil input)) ([resultWrapper864679 input] (clojure.core/let [rawinput864678 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864680 {"ErrorCode" (rawinput864678 "ErrorCode"), "Message" (rawinput864678 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864680 ["ErrorCode"]))} (letvar864680 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864680 ["Message"])))))))

(clojure.core/defn- response-security-group-not-found ([input] (response-security-group-not-found nil input)) ([resultWrapper864682 input] (clojure.core/let [rawinput864681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864683 {"ErrorCode" (rawinput864681 "ErrorCode"), "Message" (rawinput864681 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864683 ["ErrorCode"]))} (letvar864683 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864683 ["Message"])))))))

(clojure.core/defn- response-network-interface-limit-exceeded ([input] (response-network-interface-limit-exceeded nil input)) ([resultWrapper864685 input] (clojure.core/let [rawinput864684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864686 {"ErrorCode" (rawinput864684 "ErrorCode"), "Message" (rawinput864684 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864686 ["ErrorCode"]))} (letvar864686 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864686 ["Message"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper864688 input] (clojure.core/let [rawinput864687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864689 {"ErrorCode" (rawinput864687 "ErrorCode"), "Message" (rawinput864687 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864689 ["ErrorCode"]))} (letvar864689 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864689 ["Message"])))))))

(clojure.core/defn- response-no-free-addresses-in-subnet ([input] (response-no-free-addresses-in-subnet nil input)) ([resultWrapper864691 input] (clojure.core/let [rawinput864690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar864692 {"ErrorCode" (rawinput864690 "ErrorCode"), "Message" (rawinput864690 "Message")}] (clojure.core/cond-> {:error-code (deser-error-code (clojure.core/get-in letvar864692 ["ErrorCode"]))} (letvar864692 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar864692 ["Message"])))))))

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

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

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

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

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

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/aws-account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.insufficient-throughput-capacity/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/insufficient-throughput-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.insufficient-throughput-capacity/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-ia (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-nullable-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-standard (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-nullable-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/timestamp :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-ia :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value-in-standard]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

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

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/creation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/performance-mode #{"generalPurpose" :max-io :general-purpose "maxIO"})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.lifecycle-policy/transition-to-ia (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/transition-to-ia-rules))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.lifecycle-policy/transition-to-ia]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.no-free-addresses-in-subnet/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/no-free-addresses-in-subnet (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/error-code] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.no-free-addresses-in-subnet/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/security-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size-value clojure.core/int?)

(clojure.core/defn describe-mount-target-security-groups "Returns the security groups currently in effect for a mount target. This\noperation requires that the network interface of the mount target has been\ncreated and the lifecycle state of the mount target is not deleted.\n This operation requires permissions for the following actions:\n * elasticfilesystem:DescribeMountTargetSecurityGroups action on the mount\ntarget's file system.\n * ec2:DescribeNetworkInterfaceAttribute action on the mount target's network\ninterface." ([describe-mount-target-security-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-mount-target-security-groups-request describe-mount-target-security-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}/security-groups", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMountTargetSecurityGroups", :http.request.configuration/output-deser-fn response-describe-mount-target-security-groups-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state}})))))
(clojure.spec.alpha/fdef describe-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response))

(clojure.core/defn describe-file-systems "Returns the description of a specific Amazon EFS file system if either the file\nsystem CreationToken or the FileSystemId is provided. Otherwise, it returns\ndescriptions of all file systems owned by the caller's AWS account in the AWS\nRegion of the endpoint that you're calling.\n When retrieving all file system descriptions, you can optionally specify the\nMaxItems parameter to limit the number of descriptions in a response. Currently,\nthis number is automatically set to 10. If more file system descriptions remain,\nAmazon EFS returns a NextMarker, an opaque token, in the response. In this case,\nyou should send a subsequent request with the Marker request parameter set to\nthe value of NextMarker.\n To retrieve a list of your file system descriptions, this operation is used in\nan iterative process, where DescribeFileSystems is called first without the\nMarker and then the operation continues to call it with the Marker parameter set\nto the value of the NextMarker from the previous response until the response has\nno NextMarker.\n The order of file systems returned in the response of one DescribeFileSystems\ncall and the order of file systems returned across the responses of a multi-call\niteration is unspecified.\n This operation requires permissions for the\nelasticfilesystem:DescribeFileSystems action." ([] (describe-file-systems {})) ([describe-file-systems-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-file-systems-request describe-file-systems-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFileSystems", :http.request.configuration/output-deser-fn response-describe-file-systems-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-file-systems :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response))

(clojure.core/defn modify-mount-target-security-groups "Modifies the set of security groups in effect for a mount target.\n When you create a mount target, Amazon EFS also creates a new network\ninterface. For more information, see CreateMountTarget. This operation replaces\nthe security groups in effect for the network interface associated with a mount\ntarget, with the SecurityGroups provided in the request. This operation requires\nthat the network interface of the mount target has been created and the\nlifecycle state of the mount target is not deleted.\n The operation requires permissions for the following actions:\n * elasticfilesystem:ModifyMountTargetSecurityGroups action on the mount\ntarget's file system.\n * ec2:ModifyNetworkInterfaceAttribute action on the mount target's network\ninterface." ([modify-mount-target-security-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-modify-mount-target-security-groups-request modify-mount-target-security-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}/security-groups", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyMountTargetSecurityGroups", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found}})))))
(clojure.spec.alpha/fdef modify-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request) :ret clojure.core/true?)

(clojure.core/defn delete-tags "Deletes the specified tags from a file system. If the DeleteTags request\nincludes a tag key that doesn't exist, Amazon EFS ignores it and doesn't cause\nan error. For more information about tags and related restrictions, see Tag\nRestrictions\n(https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)\nin the AWS Billing and Cost Management User Guide.\n This operation requires permissions for the elasticfilesystem:DeleteTags\naction." ([delete-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/delete-tags/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-tags "Creates or overwrites tags associated with a file system. Each tag is a\nkey-value pair. If a tag key specified in the request already exists on the file\nsystem, this operation overwrites its value with the value provided in the\nrequest. If you add the Name tag to your file system, Amazon EFS returns it in\nthe response to the DescribeFileSystems operation.\n This operation requires permission for the elasticfilesystem:CreateTags action." ([create-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/create-tags/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-mount-target "Creates a mount target for a file system. You can then mount the file system on\nEC2 instances by using the mount target.\n You can create one mount target in each Availability Zone in your VPC. All EC2\ninstances in a VPC within a given Availability Zone share a single mount target\nfor a given file system. If you have multiple subnets in an Availability Zone,\nyou create a mount target in one of the subnets. EC2 instances do not need to be\nin the same subnet as the mount target in order to access their file system. For\nmore information, see Amazon EFS: How it Works\n(https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html).\n In the request, you also specify a file system ID for which you are creating\nthe mount target and the file system's lifecycle state must be available. For\nmore information, see DescribeFileSystems.\n In the request, you also provide a subnet ID, which determines the following:\n * VPC in which Amazon EFS creates the mount target\n * Availability Zone in which Amazon EFS creates the mount target\n * IP address range from which Amazon EFS selects the IP address of the mount\ntarget (if you don't specify an IP address in the request)\n After creating the mount target, Amazon EFS returns a response that includes, a\nMountTargetId and an IpAddress. You use this IP address when mounting the file\nsystem in an EC2 instance. You can also use the mount target's DNS name when\nmounting the file system. The EC2 instance on which you mount the file system by\nusing the mount target can resolve the mount target's DNS name to its IP\naddress. For more information, see How it Works: Implementation Overview\n(https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation).\n Note that you can create mount targets for a file system in only one VPC, and\nthere can be only one mount target per Availability Zone. That is, if the file\nsystem already has one or more mount targets created for it, the subnet\nspecified in the request to add another mount target must meet the following\nrequirements:\n * Must belong to the same VPC as the subnets of the existing mount targets\n * Must not be in the same Availability Zone as any of the subnets of the\nexisting mount targets\n If the request satisfies the requirements, Amazon EFS does the following:\n * Creates a new mount target in the specified subnet.\n * Also creates a new network interface in the subnet as follows:\n * If the request provides an IpAddress, Amazon EFS assigns that IP address to\nthe network interface. Otherwise, Amazon EFS assigns a free address in the\nsubnet (in the same way that the Amazon EC2 CreateNetworkInterface call does\nwhen a request does not specify a primary private IP address).\n * If the request provides SecurityGroups, this network interface is associated\nwith those security groups. Otherwise, it belongs to the default security group\nfor the subnet's VPC.\n * Assigns the description Mount target fsmt-id for file system fs-id where\nfsmt-id is the mount target ID, and fs-id is the FileSystemId.\n * Sets the requesterManaged property of the network interface to true, and the\nrequesterId value to EFS.\n Each Amazon EFS mount target has one corresponding requester-managed EC2\nnetwork interface. After the network interface is created, Amazon EFS sets the\nNetworkInterfaceId field in the mount target's description to the network\ninterface ID, and the IpAddress field to its address. If network interface\ncreation fails, the entire CreateMountTarget operation fails.\n The CreateMountTarget call returns only after creating the network interface,\nbut while the mount target state is still creating, you can check the mount\ntarget creation status by calling the DescribeMountTargets operation, which\namong other things returns the mount target state.\n We recommend that you create a mount target in each of the Availability Zones.\nThere are cost considerations for using a file system in an Availability Zone\nthrough a mount target created in another Availability Zone. For more\ninformation, see Amazon EFS (http://aws.amazon.com/efs/). In addition, by always\nusing a mount target local to the instance's Availability Zone, you eliminate a\npartial failure scenario. If the Availability Zone in which your mount target is\ncreated goes down, then you can't access your file system through that mount\ntarget.\n This operation requires permissions for the following action on the file\nsystem:\n * elasticfilesystem:CreateMountTarget\n This operation also requires permissions for the following Amazon EC2 actions:\n * ec2:DescribeSubnets\n * ec2:DescribeNetworkInterfaces\n * ec2:CreateNetworkInterface" ([create-mount-target-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-mount-target-request create-mount-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMountTarget", :http.request.configuration/output-deser-fn response-mount-target-description, :http.request.spec/error-spec {"UnsupportedAvailabilityZone" :portkey.aws.elasticfilesystem.-2015-02-01/unsupported-availability-zone, "BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "IpAddressInUse" :portkey.aws.elasticfilesystem.-2015-02-01/ip-address-in-use, "MountTargetConflict" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-conflict, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded, "SubnetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/subnet-not-found, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found, "NetworkInterfaceLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-limit-exceeded, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "NoFreeAddressesInSubnet" :portkey.aws.elasticfilesystem.-2015-02-01/no-free-addresses-in-subnet}})))))
(clojure.spec.alpha/fdef create-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description))

(clojure.core/defn put-lifecycle-configuration "Enables lifecycle management by creating a new LifecycleConfiguration object. A\nLifecycleConfiguration object defines when files in an Amazon EFS file system\nare automatically transitioned to the lower-cost EFS Infrequent Access (IA)\nstorage class. A LifecycleConfiguration applies to all files in a file system.\n Each Amazon EFS file system supports one lifecycle configuration, which applies\nto all files in the file system. If a LifecycleConfiguration object already\nexists for the specified file system, a PutLifecycleConfiguration call modifies\nthe existing configuration. A PutLifecycleConfiguration call with an empty\nLifecyclePolicies array in the request body deletes any existing\nLifecycleConfiguration and disables lifecycle management.\n You can enable lifecycle management only for EFS file systems created after the\nrelease of EFS infrequent access.\n In the request, specify the following:\n * The ID for the file system for which you are creating a lifecycle management\nconfiguration.\n * A LifecyclePolicies array of LifecyclePolicy objects that define when files\nare moved to the IA storage class. The array can contain only one\n\"TransitionToIA\": \"AFTER_30_DAYS\" LifecyclePolicy item.\n This operation requires permissions for the\nelasticfilesystem:PutLifecycleConfiguration operation.\n To apply a LifecycleConfiguration object to an encrypted file system, you need\nthe same AWS Key Management Service (AWS KMS) permissions as when you created\nthe encrypted file system." ([put-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-lifecycle-configuration-request put-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}/lifecycle-configuration", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/put-lifecycle-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLifecycleConfiguration", :http.request.configuration/output-deser-fn response-lifecycle-configuration-description, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state}})))))
(clojure.spec.alpha/fdef put-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/put-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description))

(clojure.core/defn create-file-system "Creates a new, empty file system. The operation requires a creation token in the\nrequest that Amazon EFS uses to ensure idempotent creation (calling the\noperation with same creation token has no effect). If a file system does not\ncurrently exist that is owned by the caller's AWS account with the specified\ncreation token, this operation does the following:\n * Creates a new, empty file system. The file system will have an Amazon EFS\nassigned ID, and an initial lifecycle state creating.\n * Returns with the description of the created file system.\n Otherwise, this operation returns a FileSystemAlreadyExists error with the ID\nof the existing file system.\n For basic use cases, you can use a randomly generated UUID for the creation\ntoken.\n The idempotent operation allows you to retry a CreateFileSystem call without\nrisk of creating an extra file system. This can happen when an initial call\nfails in a way that leaves it uncertain whether or not a file system was\nactually created. An example might be that a transport level timeout occurred or\nyour connection was reset. As long as you use the same creation token, if the\ninitial call had succeeded in creating a file system, the client can learn of\nits existence from the FileSystemAlreadyExists error.\n The CreateFileSystem call returns while the file system's lifecycle state is\nstill creating. You can check the file system creation status by calling the\nDescribeFileSystems operation, which among other things returns the file system\nstate.\n This operation also takes an optional PerformanceMode parameter that you choose\nfor your file system. We recommend generalPurpose performance mode for most file\nsystems. File systems using the maxIO performance mode can scale to higher\nlevels of aggregate throughput and operations per second with a tradeoff of\nslightly higher latencies for most file operations. The performance mode can't\nbe changed after the file system has been created. For more information, see\nAmazon EFS: Performance Modes\n(https://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html).\n After the file system is fully created, Amazon EFS sets its lifecycle state to\navailable, at which point you can create one or more mount targets for the file\nsystem in your VPC. For more information, see CreateMountTarget. You mount your\nAmazon EFS file system on an EC2 instances in your VPC by using the mount\ntarget. For more information, see Amazon EFS: How it Works\n(https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html).\n This operation requires permissions for the elasticfilesystem:CreateFileSystem\naction." ([create-file-system-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-file-system-request create-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFileSystem", :http.request.configuration/output-deser-fn response-file-system-description, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemAlreadyExists" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-already-exists, "FileSystemLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-limit-exceeded, "InsufficientThroughputCapacity" :portkey.aws.elasticfilesystem.-2015-02-01/insufficient-throughput-capacity, "ThroughputLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/throughput-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description))

(clojure.core/defn describe-tags "Returns the tags associated with a file system. The order of tags returned in\nthe response of one DescribeTags call and the order of tags returned across the\nresponses of a multiple-call iteration (when using pagination) is unspecified.\n This operation requires permissions for the elasticfilesystem:DescribeTags\naction." ([describe-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/tags/{FileSystemId}/", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response))

(clojure.core/defn describe-mount-targets "Returns the descriptions of all the current mount targets, or a specific mount\ntarget, for a file system. When requesting all of the current mount targets, the\norder of mount targets returned in the response is unspecified.\n This operation requires permissions for the\nelasticfilesystem:DescribeMountTargets action, on either the file system ID that\nyou specify in FileSystemId, or on the file system of the mount target that you\nspecify in MountTargetId." ([] (describe-mount-targets {})) ([describe-mount-targets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-mount-targets-request describe-mount-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMountTargets", :http.request.configuration/output-deser-fn response-describe-mount-targets-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found}})))))
(clojure.spec.alpha/fdef describe-mount-targets :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response))

(clojure.core/defn update-file-system "Updates the throughput mode or the amount of provisioned throughput of an\nexisting file system." ([update-file-system-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-file-system-request update-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/update-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFileSystem", :http.request.configuration/output-deser-fn response-file-system-description, :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state, "InsufficientThroughputCapacity" :portkey.aws.elasticfilesystem.-2015-02-01/insufficient-throughput-capacity, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "ThroughputLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/throughput-limit-exceeded, "TooManyRequests" :portkey.aws.elasticfilesystem.-2015-02-01/too-many-requests}})))))
(clojure.spec.alpha/fdef update-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/update-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description))

(clojure.core/defn delete-mount-target "Deletes the specified mount target.\n This operation forcibly breaks any mounts of the file system by using the mount\ntarget that is being deleted, which might disrupt instances or applications\nusing those mounts. To avoid applications getting cut off abruptly, you might\nconsider unmounting any mounts of the mount target, if feasible. The operation\nalso deletes the associated network interface. Uncommitted writes might be lost,\nbut breaking a mount target using this operation does not corrupt the file\nsystem itself. The file system you created remains. You can mount an EC2\ninstance in your VPC by using another mount target.\n This operation requires permissions for the following action on the file\nsystem:\n * elasticfilesystem:DeleteMountTarget\n The DeleteMountTarget call returns while the mount target state is still\ndeleting. You can check the mount target deletion by calling the\nDescribeMountTargets operation, which returns a list of mount target\ndescriptions for the given file system.\n The operation also requires permissions for the following Amazon EC2 action on\nthe mount target's network interface:\n * ec2:DeleteNetworkInterface" ([delete-mount-target-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-mount-target-request delete-mount-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMountTarget", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "DependencyTimeout" :portkey.aws.elasticfilesystem.-2015-02-01/dependency-timeout, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found}})))))
(clojure.spec.alpha/fdef delete-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request) :ret clojure.core/true?)

(clojure.core/defn delete-file-system "Deletes a file system, permanently severing access to its contents. Upon return,\nthe file system no longer exists and you can't access any contents of the\ndeleted file system.\n You can't delete a file system that is in use. That is, if the file system has\nany mount targets, you must first delete them. For more information, see\nDescribeMountTargets and DeleteMountTarget.\n The DeleteFileSystem call returns while the file system state is still\ndeleting. You can check the file system deletion status by calling the\nDescribeFileSystems operation, which returns a list of file systems in your\naccount. If you pass file system ID or creation token for the deleted file\nsystem, the DescribeFileSystems returns a 404 FileSystemNotFound error.\n This operation requires permissions for the elasticfilesystem:DeleteFileSystem\naction." ([delete-file-system-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-file-system-request delete-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFileSystem", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "FileSystemInUse" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-in-use}})))))
(clojure.spec.alpha/fdef delete-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request) :ret clojure.core/true?)

(clojure.core/defn describe-lifecycle-configuration "Returns the current LifecycleConfiguration object for the specified Amazon EFS\nfile system. EFS lifecycle management uses the LifecycleConfiguration object to\nidentify which files to move to the EFS Infrequent Access (IA) storage class.\nFor a file system without a LifecycleConfiguration object, the call returns an\nempty array in the response.\n This operation requires permissions for the\nelasticfilesystem:DescribeLifecycleConfiguration operation." ([describe-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-lifecycle-configuration-request describe-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem.-2015-02-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}/lifecycle-configuration", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem.-2015-02-01/describe-lifecycle-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLifecycleConfiguration", :http.request.configuration/output-deser-fn response-lifecycle-configuration-description, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/lifecycle-configuration-description))
