(ns portkey.aws.elasticfilesystem (:require [portkey.aws]))

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
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticfilesystem", :region "us-west-1"},
    :ssl-common-name "elasticfilesystem.us-west-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-keys (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-file-system-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/CreationToken] :opt-un [:portkey.aws.elasticfilesystem/PerformanceMode :portkey.aws.elasticfilesystem/Encrypted :portkey.aws.elasticfilesystem/KmsKeyId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.unsupported-availability-zone/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/unsupported-availability-zone (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.unsupported-availability-zone/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-tags-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-response (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/Tags] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-tags-response/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem/CreationToken :portkey.aws.elasticfilesystem/FileSystemId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.bad-request/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/bad-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.bad-request/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-count (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 0 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-file-system-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-mount-target-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/SubnetId] :opt-un [:portkey.aws.elasticfilesystem/IpAddress :portkey.aws.elasticfilesystem/SecurityGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.ip-address-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address-in-use (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.ip-address-in-use/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-groups (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/security-group :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/life-cycle-state (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"creating" "creating", :creating "creating", "available" "available", :available "available", "deleting" "deleting", :deleting "deleting", "deleted" "deleted", :deleted "deleted"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-limit-exceeded/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/size-in-bytes (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/number-of-mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-count))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/creation-time (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/name (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-description (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.file-system-description/OwnerId :portkey.aws.elasticfilesystem/CreationToken :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem.file-system-description/CreationTime :portkey.aws.elasticfilesystem/LifeCycleState :portkey.aws.elasticfilesystem.file-system-description/NumberOfMountTargets :portkey.aws.elasticfilesystem.file-system-description/SizeInBytes :portkey.aws.elasticfilesystem/PerformanceMode] :opt-un [:portkey.aws.elasticfilesystem/Encrypted :portkey.aws.elasticfilesystem/KmsKeyId :portkey.aws.elasticfilesystem.file-system-description/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tags (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-conflict/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-conflict (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.mount-target-conflict/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/file-systems (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-file-systems-response/FileSystems :portkey.aws.elasticfilesystem.describe-file-systems-response/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.security-group-limit-exceeded/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.mount-target-not-found/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-mount-target-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-mount-target-state (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.incorrect-mount-target-state/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.subnet-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.subnet-not-found/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__)))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-mount-targets-response/MountTargets :portkey.aws.elasticfilesystem.describe-mount-targets-response/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-not-found/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.dependency-timeout/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/dependency-timeout (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.dependency-timeout/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/SecurityGroups] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-in-use (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-in-use/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/aws-account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-size/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.file-system-size/Value] :opt-un [:portkey.aws.elasticfilesystem/Timestamp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-description (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/SubnetId :portkey.aws.elasticfilesystem/LifeCycleState] :opt-un [:portkey.aws.elasticfilesystem.mount-target-description/OwnerId :portkey.aws.elasticfilesystem/IpAddress :portkey.aws.elasticfilesystem/NetworkInterfaceId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-already-exists/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-already-exists (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode :portkey.aws.elasticfilesystem/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem.file-system-already-exists/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-descriptions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/file-system-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-descriptions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/mount-target-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/max-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-mount-target-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.security-group-not-found/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/MountTargetId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/key (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.tag/Key :portkey.aws.elasticfilesystem.tag/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.network-interface-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.network-interface-limit-exceeded/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/internal-server-error (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.internal-server-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/creation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/performance-mode (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"generalPurpose" "generalPurpose", :general-purpose "generalPurpose", "maxIO" "maxIO", :maxio "maxIO"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un [:portkey.aws.elasticfilesystem/SecurityGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size-value clojure.core/int?)

