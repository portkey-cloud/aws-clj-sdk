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

(clojure.core/declare ser-resource-id-type)

(clojure.core/declare ser-principal-type)

(clojure.core/declare ser-notification-options)

(clojure.core/declare ser-search-query-type)

(clojure.core/declare ser-marker-type)

(clojure.core/declare ser-positive-size-type)

(clojure.core/declare ser-document-content-type)

(clojure.core/declare ser-locale-type)

(clojure.core/declare ser-activity-names-filter-type)

(clojure.core/declare ser-custom-metadata-value-type)

(clojure.core/declare ser-email-address-type)

(clojure.core/declare ser-user-ids-type)

(clojure.core/declare ser-share-principal-list)

(clojure.core/declare ser-user-type)

(clojure.core/declare ser-username-type)

(clojure.core/declare ser-subscription-protocol-type)

(clojure.core/declare ser-size-type)

(clojure.core/declare ser-comment-visibility-type)

(clojure.core/declare ser-shared-label)

(clojure.core/declare ser-password-type)

(clojure.core/declare ser-user-sort-type)

(clojure.core/declare ser-page-marker-type)

(clojure.core/declare ser-timestamp-type)

(clojure.core/declare ser-subscription-end-point-type)

(clojure.core/declare ser-authentication-header-type)

(clojure.core/declare ser-custom-metadata-key-type)

(clojure.core/declare ser-resource-name-type)

(clojure.core/declare ser-resource-sort-type)

(clojure.core/declare ser-time-zone-id-type)

(clojure.core/declare ser-user-filter-type)

(clojure.core/declare ser-id-type)

(clojure.core/declare ser-subscription-type)

(clojure.core/declare ser-storage-rule-type)

(clojure.core/declare ser-comment-id-type)

(clojure.core/declare ser-resource-state-type)

(clojure.core/declare ser-storage-type)

(clojure.core/declare ser-message-type)

(clojure.core/declare ser-document-version-id-type)

(clojure.core/declare ser-positive-integer-type)

(clojure.core/declare ser-folder-content-type)

(clojure.core/declare ser-limit-type)

(clojure.core/declare ser-field-names-type)

(clojure.core/declare ser-document-version-status)

(clojure.core/declare ser-order-type)

(clojure.core/declare ser-share-principal)

(clojure.core/declare ser-boolean-enum-type)

(clojure.core/declare ser-comment-text-type)

(clojure.core/declare ser-resource-collection-type)

(clojure.core/declare ser-user-attribute-value-type)

(clojure.core/declare ser-custom-metadata-key-list)

(clojure.core/declare ser-shared-labels)

(clojure.core/declare ser-custom-metadata-map)

(clojure.core/declare ser-role-type)

(clojure.core/declare ser-boolean-type)

