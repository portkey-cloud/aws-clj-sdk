(ns portkey.aws.elasticfilesystem (:require [portkey.aws]))

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

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-file-system-id)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-max-items)

(clojure.core/declare ser-ip-address)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-mount-target-id)

(clojure.core/declare ser-creation-token)

(clojure.core/declare ser-performance-mode)

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

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-file-system-id [input] #:http.request.field{:value input, :shape "FileSystemId"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-max-items [input] #:http.request.field{:value input, :shape "MaxItems"})

(clojure.core/defn- ser-ip-address [input] #:http.request.field{:value input, :shape "IpAddress"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-mount-target-id [input] #:http.request.field{:value input, :shape "MountTargetId"})

(clojure.core/defn- ser-creation-token [input] #:http.request.field{:value input, :shape "CreationToken"})

(clojure.core/defn- ser-performance-mode [input] #:http.request.field{:value (clojure.core/get {"generalPurpose" "generalPurpose", :general-purpose "generalPurpose", "maxIO" "maxIO", :max-io "maxIO"} input), :shape "PerformanceMode"})

(clojure.core/defn- req-create-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-creation-token (input :creation-token)) #:http.request.field{:name "CreationToken", :shape "CreationToken"})]} (clojure.core/contains? input :performance-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-performance-mode (input :performance-mode)) #:http.request.field{:name "PerformanceMode", :shape "PerformanceMode"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encrypted (input :encrypted)) #:http.request.field{:name "Encrypted", :shape "Encrypted"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :throughput-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-throughput-mode (input :throughput-mode)) #:http.request.field{:name "ThroughputMode", :shape "ThroughputMode"})) (clojure.core/contains? input :provisioned-throughput-in-mibps) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-throughput-in-mibps (input :provisioned-throughput-in-mibps)) #:http.request.field{:name "ProvisionedThroughputInMibps", :shape "ProvisionedThroughputInMibps"}))))

(clojure.core/defn- req-describe-file-systems-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "MaxItems"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :creation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-token (input :creation-token)) #:http.request.field{:name "CreationToken", :shape "CreationToken", :location "querystring", :location-name "CreationToken"})) (clojure.core/contains? input :file-system-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "querystring", :location-name "FileSystemId"}))))

(clojure.core/defn- req-delete-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})]}))

(clojure.core/defn- req-create-mount-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId"}) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})]} (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IpAddress", :shape "IpAddress"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"}))))

(clojure.core/defn- req-describe-mount-target-security-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "uri", :location-name "MountTargetId"})]}))

(clojure.core/defn- req-delete-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-update-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})]} (clojure.core/contains? input :throughput-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-throughput-mode (input :throughput-mode)) #:http.request.field{:name "ThroughputMode", :shape "ThroughputMode"})) (clojure.core/contains? input :provisioned-throughput-in-mibps) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-throughput-in-mibps (input :provisioned-throughput-in-mibps)) #:http.request.field{:name "ProvisionedThroughputInMibps", :shape "ProvisionedThroughputInMibps"}))))

(clojure.core/defn- req-create-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "uri", :location-name "FileSystemId"})]} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "MaxItems"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "Marker"}))))

(clojure.core/defn- req-delete-mount-target-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "uri", :location-name "MountTargetId"})]}))