(clojure.core/defn describe-mount-target-security-groups "Returns the security groups currently in effect for a mount target. This\noperation requires that the network interface of the mount target has been\ncreated and the lifecycle state of the mount target is not deleted.\n This operation requires permissions for the following actions:\n * elasticfilesystem:DescribeMountTargetSecurityGroups action on the mount\ntarget's file system.\n * ec2:DescribeNetworkInterfaceAttribute action on the mount target's network\ninterface." ([describe-mount-target-security-groups-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/mount-targets/{MountTargetId}/security-groups" describe-mount-target-security-groups-request :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request {:payload nil, :move {}, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 200 :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state})))
(clojure.spec.alpha/fdef describe-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response))

(clojure.core/defn describe-file-systems "Returns the description of a specific Amazon EFS file system if either the file\nsystem CreationToken or the FileSystemId is provided. Otherwise, it returns\ndescriptions of all file systems owned by the caller's AWS account in the AWS\nRegion of the endpoint that you're calling.\n When retrieving all file system descriptions, you can optionally specify the\nMaxItems parameter to limit the number of descriptions in a response. If more\nfile system descriptions remain, Amazon EFS returns a NextMarker, an opaque\ntoken, in the response. In this case, you should send a subsequent request with\nthe Marker request parameter set to the value of NextMarker.\n To retrieve a list of your file system descriptions, this operation is used in\nan iterative process, where DescribeFileSystems is called first without the\nMarker and then the operation continues to call it with the Marker parameter set\nto the value of the NextMarker from the previous response until the response has\nno NextMarker.\n The implementation may return fewer than MaxItems file system descriptions\nwhile still including a NextMarker value.\n The order of file systems returned in the response of one DescribeFileSystems\ncall and the order of file systems returned across the responses of a multi-call\niteration is unspecified.\n This operation requires permissions for the\nelasticfilesystem:DescribeFileSystems action." ([] (describe-file-systems {})) ([describe-file-systems-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/file-systems" describe-file-systems-request :portkey.aws.elasticfilesystem/describe-file-systems-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker", "CreationToken" "CreationToken", "FileSystemId" "FileSystemId"}} 200 :portkey.aws.elasticfilesystem/describe-file-systems-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found})))
(clojure.spec.alpha/fdef describe-file-systems :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem/describe-file-systems-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-file-systems-response))

(clojure.core/defn modify-mount-target-security-groups "Modifies the set of security groups in effect for a mount target.\n When you create a mount target, Amazon EFS also creates a new network\ninterface. For more information, see CreateMountTarget. This operation replaces\nthe security groups in effect for the network interface associated with a mount\ntarget, with the SecurityGroups provided in the request. This operation requires\nthat the network interface of the mount target has been created and the\nlifecycle state of the mount target is not deleted.\n The operation requires permissions for the following actions:\n * elasticfilesystem:ModifyMountTargetSecurityGroups action on the mount\ntarget's file system.\n * ec2:ModifyNetworkInterfaceAttribute action on the mount target's network\ninterface." ([modify-mount-target-security-groups-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "PUT" "/2015-02-01/mount-targets/{MountTargetId}/security-groups" modify-mount-target-security-groups-request :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request {:payload nil, :move {}, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found})))
(clojure.spec.alpha/fdef modify-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request) :ret clojure.core/true?)

(clojure.core/defn delete-tags "Deletes the specified tags from a file system. If the DeleteTags request\nincludes a tag key that does not exist, Amazon EFS ignores it and doesn't cause\nan error. For more information about tags and related restrictions, see Tag\nRestrictions\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)\nin the AWS Billing and Cost Management User Guide.\n This operation requires permissions for the elasticfilesystem:DeleteTags\naction." ([delete-tags-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/delete-tags/{FileSystemId}" delete-tags-request :portkey.aws.elasticfilesystem/delete-tags-request {:payload nil, :move {}, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found})))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-tags "Creates or overwrites tags associated with a file system. Each tag is a\nkey-value pair. If a tag key specified in the request already exists on the file\nsystem, this operation overwrites its value with the value provided in the\nrequest. If you add the Name tag to your file system, Amazon EFS returns it in\nthe response to the DescribeFileSystems operation.\n This operation requires permission for the elasticfilesystem:CreateTags action." ([create-tags-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/create-tags/{FileSystemId}" create-tags-request :portkey.aws.elasticfilesystem/create-tags-request {:payload nil, :move {}, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found})))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-tags-request) :ret clojure.core/true?)