(clojure.core/defn- ser-resource-id-type [input] #:http.request.field{:value input, :shape "ResourceIdType"})

(clojure.core/defn- ser-principal-type [input] #:http.request.field{:value (clojure.core/get {"USER" "USER", "ORGANIZATION" "ORGANIZATION", :group "GROUP", :organization "ORGANIZATION", "INVITE" "INVITE", :anonymous "ANONYMOUS", :invite "INVITE", "ANONYMOUS" "ANONYMOUS", :user "USER", "GROUP" "GROUP"} input), :shape "PrincipalType"})

(clojure.core/defn- ser-notification-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotificationOptions", :type "structure"} (clojure.core/contains? input :send-email) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :send-email)) #:http.request.field{:name "SendEmail", :shape "BooleanType"})) (clojure.core/contains? input :email-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-type (input :email-message)) #:http.request.field{:name "EmailMessage", :shape "MessageType"}))))

(clojure.core/defn- ser-search-query-type [input] #:http.request.field{:value input, :shape "SearchQueryType"})

(clojure.core/defn- ser-marker-type [input] #:http.request.field{:value input, :shape "MarkerType"})

(clojure.core/defn- ser-positive-size-type [input] #:http.request.field{:value input, :shape "PositiveSizeType"})

(clojure.core/defn- ser-document-content-type [input] #:http.request.field{:value input, :shape "DocumentContentType"})

(clojure.core/defn- ser-locale-type [input] #:http.request.field{:value (clojure.core/get {:fr "fr", :ja "ja", "en" "en", :es "es", "zh_CN" "zh_CN", :default "default", "zh_TW" "zh_TW", :ko "ko", :zh-tw "zh_TW", "fr" "fr", :pt-br "pt_BR", "de" "de", :en "en", "ru" "ru", "es" "es", :de "de", "ja" "ja", :ru "ru", :zh-cn "zh_CN", "ko" "ko", "default" "default", "pt_BR" "pt_BR"} input), :shape "LocaleType"})

(clojure.core/defn- ser-activity-names-filter-type [input] #:http.request.field{:value input, :shape "ActivityNamesFilterType"})

(clojure.core/defn- ser-custom-metadata-value-type [input] #:http.request.field{:value input, :shape "CustomMetadataValueType"})

(clojure.core/defn- ser-email-address-type [input] #:http.request.field{:value input, :shape "EmailAddressType"})

(clojure.core/defn- ser-user-ids-type [input] #:http.request.field{:value input, :shape "UserIdsType"})

(clojure.core/defn- ser-share-principal-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-share-principal coll) #:http.request.field{:shape "SharePrincipal"}))) input), :shape "SharePrincipalList", :type "list"})

(clojure.core/defn- ser-user-type [input] #:http.request.field{:value (clojure.core/get {"MINIMALUSER" "MINIMALUSER", "USER" "USER", :admin "ADMIN", :poweruser "POWERUSER", "POWERUSER" "POWERUSER", :workspacesuser "WORKSPACESUSER", "ADMIN" "ADMIN", :minimaluser "MINIMALUSER", "WORKSPACESUSER" "WORKSPACESUSER", :user "USER"} input), :shape "UserType"})

(clojure.core/defn- ser-username-type [input] #:http.request.field{:value input, :shape "UsernameType"})

(clojure.core/defn- ser-subscription-protocol-type [input] #:http.request.field{:value (clojure.core/get {"HTTPS" "HTTPS", :https "HTTPS"} input), :shape "SubscriptionProtocolType"})

(clojure.core/defn- ser-size-type [input] #:http.request.field{:value input, :shape "SizeType"})

(clojure.core/defn- ser-comment-visibility-type [input] #:http.request.field{:value (clojure.core/get {"PUBLIC" "PUBLIC", :public "PUBLIC", "PRIVATE" "PRIVATE", :private "PRIVATE"} input), :shape "CommentVisibilityType"})

(clojure.core/defn- ser-shared-label [input] #:http.request.field{:value input, :shape "SharedLabel"})

(clojure.core/defn- ser-password-type [input] #:http.request.field{:value input, :shape "PasswordType"})

(clojure.core/defn- ser-user-sort-type [input] #:http.request.field{:value (clojure.core/get {"STORAGE_LIMIT" "STORAGE_LIMIT", :user-status "USER_STATUS", :storage-limit "STORAGE_LIMIT", :user-name "USER_NAME", "USER_STATUS" "USER_STATUS", :storage-used "STORAGE_USED", :full-name "FULL_NAME", "FULL_NAME" "FULL_NAME", "STORAGE_USED" "STORAGE_USED", "USER_NAME" "USER_NAME"} input), :shape "UserSortType"})

(clojure.core/defn- ser-page-marker-type [input] #:http.request.field{:value input, :shape "PageMarkerType"})

(clojure.core/defn- ser-timestamp-type [input] #:http.request.field{:value input, :shape "TimestampType"})

(clojure.core/defn- ser-subscription-end-point-type [input] #:http.request.field{:value input, :shape "SubscriptionEndPointType"})

(clojure.core/defn- ser-authentication-header-type [input] #:http.request.field{:value input, :shape "AuthenticationHeaderType"})

(clojure.core/defn- ser-custom-metadata-key-type [input] #:http.request.field{:value input, :shape "CustomMetadataKeyType"})

(clojure.core/defn- ser-resource-name-type [input] #:http.request.field{:value input, :shape "ResourceNameType"})

(clojure.core/defn- ser-resource-sort-type [input] #:http.request.field{:value (clojure.core/get {"DATE" "DATE", :date "DATE", "NAME" "NAME", :name "NAME"} input), :shape "ResourceSortType"})

(clojure.core/defn- ser-time-zone-id-type [input] #:http.request.field{:value input, :shape "TimeZoneIdType"})

(clojure.core/defn- ser-user-filter-type [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL", "ACTIVE_PENDING" "ACTIVE_PENDING", :active-pending "ACTIVE_PENDING"} input), :shape "UserFilterType"})

(clojure.core/defn- ser-id-type [input] #:http.request.field{:value input, :shape "IdType"})

(clojure.core/defn- ser-subscription-type [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL"} input), :shape "SubscriptionType"})

(clojure.core/defn- ser-storage-rule-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StorageRuleType", :type "structure"} (clojure.core/contains? input :storage-allocated-in-bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-size-type (input :storage-allocated-in-bytes)) #:http.request.field{:name "StorageAllocatedInBytes", :shape "PositiveSizeType"})) (clojure.core/contains? input :storage-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-type (input :storage-type)) #:http.request.field{:name "StorageType", :shape "StorageType"}))))

(clojure.core/defn- ser-comment-id-type [input] #:http.request.field{:value input, :shape "CommentIdType"})

(clojure.core/defn- ser-resource-state-type [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "RESTORING" "RESTORING", :restoring "RESTORING", "RECYCLING" "RECYCLING", :recycling "RECYCLING", "RECYCLED" "RECYCLED", :recycled "RECYCLED"} input), :shape "ResourceStateType"})

(clojure.core/defn- ser-storage-type [input] #:http.request.field{:value (clojure.core/get {"UNLIMITED" "UNLIMITED", :unlimited "UNLIMITED", "QUOTA" "QUOTA", :quota "QUOTA"} input), :shape "StorageType"})

(clojure.core/defn- ser-message-type [input] #:http.request.field{:value input, :shape "MessageType"})

(clojure.core/defn- ser-document-version-id-type [input] #:http.request.field{:value input, :shape "DocumentVersionIdType"})

(clojure.core/defn- ser-positive-integer-type [input] #:http.request.field{:value input, :shape "PositiveIntegerType"})

(clojure.core/defn- ser-folder-content-type [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL", "DOCUMENT" "DOCUMENT", :document "DOCUMENT", "FOLDER" "FOLDER", :folder "FOLDER"} input), :shape "FolderContentType"})

(clojure.core/defn- ser-limit-type [input] #:http.request.field{:value input, :shape "LimitType"})

(clojure.core/defn- ser-field-names-type [input] #:http.request.field{:value input, :shape "FieldNamesType"})

(clojure.core/defn- ser-document-version-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE"} input), :shape "DocumentVersionStatus"})

(clojure.core/defn- ser-order-type [input] #:http.request.field{:value (clojure.core/get {"ASCENDING" "ASCENDING", :ascending "ASCENDING", "DESCENDING" "DESCENDING", :descending "DESCENDING"} input), :shape "OrderType"})

(clojure.core/defn- ser-share-principal [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id-type (:id input)) #:http.request.field{:name "Id", :shape "IdType"}) (clojure.core/into (ser-principal-type (:type input)) #:http.request.field{:name "Type", :shape "PrincipalType"}) (clojure.core/into (ser-role-type (:role input)) #:http.request.field{:name "Role", :shape "RoleType"})], :shape "SharePrincipal", :type "structure"}))

(clojure.core/defn- ser-boolean-enum-type [input] #:http.request.field{:value (clojure.core/get {"TRUE" "TRUE", :true "TRUE", "FALSE" "FALSE", :false "FALSE"} input), :shape "BooleanEnumType"})

(clojure.core/defn- ser-comment-text-type [input] #:http.request.field{:value input, :shape "CommentTextType"})

(clojure.core/defn- ser-resource-collection-type [input] #:http.request.field{:value (clojure.core/get {"SHARED_WITH_ME" "SHARED_WITH_ME", :shared-with-me "SHARED_WITH_ME"} input), :shape "ResourceCollectionType"})

(clojure.core/defn- ser-user-attribute-value-type [input] #:http.request.field{:value input, :shape "UserAttributeValueType"})

(clojure.core/defn- ser-custom-metadata-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-metadata-key-type coll) #:http.request.field{:shape "CustomMetadataKeyType"}))) input), :shape "CustomMetadataKeyList", :type "list", :max 8})

(clojure.core/defn- ser-shared-labels [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-shared-label coll) #:http.request.field{:shape "SharedLabel"}))) input), :shape "SharedLabels", :type "list", :max 20})

(clojure.core/defn- ser-custom-metadata-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-custom-metadata-key-type k) #:http.request.field{:map-info "key", :shape "CustomMetadataKeyType"}) (clojure.core/into (ser-custom-metadata-value-type v) #:http.request.field{:map-info "value", :shape "CustomMetadataValueType"})])) input), :shape "CustomMetadataMap", :type "map", :max 8, :min 1})

(clojure.core/defn- ser-role-type [input] #:http.request.field{:value (clojure.core/get {"VIEWER" "VIEWER", :viewer "VIEWER", "CONTRIBUTOR" "CONTRIBUTOR", :contributor "CONTRIBUTOR", "OWNER" "OWNER", :owner "OWNER", "COOWNER" "COOWNER", :coowner "COOWNER"} input), :shape "RoleType"})

(clojure.core/defn- ser-boolean-type [input] #:http.request.field{:value input, :shape "BooleanType"})

(clojure.core/defn- req-create-comment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"}) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "uri", :location-name "VersionId"})], :body [(clojure.core/into (ser-comment-text-type (input :text)) #:http.request.field{:name "Text", :shape "CommentTextType"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :parent-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment-id-type (input :parent-id)) #:http.request.field{:name "ParentId", :shape "CommentIdType"})) (clojure.core/contains? input :thread-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment-id-type (input :thread-id)) #:http.request.field{:name "ThreadId", :shape "CommentIdType"})) (clojure.core/contains? input :visibility) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment-visibility-type (input :visibility)) #:http.request.field{:name "Visibility", :shape "CommentVisibilityType"})) (clojure.core/contains? input :notify-collaborators) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :notify-collaborators)) #:http.request.field{:name "NotifyCollaborators", :shape "BooleanType"}))))

(clojure.core/defn- req-deactivate-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :user-id)) #:http.request.field{:name "UserId", :shape "IdType", :location "uri", :location-name "UserId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-get-resources-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :user-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :user-id)) #:http.request.field{:name "UserId", :shape "IdType", :location "querystring", :location-name "userId"})) (clojure.core/contains? input :collection-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-collection-type (input :collection-type)) #:http.request.field{:name "CollectionType", :shape "ResourceCollectionType", :location "querystring", :location-name "collectionType"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"}))))

(clojure.core/defn- req-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :user-id)) #:http.request.field{:name "UserId", :shape "IdType", :location "uri", :location-name "UserId"})]} (clojure.core/contains? input :time-zone-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-zone-id-type (input :time-zone-id)) #:http.request.field{:name "TimeZoneId", :shape "TimeZoneIdType"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-type (input :type)) #:http.request.field{:name "Type", :shape "UserType"})) (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale-type (input :locale)) #:http.request.field{:name "Locale", :shape "LocaleType"})) (clojure.core/contains? input :surname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-attribute-value-type (input :surname)) #:http.request.field{:name "Surname", :shape "UserAttributeValueType"})) (clojure.core/contains? input :grant-poweruser-privileges) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-enum-type (input :grant-poweruser-privileges)) #:http.request.field{:name "GrantPoweruserPrivileges", :shape "BooleanEnumType"})) (clojure.core/contains? input :given-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-attribute-value-type (input :given-name)) #:http.request.field{:name "GivenName", :shape "UserAttributeValueType"})) (clojure.core/contains? input :storage-rule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-rule-type (input :storage-rule)) #:http.request.field{:name "StorageRule", :shape "StorageRuleType"})) (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-get-document-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :include-custom-metadata) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :include-custom-metadata)) #:http.request.field{:name "IncludeCustomMetadata", :shape "BooleanType", :location "querystring", :location-name "includeCustomMetadata"}))))

(clojure.core/defn- req-describe-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-search-query-type (input :search-query)) #:http.request.field{:name "SearchQuery", :shape "SearchQueryType", :location "querystring", :location-name "searchQuery"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :organization-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "IdType", :location "querystring", :location-name "organizationId"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-type (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerType", :location "querystring", :location-name "limit"}))))

(clojure.core/defn- req-get-folder-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :folder-id)) #:http.request.field{:name "FolderId", :shape "ResourceIdType", :location "uri", :location-name "FolderId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :include-custom-metadata) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :include-custom-metadata)) #:http.request.field{:name "IncludeCustomMetadata", :shape "BooleanType", :location "querystring", :location-name "includeCustomMetadata"}))))

(clojure.core/defn- req-describe-document-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-names-type (input :include)) #:http.request.field{:name "Include", :shape "FieldNamesType", :location "querystring", :location-name "include"})) (clojure.core/contains? input :fields) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-names-type (input :fields)) #:http.request.field{:name "Fields", :shape "FieldNamesType", :location "querystring", :location-name "fields"}))))

(clojure.core/defn- req-describe-activities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType", :location "querystring", :location-name "endTime"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType", :location "querystring", :location-name "startTime"})) (clojure.core/contains? input :user-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :user-id)) #:http.request.field{:name "UserId", :shape "IdType", :location "querystring", :location-name "userId"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :organization-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "IdType", :location "querystring", :location-name "organizationId"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :activity-types) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-names-filter-type (input :activity-types)) #:http.request.field{:name "ActivityTypes", :shape "ActivityNamesFilterType", :location "querystring", :location-name "activityTypes"})) (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "IdType", :location "querystring", :location-name "resourceId"})) (clojure.core/contains? input :include-indirect-activities) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :include-indirect-activities)) #:http.request.field{:name "IncludeIndirectActivities", :shape "BooleanType", :location "querystring", :location-name "includeIndirectActivities"})) (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-activate-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :user-id)) #:http.request.field{:name "UserId", :shape "IdType", :location "uri", :location-name "UserId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-remove-all-resource-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-get-document-path-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "IdType", :location "uri", :location-name "DocumentId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :fields) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-names-type (input :fields)) #:http.request.field{:name "Fields", :shape "FieldNamesType", :location "querystring", :location-name "fields"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"}))))

(clojure.core/defn- req-delete-comment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"}) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "uri", :location-name "VersionId"}) (clojure.core/into (ser-comment-id-type (input :comment-id)) #:http.request.field{:name "CommentId", :shape "CommentIdType", :location "uri", :location-name "CommentId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-delete-custom-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-metadata-key-list (input :keys)) #:http.request.field{:name "Keys", :shape "CustomMetadataKeyList", :location "querystring", :location-name "keys"})) (clojure.core/contains? input :delete-all) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :delete-all)) #:http.request.field{:name "DeleteAll", :shape "BooleanType", :location "querystring", :location-name "deleteAll"}))))

(clojure.core/defn- req-add-resource-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"})], :body [(clojure.core/into (ser-share-principal-list (input :principals)) #:http.request.field{:name "Principals", :shape "SharePrincipalList"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :notification-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-options (input :notification-options)) #:http.request.field{:name "NotificationOptions", :shape "NotificationOptions"}))))

(clojure.core/defn- req-describe-comments-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"}) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "uri", :location-name "VersionId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType", :location "querystring", :location-name "marker"}))))

(clojure.core/defn- req-create-notification-subscription-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "IdType", :location "uri", :location-name "OrganizationId"})], :body [(clojure.core/into (ser-subscription-end-point-type (input :endpoint)) #:http.request.field{:name "Endpoint", :shape "SubscriptionEndPointType"}) (clojure.core/into (ser-subscription-protocol-type (input :protocol)) #:http.request.field{:name "Protocol", :shape "SubscriptionProtocolType"}) (clojure.core/into (ser-subscription-type (input :subscription-type)) #:http.request.field{:name "SubscriptionType", :shape "SubscriptionType"})]}))

(clojure.core/defn- req-describe-resource-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :principal-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :principal-id)) #:http.request.field{:name "PrincipalId", :shape "IdType", :location "querystring", :location-name "principalId"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"}))))

(clojure.core/defn- req-create-folder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id-type (input :parent-folder-id)) #:http.request.field{:name "ParentFolderId", :shape "ResourceIdType"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :name)) #:http.request.field{:name "Name", :shape "ResourceNameType"}))))

(clojure.core/defn- req-update-document-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :name)) #:http.request.field{:name "Name", :shape "ResourceNameType"})) (clojure.core/contains? input :parent-folder-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-type (input :parent-folder-id)) #:http.request.field{:name "ParentFolderId", :shape "ResourceIdType"})) (clojure.core/contains? input :resource-state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-state-type (input :resource-state)) #:http.request.field{:name "ResourceState", :shape "ResourceStateType"}))))

(clojure.core/defn- req-remove-resource-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"}) (clojure.core/into (ser-id-type (input :principal-id)) #:http.request.field{:name "PrincipalId", :shape "IdType", :location "uri", :location-name "PrincipalId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :principal-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal-type (input :principal-type)) #:http.request.field{:name "PrincipalType", :shape "PrincipalType", :location "querystring", :location-name "type"}))))

(clojure.core/defn- req-get-folder-path-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :folder-id)) #:http.request.field{:name "FolderId", :shape "IdType", :location "uri", :location-name "FolderId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :fields) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-names-type (input :fields)) #:http.request.field{:name "Fields", :shape "FieldNamesType", :location "querystring", :location-name "fields"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"}))))

(clojure.core/defn- req-delete-folder-contents-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :folder-id)) #:http.request.field{:name "FolderId", :shape "ResourceIdType", :location "uri", :location-name "FolderId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-get-current-user-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})]}))

(clojure.core/defn- req-delete-document-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-update-document-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"}) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "uri", :location-name "VersionId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :version-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version-status (input :version-status)) #:http.request.field{:name "VersionStatus", :shape "DocumentVersionStatus"}))))

(clojure.core/defn- req-delete-folder-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :folder-id)) #:http.request.field{:name "FolderId", :shape "ResourceIdType", :location "uri", :location-name "FolderId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-user-attribute-value-type (input :given-name)) #:http.request.field{:name "GivenName", :shape "UserAttributeValueType"}) (clojure.core/into (ser-user-attribute-value-type (input :surname)) #:http.request.field{:name "Surname", :shape "UserAttributeValueType"}) (clojure.core/into (ser-password-type (input :password)) #:http.request.field{:name "Password", :shape "PasswordType"})]} (clojure.core/contains? input :time-zone-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-zone-id-type (input :time-zone-id)) #:http.request.field{:name "TimeZoneId", :shape "TimeZoneIdType"})) (clojure.core/contains? input :organization-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "IdType"})) (clojure.core/contains? input :storage-rule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-rule-type (input :storage-rule)) #:http.request.field{:name "StorageRule", :shape "StorageRuleType"})) (clojure.core/contains? input :email-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address-type (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "EmailAddressType"})) (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-describe-root-folders-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"}))))

(clojure.core/defn- req-create-labels-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"})], :body [(clojure.core/into (ser-shared-labels (input :labels)) #:http.request.field{:name "Labels", :shape "SharedLabels"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :user-id)) #:http.request.field{:name "UserId", :shape "IdType", :location "uri", :location-name "UserId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-initiate-document-version-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id-type (input :parent-folder-id)) #:http.request.field{:name "ParentFolderId", :shape "ResourceIdType"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-type (input :id)) #:http.request.field{:name "Id", :shape "ResourceIdType"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :name)) #:http.request.field{:name "Name", :shape "ResourceNameType"})) (clojure.core/contains? input :content-created-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :content-created-timestamp)) #:http.request.field{:name "ContentCreatedTimestamp", :shape "TimestampType"})) (clojure.core/contains? input :content-modified-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :content-modified-timestamp)) #:http.request.field{:name "ContentModifiedTimestamp", :shape "TimestampType"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "DocumentContentType"})) (clojure.core/contains? input :document-size-in-bytes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-size-type (input :document-size-in-bytes)) #:http.request.field{:name "DocumentSizeInBytes", :shape "SizeType"}))))

(clojure.core/defn- req-delete-notification-subscription-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :subscription-id)) #:http.request.field{:name "SubscriptionId", :shape "IdType", :location "uri", :location-name "SubscriptionId"}) (clojure.core/into (ser-id-type (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "IdType", :location "uri", :location-name "OrganizationId"})]}))

(clojure.core/defn- req-create-custom-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"})], :body [(clojure.core/into (ser-custom-metadata-map (input :custom-metadata)) #:http.request.field{:name "CustomMetadata", :shape "CustomMetadataMap"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "querystring", :location-name "versionid"}))))

(clojure.core/defn- req-describe-folder-contents-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :folder-id)) #:http.request.field{:name "FolderId", :shape "ResourceIdType", :location "uri", :location-name "FolderId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :sort) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-sort-type (input :sort)) #:http.request.field{:name "Sort", :shape "ResourceSortType", :location "querystring", :location-name "sort"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-type (input :order)) #:http.request.field{:name "Order", :shape "OrderType", :location "querystring", :location-name "order"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-folder-content-type (input :type)) #:http.request.field{:name "Type", :shape "FolderContentType", :location "querystring", :location-name "type"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-names-type (input :include)) #:http.request.field{:name "Include", :shape "FieldNamesType", :location "querystring", :location-name "include"}))))

(clojure.core/defn- req-update-folder-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :folder-id)) #:http.request.field{:name "FolderId", :shape "ResourceIdType", :location "uri", :location-name "FolderId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :name)) #:http.request.field{:name "Name", :shape "ResourceNameType"})) (clojure.core/contains? input :parent-folder-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-type (input :parent-folder-id)) #:http.request.field{:name "ParentFolderId", :shape "ResourceIdType"})) (clojure.core/contains? input :resource-state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-state-type (input :resource-state)) #:http.request.field{:name "ResourceState", :shape "ResourceStateType"}))))

(clojure.core/defn- req-delete-labels-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdType", :location "uri", :location-name "ResourceId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :labels) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shared-labels (input :labels)) #:http.request.field{:name "Labels", :shape "SharedLabels", :location "querystring", :location-name "labels"})) (clojure.core/contains? input :delete-all) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :delete-all)) #:http.request.field{:name "DeleteAll", :shape "BooleanType", :location "querystring", :location-name "deleteAll"}))))

(clojure.core/defn- req-describe-users-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-ids) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-ids-type (input :user-ids)) #:http.request.field{:name "UserIds", :shape "UserIdsType", :location "querystring", :location-name "userIds"})) (clojure.core/contains? input :sort) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-sort-type (input :sort)) #:http.request.field{:name "Sort", :shape "UserSortType", :location "querystring", :location-name "sort"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-type (input :order)) #:http.request.field{:name "Order", :shape "OrderType", :location "querystring", :location-name "order"})) (clojure.core/contains? input :fields) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-names-type (input :fields)) #:http.request.field{:name "Fields", :shape "FieldNamesType", :location "querystring", :location-name "fields"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :organization-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-type (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "IdType", :location "querystring", :location-name "organizationId"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :query) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-query-type (input :query)) #:http.request.field{:name "Query", :shape "SearchQueryType", :location "querystring", :location-name "query"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-filter-type (input :include)) #:http.request.field{:name "Include", :shape "UserFilterType", :location "querystring", :location-name "include"})) (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-get-document-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"}) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "uri", :location-name "VersionId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"})) (clojure.core/contains? input :fields) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-names-type (input :fields)) #:http.request.field{:name "Fields", :shape "FieldNamesType", :location "querystring", :location-name "fields"})) (clojure.core/contains? input :include-custom-metadata) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :include-custom-metadata)) #:http.request.field{:name "IncludeCustomMetadata", :shape "BooleanType", :location "querystring", :location-name "includeCustomMetadata"}))))

(clojure.core/defn- req-abort-document-version-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id-type (input :document-id)) #:http.request.field{:name "DocumentId", :shape "ResourceIdType", :location "uri", :location-name "DocumentId"}) (clojure.core/into (ser-document-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "DocumentVersionIdType", :location "uri", :location-name "VersionId"})]} (clojure.core/contains? input :authentication-token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-header-type (input :authentication-token)) #:http.request.field{:name "AuthenticationToken", :shape "AuthenticationHeaderType", :location "header", :location-name "Authentication"}))))

(clojure.core/defn- req-describe-notification-subscriptions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id-type (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "IdType", :location "uri", :location-name "OrganizationId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarkerType", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType", :location "querystring", :location-name "limit"}))))

(clojure.core/declare deser-document-source-url-map)

(clojure.core/declare deser-resource-id-type)

(clojure.core/declare deser-principal-type)

(clojure.core/declare deser-folder-metadata)

(clojure.core/declare deser-resource-path-component)

(clojure.core/declare deser-role-permission-type)

(clojure.core/declare deser-group-metadata-list)

(clojure.core/declare deser-document-status-type)

(clojure.core/declare deser-document-metadata)

(clojure.core/declare deser-comment)

(clojure.core/declare deser-marker-type)

(clojure.core/declare deser-group-metadata)

(clojure.core/declare deser-resource-path-component-list)

(clojure.core/declare deser-positive-size-type)

(clojure.core/declare deser-document-content-type)

(clojure.core/declare deser-locale-type)

(clojure.core/declare deser-user-metadata-list)

(clojure.core/declare deser-custom-metadata-value-type)

(clojure.core/declare deser-resource-metadata)

(clojure.core/declare deser-user-activities)

(clojure.core/declare deser-email-address-type)

(clojure.core/declare deser-signed-header-map)

(clojure.core/declare deser-user-type)

(clojure.core/declare deser-comment-status-type)

(clojure.core/declare deser-activity)

(clojure.core/declare deser-user)

(clojure.core/declare deser-comment-list)

(clojure.core/declare deser-document-source-type)

(clojure.core/declare deser-username-type)

(clojure.core/declare deser-folder-metadata-list)

(clojure.core/declare deser-subscription-protocol-type)

(clojure.core/declare deser-document-version-metadata)

(clojure.core/declare deser-share-status-type)

(clojure.core/declare deser-size-type)

(clojure.core/declare deser-group-name-type)

(clojure.core/declare deser-error-message-type)

(clojure.core/declare deser-comment-visibility-type)

(clojure.core/declare deser-user-metadata)

(clojure.core/declare deser-principal-list)

(clojure.core/declare deser-url-type)

(clojure.core/declare deser-organization-user-list)

(clojure.core/declare deser-shared-label)

(clojure.core/declare deser-upload-metadata)

(clojure.core/declare deser-activity-type)

(clojure.core/declare deser-user-status-type)

(clojure.core/declare deser-page-marker-type)

(clojure.core/declare deser-timestamp-type)

(clojure.core/declare deser-subscription-list)

(clojure.core/declare deser-subscription-end-point-type)

(clojure.core/declare deser-document-thumbnail-type)

(clojure.core/declare deser-participants)

(clojure.core/declare deser-custom-metadata-key-type)

(clojure.core/declare deser-resource-name-type)

(clojure.core/declare deser-time-zone-id-type)

(clojure.core/declare deser-id-type)

(clojure.core/declare deser-storage-rule-type)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-comment-id-type)

(clojure.core/declare deser-resource-state-type)

(clojure.core/declare deser-resource-path)

(clojure.core/declare deser-storage-type)

(clojure.core/declare deser-document-version-metadata-list)

(clojure.core/declare deser-message-type)

(clojure.core/declare deser-document-metadata-list)

(clojure.core/declare deser-document-version-id-type)

(clojure.core/declare deser-subscription)

(clojure.core/declare deser-hash-type)

(clojure.core/declare deser-permission-info)

(clojure.core/declare deser-document-thumbnail-url-map)

(clojure.core/declare deser-permission-info-list)

(clojure.core/declare deser-header-name-type)

(clojure.core/declare deser-entity-id-list)

(clojure.core/declare deser-share-result)

(clojure.core/declare deser-principal)

(clojure.core/declare deser-comment-text-type)

(clojure.core/declare deser-user-attribute-value-type)

(clojure.core/declare deser-shared-labels)

(clojure.core/declare deser-share-results-list)

(clojure.core/declare deser-user-storage-metadata)

(clojure.core/declare deser-custom-metadata-map)

(clojure.core/declare deser-comment-metadata)

(clojure.core/declare deser-role-type)

(clojure.core/declare deser-header-value-type)

(clojure.core/declare deser-boolean-type)

(clojure.core/defn- deser-document-source-url-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-document-source-type k) (deser-url-type v)])) input))

(clojure.core/defn- deser-resource-id-type [input] input)

(clojure.core/defn- deser-principal-type [input] (clojure.core/get {"USER" :user, "GROUP" :group, "INVITE" :invite, "ANONYMOUS" :anonymous, "ORGANIZATION" :organization} input))

(clojure.core/defn- deser-folder-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-type (input "CreatedTimestamp"))) (clojure.core/contains? input "ParentFolderId") (clojure.core/assoc :parent-folder-id (deser-resource-id-type (input "ParentFolderId"))) (clojure.core/contains? input "ModifiedTimestamp") (clojure.core/assoc :modified-timestamp (deser-timestamp-type (input "ModifiedTimestamp"))) (clojure.core/contains? input "LatestVersionSize") (clojure.core/assoc :latest-version-size (deser-size-type (input "LatestVersionSize"))) (clojure.core/contains? input "Signature") (clojure.core/assoc :signature (deser-hash-type (input "Signature"))) (clojure.core/contains? input "Labels") (clojure.core/assoc :labels (deser-shared-labels (input "Labels"))) (clojure.core/contains? input "Size") (clojure.core/assoc :size (deser-size-type (input "Size"))) (clojure.core/contains? input "CreatorId") (clojure.core/assoc :creator-id (deser-id-type (input "CreatorId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name-type (input "Name"))) (clojure.core/contains? input "ResourceState") (clojure.core/assoc :resource-state (deser-resource-state-type (input "ResourceState"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id-type (input "Id")))))

(clojure.core/defn- deser-resource-path-component [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id-type (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name-type (input "Name")))))

(clojure.core/defn- deser-role-permission-type [input] (clojure.core/get {"DIRECT" :direct, "INHERITED" :inherited} input))

(clojure.core/defn- deser-group-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group-metadata coll))) input))

(clojure.core/defn- deser-document-status-type [input] (clojure.core/get {"INITIALIZED" :initialized, "ACTIVE" :active} input))

(clojure.core/defn- deser-document-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id-type (input "Id"))) (clojure.core/contains? input "CreatorId") (clojure.core/assoc :creator-id (deser-id-type (input "CreatorId"))) (clojure.core/contains? input "ParentFolderId") (clojure.core/assoc :parent-folder-id (deser-resource-id-type (input "ParentFolderId"))) (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-type (input "CreatedTimestamp"))) (clojure.core/contains? input "ModifiedTimestamp") (clojure.core/assoc :modified-timestamp (deser-timestamp-type (input "ModifiedTimestamp"))) (clojure.core/contains? input "LatestVersionMetadata") (clojure.core/assoc :latest-version-metadata (deser-document-version-metadata (input "LatestVersionMetadata"))) (clojure.core/contains? input "ResourceState") (clojure.core/assoc :resource-state (deser-resource-state-type (input "ResourceState"))) (clojure.core/contains? input "Labels") (clojure.core/assoc :labels (deser-shared-labels (input "Labels")))))

(clojure.core/defn- deser-comment [input] (clojure.core/cond-> {:comment-id (deser-comment-id-type (input "CommentId"))} (clojure.core/contains? input "RecipientId") (clojure.core/assoc :recipient-id (deser-id-type (input "RecipientId"))) (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-type (input "CreatedTimestamp"))) (clojure.core/contains? input "Visibility") (clojure.core/assoc :visibility (deser-comment-visibility-type (input "Visibility"))) (clojure.core/contains? input "ParentId") (clojure.core/assoc :parent-id (deser-comment-id-type (input "ParentId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-comment-status-type (input "Status"))) (clojure.core/contains? input "ThreadId") (clojure.core/assoc :thread-id (deser-comment-id-type (input "ThreadId"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-comment-text-type (input "Text"))) (clojure.core/contains? input "Contributor") (clojure.core/assoc :contributor (deser-user (input "Contributor")))))

(clojure.core/defn- deser-marker-type [input] input)

(clojure.core/defn- deser-group-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id-type (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-group-name-type (input "Name")))))

(clojure.core/defn- deser-resource-path-component-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-path-component coll))) input))

(clojure.core/defn- deser-positive-size-type [input] input)

(clojure.core/defn- deser-document-content-type [input] input)

(clojure.core/defn- deser-locale-type [input] (clojure.core/get {"en" :en, "zh_CN" :zh-cn, "zh_TW" :zh-tw, "fr" :fr, "de" :de, "ru" :ru, "es" :es, "ja" :ja, "ko" :ko, "default" :default, "pt_BR" :pt-br} input))

(clojure.core/defn- deser-user-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-metadata coll))) input))

(clojure.core/defn- deser-custom-metadata-value-type [input] input)

(clojure.core/defn- deser-resource-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-resource-type (input "Type"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name-type (input "Name"))) (clojure.core/contains? input "OriginalName") (clojure.core/assoc :original-name (deser-resource-name-type (input "OriginalName"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id-type (input "Id"))) (clojure.core/contains? input "VersionId") (clojure.core/assoc :version-id (deser-document-version-id-type (input "VersionId"))) (clojure.core/contains? input "Owner") (clojure.core/assoc :owner (deser-user-metadata (input "Owner"))) (clojure.core/contains? input "ParentId") (clojure.core/assoc :parent-id (deser-resource-id-type (input "ParentId")))))

(clojure.core/defn- deser-user-activities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-activity coll))) input))

(clojure.core/defn- deser-email-address-type [input] input)

(clojure.core/defn- deser-signed-header-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-header-name-type k) (deser-header-value-type v)])) input))

(clojure.core/defn- deser-user-type [input] (clojure.core/get {"USER" :user, "ADMIN" :admin, "POWERUSER" :poweruser, "MINIMALUSER" :minimaluser, "WORKSPACESUSER" :workspacesuser} input))

(clojure.core/defn- deser-comment-status-type [input] (clojure.core/get {"DRAFT" :draft, "PUBLISHED" :published, "DELETED" :deleted} input))

(clojure.core/defn- deser-activity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-activity-type (input "Type"))) (clojure.core/contains? input "ResourceMetadata") (clojure.core/assoc :resource-metadata (deser-resource-metadata (input "ResourceMetadata"))) (clojure.core/contains? input "OrganizationId") (clojure.core/assoc :organization-id (deser-id-type (input "OrganizationId"))) (clojure.core/contains? input "OriginalParent") (clojure.core/assoc :original-parent (deser-resource-metadata (input "OriginalParent"))) (clojure.core/contains? input "IsIndirectActivity") (clojure.core/assoc :is-indirect-activity (deser-boolean-type (input "IsIndirectActivity"))) (clojure.core/contains? input "Participants") (clojure.core/assoc :participants (deser-participants (input "Participants"))) (clojure.core/contains? input "Initiator") (clojure.core/assoc :initiator (deser-user-metadata (input "Initiator"))) (clojure.core/contains? input "TimeStamp") (clojure.core/assoc :time-stamp (deser-timestamp-type (input "TimeStamp"))) (clojure.core/contains? input "CommentMetadata") (clojure.core/assoc :comment-metadata (deser-comment-metadata (input "CommentMetadata")))))

(clojure.core/defn- deser-user [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-username-type (input "Username"))) (clojure.core/contains? input "Storage") (clojure.core/assoc :storage (deser-user-storage-metadata (input "Storage"))) (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-type (input "CreatedTimestamp"))) (clojure.core/contains? input "TimeZoneId") (clojure.core/assoc :time-zone-id (deser-time-zone-id-type (input "TimeZoneId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-user-type (input "Type"))) (clojure.core/contains? input "Locale") (clojure.core/assoc :locale (deser-locale-type (input "Locale"))) (clojure.core/contains? input "Surname") (clojure.core/assoc :surname (deser-user-attribute-value-type (input "Surname"))) (clojure.core/contains? input "RecycleBinFolderId") (clojure.core/assoc :recycle-bin-folder-id (deser-resource-id-type (input "RecycleBinFolderId"))) (clojure.core/contains? input "OrganizationId") (clojure.core/assoc :organization-id (deser-id-type (input "OrganizationId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-user-status-type (input "Status"))) (clojure.core/contains? input "ModifiedTimestamp") (clojure.core/assoc :modified-timestamp (deser-timestamp-type (input "ModifiedTimestamp"))) (clojure.core/contains? input "GivenName") (clojure.core/assoc :given-name (deser-user-attribute-value-type (input "GivenName"))) (clojure.core/contains? input "RootFolderId") (clojure.core/assoc :root-folder-id (deser-resource-id-type (input "RootFolderId"))) (clojure.core/contains? input "EmailAddress") (clojure.core/assoc :email-address (deser-email-address-type (input "EmailAddress"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id-type (input "Id")))))

(clojure.core/defn- deser-comment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-comment coll))) input))

(clojure.core/defn- deser-document-source-type [input] (clojure.core/get {"ORIGINAL" :original, "WITH_COMMENTS" :with-comments} input))

(clojure.core/defn- deser-username-type [input] input)

(clojure.core/defn- deser-folder-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-folder-metadata coll))) input))

