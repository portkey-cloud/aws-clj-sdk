(ns portkey.aws.appstream.-2016-12-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-user-setting)

(clojure.core/declare ser-application-settings)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-domain-join-info)

(clojure.core/declare ser-image-permissions)

(clojure.core/declare ser-storage-connector)

(clojure.core/declare ser-compute-capacity)

(clojure.core/declare ser-permission)

(clojure.core/declare ser-describe-images-max-results)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-subnet-id-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-storage-connector-type)

(clojure.core/declare ser-fleet-type)

(clojure.core/declare ser-service-account-credentials)

(clojure.core/declare ser-region-name)

(clojure.core/declare ser-domain)

(clojure.core/declare ser-fleet-attributes)

(clojure.core/declare ser-domain-list)

(clojure.core/declare ser-fleet-attribute)

(clojure.core/declare ser-display-name)

(clojure.core/declare ser-account-password)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-appstream-agent-version)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-stack-attributes)

(clojure.core/declare ser-aws-account-id)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-authentication-type)

(clojure.core/declare ser-storage-connector-list)

(clojure.core/declare ser-resource-identifier)

(clojure.core/declare ser-directory-name-list)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-feedback-url)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-account-name)

(clojure.core/declare ser-long)

(clojure.core/declare ser-streaming-url-user-id)

(clojure.core/declare ser-stack-attribute)

(clojure.core/declare ser-settings-group)

(clojure.core/declare ser-security-group-id-list)

(clojure.core/declare ser-directory-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-arn-list)

(clojure.core/declare ser-organizational-unit-distinguished-names-list)

(clojure.core/declare ser-visibility-type)

(clojure.core/declare ser-name)

(clojure.core/declare ser-organizational-unit-distinguished-name)

(clojure.core/declare ser-action)

(clojure.core/declare ser-aws-account-id-list)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-user-setting-list)

(clojure.core/declare ser-redirect-url)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-user-setting [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-action (:action input)) #:http.request.field{:name "Action", :shape "Action"}) (clojure.core/into (ser-permission (:permission input)) #:http.request.field{:name "Permission", :shape "Permission"})], :shape "UserSetting", :type "structure"}))

(clojure.core/defn- ser-application-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "Boolean"})], :shape "ApplicationSettings", :type "structure"} (clojure.core/contains? input :settings-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-settings-group (input :settings-group)) #:http.request.field{:name "SettingsGroup", :shape "SettingsGroup"}))))

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-domain-join-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DomainJoinInfo", :type "structure"} (clojure.core/contains? input :directory-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-name (input :directory-name)) #:http.request.field{:name "DirectoryName", :shape "DirectoryName"})) (clojure.core/contains? input :organizational-unit-distinguished-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organizational-unit-distinguished-name (input :organizational-unit-distinguished-name)) #:http.request.field{:name "OrganizationalUnitDistinguishedName", :shape "OrganizationalUnitDistinguishedName"}))))