(clojure.core/defn create-mount-target "Creates a mount target for a file system. You can then mount the file system on\nEC2 instances via the mount target.\n You can create one mount target in each Availability Zone in your VPC. All EC2\ninstances in a VPC within a given Availability Zone share a single mount target\nfor a given file system. If you have multiple subnets in an Availability Zone,\nyou create a mount target in one of the subnets. EC2 instances do not need to be\nin the same subnet as the mount target in order to access their file system. For\nmore information, see Amazon EFS: How it Works\n(http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html).\n In the request, you also specify a file system ID for which you are creating\nthe mount target and the file system's lifecycle state must be available. For\nmore information, see DescribeFileSystems.\n In the request, you also provide a subnet ID, which determines the following:\n * VPC in which Amazon EFS creates the mount target\n * Availability Zone in which Amazon EFS creates the mount target\n * IP address range from which Amazon EFS selects the IP address of the mount\ntarget (if you don't specify an IP address in the request)\n After creating the mount target, Amazon EFS returns a response that includes, a\nMountTargetId and an IpAddress. You use this IP address when mounting the file\nsystem in an EC2 instance. You can also use the mount target's DNS name when\nmounting the file system. The EC2 instance on which you mount the file system\nvia the mount target can resolve the mount target's DNS name to its IP address.\nFor more information, see How it Works: Implementation Overview\n(http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation).\n Note that you can create mount targets for a file system in only one VPC, and\nthere can be only one mount target per Availability Zone. That is, if the file\nsystem already has one or more mount targets created for it, the subnet\nspecified in the request to add another mount target must meet the following\nrequirements:\n * Must belong to the same VPC as the subnets of the existing mount targets\n * Must not be in the same Availability Zone as any of the subnets of the\nexisting mount targets\n If the request satisfies the requirements, Amazon EFS does the following:\n * Creates a new mount target in the specified subnet.\n * Also creates a new network interface in the subnet as follows:\n * If the request provides an IpAddress, Amazon EFS assigns that IP address to\nthe network interface. Otherwise, Amazon EFS assigns a free address in the\nsubnet (in the same way that the Amazon EC2 CreateNetworkInterface call does\nwhen a request does not specify a primary private IP address).\n * If the request provides SecurityGroups, this network interface is associated\nwith those security groups. Otherwise, it belongs to the default security group\nfor the subnet's VPC.\n * Assigns the description Mount target fsmt-id for file system fs-id where\nfsmt-id is the mount target ID, and fs-id is the FileSystemId.\n * Sets the requesterManaged property of the network interface to true, and the\nrequesterId value to EFS.\n Each Amazon EFS mount target has one corresponding requester-managed EC2\nnetwork interface. After the network interface is created, Amazon EFS sets the\nNetworkInterfaceId field in the mount target's description to the network\ninterface ID, and the IpAddress field to its address. If network interface\ncreation fails, the entire CreateMountTarget operation fails.\n The CreateMountTarget call returns only after creating the network interface,\nbut while the mount target state is still creating, you can check the mount\ntarget creation status by calling the DescribeMountTargets operation, which\namong other things returns the mount target state.\n We recommend you create a mount target in each of the Availability Zones. There\nare cost considerations for using a file system in an Availability Zone through\na mount target created in another Availability Zone. For more information, see\nAmazon EFS (http://aws.amazon.com/efs/). In addition, by always using a mount\ntarget local to the instance's Availability Zone, you eliminate a partial\nfailure scenario. If the Availability Zone in which your mount target is created\ngoes down, then you won't be able to access your file system through that mount\ntarget.\n This operation requires permissions for the following action on the file\nsystem:\n * elasticfilesystem:CreateMountTarget\n This operation also requires permissions for the following Amazon EC2 actions:\n * ec2:DescribeSubnets\n * ec2:DescribeNetworkInterfaces\n * ec2:CreateNetworkInterface" ([create-mount-target-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/mount-targets" create-mount-target-request :portkey.aws.elasticfilesystem/create-mount-target-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.elasticfilesystem/mount-target-description {"UnsupportedAvailabilityZone" :portkey.aws.elasticfilesystem/unsupported-availability-zone, "BadRequest" :portkey.aws.elasticfilesystem/bad-request, "IpAddressInUse" :portkey.aws.elasticfilesystem/ip-address-in-use, "MountTargetConflict" :portkey.aws.elasticfilesystem/mount-target-conflict, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SubnetNotFound" :portkey.aws.elasticfilesystem/subnet-not-found, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found, "NetworkInterfaceLimitExceeded" :portkey.aws.elasticfilesystem/network-interface-limit-exceeded, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "NoFreeAddressesInSubnet" :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet})))
(clojure.spec.alpha/fdef create-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-mount-target-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-description))

