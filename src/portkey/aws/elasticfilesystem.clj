(ns portkey.aws.elasticfilesystem (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope
    {"service" "elasticfilesystem", "region" "eu-west-1"},
    :sslCommonName "elasticfilesystem.eu-west-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "elasticfilesystem", "region" "us-east-2"},
    :sslCommonName "elasticfilesystem.us-east-2.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "elasticfilesystem", "region" "ap-southeast-2"},
    :sslCommonName "elasticfilesystem.ap-southeast-2.amazonaws.com",
    :endpoint
    "https://elasticfilesystem.ap-southeast-2.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "elasticfilesystem", "region" "eu-central-1"},
    :sslCommonName "elasticfilesystem.eu-central-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.eu-central-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "elasticfilesystem", "region" "us-west-2"},
    :sslCommonName "elasticfilesystem.us-west-2.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "elasticfilesystem", "region" "us-east-1"},
    :sslCommonName "elasticfilesystem.us-east-1.amazonaws.com",
    :endpoint "https://elasticfilesystem.us-east-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag-key :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-file-system-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/CreationToken] :opt-un [:portkey.aws.elasticfilesystem/PerformanceMode :portkey.aws.elasticfilesystem/Encrypted :portkey.aws.elasticfilesystem/KmsKeyId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.unsupported-availability-zone/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/unsupported-availability-zone (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.unsupported-availability-zone/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-tags-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-response (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/Tags] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-tags-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem/CreationToken :portkey.aws.elasticfilesystem/FileSystemId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.bad-request/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/bad-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.bad-request/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-count (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44539__44540__auto__] (clojure.core/<= 0 p1__44539__44540__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-file-system-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-mount-target-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/SubnetId] :opt-un [:portkey.aws.elasticfilesystem/IpAddress :portkey.aws.elasticfilesystem/SecurityGroups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.ip-address-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address-in-use (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.ip-address-in-use/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/security-group :max-count 5))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/life-cycle-state (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"creating" "creating", :creating "creating", "available" "available", :available "available", "deleting" "deleting", :deleting "deleting", "deleted" "deleted", :deleted "deleted"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-limit-exceeded (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/size-in-bytes (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/number-of-mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-count))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/creation-time (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-description/name (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-description (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem.file-system-description/OwnerId :portkey.aws.elasticfilesystem/CreationToken :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem.file-system-description/CreationTime :portkey.aws.elasticfilesystem/LifeCycleState :portkey.aws.elasticfilesystem.file-system-description/NumberOfMountTargets :portkey.aws.elasticfilesystem.file-system-description/SizeInBytes :portkey.aws.elasticfilesystem/PerformanceMode] :opt-un [:portkey.aws.elasticfilesystem/Encrypted :portkey.aws.elasticfilesystem/KmsKeyId :portkey.aws.elasticfilesystem.file-system-description/Name]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/TagKeys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/tag :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-conflict/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-conflict (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.mount-target-conflict/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/file-systems (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-file-systems-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-file-systems-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-file-systems-response/FileSystems :portkey.aws.elasticfilesystem.describe-file-systems-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-limit-exceeded (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.security-group-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-not-found (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.mount-target-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-mount-target-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-mount-target-state (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.incorrect-mount-target-state/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.subnet-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/subnet-not-found (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.subnet-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__)))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/mount-targets (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/mount-target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.describe-mount-targets-response/next-marker (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/marker))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem.describe-mount-targets-response/MountTargets :portkey.aws.elasticfilesystem.describe-mount-targets-response/NextMarker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-not-found (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.dependency-timeout/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/dependency-timeout (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.dependency-timeout/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/create-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/Tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/SecurityGroups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-in-use/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-in-use (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.file-system-in-use/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/aws-account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-size/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/file-system-size-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem.file-system-size/Value] :opt-un [:portkey.aws.elasticfilesystem/Timestamp]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.mount-target-description/owner-id (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-description (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/SubnetId :portkey.aws.elasticfilesystem/LifeCycleState] :opt-un [:portkey.aws.elasticfilesystem.mount-target-description/OwnerId :portkey.aws.elasticfilesystem/IpAddress :portkey.aws.elasticfilesystem/NetworkInterfaceId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.file-system-already-exists/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-already-exists (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode :portkey.aws.elasticfilesystem/FileSystemId] :opt-un [:portkey.aws.elasticfilesystem.file-system-already-exists/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/file-system-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.incorrect-file-system-life-cycle-state/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticfilesystem/mount-target-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/max-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44539__44540__auto__] (clojure.core/<= 1 p1__44539__44540__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/delete-mount-target-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.security-group-not-found/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/security-group-not-found (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.security-group-not-found/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/describe-mount-targets-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.elasticfilesystem/MaxItems :portkey.aws.elasticfilesystem/Marker :portkey.aws.elasticfilesystem/FileSystemId :portkey.aws.elasticfilesystem/MountTargetId]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/key (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.tag/value (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/tag (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem.tag/Key :portkey.aws.elasticfilesystem.tag/Value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.network-interface-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/network-interface-limit-exceeded (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.network-interface-limit-exceeded/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/internal-server-error (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.internal-server-error/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/mount-target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/creation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/performance-mode (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"generalPurpose" "generalPurpose", :general-purpose "generalPurpose", "maxIO" "maxIO", :maxio "maxIO"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/message (clojure.spec.alpha/and :portkey.aws.elasticfilesystem/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/ErrorCode] :opt-un [:portkey.aws.elasticfilesystem.no-free-addresses-in-subnet/Message]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/modify-mount-target-security-groups-request (portkey.awsgen/json-keys :req-un [:portkey.aws.elasticfilesystem/MountTargetId] :opt-un [:portkey.aws.elasticfilesystem/SecurityGroups]))

(clojure.spec.alpha/def :portkey.aws.elasticfilesystem/file-system-size-value clojure.core/int?)

(clojure.core/defn describe-mount-target-security-groups ([input__47307__auto__] (describe-mount-target-security-groups input__47307__auto__ portkey.aws/*http-client*)) ([input48169 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/mount-targets/{MountTargetId}/security-groups"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/DescribeMountTargetSecurityGroupsRequest input48169)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"MountTargetId" "MountTargetId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48168] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state}] (if (clojure.core/= 200 (:status response48168)) (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/describe-mount-target-security-groups-response (:body response48168)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48168 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48168)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48168}))))))))))

(clojure.core/defn describe-file-systems ([input__47307__auto__] (describe-file-systems input__47307__auto__ portkey.aws/*http-client*)) ([input48171 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/file-systems"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/DescribeFileSystemsRequest input48171)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"MaxItems" "MaxItems", "Marker" "Marker", "CreationToken" "CreationToken", "FileSystemId" "FileSystemId"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48170] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}] (if (clojure.core/= 200 (:status response48170)) (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/describe-file-systems-response (:body response48170)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48170 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48170)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48170}))))))))))

(clojure.core/defn modify-mount-target-security-groups ([input__47307__auto__] (modify-mount-target-security-groups input__47307__auto__ portkey.aws/*http-client*)) ([input48173 http-client__47308__auto__] (clojure.core/-> {:method "PUT", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/mount-targets/{MountTargetId}/security-groups"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/ModifyMountTargetSecurityGroupsRequest input48173)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"MountTargetId" "MountTargetId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48172] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found, "IncorrectMountTargetState" :portkey.aws.elasticfilesystem/incorrect-mount-target-state, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found}] (if (clojure.core/= 204 (:status response48172)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48172 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48172)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48172}))))))))))

(clojure.core/defn delete-tags ([input__47307__auto__] (delete-tags input__47307__auto__ portkey.aws/*http-client*)) ([input48175 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/delete-tags/{FileSystemId}"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/DeleteTagsRequest input48175)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FileSystemId" "FileSystemId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48174] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}] (if (clojure.core/= 204 (:status response48174)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48174 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48174)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48174}))))))))))

(clojure.core/defn create-tags ([input__47307__auto__] (create-tags input__47307__auto__ portkey.aws/*http-client*)) ([input48177 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/create-tags/{FileSystemId}"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/CreateTagsRequest input48177)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FileSystemId" "FileSystemId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48176] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}] (if (clojure.core/= 204 (:status response48176)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48176 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48176)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48176}))))))))))

(clojure.core/defn create-mount-target ([input__47307__auto__] (create-mount-target input__47307__auto__ portkey.aws/*http-client*)) ([input48179 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/mount-targets"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/CreateMountTargetRequest input48179)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48178] (clojure.core/let [errors__47310__auto__ {"UnsupportedAvailabilityZone" :portkey.aws.elasticfilesystem/unsupported-availability-zone, "BadRequest" :portkey.aws.elasticfilesystem/bad-request, "IpAddressInUse" :portkey.aws.elasticfilesystem/ip-address-in-use, "MountTargetConflict" :portkey.aws.elasticfilesystem/mount-target-conflict, "SecurityGroupLimitExceeded" :portkey.aws.elasticfilesystem/security-group-limit-exceeded, "SubnetNotFound" :portkey.aws.elasticfilesystem/subnet-not-found, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "IncorrectFileSystemLifeCycleState" :portkey.aws.elasticfilesystem/incorrect-file-system-life-cycle-state, "SecurityGroupNotFound" :portkey.aws.elasticfilesystem/security-group-not-found, "NetworkInterfaceLimitExceeded" :portkey.aws.elasticfilesystem/network-interface-limit-exceeded, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "NoFreeAddressesInSubnet" :portkey.aws.elasticfilesystem/no-free-addresses-in-subnet}] (if (clojure.core/= 200 (:status response48178)) (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/mount-target-description (:body response48178)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48178 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48178)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48178}))))))))))

(clojure.core/defn create-file-system ([input__47307__auto__] (create-file-system input__47307__auto__ portkey.aws/*http-client*)) ([input48181 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/file-systems"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/CreateFileSystemRequest input48181)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48180] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemAlreadyExists" :portkey.aws.elasticfilesystem/file-system-already-exists, "FileSystemLimitExceeded" :portkey.aws.elasticfilesystem/file-system-limit-exceeded}] (if (clojure.core/= 201 (:status response48180)) (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/file-system-description (:body response48180)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48180 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48180)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48180}))))))))))

(clojure.core/defn describe-tags ([input__47307__auto__] (describe-tags input__47307__auto__ portkey.aws/*http-client*)) ([input48183 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/tags/{FileSystemId}/"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/DescribeTagsRequest input48183)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FileSystemId" "FileSystemId"}) (portkey.awsgen/params-to-querystring {"MaxItems" "MaxItems", "Marker" "Marker"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48182] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found}] (if (clojure.core/= 200 (:status response48182)) (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/describe-tags-response (:body response48182)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48182 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48182)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48182}))))))))))

(clojure.core/defn describe-mount-targets ([input__47307__auto__] (describe-mount-targets input__47307__auto__ portkey.aws/*http-client*)) ([input48185 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/mount-targets"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/DescribeMountTargetsRequest input48185)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"MaxItems" "MaxItems", "Marker" "Marker", "FileSystemId" "FileSystemId", "MountTargetId" "MountTargetId"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48184] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found}] (if (clojure.core/= 200 (:status response48184)) (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/describe-mount-targets-response (:body response48184)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48184 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48184)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48184}))))))))))

(clojure.core/defn delete-mount-target ([input__47307__auto__] (delete-mount-target input__47307__auto__ portkey.aws/*http-client*)) ([input48187 http-client__47308__auto__] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/mount-targets/{MountTargetId}"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/DeleteMountTargetRequest input48187)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"MountTargetId" "MountTargetId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48186] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "DependencyTimeout" :portkey.aws.elasticfilesystem/dependency-timeout, "MountTargetNotFound" :portkey.aws.elasticfilesystem/mount-target-not-found}] (if (clojure.core/= 204 (:status response48186)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48186 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48186)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48186}))))))))))

(clojure.core/defn delete-file-system ([input__47307__auto__] (delete-file-system input__47307__auto__ portkey.aws/*http-client*)) ([input48189 http-client__47308__auto__] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-02-01/file-systems/{FileSystemId}"), :body (clojure.spec.alpha/unform :portkey.aws.elasticfilesystem/DeleteFileSystemRequest input48189)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FileSystemId" "FileSystemId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48188] (clojure.core/let [errors__47310__auto__ {"BadRequest" :portkey.aws.elasticfilesystem/bad-request, "InternalServerError" :portkey.aws.elasticfilesystem/internal-server-error, "FileSystemNotFound" :portkey.aws.elasticfilesystem/file-system-not-found, "FileSystemInUse" :portkey.aws.elasticfilesystem/file-system-in-use}] (if (clojure.core/= 204 (:status response48188)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48188 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48188)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48188}))))))))))