(clojure.core/defn- req-describe-mount-targets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "MaxItems"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :file-system-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId", :location "querystring", :location-name "FileSystemId"})) (clojure.core/contains? input :mount-target-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "querystring", :location-name "MountTargetId"}))))

(clojure.core/defn- req-modify-mount-target-security-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-mount-target-id (input :mount-target-id)) #:http.request.field{:name "MountTargetId", :shape "MountTargetId", :location "uri", :location-name "MountTargetId"})]} (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"}))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag-key))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/creation-token] :opt-un [:portkey.aws.elasticfilesystem/performance-mode :portkey.aws.elasticfilesystem/encrypted :portkey.aws.elasticfilesystem/kms-key-id :portkey.aws.elasticfilesystem/throughput-mode :portkey.aws.elasticfilesystem/provisioned-throughput-in-mibps]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.unsupported-availability-zone/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/unsupported-availability-zone (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.unsupported-availability-zone/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-tags-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/tags] :opt-un [:portkey.aws.elasticfilesystem/marker :portkey.aws.elasticfilesystem.describe-tags-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/max-items :portkey.aws.elasticfilesystem/marker :portkey.aws.elasticfilesystem/creation-token :portkey.aws.elasticfilesystem/file-system-id]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/throughput-mode #{:provisioned "bursting" :bursting "provisioned"})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.bad-request/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/bad-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.bad-request/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/provisioned-throughput-in-mibps clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/file-system-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-mount-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/file-system-id :portkey.aws.elasticfilesystem/subnet-id] :opt-un [:portkey.aws.elasticfilesystem/ip-address :portkey.aws.elasticfilesystem/security-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.ip-address-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address-in-use (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.ip-address-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/security-group :max-count 5))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/life-cycle-state #{:deleted "deleting" :creating :deleting "creating" "deleted" :updating "updating" :available "available"})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/mount-target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.file-system-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/size-in-bytes (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/number-of-mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-count))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/creation-time (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/name (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-description (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.file-system-description/owner-id :portkey.aws.elasticfilesystem/creation-token :portkey.aws.elasticfilesystem/file-system-id :portkey.aws.elasticfilesystem.file-system-description/creation-time :portkey.aws.elasticfilesystem/life-cycle-state :portkey.aws.elasticfilesystem.file-system-description/number-of-mount-targets :portkey.aws.elasticfilesystem.file-system-description/size-in-bytes :portkey.aws.elasticfilesystem/performance-mode] :opt-un [:portkey.aws.elasticfilesystem/throughput-mode :portkey.aws.elasticfilesystem/provisioned-throughput-in-mibps :portkey.aws.elasticfilesystem/encrypted :portkey.aws.elasticfilesystem/kms-key-id :portkey.aws.elasticfilesystem.file-system-description/name]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/file-system-id :portkey.aws.elasticfilesystem/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-conflict/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-conflict (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.mount-target-conflict/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/file-systems (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/marker :portkey.aws.elasticfilesystem.describe-file-systems-response/file-systems :portkey.aws.elasticfilesystem.describe-file-systems-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.security-group-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.mount-target-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/update-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/file-system-id] :opt-un [:portkey.aws.elasticfilesystem/throughput-mode :portkey.aws.elasticfilesystem/provisioned-throughput-in-mibps]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-mount-target-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-mount-target-state (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.incorrect-mount-target-state/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.subnet-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.subnet-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/marker :portkey.aws.elasticfilesystem.describe-mount-targets-response/mount-targets :portkey.aws.elasticfilesystem.describe-mount-targets-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.file-system-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.dependency-timeout/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/dependency-timeout (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.dependency-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/file-system-id :portkey.aws.elasticfilesystem/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/security-groups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-in-use (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.file-system-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/aws-account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.insufficient-throughput-capacity/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/insufficient-throughput-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.insufficient-throughput-capacity/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-size/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.file-system-size/value] :opt-un [:portkey.aws.elasticfilesystem/timestamp]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/file-system-id] :opt-un [:portkey.aws.elasticfilesystem/max-items :portkey.aws.elasticfilesystem/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-description (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/mount-target-id :portkey.aws.elasticfilesystem/file-system-id :portkey.aws.elasticfilesystem/subnet-id :portkey.aws.elasticfilesystem/life-cycle-state] :opt-un [:portkey.aws.elasticfilesystem.mount-target-description/owner-id :portkey.aws.elasticfilesystem/ip-address :portkey.aws.elasticfilesystem/network-interface-id]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-already-exists/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-already-exists (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code :portkey.aws.elasticfilesystem/file-system-id] :opt-un [:portkey.aws.elasticfilesystem.file-system-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/file-system-description))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/mount-target-description))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/max-items (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-mount-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/mount-target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.too-many-requests/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/too-many-requests (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.too-many-requests/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.throughput-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/throughput-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.throughput-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.security-group-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/max-items :portkey.aws.elasticfilesystem/marker :portkey.aws.elasticfilesystem/file-system-id :portkey.aws.elasticfilesystem/mount-target-id]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/key (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem.tag/key :portkey.aws.elasticfilesystem.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.network-interface-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.network-interface-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/internal-server-error (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/creation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/performance-mode #{"generalPurpose" :max-io :general-purpose "maxIO"})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/error-code] :opt-un [:portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticfilesystem/mount-target-id] :opt-un [:portkey.aws.elasticfilesystem/security-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size-value clojure.core/int?)

(clojure.core/defn describe-mount-target-security-groups ([describe-mount-target-security-groups-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-mount-target-security-groups-request describe-mount-target-security-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}/security-groups", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeMountTargetSecurityGroups", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state}})))))
(clojure.spec.alpha/fdef describe-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response))