(clojure.core/defn- deser-subscription-protocol-type [input] (clojure.core/get {"HTTPS" :https} input))

(clojure.core/defn- deser-document-version-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-type (input "CreatedTimestamp"))) (clojure.core/contains? input "Source") (clojure.core/assoc :source (deser-document-source-url-map (input "Source"))) (clojure.core/contains? input "ContentModifiedTimestamp") (clojure.core/assoc :content-modified-timestamp (deser-timestamp-type (input "ContentModifiedTimestamp"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-document-status-type (input "Status"))) (clojure.core/contains? input "ModifiedTimestamp") (clojure.core/assoc :modified-timestamp (deser-timestamp-type (input "ModifiedTimestamp"))) (clojure.core/contains? input "ContentType") (clojure.core/assoc :content-type (deser-document-content-type (input "ContentType"))) (clojure.core/contains? input "Signature") (clojure.core/assoc :signature (deser-hash-type (input "Signature"))) (clojure.core/contains? input "ContentCreatedTimestamp") (clojure.core/assoc :content-created-timestamp (deser-timestamp-type (input "ContentCreatedTimestamp"))) (clojure.core/contains? input "Thumbnail") (clojure.core/assoc :thumbnail (deser-document-thumbnail-url-map (input "Thumbnail"))) (clojure.core/contains? input "Size") (clojure.core/assoc :size (deser-size-type (input "Size"))) (clojure.core/contains? input "CreatorId") (clojure.core/assoc :creator-id (deser-id-type (input "CreatorId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name-type (input "Name"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-document-version-id-type (input "Id")))))

(clojure.core/defn- deser-share-status-type [input] (clojure.core/get {"SUCCESS" :success, "FAILURE" :failure} input))

(clojure.core/defn- deser-size-type [input] input)

(clojure.core/defn- deser-group-name-type [input] input)

(clojure.core/defn- deser-error-message-type [input] input)

(clojure.core/defn- deser-comment-visibility-type [input] (clojure.core/get {"PUBLIC" :public, "PRIVATE" :private} input))

(clojure.core/defn- deser-user-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id-type (input "Id"))) (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-username-type (input "Username"))) (clojure.core/contains? input "GivenName") (clojure.core/assoc :given-name (deser-user-attribute-value-type (input "GivenName"))) (clojure.core/contains? input "Surname") (clojure.core/assoc :surname (deser-user-attribute-value-type (input "Surname"))) (clojure.core/contains? input "EmailAddress") (clojure.core/assoc :email-address (deser-email-address-type (input "EmailAddress")))))

(clojure.core/defn- deser-principal-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-principal coll))) input))

(clojure.core/defn- deser-url-type [input] input)

(clojure.core/defn- deser-organization-user-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user coll))) input))

(clojure.core/defn- deser-shared-label [input] input)

(clojure.core/defn- deser-upload-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "UploadUrl") (clojure.core/assoc :upload-url (deser-url-type (input "UploadUrl"))) (clojure.core/contains? input "SignedHeaders") (clojure.core/assoc :signed-headers (deser-signed-header-map (input "SignedHeaders")))))

(clojure.core/defn- deser-activity-type [input] (clojure.core/get {"DOCUMENT_REVERTED" :document-reverted, "FOLDER_SHAREABLE_LINK_CREATED" :folder-shareable-link-created, "DOCUMENT_SHARE_PERMISSION_CHANGED" :document-share-permission-changed, "DOCUMENT_SHAREABLE_LINK_REMOVED" :document-shareable-link-removed, "FOLDER_RESTORED" :folder-restored, "FOLDER_SHAREABLE_LINK_REMOVED" :folder-shareable-link-removed, "DOCUMENT_COMMENT_DELETED" :document-comment-deleted, "FOLDER_RECYCLED" :folder-recycled, "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED" :document-shareable-link-permission-changed, "DOCUMENT_RESTORED" :document-restored, "DOCUMENT_UNSHARED" :document-unshared, "DOCUMENT_ANNOTATION_DELETED" :document-annotation-deleted, "DOCUMENT_RENAMED" :document-renamed, "FOLDER_CREATED" :folder-created, "FOLDER_MOVED" :folder-moved, "FOLDER_DELETED" :folder-deleted, "FOLDER_RENAMED" :folder-renamed, "DOCUMENT_SHARED" :document-shared, "FOLDER_SHARE_PERMISSION_CHANGED" :folder-share-permission-changed, "DOCUMENT_ANNOTATION_ADDED" :document-annotation-added, "DOCUMENT_VERSION_UPLOADED" :document-version-uploaded, "DOCUMENT_COMMENT_ADDED" :document-comment-added, "DOCUMENT_SHAREABLE_LINK_CREATED" :document-shareable-link-created, "DOCUMENT_VERSION_DOWNLOADED" :document-version-downloaded, "FOLDER_SHARED" :folder-shared, "DOCUMENT_VERSION_DELETED" :document-version-deleted, "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED" :folder-shareable-link-permission-changed, "DOCUMENT_CHECKED_IN" :document-checked-in, "FOLDER_UNSHARED" :folder-unshared, "DOCUMENT_RECYCLED" :document-recycled, "DOCUMENT_MOVED" :document-moved, "DOCUMENT_CHECKED_OUT" :document-checked-out, "DOCUMENT_VERSION_VIEWED" :document-version-viewed} input))

(clojure.core/defn- deser-user-status-type [input] (clojure.core/get {"ACTIVE" :active, "INACTIVE" :inactive, "PENDING" :pending} input))

(clojure.core/defn- deser-page-marker-type [input] input)

(clojure.core/defn- deser-timestamp-type [input] input)

(clojure.core/defn- deser-subscription-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscription coll))) input))

(clojure.core/defn- deser-subscription-end-point-type [input] input)

(clojure.core/defn- deser-document-thumbnail-type [input] (clojure.core/get {"SMALL" :small, "SMALL_HQ" :small-hq, "LARGE" :large} input))

(clojure.core/defn- deser-participants [input] (clojure.core/cond-> {} (clojure.core/contains? input "Users") (clojure.core/assoc :users (deser-user-metadata-list (input "Users"))) (clojure.core/contains? input "Groups") (clojure.core/assoc :groups (deser-group-metadata-list (input "Groups")))))

(clojure.core/defn- deser-custom-metadata-key-type [input] input)

(clojure.core/defn- deser-resource-name-type [input] input)

(clojure.core/defn- deser-time-zone-id-type [input] input)

(clojure.core/defn- deser-id-type [input] input)

(clojure.core/defn- deser-storage-rule-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "StorageAllocatedInBytes") (clojure.core/assoc :storage-allocated-in-bytes (deser-positive-size-type (input "StorageAllocatedInBytes"))) (clojure.core/contains? input "StorageType") (clojure.core/assoc :storage-type (deser-storage-type (input "StorageType")))))

(clojure.core/defn- deser-resource-type [input] (clojure.core/get {"FOLDER" :folder, "DOCUMENT" :document} input))

(clojure.core/defn- deser-comment-id-type [input] input)

(clojure.core/defn- deser-resource-state-type [input] (clojure.core/get {"ACTIVE" :active, "RESTORING" :restoring, "RECYCLING" :recycling, "RECYCLED" :recycled} input))

(clojure.core/defn- deser-resource-path [input] (clojure.core/cond-> {} (clojure.core/contains? input "Components") (clojure.core/assoc :components (deser-resource-path-component-list (input "Components")))))

(clojure.core/defn- deser-storage-type [input] (clojure.core/get {"UNLIMITED" :unlimited, "QUOTA" :quota} input))

(clojure.core/defn- deser-document-version-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-document-version-metadata coll))) input))

(clojure.core/defn- deser-message-type [input] input)

(clojure.core/defn- deser-document-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-document-metadata coll))) input))

(clojure.core/defn- deser-document-version-id-type [input] input)

(clojure.core/defn- deser-subscription [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubscriptionId") (clojure.core/assoc :subscription-id (deser-id-type (input "SubscriptionId"))) (clojure.core/contains? input "EndPoint") (clojure.core/assoc :end-point (deser-subscription-end-point-type (input "EndPoint"))) (clojure.core/contains? input "Protocol") (clojure.core/assoc :protocol (deser-subscription-protocol-type (input "Protocol")))))

(clojure.core/defn- deser-hash-type [input] input)

(clojure.core/defn- deser-permission-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role-type (input "Role"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-role-permission-type (input "Type")))))

(clojure.core/defn- deser-document-thumbnail-url-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-document-thumbnail-type k) (deser-url-type v)])) input))

