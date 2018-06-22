(ns portkey.aws.workdocs (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "workdocs", :region "ap-northeast-1"},
    :ssl-common-name "workdocs.ap-northeast-1.amazonaws.com",
    :endpoint "https://workdocs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "workdocs", :region "eu-west-1"},
    :ssl-common-name "workdocs.eu-west-1.amazonaws.com",
    :endpoint "https://workdocs.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "workdocs", :region "ap-southeast-2"},
    :ssl-common-name "workdocs.ap-southeast-2.amazonaws.com",
    :endpoint "https://workdocs.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "workdocs", :region "ap-southeast-1"},
    :ssl-common-name "workdocs.ap-southeast-1.amazonaws.com",
    :endpoint "https://workdocs.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "workdocs", :region "us-west-2"},
    :ssl-common-name "workdocs.us-west-2.amazonaws.com",
    :endpoint "https://workdocs.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "workdocs", :region "us-east-1"},
    :ssl-common-name "workdocs.us-east-1.amazonaws.com",
    :endpoint "https://workdocs.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/parent-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/thread-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/text (clojure.spec.alpha/and :portkey.aws.workdocs/comment-text-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/visibility (clojure.spec.alpha/and :portkey.aws.workdocs/comment-visibility-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/notify-collaborators (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-comment-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.create-comment-request/DocumentId :portkey.aws.workdocs.create-comment-request/VersionId :portkey.aws.workdocs.create-comment-request/Text] :opt-un [:portkey.aws.workdocs.create-comment-request/AuthenticationToken :portkey.aws.workdocs.create-comment-request/ParentId :portkey.aws.workdocs.create-comment-request/ThreadId :portkey.aws.workdocs.create-comment-request/Visibility :portkey.aws.workdocs.create-comment-request/NotifyCollaborators] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.deactivate-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.deactivate-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/deactivate-user-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.deactivate-user-request/UserId] :opt-un [:portkey.aws.workdocs.deactivate-user-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-user-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs/User] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-source-url-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/document-source-type :portkey.aws.workdocs/url-type))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w+-.@]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/principal-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"USER" "USER", "ORGANIZATION" "ORGANIZATION", :group "GROUP", :organization "ORGANIZATION", "INVITE" "INVITE", :anonymous "ANONYMOUS", :invite "INVITE", "ANONYMOUS" "ANONYMOUS", :user "USER", "GROUP" "GROUP"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/latest-version-size (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/signature (clojure.spec.alpha/and :portkey.aws.workdocs/hash-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/labels (clojure.spec.alpha/and :portkey.aws.workdocs/shared-labels))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/size (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/creator-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/resource-state (clojure.spec.alpha/and :portkey.aws.workdocs/resource-state-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.folder-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/folder-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.folder-metadata/CreatedTimestamp :portkey.aws.workdocs.folder-metadata/ParentFolderId :portkey.aws.workdocs.folder-metadata/ModifiedTimestamp :portkey.aws.workdocs.folder-metadata/LatestVersionSize :portkey.aws.workdocs.folder-metadata/Signature :portkey.aws.workdocs.folder-metadata/Labels :portkey.aws.workdocs.folder-metadata/Size :portkey.aws.workdocs.folder-metadata/CreatorId :portkey.aws.workdocs.folder-metadata/Name :portkey.aws.workdocs.folder-metadata/ResourceState :portkey.aws.workdocs.folder-metadata/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.notification-options/send-email (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.notification-options/email-message (clojure.spec.alpha/and :portkey.aws.workdocs/message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/notification-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.notification-options/SendEmail :portkey.aws.workdocs.notification-options/EmailMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-path-component/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-path-component/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-path-component (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-path-component/Id :portkey.aws.workdocs.resource-path-component/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/role-permission-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DIRECT" "DIRECT", :direct "DIRECT", "INHERITED" "INHERITED", :inherited "INHERITED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/group-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/group-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/deactivating-last-system-user-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/time-zone-id (clojure.spec.alpha/and :portkey.aws.workdocs/time-zone-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/type (clojure.spec.alpha/and :portkey.aws.workdocs/user-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/locale (clojure.spec.alpha/and :portkey.aws.workdocs/locale-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/surname (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/grant-poweruser-privileges (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-enum-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/given-name (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/storage-rule (clojure.spec.alpha/and :portkey.aws.workdocs/storage-rule-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-user-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.update-user-request/UserId] :opt-un [:portkey.aws.workdocs.update-user-request/TimeZoneId :portkey.aws.workdocs.update-user-request/Type :portkey.aws.workdocs.update-user-request/Locale :portkey.aws.workdocs.update-user-request/Surname :portkey.aws.workdocs.update-user-request/GrantPoweruserPrivileges :portkey.aws.workdocs.update-user-request/GivenName :portkey.aws.workdocs.update-user-request/StorageRule :portkey.aws.workdocs.update-user-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-status-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"INITIALIZED" "INITIALIZED", :initialized "INITIALIZED", "ACTIVE" "ACTIVE", :active "ACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/creator-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/latest-version-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/resource-state (clojure.spec.alpha/and :portkey.aws.workdocs/resource-state-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/labels (clojure.spec.alpha/and :portkey.aws.workdocs/shared-labels))
(clojure.spec.alpha/def :portkey.aws.workdocs/document-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.document-metadata/Id :portkey.aws.workdocs.document-metadata/CreatorId :portkey.aws.workdocs.document-metadata/ParentFolderId :portkey.aws.workdocs.document-metadata/CreatedTimestamp :portkey.aws.workdocs.document-metadata/ModifiedTimestamp :portkey.aws.workdocs.document-metadata/LatestVersionMetadata :portkey.aws.workdocs.document-metadata/ResourceState :portkey.aws.workdocs.document-metadata/Labels] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-response/path (clojure.spec.alpha/and :portkey.aws.workdocs/resource-path))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-path-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.get-folder-path-response/Path] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-response/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.get-document-version-response/Metadata :portkey.aws.workdocs.get-document-version-response/CustomMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-request/include-custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.get-document-request/DocumentId] :opt-un [:portkey.aws.workdocs.get-document-request/AuthenticationToken :portkey.aws.workdocs.get-document-request/IncludeCustomMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-folder-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.create-folder-response/Metadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/search-query (clojure.spec.alpha/and :portkey.aws.workdocs/search-query-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/positive-integer-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.describe-groups-request/SearchQuery] :opt-un [:portkey.aws.workdocs.describe-groups-request/AuthenticationToken :portkey.aws.workdocs.describe-groups-request/OrganizationId :portkey.aws.workdocs.describe-groups-request/Marker :portkey.aws.workdocs.describe-groups-request/Limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/search-query-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 512)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\u0020-\uFFFF]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-request/include-custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.get-folder-request/FolderId] :opt-un [:portkey.aws.workdocs.get-folder-request/AuthenticationToken :portkey.aws.workdocs.get-folder-request/IncludeCustomMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-response/share-results (clojure.spec.alpha/and :portkey.aws.workdocs/share-results-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/add-resource-permissions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.add-resource-permissions-response/ShareResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/include (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-document-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.describe-document-versions-request/DocumentId] :opt-un [:portkey.aws.workdocs.describe-document-versions-request/AuthenticationToken :portkey.aws.workdocs.describe-document-versions-request/Marker :portkey.aws.workdocs.describe-document-versions-request/Limit :portkey.aws.workdocs.describe-document-versions-request/Include :portkey.aws.workdocs.describe-document-versions-request/Fields] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.comment/recipient-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/visibility (clojure.spec.alpha/and :portkey.aws.workdocs/comment-visibility-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/parent-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/status (clojure.spec.alpha/and :portkey.aws.workdocs/comment-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/comment-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/thread-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/text (clojure.spec.alpha/and :portkey.aws.workdocs/comment-text-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/contributor (clojure.spec.alpha/and :portkey.aws.workdocs/user))
(clojure.spec.alpha/def :portkey.aws.workdocs/comment (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.comment/CommentId] :opt-un [:portkey.aws.workdocs.comment/RecipientId :portkey.aws.workdocs.comment/CreatedTimestamp :portkey.aws.workdocs.comment/Visibility :portkey.aws.workdocs.comment/ParentId :portkey.aws.workdocs.comment/Status :portkey.aws.workdocs.comment/ThreadId :portkey.aws.workdocs.comment/Text :portkey.aws.workdocs.comment/Contributor] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\u0000-\u00FF]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-custom-metadata-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.group-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.group-metadata/name (clojure.spec.alpha/and :portkey.aws.workdocs/group-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/group-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.group-metadata/Id :portkey.aws.workdocs.group-metadata/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/start-time (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/end-time (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-activities-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-activities-request/AuthenticationToken :portkey.aws.workdocs.describe-activities-request/StartTime :portkey.aws.workdocs.describe-activities-request/EndTime :portkey.aws.workdocs.describe-activities-request/OrganizationId :portkey.aws.workdocs.describe-activities-request/UserId :portkey.aws.workdocs.describe-activities-request/Limit :portkey.aws.workdocs.describe-activities-request/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-path-component-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/resource-path-component) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/positive-size-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workdocs.activate-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activate-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/activate-user-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.activate-user-request/UserId] :opt-un [:portkey.aws.workdocs.activate-user-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.remove-all-resource-permissions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.remove-all-resource-permissions-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/remove-all-resource-permissions-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.remove-all-resource-permissions-request/ResourceId] :opt-un [:portkey.aws.workdocs.remove-all-resource-permissions-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-path-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.get-document-path-request/DocumentId] :opt-un [:portkey.aws.workdocs.get-document-path-request/AuthenticationToken :portkey.aws.workdocs.get-document-path-request/Limit :portkey.aws.workdocs.get-document-path-request/Fields :portkey.aws.workdocs.get-document-path-request/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/comment-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-comment-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-comment-request/DocumentId :portkey.aws.workdocs.delete-comment-request/VersionId :portkey.aws.workdocs.delete-comment-request/CommentId] :opt-un [:portkey.aws.workdocs.delete-comment-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/locale-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:fr "fr", :ja "ja", "en" "en", :es "es", "zh_CN" "zh_CN", :default "default", "zh_TW" "zh_TW", :ko "ko", :zh-tw "zh_TW", "fr" "fr", :pt-br "pt_BR", "de" "de", :en "en", "ru" "ru", "es" "es", :de "de", "ja" "ja", :ru "ru", :zh-cn "zh_CN", "ko" "ko", "default" "default", "pt_BR" "pt_BR"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/keys (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-key-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/delete-all (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-custom-metadata-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-custom-metadata-request/ResourceId] :opt-un [:portkey.aws.workdocs.delete-custom-metadata-request/AuthenticationToken :portkey.aws.workdocs.delete-custom-metadata-request/VersionId :portkey.aws.workdocs.delete-custom-metadata-request/Keys :portkey.aws.workdocs.delete-custom-metadata-request/DeleteAll] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-response/comments (clojure.spec.alpha/and :portkey.aws.workdocs/comment-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-comments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-comments-response/Comments :portkey.aws.workdocs.describe-comments-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/user-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._+-/=][a-zA-Z0-9 ._+-/=]*" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-response/groups (clojure.spec.alpha/and :portkey.aws.workdocs/group-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-groups-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-groups-response/Groups :portkey.aws.workdocs.describe-groups-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-request/principals (clojure.spec.alpha/and :portkey.aws.workdocs/share-principal-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/add-resource-permissions-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.add-resource-permissions-request/ResourceId :portkey.aws.workdocs.add-resource-permissions-request/Principals] :opt-un [:portkey.aws.workdocs.add-resource-permissions-request/AuthenticationToken :portkey.aws.workdocs/NotificationOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/type (clojure.spec.alpha/and :portkey.aws.workdocs/resource-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/original-name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/owner (clojure.spec.alpha/and :portkey.aws.workdocs/user-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/parent-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-metadata/Type :portkey.aws.workdocs.resource-metadata/Name :portkey.aws.workdocs.resource-metadata/OriginalName :portkey.aws.workdocs.resource-metadata/Id :portkey.aws.workdocs.resource-metadata/VersionId :portkey.aws.workdocs.resource-metadata/Owner :portkey.aws.workdocs.resource-metadata/ParentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-activities (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/activity) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-comments-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.describe-comments-request/DocumentId :portkey.aws.workdocs.describe-comments-request/VersionId] :opt-un [:portkey.aws.workdocs.describe-comments-request/AuthenticationToken :portkey.aws.workdocs.describe-comments-request/Limit :portkey.aws.workdocs.describe-comments-request/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/email-address-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/signed-header-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/header-name-type :portkey.aws.workdocs/header-value-type))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-ids-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2000)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[&\w+-.@, ]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.entity-not-exists-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.entity-not-exists-exception/entity-ids (clojure.spec.alpha/and :portkey.aws.workdocs/entity-id-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/entity-not-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.entity-not-exists-exception/Message :portkey.aws.workdocs.entity-not-exists-exception/EntityIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/share-principal-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/share-principal) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.failed-dependency-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/failed-dependency-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.failed-dependency-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"MINIMALUSER" "MINIMALUSER", "USER" "USER", :admin "ADMIN", :poweruser "POWERUSER", "POWERUSER" "POWERUSER", :workspacesuser "WORKSPACESUSER", "ADMIN" "ADMIN", :minimaluser "MINIMALUSER", "WORKSPACESUSER" "WORKSPACESUSER", :user "USER"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.too-many-labels-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/too-many-labels-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.too-many-labels-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-status-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DRAFT" "DRAFT", :draft "DRAFT", "PUBLISHED" "PUBLISHED", :published "PUBLISHED", "DELETED" "DELETED", :deleted "DELETED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.activity/type (clojure.spec.alpha/and :portkey.aws.workdocs/activity-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/time-stamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/initiator (clojure.spec.alpha/and :portkey.aws.workdocs/user-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/original-parent (clojure.spec.alpha/and :portkey.aws.workdocs/resource-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs/activity (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.activity/Type :portkey.aws.workdocs.activity/TimeStamp :portkey.aws.workdocs.activity/OrganizationId :portkey.aws.workdocs.activity/Initiator :portkey.aws.workdocs/Participants :portkey.aws.workdocs/ResourceMetadata :portkey.aws.workdocs.activity/OriginalParent :portkey.aws.workdocs/CommentMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.user/username (clojure.spec.alpha/and :portkey.aws.workdocs/username-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/storage (clojure.spec.alpha/and :portkey.aws.workdocs/user-storage-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/time-zone-id (clojure.spec.alpha/and :portkey.aws.workdocs/time-zone-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/type (clojure.spec.alpha/and :portkey.aws.workdocs/user-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/locale (clojure.spec.alpha/and :portkey.aws.workdocs/locale-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/surname (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/recycle-bin-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/status (clojure.spec.alpha/and :portkey.aws.workdocs/user-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/given-name (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/root-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/email-address (clojure.spec.alpha/and :portkey.aws.workdocs/email-address-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/user (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.user/Username :portkey.aws.workdocs.user/Storage :portkey.aws.workdocs.user/CreatedTimestamp :portkey.aws.workdocs.user/TimeZoneId :portkey.aws.workdocs.user/Type :portkey.aws.workdocs.user/Locale :portkey.aws.workdocs.user/Surname :portkey.aws.workdocs.user/RecycleBinFolderId :portkey.aws.workdocs.user/OrganizationId :portkey.aws.workdocs.user/Status :portkey.aws.workdocs.user/ModifiedTimestamp :portkey.aws.workdocs.user/GivenName :portkey.aws.workdocs.user/RootFolderId :portkey.aws.workdocs.user/EmailAddress :portkey.aws.workdocs.user/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-notification-subscription-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-notification-subscription-request/endpoint (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-end-point-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-notification-subscription-request/protocol (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-protocol-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-notification-subscription-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.create-notification-subscription-request/OrganizationId :portkey.aws.workdocs.create-notification-subscription-request/Endpoint :portkey.aws.workdocs.create-notification-subscription-request/Protocol :portkey.aws.workdocs/SubscriptionType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/comment) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-source-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ORIGINAL" "ORIGINAL", :original "ORIGINAL", "WITH_COMMENTS" "WITH_COMMENTS", :with-comments "WITH_COMMENTS"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.service-unavailable-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.invalid-password-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/invalid-password-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.invalid-password-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/username-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w\-+.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z]+)?" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/folder-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/folder-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-protocol-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"HTTPS" "HTTPS", :https "HTTPS"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/source (clojure.spec.alpha/and :portkey.aws.workdocs/document-source-url-map))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/content-modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/status (clojure.spec.alpha/and :portkey.aws.workdocs/document-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/content-type (clojure.spec.alpha/and :portkey.aws.workdocs/document-content-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/signature (clojure.spec.alpha/and :portkey.aws.workdocs/hash-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/content-created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/thumbnail (clojure.spec.alpha/and :portkey.aws.workdocs/document-thumbnail-url-map))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/size (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/creator-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-version-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.document-version-metadata/CreatedTimestamp :portkey.aws.workdocs.document-version-metadata/Source :portkey.aws.workdocs.document-version-metadata/ContentModifiedTimestamp :portkey.aws.workdocs.document-version-metadata/Status :portkey.aws.workdocs.document-version-metadata/ModifiedTimestamp :portkey.aws.workdocs.document-version-metadata/ContentType :portkey.aws.workdocs.document-version-metadata/Signature :portkey.aws.workdocs.document-version-metadata/ContentCreatedTimestamp :portkey.aws.workdocs.document-version-metadata/Thumbnail :portkey.aws.workdocs.document-version-metadata/Size :portkey.aws.workdocs.document-version-metadata/CreatorId :portkey.aws.workdocs.document-version-metadata/Name :portkey.aws.workdocs.document-version-metadata/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/share-status-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"SUCCESS" "SUCCESS", :success "SUCCESS", "FAILURE" "FAILURE", :failure "FAILURE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/size-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workdocs/group-name-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/principal-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-resource-permissions-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.describe-resource-permissions-request/ResourceId] :opt-un [:portkey.aws.workdocs.describe-resource-permissions-request/AuthenticationToken :portkey.aws.workdocs.describe-resource-permissions-request/PrincipalId :portkey.aws.workdocs.describe-resource-permissions-request/Limit :portkey.aws.workdocs.describe-resource-permissions-request/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/error-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workdocs.custom-metadata-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.custom-metadata-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-visibility-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"PUBLIC" "PUBLIC", :public "PUBLIC", "PRIVATE" "PRIVATE", :private "PRIVATE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-notification-subscriptions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-notification-subscriptions-response/Subscriptions :portkey.aws.workdocs.describe-notification-subscriptions-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-folder-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.create-folder-request/ParentFolderId] :opt-un [:portkey.aws.workdocs.create-folder-request/AuthenticationToken :portkey.aws.workdocs.create-folder-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/username (clojure.spec.alpha/and :portkey.aws.workdocs/username-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/given-name (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/surname (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/email-address (clojure.spec.alpha/and :portkey.aws.workdocs/email-address-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/user-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.user-metadata/Id :portkey.aws.workdocs.user-metadata/Username :portkey.aws.workdocs.user-metadata/GivenName :portkey.aws.workdocs.user-metadata/Surname :portkey.aws.workdocs.user-metadata/EmailAddress] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/update-user-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs/User] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.entity-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/entity-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.entity-already-exists-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/principal-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/principal) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.workdocs.invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/invalid-operation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.invalid-operation-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.too-many-subscriptions-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/too-many-subscriptions-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.too-many-subscriptions-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/organization-user-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/user) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs.unauthorized-resource-access-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/unauthorized-resource-access-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.unauthorized-resource-access-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/activate-user-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs/User] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/shared-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 32)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._+-/=][a-zA-Z0-9 ._+-/=]*" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 4 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 32)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-activities-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs/UserActivities :portkey.aws.workdocs.describe-activities-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-sort-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"STORAGE_LIMIT" "STORAGE_LIMIT", :user-status "USER_STATUS", :storage-limit "STORAGE_LIMIT", :user-name "USER_NAME", "USER_STATUS" "USER_STATUS", :storage-used "STORAGE_USED", :full-name "FULL_NAME", "FULL_NAME" "FULL_NAME", "STORAGE_USED" "STORAGE_USED", "USER_NAME" "USER_NAME"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.upload-metadata/upload-url (clojure.spec.alpha/and :portkey.aws.workdocs/url-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.upload-metadata/signed-headers (clojure.spec.alpha/and :portkey.aws.workdocs/signed-header-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/upload-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.upload-metadata/UploadUrl :portkey.aws.workdocs.upload-metadata/SignedHeaders] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.prohibited-state-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/prohibited-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.prohibited-state-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/activity-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DOCUMENT_REVERTED" "DOCUMENT_REVERTED", :document-comment-added "DOCUMENT_COMMENT_ADDED", :folder-share-permission-changed "FOLDER_SHARE_PERMISSION_CHANGED", "FOLDER_SHAREABLE_LINK_CREATED" "FOLDER_SHAREABLE_LINK_CREATED", "DOCUMENT_SHARE_PERMISSION_CHANGED" "DOCUMENT_SHARE_PERMISSION_CHANGED", :folder-shareable-link-permission-changed "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED", :folder-recycled "FOLDER_RECYCLED", "DOCUMENT_SHAREABLE_LINK_REMOVED" "DOCUMENT_SHAREABLE_LINK_REMOVED", "FOLDER_RESTORED" "FOLDER_RESTORED", "FOLDER_SHAREABLE_LINK_REMOVED" "FOLDER_SHAREABLE_LINK_REMOVED", "DOCUMENT_COMMENT_DELETED" "DOCUMENT_COMMENT_DELETED", "FOLDER_RECYCLED" "FOLDER_RECYCLED", :document-annotation-deleted "DOCUMENT_ANNOTATION_DELETED", :document-unshared "DOCUMENT_UNSHARED", :document-share-permission-changed "DOCUMENT_SHARE_PERMISSION_CHANGED", "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED" "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED", :folder-moved "FOLDER_MOVED", :folder-shared "FOLDER_SHARED", :folder-renamed "FOLDER_RENAMED", "DOCUMENT_RESTORED" "DOCUMENT_RESTORED", "DOCUMENT_UNSHARED" "DOCUMENT_UNSHARED", :document-comment-deleted "DOCUMENT_COMMENT_DELETED", :document-annotation-added "DOCUMENT_ANNOTATION_ADDED", :folder-deleted "FOLDER_DELETED", :folder-unshared "FOLDER_UNSHARED", "DOCUMENT_ANNOTATION_DELETED" "DOCUMENT_ANNOTATION_DELETED", "DOCUMENT_RENAMED" "DOCUMENT_RENAMED", :document-shared "DOCUMENT_SHARED", "FOLDER_CREATED" "FOLDER_CREATED", "FOLDER_MOVED" "FOLDER_MOVED", :document-version-uploaded "DOCUMENT_VERSION_UPLOADED", "FOLDER_DELETED" "FOLDER_DELETED", :folder-shareable-link-removed "FOLDER_SHAREABLE_LINK_REMOVED", "FOLDER_RENAMED" "FOLDER_RENAMED", "DOCUMENT_SHARED" "DOCUMENT_SHARED", :document-version-deleted "DOCUMENT_VERSION_DELETED", "FOLDER_SHARE_PERMISSION_CHANGED" "FOLDER_SHARE_PERMISSION_CHANGED", :document-restored "DOCUMENT_RESTORED", :document-shareable-link-permission-changed "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED", :folder-shareable-link-created "FOLDER_SHAREABLE_LINK_CREATED", :document-reverted "DOCUMENT_REVERTED", "DOCUMENT_ANNOTATION_ADDED" "DOCUMENT_ANNOTATION_ADDED", "DOCUMENT_VERSION_UPLOADED" "DOCUMENT_VERSION_UPLOADED", "DOCUMENT_COMMENT_ADDED" "DOCUMENT_COMMENT_ADDED", "DOCUMENT_SHAREABLE_LINK_CREATED" "DOCUMENT_SHAREABLE_LINK_CREATED", :document-moved "DOCUMENT_MOVED", "FOLDER_SHARED" "FOLDER_SHARED", :document-shareable-link-created "DOCUMENT_SHAREABLE_LINK_CREATED", "DOCUMENT_VERSION_DELETED" "DOCUMENT_VERSION_DELETED", "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED" "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED", :document-renamed "DOCUMENT_RENAMED", :folder-created "FOLDER_CREATED", "DOCUMENT_CHECKED_IN" "DOCUMENT_CHECKED_IN", :document-checked-in "DOCUMENT_CHECKED_IN", "FOLDER_UNSHARED" "FOLDER_UNSHARED", "DOCUMENT_RECYCLED" "DOCUMENT_RECYCLED", "DOCUMENT_MOVED" "DOCUMENT_MOVED", "DOCUMENT_CHECKED_OUT" "DOCUMENT_CHECKED_OUT", :folder-restored "FOLDER_RESTORED", :document-shareable-link-removed "DOCUMENT_SHAREABLE_LINK_REMOVED", :document-recycled "DOCUMENT_RECYCLED", :document-checked-out "DOCUMENT_CHECKED_OUT"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-status-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE", "PENDING" "PENDING", :pending "PENDING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/page-marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-response/principals (clojure.spec.alpha/and :portkey.aws.workdocs/principal-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-resource-permissions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-resource-permissions-response/Principals :portkey.aws.workdocs.describe-resource-permissions-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/resource-state (clojure.spec.alpha/and :portkey.aws.workdocs/resource-state-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-document-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.update-document-request/DocumentId] :opt-un [:portkey.aws.workdocs.update-document-request/AuthenticationToken :portkey.aws.workdocs.update-document-request/Name :portkey.aws.workdocs.update-document-request/ParentFolderId :portkey.aws.workdocs.update-document-request/ResourceState] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/subscription :max-count 256) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-notification-subscription-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs/Subscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.remove-resource-permission-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.remove-resource-permission-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.remove-resource-permission-request/principal-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/remove-resource-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.remove-resource-permission-request/ResourceId :portkey.aws.workdocs.remove-resource-permission-request/PrincipalId] :opt-un [:portkey.aws.workdocs.remove-resource-permission-request/AuthenticationToken :portkey.aws.workdocs/PrincipalType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-already-checked-out-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-already-checked-out-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-already-checked-out-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-response/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.get-folder-response/Metadata :portkey.aws.workdocs.get-folder-response/CustomMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/unauthorized-operation-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-end-point-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.workdocs/authentication-header-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 8199))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-path-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.get-folder-path-request/FolderId] :opt-un [:portkey.aws.workdocs.get-folder-path-request/AuthenticationToken :portkey.aws.workdocs.get-folder-path-request/Limit :portkey.aws.workdocs.get-folder-path-request/Fields :portkey.aws.workdocs.get-folder-path-request/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-thumbnail-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"SMALL" "SMALL", :small "SMALL", "SMALL_HQ" "SMALL_HQ", :small-hq "SMALL_HQ", "LARGE" "LARGE", :large "LARGE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.participants/users (clojure.spec.alpha/and :portkey.aws.workdocs/user-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.participants/groups (clojure.spec.alpha/and :portkey.aws.workdocs/group-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/participants (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.participants/Users :portkey.aws.workdocs.participants/Groups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 56)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._+-/=][a-zA-Z0-9 ._+-/=]*" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\u0020-\u202D\u202F-\uFFFF]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-sort-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DATE" "DATE", :date "DATE", "NAME" "NAME", :name "NAME"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-labels-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/time-zone-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-filter-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ALL" "ALL", :all "ALL", "ACTIVE_PENDING" "ACTIVE_PENDING", :active-pending "ACTIVE_PENDING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[&\w+-.@]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ALL" "ALL", :all "ALL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-comment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs/Comment] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/delete-labels-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-response/users (clojure.spec.alpha/and :portkey.aws.workdocs/organization-user-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-response/total-number-of-users (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-users-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-users-response/Users :portkey.aws.workdocs.describe-users-response/TotalNumberOfUsers :portkey.aws.workdocs.describe-users-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.storage-rule-type/storage-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.workdocs/positive-size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/storage-rule-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.storage-rule-type/StorageAllocatedInBytes :portkey.aws.workdocs/StorageType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"FOLDER" "FOLDER", :folder "FOLDER", "DOCUMENT" "DOCUMENT", :document "DOCUMENT"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/invalid-argument-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.invalid-argument-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-contents-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-contents-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-folder-contents-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-folder-contents-request/FolderId] :opt-un [:portkey.aws.workdocs.delete-folder-contents-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w+-.@]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-current-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-current-user-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.get-current-user-request/AuthenticationToken] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-state-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "RESTORING" "RESTORING", :restoring "RESTORING", "RECYCLING" "RECYCLING", :recycling "RECYCLING", "RECYCLED" "RECYCLED", :recycled "RECYCLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-document-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-document-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-document-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-document-request/DocumentId] :opt-un [:portkey.aws.workdocs.delete-document-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-path/components (clojure.spec.alpha/and :portkey.aws.workdocs/resource-path-component-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-path (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-path/Components] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/storage-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"UNLIMITED" "UNLIMITED", :unlimited "UNLIMITED", "QUOTA" "QUOTA", :quota "QUOTA"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/version-status (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-status))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-document-version-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.update-document-version-request/DocumentId :portkey.aws.workdocs.update-document-version-request/VersionId] :opt-un [:portkey.aws.workdocs.update-document-version-request/AuthenticationToken :portkey.aws.workdocs.update-document-version-request/VersionStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/get-current-user-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs/User] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-folder-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-folder-request/FolderId] :opt-un [:portkey.aws.workdocs.delete-folder-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/document-version-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/username (clojure.spec.alpha/and :portkey.aws.workdocs/username-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/time-zone-id (clojure.spec.alpha/and :portkey.aws.workdocs/time-zone-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/password (clojure.spec.alpha/and :portkey.aws.workdocs/password-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/surname (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/given-name (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/storage-rule (clojure.spec.alpha/and :portkey.aws.workdocs/storage-rule-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/email-address (clojure.spec.alpha/and :portkey.aws.workdocs/email-address-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-user-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.create-user-request/Username :portkey.aws.workdocs.create-user-request/GivenName :portkey.aws.workdocs.create-user-request/Surname :portkey.aws.workdocs.create-user-request/Password] :opt-un [:portkey.aws.workdocs.create-user-request/TimeZoneId :portkey.aws.workdocs.create-user-request/OrganizationId :portkey.aws.workdocs.create-user-request/StorageRule :portkey.aws.workdocs.create-user-request/EmailAddress :portkey.aws.workdocs.create-user-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/document-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w+-.@]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-root-folders-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.describe-root-folders-request/AuthenticationToken] :opt-un [:portkey.aws.workdocs.describe-root-folders-request/Limit :portkey.aws.workdocs.describe-root-folders-request/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-response/folders (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-response/documents (clojure.spec.alpha/and :portkey.aws.workdocs/document-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-folder-contents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-folder-contents-response/Folders :portkey.aws.workdocs.describe-folder-contents-response/Documents :portkey.aws.workdocs.describe-folder-contents-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/positive-integer-type (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.storage-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/storage-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.storage-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-labels-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-labels-request/labels (clojure.spec.alpha/and :portkey.aws.workdocs/shared-labels))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-labels-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-labels-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.create-labels-request/ResourceId :portkey.aws.workdocs.create-labels-request/Labels] :opt-un [:portkey.aws.workdocs.create-labels-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.subscription/subscription-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.subscription/end-point (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-end-point-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.subscription/protocol (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-protocol-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/subscription (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.subscription/SubscriptionId :portkey.aws.workdocs.subscription/EndPoint :portkey.aws.workdocs.subscription/Protocol] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/hash-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[&\w+-.@]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-user-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-user-request/UserId] :opt-un [:portkey.aws.workdocs.delete-user-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.permission-info/role (clojure.spec.alpha/and :portkey.aws.workdocs/role-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.permission-info/type (clojure.spec.alpha/and :portkey.aws.workdocs/role-permission-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/permission-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.permission-info/Role :portkey.aws.workdocs.permission-info/Type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/folder-content-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ALL" "ALL", :all "ALL", "DOCUMENT" "DOCUMENT", :document "DOCUMENT", "FOLDER" "FOLDER", :folder "FOLDER"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-thumbnail-url-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/document-thumbnail-type :portkey.aws.workdocs/url-type))

(clojure.spec.alpha/def :portkey.aws.workdocs/permission-info-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/permission-info) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs/limit-type (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 999))))

