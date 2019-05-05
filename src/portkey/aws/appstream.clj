(ns portkey.aws.appstream (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "appstream", :region "ap-northeast-1"},
    :ssl-common-name "appstream2.ap-northeast-1.amazonaws.com",
    :endpoint "https://appstream2.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "appstream", :region "eu-west-1"},
    :ssl-common-name "appstream2.eu-west-1.amazonaws.com",
    :endpoint "https://appstream2.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "appstream", :region "ap-southeast-2"},
    :ssl-common-name "appstream2.ap-southeast-2.amazonaws.com",
    :endpoint "https://appstream2.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "appstream", :region "ap-southeast-1"},
    :ssl-common-name "appstream2.ap-southeast-1.amazonaws.com",
    :endpoint "https://appstream2.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "appstream", :region "ap-northeast-2"},
    :ssl-common-name "appstream2.ap-northeast-2.amazonaws.com",
    :endpoint "https://appstream2.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "appstream", :region "eu-central-1"},
    :ssl-common-name "appstream2.eu-central-1.amazonaws.com",
    :endpoint "https://appstream2.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "appstream", :region "us-west-2"},
    :ssl-common-name "appstream2.us-west-2.amazonaws.com",
    :endpoint "https://appstream2.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "appstream", :region "us-east-1"},
    :ssl-common-name "appstream2.us-east-1.amazonaws.com",
    :endpoint "https://appstream2.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-username)

(clojure.core/declare ser-user-setting)

(clojure.core/declare ser-application-settings)

(clojure.core/declare ser-user-stack-association-list)

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

(clojure.core/declare ser-message-action)

(clojure.core/declare ser-account-password)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-user-attribute-value)

(clojure.core/declare ser-appstream-agent-version)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-stack-attributes)

(clojure.core/declare ser-aws-account-id)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-user-stack-association)

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

(clojure.core/defn- ser-username [input] #:http.request.field{:value input, :shape "Username"})

(clojure.core/defn- ser-user-setting [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-action (:action input)) #:http.request.field{:name "Action", :shape "Action"}) (clojure.core/into (ser-permission (:permission input)) #:http.request.field{:name "Permission", :shape "Permission"})], :shape "UserSetting", :type "structure"}))

(clojure.core/defn- ser-application-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "Boolean"})], :shape "ApplicationSettings", :type "structure"} (clojure.core/contains? input :settings-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-settings-group (input :settings-group)) #:http.request.field{:name "SettingsGroup", :shape "SettingsGroup"}))))

(clojure.core/defn- ser-user-stack-association-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-user-stack-association coll) #:http.request.field{:shape "UserStackAssociation"}))) input), :shape "UserStackAssociationList", :type "list"})

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

(clojure.core/defn- ser-message-action [input] #:http.request.field{:value (clojure.core/get {"SUPPRESS" "SUPPRESS", :suppress "SUPPRESS", "RESEND" "RESEND", :resend "RESEND"} input), :shape "MessageAction"})

(clojure.core/defn- ser-account-password [input] #:http.request.field{:value input, :shape "AccountPassword"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-user-attribute-value [input] #:http.request.field{:value input, :shape "UserAttributeValue"})

(clojure.core/defn- ser-appstream-agent-version [input] #:http.request.field{:value input, :shape "AppstreamAgentVersion"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-stack-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stack-attribute coll) #:http.request.field{:shape "StackAttribute"}))) input), :shape "StackAttributes", :type "list"})

(clojure.core/defn- ser-aws-account-id [input] #:http.request.field{:value input, :shape "AwsAccountId"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-user-stack-association [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:stack-name input)) #:http.request.field{:name "StackName", :shape "String"}) (clojure.core/into (ser-username (:user-name input)) #:http.request.field{:name "UserName", :shape "Username"}) (clojure.core/into (ser-authentication-type (:authentication-type input)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"})], :shape "UserStackAssociation", :type "structure"} (clojure.core/contains? input :send-email-notification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :send-email-notification)) #:http.request.field{:name "SendEmailNotification", :shape "Boolean"}))))

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

(clojure.core/defn- req-enable-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-username (input :user-name)) #:http.request.field{:name "UserName", :shape "Username"}) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"})]}))

(clojure.core/defn- req-batch-associate-user-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-stack-association-list (input :user-stack-associations)) #:http.request.field{:name "UserStackAssociations", :shape "UserStackAssociationList"})]}))

(clojure.core/defn- req-disable-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-username (input :user-name)) #:http.request.field{:name "UserName", :shape "Username"}) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"})]}))

(clojure.core/defn- req-delete-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-expire-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :session-id)) #:http.request.field{:name "SessionId", :shape "String"})]}))

(clojure.core/defn- req-delete-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]} (clojure.core/contains? input :application-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-settings (input :application-settings)) #:http.request.field{:name "ApplicationSettings", :shape "ApplicationSettings"})) (clojure.core/contains? input :storage-connectors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-connector-list (input :storage-connectors)) #:http.request.field{:name "StorageConnectors", :shape "StorageConnectorList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :feedback-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-feedback-url (input :feedback-url)) #:http.request.field{:name "FeedbackURL", :shape "FeedbackURL"})) (clojure.core/contains? input :user-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-setting-list (input :user-settings)) #:http.request.field{:name "UserSettings", :shape "UserSettingList"})) (clojure.core/contains? input :redirect-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-url (input :redirect-url)) #:http.request.field{:name "RedirectURL", :shape "RedirectURL"}))))

(clojure.core/defn- req-stop-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-associate-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"}) (clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"})]}))

(clojure.core/defn- req-delete-image-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-aws-account-id (input :shared-account-id)) #:http.request.field{:name "SharedAccountId", :shape "AwsAccountId"})]}))

(clojure.core/defn- req-describe-directory-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-name-list (input :directory-names)) #:http.request.field{:name "DirectoryNames", :shape "DirectoryNameList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-create-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"})]} (clojure.core/contains? input :domain-join-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-join-info (input :domain-join-info)) #:http.request.field{:name "DomainJoinInfo", :shape "DomainJoinInfo"})) (clojure.core/contains? input :image-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-name)) #:http.request.field{:name "ImageName", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :enable-default-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-default-internet-access)) #:http.request.field{:name "EnableDefaultInternetAccess", :shape "BooleanObject"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :image-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :image-arn)) #:http.request.field{:name "ImageArn", :shape "Arn"})) (clojure.core/contains? input :appstream-agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-appstream-agent-version (input :appstream-agent-version)) #:http.request.field{:name "AppstreamAgentVersion", :shape "AppstreamAgentVersion"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- req-stop-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-delete-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]}))

(clojure.core/defn- req-update-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :application-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-settings (input :application-settings)) #:http.request.field{:name "ApplicationSettings", :shape "ApplicationSettings"})) (clojure.core/contains? input :delete-storage-connectors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-storage-connectors)) #:http.request.field{:name "DeleteStorageConnectors", :shape "Boolean", :deprecated true})) (clojure.core/contains? input :storage-connectors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-connector-list (input :storage-connectors)) #:http.request.field{:name "StorageConnectors", :shape "StorageConnectorList"})) (clojure.core/contains? input :attributes-to-delete) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-attributes (input :attributes-to-delete)) #:http.request.field{:name "AttributesToDelete", :shape "StackAttributes"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :feedback-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-feedback-url (input :feedback-url)) #:http.request.field{:name "FeedbackURL", :shape "FeedbackURL"})) (clojure.core/contains? input :user-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-setting-list (input :user-settings)) #:http.request.field{:name "UserSettings", :shape "UserSettingList"})) (clojure.core/contains? input :redirect-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-url (input :redirect-url)) #:http.request.field{:name "RedirectURL", :shape "RedirectURL"}))))

(clojure.core/defn- req-update-image-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-aws-account-id (input :shared-account-id)) #:http.request.field{:name "SharedAccountId", :shape "AwsAccountId"}) (clojure.core/into (ser-image-permissions (input :image-permissions)) #:http.request.field{:name "ImagePermissions", :shape "ImagePermissions"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-sessions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"}) (clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"})]} (clojure.core/contains? input :user-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :limit)) #:http.request.field{:name "Limit", :shape "Integer"})) (clojure.core/contains? input :authentication-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"}))))

(clojure.core/defn- req-delete-directory-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :directory-name)) #:http.request.field{:name "DirectoryName", :shape "DirectoryName"})]}))

(clojure.core/defn- req-disassociate-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"}) (clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"})]}))

(clojure.core/defn- req-describe-user-stack-associations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"})) (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-username (input :user-name)) #:http.request.field{:name "UserName", :shape "Username"})) (clojure.core/contains? input :authentication-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-start-image-builder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :appstream-agent-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-appstream-agent-version (input :appstream-agent-version)) #:http.request.field{:name "AppstreamAgentVersion", :shape "AppstreamAgentVersion"}))))

(clojure.core/defn- req-delete-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]}))

(clojure.core/defn- req-update-fleet-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :domain-join-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-join-info (input :domain-join-info)) #:http.request.field{:name "DomainJoinInfo", :shape "DomainJoinInfo"})) (clojure.core/contains? input :image-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-name)) #:http.request.field{:name "ImageName", :shape "String"})) (clojure.core/contains? input :compute-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-capacity (input :compute-capacity)) #:http.request.field{:name "ComputeCapacity", :shape "ComputeCapacity"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"})) (clojure.core/contains? input :disconnect-timeout-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :disconnect-timeout-in-seconds)) #:http.request.field{:name "DisconnectTimeoutInSeconds", :shape "Integer"})) (clojure.core/contains? input :attributes-to-delete) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-attributes (input :attributes-to-delete)) #:http.request.field{:name "AttributesToDelete", :shape "FleetAttributes"})) (clojure.core/contains? input :enable-default-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-default-internet-access)) #:http.request.field{:name "EnableDefaultInternetAccess", :shape "BooleanObject"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :image-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :image-arn)) #:http.request.field{:name "ImageArn", :shape "Arn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :delete-vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-vpc-config)) #:http.request.field{:name "DeleteVpcConfig", :shape "Boolean", :deprecated true})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :max-user-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-user-duration-in-seconds)) #:http.request.field{:name "MaxUserDurationInSeconds", :shape "Integer"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}))))

(clojure.core/defn- req-describe-images-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-list (input :arns)) #:http.request.field{:name "Arns", :shape "ArnList"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-visibility-type (input :type)) #:http.request.field{:name "Type", :shape "VisibilityType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-images-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "DescribeImagesMaxResults"}))))

(clojure.core/defn- req-batch-disassociate-user-stack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-stack-association-list (input :user-stack-associations)) #:http.request.field{:name "UserStackAssociations", :shape "UserStackAssociationList"})]}))

(clojure.core/defn- req-describe-fleets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-username (input :user-name)) #:http.request.field{:name "UserName", :shape "Username"}) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"})]} (clojure.core/contains? input :message-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-action (input :message-action)) #:http.request.field{:name "MessageAction", :shape "MessageAction"})) (clojure.core/contains? input :first-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-attribute-value (input :first-name)) #:http.request.field{:name "FirstName", :shape "UserAttributeValue"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-attribute-value (input :last-name)) #:http.request.field{:name "LastName", :shape "UserAttributeValue"}))))

(clojure.core/defn- req-list-associated-fleets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-username (input :user-name)) #:http.request.field{:name "UserName", :shape "Username"}) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"})]}))

(clojure.core/defn- req-describe-stacks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-create-image-builder-streaming-url-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :validity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :validity)) #:http.request.field{:name "Validity", :shape "Long"}))))

(clojure.core/defn- req-start-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-create-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"}) (clojure.core/into (ser-compute-capacity (input :compute-capacity)) #:http.request.field{:name "ComputeCapacity", :shape "ComputeCapacity"})]} (clojure.core/contains? input :domain-join-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-join-info (input :domain-join-info)) #:http.request.field{:name "DomainJoinInfo", :shape "DomainJoinInfo"})) (clojure.core/contains? input :image-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-name)) #:http.request.field{:name "ImageName", :shape "String"})) (clojure.core/contains? input :disconnect-timeout-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :disconnect-timeout-in-seconds)) #:http.request.field{:name "DisconnectTimeoutInSeconds", :shape "Integer"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :fleet-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-type (input :fleet-type)) #:http.request.field{:name "FleetType", :shape "FleetType"})) (clojure.core/contains? input :enable-default-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-default-internet-access)) #:http.request.field{:name "EnableDefaultInternetAccess", :shape "BooleanObject"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :image-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :image-arn)) #:http.request.field{:name "ImageArn", :shape "Arn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :max-user-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-user-duration-in-seconds)) #:http.request.field{:name "MaxUserDurationInSeconds", :shape "Integer"}))))

(clojure.core/defn- req-update-directory-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :directory-name)) #:http.request.field{:name "DirectoryName", :shape "DirectoryName"})]} (clojure.core/contains? input :organizational-unit-distinguished-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organizational-unit-distinguished-names-list (input :organizational-unit-distinguished-names)) #:http.request.field{:name "OrganizationalUnitDistinguishedNames", :shape "OrganizationalUnitDistinguishedNamesList"})) (clojure.core/contains? input :service-account-credentials) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-account-credentials (input :service-account-credentials)) #:http.request.field{:name "ServiceAccountCredentials", :shape "ServiceAccountCredentials"}))))

(clojure.core/defn- req-describe-image-builders-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :names)) #:http.request.field{:name "Names", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-users-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "AuthenticationType", :shape "AuthenticationType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-describe-image-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :shared-aws-account-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-id-list (input :shared-aws-account-ids)) #:http.request.field{:name "SharedAwsAccountIds", :shape "AwsAccountIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-associated-stacks-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/declare deser-username)

(clojure.core/declare deser-user-setting)

(clojure.core/declare deser-application)

(clojure.core/declare deser-user-stack-association-list)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-domain-join-info)

(clojure.core/declare deser-image-permissions)

(clojure.core/declare deser-user-list)

(clojure.core/declare deser-resource-errors)

(clojure.core/declare deser-image-state)

(clojure.core/declare deser-user-stack-association-error-list)

(clojure.core/declare deser-storage-connector)

(clojure.core/declare deser-user-stack-association-error)

(clojure.core/declare deser-permission)

(clojure.core/declare deser-stack-error)

(clojure.core/declare deser-fleet)

(clojure.core/declare deser-image-builder-state-change-reason-code)

(clojure.core/declare deser-image-builder-state-change-reason)

(clojure.core/declare deser-image-state-change-reason)

(clojure.core/declare deser-application-settings-response)

(clojure.core/declare deser-session-connection-state)

(clojure.core/declare deser-user-id)

(clojure.core/declare deser-subnet-id-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-platform-type)