(clojure.core/defn describe-file-systems ([] (describe-file-systems {})) ([describe-file-systems-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-file-systems-request describe-file-systems-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec :portkey.aws.elasticfilesystem/describe-file-systems-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/describe-file-systems-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeFileSystems", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-file-systems :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem/describe-file-systems-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-file-systems-response))

(clojure.core/defn modify-mount-target-security-groups ([modify-mount-target-security-groups-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-modify-mount-target-security-groups-request modify-mount-target-security-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}/security-groups", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/action "ModifyMountTargetSecurityGroups", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found}})))))
(clojure.spec.alpha/fdef modify-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request) :ret clojure.core/true?)

(clojure.core/defn delete-tags ([delete-tags-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/delete-tags/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/delete-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteTags", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-tags ([create-tags-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/create-tags/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/create-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "CreateTags", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-mount-target ([create-mount-target-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-mount-target-request create-mount-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec :portkey.aws.elasticfilesystem/mount-target-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/create-mount-target-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateMountTarget", :http.request.spec/error-spec {"UnsupportedAvailabilityZone" :portkey.aws.elasticfilesystem/unsupported-availability-zone, "BadRequest" :portkey.aws.elasticfilesystem/bad-request, "IpAddressInUse" :portkey.aws.elasticfilesystem/ip-address-in-use, "MountTargetConflict" :portkey.aws.elasticfilesystem/mount-target-conflict, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SubnetNotFound" :portkey.aws.elasticfilesystem/subnet-not-found, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found, "NetworkInterfaceLimitExceeded" :portkey.aws.elasticfilesystem/network-interface-limit-exceeded, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "NoFreeAddressesInSubnet" :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet}})))))
(clojure.spec.alpha/fdef create-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-mount-target-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-description))

(clojure.core/defn create-file-system ([create-file-system-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-file-system-request create-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec :portkey.aws.elasticfilesystem/file-system-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/create-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateFileSystem", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemAlreadyExists" :portkey.aws.elasticfilesystem/file-system-already-exists, "FileSystemLimitExceeded" :portkey.aws.elasticfilesystem/file-system-limit-exceeded, "InsufficientThroughputCapacity" :portkey.aws.elasticfilesystem/insufficient-throughput-capacity, "ThroughputLimitExceeded" :portkey.aws.elasticfilesystem/throughput-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-description))

(clojure.core/defn describe-tags ([describe-tags-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec :portkey.aws.elasticfilesystem/describe-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/tags/{FileSystemId}/", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/describe-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeTags", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-tags-response))

(clojure.core/defn describe-mount-targets ([] (describe-mount-targets {})) ([describe-mount-targets-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-mount-targets-request describe-mount-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec :portkey.aws.elasticfilesystem/describe-mount-targets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/describe-mount-targets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeMountTargets", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found}})))))
(clojure.spec.alpha/fdef describe-mount-targets :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem/describe-mount-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-mount-targets-response))

(clojure.core/defn update-file-system ([update-file-system-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-file-system-request update-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec :portkey.aws.elasticfilesystem/file-system-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/update-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/action "UpdateFileSystem", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state, "InsufficientThroughputCapacity" :portkey.aws.elasticfilesystem/insufficient-throughput-capacity, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "ThroughputLimitExceeded" :portkey.aws.elasticfilesystem/throughput-limit-exceeded, "TooManyRequests" :portkey.aws.elasticfilesystem/too-many-requests}})))))
(clojure.spec.alpha/fdef update-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/update-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-description))

(clojure.core/defn delete-mount-target ([delete-mount-target-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-mount-target-request delete-mount-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/mount-targets/{MountTargetId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/delete-mount-target-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteMountTarget", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "DependencyTimeout" :portkey.aws.elasticfilesystem/dependency-timeout, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found}})))))
(clojure.spec.alpha/fdef delete-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-mount-target-request) :ret clojure.core/true?)

(clojure.core/defn delete-file-system ([delete-file-system-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-file-system-request delete-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.elasticfilesystem/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-02-01/file-systems/{FileSystemId}", :http.request.configuration/version "2015-02-01", :http.request.configuration/service-id "EFS", :http.request.spec/input-spec :portkey.aws.elasticfilesystem/delete-file-system-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteFileSystem", :http.request.spec/error-spec {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "FileSystemInUse" :portkey.aws.elasticfilesystem/file-system-in-use}})))))
(clojure.spec.alpha/fdef delete-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-file-system-request) :ret clojure.core/true?)