(clojure.core/defn- ser-image-permissions [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ImagePermissions", :type "structure"} (clojure.core/contains? input :allow-fleet) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :allow-fleet)) #:http.request.field{:name "allowFleet", :shape "BooleanObject"})) (clojure.core/contains? input :allow-image-builder) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :allow-image-builder)) #:http.request.field{:name "allowImageBuilder", :shape "BooleanObject"}))))

(clojure.core/defn- ser-storage-connector [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-storage-connector-type (:connector-type input)) #:http.request.field{:name "ConnectorType", :shape "StorageConnectorType"})], :shape "StorageConnector", :type "structure"} (clojure.core/contains? input :resource-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-identifier (input :resource-identifier)) #:http.request.field{:name "ResourceIdentifier", :shape "ResourceIdentifier"})) (clojure.core/contains? input :domains) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-list (input :domains)) #:http.request.field{:name "Domains", :shape "DomainList"}))))

(clojure.core/defn- ser-compute-capacity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:desired-instances input)) #:http.request.field{:name "DesiredInstances", :shape "Integer"})], :shape "ComputeCapacity", :type "structure"}))

(clojure.core/defn- ser-permission [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "Permission"})

(clojure.core/defn- ser-describe-images-max-results [input] #:http.request.field{:value input, :shape "DescribeImagesMaxResults"})

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-subnet-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "SubnetIdList", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map", :max 50, :min 1})

(clojure.core/defn- ser-storage-connector-type [input] #:http.request.field{:value (clojure.core/get {"HOMEFOLDERS" "HOMEFOLDERS", :homefolders "HOMEFOLDERS", "GOOGLE_DRIVE" "GOOGLE_DRIVE", :google-drive "GOOGLE_DRIVE", "ONE_DRIVE" "ONE_DRIVE", :one-drive "ONE_DRIVE"} input), :shape "StorageConnectorType"})

(clojure.core/defn- ser-fleet-type [input] #:http.request.field{:value (clojure.core/get {"ALWAYS_ON" "ALWAYS_ON", :always-on "ALWAYS_ON", "ON_DEMAND" "ON_DEMAND", :on-demand "ON_DEMAND"} input), :shape "FleetType"})

(clojure.core/defn- ser-service-account-credentials [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-account-name (:account-name input)) #:http.request.field{:name "AccountName", :shape "AccountName"}) (clojure.core/into (ser-account-password (:account-password input)) #:http.request.field{:name "AccountPassword", :shape "AccountPassword"})], :shape "ServiceAccountCredentials", :type "structure"}))

(clojure.core/defn- ser-region-name [input] #:http.request.field{:value input, :shape "RegionName"})

(clojure.core/defn- ser-domain [input] #:http.request.field{:value input, :shape "Domain"})

(clojure.core/defn- ser-fleet-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-fleet-attribute coll) #:http.request.field{:shape "FleetAttribute"}))) input), :shape "FleetAttributes", :type "list"})

(clojure.core/defn- ser-domain-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain coll) #:http.request.field{:shape "Domain"}))) input), :shape "DomainList", :type "list", :max 10})

(clojure.core/defn- ser-fleet-attribute [input] #:http.request.field{:value (clojure.core/get {"VPC_CONFIGURATION" "VPC_CONFIGURATION", :vpc-configuration "VPC_CONFIGURATION", "VPC_CONFIGURATION_SECURITY_GROUP_IDS" "VPC_CONFIGURATION_SECURITY_GROUP_IDS", :vpc-configuration-security-group-ids "VPC_CONFIGURATION_SECURITY_GROUP_IDS", "DOMAIN_JOIN_INFO" "DOMAIN_JOIN_INFO", :domain-join-info "DOMAIN_JOIN_INFO"} input), :shape "FleetAttribute"})

(clojure.core/defn- ser-display-name [input] #:http.request.field{:value input, :shape "DisplayName"})

(clojure.core/defn- ser-account-password [input] #:http.request.field{:value input, :shape "AccountPassword"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-appstream-agent-version [input] #:http.request.field{:value input, :shape "AppstreamAgentVersion"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-stack-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stack-attribute coll) #:http.request.field{:shape "StackAttribute"}))) input), :shape "StackAttributes", :type "list"})

(clojure.core/defn- ser-aws-account-id [input] #:http.request.field{:value input, :shape "AwsAccountId"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-authentication-type [input] #:http.request.field{:value (clojure.core/get {"API" "API", :api "API", "SAML" "SAML", :saml "SAML", "USERPOOL" "USERPOOL", :userpool "USERPOOL"} input), :shape "AuthenticationType"})

(clojure.core/defn- ser-storage-connector-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-storage-connector coll) #:http.request.field{:shape "StorageConnector"}))) input), :shape "StorageConnectorList", :type "list"})

(clojure.core/defn- ser-resource-identifier [input] #:http.request.field{:value input, :shape "ResourceIdentifier"})

(clojure.core/defn- ser-directory-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-directory-name coll) #:http.request.field{:shape "DirectoryName"}))) input), :shape "DirectoryNameList", :type "list"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-feedback-url [input] #:http.request.field{:value input, :shape "FeedbackURL"})

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VpcConfig", :type "structure"} (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id-list (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIdList"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-id-list (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIdList"}))))

(clojure.core/defn- ser-account-name [input] #:http.request.field{:value input, :shape "AccountName"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-streaming-url-user-id [input] #:http.request.field{:value input, :shape "StreamingUrlUserId"})

(clojure.core/defn- ser-stack-attribute [input] #:http.request.field{:value (clojure.core/get {:theme-name "THEME_NAME", "STORAGE_CONNECTOR_GOOGLE_DRIVE" "STORAGE_CONNECTOR_GOOGLE_DRIVE", :redirect-url "REDIRECT_URL", "STORAGE_CONNECTOR_ONE_DRIVE" "STORAGE_CONNECTOR_ONE_DRIVE", "FEEDBACK_URL" "FEEDBACK_URL", :user-settings "USER_SETTINGS", "STORAGE_CONNECTOR_HOMEFOLDERS" "STORAGE_CONNECTOR_HOMEFOLDERS", :storage-connector-one-drive "STORAGE_CONNECTOR_ONE_DRIVE", :storage-connector-homefolders "STORAGE_CONNECTOR_HOMEFOLDERS", "THEME_NAME" "THEME_NAME", :storage-connectors "STORAGE_CONNECTORS", "REDIRECT_URL" "REDIRECT_URL", "USER_SETTINGS" "USER_SETTINGS", :feedback-url "FEEDBACK_URL", "STORAGE_CONNECTORS" "STORAGE_CONNECTORS", :storage-connector-google-drive "STORAGE_CONNECTOR_GOOGLE_DRIVE"} input), :shape "StackAttribute"})

(clojure.core/defn- ser-settings-group [input] #:http.request.field{:value input, :shape "SettingsGroup"})

(clojure.core/defn- ser-security-group-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "SecurityGroupIdList", :type "list", :max 5})

(clojure.core/defn- ser-directory-name [input] #:http.request.field{:value input, :shape "DirectoryName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "ArnList", :type "list"})

(clojure.core/defn- ser-organizational-unit-distinguished-names-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-organizational-unit-distinguished-name coll) #:http.request.field{:shape "OrganizationalUnitDistinguishedName"}))) input), :shape "OrganizationalUnitDistinguishedNamesList", :type "list"})

(clojure.core/defn- ser-visibility-type [input] #:http.request.field{:value (clojure.core/get {"PUBLIC" "PUBLIC", :public "PUBLIC", "PRIVATE" "PRIVATE", :private "PRIVATE", "SHARED" "SHARED", :shared "SHARED"} input), :shape "VisibilityType"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-organizational-unit-distinguished-name [input] #:http.request.field{:value input, :shape "OrganizationalUnitDistinguishedName"})

(clojure.core/defn- ser-action [input] #:http.request.field{:value (clojure.core/get {"FILE_DOWNLOAD" "FILE_DOWNLOAD", :clipboard-copy-to-local-device "CLIPBOARD_COPY_TO_LOCAL_DEVICE", :printing-to-local-device "PRINTING_TO_LOCAL_DEVICE", :file-upload "FILE_UPLOAD", "FILE_UPLOAD" "FILE_UPLOAD", :clipboard-copy-from-local-device "CLIPBOARD_COPY_FROM_LOCAL_DEVICE", :file-download "FILE_DOWNLOAD", "PRINTING_TO_LOCAL_DEVICE" "PRINTING_TO_LOCAL_DEVICE", "CLIPBOARD_COPY_TO_LOCAL_DEVICE" "CLIPBOARD_COPY_TO_LOCAL_DEVICE", "CLIPBOARD_COPY_FROM_LOCAL_DEVICE" "CLIPBOARD_COPY_FROM_LOCAL_DEVICE"} input), :shape "Action"})

(clojure.core/defn- ser-aws-account-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-aws-account-id coll) #:http.request.field{:shape "AwsAccountId"}))) input), :shape "AwsAccountIdList", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-user-setting-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-user-setting coll) #:http.request.field{:shape "UserSetting"}))) input), :shape "UserSettingList", :type "list", :min 1})

(clojure.core/defn- ser-redirect-url [input] #:http.request.field{:value input, :shape "RedirectURL"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-streaming-url-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"}) (clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"}) (clojure.core/into (ser-streaming-url-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "StreamingUrlUserId"})]} (clojure.core/contains? input :application-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "String"})) (clojure.core/contains? input :validity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :validity)) #:http.request.field{:name "Validity", :shape "Long"})) (clojure.core/contains? input :session-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :session-context)) #:http.request.field{:name "SessionContext", :shape "String"}))))

(clojure.core/defn- req-create-directory-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :directory-name)) #:http.request.field{:name "DirectoryName", :shape "DirectoryName"}) (clojure.core/into (ser-organizational-unit-distinguished-names-list (input :organizational-unit-distinguished-names)) #:http.request.field{:name "OrganizationalUnitDistinguishedNames", :shape "OrganizationalUnitDistinguishedNamesList"}) (clojure.core/into (ser-service-account-credentials (input :service-account-credentials)) #:http.request.field{:name "ServiceAccountCredentials", :shape "ServiceAccountCredentials"})]}))

(clojure.core/defn- req-copy-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :source-image-name)) #:http.request.field{:name "SourceImageName", :shape "Name"}) (clojure.core/into (ser-name (input :destination-image-name)) #:http.request.field{:name "DestinationImageName", :shape "Name"}) (clojure.core/into (ser-region-name (input :destination-region)) #:http.request.field{:name "DestinationRegion", :shape "RegionName"})]} (clojure.core/contains? input :destination-image-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :destination-image-description)) #:http.request.field{:name "DestinationImageDescription", :shape "Description"}))))

(clojure.core/defn- req-delete-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-expire-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :session-id)) #:http.request.field{:name "SessionId", :shape "String"})]}))

(clojure.core/defn- req-delete-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :storage-connectors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-connector-list (input :storage-connectors)) #:http.request.field{:name "StorageConnectors", :shape "StorageConnectorList"})) (clojure.core/contains? input :redirect-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-url (input :redirect-url)) #:http.request.field{:name "RedirectURL", :shape "RedirectURL"})) (clojure.core/contains? input :feedback-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-feedback-url (input :feedback-url)) #:http.request.field{:name "FeedbackURL", :shape "FeedbackURL"})) (clojure.core/contains? input :user-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-setting-list (input :user-settings)) #:http.request.field{:name "UserSettings", :shape "UserSettingList"})) (clojure.core/contains? input :application-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-settings (input :application-settings)) #:http.request.field{:name "ApplicationSettings", :shape "ApplicationSettings"}))))

(clojure.core/defn- req-stop-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-associate-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"}) (clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"})]}))

(clojure.core/defn- req-delete-image-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-aws-account-id (input :shared-account-id)) #:http.request.field{:name "SharedAccountId", :shape "AwsAccountId"})]}))

(clojure.core/defn- req-describe-directory-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-name-list (input :directory-names)) #:http.request.field{:name "DirectoryNames", :shape "DirectoryNameList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-create-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"})]} (clojure.core/contains? input :domain-join-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-join-info (input :domain-join-info)) #:http.request.field{:name "DomainJoinInfo", :shape "DomainJoinInfo"})) (clojure.core/contains? input :image-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-name)) #:http.request.field{:name "ImageName", :shape "String"})) (clojure.core/contains? input :enable-default-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-default-internet-access)) #:http.request.field{:name "EnableDefaultInternetAccess", :shape "BooleanObject"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :image-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :image-arn)) #:http.request.field{:name "ImageArn", :shape "Arn"})) (clojure.core/contains? input :appstream-agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-appstream-agent-version (input :appstream-agent-version)) #:http.request.field{:name "AppstreamAgentVersion", :shape "AppstreamAgentVersion"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- req-stop-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-delete-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]}))

(clojure.core/defn- req-update-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :application-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-settings (input :application-settings)) #:http.request.field{:name "ApplicationSettings", :shape "ApplicationSettings"})) (clojure.core/contains? input :delete-storage-connectors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-storage-connectors)) #:http.request.field{:name "DeleteStorageConnectors", :shape "Boolean", :deprecated true})) (clojure.core/contains? input :storage-connectors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-connector-list (input :storage-connectors)) #:http.request.field{:name "StorageConnectors", :shape "StorageConnectorList"})) (clojure.core/contains? input :attributes-to-delete) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-attributes (input :attributes-to-delete)) #:http.request.field{:name "AttributesToDelete", :shape "StackAttributes"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :feedback-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-feedback-url (input :feedback-url)) #:http.request.field{:name "FeedbackURL", :shape "FeedbackURL"})) (clojure.core/contains? input :user-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-setting-list (input :user-settings)) #:http.request.field{:name "UserSettings", :shape "UserSettingList"})) (clojure.core/contains? input :redirect-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-url (input :redirect-url)) #:http.request.field{:name "RedirectURL", :shape "RedirectURL"}))))

(clojure.core/defn- req-update-image-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-aws-account-id (input :shared-account-id)) #:http.request.field{:name "SharedAccountId", :shape "AwsAccountId"}) (clojure.core/into (ser-image-permissions (input :image-permissions)) #:http.request.field{:name "ImagePermissions", :shape "ImagePermissions"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-sessions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"}) (clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"})]} (clojure.core/contains? input :user-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :limit)) #:http.request.field{:name "Limit", :shape "Integer"})) (clojure.core/contains? input :authentication-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"}))))

(clojure.core/defn- req-delete-directory-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :directory-name)) #:http.request.field{:name "DirectoryName", :shape "DirectoryName"})]}))

(clojure.core/defn- req-disassociate-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"}) (clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"})]}))

(clojure.core/defn- req-start-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :appstream-agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-appstream-agent-version (input :appstream-agent-version)) #:http.request.field{:name "AppstreamAgentVersion", :shape "AppstreamAgentVersion"}))))

(clojure.core/defn- req-delete-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]}))

(clojure.core/defn- req-update-fleet-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :domain-join-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-join-info (input :domain-join-info)) #:http.request.field{:name "DomainJoinInfo", :shape "DomainJoinInfo"})) (clojure.core/contains? input :image-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-name)) #:http.request.field{:name "ImageName", :shape "String"})) (clojure.core/contains? input :compute-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-capacity (input :compute-capacity)) #:http.request.field{:name "ComputeCapacity", :shape "ComputeCapacity"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"})) (clojure.core/contains? input :disconnect-timeout-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :disconnect-timeout-in-seconds)) #:http.request.field{:name "DisconnectTimeoutInSeconds", :shape "Integer"})) (clojure.core/contains? input :attributes-to-delete) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-attributes (input :attributes-to-delete)) #:http.request.field{:name "AttributesToDelete", :shape "FleetAttributes"})) (clojure.core/contains? input :enable-default-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-default-internet-access)) #:http.request.field{:name "EnableDefaultInternetAccess", :shape "BooleanObject"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :image-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :image-arn)) #:http.request.field{:name "ImageArn", :shape "Arn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :delete-vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-vpc-config)) #:http.request.field{:name "DeleteVpcConfig", :shape "Boolean", :deprecated true})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :max-user-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-user-duration-in-seconds)) #:http.request.field{:name "MaxUserDurationInSeconds", :shape "Integer"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}))))

(clojure.core/defn- req-describe-images-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-list (input :arns)) #:http.request.field{:name "Arns", :shape "ArnList"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-visibility-type (input :type)) #:http.request.field{:name "Type", :shape "VisibilityType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-images-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "DescribeImagesMaxResults"}))))

(clojure.core/defn- req-describe-fleets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-associated-fleets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-stacks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-create-image-builder-streaming-url-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :validity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :validity)) #:http.request.field{:name "Validity", :shape "Long"}))))

(clojure.core/defn- req-start-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-create-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"}) (clojure.core/into (ser-compute-capacity (input :compute-capacity)) #:http.request.field{:name "ComputeCapacity", :shape "ComputeCapacity"})]} (clojure.core/contains? input :domain-join-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-join-info (input :domain-join-info)) #:http.request.field{:name "DomainJoinInfo", :shape "DomainJoinInfo"})) (clojure.core/contains? input :image-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-name)) #:http.request.field{:name "ImageName", :shape "String"})) (clojure.core/contains? input :disconnect-timeout-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :disconnect-timeout-in-seconds)) #:http.request.field{:name "DisconnectTimeoutInSeconds", :shape "Integer"})) (clojure.core/contains? input :fleet-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-type (input :fleet-type)) #:http.request.field{:name "FleetType", :shape "FleetType"})) (clojure.core/contains? input :enable-default-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-default-internet-access)) #:http.request.field{:name "EnableDefaultInternetAccess", :shape "BooleanObject"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :image-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :image-arn)) #:http.request.field{:name "ImageArn", :shape "Arn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :max-user-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-user-duration-in-seconds)) #:http.request.field{:name "MaxUserDurationInSeconds", :shape "Integer"}))))

(clojure.core/defn- req-update-directory-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :directory-name)) #:http.request.field{:name "DirectoryName", :shape "DirectoryName"})]} (clojure.core/contains? input :organizational-unit-distinguished-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organizational-unit-distinguished-names-list (input :organizational-unit-distinguished-names)) #:http.request.field{:name "OrganizationalUnitDistinguishedNames", :shape "OrganizationalUnitDistinguishedNamesList"})) (clojure.core/contains? input :service-account-credentials) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-account-credentials (input :service-account-credentials)) #:http.request.field{:name "ServiceAccountCredentials", :shape "ServiceAccountCredentials"}))))