(clojure.spec.alpha/def :portkey.aws.workdocs/field-names-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w,]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/header-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs/initiate-document-version-upload-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.initiate-document-version-upload-response/Metadata :portkey.aws.workdocs/UploadMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-response/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.get-document-response/Metadata :portkey.aws.workdocs.get-document-response/CustomMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/order-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ASCENDING" "ASCENDING", :ascending "ASCENDING", "DESCENDING" "DESCENDING", :descending "DESCENDING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs/entity-id-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/id-type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs.share-principal/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-principal/type (clojure.spec.alpha/and :portkey.aws.workdocs/principal-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-principal/role (clojure.spec.alpha/and :portkey.aws.workdocs/role-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/share-principal (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.share-principal/Id :portkey.aws.workdocs.share-principal/Type :portkey.aws.workdocs.share-principal/Role] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/boolean-enum-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"TRUE" "TRUE", :true "TRUE", "FALSE" "FALSE", :false "FALSE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/concurrent-modification-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.concurrent-modification-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.document-locked-for-comments-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/document-locked-for-comments-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.document-locked-for-comments-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-response/path (clojure.spec.alpha/and :portkey.aws.workdocs/resource-path))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-path-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.get-document-path-response/Path] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/content-created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/content-modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/content-type (clojure.spec.alpha/and :portkey.aws.workdocs/document-content-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/document-size-in-bytes (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/initiate-document-version-upload-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.initiate-document-version-upload-request/ParentFolderId] :opt-un [:portkey.aws.workdocs.initiate-document-version-upload-request/AuthenticationToken :portkey.aws.workdocs.initiate-document-version-upload-request/Id :portkey.aws.workdocs.initiate-document-version-upload-request/Name :portkey.aws.workdocs.initiate-document-version-upload-request/ContentCreatedTimestamp :portkey.aws.workdocs.initiate-document-version-upload-request/ContentModifiedTimestamp :portkey.aws.workdocs.initiate-document-version-upload-request/ContentType :portkey.aws.workdocs.initiate-document-version-upload-request/DocumentSizeInBytes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/principal-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/role (clojure.spec.alpha/and :portkey.aws.workdocs/role-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/status (clojure.spec.alpha/and :portkey.aws.workdocs/share-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/share-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/status-message (clojure.spec.alpha/and :portkey.aws.workdocs/message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/share-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.share-result/PrincipalId :portkey.aws.workdocs.share-result/Role :portkey.aws.workdocs.share-result/Status :portkey.aws.workdocs.share-result/ShareId :portkey.aws.workdocs.share-result/StatusMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.principal/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.principal/type (clojure.spec.alpha/and :portkey.aws.workdocs/principal-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.principal/roles (clojure.spec.alpha/and :portkey.aws.workdocs/permission-info-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/principal (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.principal/Id :portkey.aws.workdocs.principal/Type :portkey.aws.workdocs.principal/Roles] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-text-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-attribute-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-response/folders (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-root-folders-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-root-folders-response/Folders :portkey.aws.workdocs.describe-root-folders-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/custom-metadata-key-type :max-count 8) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-response/document-versions (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-document-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-document-versions-response/DocumentVersions :portkey.aws.workdocs.describe-document-versions-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/shared-labels (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/shared-label :max-count 20) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-notification-subscription-request/subscription-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-notification-subscription-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-notification-subscription-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-notification-subscription-request/SubscriptionId :portkey.aws.workdocs.delete-notification-subscription-request/OrganizationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/share-results-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.workdocs/share-result) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.workdocs.user-storage-metadata/storage-utilized-in-bytes (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-storage-metadata/storage-rule (clojure.spec.alpha/and :portkey.aws.workdocs/storage-rule-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/user-storage-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.user-storage-metadata/StorageUtilizedInBytes :portkey.aws.workdocs.user-storage-metadata/StorageRule] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.draft-upload-out-of-sync-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/draft-upload-out-of-sync-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.draft-upload-out-of-sync-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-custom-metadata-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.create-custom-metadata-request/ResourceId :portkey.aws.workdocs.create-custom-metadata-request/CustomMetadata] :opt-un [:portkey.aws.workdocs.create-custom-metadata-request/AuthenticationToken :portkey.aws.workdocs.create-custom-metadata-request/VersionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/sort (clojure.spec.alpha/and :portkey.aws.workdocs/resource-sort-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/order (clojure.spec.alpha/and :portkey.aws.workdocs/order-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/type (clojure.spec.alpha/and :portkey.aws.workdocs/folder-content-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/include (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-folder-contents-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.describe-folder-contents-request/FolderId] :opt-un [:portkey.aws.workdocs.describe-folder-contents-request/AuthenticationToken :portkey.aws.workdocs.describe-folder-contents-request/Sort :portkey.aws.workdocs.describe-folder-contents-request/Order :portkey.aws.workdocs.describe-folder-contents-request/Limit :portkey.aws.workdocs.describe-folder-contents-request/Marker :portkey.aws.workdocs.describe-folder-contents-request/Type :portkey.aws.workdocs.describe-folder-contents-request/Include] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/resource-state (clojure.spec.alpha/and :portkey.aws.workdocs/resource-state-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-folder-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.update-folder-request/FolderId] :opt-un [:portkey.aws.workdocs.update-folder-request/AuthenticationToken :portkey.aws.workdocs.update-folder-request/Name :portkey.aws.workdocs.update-folder-request/ParentFolderId :portkey.aws.workdocs.update-folder-request/ResourceState] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.storage-limit-will-exceed-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/storage-limit-will-exceed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.storage-limit-will-exceed-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/labels (clojure.spec.alpha/and :portkey.aws.workdocs/shared-labels))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/delete-all (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-labels-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.delete-labels-request/ResourceId] :opt-un [:portkey.aws.workdocs.delete-labels-request/AuthenticationToken :portkey.aws.workdocs.delete-labels-request/Labels :portkey.aws.workdocs.delete-labels-request/DeleteAll] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/delete-custom-metadata-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/user-ids (clojure.spec.alpha/and :portkey.aws.workdocs/user-ids-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/sort (clojure.spec.alpha/and :portkey.aws.workdocs/user-sort-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/order (clojure.spec.alpha/and :portkey.aws.workdocs/order-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/query (clojure.spec.alpha/and :portkey.aws.workdocs/search-query-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/include (clojure.spec.alpha/and :portkey.aws.workdocs/user-filter-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-users-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-users-request/UserIds :portkey.aws.workdocs.describe-users-request/Sort :portkey.aws.workdocs.describe-users-request/Order :portkey.aws.workdocs.describe-users-request/Fields :portkey.aws.workdocs.describe-users-request/Marker :portkey.aws.workdocs.describe-users-request/OrganizationId :portkey.aws.workdocs.describe-users-request/Limit :portkey.aws.workdocs.describe-users-request/Query :portkey.aws.workdocs.describe-users-request/Include :portkey.aws.workdocs.describe-users-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/include-custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-version-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.get-document-version-request/DocumentId :portkey.aws.workdocs.get-document-version-request/VersionId] :opt-un [:portkey.aws.workdocs.get-document-version-request/AuthenticationToken :portkey.aws.workdocs.get-document-version-request/Fields :portkey.aws.workdocs.get-document-version-request/IncludeCustomMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/custom-metadata-key-type :portkey.aws.workdocs/custom-metadata-value-type))

(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/comment-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/contributor (clojure.spec.alpha/and :portkey.aws.workdocs/user))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/comment-status (clojure.spec.alpha/and :portkey.aws.workdocs/comment-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/recipient-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/comment-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.comment-metadata/CommentId :portkey.aws.workdocs.comment-metadata/Contributor :portkey.aws.workdocs.comment-metadata/CreatedTimestamp :portkey.aws.workdocs.comment-metadata/CommentStatus :portkey.aws.workdocs.comment-metadata/RecipientId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/role-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"VIEWER" "VIEWER", :viewer "VIEWER", "CONTRIBUTOR" "CONTRIBUTOR", :contributor "CONTRIBUTOR", "OWNER" "OWNER", :owner "OWNER", "COOWNER" "COOWNER", :coowner "COOWNER"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.workdocs.abort-document-version-upload-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.abort-document-version-upload-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.abort-document-version-upload-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/abort-document-version-upload-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.abort-document-version-upload-request/DocumentId :portkey.aws.workdocs.abort-document-version-upload-request/VersionId] :opt-un [:portkey.aws.workdocs.abort-document-version-upload-request/AuthenticationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/header-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.workdocs.illegal-user-state-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/illegal-user-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.workdocs.illegal-user-state-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.workdocs/boolean-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-notification-subscriptions-request (portkey.aws/json-keys :req-un [:portkey.aws.workdocs.describe-notification-subscriptions-request/OrganizationId] :opt-un [:portkey.aws.workdocs.describe-notification-subscriptions-request/Marker :portkey.aws.workdocs.describe-notification-subscriptions-request/Limit] :locations {}))

(clojure.core/defn create-folder "Creates a folder with the specified name and parent folder." ([create-folder-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "POST" "/api/v1/folders" create-folder-request :portkey.aws.workdocs/create-folder-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {}} 201 :portkey.aws.workdocs/create-folder-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "LimitExceededException" :portkey.aws.workdocs/limit-exceeded-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-folder-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-folder-response))

(clojure.core/defn get-folder-path "Retrieves the path information (the hierarchy from the root folder) for the\nspecified folder.\n By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the\nrequested folder and only includes the IDs of the parent folders in the path.\nYou can limit the maximum number of levels. You can also request the parent\nfolder names." ([get-folder-path-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/folders/{FolderId}/path" get-folder-path-request :portkey.aws.workdocs/get-folder-path-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"FolderId" "FolderId"}, :querystring {"limit" "Limit", "fields" "Fields", "marker" "Marker"}} 200 :portkey.aws.workdocs/get-folder-path-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-folder-path :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-folder-path-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-folder-path-response))

(clojure.core/defn remove-all-resource-permissions "Removes all the permissions from the specified resource." ([remove-all-resource-permissions-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/resources/{ResourceId}/permissions" remove-all-resource-permissions-request :portkey.aws.workdocs/remove-all-resource-permissions-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId"}, :querystring {}} 204 nil {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef remove-all-resource-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/remove-all-resource-permissions-request) :ret clojure.core/true?)

(clojure.core/defn get-document-version "Retrieves version metadata for the specified document." ([get-document-version-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/documents/{DocumentId}/versions/{VersionId}" get-document-version-request :portkey.aws.workdocs/get-document-version-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId", "VersionId" "VersionId"}, :querystring {"fields" "Fields", "includeCustomMetadata" "IncludeCustomMetadata"}} 200 :portkey.aws.workdocs/get-document-version-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "InvalidPasswordException" :portkey.aws.workdocs/invalid-password-exception})))
(clojure.spec.alpha/fdef get-document-version :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-document-version-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-document-version-response))

(clojure.core/defn get-document "Retrieves details of a document." ([get-document-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/documents/{DocumentId}" get-document-request :portkey.aws.workdocs/get-document-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId"}, :querystring {"includeCustomMetadata" "IncludeCustomMetadata"}} 200 :portkey.aws.workdocs/get-document-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "InvalidPasswordException" :portkey.aws.workdocs/invalid-password-exception})))
(clojure.spec.alpha/fdef get-document :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-document-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-document-response))