(clojure.core/defn- deser-permission-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-permission-info coll))) input))

(clojure.core/defn- deser-header-name-type [input] input)

(clojure.core/defn- deser-entity-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-id-type coll))) input))

(clojure.core/defn- deser-share-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "PrincipalId") (clojure.core/assoc :principal-id (deser-id-type (input "PrincipalId"))) (clojure.core/contains? input "InviteePrincipalId") (clojure.core/assoc :invitee-principal-id (deser-id-type (input "InviteePrincipalId"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role-type (input "Role"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-share-status-type (input "Status"))) (clojure.core/contains? input "ShareId") (clojure.core/assoc :share-id (deser-resource-id-type (input "ShareId"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-message-type (input "StatusMessage")))))

(clojure.core/defn- deser-principal [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id-type (input "Id"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-principal-type (input "Type"))) (clojure.core/contains? input "Roles") (clojure.core/assoc :roles (deser-permission-info-list (input "Roles")))))

(clojure.core/defn- deser-comment-text-type [input] input)

(clojure.core/defn- deser-user-attribute-value-type [input] input)

(clojure.core/defn- deser-shared-labels [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-shared-label coll))) input))

(clojure.core/defn- deser-share-results-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-share-result coll))) input))

(clojure.core/defn- deser-user-storage-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "StorageUtilizedInBytes") (clojure.core/assoc :storage-utilized-in-bytes (deser-size-type (input "StorageUtilizedInBytes"))) (clojure.core/contains? input "StorageRule") (clojure.core/assoc :storage-rule (deser-storage-rule-type (input "StorageRule")))))

(clojure.core/defn- deser-custom-metadata-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-custom-metadata-key-type k) (deser-custom-metadata-value-type v)])) input))

(clojure.core/defn- deser-comment-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "CommentId") (clojure.core/assoc :comment-id (deser-comment-id-type (input "CommentId"))) (clojure.core/contains? input "Contributor") (clojure.core/assoc :contributor (deser-user (input "Contributor"))) (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp-type (input "CreatedTimestamp"))) (clojure.core/contains? input "CommentStatus") (clojure.core/assoc :comment-status (deser-comment-status-type (input "CommentStatus"))) (clojure.core/contains? input "RecipientId") (clojure.core/assoc :recipient-id (deser-id-type (input "RecipientId")))))

(clojure.core/defn- deser-role-type [input] (clojure.core/get {"VIEWER" :viewer, "CONTRIBUTOR" :contributor, "OWNER" :owner, "COOWNER" :coowner} input))

(clojure.core/defn- deser-header-value-type [input] input)

(clojure.core/defn- deser-boolean-type [input] input)

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper1893958 input] (clojure.core/let [rawinput1893957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893959 {"User" (rawinput1893957 "User")}] (clojure.core/cond-> {} (letvar1893959 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar1893959 ["User"])))))))

(clojure.core/defn- response-deactivating-last-system-user-exception ([input] (response-deactivating-last-system-user-exception nil input)) ([resultWrapper1893961 input] (clojure.core/let [rawinput1893960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893962 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-folder-path-response ([input] (response-get-folder-path-response nil input)) ([resultWrapper1893964 input] (clojure.core/let [rawinput1893963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893965 {"Path" (rawinput1893963 "Path")}] (clojure.core/cond-> {} (letvar1893965 "Path") (clojure.core/assoc :path (deser-resource-path (clojure.core/get-in letvar1893965 ["Path"])))))))

(clojure.core/defn- response-get-document-version-response ([input] (response-get-document-version-response nil input)) ([resultWrapper1893967 input] (clojure.core/let [rawinput1893966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893968 {"Metadata" (rawinput1893966 "Metadata"), "CustomMetadata" (rawinput1893966 "CustomMetadata")}] (clojure.core/cond-> {} (letvar1893968 "Metadata") (clojure.core/assoc :metadata (deser-document-version-metadata (clojure.core/get-in letvar1893968 ["Metadata"]))) (letvar1893968 "CustomMetadata") (clojure.core/assoc :custom-metadata (deser-custom-metadata-map (clojure.core/get-in letvar1893968 ["CustomMetadata"])))))))

(clojure.core/defn- response-create-folder-response ([input] (response-create-folder-response nil input)) ([resultWrapper1893970 input] (clojure.core/let [rawinput1893969 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893971 {"Metadata" (rawinput1893969 "Metadata")}] (clojure.core/cond-> {} (letvar1893971 "Metadata") (clojure.core/assoc :metadata (deser-folder-metadata (clojure.core/get-in letvar1893971 ["Metadata"])))))))

(clojure.core/defn- response-add-resource-permissions-response ([input] (response-add-resource-permissions-response nil input)) ([resultWrapper1893973 input] (clojure.core/let [rawinput1893972 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893974 {"ShareResults" (rawinput1893972 "ShareResults")}] (clojure.core/cond-> {} (letvar1893974 "ShareResults") (clojure.core/assoc :share-results (deser-share-results-list (clojure.core/get-in letvar1893974 ["ShareResults"])))))))

(clojure.core/defn- response-create-custom-metadata-response ([input] (response-create-custom-metadata-response nil input)) ([resultWrapper1893976 input] (clojure.core/let [rawinput1893975 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893977 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-comments-response ([input] (response-describe-comments-response nil input)) ([resultWrapper1893979 input] (clojure.core/let [rawinput1893978 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893980 {"Comments" (rawinput1893978 "Comments"), "Marker" (rawinput1893978 "Marker")}] (clojure.core/cond-> {} (letvar1893980 "Comments") (clojure.core/assoc :comments (deser-comment-list (clojure.core/get-in letvar1893980 ["Comments"]))) (letvar1893980 "Marker") (clojure.core/assoc :marker (deser-marker-type (clojure.core/get-in letvar1893980 ["Marker"])))))))

(clojure.core/defn- response-describe-groups-response ([input] (response-describe-groups-response nil input)) ([resultWrapper1893982 input] (clojure.core/let [rawinput1893981 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893983 {"Groups" (rawinput1893981 "Groups"), "Marker" (rawinput1893981 "Marker")}] (clojure.core/cond-> {} (letvar1893983 "Groups") (clojure.core/assoc :groups (deser-group-metadata-list (clojure.core/get-in letvar1893983 ["Groups"]))) (letvar1893983 "Marker") (clojure.core/assoc :marker (deser-marker-type (clojure.core/get-in letvar1893983 ["Marker"])))))))

(clojure.core/defn- response-entity-not-exists-exception ([input] (response-entity-not-exists-exception nil input)) ([resultWrapper1893985 input] (clojure.core/let [rawinput1893984 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893986 {"Message" (rawinput1893984 "Message"), "EntityIds" (rawinput1893984 "EntityIds")}] (clojure.core/cond-> {} (letvar1893986 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1893986 ["Message"]))) (letvar1893986 "EntityIds") (clojure.core/assoc :entity-ids (deser-entity-id-list (clojure.core/get-in letvar1893986 ["EntityIds"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1893988 input] (clojure.core/let [rawinput1893987 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893989 {"Message" (rawinput1893987 "Message")}] (clojure.core/cond-> {} (letvar1893989 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1893989 ["Message"])))))))

(clojure.core/defn- response-failed-dependency-exception ([input] (response-failed-dependency-exception nil input)) ([resultWrapper1893991 input] (clojure.core/let [rawinput1893990 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893992 {"Message" (rawinput1893990 "Message")}] (clojure.core/cond-> {} (letvar1893992 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1893992 ["Message"])))))))

(clojure.core/defn- response-too-many-labels-exception ([input] (response-too-many-labels-exception nil input)) ([resultWrapper1893994 input] (clojure.core/let [rawinput1893993 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893995 {"Message" (rawinput1893993 "Message")}] (clojure.core/cond-> {} (letvar1893995 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1893995 ["Message"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1893997 input] (clojure.core/let [rawinput1893996 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1893998 {"Message" (rawinput1893996 "Message")}] (clojure.core/cond-> {} (letvar1893998 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1893998 ["Message"])))))))

(clojure.core/defn- response-invalid-password-exception ([input] (response-invalid-password-exception nil input)) ([resultWrapper1894000 input] (clojure.core/let [rawinput1893999 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894001 {"Message" (rawinput1893999 "Message")}] (clojure.core/cond-> {} (letvar1894001 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894001 ["Message"])))))))

(clojure.core/defn- response-invalid-comment-operation-exception ([input] (response-invalid-comment-operation-exception nil input)) ([resultWrapper1894003 input] (clojure.core/let [rawinput1894002 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894004 {"Message" (rawinput1894002 "Message")}] (clojure.core/cond-> {} (letvar1894004 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894004 ["Message"])))))))

(clojure.core/defn- response-custom-metadata-limit-exceeded-exception ([input] (response-custom-metadata-limit-exceeded-exception nil input)) ([resultWrapper1894006 input] (clojure.core/let [rawinput1894005 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894007 {"Message" (rawinput1894005 "Message")}] (clojure.core/cond-> {} (letvar1894007 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894007 ["Message"])))))))

(clojure.core/defn- response-describe-notification-subscriptions-response ([input] (response-describe-notification-subscriptions-response nil input)) ([resultWrapper1894009 input] (clojure.core/let [rawinput1894008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894010 {"Subscriptions" (rawinput1894008 "Subscriptions"), "Marker" (rawinput1894008 "Marker")}] (clojure.core/cond-> {} (letvar1894010 "Subscriptions") (clojure.core/assoc :subscriptions (deser-subscription-list (clojure.core/get-in letvar1894010 ["Subscriptions"]))) (letvar1894010 "Marker") (clojure.core/assoc :marker (deser-page-marker-type (clojure.core/get-in letvar1894010 ["Marker"])))))))

(clojure.core/defn- response-update-user-response ([input] (response-update-user-response nil input)) ([resultWrapper1894012 input] (clojure.core/let [rawinput1894011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894013 {"User" (rawinput1894011 "User")}] (clojure.core/cond-> {} (letvar1894013 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar1894013 ["User"])))))))

(clojure.core/defn- response-entity-already-exists-exception ([input] (response-entity-already-exists-exception nil input)) ([resultWrapper1894015 input] (clojure.core/let [rawinput1894014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894016 {"Message" (rawinput1894014 "Message")}] (clojure.core/cond-> {} (letvar1894016 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894016 ["Message"])))))))

(clojure.core/defn- response-invalid-operation-exception ([input] (response-invalid-operation-exception nil input)) ([resultWrapper1894018 input] (clojure.core/let [rawinput1894017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894019 {"Message" (rawinput1894017 "Message")}] (clojure.core/cond-> {} (letvar1894019 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894019 ["Message"])))))))

(clojure.core/defn- response-too-many-subscriptions-exception ([input] (response-too-many-subscriptions-exception nil input)) ([resultWrapper1894021 input] (clojure.core/let [rawinput1894020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894022 {"Message" (rawinput1894020 "Message")}] (clojure.core/cond-> {} (letvar1894022 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894022 ["Message"])))))))

(clojure.core/defn- response-unauthorized-resource-access-exception ([input] (response-unauthorized-resource-access-exception nil input)) ([resultWrapper1894024 input] (clojure.core/let [rawinput1894023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894025 {"Message" (rawinput1894023 "Message")}] (clojure.core/cond-> {} (letvar1894025 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894025 ["Message"])))))))

(clojure.core/defn- response-activate-user-response ([input] (response-activate-user-response nil input)) ([resultWrapper1894027 input] (clojure.core/let [rawinput1894026 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894028 {"User" (rawinput1894026 "User")}] (clojure.core/cond-> {} (letvar1894028 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar1894028 ["User"])))))))

(clojure.core/defn- response-describe-activities-response ([input] (response-describe-activities-response nil input)) ([resultWrapper1894030 input] (clojure.core/let [rawinput1894029 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894031 {"UserActivities" (rawinput1894029 "UserActivities"), "Marker" (rawinput1894029 "Marker")}] (clojure.core/cond-> {} (letvar1894031 "UserActivities") (clojure.core/assoc :user-activities (deser-user-activities (clojure.core/get-in letvar1894031 ["UserActivities"]))) (letvar1894031 "Marker") (clojure.core/assoc :marker (deser-marker-type (clojure.core/get-in letvar1894031 ["Marker"])))))))

(clojure.core/defn- response-get-resources-response ([input] (response-get-resources-response nil input)) ([resultWrapper1894033 input] (clojure.core/let [rawinput1894032 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894034 {"Folders" (rawinput1894032 "Folders"), "Documents" (rawinput1894032 "Documents"), "Marker" (rawinput1894032 "Marker")}] (clojure.core/cond-> {} (letvar1894034 "Folders") (clojure.core/assoc :folders (deser-folder-metadata-list (clojure.core/get-in letvar1894034 ["Folders"]))) (letvar1894034 "Documents") (clojure.core/assoc :documents (deser-document-metadata-list (clojure.core/get-in letvar1894034 ["Documents"]))) (letvar1894034 "Marker") (clojure.core/assoc :marker (deser-page-marker-type (clojure.core/get-in letvar1894034 ["Marker"])))))))

(clojure.core/defn- response-prohibited-state-exception ([input] (response-prohibited-state-exception nil input)) ([resultWrapper1894036 input] (clojure.core/let [rawinput1894035 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894037 {"Message" (rawinput1894035 "Message")}] (clojure.core/cond-> {} (letvar1894037 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894037 ["Message"])))))))

(clojure.core/defn- response-describe-resource-permissions-response ([input] (response-describe-resource-permissions-response nil input)) ([resultWrapper1894039 input] (clojure.core/let [rawinput1894038 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894040 {"Principals" (rawinput1894038 "Principals"), "Marker" (rawinput1894038 "Marker")}] (clojure.core/cond-> {} (letvar1894040 "Principals") (clojure.core/assoc :principals (deser-principal-list (clojure.core/get-in letvar1894040 ["Principals"]))) (letvar1894040 "Marker") (clojure.core/assoc :marker (deser-page-marker-type (clojure.core/get-in letvar1894040 ["Marker"])))))))

(clojure.core/defn- response-create-notification-subscription-response ([input] (response-create-notification-subscription-response nil input)) ([resultWrapper1894042 input] (clojure.core/let [rawinput1894041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894043 {"Subscription" (rawinput1894041 "Subscription")}] (clojure.core/cond-> {} (letvar1894043 "Subscription") (clojure.core/assoc :subscription (deser-subscription (clojure.core/get-in letvar1894043 ["Subscription"])))))))

(clojure.core/defn- response-resource-already-checked-out-exception ([input] (response-resource-already-checked-out-exception nil input)) ([resultWrapper1894045 input] (clojure.core/let [rawinput1894044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894046 {"Message" (rawinput1894044 "Message")}] (clojure.core/cond-> {} (letvar1894046 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894046 ["Message"])))))))

(clojure.core/defn- response-get-folder-response ([input] (response-get-folder-response nil input)) ([resultWrapper1894048 input] (clojure.core/let [rawinput1894047 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894049 {"Metadata" (rawinput1894047 "Metadata"), "CustomMetadata" (rawinput1894047 "CustomMetadata")}] (clojure.core/cond-> {} (letvar1894049 "Metadata") (clojure.core/assoc :metadata (deser-folder-metadata (clojure.core/get-in letvar1894049 ["Metadata"]))) (letvar1894049 "CustomMetadata") (clojure.core/assoc :custom-metadata (deser-custom-metadata-map (clojure.core/get-in letvar1894049 ["CustomMetadata"])))))))