(clojure.core/declare deser-stack-list)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-storage-connector-type)

(clojure.core/declare deser-image-builder-list)

(clojure.core/declare deser-shared-image-permissions)

(clojure.core/declare deser-session-state)

(clojure.core/declare deser-shared-image-permissions-list)

(clojure.core/declare deser-user)

(clojure.core/declare deser-fleet-type)

(clojure.core/declare deser-resource-error)

(clojure.core/declare deser-service-account-credentials)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-fleet-list)

(clojure.core/declare deser-image-list)

(clojure.core/declare deser-stack-errors)

(clojure.core/declare deser-domain)

(clojure.core/declare deser-domain-list)

(clojure.core/declare deser-image-builder)

(clojure.core/declare deser-account-password)

(clojure.core/declare deser-applications)

(clojure.core/declare deser-user-attribute-value)

(clojure.core/declare deser-appstream-agent-version)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-fleet-errors)

(clojure.core/declare deser-aws-account-id)

(clojure.core/declare deser-network-access-configuration)

(clojure.core/declare deser-directory-config)

(clojure.core/declare deser-image-builder-state)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-user-stack-association)

(clojure.core/declare deser-string)

(clojure.core/declare deser-authentication-type)

(clojure.core/declare deser-storage-connector-list)

(clojure.core/declare deser-resource-identifier)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-feedback-url)

(clojure.core/declare deser-vpc-config)

(clojure.core/declare deser-account-name)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-fleet-state)

(clojure.core/declare deser-metadata)

(clojure.core/declare deser-settings-group)

(clojure.core/declare deser-security-group-id-list)

(clojure.core/declare deser-session-list)

(clojure.core/declare deser-fleet-error-code)

(clojure.core/declare deser-directory-name)

(clojure.core/declare deser-organizational-unit-distinguished-names-list)

(clojure.core/declare deser-visibility-type)

(clojure.core/declare deser-image-state-change-reason-code)

(clojure.core/declare deser-fleet-error)

(clojure.core/declare deser-image)

(clojure.core/declare deser-name)

(clojure.core/declare deser-session)

(clojure.core/declare deser-organizational-unit-distinguished-name)

(clojure.core/declare deser-action)

(clojure.core/declare deser-stack)

(clojure.core/declare deser-boolean-object)

(clojure.core/declare deser-user-setting-list)

(clojure.core/declare deser-stack-error-code)

(clojure.core/declare deser-redirect-url)

(clojure.core/declare deser-compute-capacity-status)

(clojure.core/declare deser-user-stack-association-error-code)

(clojure.core/declare deser-directory-config-list)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-username [input] input)

(clojure.core/defn- deser-user-setting [input] (clojure.core/cond-> {:action (deser-action (input "Action")), :permission (deser-permission (input "Permission"))}))

(clojure.core/defn- deser-application [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-string (input "DisplayName"))) (clojure.core/contains? input "IconURL") (clojure.core/assoc :icon-url (deser-string (input "IconURL"))) (clojure.core/contains? input "LaunchPath") (clojure.core/assoc :launch-path (deser-string (input "LaunchPath"))) (clojure.core/contains? input "LaunchParameters") (clojure.core/assoc :launch-parameters (deser-string (input "LaunchParameters"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "Metadata") (clojure.core/assoc :metadata (deser-metadata (input "Metadata")))))

(clojure.core/defn- deser-user-stack-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-stack-association coll))) input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-domain-join-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "DirectoryName") (clojure.core/assoc :directory-name (deser-directory-name (input "DirectoryName"))) (clojure.core/contains? input "OrganizationalUnitDistinguishedName") (clojure.core/assoc :organizational-unit-distinguished-name (deser-organizational-unit-distinguished-name (input "OrganizationalUnitDistinguishedName")))))

(clojure.core/defn- deser-image-permissions [input] (clojure.core/cond-> {} (clojure.core/contains? input "allowFleet") (clojure.core/assoc :allow-fleet (deser-boolean-object (input "allowFleet"))) (clojure.core/contains? input "allowImageBuilder") (clojure.core/assoc :allow-image-builder (deser-boolean-object (input "allowImageBuilder")))))

(clojure.core/defn- deser-user-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user coll))) input))

(clojure.core/defn- deser-resource-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-error coll))) input))

(clojure.core/defn- deser-image-state [input] (clojure.core/get {"PENDING" :pending, "AVAILABLE" :available, "FAILED" :failed, "COPYING" :copying, "DELETING" :deleting} input))

(clojure.core/defn- deser-user-stack-association-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-stack-association-error coll))) input))

(clojure.core/defn- deser-storage-connector [input] (clojure.core/cond-> {:connector-type (deser-storage-connector-type (input "ConnectorType"))} (clojure.core/contains? input "ResourceIdentifier") (clojure.core/assoc :resource-identifier (deser-resource-identifier (input "ResourceIdentifier"))) (clojure.core/contains? input "Domains") (clojure.core/assoc :domains (deser-domain-list (input "Domains")))))

(clojure.core/defn- deser-user-stack-association-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserStackAssociation") (clojure.core/assoc :user-stack-association (deser-user-stack-association (input "UserStackAssociation"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-user-stack-association-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-permission [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-stack-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-stack-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-fleet [input] (clojure.core/cond-> {:arn (deser-arn (input "Arn")), :name (deser-string (input "Name")), :instance-type (deser-string (input "InstanceType")), :compute-capacity-status (deser-compute-capacity-status (input "ComputeCapacityStatus")), :state (deser-fleet-state (input "State"))} (clojure.core/contains? input "DomainJoinInfo") (clojure.core/assoc :domain-join-info (deser-domain-join-info (input "DomainJoinInfo"))) (clojure.core/contains? input "ImageName") (clojure.core/assoc :image-name (deser-string (input "ImageName"))) (clojure.core/contains? input "DisconnectTimeoutInSeconds") (clojure.core/assoc :disconnect-timeout-in-seconds (deser-integer (input "DisconnectTimeoutInSeconds"))) (clojure.core/contains? input "FleetType") (clojure.core/assoc :fleet-type (deser-fleet-type (input "FleetType"))) (clojure.core/contains? input "EnableDefaultInternetAccess") (clojure.core/assoc :enable-default-internet-access (deser-boolean-object (input "EnableDefaultInternetAccess"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-timestamp (input "CreatedTime"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-string (input "DisplayName"))) (clojure.core/contains? input "ImageArn") (clojure.core/assoc :image-arn (deser-arn (input "ImageArn"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "FleetErrors") (clojure.core/assoc :fleet-errors (deser-fleet-errors (input "FleetErrors"))) (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "VpcConfig"))) (clojure.core/contains? input "MaxUserDurationInSeconds") (clojure.core/assoc :max-user-duration-in-seconds (deser-integer (input "MaxUserDurationInSeconds")))))

(clojure.core/defn- deser-image-builder-state-change-reason-code [input] (clojure.core/get {"INTERNAL_ERROR" :internal-error, "IMAGE_UNAVAILABLE" :image-unavailable} input))

(clojure.core/defn- deser-image-builder-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-image-builder-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-image-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-image-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-application-settings-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "SettingsGroup") (clojure.core/assoc :settings-group (deser-settings-group (input "SettingsGroup"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (input "S3BucketName")))))

(clojure.core/defn- deser-session-connection-state [input] (clojure.core/get {"CONNECTED" :connected, "NOT_CONNECTED" :not-connected} input))

(clojure.core/defn- deser-user-id [input] input)

(clojure.core/defn- deser-subnet-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-platform-type [input] (clojure.core/get {"WINDOWS" :windows} input))

(clojure.core/defn- deser-stack-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack coll))) input))

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-storage-connector-type [input] (clojure.core/get {"HOMEFOLDERS" :homefolders, "GOOGLE_DRIVE" :google-drive, "ONE_DRIVE" :one-drive} input))

(clojure.core/defn- deser-image-builder-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-builder coll))) input))

(clojure.core/defn- deser-shared-image-permissions [input] (clojure.core/cond-> {:shared-account-id (deser-aws-account-id (input "sharedAccountId")), :image-permissions (deser-image-permissions (input "imagePermissions"))}))

(clojure.core/defn- deser-session-state [input] (clojure.core/get {"ACTIVE" :active, "PENDING" :pending, "EXPIRED" :expired} input))

(clojure.core/defn- deser-shared-image-permissions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-shared-image-permissions coll))) input))

(clojure.core/defn- deser-user [input] (clojure.core/cond-> {:authentication-type (deser-authentication-type (input "AuthenticationType"))} (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "UserName") (clojure.core/assoc :user-name (deser-username (input "UserName"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deser-user-attribute-value (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deser-user-attribute-value (input "LastName"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-timestamp (input "CreatedTime")))))

(clojure.core/defn- deser-fleet-type [input] (clojure.core/get {"ALWAYS_ON" :always-on, "ON_DEMAND" :on-demand} input))

(clojure.core/defn- deser-resource-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-fleet-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage"))) (clojure.core/contains? input "ErrorTimestamp") (clojure.core/assoc :error-timestamp (deser-timestamp (input "ErrorTimestamp")))))

(clojure.core/defn- deser-service-account-credentials [input] (clojure.core/cond-> {:account-name (deser-account-name (input "AccountName")), :account-password (deser-account-password (input "AccountPassword"))}))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-fleet-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet coll))) input))

(clojure.core/defn- deser-image-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image coll))) input))

(clojure.core/defn- deser-stack-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-error coll))) input))

(clojure.core/defn- deser-domain [input] input)

(clojure.core/defn- deser-domain-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain coll))) input))

(clojure.core/defn- deser-image-builder [input] (clojure.core/cond-> {:name (deser-string (input "Name"))} (clojure.core/contains? input "DomainJoinInfo") (clojure.core/assoc :domain-join-info (deser-domain-join-info (input "DomainJoinInfo"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-image-builder-state-change-reason (input "StateChangeReason"))) (clojure.core/contains? input "Platform") (clojure.core/assoc :platform (deser-platform-type (input "Platform"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-string (input "InstanceType"))) (clojure.core/contains? input "EnableDefaultInternetAccess") (clojure.core/assoc :enable-default-internet-access (deser-boolean-object (input "EnableDefaultInternetAccess"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-timestamp (input "CreatedTime"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-string (input "DisplayName"))) (clojure.core/contains? input "ImageArn") (clojure.core/assoc :image-arn (deser-arn (input "ImageArn"))) (clojure.core/contains? input "AppstreamAgentVersion") (clojure.core/assoc :appstream-agent-version (deser-appstream-agent-version (input "AppstreamAgentVersion"))) (clojure.core/contains? input "ImageBuilderErrors") (clojure.core/assoc :image-builder-errors (deser-resource-errors (input "ImageBuilderErrors"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "VpcConfig"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-image-builder-state (input "State")))))

(clojure.core/defn- deser-account-password [input] input)

(clojure.core/defn- deser-applications [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application coll))) input))

(clojure.core/defn- deser-user-attribute-value [input] input)

(clojure.core/defn- deser-appstream-agent-version [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-fleet-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-error coll))) input))

(clojure.core/defn- deser-aws-account-id [input] input)

(clojure.core/defn- deser-network-access-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "EniPrivateIpAddress") (clojure.core/assoc :eni-private-ip-address (deser-string (input "EniPrivateIpAddress"))) (clojure.core/contains? input "EniId") (clojure.core/assoc :eni-id (deser-string (input "EniId")))))

(clojure.core/defn- deser-directory-config [input] (clojure.core/cond-> {:directory-name (deser-directory-name (input "DirectoryName"))} (clojure.core/contains? input "OrganizationalUnitDistinguishedNames") (clojure.core/assoc :organizational-unit-distinguished-names (deser-organizational-unit-distinguished-names-list (input "OrganizationalUnitDistinguishedNames"))) (clojure.core/contains? input "ServiceAccountCredentials") (clojure.core/assoc :service-account-credentials (deser-service-account-credentials (input "ServiceAccountCredentials"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-timestamp (input "CreatedTime")))))

(clojure.core/defn- deser-image-builder-state [input] (clojure.core/get {"REBOOTING" :rebooting, "PENDING" :pending, "SNAPSHOTTING" :snapshotting, "UPDATING_AGENT" :updating-agent, "STOPPED" :stopped, "DELETING" :deleting, "FAILED" :failed, "STOPPING" :stopping, "RUNNING" :running} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-user-stack-association [input] (clojure.core/cond-> {:stack-name (deser-string (input "StackName")), :user-name (deser-username (input "UserName")), :authentication-type (deser-authentication-type (input "AuthenticationType"))} (clojure.core/contains? input "SendEmailNotification") (clojure.core/assoc :send-email-notification (deser-boolean (input "SendEmailNotification")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-authentication-type [input] (clojure.core/get {"API" :api, "SAML" :saml, "USERPOOL" :userpool} input))

(clojure.core/defn- deser-storage-connector-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-storage-connector coll))) input))

(clojure.core/defn- deser-resource-identifier [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-feedback-url [input] input)

(clojure.core/defn- deser-vpc-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-id-list (input "SubnetIds"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-group-id-list (input "SecurityGroupIds")))))

(clojure.core/defn- deser-account-name [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-fleet-state [input] (clojure.core/get {"STARTING" :starting, "RUNNING" :running, "STOPPING" :stopping, "STOPPED" :stopped} input))

(clojure.core/defn- deser-metadata [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-settings-group [input] input)

(clojure.core/defn- deser-security-group-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-session-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-session coll))) input))

(clojure.core/defn- deser-fleet-error-code [input] (clojure.core/get {"SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES" :subnet-has-insufficient-ip-addresses, "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME" :domain-join-nerr-invalid-workgroup-name, "NETWORK_INTERFACE_LIMIT_EXCEEDED" :network-interface-limit-exceeded, "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION" :iam-service-role-missing-describe-security-groups-action, "IMAGE_NOT_FOUND" :image-not-found, "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED" :domain-join-nerr-workstation-not-started, "DOMAIN_JOIN_ERROR_LOGON_FAILURE" :domain-join-error-logon-failure, "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION" :iam-service-role-missing-eni-describe-action, "DOMAIN_JOIN_ERROR_ACCESS_DENIED" :domain-join-error-access-denied, "DOMAIN_JOIN_ERROR_NOT_SUPPORTED" :domain-join-error-not-supported, "INTERNAL_SERVICE_ERROR" :internal-service-error, "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED" :domain-join-nerr-password-expired, "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN" :domain-join-error-no-such-domain, "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR" :domain-join-internal-service-error, "INVALID_SUBNET_CONFIGURATION" :invalid-subnet-configuration, "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION" :iam-service-role-missing-eni-delete-action, "DOMAIN_JOIN_ERROR_MORE_DATA" :domain-join-error-more-data, "IGW_NOT_ATTACHED" :igw-not-attached, "SUBNET_NOT_FOUND" :subnet-not-found, "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND" :domain-join-error-file-not-found, "SECURITY_GROUPS_NOT_FOUND" :security-groups-not-found, "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED" :domain-join-error-ds-machine-account-quota-exceeded, "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION" :iam-service-role-missing-describe-subnet-action, "DOMAIN_JOIN_ERROR_INVALID_PARAMETER" :domain-join-error-invalid-parameter, "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION" :iam-service-role-missing-eni-create-action, "IAM_SERVICE_ROLE_IS_MISSING" :iam-service-role-is-missing} input))

