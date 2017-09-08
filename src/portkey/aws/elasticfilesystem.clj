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
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag-key :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-file-system-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/CreationToken] :opt-un [:portkey.aws.elasticfilesystem/PerformanceMode :portkey.aws.elasticfilesystem/Encrypted :portkey.aws.elasticfilesystem/KmsKeyId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.unsupported-availability-zone/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/unsupported-availability-zone (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.unsupported-availability-zone/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-tags-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-response (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/Tags] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-tags-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem/CreationToken :portkey.aws.elasticfilesystem/FileSystemId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.bad-request/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/bad-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.bad-request/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-count (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 0 p1__8188__8189__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-file-system-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-mount-target-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/SubnetId] :opt-un [:portkey.aws.elasticfilesystem/IpAddress :portkey.aws.elasticfilesystem/SecurityGroups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.ip-address-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address-in-use (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.ip-address-in-use/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/security-group :max-count 5))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/life-cycle-state (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"creating" "creating", :creating "creating", "available" "available", :available "available", "deleting" "deleting", :deleting "deleting", "deleted" "deleted", :deleted "deleted"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/size-in-bytes (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/number-of-mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-count))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/creation-time (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/name (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-description (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.file-system-description/OwnerId :portkey.aws.elasticfilesystem/CreationToken :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem.file-system-description/CreationTime :portkey.aws.elasticfilesystem/LifeCycleState :portkey.aws.elasticfilesystem.file-system-description/NumberOfMountTargets :portkey.aws.elasticfilesystem.file-system-description/SizeInBytes :portkey.aws.elasticfilesystem/PerformanceMode] :opt-un [:portkey.aws.elasticfilesystem/Encrypted :portkey.aws.elasticfilesystem/KmsKeyId :portkey.aws.elasticfilesystem.file-system-description/Name]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/TagKeys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-conflict/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-conflict (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.mount-target-conflict/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/file-systems (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-file-systems-response/FileSystems :portkey.aws.elasticfilesystem.describe-file-systems-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.security-group-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.mount-target-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-mount-target-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-mount-target-state (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.incorrect-mount-target-state/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.subnet-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.subnet-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-mount-targets-response/MountTargets :portkey.aws.elasticfilesystem.describe-mount-targets-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.dependency-timeout/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/dependency-timeout (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.dependency-timeout/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/Tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/SecurityGroups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-in-use (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-in-use/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/aws-account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-size/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.file-system-size/Value] :opt-un [:portkey.aws.elasticfilesystem/Timestamp]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-description (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/SubnetId :portkey.aws.elasticfilesystem/LifeCycleState] :opt-un [:portkey.aws.elasticfilesystem.mount-target-description/OwnerId :portkey.aws.elasticfilesystem/IpAddress :portkey.aws.elasticfilesystem/NetworkInterfaceId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-already-exists/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-already-exists (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode :portkey.aws.elasticfilesystem/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem.file-system-already-exists/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/file-system-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/mount-target-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/max-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-mount-target-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-not-found (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.security-group-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/MountTargetId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/key (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem.tag/Key :portkey.aws.elasticfilesystem.tag/Value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.network-interface-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-limit-exceeded (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.network-interface-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/internal-server-error (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.internal-server-error/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/creation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/performance-mode (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"generalPurpose" "generalPurpose", :general-purpose "generalPurpose", "maxIO" "maxIO", :maxio "maxIO"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un [:portkey.aws.elasticfilesystem/SecurityGroups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size-value clojure.core/int?)

(clojure.core/defn describe-mount-target-security-groups [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/mount-targets/{MountTargetId}/security-groups" input__8278__auto__ :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request {:payload nil, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 200 :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state}))
(clojure.spec.alpha/fdef describe-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response))

(clojure.core/defn describe-file-systems [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/file-systems" input__8278__auto__ :portkey.aws.elasticfilesystem/describe-file-systems-request {:payload nil, :headers {}, :uri {}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker", "CreationToken" "CreationToken", "FileSystemId" "FileSystemId"}} 200 :portkey.aws.elasticfilesystem/describe-file-systems-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}))
(clojure.spec.alpha/fdef describe-file-systems :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-file-systems-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-file-systems-response))

(clojure.core/defn modify-mount-target-security-groups [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "PUT" "/2015-02-01/mount-targets/{MountTargetId}/security-groups" input__8278__auto__ :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request {:payload nil, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found}))
(clojure.spec.alpha/fdef modify-mount-target-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request))

(clojure.core/defn delete-tags [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/delete-tags/{FileSystemId}" input__8278__auto__ :portkey.aws.elasticfilesystem/delete-tags-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-tags-request))

(clojure.core/defn create-tags [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/create-tags/{FileSystemId}" input__8278__auto__ :portkey.aws.elasticfilesystem/create-tags-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-tags-request))

(clojure.core/defn create-mount-target [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/mount-targets" input__8278__auto__ :portkey.aws.elasticfilesystem/create-mount-target-request {:payload nil, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.elasticfilesystem/mount-target-description {"UnsupportedAvailabilityZone" :portkey.aws.elasticfilesystem/unsupported-availability-zone, "BadRequest" :portkey.aws.elasticfilesystem/bad-request, "IpAddressInUse" :portkey.aws.elasticfilesystem/ip-address-in-use, "MountTargetConflict" :portkey.aws.elasticfilesystem/mount-target-conflict, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SubnetNotFound" :portkey.aws.elasticfilesystem/subnet-not-found, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found, "NetworkInterfaceLimitExceeded" :portkey.aws.elasticfilesystem/network-interface-limit-exceeded, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "NoFreeAddressesInSubnet" :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet}))
(clojure.spec.alpha/fdef create-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-mount-target-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-description))

(clojure.core/defn create-file-system [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "POST" "/2015-02-01/file-systems" input__8278__auto__ :portkey.aws.elasticfilesystem/create-file-system-request {:payload nil, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.elasticfilesystem/file-system-description {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemAlreadyExists" :portkey.aws.elasticfilesystem/file-system-already-exists, "FileSystemLimitExceeded" :portkey.aws.elasticfilesystem/file-system-limit-exceeded}))
(clojure.spec.alpha/fdef create-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/create-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-description))

(clojure.core/defn describe-tags [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/tags/{FileSystemId}/" input__8278__auto__ :portkey.aws.elasticfilesystem/describe-tags-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker"}} 200 :portkey.aws.elasticfilesystem/describe-tags-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-tags-response))

(clojure.core/defn describe-mount-targets [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "GET" "/2015-02-01/mount-targets" input__8278__auto__ :portkey.aws.elasticfilesystem/describe-mount-targets-request {:payload nil, :headers {}, :uri {}, :querystring {"MaxItems" "MaxItems", "Marker" "Marker", "FileSystemId" "FileSystemId", "MountTargetId" "MountTargetId"}} 200 :portkey.aws.elasticfilesystem/describe-mount-targets-response {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found}))
(clojure.spec.alpha/fdef describe-mount-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/describe-mount-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/describe-mount-targets-response))

(clojure.core/defn delete-mount-target [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "DELETE" "/2015-02-01/mount-targets/{MountTargetId}" input__8278__auto__ :portkey.aws.elasticfilesystem/delete-mount-target-request {:payload nil, :headers {}, :uri {"MountTargetId" "MountTargetId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "DependencyTimeout" :portkey.aws.elasticfilesystem/dependency-timeout, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found}))
(clojure.spec.alpha/fdef delete-mount-target :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-mount-target-request))

(clojure.core/defn delete-file-system [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.elasticfilesystem/endpoints "DELETE" "/2015-02-01/file-systems/{FileSystemId}" input__8278__auto__ :portkey.aws.elasticfilesystem/delete-file-system-request {:payload nil, :headers {}, :uri {"FileSystemId" "FileSystemId"}, :querystring {}} 204 nil {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "FileSystemInUse" :portkey.aws.elasticfilesystem/file-system-in-use}))
(clojure.spec.alpha/fdef delete-file-system :args (clojure.spec.alpha/tuple :portkey.aws.elasticfilesystem/delete-file-system-request))