(clojure.core/defn- response-unauthorized-operation-exception ([input] (response-unauthorized-operation-exception nil input)) ([resultWrapper1894051 input] (clojure.core/let [rawinput1894050 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894052 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-labels-response ([input] (response-create-labels-response nil input)) ([resultWrapper1894054 input] (clojure.core/let [rawinput1894053 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894055 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-comment-response ([input] (response-create-comment-response nil input)) ([resultWrapper1894057 input] (clojure.core/let [rawinput1894056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894058 {"Comment" (rawinput1894056 "Comment")}] (clojure.core/cond-> {} (letvar1894058 "Comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar1894058 ["Comment"])))))))

(clojure.core/defn- response-delete-labels-response ([input] (response-delete-labels-response nil input)) ([resultWrapper1894060 input] (clojure.core/let [rawinput1894059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894061 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-users-response ([input] (response-describe-users-response nil input)) ([resultWrapper1894063 input] (clojure.core/let [rawinput1894062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894064 {"Users" (rawinput1894062 "Users"), "TotalNumberOfUsers" (rawinput1894062 "TotalNumberOfUsers"), "Marker" (rawinput1894062 "Marker")}] (clojure.core/cond-> {} (letvar1894064 "Users") (clojure.core/assoc :users (deser-organization-user-list (clojure.core/get-in letvar1894064 ["Users"]))) (letvar1894064 "TotalNumberOfUsers") (clojure.core/assoc :total-number-of-users (deser-size-type (clojure.core/get-in letvar1894064 ["TotalNumberOfUsers"]))) (letvar1894064 "Marker") (clojure.core/assoc :marker (deser-page-marker-type (clojure.core/get-in letvar1894064 ["Marker"])))))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper1894066 input] (clojure.core/let [rawinput1894065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894067 {"Message" (rawinput1894065 "Message")}] (clojure.core/cond-> {} (letvar1894067 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894067 ["Message"])))))))

(clojure.core/defn- response-get-current-user-response ([input] (response-get-current-user-response nil input)) ([resultWrapper1894069 input] (clojure.core/let [rawinput1894068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894070 {"User" (rawinput1894068 "User")}] (clojure.core/cond-> {} (letvar1894070 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar1894070 ["User"])))))))

(clojure.core/defn- response-conflicting-operation-exception ([input] (response-conflicting-operation-exception nil input)) ([resultWrapper1894072 input] (clojure.core/let [rawinput1894071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894073 {"Message" (rawinput1894071 "Message")}] (clojure.core/cond-> {} (letvar1894073 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894073 ["Message"])))))))

(clojure.core/defn- response-requested-entity-too-large-exception ([input] (response-requested-entity-too-large-exception nil input)) ([resultWrapper1894075 input] (clojure.core/let [rawinput1894074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894076 {"Message" (rawinput1894074 "Message")}] (clojure.core/cond-> {} (letvar1894076 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894076 ["Message"])))))))

(clojure.core/defn- response-describe-folder-contents-response ([input] (response-describe-folder-contents-response nil input)) ([resultWrapper1894078 input] (clojure.core/let [rawinput1894077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894079 {"Folders" (rawinput1894077 "Folders"), "Documents" (rawinput1894077 "Documents"), "Marker" (rawinput1894077 "Marker")}] (clojure.core/cond-> {} (letvar1894079 "Folders") (clojure.core/assoc :folders (deser-folder-metadata-list (clojure.core/get-in letvar1894079 ["Folders"]))) (letvar1894079 "Documents") (clojure.core/assoc :documents (deser-document-metadata-list (clojure.core/get-in letvar1894079 ["Documents"]))) (letvar1894079 "Marker") (clojure.core/assoc :marker (deser-page-marker-type (clojure.core/get-in letvar1894079 ["Marker"])))))))

(clojure.core/defn- response-storage-limit-exceeded-exception ([input] (response-storage-limit-exceeded-exception nil input)) ([resultWrapper1894081 input] (clojure.core/let [rawinput1894080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894082 {"Message" (rawinput1894080 "Message")}] (clojure.core/cond-> {} (letvar1894082 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894082 ["Message"])))))))

(clojure.core/defn- response-initiate-document-version-upload-response ([input] (response-initiate-document-version-upload-response nil input)) ([resultWrapper1894084 input] (clojure.core/let [rawinput1894083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894085 {"Metadata" (rawinput1894083 "Metadata"), "UploadMetadata" (rawinput1894083 "UploadMetadata")}] (clojure.core/cond-> {} (letvar1894085 "Metadata") (clojure.core/assoc :metadata (deser-document-metadata (clojure.core/get-in letvar1894085 ["Metadata"]))) (letvar1894085 "UploadMetadata") (clojure.core/assoc :upload-metadata (deser-upload-metadata (clojure.core/get-in letvar1894085 ["UploadMetadata"])))))))

(clojure.core/defn- response-get-document-response ([input] (response-get-document-response nil input)) ([resultWrapper1894087 input] (clojure.core/let [rawinput1894086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894088 {"Metadata" (rawinput1894086 "Metadata"), "CustomMetadata" (rawinput1894086 "CustomMetadata")}] (clojure.core/cond-> {} (letvar1894088 "Metadata") (clojure.core/assoc :metadata (deser-document-metadata (clojure.core/get-in letvar1894088 ["Metadata"]))) (letvar1894088 "CustomMetadata") (clojure.core/assoc :custom-metadata (deser-custom-metadata-map (clojure.core/get-in letvar1894088 ["CustomMetadata"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1894090 input] (clojure.core/let [rawinput1894089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894091 {"Message" (rawinput1894089 "Message")}] (clojure.core/cond-> {} (letvar1894091 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894091 ["Message"])))))))

(clojure.core/defn- response-document-locked-for-comments-exception ([input] (response-document-locked-for-comments-exception nil input)) ([resultWrapper1894093 input] (clojure.core/let [rawinput1894092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894094 {"Message" (rawinput1894092 "Message")}] (clojure.core/cond-> {} (letvar1894094 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894094 ["Message"])))))))

(clojure.core/defn- response-get-document-path-response ([input] (response-get-document-path-response nil input)) ([resultWrapper1894096 input] (clojure.core/let [rawinput1894095 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894097 {"Path" (rawinput1894095 "Path")}] (clojure.core/cond-> {} (letvar1894097 "Path") (clojure.core/assoc :path (deser-resource-path (clojure.core/get-in letvar1894097 ["Path"])))))))

(clojure.core/defn- response-describe-root-folders-response ([input] (response-describe-root-folders-response nil input)) ([resultWrapper1894099 input] (clojure.core/let [rawinput1894098 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894100 {"Folders" (rawinput1894098 "Folders"), "Marker" (rawinput1894098 "Marker")}] (clojure.core/cond-> {} (letvar1894100 "Folders") (clojure.core/assoc :folders (deser-folder-metadata-list (clojure.core/get-in letvar1894100 ["Folders"]))) (letvar1894100 "Marker") (clojure.core/assoc :marker (deser-page-marker-type (clojure.core/get-in letvar1894100 ["Marker"])))))))

(clojure.core/defn- response-describe-document-versions-response ([input] (response-describe-document-versions-response nil input)) ([resultWrapper1894102 input] (clojure.core/let [rawinput1894101 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894103 {"DocumentVersions" (rawinput1894101 "DocumentVersions"), "Marker" (rawinput1894101 "Marker")}] (clojure.core/cond-> {} (letvar1894103 "DocumentVersions") (clojure.core/assoc :document-versions (deser-document-version-metadata-list (clojure.core/get-in letvar1894103 ["DocumentVersions"]))) (letvar1894103 "Marker") (clojure.core/assoc :marker (deser-page-marker-type (clojure.core/get-in letvar1894103 ["Marker"])))))))

(clojure.core/defn- response-draft-upload-out-of-sync-exception ([input] (response-draft-upload-out-of-sync-exception nil input)) ([resultWrapper1894105 input] (clojure.core/let [rawinput1894104 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894106 {"Message" (rawinput1894104 "Message")}] (clojure.core/cond-> {} (letvar1894106 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894106 ["Message"])))))))

(clojure.core/defn- response-storage-limit-will-exceed-exception ([input] (response-storage-limit-will-exceed-exception nil input)) ([resultWrapper1894108 input] (clojure.core/let [rawinput1894107 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894109 {"Message" (rawinput1894107 "Message")}] (clojure.core/cond-> {} (letvar1894109 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894109 ["Message"])))))))

(clojure.core/defn- response-delete-custom-metadata-response ([input] (response-delete-custom-metadata-response nil input)) ([resultWrapper1894111 input] (clojure.core/let [rawinput1894110 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894112 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-illegal-user-state-exception ([input] (response-illegal-user-state-exception nil input)) ([resultWrapper1894114 input] (clojure.core/let [rawinput1894113 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894115 {"Message" (rawinput1894113 "Message")}] (clojure.core/cond-> {} (letvar1894115 "Message") (clojure.core/assoc :message (deser-error-message-type (clojure.core/get-in letvar1894115 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/parent-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/thread-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/text (clojure.spec.alpha/and :portkey.aws.workdocs/comment-text-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/visibility (clojure.spec.alpha/and :portkey.aws.workdocs/comment-visibility-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-comment-request/notify-collaborators (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-comment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.create-comment-request/document-id :portkey.aws.workdocs.create-comment-request/version-id :portkey.aws.workdocs.create-comment-request/text] :opt-un [:portkey.aws.workdocs.create-comment-request/authentication-token :portkey.aws.workdocs.create-comment-request/parent-id :portkey.aws.workdocs.create-comment-request/thread-id :portkey.aws.workdocs.create-comment-request/visibility :portkey.aws.workdocs.create-comment-request/notify-collaborators]))

(clojure.spec.alpha/def :portkey.aws.workdocs.deactivate-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.deactivate-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/deactivate-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.deactivate-user-request/user-id] :opt-un [:portkey.aws.workdocs.deactivate-user-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs/user]))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-source-url-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/document-source-type :portkey.aws.workdocs/url-type))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+-.@]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/principal-type #{"USER" "ORGANIZATION" :group :organization "INVITE" :anonymous :invite "ANONYMOUS" :user "GROUP"})

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
(clojure.spec.alpha/def :portkey.aws.workdocs/folder-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.folder-metadata/created-timestamp :portkey.aws.workdocs.folder-metadata/parent-folder-id :portkey.aws.workdocs.folder-metadata/modified-timestamp :portkey.aws.workdocs.folder-metadata/latest-version-size :portkey.aws.workdocs.folder-metadata/signature :portkey.aws.workdocs.folder-metadata/labels :portkey.aws.workdocs.folder-metadata/size :portkey.aws.workdocs.folder-metadata/creator-id :portkey.aws.workdocs.folder-metadata/name :portkey.aws.workdocs.folder-metadata/resource-state :portkey.aws.workdocs.folder-metadata/id]))

(clojure.spec.alpha/def :portkey.aws.workdocs.notification-options/send-email (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.notification-options/email-message (clojure.spec.alpha/and :portkey.aws.workdocs/message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/notification-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.notification-options/send-email :portkey.aws.workdocs.notification-options/email-message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-path-component/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-path-component/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-path-component (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-path-component/id :portkey.aws.workdocs.resource-path-component/name]))

(clojure.spec.alpha/def :portkey.aws.workdocs/role-permission-type #{:direct :inherited "INHERITED" "DIRECT"})

(clojure.spec.alpha/def :portkey.aws.workdocs/group-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/group-metadata))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-request/collection-type (clojure.spec.alpha/and :portkey.aws.workdocs/resource-collection-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-resources-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.get-resources-request/authentication-token :portkey.aws.workdocs.get-resources-request/user-id :portkey.aws.workdocs.get-resources-request/collection-type :portkey.aws.workdocs.get-resources-request/limit :portkey.aws.workdocs.get-resources-request/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/deactivating-last-system-user-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/time-zone-id (clojure.spec.alpha/and :portkey.aws.workdocs/time-zone-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/type (clojure.spec.alpha/and :portkey.aws.workdocs/user-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/locale (clojure.spec.alpha/and :portkey.aws.workdocs/locale-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/surname (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/grant-poweruser-privileges (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-enum-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/given-name (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/storage-rule (clojure.spec.alpha/and :portkey.aws.workdocs/storage-rule-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.update-user-request/user-id] :opt-un [:portkey.aws.workdocs.update-user-request/time-zone-id :portkey.aws.workdocs.update-user-request/type :portkey.aws.workdocs.update-user-request/locale :portkey.aws.workdocs.update-user-request/surname :portkey.aws.workdocs.update-user-request/grant-poweruser-privileges :portkey.aws.workdocs.update-user-request/given-name :portkey.aws.workdocs.update-user-request/storage-rule :portkey.aws.workdocs.update-user-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-status-type #{:initialized "INITIALIZED" :active "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/creator-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/latest-version-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/resource-state (clojure.spec.alpha/and :portkey.aws.workdocs/resource-state-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.document-metadata/labels (clojure.spec.alpha/and :portkey.aws.workdocs/shared-labels))
(clojure.spec.alpha/def :portkey.aws.workdocs/document-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.document-metadata/id :portkey.aws.workdocs.document-metadata/creator-id :portkey.aws.workdocs.document-metadata/parent-folder-id :portkey.aws.workdocs.document-metadata/created-timestamp :portkey.aws.workdocs.document-metadata/modified-timestamp :portkey.aws.workdocs.document-metadata/latest-version-metadata :portkey.aws.workdocs.document-metadata/resource-state :portkey.aws.workdocs.document-metadata/labels]))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-response/path (clojure.spec.alpha/and :portkey.aws.workdocs/resource-path))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-path-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.get-folder-path-response/path]))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-response/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.get-document-version-response/metadata :portkey.aws.workdocs.get-document-version-response/custom-metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-request/include-custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.get-document-request/document-id] :opt-un [:portkey.aws.workdocs.get-document-request/authentication-token :portkey.aws.workdocs.get-document-request/include-custom-metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-folder-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.create-folder-response/metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/search-query (clojure.spec.alpha/and :portkey.aws.workdocs/search-query-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/positive-integer-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.describe-groups-request/search-query] :opt-un [:portkey.aws.workdocs.describe-groups-request/authentication-token :portkey.aws.workdocs.describe-groups-request/organization-id :portkey.aws.workdocs.describe-groups-request/marker :portkey.aws.workdocs.describe-groups-request/limit]))

(clojure.spec.alpha/def :portkey.aws.workdocs/search-query-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uFFFF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-request/include-custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.get-folder-request/folder-id] :opt-un [:portkey.aws.workdocs.get-folder-request/authentication-token :portkey.aws.workdocs.get-folder-request/include-custom-metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-response/share-results (clojure.spec.alpha/and :portkey.aws.workdocs/share-results-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/add-resource-permissions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.add-resource-permissions-response/share-results]))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/include (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-document-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.describe-document-versions-request/document-id] :opt-un [:portkey.aws.workdocs.describe-document-versions-request/authentication-token :portkey.aws.workdocs.describe-document-versions-request/marker :portkey.aws.workdocs.describe-document-versions-request/limit :portkey.aws.workdocs.describe-document-versions-request/include :portkey.aws.workdocs.describe-document-versions-request/fields]))

(clojure.spec.alpha/def :portkey.aws.workdocs.comment/recipient-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/visibility (clojure.spec.alpha/and :portkey.aws.workdocs/comment-visibility-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/parent-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/status (clojure.spec.alpha/and :portkey.aws.workdocs/comment-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/comment-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/thread-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/text (clojure.spec.alpha/and :portkey.aws.workdocs/comment-text-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment/contributor (clojure.spec.alpha/and :portkey.aws.workdocs/user))
(clojure.spec.alpha/def :portkey.aws.workdocs/comment (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.comment/comment-id] :opt-un [:portkey.aws.workdocs.comment/recipient-id :portkey.aws.workdocs.comment/created-timestamp :portkey.aws.workdocs.comment/visibility :portkey.aws.workdocs.comment/parent-id :portkey.aws.workdocs.comment/status :portkey.aws.workdocs.comment/thread-id :portkey.aws.workdocs.comment/text :portkey.aws.workdocs.comment/contributor]))

(clojure.spec.alpha/def :portkey.aws.workdocs/marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0000-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-custom-metadata-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs.group-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.group-metadata/name (clojure.spec.alpha/and :portkey.aws.workdocs/group-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/group-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.group-metadata/id :portkey.aws.workdocs.group-metadata/name]))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/end-time (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/start-time (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/activity-types (clojure.spec.alpha/and :portkey.aws.workdocs/activity-names-filter-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/include-indirect-activities (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-activities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-activities-request/end-time :portkey.aws.workdocs.describe-activities-request/start-time :portkey.aws.workdocs.describe-activities-request/user-id :portkey.aws.workdocs.describe-activities-request/marker :portkey.aws.workdocs.describe-activities-request/organization-id :portkey.aws.workdocs.describe-activities-request/limit :portkey.aws.workdocs.describe-activities-request/activity-types :portkey.aws.workdocs.describe-activities-request/resource-id :portkey.aws.workdocs.describe-activities-request/include-indirect-activities :portkey.aws.workdocs.describe-activities-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-path-component-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/resource-path-component))

(clojure.spec.alpha/def :portkey.aws.workdocs/positive-size-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workdocs.activate-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activate-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/activate-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.activate-user-request/user-id] :opt-un [:portkey.aws.workdocs.activate-user-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs.remove-all-resource-permissions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.remove-all-resource-permissions-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/remove-all-resource-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.remove-all-resource-permissions-request/resource-id] :opt-un [:portkey.aws.workdocs.remove-all-resource-permissions-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-path-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.get-document-path-request/document-id] :opt-un [:portkey.aws.workdocs.get-document-path-request/authentication-token :portkey.aws.workdocs.get-document-path-request/limit :portkey.aws.workdocs.get-document-path-request/fields :portkey.aws.workdocs.get-document-path-request/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-comment-request/comment-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-comment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-comment-request/document-id :portkey.aws.workdocs.delete-comment-request/version-id :portkey.aws.workdocs.delete-comment-request/comment-id] :opt-un [:portkey.aws.workdocs.delete-comment-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/locale-type #{:fr :ja "en" :es "zh_CN" :default "zh_TW" :ko :zh-tw "fr" :pt-br "de" :en "ru" "es" :de "ja" :ru :zh-cn "ko" "default" "pt_BR"})

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/keys (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-key-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-custom-metadata-request/delete-all (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-custom-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-custom-metadata-request/resource-id] :opt-un [:portkey.aws.workdocs.delete-custom-metadata-request/authentication-token :portkey.aws.workdocs.delete-custom-metadata-request/version-id :portkey.aws.workdocs.delete-custom-metadata-request/keys :portkey.aws.workdocs.delete-custom-metadata-request/delete-all]))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-response/comments (clojure.spec.alpha/and :portkey.aws.workdocs/comment-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-comments-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-comments-response/comments :portkey.aws.workdocs.describe-comments-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/activity-names-filter-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w,]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/user-metadata))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._+-/=][a-zA-Z0-9 ._+-/=]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-response/groups (clojure.spec.alpha/and :portkey.aws.workdocs/group-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-groups-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-groups-response/groups :portkey.aws.workdocs.describe-groups-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.add-resource-permissions-request/principals (clojure.spec.alpha/and :portkey.aws.workdocs/share-principal-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/add-resource-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.add-resource-permissions-request/resource-id :portkey.aws.workdocs.add-resource-permissions-request/principals] :opt-un [:portkey.aws.workdocs.add-resource-permissions-request/authentication-token :portkey.aws.workdocs/notification-options]))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/type (clojure.spec.alpha/and :portkey.aws.workdocs/resource-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/original-name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/owner (clojure.spec.alpha/and :portkey.aws.workdocs/user-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.resource-metadata/parent-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-metadata/type :portkey.aws.workdocs.resource-metadata/name :portkey.aws.workdocs.resource-metadata/original-name :portkey.aws.workdocs.resource-metadata/id :portkey.aws.workdocs.resource-metadata/version-id :portkey.aws.workdocs.resource-metadata/owner :portkey.aws.workdocs.resource-metadata/parent-id]))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-activities (clojure.spec.alpha/coll-of :portkey.aws.workdocs/activity))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-comments-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-comments-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.describe-comments-request/document-id :portkey.aws.workdocs.describe-comments-request/version-id] :opt-un [:portkey.aws.workdocs.describe-comments-request/authentication-token :portkey.aws.workdocs.describe-comments-request/limit :portkey.aws.workdocs.describe-comments-request/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/email-address-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/signed-header-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/header-name-type :portkey.aws.workdocs/header-value-type))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-ids-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2000)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[&\w+-.@, ]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.entity-not-exists-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.entity-not-exists-exception/entity-ids (clojure.spec.alpha/and :portkey.aws.workdocs/entity-id-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/entity-not-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.entity-not-exists-exception/message :portkey.aws.workdocs.entity-not-exists-exception/entity-ids]))