(clojure.core/defn create-file-system "Creates a new, empty file system. The operation requires a creation token in the\nrequest that Amazon EFS uses to ensure idempotent creation (calling the\noperation with same creation token has no effect). If a file system does not\ncurrently exist that is owned by the caller's AWS account with the specified\ncreation token, this operation does the following:\n * Creates a new, empty file system. The file system will have an Amazon EFS\nassigned ID, and an initial lifecycle state creating.\n * Returns with the description of the created file system.\n Otherwise, this operation returns a FileSystemAlreadyExists error with the ID\nof the existing file system.\n For basic use cases, you can use a randomly generated UUID for the creation\ntoken.\n The idempotent operation allows you to retry a CreateFileSystem call without\nrisk of creating an extra file system. This can happen when an initial call\nfails in a way that leaves it uncertain whether or not a file system was\nactually created. An example might be that a transport level timeout occurred or\nyour connection was reset. As long as you use the same creation token, if the\ninitial call had succeeded in creating a file system, the client can learn of\nits existence from the FileSystemAlreadyExists error.\n The CreateFileSystem call returns while the file system's lifecycle state is\nstill creating. You can check the file system creation status by calling the\nDescribeFileSystems operation, which among other things returns the file system\nstate.\n This operation also takes an optional PerformanceMode parameter that you choose\nfor your file system. We recommend generalPurpose performance mode for most file\nsystems. File systems using the maxIO performance mode can scale to higher\nlevels of aggregate throughput and operations per second with a tradeoff of\nslightly higher latencies for most file operations. The performance mode can't\nbe changed after the file system has been created. For more information, see\nAmazon EFS: Performance Modes\n(http://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html).\n After the file system is fully created, Amazon EFS sets its lifecycle state to\navailable, at which point you can create one or more mount targets for the file\nsystem in your VPC. For more information, see CreateMountTarget. You mount your\nAmazon EFS file system on an EC2 instances in your VPC via the mount target. For\nmore information, see Amazon EFS: How it Works\n(http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html).\n This operation requires permissions for the elasticfilesystem:CreateFileSystem\naction." ([create-file-system-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/file-systems" create-file-system-request :portkey.aws.elasticfilesystem/create-file-system-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.elasticfilesystem/file-system-description {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemAlreadyExists" :portkey.aws.elasticfilesystem/file-system-already-exists, "FileSystemLimitExceeded" :portkey.aws.elasticfilesystem/file-system-limit-exceeded})))
(clojure.spec.alpha/fdef create-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-description))