(clojure.core/defn describe-folder-contents "Describes the contents of the specified folder, including its documents and\nsubfolders.\n By default, Amazon WorkDocs returns the first 100 active document and folder\nmetadata items. If there are more results, the response includes a marker that\nyou can use to request the next set of results. You can also request initialized\ndocuments." ([describe-folder-contents-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/folders/{FolderId}/contents" describe-folder-contents-request :portkey.aws.workdocs/describe-folder-contents-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"FolderId" "FolderId"}, :querystring {"sort" "Sort", "order" "Order", "limit" "Limit", "marker" "Marker", "type" "Type", "include" "Include"}} 200 :portkey.aws.workdocs/describe-folder-contents-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception})))
(clojure.spec.alpha/fdef describe-folder-contents :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-folder-contents-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-folder-contents-response))

(clojure.core/defn delete-labels "Deletes the specified list of labels from a resource." ([delete-labels-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/resources/{ResourceId}/labels" delete-labels-request :portkey.aws.workdocs/delete-labels-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId"}, :querystring {"labels" "Labels", "deleteAll" "DeleteAll"}} 200 :portkey.aws.workdocs/delete-labels-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-labels :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/delete-labels-response))

(clojure.core/defn describe-notification-subscriptions "Lists the specified notification subscriptions." ([describe-notification-subscriptions-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/organizations/{OrganizationId}/subscriptions" describe-notification-subscriptions-request :portkey.aws.workdocs/describe-notification-subscriptions-request {:payload nil, :move {}, :headers {}, :uri {"OrganizationId" "OrganizationId"}, :querystring {"marker" "Marker", "limit" "Limit"}} 200 :portkey.aws.workdocs/describe-notification-subscriptions-response {"UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-notification-subscriptions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-notification-subscriptions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-notification-subscriptions-response))

(clojure.core/defn describe-root-folders "Describes the current user's special folders; the RootFolder and the RecycleBin.\nRootFolder is the root of user's files and folders and RecycleBin is the root of\nrecycled items. This is not a valid action for SigV4 (administrative API)\nclients." ([describe-root-folders-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/me/root" describe-root-folders-request :portkey.aws.workdocs/describe-root-folders-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {"limit" "Limit", "marker" "Marker"}} 200 :portkey.aws.workdocs/describe-root-folders-response {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-root-folders :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-root-folders-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-root-folders-response))

(clojure.core/defn add-resource-permissions "Creates a set of permissions for the specified folder or document. The resource\npermissions are overwritten if the principals already have different\npermissions." ([add-resource-permissions-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "POST" "/api/v1/resources/{ResourceId}/permissions" add-resource-permissions-request :portkey.aws.workdocs/add-resource-permissions-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId"}, :querystring {}} 201 :portkey.aws.workdocs/add-resource-permissions-response {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef add-resource-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/add-resource-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/add-resource-permissions-response))

(clojure.core/defn describe-document-versions "Retrieves the document versions for the specified document.\n By default, only active versions are returned." ([describe-document-versions-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/documents/{DocumentId}/versions" describe-document-versions-request :portkey.aws.workdocs/describe-document-versions-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId"}, :querystring {"marker" "Marker", "limit" "Limit", "include" "Include", "fields" "Fields"}} 200 :portkey.aws.workdocs/describe-document-versions-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception})))
(clojure.spec.alpha/fdef describe-document-versions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-document-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-document-versions-response))

(clojure.core/defn delete-user "Deletes the specified user from a Simple AD or Microsoft AD directory." ([delete-user-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/users/{UserId}" delete-user-request :portkey.aws.workdocs/delete-user-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"UserId" "UserId"}, :querystring {}} 204 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user "Creates a user in a Simple AD or Microsoft AD directory. The status of a newly\ncreated user is \"ACTIVE\". New users can access Amazon WorkDocs." ([create-user-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "POST" "/api/v1/users" create-user-request :portkey.aws.workdocs/create-user-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {}} 201 :portkey.aws.workdocs/create-user-response {"EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-user-response))

(clojure.core/defn describe-resource-permissions "Describes the permissions of a specified resource." ([describe-resource-permissions-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/resources/{ResourceId}/permissions" describe-resource-permissions-request :portkey.aws.workdocs/describe-resource-permissions-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId"}, :querystring {"principalId" "PrincipalId", "limit" "Limit", "marker" "Marker"}} 200 :portkey.aws.workdocs/describe-resource-permissions-response {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-resource-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-resource-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-resource-permissions-response))

(clojure.core/defn describe-users "Describes the specified users. You can describe all users or filter the results\n(for example, by status or organization).\n By default, Amazon WorkDocs returns the first 24 active or pending users. If\nthere are more results, the response includes a marker that you can use to\nrequest the next set of results." ([] (describe-users {})) ([describe-users-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/users" describe-users-request :portkey.aws.workdocs/describe-users-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {"userIds" "UserIds", "query" "Query", "sort" "Sort", "limit" "Limit", "include" "Include", "order" "Order", "organizationId" "OrganizationId", "fields" "Fields", "marker" "Marker"}} 200 :portkey.aws.workdocs/describe-users-response {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception})))
(clojure.spec.alpha/fdef describe-users :args (clojure.spec.alpha/? :portkey.aws.workdocs/describe-users-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-users-response))

(clojure.core/defn get-document-path "Retrieves the path information (the hierarchy from the root folder) for the\nrequested document.\n By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the\nrequested document and only includes the IDs of the parent folders in the path.\nYou can limit the maximum number of levels. You can also request the names of\nthe parent folders." ([get-document-path-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/documents/{DocumentId}/path" get-document-path-request :portkey.aws.workdocs/get-document-path-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId"}, :querystring {"limit" "Limit", "fields" "Fields", "marker" "Marker"}} 200 :portkey.aws.workdocs/get-document-path-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-document-path :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-document-path-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-document-path-response))

(clojure.core/defn remove-resource-permission "Removes the permission for the specified principal from the specified resource." ([remove-resource-permission-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/resources/{ResourceId}/permissions/{PrincipalId}" remove-resource-permission-request :portkey.aws.workdocs/remove-resource-permission-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId", "PrincipalId" "PrincipalId"}, :querystring {"type" "PrincipalType"}} 204 nil {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef remove-resource-permission :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/remove-resource-permission-request) :ret clojure.core/true?)

(clojure.core/defn update-document-version "Changes the status of the document version to ACTIVE.\n Amazon WorkDocs also sets its document container to ACTIVE. This is the last\nstep in a document upload, after the client uploads the document to an\nS3-presigned URL returned by InitiateDocumentVersionUpload." ([update-document-version-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "PATCH" "/api/v1/documents/{DocumentId}/versions/{VersionId}" update-document-version-request :portkey.aws.workdocs/update-document-version-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId", "VersionId" "VersionId"}, :querystring {}} 200 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception, "InvalidOperationException" :portkey.aws.workdocs/invalid-operation-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef update-document-version :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-document-version-request) :ret clojure.core/true?)

(clojure.core/defn get-folder "Retrieves the metadata of the specified folder." ([get-folder-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/folders/{FolderId}" get-folder-request :portkey.aws.workdocs/get-folder-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"FolderId" "FolderId"}, :querystring {"includeCustomMetadata" "IncludeCustomMetadata"}} 200 :portkey.aws.workdocs/get-folder-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception})))
(clojure.spec.alpha/fdef get-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-folder-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-folder-response))

(clojure.core/defn abort-document-version-upload "Aborts the upload of the specified document version that was previously\ninitiated by InitiateDocumentVersionUpload. The client should make this call\nonly when it no longer intends to upload the document version, or fails to do\nso." ([abort-document-version-upload-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/documents/{DocumentId}/versions/{VersionId}" abort-document-version-upload-request :portkey.aws.workdocs/abort-document-version-upload-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId", "VersionId" "VersionId"}, :querystring {}} 204 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef abort-document-version-upload :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/abort-document-version-upload-request) :ret clojure.core/true?)

(clojure.core/defn describe-comments "List all the comments for the specified document version." ([describe-comments-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/documents/{DocumentId}/versions/{VersionId}/comments" describe-comments-request :portkey.aws.workdocs/describe-comments-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId", "VersionId" "VersionId"}, :querystring {"limit" "Limit", "marker" "Marker"}} 200 :portkey.aws.workdocs/describe-comments-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-comments :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-comments-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-comments-response))

(clojure.core/defn create-comment "Adds a new comment to the specified document version." ([create-comment-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "POST" "/api/v1/documents/{DocumentId}/versions/{VersionId}/comment" create-comment-request :portkey.aws.workdocs/create-comment-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId", "VersionId" "VersionId"}, :querystring {}} 201 :portkey.aws.workdocs/create-comment-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "DocumentLockedForCommentsException" :portkey.aws.workdocs/document-locked-for-comments-exception})))
(clojure.spec.alpha/fdef create-comment :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-comment-response))

(clojure.core/defn delete-notification-subscription "Deletes the specified subscription from the specified organization." ([delete-notification-subscription-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/organizations/{OrganizationId}/subscriptions/{SubscriptionId}" delete-notification-subscription-request :portkey.aws.workdocs/delete-notification-subscription-request {:payload nil, :move {}, :headers {}, :uri {"SubscriptionId" "SubscriptionId", "OrganizationId" "OrganizationId"}, :querystring {}} 200 nil {"UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception})))
(clojure.spec.alpha/fdef delete-notification-subscription :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-notification-subscription-request) :ret clojure.core/true?)

(clojure.core/defn initiate-document-version-upload "Creates a new document object and version object.\n The client specifies the parent folder ID and name of the document to upload.\nThe ID is optionally specified when creating a new version of an existing\ndocument. This is the first step to upload a document. Next, upload the document\nto the URL returned from the call, and then call UpdateDocumentVersion.\n To cancel the document upload, call AbortDocumentVersionUpload." ([initiate-document-version-upload-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "POST" "/api/v1/documents" initiate-document-version-upload-request :portkey.aws.workdocs/initiate-document-version-upload-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {}} 201 :portkey.aws.workdocs/initiate-document-version-upload-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ResourceAlreadyCheckedOutException" :portkey.aws.workdocs/resource-already-checked-out-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "StorageLimitExceededException" :portkey.aws.workdocs/storage-limit-exceeded-exception, "DraftUploadOutOfSyncException" :portkey.aws.workdocs/draft-upload-out-of-sync-exception, "StorageLimitWillExceedException" :portkey.aws.workdocs/storage-limit-will-exceed-exception})))
(clojure.spec.alpha/fdef initiate-document-version-upload :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/initiate-document-version-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/initiate-document-version-upload-response))

(clojure.core/defn create-notification-subscription "Configure WorkDocs to use Amazon SNS notifications.\n The endpoint receives a confirmation message, and must confirm the\nsubscription. For more information, see Confirm the Subscription\n(http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.confirm)\nin the Amazon Simple Notification Service Developer Guide." ([create-notification-subscription-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "POST" "/api/v1/organizations/{OrganizationId}/subscriptions" create-notification-subscription-request :portkey.aws.workdocs/create-notification-subscription-request {:payload nil, :move {}, :headers {}, :uri {"OrganizationId" "OrganizationId"}, :querystring {}} 200 :portkey.aws.workdocs/create-notification-subscription-response {"UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "TooManySubscriptionsException" :portkey.aws.workdocs/too-many-subscriptions-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-notification-subscription :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-notification-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-notification-subscription-response))

(clojure.core/defn get-current-user "Retrieves details of the current user for whom the authentication token was\ngenerated. This is not a valid action for SigV4 (administrative API) clients." ([get-current-user-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/me" get-current-user-request :portkey.aws.workdocs/get-current-user-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.workdocs/get-current-user-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-current-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-current-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-current-user-response))

(clojure.core/defn create-labels "Adds the specified list of labels to the given resource (a document or folder)" ([create-labels-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "PUT" "/api/v1/resources/{ResourceId}/labels" create-labels-request :portkey.aws.workdocs/create-labels-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId"}, :querystring {}} 200 :portkey.aws.workdocs/create-labels-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "TooManyLabelsException" :portkey.aws.workdocs/too-many-labels-exception})))
(clojure.spec.alpha/fdef create-labels :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-labels-response))

(clojure.core/defn create-custom-metadata "Adds one or more custom properties to the specified resource (a folder,\ndocument, or version)." ([create-custom-metadata-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "PUT" "/api/v1/resources/{ResourceId}/customMetadata" create-custom-metadata-request :portkey.aws.workdocs/create-custom-metadata-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId"}, :querystring {"versionid" "VersionId"}} 200 :portkey.aws.workdocs/create-custom-metadata-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "CustomMetadataLimitExceededException" :portkey.aws.workdocs/custom-metadata-limit-exceeded-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-custom-metadata :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-custom-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-custom-metadata-response))

(clojure.core/defn delete-folder-contents "Deletes the contents of the specified folder." ([delete-folder-contents-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/folders/{FolderId}/contents" delete-folder-contents-request :portkey.aws.workdocs/delete-folder-contents-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"FolderId" "FolderId"}, :querystring {}} 204 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-folder-contents :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-folder-contents-request) :ret clojure.core/true?)

(clojure.core/defn describe-groups "Describes the groups specified by query." ([describe-groups-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/groups" describe-groups-request :portkey.aws.workdocs/describe-groups-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {"searchQuery" "SearchQuery", "organizationId" "OrganizationId", "marker" "Marker", "limit" "Limit"}} 200 :portkey.aws.workdocs/describe-groups-response {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-groups :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-groups-response))

(clojure.core/defn activate-user "Activates the specified user. Only active users can access Amazon WorkDocs." ([activate-user-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "POST" "/api/v1/users/{UserId}/activation" activate-user-request :portkey.aws.workdocs/activate-user-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"UserId" "UserId"}, :querystring {}} 200 :portkey.aws.workdocs/activate-user-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef activate-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/activate-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/activate-user-response))

(clojure.core/defn deactivate-user "Deactivates the specified user, which revokes the user's access to Amazon\nWorkDocs." ([deactivate-user-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/users/{UserId}/activation" deactivate-user-request :portkey.aws.workdocs/deactivate-user-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"UserId" "UserId"}, :querystring {}} 204 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef deactivate-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/deactivate-user-request) :ret clojure.core/true?)

(clojure.core/defn update-document "Updates the specified attributes of a document. The user must have access to\nboth the document and its parent folder, if applicable." ([update-document-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "PATCH" "/api/v1/documents/{DocumentId}" update-document-request :portkey.aws.workdocs/update-document-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId"}, :querystring {}} 200 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "LimitExceededException" :portkey.aws.workdocs/limit-exceeded-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception})))
(clojure.spec.alpha/fdef update-document :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-document-request) :ret clojure.core/true?)

(clojure.core/defn delete-folder "Permanently deletes the specified folder and its contents." ([delete-folder-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/folders/{FolderId}" delete-folder-request :portkey.aws.workdocs/delete-folder-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"FolderId" "FolderId"}, :querystring {}} 204 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-folder-request) :ret clojure.core/true?)

(clojure.core/defn delete-document "Permanently deletes the specified document and its associated metadata." ([delete-document-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/documents/{DocumentId}" delete-document-request :portkey.aws.workdocs/delete-document-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId"}, :querystring {}} 204 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-document :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-document-request) :ret clojure.core/true?)

(clojure.core/defn delete-custom-metadata "Deletes custom metadata from the specified resource." ([delete-custom-metadata-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/resources/{ResourceId}/customMetadata" delete-custom-metadata-request :portkey.aws.workdocs/delete-custom-metadata-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"ResourceId" "ResourceId"}, :querystring {"versionId" "VersionId", "keys" "Keys", "deleteAll" "DeleteAll"}} 200 :portkey.aws.workdocs/delete-custom-metadata-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-custom-metadata :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-custom-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/delete-custom-metadata-response))

(clojure.core/defn delete-comment "Deletes the specified comment from the document version." ([delete-comment-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "DELETE" "/api/v1/documents/{DocumentId}/versions/{VersionId}/comment/{CommentId}" delete-comment-request :portkey.aws.workdocs/delete-comment-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"DocumentId" "DocumentId", "VersionId" "VersionId", "CommentId" "CommentId"}, :querystring {}} 204 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "DocumentLockedForCommentsException" :portkey.aws.workdocs/document-locked-for-comments-exception})))
(clojure.spec.alpha/fdef delete-comment :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-comment-request) :ret clojure.core/true?)

(clojure.core/defn update-user "Updates the specified attributes of the specified user, and grants or revokes\nadministrative privileges to the Amazon WorkDocs site." ([update-user-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "PATCH" "/api/v1/users/{UserId}" update-user-request :portkey.aws.workdocs/update-user-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"UserId" "UserId"}, :querystring {}} 200 :portkey.aws.workdocs/update-user-response {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "IllegalUserStateException" :portkey.aws.workdocs/illegal-user-state-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "DeactivatingLastSystemUserException" :portkey.aws.workdocs/deactivating-last-system-user-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception})))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/update-user-response))

(clojure.core/defn update-folder "Updates the specified attributes of the specified folder. The user must have\naccess to both the folder and its parent folder, if applicable." ([update-folder-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "PATCH" "/api/v1/folders/{FolderId}" update-folder-request :portkey.aws.workdocs/update-folder-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {"FolderId" "FolderId"}, :querystring {}} 200 nil {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "LimitExceededException" :portkey.aws.workdocs/limit-exceeded-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception})))
(clojure.spec.alpha/fdef update-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-folder-request) :ret clojure.core/true?)

(clojure.core/defn describe-activities "Describes the user activities in a specified time period." ([] (describe-activities {})) ([describe-activities-request] (portkey.aws/-rest-json-call portkey.aws.workdocs/endpoints "GET" "/api/v1/activities" describe-activities-request :portkey.aws.workdocs/describe-activities-request {:payload nil, :move {}, :headers {"AuthenticationToken" ["Authentication" nil]}, :uri {}, :querystring {"startTime" "StartTime", "endTime" "EndTime", "organizationId" "OrganizationId", "userId" "UserId", "limit" "Limit", "marker" "Marker"}} 200 :portkey.aws.workdocs/describe-activities-response {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-activities :args (clojure.spec.alpha/? :portkey.aws.workdocs/describe-activities-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-activities-response))