(clojure.spec.alpha/def :portkey.aws.workdocs/share-principal-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/share-principal))

(clojure.spec.alpha/def :portkey.aws.workdocs.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.failed-dependency-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/failed-dependency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.failed-dependency-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-type #{"MINIMALUSER" "USER" :admin :poweruser "POWERUSER" :workspacesuser "ADMIN" :minimaluser "WORKSPACESUSER" :user})

(clojure.spec.alpha/def :portkey.aws.workdocs.too-many-labels-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/too-many-labels-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.too-many-labels-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-status-type #{"PUBLISHED" :deleted "DRAFT" :draft "DELETED" :published})

(clojure.spec.alpha/def :portkey.aws.workdocs.activity/type (clojure.spec.alpha/and :portkey.aws.workdocs/activity-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/original-parent (clojure.spec.alpha/and :portkey.aws.workdocs/resource-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/is-indirect-activity (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/initiator (clojure.spec.alpha/and :portkey.aws.workdocs/user-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.activity/time-stamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/activity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.activity/type :portkey.aws.workdocs/resource-metadata :portkey.aws.workdocs.activity/organization-id :portkey.aws.workdocs.activity/original-parent :portkey.aws.workdocs.activity/is-indirect-activity :portkey.aws.workdocs/participants :portkey.aws.workdocs.activity/initiator :portkey.aws.workdocs.activity/time-stamp :portkey.aws.workdocs/comment-metadata]))

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
(clojure.spec.alpha/def :portkey.aws.workdocs/user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.user/username :portkey.aws.workdocs.user/storage :portkey.aws.workdocs.user/created-timestamp :portkey.aws.workdocs.user/time-zone-id :portkey.aws.workdocs.user/type :portkey.aws.workdocs.user/locale :portkey.aws.workdocs.user/surname :portkey.aws.workdocs.user/recycle-bin-folder-id :portkey.aws.workdocs.user/organization-id :portkey.aws.workdocs.user/status :portkey.aws.workdocs.user/modified-timestamp :portkey.aws.workdocs.user/given-name :portkey.aws.workdocs.user/root-folder-id :portkey.aws.workdocs.user/email-address :portkey.aws.workdocs.user/id]))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-notification-subscription-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-notification-subscription-request/endpoint (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-end-point-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-notification-subscription-request/protocol (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-protocol-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-notification-subscription-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.create-notification-subscription-request/organization-id :portkey.aws.workdocs.create-notification-subscription-request/endpoint :portkey.aws.workdocs.create-notification-subscription-request/protocol :portkey.aws.workdocs/subscription-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/comment))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-source-type #{"WITH_COMMENTS" :original "ORIGINAL" :with-comments})

(clojure.spec.alpha/def :portkey.aws.workdocs.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.invalid-password-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/invalid-password-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.invalid-password-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/username-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\-+.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z]+)?" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/folder-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/folder-metadata))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-protocol-type #{"HTTPS" :https})

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
(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.document-version-metadata/created-timestamp :portkey.aws.workdocs.document-version-metadata/source :portkey.aws.workdocs.document-version-metadata/content-modified-timestamp :portkey.aws.workdocs.document-version-metadata/status :portkey.aws.workdocs.document-version-metadata/modified-timestamp :portkey.aws.workdocs.document-version-metadata/content-type :portkey.aws.workdocs.document-version-metadata/signature :portkey.aws.workdocs.document-version-metadata/content-created-timestamp :portkey.aws.workdocs.document-version-metadata/thumbnail :portkey.aws.workdocs.document-version-metadata/size :portkey.aws.workdocs.document-version-metadata/creator-id :portkey.aws.workdocs.document-version-metadata/name :portkey.aws.workdocs.document-version-metadata/id]))

(clojure.spec.alpha/def :portkey.aws.workdocs/share-status-type #{"SUCCESS" :failure "FAILURE" :success})

(clojure.spec.alpha/def :portkey.aws.workdocs/size-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workdocs/group-name-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/principal-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-resource-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.describe-resource-permissions-request/resource-id] :opt-un [:portkey.aws.workdocs.describe-resource-permissions-request/authentication-token :portkey.aws.workdocs.describe-resource-permissions-request/principal-id :portkey.aws.workdocs.describe-resource-permissions-request/limit :portkey.aws.workdocs.describe-resource-permissions-request/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/error-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workdocs.invalid-comment-operation-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/invalid-comment-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.invalid-comment-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.custom-metadata-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.custom-metadata-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-visibility-type #{:private :public "PRIVATE" "PUBLIC"})

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-notification-subscriptions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-notification-subscriptions-response/subscriptions :portkey.aws.workdocs.describe-notification-subscriptions-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-folder-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-folder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.create-folder-request/parent-folder-id] :opt-un [:portkey.aws.workdocs.create-folder-request/authentication-token :portkey.aws.workdocs.create-folder-request/name]))

(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/username (clojure.spec.alpha/and :portkey.aws.workdocs/username-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/given-name (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/surname (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-metadata/email-address (clojure.spec.alpha/and :portkey.aws.workdocs/email-address-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/user-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.user-metadata/id :portkey.aws.workdocs.user-metadata/username :portkey.aws.workdocs.user-metadata/given-name :portkey.aws.workdocs.user-metadata/surname :portkey.aws.workdocs.user-metadata/email-address]))

(clojure.spec.alpha/def :portkey.aws.workdocs/update-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs/user]))

(clojure.spec.alpha/def :portkey.aws.workdocs.entity-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/entity-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.entity-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/principal-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/principal))

(clojure.spec.alpha/def :portkey.aws.workdocs/url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.workdocs.invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.too-many-subscriptions-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/too-many-subscriptions-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.too-many-subscriptions-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/organization-user-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/user))

(clojure.spec.alpha/def :portkey.aws.workdocs.unauthorized-resource-access-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/unauthorized-resource-access-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.unauthorized-resource-access-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/activate-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs/user]))

(clojure.spec.alpha/def :portkey.aws.workdocs/shared-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._+-/=][a-zA-Z0-9 ._+-/=]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 4 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-activities-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-activities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs/user-activities :portkey.aws.workdocs.describe-activities-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-sort-type #{"STORAGE_LIMIT" :user-status :storage-limit :user-name "USER_STATUS" :storage-used :full-name "FULL_NAME" "STORAGE_USED" "USER_NAME"})

(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-response/folders (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-response/documents (clojure.spec.alpha/and :portkey.aws.workdocs/document-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-resources-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-resources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.get-resources-response/folders :portkey.aws.workdocs.get-resources-response/documents :portkey.aws.workdocs.get-resources-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs.upload-metadata/upload-url (clojure.spec.alpha/and :portkey.aws.workdocs/url-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.upload-metadata/signed-headers (clojure.spec.alpha/and :portkey.aws.workdocs/signed-header-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/upload-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.upload-metadata/upload-url :portkey.aws.workdocs.upload-metadata/signed-headers]))

(clojure.spec.alpha/def :portkey.aws.workdocs.prohibited-state-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/prohibited-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.prohibited-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/activity-type #{"DOCUMENT_REVERTED" :document-comment-added :folder-share-permission-changed "FOLDER_SHAREABLE_LINK_CREATED" "DOCUMENT_SHARE_PERMISSION_CHANGED" :folder-shareable-link-permission-changed :folder-recycled "DOCUMENT_SHAREABLE_LINK_REMOVED" "FOLDER_RESTORED" "FOLDER_SHAREABLE_LINK_REMOVED" "DOCUMENT_COMMENT_DELETED" "FOLDER_RECYCLED" :document-annotation-deleted :document-unshared :document-share-permission-changed "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED" :folder-moved :folder-shared :folder-renamed "DOCUMENT_RESTORED" "DOCUMENT_UNSHARED" :document-comment-deleted :document-annotation-added :folder-deleted :folder-unshared "DOCUMENT_ANNOTATION_DELETED" "DOCUMENT_RENAMED" :document-shared "FOLDER_CREATED" "FOLDER_MOVED" :document-version-uploaded "FOLDER_DELETED" :folder-shareable-link-removed "FOLDER_RENAMED" "DOCUMENT_SHARED" :document-version-deleted "FOLDER_SHARE_PERMISSION_CHANGED" :document-restored :document-shareable-link-permission-changed :folder-shareable-link-created :document-reverted "DOCUMENT_ANNOTATION_ADDED" "DOCUMENT_VERSION_UPLOADED" "DOCUMENT_COMMENT_ADDED" "DOCUMENT_SHAREABLE_LINK_CREATED" "DOCUMENT_VERSION_DOWNLOADED" :document-moved "FOLDER_SHARED" :document-shareable-link-created "DOCUMENT_VERSION_DELETED" "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED" :document-renamed :folder-created "DOCUMENT_CHECKED_IN" :document-checked-in "FOLDER_UNSHARED" :document-version-downloaded "DOCUMENT_RECYCLED" "DOCUMENT_MOVED" "DOCUMENT_CHECKED_OUT" :folder-restored :document-shareable-link-removed :document-recycled :document-version-viewed "DOCUMENT_VERSION_VIEWED" :document-checked-out})

(clojure.spec.alpha/def :portkey.aws.workdocs/user-status-type #{:inactive :pending "PENDING" :active "INACTIVE" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.workdocs/page-marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-response/principals (clojure.spec.alpha/and :portkey.aws.workdocs/principal-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-resource-permissions-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-resource-permissions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-resource-permissions-response/principals :portkey.aws.workdocs.describe-resource-permissions-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-request/resource-state (clojure.spec.alpha/and :portkey.aws.workdocs/resource-state-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.update-document-request/document-id] :opt-un [:portkey.aws.workdocs.update-document-request/authentication-token :portkey.aws.workdocs.update-document-request/name :portkey.aws.workdocs.update-document-request/parent-folder-id :portkey.aws.workdocs.update-document-request/resource-state]))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/subscription :max-count 256))

(clojure.spec.alpha/def :portkey.aws.workdocs/create-notification-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs/subscription]))

(clojure.spec.alpha/def :portkey.aws.workdocs.remove-resource-permission-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.remove-resource-permission-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.remove-resource-permission-request/principal-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/remove-resource-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.remove-resource-permission-request/resource-id :portkey.aws.workdocs.remove-resource-permission-request/principal-id] :opt-un [:portkey.aws.workdocs.remove-resource-permission-request/authentication-token :portkey.aws.workdocs/principal-type]))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-already-checked-out-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-already-checked-out-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-already-checked-out-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-response/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.get-folder-response/metadata :portkey.aws.workdocs.get-folder-response/custom-metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs/unauthorized-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-end-point-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.workdocs/authentication-header-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 8199))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-folder-path-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-folder-path-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.get-folder-path-request/folder-id] :opt-un [:portkey.aws.workdocs.get-folder-path-request/authentication-token :portkey.aws.workdocs.get-folder-path-request/limit :portkey.aws.workdocs.get-folder-path-request/fields :portkey.aws.workdocs.get-folder-path-request/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-thumbnail-type #{:large "SMALL_HQ" "LARGE" :small-hq :small "SMALL"})

(clojure.spec.alpha/def :portkey.aws.workdocs.participants/users (clojure.spec.alpha/and :portkey.aws.workdocs/user-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.participants/groups (clojure.spec.alpha/and :portkey.aws.workdocs/group-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/participants (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.participants/users :portkey.aws.workdocs.participants/groups]))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 56)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._+-/=][a-zA-Z0-9 ._+-/=]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\u202D\u202F-\uFFFF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-sort-type #{:date "NAME" :name "DATE"})

(clojure.spec.alpha/def :portkey.aws.workdocs/create-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs/time-zone-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.workdocs/user-filter-type #{:active-pending :all "ACTIVE_PENDING" "ALL"})

(clojure.spec.alpha/def :portkey.aws.workdocs/id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[&\w+-.@]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/subscription-type #{:all "ALL"})

(clojure.spec.alpha/def :portkey.aws.workdocs/create-comment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs/comment]))

(clojure.spec.alpha/def :portkey.aws.workdocs/delete-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-response/users (clojure.spec.alpha/and :portkey.aws.workdocs/organization-user-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-response/total-number-of-users (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-users-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-users-response/users :portkey.aws.workdocs.describe-users-response/total-number-of-users :portkey.aws.workdocs.describe-users-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs.storage-rule-type/storage-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.workdocs/positive-size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/storage-rule-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.storage-rule-type/storage-allocated-in-bytes :portkey.aws.workdocs/storage-type]))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-type #{:folder "DOCUMENT" :document "FOLDER"})

(clojure.spec.alpha/def :portkey.aws.workdocs.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-contents-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-contents-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-folder-contents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-folder-contents-request/folder-id] :opt-un [:portkey.aws.workdocs.delete-folder-contents-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+-.@]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-current-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-current-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.get-current-user-request/authentication-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-state-type #{"RESTORING" :restoring "RECYCLING" :active "ACTIVE" :recycling "RECYCLED" :recycled})

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-document-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-document-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-document-request/document-id] :opt-un [:portkey.aws.workdocs.delete-document-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs.resource-path/components (clojure.spec.alpha/and :portkey.aws.workdocs/resource-path-component-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/resource-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.resource-path/components]))

(clojure.spec.alpha/def :portkey.aws.workdocs/storage-type #{"UNLIMITED" :unlimited :quota "QUOTA"})

(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-document-version-request/version-status (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-status))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-document-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.update-document-version-request/document-id :portkey.aws.workdocs.update-document-version-request/version-id] :opt-un [:portkey.aws.workdocs.update-document-version-request/authentication-token :portkey.aws.workdocs.update-document-version-request/version-status]))

(clojure.spec.alpha/def :portkey.aws.workdocs/get-current-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs/user]))