(clojure.core/defn describe-tags "Returns the tags associated with a file system. The order of tags returned in\nthe response of one DescribeTags call and the order of tags returned across the\nresponses of a multi-call iteration (when using pagination) is unspecified.\n This operation requires permissions for the elasticfilesystem:DescribeTags\naction." ([describe-tags-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/tags/{FileSystemId}/" describe-tags-request :portkey.aws.elasticfilesystem/describe-tags-request {:payload nil, :move {}, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker"}} 200 :portkey.aws.elasticfilesystem/describe-tags-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found})))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-tags-response))

(clojure.core/defn describe-mount-targets "Returns the descriptions of all the current mount targets, or a specific mount\ntarget, for a file system. When requesting all of the current mount targets, the\norder of mount targets returned in the response is unspecified.\n This operation requires permissions for the\nelasticfilesystem:DescribeMountTargets action, on either the file system ID that\nyou specify in FileSystemId, or on the file system of the mount target that you\nspecify in MountTargetId." ([] (describe-mount-targets {})) ([describe-mount-targets-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/mount-targets" describe-mount-targets-request :portkey.aws.elasticfilesystem/describe-mount-targets-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker", "FileSystemId" "FileSystemId", "MountTargetId" "MountTargetId"}} 200 :portkey.aws.elasticfilesystem/describe-mount-targets-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found})))
(clojure.spec.alpha/fdef describe-mount-targets :args (clojure.spec.alpha/? :portkey.aws.elasticfilesystem/describe-mount-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-mount-targets-response))

(clojure.core/defn delete-mount-target "Deletes the specified mount target.\n This operation forcibly breaks any mounts of the file system via the mount\ntarget that is being deleted, which might disrupt instances or applications\nusing those mounts. To avoid applications getting cut off abruptly, you might\nconsider unmounting any mounts of the mount target, if feasible. The operation\nalso deletes the associated network interface. Uncommitted writes may be lost,\nbut breaking a mount target using this operation does not corrupt the file\nsystem itself. The file system you created remains. You can mount an EC2\ninstance in your VPC via another mount target.\n This operation requires permissions for the following action on the file\nsystem:\n * elasticfilesystem:DeleteMountTarget\n The DeleteMountTarget call returns while the mount target state is still\ndeleting. You can check the mount target deletion by calling the\nDescribeMountTargets operation, which returns a list of mount target\ndescriptions for the given file system.\n The operation also requires permissions for the following Amazon EC2 action on\nthe mount target's network interface:\n * ec2:DeleteNetworkInterface" ([delete-mount-target-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "DELETE" "/2015-02-01/mount-targets/{MountTargetId}" delete-mount-target-request :portkey.aws.elasticfilesystem/delete-mount-target-request {:payload nil, :move {}, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "DependencyTimeout" :portkey.aws.elasticfilesystem/dependency-timeout, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found})))
(clojure.spec.alpha/fdef delete-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-mount-target-request) :ret clojure.core/true?)

(clojure.core/defn delete-file-system "Deletes a file system, permanently severing access to its contents. Upon return,\nthe file system no longer exists and you can't access any contents of the\ndeleted file system.\n You can't delete a file system that is in use. That is, if the file system has\nany mount targets, you must first delete them. For more information, see\nDescribeMountTargets and DeleteMountTarget.\n The DeleteFileSystem call returns while the file system state is still\ndeleting. You can check the file system deletion status by calling the\nDescribeFileSystems operation, which returns a list of file systems in your\naccount. If you pass file system ID or creation token for the deleted file\nsystem, the DescribeFileSystems returns a 404 FileSystemNotFound error.\n This operation requires permissions for the elasticfilesystem:DeleteFileSystem\naction." ([delete-file-system-request] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "DELETE" "/2015-02-01/file-systems/{FileSystemId}" delete-file-system-request :portkey.aws.elasticfilesystem/delete-file-system-request {:payload nil, :move {}, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "FileSystemInUse" :portkey.aws.elasticfilesystem/file-system-in-use})))
(clojure.spec.alpha/fdef delete-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-file-system-request) :ret clojure.core/true?)
