(ns portkey.aws.elasticfilesystem.-2015-02-01 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
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
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/tag-key :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/CreationToken] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/PerformanceMode :portkey.aws.elasticfilesystem.-2015-02-01/Encrypted :portkey.aws.elasticfilesystem.-2015-02-01/KmsKeyId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.unsupported-availability-zone/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/unsupported-availability-zone (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.unsupported-availability-zone/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-tags-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/Tags] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/Marker :portkey.aws.elasticfilesystem.-2015-02-01.describe-tags-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/MaxItems :portkey.aws.elasticfilesystem.-2015-02-01/Marker :portkey.aws.elasticfilesystem.-2015-02-01/CreationToken :portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.bad-request/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/bad-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.bad-request/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-count (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 0 p1__8188__8189__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-group (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId :portkey.aws.elasticfilesystem.-2015-02-01/SubnetId] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/IpAddress :portkey.aws.elasticfilesystem.-2015-02-01/SecurityGroups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.ip-address-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/ip-address-in-use (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.ip-address-in-use/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/security-group :max-count 5))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/life-cycle-state (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"creating" "creating", :creating "creating", "available" "available", :available "available", "deleting" "deleting", :deleting "deleting", "deleted" "deleted", :deleted "deleted"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/MountTargetId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/size-in-bytes (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/number-of-mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-count))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/creation-time (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/name (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/OwnerId :portkey.aws.elasticfilesystem.-2015-02-01/CreationToken :portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/CreationTime :portkey.aws.elasticfilesystem.-2015-02-01/LifeCycleState :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/NumberOfMountTargets :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/SizeInBytes :portkey.aws.elasticfilesystem.-2015-02-01/PerformanceMode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/Encrypted :portkey.aws.elasticfilesystem.-2015-02-01/KmsKeyId :portkey.aws.elasticfilesystem.-2015-02-01.file-system-description/Name]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId :portkey.aws.elasticfilesystem.-2015-02-01/TagKeys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/tag :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.mount-target-conflict/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-conflict (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.mount-target-conflict/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/file-systems (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/Marker :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/FileSystems :portkey.aws.elasticfilesystem.-2015-02-01.describe-file-systems-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.security-group-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.security-group-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.mount-target-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.mount-target-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.incorrect-mount-target-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.incorrect-mount-target-state/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.subnet-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/subnet-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.subnet-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/Marker :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/MountTargets :portkey.aws.elasticfilesystem.-2015-02-01.describe-mount-targets-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.dependency-timeout/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/dependency-timeout (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.dependency-timeout/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId :portkey.aws.elasticfilesystem.-2015-02-01/Tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/SecurityGroups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-in-use (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-in-use/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/aws-account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-size/Value] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/Timestamp]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/MaxItems :portkey.aws.elasticfilesystem.-2015-02-01/Marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.mount-target-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/MountTargetId :portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId :portkey.aws.elasticfilesystem.-2015-02-01/SubnetId :portkey.aws.elasticfilesystem.-2015-02-01/LifeCycleState] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.mount-target-description/OwnerId :portkey.aws.elasticfilesystem.-2015-02-01/IpAddress :portkey.aws.elasticfilesystem.-2015-02-01/NetworkInterfaceId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.file-system-already-exists/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-already-exists (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode :portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.file-system-already-exists/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.incorrect-file-system-life-cycle-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.incorrect-file-system-life-cycle-state/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/max-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/MountTargetId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.security-group-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.security-group-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/MaxItems :portkey.aws.elasticfilesystem.-2015-02-01/Marker :portkey.aws.elasticfilesystem.-2015-02-01/FileSystemId :portkey.aws.elasticfilesystem.-2015-02-01/MountTargetId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.tag/key (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.tag/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/tag (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01.tag/Key :portkey.aws.elasticfilesystem.-2015-02-01.tag/Value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.network-interface-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.network-interface-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.internal-server-error/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/creation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/performance-mode (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"generalPurpose" "generalPurpose", :general-purpose "generalPurpose", "maxIO" "maxIO", :maxio "maxIO"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01.no-free-addresses-in-subnet/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/no-free-addresses-in-subnet (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01.no-free-addresses-in-subnet/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.-2015-02-01/MountTargetId] :opt-un [:portkey.aws.elasticfilesystem.-2015-02-01/SecurityGroups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.-2015-02-01/file-system-size-value clojure.core/int?)

(clojure.core/defn describe-mount-target-security-groups [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "GET" "/2015-02-01/mount-targets/{MountTargetId}/security-groups" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request {:payload nil, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 200 :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state}))
(clojure.spec.alpha/fdef describe-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-target-security-groups-response))

(clojure.core/defn describe-file-systems [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "GET" "/2015-02-01/file-systems" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request {:payload nil, :headers {}, :uri {}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker", "CreationToken" "CreationToken", "FileSystemId" "FileSystemId"}} 200 :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}))
(clojure.spec.alpha/fdef describe-file-systems :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-file-systems-response))

(clojure.core/defn modify-mount-target-security-groups [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "PUT" "/2015-02-01/mount-targets/{MountTargetId}/security-groups" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request {:payload nil, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-mount-target-state, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found}))
(clojure.spec.alpha/fdef modify-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/modify-mount-target-security-groups-request))

(clojure.core/defn delete-tags [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "POST" "/2015-02-01/delete-tags/{FileSystemId}" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-tags-request))

(clojure.core/defn create-tags [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "POST" "/2015-02-01/create-tags/{FileSystemId}" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-tags-request))

(clojure.core/defn create-mount-target [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "POST" "/2015-02-01/mount-targets" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request {:payload nil, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description {"UnsupportedAvailabilityZone" :portkey.aws.elasticfilesystem.-2015-02-01/unsupported-availability-zone, "BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "IpAddressInUse" :portkey.aws.elasticfilesystem.-2015-02-01/ip-address-in-use, "MountTargetConflict" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-conflict, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-limit-exceeded, "SubnetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/subnet-not-found, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem.-2015-02-01/incorrect-file-system-life-cycle-state, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/security-group-not-found, "NetworkInterfaceLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/network-interface-limit-exceeded, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "NoFreeAddressesInSubnet" :portkey.aws.elasticfilesystem.-2015-02-01/no-free-addresses-in-subnet}))
(clojure.spec.alpha/fdef create-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-mount-target-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-description))

(clojure.core/defn create-file-system [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "POST" "/2015-02-01/file-systems" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request {:payload nil, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemAlreadyExists" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-already-exists, "FileSystemLimitExceeded" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-limit-exceeded}))
(clojure.spec.alpha/fdef create-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/create-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/file-system-description))

(clojure.core/defn describe-tags [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "GET" "/2015-02-01/tags/{FileSystemId}/" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker"}} 200 :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found}))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-tags-response))

(clojure.core/defn describe-mount-targets [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "GET" "/2015-02-01/mount-targets" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request {:payload nil, :headers {}, :uri {}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker", "FileSystemId" "FileSystemId", "MountTargetId" "MountTargetId"}} 200 :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found}))
(clojure.spec.alpha/fdef describe-mount-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem.-2015-02-01/describe-mount-targets-response))

(clojure.core/defn delete-mount-target [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "DELETE" "/2015-02-01/mount-targets/{MountTargetId}" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request {:payload nil, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "DependencyTimeout" :portkey.aws.elasticfilesystem.-2015-02-01/dependency-timeout, "MountTargetNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/mount-target-not-found}))
(clojure.spec.alpha/fdef delete-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-mount-target-request))

(clojure.core/defn delete-file-system [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem.-2015-02-01/endpoints "DELETE" "/2015-02-01/file-systems/{FileSystemId}" input__8278__auto__ :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem.-2015-02-01/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem.-2015-02-01/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-not-found, "FileSystemInUse" :portkey.aws.elasticfilesystem.-2015-02-01/file-system-in-use}))
(clojure.spec.alpha/fdef delete-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem.-2015-02-01/delete-file-system-request))