(clojure.spec.alpha/def :portkey.aws.workdocs.conflicting-operation-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/conflicting-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.conflicting-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-folder-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-folder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-folder-request/folder-id] :opt-un [:portkey.aws.workdocs.delete-folder-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/document-version-metadata))

(clojure.spec.alpha/def :portkey.aws.workdocs/message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/username (clojure.spec.alpha/and :portkey.aws.workdocs/username-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/time-zone-id (clojure.spec.alpha/and :portkey.aws.workdocs/time-zone-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/password (clojure.spec.alpha/and :portkey.aws.workdocs/password-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/surname (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/given-name (clojure.spec.alpha/and :portkey.aws.workdocs/user-attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/storage-rule (clojure.spec.alpha/and :portkey.aws.workdocs/storage-rule-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/email-address (clojure.spec.alpha/and :portkey.aws.workdocs/email-address-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.create-user-request/username :portkey.aws.workdocs.create-user-request/given-name :portkey.aws.workdocs.create-user-request/surname :portkey.aws.workdocs.create-user-request/password] :opt-un [:portkey.aws.workdocs.create-user-request/time-zone-id :portkey.aws.workdocs.create-user-request/organization-id :portkey.aws.workdocs.create-user-request/storage-rule :portkey.aws.workdocs.create-user-request/email-address :portkey.aws.workdocs.create-user-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/document-metadata))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+-.@]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-root-folders-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.describe-root-folders-request/authentication-token] :opt-un [:portkey.aws.workdocs.describe-root-folders-request/limit :portkey.aws.workdocs.describe-root-folders-request/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs.requested-entity-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/requested-entity-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.requested-entity-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-response/folders (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-response/documents (clojure.spec.alpha/and :portkey.aws.workdocs/document-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-folder-contents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-folder-contents-response/folders :portkey.aws.workdocs.describe-folder-contents-response/documents :portkey.aws.workdocs.describe-folder-contents-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/positive-integer-type (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.workdocs.storage-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/storage-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.storage-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-labels-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-labels-request/labels (clojure.spec.alpha/and :portkey.aws.workdocs/shared-labels))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-labels-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.create-labels-request/resource-id :portkey.aws.workdocs.create-labels-request/labels] :opt-un [:portkey.aws.workdocs.create-labels-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs.subscription/subscription-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.subscription/end-point (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-end-point-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.subscription/protocol (clojure.spec.alpha/and :portkey.aws.workdocs/subscription-protocol-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.subscription/subscription-id :portkey.aws.workdocs.subscription/end-point :portkey.aws.workdocs.subscription/protocol]))

(clojure.spec.alpha/def :portkey.aws.workdocs/hash-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[&\w+-.@]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-user-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-user-request/user-id] :opt-un [:portkey.aws.workdocs.delete-user-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs.permission-info/role (clojure.spec.alpha/and :portkey.aws.workdocs/role-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.permission-info/type (clojure.spec.alpha/and :portkey.aws.workdocs/role-permission-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/permission-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.permission-info/role :portkey.aws.workdocs.permission-info/type]))

(clojure.spec.alpha/def :portkey.aws.workdocs/folder-content-type #{:folder "DOCUMENT" :all :document "FOLDER" "ALL"})

(clojure.spec.alpha/def :portkey.aws.workdocs/document-thumbnail-url-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/document-thumbnail-type :portkey.aws.workdocs/url-type))

(clojure.spec.alpha/def :portkey.aws.workdocs/permission-info-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/permission-info))

(clojure.spec.alpha/def :portkey.aws.workdocs/limit-type (clojure.spec.alpha/int-in 1 999))

(clojure.spec.alpha/def :portkey.aws.workdocs/field-names-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w,]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs/header-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs/initiate-document-version-upload-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.initiate-document-version-upload-response/metadata :portkey.aws.workdocs/upload-metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-response/metadata (clojure.spec.alpha/and :portkey.aws.workdocs/document-metadata))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-response/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.get-document-response/metadata :portkey.aws.workdocs.get-document-response/custom-metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs/document-version-status #{:active "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.workdocs/order-type #{:descending :ascending "ASCENDING" "DESCENDING"})

(clojure.spec.alpha/def :portkey.aws.workdocs/entity-id-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/id-type))

(clojure.spec.alpha/def :portkey.aws.workdocs.share-principal/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-principal/type (clojure.spec.alpha/and :portkey.aws.workdocs/principal-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-principal/role (clojure.spec.alpha/and :portkey.aws.workdocs/role-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/share-principal (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.share-principal/id :portkey.aws.workdocs.share-principal/type :portkey.aws.workdocs.share-principal/role] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs/boolean-enum-type #{:true :false "TRUE" "FALSE"})

(clojure.spec.alpha/def :portkey.aws.workdocs.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.document-locked-for-comments-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/document-locked-for-comments-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.document-locked-for-comments-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-path-response/path (clojure.spec.alpha/and :portkey.aws.workdocs/resource-path))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-path-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.get-document-path-response/path]))

(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/content-created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/content-modified-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/content-type (clojure.spec.alpha/and :portkey.aws.workdocs/document-content-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/document-size-in-bytes (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.initiate-document-version-upload-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/initiate-document-version-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.initiate-document-version-upload-request/parent-folder-id] :opt-un [:portkey.aws.workdocs.initiate-document-version-upload-request/authentication-token :portkey.aws.workdocs.initiate-document-version-upload-request/id :portkey.aws.workdocs.initiate-document-version-upload-request/name :portkey.aws.workdocs.initiate-document-version-upload-request/content-created-timestamp :portkey.aws.workdocs.initiate-document-version-upload-request/content-modified-timestamp :portkey.aws.workdocs.initiate-document-version-upload-request/content-type :portkey.aws.workdocs.initiate-document-version-upload-request/document-size-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/principal-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/invitee-principal-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/role (clojure.spec.alpha/and :portkey.aws.workdocs/role-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/status (clojure.spec.alpha/and :portkey.aws.workdocs/share-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/share-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.share-result/status-message (clojure.spec.alpha/and :portkey.aws.workdocs/message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/share-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.share-result/principal-id :portkey.aws.workdocs.share-result/invitee-principal-id :portkey.aws.workdocs.share-result/role :portkey.aws.workdocs.share-result/status :portkey.aws.workdocs.share-result/share-id :portkey.aws.workdocs.share-result/status-message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.principal/id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.principal/type (clojure.spec.alpha/and :portkey.aws.workdocs/principal-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.principal/roles (clojure.spec.alpha/and :portkey.aws.workdocs/permission-info-list))
(clojure.spec.alpha/def :portkey.aws.workdocs/principal (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.principal/id :portkey.aws.workdocs.principal/type :portkey.aws.workdocs.principal/roles]))

(clojure.spec.alpha/def :portkey.aws.workdocs/comment-text-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.workdocs/resource-collection-type #{:shared-with-me "SHARED_WITH_ME"})

(clojure.spec.alpha/def :portkey.aws.workdocs/user-attribute-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-response/folders (clojure.spec.alpha/and :portkey.aws.workdocs/folder-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-root-folders-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-root-folders-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-root-folders-response/folders :portkey.aws.workdocs.describe-root-folders-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-key-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/custom-metadata-key-type :max-count 8))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-response/document-versions (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-metadata-list))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-document-versions-response/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-document-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-document-versions-response/document-versions :portkey.aws.workdocs.describe-document-versions-response/marker]))

(clojure.spec.alpha/def :portkey.aws.workdocs/shared-labels (clojure.spec.alpha/coll-of :portkey.aws.workdocs/shared-label :max-count 20))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-notification-subscription-request/subscription-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-notification-subscription-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-notification-subscription-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-notification-subscription-request/subscription-id :portkey.aws.workdocs.delete-notification-subscription-request/organization-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workdocs/share-results-list (clojure.spec.alpha/coll-of :portkey.aws.workdocs/share-result))

(clojure.spec.alpha/def :portkey.aws.workdocs.user-storage-metadata/storage-utilized-in-bytes (clojure.spec.alpha/and :portkey.aws.workdocs/size-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.user-storage-metadata/storage-rule (clojure.spec.alpha/and :portkey.aws.workdocs/storage-rule-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/user-storage-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.user-storage-metadata/storage-utilized-in-bytes :portkey.aws.workdocs.user-storage-metadata/storage-rule]))

(clojure.spec.alpha/def :portkey.aws.workdocs.draft-upload-out-of-sync-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/draft-upload-out-of-sync-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.draft-upload-out-of-sync-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.create-custom-metadata-request/custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/custom-metadata-map))
(clojure.spec.alpha/def :portkey.aws.workdocs/create-custom-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.create-custom-metadata-request/resource-id :portkey.aws.workdocs.create-custom-metadata-request/custom-metadata] :opt-un [:portkey.aws.workdocs.create-custom-metadata-request/authentication-token :portkey.aws.workdocs.create-custom-metadata-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/sort (clojure.spec.alpha/and :portkey.aws.workdocs/resource-sort-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/order (clojure.spec.alpha/and :portkey.aws.workdocs/order-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/type (clojure.spec.alpha/and :portkey.aws.workdocs/folder-content-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-folder-contents-request/include (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-folder-contents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.describe-folder-contents-request/folder-id] :opt-un [:portkey.aws.workdocs.describe-folder-contents-request/authentication-token :portkey.aws.workdocs.describe-folder-contents-request/sort :portkey.aws.workdocs.describe-folder-contents-request/order :portkey.aws.workdocs.describe-folder-contents-request/limit :portkey.aws.workdocs.describe-folder-contents-request/marker :portkey.aws.workdocs.describe-folder-contents-request/type :portkey.aws.workdocs.describe-folder-contents-request/include]))

(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/name (clojure.spec.alpha/and :portkey.aws.workdocs/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/parent-folder-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.update-folder-request/resource-state (clojure.spec.alpha/and :portkey.aws.workdocs/resource-state-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/update-folder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.update-folder-request/folder-id] :opt-un [:portkey.aws.workdocs.update-folder-request/authentication-token :portkey.aws.workdocs.update-folder-request/name :portkey.aws.workdocs.update-folder-request/parent-folder-id :portkey.aws.workdocs.update-folder-request/resource-state]))

(clojure.spec.alpha/def :portkey.aws.workdocs.storage-limit-will-exceed-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/storage-limit-will-exceed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.storage-limit-will-exceed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/resource-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/labels (clojure.spec.alpha/and :portkey.aws.workdocs/shared-labels))
(clojure.spec.alpha/def :portkey.aws.workdocs.delete-labels-request/delete-all (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/delete-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.delete-labels-request/resource-id] :opt-un [:portkey.aws.workdocs.delete-labels-request/authentication-token :portkey.aws.workdocs.delete-labels-request/labels :portkey.aws.workdocs.delete-labels-request/delete-all]))

(clojure.spec.alpha/def :portkey.aws.workdocs/delete-custom-metadata-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-users-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.describe-users-request/user-ids :portkey.aws.workdocs.describe-users-request/sort :portkey.aws.workdocs.describe-users-request/order :portkey.aws.workdocs.describe-users-request/fields :portkey.aws.workdocs.describe-users-request/marker :portkey.aws.workdocs.describe-users-request/organization-id :portkey.aws.workdocs.describe-users-request/limit :portkey.aws.workdocs.describe-users-request/query :portkey.aws.workdocs.describe-users-request/include :portkey.aws.workdocs.describe-users-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/fields (clojure.spec.alpha/and :portkey.aws.workdocs/field-names-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.get-document-version-request/include-custom-metadata (clojure.spec.alpha/and :portkey.aws.workdocs/boolean-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/get-document-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.get-document-version-request/document-id :portkey.aws.workdocs.get-document-version-request/version-id] :opt-un [:portkey.aws.workdocs.get-document-version-request/authentication-token :portkey.aws.workdocs.get-document-version-request/fields :portkey.aws.workdocs.get-document-version-request/include-custom-metadata]))

(clojure.spec.alpha/def :portkey.aws.workdocs/custom-metadata-map (clojure.spec.alpha/map-of :portkey.aws.workdocs/custom-metadata-key-type :portkey.aws.workdocs/custom-metadata-value-type))

(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/comment-id (clojure.spec.alpha/and :portkey.aws.workdocs/comment-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/contributor (clojure.spec.alpha/and :portkey.aws.workdocs/user))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.workdocs/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/comment-status (clojure.spec.alpha/and :portkey.aws.workdocs/comment-status-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.comment-metadata/recipient-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/comment-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.comment-metadata/comment-id :portkey.aws.workdocs.comment-metadata/contributor :portkey.aws.workdocs.comment-metadata/created-timestamp :portkey.aws.workdocs.comment-metadata/comment-status :portkey.aws.workdocs.comment-metadata/recipient-id]))

(clojure.spec.alpha/def :portkey.aws.workdocs/role-type #{"CONTRIBUTOR" :viewer "VIEWER" :coowner "OWNER" :contributor "COOWNER" :owner})

(clojure.spec.alpha/def :portkey.aws.workdocs.abort-document-version-upload-request/authentication-token (clojure.spec.alpha/and :portkey.aws.workdocs/authentication-header-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.abort-document-version-upload-request/document-id (clojure.spec.alpha/and :portkey.aws.workdocs/resource-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.abort-document-version-upload-request/version-id (clojure.spec.alpha/and :portkey.aws.workdocs/document-version-id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/abort-document-version-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.abort-document-version-upload-request/document-id :portkey.aws.workdocs.abort-document-version-upload-request/version-id] :opt-un [:portkey.aws.workdocs.abort-document-version-upload-request/authentication-token]))

(clojure.spec.alpha/def :portkey.aws.workdocs/header-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.workdocs.illegal-user-state-exception/message (clojure.spec.alpha/and :portkey.aws.workdocs/error-message-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/illegal-user-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workdocs.illegal-user-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workdocs/boolean-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-request/organization-id (clojure.spec.alpha/and :portkey.aws.workdocs/id-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-request/marker (clojure.spec.alpha/and :portkey.aws.workdocs/page-marker-type))
(clojure.spec.alpha/def :portkey.aws.workdocs.describe-notification-subscriptions-request/limit (clojure.spec.alpha/and :portkey.aws.workdocs/limit-type))
(clojure.spec.alpha/def :portkey.aws.workdocs/describe-notification-subscriptions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workdocs.describe-notification-subscriptions-request/organization-id] :opt-un [:portkey.aws.workdocs.describe-notification-subscriptions-request/marker :portkey.aws.workdocs.describe-notification-subscriptions-request/limit]))

(clojure.core/defn create-folder "Creates a folder with the specified name and parent folder." ([create-folder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-folder-request create-folder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/create-folder-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/folders", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/create-folder-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFolder", :http.request.configuration/output-deser-fn response-create-folder-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "LimitExceededException" :portkey.aws.workdocs/limit-exceeded-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "ConflictingOperationException" :portkey.aws.workdocs/conflicting-operation-exception}})))))
(clojure.spec.alpha/fdef create-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-folder-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-folder-response))