(clojure.core/defn- req-describe-image-builders-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-describe-image-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :shared-aws-account-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-id-list (input :shared-aws-account-ids)) #:http.request.field{:name "SharedAwsAccountIds", :shape "AwsAccountIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-associated-stacks-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/user-setting (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/action :portkey.aws.appstream.-2016-12-01/permission] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application/display-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application/icon-url (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application/launch-path (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application/launch-parameters (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application/enabled (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/application (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.application/name :portkey.aws.appstream.-2016-12-01.application/display-name :portkey.aws.appstream.-2016-12-01.application/icon-url :portkey.aws.appstream.-2016-12-01.application/launch-path :portkey.aws.appstream.-2016-12-01.application/launch-parameters :portkey.aws.appstream.-2016-12-01.application/enabled :portkey.aws.appstream.-2016-12-01/metadata]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application-settings/enabled (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/application-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.application-settings/enabled] :opt-un [:portkey.aws.appstream.-2016-12-01/settings-group]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-directory-config-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/string-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/string))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/domain-join-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/directory-name :portkey.aws.appstream.-2016-12-01/organizational-unit-distinguished-name]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-directory-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/directory-config]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/user-id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/streaming-url-user-id))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/application-id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/validity (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/long))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/session-context (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-streaming-url-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.create-streaming-url-request/stack-name :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/fleet-name :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/user-id] :opt-un [:portkey.aws.appstream.-2016-12-01.create-streaming-url-request/application-id :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/validity :portkey.aws.appstream.-2016-12-01.create-streaming-url-request/session-context]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-permissions/allow-fleet (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-permissions/allow-image-builder (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-permissions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.image-permissions/allow-fleet :portkey.aws.appstream.-2016-12-01.image-permissions/allow-image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-sessions-result/sessions (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/session-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-sessions-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-sessions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-sessions-result/sessions :portkey.aws.appstream.-2016-12-01.describe-sessions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/resource-errors (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/resource-error))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-directory-config-request/organizational-unit-distinguished-names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/organizational-unit-distinguished-names-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-directory-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/directory-name :portkey.aws.appstream.-2016-12-01.create-directory-config-request/organizational-unit-distinguished-names :portkey.aws.appstream.-2016-12-01/service-account-credentials] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-state #{"COPYING" :pending "AVAILABLE" "PENDING" :deleting :copying "DELETING" "FAILED" :available :failed})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.operation-not-permitted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-directory-configs-result/directory-configs (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/directory-config-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-directory-configs-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-directory-configs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-directory-configs-result/directory-configs :portkey.aws.appstream.-2016-12-01.describe-directory-configs-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.storage-connector/connector-type (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/storage-connector-type))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.storage-connector/domains (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/domain-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/storage-connector (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.storage-connector/connector-type] :opt-un [:portkey.aws.appstream.-2016-12-01/resource-identifier :portkey.aws.appstream.-2016-12-01.storage-connector/domains]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.copy-image-request/source-image-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/name))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.copy-image-request/destination-image-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/name))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.copy-image-request/destination-region (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/region-name))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.copy-image-request/destination-image-description (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/description))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/copy-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.copy-image-request/source-image-name :portkey.aws.appstream.-2016-12-01.copy-image-request/destination-image-name :portkey.aws.appstream.-2016-12-01.copy-image-request/destination-region] :opt-un [:portkey.aws.appstream.-2016-12-01.copy-image-request/destination-image-description]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.invalid-role-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/invalid-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.invalid-role-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/tags]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.compute-capacity/desired-instances (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/compute-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.compute-capacity/desired-instances] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/permission #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack-error/error-code (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/stack-error-code))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack-error/error-message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stack-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.stack-error/error-code :portkey.aws.appstream.-2016-12-01.stack-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/disassociate-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/image-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/instance-type (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/disconnect-timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/created-time (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/display-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/image-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/description (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/state (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/fleet-state))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/max-user-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/arn :portkey.aws.appstream.-2016-12-01.fleet/name :portkey.aws.appstream.-2016-12-01.fleet/instance-type :portkey.aws.appstream.-2016-12-01/compute-capacity-status :portkey.aws.appstream.-2016-12-01.fleet/state] :opt-un [:portkey.aws.appstream.-2016-12-01/domain-join-info :portkey.aws.appstream.-2016-12-01.fleet/image-name :portkey.aws.appstream.-2016-12-01.fleet/disconnect-timeout-in-seconds :portkey.aws.appstream.-2016-12-01/fleet-type :portkey.aws.appstream.-2016-12-01.fleet/enable-default-internet-access :portkey.aws.appstream.-2016-12-01.fleet/created-time :portkey.aws.appstream.-2016-12-01.fleet/display-name :portkey.aws.appstream.-2016-12-01.fleet/image-arn :portkey.aws.appstream.-2016-12-01.fleet/description :portkey.aws.appstream.-2016-12-01/fleet-errors :portkey.aws.appstream.-2016-12-01/vpc-config :portkey.aws.appstream.-2016-12-01.fleet/max-user-duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.delete-stack-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.delete-stack-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-fleets-result/fleets (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/fleet-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-fleets-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-fleets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-fleets-result/fleets :portkey.aws.appstream.-2016-12-01.describe-fleets-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-builder-state-change-reason-code #{"IMAGE_UNAVAILABLE" :internal-error "INTERNAL_ERROR" :image-unavailable})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.expire-session-request/session-id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/expire-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.expire-session-request/session-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.delete-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.delete-fleet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stop-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-builder-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-builder-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.image-builder-state-change-reason/code :portkey.aws.appstream.-2016-12-01.image-builder-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-stack-request/storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/storage-connector-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-stack-request/user-settings (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/user-setting-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name] :opt-un [:portkey.aws.appstream.-2016-12-01/description :portkey.aws.appstream.-2016-12-01/display-name :portkey.aws.appstream.-2016-12-01.create-stack-request/storage-connectors :portkey.aws.appstream.-2016-12-01/redirect-url :portkey.aws.appstream.-2016-12-01/feedback-url :portkey.aws.appstream.-2016-12-01.create-stack-request/user-settings :portkey.aws.appstream.-2016-12-01/application-settings]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stop-image-builder-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stop-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.stop-image-builder-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-images-max-results (clojure.spec.alpha/int-in 0 25))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.associate-fleet-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.associate-fleet-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/associate-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.associate-fleet-request/fleet-name :portkey.aws.appstream.-2016-12-01.associate-fleet-request/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.image-state-change-reason/code :portkey.aws.appstream.-2016-12-01.image-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application-settings-response/enabled (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.application-settings-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/application-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.application-settings-response/enabled :portkey.aws.appstream.-2016-12-01/settings-group :portkey.aws.appstream.-2016-12-01.application-settings-response/s-3-bucket-name]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 2 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/subnet-id-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/string))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(^(?!aws:).[\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/platform-type #{:windows "WINDOWS"})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stack-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/stack))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.delete-image-permissions-request/shared-account-id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-image-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name :portkey.aws.appstream.-2016-12-01.delete-image-permissions-request/shared-account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-directory-configs-request/directory-names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/directory-name-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-directory-configs-request/max-results (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-directory-configs-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-directory-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-directory-configs-request/directory-names :portkey.aws.appstream.-2016-12-01.describe-directory-configs-request/max-results :portkey.aws.appstream.-2016-12-01.describe-directory-configs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/tags (clojure.spec.alpha/map-of :portkey.aws.appstream.-2016-12-01/tag-key :portkey.aws.appstream.-2016-12-01/tag-value))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/storage-connector-type #{"HOMEFOLDERS" :homefolders "GOOGLE_DRIVE" :google-drive "ONE_DRIVE" :one-drive})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/start-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-request/image-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-request/instance-type (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-request/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-request/image-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name :portkey.aws.appstream.-2016-12-01.create-image-builder-request/instance-type] :opt-un [:portkey.aws.appstream.-2016-12-01/domain-join-info :portkey.aws.appstream.-2016-12-01.create-image-builder-request/image-name :portkey.aws.appstream.-2016-12-01.create-image-builder-request/enable-default-internet-access :portkey.aws.appstream.-2016-12-01/display-name :portkey.aws.appstream.-2016-12-01.create-image-builder-request/image-arn :portkey.aws.appstream.-2016-12-01/appstream-agent-version :portkey.aws.appstream.-2016-12-01/description :portkey.aws.appstream.-2016-12-01/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stop-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stop-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.stop-fleet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-builder-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/image-builder))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.shared-image-permissions/shared-account-id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.shared-image-permissions/image-permissions (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-permissions))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/shared-image-permissions (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.shared-image-permissions/shared-account-id :portkey.aws.appstream.-2016-12-01.shared-image-permissions/image-permissions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/session-state #{"EXPIRED" :pending "PENDING" :active "ACTIVE" :expired})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/shared-image-permissions-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/shared-image-permissions))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-permissions-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-image-permissions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/name :portkey.aws.appstream.-2016-12-01/shared-image-permissions-list :portkey.aws.appstream.-2016-12-01.describe-image-permissions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-type #{"ON_DEMAND" "ALWAYS_ON" :always-on :on-demand})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.invalid-account-status-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.invalid-account-status-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.resource-error/error-code (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/fleet-error-code))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.resource-error/error-message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.resource-error/error-timestamp (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/resource-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.resource-error/error-code :portkey.aws.appstream.-2016-12-01.resource-error/error-message :portkey.aws.appstream.-2016-12-01.resource-error/error-timestamp]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/service-account-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/account-name :portkey.aws.appstream.-2016-12-01/account-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-stack-request/delete-storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-stack-request/storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/storage-connector-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-stack-request/attributes-to-delete (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/stack-attributes))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-stack-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-stack-request/user-settings (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/user-setting-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.update-stack-request/name] :opt-un [:portkey.aws.appstream.-2016-12-01/application-settings :portkey.aws.appstream.-2016-12-01.update-stack-request/delete-storage-connectors :portkey.aws.appstream.-2016-12-01.update-stack-request/storage-connectors :portkey.aws.appstream.-2016-12-01.update-stack-request/attributes-to-delete :portkey.aws.appstream.-2016-12-01/display-name :portkey.aws.appstream.-2016-12-01/description :portkey.aws.appstream.-2016-12-01/feedback-url :portkey.aws.appstream.-2016-12-01.update-stack-request/user-settings :portkey.aws.appstream.-2016-12-01/redirect-url]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-image-permissions-request/shared-account-id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-image-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name :portkey.aws.appstream.-2016-12-01.update-image-permissions-request/shared-account-id :portkey.aws.appstream.-2016-12-01/image-permissions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/start-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/stack]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/fleet))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/image))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-images-result/images (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-images-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-images-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-images-result/images :portkey.aws.appstream.-2016-12-01.describe-images-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/region-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stack-errors (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/stack-error))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/domain (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-attributes (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/fleet-attribute))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.tag-resource-request/resource-arn :portkey.aws.appstream.-2016-12-01/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/domain-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/domain :max-count 10))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-attribute #{:domain-join-info "VPC_CONFIGURATION" :vpc-configuration "DOMAIN_JOIN_INFO" "VPC_CONFIGURATION_SECURITY_GROUP_IDS" :vpc-configuration-security-group-ids})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/associate-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/state-change-reason (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-builder-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/platform (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/platform-type))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/instance-type (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/created-time (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/display-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/image-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/image-builder-errors (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/resource-errors))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/description (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/state (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-builder-state))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image-builder/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-builder (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.image-builder/name] :opt-un [:portkey.aws.appstream.-2016-12-01/domain-join-info :portkey.aws.appstream.-2016-12-01.image-builder/state-change-reason :portkey.aws.appstream.-2016-12-01.image-builder/platform :portkey.aws.appstream.-2016-12-01.image-builder/instance-type :portkey.aws.appstream.-2016-12-01.image-builder/enable-default-internet-access :portkey.aws.appstream.-2016-12-01.image-builder/created-time :portkey.aws.appstream.-2016-12-01.image-builder/display-name :portkey.aws.appstream.-2016-12-01.image-builder/image-arn :portkey.aws.appstream.-2016-12-01/appstream-agent-version :portkey.aws.appstream.-2016-12-01.image-builder/image-builder-errors :portkey.aws.appstream.-2016-12-01.image-builder/description :portkey.aws.appstream.-2016-12-01/arn :portkey.aws.appstream.-2016-12-01/vpc-config :portkey.aws.appstream.-2016-12-01.image-builder/state]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/account-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 127))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-image-permissions-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/applications (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/application))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-sessions-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-sessions-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-sessions-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-sessions-request/limit (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-sessions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.describe-sessions-request/stack-name :portkey.aws.appstream.-2016-12-01.describe-sessions-request/fleet-name] :opt-un [:portkey.aws.appstream.-2016-12-01/user-id :portkey.aws.appstream.-2016-12-01.describe-sessions-request/next-token :portkey.aws.appstream.-2016-12-01.describe-sessions-request/limit :portkey.aws.appstream.-2016-12-01/authentication-type]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-directory-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/directory-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/appstream-agent-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.disassociate-fleet-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.disassociate-fleet-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/disassociate-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.disassociate-fleet-request/fleet-name :portkey.aws.appstream.-2016-12-01.disassociate-fleet-request/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-fleets-result/names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-fleets-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/list-associated-fleets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.list-associated-fleets-result/names :portkey.aws.appstream.-2016-12-01.list-associated-fleets-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-result/streaming-url (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-result/expires (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-image-builder-streaming-url-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-result/streaming-url :portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-result/expires]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-errors (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/fleet-error))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stack-attributes (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/stack-attribute))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^\d+$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.network-access-configuration/eni-private-ip-address (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.network-access-configuration/eni-id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/network-access-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.network-access-configuration/eni-private-ip-address :portkey.aws.appstream.-2016-12-01.network-access-configuration/eni-id]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.resource-not-available-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/resource-not-available-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.resource-not-available-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.start-image-builder-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/start-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.start-image-builder-request/name] :opt-un [:portkey.aws.appstream.-2016-12-01/appstream-agent-version]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.directory-config/organizational-unit-distinguished-names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/organizational-unit-distinguished-names-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.directory-config/created-time (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/directory-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/directory-name] :opt-un [:portkey.aws.appstream.-2016-12-01.directory-config/organizational-unit-distinguished-names :portkey.aws.appstream.-2016-12-01/service-account-credentials :portkey.aws.appstream.-2016-12-01.directory-config/created-time]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-builders-result/image-builders (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-builder-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-builders-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-image-builders-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-image-builders-result/image-builders :portkey.aws.appstream.-2016-12-01.describe-image-builders-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-builder-state #{:snapshotting :updating-agent :pending "REBOOTING" "PENDING" :deleting "SNAPSHOTTING" :running :stopping :stopped "UPDATING_AGENT" :rebooting "STOPPED" "DELETING" "FAILED" "STOPPING" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/authentication-type #{:api "API" "SAML" "USERPOOL" :saml :userpool})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/image-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/instance-type (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/disconnect-timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/attributes-to-delete (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/fleet-attributes))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/image-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/delete-vpc-config (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/max-user-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-fleet-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/domain-join-info :portkey.aws.appstream.-2016-12-01.update-fleet-request/image-name :portkey.aws.appstream.-2016-12-01/compute-capacity :portkey.aws.appstream.-2016-12-01.update-fleet-request/instance-type :portkey.aws.appstream.-2016-12-01.update-fleet-request/disconnect-timeout-in-seconds :portkey.aws.appstream.-2016-12-01.update-fleet-request/attributes-to-delete :portkey.aws.appstream.-2016-12-01.update-fleet-request/enable-default-internet-access :portkey.aws.appstream.-2016-12-01/display-name :portkey.aws.appstream.-2016-12-01.update-fleet-request/image-arn :portkey.aws.appstream.-2016-12-01/description :portkey.aws.appstream.-2016-12-01.update-fleet-request/delete-vpc-config :portkey.aws.appstream.-2016-12-01/vpc-config :portkey.aws.appstream.-2016-12-01.update-fleet-request/max-user-duration-in-seconds :portkey.aws.appstream.-2016-12-01.update-fleet-request/name]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-images-request/names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-images-request/arns (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-images-request/type (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/visibility-type))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-images-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-images-request/max-results (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-images-max-results))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-images-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-images-request/names :portkey.aws.appstream.-2016-12-01.describe-images-request/arns :portkey.aws.appstream.-2016-12-01.describe-images-request/type :portkey.aws.appstream.-2016-12-01.describe-images-request/next-token :portkey.aws.appstream.-2016-12-01.describe-images-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-image-permissions-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/storage-connector-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/storage-connector))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/resource-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.invalid-parameter-combination-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.invalid-parameter-combination-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/fleet]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stop-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/directory-name-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/directory-name))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/stack]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-fleets-request/names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-fleets-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-fleets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-fleets-request/names :portkey.aws.appstream.-2016-12-01.describe-fleets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:[A-Za-z0-9][A-Za-z0-9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/feedback-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.vpc-config/subnet-ids (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/subnet-id-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.vpc-config/subnet-ids :portkey.aws.appstream.-2016-12-01.vpc-config/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/account-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/streaming-url-user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 2 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-result/streaming-url (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-streaming-url-result/expires (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-streaming-url-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.create-streaming-url-result/streaming-url :portkey.aws.appstream.-2016-12-01.create-streaming-url-result/expires]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-fleets-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-fleets-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/list-associated-fleets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.list-associated-fleets-request/stack-name] :opt-un [:portkey.aws.appstream.-2016-12-01.list-associated-fleets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stack-attribute #{:theme-name "STORAGE_CONNECTOR_GOOGLE_DRIVE" :redirect-url "STORAGE_CONNECTOR_ONE_DRIVE" "FEEDBACK_URL" :user-settings "STORAGE_CONNECTOR_HOMEFOLDERS" :storage-connector-one-drive :storage-connector-homefolders "THEME_NAME" :storage-connectors "REDIRECT_URL" "USER_SETTINGS" :feedback-url "STORAGE_CONNECTORS" :storage-connector-google-drive})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/fleet]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-state #{:starting :running :stopping :stopped "STOPPED" "STARTING" "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/metadata (clojure.spec.alpha/map-of :portkey.aws.appstream.-2016-12-01/string :portkey.aws.appstream.-2016-12-01/string))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/settings-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/string :max-count 5))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/session-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/session))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-error-code #{:domain-join-error-not-supported :network-interface-limit-exceeded "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES" :invalid-subnet-configuration :domain-join-nerr-password-expired :domain-join-error-access-denied "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME" :security-groups-not-found :domain-join-error-file-not-found "NETWORK_INTERFACE_LIMIT_EXCEEDED" "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION" "IMAGE_NOT_FOUND" "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED" "DOMAIN_JOIN_ERROR_LOGON_FAILURE" "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION" "DOMAIN_JOIN_ERROR_ACCESS_DENIED" :iam-service-role-missing-eni-delete-action "DOMAIN_JOIN_ERROR_NOT_SUPPORTED" :igw-not-attached :domain-join-error-more-data :internal-service-error "INTERNAL_SERVICE_ERROR" :domain-join-nerr-invalid-workgroup-name "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED" :image-not-found :domain-join-error-no-such-domain :iam-service-role-missing-describe-security-groups-action :domain-join-error-invalid-parameter "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN" :domain-join-error-ds-machine-account-quota-exceeded :iam-service-role-is-missing "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR" "INVALID_SUBNET_CONFIGURATION" "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION" "DOMAIN_JOIN_ERROR_MORE_DATA" "IGW_NOT_ATTACHED" :domain-join-error-logon-failure "SUBNET_NOT_FOUND" :subnet-not-found "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND" "SECURITY_GROUPS_NOT_FOUND" "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED" :subnet-has-insufficient-ip-addresses :iam-service-role-missing-describe-subnet-action :iam-service-role-missing-eni-create-action "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION" :domain-join-nerr-workstation-not-started :domain-join-internal-service-error "DOMAIN_JOIN_ERROR_INVALID_PARAMETER" "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION" "IAM_SERVICE_ROLE_IS_MISSING" :iam-service-role-missing-eni-describe-action})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.incompatible-image-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/incompatible-image-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.incompatible-image-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-stacks-request/names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-stacks-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-stacks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-stacks-request/names :portkey.aws.appstream.-2016-12-01.describe-stacks-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/directory-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/max-results (clojure.spec.alpha/int-in 0 500))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-request/validity (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/long))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-image-builder-streaming-url-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-request/name] :opt-un [:portkey.aws.appstream.-2016-12-01.create-image-builder-streaming-url-request/validity]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/arn-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/arn))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/organizational-unit-distinguished-names-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/organizational-unit-distinguished-name))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.start-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/start-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.start-fleet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/visibility-type #{:private :public "PRIVATE" :shared "PUBLIC" "SHARED"})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image-state-change-reason-code #{:image-copy-failure "IMAGE_COPY_FAILURE" :internal-error "IMAGE_BUILDER_NOT_AVAILABLE" "INTERNAL_ERROR" :image-builder-not-available})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet-error/error-code (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/fleet-error-code))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.fleet-error/error-message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/fleet-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.fleet-error/error-code :portkey.aws.appstream.-2016-12-01.fleet-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-directory-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/directory-config]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-stacks-result/stacks (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/stack-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-stacks-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-stacks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-stacks-result/stacks :portkey.aws.appstream.-2016-12-01.describe-stacks-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/state-change-reason (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/public-base-image-released-date (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/platform (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/platform-type))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/visibility (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/visibility-type))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/base-image-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/created-time (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/display-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/description (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/image-builder-supported (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/state (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/image-state))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.image/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/image (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.image/name] :opt-un [:portkey.aws.appstream.-2016-12-01/image-permissions :portkey.aws.appstream.-2016-12-01.image/state-change-reason :portkey.aws.appstream.-2016-12-01.image/public-base-image-released-date :portkey.aws.appstream.-2016-12-01.image/platform :portkey.aws.appstream.-2016-12-01.image/visibility :portkey.aws.appstream.-2016-12-01.image/base-image-arn :portkey.aws.appstream.-2016-12-01.image/created-time :portkey.aws.appstream.-2016-12-01.image/display-name :portkey.aws.appstream.-2016-12-01/applications :portkey.aws.appstream.-2016-12-01/appstream-agent-version :portkey.aws.appstream.-2016-12-01.image/description :portkey.aws.appstream.-2016-12-01/arn :portkey.aws.appstream.-2016-12-01.image/image-builder-supported :portkey.aws.appstream.-2016-12-01.image/state]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-image-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01/image]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-fleet-request/image-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-fleet-request/instance-type (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-fleet-request/disconnect-timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-fleet-request/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-fleet-request/image-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.create-fleet-request/max-user-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/create-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name :portkey.aws.appstream.-2016-12-01.create-fleet-request/instance-type :portkey.aws.appstream.-2016-12-01/compute-capacity] :opt-un [:portkey.aws.appstream.-2016-12-01/domain-join-info :portkey.aws.appstream.-2016-12-01.create-fleet-request/image-name :portkey.aws.appstream.-2016-12-01.create-fleet-request/disconnect-timeout-in-seconds :portkey.aws.appstream.-2016-12-01/fleet-type :portkey.aws.appstream.-2016-12-01.create-fleet-request/enable-default-internet-access :portkey.aws.appstream.-2016-12-01/display-name :portkey.aws.appstream.-2016-12-01.create-fleet-request/image-arn :portkey.aws.appstream.-2016-12-01/description :portkey.aws.appstream.-2016-12-01/vpc-config :portkey.aws.appstream.-2016-12-01.create-fleet-request/max-user-duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.update-directory-config-request/organizational-unit-distinguished-names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/organizational-unit-distinguished-names-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/update-directory-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/directory-name] :opt-un [:portkey.aws.appstream.-2016-12-01.update-directory-config-request/organizational-unit-distinguished-names :portkey.aws.appstream.-2016-12-01/service-account-credentials]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/delete-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.session/id (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.session/stack-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.session/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.session/state (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/session-state))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/session (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.session/id :portkey.aws.appstream.-2016-12-01/user-id :portkey.aws.appstream.-2016-12-01.session/stack-name :portkey.aws.appstream.-2016-12-01.session/fleet-name :portkey.aws.appstream.-2016-12-01.session/state] :opt-un [:portkey.aws.appstream.-2016-12-01/authentication-type :portkey.aws.appstream.-2016-12-01/network-access-configuration]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/organizational-unit-distinguished-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/action #{"FILE_DOWNLOAD" :clipboard-copy-to-local-device :printing-to-local-device :file-upload "FILE_UPLOAD" :clipboard-copy-from-local-device :file-download "PRINTING_TO_LOCAL_DEVICE" "CLIPBOARD_COPY_TO_LOCAL_DEVICE" "CLIPBOARD_COPY_FROM_LOCAL_DEVICE"})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack/application-settings (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/application-settings-response))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack/storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/storage-connector-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack/created-time (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack/display-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack/description (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack/name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.stack/user-settings (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/user-setting-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stack (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.stack/name] :opt-un [:portkey.aws.appstream.-2016-12-01.stack/application-settings :portkey.aws.appstream.-2016-12-01.stack/storage-connectors :portkey.aws.appstream.-2016-12-01/stack-errors :portkey.aws.appstream.-2016-12-01.stack/created-time :portkey.aws.appstream.-2016-12-01.stack/display-name :portkey.aws.appstream.-2016-12-01.stack/description :portkey.aws.appstream.-2016-12-01/arn :portkey.aws.appstream.-2016-12-01/feedback-url :portkey.aws.appstream.-2016-12-01.stack/user-settings :portkey.aws.appstream.-2016-12-01/redirect-url]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/aws-account-id-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/aws-account-id :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/user-setting-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/user-setting :min-count 1))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-builders-request/names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-builders-request/max-results (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-builders-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-image-builders-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.describe-image-builders-request/names :portkey.aws.appstream.-2016-12-01.describe-image-builders-request/max-results :portkey.aws.appstream.-2016-12-01.describe-image-builders-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/stack-error-code #{:internal-service-error "INTERNAL_SERVICE_ERROR" "STORAGE_CONNECTOR_ERROR" :storage-connector-error})

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/redirect-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.compute-capacity-status/desired (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.compute-capacity-status/running (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.compute-capacity-status/in-use (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.compute-capacity-status/available (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/compute-capacity-status (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.compute-capacity-status/desired] :opt-un [:portkey.aws.appstream.-2016-12-01.compute-capacity-status/running :portkey.aws.appstream.-2016-12-01.compute-capacity-status/in-use :portkey.aws.appstream.-2016-12-01.compute-capacity-status/available]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/expire-session-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.untag-resource-request/resource-arn :portkey.aws.appstream.-2016-12-01.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/directory-config-list (clojure.spec.alpha/coll-of :portkey.aws.appstream.-2016-12-01/directory-config))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-permissions-request/shared-aws-account-ids (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/aws-account-id-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.describe-image-permissions-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/describe-image-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01/name] :opt-un [:portkey.aws.appstream.-2016-12-01/max-results :portkey.aws.appstream.-2016-12-01.describe-image-permissions-request/shared-aws-account-ids :portkey.aws.appstream.-2016-12-01.describe-image-permissions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-stacks-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-stacks-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/list-associated-stacks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.-2016-12-01.list-associated-stacks-request/fleet-name] :opt-un [:portkey.aws.appstream.-2016-12-01.list-associated-stacks-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.copy-image-response/destination-image-name (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/name))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/copy-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.copy-image-response/destination-image-name]))