(clojure.core/defn- deser-directory-name [input] input)

(clojure.core/defn- deser-organizational-unit-distinguished-names-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-organizational-unit-distinguished-name coll))) input))

(clojure.core/defn- deser-visibility-type [input] (clojure.core/get {"PUBLIC" :public, "PRIVATE" :private, "SHARED" :shared} input))

(clojure.core/defn- deser-image-state-change-reason-code [input] (clojure.core/get {"INTERNAL_ERROR" :internal-error, "IMAGE_BUILDER_NOT_AVAILABLE" :image-builder-not-available, "IMAGE_COPY_FAILURE" :image-copy-failure} input))

(clojure.core/defn- deser-fleet-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-fleet-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-image [input] (clojure.core/cond-> {:name (deser-string (input "Name"))} (clojure.core/contains? input "ImagePermissions") (clojure.core/assoc :image-permissions (deser-image-permissions (input "ImagePermissions"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-image-state-change-reason (input "StateChangeReason"))) (clojure.core/contains? input "PublicBaseImageReleasedDate") (clojure.core/assoc :public-base-image-released-date (deser-timestamp (input "PublicBaseImageReleasedDate"))) (clojure.core/contains? input "Platform") (clojure.core/assoc :platform (deser-platform-type (input "Platform"))) (clojure.core/contains? input "Visibility") (clojure.core/assoc :visibility (deser-visibility-type (input "Visibility"))) (clojure.core/contains? input "BaseImageArn") (clojure.core/assoc :base-image-arn (deser-arn (input "BaseImageArn"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-timestamp (input "CreatedTime"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-string (input "DisplayName"))) (clojure.core/contains? input "Applications") (clojure.core/assoc :applications (deser-applications (input "Applications"))) (clojure.core/contains? input "AppstreamAgentVersion") (clojure.core/assoc :appstream-agent-version (deser-appstream-agent-version (input "AppstreamAgentVersion"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "ImageBuilderSupported") (clojure.core/assoc :image-builder-supported (deser-boolean (input "ImageBuilderSupported"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-image-state (input "State")))))

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-session [input] (clojure.core/cond-> {:id (deser-string (input "Id")), :user-id (deser-user-id (input "UserId")), :stack-name (deser-string (input "StackName")), :fleet-name (deser-string (input "FleetName")), :state (deser-session-state (input "State"))} (clojure.core/contains? input "ConnectionState") (clojure.core/assoc :connection-state (deser-session-connection-state (input "ConnectionState"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime"))) (clojure.core/contains? input "NetworkAccessConfiguration") (clojure.core/assoc :network-access-configuration (deser-network-access-configuration (input "NetworkAccessConfiguration"))) (clojure.core/contains? input "AuthenticationType") (clojure.core/assoc :authentication-type (deser-authentication-type (input "AuthenticationType"))) (clojure.core/contains? input "MaxExpirationTime") (clojure.core/assoc :max-expiration-time (deser-timestamp (input "MaxExpirationTime")))))

(clojure.core/defn- deser-organizational-unit-distinguished-name [input] input)

(clojure.core/defn- deser-action [input] (clojure.core/get {"CLIPBOARD_COPY_FROM_LOCAL_DEVICE" :clipboard-copy-from-local-device, "CLIPBOARD_COPY_TO_LOCAL_DEVICE" :clipboard-copy-to-local-device, "FILE_UPLOAD" :file-upload, "FILE_DOWNLOAD" :file-download, "PRINTING_TO_LOCAL_DEVICE" :printing-to-local-device} input))

(clojure.core/defn- deser-stack [input] (clojure.core/cond-> {:name (deser-string (input "Name"))} (clojure.core/contains? input "ApplicationSettings") (clojure.core/assoc :application-settings (deser-application-settings-response (input "ApplicationSettings"))) (clojure.core/contains? input "StorageConnectors") (clojure.core/assoc :storage-connectors (deser-storage-connector-list (input "StorageConnectors"))) (clojure.core/contains? input "StackErrors") (clojure.core/assoc :stack-errors (deser-stack-errors (input "StackErrors"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-timestamp (input "CreatedTime"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-string (input "DisplayName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "FeedbackURL") (clojure.core/assoc :feedback-url (deser-feedback-url (input "FeedbackURL"))) (clojure.core/contains? input "UserSettings") (clojure.core/assoc :user-settings (deser-user-setting-list (input "UserSettings"))) (clojure.core/contains? input "RedirectURL") (clojure.core/assoc :redirect-url (deser-redirect-url (input "RedirectURL")))))

(clojure.core/defn- deser-boolean-object [input] input)

(clojure.core/defn- deser-user-setting-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-setting coll))) input))

(clojure.core/defn- deser-stack-error-code [input] (clojure.core/get {"STORAGE_CONNECTOR_ERROR" :storage-connector-error, "INTERNAL_SERVICE_ERROR" :internal-service-error} input))

(clojure.core/defn- deser-redirect-url [input] input)

(clojure.core/defn- deser-compute-capacity-status [input] (clojure.core/cond-> {:desired (deser-integer (input "Desired"))} (clojure.core/contains? input "Running") (clojure.core/assoc :running (deser-integer (input "Running"))) (clojure.core/contains? input "InUse") (clojure.core/assoc :in-use (deser-integer (input "InUse"))) (clojure.core/contains? input "Available") (clojure.core/assoc :available (deser-integer (input "Available")))))

(clojure.core/defn- deser-user-stack-association-error-code [input] (clojure.core/get {"STACK_NOT_FOUND" :stack-not-found, "USER_NAME_NOT_FOUND" :user-name-not-found, "INTERNAL_ERROR" :internal-error} input))

(clojure.core/defn- deser-directory-config-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-directory-config coll))) input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-disable-user-result ([input] (response-disable-user-result nil input)) ([resultWrapper94924 input] (clojure.core/let [rawinput94923 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94925 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-directory-config-result ([input] (response-delete-directory-config-result nil input)) ([resultWrapper94927 input] (clojure.core/let [rawinput94926 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94928 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-directory-config-result ([input] (response-update-directory-config-result nil input)) ([resultWrapper94930 input] (clojure.core/let [rawinput94929 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94931 {"DirectoryConfig" (rawinput94929 "DirectoryConfig")}] (clojure.core/cond-> {} (letvar94931 "DirectoryConfig") (clojure.core/assoc :directory-config (deser-directory-config (clojure.core/get-in letvar94931 ["DirectoryConfig"])))))))

(clojure.core/defn- response-enable-user-result ([input] (response-enable-user-result nil input)) ([resultWrapper94933 input] (clojure.core/let [rawinput94932 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94934 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-sessions-result ([input] (response-describe-sessions-result nil input)) ([resultWrapper94936 input] (clojure.core/let [rawinput94935 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94937 {"Sessions" (rawinput94935 "Sessions"), "NextToken" (rawinput94935 "NextToken")}] (clojure.core/cond-> {} (letvar94937 "Sessions") (clojure.core/assoc :sessions (deser-session-list (clojure.core/get-in letvar94937 ["Sessions"]))) (letvar94937 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar94937 ["NextToken"])))))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper94939 input] (clojure.core/let [rawinput94938 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94940 {"Message" (rawinput94938 "Message")}] (clojure.core/cond-> {} (letvar94940 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar94940 ["Message"])))))))

(clojure.core/defn- response-describe-directory-configs-result ([input] (response-describe-directory-configs-result nil input)) ([resultWrapper94942 input] (clojure.core/let [rawinput94941 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94943 {"DirectoryConfigs" (rawinput94941 "DirectoryConfigs"), "NextToken" (rawinput94941 "NextToken")}] (clojure.core/cond-> {} (letvar94943 "DirectoryConfigs") (clojure.core/assoc :directory-configs (deser-directory-config-list (clojure.core/get-in letvar94943 ["DirectoryConfigs"]))) (letvar94943 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar94943 ["NextToken"])))))))

(clojure.core/defn- response-invalid-role-exception ([input] (response-invalid-role-exception nil input)) ([resultWrapper94945 input] (clojure.core/let [rawinput94944 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94946 {"Message" (rawinput94944 "Message")}] (clojure.core/cond-> {} (letvar94946 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar94946 ["Message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper94948 input] (clojure.core/let [rawinput94947 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94949 {"Tags" (rawinput94947 "Tags")}] (clojure.core/cond-> {} (letvar94949 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar94949 ["Tags"])))))))

(clojure.core/defn- response-disassociate-fleet-result ([input] (response-disassociate-fleet-result nil input)) ([resultWrapper94951 input] (clojure.core/let [rawinput94950 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94952 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-result ([input] (response-delete-user-result nil input)) ([resultWrapper94954 input] (clojure.core/let [rawinput94953 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94955 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-fleets-result ([input] (response-describe-fleets-result nil input)) ([resultWrapper94957 input] (clojure.core/let [rawinput94956 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94958 {"Fleets" (rawinput94956 "Fleets"), "NextToken" (rawinput94956 "NextToken")}] (clojure.core/cond-> {} (letvar94958 "Fleets") (clojure.core/assoc :fleets (deser-fleet-list (clojure.core/get-in letvar94958 ["Fleets"]))) (letvar94958 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar94958 ["NextToken"])))))))

(clojure.core/defn- response-stop-fleet-result ([input] (response-stop-fleet-result nil input)) ([resultWrapper94960 input] (clojure.core/let [rawinput94959 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94961 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper94963 input] (clojure.core/let [rawinput94962 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94964 {"Message" (rawinput94962 "Message")}] (clojure.core/cond-> {} (letvar94964 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar94964 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper94966 input] (clojure.core/let [rawinput94965 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94967 {"Message" (rawinput94965 "Message")}] (clojure.core/cond-> {} (letvar94967 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar94967 ["Message"])))))))

(clojure.core/defn- response-start-image-builder-result ([input] (response-start-image-builder-result nil input)) ([resultWrapper94969 input] (clojure.core/let [rawinput94968 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94970 {"ImageBuilder" (rawinput94968 "ImageBuilder")}] (clojure.core/cond-> {} (letvar94970 "ImageBuilder") (clojure.core/assoc :image-builder (deser-image-builder (clojure.core/get-in letvar94970 ["ImageBuilder"])))))))

(clojure.core/defn- response-describe-image-permissions-result ([input] (response-describe-image-permissions-result nil input)) ([resultWrapper94972 input] (clojure.core/let [rawinput94971 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94973 {"Name" (rawinput94971 "Name"), "SharedImagePermissionsList" (rawinput94971 "SharedImagePermissionsList"), "NextToken" (rawinput94971 "NextToken")}] (clojure.core/cond-> {} (letvar94973 "Name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar94973 ["Name"]))) (letvar94973 "SharedImagePermissionsList") (clojure.core/assoc :shared-image-permissions-list (deser-shared-image-permissions-list (clojure.core/get-in letvar94973 ["SharedImagePermissionsList"]))) (letvar94973 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar94973 ["NextToken"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper94975 input] (clojure.core/let [rawinput94974 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94976 {"Message" (rawinput94974 "Message")}] (clojure.core/cond-> {} (letvar94976 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar94976 ["Message"])))))))

(clojure.core/defn- response-invalid-account-status-exception ([input] (response-invalid-account-status-exception nil input)) ([resultWrapper94978 input] (clojure.core/let [rawinput94977 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94979 {"Message" (rawinput94977 "Message")}] (clojure.core/cond-> {} (letvar94979 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar94979 ["Message"])))))))

(clojure.core/defn- response-start-fleet-result ([input] (response-start-fleet-result nil input)) ([resultWrapper94981 input] (clojure.core/let [rawinput94980 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94982 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper94984 input] (clojure.core/let [rawinput94983 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94985 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-stack-result ([input] (response-create-stack-result nil input)) ([resultWrapper94987 input] (clojure.core/let [rawinput94986 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94988 {"Stack" (rawinput94986 "Stack")}] (clojure.core/cond-> {} (letvar94988 "Stack") (clojure.core/assoc :stack (deser-stack (clojure.core/get-in letvar94988 ["Stack"])))))))

(clojure.core/defn- response-describe-images-result ([input] (response-describe-images-result nil input)) ([resultWrapper94990 input] (clojure.core/let [rawinput94989 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94991 {"Images" (rawinput94989 "Images"), "NextToken" (rawinput94989 "NextToken")}] (clojure.core/cond-> {} (letvar94991 "Images") (clojure.core/assoc :images (deser-image-list (clojure.core/get-in letvar94991 ["Images"]))) (letvar94991 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar94991 ["NextToken"])))))))

(clojure.core/defn- response-associate-fleet-result ([input] (response-associate-fleet-result nil input)) ([resultWrapper94993 input] (clojure.core/let [rawinput94992 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94994 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-image-permissions-result ([input] (response-update-image-permissions-result nil input)) ([resultWrapper94996 input] (clojure.core/let [rawinput94995 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar94997 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-image-builder-result ([input] (response-delete-image-builder-result nil input)) ([resultWrapper94999 input] (clojure.core/let [rawinput94998 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95000 {"ImageBuilder" (rawinput94998 "ImageBuilder")}] (clojure.core/cond-> {} (letvar95000 "ImageBuilder") (clojure.core/assoc :image-builder (deser-image-builder (clojure.core/get-in letvar95000 ["ImageBuilder"])))))))

(clojure.core/defn- response-create-image-builder-result ([input] (response-create-image-builder-result nil input)) ([resultWrapper95002 input] (clojure.core/let [rawinput95001 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95003 {"ImageBuilder" (rawinput95001 "ImageBuilder")}] (clojure.core/cond-> {} (letvar95003 "ImageBuilder") (clojure.core/assoc :image-builder (deser-image-builder (clojure.core/get-in letvar95003 ["ImageBuilder"])))))))

(clojure.core/defn- response-batch-associate-user-stack-result ([input] (response-batch-associate-user-stack-result nil input)) ([resultWrapper95005 input] (clojure.core/let [rawinput95004 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95006 {"errors" (rawinput95004 "errors")}] (clojure.core/cond-> {} (letvar95006 "errors") (clojure.core/assoc :errors (deser-user-stack-association-error-list (clojure.core/get-in letvar95006 ["errors"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper95008 input] (clojure.core/let [rawinput95007 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95009 {"Message" (rawinput95007 "Message")}] (clojure.core/cond-> {} (letvar95009 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar95009 ["Message"])))))))

(clojure.core/defn- response-delete-stack-result ([input] (response-delete-stack-result nil input)) ([resultWrapper95011 input] (clojure.core/let [rawinput95010 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95012 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-associated-fleets-result ([input] (response-list-associated-fleets-result nil input)) ([resultWrapper95014 input] (clojure.core/let [rawinput95013 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95015 {"Names" (rawinput95013 "Names"), "NextToken" (rawinput95013 "NextToken")}] (clojure.core/cond-> {} (letvar95015 "Names") (clojure.core/assoc :names (deser-string-list (clojure.core/get-in letvar95015 ["Names"]))) (letvar95015 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar95015 ["NextToken"])))))))

(clojure.core/defn- response-create-image-builder-streaming-url-result ([input] (response-create-image-builder-streaming-url-result nil input)) ([resultWrapper95017 input] (clojure.core/let [rawinput95016 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95018 {"StreamingURL" (rawinput95016 "StreamingURL"), "Expires" (rawinput95016 "Expires")}] (clojure.core/cond-> {} (letvar95018 "StreamingURL") (clojure.core/assoc :streaming-url (deser-string (clojure.core/get-in letvar95018 ["StreamingURL"]))) (letvar95018 "Expires") (clojure.core/assoc :expires (deser-timestamp (clojure.core/get-in letvar95018 ["Expires"])))))))

(clojure.core/defn- response-resource-not-available-exception ([input] (response-resource-not-available-exception nil input)) ([resultWrapper95020 input] (clojure.core/let [rawinput95019 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95021 {"Message" (rawinput95019 "Message")}] (clojure.core/cond-> {} (letvar95021 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar95021 ["Message"])))))))

(clojure.core/defn- response-describe-image-builders-result ([input] (response-describe-image-builders-result nil input)) ([resultWrapper95023 input] (clojure.core/let [rawinput95022 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95024 {"ImageBuilders" (rawinput95022 "ImageBuilders"), "NextToken" (rawinput95022 "NextToken")}] (clojure.core/cond-> {} (letvar95024 "ImageBuilders") (clojure.core/assoc :image-builders (deser-image-builder-list (clojure.core/get-in letvar95024 ["ImageBuilders"]))) (letvar95024 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar95024 ["NextToken"])))))))

(clojure.core/defn- response-batch-disassociate-user-stack-result ([input] (response-batch-disassociate-user-stack-result nil input)) ([resultWrapper95026 input] (clojure.core/let [rawinput95025 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95027 {"errors" (rawinput95025 "errors")}] (clojure.core/cond-> {} (letvar95027 "errors") (clojure.core/assoc :errors (deser-user-stack-association-error-list (clojure.core/get-in letvar95027 ["errors"])))))))

(clojure.core/defn- response-delete-image-permissions-result ([input] (response-delete-image-permissions-result nil input)) ([resultWrapper95029 input] (clojure.core/let [rawinput95028 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95030 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-combination-exception ([input] (response-invalid-parameter-combination-exception nil input)) ([resultWrapper95032 input] (clojure.core/let [rawinput95031 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95033 {"Message" (rawinput95031 "Message")}] (clojure.core/cond-> {} (letvar95033 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar95033 ["Message"])))))))

(clojure.core/defn- response-update-fleet-result ([input] (response-update-fleet-result nil input)) ([resultWrapper95035 input] (clojure.core/let [rawinput95034 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95036 {"Fleet" (rawinput95034 "Fleet")}] (clojure.core/cond-> {} (letvar95036 "Fleet") (clojure.core/assoc :fleet (deser-fleet (clojure.core/get-in letvar95036 ["Fleet"])))))))

(clojure.core/defn- response-describe-user-stack-associations-result ([input] (response-describe-user-stack-associations-result nil input)) ([resultWrapper95038 input] (clojure.core/let [rawinput95037 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95039 {"UserStackAssociations" (rawinput95037 "UserStackAssociations"), "NextToken" (rawinput95037 "NextToken")}] (clojure.core/cond-> {} (letvar95039 "UserStackAssociations") (clojure.core/assoc :user-stack-associations (deser-user-stack-association-list (clojure.core/get-in letvar95039 ["UserStackAssociations"]))) (letvar95039 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar95039 ["NextToken"])))))))

(clojure.core/defn- response-stop-image-builder-result ([input] (response-stop-image-builder-result nil input)) ([resultWrapper95041 input] (clojure.core/let [rawinput95040 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95042 {"ImageBuilder" (rawinput95040 "ImageBuilder")}] (clojure.core/cond-> {} (letvar95042 "ImageBuilder") (clojure.core/assoc :image-builder (deser-image-builder (clojure.core/get-in letvar95042 ["ImageBuilder"])))))))

(clojure.core/defn- response-update-stack-result ([input] (response-update-stack-result nil input)) ([resultWrapper95044 input] (clojure.core/let [rawinput95043 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95045 {"Stack" (rawinput95043 "Stack")}] (clojure.core/cond-> {} (letvar95045 "Stack") (clojure.core/assoc :stack (deser-stack (clojure.core/get-in letvar95045 ["Stack"])))))))

(clojure.core/defn- response-create-user-result ([input] (response-create-user-result nil input)) ([resultWrapper95047 input] (clojure.core/let [rawinput95046 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95048 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-streaming-url-result ([input] (response-create-streaming-url-result nil input)) ([resultWrapper95050 input] (clojure.core/let [rawinput95049 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95051 {"StreamingURL" (rawinput95049 "StreamingURL"), "Expires" (rawinput95049 "Expires")}] (clojure.core/cond-> {} (letvar95051 "StreamingURL") (clojure.core/assoc :streaming-url (deser-string (clojure.core/get-in letvar95051 ["StreamingURL"]))) (letvar95051 "Expires") (clojure.core/assoc :expires (deser-timestamp (clojure.core/get-in letvar95051 ["Expires"])))))))

(clojure.core/defn- response-create-fleet-result ([input] (response-create-fleet-result nil input)) ([resultWrapper95053 input] (clojure.core/let [rawinput95052 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95054 {"Fleet" (rawinput95052 "Fleet")}] (clojure.core/cond-> {} (letvar95054 "Fleet") (clojure.core/assoc :fleet (deser-fleet (clojure.core/get-in letvar95054 ["Fleet"])))))))

(clojure.core/defn- response-incompatible-image-exception ([input] (response-incompatible-image-exception nil input)) ([resultWrapper95056 input] (clojure.core/let [rawinput95055 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95057 {"Message" (rawinput95055 "Message")}] (clojure.core/cond-> {} (letvar95057 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar95057 ["Message"])))))))

(clojure.core/defn- response-describe-users-result ([input] (response-describe-users-result nil input)) ([resultWrapper95059 input] (clojure.core/let [rawinput95058 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95060 {"Users" (rawinput95058 "Users"), "NextToken" (rawinput95058 "NextToken")}] (clojure.core/cond-> {} (letvar95060 "Users") (clojure.core/assoc :users (deser-user-list (clojure.core/get-in letvar95060 ["Users"]))) (letvar95060 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar95060 ["NextToken"])))))))

(clojure.core/defn- response-create-directory-config-result ([input] (response-create-directory-config-result nil input)) ([resultWrapper95062 input] (clojure.core/let [rawinput95061 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95063 {"DirectoryConfig" (rawinput95061 "DirectoryConfig")}] (clojure.core/cond-> {} (letvar95063 "DirectoryConfig") (clojure.core/assoc :directory-config (deser-directory-config (clojure.core/get-in letvar95063 ["DirectoryConfig"])))))))

(clojure.core/defn- response-describe-stacks-result ([input] (response-describe-stacks-result nil input)) ([resultWrapper95065 input] (clojure.core/let [rawinput95064 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95066 {"Stacks" (rawinput95064 "Stacks"), "NextToken" (rawinput95064 "NextToken")}] (clojure.core/cond-> {} (letvar95066 "Stacks") (clojure.core/assoc :stacks (deser-stack-list (clojure.core/get-in letvar95066 ["Stacks"]))) (letvar95066 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar95066 ["NextToken"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper95068 input] (clojure.core/let [rawinput95067 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95069 {"Message" (rawinput95067 "Message")}] (clojure.core/cond-> {} (letvar95069 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar95069 ["Message"])))))))

(clojure.core/defn- response-delete-image-result ([input] (response-delete-image-result nil input)) ([resultWrapper95071 input] (clojure.core/let [rawinput95070 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95072 {"Image" (rawinput95070 "Image")}] (clojure.core/cond-> {} (letvar95072 "Image") (clojure.core/assoc :image (deser-image (clojure.core/get-in letvar95072 ["Image"])))))))

(clojure.core/defn- response-delete-fleet-result ([input] (response-delete-fleet-result nil input)) ([resultWrapper95074 input] (clojure.core/let [rawinput95073 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95075 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper95077 input] (clojure.core/let [rawinput95076 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95078 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-expire-session-result ([input] (response-expire-session-result nil input)) ([resultWrapper95080 input] (clojure.core/let [rawinput95079 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95081 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-copy-image-response ([input] (response-copy-image-response nil input)) ([resultWrapper95083 input] (clojure.core/let [rawinput95082 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95084 {"DestinationImageName" (rawinput95082 "DestinationImageName")}] (clojure.core/cond-> {} (letvar95084 "DestinationImageName") (clojure.core/assoc :destination-image-name (deser-name (clojure.core/get-in letvar95084 ["DestinationImageName"])))))))

(clojure.core/defn- response-list-associated-stacks-result ([input] (response-list-associated-stacks-result nil input)) ([resultWrapper95086 input] (clojure.core/let [rawinput95085 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar95087 {"Names" (rawinput95085 "Names"), "NextToken" (rawinput95085 "NextToken")}] (clojure.core/cond-> {} (letvar95087 "Names") (clojure.core/assoc :names (deser-string-list (clojure.core/get-in letvar95087 ["Names"]))) (letvar95087 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar95087 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.appstream/username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream/user-setting (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/action :portkey.aws.appstream/permission] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.application/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.application/display-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.application/icon-url (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.application/launch-path (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.application/launch-parameters (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.application/enabled (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream/application (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.application/name :portkey.aws.appstream.application/display-name :portkey.aws.appstream.application/icon-url :portkey.aws.appstream.application/launch-path :portkey.aws.appstream.application/launch-parameters :portkey.aws.appstream.application/enabled :portkey.aws.appstream/metadata]))

(clojure.spec.alpha/def :portkey.aws.appstream.application-settings/enabled (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream/application-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.application-settings/enabled] :opt-un [:portkey.aws.appstream/settings-group]))

(clojure.spec.alpha/def :portkey.aws.appstream/disable-user-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-directory-config-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/user-stack-association-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/user-stack-association))

(clojure.spec.alpha/def :portkey.aws.appstream/string-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/string))

(clojure.spec.alpha/def :portkey.aws.appstream/domain-join-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/directory-name :portkey.aws.appstream/organizational-unit-distinguished-name]))

(clojure.spec.alpha/def :portkey.aws.appstream/update-directory-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/directory-config]))

(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-request/user-id (clojure.spec.alpha/and :portkey.aws.appstream/streaming-url-user-id))
(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-request/application-id (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-request/validity (clojure.spec.alpha/and :portkey.aws.appstream/long))
(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-request/session-context (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/create-streaming-url-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.create-streaming-url-request/stack-name :portkey.aws.appstream.create-streaming-url-request/fleet-name :portkey.aws.appstream.create-streaming-url-request/user-id] :opt-un [:portkey.aws.appstream.create-streaming-url-request/application-id :portkey.aws.appstream.create-streaming-url-request/validity :portkey.aws.appstream.create-streaming-url-request/session-context]))

(clojure.spec.alpha/def :portkey.aws.appstream.image-permissions/allow-fleet (clojure.spec.alpha/and :portkey.aws.appstream/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.image-permissions/allow-image-builder (clojure.spec.alpha/and :portkey.aws.appstream/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream/image-permissions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.image-permissions/allow-fleet :portkey.aws.appstream.image-permissions/allow-image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream/enable-user-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-sessions-result/sessions (clojure.spec.alpha/and :portkey.aws.appstream/session-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-sessions-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-sessions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-sessions-result/sessions :portkey.aws.appstream.describe-sessions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/user-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/user))

(clojure.spec.alpha/def :portkey.aws.appstream/resource-errors (clojure.spec.alpha/coll-of :portkey.aws.appstream/resource-error))

(clojure.spec.alpha/def :portkey.aws.appstream.create-directory-config-request/organizational-unit-distinguished-names (clojure.spec.alpha/and :portkey.aws.appstream/organizational-unit-distinguished-names-list))
(clojure.spec.alpha/def :portkey.aws.appstream/create-directory-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/directory-name :portkey.aws.appstream.create-directory-config-request/organizational-unit-distinguished-names :portkey.aws.appstream/service-account-credentials] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/image-state #{"COPYING" :pending "AVAILABLE" "PENDING" :deleting :copying "DELETING" "FAILED" :available :failed})

(clojure.spec.alpha/def :portkey.aws.appstream.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.operation-not-permitted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-directory-configs-result/directory-configs (clojure.spec.alpha/and :portkey.aws.appstream/directory-config-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-directory-configs-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-directory-configs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-directory-configs-result/directory-configs :portkey.aws.appstream.describe-directory-configs-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/user-stack-association-error-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/user-stack-association-error))

(clojure.spec.alpha/def :portkey.aws.appstream.storage-connector/connector-type (clojure.spec.alpha/and :portkey.aws.appstream/storage-connector-type))
(clojure.spec.alpha/def :portkey.aws.appstream.storage-connector/domains (clojure.spec.alpha/and :portkey.aws.appstream/domain-list))
(clojure.spec.alpha/def :portkey.aws.appstream/storage-connector (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.storage-connector/connector-type] :opt-un [:portkey.aws.appstream/resource-identifier :portkey.aws.appstream.storage-connector/domains]))

(clojure.spec.alpha/def :portkey.aws.appstream.copy-image-request/source-image-name (clojure.spec.alpha/and :portkey.aws.appstream/name))
(clojure.spec.alpha/def :portkey.aws.appstream.copy-image-request/destination-image-name (clojure.spec.alpha/and :portkey.aws.appstream/name))
(clojure.spec.alpha/def :portkey.aws.appstream.copy-image-request/destination-region (clojure.spec.alpha/and :portkey.aws.appstream/region-name))
(clojure.spec.alpha/def :portkey.aws.appstream.copy-image-request/destination-image-description (clojure.spec.alpha/and :portkey.aws.appstream/description))
(clojure.spec.alpha/def :portkey.aws.appstream/copy-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.copy-image-request/source-image-name :portkey.aws.appstream.copy-image-request/destination-image-name :portkey.aws.appstream.copy-image-request/destination-region] :opt-un [:portkey.aws.appstream.copy-image-request/destination-image-description]))

(clojure.spec.alpha/def :portkey.aws.appstream.invalid-role-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/invalid-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.invalid-role-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/tags]))

(clojure.spec.alpha/def :portkey.aws.appstream.user-stack-association-error/error-code (clojure.spec.alpha/and :portkey.aws.appstream/user-stack-association-error-code))
(clojure.spec.alpha/def :portkey.aws.appstream.user-stack-association-error/error-message (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/user-stack-association-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/user-stack-association :portkey.aws.appstream.user-stack-association-error/error-code :portkey.aws.appstream.user-stack-association-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.appstream.enable-user-request/user-name (clojure.spec.alpha/and :portkey.aws.appstream/username))
(clojure.spec.alpha/def :portkey.aws.appstream/enable-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.enable-user-request/user-name :portkey.aws.appstream/authentication-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.compute-capacity/desired-instances (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream/compute-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.compute-capacity/desired-instances] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.batch-associate-user-stack-request/user-stack-associations (clojure.spec.alpha/and :portkey.aws.appstream/user-stack-association-list))
(clojure.spec.alpha/def :portkey.aws.appstream/batch-associate-user-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.batch-associate-user-stack-request/user-stack-associations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/permission #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.appstream.stack-error/error-code (clojure.spec.alpha/and :portkey.aws.appstream/stack-error-code))
(clojure.spec.alpha/def :portkey.aws.appstream.stack-error/error-message (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/stack-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.stack-error/error-code :portkey.aws.appstream.stack-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.appstream/disassociate-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.disable-user-request/user-name (clojure.spec.alpha/and :portkey.aws.appstream/username))
(clojure.spec.alpha/def :portkey.aws.appstream/disable-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.disable-user-request/user-name :portkey.aws.appstream/authentication-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.fleet/image-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/instance-type (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/disconnect-timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/created-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/display-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/image-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/description (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/state (clojure.spec.alpha/and :portkey.aws.appstream/fleet-state))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/max-user-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/fleet (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/arn :portkey.aws.appstream.fleet/name :portkey.aws.appstream.fleet/instance-type :portkey.aws.appstream/compute-capacity-status :portkey.aws.appstream.fleet/state] :opt-un [:portkey.aws.appstream/domain-join-info :portkey.aws.appstream.fleet/image-name :portkey.aws.appstream.fleet/disconnect-timeout-in-seconds :portkey.aws.appstream/fleet-type :portkey.aws.appstream.fleet/enable-default-internet-access :portkey.aws.appstream.fleet/created-time :portkey.aws.appstream.fleet/display-name :portkey.aws.appstream.fleet/image-arn :portkey.aws.appstream.fleet/description :portkey.aws.appstream/fleet-errors :portkey.aws.appstream/vpc-config :portkey.aws.appstream.fleet/max-user-duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-user-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.delete-stack-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/delete-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.delete-stack-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-fleets-result/fleets (clojure.spec.alpha/and :portkey.aws.appstream/fleet-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-fleets-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-fleets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-fleets-result/fleets :portkey.aws.appstream.describe-fleets-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/image-builder-state-change-reason-code #{"IMAGE_UNAVAILABLE" :internal-error "INTERNAL_ERROR" :image-unavailable})

(clojure.spec.alpha/def :portkey.aws.appstream.expire-session-request/session-id (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/expire-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.expire-session-request/session-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.delete-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/delete-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.delete-fleet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/stop-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.image-builder-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.appstream/image-builder-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/image-builder-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.image-builder-state-change-reason/code :portkey.aws.appstream.image-builder-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.create-stack-request/storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream/storage-connector-list))
(clojure.spec.alpha/def :portkey.aws.appstream.create-stack-request/user-settings (clojure.spec.alpha/and :portkey.aws.appstream/user-setting-list))
(clojure.spec.alpha/def :portkey.aws.appstream/create-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name] :opt-un [:portkey.aws.appstream/application-settings :portkey.aws.appstream.create-stack-request/storage-connectors :portkey.aws.appstream/tags :portkey.aws.appstream/display-name :portkey.aws.appstream/description :portkey.aws.appstream/feedback-url :portkey.aws.appstream.create-stack-request/user-settings :portkey.aws.appstream/redirect-url]))

(clojure.spec.alpha/def :portkey.aws.appstream.stop-image-builder-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/stop-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.stop-image-builder-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/describe-images-max-results (clojure.spec.alpha/int-in 0 25))

(clojure.spec.alpha/def :portkey.aws.appstream.associate-fleet-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.associate-fleet-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/associate-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.associate-fleet-request/fleet-name :portkey.aws.appstream.associate-fleet-request/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.image-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.appstream/image-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.appstream.image-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/image-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.image-state-change-reason/code :portkey.aws.appstream.image-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.application-settings-response/enabled (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.application-settings-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/application-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.application-settings-response/enabled :portkey.aws.appstream/settings-group :portkey.aws.appstream.application-settings-response/s-3-bucket-name]))

(clojure.spec.alpha/def :portkey.aws.appstream/session-connection-state #{"NOT_CONNECTED" :not-connected :connected "CONNECTED"})

(clojure.spec.alpha/def :portkey.aws.appstream/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.appstream/subnet-id-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/string))

(clojure.spec.alpha/def :portkey.aws.appstream/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(^(?!aws:).[\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream/platform-type #{:windows "WINDOWS"})

(clojure.spec.alpha/def :portkey.aws.appstream/stack-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/stack))

(clojure.spec.alpha/def :portkey.aws.appstream.delete-image-permissions-request/shared-account-id (clojure.spec.alpha/and :portkey.aws.appstream/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.appstream/delete-image-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name :portkey.aws.appstream.delete-image-permissions-request/shared-account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-directory-configs-request/directory-names (clojure.spec.alpha/and :portkey.aws.appstream/directory-name-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-directory-configs-request/max-results (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-directory-configs-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-directory-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-directory-configs-request/directory-names :portkey.aws.appstream.describe-directory-configs-request/max-results :portkey.aws.appstream.describe-directory-configs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/tags (clojure.spec.alpha/map-of :portkey.aws.appstream/tag-key :portkey.aws.appstream/tag-value))

(clojure.spec.alpha/def :portkey.aws.appstream/storage-connector-type #{"HOMEFOLDERS" :homefolders "GOOGLE_DRIVE" :google-drive "ONE_DRIVE" :one-drive})

(clojure.spec.alpha/def :portkey.aws.appstream.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream/start-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-request/image-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-request/instance-type (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-request/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-request/image-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream/create-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name :portkey.aws.appstream.create-image-builder-request/instance-type] :opt-un [:portkey.aws.appstream/domain-join-info :portkey.aws.appstream.create-image-builder-request/image-name :portkey.aws.appstream/tags :portkey.aws.appstream.create-image-builder-request/enable-default-internet-access :portkey.aws.appstream/display-name :portkey.aws.appstream.create-image-builder-request/image-arn :portkey.aws.appstream/appstream-agent-version :portkey.aws.appstream/description :portkey.aws.appstream/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.appstream.stop-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/stop-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.stop-fleet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/image-builder-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/image-builder))

(clojure.spec.alpha/def :portkey.aws.appstream.shared-image-permissions/shared-account-id (clojure.spec.alpha/and :portkey.aws.appstream/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.appstream.shared-image-permissions/image-permissions (clojure.spec.alpha/and :portkey.aws.appstream/image-permissions))
(clojure.spec.alpha/def :portkey.aws.appstream/shared-image-permissions (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.shared-image-permissions/shared-account-id :portkey.aws.appstream.shared-image-permissions/image-permissions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/session-state #{"EXPIRED" :pending "PENDING" :active "ACTIVE" :expired})

(clojure.spec.alpha/def :portkey.aws.appstream/shared-image-permissions-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/shared-image-permissions))

(clojure.spec.alpha/def :portkey.aws.appstream.user/user-name (clojure.spec.alpha/and :portkey.aws.appstream/username))
(clojure.spec.alpha/def :portkey.aws.appstream.user/enabled (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.user/status (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.user/first-name (clojure.spec.alpha/and :portkey.aws.appstream/user-attribute-value))
(clojure.spec.alpha/def :portkey.aws.appstream.user/last-name (clojure.spec.alpha/and :portkey.aws.appstream/user-attribute-value))
(clojure.spec.alpha/def :portkey.aws.appstream.user/created-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream/user (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/authentication-type] :opt-un [:portkey.aws.appstream/arn :portkey.aws.appstream.user/user-name :portkey.aws.appstream.user/enabled :portkey.aws.appstream.user/status :portkey.aws.appstream.user/first-name :portkey.aws.appstream.user/last-name :portkey.aws.appstream.user/created-time]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-permissions-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-image-permissions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/name :portkey.aws.appstream/shared-image-permissions-list :portkey.aws.appstream.describe-image-permissions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/fleet-type #{"ON_DEMAND" "ALWAYS_ON" :always-on :on-demand})

(clojure.spec.alpha/def :portkey.aws.appstream.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.invalid-account-status-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/invalid-account-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.invalid-account-status-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.resource-error/error-code (clojure.spec.alpha/and :portkey.aws.appstream/fleet-error-code))
(clojure.spec.alpha/def :portkey.aws.appstream.resource-error/error-message (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.resource-error/error-timestamp (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream/resource-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.resource-error/error-code :portkey.aws.appstream.resource-error/error-message :portkey.aws.appstream.resource-error/error-timestamp]))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/service-account-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/account-name :portkey.aws.appstream/account-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.update-stack-request/delete-storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.update-stack-request/storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream/storage-connector-list))
(clojure.spec.alpha/def :portkey.aws.appstream.update-stack-request/attributes-to-delete (clojure.spec.alpha/and :portkey.aws.appstream/stack-attributes))
(clojure.spec.alpha/def :portkey.aws.appstream.update-stack-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.update-stack-request/user-settings (clojure.spec.alpha/and :portkey.aws.appstream/user-setting-list))
(clojure.spec.alpha/def :portkey.aws.appstream/update-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.update-stack-request/name] :opt-un [:portkey.aws.appstream/application-settings :portkey.aws.appstream.update-stack-request/delete-storage-connectors :portkey.aws.appstream.update-stack-request/storage-connectors :portkey.aws.appstream.update-stack-request/attributes-to-delete :portkey.aws.appstream/display-name :portkey.aws.appstream/description :portkey.aws.appstream/feedback-url :portkey.aws.appstream.update-stack-request/user-settings :portkey.aws.appstream/redirect-url]))

(clojure.spec.alpha/def :portkey.aws.appstream.update-image-permissions-request/shared-account-id (clojure.spec.alpha/and :portkey.aws.appstream/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.appstream/update-image-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name :portkey.aws.appstream.update-image-permissions-request/shared-account-id :portkey.aws.appstream/image-permissions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/start-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appstream/create-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/stack]))

(clojure.spec.alpha/def :portkey.aws.appstream/fleet-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/fleet))

(clojure.spec.alpha/def :portkey.aws.appstream/image-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/image))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-images-result/images (clojure.spec.alpha/and :portkey.aws.appstream/image-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-images-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-images-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-images-result/images :portkey.aws.appstream.describe-images-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/region-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.appstream/stack-errors (clojure.spec.alpha/coll-of :portkey.aws.appstream/stack-error))

(clojure.spec.alpha/def :portkey.aws.appstream/domain (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.appstream/fleet-attributes (clojure.spec.alpha/coll-of :portkey.aws.appstream/fleet-attribute))

(clojure.spec.alpha/def :portkey.aws.appstream.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.tag-resource-request/resource-arn :portkey.aws.appstream/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/domain-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/domain :max-count 10))

(clojure.spec.alpha/def :portkey.aws.appstream/fleet-attribute #{:domain-join-info "VPC_CONFIGURATION" :vpc-configuration "DOMAIN_JOIN_INFO" "VPC_CONFIGURATION_SECURITY_GROUP_IDS" :vpc-configuration-security-group-ids})

(clojure.spec.alpha/def :portkey.aws.appstream/display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.appstream/associate-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/state-change-reason (clojure.spec.alpha/and :portkey.aws.appstream/image-builder-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/platform (clojure.spec.alpha/and :portkey.aws.appstream/platform-type))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/instance-type (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/created-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/display-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/image-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/image-builder-errors (clojure.spec.alpha/and :portkey.aws.appstream/resource-errors))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/description (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/state (clojure.spec.alpha/and :portkey.aws.appstream/image-builder-state))
(clojure.spec.alpha/def :portkey.aws.appstream.image-builder/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/image-builder (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.image-builder/name] :opt-un [:portkey.aws.appstream/domain-join-info :portkey.aws.appstream.image-builder/state-change-reason :portkey.aws.appstream.image-builder/platform :portkey.aws.appstream.image-builder/instance-type :portkey.aws.appstream.image-builder/enable-default-internet-access :portkey.aws.appstream.image-builder/created-time :portkey.aws.appstream.image-builder/display-name :portkey.aws.appstream.image-builder/image-arn :portkey.aws.appstream/appstream-agent-version :portkey.aws.appstream.image-builder/image-builder-errors :portkey.aws.appstream.image-builder/description :portkey.aws.appstream/arn :portkey.aws.appstream/vpc-config :portkey.aws.appstream.image-builder/state]))

(clojure.spec.alpha/def :portkey.aws.appstream/message-action #{:suppress "RESEND" :resend "SUPPRESS"})

(clojure.spec.alpha/def :portkey.aws.appstream/account-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 127))))

(clojure.spec.alpha/def :portkey.aws.appstream/update-image-permissions-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream/create-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.appstream/applications (clojure.spec.alpha/coll-of :portkey.aws.appstream/application))

(clojure.spec.alpha/def :portkey.aws.appstream/user-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[A-Za-z0-9_\-\s]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.batch-associate-user-stack-result/errors (clojure.spec.alpha/and :portkey.aws.appstream/user-stack-association-error-list))
(clojure.spec.alpha/def :portkey.aws.appstream/batch-associate-user-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.batch-associate-user-stack-result/errors]))

(clojure.spec.alpha/def :portkey.aws.appstream.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-sessions-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-sessions-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-sessions-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-sessions-request/limit (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-sessions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.describe-sessions-request/stack-name :portkey.aws.appstream.describe-sessions-request/fleet-name] :opt-un [:portkey.aws.appstream/user-id :portkey.aws.appstream.describe-sessions-request/next-token :portkey.aws.appstream.describe-sessions-request/limit :portkey.aws.appstream/authentication-type]))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-directory-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/directory-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/appstream-agent-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.appstream.disassociate-fleet-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.disassociate-fleet-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/disassociate-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.disassociate-fleet-request/fleet-name :portkey.aws.appstream.disassociate-fleet-request/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-fleets-result/names (clojure.spec.alpha/and :portkey.aws.appstream/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-fleets-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/list-associated-fleets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.list-associated-fleets-result/names :portkey.aws.appstream.list-associated-fleets-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-streaming-url-result/streaming-url (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-streaming-url-result/expires (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream/create-image-builder-streaming-url-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.create-image-builder-streaming-url-result/streaming-url :portkey.aws.appstream.create-image-builder-streaming-url-result/expires]))

(clojure.spec.alpha/def :portkey.aws.appstream/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.appstream/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream/fleet-errors (clojure.spec.alpha/coll-of :portkey.aws.appstream/fleet-error))

(clojure.spec.alpha/def :portkey.aws.appstream/stack-attributes (clojure.spec.alpha/coll-of :portkey.aws.appstream/stack-attribute))

(clojure.spec.alpha/def :portkey.aws.appstream/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\d+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.network-access-configuration/eni-private-ip-address (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.network-access-configuration/eni-id (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/network-access-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.network-access-configuration/eni-private-ip-address :portkey.aws.appstream.network-access-configuration/eni-id]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-user-stack-associations-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-user-stack-associations-request/user-name (clojure.spec.alpha/and :portkey.aws.appstream/username))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-user-stack-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-user-stack-associations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-user-stack-associations-request/stack-name :portkey.aws.appstream.describe-user-stack-associations-request/user-name :portkey.aws.appstream/authentication-type :portkey.aws.appstream/max-results :portkey.aws.appstream.describe-user-stack-associations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.resource-not-available-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/resource-not-available-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.resource-not-available-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.start-image-builder-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/start-image-builder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.start-image-builder-request/name] :opt-un [:portkey.aws.appstream/appstream-agent-version]))

(clojure.spec.alpha/def :portkey.aws.appstream.directory-config/organizational-unit-distinguished-names (clojure.spec.alpha/and :portkey.aws.appstream/organizational-unit-distinguished-names-list))
(clojure.spec.alpha/def :portkey.aws.appstream.directory-config/created-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream/directory-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/directory-name] :opt-un [:portkey.aws.appstream.directory-config/organizational-unit-distinguished-names :portkey.aws.appstream/service-account-credentials :portkey.aws.appstream.directory-config/created-time]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-builders-result/image-builders (clojure.spec.alpha/and :portkey.aws.appstream/image-builder-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-builders-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-image-builders-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-image-builders-result/image-builders :portkey.aws.appstream.describe-image-builders-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/image-builder-state #{:snapshotting :updating-agent :pending "REBOOTING" "PENDING" :deleting "SNAPSHOTTING" :running :stopping :stopped "UPDATING_AGENT" :rebooting "STOPPED" "DELETING" "FAILED" "STOPPING" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.appstream/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appstream.user-stack-association/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.user-stack-association/user-name (clojure.spec.alpha/and :portkey.aws.appstream/username))
(clojure.spec.alpha/def :portkey.aws.appstream.user-stack-association/send-email-notification (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream/user-stack-association (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.user-stack-association/stack-name :portkey.aws.appstream.user-stack-association/user-name :portkey.aws.appstream/authentication-type] :opt-un [:portkey.aws.appstream.user-stack-association/send-email-notification]))

(clojure.spec.alpha/def :portkey.aws.appstream/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.appstream/authentication-type #{:api "API" "SAML" "USERPOOL" :saml :userpool})

(clojure.spec.alpha/def :portkey.aws.appstream.batch-disassociate-user-stack-result/errors (clojure.spec.alpha/and :portkey.aws.appstream/user-stack-association-error-list))
(clojure.spec.alpha/def :portkey.aws.appstream/batch-disassociate-user-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.batch-disassociate-user-stack-result/errors]))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/image-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/instance-type (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/disconnect-timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/attributes-to-delete (clojure.spec.alpha/and :portkey.aws.appstream/fleet-attributes))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/image-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/delete-vpc-config (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/max-user-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.update-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/update-fleet-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/domain-join-info :portkey.aws.appstream.update-fleet-request/image-name :portkey.aws.appstream/compute-capacity :portkey.aws.appstream.update-fleet-request/instance-type :portkey.aws.appstream.update-fleet-request/disconnect-timeout-in-seconds :portkey.aws.appstream.update-fleet-request/attributes-to-delete :portkey.aws.appstream.update-fleet-request/enable-default-internet-access :portkey.aws.appstream/display-name :portkey.aws.appstream.update-fleet-request/image-arn :portkey.aws.appstream/description :portkey.aws.appstream.update-fleet-request/delete-vpc-config :portkey.aws.appstream/vpc-config :portkey.aws.appstream.update-fleet-request/max-user-duration-in-seconds :portkey.aws.appstream.update-fleet-request/name]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-images-request/names (clojure.spec.alpha/and :portkey.aws.appstream/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-images-request/arns (clojure.spec.alpha/and :portkey.aws.appstream/arn-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-images-request/type (clojure.spec.alpha/and :portkey.aws.appstream/visibility-type))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-images-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-images-request/max-results (clojure.spec.alpha/and :portkey.aws.appstream/describe-images-max-results))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-images-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-images-request/names :portkey.aws.appstream.describe-images-request/arns :portkey.aws.appstream.describe-images-request/type :portkey.aws.appstream.describe-images-request/next-token :portkey.aws.appstream.describe-images-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-image-permissions-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/storage-connector-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/storage-connector))

(clojure.spec.alpha/def :portkey.aws.appstream/resource-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.appstream.invalid-parameter-combination-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.invalid-parameter-combination-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream/update-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/fleet]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-user-stack-associations-result/user-stack-associations (clojure.spec.alpha/and :portkey.aws.appstream/user-stack-association-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-user-stack-associations-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-user-stack-associations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-user-stack-associations-result/user-stack-associations :portkey.aws.appstream.describe-user-stack-associations-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/stop-image-builder-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/image-builder]))

(clojure.spec.alpha/def :portkey.aws.appstream/directory-name-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/directory-name))

(clojure.spec.alpha/def :portkey.aws.appstream/update-stack-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/stack]))

(clojure.spec.alpha/def :portkey.aws.appstream.batch-disassociate-user-stack-request/user-stack-associations (clojure.spec.alpha/and :portkey.aws.appstream/user-stack-association-list))
(clojure.spec.alpha/def :portkey.aws.appstream/batch-disassociate-user-stack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.batch-disassociate-user-stack-request/user-stack-associations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/create-user-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-fleets-request/names (clojure.spec.alpha/and :portkey.aws.appstream/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-fleets-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-fleets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-fleets-request/names :portkey.aws.appstream.describe-fleets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws:[A-Za-z0-9][A-Za-z0-9_/.-]{0,62}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,1023}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream/feedback-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.appstream.vpc-config/subnet-ids (clojure.spec.alpha/and :portkey.aws.appstream/subnet-id-list))
(clojure.spec.alpha/def :portkey.aws.appstream.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.appstream/security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.appstream/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.vpc-config/subnet-ids :portkey.aws.appstream.vpc-config/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.appstream.create-user-request/user-name (clojure.spec.alpha/and :portkey.aws.appstream/username))
(clojure.spec.alpha/def :portkey.aws.appstream.create-user-request/first-name (clojure.spec.alpha/and :portkey.aws.appstream/user-attribute-value))
(clojure.spec.alpha/def :portkey.aws.appstream.create-user-request/last-name (clojure.spec.alpha/and :portkey.aws.appstream/user-attribute-value))
(clojure.spec.alpha/def :portkey.aws.appstream/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.create-user-request/user-name :portkey.aws.appstream/authentication-type] :opt-un [:portkey.aws.appstream/message-action :portkey.aws.appstream.create-user-request/first-name :portkey.aws.appstream.create-user-request/last-name]))

(clojure.spec.alpha/def :portkey.aws.appstream/account-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.appstream/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appstream/streaming-url-user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-result/streaming-url (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-streaming-url-result/expires (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream/create-streaming-url-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.create-streaming-url-result/streaming-url :portkey.aws.appstream.create-streaming-url-result/expires]))

(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-fleets-request/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-fleets-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/list-associated-fleets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.list-associated-fleets-request/stack-name] :opt-un [:portkey.aws.appstream.list-associated-fleets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/stack-attribute #{:theme-name "STORAGE_CONNECTOR_GOOGLE_DRIVE" :redirect-url "STORAGE_CONNECTOR_ONE_DRIVE" "FEEDBACK_URL" :user-settings "STORAGE_CONNECTOR_HOMEFOLDERS" :storage-connector-one-drive :storage-connector-homefolders "THEME_NAME" :storage-connectors "REDIRECT_URL" "USER_SETTINGS" :feedback-url "STORAGE_CONNECTORS" :storage-connector-google-drive})

(clojure.spec.alpha/def :portkey.aws.appstream/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.appstream/create-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/fleet]))

(clojure.spec.alpha/def :portkey.aws.appstream/fleet-state #{:starting :running :stopping :stopped "STOPPED" "STARTING" "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.appstream/metadata (clojure.spec.alpha/map-of :portkey.aws.appstream/string :portkey.aws.appstream/string))

(clojure.spec.alpha/def :portkey.aws.appstream/settings-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.appstream/security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/string :max-count 5))

(clojure.spec.alpha/def :portkey.aws.appstream/session-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/session))

(clojure.spec.alpha/def :portkey.aws.appstream/fleet-error-code #{:domain-join-error-not-supported :network-interface-limit-exceeded "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES" :invalid-subnet-configuration :domain-join-nerr-password-expired :domain-join-error-access-denied "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME" :security-groups-not-found :domain-join-error-file-not-found "NETWORK_INTERFACE_LIMIT_EXCEEDED" "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION" "IMAGE_NOT_FOUND" "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED" "DOMAIN_JOIN_ERROR_LOGON_FAILURE" "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION" "DOMAIN_JOIN_ERROR_ACCESS_DENIED" :iam-service-role-missing-eni-delete-action "DOMAIN_JOIN_ERROR_NOT_SUPPORTED" :igw-not-attached :domain-join-error-more-data :internal-service-error "INTERNAL_SERVICE_ERROR" :domain-join-nerr-invalid-workgroup-name "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED" :image-not-found :domain-join-error-no-such-domain :iam-service-role-missing-describe-security-groups-action :domain-join-error-invalid-parameter "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN" :domain-join-error-ds-machine-account-quota-exceeded :iam-service-role-is-missing "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR" "INVALID_SUBNET_CONFIGURATION" "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION" "DOMAIN_JOIN_ERROR_MORE_DATA" "IGW_NOT_ATTACHED" :domain-join-error-logon-failure "SUBNET_NOT_FOUND" :subnet-not-found "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND" "SECURITY_GROUPS_NOT_FOUND" "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED" :subnet-has-insufficient-ip-addresses :iam-service-role-missing-describe-subnet-action :iam-service-role-missing-eni-create-action "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION" :domain-join-nerr-workstation-not-started :domain-join-internal-service-error "DOMAIN_JOIN_ERROR_INVALID_PARAMETER" "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION" "IAM_SERVICE_ROLE_IS_MISSING" :iam-service-role-missing-eni-describe-action})

(clojure.spec.alpha/def :portkey.aws.appstream.incompatible-image-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/incompatible-image-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.incompatible-image-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.delete-user-request/user-name (clojure.spec.alpha/and :portkey.aws.appstream/username))
(clojure.spec.alpha/def :portkey.aws.appstream/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.delete-user-request/user-name :portkey.aws.appstream/authentication-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-stacks-request/names (clojure.spec.alpha/and :portkey.aws.appstream/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-stacks-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-stacks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-stacks-request/names :portkey.aws.appstream.describe-stacks-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/directory-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-users-result/users (clojure.spec.alpha/and :portkey.aws.appstream/user-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-users-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-users-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-users-result/users :portkey.aws.appstream.describe-users-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/max-results (clojure.spec.alpha/int-in 0 500))

(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-streaming-url-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-image-builder-streaming-url-request/validity (clojure.spec.alpha/and :portkey.aws.appstream/long))
(clojure.spec.alpha/def :portkey.aws.appstream/create-image-builder-streaming-url-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.create-image-builder-streaming-url-request/name] :opt-un [:portkey.aws.appstream.create-image-builder-streaming-url-request/validity]))

(clojure.spec.alpha/def :portkey.aws.appstream/arn-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/arn))

(clojure.spec.alpha/def :portkey.aws.appstream/organizational-unit-distinguished-names-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/organizational-unit-distinguished-name))

(clojure.spec.alpha/def :portkey.aws.appstream.start-fleet-request/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/start-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.start-fleet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/visibility-type #{:private :public "PRIVATE" :shared "PUBLIC" "SHARED"})

(clojure.spec.alpha/def :portkey.aws.appstream/image-state-change-reason-code #{:image-copy-failure "IMAGE_COPY_FAILURE" :internal-error "IMAGE_BUILDER_NOT_AVAILABLE" "INTERNAL_ERROR" :image-builder-not-available})

(clojure.spec.alpha/def :portkey.aws.appstream.fleet-error/error-code (clojure.spec.alpha/and :portkey.aws.appstream/fleet-error-code))
(clojure.spec.alpha/def :portkey.aws.appstream.fleet-error/error-message (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/fleet-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.fleet-error/error-code :portkey.aws.appstream.fleet-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.appstream/create-directory-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/directory-config]))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-stacks-result/stacks (clojure.spec.alpha/and :portkey.aws.appstream/stack-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-stacks-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-stacks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-stacks-result/stacks :portkey.aws.appstream.describe-stacks-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.appstream/error-message))
(clojure.spec.alpha/def :portkey.aws.appstream/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appstream.image/state-change-reason (clojure.spec.alpha/and :portkey.aws.appstream/image-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.appstream.image/public-base-image-released-date (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.image/platform (clojure.spec.alpha/and :portkey.aws.appstream/platform-type))
(clojure.spec.alpha/def :portkey.aws.appstream.image/visibility (clojure.spec.alpha/and :portkey.aws.appstream/visibility-type))
(clojure.spec.alpha/def :portkey.aws.appstream.image/base-image-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.image/created-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.image/display-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.image/description (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.image/image-builder-supported (clojure.spec.alpha/and :portkey.aws.appstream/boolean))
(clojure.spec.alpha/def :portkey.aws.appstream.image/state (clojure.spec.alpha/and :portkey.aws.appstream/image-state))
(clojure.spec.alpha/def :portkey.aws.appstream.image/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/image (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.image/name] :opt-un [:portkey.aws.appstream/image-permissions :portkey.aws.appstream.image/state-change-reason :portkey.aws.appstream.image/public-base-image-released-date :portkey.aws.appstream.image/platform :portkey.aws.appstream.image/visibility :portkey.aws.appstream.image/base-image-arn :portkey.aws.appstream.image/created-time :portkey.aws.appstream.image/display-name :portkey.aws.appstream/applications :portkey.aws.appstream/appstream-agent-version :portkey.aws.appstream.image/description :portkey.aws.appstream/arn :portkey.aws.appstream.image/image-builder-supported :portkey.aws.appstream.image/state]))

(clojure.spec.alpha/def :portkey.aws.appstream/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-image-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream/image]))

(clojure.spec.alpha/def :portkey.aws.appstream.create-fleet-request/image-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-fleet-request/instance-type (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.create-fleet-request/disconnect-timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.create-fleet-request/enable-default-internet-access (clojure.spec.alpha/and :portkey.aws.appstream/boolean-object))
(clojure.spec.alpha/def :portkey.aws.appstream.create-fleet-request/image-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.create-fleet-request/max-user-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream/create-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name :portkey.aws.appstream.create-fleet-request/instance-type :portkey.aws.appstream/compute-capacity] :opt-un [:portkey.aws.appstream/domain-join-info :portkey.aws.appstream.create-fleet-request/image-name :portkey.aws.appstream.create-fleet-request/disconnect-timeout-in-seconds :portkey.aws.appstream/tags :portkey.aws.appstream/fleet-type :portkey.aws.appstream.create-fleet-request/enable-default-internet-access :portkey.aws.appstream/display-name :portkey.aws.appstream.create-fleet-request/image-arn :portkey.aws.appstream/description :portkey.aws.appstream/vpc-config :portkey.aws.appstream.create-fleet-request/max-user-duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.appstream.update-directory-config-request/organizational-unit-distinguished-names (clojure.spec.alpha/and :portkey.aws.appstream/organizational-unit-distinguished-names-list))
(clojure.spec.alpha/def :portkey.aws.appstream/update-directory-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/directory-name] :opt-un [:portkey.aws.appstream.update-directory-config-request/organizational-unit-distinguished-names :portkey.aws.appstream/service-account-credentials]))

(clojure.spec.alpha/def :portkey.aws.appstream/delete-fleet-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.session/connection-state (clojure.spec.alpha/and :portkey.aws.appstream/session-connection-state))
(clojure.spec.alpha/def :portkey.aws.appstream.session/start-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.session/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.session/max-expiration-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.session/stack-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.session/state (clojure.spec.alpha/and :portkey.aws.appstream/session-state))
(clojure.spec.alpha/def :portkey.aws.appstream.session/id (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/session (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.session/id :portkey.aws.appstream/user-id :portkey.aws.appstream.session/stack-name :portkey.aws.appstream.session/fleet-name :portkey.aws.appstream.session/state] :opt-un [:portkey.aws.appstream.session/connection-state :portkey.aws.appstream.session/start-time :portkey.aws.appstream/network-access-configuration :portkey.aws.appstream/authentication-type :portkey.aws.appstream.session/max-expiration-time]))

(clojure.spec.alpha/def :portkey.aws.appstream/organizational-unit-distinguished-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.appstream/action #{"FILE_DOWNLOAD" :clipboard-copy-to-local-device :printing-to-local-device :file-upload "FILE_UPLOAD" :clipboard-copy-from-local-device :file-download "PRINTING_TO_LOCAL_DEVICE" "CLIPBOARD_COPY_TO_LOCAL_DEVICE" "CLIPBOARD_COPY_FROM_LOCAL_DEVICE"})

(clojure.spec.alpha/def :portkey.aws.appstream.stack/application-settings (clojure.spec.alpha/and :portkey.aws.appstream/application-settings-response))
(clojure.spec.alpha/def :portkey.aws.appstream.stack/storage-connectors (clojure.spec.alpha/and :portkey.aws.appstream/storage-connector-list))
(clojure.spec.alpha/def :portkey.aws.appstream.stack/created-time (clojure.spec.alpha/and :portkey.aws.appstream/timestamp))
(clojure.spec.alpha/def :portkey.aws.appstream.stack/display-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.stack/description (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.stack/name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.stack/user-settings (clojure.spec.alpha/and :portkey.aws.appstream/user-setting-list))
(clojure.spec.alpha/def :portkey.aws.appstream/stack (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.stack/name] :opt-un [:portkey.aws.appstream.stack/application-settings :portkey.aws.appstream.stack/storage-connectors :portkey.aws.appstream/stack-errors :portkey.aws.appstream.stack/created-time :portkey.aws.appstream.stack/display-name :portkey.aws.appstream.stack/description :portkey.aws.appstream/arn :portkey.aws.appstream/feedback-url :portkey.aws.appstream.stack/user-settings :portkey.aws.appstream/redirect-url]))

(clojure.spec.alpha/def :portkey.aws.appstream/aws-account-id-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/aws-account-id :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.appstream/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.appstream/user-setting-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/user-setting :min-count 1))

(clojure.spec.alpha/def :portkey.aws.appstream/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-builders-request/names (clojure.spec.alpha/and :portkey.aws.appstream/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-builders-request/max-results (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-builders-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-image-builders-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.describe-image-builders-request/names :portkey.aws.appstream.describe-image-builders-request/max-results :portkey.aws.appstream.describe-image-builders-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/stack-error-code #{:internal-service-error "INTERNAL_SERVICE_ERROR" "STORAGE_CONNECTOR_ERROR" :storage-connector-error})

(clojure.spec.alpha/def :portkey.aws.appstream/redirect-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.appstream.compute-capacity-status/desired (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.compute-capacity-status/running (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.compute-capacity-status/in-use (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.compute-capacity-status/available (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream/compute-capacity-status (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.compute-capacity-status/desired] :opt-un [:portkey.aws.appstream.compute-capacity-status/running :portkey.aws.appstream.compute-capacity-status/in-use :portkey.aws.appstream.compute-capacity-status/available]))

(clojure.spec.alpha/def :portkey.aws.appstream/expire-session-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-users-request/max-results (clojure.spec.alpha/and :portkey.aws.appstream/integer))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-users-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/authentication-type] :opt-un [:portkey.aws.appstream.describe-users-request/max-results :portkey.aws.appstream.describe-users-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/user-stack-association-error-code #{"USER_NAME_NOT_FOUND" :stack-not-found :internal-error :user-name-not-found "INTERNAL_ERROR" "STACK_NOT_FOUND"})

(clojure.spec.alpha/def :portkey.aws.appstream.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.appstream/arn))
(clojure.spec.alpha/def :portkey.aws.appstream.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.appstream/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.appstream/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.untag-resource-request/resource-arn :portkey.aws.appstream.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appstream/directory-config-list (clojure.spec.alpha/coll-of :portkey.aws.appstream/directory-config))

(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-permissions-request/shared-aws-account-ids (clojure.spec.alpha/and :portkey.aws.appstream/aws-account-id-list))
(clojure.spec.alpha/def :portkey.aws.appstream.describe-image-permissions-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/describe-image-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream/name] :opt-un [:portkey.aws.appstream/max-results :portkey.aws.appstream.describe-image-permissions-request/shared-aws-account-ids :portkey.aws.appstream.describe-image-permissions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-stacks-request/fleet-name (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-stacks-request/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/list-associated-stacks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appstream.list-associated-stacks-request/fleet-name] :opt-un [:portkey.aws.appstream.list-associated-stacks-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.appstream.copy-image-response/destination-image-name (clojure.spec.alpha/and :portkey.aws.appstream/name))
(clojure.spec.alpha/def :portkey.aws.appstream/copy-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.copy-image-response/destination-image-name]))

(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-stacks-result/names (clojure.spec.alpha/and :portkey.aws.appstream/string-list))
(clojure.spec.alpha/def :portkey.aws.appstream.list-associated-stacks-result/next-token (clojure.spec.alpha/and :portkey.aws.appstream/string))
(clojure.spec.alpha/def :portkey.aws.appstream/list-associated-stacks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appstream.list-associated-stacks-result/names :portkey.aws.appstream.list-associated-stacks-result/next-token]))

(clojure.core/defn tag-resource "Adds or overwrites one or more tags for the specified AppStream 2.0 resource.\nYou can tag AppStream 2.0 image builders, images, fleets, and stacks.\n Each tag consists of a key and an optional value. If a resource already has a\ntag with the same key, this operation updates its value.\n To list the current tags for your resources, use ListTagsForResource. To\ndisassociate tags from your resources, use UntagResource.\n For more information about tags, see Tagging Your Resources\n(https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html)\nin the Amazon AppStream 2.0 Developer Guide." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.appstream/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/tag-resource-response))

(clojure.core/defn delete-image-permissions "Deletes permissions for the specified private image. After you delete\npermissions for an image, AWS accounts to which you previously granted these\npermissions can no longer use the image." ([delete-image-permissions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-image-permissions-request delete-image-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/delete-image-permissions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/delete-image-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteImagePermissions", :http.request.configuration/output-deser-fn response-delete-image-permissions-result, :http.request.spec/error-spec {"ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-image-permissions :args (clojure.spec.alpha/tuple :portkey.aws.appstream/delete-image-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/delete-image-permissions-result))

(clojure.core/defn update-image-permissions "Adds or updates permissions for the specified private image." ([update-image-permissions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-image-permissions-request update-image-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/update-image-permissions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/update-image-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateImagePermissions", :http.request.configuration/output-deser-fn response-update-image-permissions-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-image-permissions :args (clojure.spec.alpha/tuple :portkey.aws.appstream/update-image-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/update-image-permissions-result))

(clojure.core/defn create-streaming-url "Creates a temporary URL to start an AppStream 2.0 streaming session for the\nspecified user. A streaming URL enables application streaming to be tested\nwithout user setup." ([create-streaming-url-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-url-request create-streaming-url-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/create-streaming-url-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/create-streaming-url-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingURL", :http.request.configuration/output-deser-fn response-create-streaming-url-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef create-streaming-url :args (clojure.spec.alpha/tuple :portkey.aws.appstream/create-streaming-url-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/create-streaming-url-result))

(clojure.core/defn delete-image "Deletes the specified image. You cannot delete an image when it is in use. After\nyou delete an image, you cannot provision new capacity using the image." ([delete-image-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-image-request delete-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/delete-image-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/delete-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteImage", :http.request.configuration/output-deser-fn response-delete-image-result, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-image :args (clojure.spec.alpha/tuple :portkey.aws.appstream/delete-image-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/delete-image-result))

(clojure.core/defn create-fleet "Creates a fleet. A fleet consists of streaming instances that run a specified\nimage." ([create-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-fleet-request create-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/create-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/create-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFleet", :http.request.configuration/output-deser-fn response-create-fleet-result, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "InvalidRoleException" :portkey.aws.appstream/invalid-role-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.appstream/resource-already-exists-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception, "IncompatibleImageException" :portkey.aws.appstream/incompatible-image-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream/create-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/create-fleet-result))

(clojure.core/defn delete-stack "Deletes the specified stack. After the stack is deleted, the application\nstreaming environment provided by the stack is no longer available to users.\nAlso, any reservations made for application streaming sessions for the stack are\nreleased." ([delete-stack-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-stack-request delete-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/delete-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/delete-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStack", :http.request.configuration/output-deser-fn response-delete-stack-result, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream/delete-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/delete-stack-result))

(clojure.core/defn describe-image-builders "Retrieves a list that describes one or more specified image builders, if the\nimage builder names are provided. Otherwise, all image builders in the account\nare described." ([] (describe-image-builders {})) ([describe-image-builders-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-image-builders-request describe-image-builders-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-image-builders-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-image-builders-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeImageBuilders", :http.request.configuration/output-deser-fn response-describe-image-builders-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-image-builders :args (clojure.spec.alpha/? :portkey.aws.appstream/describe-image-builders-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-image-builders-result))

(clojure.core/defn create-image-builder-streaming-url "Creates a URL to start an image builder streaming session." ([create-image-builder-streaming-url-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-image-builder-streaming-url-request create-image-builder-streaming-url-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/create-image-builder-streaming-url-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/create-image-builder-streaming-url-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateImageBuilderStreamingURL", :http.request.configuration/output-deser-fn response-create-image-builder-streaming-url-result, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-image-builder-streaming-url :args (clojure.spec.alpha/tuple :portkey.aws.appstream/create-image-builder-streaming-url-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/create-image-builder-streaming-url-result))

(clojure.core/defn disable-user "Disables the specified user in the user pool. Users can't sign in to AppStream\n2.0 until they are re-enabled. This action does not delete the user." ([disable-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disable-user-request disable-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/disable-user-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/disable-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableUser", :http.request.configuration/output-deser-fn response-disable-user-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disable-user :args (clojure.spec.alpha/tuple :portkey.aws.appstream/disable-user-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/disable-user-result))

(clojure.core/defn describe-image-permissions "Retrieves a list that describes the permissions for shared AWS account IDs on a\nprivate image that you own." ([describe-image-permissions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-image-permissions-request describe-image-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-image-permissions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-image-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeImagePermissions", :http.request.configuration/output-deser-fn response-describe-image-permissions-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-image-permissions :args (clojure.spec.alpha/tuple :portkey.aws.appstream/describe-image-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-image-permissions-result))

(clojure.core/defn start-image-builder "Starts the specified image builder." ([start-image-builder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-image-builder-request start-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/start-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/start-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartImageBuilder", :http.request.configuration/output-deser-fn response-start-image-builder-result, :http.request.spec/error-spec {"ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "IncompatibleImageException" :portkey.aws.appstream/incompatible-image-exception}})))))
(clojure.spec.alpha/fdef start-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream/start-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/start-image-builder-result))

(clojure.core/defn delete-directory-config "Deletes the specified Directory Config object from AppStream 2.0. This object\nincludes the information required to join streaming instances to an Active\nDirectory domain." ([delete-directory-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-directory-config-request delete-directory-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/delete-directory-config-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/delete-directory-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDirectoryConfig", :http.request.configuration/output-deser-fn response-delete-directory-config-result, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-directory-config :args (clojure.spec.alpha/tuple :portkey.aws.appstream/delete-directory-config-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/delete-directory-config-result))

(clojure.core/defn describe-images "Retrieves a list that describes one or more specified images, if the image names\nor image ARNs are provided. Otherwise, all images in the account are described." ([] (describe-images {})) ([describe-images-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-images-request describe-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-images-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeImages", :http.request.configuration/output-deser-fn response-describe-images-result, :http.request.spec/error-spec {"InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-images :args (clojure.spec.alpha/? :portkey.aws.appstream/describe-images-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-images-result))

(clojure.core/defn enable-user "Enables a user in the user pool. After being enabled, users can sign in to\nAppStream 2.0 and open applications from the stacks to which they are assigned." ([enable-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-enable-user-request enable-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/enable-user-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/enable-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableUser", :http.request.configuration/output-deser-fn response-enable-user-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception}})))))
(clojure.spec.alpha/fdef enable-user :args (clojure.spec.alpha/tuple :portkey.aws.appstream/enable-user-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/enable-user-result))

(clojure.core/defn update-stack "Updates the specified fields for the specified stack." ([update-stack-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-stack-request update-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/update-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/update-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStack", :http.request.configuration/output-deser-fn response-update-stack-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "InvalidRoleException" :portkey.aws.appstream/invalid-role-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "IncompatibleImageException" :portkey.aws.appstream/incompatible-image-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef update-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream/update-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/update-stack-result))

(clojure.core/defn update-fleet "Updates the specified fleet.\n If the fleet is in the STOPPED state, you can update any attribute except the\nfleet name. If the fleet is in the RUNNING state, you can update the DisplayName\nand ComputeCapacity attributes. If the fleet is in the STARTING or STOPPING\nstate, you can't update it." ([] (update-fleet {})) ([update-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-fleet-request update-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/update-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/update-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFleet", :http.request.configuration/output-deser-fn response-update-fleet-result, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "InvalidRoleException" :portkey.aws.appstream/invalid-role-exception, "ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception, "IncompatibleImageException" :portkey.aws.appstream/incompatible-image-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-fleet :args (clojure.spec.alpha/? :portkey.aws.appstream/update-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/update-fleet-result))

(clojure.core/defn stop-image-builder "Stops the specified image builder." ([stop-image-builder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-image-builder-request stop-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/stop-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/stop-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopImageBuilder", :http.request.configuration/output-deser-fn response-stop-image-builder-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef stop-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream/stop-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/stop-image-builder-result))

(clojure.core/defn stop-fleet "Stops the specified fleet." ([stop-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-fleet-request stop-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/stop-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/stop-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopFleet", :http.request.configuration/output-deser-fn response-stop-fleet-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef stop-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream/stop-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/stop-fleet-result))

(clojure.core/defn update-directory-config "Updates the specified Directory Config object in AppStream 2.0. This object\nincludes the information required to join streaming instances to an Active\nDirectory domain." ([update-directory-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-directory-config-request update-directory-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/update-directory-config-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/update-directory-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDirectoryConfig", :http.request.configuration/output-deser-fn response-update-directory-config-result, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-directory-config :args (clojure.spec.alpha/tuple :portkey.aws.appstream/update-directory-config-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/update-directory-config-result))

(clojure.core/defn list-tags-for-resource "Retrieves a list of all tags for the specified AppStream 2.0 resource. You can\ntag AppStream 2.0 image builders, images, fleets, and stacks.\n For more information about tags, see Tagging Your Resources\n(https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html)\nin the Amazon AppStream 2.0 Developer Guide." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.appstream/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/list-tags-for-resource-response))

(clojure.core/defn create-directory-config "Creates a Directory Config object in AppStream 2.0. This object includes the\ninformation required to join streaming instances to an Active Directory domain." ([create-directory-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-directory-config-request create-directory-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/create-directory-config-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/create-directory-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDirectoryConfig", :http.request.configuration/output-deser-fn response-create-directory-config-result, :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.appstream/resource-already-exists-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception}})))))
(clojure.spec.alpha/fdef create-directory-config :args (clojure.spec.alpha/tuple :portkey.aws.appstream/create-directory-config-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/create-directory-config-result))

(clojure.core/defn expire-session "Immediately stops the specified streaming session." ([expire-session-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-expire-session-request expire-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/expire-session-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/expire-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExpireSession", :http.request.configuration/output-deser-fn response-expire-session-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef expire-session :args (clojure.spec.alpha/tuple :portkey.aws.appstream/expire-session-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/expire-session-result))

(clojure.core/defn describe-fleets "Retrieves a list that describes one or more specified fleets, if the fleet names\nare provided. Otherwise, all fleets in the account are described." ([] (describe-fleets {})) ([describe-fleets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-fleets-request describe-fleets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-fleets-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-fleets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFleets", :http.request.configuration/output-deser-fn response-describe-fleets-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-fleets :args (clojure.spec.alpha/? :portkey.aws.appstream/describe-fleets-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-fleets-result))

(clojure.core/defn delete-user "Deletes a user from the user pool." ([delete-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/delete-user-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn response-delete-user-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.appstream/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/delete-user-result))

(clojure.core/defn create-user "Creates a new user in the user pool." ([create-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/create-user-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-result, :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.appstream/resource-already-exists-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.appstream/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/create-user-result))

(clojure.core/defn list-associated-fleets "Retrieves the name of the fleet that is associated with the specified stack." ([list-associated-fleets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-associated-fleets-request list-associated-fleets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/list-associated-fleets-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/list-associated-fleets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAssociatedFleets", :http.request.configuration/output-deser-fn response-list-associated-fleets-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-associated-fleets :args (clojure.spec.alpha/tuple :portkey.aws.appstream/list-associated-fleets-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/list-associated-fleets-result))

(clojure.core/defn delete-fleet "Deletes the specified fleet." ([delete-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-fleet-request delete-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/delete-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/delete-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFleet", :http.request.configuration/output-deser-fn response-delete-fleet-result, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream/delete-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/delete-fleet-result))

(clojure.core/defn describe-users "Retrieves a list that describes one or more specified users in the user pool." ([describe-users-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-users-request describe-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-users-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUsers", :http.request.configuration/output-deser-fn response-describe-users-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-users :args (clojure.spec.alpha/tuple :portkey.aws.appstream/describe-users-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-users-result))

(clojure.core/defn delete-image-builder "Deletes the specified image builder and releases the capacity." ([delete-image-builder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-image-builder-request delete-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/delete-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/delete-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteImageBuilder", :http.request.configuration/output-deser-fn response-delete-image-builder-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream/delete-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/delete-image-builder-result))

(clojure.core/defn associate-fleet "Associates the specified fleet with the specified stack." ([associate-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-fleet-request associate-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/associate-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/associate-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateFleet", :http.request.configuration/output-deser-fn response-associate-fleet-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception, "IncompatibleImageException" :portkey.aws.appstream/incompatible-image-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef associate-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream/associate-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/associate-fleet-result))

(clojure.core/defn create-stack "Creates a stack to start streaming applications to users. A stack consists of an\nassociated fleet, user access policies, and storage configurations." ([create-stack-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-stack-request create-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/create-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/create-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStack", :http.request.configuration/output-deser-fn response-create-stack-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "ResourceAlreadyExistsException" :portkey.aws.appstream/resource-already-exists-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception, "InvalidRoleException" :portkey.aws.appstream/invalid-role-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef create-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream/create-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/create-stack-result))

(clojure.core/defn list-associated-stacks "Retrieves the name of the stack with which the specified fleet is associated." ([list-associated-stacks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-associated-stacks-request list-associated-stacks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/list-associated-stacks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/list-associated-stacks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAssociatedStacks", :http.request.configuration/output-deser-fn response-list-associated-stacks-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-associated-stacks :args (clojure.spec.alpha/tuple :portkey.aws.appstream/list-associated-stacks-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/list-associated-stacks-result))

(clojure.core/defn disassociate-fleet "Disassociates the specified fleet from the specified stack." ([disassociate-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-fleet-request disassociate-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/disassociate-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/disassociate-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateFleet", :http.request.configuration/output-deser-fn response-disassociate-fleet-result, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.appstream/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream/disassociate-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/disassociate-fleet-result))

(clojure.core/defn copy-image "Copies the image within the same region or to a new region within the same AWS\naccount. Note that any tags you added to the image will not be copied." ([copy-image-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-copy-image-request copy-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/copy-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/copy-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CopyImage", :http.request.configuration/output-deser-fn response-copy-image-response, :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.appstream/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "IncompatibleImageException" :portkey.aws.appstream/incompatible-image-exception}})))))
(clojure.spec.alpha/fdef copy-image :args (clojure.spec.alpha/tuple :portkey.aws.appstream/copy-image-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/copy-image-response))

(clojure.core/defn create-image-builder "Creates an image builder. An image builder is a virtual machine that is used to\ncreate an image.\n The initial state of the builder is PENDING. When it is ready, the state is\nRUNNING." ([create-image-builder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-image-builder-request create-image-builder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/create-image-builder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/create-image-builder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateImageBuilder", :http.request.configuration/output-deser-fn response-create-image-builder-result, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "InvalidRoleException" :portkey.aws.appstream/invalid-role-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.appstream/resource-already-exists-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "ResourceNotAvailableException" :portkey.aws.appstream/resource-not-available-exception, "InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception, "IncompatibleImageException" :portkey.aws.appstream/incompatible-image-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-image-builder :args (clojure.spec.alpha/tuple :portkey.aws.appstream/create-image-builder-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/create-image-builder-result))

(clojure.core/defn describe-sessions "Retrieves a list that describes the active streaming sessions for a specified\nstack and fleet. If a value for UserId is provided for the stack and fleet, only\nstreaming sessions for that user are described. If an authentication type is not\nprovided, the default is to authenticate users using a streaming URL." ([describe-sessions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-sessions-request describe-sessions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-sessions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-sessions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSessions", :http.request.configuration/output-deser-fn response-describe-sessions-result, :http.request.spec/error-spec {"InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-sessions :args (clojure.spec.alpha/tuple :portkey.aws.appstream/describe-sessions-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-sessions-result))

(clojure.core/defn describe-directory-configs "Retrieves a list that describes one or more specified Directory Config objects\nfor AppStream 2.0, if the names for these objects are provided. Otherwise, all\nDirectory Config objects in the account are described. These objects include the\ninformation required to join streaming instances to an Active Directory domain.\n Although the response syntax in this topic includes the account password, this\npassword is not returned in the actual response." ([] (describe-directory-configs {})) ([describe-directory-configs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-directory-configs-request describe-directory-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-directory-configs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-directory-configs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectoryConfigs", :http.request.configuration/output-deser-fn response-describe-directory-configs-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-directory-configs :args (clojure.spec.alpha/? :portkey.aws.appstream/describe-directory-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-directory-configs-result))

(clojure.core/defn untag-resource "Disassociates one or more specified tags from the specified AppStream 2.0\nresource.\n To list the current tags for your resources, use ListTagsForResource.\n For more information about tags, see Tagging Your Resources\n(https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html)\nin the Amazon AppStream 2.0 Developer Guide." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.appstream/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/untag-resource-response))

(clojure.core/defn describe-stacks "Retrieves a list that describes one or more specified stacks, if the stack names\nare provided. Otherwise, all stacks in the account are described." ([] (describe-stacks {})) ([describe-stacks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stacks-request describe-stacks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-stacks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-stacks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStacks", :http.request.configuration/output-deser-fn response-describe-stacks-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stacks :args (clojure.spec.alpha/? :portkey.aws.appstream/describe-stacks-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-stacks-result))

(clojure.core/defn batch-associate-user-stack "Associates the specified users with the specified stacks. Users in a user pool\ncannot be assigned to stacks with fleets that are joined to an Active Directory\ndomain." ([batch-associate-user-stack-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-associate-user-stack-request batch-associate-user-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/batch-associate-user-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/batch-associate-user-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchAssociateUserStack", :http.request.configuration/output-deser-fn response-batch-associate-user-stack-result, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef batch-associate-user-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream/batch-associate-user-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/batch-associate-user-stack-result))

(clojure.core/defn start-fleet "Starts the specified fleet." ([start-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-fleet-request start-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/start-fleet-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/start-fleet-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartFleet", :http.request.configuration/output-deser-fn response-start-fleet-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.appstream/resource-not-found-exception, "OperationNotPermittedException" :portkey.aws.appstream/operation-not-permitted-exception, "LimitExceededException" :portkey.aws.appstream/limit-exceeded-exception, "InvalidAccountStatusException" :portkey.aws.appstream/invalid-account-status-exception, "ConcurrentModificationException" :portkey.aws.appstream/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef start-fleet :args (clojure.spec.alpha/tuple :portkey.aws.appstream/start-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/start-fleet-result))

(clojure.core/defn describe-user-stack-associations "Retrieves a list that describes the UserStackAssociation objects. You must\nspecify either or both of the following:\n * The stack name\n * The user name (email address of the user associated with the stack) and the\nauthentication type for the user" ([] (describe-user-stack-associations {})) ([describe-user-stack-associations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-stack-associations-request describe-user-stack-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/describe-user-stack-associations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/describe-user-stack-associations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserStackAssociations", :http.request.configuration/output-deser-fn response-describe-user-stack-associations-result, :http.request.spec/error-spec {"InvalidParameterCombinationException" :portkey.aws.appstream/invalid-parameter-combination-exception}})))))
(clojure.spec.alpha/fdef describe-user-stack-associations :args (clojure.spec.alpha/? :portkey.aws.appstream/describe-user-stack-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/describe-user-stack-associations-result))

(clojure.core/defn batch-disassociate-user-stack "Disassociates the specified users from the specified stacks." ([batch-disassociate-user-stack-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-disassociate-user-stack-request batch-disassociate-user-stack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appstream/endpoints, :http.request.configuration/target-prefix "PhotonAdminProxyService", :http.request.spec/output-spec :portkey.aws.appstream/batch-disassociate-user-stack-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-12-01", :http.request.configuration/service-id "AppStream", :http.request.spec/input-spec :portkey.aws.appstream/batch-disassociate-user-stack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDisassociateUserStack", :http.request.configuration/output-deser-fn response-batch-disassociate-user-stack-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef batch-disassociate-user-stack :args (clojure.spec.alpha/tuple :portkey.aws.appstream/batch-disassociate-user-stack-request) :ret (clojure.spec.alpha/and :portkey.aws.appstream/batch-disassociate-user-stack-result))