(clojure.core/defn get-folder-path "Retrieves the path information (the hierarchy from the root folder) for the\nspecified folder.\n By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the\nrequested folder and only includes the IDs of the parent folders in the path.\nYou can limit the maximum number of levels. You can also request the parent\nfolder names." ([get-folder-path-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-folder-path-request get-folder-path-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/get-folder-path-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/folders/{FolderId}/path", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/get-folder-path-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFolderPath", :http.request.configuration/output-deser-fn response-get-folder-path-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-folder-path :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-folder-path-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-folder-path-response))

(clojure.core/defn remove-all-resource-permissions "Removes all the permissions from the specified resource." ([remove-all-resource-permissions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-all-resource-permissions-request remove-all-resource-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/permissions", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/remove-all-resource-permissions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveAllResourcePermissions", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef remove-all-resource-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/remove-all-resource-permissions-request) :ret clojure.core/true?)

(clojure.core/defn get-document-version "Retrieves version metadata for the specified document." ([get-document-version-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-document-version-request get-document-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/get-document-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/versions/{VersionId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/get-document-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDocumentVersion", :http.request.configuration/output-deser-fn response-get-document-version-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "InvalidPasswordException" :portkey.aws.workdocs/invalid-password-exception}})))))
(clojure.spec.alpha/fdef get-document-version :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-document-version-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-document-version-response))

(clojure.core/defn get-document "Retrieves details of a document." ([get-document-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-document-request get-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/get-document-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/get-document-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDocument", :http.request.configuration/output-deser-fn response-get-document-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "InvalidPasswordException" :portkey.aws.workdocs/invalid-password-exception}})))))
(clojure.spec.alpha/fdef get-document :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-document-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-document-response))

(clojure.core/defn describe-folder-contents "Describes the contents of the specified folder, including its documents and\nsubfolders.\n By default, Amazon WorkDocs returns the first 100 active document and folder\nmetadata items. If there are more results, the response includes a marker that\nyou can use to request the next set of results. You can also request initialized\ndocuments." ([describe-folder-contents-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-folder-contents-request describe-folder-contents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-folder-contents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/folders/{FolderId}/contents", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-folder-contents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFolderContents", :http.request.configuration/output-deser-fn response-describe-folder-contents-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception}})))))
(clojure.spec.alpha/fdef describe-folder-contents :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-folder-contents-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-folder-contents-response))

(clojure.core/defn delete-labels "Deletes the specified list of labels from a resource." ([delete-labels-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-labels-request delete-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/delete-labels-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/labels", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-labels-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLabels", :http.request.configuration/output-deser-fn response-delete-labels-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-labels :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/delete-labels-response))

(clojure.core/defn describe-notification-subscriptions "Lists the specified notification subscriptions." ([describe-notification-subscriptions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-notification-subscriptions-request describe-notification-subscriptions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-notification-subscriptions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/organizations/{OrganizationId}/subscriptions", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-notification-subscriptions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeNotificationSubscriptions", :http.request.configuration/output-deser-fn response-describe-notification-subscriptions-response, :http.request.spec/error-spec {"UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-notification-subscriptions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-notification-subscriptions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-notification-subscriptions-response))

(clojure.core/defn describe-root-folders "Describes the current user's special folders; the RootFolder and the RecycleBin.\nRootFolder is the root of user's files and folders and RecycleBin is the root of\nrecycled items. This is not a valid action for SigV4 (administrative API)\nclients.\n This action requires an authentication token. To get an authentication token,\nregister an application with Amazon WorkDocs. For more information, see\nAuthentication and Access Control for User Applications\n(https://docs.aws.amazon.com/workdocs/latest/developerguide/wd-auth-user.html)\nin the Amazon WorkDocs Developer Guide." ([describe-root-folders-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-root-folders-request describe-root-folders-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-root-folders-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/me/root", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-root-folders-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRootFolders", :http.request.configuration/output-deser-fn response-describe-root-folders-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-root-folders :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-root-folders-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-root-folders-response))

(clojure.core/defn add-resource-permissions "Creates a set of permissions for the specified folder or document. The resource\npermissions are overwritten if the principals already have different\npermissions." ([add-resource-permissions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-resource-permissions-request add-resource-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/add-resource-permissions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/permissions", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/add-resource-permissions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddResourcePermissions", :http.request.configuration/output-deser-fn response-add-resource-permissions-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef add-resource-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/add-resource-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/add-resource-permissions-response))

(clojure.core/defn describe-document-versions "Retrieves the document versions for the specified document.\n By default, only active versions are returned." ([describe-document-versions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-document-versions-request describe-document-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-document-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/versions", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-document-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDocumentVersions", :http.request.configuration/output-deser-fn response-describe-document-versions-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception}})))))
(clojure.spec.alpha/fdef describe-document-versions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-document-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-document-versions-response))

(clojure.core/defn delete-user "Deletes the specified user from a Simple AD or Microsoft AD directory." ([delete-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/users/{UserId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user "Creates a user in a Simple AD or Microsoft AD directory. The status of a newly\ncreated user is \"ACTIVE\". New users can access Amazon WorkDocs." ([create-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/create-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/users", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/create-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-user-response))

(clojure.core/defn describe-resource-permissions "Describes the permissions of a specified resource." ([describe-resource-permissions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-resource-permissions-request describe-resource-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-resource-permissions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/permissions", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-resource-permissions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeResourcePermissions", :http.request.configuration/output-deser-fn response-describe-resource-permissions-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-resource-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-resource-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-resource-permissions-response))

(clojure.core/defn describe-users "Describes the specified users. You can describe all users or filter the results\n(for example, by status or organization).\n By default, Amazon WorkDocs returns the first 24 active or pending users. If\nthere are more results, the response includes a marker that you can use to\nrequest the next set of results." ([] (describe-users {})) ([describe-users-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-users-request describe-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/users", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUsers", :http.request.configuration/output-deser-fn response-describe-users-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "RequestedEntityTooLargeException" :portkey.aws.workdocs/requested-entity-too-large-exception}})))))
(clojure.spec.alpha/fdef describe-users :args (clojure.spec.alpha/? :portkey.aws.workdocs/describe-users-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-users-response))

(clojure.core/defn get-document-path "Retrieves the path information (the hierarchy from the root folder) for the\nrequested document.\n By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the\nrequested document and only includes the IDs of the parent folders in the path.\nYou can limit the maximum number of levels. You can also request the names of\nthe parent folders." ([get-document-path-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-document-path-request get-document-path-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/get-document-path-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/path", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/get-document-path-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDocumentPath", :http.request.configuration/output-deser-fn response-get-document-path-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-document-path :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-document-path-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-document-path-response))

(clojure.core/defn remove-resource-permission "Removes the permission for the specified principal from the specified resource." ([remove-resource-permission-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-resource-permission-request remove-resource-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/permissions/{PrincipalId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/remove-resource-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveResourcePermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef remove-resource-permission :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/remove-resource-permission-request) :ret clojure.core/true?)

(clojure.core/defn update-document-version "Changes the status of the document version to ACTIVE.\n Amazon WorkDocs also sets its document container to ACTIVE. This is the last\nstep in a document upload, after the client uploads the document to an\nS3-presigned URL returned by InitiateDocumentVersionUpload." ([update-document-version-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-document-version-request update-document-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/versions/{VersionId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/update-document-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDocumentVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception, "InvalidOperationException" :portkey.aws.workdocs/invalid-operation-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef update-document-version :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-document-version-request) :ret clojure.core/true?)

(clojure.core/defn get-folder "Retrieves the metadata of the specified folder." ([get-folder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-folder-request get-folder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/get-folder-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/folders/{FolderId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/get-folder-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFolder", :http.request.configuration/output-deser-fn response-get-folder-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception}})))))
(clojure.spec.alpha/fdef get-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-folder-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-folder-response))

(clojure.core/defn abort-document-version-upload "Aborts the upload of the specified document version that was previously\ninitiated by InitiateDocumentVersionUpload. The client should make this call\nonly when it no longer intends to upload the document version, or fails to do\nso." ([abort-document-version-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-abort-document-version-upload-request abort-document-version-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/versions/{VersionId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/abort-document-version-upload-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AbortDocumentVersionUpload", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef abort-document-version-upload :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/abort-document-version-upload-request) :ret clojure.core/true?)

(clojure.core/defn describe-comments "List all the comments for the specified document version." ([describe-comments-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-comments-request describe-comments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-comments-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/versions/{VersionId}/comments", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-comments-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeComments", :http.request.configuration/output-deser-fn response-describe-comments-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-comments :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-comments-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-comments-response))

(clojure.core/defn create-comment "Adds a new comment to the specified document version." ([create-comment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-comment-request create-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/create-comment-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/versions/{VersionId}/comment", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/create-comment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateComment", :http.request.configuration/output-deser-fn response-create-comment-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "DocumentLockedForCommentsException" :portkey.aws.workdocs/document-locked-for-comments-exception, "InvalidCommentOperationException" :portkey.aws.workdocs/invalid-comment-operation-exception}})))))
(clojure.spec.alpha/fdef create-comment :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-comment-response))

(clojure.core/defn delete-notification-subscription "Deletes the specified subscription from the specified organization." ([delete-notification-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-notification-subscription-request delete-notification-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/organizations/{OrganizationId}/subscriptions/{SubscriptionId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-notification-subscription-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNotificationSubscription", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception}})))))
(clojure.spec.alpha/fdef delete-notification-subscription :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-notification-subscription-request) :ret clojure.core/true?)

(clojure.core/defn initiate-document-version-upload "Creates a new document object and version object.\n The client specifies the parent folder ID and name of the document to upload.\nThe ID is optionally specified when creating a new version of an existing\ndocument. This is the first step to upload a document. Next, upload the document\nto the URL returned from the call, and then call UpdateDocumentVersion.\n To cancel the document upload, call AbortDocumentVersionUpload." ([initiate-document-version-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-initiate-document-version-upload-request initiate-document-version-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/initiate-document-version-upload-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/initiate-document-version-upload-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateDocumentVersionUpload", :http.request.configuration/output-deser-fn response-initiate-document-version-upload-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ResourceAlreadyCheckedOutException" :portkey.aws.workdocs/resource-already-checked-out-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "StorageLimitExceededException" :portkey.aws.workdocs/storage-limit-exceeded-exception, "DraftUploadOutOfSyncException" :portkey.aws.workdocs/draft-upload-out-of-sync-exception, "StorageLimitWillExceedException" :portkey.aws.workdocs/storage-limit-will-exceed-exception}})))))
(clojure.spec.alpha/fdef initiate-document-version-upload :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/initiate-document-version-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/initiate-document-version-upload-response))

(clojure.core/defn create-notification-subscription "Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives\na confirmation message, and must confirm the subscription.\n For more information, see Subscribe to Notifications\n(https://docs.aws.amazon.com/workdocs/latest/developerguide/subscribe-notifications.html)\nin the Amazon WorkDocs Developer Guide." ([create-notification-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-notification-subscription-request create-notification-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/create-notification-subscription-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/organizations/{OrganizationId}/subscriptions", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/create-notification-subscription-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNotificationSubscription", :http.request.configuration/output-deser-fn response-create-notification-subscription-response, :http.request.spec/error-spec {"UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "TooManySubscriptionsException" :portkey.aws.workdocs/too-many-subscriptions-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-notification-subscription :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-notification-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-notification-subscription-response))

(clojure.core/defn get-current-user "Retrieves details of the current user for whom the authentication token was\ngenerated. This is not a valid action for SigV4 (administrative API) clients." ([get-current-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-current-user-request get-current-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/get-current-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/me", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/get-current-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCurrentUser", :http.request.configuration/output-deser-fn response-get-current-user-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-current-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/get-current-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-current-user-response))

(clojure.core/defn create-labels "Adds the specified list of labels to the given resource (a document or folder)" ([create-labels-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-labels-request create-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/create-labels-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/labels", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/create-labels-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLabels", :http.request.configuration/output-deser-fn response-create-labels-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "TooManyLabelsException" :portkey.aws.workdocs/too-many-labels-exception}})))))
(clojure.spec.alpha/fdef create-labels :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-labels-response))

(clojure.core/defn create-custom-metadata "Adds one or more custom properties to the specified resource (a folder,\ndocument, or version)." ([create-custom-metadata-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-custom-metadata-request create-custom-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/create-custom-metadata-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/customMetadata", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/create-custom-metadata-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCustomMetadata", :http.request.configuration/output-deser-fn response-create-custom-metadata-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "CustomMetadataLimitExceededException" :portkey.aws.workdocs/custom-metadata-limit-exceeded-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-custom-metadata :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/create-custom-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/create-custom-metadata-response))

(clojure.core/defn delete-folder-contents "Deletes the contents of the specified folder." ([delete-folder-contents-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-folder-contents-request delete-folder-contents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/folders/{FolderId}/contents", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-folder-contents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFolderContents", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ConflictingOperationException" :portkey.aws.workdocs/conflicting-operation-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-folder-contents :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-folder-contents-request) :ret clojure.core/true?)

(clojure.core/defn describe-groups "Describes the groups specified by the query. Groups are defined by the\nunderlying Active Directory." ([describe-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-groups-request describe-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/groups", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeGroups", :http.request.configuration/output-deser-fn response-describe-groups-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-groups :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/describe-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-groups-response))

(clojure.core/defn activate-user "Activates the specified user. Only active users can access Amazon WorkDocs." ([activate-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-activate-user-request activate-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/activate-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/users/{UserId}/activation", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/activate-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ActivateUser", :http.request.configuration/output-deser-fn response-activate-user-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef activate-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/activate-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/activate-user-response))

(clojure.core/defn deactivate-user "Deactivates the specified user, which revokes the user's access to Amazon\nWorkDocs." ([deactivate-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-deactivate-user-request deactivate-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/users/{UserId}/activation", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/deactivate-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeactivateUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef deactivate-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/deactivate-user-request) :ret clojure.core/true?)

(clojure.core/defn update-document "Updates the specified attributes of a document. The user must have access to\nboth the document and its parent folder, if applicable." ([update-document-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-document-request update-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/update-document-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDocument", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "LimitExceededException" :portkey.aws.workdocs/limit-exceeded-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "ConflictingOperationException" :portkey.aws.workdocs/conflicting-operation-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-document :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-document-request) :ret clojure.core/true?)

(clojure.core/defn get-resources "Retrieves a collection of resources, including folders and documents. The only\nCollectionType supported is SHARED_WITH_ME." ([] (get-resources {})) ([get-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resources-request get-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/get-resources-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/get-resources-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResources", :http.request.configuration/output-deser-fn response-get-resources-response, :http.request.spec/error-spec {"UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-resources :args (clojure.spec.alpha/? :portkey.aws.workdocs/get-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/get-resources-response))

(clojure.core/defn delete-folder "Permanently deletes the specified folder and its contents." ([delete-folder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-folder-request delete-folder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/folders/{FolderId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-folder-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFolder", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ConflictingOperationException" :portkey.aws.workdocs/conflicting-operation-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-folder-request) :ret clojure.core/true?)

(clojure.core/defn delete-document "Permanently deletes the specified document and its associated metadata." ([delete-document-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-document-request delete-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-document-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDocument", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "ConflictingOperationException" :portkey.aws.workdocs/conflicting-operation-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-document :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-document-request) :ret clojure.core/true?)

(clojure.core/defn delete-custom-metadata "Deletes custom metadata from the specified resource." ([delete-custom-metadata-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-custom-metadata-request delete-custom-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/delete-custom-metadata-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/resources/{ResourceId}/customMetadata", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-custom-metadata-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCustomMetadata", :http.request.configuration/output-deser-fn response-delete-custom-metadata-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-custom-metadata :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-custom-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/delete-custom-metadata-response))

(clojure.core/defn delete-comment "Deletes the specified comment from the document version." ([delete-comment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-comment-request delete-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/documents/{DocumentId}/versions/{VersionId}/comment/{CommentId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/delete-comment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteComment", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "DocumentLockedForCommentsException" :portkey.aws.workdocs/document-locked-for-comments-exception}})))))
(clojure.spec.alpha/fdef delete-comment :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/delete-comment-request) :ret clojure.core/true?)

(clojure.core/defn update-user "Updates the specified attributes of the specified user, and grants or revokes\nadministrative privileges to the Amazon WorkDocs site." ([update-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/update-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/users/{UserId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/update-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUser", :http.request.configuration/output-deser-fn response-update-user-response, :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "IllegalUserStateException" :portkey.aws.workdocs/illegal-user-state-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "DeactivatingLastSystemUserException" :portkey.aws.workdocs/deactivating-last-system-user-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/update-user-response))

(clojure.core/defn update-folder "Updates the specified attributes of the specified folder. The user must have\naccess to both the folder and its parent folder, if applicable." ([update-folder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-folder-request update-folder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/folders/{FolderId}", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/update-folder-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFolder", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EntityNotExistsException" :portkey.aws.workdocs/entity-not-exists-exception, "LimitExceededException" :portkey.aws.workdocs/limit-exceeded-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.workdocs/entity-already-exists-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "ProhibitedStateException" :portkey.aws.workdocs/prohibited-state-exception, "UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "ConflictingOperationException" :portkey.aws.workdocs/conflicting-operation-exception, "ConcurrentModificationException" :portkey.aws.workdocs/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-folder :args (clojure.spec.alpha/tuple :portkey.aws.workdocs/update-folder-request) :ret clojure.core/true?)

(clojure.core/defn describe-activities "Describes the user activities in a specified time period." ([] (describe-activities {})) ([describe-activities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-activities-request describe-activities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.workdocs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.workdocs/describe-activities-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/api/v1/activities", :http.request.configuration/version "2016-05-01", :http.request.configuration/service-id "WorkDocs", :http.request.spec/input-spec :portkey.aws.workdocs/describe-activities-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeActivities", :http.request.configuration/output-deser-fn response-describe-activities-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.workdocs/unauthorized-operation-exception, "UnauthorizedResourceAccessException" :portkey.aws.workdocs/unauthorized-resource-access-exception, "InvalidArgumentException" :portkey.aws.workdocs/invalid-argument-exception, "FailedDependencyException" :portkey.aws.workdocs/failed-dependency-exception, "ServiceUnavailableException" :portkey.aws.workdocs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-activities :args (clojure.spec.alpha/? :portkey.aws.workdocs/describe-activities-request) :ret (clojure.spec.alpha/and :portkey.aws.workdocs/describe-activities-response))