(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-stacks-result/names (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01.list-associated-stacks-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/string))
(clojure.spec.alpha/def :portkey.aws.appstream.-2016-12-01/list-associated-stacks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.-2016-12-01.list-associated-stacks-result/names :portkey.aws.appstream.-2016-12-01.list-associated-stacks-result/next-token]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResource", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/tag-resource-response))

(clojure.core/defn delete-image-permissions ([delete-image-permissions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-image-permissions-request delete-image-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/delete-image-permissions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/delete-image-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteImagePermissions", :http.request.spec/error-spec {"ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-image-permissions :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/delete-image-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/delete-image-permissions-result))

(clojure.core/defn update-image-permissions ([update-image-permissions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-image-permissions-request update-image-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/update-image-permissions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/update-image-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateImagePermissions", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-image-permissions :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/update-image-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/update-image-permissions-result))

(clojure.core/defn create-streaming-url ([create-streaming-url-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-streaming-url-request create-streaming-url-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/create-streaming-url-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/create-streaming-url-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStreamingURL", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef create-streaming-url :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/create-streaming-url-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/create-streaming-url-result))

(clojure.core/defn delete-image ([delete-image-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-image-request delete-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/delete-image-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/delete-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteImage", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-image :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/delete-image-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/delete-image-result))

(clojure.core/defn create-fleet ([create-fleet-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-fleet-request create-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/create-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/create-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateFleet", :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "InvalidRoleException" :portkey.aws.appstream.-2016-12-01/invalid-role-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.appstream.-2016-12-01/resource-already-exists-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception, "IncompatibleImageException" :portkey.aws.appstream.-2016-12-01/incompatible-image-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/create-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/create-fleet-result))

(clojure.core/defn delete-stack ([delete-stack-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-stack-request delete-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/delete-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/delete-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStack", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/delete-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/delete-stack-result))

(clojure.core/defn describe-image-builders ([] (describe-image-builders {})) ([describe-image-builders-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-image-builders-request describe-image-builders-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/describe-image-builders-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/describe-image-builders-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeImageBuilders", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-image-builders :args (clojure.spec.alpha/? :portkey.aws.appstream.-2016-12-01/describe-image-builders-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-image-builders-result))

(clojure.core/defn create-image-builder-streaming-url ([create-image-builder-streaming-url-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-image-builder-streaming-url-request create-image-builder-streaming-url-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/create-image-builder-streaming-url-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/create-image-builder-streaming-url-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateImageBuilderStreamingURL", :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-image-builder-streaming-url :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/create-image-builder-streaming-url-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/create-image-builder-streaming-url-result))

(clojure.core/defn describe-image-permissions ([describe-image-permissions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-image-permissions-request describe-image-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/describe-image-permissions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/describe-image-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeImagePermissions", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-image-permissions :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/describe-image-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-image-permissions-result))

(clojure.core/defn start-image-builder ([start-image-builder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-image-builder-request start-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/start-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/start-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartImageBuilder", :http.request.spec/error-spec {"ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "IncompatibleImageException" :portkey.aws.appstream.-2016-12-01/incompatible-image-exception}})))))
(clojure.spec.alpha/fdef start-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/start-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/start-image-builder-result))

(clojure.core/defn delete-directory-config ([delete-directory-config-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-directory-config-request delete-directory-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/delete-directory-config-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/delete-directory-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDirectoryConfig", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-directory-config :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/delete-directory-config-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/delete-directory-config-result))

(clojure.core/defn describe-images ([] (describe-images {})) ([describe-images-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-images-request describe-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/describe-images-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/describe-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeImages", :http.request.spec/error-spec {"InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-images :args (clojure.spec.alpha/? :portkey.aws.appstream.-2016-12-01/describe-images-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-images-result))

(clojure.core/defn update-stack ([update-stack-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-stack-request update-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/update-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/update-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStack", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "InvalidRoleException" :portkey.aws.appstream.-2016-12-01/invalid-role-exception, "InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "IncompatibleImageException" :portkey.aws.appstream.-2016-12-01/incompatible-image-exception, "OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef update-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/update-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/update-stack-result))

(clojure.core/defn update-fleet ([] (update-fleet {})) ([update-fleet-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-fleet-request update-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/update-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/update-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFleet", :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "InvalidRoleException" :portkey.aws.appstream.-2016-12-01/invalid-role-exception, "ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception, "IncompatibleImageException" :portkey.aws.appstream.-2016-12-01/incompatible-image-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-fleet :args (clojure.spec.alpha/? :portkey.aws.appstream.-2016-12-01/update-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/update-fleet-result))

(clojure.core/defn stop-image-builder ([stop-image-builder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-image-builder-request stop-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/stop-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/stop-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopImageBuilder", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef stop-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/stop-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/stop-image-builder-result))

(clojure.core/defn stop-fleet ([stop-fleet-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-fleet-request stop-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/stop-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/stop-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopFleet", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef stop-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/stop-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/stop-fleet-result))

(clojure.core/defn update-directory-config ([update-directory-config-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-directory-config-request update-directory-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/update-directory-config-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/update-directory-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDirectoryConfig", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-directory-config :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/update-directory-config-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/update-directory-config-result))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/list-tags-for-resource-response))

(clojure.core/defn create-directory-config ([create-directory-config-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-directory-config-request create-directory-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/create-directory-config-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/create-directory-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDirectoryConfig", :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.appstream.-2016-12-01/resource-already-exists-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception}})))))
(clojure.spec.alpha/fdef create-directory-config :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/create-directory-config-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/create-directory-config-result))

(clojure.core/defn expire-session ([expire-session-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-expire-session-request expire-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/expire-session-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/expire-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExpireSession", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef expire-session :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/expire-session-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/expire-session-result))

(clojure.core/defn describe-fleets ([] (describe-fleets {})) ([describe-fleets-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-fleets-request describe-fleets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/describe-fleets-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/describe-fleets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFleets", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-fleets :args (clojure.spec.alpha/? :portkey.aws.appstream.-2016-12-01/describe-fleets-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-fleets-result))

(clojure.core/defn list-associated-fleets ([list-associated-fleets-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-associated-fleets-request list-associated-fleets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/list-associated-fleets-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/list-associated-fleets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssociatedFleets", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-associated-fleets :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/list-associated-fleets-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/list-associated-fleets-result))

(clojure.core/defn delete-fleet ([delete-fleet-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-fleet-request delete-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/delete-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/delete-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteFleet", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/delete-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/delete-fleet-result))

(clojure.core/defn delete-image-builder ([delete-image-builder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-image-builder-request delete-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/delete-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/delete-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteImageBuilder", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/delete-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/delete-image-builder-result))

(clojure.core/defn associate-fleet ([associate-fleet-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-fleet-request associate-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/associate-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/associate-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateFleet", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception, "IncompatibleImageException" :portkey.aws.appstream.-2016-12-01/incompatible-image-exception, "OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef associate-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/associate-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/associate-fleet-result))

(clojure.core/defn create-stack ([create-stack-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-stack-request create-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/create-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/create-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStack", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "ResourceAlreadyExistsException" :portkey.aws.appstream.-2016-12-01/resource-already-exists-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception, "InvalidRoleException" :portkey.aws.appstream.-2016-12-01/invalid-role-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef create-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/create-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/create-stack-result))

(clojure.core/defn list-associated-stacks ([list-associated-stacks-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-associated-stacks-request list-associated-stacks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/list-associated-stacks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/list-associated-stacks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssociatedStacks", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-associated-stacks :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/list-associated-stacks-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/list-associated-stacks-result))

(clojure.core/defn disassociate-fleet ([disassociate-fleet-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-fleet-request disassociate-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/disassociate-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/disassociate-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateFleet", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream.-2016-12-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/disassociate-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/disassociate-fleet-result))

(clojure.core/defn copy-image ([copy-image-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-copy-image-request copy-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/copy-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/copy-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CopyImage", :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.appstream.-2016-12-01/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "IncompatibleImageException" :portkey.aws.appstream.-2016-12-01/incompatible-image-exception}})))))
(clojure.spec.alpha/fdef copy-image :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/copy-image-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/copy-image-response))

(clojure.core/defn create-image-builder ([create-image-builder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-image-builder-request create-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/create-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/create-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateImageBuilder", :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "InvalidRoleException" :portkey.aws.appstream.-2016-12-01/invalid-role-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.appstream.-2016-12-01/resource-already-exists-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream.-2016-12-01/resource-not-available-exception, "InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception, "IncompatibleImageException" :portkey.aws.appstream.-2016-12-01/incompatible-image-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/create-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/create-image-builder-result))

(clojure.core/defn describe-sessions ([describe-sessions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-sessions-request describe-sessions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/describe-sessions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/describe-sessions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSessions", :http.request.spec/error-spec {"InvalidParameterCombinationException" :portkey.aws.appstream.-2016-12-01/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-sessions :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/describe-sessions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-sessions-result))

(clojure.core/defn describe-directory-configs ([] (describe-directory-configs {})) ([describe-directory-configs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-directory-configs-request describe-directory-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/describe-directory-configs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/describe-directory-configs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDirectoryConfigs", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-directory-configs :args (clojure.spec.alpha/? :portkey.aws.appstream.-2016-12-01/describe-directory-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-directory-configs-result))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResource", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/untag-resource-response))

(clojure.core/defn describe-stacks ([] (describe-stacks {})) ([describe-stacks-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-stacks-request describe-stacks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/describe-stacks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/describe-stacks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStacks", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stacks :args (clojure.spec.alpha/? :portkey.aws.appstream.-2016-12-01/describe-stacks-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/describe-stacks-result))

(clojure.core/defn start-fleet ([start-fleet-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-fleet-request start-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.appstream.-2016-12-01/endpoints, :http.request.spec/output-spec :portkey.aws.appstream.-2016-12-01/start-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream.-2016-12-01/start-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartFleet", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream.-2016-12-01/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream.-2016-12-01/operation-not-permitted-exception, "LimitExceededException" :portkey.aws.appstream.-2016-12-01/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream.-2016-12-01/invalid-account-status-exception, "ConcurrentModificationException" :portkey.aws.appstream.-2016-12-01/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef start-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream.-2016-12-01/start-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream.-2016-12-01/start-fleet-result))
